<html>
<head>
<%@include file="./base.jsp"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

</head>
<body>
	<div class="container mt-3">
		<div class="row">
			<div class="col-md-12">
				<h1 class="text-center mb-3">Welcome...</h1>
				<table class="table table-dark">
					<thead>
						<tr>
							<th scope="col">ID</th>
							<th scope="col">Student Name</th>
							<th scope="col">Address</th>
							<th scope="col">Grades</th>
							<th scope="col">Action</th>
						</tr>
					</thead>
					<tbody>
						<c:forEach items="${students }" var="s">
							<tr>
								<th scope="row">${s.id}</th>
								<td>${s.name}</td>
								<td>${s.address}</td>
								<td>${s.grades}&#37</td>
								<td>
								<a href="delete/${ s.id}"><i class="fas fa-trash text-danger"></i></a>
								<a href="update/${ s.id}"><i class="fas fa-edit"></i></a>
								</td>
							</tr>
						</c:forEach>


					</tbody>
				</table>
				<div class="container text-center">
					<a href="add-student" class="btn btn-outline-success">Add
						Student</a>
				</div>
			</div>
		</div>
	</div>
</body>
</html>
