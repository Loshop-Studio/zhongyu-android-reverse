package p235l6;

import android.text.TextUtils;
import anet.channel.util.HttpConstant;
import org.eclipse.paho.client.mqttv3.MqttTopic;

/* renamed from: l6.c */
/* loaded from: classes5.dex */
public abstract class AbstractC10149c {
    /* renamed from: a */
    public static int m21172a(String str) {
        if (TextUtils.isEmpty(str)) {
            return 1;
        }
        if (str.startsWith("video")) {
            return 2;
        }
        return str.startsWith("audio") ? 3 : 1;
    }

    /* renamed from: b */
    public static String m21173b(String str) {
        try {
            int iLastIndexOf = str.lastIndexOf(MqttTopic.TOPIC_LEVEL_SEPARATOR);
            return iLastIndexOf != -1 ? str.substring(iLastIndexOf + 1) : "";
        } catch (Exception e10) {
            e10.printStackTrace();
            return "";
        }
    }

    /* renamed from: c */
    public static boolean m21174c(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return str.startsWith("content://");
    }

    /* renamed from: d */
    public static boolean m21175d(String str) {
        return str != null && str.startsWith("audio");
    }

    /* renamed from: e */
    public static boolean m21176e(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return str.startsWith(m21184m()) || str.startsWith(m21189r()) || str.startsWith(m21188q());
    }

    /* renamed from: f */
    public static boolean m21177f(String str) {
        if (str != null) {
            return str.equals("image/gif") || str.equals("image/GIF");
        }
        return false;
    }

    /* renamed from: g */
    public static boolean m21178g(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return str.startsWith(HttpConstant.HTTP) || str.startsWith("https");
    }

    /* renamed from: h */
    public static boolean m21179h(String str) {
        return str != null && str.startsWith("image");
    }

    /* renamed from: i */
    public static boolean m21180i(String str) {
        return str != null && str.startsWith("video");
    }

    /* renamed from: j */
    public static boolean m21181j(String str) {
        return str != null && str.equalsIgnoreCase("image/webp");
    }

    /* renamed from: k */
    public static boolean m21182k(String str, String str2) {
        return TextUtils.isEmpty(str) || m21172a(str) == m21172a(str2);
    }

    /* renamed from: l */
    public static boolean m21183l(String str) {
        return str.toLowerCase().endsWith(".mp4");
    }

    /* renamed from: m */
    public static String m21184m() {
        return "image/bmp";
    }

    /* renamed from: n */
    public static String m21185n() {
        return "image/gif";
    }

    /* renamed from: o */
    public static String m21186o() {
        return "image/jpeg";
    }

    /* renamed from: p */
    public static String m21187p() {
        return "image/webp";
    }

    /* renamed from: q */
    public static String m21188q() {
        return "image/vnd.wap.wbmp";
    }

    /* renamed from: r */
    public static String m21189r() {
        return "image/x-ms-bmp";
    }
}
