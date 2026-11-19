package p127j0;

import java.util.Map;

/* renamed from: j0.h */
/* loaded from: classes3.dex */
public abstract class AbstractC7777h {
    /* renamed from: a */
    public static String m13129a(Map map) {
        if (map == null) {
            return null;
        }
        StringBuffer stringBuffer = new StringBuffer();
        boolean z9 = true;
        for (String str : map.keySet()) {
            String str2 = (String) map.get(str);
            if (str2 != null && str != null) {
                if (z9) {
                    if ("--invalid--".equals(str2)) {
                        stringBuffer.append(str);
                    } else {
                        stringBuffer.append(str + "=" + str2);
                    }
                    z9 = false;
                } else if ("--invalid--".equals(str2)) {
                    stringBuffer.append(",");
                    stringBuffer.append(str);
                } else {
                    stringBuffer.append(",");
                    stringBuffer.append(str + "=" + str2);
                }
            }
        }
        return stringBuffer.toString();
    }

    /* renamed from: b */
    public static String m13130b(Object obj) {
        if (obj == null) {
            return "";
        }
        if (obj instanceof String) {
            return ((String) obj).toString();
        }
        if (obj instanceof Integer) {
            return "" + ((Integer) obj).intValue();
        }
        if (obj instanceof Long) {
            return "" + ((Long) obj).longValue();
        }
        if (obj instanceof Double) {
            return "" + ((Double) obj).doubleValue();
        }
        if (obj instanceof Float) {
            return "" + ((Float) obj).floatValue();
        }
        if (obj instanceof Short) {
            return "" + ((int) ((Short) obj).shortValue());
        }
        if (!(obj instanceof Byte)) {
            return obj instanceof Boolean ? ((Boolean) obj).toString() : obj instanceof Character ? ((Character) obj).toString() : obj.toString();
        }
        return "" + ((int) ((Byte) obj).byteValue());
    }

    /* renamed from: c */
    public static boolean m13131c(CharSequence charSequence) {
        int length;
        if (charSequence != null && (length = charSequence.length()) != 0) {
            for (int i10 = 0; i10 < length; i10++) {
                if (!Character.isWhitespace(charSequence.charAt(i10))) {
                    return false;
                }
            }
        }
        return true;
    }

    /* renamed from: d */
    public static boolean m13132d(String str) {
        return str == null || str.length() <= 0;
    }

    /* renamed from: e */
    public static boolean m13133e(CharSequence charSequence) {
        return !m13131c(charSequence);
    }
}
