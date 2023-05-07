package com.entity;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

@Configuration
@ComponentScan("com.entity")
@PropertySource("data.properties")
public class Configzclass {

	@Autowired
	private Environment env;
	@Bean
	public Employee emp1()
	{
		return new Employee(1,env.getProperty("name"),55.5);
	}
	@Bean
	public Employee emp2()
	{
		return new Employee(1,env.getProperty("name"),55.5);
	}
	
	@Bean
	public Product Prod()
	{
	Product p=	new Product();
	p.setProdId(env.getProperty("id", Integer.class));
	p.setMap(map());
	
		return p;
	}

	private Map<Integer, String> map() {
		Map<Integer,String> m=new HashMap<Integer, String>();
		m.put(1, "a");
		m.put(12, "ba");
		m.put(13, "ca");
		return  m;
	}
	
	@Bean
	public Parentclass parentclass()
	{
		Parentclass p=new Parentclass();
		p.setId(33);
		p.setC(c());
		return p;
	}
    @Bean
	public ChildClass c() {
		return new ChildClass();
	}
    @Bean
    public Model model()
    {
    	return new Model(0, "aa", "m95");
    }
    @Bean
    public Model model1()
    {
    	return new Model(1, "aa", "m95");
    }
	
}
