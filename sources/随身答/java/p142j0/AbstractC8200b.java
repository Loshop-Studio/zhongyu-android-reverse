package p142j0;

import android.net.Uri;

/* renamed from: j0.b */
/* loaded from: classes3.dex */
public abstract class AbstractC8200b {
    /* renamed from: a */
    public static boolean m13207a(Uri uri) {
        return m13208b(uri) && !m13211e(uri);
    }

    /* renamed from: b */
    public static boolean m13208b(Uri uri) {
        return uri != null && "content".equals(uri.getScheme()) && "media".equals(uri.getAuthority());
    }

    /* renamed from: c */
    public static boolean m13209c(Uri uri) {
        return m13208b(uri) && m13211e(uri);
    }

    /* renamed from: d */
    public static boolean m13210d(int i9, int i10) {
        return i9 != Integer.MIN_VALUE && i10 != Integer.MIN_VALUE && i9 <= 512 && i10 <= 384;
    }

    /* renamed from: e */
    public static boolean m13211e(Uri uri) {
        return uri.getPathSegments().contains("video");
    }
}
