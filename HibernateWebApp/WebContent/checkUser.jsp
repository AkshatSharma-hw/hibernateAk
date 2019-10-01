<jsp:useBean id="ob" class="com.zensar.models.LoginBean" scope="request"></jsp:useBean>
<jsp:setProperty property="username" name="ob" />
<jsp:setProperty property="password" name="ob" param="passwd" />


<%
	//invoke Business logic of model

	if (ob.validateUser()) {
%>

<jsp:forward page="welcome.jsp" >

<jsp:param value="core java" name="book1"/>
<jsp:param value="adv java" name="book2"/>
<jsp:param value="core java1" name="book3"/>
<jsp:param value="adv java2" name="book4"/>
</jsp:forward>

<%
	}

	else {
%>
<p>SORRY! INVALID CREDENTIALS</p>
<<jsp:include page="login.jsp"></jsp:include>

<%
	}
%>