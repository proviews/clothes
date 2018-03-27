package cn.clothes.conversion;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.core.convert.converter.Converter;
import org.springframework.expression.ParseException;
import org.springframework.stereotype.Component;
@Component
public class DateConversion implements Converter<String, Date>{
	@Override
    public Date convert(String stringDate) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        try {
            return simpleDateFormat.parse(stringDate);
        } catch (ParseException | java.text.ParseException e) {
            e.printStackTrace();
        }
        return null;
    }
}
