<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
  <title>employee Details</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
  
</head>
<body>

<nav class="navbar navbar-inverse">
  <div class="container-fluid">
    <ul class="nav navbar-nav">
      <li><a href="findAllEmp">employee Details</a></li>
      <li><a href="NewEmp">New employee</a></li>
    </ul>
  </div>
</nav>

<div class="container">


	<c:choose>
	<c:when test="${mode == 'EMP_VIEW' }">
		<h2>employee details</h2>
		  <table class="table">
		    <thead>
		      <tr>
		        <th>id</th>
		        <th>Name</th>
		        <th>Email id</th>
		        <th>Mobile</th>
		        <th>Address</th>
		        <th>Edit</th>
		        <th>Delete</th>
		      </tr>
		    </thead>
		    <tbody>
		     <c:forEach var = "emp" items="${ Empdetails }">
		         <tr>
		        <td>${emp.e_id}</td>
		        <td>${emp.e_name}</td>
		        <td>${emp.e_email}</td>
		        <td>${emp.e_mobile}</td>
		        <td>${emp.e_add}</td>
		        <td><a href="UpdateEmp?e_id=${emp.e_id }"><div class="glyphicon glyphicon-pencil"></div></a></td>
		        <td><a href="deleteEmp?e_id=${emp.e_id }"><div class="glyphicon glyphicon-trash"></div></a></td>
		      </tr>
		      </c:forEach>
		  </tbody>
	  	</table>
	</c:when>
	
	<c:when test="${mode == 'EMP_EDIT' || mode == 'EMP_NEW'}">
		<form action="Save" method="post">
			<input type="hidden" class="form-control" value="${Empdetail.e_id}" id="e_id" name="e_id">
		  <div class="form-group">
		    <label for="e_name">Name:</label>
		    <input type="text" class="form-control" value="${Empdetail.e_name }" id="e_name" name="e_name">
		  </div>
		  <div class="form-group">
		    <label for="e_mobile">Email id:</label>
		    <input type="text" class="form-control" value="${Empdetail.e_email}" id="e_email" name="e_email">
		  </div>
		  <div class="form-group">
		    <label for="e_mobile">Mobile number:</label>
		    <input type="text" class="form-control" value="${Empdetail.e_mobile}" id="e_mobile" name="e_mobile">
		  </div>
		  <div class="form-group">
		    <label for="e_add">Address:</label>
		    <input type="text" class="form-control" value="${Empdetail.e_add}" id="e_add" name="e_add">
		  </div>
		  <button type="submit" class="btn btn-default">Submit</button>
		</form>
	
	
	</c:when>
	
	</c:choose>
	  	    
  
</div>

</body>
</html>
