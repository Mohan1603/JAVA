<!DOCTYPE html>
<html>

<head>
<title>Student Confirmation Form</title>
</head>
<body>

The student is confirmed: ${student.firstName} ${student.lastName}

<br><br>

Country: ${student.country}

<br><br>

FavoriteLanguage: ${student.favoriteLanguage}

<br>
<br>

OperatingSystems: 
<ul>

<c:forEach var="temp" items="${student.operatingSystems}">

<li>${temp}</li>

</c:forEach>

</ul>
</body>

</html>