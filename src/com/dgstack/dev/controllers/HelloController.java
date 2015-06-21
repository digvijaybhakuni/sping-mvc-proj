/**
 * 
 */
package com.dgstack.dev.controllers;

import java.util.logging.Logger;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.dgstack.dev.model.User;

/**
 * @author digvijayb
 *
 */
@Controller
@RequestMapping("admin")
public class HelloController {

	/**
	 * 
	 */
	public HelloController() {
	}
	
	 private static final Logger logger = Logger.getLogger("WebMVCConfig");

	@RequestMapping(value = "/{name}", method = RequestMethod.GET)
    @ResponseBody
    public User getName(@PathVariable String name, ModelMap model) throws ResourceNotFoundException{

        logger.info("I am in the controller and got user name: " + name);

        /*

            Simulate a successful lookup for 2 users, this is where your real lookup code would go

         */

        if ("JohnathanMarkSmith".equals(name))
        {
            return new User("Johnathan Mark Smith", name);
        }

        if ("Regan".equals(name))
        {
            return new User("Regan Smith", name);
        }

        throw new ResourceNotFoundException("User Is Not Found");
    }
}
