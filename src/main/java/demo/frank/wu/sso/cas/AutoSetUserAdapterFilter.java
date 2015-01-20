package demo.frank.wu.sso.cas;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

import org.jasig.cas.client.validation.Assertion;

/**
 * @Description:	 CAS单点登陆的过滤器功能类，该类用来自动生成子应用的登陆Session
 * @FileName: 		 AutoSetUserAdapterFilter.java
 * @Author:		 WuF
 * @Version: 		 1.0
 * @Date: 			 2015年1月20日 上午10:36:19
 * @Others: 
 * @FuntionList:
 * @History:
 * @Category:
 */
public class AutoSetUserAdapterFilter implements Filter {

	public AutoSetUserAdapterFilter() {
		
	}

	public void destroy() {
		
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response,
			FilterChain chain) throws IOException, ServletException {

		HttpServletRequest httpRequest = (HttpServletRequest) request;

		// _const_cas_assertion_是CAS中存放登录用户名的session标志
		Object object = httpRequest.getSession().getAttribute("_const_cas_assertion_");
		System.out.println("-------------" + object);
		if (object != null) {
			Assertion assertion = (Assertion) object;
			String loginName = assertion.getPrincipal().getName();
			System.out.println("-------------" + object);
			// 第一次登录系统
			System.err.println(loginName);

		}
		chain.doFilter(request, response);

	}

	@Override
	public void init(FilterConfig arg0) throws ServletException {
		System.out.println("--------初始化AutoSetUserAdapterFilter-----");
	}
}
