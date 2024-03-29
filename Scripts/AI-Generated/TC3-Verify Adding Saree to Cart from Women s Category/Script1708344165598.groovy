import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(1920, 1080)	
}

'Step 1: Navigate to Page home'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/')

'Step 2: At Page home, click on hyperlink women'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/hyperlink_women'))

'Step 3: At Page home, click on hyperlink saree > navigate to Page category products'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/hyperlink_saree'))

'Step 4: At Page category products, click on hyperlink add to cart'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_category_products/hyperlink_add_to_cart'))

'Step 5: Add visual checkpoint at Page category products'

WebUI.takeFullPageScreenshotAsCheckpoint('TC3-Verify Adding Saree to Cart from Women s Category_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}
