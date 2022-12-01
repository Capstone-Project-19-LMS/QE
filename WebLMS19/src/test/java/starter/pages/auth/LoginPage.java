package starter.pages.auth;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class LoginPage extends PageObject {
    public void openLandingPage(){
        openAt("/");
    }
    private By profileBtnRight(){
        return By.xpath("//div[@class='nav-item dropdown']");
    }
    private By dropdownProfileBtnLogin(){
        return By.xpath("//*[@id=\"navbarSupportedContent\"]/div[2]/div");
    }
    //contoh
    private By headerDashboard(){
        return By.xpath("//h2[text()[contains(.,'Dashboard')]]");
    }
    private By inputEmail(){
        return By.cssSelector("#formBasicEmail");
    }
    private By inputPassword(){
        return By.cssSelector("#formBasicPassword");
    }
    private By btnLogin(){
        return By.xpath("//button[@class='btnMasuk btn btn-primary']");
    }
    //contoh
    public void ClickProfileBtnRight(){
        $(profileBtnRight()).click();
    }
    public void ClickDropdownProfileBtnLogin(){
        $(dropdownProfileBtnLogin()).click();
    }
    public void InputEmail(String email){
//        $(inputEmail()).click();
        $(inputEmail()).type(email);
    }
    public void InputPassword(String password){
//        $(inputPassword()).click();
        $(inputPassword()).type(password);
    }
    public void ClickBtnLogin(){
        $(btnLogin()).click();
    }
    public void HeaderDashboard(){
        $(headerDashboard()).isDisplayed();
    }
}
