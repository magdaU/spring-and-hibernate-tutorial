<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html>

<head>
<title>Magdau Company Home Page</title>
<body>
	<h2>Magdau Company Home Page</h2>
	<hr>

	<p>Welcome to the MagdaU company home page!-Yohoo-Silly Goose!</p>

	<!--Add a layout button -->
	<form:form action="${pageContext.request.contextPath}/logout"
		method="POST">
		
		<input type="submit" value="Logout">

	</form:form>

</body>
</head>

</html>