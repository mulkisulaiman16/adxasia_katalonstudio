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

WebUI.click(findTestObject('Email_Registration/1.1/Page_Home - ADX Asia/li_Sign In'))

WebUI.setText(findTestObject('Email_Registration/1.1/Page_Home - ADX Asia/input_email'), 'mulkimul16@gmail.com')

WebUI.setEncryptedText(findTestObject('Email_Registration/1.1/Page_Home - ADX Asia/input_Email_error'), 'mn5hRviTc1hO3f41WUkJsA==')

WebUI.click(findTestObject('Email_Registration/1.1/Page_Home - ADX Asia/button_Sign in'))

WebUI.click(findTestObject('Email_Registration/1.2/Page_Home - ADX Asia/button_Sign in with Google'))

WebUI.delay(2)

WebUI.switchToWindowTitle('Masuk - Akun Google', FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Email_Registration/1.2/Page_Masuk - Akun Google/input_gmail_account'), 'mulkimul16@gmail.com')

WebUI.click(findTestObject('Email_Registration/1.2/Page_Masuk - Akun Google/span_Berikutnya'))

WebUI.setEncryptedText(findTestObject('Email_Registration/1.2/Page_Masuk - Akun Google/input_password'), '14n9+UJqs0woiBvwapmKLg==')

WebUI.click(findTestObject('Email_Registration/1.2/Page_Masuk - Akun Google/span_Berikutnya'))

WebUI.waitForPageLoad(3)

WebUI.closeBrowser()

