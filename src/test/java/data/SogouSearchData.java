package data;

import org.testng.annotations.DataProvider;

public class SogouSearchData {

    @DataProvider
    public Object[][] searchData(){
        return new Object[][]{
                {"java", "搜狗搜索"},
                {"python", "搜狗搜索"},
                {"selenium", "搜狗搜索"}
        };
    }
}
