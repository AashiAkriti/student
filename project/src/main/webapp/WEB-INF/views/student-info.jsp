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
<title>Student Registration Page</title>
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

input[type=password], input[type=email], select, textarea {
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

.dh{
background-color: #4CAF50;
  color: white;
  padding: 12px 20px;
  border: none;
  border-radius: 4px;
  cursor: pointer;
  float: right;
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
    background-image: linear-gradient(rgb(4, 49, 80),rgb(95, 180, 253));
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
<body>

<div class="head">
<h1>STUDENT REGISTRATION PAGE</h1>
</div>

<div class="container">
  <form:form action="saveStudent" method="post" modelAttribute="student_reg">
  <form:hidden path="id"/>
    <div class="row">
      <div class="col-25">
        <label for="firstname">First Name</label>
      </div>
      <div class="col-75">
        <form:input type="text" id="firstname" name="firstname" placeholder="First name.." path="firstName"/>
      </div>
    </div>
    <div class="row">
      <div class="col-25">
        <label for="lastname">Last Name</label>
      </div>
      <div class="col-75">
        <form:input type="text" id="lastname" name="lastname" placeholder="Last name.." path="lastName"/>
      </div>
    </div>
    <div class="row">
      <div class="col-25">
        <label for="password">Password</label>
      </div>
      <div class="col-75">
        <form:input type="password" id="password" name="password" placeholder="Password.." minlength="6" path="password"/>
      </div>
    </div>
    <div class="row">
      <div class="col-25">
        <label for="emailid">Email ID</label>
      </div>
      <div class="col-75">
        <form:input type="email" id="emailid" name="emailid" placeholder="Email ID.." path="email"/>
      </div>
    </div>
    <div class="row">
        <div class="col-25">
              <label for="contact">Contact Number</label>
        </div>
        <div class="col-75">
          <form:input type="text" id="contact" name="contact" pattern="[0-9]{10}" placeholder="Contact Number.." path="contact"/>
        </div>
    </div>
          <div class="row">
                <div class="col-25">
                  <label for="date">Registration Date</label>
                </div>
                <div class="col-75">
                  <form:input type="date" id="date" name="date" placeholder="Registration Date.." path="date"/>
                </div>
              </div>  
              <div class="row">
                    <div class="col-25">
                      <label for="guardian">Guardian Name</label>
                    </div>
                    <div class="col-75">
                      <form:input type="text" id="guardian" name="guardian" placeholder="Guardian Name.." path="guardian"/>
                    </div>
                  </div>    
                  <div class="row">
                        <div class="col-25">
                          <label for="payment">Mode Of Payment</label>
                        </div>
                        <div class="col-75">
                                <form:select id="payment" name="payment" path="payment">
                                        <option value="select">Select One</option>
                                        <option value="online">Online Payment</option>
                                        <option value="dd">Demand Draft</option>
                                        <option value="cash">Cash</option>
                                      </form:select>
                        </div>
                      </div>      <br>        
    <div class="dh">
      <center><form:button type="submit" value="Submit" onclick="myfun()">Submit</form:button></center>
     
    </div>
  </form:form>
</div>
<script>
    function myfun(){
        confirm("Are you sure you want to proceed..");
    }
</script>

</body>
</html>