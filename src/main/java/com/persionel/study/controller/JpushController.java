package com.persionel.study.controller;

import cn.jiguang.common.resp.APIConnectionException;
import cn.jiguang.common.resp.APIRequestException;
import cn.jpush.api.JPushClient;
import cn.jpush.api.push.PushResult;
import cn.jpush.api.push.model.Message;
import cn.jpush.api.push.model.Options;
import cn.jpush.api.push.model.Platform;
import cn.jpush.api.push.model.PushPayload;
import cn.jpush.api.push.model.audience.Audience;
import cn.jpush.api.push.model.notification.Notification;

import com.persionel.study.commonConst.CommonConst;

public class JpushController {
	public static void jpushAndroid(String phone, String message) {   // 推送的手机、推送的告警信息
        // 设置好极光的app_key和masterSecret 
        String appKey = CommonConst.APP_KEY;
        String masterSecret = CommonConst.MASTER_SECRET;
        //创建JPushClient
        JPushClient jpushClient = new JPushClient(masterSecret, appKey);
        //推送的关键,构造一个payload 
        PushPayload payload = PushPayload.newBuilder()
             .setPlatform(Platform.all()) //指定所有平台，安卓，苹果，WePhone
             .setAudience(Audience.alias(phone)) //指定某个用户，注意，该用户必须存在于该appKey拥有者的服务用户下，不然会提示找不到该用户
             .setNotification(Notification.alert(message)) // 发送的内容    
             //这里是指定开发环境,不用设置也没关系
             .setOptions(Options.newBuilder().setApnsProduction(false).build())
             .setMessage(Message.content(message))  //自定义信息
             .build();
        try {
             PushResult pu = jpushClient.sendPush(payload);
             System.out.println(pu.msg_id+" "+pu.sendno);  // 成功推送后输出id和sendno
         } catch (APIConnectionException e) {
             e.printStackTrace();
             System.out.println("API error");
         } catch (APIRequestException e) {
             e.printStackTrace();
             System.out.println("Request error");
         }    
   }
  
  // test
  public static void main(String[] args) {
      jpushAndroid("188****5833","hello world");  // 测试自己的手机号（安卓）
  }
}
