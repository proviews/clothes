$(document).ready(function(){
	$.post("/weather",function(data){
		var $weather=$.parseJSON(data);
		$("#a").html("地区:"+$weather.aqiDetail.area);
		$("#b").html("天气:"+$weather.weather);
		$("#c").html("温度:"+$weather.temperature);
		$("#d").html("空气质量:"+$weather.aqiDetail.quality);
		$("#e").attr("src",$weather.weather_pic);
	});
});