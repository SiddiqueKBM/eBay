$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("search.feature");
formatter.feature({
  "line": 2,
  "name": "Search Feature",
  "description": "In order to search item in search product\nas a user I need to be in Home Page",
  "id": "search-feature",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@FunctionalTest"
    }
  ]
});
formatter.scenarioOutline({
  "line": 6,
  "name": "Search Laptop",
  "description": "",
  "id": "search-feature;search-laptop",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 7,
  "name": "I am in Home Page",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "Enter product name \"\u003cProduct\u003e\" in search box",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "Click Search Button",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "Laptop items appear",
  "keyword": "Then "
});
formatter.examples({
  "line": 12,
  "name": "",
  "description": "",
  "id": "search-feature;search-laptop;",
  "rows": [
    {
      "cells": [
        "Product"
      ],
      "line": 13,
      "id": "search-feature;search-laptop;;1"
    },
    {
      "cells": [
        "Dell"
      ],
      "line": 14,
      "id": "search-feature;search-laptop;;2"
    },
    {
      "cells": [
        "Asus"
      ],
      "line": 15,
      "id": "search-feature;search-laptop;;3"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 5298910449,
  "status": "passed"
});
formatter.scenario({
  "line": 14,
  "name": "Search Laptop",
  "description": "",
  "id": "search-feature;search-laptop;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@FunctionalTest"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "I am in Home Page",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "Enter product name \"Dell\" in search box",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "Click Search Button",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "Laptop items appear",
  "keyword": "Then "
});
formatter.match({
  "location": "SearchSteps.i_am_in_Home_Page()"
});
formatter.result({
  "duration": 182860287,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Dell",
      "offset": 20
    }
  ],
  "location": "SearchSteps.enter_product_name_in_search_box(String)"
});
formatter.result({
  "duration": 3244603216,
  "status": "passed"
});
formatter.match({
  "location": "SearchSteps.click_Search_Button()"
});
formatter.result({
  "duration": 3049816742,
  "status": "passed"
});
formatter.match({
  "location": "SearchSteps.laptop_items_appear()"
});
formatter.result({
  "duration": 6576758088,
  "status": "passed"
});
formatter.after({
  "duration": 171467275,
  "status": "passed"
});
formatter.before({
  "duration": 4850754208,
  "status": "passed"
});
formatter.scenario({
  "line": 15,
  "name": "Search Laptop",
  "description": "",
  "id": "search-feature;search-laptop;;3",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@FunctionalTest"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "I am in Home Page",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "Enter product name \"Asus\" in search box",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "Click Search Button",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "Laptop items appear",
  "keyword": "Then "
});
formatter.match({
  "location": "SearchSteps.i_am_in_Home_Page()"
});
formatter.result({
  "duration": 3929463,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Asus",
      "offset": 20
    }
  ],
  "location": "SearchSteps.enter_product_name_in_search_box(String)"
});
formatter.result({
  "duration": 3639633645,
  "status": "passed"
});
formatter.match({
  "location": "SearchSteps.click_Search_Button()"
});
formatter.result({
  "duration": 2576114503,
  "status": "passed"
});
formatter.match({
  "location": "SearchSteps.laptop_items_appear()"
});
formatter.result({
  "duration": 5033938624,
  "status": "passed"
});
formatter.after({
  "duration": 140501406,
  "status": "passed"
});
});