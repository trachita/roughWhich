$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("TelevisionAutopopulateSearch.feature");
formatter.feature({
  "line": 2,
  "name": "Verify Autopopulate in search functionality",
  "description": "",
  "id": "verify-autopopulate-in-search-functionality",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@Search"
    }
  ]
});
formatter.before({
  "duration": 4373974933,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "Autopopulate search functionality verification",
  "description": "",
  "id": "verify-autopopulate-in-search-functionality;autopopulate-search-functionality-verification",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "I am on  Television Page_ \"https://www.which.co.uk/reviews/televisions\"",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I go to search button",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "I enter \"panasonic\"",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "I should be able to select \"panasonic tv\" from autopolulated list",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "It Should diaplay search result of  \"panasonic tv\" on search page",
  "keyword": "And "
});
formatter.match({
  "arguments": [
    {
      "val": "https://www.which.co.uk/reviews/televisions",
      "offset": 27
    }
  ],
  "location": "TelevisionAutopopulateSearchSteps.i_am_on_Television_Page_(String)"
});
formatter.result({
  "duration": 19562072871,
  "status": "passed"
});
formatter.match({
  "location": "TelevisionAutopopulateSearchSteps.i_go_to_search_button()"
});
formatter.result({
  "duration": 230981339,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "panasonic",
      "offset": 9
    }
  ],
  "location": "TelevisionAutopopulateSearchSteps.i_enter(String)"
});
formatter.result({
  "duration": 457871230,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "panasonic tv",
      "offset": 28
    }
  ],
  "location": "TelevisionAutopopulateSearchSteps.i_should_be_able_to_select_from_autopolulated_list(String)"
});
formatter.result({
  "duration": 1088963957,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "panasonic tv",
      "offset": 37
    }
  ],
  "location": "TelevisionAutopopulateSearchSteps.it_Should_diaplay_search_result_of_on_search_page(String)"
});
formatter.result({
  "duration": 4438645635,
  "status": "passed"
});
formatter.after({
  "duration": 3127646683,
  "status": "passed"
});
formatter.uri("TelevisionLandingPageVerification.feature");
formatter.feature({
  "line": 2,
  "name": "Television page test",
  "description": "",
  "id": "television-page-test",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@TvLandingScreen"
    }
  ]
});
formatter.before({
  "duration": 3683722330,
  "status": "passed"
});
formatter.background({
  "line": 4,
  "name": "Launching Which Television page",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "I am on Television Page \"https://www.which.co.uk/reviews/televisions\"",
  "keyword": "Given "
});
formatter.match({
  "arguments": [
    {
      "val": "https://www.which.co.uk/reviews/televisions",
      "offset": 25
    }
  ],
  "location": "TelevisionAllTabSteps.i_am_on_Television_Page(String)"
});
formatter.result({
  "duration": 14951391303,
  "status": "passed"
});
formatter.scenario({
  "line": 7,
  "name": "Validate if telvision landing Page is launching fine",
  "description": "",
  "id": "television-page-test;validate-if-telvision-landing-page-is-launching-fine",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "comments": [
    {
      "line": 8,
      "value": "#Given I launch \"https://www.which.co.uk/reviews/televisions\" of Which website"
    }
  ],
  "line": 9,
  "name": "I am on television page",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "\"All Televisions\" All television  tab should be selected",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "\"TV \u0026 home entertainment\" TV \u0026 home Entertainment option should be selected",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "\"Best Buys (57)\"Best Buys tab should be available on the page",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "\"Don\u0027t Buys (22)\" Dont Buys tab should be available on the page",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "\"Advice Guides (20)\" Advice Guides tab should be available on the page",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "Page title should be \"Television reviews - Which?\"",
  "keyword": "And "
});
formatter.match({
  "location": "TelevisionLandingPageSteps.i_am_on_television_page()"
});
formatter.result({
  "duration": 318578,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "All Televisions",
      "offset": 1
    }
  ],
  "location": "TelevisionLandingPageSteps.all_television_tab_should_be_selected(String)"
});
formatter.result({
  "duration": 101645056,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "TV \u0026 home entertainment",
      "offset": 1
    }
  ],
  "location": "TelevisionLandingPageSteps.tv_home_Entertainment_option_should_be_selected(String)"
});
formatter.result({
  "duration": 111953319,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Best Buys (57)",
      "offset": 1
    }
  ],
  "location": "TelevisionLandingPageSteps.best_Buys_tab_should_be_available_on_the_page(String)"
});
formatter.result({
  "duration": 142655675,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Don\u0027t Buys (22)",
      "offset": 1
    }
  ],
  "location": "TelevisionLandingPageSteps.dont_Buys_tab_should_be_available_on_the_page(String)"
});
formatter.result({
  "duration": 130707305,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Advice Guides (20)",
      "offset": 1
    }
  ],
  "location": "TelevisionLandingPageSteps.advice_Guides_tab_should_be_available_on_the_page(String)"
});
formatter.result({
  "duration": 77710201,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Television reviews - Which?",
      "offset": 22
    }
  ],
  "location": "TelevisionLandingPageSteps.page_title_should_be(String)"
});
formatter.result({
  "duration": 14433276,
  "status": "passed"
});
formatter.after({
  "duration": 3329282466,
  "status": "passed"
});
formatter.before({
  "duration": 3643916616,
  "status": "passed"
});
formatter.background({
  "line": 4,
  "name": "Launching Which Television page",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "I am on Television Page \"https://www.which.co.uk/reviews/televisions\"",
  "keyword": "Given "
});
formatter.match({
  "arguments": [
    {
      "val": "https://www.which.co.uk/reviews/televisions",
      "offset": 25
    }
  ],
  "location": "TelevisionAllTabSteps.i_am_on_Television_Page(String)"
});
formatter.result({
  "duration": 15466072329,
  "status": "passed"
});
formatter.scenario({
  "line": 17,
  "name": "Validate the Counts on the Television Page",
  "description": "",
  "id": "television-page-test;validate-the-counts-on-the-television-page",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "comments": [
    {
      "line": 18,
      "value": "#Given I am on Television Page \"https://www.which.co.uk/reviews/televisions\""
    }
  ],
  "line": 19,
  "name": "Header Label Count should match the no of items displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "TelevisionAllTabSteps.header_Label_Count_should_match_the_no_of_items_displayed()"
});
formatter.result({
  "duration": 29011964299,
  "status": "passed"
});
formatter.after({
  "duration": 3375316942,
  "status": "passed"
});
formatter.before({
  "duration": 3542669784,
  "status": "passed"
});
formatter.background({
  "line": 4,
  "name": "Launching Which Television page",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "I am on Television Page \"https://www.which.co.uk/reviews/televisions\"",
  "keyword": "Given "
});
formatter.match({
  "arguments": [
    {
      "val": "https://www.which.co.uk/reviews/televisions",
      "offset": 25
    }
  ],
  "location": "TelevisionAllTabSteps.i_am_on_Television_Page(String)"
});
formatter.result({
  "duration": 16031590391,
  "status": "passed"
});
formatter.scenario({
  "line": 21,
  "name": "Single Filter Functionality of the Television Page",
  "description": "",
  "id": "television-page-test;single-filter-functionality-of-the-television-page",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "comments": [
    {
      "line": 22,
      "value": "#Given I am on the Television Page \"https://www.which.co.uk/reviews/televisions\""
    }
  ],
  "line": 23,
  "name": "I select filter Category Screen Size and value \"20-28\"",
  "keyword": "When "
});
formatter.step({
  "line": 24,
  "name": "no of items in the filter \"20-28\"  should match no of items on the page",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "20-28",
      "offset": 48
    }
  ],
  "location": "TelevisionAllTabSteps.i_select_filter_Category_and_value(String)"
});
formatter.result({
  "duration": 10414162940,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "20-28",
      "offset": 27
    }
  ],
  "location": "TelevisionAllTabSteps.no_of_items_in_the_filter_should_match_no_of_items_on_the_page(String)"
});
formatter.result({
  "duration": 329549275,
  "status": "passed"
});
formatter.after({
  "duration": 1020531194,
  "status": "passed"
});
formatter.before({
  "duration": 3592466321,
  "status": "passed"
});
formatter.background({
  "line": 4,
  "name": "Launching Which Television page",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "I am on Television Page \"https://www.which.co.uk/reviews/televisions\"",
  "keyword": "Given "
});
formatter.match({
  "arguments": [
    {
      "val": "https://www.which.co.uk/reviews/televisions",
      "offset": 25
    }
  ],
  "location": "TelevisionAllTabSteps.i_am_on_Television_Page(String)"
});
formatter.result({
  "duration": 15174019080,
  "status": "passed"
});
formatter.scenario({
  "line": 27,
  "name": "Consecutive Filter Functionality of the Television Page",
  "description": "",
  "id": "television-page-test;consecutive-filter-functionality-of-the-television-page",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "comments": [
    {
      "line": 28,
      "value": "#Given I am on the Television Page \"https://www.which.co.uk/reviews/televisions\""
    }
  ],
  "line": 29,
  "name": "I select filter Category Screen Size and value \"20-28\"",
  "keyword": "When "
});
formatter.step({
  "line": 30,
  "name": "no of items in the filter \"20-28\"  should match no of items on the page",
  "keyword": "Then "
});
formatter.step({
  "line": 31,
  "name": "I Clear Filter Category",
  "keyword": "When "
});
formatter.step({
  "line": 32,
  "name": "I select filter Category Screen Size and value \"32-34\"",
  "keyword": "And "
});
formatter.step({
  "line": 33,
  "name": "no of items in the filter \"32-34\"  should match no of items on the page",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "20-28",
      "offset": 48
    }
  ],
  "location": "TelevisionAllTabSteps.i_select_filter_Category_and_value(String)"
});
formatter.result({
  "duration": 10512623357,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "20-28",
      "offset": 27
    }
  ],
  "location": "TelevisionAllTabSteps.no_of_items_in_the_filter_should_match_no_of_items_on_the_page(String)"
});
formatter.result({
  "duration": 273624100,
  "status": "passed"
});
formatter.match({
  "location": "TelevisionAllTabSteps.i_clear_filter_Category()"
});
formatter.result({
  "duration": 10246149619,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "32-34",
      "offset": 48
    }
  ],
  "location": "TelevisionAllTabSteps.i_select_filter_Category_and_value(String)"
});
formatter.result({
  "duration": 10645812154,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "32-34",
      "offset": 27
    }
  ],
  "location": "TelevisionAllTabSteps.no_of_items_in_the_filter_should_match_no_of_items_on_the_page(String)"
});
formatter.result({
  "duration": 273529664,
  "status": "passed"
});
formatter.after({
  "duration": 1201152227,
  "status": "passed"
});
formatter.before({
  "duration": 3504178204,
  "status": "passed"
});
formatter.background({
  "line": 4,
  "name": "Launching Which Television page",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "I am on Television Page \"https://www.which.co.uk/reviews/televisions\"",
  "keyword": "Given "
});
formatter.match({
  "arguments": [
    {
      "val": "https://www.which.co.uk/reviews/televisions",
      "offset": 25
    }
  ],
  "location": "TelevisionAllTabSteps.i_am_on_Television_Page(String)"
});
formatter.result({
  "duration": 17927467256,
  "status": "passed"
});
formatter.scenario({
  "line": 35,
  "name": "Multiple Filter Functionality of the Television Page",
  "description": "",
  "id": "television-page-test;multiple-filter-functionality-of-the-television-page",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "comments": [
    {
      "line": 36,
      "value": "#Given I am on the Television Page \"https://www.which.co.uk/reviews/televisions\""
    }
  ],
  "line": 37,
  "name": "I select following filter Category",
  "rows": [
    {
      "cells": [
        "20-28"
      ],
      "line": 38
    },
    {
      "cells": [
        "32-34"
      ],
      "line": 39
    },
    {
      "cells": [
        "55-60"
      ],
      "line": 40
    }
  ],
  "keyword": "When "
});
formatter.step({
  "line": 41,
  "name": "No of items in the filters should match no of items in the page",
  "rows": [
    {
      "cells": [
        "20-28"
      ],
      "line": 42
    },
    {
      "cells": [
        "32-34"
      ],
      "line": 43
    },
    {
      "cells": [
        "55-60"
      ],
      "line": 44
    }
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "TelevisionAllTabSteps.i_select_multiple_filters(DataTable)"
});
formatter.result({
  "duration": 31039281767,
  "status": "passed"
});
formatter.match({
  "location": "TelevisionAllTabSteps.no_of_items_filters_should_match_no_of_items_in_page(DataTable)"
});
formatter.result({
  "duration": 475998869,
  "status": "passed"
});
formatter.after({
  "duration": 1101687722,
  "status": "passed"
});
formatter.before({
  "duration": 3471297004,
  "status": "passed"
});
formatter.background({
  "line": 4,
  "name": "Launching Which Television page",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "I am on Television Page \"https://www.which.co.uk/reviews/televisions\"",
  "keyword": "Given "
});
formatter.match({
  "arguments": [
    {
      "val": "https://www.which.co.uk/reviews/televisions",
      "offset": 25
    }
  ],
  "location": "TelevisionAllTabSteps.i_am_on_Television_Page(String)"
});
formatter.result({
  "duration": 15944487838,
  "status": "passed"
});
formatter.scenario({
  "line": 46,
  "name": "Sort Functionality of the Television Page",
  "description": "",
  "id": "television-page-test;sort-functionality-of-the-television-page",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "comments": [
    {
      "line": 47,
      "value": "#Given I am on television page \"https://www.which.co.uk/reviews/televisions\""
    }
  ],
  "line": 48,
  "name": "I select Price (low to high)",
  "keyword": "When "
});
formatter.step({
  "line": 49,
  "name": "All television should display in ascending price order",
  "keyword": "Then "
});
formatter.match({
  "location": "TelevisionAllTabSteps.i_select_Price_low_to_high()"
});
formatter.result({
  "duration": 29559916214,
  "status": "passed"
});
formatter.match({
  "location": "TelevisionAllTabSteps.all_television_should_display_in_ascending_price_order()"
});
formatter.result({
  "duration": 1565013,
  "status": "passed"
});
formatter.after({
  "duration": 1250571591,
  "status": "passed"
});
formatter.before({
  "duration": 3526495708,
  "status": "passed"
});
formatter.background({
  "line": 4,
  "name": "Launching Which Television page",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "I am on Television Page \"https://www.which.co.uk/reviews/televisions\"",
  "keyword": "Given "
});
formatter.match({
  "arguments": [
    {
      "val": "https://www.which.co.uk/reviews/televisions",
      "offset": 25
    }
  ],
  "location": "TelevisionAllTabSteps.i_am_on_Television_Page(String)"
});
formatter.result({
  "duration": 7704074893,
  "status": "passed"
});
formatter.scenario({
  "line": 51,
  "name": "Member Options availability",
  "description": "",
  "id": "television-page-test;member-options-availability",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "comments": [
    {
      "line": 52,
      "value": "#Given I am on the Television Page_ \"https://www.which.co.uk/reviews/televisions\""
    }
  ],
  "line": 53,
  "name": "I am not Logged in",
  "keyword": "And "
});
formatter.step({
  "line": 54,
  "name": "Member options should be disabled",
  "keyword": "Then "
});
formatter.match({
  "location": "TelevisionAllTabSteps.i_am_not_Logged_in()"
});
formatter.result({
  "duration": 138191605,
  "status": "passed"
});
formatter.match({
  "location": "TelevisionAllTabSteps.member_options_should_be_disabled()"
});
formatter.result({
  "duration": 90191050,
  "status": "passed"
});
formatter.after({
  "duration": 1151932544,
  "status": "passed"
});
});