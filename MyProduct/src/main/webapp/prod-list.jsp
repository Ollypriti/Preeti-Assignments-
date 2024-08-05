<%@ page language="java" contentType="text/html; charset=UTF-8"

    pageEncoding="UTF-8"%>

    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>

<html>

<head>

	<meta charset="UTF-8">

	<title>List of Product</title>

	<link rel="stylesheet" href="./assets/css/bootstrap.min.css">

	<link rel="stylesheet" href="./assets/css/bootstrap-theme.min.css">

</head>

<body>

	

	<div class="row">

		<div class="container">

		<h3>List of all Product</h3>

		<table class="table table-bordered">

			<thead>

				<tr>

					<th>ID</th>

					<th>Pname</th>

					<th>Bname</th>

					<th>Pquan</th>

					<th>Pdesc</th>
					<th>price</th>

					<th>Action</th>

				</tr>

			</thead>

			<tbody>

				<c:forEach var="prod" items="${prodList}">

					<tr>

						<td><c:out value="${prod.id}"/></td>

						<td><c:out value="${prod.pname}"/></td>

						<td><c:out value="${prod.bname}"/></td>

						<td><c:out value="${prod.pquan}"/></td>

						<td><c:out value="${prod.pdesc}"/></td>
						<td><c:out value="${prod.price}"></c:out></td>

						<td>

							<form action="delete" method="get">

								<input type="hidden" id="id" name="id" value="<c:out value= "${ prod.id}"/>" />

								<input type="submit" class="btn btn-danger" value="Delete"/>

							</form>

						</td>

					</tr>

				</c:forEach>

			</tbody>

		

		</table>

		

		</div>

	</div>

</body>

</html>