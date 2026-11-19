package p173n0;

import android.net.Uri;

/* renamed from: n0.b */
/* loaded from: classes3.dex */
public abstract class AbstractC8613b {
    /* renamed from: a */
    public static boolean m14176a(Uri uri) {
        return m14178c(uri) && uri.getPathSegments().contains("picker");
    }

    /* renamed from: b */
    public static boolean m14177b(Uri uri) {
        return m14178c(uri) && !m14181f(uri);
    }

    /* renamed from: c */
    public static boolean m14178c(Uri uri) {
        return uri != null && "content".equals(uri.getScheme()) && "media".equals(uri.getAuthority());
    }

    /* renamed from: d */
    public static boolean m14179d(Uri uri) {
        return m14178c(uri) && m14181f(uri);
    }

    /* renamed from: e */
    public static boolean m14180e(int i10, int i11) {
        return i10 != Integer.MIN_VALUE && i11 != Integer.MIN_VALUE && i10 <= 512 && i11 <= 384;
    }

    /* renamed from: f */
    public static boolean m14181f(Uri uri) {
        return uri.getPathSegments().contains("video");
    }
}
