$(function() {
	// EnterキーでのSubmitを抑止
	$('input').keypress(function(e) {
		if ((e.which && e.which == 13)
				|| (e.keyCode && e.keyCode == 13)) {
			return false;
		} else {
			return true;
		}
	});
});
