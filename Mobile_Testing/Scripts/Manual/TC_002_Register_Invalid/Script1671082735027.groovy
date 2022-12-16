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

int x = findTestData('Register').getRowNumbers()

Mobile.startApplication(GlobalVariable.app_name, true)

Mobile.tap(findTestObject('intropage/next_intro_Button'), 3)

Mobile.tap(findTestObject('intropage/next_intro2_Button'), 3)

Mobile.tap(findTestObject('intropage/skip_page_Button'), 3)

Mobile.scrollToText('Daftar', FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('loginpage/to_register_page_Button'), 3)

for (i = 1; i <= x; i++) {
    Mobile.tap(findTestObject('registerpage/name_txt'), 3)

    Mobile.setText(findTestObject('registerpage/name_txt'), findTestData('Register').getValue(1, i), 0)

    Mobile.tap(findTestObject('registerpage/email_txt'), 3)

    Mobile.setText(findTestObject('registerpage/email_txt'), findTestData('Register').getValue(2, i), 0)

    Mobile.tap(findTestObject('registerpage/password_txt'), 3)

    Mobile.setText(findTestObject('registerpage/password_txt'), findTestData('Register').getValue(3, i), 0)

    Mobile.checkElement(findTestObject('registerpage/privacy_checkbox'), 3)

    Mobile.tap(findTestObject('registerpage/register_Button'), 3)

    Mobile.verifyElementExist(findTestObject('registerpage/error_message'), 3)

    Mobile.tap(findTestObject('registerpage/error_ok_Button'), 3)
}

Mobile.closeApplication()

