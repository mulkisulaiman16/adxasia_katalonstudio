import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://staging.adxasia.co.id/')

WebUI.waitForPageLoad(2)

WebUI.click(findTestObject('Email_Registration/1.1/Page_Home - ADX Asia/li_Sign In'))

WebUI.setText(findTestObject('Email_Registration/1.1/Page_Home - ADX Asia/input_email'), '!!test@test.com')

WebUI.clearText(findTestObject('Email_Registration/1.1/Page_Home - ADX Asia/input_email'))

WebUI.setText(findTestObject('Email_Registration/1.1/Page_Home - ADX Asia/input_email'), '123@@test.com')

WebUI.clearText(findTestObject('Email_Registration/1.1/Page_Home - ADX Asia/input_email'))

WebUI.setText(findTestObject('Email_Registration/1.1/Page_Home - ADX Asia/input_email'), 'abc.@abc.abc')

WebUI.clearText(findTestObject('Email_Registration/1.1/Page_Home - ADX Asia/input_email'))

WebUI.setText(findTestObject('Email_Registration/1.1/Page_Home - ADX Asia/input_email'), 'mulki.sulaiman90@gmail.com')

WebUI.setEncryptedText(findTestObject('Email_Registration/1.1/Page_Home - ADX Asia/input_Email_error'), '7rMQXxMs5dtH0amwvFpWZg==')

WebUI.click(findTestObject('Email_Registration/1.1/Page_Home - ADX Asia/button_Sign in'))

WebUI.closeBrowser()

