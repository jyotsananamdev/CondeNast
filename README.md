# CondeNast
#Proejct Details

src > test >

BaseTest : Create object of all pages in this class and extend this from every test class
UtilityMethods : All common methods like senKeys, click, select are here. Add new common methods here if required.
PreprocessorTest : This is where we are creating driver and closing driver also starting appium session here.

driver package :
>>impl package (Add IOS implementation here)

	>>> AndroidDriverProvider : Creating Adroid driver here with required desired capabilities.
  
>>AppiumSession: Starting and ending appium session here.
>>DriverProvider(Interface) : For driver creation
	
pages package : Add new pages under this package
>> CommonPage : All the web elements and functions related to Wired app are here.

tests package : Add new test classes here.
>> CommonTest : All the test cases related to app create in this class.

Supported Driver :
Android

Porject configurations and test data:
It is maven based and TestNG integrated project.
Go to testng.xml and add platform name

Project Execution :
'mvn clean install'

Project reporting
Go to targer/surefire-reports folder and open index.html, Extent.html in web browser.
