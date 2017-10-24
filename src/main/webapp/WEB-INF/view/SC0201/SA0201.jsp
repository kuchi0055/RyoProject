<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

  <link rel="stylesheet" type="text/css" href="${f:url('/stylesheets/bootstrap.min.css')}">
  <link rel="stylesheet" type="text/css" href="${f:url('/stylesheets/datepicker2.css')}">
  <script src="${f:url('/js/jquery-2.1.1.js')}"></script>
  <script src="${f:url('/js/bootstrap.min.js')}"></script>
  <script src="${f:url('/js/common.js')}"></script>
  <script src="${f:url('/js/bootstrap-datepicker.js')}"></script>
  <script src="${f:url('/js/js/bootstrap-datepicker.ja.js')}"></script>
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.0/jquery.min.js"></script>

<title>イベント一覧画面</title>
</head>

<body>
<form name="form">
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
				<li><html:link page="/SC0201/logout" onclick="document.form.submit();"><span class="glyphicon glyphicon-share"></span> ログアウト</html:link></li>
			</ul>
		</div>
	</div>
</div>

<div class="container">
	<div class="row">
		<div class="col-md-6">
			<h3>イベント一覧</h3>
		</div>
	</div>
	<c:if test="${eventCount == 0}">
		<font size="5" color="#ff0000">
			<b>${f:h(errorMsg)}</b>
		</font>
	</c:if>
	<div class="row">
		<div class="col-md-12" align="right" id="listCount">
			<label for="event_regist_count" align="right">イベント登録件数 <c:out value="${f:h(eventCount)}"/>件</label>
		</div>
	</div>

<!--テーブル作成-->
	<div class="row">
		<div class="col-md-12">
			<div class="table-responsive" style="height:400px;overflow-y:auto;">
				<table class="table table-condensed table-bordered table-striped table-hover">
					<thead id ="Event-info">
						<tr class="info">
							<th style="width:5%;">No.</th>
							<th style="width:20%;">イベント名</th>
							<th style="width:20%;">イベント開催日時</th>
							<th style="width:10%;">ステータス</th>
							<th style="width:15%;">イベント管理</th>
							<th style="width:15%;">イベント公開</th>
							<th style="width:17%;"></th>
						</tr>
					</thead>
					<tbody>
					<c:forEach items="${eventDataList}" var="item" varStatus="status">
						<tr>
							<td>${f:h(status.count)}</td>
							<td><a href="">${item.eventName}</a></td>
							<td>${f:h(item.eventDatetime)}</td>
							<td>${f:h(item.eventStatus)}</td>
							<td>${f:h(item.eventStatus)}</td>
							<td>${f:h(item.createUser)}</td>
							<td>${f:h(item.createUser)}</td>
							<td>
							<c:if test="${item.createUser != '' }">
								<a href="/eventUpdate?eventid=@datas('event_id')" class="btn btn-primary btn-sm">変更</a>&nbsp;&nbsp;
								<a href="/eventDeleteConfirm?eventid=@datas('event_id')" class="btn btn-primary btn-sm" >削除</a>
							</c:if>
						</tr>
					</c:forEach>
					</tbody>
				</table>
			</div>
		</div>
	</div>
	<br />
</div>
</form>

<s:form method="POST" action="/SA0201">
	<div class="row">
		<div class="col-md-12" align="right">
		<span id = "createUser-btn">
			<!-- <a href="/userinput" class="btn btn-warning btn-large">ユーザー登録</a>-->
		</span>
			<s:submit property="showEventInput" styleClass="btn btn-primary" value="イベント登録" />
		<span id = "createUserInfo-btn">
			<!-- <a href="/userlist" class="btn btn-warning btn-large">ユーザー情報一覧</a>-->
		</span>
			<s:submit property="backMenu" styleClass="btn btn-primary" value="メニューへ戻る" />
		</div>
	</div>
</s:form>
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