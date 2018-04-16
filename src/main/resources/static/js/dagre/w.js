$(document).ready(function(){
	$.get("/showWork",function(data){
		var oo= JSON.parse(data);
/**

 * Created by lenovo on 2018/4/13.
 */
/**
 * Created by lenovo on 2018/4/13.
 */
var g = new dagreD3.graphlib.Graph()
    .setGraph({})
    .setDefaultEdgeLabel(function () {
        return {};
    });

// Here we"re setting nodeclass, which is used by our custom drawNodes function
// below.
var nodes =oo;
for (var i = 0; i < nodes.length; i++) {
    g.setNode(i, {label: nodes[i], class: "type-" + nodes[i]});
}
// Set up edges, no special attributes.
for (var j = 0; j < nodes.length-1; j++) {
    //var z=i+1;
    g.setEdge(j, j+1);
}
/*if(nodes.length>0){
	alert(444);
	$(".node:eq(4)").css("transform","translate(53, 190)"); 
}*/
//g.setEdge(0, 1);
/*g.nodes().forEach(function(v) {
 var node = g.node(v);
 // Round the corners of the nodes
 node.rx = node.ry = 5;
 });*/


// Create the renderer
var render = new dagreD3.render();
// Set up an SVG group so that we can translate the final graph.
var svg = d3.select("svg"),
    svgGroup = svg.append("g");

// Run the renderer. This is what draws the final graph.
render(d3.select("svg g"), g);

// Center the graph
var xCenterOffset = (svg.attr("width") - g.graph().width) / 2;
svgGroup.attr("transform", "translate(" + xCenterOffset + ", 20)");
svg.attr("height", g.graph().height + 40);
	});
});