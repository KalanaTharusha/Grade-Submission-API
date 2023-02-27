# Grade Submission API - (Spring boot / MySQL)

## How to Use

### User

* #### Create User - Post Request
  &ensp; URL:
    ```{host:port}/user/register```\
  &ensp;Body:
    ```
      {
      "username": "{username}",
      "password": "{password}"
      }
    ```
* #### Authenticate User - Post Request
  &ensp; URL:
    ```{host:port}/authenticate```\
  &ensp;Body:
    ```
      {
      "username": "{username}",
      "password": "{password}"
      }
    ```
* #### Get User - Get Request
  &ensp; URL:
    ```{host:port}/user/{user id}``` with JWT Token

### Student

* #### Create Student - Post Request

  &ensp; URL:
    ```{host:port}/student```\
  &ensp;Body: &ensp;With JWT Token

    ```
      {
      "name": {student name},
      "birthDate": {student birthday}
      }
    ```

* #### Get Student - Get Request
   &ensp; URL:
    ```{host:port}/student/{student id}``` with JWT Token

* #### Get Students - Get Request
  &ensp; URL:
    ```{host:port}/student/all``` with JWT Token

* #### Delete Student - Delete Request
  &ensp; URL:
    ```{host:port}/student/{student id}``` with JWT Token

* #### Get Student Courses - Get Request
  &ensp; URL:
    ```{host:port}/student/{student id}/courses``` with JWT Token

### Grade

* #### Create Grade - Post Request

  &ensp; URL:
    ```{host:port}/grade/student/{student id}/course/{course id}```\
  &ensp;Body: &ensp;With JWT Token

    ```
      {
        "score": "A"
      }
    ```

* #### Update Grade - Put Request

  &ensp; URL:
    ```{host:port}/grade/student/{student id}/course/{course id}```\
  &ensp;Body: &ensp;With JWT Token

    ```
      {
        "score": "A+"
      }
    ```

* #### Get Grade - Get Request
  &ensp; URL:
    ```{host:port}/grade/student/{student id}/course/{course id}``` with JWT Token

* #### Get Grades - Get Request
  &ensp; URL:
    ```{host:port}/grade/all``` with JWT Token

* #### Delete Grade - Delete Request
  &ensp; URL:
    ```{host:port}/grade/student/{student id}/course/{course id}``` with JWT Token

* #### Get Student Grades - Get Request
  &ensp; URL:
    ```{host:port}/grade/student/{student id}``` with JWT Token
* #### Get Course Grades - Get Request
  &ensp; URL:
    ```{host:port}/grade/course/{course id}``` with JWT Token

### Course

* #### Create Course - Post Request

  &ensp; URL:
    ```{host:port}/course```\
  &ensp;Body: &ensp;With JWT Token

    ```
      {
        "subject": "Maths",
        "code": "MT123",
        "description": "In this class, you will learn algebra mathematical functions"
      }
    ```

* #### Enroll Student - Put Request

  &ensp; URL:
    ```{host:port}/course/{course id}/student/{student id}/``` with JWT Token

* #### Get Course - Get Request
  &ensp; URL:
    ```{host:port}/course/{course id}``` with JWT Token

* #### Get courses - Get Request
  &ensp; URL:
    ```{host:port}/course/all```\
  &ensp;Body: &ensp;With JWT Token

* #### Delete Grade - Delete Request
  &ensp; URL:
    ```{host:port}/course/{course id}``` with JWT Token

* #### Get Course Students - Get Request
  &ensp; URL:
    ```{host:port}/course/{course id}/students``` with JWT Token
