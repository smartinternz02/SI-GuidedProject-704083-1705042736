import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject

import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile

import internal.GlobalVariable as GlobalVariable

import com.kms.katalon.core.annotation.BeforeTestCase
import com.kms.katalon.core.annotation.BeforeTestSuite
import com.kms.katalon.core.annotation.AfterTestCase
import com.kms.katalon.core.annotation.AfterTestSuite
import com.kms.katalon.core.context.TestCaseContext
import com.kms.katalon.core.context.TestSuiteContext

class TC_AMAZON_SEARCH_001 {
	/**
	 * Executes before every test case starts.
	 * @param testCaseContext related information of the executed test case.
	 */
	@BeforeTestCase
	def sampleBeforeTestCase() {
		WebUI.setText(findTestObject('Object Repository/TC_CART_005/Page_Amazon.com. Spend less. Smile more/input_Search Amazon_field-keywords'),
			'SALT FOR ICE AND SNOW')
		WebUI.click(findTestObject('Object Repository/TC_CART_005/Page_Amazon.com. Spend less. Smile more/input_Search Amazon_nav-search-submit-button'))
	}

	
	@AfterTestCase
	def sampleAfterTestCase() {
		WebUI.click(findTestObject('Object Repository/TC_CART_005/Page_Amazon.com  SALT FOR ICE AND SNOW/div_Price and other details may vary based _5f162a'))
		WebUI.click(findTestObject('Object Repository/TC_CART_005/Page_Amazon.com Steve Spangler Science-8555_418843/input_Shipping cost, delivery date, and ord_223673'))
	}
}