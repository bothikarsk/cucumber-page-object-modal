$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("CRMLogIn.feature");
formatter.feature({
  "line": 1,
  "name": "Free CRM Application Test",
  "description": "",
  "id": "free-crm-application-test",
  "keyword": "Feature"
});
formatter.before({
  "duration": 5948868591,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "Validate free crm home page test1",
  "description": "",
  "id": "free-crm-application-test;validate-free-crm-home-page-test1",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@US232454_T43555"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "User opens browser",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "user on home page",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "user log in",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "user log out",
  "keyword": "Then "
});
formatter.match({
  "location": "CommonSteps.User_opens_browser()"
});
formatter.result({
  "duration": 3048530495,
  "status": "passed"
});
formatter.match({
  "location": "CommonSteps.user_on_home_page()"
});
formatter.result({
  "duration": 6598615241,
  "status": "passed"
});
formatter.match({
  "location": "CommonSteps.user_log_in()"
});
formatter.result({
  "duration": 917980926,
  "status": "passed"
});
formatter.match({
  "location": "CommonSteps.user_log_out()"
});
formatter.result({
  "duration": 4056739120,
  "status": "passed"
});
formatter.after({
  "duration": 1820264924,
  "status": "passed"
});
});