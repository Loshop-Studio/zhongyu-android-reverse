package p060g0;

import android.net.Uri;

/* renamed from: g0.b */
/* loaded from: classes3.dex */
public abstract class AbstractC6390b {
    /* renamed from: a */
    public static boolean m6898a(Uri uri) {
        return m6900c(uri) && uri.getPathSegments().contains("picker");
    }

    /* renamed from: b */
    public static boolean m6899b(Uri uri) {
        return m6900c(uri) && !m6903f(uri);
    }

    /* renamed from: c */
    public static boolean m6900c(Uri uri) {
        return uri != null && "content".equals(uri.getScheme()) && "media".equals(uri.getAuthority());
    }

    /* renamed from: d */
    public static boolean m6901d(Uri uri) {
        return m6900c(uri) && m6903f(uri);
    }

    /* renamed from: e */
    public static boolean m6902e(int i6, int i7) {
        return i6 != Integer.MIN_VALUE && i7 != Integer.MIN_VALUE && i6 <= 512 && i7 <= 384;
    }

    /* renamed from: f */
    public static boolean m6903f(Uri uri) {
        return uri.getPathSegments().contains("video");
    }
}
