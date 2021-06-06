##### Test Automation task
 
**System under test:** https://www.intrum.lv
Intrum Latvia - Business web page for clients and customers from Latvia with all related information.
 
**Feature:** 
Contact form: https://www.intrum.lv/saistibu-parvaldisana/sazinieties-ar-mums/

**Limitations:**
Do not submit the form with correctly filled fields in order to avoid fake submission requests.
 
**Tips:**
Be focused on error validation, special forms, responsiveness of the page and particular form. Prepare a list of potential issues or improvements in your opinion.
 
**Create Test Automation solution from scratch. 
Solution should be based on project specific programming language(JAVA).**
 
**Acceptance criteria:**
●	Application code is structured.
●	Code is written according to best practices like: 
    o  	Clean and readable code.
    o	Design patterns.
    o	Configuration files.
    o	Page Objects.
    o	Behavior-Driven Development (BDD).
    o	Dependency Injection(Shared context).
    o	And others.
●	Feature scenario is short as possible and understandable for business. Feel free to use Cucumber or any other DSL.
●	Rights asserts that make sense applied.
●	Code is committed into GitHub and shared.
●	Data for form is taken from CSV file which should be parsed in POJO and used in Selenium tests. CSV file example in the next page
 
**Can be considered as a plus:**
●	Possibility to run the tests in parallel.
●	Containerize your solution with help of Docker or Kubernetes.
●	Introduce any other interesting approach within the project. Way of how to use specific libraries, writing code, scenario and etc.

**Csv File structure**
Name,surname,ssn,casenumber,phone,email,address,comment,reply
John,Doe,123123,5151412,1231321,adas@asdas.com,brivibas 1,3123121,e-mail
Jane,Doe,123123,5151412,1231321,adas@asdas.com,brivibas 1,3123121,post
