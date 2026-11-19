package p188n5;

import android.text.TextUtils;

/* renamed from: n5.e */
/* loaded from: classes5.dex */
public abstract class AbstractC9425e {
    /* renamed from: a */
    public static boolean m17270a(String str) {
        return ((!TextUtils.isEmpty(str) && str.startsWith("http://")) || str.startsWith("https://")) && str.contains(".flv");
    }

    /* renamed from: b */
    public static boolean m17271b(String str) {
        return !TextUtils.isEmpty(str) && str.startsWith("rtmp");
    }
}
