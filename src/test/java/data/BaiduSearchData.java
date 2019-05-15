package data;

import org.testng.annotations.DataProvider;

public class BaiduSearchData {

    @DataProvider
    public Object[][] searchData(){
        return new Object[][]{
                {"java", "java_百度搜"},
                {"python", "python_百度搜索"},
                {"selenium", "selenium_百度搜索"}
        };
    }
}
