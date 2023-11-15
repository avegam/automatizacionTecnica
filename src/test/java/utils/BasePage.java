package utils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import net.thucydides.core.pages.PageObject;

public class BasePage extends PageObject {

        // Constructor de la clase BasePage

        protected void ingresarweb(String web){
           getDriver().get(web);

        }
        // Método para encontrar un elemento por su selector
        protected WebElement findElement(By locator) {
            return getDriver().findElement(locator);
        }

        // Método para hacer clic en un elemento
        protected void clickElement(By locator) {
            findElement(locator).click();
        }

        // Método para ingresar texto en un campo de texto
        protected void typeText(By locator, String text) {
            findElement(locator).sendKeys(text);
        }

        // Método para obtener el texto de un elemento
        protected String getText(By locator) {
            return findElement(locator).getText();
        }
        protected String getAtribute(By locator,String Atributo) {
        return findElement(locator).getAttribute(Atributo);
    }
        // Método para esperar un cierto tiempo
        //protected void waitFor(int milliseconds) throws InterruptedException {
        //    Thread.sleep(milliseconds);
        //}

}
