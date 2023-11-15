package definitions;

import io.cucumber.java.pt.Dada;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import steps.FormularioRegistroStep;

public class FormularioRegistroDef extends FormularioRegistroStep {
    //registro exitoso
    @E("carrego nome {string}")
    public void carregarNome(String nome){
        cargarNombreFormulario(nome);
    }
    @E("carrego email {string}")
    public void carregarEmail(String email){
        cargarEmailFormulario(email);
    }
    @E("carrego senha {string}")
    public void carregarSenha (String senha){
        cargarPasswordformulario(senha);
    }

    @Dada("ingreso a la pagina {string}")
    public void ingresoPagina(String Web){
        openUrl(Web);
    }




    @E("clico em Cadastrar")
    public void clicoCadastrar(){
    clickRegistrar();
    }
    @Entao("aparece uma tabela com os dados do usuário {string} e {string}")
    public void registroexitoso(String nombre ,String email){
        Assertions.assertEquals("1",getText(locatorTextUser1));
        Assertions.assertEquals(nombre,getText(locatorTextNombre1));
        Assertions.assertEquals(email,getText(locatorTextEmail1));
    }

    //ingresar y ver los campos vacios que muestran los placeholder


    @Quando("verifico que los campos de registro esten vacio")
    public void verifico_que_los_campos_de_registro_esten_vacio() {

    }
    @Entao("los campos de registro estan vacios , se muestran el valor enmascarado de cada campo nombre = {string} Email = {string} contraseña = {string}")
    public void los_campos_de_registro_estan_vacios_se_muestran_el_valor_enmascarado_de_cada_campo(String nombre,String email,String pass) {
        Assertions.assertEquals(nombre, getAtribute(locatorInputNombre,"placeholder"));
        Assertions.assertEquals("",getText(locatorInputNombre));

        Assertions.assertEquals(email, getAtribute(locatorInputEmail,"placeholder"));
        Assertions.assertEquals("",getText(locatorInputEmail));

        Assertions.assertEquals(pass,getAtribute(locatorInputContraseña,"placeholder"));
        Assertions.assertEquals("",getText(locatorInputContraseña));
    }

//llenar sin mail


    @Quando("lleno el formulario de registro con los datos de usuario validos dejando el campo email vacio")
    public void lleno_el_formulario_de_registro_con_los_datos_de_usuario_validos_dejando_el_campo_email_vacio() {
        cargarNombreFormulario("nicolas sosa");
        cargarPasswordformulario("contraseña");
    }

    @Entao("O campo de e-mail está gerando o erro {string} A tabela de usuários não deve ser alterada.")
    public void el_campo_email_tira_el_error_o_campo_e_mail_é_obrigatório_y_la_tabla_de_usuarios_no_debe_cambiar(String error) {
        Assertions.assertEquals(error,getText(locatorTextErrorEmail));
    }

    // formula sin llenar nombre

    @Quando("lleno el formulario de registro con los datos de usuario validos dejando el campo nombre vacio")
    public void lleno_el_formulario_de_registro_con_los_datos_de_usuario_validos_dejando_el_campo_nombre_vacio() {
        cargarEmailFormulario("prueba@gmail.com");
        cargarPasswordformulario("contraseña");

    }

    @Entao("O campo de nome está gerando o erro {string} A tabela de usuários não deve ser alterada")
    public void el_campo_nombre_tira_el_error_o_campo_nome_é_obrigatório_y_la_tabla_de_usuarios_no_debe_cambiar(String error) {
        Assertions.assertEquals(error, getText(locatorTextErrorName));
    }

    @Entao("O campo de senha está gerando o erro {string} A tabela de usuários não deve ser alterada.")
    public void el_campo_contraseña_tira_el_error_a_senha_deve_conter_ao_menos_caracteres_y_la_tabla_de_usuarios_no_debe_cambiar(String error) {
        Assertions.assertEquals(error, getText(locatorTextErrorPass));
    }

    //tabla de usuario vacia

    @Quando("verifico que no exista la tabla de usuario al no existir un usuario registrado")
    public void verifico_que_no_exista_la_tabla_de_usuario_al_no_existir_un_usuario_registrado() {

    }
    @Entao("no se muestra la tabla de usuarios")
    public void no_se_muestra_la_tabla_de_usuarios() {

    }




}
