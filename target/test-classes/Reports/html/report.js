$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/Features/airline.feature");
formatter.feature({
  "name": "To validate the Homepage Functionality",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@E2E"
    }
  ]
});
formatter.scenario({
  "name": "To validate the From and To credentials",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@E2E"
    },
    {
      "name": "@first"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "The user should be in airline login page",
  "keyword": "Given "
});
formatter.match({
  "location": "HomepageAirline.the_user_should_be_in_airline_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user has enter from and to location",
  "keyword": "When "
});
formatter.match({
  "location": "HomepageAirline.the_user_has_enter_from_and_to_location()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "to select a adult,child,infant details",
  "keyword": "And "
});
formatter.match({
  "location": "HomepageAirline.to_select_a_adult_child_infant_details()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "then click a search button",
  "keyword": "And "
});
formatter.match({
  "location": "HomepageAirline.then_click_a_search_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click date of departure",
  "keyword": "When "
});
formatter.match({
  "location": "HomepageAirline.click_date_of_departure()"
});
formatter.result({
  "error_message": "org.openqa.selenium.UnhandledAlertException: unexpected alert open: {Alert text : Book and buy transaction on internet booking less than 0 hours is not permissible on the system, you may contact our reservation and ticketing hot line (021) 34833940, (021) 34833942.}\n  (Session info: chrome\u003d107.0.5304.107): Book and buy transaction on internet booking less than 0 hours is not permissible on the system, you may contact our reservation and ticketing hot line (021) 34833940, (021) 34833942.\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027DESKTOP-418NQCC\u0027, ip: \u0027192.168.0.180\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_341\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 107.0.5304.107, chrome: {chromedriverVersion: 107.0.5304.62 (1eec40d3a576..., userDataDir: C:\\Users\\MANIMA~1\\AppData\\L...}, goog:chromeOptions: {debuggerAddress: localhost:56716}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:credBlob: true, webauthn:extension:largeBlob: true, webauthn:virtualAuthenticators: true}\nSession ID: 91f811cae2b30c87e9060bc4e505cbe3\n*** Element info: {Using\u003did, value\u003ddiv_flight_details}\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:120)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:323)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementById(RemoteWebDriver.java:372)\r\n\tat org.openqa.selenium.By$ById.findElement(By.java:188)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\r\n\tat org.stepdefinition.HomepageAirline.click_date_of_departure(HomepageAirline.java:96)\r\n\tat ✽.click date of departure(file:src/test/resources/Features/airline.feature:10)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "The user should be see a Flight list",
  "keyword": "Then "
});
formatter.match({
  "location": "HomepageAirline.the_user_should_be_see_a_Flight_list()"
});
formatter.result({
  "status": "skipped"
});
formatter.embedding("image/png", "embedded0.png", null);
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "To check our client details",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@E2E"
    },
    {
      "name": "@second"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "The user should be in airline page",
  "keyword": "Given "
});
formatter.match({
  "location": "HomepageAirline.the_user_should_be_in_airline_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "to click our branches button",
  "keyword": "When "
});
formatter.match({
  "location": "HomepageAirline.to_click_our_branches_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "to take screenshot on first page what we see",
  "keyword": "And "
});
formatter.match({
  "location": "HomepageAirline.to_take_screenshot_on_first_page_what_we_see()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "then scroll down then take another one screenshot",
  "keyword": "And "
});
formatter.match({
  "location": "HomepageAirline.then_scroll_down_then_take_another_one_screenshot()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "then click a close button",
  "keyword": "And "
});
formatter.match({
  "location": "HomepageAirline.then_click_a_close_button()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "to click and take airline pic",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@E2E"
    },
    {
      "name": "@third"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "to go airline page",
  "keyword": "Given "
});
formatter.match({
  "location": "HomepageAirline.to_go_airline_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "to click and take pic on that particular picture",
  "keyword": "When "
});
formatter.match({
  "location": "HomepageAirline.to_click_and_take_pic_on_that_particular_picture()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});