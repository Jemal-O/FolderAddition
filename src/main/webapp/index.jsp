<%@page contentType="text/html" pageEncoding="UTF-8"%>

<html>
<head>
<title>Folders with images</title>
</head>
<body>
	<center>
		<h1>Hello! Enter the path to the folder with photos</h1>
	</center>
	<br>
	<FORM action="ContServlet" method="POST">

		Write folder name: <input type="text" name="folder" />
		 				   <input type="submit" value="start upload" />

	</FORM>

</body>
</html>