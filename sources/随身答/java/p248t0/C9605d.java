package p248t0;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.net.Uri;
import java.util.List;
import p122h0.C8084d;
import p122h0.InterfaceC8085e;
import p152k0.InterfaceC8259j;

/* renamed from: t0.d */
/* loaded from: classes3.dex */
public class C9605d implements InterfaceC8085e {

    /* renamed from: a */
    public final Context f16824a;

    public C9605d(Context context) {
        this.f16824a = context.getApplicationContext();
    }

    @Override // p122h0.InterfaceC8085e
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public InterfaceC8259j mo3290b(Uri uri, int i9, int i10, C8084d c8084d) {
        Context contextM15834d = m15834d(uri, uri.getAuthority());
        return C9604c.m15832c(AbstractC9602a.m15827b(this.f16824a, contextM15834d, m15837g(contextM15834d, uri)));
    }

    /* renamed from: d */
    public final Context m15834d(Uri uri, String str) {
        if (str.equals(this.f16824a.getPackageName())) {
            return this.f16824a;
        }
        try {
            return this.f16824a.createPackageContext(str, 0);
        } catch (PackageManager.NameNotFoundException e10) {
            if (str.contains(this.f16824a.getPackageName())) {
                return this.f16824a;
            }
            throw new IllegalArgumentException("Failed to obtain context or unrecognized Uri format for: " + uri, e10);
        }
    }

    /* renamed from: e */
    public final int m15835e(Uri uri) {
        try {
            return Integer.parseInt(uri.getPathSegments().get(0));
        } catch (NumberFormatException e10) {
            throw new IllegalArgumentException("Unrecognized Uri format: " + uri, e10);
        }
    }

    /* renamed from: f */
    public final int m15836f(Context context, Uri uri) {
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
    public final int m15837g(Context context, Uri uri) {
        List<String> pathSegments = uri.getPathSegments();
        if (pathSegments.size() == 2) {
            return m15836f(context, uri);
        }
        if (pathSegments.size() == 1) {
            return m15835e(uri);
        }
        throw new IllegalArgumentException("Unrecognized Uri format: " + uri);
    }

    @Override // p122h0.InterfaceC8085e
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public boolean mo3289a(Uri uri, C8084d c8084d) {
        return uri.getScheme().equals("android.resource");
    }
}
