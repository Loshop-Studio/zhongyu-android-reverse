package p130e6;

import android.text.TextUtils;
import android.util.Log;
import java.util.regex.Pattern;

/* renamed from: e6.b */
/* loaded from: classes5.dex */
public abstract class AbstractC9107b {

    /* renamed from: a */
    public static final Pattern f21273a = Pattern.compile("[0-9]*[a-z|A-Z]*[一-龥]*");

    /* renamed from: a */
    public static String m17900a(String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        int length = str.length();
        int i10 = 1;
        if (1 == length) {
            return String.valueOf('*');
        }
        StringBuilder sb2 = new StringBuilder(length);
        for (int i11 = 0; i11 < length; i11++) {
            char cCharAt = str.charAt(i11);
            if (f21273a.matcher(String.valueOf(cCharAt)).matches()) {
                if (i10 % 2 == 0) {
                    cCharAt = '*';
                }
                i10++;
            }
            sb2.append(cCharAt);
        }
        return sb2.toString();
    }

    /* renamed from: b */
    public static String m17901b(String str, String str2) {
        StringBuilder sb2 = new StringBuilder(512);
        if (!TextUtils.isEmpty(str)) {
            sb2.append(str);
        }
        if (!TextUtils.isEmpty(str2)) {
            sb2.append(m17900a(str2));
        }
        return sb2.toString();
    }

    /* renamed from: c */
    public static String m17902c(String str, boolean z10) {
        StringBuilder sb2 = new StringBuilder(512);
        if (!TextUtils.isEmpty(str)) {
            if (z10) {
                sb2.append(m17900a(str));
            } else {
                sb2.append(str);
            }
        }
        return sb2.toString();
    }

    /* renamed from: d */
    public static void m17903d(String str, String str2) {
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        Log.e(str, m17902c(str2, false));
    }

    /* renamed from: e */
    public static void m17904e(String str, String str2, String str3) {
        if (TextUtils.isEmpty(str2) && TextUtils.isEmpty(str3)) {
            return;
        }
        Log.e(str, m17901b(str2, str3));
    }

    /* renamed from: f */
    public static void m17905f(String str, String str2) {
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        Log.i(str, m17902c(str2, false));
    }
}
