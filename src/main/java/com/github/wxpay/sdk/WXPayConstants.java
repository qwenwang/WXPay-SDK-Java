package com.github.wxpay.sdk;

/**
 * 常量
 */
public class WXPayConstants {

    public enum SignType {
        MD5, HMACSHA256
    }

    public static final String FAIL     = "FAIL";
    public static final String SUCCESS  = "SUCCESS";
    public static final String HMACSHA256 = "HMAC-SHA256";
    public static final String MD5 = "MD5";

    public static final String FIELD_SIGN = "sign";
    public static final String FIELD_SIGN_TYPE = "sign_type";

    public static final String MICROPAY_URL     = "/pay/micropay";
    public static final String UNIFIEDORDER_URL = "/pay/unifiedorder";
    public static final String ORDERQUERY_URL   = "/pay/orderquery";
    public static final String REVERSE_URL      = "/secapi/pay/reverse";
    public static final String CLOSEORDER_URL   = "/pay/closeorder";
    public static final String REFUND_URL       = "/secapi/pay/refund";
    public static final String REFUNDQUERY_URL  = "/pay/refundquery";
    public static final String DOWNLOADBILL_URL = "/pay/downloadbill";
    public static final String REPORT_URL       = "/payitil/report";
    public static final String SHORTURL_URL     = "/tools/shorturl";
    public static final String AUTHCODETOOPENID_URL = "/tools/authcodetoopenid";
}