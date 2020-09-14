package com.wf.training.mavenweb.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class DispatcherServletConfig extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		// array of classes which are config classes for Spring based resource(DB, Security etc)
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		// array of classes which are config classes for servlet
		return new Class[] {ServletSupportConfig.class};
	}

	@Override
	protected String[] getServletMappings() {
		// Array of urls to map with servlet
		return new String[]{"/"};
	}

}
