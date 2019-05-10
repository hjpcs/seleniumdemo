package data;

import org.testng.annotations.DataProvider;

public class GoogleSearchData {

    @DataProvider
    public Object[][] searchData(){
        return new Object[][]{
                {"java", "java - Google 搜索"},
                {"python", "python - Google 搜索"},
                {"selenium", "selenium - Google 搜索"}
        };
    }
}
