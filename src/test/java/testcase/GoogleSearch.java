package testcase;

import base.BaseTest;
import data.GoogleSearchData;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class GoogleSearch extends BaseTest {

    @BeforeClass
    public void before(){
        googlePage.open();
        util.max();
    }

    @AfterClass(alwaysRun = true)
    public void after(){
        util.quit();
    }

    @Test(dataProvider = "searchData", dataProviderClass = GoogleSearchData.class)
    public void searchTest(String keyword, String expect){
        googlePage.input(keyword);
        googlePage.search();
        try {
            util.sleep(2000);
        } catch (Exception e) {
            e.printStackTrace();
        }
        Assert.assertEquals(util.getTitle(), expect);
    }
    
}
