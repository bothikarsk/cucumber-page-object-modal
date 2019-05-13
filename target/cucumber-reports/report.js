$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("CRMLogIn.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#mvn -Dcucumber.options\u003d\"--tags @All\" clean test"
    }
  ],
  "line": 3,
  "name": "Free CRM Application Test",
  "description": "",
  "id": "free-crm-application-test",
  "keyword": "Feature",
  "tags": [
    {
      "line": 2,
      "name": "@All"
    }
  ]
});
formatter.before({
  "duration": 6256051733,
  "status": "passed"
});
formatter.scenario({
  "line": 6,
  "name": "Validate free crm home page test1",
  "description": "",
  "id": "free-crm-application-test;validate-free-crm-home-page-test1",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 5,
      "name": "@US232454_T43555"
    }
  ]
});
formatter.step({
  "line": 8,
  "name": "User opens browser",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "user on home page",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "user log in",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "user log out",
  "keyword": "Then "
});
formatter.match({
  "location": "CommonSteps.User_opens_browser()"
});
formatter.result({
  "duration": 3530593983,
  "status": "passed"
});
formatter.match({
  "location": "CommonSteps.user_on_home_page()"
});
formatter.result({
  "duration": 8066871256,
  "status": "passed"
});
formatter.match({
  "location": "CommonSteps.user_log_in()"
});
formatter.result({
  "duration": 628067388,
  "status": "passed"
});
formatter.match({
  "location": "CommonSteps.user_log_out()"
});
formatter.result({
  "duration": 2188105587,
  "status": "passed"
});
formatter.after({
  "duration": 1476733830,
  "status": "passed"
});
});