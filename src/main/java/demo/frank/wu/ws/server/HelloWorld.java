package demo.frank.wu.ws.server;
 
import javax.jws.WebService;
 
/**
 * @Description:	 WebService接口,必须保证实现类与该接口在同一个包下或targetNamespace相同
 * @FileName: 		 HelloWorld.java
 * @Author:		 WuF
 * @Version: 		 1.0
 * @Date: 			 2015年1月20日 上午10:37:49
 * @Others: 
 * @FuntionList:
 * @History:
 * @Category:
 */
@WebService(targetNamespace="http://server.ws.wu.frank.demo/")
public interface HelloWorld {
    String sayHi(String text);
    void testResponse() throws InterruptedException;
}
