package data;

import org.testng.annotations.DataProvider;

public class SogouSearchData {

    @DataProvider
    public Object[][] searchData(){
        return new Object[][]{
                {"java", "java - 搜狗搜索"},
                {"python", "python - 搜狗搜索"},
                {"selenium", "搜狗搜索"}
        };
    }
}
