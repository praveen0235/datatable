$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("D:/WorkSpace/WebTable/src/main/java/featureFile/ffile.feature");
formatter.feature({
  "line": 1,
  "name": "Table Testing",
  "description": "",
  "id": "table-testing",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Getting row count of a table",
  "description": "",
  "id": "table-testing;getting-row-count-of-a-table",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "navigate to the URL",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "find the number of rows",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "print it on console",
  "keyword": "And "
});
formatter.match({
  "location": "SDefinition.navigate_to_the_URL()"
});
formatter.result({
  "duration": 13268391566,
  "status": "passed"
});
formatter.match({
  "location": "SDefinition.find_the_number_of_rows()"
});
formatter.result({
  "duration": 625085,
  "error_message": "java.lang.NullPointerException\r\n\tat StepDefinition.SDefinition.find_the_number_of_rows(SDefinition.java:18)\r\n\tat ✽.Then find the number of rows(D:/WorkSpace/WebTable/src/main/java/featureFile/ffile.feature:6)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "SDefinition.print_it_on_console()"
});
formatter.result({
  "status": "skipped"
});
});