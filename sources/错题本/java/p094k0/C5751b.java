package p094k0;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import java.util.List;
import p016b0.InterfaceC3072g0;
import p024c0.InterfaceC3205b;
import p077i0.C5647c;
import p169t6.AbstractC6600a;
import p195x.C6740d;
import p202y.C6763f;
import p202y.InterfaceC6764g;

/* renamed from: k0.b */
/* loaded from: classes2.dex */
public final class C5751b implements InterfaceC6764g {

    /* renamed from: a */
    public final /* synthetic */ int f9101a = 0;

    /* renamed from: b */
    public final Object f9102b;

    public C5751b(InterfaceC3205b interfaceC3205b) {
        this.f9102b = interfaceC3205b;
    }

    @Override // p202y.InterfaceC6764g
    /* renamed from: a */
    public final boolean mo4970a(Object obj, C6763f c6763f) {
        switch (this.f9101a) {
            case 0:
                return ((Uri) obj).getScheme().equals("android.resource");
            default:
                return true;
        }
    }

    @Override // p202y.InterfaceC6764g
    /* renamed from: b */
    public final InterfaceC3072g0 mo4971b(Object obj, int i, int i8, C6763f c6763f) {
        switch (this.f9101a) {
            case 0:
                return m5093c((Uri) obj);
            default:
                return C5647c.m4972b(((C6740d) obj).m6424b(), (InterfaceC3205b) this.f9102b);
        }
    }

    /* renamed from: c */
    public InterfaceC3072g0 m5093c(Uri uri) throws PackageManager.NameNotFoundException, NumberFormatException {
        Context contextCreatePackageContext;
        int identifier;
        String authority = uri.getAuthority();
        Context context = (Context) this.f9102b;
        if (authority.equals(context.getPackageName())) {
            contextCreatePackageContext = context;
        } else {
            try {
                contextCreatePackageContext = context.createPackageContext(authority, 0);
            } catch (PackageManager.NameNotFoundException e) {
                if (!authority.contains(context.getPackageName())) {
                    throw new IllegalArgumentException("Failed to obtain context or unrecognized Uri format for: " + uri, e);
                }
            }
        }
        List<String> pathSegments = uri.getPathSegments();
        if (pathSegments.size() == 2) {
            List<String> pathSegments2 = uri.getPathSegments();
            String authority2 = uri.getAuthority();
            String str = pathSegments2.get(0);
            String str2 = pathSegments2.get(1);
            identifier = contextCreatePackageContext.getResources().getIdentifier(str2, str, authority2);
            if (identifier == 0) {
                identifier = Resources.getSystem().getIdentifier(str2, str, "android");
            }
            if (identifier == 0) {
                throw new IllegalArgumentException("Failed to find resource id for: " + uri);
            }
        } else {
            if (pathSegments.size() != 1) {
                throw new IllegalArgumentException("Unrecognized Uri format: " + uri);
            }
            try {
                identifier = Integer.parseInt(uri.getPathSegments().get(0));
            } catch (NumberFormatException e4) {
                throw new IllegalArgumentException("Unrecognized Uri format: " + uri, e4);
            }
        }
        Drawable drawableM6233d = AbstractC6600a.m6233d(context, contextCreatePackageContext, identifier, null);
        if (drawableM6233d != null) {
            return new C5750a(drawableM6233d, 0);
        }
        return null;
    }

    public C5751b(Context context) {
        this.f9102b = context.getApplicationContext();
    }
}
