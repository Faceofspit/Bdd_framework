package sample;

import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class firstscript {
	
	private void samp() {
		// TODO Auto-generated method stub
		WebDriver d = new ChromeDriver();
		d.get("google.com");
		d.manage().window().maximize();
		WebElement fe = d.findElement(By.xpath("/html/body/div[1]/div/div[3]/div[1]/div[2]/div[3]/div/div[3]"));
		fe.click();
		Select s = new Select(fe);
		List<WebElement> dd= s.getOptions();
		TreeSet<String> t = new TreeSet<String>();
		for (WebElement o : dd) {
			String text= o.getText();
			t.add(text);		
		}
        for (String sorted : t) {
        	System.out.println(sorted);
			
		}
	}

}
