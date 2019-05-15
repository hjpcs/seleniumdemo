package testcase;

import data.SogouSearchData;
import io.qameta.allure.*;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

@Epic("搜狗搜索测试")
@Feature("输入关键词进行搜索")
public class SogouSearch extends BaseTest {

    /*
    因为搜狗搜索后的结果页面搜索框和搜索按钮id都产生了变化，所以这里用@BeforeMethod和@AfterMethod
    在每次测试开始/结束时启动/关闭一次浏览器
     */
    @BeforeMethod
    public void before(){
        super.initSogou();
    }

    @AfterMethod(alwaysRun = true)
    public void after(){
        util.quit();
    }

    @Test(dataProvider = "searchData", dataProviderClass = SogouSearchData.class, priority = 0, description = "搜狗搜索测试")
    @Description("使用dataProvider进行数据驱动，由于搜狗反爬机制导致headless模式用例都会失败")
    @Severity(SeverityLevel.CRITICAL)
    @Story("获取页面title进行断言")
    public void sogouSearchTest(String keyword, String expect){
        sogouPage.input(keyword);
        sogouPage.search();
        try {
            util.sleep(2000);
        } catch (Exception e) {
            e.printStackTrace();
        }
        Assert.assertEquals(util.getTitle(), expect);
    }
}
