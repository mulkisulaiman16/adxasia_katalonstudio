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
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://staging.adxasia.co.id/')

WebUI.click(findTestObject('2.2/Page_Home - ADX Asia/input_Home_search__input__sear'))

WebUI.setText(findTestObject('2.2/Page_Home - ADX Asia/input_Home_search__input__sear'), 'Bebek')

WebUI.sendKeys(findTestObject('2.2/Page_Home - ADX Asia/input_Home_search__input__sear'), Keys.chord(Keys.ENTER))

WebUI.waitForJQueryLoad(3)

not_run: WebUI.click(findTestObject('2.2/Page_categories/span_Lifestyle'))

not_run: WebUI.delay(2)

WebUI.click(findTestObject('2.2/Page_categories/span_SPBU'))

not_run: WebUI.delay(2)

not_run: WebUI.click(findTestObject('2.2/Page_categories/span_Malls'))

not_run: WebUI.delay(2)

not_run: WebUI.click(findTestObject('2.2/Page_categories/span_Airport'))

WebUI.closeBrowser()

