<html>
<head>
    <title>Student Enrollment</title>
</head>
<body>
<h2>Student Enrollment Form</h2>

<form action="enroll" method="post">
    <input type="number" placeholder="Student ID" name="studentId" required><br><br>
    <input type="text" placeholder="Full Name" name="studentName" required><br><br>
    <input type="text" placeholder="Course Name" name="course" required><br><br>
    <input type="email" placeholder="Email Address" name="email" required><br><br>
    <input type="number" placeholder="Age" name="age" required><br><br>

    <button type="submit">Enroll Now</button>
</form>

</body>
</html>