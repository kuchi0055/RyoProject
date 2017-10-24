<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <link rel="stylesheet" type="text/css" href="${f:url('/stylesheets/main.css')}">
    <link rel="stylesheet" type="text/css" href="${f:url('/stylesheets/bootstrap.min.css')}">

    <script src="${f:url('/js/bootstrap.js')}"></script>
    <script src="${f:url('/js/footerFixed.js')}"></script>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.0/jquery.min.js"></script>
    <script type="text/javascript" src="http://ajax.googleapis.com/ajax/libs/jquery/1/jquery.min.js"></script>
    <script type="text/javascript" src="http://ajax.googleapis.com/ajax/libs/jqueryui/1/jquery-ui.min.js"></script>
    <link type="text/css" href="http://ajax.googleapis.com/ajax/libs/jqueryui/1/themes/ui-lightness/jquery-ui.css" rel="stylesheet" />
    <script type="text/javascript" src="http://ajax.googleapis.com/ajax/libs/jqueryui/1/i18n/jquery.ui.datepicker-ja.min.js"></script>

    <link rel="stylesheet" type="text/css" href="${f:url('/stylesheets/jquery.datetimepicker.css')}">
    <script src="${f:url('/js/jquery.min.js')}"></script>
    <link rel="stylesheet" href="jquery.datetimepicker.css">

    <script src="${f:url('/js/jquery-2.1.1.js')}"></script>
    <script src="${f:url('/js/bootstrap.min.js')}"></script>
    <script src="${f:url('/js/jquery.datetimepicker.js')}"></script>

    <title>イベント登録入力画面</title>
  </head>
  <body>

<script>
$(function(){
    $('#datetimepicker').datetimepicker({
    	datepicker: true,
    	//timepicker : false
     	allowTimes:[
    	            '07:00','07:30','08:00','08:30','09:00','09:30','10:00','10:30','11:00','11:30','12:00','12:30','13:00','13:30','14:00','14:30','15:00','15:30','16:00','16:30','17:00','17:30','18:00','18:30','19:00','19:30','20:00','20:30','21:00','21:30','22:00','22:30','23:00','23:30'
    	            ]
    ,defaultTime:'10:00'
    	,format: 'Y-m-d H:i'
    });
    $('#datetimepicker2').datetimepicker({
    	datepicker: true,
    	timepicker : false,
    	format: 'Y-m-d'
    });
    $('#datetimepicker3').datetimepicker({
    	datepicker: true,
    	timepicker : false,
    	format: 'Y-m-d'
    });
});
</script>

<form action="/logout" method="GET">
	<div class="navbar navbar-inverse">
		<div class="container">
			<div class="navbar-header">
				<button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
					<span class="sr-only"></span>
					<span class="icon-bar"></span>
					<span class="icon-bar"></span>
					<span class="icon-bar"></span>
				</button>
				<a href="/menu" class="navbar-brand"><span class="glyphicon glyphicon-user"></span> easy</a>
			</div>
			<div class="collapse navbar-collapse">
				<ul class="nav navbar-nav navbar-right">
					<li class="active"><a href="#">ユーザ名：${f:h(userInfoDto.userName)}</a></li>
					<li><html:link page="/SC0201/logout" onclick="document.form1.submit();"><span class="glyphicon glyphicon-share"></span> ログアウト</html:link></li>
				</ul>
			</div>
		</div>
	</div>
</form>

<div class="container">
	<div class="row">
		<div class="col-md-6">
			<h3>イベント登録</h3>
		</div>
	</div>
	<div class="alert alert-info">以下の内容をご入力ください。</div>
	<font size="5" color="#ff0000">
		<b>@error</b>
	</font>

	<s:form method="POST" action="/SA0201">
	<div class="row">
		<div class="col-md-12">
			<table class="table table-condensed table-bordered table-hover">
				<tbody>
					<tr>
						<th class="info" style="width:30%;">イベント名</th>
						<td style="width:70%;"><html:text styleClass="form-control input-sm" property="eventName" value="eventName" /></td>
					</tr>
					<tr>
						<th class="info" style="width:30%;">イベント日時</th>
						<td style="width:70%;"><html:text styleClass="form-control input-sm" styleId="datetimepicker" property="eventDatetime" value="eventDatetime" /></td>
					</tr>
					<tr>
						<th class="info" style="width:30%;">イベント場所</th>
						<td style="width:70%;"><html:text styleClass="form-control input-sm" property="eventPlace" value="eventPlace" /></td>
					</tr>
					<tr>
						<th class="info" style="width:30%;">イベント概要</th>
						<td style="width:70%;"><input type="text" class="form-control input-sm" name="event_summary" value="@eventSummary" /></td>
						<td style="width:70%;"><html:text styleClass="form-control input-sm" property="eventSummary" value="eventSummary" /></td>
					</tr>
					<tr>
						<th class="info" style="width:30%;">イベント公開<div class="subtitle">※公開する場合、部課長が確認できます。</div></th>
						<td>
						<div class="col-md-12">
						@eventPublicFlg match {
						case "0" => {
								<label><input type="radio" class="form-control" name="event_public_flg" style="width:20px;height:20px" value = "0" checked /></label><label style="width:70px;">公開する</label>
								<label><input type="radio" class="form-control" name="event_public_flg" style="width:20px;height:20px" value = "1"/></label><label style="width:70px;">公開しない</label>
							}
						case "1" => {
								<label><input type="radio" class="form-control" name="event_public_flg" style="width:20px;height:20px" value = "0" /></label><label style="width:70px;">公開する</label>
								<label><input type="radio" class="form-control" name="event_public_flg" style="width:20px;height:20px" value = "1" checked /></label><label style="width:70px;">公開しない</label>
							}
						}
						</div>
						</td>
					</tr>
					<tr>
						<th class="info" style="width:30%;">イベント担当者</th>
						<td>
							<div class="col-md-12">
								<html:select property="userList" styleClass="form-control">
									<c:forEach items="${userList}" var="item">
										<html:option value="${item.userId}">${item.empNmKanjiLastname}</html:option>
									</c:forEach>
								</html:select>
							</div>
						</td>
					</tr>
					<tr>
						<th class="info" style="width:30%;">返信期限<div class="subtitle">※回答を希望する日です。</div></th>
						<td style="width:70%;"><input type="text" data-format="yyyy-MM-dd" class="form-control input-sm" name="attendance_deadline_datetime" id="datetimepicker2" value="@attendanceDeadlineDatetime" /></td>
					</tr>
					<tr>
						<th class="info" style="width:30%;">回答締切日<div class="subtitle">※締切日を過ぎると、回答および回答変更ができません。</div></th>
						<td style="width:70%;"><input type="text" data-format="yyyy-MM-dd" class="form-control input-sm" name="reply_deadline_datetime" id="datetimepicker3" value="@replyDeadlineDatetime" /></td>
					</tr>

				</tbody>
			</table>
		</div>
	</div>

	<div class="row">
		<div class="col-md-12" align="right">
			<input type="submit" class="btn btn-primary" value="確認" />
			<html:button property="" onclick="history.back();" styleClass="btn btn-primary" value="キャンセル" />
		</div>
	</div>
    </s:form>

</div>

	<div class="container">
		<div class="row">
			<div class="col-md-12">
				<hr />
				<p>Copyright &copy; Wiss1, Inc. All Rights Reserved.</p>
			</div>
		</div>
	</div>
</body>
</html>
