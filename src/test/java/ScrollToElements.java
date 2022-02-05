import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ScrollToElements {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:/Users/Crusher/Downloads/chromedriver_win32/chromedriver.exe"); // am definit calea catre chrome driver
        WebDriver driver = new ChromeDriver();  // am creat  o instanta a driverului care sa fie incarcata in program
        // variabila "driver" este un obiect al clasei chrome driver. Variabila "driver" are tipul de data "webDriver"
        // tip de data = propietate care arata ce fel de informatii pot sa fie stocate intr-o variabila
        // variabila = o adresa de memorie reprezentata de un nume
        driver.get("https://formy-project.herokuapp.com/scroll");
        WebElement name = driver.findElement(By.id("name"));
        Actions action = new Actions(driver);
        action.moveToElement(name); // am instruit browserul sa faca scroll pana cand ajunge in dreptul elementului name
        name.sendKeys("Popescu Ion");
        WebElement date = driver.findElement(By.id("date"));
        date.sendKeys("05/04/1996");
        driver.quit();
    }
}
