package br.com.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
public class AppConfig {

	@Bean
	public ViewResolver v()
	{
		
		InternalResourceViewResolver vv=new InternalResourceViewResolver();
		vv.setPrefix("/WEB-INF/views/");
		vv.setSuffix(".jsp");
		return vv;
	}
}
