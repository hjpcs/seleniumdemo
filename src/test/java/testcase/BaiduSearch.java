package testcase;

import base.BaseTest;
import data.BaiduSearchData;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class BaiduSearch extends BaseTest {

    /*
    因为百度搜索后的结果页面搜索框和搜索按钮id都没变，所以这里用@BeforeClass和@AfterClass即可
    三次测试只需要启动/关闭一次浏览器
     */
    @BeforeClass
    public void before(){
        baiduPage.open();
        util.max();
    }

    @AfterClass(alwaysRun = true)
    public void after(){
        util.quit();
    }

    @Test(dataProvider = "searchData", dataProviderClass = BaiduSearchData.class)
    public void searchTest(String keyword, String expect){
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
