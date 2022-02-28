<%@page isELIgnored="false" %>

<html>
<head>
    <title>index</title>
        <style>
            #button1{
            width: 300px;
            height: 40px;
            float:left;
            margin-top:50px;
            margin-left:32%;
            border-radius:50px;
            border:none;
            font-size:18px;
            }

            #button2{
            width: 300px;
            height: 40px;
            float: left;
            margin-left:20px;
            margin-top:50px;
            border-radius:50px;
            border:none;
            font-size:18px;
            }
        </style>
</head>
<body style="background-color:teal">

<h1 style="text-align:center; color:white; margin-top:50px;margin-bottom:30px">Spring MVC</h1>
<hr>
<br>

<a href="signup" style="text-decoration:none;font-color:black;"><button id="button1">Add Employee</button></a>
<a href="viewemployee" style="text-decoration:none;font-color:black;"><button id="button2">View Employee</button></a>

</body>
</html>