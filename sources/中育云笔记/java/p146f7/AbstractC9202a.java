package p146f7;

import android.text.TextUtils;
import anet.channel.request.Request;
import com.huawei.hms.framework.common.ContainerUtils;
import com.lzy.okgo.model.HttpHeaders;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import je.C9737q;
import je.C9743w;
import je.C9745y;
import org.eclipse.paho.client.mqttv3.MqttTopic;
import p033b7.C5172a;

/* renamed from: f7.a */
/* loaded from: classes5.dex */
public abstract class AbstractC9202a {
    /* renamed from: a */
    public static C9743w.a m18095a(C9743w.a aVar, HttpHeaders httpHeaders) {
        if (httpHeaders.f12691c.isEmpty()) {
            return aVar;
        }
        C9737q.a aVar2 = new C9737q.a();
        try {
            for (Map.Entry entry : httpHeaders.f12691c.entrySet()) {
                aVar2.m19395a((String) entry.getKey(), (String) entry.getValue());
            }
        } catch (Exception e10) {
            AbstractC9204c.m18111a(e10);
        }
        aVar.m19601i(aVar2.m19400f());
        return aVar;
    }

    /* renamed from: b */
    public static Object m18096b(Object obj, String str) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(str);
    }

    /* renamed from: c */
    public static String m18097c(String str, Map map) throws UnsupportedEncodingException {
        try {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str);
            if (str.indexOf(38) > 0 || str.indexOf(63) > 0) {
                sb2.append("&");
            } else {
                sb2.append("?");
            }
            for (Map.Entry entry : map.entrySet()) {
                Iterator it = ((List) entry.getValue()).iterator();
                while (it.hasNext()) {
                    String strEncode = URLEncoder.encode((String) it.next(), Request.DEFAULT_CHARSET);
                    sb2.append((String) entry.getKey());
                    sb2.append(ContainerUtils.KEY_VALUE_DELIMITER);
                    sb2.append(strEncode);
                    sb2.append("&");
                }
            }
            sb2.deleteCharAt(sb2.length() - 1);
            return sb2.toString();
        } catch (UnsupportedEncodingException e10) {
            AbstractC9204c.m18111a(e10);
            return str;
        }
    }

    /* renamed from: d */
    public static String m18098d(C9745y c9745y) {
        String strM19635m = c9745y.m19635m(com.alibaba.sdk.android.oss.common.utils.HttpHeaders.CONTENT_DISPOSITION);
        if (strM19635m == null) {
            return null;
        }
        String strReplaceAll = strM19635m.replaceAll("\"", "");
        int iIndexOf = strReplaceAll.indexOf("filename=");
        if (iIndexOf != -1) {
            return strReplaceAll.substring(iIndexOf + 9, strReplaceAll.length());
        }
        int iIndexOf2 = strReplaceAll.indexOf("filename*=");
        if (iIndexOf2 == -1) {
            return null;
        }
        String strSubstring = strReplaceAll.substring(iIndexOf2 + 10, strReplaceAll.length());
        return strSubstring.startsWith("UTF-8''") ? strSubstring.substring(7, strSubstring.length()) : strSubstring;
    }

    /* renamed from: e */
    public static String m18099e(C9745y c9745y, String str) {
        String strM18098d = m18098d(c9745y);
        if (TextUtils.isEmpty(strM18098d)) {
            strM18098d = m18100f(str);
        }
        if (TextUtils.isEmpty(strM18098d)) {
            strM18098d = "unknownfile_" + System.currentTimeMillis();
        }
        try {
            return URLDecoder.decode(strM18098d, Request.DEFAULT_CHARSET);
        } catch (UnsupportedEncodingException e10) {
            AbstractC9204c.m18111a(e10);
            return strM18098d;
        }
    }

    /* renamed from: f */
    public static String m18100f(String str) {
        int iIndexOf;
        String[] strArrSplit = str.split(MqttTopic.TOPIC_LEVEL_SEPARATOR);
        for (String str2 : strArrSplit) {
            if (str2.contains("?") && (iIndexOf = str2.indexOf("?")) != -1) {
                return str2.substring(0, iIndexOf);
            }
        }
        if (strArrSplit.length > 0) {
            return strArrSplit[strArrSplit.length - 1];
        }
        return null;
    }

    /* renamed from: g */
    public static void m18101g(Runnable runnable) {
        C5172a.m2692h().m2698g().post(runnable);
    }
}
