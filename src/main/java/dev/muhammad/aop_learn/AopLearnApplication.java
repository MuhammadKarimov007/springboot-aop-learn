package dev.muhammad.aop_learn;

import dev.muhammad.aop_learn.dao.AccountDAO;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@SpringBootApplication
public class AopLearnApplication {

	public static void main(String[] args) {
		SpringApplication.run(AopLearnApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(AccountDAO accountDAO, Just just) {
		return runner -> {
			just.addAccount();
			demoTheBeforeAdvice(accountDAO);

			System.out.println("Let's run again. ".repeat(4));

			just.addAccount();
			demoTheBeforeAdvice(accountDAO);
		};
	}

	private void demoTheBeforeAdvice(AccountDAO accountDAO) {
		accountDAO.addAccount();
	}

}

@Component
class Just {
	public void addAccount() {
		System.out.println("Hello, my friends!!!!");
	}
}
