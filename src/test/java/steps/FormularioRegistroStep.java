package steps;

import net.serenitybdd.annotations.Step;
import org.openqa.selenium.WebDriver;
import pages.FormularioRegistroPage;

public class FormularioRegistroStep extends FormularioRegistroPage {



    @Step("ingresar web")
    public void ingresaraWeb(String web){
    openUrl(web);

    }
@Step ("rellenar nombre formulario")
    public void cargarNombreFormulario(String nombre){
    typeText(locatorInputNombre,nombre);
}
@Step ("rellenar email formulario")
    public void cargarEmailFormulario(String email){
    typeText(locatorInputEmail,email);
}
@Step ("rellenar password formulario")
    public void cargarPasswordformulario(String password){
    typeText(locatorInputContraseña,password);
}

@Step("click registrar")
    public void clickRegistrar(){
    clickElement(locatorSubmitRegistrar);
}

@Step("obtener error nombre")
public void obtenerErrorNombre()  {
        getText(locatorTextErrorName);
}


    @Step("obtener error email")
    public void obtenerErrorEmail()  {
        getText(locatorTextErrorEmail);
    }


    @Step("obtener error contraseña")
    public void obtenerErrorContraseña()  {
        getText(locatorTextErrorPass);
    }


    @Step("eliminar usuario")
    public void eliminarUsuario()  {
        clickElement(locatorExcluirUsuario);
    }


    @Step("obtener id usuario1")
    public void obtenerIdUsuario1()  {
        getText(locatorTextUser1);
    }


    @Step("obtener id usuario3")
    public void obtenerIdUsuario3()  {
        getText(locatorTextUser3);
    }
}
