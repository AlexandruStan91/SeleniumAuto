import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchToAlerts {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:/Users/Crusher/Downloads/chromedriver_win32/chromedriver.exe"); // am definit calea catre chrome driver
        WebDriver driver = new ChromeDriver();  // am creat  o instanta a driverului care sa fie incarcata in program
        // variabila "driver" este un obiect al clasei chrome driver. Variabila "driver" are tipul de data "webDriver"
        // tip de data = propietate care arata ce fel de informatii pot sa fie stocate intr-o variabila
        // variabila = o adresa de memorie reprezentata de un nume
        driver.get("https://formy-project.herokuapp.com/");
        driver.findElement(By.linkText("Switch Window")).click(); // aici am identificat fereastra de switch window din pagina principala si am dat click pe ea
        Thread.sleep(3000);
        driver.findElement(By.id("alert-button")).click(); // aici am identificat butonul care ne deschide alerta si am dat click pe el
        Thread.sleep(1000);
        Alert windowAlert = driver.switchTo().alert();
        Thread.sleep(1000);
        windowAlert.dismiss();
        driver.quit();

    }

}
