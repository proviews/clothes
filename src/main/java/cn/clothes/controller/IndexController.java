package cn.clothes.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.show.api.ShowApiRequest;

import cn.clothes.biz.WeatherJson;
import cn.clothes.utils.FastJsonUtil;

@Controller
public class IndexController {
	/**
	 * 首页
	 * @param model
	 */
	@RequestMapping("/content")
	public String content(Model model){
		return "content/content";
	}
	/**
	 * 首页默认页
	 */
	@RequestMapping(value="/loadindex")
	public String index() {
		return "content/index";
	}
	@RequestMapping("/weather")
	@ResponseBody
	public String weather() {
		String res=new ShowApiRequest("http://route.showapi.com/9-5","59462","d30e5f4f96a74e048b3fe4b4ecfa92ec")
				.addTextPara("from","5")
				.addTextPara("lng","113.127937")
				.addTextPara("lat","23.012858")
				.addTextPara("needMoreDay","0")
				.addTextPara("needIndex","0")
				.addTextPara("needHourData","0")
				.addTextPara("need3HourForcast","0")
				.addTextPara("needAlarm","0")
				.post();
		WeatherJson json = FastJsonUtil.parseObject(res, WeatherJson.class);
		String jsona = json.getShowapi_res_body();
		JSONObject jsonb = JSON.parseObject(jsona);
		String jsonc = jsonb.getString("now");
		return jsonc;
	}
}
