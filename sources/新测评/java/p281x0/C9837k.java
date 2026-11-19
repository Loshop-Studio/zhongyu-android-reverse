package p281x0;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.net.Uri;
import android.text.TextUtils;
import java.util.List;
import p117i1.AbstractC7651j;
import p162m0.C8538c;
import p162m0.C8539d;
import p162m0.InterfaceC8540e;
import p184o0.InterfaceC8690j;

/* renamed from: x0.k */
/* loaded from: classes3.dex */
public class C9837k implements InterfaceC8540e {

    /* renamed from: b */
    public static final C8538c f17394b = C8538c.m14051e("com.bumptech.glide.load.resource.bitmap.Downsampler.Theme");

    /* renamed from: a */
    public final Context f17395a;

    public C9837k(Context context) {
        this.f17395a = context.getApplicationContext();
    }

    @Override // p162m0.InterfaceC8540e
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public InterfaceC8690j mo3617b(Uri uri, int i10, int i11, C8539d c8539d) {
        String authority = uri.getAuthority();
        if (!TextUtils.isEmpty(authority)) {
            Context contextM16474d = m16474d(uri, authority);
            int iM16477g = m16477g(contextM16474d, uri);
            Resources.Theme theme = ((String) AbstractC7651j.m12683d(authority)).equals(this.f17395a.getPackageName()) ? (Resources.Theme) c8539d.m14057c(f17394b) : null;
            return C9836j.m16472c(theme == null ? AbstractC9834h.m16467b(this.f17395a, contextM16474d, iM16477g) : AbstractC9834h.m16466a(this.f17395a, iM16477g, theme));
        }
        throw new IllegalStateException("Package name for " + uri + " is null or empty");
    }

    /* renamed from: d */
    public final Context m16474d(Uri uri, String str) {
        if (str.equals(this.f17395a.getPackageName())) {
            return this.f17395a;
        }
        try {
            return this.f17395a.createPackageContext(str, 0);
        } catch (PackageManager.NameNotFoundException e10) {
            if (str.contains(this.f17395a.getPackageName())) {
                return this.f17395a;
            }
            throw new IllegalArgumentException("Failed to obtain context or unrecognized Uri format for: " + uri, e10);
        }
    }

    /* renamed from: e */
    public final int m16475e(Uri uri) {
        try {
            return Integer.parseInt(uri.getPathSegments().get(0));
        } catch (NumberFormatException e10) {
            throw new IllegalArgumentException("Unrecognized Uri format: " + uri, e10);
        }
    }

    /* renamed from: f */
    public final int m16476f(Context context, Uri uri) {
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
    public final int m16477g(Context context, Uri uri) {
        List<String> pathSegments = uri.getPathSegments();
        if (pathSegments.size() == 2) {
            return m16476f(context, uri);
        }
        if (pathSegments.size() == 1) {
            return m16475e(uri);
        }
        throw new IllegalArgumentException("Unrecognized Uri format: " + uri);
    }

    @Override // p162m0.InterfaceC8540e
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public boolean mo3616a(Uri uri, C8539d c8539d) {
        String scheme = uri.getScheme();
        return scheme != null && scheme.equals("android.resource");
    }
}
