$(document).ready(function(){
	$("#d1").click(function(){
		$("#content").load("/control");
	});
	$("#d2").click(function(){
		$("#content").load("/look");
	});
});