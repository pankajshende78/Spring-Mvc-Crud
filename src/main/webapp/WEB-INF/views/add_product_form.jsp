<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<%@ page isELIgnored="false"%>
<%@include file="./base.jsp"%>

</head>
<body>
	<div class="row">
		<div class="col-md-6 offset-md-3">
			<h1 class="text-center mb-3">Fill The Product Detail</h1>
			<form action="handle-product" method="post">

				<div class="form-group">
					<label for="name">Product Name</label><input type="text"
						class="form-control" id="name" aria-describedbr="emailHelp"
						name="name" placeholder="Enter The Product name here">
				</div>

				<div class="form-group">
					<label for="description">Product Description</label>
					<textarea placeholder="Enter The Product description"
						class="form-control" id="description" name="Discription" rows="5"> </textarea>
				</div>
				
				<div class="form-group">
					<label for="price">Product Price</label><input type="text"
						class="form-control" id="price" 
						name="price" placeholder="Enter The Product Price">
				</div>
				
				<div class="container text-center">
				
				<a href="${pageContext.request.contextPath }/" class="btn btn-outline-danger">Back</a>
				
					<button type="submit" class="btn btn-primary">Add</button>
				</div>
				
	</form>

		</div>
	</div>
	pankaj
</body>
</html>