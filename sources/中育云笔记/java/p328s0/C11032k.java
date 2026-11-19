package p328s0;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.net.Uri;
import android.text.TextUtils;
import anet.channel.strategy.dispatch.DispatchConstants;
import java.util.List;
import p109d1.AbstractC8909j;
import p168h0.C9437d;
import p168h0.C9438e;
import p168h0.InterfaceC9439f;
import p198j0.InterfaceC9657j;

/* renamed from: s0.k */
/* loaded from: classes3.dex */
public class C11032k implements InterfaceC9439f {

    /* renamed from: b */
    public static final C9437d f26606b = C9437d.m18620e("com.bumptech.glide.load.resource.bitmap.Downsampler.Theme");

    /* renamed from: a */
    public final Context f26607a;

    public C11032k(Context context) {
        this.f26607a = context.getApplicationContext();
    }

    @Override // p168h0.InterfaceC9439f
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public InterfaceC9657j mo4266b(Uri uri, int i10, int i11, C9438e c9438e) {
        String authority = uri.getAuthority();
        if (!TextUtils.isEmpty(authority)) {
            Context contextM24380d = m24380d(uri, authority);
            int iM24383g = m24383g(contextM24380d, uri);
            Resources.Theme theme = ((String) AbstractC8909j.m17468d(authority)).equals(this.f26607a.getPackageName()) ? (Resources.Theme) c9438e.m18626c(f26606b) : null;
            return C11031j.m24378c(theme == null ? AbstractC11029h.m24373b(this.f26607a, contextM24380d, iM24383g) : AbstractC11029h.m24372a(this.f26607a, iM24383g, theme));
        }
        throw new IllegalStateException("Package name for " + uri + " is null or empty");
    }

    /* renamed from: d */
    public final Context m24380d(Uri uri, String str) {
        if (str.equals(this.f26607a.getPackageName())) {
            return this.f26607a;
        }
        try {
            return this.f26607a.createPackageContext(str, 0);
        } catch (PackageManager.NameNotFoundException e10) {
            if (str.contains(this.f26607a.getPackageName())) {
                return this.f26607a;
            }
            throw new IllegalArgumentException("Failed to obtain context or unrecognized Uri format for: " + uri, e10);
        }
    }

    /* renamed from: e */
    public final int m24381e(Uri uri) {
        try {
            return Integer.parseInt(uri.getPathSegments().get(0));
        } catch (NumberFormatException e10) {
            throw new IllegalArgumentException("Unrecognized Uri format: " + uri, e10);
        }
    }

    /* renamed from: f */
    public final int m24382f(Context context, Uri uri) {
        List<String> pathSegments = uri.getPathSegments();
        String authority = uri.getAuthority();
        String str = pathSegments.get(0);
        String str2 = pathSegments.get(1);
        int identifier = context.getResources().getIdentifier(str2, str, authority);
        if (identifier == 0) {
            identifier = Resources.getSystem().getIdentifier(str2, str, DispatchConstants.ANDROID);
        }
        if (identifier != 0) {
            return identifier;
        }
        throw new IllegalArgumentException("Failed to find resource id for: " + uri);
    }

    /* renamed from: g */
    public final int m24383g(Context context, Uri uri) {
        List<String> pathSegments = uri.getPathSegments();
        if (pathSegments.size() == 2) {
            return m24382f(context, uri);
        }
        if (pathSegments.size() == 1) {
            return m24381e(uri);
        }
        throw new IllegalArgumentException("Unrecognized Uri format: " + uri);
    }

    @Override // p168h0.InterfaceC9439f
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public boolean mo4265a(Uri uri, C9438e c9438e) {
        String scheme = uri.getScheme();
        return scheme != null && scheme.equals("android.resource");
    }
}
