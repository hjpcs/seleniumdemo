package pageobject;

public class BaiduPage extends BasePage {

    String searchBar = "kw";
    String searchButton = "su";

    //打开百度首页
    public void open(){
        util.open(baidu);
    }

    //输入关键字
    public void input(String text){
        util.inputById(searchBar, text);
    }

    //搜索
    public void search(){
        util.clickById(searchButton);
    }
}
