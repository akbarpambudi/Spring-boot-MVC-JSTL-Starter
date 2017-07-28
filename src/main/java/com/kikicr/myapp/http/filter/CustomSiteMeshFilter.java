package com.kikicr.myapp.http.filter;

import org.sitemesh.builder.SiteMeshFilterBuilder;
import org.sitemesh.config.ConfigurableSiteMeshFilter;
import org.sitemesh.content.tagrules.html.DivExtractingTagRuleBundle;
import org.springframework.context.annotation.Configuration;
@Configuration
public class CustomSiteMeshFilter extends ConfigurableSiteMeshFilter {
	@Override
	protected void applyCustomConfiguration(SiteMeshFilterBuilder builder) {
//		builder.addDecoratorPath("//**","/WEB-INF/template/Default.jsp");
		super.applyCustomConfiguration(builder);
	}
}
