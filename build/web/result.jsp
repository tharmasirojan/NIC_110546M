

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="nic.NIC"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>DOB calculation</title>
        
        <%
	String num = request.getParameter("num");
        NIC nic_cal = new NIC();
        
        out.println("<br>Year  :-"+nic_cal.getYear(num));
        out.println("<br>Month :-"+nic_cal.getMonth(num));
        out.println("<br>Days  :-"+nic_cal.getDate(num));
        out.println("<br>Gender:-"+nic_cal.gender(num));
        out.println("<br>Voter :-");
        if(nic_cal.isVoter(num)){
            out.println("Yes");
        }else{
            out.println("No");
        }
        %>
        
    </head>
    <body>
    </body>
</html>
