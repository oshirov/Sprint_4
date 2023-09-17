package practicum;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.junit.Assert.assertEquals;

public class DropDownTestUI extends BaseUITest{
    MainPage mainPage = new MainPage(webDriver);

    @Test
    public void checkFirstButton(){
        mainPage.open();
        MainPageLocatorsAndMethods baseButtonBlock = new MainPageLocatorsAndMethods(webDriver, 0);
        baseButtonBlock.clickButton();
        String expected = "Сутки — 400 рублей. Оплата курьеру — наличными или картой.";
        new WebDriverWait(webDriver, 3)
                .until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//p[text()='"+expected+"']")));
        assertEquals(expected, baseButtonBlock.getAnswer());
    }


    @Test
    public void checkSecondButton(){
        mainPage.open();
        MainPageLocatorsAndMethods baseButtonBlock = new MainPageLocatorsAndMethods(webDriver, 1);
        baseButtonBlock.clickButton();
        String expected = "Пока что у нас так: один заказ — один самокат. Если хотите покататься с друзьями, можете просто сделать несколько заказов — один за другим.";
        new WebDriverWait(webDriver, 3)
                .until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//p[text()='"+expected+"']")));
        assertEquals(expected, baseButtonBlock.getAnswer());
    }

    @Test
    public void checkThirdButton(){
        mainPage.open();
        MainPageLocatorsAndMethods baseButtonBlock = new MainPageLocatorsAndMethods(webDriver, 2);
        baseButtonBlock.clickButton();
        String expected = "Допустим, вы оформляете заказ на 8 мая. Мы привозим самокат 8 мая в течение дня." +
                " Отсчёт времени аренды начинается с момента, когда вы оплатите заказ курьеру." +
                " Если мы привезли самокат 8 мая в 20:30, суточная аренда закончится 9 мая в 20:30.";
        new WebDriverWait(webDriver, 3)
                .until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//p[text()='"+expected+"']")));
        assertEquals(expected, baseButtonBlock.getAnswer());
    }

    @Test
    public void checkFourthButton(){
        mainPage.open();
        MainPageLocatorsAndMethods baseButtonBlock = new MainPageLocatorsAndMethods(webDriver, 3);
        baseButtonBlock.clickButton();
        String expected = "Только начиная с завтрашнего дня. Но скоро станем расторопнее.";
        new WebDriverWait(webDriver, 3)
                .until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//p[text()='"+expected+"']")));
        assertEquals(expected, baseButtonBlock.getAnswer());
    }


    @Test
    public void checkFifthButton(){
        mainPage.open();
        MainPageLocatorsAndMethods baseButtonBlock = new MainPageLocatorsAndMethods(webDriver, 4);
        baseButtonBlock.clickButton();
        String expected = "Пока что нет! Но если что-то срочное — всегда можно позвонить в поддержку по красивому номеру 1010.";
        new WebDriverWait(webDriver, 3)
                .until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//p[text()='"+expected+"']")));
        assertEquals(expected, baseButtonBlock.getAnswer());
    }

    @Test
    public void checkSixthButton(){
        mainPage.open();
        MainPageLocatorsAndMethods baseButtonBlock = new MainPageLocatorsAndMethods(webDriver, 5);
        baseButtonBlock.clickButton();
        String expected = "Самокат приезжает к вам с полной зарядкой." +
                " Этого хватает на восемь суток — даже если будете кататься без передышек и во сне." +
                " Зарядка не понадобится.";
        new WebDriverWait(webDriver, 3)
                .until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//p[text()='"+expected+"']")));
        assertEquals(expected, baseButtonBlock.getAnswer());
    }

    @Test
    public void checkSevenButton(){
        mainPage.open();
        MainPageLocatorsAndMethods baseButtonBlock = new MainPageLocatorsAndMethods(webDriver, 6);
        baseButtonBlock.clickButton();
        String expected = "Да, пока самокат не привезли. Штрафа не будет, объяснительной записки тоже не попросим. Все же свои.";
        new WebDriverWait(webDriver, 3)
                .until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//p[text()='"+expected+"']")));
        assertEquals( expected, baseButtonBlock.getAnswer());
    }

    @Test
    public void checkEigthButton(){
        mainPage.open();
        MainPageLocatorsAndMethods baseButtonBlock = new MainPageLocatorsAndMethods(webDriver, 7);
        baseButtonBlock.clickButton();
        String expected = "Да, обязательно. Всем самокатов! И Москве, и Московской области.";
        new WebDriverWait(webDriver, 3)
                .until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//p[text()='"+expected+"']")));
        assertEquals(expected,baseButtonBlock.getAnswer());
    }

}