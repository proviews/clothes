package weathertest;

import java.io.IOException;

import org.junit.Test;

import com.show.api.ShowApiRequest;


public class WatherTest {
	@Test
	/**
	 * 佛山天气
	 *  
	 *  */
	public void t() throws IOException {
		String res=new ShowApiRequest("http://route.showapi.com/9-5","59462","d30e5f4f96a74e048b3fe4b4ecfa92ec")
				.addTextPara("from","5")
				.addTextPara("lng","113.127937")
				.addTextPara("lat","23.012858")
				.addTextPara("needMoreDay","1")
				.addTextPara("needIndex","1")
				.addTextPara("needHourData","0")
				.addTextPara("need3HourForcast","0")
				.addTextPara("needAlarm","0")
				.post();
			System.out.println(res);
	}
}
