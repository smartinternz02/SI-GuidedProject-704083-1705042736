package com.ck.pu

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

import internal.GlobalVariable

public class TC_NEW_USER_003 {

	@Keyword
	def new_user() {
		WebUI.openBrowser('')

		WebUI.navigateToUrl('https://www.amazon.com/')

		WebUI.click(findTestObject('TC_NEW_USER_003/Page_Amazon Registration/span_Hello, sign in'))

		WebUI.click(findTestObject('TC_NEW_USER_003/Page_Amazon Sign-In/a_Create your Amazon account'))

		WebUI.setText(findTestObject('TC_NEW_USER_003/Page_Amazon Registration/input_Your name_customerName'), 'chetan')

		WebUI.setText(findTestObject('TC_NEW_USER_003/Page_Amazon Registration/input_US 1_email'), 'websterw116@gmail.com')

		WebUI.setEncryptedText(findTestObject('TC_NEW_USER_003/Page_Amazon Registration/input_Password_password'), 'XlDD6hEp9tksKxA0fbP4Lw==')

		WebUI.setEncryptedText(findTestObject('TC_NEW_USER_003/Page_Amazon Registration/input_Re-enter password_passwordCheck'),
				'XlDD6hEp9tksKxA0fbP4Lw==')

		WebUI.click(findTestObject('TC_NEW_USER_003/Page_Amazon Registration/input_Passwords must match_continue'))

		WebUI.setText(findTestObject('TC_NEW_USER_003/Page_Authentication required/input_Enter OTP_code'), '5642')

		WebUI.click(findTestObject('TC_NEW_USER_003/Page_Authentication required/input_Please enter the verification code_a-button-input'))

		WebUI.closeBrowser()
	}
}
