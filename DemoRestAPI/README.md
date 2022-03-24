# Assurity 
# Automate API testing 
Demo project to automate api testing using Java

Details:
  API = https://api.tmsandbox.co.nz/v1/Categories/6327/Details.json?catalogue=false

Acceptance Criteria:
  Test 1:
    The value of key(Name) is "Carbon credits"
  Test 2:
    The boolean value of CanRelist is true
  Test 3:
    The Promotions element with Name = "Gallery" has a Description that contains the text "Good position in category"

 
 Tools used:
  -Java 1.8
  -TestNG 7.5
  -RestAssured 4.5.1
 
 Project Structure:
 ![image](https://user-images.githubusercontent.com/20467623/159857796-a18c3216-c0c8-486c-ac1d-6eef06e90f5f.png)

 Console Output:
![image](https://user-images.githubusercontent.com/20467623/159858213-b7944e55-c26e-48b4-84b0-f358acfed2a9.png)

 TestNg reports are also created in test-output folder
![image](https://user-images.githubusercontent.com/20467623/159858880-c68593b4-bc21-4867-8393-db0300c51a50.png)


