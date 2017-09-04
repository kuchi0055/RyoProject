<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>WISS1 統合メニュー</title>
</head>

　
  <link rel="stylesheet" type="text/css" href="${f:url('/stylesheets/bootstrap.min.css')}">
  <script src="${f:url('/js/jquery-2.1.1.js')}"></script>
  <script src="${f:url('/js/bootstrap.min.js')}"></script>
  <script src="${f:url('/js/common.js')}"></script>
  <script>

  $(function(){

    var defs = {
      "easy_btn": "easy_menu",
      "camp_btn": "camp_menu",
      "kinty_btn": "kinty_menu",
      "beat_btn": "beat_menu",
      "master_btn": "master_menu"
    };

    for (var btnId in defs) {
      var button = $("#" + btnId);
      button.attr("myToggleState", "plus");
      button.children("span").attr("styleClass", "glyphicon glyphicon-plus");

      button.on("click", function(){
        $("#" + defs[$(this).prop("id")]).slideToggle("fast");
        var state = $(this).attr("myToggleState");
        if (state == "plus") {
          $(this).attr("myToggleState", "minus");
          $(this).children("span").attr("styleClass", "glyphicon glyphicon-minus");
        } else if (state == "minus") {
          $(this).attr("myToggleState", "plus");
          $(this).children("span").attr("styleClass", "glyphicon glyphicon-plus");
        }
      });
    }

    // ALLプラスボタンのイベント登録
    var expandBtn = $("#expand_btn");
    expandBtn.children("span").attr("styleClass", "glyphicon glyphicon-plus");
    expandBtn.on("click", function(){
      for (var key in defs) {
        $("#" + defs[key]).slideDown("fast");
        $("#" + key).attr("myToggleState", "minus");
        $("#" + key).children("span").attr("styleClass", "glyphicon glyphicon-minus");
      }
    });

    // ALLマイナスボタンのイベント登録
    var collapseBtn = $("#collapse_btn");
    collapseBtn.children("span").attr("styleClass", "glyphicon glyphicon-minus");
    collapseBtn.on("click", function(){
      for (var key in defs) {
        $("#" + defs[key]).slideUp("fast");
        $("#" + key).attr("myToggleState", "plus");
        $("#" + key).children("span").attr("styleClass", "glyphicon glyphicon-plus");
      }
    });

  });
  </script>

  <script type="text/javascript">
//  $(window).ready(function checkAuthority() {
//    if("0"== authorityFlg){
//      // "0"システム(管理者)
//      // ボタン表示
//      document.getElementById("passwordreset-btn").style.display = "";
//    } else {
//      // 上記以外
//      // ボタン非表示
//      document.getElementById("passwordreset-btn").style.display = "none";
//    }
//  });
  </script>

  <!--[if lt IE 9]>
    <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
    <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
  <![endif]-->

  <script type="text/javascript">
    // Android以外の場合にメニューを非表示にする判定
//    $(window).load(function checkUserAgent() {
//        if (!(@userAgent.equals("android"))) {
//            document.getElementById("beatMenu-link").style.display = "none";
//        }
//    });
  </script>
</head>
<body onload="checkAuthority()">
  <form method="GET" name="form1">
    <div class="navbar navbar-inverse">
      <div class="container">
        <div class="navbar-header">
          <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
             <span class="sr-only"></span>
             <span class="icon-bar"></span>
             <span class="icon-bar"></span>
             <span class="icon-bar"></span>
          </button>
          <html:link action="/menu" styleClass="navbar-brand"><span class="glyphicon glyphicon-user"></span> wiss1</html:link>
        </div>
        <div class="collapse navbar-collapse">
          <ul class="nav navbar-nav navbar-right">
            <li><a href="#" data-toggle="modal" data-toggle="modal" data-target="#releaseNote">リリースノート</a></li>
            <li class="active"><a href="#">ユーザ名：${f:h(userInfoDto.userName)}</a></li>
            <li><html:link page="/SC0201/logout" onclick="document.form1.submit();"><span class="glyphicon glyphicon-share"></span> ログアウト</html:link></li>
          </ul>
        </div>
      </div>
    </div>
  </form>

  <div class="modal fade" id="releaseNote" tabindex="-1">
    <div class="modal-dialog">
      <div class="modal-content">
        <div class="modal-header">
          <button type="button" class="close" data-dismiss="modal"><span>×</span></button>
          <h4 class="modal-title">リリースノート</h4>
        </div>
        <div class="modal-body">
          <table class="table table-striped">
            <thead>
              <tr>
                <th>No.</th>
                <th>リリース日</th>
                <th>リリース内容</th>
              </tr>
            </thead>
            <tbody>
              <tr>
                <td>1</td>
                <td>2016/10/09</td>
                <td>【easy!】イベント中止へのステータス変更を可能とする</td>
              </tr>
              <tr>
                <td>2</td>
                <td>2016/10/09</td>
                <td>【easy!】イベント変更/中止時のメール送信機能追加</td>
              </tr>
              <tr>
                <td>3</td>
                <td>2016/10/09</td>
                <td>【easy!】イベント招待時のユーザ選択機能の改善</td>
              </tr>
              <tr>
                <td>4</td>
                <td>2016/10/09</td>
                <td>【easy!】メール2重送信不具合対応</td>
              </tr>
              <tr>
                <td>5</td>
                <td>2016/10/22</td>
                <td>【camp】経歴検索の不具合対応</td>
              </tr>
              <tr>
                <td>6</td>
                <td>2016/10/22</td>
                <td>【camp】経歴詳細チェック（開始終了日）不具合対応</td>
              </tr>
              <tr>
                <td>7</td>
                <td>2016/10/22</td>
                <td>【camp】経歴詳細遷移不具合対応</td>
              </tr>
              <tr>
                <td>8</td>
                <td>2016/10/29</td>
                <td>【camp】経歴書出力不具合対応</td>
              </tr>
              <tr>
                <td>9</td>
                <td>2016/10/29</td>
                <td>【kinty】統合メニューリリース（ロゴのみ）</td>
              </tr>
            </tbody>
          </table>
        </div>
        <div class="modal-header">
          <h4 class="modal-title">不具合状況</h4>
        </div>
        <div class="modal-body">
          <table class="table table-striped">
            <thead>
              <tr>
                <th>No.</th>
                <th>事象</th>
                <th>Redmine</th>
                <th>ステータス</th>
              </tr>
            </thead>
            <tbody>
              <tr>
                <td>1</td>
                <td>経歴書出力の不具合</td>
                <td><a href="http://wiss1.dip.jp:8080/redmine/issues/524" target="_blank">#524</a></td>
                <td>対応完了</td>
              </tr>
              <tr>
                <td>2</td>
                <td>beatアンイストール時の不具合(Android/iOS)</td>
                <td><a href="http://wiss1.dip.jp:8080/redmine/issues/379" target="_blank">#379</a></td>
                <td>実装中</td>
              </tr>
              <tr>
                <td>3</td>
                <td>イベント出欠状況ファイル出力の不具合</td>
                <td><a href="http://wiss1.dip.jp:8080/redmine/issues/437" target="_blank">#437</a></td>
                <td>調査中</td>
              </tr>
            </tbody>
          </table>
        </div>
        <div class="modal-footer">
          <button type="button" class="btn btn-primary" data-dismiss="modal">閉じる</button>
        </div>
      </div>
    </div>
  </div>

  <div class="container">
    <div class="row">
      <div class="col-md-6" style="display: inline-block; _display: inline;">
        <html:img page="/images/easy_logo.jpg" styleClass="img-responsive" alt="easy"></html:img>
      </div>
    </div>
    <div id="easy_menu">
      <div class="row">
        <div class="col-md-4">
          <div class="panel panel-default">
            <div class="panel-heading">イベント管理</div>
            <div class="panel-body">
              <ul class="nav nav-pills nav-stacked">
                <li><a href="SC0301">イベント参照</a></li>
              </ul>
            </div>
          </div>
        </div>
      </div>
    </div>

    <br />

    <div class="row">
      <div class="col-md-6" style="display: inline-block; _display: inline;">
          <html:img page="/images/camp_logo.jpg" styleClass="img-responsive" alt="camp"></html:img>
      </div>
    </div>
    <div id="camp_menu">
      <div class="row">
        <div class="col-md-4">
          <div class="panel panel-default">
            <div class="panel-heading">マイプロフィール管理</div>
            <div class="panel-body">
              <ul class="nav nav-pills nav-stacked">
                <li><a href="http://wiss1.dip.jp:8800/MyProfileSearch?userId=@userId">マイプロフィール検索</a></li>
              </ul>
            </div>
          </div>
        </div>
        <div class="col-md-4">
          <div class="panel panel-default">
            <div class="panel-heading">経歴管理</div>
            <div class="panel-body">
              <ul class="nav nav-pills nav-stacked">
                <li><a href="http://wiss1.dip.jp:8800/CareerSearch?userId=@userId">経歴検索</a></li>
              </ul>
            </div>
          </div>
        </div>
      </div>
    </div>

    <br />

    <div class="row">
      <div class="col-md-6" style="display: inline-block; _display: inline;">
          <html:img page="/images/kinty_logo.jpg" styleClass="img-responsive" alt="kinty"></html:img>
      </div>
    </div>
    <div id="kinty_menu">
      <div class="row">
        <div class="col-md-4">
          <div class="panel panel-default">
            <div class="panel-heading">勤怠管理</div>
            <div class="panel-body">
              <ul class="nav nav-pills nav-stacked">
                <li><a href="/worktimeInfo">勤怠閲覧</a></li>
              </ul>
            </div>
          </div>
        </div>
      </div>
    </div>

    <div id="beatMenu-link">
      <br />
      <div class="row">
        <div class="col-md-6" style="display: inline-block; _display: inline;">
            <html:img page="/images/beat_logo.jpg" styleClass="img-responsive" alt="beat"></html:img>
        </div>
      </div>
      <div id="beat_menu">
        <div class="row">
          <div class="col-md-4">
            <div class="panel panel-default">
              <div class="panel-heading">電話帳アプリ管理</div>
              <div class="panel-body">
                <ul class="nav nav-pills nav-stacked">
                  <li><a href="http://wiss1.dip.jp:8808/beat.apk">beatダウンロード</a></li>
                </ul>
              </div>
            </div>
          </div>
        </div>
      </div>
    </div>

    <br />

    <div class="row">
      <div class="col-md-6" style="display: inline-block; _display: inline;">
        <html:img page="/images/setting_logo.jpg" styleClass="img-responsive" alt="setting"></html:img>
      </div>
    </div>
    <div id="master_menu">
      <div class="row">
        <div id="masterMaintenance-link">
          <div class="col-md-4">
            <div class="panel panel-default">
              <div class="panel-heading">各種マスタ管理</div>
              <div class="panel-body">
                <ul class="nav nav-pills nav-stacked">
                  <li><a href="/masterMaintenanceMain">各種マスタ登録</a></li>
                </ul>
              </div>
            </div>
          </div>
        </div>
        <div class="col-md-4">
          <div class="panel panel-default">
            <div class="panel-heading">パスワード変更</div>
            <div class="panel-body">
              <ul class="nav nav-pills nav-stacked">
                <li><a href="/firstpasswordinput">パスワード変更</a></li>
                <!-- システム管理者の場合、ボタン表示 -->
                <li id="passwordreset-btn"><a href="/passwordReset">パスワード初期化</a></li>
              </ul>
            </div>
          </div>
        </div>
      </div>
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