<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<script type="text/javascript" src="${pageContext.request.contextPath }/static/js/echarts.min.js"></script>
<div id="aa" style="width: 1150px;height:500px;"></div>
 <script type="text/javascript">
        // 基于准备好的dom，初始化echarts实例
        var myChart = echarts.init(document.getElementById('aa'));
        var option = {
                title : {
                    text: '组织结构图'
                },
                tooltip : {
                    show: false,
                    trigger: 'item',
                    formatter: "{b}: {c}"
                },
                toolbox: {
                    show : true,
                    feature : {
                        mark : {show: true},
                        dataView : {show: true, readOnly: false},
                        restore : {show: true},
                        saveAsImage : {show: true}
                    }
                },
                calculable : false,
                series : [
                    {
                        name:'树图',
                        type:'tree',
                        orient: 'vertical',  // vertical horizontal
                        rootLocation: {x: '50%', y: '5%'}, // 根节点位置  {x: 'center',y: 10}
                        nodePadding: 20,
                        layerPadding:40,
                        symbol: 'rectangle',
                        borderColor:'black',
                        itemStyle: {
                            normal: {
                                  color: '#fff',//节点背景色
                                label: {
                                    show: true,
                                    position: 'inside',
                                    textStyle: {
                                        color: 'black',
                                        fontSize: 15,
                                        //fontWeight:  'bolder'
                                    }
                                },
                                lineStyle: {
                                    color: '#000',
                                    width: 1,
                                    type: 'broken' // 'curve'|'broken'|'solid'|'dotted'|'dashed'
                                }
                            },
                            emphasis: {
                                label: {
                                    show: false
                                }
                            }
                        },
                        data: [
                            {
                                name: '跟单主管',
                                    symbolSize: [70, 30],
                                    symbol: 'rectangle',
                                    itemStyle: {
                                        normal: {
                                            borderWidth: 2,
                                            borderColor: 'black'
                                        }
                                    },
                                    children: [
                                        {
                                            name: '跟单员',
                                            symbolSize: [70, 30],
                                            symbol: 'rectangle',
                                            itemStyle: {
                                                normal: {
                                                    borderWidth: 2,
                                                    borderColor: 'black'
                                                }
                                            },
                                        children: [
                                            {
                                                name: '产前准备工作',
                                                symbolSize: [70, 30],
                                                symbol: 'rectangle',
                                                itemStyle: {
                                                    normal: {
                                                        borderWidth: 2,
                                                        borderColor: 'black'
                                                    }
                                                }
                                            ,children: [
                                                {
                                                    name: '整理资料',
                                                    symbolSize: [70, 30],
                                                    symbol: 'rectangle',
                                                    itemStyle: {
                                                        normal: {
                                                            borderWidth: 2,
                                                            borderColor: 'black'
                                                        }
                                                    }
                                                }
                                                    ,{
                                                        name: '技术会议',
                                                        symbolSize: [70, 30],
                                                        symbol: 'rectangle',
                                                        itemStyle: {
                                                            normal: {
                                                                borderWidth: 2,
                                                                borderColor: 'black'
                                                            }
                                                        }
                                                    }
                                                ]
                                            }
                                                ,{
                                                    name: '生产跟踪',
                                                    symbolSize: [70, 30],
                                                    symbol: 'rectangle',
                                                    itemStyle: {
                                                        normal: {
                                                            borderWidth: 2,
                                                            borderColor: 'black'
                                                        }
                                                    }
                                                ,children: [
                                                    {
                                                        name: '工厂产前工作',
                                                        symbolSize: [70, 30],
                                                        symbol: 'rectangle',
                                                        itemStyle: {
                                                            normal: {
                                                                borderWidth: 2,
                                                                borderColor: 'black'
                                                            }
                                                        }
                                                    ,children: [
                                                        {
                                                            name: '材料跟踪',
                                                            symbolSize: [70, 30],
                                                            symbol: 'rectangle',
                                                            itemStyle: {
                                                                normal: {
                                                                    borderWidth: 2,
                                                                    borderColor: 'black'
                                                                }
                                                            }
                                                        }
                                                        ,{
                                                            name: '产前会议',
                                                            symbolSize: [70, 30],
                                                            symbol: 'rectangle',
                                                            itemStyle: {
                                                                normal: {
                                                                    borderWidth: 2,
                                                                    borderColor: 'black'
                                                                }
                                                            }
                                                        }
                                                        ,{
                                                            name: '裁剪跟踪',
                                                            symbolSize: [70, 30],
                                                            symbol: 'rectangle',
                                                            itemStyle: {
                                                                normal: {
                                                                    borderWidth: 2,
                                                                    borderColor: 'black'
                                                                }
                                                            }
                                                        }
                                                        ]
                                                    }
                                                        ,{
                                                            name: '缝制跟踪',
                                                            symbolSize: [70, 30],
                                                            symbol: 'rectangle',
                                                            itemStyle: {
                                                                normal: {
                                                                    borderWidth: 2,
                                                                    borderColor: 'black'
                                                                }
                                                            }
                                                        ,children: [
                                                            {
                                                                name: '初期跟踪',
                                                                symbolSize: [70, 30],
                                                                symbol: 'rectangle',
                                                                itemStyle: {
                                                                    normal: {
                                                                        borderWidth: 2,
                                                                        borderColor: 'black'
                                                                    }
                                                                }
                                                            }
                                                            ,{
                                                                name: '中期跟踪',
                                                                symbolSize: [70, 30],
                                                                symbol: 'rectangle',
                                                                itemStyle: {
                                                                    normal: {
                                                                        borderWidth: 2,
                                                                        borderColor: 'black'
                                                                    }
                                                                }
                                                            }
                                                            ,{
                                                                name: '后期跟踪',
                                                                symbolSize: [70, 30],
                                                                symbol: 'rectangle',
                                                                itemStyle: {
                                                                    normal: {
                                                                        borderWidth: 2,
                                                                        borderColor: 'black'
                                                                    }
                                                                }
                                                            }
                                                            ]
                                                        }
                                                            ,{
                                                                name: '生产后道工作',
                                                                symbolSize: [70, 30],
                                                                symbol: 'rectangle',
                                                                itemStyle: {
                                                                    normal: {
                                                                        borderWidth: 2,
                                                                        borderColor: 'black'
                                                                    }
                                                                }
                                                            ,children: [
                                                                {
                                                                    name: '锁定整烫',
                                                                    symbolSize: [70, 30],
                                                                    symbol: 'rectangle',
                                                                    itemStyle: {
                                                                        normal: {
                                                                            borderWidth: 2,
                                                                            borderColor: 'black'
                                                                        }
                                                                    }
                                                                }
                                                                ,{
                                                                    name: '包装数量',
                                                                    symbolSize: [70, 30],
                                                                    symbol: 'rectangle',
                                                                    itemStyle: {
                                                                        normal: {
                                                                            borderWidth: 2,
                                                                            borderColor: 'black'
                                                                        }
                                                                    }
                                                                }
                                                                ,{
                                                                    name: '终检',
                                                                    symbolSize: [70, 30],
                                                                    symbol: 'rectangle',
                                                                    itemStyle: {
                                                                        normal: {
                                                                            borderWidth: 2,
                                                                            borderColor: 'black'
                                                                        }
                                                                    }
                                                                }
                                                                ]
                                                            }
                                                    ]
                                                }
                                            ]
                                            
                                        }
                                        ]
                            }
                            ]
                            }
                          ]
                    }
 // 使用刚指定的配置项和数据显示图表。
        myChart.setOption(option);
    </script>