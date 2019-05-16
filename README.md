# seleniumdemo
使用PO模型编码，分层解耦。将底层方法、元素操作、业务逻辑、测试数据分离。技术选型：java + selenium + testng + allure + maven + git + jenkins

- util为工具类，封装了selenium的原生api方法

- pageobjec为页面类，封装元素操作

- testcas为测试用例类，实现业务逻辑

- data为测试数据类，提供数据驱动

- listener为监听类，对失败用例进行截图

项目运行方法：clone到本地，执行mvn clean test后，再执行allure serve target/allure-results或者allure generate target/allure-results均可

备注：pom.xml文件中改变了allure-results生成的路径在target文件夹下
