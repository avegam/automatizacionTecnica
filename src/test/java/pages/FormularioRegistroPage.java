package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.BasePage;

public class FormularioRegistroPage extends BasePage {

    public By locatorInputNombre = By.id("name");
    public By locatorInputEmail = By.id("email");
    public By locatorInputContraseña = By.id("password");
    public By locatorSubmitRegistrar = By.id("register");

    public By locatorTextErrorName = By.cssSelector("#name + .error");

    public By locatorTextErrorEmail = By.cssSelector("#email + .error");

    public By locatorTextErrorPass = By.cssSelector("#password + .error");

    public By locatorExcluirUsuario = By.id("removeUser2");

    public By locatorTextUser1 = By.id("tdUserId1");

    public By locatorTextNombre1 = By.id("tdUserName1");

    public By locatorTextEmail1 = By.id("tdUserEmail1");

    public By locatorTextUser3 = By.id("tdUserId3");
}
