package pageobject;

import util.Util;

/**
 * 实例化工具类
 * 并配置相关参数
 * 其他所有页面类都继承此类
 */
public class BasePage {

    Util util = new Util();

    String baidu = "https://www.baidu.com/";
    String google = "https://www.google.com/";
    String sogou = "https://www.sogou.com/";
}
