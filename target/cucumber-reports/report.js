$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("./src/test/resources/features/CRMLogIn.feature");
formatter.feature({
  "name": "Free CRM Application Test",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Validate free crm home page test1",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@US232454_T43555"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User opens browser",
  "keyword": "Given "
});
formatter.match({
  "location": "CommonSteps.User_opens_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user on home page",
  "keyword": "Then "
});
formatter.match({
  "location": "CommonSteps.user_on_home_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user log in",
  "keyword": "Then "
});
formatter.match({
  "location": "CommonSteps.user_log_in()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user log out",
  "keyword": "Then "
});
formatter.match({
  "location": "CommonSteps.user_log_out()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Validate free crm home page test2",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@US232454_T43556"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User opens browser",
  "keyword": "Given "
});
formatter.match({
  "location": "CommonSteps.User_opens_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user on home page",
  "keyword": "Then "
});
formatter.match({
  "location": "CommonSteps.user_on_home_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user log in",
  "keyword": "Then "
});
formatter.match({
  "location": "CommonSteps.user_log_in()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user log out",
  "keyword": "Then "
});
formatter.match({
  "location": "CommonSteps.user_log_out()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});