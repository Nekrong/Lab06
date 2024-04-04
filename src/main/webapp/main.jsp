
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Student</title>
</head>
<body>
    <form action="students" method="GET">
        Фамилия: <input type="text" value="" name="lastName">
        <button type="submit">Submit</button>
    </form>
    <form action="assessment" method="GET">
            Оценка: <input type="text" value="" name="score">
            <button type="submit">Submit</button>
     </form>
</body>
</html>
