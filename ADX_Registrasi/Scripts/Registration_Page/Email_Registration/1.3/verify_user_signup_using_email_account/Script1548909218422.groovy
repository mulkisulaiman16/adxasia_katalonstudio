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

WebUI.click(findTestObject('Email_Registration/1.3/Page_Signup/span_Sign up'))

WebUI.click(findTestObject('Email_Registration/1.3/Page_Signup/button_Sign up with Email'))

WebUI.setText(findTestObject('Email_Registration/1.3/Page_Signup/input_email'), 'test21@test.com')

WebUI.setText(findTestObject('Email_Registration/1.3/Page_Signup/input_fullname'), 'Test Mulki')

WebUI.setText(findTestObject('Email_Registration/1.3/Page_Signup/input_telepon'), '08123456789')

WebUI.setText(findTestObject('Email_Registration/1.3/Page_Signup/input_company'), 'Test')

WebUI.setEncryptedText(findTestObject('Email_Registration/1.3/Page_Signup/input_password'), 'o+tS4OuGt32nW2fw4d97xA==')

WebUI.check(findTestObject('Email_Registration/1.3/Page_Signup/label_I Agree'))

WebUI.click(findTestObject('Email_Registration/1.3/Page_Signup/button_Register'))

WebUI.closeBrowser()

