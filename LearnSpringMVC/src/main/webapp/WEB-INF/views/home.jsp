<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ page session="false" %>
<html>
<head>
	<title>Home</title>
</head>
<body>
<h1>Spring MVC internationalization</h1>
  Language :
  <a href="?language=en">English</a>|
  <a href="?language=vi_VN">Viet Nam</a>|
  <a href="?language=fr_FR">France</a>
  
  <h2>hello :  <spring:message code="hello" text="default text" /></h2>
  
  
  Current Locale : ${pageContext.response.locale}
  
  <h2>/Home hay /test(get))</h2>
  <a href="home">/home</a></br>
  <a href="test">/test (GET)</a></br>
  <form method="POST" action="test">
  	<button type="submit">/test (POST)</button>>
  </form>
</body>
</html>
