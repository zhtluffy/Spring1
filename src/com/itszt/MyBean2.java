package com.itszt;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2019/7/21.
 *
 * bean 装配
 */
public class MyBean2 {
    private String data1;
    private int data2;
    private String[] data3;
    private List<String> data4;
    private Map<String,Integer> data5;
    private List<Dog> data6;

    public void setData6(List<Dog> data6) {
        this.data6 = data6;
    }

    public void setData5(Map<String, Integer> data5) {
        this.data5 = data5;
    }

    public void setData4(List<String> data4) {
        this.data4 = data4;
    }

    public void setData3(String[] data3) {
        this.data3 = data3;
    }

    public void setData1(String data1) {
        this.data1 = data1;
    }

    public void setData2(int data2) {
        this.data2 = data2;
    }

    public MyBean2(String data1, int data2, String[] data3, List<String> data4, Map<String, Integer> data5, List<Dog> data6) {
        this.data1 = data1;
        this.data2 = data2;
        this.data3 = data3;
        this.data4 = data4;
        this.data5 = data5;
        this.data6 = data6;
    }

    public void show(){
        System.out.println( data1+"  "+data2+"  "+ Arrays.toString(data3)+"  "+data4+"  "+data5+"  "+data6);
    }
}
