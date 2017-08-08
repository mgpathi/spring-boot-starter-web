package com.tta.att.Controller;

import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.format.FormatterRegistry;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.validation.MessageCodesResolver;
import org.springframework.validation.Validator;
import org.springframework.web.method.support.HandlerMethodArgumentResolver;
import org.springframework.web.method.support.HandlerMethodReturnValueHandler;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.config.annotation.AsyncSupportConfigurer;
import org.springframework.web.servlet.config.annotation.ContentNegotiationConfigurer;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.PathMatchConfigurer;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class MyConfiguration {

	@Bean
	public WebMvcConfigurer corsConfigurer(){
		return new WebMvcConfigurer(){
			public void addCorsMappings(CorsRegistry registry){
				registry.addMapping("/**");
			}

			public void addArgumentResolvers(
					List<HandlerMethodArgumentResolver> arg0) {
				// TODO Auto-generated method stub
				
			}

			public void addFormatters(FormatterRegistry arg0) {
				// TODO Auto-generated method stub
				
			}

			public void addInterceptors(InterceptorRegistry arg0) {
				// TODO Auto-generated method stub
				
			}

			public void addResourceHandlers(ResourceHandlerRegistry arg0) {
				// TODO Auto-generated method stub
				
			}

			public void addReturnValueHandlers(
					List<HandlerMethodReturnValueHandler> arg0) {
				// TODO Auto-generated method stub
				
			}

			public void addViewControllers(ViewControllerRegistry arg0) {
				// TODO Auto-generated method stub
				
			}

			public void configureAsyncSupport(AsyncSupportConfigurer arg0) {
				// TODO Auto-generated method stub
				
			}

			public void configureContentNegotiation(
					ContentNegotiationConfigurer arg0) {
				// TODO Auto-generated method stub
				
			}

			public void configureDefaultServletHandling(
					DefaultServletHandlerConfigurer arg0) {
				// TODO Auto-generated method stub
				
			}

			public void configureHandlerExceptionResolvers(
					List<HandlerExceptionResolver> arg0) {
				// TODO Auto-generated method stub
				
			}

			public void configureMessageConverters(
					List<HttpMessageConverter<?>> arg0) {
				// TODO Auto-generated method stub
				
			}

			public void configurePathMatch(PathMatchConfigurer arg0) {
				// TODO Auto-generated method stub
				
			}

			public void configureViewResolvers(ViewResolverRegistry arg0) {
				// TODO Auto-generated method stub
				
			}

			public void extendHandlerExceptionResolvers(
					List<HandlerExceptionResolver> arg0) {
				// TODO Auto-generated method stub
				
			}

			public void extendMessageConverters(
					List<HttpMessageConverter<?>> arg0) {
				// TODO Auto-generated method stub
				
			}

			public MessageCodesResolver getMessageCodesResolver() {
				// TODO Auto-generated method stub
				return null;
			}

			public Validator getValidator() {
				// TODO Auto-generated method stub
				return null;
			}
		};
	}
	
}
