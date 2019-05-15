package util;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Util {

    public static WebDriver driver;

    public WebDriver getDriver(){
        return driver;
    }

    //打开浏览器
    public void open(String url){
        //使用headless模式
        /*ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless");
        driver = new ChromeDriver(options);*/
        driver = new ChromeDriver();
        driver.get(url);
    }

    public void openNormal(String url){
        driver = new ChromeDriver();
        driver.get(url);
    }

    //关闭浏览器
    public void quit(){
        driver.quit();
    }

    //浏览器最大化
    public void max(){
        driver.manage().window().maximize();
    }

    //根据id查找元素
    public WebElement findElById(String id){
        return driver.findElement(By.id(id));
    }

    //根据xpath查找元素
    public WebElement findElByXpath(String xpath){
        return driver.findElement(By.xpath(xpath));
    }

    //根据xpath查找一组元素
    public List<WebElement> findElementsByXpath(String xpath){
        return driver.findElements(By.xpath(xpath));
    }

    //根据id点击元素
    public void clickById(String id){
        findElById(id).click();
    }

    //根据xpath点击元素
    public void clickByXpath(String xpath){
        findElByXpath(xpath).click();
    }

    //根据id输入值
    public void inputById(String id, String text){
        findElById(id).clear();
        findElById(id).sendKeys(text);
    }

    //根据xpath输入值
    public void inputByXpath(String xpath, String text){
        findElByXpath(xpath).clear();
        findElByXpath(xpath).sendKeys(text);
    }

    //获取页面title
    public String getTitle(){
        return driver.getTitle();
    }

    //获取元素文本属性
    public String getText(WebElement element){
        return element.getText();
    }
    //线程休眠
    public void sleep(int mills) throws Exception {
        Thread.sleep(mills);
    }

    //鼠标悬停-id
    public void moveToElById(String id){
        Actions actions = new Actions(driver);
        actions.clickAndHold(findElByXpath(id)).perform();
    }

    //鼠标悬停-xpath
    public void moveToElByXpath(String xpath){
        Actions actions = new Actions(driver);
        actions.clickAndHold(findElByXpath(xpath)).perform();
    }

    //设置元素等待
    public void elementWait(int second){
        driver.manage().timeouts().implicitlyWait(second,TimeUnit.SECONDS);
    }
}
