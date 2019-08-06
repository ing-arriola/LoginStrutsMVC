<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<%@ taglib uri="/struts-tags" prefix="S"%>
<body>
 <S:form action="LoginJsp">
 
 	<S:textfield name="username"/>
 	
 	<S:submit value="LOG IN"></S:submit>
 	
 </S:form>
</body>
</html>