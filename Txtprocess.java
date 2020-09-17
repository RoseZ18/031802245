package com.RoseZ;
import java.util.ArrayList;
import java.util.List;
import java.io.*;
public class Txtprocess {
    private static final String html_seperator="<br>";
    private static final String sentence_seperator="[,.;!:，。；!：]";
    //
    public static String[] split(String src)
    {
        List<String> result=new ArrayList<>();
        String []htmls=src.split(html_seperator);
        for (String s:htmls)
            for (String s2:s.split(sentence_seperator))
                result.add(s2);
        String []results=new String[result.size()];
        result.toArray(results);
        return results;
    }
    //清晰字符串除杂消除干扰
     static String[] clean(String []src)
    {
        for (int i=0;i<src.length;i++)
            src[i]=clean(src[i]);
        return src;
    }
    //清除非数字、字母、中文
    public static String clean(String src)
    {
        return src.replaceAll("[^a-zA-Z0-9\\u4e00-\\u9fa5]","");
    }
    public static String ReadtoString(String filepath){
        Reader reader = null;
        BufferedReader br = null;
        String data = null;
        StringBuffer sb = new StringBuffer();
        try {
            reader = new FileReader(filepath);
            br = new BufferedReader(reader);
            while ((data = br.readLine()) != null) {
                sb.append(data);
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            try {
                reader.close();
                br.close();
            }catch (Exception e) {
                e.printStackTrace();
            }
        }
        return sb.reverse().toString();
    }

}
