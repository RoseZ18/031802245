package com.RoseZ;
import java.text.DecimalFormat;
public class Inputpath {
    public static final DecimalFormat df2 = new DecimalFormat( "0.00" );
    public static void processpath(String orgFileName,String orgAddFileName,String outputPath){
        String org = Txtprocess.ReadtoString(orgFileName);
        String orgAdd = Txtprocess.ReadtoString(orgAddFileName);
        String result = (df2.format(Calculate.detect(org,orgAdd)));
        System.out.println("查重结果为："+result);
        IO.output(outputPath,result);
    }
}
