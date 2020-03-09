package com.example.alipay.utils;

import java.io.FileWriter;
import java.io.IOException;

/* *
 *类名：AlipayConfig
 *功能：基础配置类
 *详细：设置帐户有关信息及返回路径
 *修改日期：2017-04-05
 *说明：
 *以下代码只是为了方便商户测试而提供的样例代码，商户可以根据自己网站的需要，按照技术文档编写,并非一定要使用该代码。
 *该代码仅供学习和研究支付宝接口使用，只是提供一个参考。
 */

public class AlipayConfig {
	
//↓↓↓↓↓↓↓↓↓↓请在这里配置您的基本信息↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓

	// 应用ID,您的APPID，收款账号既是您的APPID对应支付宝账号
	public static String app_id = "2016101400683972";
	
	// 商户私钥，您的PKCS8格式RSA2私钥
    public static String merchant_private_key = "MIIEvgIBADANBgkqhkiG9w0BAQEFAASCBKgwggSkAgEAAoIBAQC2E+TL5SwUtt6pt7uVC3sD1DibNWEgE+4PVxiJ070CZkQChu1iVrVtzIy9d2CbUvg6n1E/w4TwY6VZiqhfwbl6FEZfl2OdehzJyWlT9CtQ7u3h7MghpUm192lpoxgnSr5s7ERU7wYqGAOHekTPnRLS5XfCoO0f8zFqwGwKU6sV5w8xpIoGG6b8o1eaEoodF32U8uCcczuYY9/Jm46ih8Z7lXbL/nCcdsuNx34ZuRj5OWsaTDrAZkm3GOlQ2YWf2sy1+qlp3v3tAO9AzPMNH8df4QP8YBA8Bu3ASPIg+E6Niu5coEDEhGe1QR7hYcUarQt0HCr2l1Kl+TC7MoYzQZ6fAgMBAAECggEBAJKDb5ii0NXaUVJAhrFoi5SJMQOz8HPflbDCZPyDZZSItjFSYbLAEz5HWvkbFqHmIdkKWlb0/gRyKpvi95oWSSnzJq3FJGOT35aAfEESOcjmeoVSA7kPSEEk1a4rj0QO4SzE8jdmH4+/wxdBTB3ER2FtRPFYjXcoOpusO0QUD5eO+odYk9UvMGNrWHwfH+211n3MZSdYhdfWpx/mQYXeyL9F+UhY+uZzBqSAofej9Ggjw3D0ShAoht3eIYWXTrHS9R+gJsyVwUPvL4/yR/LRqqahKqyZmqRyQSu9dtZvHq4Lf/8Y7FHSBwB6y1yb9rxnnUSdrf1A4a1P79l7fPeDIAECgYEA5dGAFHpy5NQu7fBuQKdLNTkvteThHzCHnwhMcFbybjvcoeJ68aYJ14lgpGe3gZsVigNVN+g67Y6IaI7qoK4YXfw6YXAtdIzb5pLK6pVrDp+6G5sstkUXwhC+MhJr63CO6c4jl6lDfR9WfLSw3pjdp7R1DVbXgiR8AtJ+IdDpxEcCgYEAytIRr7sts8bERvxSwLLlbWOrsjue8K0A6w2r2Wu8uuYswFZ5Ok4f/xZix7ajPdVS5BiO9Sclp+7ovSqqwcsSZhd5GrWr4I1EyK8WHHtPTAzVHXBnMyOcCV2Heb8kDTlcufEpf5QdsGYQKxIXpDbJ+8RWZ29dzN01lNqDgaaxNukCgYBsVDB3drCpxIrKhcaymykMUYR3zQeA2DNVd2fwnEtyQq1hcYxaU9XXz13KoUkSwrOIdsG4tLLyP3l1L8jRLL83rikmvOXwRmVxbkhQA1aPciMb2C1fTXpBc/rzR1Ovi0MSWqTUXGj/lcICznmAs7Xn01xJiWHUarY57laeQgevCQKBgQC9V8uHINkTohYOpvSiTOB+dLQPWjWRPhFDXqn1+exhFwzkKlZWJiUcwMtK4qgWy5XstziOiRNQaWsBXlm3PVtZz8QROVTR91Algb7ErCFlP/2c1Bij1zSOUbBt6hE//zMfq5IwNhhZW47whp1ngnaiAbMgMQmCfWjOJAjs+q8qMQKBgHzO87BrIeFVeXYebsK5F+pGxZqlXmkQjFfsE4SzCoxHGM+OWDUICI62a6uP+uKaPD0AwHhir5IQTxAh+ckcZyXMWE5U2A2nuGYlaT94FrzpH44TVYb2rzF/p7rUhWOdim9DvzQA3s5X6e4b+OggeGsm7rBg6vlvte4UMBABtVSv";
	
	// 支付宝公钥,查看地址：https://openhome.alipay.com/platform/keyManage.htm 对应APPID下的支付宝公钥。
    public static String alipay_public_key = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAgseoq92dHMIcy6mjEoCNHH33FbADBZSnXQCMzwafPkCx2oIBaHazyX0hObpyZ7WWYkZEvy3OKyVHBIklvbs0t6WeVMSdgluQUHgtZvZV1Iou6qvO+m8NTmdzXM9ItEQywAIUxau+uexu7KmqewdXa1LCcedPxV02ZedCcrwUYjzsLYIXpeSUarxdG/ZlatJUGwOcwr+PCciURQMHiLN2Gd4EV+9YbpvvJF6a4nM4flbT9avp73/K9obXDG5XgGZbflHoi9N7y3AQV+yWv6OffxoIHcrPNKBD/HPd6SYLIafym8/PTIoga9LvtBkKoZW8QqfV+28kLgVkQMBpYxMheQIDAQAB";

	// 服务器异步通知页面路径  需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
	public static String notify_url = "http://localhost:8080/Callback";

	// 页面跳转同步通知页面路径 需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
	public static String return_url = "http://localhost:8080/Callback";

	// 签名方式
	public static String sign_type = "RSA2";
	
	// 字符编码格式
	public static String charset = "utf-8";
	
	// 支付宝网关
	public static String gatewayUrl = "https://openapi.alipaydev.com/gateway.do";
	
	// 支付宝网关
	public static String log_path = "C:\\";


//↑↑↑↑↑↑↑↑↑↑请在这里配置您的基本信息↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑

    /** 
     * 写日志，方便测试（看网站需求，也可以改成把记录存入数据库）
     * @param sWord 要写入日志里的文本内容
     */
    public static void logResult(String sWord) {
        FileWriter writer = null;
        try {
            writer = new FileWriter(log_path + "alipay_log_" + System.currentTimeMillis()+".txt");
            writer.write(sWord);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (writer != null) {
                try {
                    writer.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }


}

