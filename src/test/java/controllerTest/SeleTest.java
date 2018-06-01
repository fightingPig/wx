/*
 * @(#)SeleTest.java    Created on 2018年5月15日
 * Copyright (c) 2018 ZDSoft Networks, Inc. All rights reserved.
 * $Id$
 */
package controllerTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * @author zhaosheng
 * @version $Revision: 1.0 $, $Date: 2018年5月15日 下午2:29:29 $
 */
public class SeleTest {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:/Users/zhaosheng/Downloads/chromedriver.exe");
        // 创建一个火狐浏览器WebDriver的新实例
        // 注意代码的剩余部分都是依赖于这个接口，而不是这个接口的实现
        WebDriver driver = new ChromeDriver();

        // 然后使用刚刚创建的FirefoxWebDriver来访问百度首页
        driver.get("https://www.smzdm.com/");
        // 或者我们可以使用下面的代码完成上面相同的功能（后面我们会具体介绍navigate）
        // driver.navigate().to("http://www.baidu.com");

        // 通过name参数来找到文本输入框的元素位置
        WebElement login = driver.findElement(By.className("J_login_trigger"));

        login.click();
        // 找到文本输入框元素后，我们输入一些信息来为搜索做准备
        Thread.sleep(1000);
        System.out.println("切换焦点");
        driver.switchTo().frame(driver.findElement(By.id("J_login_iframe")));
        Thread.sleep(1000);
        WebElement name = driver.findElement(By.name("username"));
        WebElement password = driver.findElement(By.id("password"));
        // 现在开始提交表单，WebDriver会通过定位到的元素为我们找到表单
        name.sendKeys("18868191681");
        password.sendKeys("2010zaw0606");
        WebElement button = driver.findElement(By.id("login_submit"));
        button.click();
        // WebElement agree = null;
        // try {
        // agree = driver.findElement(By.className("J_agree_btn"));
        // }
        // catch (NoSuchElementException e) {
        // System.out.println("无需同意");
        // }
        // if (agree != null) {
        // agree.click();
        // }

        System.out.println("登录成功");

        Thread.sleep(1000);
        WebElement sign = driver.findElement(By.className("J_punch"));
        sign.click();

        Thread.sleep(1000);
        if (!"签到领积分".equals(sign.getText())) {
            System.out.println(sign.getText());
        }
        else {
            System.out.println("请重新签到");
        }

        System.out.println("任务结束");

        // 百度的页面会通过JavaScript动态渲染
        // 等待页面加载完成，并且设置了10秒的超时检查。
        // (new WebDriverWait(driver, 20)).until(new ExpectedCondition<Boolean>() {
        // @Override
        // public Boolean apply(WebDriver d) {
        // return d.getTitle().toLowerCase().startsWith("中国");
        // }
        // });

        // (new WebDriverWait(driver, 20)).until((WebDriver d) -> d.getTitle().toLowerCase().startsWith("中国"));

        // 关闭浏览器
        driver.quit();
    }
}
