package p130v;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.net.Uri;
import java.util.List;
import p076j.C3794d;
import p076j.InterfaceC3795e;
import p093m.InterfaceC4361j;

/* renamed from: v.d */
/* loaded from: classes2.dex */
public class C4616d implements InterfaceC3795e {

    /* renamed from: a */
    public final Context f5826a;

    public C4616d(Context context) {
        this.f5826a = context.getApplicationContext();
    }

    @Override // p076j.InterfaceC3795e
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public InterfaceC4361j mo1966b(Uri uri, int i4, int i5, C3794d c3794d) {
        Context contextM6381d = m6381d(uri, uri.getAuthority());
        return C4615c.m6379d(AbstractC4613a.m6374b(this.f5826a, contextM6381d, m6384g(contextM6381d, uri)));
    }

    /* renamed from: d */
    public final Context m6381d(Uri uri, String str) {
        if (str.equals(this.f5826a.getPackageName())) {
            return this.f5826a;
        }
        try {
            return this.f5826a.createPackageContext(str, 0);
        } catch (PackageManager.NameNotFoundException e4) {
            if (str.contains(this.f5826a.getPackageName())) {
                return this.f5826a;
            }
            throw new IllegalArgumentException("Failed to obtain context or unrecognized Uri format for: " + uri, e4);
        }
    }

    /* renamed from: e */
    public final int m6382e(Uri uri) {
        try {
            return Integer.parseInt(uri.getPathSegments().get(0));
        } catch (NumberFormatException e4) {
            throw new IllegalArgumentException("Unrecognized Uri format: " + uri, e4);
        }
    }

    /* renamed from: f */
    public final int m6383f(Context context, Uri uri) {
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
    public final int m6384g(Context context, Uri uri) {
        List<String> pathSegments = uri.getPathSegments();
        if (pathSegments.size() == 2) {
            return m6383f(context, uri);
        }
        if (pathSegments.size() == 1) {
            return m6382e(uri);
        }
        throw new IllegalArgumentException("Unrecognized Uri format: " + uri);
    }

    @Override // p076j.InterfaceC3795e
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public boolean mo1965a(Uri uri, C3794d c3794d) {
        return uri.getScheme().equals("android.resource");
    }
}
