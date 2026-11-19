package p171m;

import android.net.Uri;

/* renamed from: m.b */
/* loaded from: classes3.dex */
public abstract class AbstractC9287b {
    /* renamed from: a */
    public static boolean m17080a(Uri uri) {
        return m17082c(uri) && uri.getPathSegments().contains("picker");
    }

    /* renamed from: b */
    public static boolean m17081b(Uri uri) {
        return m17082c(uri) && !m17085f(uri);
    }

    /* renamed from: c */
    public static boolean m17082c(Uri uri) {
        return uri != null && "content".equals(uri.getScheme()) && "media".equals(uri.getAuthority());
    }

    /* renamed from: d */
    public static boolean m17083d(Uri uri) {
        return m17082c(uri) && m17085f(uri);
    }

    /* renamed from: e */
    public static boolean m17084e(int i10, int i11) {
        return i10 != Integer.MIN_VALUE && i11 != Integer.MIN_VALUE && i10 <= 512 && i11 <= 384;
    }

    /* renamed from: f */
    public static boolean m17085f(Uri uri) {
        return uri.getPathSegments().contains("video");
    }
}
