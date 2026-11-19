package p281w;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.net.Uri;
import android.text.TextUtils;
import java.util.List;
import p116h0.AbstractC8706j;
import p160l.C9229c;
import p160l.C9230d;
import p160l.InterfaceC9231e;
import p182n.InterfaceC9357j;

/* renamed from: w.k */
/* loaded from: classes3.dex */
public class C10269k implements InterfaceC9231e {

    /* renamed from: b */
    public static final C9229c f20498b = C9229c.m16934e("com.bumptech.glide.load.resource.bitmap.Downsampler.Theme");

    /* renamed from: a */
    public final Context f20499a;

    public C10269k(Context context) {
        this.f20499a = context.getApplicationContext();
    }

    @Override // p160l.InterfaceC9231e
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public InterfaceC9357j mo3061a(Uri uri, int i10, int i11, C9230d c9230d) {
        String authority = uri.getAuthority();
        if (!TextUtils.isEmpty(authority)) {
            Context contextM19241d = m19241d(uri, authority);
            int iM19244g = m19244g(contextM19241d, uri);
            Resources.Theme theme = ((String) AbstractC8706j.m14181d(authority)).equals(this.f20499a.getPackageName()) ? (Resources.Theme) c9230d.m16940c(f20498b) : null;
            return C10268j.m19239c(theme == null ? AbstractC10266h.m19234b(this.f20499a, contextM19241d, iM19244g) : AbstractC10266h.m19233a(this.f20499a, iM19244g, theme));
        }
        throw new IllegalStateException("Package name for " + uri + " is null or empty");
    }

    /* renamed from: d */
    public final Context m19241d(Uri uri, String str) {
        if (str.equals(this.f20499a.getPackageName())) {
            return this.f20499a;
        }
        try {
            return this.f20499a.createPackageContext(str, 0);
        } catch (PackageManager.NameNotFoundException e10) {
            if (str.contains(this.f20499a.getPackageName())) {
                return this.f20499a;
            }
            throw new IllegalArgumentException("Failed to obtain context or unrecognized Uri format for: " + uri, e10);
        }
    }

    /* renamed from: e */
    public final int m19242e(Uri uri) {
        try {
            return Integer.parseInt(uri.getPathSegments().get(0));
        } catch (NumberFormatException e10) {
            throw new IllegalArgumentException("Unrecognized Uri format: " + uri, e10);
        }
    }

    /* renamed from: f */
    public final int m19243f(Context context, Uri uri) {
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
    public final int m19244g(Context context, Uri uri) {
        List<String> pathSegments = uri.getPathSegments();
        if (pathSegments.size() == 2) {
            return m19243f(context, uri);
        }
        if (pathSegments.size() == 1) {
            return m19242e(uri);
        }
        throw new IllegalArgumentException("Unrecognized Uri format: " + uri);
    }

    @Override // p160l.InterfaceC9231e
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public boolean mo3062b(Uri uri, C9230d c9230d) {
        String scheme = uri.getScheme();
        return scheme != null && scheme.equals("android.resource");
    }
}
