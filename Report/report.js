$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/Sampleprj.feature");
formatter.feature({
  "name": "To validate then signin functionality of amazon aplication",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@Feature1"
    }
  ]
});
formatter.scenario({
  "name": "To valid mobile number",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Feature1"
    }
  ]
});
formatter.step({
  "name": "To launch the chrome browser and maximize window",
  "keyword": "Given "
});
formatter.match({
  "location": "Amazonsignin.to_launch_the_chrome_browser_and_maximize_window()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To launch the url of the amazon application",
  "keyword": "When "
});
formatter.match({
  "location": "Amazonsignin.to_launch_the_url_of_the_amazon_application()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To pass valid email or mobile number in email field",
  "keyword": "And "
});
formatter.match({
  "location": "Amazonsignin.to_pass_valid_email_or_mobile_number_in_email_field()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To click the continue button",
  "keyword": "And "
});
formatter.match({
  "location": "Amazonsignin.to_click_the_continue_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To check wheather navigate to the home page or not",
  "keyword": "And "
});
formatter.match({
  "location": "Amazonsignin.to_check_wheather_navigate_to_the_home_page_or_not()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To close the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "Amazonsignin.to_close_the_browser()"
});
formatter.result({
  "status": "passed"
});
});