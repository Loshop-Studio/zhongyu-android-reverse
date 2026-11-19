package p088l;

import android.net.Uri;

/* renamed from: l.b */
/* loaded from: classes2.dex */
public abstract class AbstractC4330b {
    /* renamed from: a */
    public static boolean m5332a(Uri uri) {
        return m5333b(uri) && !m5336e(uri);
    }

    /* renamed from: b */
    public static boolean m5333b(Uri uri) {
        return uri != null && "content".equals(uri.getScheme()) && "media".equals(uri.getAuthority());
    }

    /* renamed from: c */
    public static boolean m5334c(Uri uri) {
        return m5333b(uri) && m5336e(uri);
    }

    /* renamed from: d */
    public static boolean m5335d(int i4, int i5) {
        return i4 != Integer.MIN_VALUE && i5 != Integer.MIN_VALUE && i4 <= 512 && i5 <= 384;
    }

    /* renamed from: e */
    public static boolean m5336e(Uri uri) {
        return uri.getPathSegments().contains("video");
    }
}
