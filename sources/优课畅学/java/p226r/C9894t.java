package p226r;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.util.Log;
import java.io.InputStream;
import java.util.List;
import p160l.C9230d;
import p226r.InterfaceC9888n;

/* renamed from: r.t */
/* loaded from: classes3.dex */
public final class C9894t implements InterfaceC9888n {

    /* renamed from: a */
    public final Context f19849a;

    /* renamed from: b */
    public final InterfaceC9888n f19850b;

    /* renamed from: r.t$a */
    public static final class a implements InterfaceC9889o {

        /* renamed from: a */
        public final Context f19851a;

        public a(Context context) {
            this.f19851a = context;
        }

        @Override // p226r.InterfaceC9889o
        /* renamed from: d */
        public InterfaceC9888n mo18450d(C9892r c9892r) {
            return new C9894t(this.f19851a, c9892r.m18520d(Integer.class, AssetFileDescriptor.class));
        }
    }

    /* renamed from: r.t$b */
    public static final class b implements InterfaceC9889o {

        /* renamed from: a */
        public final Context f19852a;

        public b(Context context) {
            this.f19852a = context;
        }

        @Override // p226r.InterfaceC9889o
        /* renamed from: d */
        public InterfaceC9888n mo18450d(C9892r c9892r) {
            return new C9894t(this.f19852a, c9892r.m18520d(Integer.class, InputStream.class));
        }
    }

    public C9894t(Context context, InterfaceC9888n interfaceC9888n) {
        this.f19849a = context.getApplicationContext();
        this.f19850b = interfaceC9888n;
    }

    /* renamed from: e */
    public static InterfaceC9889o m18529e(Context context) {
        return new a(context);
    }

    /* renamed from: f */
    public static InterfaceC9889o m18530f(Context context) {
        return new b(context);
    }

    @Override // p226r.InterfaceC9888n
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public InterfaceC9888n.a mo18446b(Uri uri, int i10, int i11, C9230d c9230d) {
        List<String> pathSegments = uri.getPathSegments();
        if (pathSegments.size() == 1) {
            return m18533g(uri, i10, i11, c9230d);
        }
        if (pathSegments.size() == 2) {
            return m18534h(uri, i10, i11, c9230d);
        }
        if (!Log.isLoggable("ResourceUriLoader", 5)) {
            return null;
        }
        Log.w("ResourceUriLoader", "Failed to parse resource uri: " + uri);
        return null;
    }

    @Override // p226r.InterfaceC9888n
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean mo18445a(Uri uri) {
        return "android.resource".equals(uri.getScheme()) && this.f19849a.getPackageName().equals(uri.getAuthority());
    }

    /* renamed from: g */
    public final InterfaceC9888n.a m18533g(Uri uri, int i10, int i11, C9230d c9230d) throws NumberFormatException {
        try {
            int i12 = Integer.parseInt(uri.getPathSegments().get(0));
            if (i12 != 0) {
                return this.f19850b.mo18446b(Integer.valueOf(i12), i10, i11, c9230d);
            }
            if (Log.isLoggable("ResourceUriLoader", 5)) {
                Log.w("ResourceUriLoader", "Failed to parse a valid non-0 resource id from: " + uri);
            }
            return null;
        } catch (NumberFormatException e10) {
            if (Log.isLoggable("ResourceUriLoader", 5)) {
                Log.w("ResourceUriLoader", "Failed to parse resource id from: " + uri, e10);
            }
            return null;
        }
    }

    /* renamed from: h */
    public final InterfaceC9888n.a m18534h(Uri uri, int i10, int i11, C9230d c9230d) {
        List<String> pathSegments = uri.getPathSegments();
        int identifier = this.f19849a.getResources().getIdentifier(pathSegments.get(1), pathSegments.get(0), this.f19849a.getPackageName());
        if (identifier != 0) {
            return this.f19850b.mo18446b(Integer.valueOf(identifier), i10, i11, c9230d);
        }
        if (!Log.isLoggable("ResourceUriLoader", 5)) {
            return null;
        }
        Log.w("ResourceUriLoader", "Failed to find resource id for: " + uri);
        return null;
    }
}
