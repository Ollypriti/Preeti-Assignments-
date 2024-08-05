<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Register</title>
<link rel="stylesheet" href="./assets/css/bootstrap.min.css">
<link rel="stylesheet" href="./assets/css/bootstrap-theme.min.css">
</head>
<body>
	<div class="row">
	<div class="container">
	<h2>Add Product</h2>
	<h2>
	<a href="prod">Show All Product</a>
	<!-- <form action="studs" methods="post"
	<input type="submit" value="Show All Studs">
	</form>-->
	</h2>
	<form action="addProduct" method="post">
	<div class="form-group">
	<label for="fname">Product Name</label>
	<input type="text" id="pname" name="pname" placeholder="Productname" class="form-control">
	</div>
	<div class="form-group">
	<label for="fname">Product Brand Name</label>
	<input type="text" id="bname" name="bname" placeholder="ProductBrandName" class="form-control">
	</div>
	<div class="form-group">
	<label for="fname">Quantity</label>
	<input type="number" id="pquan" name="pquan" placeholder="Quantity"  class="form-control">
	</div>
	<div class="form-group">
	<label for="fname">Product Description</label>
	<input type="text" id="pdesc" name="pdesc" placeholder="ProductDescription"  class="form-control">
	</div>
	<div class="form-group">
	<label for="fname">Product Price</label>
	<input type="number" id="price" name="price" placeholder="ProductPrice" class="form-control">
	</div>
	<div class="form-group">
	<input type="submit"  class="btn btn-warning" value="Save">
	<button class="btn btn-warning"><a href= "update.jsp">Update</a></button>
	</div>
	</form>
	</div>
	</div>
</body>
</html>