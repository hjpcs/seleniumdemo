package base;

import pageobject.BaiduPage;
import pageobject.GooglePage;
import pageobject.SogouPage;
import util.Util;

/**
 * 实例化工具类
 * 实例化所有页面类
 * 其他测试用例类都继承此类
 */
public class BaseTest {

    public Util util = new Util();

    public BaiduPage baiduPage = new BaiduPage();
    public GooglePage googlePage = new GooglePage();
    public SogouPage sogouPage = new SogouPage();
}
