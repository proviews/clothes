$(document).ready(function(){
	$.post("/weather",function(data){
		var $weather=$.parseJSON(data);
		$("h2").html("地区:"+$weather.aqiDetail.area);
		$("h3").html("天气:"+$weather.weather);
		$("h4").html("温度:"+$weather.temperature);
		$("h5").html("空气质量:"+$weather.aqiDetail.quality);
		$("#i").attr("src",$weather.weather_pic);
	});
});