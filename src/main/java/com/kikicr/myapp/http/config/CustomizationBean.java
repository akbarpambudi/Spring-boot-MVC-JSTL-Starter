package com.kikicr.myapp.http.config;

import org.springframework.boot.context.embedded.ConfigurableEmbeddedServletContainer;
import org.springframework.boot.context.embedded.EmbeddedServletContainerCustomizer;
import org.springframework.boot.web.servlet.ErrorPage;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
@Component
public class CustomizationBean implements EmbeddedServletContainerCustomizer  {
	@Override
	public void customize(ConfigurableEmbeddedServletContainer container) {
		container.addErrorPages(new ErrorPage(HttpStatus.NOT_FOUND,"/error/404"));
		container.addErrorPages(new ErrorPage(HttpStatus.FORBIDDEN,"/error/401"));
		container.addErrorPages(new ErrorPage(HttpStatus.UNAUTHORIZED,"/error/403"));
	}
}
