package com.orion.utility;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import groovy.lang.Closure;
import groovy.util.ConfigObject;
import groovy.util.ConfigSlurper;

@Component
public class CustomConfig {

	@Qualifier(value="commonConfig")
	@Autowired
	private CommonConfig commonConfig;
	private static final Logger log = LoggerFactory.getLogger(CustomConfig.class);

	private String configLocation = null;
	private Map<String, Object> configMap = null;

	
	/*public CustomConfig(CommonConfig commonConfig) {
		this.commonConfig = commonConfig;
		this.configMap = getConfig();
	}*/

	public Map<String, Object> getConfigMap() {
		if(this.configMap !=null) {
			return this.configMap;
		}else {
			this.configMap = getConfig();
			System.out.println("Map loaded from config is :"+this.configMap);
			return this.configMap;
		}
	}

	private Map<String, Object> getConfig() {
		log.info("in custom config constructor and bean is"+commonConfig);
		ConfigObject conf = null;
		ConfigObject newConf = null;
		String filePath = commonConfig.getFilePath();
		log.info("FilePath is"+filePath);
		try {
			configLocation = FileUtility.initConfigPath(filePath);
			List<File> listOfAppFiles = FileUtility.getFiles(configLocation);
			for (File file : listOfAppFiles) {
				log.info("Config File Name  is : " + file.getName());
				if (null == conf) {
					conf = new ConfigSlurper().parse(file.toURI().toURL());
					configMap = (ConfigObject) conf.flatten();
				} else {
					newConf = new ConfigSlurper().parse(file.toURI().toURL());
					configMap = (ConfigObject) conf.merge(conf);
				}
				for (Entry<String, Object> entry : configMap.entrySet()) {
					if (entry.getValue() instanceof Closure) {
						log.info("Object is of closure type : " + entry.getValue());
					} else {
						log.info("Object is not closure type : " + entry.getValue());
					}
				}

			}
		} catch (IOException ex) {
			log.error("Exception Occured while Loading Config" + ex.getMessage());
		}
		return configMap;
	}

}
