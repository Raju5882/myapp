package gr.com.util;

import javax.mail.internet.MimeMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.FileSystemResource;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Component;

@Component
public class MailSenderUtil {
    
	@Autowired
	public JavaMailSender sender;
	
	public boolean send()
	{
		boolean status=false;
		try {
			FileSystemResource f=new FileSystemResource("D:\\wall.png");
			
			MimeMessage m=sender.createMimeMessage();
			MimeMessageHelper helper=new MimeMessageHelper(m, true);
			helper.setTo("82venkatraju@gmail.com");
			helper.setFrom("rajuboini482@gmail.com ");
			helper.setSubject("Greeting Note");
			helper.setText("Hello Welcome to Raju World");
			if (f!=null) 
			helper.addAttachment(f.getFilename(), f);
			System.out.println("sending!!");
			sender.send(m);
			System.out.println("Mail send Successfully!!!!!");
			status=true;
		} catch (Exception e) {
			System.out.println(e.getMessage());
			status=false;
		}
		
		return status;
	}
}
