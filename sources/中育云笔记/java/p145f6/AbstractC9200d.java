package p145f6;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import android.webkit.URLUtil;
import com.alibaba.android.arouter.utils.Consts;
import java.net.MalformedURLException;
import java.net.URL;
import org.eclipse.paho.client.mqttv3.MqttTopic;
import p130e6.AbstractC9107b;

/* renamed from: f6.d */
/* loaded from: classes5.dex */
public abstract class AbstractC9200d {
    /* renamed from: a */
    public static String m18087a(String str) {
        if (!TextUtils.isEmpty(str)) {
            return !URLUtil.isNetworkUrl(str) ? str : m18088b(str);
        }
        AbstractC9107b.m17905f("UriUtil", "whiteListUrl is null");
        return null;
    }

    /* renamed from: b */
    public static String m18088b(String str) {
        if (TextUtils.isEmpty(str)) {
            AbstractC9107b.m17905f("UriUtil", "url is null");
            return str;
        }
        try {
            if (URLUtil.isNetworkUrl(str)) {
                return new URL(str.replaceAll("[\\\\#]", MqttTopic.TOPIC_LEVEL_SEPARATOR)).getHost();
            }
            AbstractC9107b.m17903d("UriUtil", "url don't starts with http or https");
            return "";
        } catch (MalformedURLException e10) {
            AbstractC9107b.m17903d("UriUtil", "getHostByURI error  MalformedURLException : " + e10.getMessage());
            return "";
        }
    }

    /* renamed from: c */
    public static boolean m18089c(String str, String[] strArr) {
        if (strArr == null || strArr.length == 0) {
            AbstractC9107b.m17903d("UriUtil", "whitelist is null");
            return false;
        }
        for (String str2 : strArr) {
            if (m18090d(str, str2)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: d */
    public static boolean m18090d(String str, String str2) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            String strDecode = Uri.decode(str);
            String strDecode2 = Uri.decode(str2);
            if (!strDecode.contains("..") && !strDecode2.contains("@")) {
                if (str.contains("..") || str.contains("@")) {
                    Log.e("UriUtil", "url contains unsafe char");
                    return false;
                }
                if (!str2.equals(str)) {
                    if (!str.startsWith(str2 + "?")) {
                        if (!str.startsWith(str2 + MqttTopic.MULTI_LEVEL_WILDCARD)) {
                            if (!str2.endsWith(MqttTopic.TOPIC_LEVEL_SEPARATOR)) {
                                return false;
                            }
                            if (Uri.parse(strDecode).getPathSegments().size() - Uri.parse(strDecode2).getPathSegments().size() != 1) {
                                return false;
                            }
                            return str.startsWith(str2);
                        }
                    }
                }
                return true;
            }
            Log.e("UriUtil", "url contains unsafe char");
        }
        return false;
    }

    /* renamed from: e */
    public static boolean m18091e(String str, String[] strArr) {
        if (strArr == null || strArr.length == 0) {
            AbstractC9107b.m17903d("UriUtil", "whitelist is null");
            return false;
        }
        for (String str2 : strArr) {
            if (m18092f(str, str2)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: f */
    public static boolean m18092f(String str, String str2) {
        String strM18088b = m18088b(str);
        if (TextUtils.isEmpty(strM18088b) || TextUtils.isEmpty(str2)) {
            AbstractC9107b.m17903d("UriUtil", "url or whitelist is null");
            return false;
        }
        String strM18087a = m18087a(str2);
        if (TextUtils.isEmpty(strM18087a)) {
            Log.e("UriUtil", "whitelist host is null");
            return false;
        }
        if (strM18087a.equals(strM18088b)) {
            return true;
        }
        if (strM18088b.endsWith(strM18087a)) {
            try {
                String strSubstring = strM18088b.substring(0, strM18088b.length() - strM18087a.length());
                if (strSubstring.endsWith(Consts.DOT)) {
                    return strSubstring.matches("^[A-Za-z0-9.-]+$");
                }
                return false;
            } catch (IndexOutOfBoundsException e10) {
                AbstractC9107b.m17903d("UriUtil", "IndexOutOfBoundsException" + e10.getMessage());
            } catch (Exception e11) {
                AbstractC9107b.m17903d("UriUtil", "Exception : " + e11.getMessage());
                return false;
            }
        }
        return false;
    }

    /* renamed from: g */
    public static boolean m18093g(String str, String str2) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            return TextUtils.equals(m18088b(str), m18087a(str2));
        }
        Log.e("UriUtil", "isUrlHostSameWhitelist: url or host is null");
        return false;
    }

    /* renamed from: h */
    public static boolean m18094h(String str, String[] strArr) {
        if (strArr == null || strArr.length == 0) {
            AbstractC9107b.m17903d("UriUtil", "whitelist is null");
            return false;
        }
        for (String str2 : strArr) {
            if (m18093g(str, str2)) {
                return true;
            }
        }
        return false;
    }
}
