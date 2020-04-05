<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>

<head>
<title>Student Registration Form</title>
</head>
<body>

<form:form action="processForm"  modelAttribute="student">

First Name: <form:input path="firstName"/>

<br><br>

Last Name: <form:input path="lastName"/>

<form:select path="country">

<%-- <form:option value="Brazil" label="Brazil" />
<form:option value="France" label="France" />
<form:option value="Germany" label="Germany" />
<form:option value="India" label="India" />
 --%>
 <form:options items="${student.countryOptions}"/>
 
</form:select>

<br><br>

Java <form:radiobutton path="favoriteLanguage" value="Java"/>
dotNET <form:radiobutton path="favoriteLanguage" value="dotNET"/>
C# <form:radiobutton path="favoriteLanguage" value="C#"/>
PHP <form:radiobutton path="favoriteLanguage" value="PHP"/>

<br><br>

Linux <form:checkbox path="operatingSystems" value="Linux"/>
Mac <form:checkbox path="operatingSystems" value="Mac"/>
Windows <form:checkbox path="operatingSystems" value="Windows"/>

<br>
<br>

<input type="submit" value="Submit"/>

</form:form>

</body>


</html>