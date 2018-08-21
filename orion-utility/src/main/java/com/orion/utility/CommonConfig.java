package com.orion.utility;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;


@Component("commonConfig")
@PropertySource("classpath:pathConfig.properties")
public class CommonConfig {
	@Value("${customGroovyConfig.filePath}")
	private String filePath;

	public String getFilePath() {
		return this.filePath;
	}


}
