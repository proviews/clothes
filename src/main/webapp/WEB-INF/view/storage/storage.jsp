<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<script type="text/javascript" src="${pageContext.request.contextPath }/static/js/jquery-1.8.3.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath }/static/js/echarts.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath }/static/js/jquery.ocupload-1.1.2.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath }/static/js/storage/input.js"></script>
<div style="float:left;"><button name="myFile" id="myButton" class="layui-btn layui-btn-warm">一键导入库存报表</button></div>
<div style="margin-left:86%;"><button id="output" class="layui-btn layui-btn-success">一键导出库存报表</button></div>
<div id="main" style="width: 500px;height:400px;float:left"></div>
<div id="chart" style="width: 500px;height:400px;float:left"></div>
<script type="text/javascript">
//基于准备好的dom，初始化echarts实例
 var myChart = echarts.init(document.getElementById('main')); 
// 使用刚指定的配置项和数据显示图表。
 option = {
    title: {
        text: '库存情况统计',
        left: 'center'
    },
     tooltip : {
        trigger: 'item',
        formatter: "{a} <br/>{b} : {c} ({d}%)"
    } ,
    legend: {
        // orient: 'vertical',
        // top: 'middle',
        bottom: 10,
        left: 'center',
        data: []
    },
    series : [
        {
            type: 'pie',
            radius : '65%',
            center: ['50%', '50%'],
            selectedMode: 'single',
            data: [] ,
            itemStyle: {
                emphasis: {
                    shadowBlur: 10,
                    shadowOffsetX: 0,
                    shadowColor: 'rgba(0, 0, 0, 0.5)'
                }
            }
        }
    ]
};
		//使用刚指定的配置项和数据显示图表。
 			myChart.setOption(option);
		
 			var chart = echarts.init(document.getElementById('chart'));
 			option2 = {
 				    xAxis: {
 				        type: 'category',
 				        data: []
 				    },
 				    yAxis: {
 				        type: 'value'
 				    },
 				    series: [{
 				        data: [],
 				        type: 'bar'
 				    }]
 				};
 			//使用刚指定的配置项和数据显示图表。
 			chart.setOption(option2);
</script>