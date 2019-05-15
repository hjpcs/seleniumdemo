package pageobject;

import io.qameta.allure.Step;

public class SogouPage extends BasePage{

    String searchBar = "query";
    String searchButton = "stb";

    //输入关键字
    @Step("输入关键字")
    public void input(String text){
        util.inputById(searchBar, text);
    }

    //搜索
    @Step("点击搜索按钮")
    public void search(){
        util.clickById(searchButton);
    }
}
