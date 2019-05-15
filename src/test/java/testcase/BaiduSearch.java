package testcase;

import data.BaiduSearchData;
import io.qameta.allure.*;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


@Epic("百度搜索")
@Feature("输入关键词进行搜索")
public class BaiduSearch extends BaseTest {

    /*
    因为百度搜索后的结果页面搜索框和搜索按钮id都没变，所以这里用@BeforeClass和@AfterClass即可
    三次测试只需要启动/关闭一次浏览器
     */
    @BeforeClass
    public void before(){
        super.initBaidu();
    }

    @AfterClass(alwaysRun = true)
    public void after(){
        util.quit();
    }

    @Test(dataProvider = "searchData", dataProviderClass = BaiduSearchData.class, priority = 0, description = "百度搜索测试")
    @Description("使用dataProvider进行数据驱动")
    @Severity(SeverityLevel.BLOCKER)
    @Story("获取页面title进行断言")
    public void baiduSearchTest(String keyword, String expect){
        baiduPage.input(keyword);
        baiduPage.search();
        try {
            util.sleep(2000);
        } catch (Exception e) {
            e.printStackTrace();
        }
        Assert.assertEquals(util.getTitle(), expect);
    }
}
