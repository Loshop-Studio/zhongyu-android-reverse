package com.alibaba.sdk.android.tbrest.rest;

import android.content.Context;
import android.os.Build;
import com.alibaba.sdk.android.tbrest.SendService;
import com.alibaba.sdk.android.tbrest.utils.DeviceUtils;
import com.alibaba.sdk.android.tbrest.utils.LogUtil;
import com.alibaba.sdk.android.tbrest.utils.StringUtils;
import com.huawei.hms.framework.common.ContainerUtils;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.alibaba.sdk.android.tbrest.rest.e */
/* loaded from: classes3.dex */
public class C5705e {

    /* renamed from: b */
    private static long f4519b = System.currentTimeMillis();

    /* renamed from: a */
    private static String m3862a(String str) {
        if (StringUtils.isBlank(str)) {
            return "-";
        }
        if (str == null || "".equals(str)) {
            return str;
        }
        StringBuilder sb2 = new StringBuilder(str.length());
        for (char c10 : str.toCharArray()) {
            if (c10 != '\n' && c10 != '\r' && c10 != '\t' && c10 != '|') {
                sb2.append(c10);
            }
        }
        return sb2.toString();
    }

    /* renamed from: a */
    public static String m3861a(SendService sendService, String str, long j10, String str2, int i10, Object obj, Object obj2, Object obj3, Map<String, String> map) {
        String str3;
        String str4;
        String str5 = null;
        if (i10 == 0) {
            return null;
        }
        try {
            String utdid = DeviceUtils.getUtdid(sendService.context);
            if (utdid == null) {
                LogUtil.m3870e("get utdid failure, so build report failure, now return");
                return null;
            }
            String[] networkType = DeviceUtils.getNetworkType(sendService.context);
            String str6 = networkType[0];
            if (networkType.length > 1 && str6 != null && !DeviceUtils.NETWORK_CLASS_WIFI.equals(str6)) {
                str5 = networkType[1];
            }
            String str7 = "" + (j10 > 0 ? j10 : System.currentTimeMillis());
            String strM3862a = m3862a(str2);
            String strM3862a2 = m3862a(String.valueOf(i10));
            String strM3862a3 = m3862a(StringUtils.convertObjectToString(obj));
            String strM3862a4 = m3862a(StringUtils.convertObjectToString(obj2));
            String strM3862a5 = m3862a(StringUtils.convertObjectToString(obj3));
            String strM3862a6 = m3862a(StringUtils.convertMapToString(map));
            String strM3862a7 = m3862a(DeviceUtils.getImei(sendService.context));
            String strM3862a8 = m3862a(DeviceUtils.getImsi(sendService.context));
            String strM3862a9 = m3862a(Build.BRAND);
            m3862a(DeviceUtils.getCpuName());
            m3862a(strM3862a7);
            String str8 = str5;
            String strM3862a10 = m3862a(Build.MODEL);
            String strM3862a11 = m3862a(DeviceUtils.getResolution(sendService.context));
            String strM3862a12 = m3862a(DeviceUtils.getCarrier(sendService.context));
            String strM3862a13 = m3862a(str6);
            String strM3862a14 = m3862a(str8);
            String strM3862a15 = m3862a(str);
            String strM3862a16 = m3862a(sendService.appVersion);
            String strM3862a17 = m3862a(sendService.channel);
            String strM3862a18 = m3862a(sendService.userNick);
            String strM3862a19 = m3862a(sendService.userNick);
            m3862a(DeviceUtils.getCountry());
            try {
                String strM3862a20 = m3862a(DeviceUtils.getLanguage());
                String str9 = sendService.appId;
                String str10 = "a";
                String strM3862a21 = m3862a(Build.VERSION.RELEASE);
                String strM3862a22 = m3862a(utdid);
                String strM3862a23 = m3862a(sendService.country);
                StringUtils.isBlank("");
                if (str9 != null) {
                    str4 = strM3862a23;
                    if (str9.contains("aliyunos")) {
                        str10 = "y";
                    }
                } else {
                    str4 = strM3862a23;
                }
                String str11 = str10;
                HashMap map2 = new HashMap();
                map2.put(EnumC5701a.IMEI.toString(), strM3862a7);
                map2.put(EnumC5701a.IMSI.toString(), strM3862a8);
                map2.put(EnumC5701a.BRAND.toString(), strM3862a9);
                map2.put(EnumC5701a.DEVICE_MODEL.toString(), strM3862a10);
                map2.put(EnumC5701a.RESOLUTION.toString(), strM3862a11);
                map2.put(EnumC5701a.CARRIER.toString(), strM3862a12);
                map2.put(EnumC5701a.ACCESS.toString(), strM3862a13);
                map2.put(EnumC5701a.ACCESS_SUBTYPE.toString(), strM3862a14);
                map2.put(EnumC5701a.CHANNEL.toString(), strM3862a17);
                map2.put(EnumC5701a.APPKEY.toString(), strM3862a15);
                map2.put(EnumC5701a.APPVERSION.toString(), strM3862a16);
                map2.put(EnumC5701a.LL_USERNICK.toString(), strM3862a18);
                map2.put(EnumC5701a.USERNICK.toString(), strM3862a19);
                map2.put(EnumC5701a.LL_USERID.toString(), "-");
                map2.put(EnumC5701a.USERID.toString(), "-");
                map2.put(EnumC5701a.LANGUAGE.toString(), strM3862a20);
                map2.put(EnumC5701a.OS.toString(), str11);
                map2.put(EnumC5701a.OSVERSION.toString(), strM3862a21);
                map2.put(EnumC5701a.SDKVERSION.toString(), "1.0");
                String string = EnumC5701a.START_SESSION_TIMESTAMP.toString();
                StringBuilder sb2 = new StringBuilder();
                str3 = "";
                try {
                    sb2.append(str3);
                    sb2.append(f4519b);
                    map2.put(string, sb2.toString());
                    map2.put(EnumC5701a.UTDID.toString(), strM3862a22);
                    map2.put(EnumC5701a.SDKTYPE.toString(), "mini");
                    map2.put(EnumC5701a.RESERVE2.toString(), strM3862a22);
                    map2.put(EnumC5701a.RESERVE3.toString(), "-");
                    map2.put(EnumC5701a.RESERVE4.toString(), "-");
                    map2.put(EnumC5701a.RESERVE5.toString(), "-");
                    map2.put(EnumC5701a.RESERVES.toString(), str4);
                    map2.put(EnumC5701a.RECORD_TIMESTAMP.toString(), str7);
                    map2.put(EnumC5701a.PAGE.toString(), strM3862a);
                    map2.put(EnumC5701a.EVENTID.toString(), strM3862a2);
                    map2.put(EnumC5701a.ARG1.toString(), strM3862a3);
                    map2.put(EnumC5701a.ARG2.toString(), strM3862a4);
                    map2.put(EnumC5701a.ARG3.toString(), strM3862a5);
                    map2.put(EnumC5701a.ARGS.toString(), strM3862a6);
                    return m3863a(map2);
                } catch (Exception e10) {
                    e = e10;
                    LogUtil.m3871e("UTRestAPI buildTracePostReqDataObj catch!", e);
                    return str3;
                }
            } catch (Exception e11) {
                e = e11;
                str3 = "";
            }
        } catch (Exception e12) {
            e = e12;
            str3 = "";
        }
    }

    /* renamed from: a */
    public static String m3863a(Map<String, String> map) {
        boolean z10;
        EnumC5701a enumC5701a;
        StringBuffer stringBuffer = new StringBuffer();
        EnumC5701a[] enumC5701aArrValues = EnumC5701a.values();
        int length = enumC5701aArrValues.length;
        int i10 = 0;
        while (true) {
            String strConvertObjectToString = null;
            if (i10 >= length || (enumC5701a = enumC5701aArrValues[i10]) == EnumC5701a.ARGS) {
                break;
            }
            if (map.containsKey(enumC5701a.toString())) {
                strConvertObjectToString = StringUtils.convertObjectToString(map.get(enumC5701a.toString()));
                map.remove(enumC5701a.toString());
            }
            stringBuffer.append(m3862a(strConvertObjectToString));
            stringBuffer.append("||");
            i10++;
        }
        EnumC5701a enumC5701a2 = EnumC5701a.ARGS;
        if (map.containsKey(enumC5701a2.toString())) {
            stringBuffer.append(m3862a(StringUtils.convertObjectToString(map.get(enumC5701a2.toString()))));
            map.remove(enumC5701a2.toString());
            z10 = false;
        } else {
            z10 = true;
        }
        for (String str : map.keySet()) {
            String strConvertObjectToString2 = map.containsKey(str) ? StringUtils.convertObjectToString(map.get(str)) : null;
            if (z10) {
                if ("StackTrace".equals(str)) {
                    stringBuffer.append("StackTrace=====>");
                    stringBuffer.append(strConvertObjectToString2);
                } else {
                    stringBuffer.append(m3862a(str));
                    stringBuffer.append(ContainerUtils.KEY_VALUE_DELIMITER);
                    stringBuffer.append(strConvertObjectToString2);
                }
                z10 = false;
            } else if ("StackTrace".equals(str)) {
                stringBuffer.append(",");
                stringBuffer.append("StackTrace=====>");
                stringBuffer.append(strConvertObjectToString2);
            } else {
                stringBuffer.append(",");
                stringBuffer.append(m3862a(str));
                stringBuffer.append(ContainerUtils.KEY_VALUE_DELIMITER);
                stringBuffer.append(strConvertObjectToString2);
            }
        }
        String string = stringBuffer.toString();
        if (StringUtils.isEmpty(string) || !string.endsWith("||")) {
            return string;
        }
        return string + "-";
    }

    /* renamed from: a */
    public static C5704d m3860a(SendService sendService, String str, String str2, Context context, long j10, String str3, int i10, Object obj, Object obj2, Object obj3, Map<String, String> map) {
        C5704d c5704d;
        String str4 = "aliyunos";
        if (i10 == 0) {
            return null;
        }
        try {
            String utdid = DeviceUtils.getUtdid(sendService.context);
            if (utdid == null) {
                LogUtil.m3870e("get utdid failure, so build report failure, now return");
                return null;
            }
            String[] networkType = DeviceUtils.getNetworkType(sendService.context);
            String str5 = networkType[0];
            String str6 = (networkType.length <= 1 || str5 == null || DeviceUtils.NETWORK_CLASS_WIFI.equals(str5)) ? null : networkType[1];
            long jCurrentTimeMillis = j10 > 0 ? j10 : System.currentTimeMillis();
            String str7 = "" + jCurrentTimeMillis;
            String str8 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(Long.valueOf(jCurrentTimeMillis));
            String strM3862a = m3862a(str3);
            String strM3862a2 = m3862a(String.valueOf(i10));
            String strM3862a3 = m3862a(StringUtils.convertObjectToString(obj));
            String strM3862a4 = m3862a(StringUtils.convertObjectToString(obj2));
            String strM3862a5 = m3862a(StringUtils.convertObjectToString(obj3));
            String strM3862a6 = m3862a(StringUtils.convertMapToString(map));
            c5704d = null;
            try {
                String strM3862a7 = m3862a(DeviceUtils.getImei(sendService.context));
                String str9 = str6;
                String strM3862a8 = m3862a(DeviceUtils.getImsi(sendService.context));
                String strM3862a9 = m3862a(Build.BRAND);
                String strM3862a10 = m3862a(DeviceUtils.getCpuName());
                String strM3862a11 = m3862a(strM3862a7);
                String strM3862a12 = m3862a(Build.MODEL);
                String strM3862a13 = m3862a(DeviceUtils.getResolution(sendService.context));
                String strM3862a14 = m3862a(DeviceUtils.getCarrier(sendService.context));
                String strM3862a15 = m3862a(str5);
                String strM3862a16 = m3862a(str9);
                String strM3862a17 = m3862a(str);
                String strM3862a18 = m3862a(sendService.appVersion);
                String strM3862a19 = m3862a(sendService.channel);
                String strM3862a20 = m3862a(sendService.userNick);
                String strM3862a21 = m3862a(sendService.userNick);
                String strM3862a22 = m3862a(DeviceUtils.getCountry());
                String strM3862a23 = m3862a(DeviceUtils.getLanguage());
                String str10 = sendService.appId;
                if (str10 == null || !str10.contains("aliyunos")) {
                    str4 = "Android";
                }
                String strM3862a24 = m3862a(Build.VERSION.RELEASE);
                StringBuilder sb2 = new StringBuilder();
                sb2.append("");
                String str11 = str4;
                sb2.append(f4519b);
                String string = sb2.toString();
                String strM3862a25 = m3862a(utdid);
                StringUtils.isBlank("");
                StringBuffer stringBuffer = new StringBuffer();
                stringBuffer.append("5.0.1");
                stringBuffer.append("||");
                stringBuffer.append(strM3862a7);
                stringBuffer.append("||");
                stringBuffer.append(strM3862a8);
                stringBuffer.append("||");
                stringBuffer.append(strM3862a9);
                stringBuffer.append("||");
                stringBuffer.append(strM3862a10);
                stringBuffer.append("||");
                stringBuffer.append(strM3862a11);
                stringBuffer.append("||");
                stringBuffer.append(strM3862a12);
                stringBuffer.append("||");
                stringBuffer.append(strM3862a13);
                stringBuffer.append("||");
                stringBuffer.append(strM3862a14);
                stringBuffer.append("||");
                stringBuffer.append(strM3862a15);
                stringBuffer.append("||");
                stringBuffer.append(strM3862a16);
                stringBuffer.append("||");
                stringBuffer.append(strM3862a19);
                stringBuffer.append("||");
                stringBuffer.append(strM3862a17);
                stringBuffer.append("||");
                stringBuffer.append(strM3862a18);
                stringBuffer.append("||");
                stringBuffer.append(strM3862a20);
                stringBuffer.append("||");
                stringBuffer.append(strM3862a21);
                stringBuffer.append("||");
                stringBuffer.append("-");
                stringBuffer.append("||");
                stringBuffer.append(strM3862a22);
                stringBuffer.append("||");
                stringBuffer.append(strM3862a23);
                stringBuffer.append("||");
                stringBuffer.append(str11);
                stringBuffer.append("||");
                stringBuffer.append(strM3862a24);
                stringBuffer.append("||");
                stringBuffer.append("mini");
                stringBuffer.append("||");
                stringBuffer.append("1.0");
                stringBuffer.append("||");
                stringBuffer.append(string);
                stringBuffer.append("||");
                stringBuffer.append(strM3862a25);
                stringBuffer.append("||");
                stringBuffer.append("-");
                stringBuffer.append("||");
                stringBuffer.append("-");
                stringBuffer.append("||");
                stringBuffer.append("-");
                stringBuffer.append("||");
                stringBuffer.append("-");
                stringBuffer.append("||");
                stringBuffer.append(str8);
                stringBuffer.append("||");
                stringBuffer.append(str7);
                stringBuffer.append("||");
                stringBuffer.append(strM3862a);
                stringBuffer.append("||");
                stringBuffer.append(strM3862a2);
                stringBuffer.append("||");
                stringBuffer.append(strM3862a3);
                stringBuffer.append("||");
                stringBuffer.append(strM3862a4);
                stringBuffer.append("||");
                stringBuffer.append(strM3862a5);
                stringBuffer.append("||");
                stringBuffer.append(strM3862a6);
                String string2 = stringBuffer.toString();
                HashMap map2 = new HashMap();
                map2.put("stm_x", string2.getBytes());
                C5704d c5704d2 = new C5704d();
                c5704d2.m3859b(RestUrlWrapper.getSignedTransferUrl(str2, null, map2, context, strM3862a17, strM3862a19, strM3862a18, str11, "", strM3862a25));
                c5704d2.m3858a(map2);
                return c5704d2;
            } catch (Exception e10) {
                e = e10;
                LogUtil.m3871e("UTRestAPI buildTracePostReqDataObj catch!", e);
                return c5704d;
            }
        } catch (Exception e11) {
            e = e11;
            c5704d = null;
        }
    }
}
