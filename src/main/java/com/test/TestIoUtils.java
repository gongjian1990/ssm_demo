package com.test;

import org.apache.commons.io.IOUtils;
import org.junit.Test;

import java.io.*;
import java.nio.charset.Charset;

/**
 * 测试apache commons Ioutils ，从inputSteam中读取字符串
 */
public class TestIoUtils {

    @Test
    public void test01(){
        try {
            Writer writer = new StringWriter();

            InputStream is = new FileInputStream(new File("e:/test.txt"));

            IOUtils.copy(is,writer,"gbk");

            // 将String 转换为inputSteam
            InputStream inputStream = IOUtils.toInputStream("你好", Charset.defaultCharset());



            // 输出到制定的outputsteam中，用于下载功能
            FileOutputStream fileOutputStream = new FileOutputStream(new File("e:/test1.txt"));
            String s = writer.toString();
            IOUtils.write(s.getBytes(),fileOutputStream);

            System.out.println(s);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
