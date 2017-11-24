package com.miutrip.controller;

import com.miutrip.utils.LogHelper;
import org.apache.http.HttpEntity;
import org.apache.http.NameValuePair;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.ContentType;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.CharArrayBuffer;
import org.apache.http.util.EntityUtils;

import java.io.*;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;

public class TestController {
    public static void main(String[] args) {

//        LogHelper.Info("开始记录日志了");

//        get();

        post();
    }

    static void post(){
        //测试HttpClient
        CloseableHttpClient httpClient = HttpClients.createDefault();

        HttpPost httpPost = new HttpPost("http://localhost:8080/api/pay/single_postquery");

        List<NameValuePair> reqList = new ArrayList<NameValuePair>();
        reqList.add(new BasicNameValuePair("payOrderNo","PO201609131938180001"));

        try {

            httpPost.setEntity(new UrlEncodedFormEntity(reqList, "UTF-8"));
            CloseableHttpResponse response = httpClient.execute(httpPost);

            System.out.println(EntityUtils.toString(response.getEntity()));



        } catch (Exception e) {
            e.printStackTrace();
        }




    }

    static void get(){
        String url = "http://localhost:8080/api/pay/orders_query";

        //测试HttpClient
        CloseableHttpClient httpClient = HttpClients.createDefault();

        HttpGet httpGet = new HttpGet(url);

        try {
            CloseableHttpResponse response = httpClient.execute(httpGet);

            HttpEntity entity = response.getEntity();


//            Reader reader = new InputStreamReader(entity.getContent());
//            StringBuffer buffer = new StringBuffer((int) entity.getContentLength());
//            char[] chars = new char[1024];
//
//            int len = -1;
//            while ((len = reader.read(chars)) != -1) {
//                buffer.append(chars,0,len);
//            }
//            System.out.println(buffer.toString());


            //封装了字符的读取
            System.out.println(EntityUtils.toString(entity));


        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
