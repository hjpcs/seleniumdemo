package listener;

import io.qameta.allure.Attachment;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.TestListenerAdapter;
import testcase.BaseTest;

public class TestngListener extends TestListenerAdapter {

    public void onTestFailure(ITestResult iTestResult){
        super.onTestFailure(iTestResult);
        BaseTest baseTest = (BaseTest) iTestResult.getInstance();
        WebDriver driver = baseTest.getDriver();
        screenshot(driver);
        logCaseStep(iTestResult);
        exceptResult(iTestResult);
    }

    @Attachment(value = "失败截图如下：", type = "image/png")
    public byte[] screenshot(WebDriver driver){
        byte[] screenshotAs = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
        return screenshotAs;
    }

    @Attachment(value = "操作步骤如下：")
    public String logCaseStep(ITestResult iTestResult){
        String step = "1.打开浏览器 2.输入搜索地址 3.输入关键词 4.点击搜索按钮";
        return step;
    }

    @Attachment(value = "期望结果如下：")
    public String exceptResult(ITestResult iTestResult){
        String result = "显示查询结果";
        return result;
    }
}
