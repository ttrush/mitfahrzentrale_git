<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>
 
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Change Form</title>
<link rel="stylesheet" href="style.css"> 		<!-- Hier wird auf die betreffende CSS Bezug genommen -->
</head>
<body>

<div class="directoryPanelList">
<div class="ChangeData">
	<h1><center>Daten ändern</center></h1>
    <form action="change" method="post">
        <table cellpadding="3pt">
            <tr>
				<td>Vorname</td>
                <td><input type="text" name="userSurname" size="30" /></td>
            </tr>
                <tr>
                <td>Familienname</td>
                <td><input type="text" name="userFamilyname" size="30" /></td>
            </tr>
            <tr>
                <td>Passwort</td>
                <td><input type="password" name="password1" size="30" /></td>
            </tr>
 
            <tr>
                <td>Passwort wiederholen</td>
                <td><input type="password" name="password2" size="30" /></td>
            </tr>
            <tr>
                <td>Email</td>
                <td><input type="text" name="email" size="30" /></td>
            </tr>

        </table><input type="submit" name="submit" class="submitButton" value="Daten ändern" style="width: 201px; ">
        <p />
        
    </form>
    </div>
    </div>
</body>
</html>