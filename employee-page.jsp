<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  
<!DOCTYPE html>  
<html>  
<head>  
    <title>Employee Form</title>  
</head>  
<h3>Employee Information Form</h3>  
<body>  
    <form:form action="submitForm" modelAttribute="employee">  
        Employee Number : <form:input path="empno" />         
        <br><br>  
        Employee name: <form:input path="ename" />  
        <br><br>  
        Employee designation: <form:input path="designation" />  
        <br><br>  
        Employee salary: <form:input path="sal" />  
        <br><br>  
       
          
        <input type="submit" value="Submit" />  
    </form:form>  
</body>  
</html>  
