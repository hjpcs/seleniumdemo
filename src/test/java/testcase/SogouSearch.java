package testcase;

import data.SogouSearchData;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

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

    @Test(dataProvider = "searchData", dataProviderClass = SogouSearchData.class)
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
