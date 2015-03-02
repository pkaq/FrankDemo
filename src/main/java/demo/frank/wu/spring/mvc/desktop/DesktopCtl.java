/**
 * 
 */
package demo.frank.wu.spring.mvc.desktop;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Description:	 
 * @FileName: 		 Desktop.java
 * @Author:		 WuF
 * @Version: 		 1.0
 * @Date: 			 2015年2月10日 下午4:09:06
 */
@Controller
public class DesktopCtl {
    @RequestMapping("/desktop")
    public String desktop(){
        System.err.println("desktop...");
        return "sso/desktop";
    }
    
    @RequestMapping("/register")
    public String register(){
        System.err.println("register...");
        return "sso/register";
    }
    
    @RequestMapping("/getpassword")
    public String getpassword(){
        System.err.println("getpassword...");
        return "sso/getpassword";
    }
    
    @RequestMapping("/resetpassword")
    public String resetpassword(){
        System.err.println("resetpassword...");
        return "sso/resetpassword";
    }
}
