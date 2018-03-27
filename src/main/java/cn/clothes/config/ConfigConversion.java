package cn.clothes.config;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.format.support.FormattingConversionServiceFactoryBean;

import cn.clothes.conversion.DateConversion;

@Configuration
public class ConfigConversion {
	@Autowired
	private DateConversion dataConversion;
	public FormattingConversionServiceFactoryBean format() {
		FormattingConversionServiceFactoryBean formattingConversionServiceFactoryBean=new FormattingConversionServiceFactoryBean();
		Set converters=new HashSet();
		converters.add(dataConversion);
		formattingConversionServiceFactoryBean.setConverters(converters);
		return formattingConversionServiceFactoryBean;
	}
	 

}
