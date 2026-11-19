package p116h0;

import android.text.TextUtils;
import java.util.Collection;

/* renamed from: h0.j */
/* loaded from: classes3.dex */
public abstract class AbstractC8706j {
    /* renamed from: a */
    public static void m14178a(boolean z10, String str) {
        if (!z10) {
            throw new IllegalArgumentException(str);
        }
    }

    /* renamed from: b */
    public static String m14179b(String str) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("Must not be null or empty");
        }
        return str;
    }

    /* renamed from: c */
    public static Collection m14180c(Collection collection) {
        if (collection.isEmpty()) {
            throw new IllegalArgumentException("Must not be empty.");
        }
        return collection;
    }

    /* renamed from: d */
    public static Object m14181d(Object obj) {
        return m14182e(obj, "Argument must not be null");
    }

    /* renamed from: e */
    public static Object m14182e(Object obj, String str) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(str);
    }
}
