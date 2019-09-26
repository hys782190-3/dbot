package dbot;

import listener.LunchListener;
import net.dv8tion.jda.api.AccountType;
import net.dv8tion.jda.api.JDABuilder;

public class MainApp {
	public static void main(String[] args) {
		JDABuilder builder = new JDABuilder(AccountType.BOT);
		String token = "NjI2NjA5NjU4MDE4MTM2MDc0.XYwm8g.HfBicdoSo9dA8Qe0MrztJgTV3kM";
		builder.setToken(token);
		
		try {
			builder.addEventListeners(new LunchListener());
			builder.build();
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
