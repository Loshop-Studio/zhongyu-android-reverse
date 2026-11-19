package p318r5;

import android.text.TextUtils;
import java.util.Map;
import java.util.regex.Pattern;

/* renamed from: r5.n */
/* loaded from: classes5.dex */
public abstract class AbstractC10883n {
    /* renamed from: a */
    public static String m23562a(String str, String str2, String str3, String str4) {
        if (!TextUtils.isEmpty(str2)) {
            return m23565d(str, str2, str3) ? str2 : str4;
        }
        AbstractC10861f1.m23441m("hmsSdk", "checkStrParameter() Parameter verification failure! Parameter:" + str);
        return str4;
    }

    /* renamed from: b */
    public static boolean m23563b(String str) {
        return !m23564c("eventId", str, 256);
    }

    /* renamed from: c */
    public static boolean m23564c(String str, String str2, int i10) {
        StringBuilder sb2;
        String str3;
        if (TextUtils.isEmpty(str2)) {
            sb2 = new StringBuilder();
            str3 = "checkString() Parameter is empty : ";
        } else {
            if (str2.length() <= i10) {
                return true;
            }
            sb2 = new StringBuilder();
            str3 = "checkString() Failure of parameter length check! Parameter:";
        }
        sb2.append(str3);
        sb2.append(str);
        AbstractC10861f1.m23441m("hmsSdk", sb2.toString());
        return false;
    }

    /* renamed from: d */
    public static boolean m23565d(String str, String str2, String str3) {
        StringBuilder sb2;
        String str4;
        if (TextUtils.isEmpty(str2)) {
            sb2 = new StringBuilder();
            str4 = "checkString() Parameter is null! Parameter:";
        } else {
            if (Pattern.compile(str3).matcher(str2).matches()) {
                return true;
            }
            sb2 = new StringBuilder();
            str4 = "checkString() Parameter verification failure! Parameter:";
        }
        sb2.append(str4);
        sb2.append(str);
        AbstractC10861f1.m23441m("hmsSdk", sb2.toString());
        return false;
    }

    /* renamed from: e */
    public static boolean m23566e(Map map) {
        String str;
        if (map == null || map.size() == 0) {
            str = "onEvent() mapValue has not data.so,The data will be empty";
        } else if (map.size() == 1 && (map.get("constants") != null || map.get("_constants") != null)) {
            str = "checkMap() the key can't be constants or _constants";
        } else {
            if (map.size() <= 2048 && map.toString().length() <= 204800) {
                return true;
            }
            str = "checkMap Map data is too big! size: " + map.size() + " length: " + map.toString().length();
        }
        AbstractC10861f1.m23441m("hmsSdk", str);
        return false;
    }
}
