package by.it_academy.tafbugred.ui;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestPageBugRed extends BaseTest{
    @Test
    void testActionWithName(){
        StepPage stepPage = new StepPage(driver);
        stepPage.ActionsWithPageTafBugRed();

        Assert.assertEquals(stepPage.NAME, stepPage.getTextName());
    }

    @Test
    void testActionWithEmail(){
        StepPage stepPage = new StepPage(driver);
        stepPage.ActionsWithPageTafBugRed();

        Assert.assertEquals(stepPage.EMAIL, stepPage.getTextEmail());
    }

    @Test
    void testActionWithPassword(){
        StepPage stepPage = new StepPage(driver);
        stepPage.ActionsWithPageTafBugRed();

        Assert.assertEquals(stepPage.PASSWORD, stepPage.getTextPassword());

    }

    @Test
    void testActionWithNameButtonRegister(){
        StepPage stepPage = new StepPage(driver);
        stepPage.ActionsWithPageTafBugRed();

        Assert.assertEquals(stepPage.BUTTON_REGISTER,stepPage.getTextNameButtonRegister());
    }

    @Test
    void testActionWithNameRegister(){
        StepPage stepPage = new StepPage(driver);
        stepPage.ActionsWithPageTafBugRed();

        Assert.assertEquals(stepPage.REGISTER, stepPage.getTextRegister());
    }
    @Test
    void testActionWithEmailFieldEnter(){
        StepPage stepPage=new StepPage(driver);
        stepPage.ActionsWithPageTafBugRed();

        Assert.assertEquals(stepPage.EMAIL_FIELD_ENTER,stepPage.getTextEmailFieldEnter());
    }
    @Test
    void testActionWithPasswordFieldEnter(){
        StepPage stepPage=new StepPage(driver);
        stepPage.ActionsWithPageTafBugRed();

        Assert.assertEquals(stepPage.PASSWORD_FIELD_ENTER,stepPage.getTextPasswordFieldEnter());
    }
    @Test
    void testActionWithAuthorisationFieldEnter(){
        StepPage stepPage=new StepPage(driver);
        stepPage.ActionsWithPageTafBugRed();

        Assert.assertEquals(stepPage.AUTHORIZATION_FIELD_ENTER,stepPage.getNameButtonAuthorisationFieldEnter());
    }
    @Test
    void testActionWithNameEnterFieldEnter(){
        StepPage stepPage=new StepPage(driver);
        stepPage.ActionsWithPageTafBugRed();

        Assert.assertEquals(stepPage.NAME_ENTER_FIELD_ENTER,stepPage.getTextNameEnter());
    }
    @Test
    void testActonWithNameOfTopFieldEnter(){
        StepPage stepPage=new StepPage(driver);
        stepPage.ActionsWithPageTafBugRed();

        Assert.assertEquals(stepPage.NAME_OF_TOP_FIELD_ENTER,stepPage.getTextNameOfTop());
    }
}
