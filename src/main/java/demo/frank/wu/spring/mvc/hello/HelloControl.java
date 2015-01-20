/**
 * 
 */
package demo.frank.wu.spring.mvc.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Description:	 Spring MVC控制器
 * @FileName: 		 HelloControl.java
 * @Author:		 WuF
 * @Version: 		 1.0
 * @Date: 			 2015年1月16日 上午10:21:30
 * @Others: 
 * @FuntionList:
 * @History:
 * @Category:
 */
@Controller
public class HelloControl {
	@RequestMapping("/hello")
	public String hello(){
		System.err.println("Hello World");
		return "welcome";
	}
}
