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

WebUI.click(findTestObject('Facebook_Registration/1.1/Page_Home - ADX Asia/li_Sign In'))

WebUI.click(findTestObject('Facebook_Registration/1.1/Page_Home - ADX Asia/button_Sign in with Faceboook'))

WebUI.switchToWindowTitle('Facebook')

WebUI.setText(findTestObject('Facebook_Registration/1.1/Page_Facebook/input_Email atau Telepon_email'), 'mulkicihuy')

WebUI.setEncryptedText(findTestObject('Facebook_Registration/1.1/Page_Facebook/input_Kata sandi_pass'), '0dft3jzEQdMuEoD9Ds5aqA==')

WebUI.click(findTestObject('Facebook_Registration/1.1/Page_Facebook/input_Kata sandi_login'))

not_run: WebUI.click(findTestObject('Facebook_Registration/1.1/Page_Log in with Facebook/button_Continue as Mulki'))

not_run: WebUI.waitForPageLoad(5)

WebUI.closeBrowser()

