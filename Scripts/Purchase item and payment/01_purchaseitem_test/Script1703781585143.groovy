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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.demoblaze.com/')

WebUI.click(findTestObject('Object Repository/purchaseitem_test/PurchaseItem_Test/a_Log in'))

WebUI.setText(findTestObject('Object Repository/purchaseitem_test/PurchaseItem_Test/inputloginusername'), 'rafliraihan2')

WebUI.setEncryptedText(findTestObject('Object Repository/purchaseitem_test/PurchaseItem_Test/inputloginpassword'), 'o371gIuENjI=')

WebUI.click(findTestObject('Object Repository/purchaseitem_test/PurchaseItem_Test/button_Log in'))

WebUI.click(findTestObject('Object Repository/purchaseitem_test/PurchaseItem_Test/a_Samsung galaxy s6'))

WebUI.click(findTestObject('Object Repository/purchaseitem_test/PurchaseItem_Test/a_Add to cart'))

WebUI.click(findTestObject('Object Repository/purchaseitem_test/PurchaseItem_Test/a_Cart'))

WebUI.click(findTestObject('Object Repository/purchaseitem_test/PurchaseItem_Test/button_Place Order'))

WebUI.setText(findTestObject('Object Repository/purchaseitem_test/PurchaseItem_Test/inputname'), 'rafliraihan')

WebUI.setText(findTestObject('Object Repository/purchaseitem_test/PurchaseItem_Test/inputcountry'), 'indonesia')

WebUI.setText(findTestObject('Object Repository/purchaseitem_test/PurchaseItem_Test/inputcity'), 'semarang')

WebUI.setText(findTestObject('Object Repository/purchaseitem_test/PurchaseItem_Test/inputcard'), '123455678')

WebUI.setText(findTestObject('Object Repository/purchaseitem_test/PurchaseItem_Test/inputmonth'), 'Desember')

WebUI.setText(findTestObject('Object Repository/purchaseitem_test/PurchaseItem_Test/inputyear'), '2023')

WebUI.click(findTestObject('Object Repository/purchaseitem_test/PurchaseItem_Test/button_Purchase'))

WebUI.click(findTestObject('Object Repository/purchaseitem_test/PurchaseItem_Test/button_OK'))

