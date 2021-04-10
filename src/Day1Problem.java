import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day1Problem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\chipl\\Java\\chromedriver_win32_V89\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.worldometers.info/world-population/");
		
		//code for running loop for 20 seconds
		//https://stackoverflow.com/questions/19727109/how-to-exit-a-while-loop-after-a-certain-time#:~:text=If%20you%20want%20to%20exactly,kill%20after%20a%20certain%20timeout.&text=Something%20like%3A,%2B%20wait_time%3B%20while%20(System.
		long start_time = System.currentTimeMillis();
		long wait_time = 20000;
		long end_time = start_time + wait_time;
		
		while(System.currentTimeMillis() < end_time)
		{
			System.out.println("Current World Population:" + driver.findElement(By.xpath("//span[@rel='current_population']")).getText());
			System.out.println("\n");
			System.out.println("Births Today: " + driver.findElement(By.cssSelector("span[rel='births_today']")).getText());
			System.out.println("Deaths Today: " + driver.findElement(By.cssSelector("span[rel='dth1s_today']")).getText());
			System.out.println("Population growth Today: " + driver.findElement(By.cssSelector("span[rel='absolute_growth']")).getText());
			System.out.println("\n");
			System.out.println("Births This year: " + driver.findElement(By.cssSelector("span[rel='births_this_year']")).getText());
			System.out.println("Deaths This year: " + driver.findElement(By.cssSelector("span[rel='dth1s_this_year']")).getText());
			System.out.println("Population This year: " + driver.findElement(By.cssSelector("span[rel='absolute_growth_year']")).getText());
			System.out.println("***************************\n");
		}
		
		driver.close();
		
		
		
		

	}

}
