<%@ page isELIgnored="false" %>
<html>
<body>

<h2 style="color: blue;">${msg}</h2>

<h3>Enrolled Student Details:</h3>
<p>
    ID: ${student.studentId} <br>
    Name: ${student.studentName} <br>
    Course: ${student.course} <br>
    Email: ${student.email} <br>
    Age: ${student.age}
</p>

<hr>
<a href="index.jsp">Enroll another student</a>

</body>
</html>