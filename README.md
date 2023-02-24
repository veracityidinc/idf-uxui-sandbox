idFusion™ UX/UI Sandbox
=======================
MVP client web application exposing a small set of features in order to provide the means for the UX/UI developer/designer peers collaboration.

This sample is to be extended in the future on a daily/weekly/monthly basis.

Building, Running and Packaging
-------------------------------
This project has be created using **gwt-maven-plugin 2.10.0 archetype** and it is **primarily a [Maven](https://maven.apache.org/) project**. 

The `pom.xml` file covers the following aspects(for now):

1. **Profile management**

2. **Dependencies**

3. **Java compilation**

4. **gulp configuration**; e.g. `compile-scss` task needs @designer's attention if he/she decides to go with a different post-processed superset

5. **GWT setup, compilation**


Development, setup and run
-----------------------------------
Execute `./run-devmode.sh` OR run in a terminal `mvn gwt:run`


Current business logic
----------------------
 - The header of the default screen contains a search container which is used to filter the data collection below.
 - Upon load, the collection of person items is being rendered in `grid view` mode as per default
 - In the grid/table header you will notice a button labeled `Switch View Mode`. Clicking it will toggle between the 2, for now, possible view modes: `grid view` and `table view`
 - You will also notice another button: `Reset` - which when clicked will reset the data in the grid/table to its default range; e.g. 0/first
 - Each item in the collection will contain both: static and action data
 - The footer container holds the `Fetch more...` button, which when clicked will load the next range of data items

To be extended...

Requirements @designer (UX/UI developer)
----------------------------------------
Implement a clean, smooth, cool, great looking, responsive, user-friendly, impressive design (consider both containers: filter and data). 

sass/scss has already been configured in the project - `/idf-uxui-sandbox/src/main/webapp/style/sandbox.scss`, but you may also use less, GSS or any other...in which case you need to change existing gulp/maven pre-setup. 

Feel free to make changes in the structure, e.g. HTML, if you consider you'll obtain a better looking result. If you have problems do not hesitate to get in contact.

Feel free to come up with proposals.

Optional: In the code, search for `@designer` annotations to see comments referring you.

The rest is up to you...


Proposed workflow @designer (UX/UI developer)
---------------------------------------------

1. Fork the project on your own repository (the current repo is to be seen as the template)
2. Push it right after (this is important because it will be easier for us to track your changes)
3. Send us a link with your repository either when you are done or as soon as you make the first push, so we can see it as it's being developed (you decide).
4. Good luck!
