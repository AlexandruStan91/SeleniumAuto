import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkboxes {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:/Users/Crusher/Downloads/chromedriver_win32/chromedriver.exe"); // am definit calea catre chrome driver
        WebDriver driver = new ChromeDriver();  // am creat  o instanta a driverului care sa fie incarcata in program
        // variabila "driver" este un obiect al clasei chrome driver. Variabila "driver" are tipul de data "webDriver"
        // tip de data = propietate care arata ce fel de informatii pot sa fie stocate intr-o variabila
        // variabila = o adresa de memorie reprezentata de un nume
        driver.get("https://formy-project.herokuapp.com/checkbox");
        driver.findElement(By.id("checkbox-1")).click();
        driver.findElement(By.cssSelector("#checkbox-2")).click();
        driver.findElement(By.xpath("//*[@id=\"checkbox-3\"]")).click(); // aici am identificat elemetul pe baza de Xpath care este adresa HTML la care se afla elementul

    }
}
