package pageobject;

public class GooglePage extends BasePage{

    String searchBar = "//*[@id=\"tsf\"]/div[2]/div/div[1]/div/div[1]/input";
    String searchButton = "//*[@id=\"tsf\"]/div[2]/div/div[2]/div[2]/div/center/input[1]";

    //打开谷歌首页
    public void open(){
        util.open(google);
    }

    //输入关键字
    public void input(String text){
        util.inputByXpath(searchBar, text);
    }

    //搜索
    public void search(){
        util.clickByXpath(searchButton);
    }

}
