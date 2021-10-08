<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<%@include file="./base.jsp"  %>
</head>
<body>
	<div class ="container">
<form action ="${pageContext.request.contextPath }/handle-student" method ="post">
<h2>Change Student Datails</h2>
  <div class="form-row">
    <div class="form-group col-md-6">
      <label for="id">ID</label>
      <input type="text" name ="id"class="form-control" value="${student.id} ">
    </div>
  </div>
  <div class="form-row">
    <div class="form-group col-md-6">
      <label for="name">Name</label>
      <input type="text" name ="name"class="form-control" id="inputEmail4" placeholder="Name" value="${student.name} ">
    </div>
  </div>
  <div class="form-group">
    <label for="inputAddress">Address</label>
    <input type="text" name ="address"class="form-control" id="inputAddress" placeholder="1234 Main St" value="${student.address} ">
  </div>

  <div class="form-row">
    <div class="form-group col-md-6">
      <label for="grades">Grades</label>
      <input type="number" name ="grades"class="form-control" id="grades" value="${student.grades} ">
    </div>

    </div>

<a href ="${pageContext.request.contextPath}/" class="btn-btn-outline-danger">Back</a>
  <button type="submit" class="btn btn-primary">Update</button>
</form>
</div>
</body>
</html>