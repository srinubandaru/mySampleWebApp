<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Welcome to myWeb</h1>
<hr/>
<form action="MyServlet">
<input type="submit" value="send"/>
</form>

<form methed="get" action="ServCalc">
<h1>Calculator</h1>
 Enter First Number :
 <input type="text" name="txtfn"/> <br/>
 Enter Second Number :
 <input type="text" name="txtsn"/> <br/>
 Select the Operation : <br/>
 <input type="radio" name="operation" value="add"> Addition
 <input type="radio" name="operation" value="sub"> Substraction
 <input type="radio" name="operation" value="mul"> Multiplication
 <input type="radio" name="operation" value="div"> Division
 <input type="radio" name="operation" value="mod"> Modulus <br/>
 
 <input type="submit" value="Calculate"/> 
 <input type="reset"  value="Reset"/> 
 
 


</form>

</body>
</html>