package p116i0;

import android.os.Build;
import com.alibaba.sdk.android.tbrest.rest.EnumC5242a;
import java.util.HashMap;
import java.util.Map;
import p083f0.C7422a;
import p127j0.AbstractC7772c;
import p127j0.AbstractC7774e;
import p127j0.AbstractC7777h;

/* renamed from: i0.a */
/* loaded from: classes3.dex */
public abstract class AbstractC7640a {

    /* renamed from: a */
    public static long f12874a = System.currentTimeMillis();

    /* renamed from: a */
    public static String m12646a(C7422a c7422a, String str, long j10, String str2, int i10, Object obj, Object obj2, Object obj3, Map map) {
        String str3;
        String str4;
        String str5 = null;
        if (i10 == 0) {
            return null;
        }
        try {
            String strM13114l = AbstractC7772c.m13114l(c7422a.f12117a);
            if (strM13114l == null) {
                AbstractC7774e.m13119b("get utdid failure, so build report failure, now return");
                return null;
            }
            String[] strArrM13111i = AbstractC7772c.m13111i(c7422a.f12117a);
            String str6 = strArrM13111i[0];
            if (strArrM13111i.length > 1 && str6 != null && !"Wi-Fi".equals(str6)) {
                str5 = strArrM13111i[1];
            }
            String str7 = "" + (j10 > 0 ? j10 : System.currentTimeMillis());
            String strM12647b = m12647b(str2);
            String strM12647b2 = m12647b(String.valueOf(i10));
            String strM12647b3 = m12647b(AbstractC7777h.m13130b(obj));
            String strM12647b4 = m12647b(AbstractC7777h.m13130b(obj2));
            String strM12647b5 = m12647b(AbstractC7777h.m13130b(obj3));
            String strM12647b6 = m12647b(AbstractC7777h.m13129a(map));
            String strM12647b7 = m12647b(AbstractC7772c.m13107e(c7422a.f12117a));
            String strM12647b8 = m12647b(AbstractC7772c.m13108f(c7422a.f12117a));
            String strM12647b9 = m12647b(Build.BRAND);
            m12647b(AbstractC7772c.m13106d());
            m12647b(strM12647b7);
            String str8 = str5;
            String strM12647b10 = m12647b(Build.MODEL);
            String strM12647b11 = m12647b(AbstractC7772c.m13112j(c7422a.f12117a));
            String strM12647b12 = m12647b(AbstractC7772c.m13104b(c7422a.f12117a));
            String strM12647b13 = m12647b(str6);
            String strM12647b14 = m12647b(str8);
            String strM12647b15 = m12647b(str);
            String strM12647b16 = m12647b(c7422a.f12121e);
            String strM12647b17 = m12647b(c7422a.f12122f);
            String strM12647b18 = m12647b(c7422a.f12123g);
            String strM12647b19 = m12647b(c7422a.f12123g);
            m12647b(AbstractC7772c.m13105c());
            try {
                String strM12647b20 = m12647b(AbstractC7772c.m13109g());
                String str9 = c7422a.f12118b;
                String str10 = "a";
                String strM12647b21 = m12647b(Build.VERSION.RELEASE);
                String strM12647b22 = m12647b(strM13114l);
                String strM12647b23 = m12647b(c7422a.f12126j);
                AbstractC7777h.m13131c("");
                if (str9 != null) {
                    str4 = strM12647b23;
                    if (str9.contains("aliyunos")) {
                        str10 = "y";
                    }
                } else {
                    str4 = strM12647b23;
                }
                String str11 = str10;
                HashMap map2 = new HashMap();
                map2.put(EnumC5242a.IMEI.toString(), strM12647b7);
                map2.put(EnumC5242a.IMSI.toString(), strM12647b8);
                map2.put(EnumC5242a.BRAND.toString(), strM12647b9);
                map2.put(EnumC5242a.DEVICE_MODEL.toString(), strM12647b10);
                map2.put(EnumC5242a.RESOLUTION.toString(), strM12647b11);
                map2.put(EnumC5242a.CARRIER.toString(), strM12647b12);
                map2.put(EnumC5242a.ACCESS.toString(), strM12647b13);
                map2.put(EnumC5242a.ACCESS_SUBTYPE.toString(), strM12647b14);
                map2.put(EnumC5242a.CHANNEL.toString(), strM12647b17);
                map2.put(EnumC5242a.APPKEY.toString(), strM12647b15);
                map2.put(EnumC5242a.APPVERSION.toString(), strM12647b16);
                map2.put(EnumC5242a.LL_USERNICK.toString(), strM12647b18);
                map2.put(EnumC5242a.USERNICK.toString(), strM12647b19);
                map2.put(EnumC5242a.LL_USERID.toString(), "-");
                map2.put(EnumC5242a.USERID.toString(), "-");
                map2.put(EnumC5242a.LANGUAGE.toString(), strM12647b20);
                map2.put(EnumC5242a.OS.toString(), str11);
                map2.put(EnumC5242a.OSVERSION.toString(), strM12647b21);
                map2.put(EnumC5242a.SDKVERSION.toString(), "1.0");
                String string = EnumC5242a.START_SESSION_TIMESTAMP.toString();
                StringBuilder sb = new StringBuilder();
                str3 = "";
                try {
                    sb.append(str3);
                    sb.append(f12874a);
                    map2.put(string, sb.toString());
                    map2.put(EnumC5242a.UTDID.toString(), strM12647b22);
                    map2.put(EnumC5242a.SDKTYPE.toString(), "mini");
                    map2.put(EnumC5242a.RESERVE2.toString(), strM12647b22);
                    map2.put(EnumC5242a.RESERVE3.toString(), "-");
                    map2.put(EnumC5242a.RESERVE4.toString(), "-");
                    map2.put(EnumC5242a.RESERVE5.toString(), "-");
                    map2.put(EnumC5242a.RESERVES.toString(), str4);
                    map2.put(EnumC5242a.RECORD_TIMESTAMP.toString(), str7);
                    map2.put(EnumC5242a.PAGE.toString(), strM12647b);
                    map2.put(EnumC5242a.EVENTID.toString(), strM12647b2);
                    map2.put(EnumC5242a.ARG1.toString(), strM12647b3);
                    map2.put(EnumC5242a.ARG2.toString(), strM12647b4);
                    map2.put(EnumC5242a.ARG3.toString(), strM12647b5);
                    map2.put(EnumC5242a.ARGS.toString(), strM12647b6);
                    return m12648c(map2);
                } catch (Exception e10) {
                    e = e10;
                    AbstractC7774e.m13120c("UTRestAPI buildTracePostReqDataObj catch!", e);
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

    /* renamed from: b */
    public static String m12647b(String str) {
        if (AbstractC7777h.m13131c(str)) {
            return "-";
        }
        if (str == null || "".equals(str)) {
            return str;
        }
        StringBuilder sb = new StringBuilder(str.length());
        for (char c10 : str.toCharArray()) {
            if (c10 != '\n' && c10 != '\r' && c10 != '\t' && c10 != '|') {
                sb.append(c10);
            }
        }
        return sb.toString();
    }

    /* renamed from: c */
    public static String m12648c(Map map) {
        boolean z9;
        EnumC5242a enumC5242a;
        StringBuffer stringBuffer = new StringBuffer();
        EnumC5242a[] enumC5242aArrValues = EnumC5242a.values();
        int length = enumC5242aArrValues.length;
        int i10 = 0;
        while (true) {
            String strM13130b = null;
            if (i10 >= length || (enumC5242a = enumC5242aArrValues[i10]) == EnumC5242a.ARGS) {
                break;
            }
            if (map.containsKey(enumC5242a.toString())) {
                strM13130b = AbstractC7777h.m13130b(map.get(enumC5242a.toString()));
                map.remove(enumC5242a.toString());
            }
            stringBuffer.append(m12647b(strM13130b));
            stringBuffer.append("||");
            i10++;
        }
        EnumC5242a enumC5242a2 = EnumC5242a.ARGS;
        if (map.containsKey(enumC5242a2.toString())) {
            stringBuffer.append(m12647b(AbstractC7777h.m13130b(map.get(enumC5242a2.toString()))));
            map.remove(enumC5242a2.toString());
            z9 = false;
        } else {
            z9 = true;
        }
        for (String str : map.keySet()) {
            String strM13130b2 = map.containsKey(str) ? AbstractC7777h.m13130b(map.get(str)) : null;
            if (z9) {
                if ("StackTrace".equals(str)) {
                    stringBuffer.append("StackTrace=====>");
                    stringBuffer.append(strM13130b2);
                } else {
                    stringBuffer.append(m12647b(str));
                    stringBuffer.append("=");
                    stringBuffer.append(strM13130b2);
                }
                z9 = false;
            } else if ("StackTrace".equals(str)) {
                stringBuffer.append(",");
                stringBuffer.append("StackTrace=====>");
                stringBuffer.append(strM13130b2);
            } else {
                stringBuffer.append(",");
                stringBuffer.append(m12647b(str));
                stringBuffer.append("=");
                stringBuffer.append(strM13130b2);
            }
        }
        String string = stringBuffer.toString();
        if (AbstractC7777h.m13132d(string) || !string.endsWith("||")) {
            return string;
        }
        return string + "-";
    }
}
