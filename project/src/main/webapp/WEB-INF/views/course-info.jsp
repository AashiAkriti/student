<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<style>
* 
{
  box-sizing: border-box;
}
body{
    background-color:
}
input[type=text], select, textarea {
  width: 100%;
  padding: 12px;
  border: 1px solid #ccc;
  border-radius: 4px;
  resize: vertical;
}



input[type=date], select, textarea {
  width: 100%;
  padding: 12px;
  border: 1px solid #ccc;
  border-radius: 4px;
  resize: vertical;
}

label {
  padding: 12px 12px 12px 0;
  display: inline-block;
}

input[type=submit] {
  background-color: #4CAF50;
  color: white;
  padding: 12px 20px;
  border: none;
  border-radius: 4px;
  cursor: pointer;
  float: right;
}

input[type=submit]:hover {
  background-color: #45a049;
}

.container {
  border-radius: 5px;
  background-color: #eeeeee;
  padding: 20px;
}

.dh{
background-color: #4CAF50;
  color: white;
  padding: 12px 20px;
  border: none;
  border-radius: 4px;
  cursor: pointer;
  float: right;
}

.col-25 {
  float: left;
  width: 25%;
  margin-top: 6px;
}

.col-75 {
  float: left;
  width: 75%;
  margin-top: 6px;
}

/* Clear floats after the columns */
.row:after {
  content: "";
  display: table;
  clear: both;
}
.head{
    background-image: linear-gradient(rgb(228, 123, 3),rgb(219, 162, 6));
    padding: 2%;
    text-align: center;
    color:aliceblue;
}

/* Responsive layout - when the screen is less than 600px wide, make the two columns stack on top of each other instead of next to each other */
@media screen and (max-width: 600px) {
  .col-25, .col-75, input[type=submit] {
    width: 100%;
    margin-top: 0;
  }
}
</style>
</head>
<title>Course Registration</title>
</head>
<body>

<div class="head">
<h1>COURSE REGISTRATION PAGE</h1>
</div>

<div class="container">
   <form:form action="saveCourse" method="post" modelAttribute="course_reg">
  <form:hidden path="courseId"/>
    <div class="row">
      <div class="col-25">
        <label for="coursename">Course Name</label>
      </div>
      <div class="col-75">
        <form:input type="text" id="coursename" name="coursename" placeholder="Course Name.." path="courseName"/>
      </div>
    </div>

 
   <div class="row">
        <div class="col-25">
          <label for="streamname">Stream Name</label>
        </div>
        <div class="col-75">
          <form:input type="text" id="streamname" name="streamname" placeholder="Stream Name.." path="streamName"/>
        </div>
      </div> 

    <div class="row">
      <div class="col-25">
        <label for="courseduration">Course Duration</label>
      </div>
      <div class="col-75">
        <form:input type="text" id="courseduration" name="courseduration" placeholder="Course Duration.." path="courseDuration"/>
      </div>
    </div>
    <div class="row">
      <div class="col-25">
        <label for="coursefees">Course Fees</label>
      </div>
      <div class="col-75">
        <form:input type="text" id="coursefees" name="coursefees" placeholder="Course Fees.." path="courseFees"/>
      </div>
    </div>      <br>        
    <div class="dh"> <br>
       <center><form:button type="submit" value="Submit" onclick="myfun()">Submit</form:button></center>
    </div>
    <br>

    
 </form:form>
</div>
<script>
    function myfun(){
        confirm("Are you sure you want to proceed..");
    }
</script>

</body>
</html>