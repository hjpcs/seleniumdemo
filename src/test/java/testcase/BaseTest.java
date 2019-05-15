package testcase;

import listener.TestngListener;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Listeners;
import pageobject.BaiduPage;
import pageobject.SogouPage;
import util.Util;

/**
 * 实例化工具类
 * 实例化所有页面类
 * 其他测试用例类都继承此类
 */
@Listeners({TestngListener.class})
public class BaseTest {

    public Util util = new Util();

    public BaiduPage baiduPage = new BaiduPage();
    public SogouPage sogouPage = new SogouPage();


    public WebDriver getDriver(){
        return util.getDriver();
    }

    String baidu = "https://www.baidu.com/";
    String sogou = "https://www.sogou.com/";

    public void initBaidu(){
        util.open(baidu);
        util.max();
        util.elementWait(20);
    }

    public void initSogou(){
        util.open(sogou);
        util.max();
        util.elementWait(20);
    }
}
