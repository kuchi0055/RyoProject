<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <title>ログイン画面</title>
  <link rel="stylesheet" type="text/css" href="${f:url('/stylesheets/bootstrap.min.css')}">
  <link rel="stylesheet" type="text/css" href="${f:url('/stylesheets/login.css')}">

</head>
<body>
  <div class="container" align="center">
    <form name="login" class="form-signin">
      <html:img page="/images/home_logo.jpg" styleClass="img-responsive" width="80%" alt="wiss1"></html:img>
    </form>
  </div>

  <div align="center">
    <font size="5" color="#ff0000"><b><html:errors></html:errors></b></font>
    <br />
  </div>

  <div class="container" align="center">
    <s:form method="POST" styleClass="form-signin">
      <html:text property="userId" styleClass="form-control" maxlength="4" />
      <html:password property="password" styleClass="form-control" />
      <s:submit property="selectMenu" styleClass="btn btn-lg btn-primary btn-block" value="ログイン" />
    </s:form>
  </div>
</body>
</html>