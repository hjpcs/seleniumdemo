package util;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Util {

    public static WebDriver driver;

    //打开浏览器
    public void open(String url){
        //使用headless模式
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless");
        driver = new ChromeDriver(options);
        //driver = new ChromeDriver();
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

    //线程休眠
    public void sleep(int mills) throws Exception {
        Thread.sleep(mills);
    }

}
