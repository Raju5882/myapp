package gr.com.schedule;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
@Service
public class ScheduleClass {

	@Scheduled(fixedRate=10000)
	public void test()
	{
		System.out.println("Hello from schedule !!");
	}
	@Scheduled(fixedDelay = 5000)
	public void test2()
	{
		System.out.println("from fixed delay");
	}
}
