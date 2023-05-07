package gr.com;

import java.util.Properties;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.scheduling.annotation.EnableScheduling;

@Configuration
@EnableScheduling
@EnableAspectJAutoProxy
@ComponentScan("gr.com")
public class ConfigurationClass {

	@Bean
	public JavaMailSenderImpl jj() {
		JavaMailSenderImpl j = new JavaMailSenderImpl();
		j.setHost("smtp.gmail.com");
		j.setPort(587);
		j.setUsername("82venkatraju@gmail.com");
		j.setPassword("rajuyadav482@");
		j.setJavaMailProperties(props());
		return j;
	}
	private Properties props() {
		Properties p = new Properties();
		p.put("mail.smtp.auth", "true");
		p.put("mail.smtp.starttls.enable", "true");
		return p;
	}
}
