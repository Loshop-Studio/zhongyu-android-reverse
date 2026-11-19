package p184i0;

import android.net.Uri;

/* renamed from: i0.b */
/* loaded from: classes3.dex */
public abstract class AbstractC9558b {
    /* renamed from: a */
    public static boolean m18791a(Uri uri) {
        return m18793c(uri) && uri.getPathSegments().contains("picker");
    }

    /* renamed from: b */
    public static boolean m18792b(Uri uri) {
        return m18793c(uri) && !m18796f(uri);
    }

    /* renamed from: c */
    public static boolean m18793c(Uri uri) {
        return uri != null && "content".equals(uri.getScheme()) && "media".equals(uri.getAuthority());
    }

    /* renamed from: d */
    public static boolean m18794d(Uri uri) {
        return m18793c(uri) && m18796f(uri);
    }

    /* renamed from: e */
    public static boolean m18795e(int i10, int i11) {
        return i10 != Integer.MIN_VALUE && i11 != Integer.MIN_VALUE && i10 <= 512 && i11 <= 384;
    }

    /* renamed from: f */
    public static boolean m18796f(Uri uri) {
        return uri.getPathSegments().contains("video");
    }
}
