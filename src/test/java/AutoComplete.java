import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoComplete {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:/Users/Crusher/Downloads/chromedriver_win32/chromedriver.exe"); // am definit calea catre chrome driver
        WebDriver driver = new ChromeDriver();  // am creat  o instanta a driverului care sa fie incarcata in program
                                                // variabila "driver" este un obiect al clasei chrome driver. Variabila "driver" are tipul de data "webDriver"
                                                // tip de data = propietate care arata ce fel de informatii pot sa fie stocate intr-o variabila
                                                // variabila = o adresa de memorie reprezentata de un nume
        driver.get("https://formy-project.herokuapp.com/autocomplete"); // metoda "get" este folosita pentru a putea deschide browserul web
        WebElement autocomplete = driver.findElement(By.id("autocomplete")); // aici am identificat input fieldul pentru adresa identificat prin IDul "autocomplete"
        autocomplete.sendKeys("Municipiul Iaşi, Str. Sf. Lazăr, Nr. 27A, CLĂDIREA UNITED BUSINESS CENTER 5, Etaj 2, Județ Iaşi"); // am inserat text in input fieldul identificat anterior
        Thread.sleep(3000); // aici am instruit sistemul sa astepte sa se incarce pagina inainte sa treaca la instructiunea urmatoare
        driver.findElement(By.cssSelector("body > div.pac-container > div > table > tr > td:nth-child(2) > button")).click(); // aici am identificat un element pe baza de cssSelector
        Thread.sleep(3000);
        driver.quit(); // cu instructiunea asta inchidem complet browserul de Chrome


    }
}
