# Test Task readme
## Stack
`Java/TestNG/Selenium/Maven` 
## Test run
To run all tests execute from command line mvn tests:
`mvn test` 
## Reporting
To generate report install allure: 
`brew install allure` 
And generate report after test run: 
`allure generate --single-file` 
## Test Cases
1. Verify that you are on attributes tab and it is active
2. Verify that user able to search for attribute 
3. Verify attributes metadata structure 
4. Verify that attribute can hold single piece of data such as a number(int and float)
5. Verify that attribute can hold single piece of data such as a String (string with combination of letters and nambers) Test data Attribute for automated tests: sys/custom_run_id
6. Verify that attribute can hold single piece of data such as a boolean variabile (true/false). Attribute for automated tests: sys/custom_run_id sys/experiment/is_head and sys/failed
7. Verify that the attribute sys/custom_run_id correctly stores a single value, such as a unique run identifier.
8. Verify that attribute can hold single piece of data such as date/time. Attribute for automated tests:  sys/creation_time
9. Verify that attribute can hold single piece of data such as time. Attribute for automated tests:   sys/running_time_seconds
10. Verify that attribute can hold series of numeric values (floats or integers). Attribute for automated tests: debug/activation/layer_0
11. Verify that series attributes can be represented as a chart. Attribute for automated tests: debug/activation/layer_0
12. Verify that attributee can have Tags. Attribute for automated tests: sys/tags
13. Verify that attributee can be a single file.Attribute for automated tests: config/parameters.json (I have selected this attribute because wasm't able to find attribute with file ideally we need to have all supported files in a list of test attributes)
14. Verify that attributee can be a siries of files. This case not covered in automated tests as I wasn't able to find test data ideally to have attribute with list of different types of files also need to understood what types of files are supported and what size of files supported alos for which files preview avalible and for which not
15. Verify that attributee can be histogram
16. Verify that debug/gradient_norm/histogram can correctly store a series of histogram data structures, which visualize the distribution of gradient norms.

    
## Note: 
Above test cases covering functionality which described for attributes but automated tests also covering some of visual verification that elements are represeted are in needed part of DOM tree and also you can manipulate them per UI, real number of asserts and scenarious are way more bigger but it's TT, above cases covering happy path and all of them related to smoke suite for attributes page.
## Non functional tests
Non functional tests are done using google lighthouse see scale.neptune.ai-20250812T094944.html 
