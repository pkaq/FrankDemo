package demo.frank.wu.jmx.agent;

import java.lang.management.ManagementFactory;

import javax.management.InstanceAlreadyExistsException;
import javax.management.MBeanRegistrationException;
import javax.management.MBeanServer;
import javax.management.MalformedObjectNameException;
import javax.management.NotCompliantMBeanException;
import javax.management.ObjectName;

import com.sun.jdmk.comm.HtmlAdaptorServer;

public class HelloAgent {

    /**
     Function: main 
     Description:  		 		
     @param args		
     * @throws MalformedObjectNameException 
     * @throws NotCompliantMBeanException 
     * @throws MBeanRegistrationException 
     * @throws InstanceAlreadyExistsException 
     */
    public static void main(String[] args) throws MalformedObjectNameException, InstanceAlreadyExistsException, MBeanRegistrationException, NotCompliantMBeanException {
    	 
        //创建beanserver
        MBeanServer beanServer = ManagementFactory.getPlatformMBeanServer();
       
       //domain:name=别名
       ObjectName helloName = new ObjectName("WF:name=HelloWorld");
       
       //注册MBean
       beanServer.registerMBean(new HelloAgent(), helloName);

       ObjectName htmlAdaptor = new ObjectName("HelloAgent:name=htmladapter,port=8082");
       
       //html代理服务
       HtmlAdaptorServer adaptorServer = new HtmlAdaptorServer();
       
       beanServer.registerMBean(adaptorServer, htmlAdaptor);
       //启动服务
       adaptorServer.start();
       System.err.println("---------");
      
       
    }

}
