/**
 * Created by Digvijay Singh
 */
package com.orion.userController;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.orion.service.UserService;
import com.orion.users.User;

@RestController("/user")
public class UserConroller {

	@Autowired
	UserService userService;
	
	@GetMapping("/getUserDetail")
	public User getUserDetails(@RequestBody Map<Object, Object> userRequestObj)
	{
		return userService.findByEmail((String)userRequestObj.get("username"));
	}
	
	  @GetMapping("/403")
	    public String error403() {
	        return "/error/403";
	    }
}
