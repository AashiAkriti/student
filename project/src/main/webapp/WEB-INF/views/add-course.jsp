<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script> 
<title>Course Added</title>

<style>
* {
  box-sizing: border-box;
}
body{
    background-color:
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

/* Clear floats after the columns */
.row:after {
  content: "";
  display: table;
  clear: both;
}
.head{
    background-image:  linear-gradient(rgb(228, 123, 3),rgb(219, 162, 6));
    padding: 2%;
    text-align: center;
    color:aliceblue;
}
.hh{
background-color: #4CAF50;
  color: white;
  padding: 12px 20px;
  border: none;
  border-radius: 4px;
  cursor: pointer;
  float: right;
}
}
</style>

</head>
<body>

<div class="head">
<h1>COURSE REGISTRATION PAGE</h1>
</div>

<div class="container">
  <form:form action="add_Course" method="post" modelAttribute="course_add">
  
  <form:hidden path="courseId"/>
    <div class="row">
      <center>
        Course added successfully!!!<br><br>
        <img src="D:\Final Project\tik.png"/>
    </center>
    <div class="hh">
        <form:button type="submit" value="Submit">Add Course</form:button>
   </div>   
   
    </div>
   
</form:form>

</div>
</body>
</html>