<!DOCTYPE html>
<html lang="en" xmlns:th="http://www.springframework.org/schema/data/jaxb">
<head>
    <meta charset="UTF-8">
    <title>Register</title>
    <link type="text/css" rel="stylesheet" href="../../static/css/register.css"/>
    <link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
    <SCRIPT LANGUAGE="JavaScript">

        function check(form) {
            pw1 = form.pw1.value;
            pw2 = form.pw2.value;

            if (pw1 != pw2) {
                alert ("\nYou did not enter the same new password twice. Please re-enter your password.")
                return false;
            }
            else return true;
        }
        // End -->
    </script>
</head>
<body>

<div class="col-3"></div>
<div class="container col-6">
    <div align="center" >
    <div class="w3-container w3-blue">
        <h2>Register</h2>
    </div>
    <form style="height:100px; width:500px;" class="w3-container">
        <p>
            <label>User name</label>
            <input id="username" class="w3-input" type="text"> </p>
        <p>
            <label>Password</label>
            <input id="password" class="w3-input" type="password"></p>
        <p>
            <label>Enter the Password</label>
            <input id="rppassword" class="w3-input" type="password"></p>
        <button  class="button" type="submit">Submit</button>
    </form>
    </div>
</div>
</body>
</html>