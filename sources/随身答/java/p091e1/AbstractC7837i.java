package p091e1;

import android.text.TextUtils;
import java.util.Collection;

/* renamed from: e1.i */
/* loaded from: classes3.dex */
public abstract class AbstractC7837i {
    /* renamed from: a */
    public static void m12253a(boolean z9, String str) {
        if (!z9) {
            throw new IllegalArgumentException(str);
        }
    }

    /* renamed from: b */
    public static String m12254b(String str) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("Must not be null or empty");
        }
        return str;
    }

    /* renamed from: c */
    public static Collection m12255c(Collection collection) {
        if (collection.isEmpty()) {
            throw new IllegalArgumentException("Must not be empty.");
        }
        return collection;
    }

    /* renamed from: d */
    public static Object m12256d(Object obj) {
        return m12257e(obj, "Argument must not be null");
    }

    /* renamed from: e */
    public static Object m12257e(Object obj, String str) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(str);
    }
}
