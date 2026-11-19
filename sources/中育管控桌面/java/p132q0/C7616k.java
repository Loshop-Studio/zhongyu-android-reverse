package p132q0;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.net.Uri;
import android.text.TextUtils;
import java.util.List;
import p016b1.AbstractC4408j;
import p053f0.C6284c;
import p053f0.C6285d;
import p053f0.InterfaceC6286e;
import p067h0.InterfaceC6440j;

/* renamed from: q0.k */
/* loaded from: classes3.dex */
public class C7616k implements InterfaceC6286e {

    /* renamed from: b */
    public static final C6284c f10074b = C6284c.m6414e("com.bumptech.glide.load.resource.bitmap.Downsampler.Theme");

    /* renamed from: a */
    public final Context f10075a;

    public C7616k(Context context) {
        this.f10075a = context.getApplicationContext();
    }

    @Override // p053f0.InterfaceC6286e
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public InterfaceC6440j mo2796a(Uri uri, int i6, int i7, C6285d c6285d) {
        String authority = uri.getAuthority();
        if (!TextUtils.isEmpty(authority)) {
            Context contextM9048d = m9048d(uri, authority);
            int iM9051g = m9051g(contextM9048d, uri);
            Resources.Theme theme = ((String) AbstractC4408j.m1438d(authority)).equals(this.f10075a.getPackageName()) ? (Resources.Theme) c6285d.m6420c(f10074b) : null;
            return C7615j.m9046c(theme == null ? AbstractC7613h.m9041b(this.f10075a, contextM9048d, iM9051g) : AbstractC7613h.m9040a(this.f10075a, iM9051g, theme));
        }
        throw new IllegalStateException("Package name for " + uri + " is null or empty");
    }

    /* renamed from: d */
    public final Context m9048d(Uri uri, String str) {
        if (str.equals(this.f10075a.getPackageName())) {
            return this.f10075a;
        }
        try {
            return this.f10075a.createPackageContext(str, 0);
        } catch (PackageManager.NameNotFoundException e6) {
            if (str.contains(this.f10075a.getPackageName())) {
                return this.f10075a;
            }
            throw new IllegalArgumentException("Failed to obtain context or unrecognized Uri format for: " + uri, e6);
        }
    }

    /* renamed from: e */
    public final int m9049e(Uri uri) {
        try {
            return Integer.parseInt(uri.getPathSegments().get(0));
        } catch (NumberFormatException e6) {
            throw new IllegalArgumentException("Unrecognized Uri format: " + uri, e6);
        }
    }

    /* renamed from: f */
    public final int m9050f(Context context, Uri uri) {
        List<String> pathSegments = uri.getPathSegments();
        String authority = uri.getAuthority();
        String str = pathSegments.get(0);
        String str2 = pathSegments.get(1);
        int identifier = context.getResources().getIdentifier(str2, str, authority);
        if (identifier == 0) {
            identifier = Resources.getSystem().getIdentifier(str2, str, "android");
        }
        if (identifier != 0) {
            return identifier;
        }
        throw new IllegalArgumentException("Failed to find resource id for: " + uri);
    }

    /* renamed from: g */
    public final int m9051g(Context context, Uri uri) {
        List<String> pathSegments = uri.getPathSegments();
        if (pathSegments.size() == 2) {
            return m9050f(context, uri);
        }
        if (pathSegments.size() == 1) {
            return m9049e(uri);
        }
        throw new IllegalArgumentException("Unrecognized Uri format: " + uri);
    }

    @Override // p053f0.InterfaceC6286e
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public boolean mo2797b(Uri uri, C6285d c6285d) {
        String scheme = uri.getScheme();
        return scheme != null && scheme.equals("android.resource");
    }
}
