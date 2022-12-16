import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

int x = findTestData('Login').getRowNumbers()

Mobile.startApplication(GlobalVariable.app_name, true)

Mobile.tap(findTestObject('intropage/next_intro_Button'), 3)

Mobile.tap(findTestObject('intropage/next_intro2_Button'), 3)

Mobile.tap(findTestObject('intropage/skip_page_Button'), 3)

for (i = 1; i <= x; i++) {
    Mobile.setText(findTestObject('loginpage/email_txt'), findTestData('Login').getValue(1, i), 0)

    Mobile.setText(findTestObject('loginpage/password_txt'), findTestData('Login').getValue(2, i), 0)

    Mobile.tap(findTestObject('loginpage/login_Button'), 3)

    if (findTestData('Login').getValue(2, i) == 'bixil79242') {
        Mobile.verifyElementExist(findTestObject('homepage/home_title'), 5)
    } else {
        Mobile.verifyElementExist(findTestObject('loginpage/error_message'), 5)

        Mobile.tap(findTestObject('loginpage/error_ok_Button'), 3)
    }
}

Mobile.closeApplication()

