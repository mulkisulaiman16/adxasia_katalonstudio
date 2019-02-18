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

WebUI.click(findTestObject('Gmail_Registration/1.1/Page_Home - ADX Asia/li_Sign In'))

WebUI.click(findTestObject('Gmail_Registration/1.1/Page_Home - ADX Asia/button_Sign in with Google'))

WebUI.switchToWindowTitle('Masuk - Akun Google')

WebUI.setText(findTestObject('Gmail_Registration/1.1/Page_Masuk - Akun Google/input_gmail_account'), 'mulkimul16')

WebUI.click(findTestObject('Gmail_Registration/1.1/Page_Masuk - Akun Google/span_Berikutnya'))

WebUI.setEncryptedText(findTestObject('Gmail_Registration/1.1/Page_Masuk - Akun Google/input_gmail_password'), '14n9+UJqs0woiBvwapmKLg==')

WebUI.click(findTestObject('Gmail_Registration/1.1/Page_Masuk - Akun Google/span_Berikutnya'))

WebUI.waitForJQueryLoad(3)

WebUI.closeBrowser()

