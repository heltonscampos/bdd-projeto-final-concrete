package io.cucumber.danilo;

import io.cucumber.java.pt.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ValidadorCPF{  
    public WebDriver browser;
  
    @Dado("que eu esteja na pagina de validacao de cpf")
    public void que_eu_esteja_na_pagina_de_validacao_de_cpf() {
        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();
        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver");
        browser = new ChromeDriver();
        browser.get("http://localhost:8081/");
       // browser.quit();
    }
    @Dado("digito um cpf valido {string}")
    public void digito_um_cpf_valido(String string) {
        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();
        WebElement campoNome = browser.findElement(By.name("nome"));
        campoNome.sendKeys("Danilo");
        WebElement campoCpf = browser.findElement(By.name("cpf"));
        campoCpf.sendKeys(string);
        //campoCpf.sendKeys("09912149432");
    }
    @Dado("digito um cpf invalido {string}")
    public void digito_um_cpf_invalido(String string) {
    // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();
        WebElement campoNome = browser.findElement(By.name("nome"));
        campoNome.sendKeys("Danilo");
        WebElement campoCpf = browser.findElement(By.name("cpf"));
        campoCpf.sendKeys(string);
    }
    @Quando("eu clico no botao enviar")
    public void eu_clico_no_botao_enviar() {
        // Write code here that turns the phrase above into concrete actions
        WebElement campoCpf = browser.findElement(By.name("cpf"));
        campoCpf.submit();    }
    @Entao("devo ver uma mensagem de {string}")
    public void devo_ver_uma_mensagem_de(String string) {
   //Write code here that turns the phrase above into concrete actions
        // String mensagem = browser.findElement(By.className("alert-success")).getText();
        // mensagem = browser.findElement(By.className("")).getText()
        // assertEquals(string , mensagem);
        // browser.quit();

    //     String mensagem = "";
    //     if (browser.findElements(By.className("alert-success")).size() > 0){
    //         mensagem = browser.findElement(By.className("alert-success")).getText();
    //     }
    //     else{
    //         mensagem = browser.findElement(By.className("alert-danger")).getText();
    //     }
    //     assertEquals(string, mensagem);
    //     browser.quit();
    // }
        String mensagem = "";
        if (browser.findElements(By.className("alert-danger")).size() > 0){
            mensagem = browser.findElement(By.className("alert-danger")).getText();
        }
        else{
            browser.get("http://localhost:index.html/");
        }
        assertEquals(string, mensagem);
        browser.quit();
}

}
