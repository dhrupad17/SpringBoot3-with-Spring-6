<%@page language="java" %>

<html>
    <head>
        <link rel="stylesheet" type="text/css" href="style.css">
    </head>
    </body>
        <h2>Addition Calculator</h2>

         <form action="add">
                <label for="num1">Enter 1st Number :</label>
                <input type="text" id=num1" name="num1"><br>
                <label for="num2">Enter 2nd Number :</label>
                <input type="text" id="num2" name="num2"><br>
                <input type="submit" value="Submit">
           </form>

           <form action="addUser">
                           <label for="uid">Enter Id :</label>
                           <input type="text" id="uid" name="uid"><br>
                           <label for="uname">Enter Name :</label>
                           <input type="text" id="uname" name="uname"><br>
                           <input type="submit" value="Submit">
             </form>

    </body>
</html>