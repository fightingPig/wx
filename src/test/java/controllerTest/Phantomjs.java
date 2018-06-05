/*
 * @(#)Phantomjs.java    Created on 2018年6月5日
 * Copyright (c) 2018 ZDSoft Networks, Inc. All rights reserved.
 * $Id$
 */
package controllerTest;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.phantomjs.PhantomJSDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriverService;
import org.openqa.selenium.remote.DesiredCapabilities;

/**
 * @author zhaosheng
 * @version $Revision: 1.0 $, $Date: 2018年6月5日 上午10:55:38 $
 */
public class Phantomjs {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty(PhantomJSDriverService.PHANTOMJS_EXECUTABLE_PATH_PROPERTY,
                "D:/phantomjs-2.1.1-windows/bin/phantomjs.exe");
        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setCapability("phantomjs.page.settings.userAgent",
                "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/65.0.3325.181 Safari/537.36");
        cap.setCapability("phantomjs.page.customHeaders.User-Agent",
                "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/65.0.3325.181 Safari/537.36");
        // org.openqa.selenium.Proxy proxy = new org.openqa.selenium.Proxy();
        // proxy.setProxyType(org.openqa.selenium.Proxy.ProxyType.MANUAL);
        // proxy.setAutodetect(false);
        // String proxyStr = "";
        // do {
        // proxyStr = "122.114.31.177:808";
        // }
        // while (proxyStr.length() == 0);
        // proxy.setHttpProxy(proxyStr);
        // cap.setCapability(CapabilityType.PROXY, proxy);
        PhantomJSDriver driver = new PhantomJSDriver(cap);
        driver.get("https://zhiyou.smzdm.com/user/login");
        // 或者我们可以使用下面的代码完成上面相同的功能（后面我们会具体介绍navigate）
        // driver.navigate().to("http://www.baidu.com");
        Thread.sleep(10000);
        Document doc = Jsoup.parse(driver.getPageSource());
        System.out.println(doc);
        // WebDriverWait wait = new WebDriverWait(webDriver, 10);
        // wait.until(ExpectedConditions.presenceOfElementLocated(By.id(inputId)));//开始打开网页，等待输入元素出现
        Thread.sleep(10000);
        // 通过name参数来找到文本输入框的元素位置
        WebElement name = driver.findElement(By.id("username"));
        WebElement password = driver.findElement(By.id("password"));
        // 现在开始提交表单，WebDriver会通过定位到的元素为我们找到表单
        name.sendKeys("18868191681");
        password.sendKeys("2010zawzaw0606");
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

        Thread.sleep(10000);
        WebElement sign = null;
        try {
            sign = driver.findElement(By.className("J_punch"));
        }
        catch (Exception e) {
            System.out.println("登录失败");
            return;
        }
        System.out.println(sign.getText());
        sign.click();

        Thread.sleep(10000);
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
