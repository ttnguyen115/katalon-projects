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

WebUI.openBrowser('https://gamek.vn/')

WebUI.setText(findTestObject('Object Repository/gamek/Page_Knh tin Game ln nht, th vin Game y  nht/input_CNG NG_searchinput'), 
    'Chấy tà râm')

WebUI.navigateToUrl('https://gamek.vn/tim-kiem.chn?keyword=Ch%E1%BA%A5y%20t%C3%A0%20r%C3%A2m')

WebUI.click(findTestObject('Object Repository/gamek/Page_Trang tm kim - Knh tin Game ln nht, th_c5ca43/div_Khng tm thy bi vit no'))

WebUI.rightClick(findTestObject('Object Repository/gamek/Page_Trang tm kim - Knh tin Game ln nht, th_c5ca43/div_Khng tm thy bi vit no'))

WebUI.closeBrowser()

