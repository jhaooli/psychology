package com.converter;

/**
 * @Author jhao
 * @Date 2019/5/24 10:48
 * @Description
 * @Modified by:
 */


        import java.text.ParseException;
        import java.text.SimpleDateFormat;
        import java.util.Date;
        import org.springframework.core.convert.converter.Converter;

/**
 * 将传入的字符串转化为java Data类型，不解释，应该可以看懂
 * @author lenovo
 *
 */
public class CustomDateConverter implements Converter<String,Date>{

    @Override
    public Date convert(String source) {

        //实现 将日期串转成日期类型(格式是yyyy-MM-dd HH:mm:ss)

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");

        //转成直接返回
        try {
            return simpleDateFormat.parse(source);
        } catch (ParseException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        //如果参数绑定失败返回null
        return null;
    }

}
