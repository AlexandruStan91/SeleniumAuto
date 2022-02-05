import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchToActiveWindow {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:/Users/Crusher/Downloads/chromedriver_win32/chromedriver.exe"); // am definit calea catre chrome driver
        WebDriver driver = new ChromeDriver();  // am creat  o instanta a driverului care sa fie incarcata in program
        // variabila "driver" este un obiect al clasei chrome driver. Variabila "driver" are tipul de data "webDriver"
        // tip de data = propietate care arata ce fel de informatii pot sa fie stocate intr-o variabila
        // variabila = o adresa de memorie reprezentata de un nume
        driver.get("https://formy-project.herokuapp.com/autocomplete"); // metoda "get" este folosita pentru a putea deschide browserul web
        WebElement newTabButton = driver.findElement(By.id("new-tab-button"));
        newTabButton.click();
        Thread.sleep(3000);
        for(String handle1: driver.getWindowHandles()) {
            driver.switchTo().window(handle1);
        }
    }
}
