@(user: String,datas:List[HashMap[String,Object]],count: Integer,error:String,divisions:List[HashMap[String,Object]])
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="ja">
<head>
  <meta charset="utf-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="viewport" content="width=device-width, initial-scale=1">

  <link href="@routes.Assets.at("stylesheets/bootstrap.min.css")" rel="stylesheet">
  <script src="@routes.Assets.at("js/jquery-2.1.1.js")"></script>
  <script src="@routes.Assets.at("js/bootstrap.min.js")"></script>

  <title>イベントメンバー選択画面</title>

  <!--[if lt IE 9]>
    <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
    <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
  <![endif]-->
</head>

<script type="text/javascript" language="javascript">
	$(function() {
		$('.checkAll').on('change', function() {
			$('.' + this.id).prop('checked', this.checked);
		});
	});
</script>
<body>
  <form name="logout" action="/logout" method="GET">
    <div class="navbar navbar-inverse">
      <div class="container">
        <div class="navbar-header">
          <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
             <span class="sr-only"></span>
             <span class="icon-bar"></span>
             <span class="icon-bar"></span>
             <span class="icon-bar"></span>
          </button>
          <a href="/menu" class="navbar-brand"><span class="glyphicon glyphicon-user"></span> wiss1</a>
        </div>
        <div class="collapse navbar-collapse">
          <ul class="nav navbar-nav navbar-right">
            <li class="active"><a href="#">ユーザ名：@user</a></li>
            <li><a href="/logout"><span class="glyphicon glyphicon-share"></span> ログアウト</a></li>
          </ul>
        </div>
      </div>
    </div>
  </form>
<div class="container">
	<div class="row">
		<div class="col-md-6">
			<h3>イベントメンバー選択</h3>
		</div>
	</div>

	<font size="5" color="#ff0000">
		<b>@error</b>
	</font>
	<div class="alert alert-info">イベントに招待するメンバーを選択してください。</div>

	<font size="5" color="#ff0000">
		<b>@error</b>
	</font>
	<div class="row">
		<div class="col-md-12" align="left" id="listCount">
			<form name="form2" action="/groupselectuser" method="POST">
				<select name="hoge" onchange="this.form.division.value=this.options.item(this.selectedIndex).value">
					<option value="---">事業部を表示</option>
					@for(divisions
					<- divisions){
					<option value=@divisions("division_cd")>@divisions("division_nm")</option>}
					<input type="hidden" id ="division" name="division" value="this.form.hoge.value">
					<input type="submit" class="btn btn-primary" value="グループ選択" />
				</select>
			</form>
		</div>
		<form name="form1" action="/userselect" method="POST">
			<div class="row">
				<div class="col-md-12">
					<div class="table-responsive" style="height:400px;">
						<table class="table table-condensed table-bordered table-striped table-hover table-headerfixed">
							<thead>
								<tr class="info">
									<th style="width:15%;">
										<div>選択</div>
										<div class="vertical_middle">
											<input type="checkbox" id="group_01" class="checkAll">
										</div>
									</th>
									<th style="width:15%;">Ｎｏ.</th>
									<th style="width:15%;">ユーザー番号</th>
									<th style="width:55%;">ユーザー名</th>
								</tr>
							</thead>
							<tbody>@for(datas
							<- datas){
								<tr>
									<td style="width:15%;">
										<input type="checkbox" class="group_01"name="eventmember[@datas("id")]" value=@datas("user_id") @datas("cheak_flg")>
									</td>
									<td style="width:15%;">@datas("id")</td>
									<td style="width:15%;">@datas("user_id")</td>
									<td style="width:55%;">@datas("user_name")</td>
								</tr>
								}
							</tbody>
						</table>
					</div>
				</div>
			</div>

			<div class="row">
				<div class="col-md-12" align="right">
					<input type="submit" class="btn btn-primary" value="登録" />
					<input type="button" class="btn btn-primary" value="キャンセル" onclick="location.href='/canceleventInfo'" />
				</div>
			</div>
		</form>
	</div>
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
