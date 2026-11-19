package p254n0;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.util.Log;
import java.io.InputStream;
import java.util.List;
import p168h0.C9438e;
import p254n0.InterfaceC10300n;

/* renamed from: n0.t */
/* loaded from: classes3.dex */
public final class C10306t implements InterfaceC10300n {

    /* renamed from: a */
    public final Context f24572a;

    /* renamed from: b */
    public final InterfaceC10300n f24573b;

    /* renamed from: n0.t$a */
    public static final class a implements InterfaceC10301o {

        /* renamed from: a */
        public final Context f24574a;

        public a(Context context) {
            this.f24574a = context;
        }

        @Override // p254n0.InterfaceC10301o
        /* renamed from: c */
        public InterfaceC10300n mo21425c(C10304r c10304r) {
            return new C10306t(this.f24574a, c10304r.m21491d(Integer.class, AssetFileDescriptor.class));
        }
    }

    /* renamed from: n0.t$b */
    public static final class b implements InterfaceC10301o {

        /* renamed from: a */
        public final Context f24575a;

        public b(Context context) {
            this.f24575a = context;
        }

        @Override // p254n0.InterfaceC10301o
        /* renamed from: c */
        public InterfaceC10300n mo21425c(C10304r c10304r) {
            return new C10306t(this.f24575a, c10304r.m21491d(Integer.class, InputStream.class));
        }
    }

    public C10306t(Context context, InterfaceC10300n interfaceC10300n) {
        this.f24572a = context.getApplicationContext();
        this.f24573b = interfaceC10300n;
    }

    /* renamed from: e */
    public static InterfaceC10301o m21500e(Context context) {
        return new a(context);
    }

    /* renamed from: f */
    public static InterfaceC10301o m21501f(Context context) {
        return new b(context);
    }

    @Override // p254n0.InterfaceC10300n
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public InterfaceC10300n.a mo21421b(Uri uri, int i10, int i11, C9438e c9438e) {
        List<String> pathSegments = uri.getPathSegments();
        if (pathSegments.size() == 1) {
            return m21504g(uri, i10, i11, c9438e);
        }
        if (pathSegments.size() == 2) {
            return m21505h(uri, i10, i11, c9438e);
        }
        if (!Log.isLoggable("ResourceUriLoader", 5)) {
            return null;
        }
        Log.w("ResourceUriLoader", "Failed to parse resource uri: " + uri);
        return null;
    }

    @Override // p254n0.InterfaceC10300n
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean mo21420a(Uri uri) {
        return "android.resource".equals(uri.getScheme()) && this.f24572a.getPackageName().equals(uri.getAuthority());
    }

    /* renamed from: g */
    public final InterfaceC10300n.a m21504g(Uri uri, int i10, int i11, C9438e c9438e) throws NumberFormatException {
        try {
            int i12 = Integer.parseInt(uri.getPathSegments().get(0));
            if (i12 != 0) {
                return this.f24573b.mo21421b(Integer.valueOf(i12), i10, i11, c9438e);
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
    public final InterfaceC10300n.a m21505h(Uri uri, int i10, int i11, C9438e c9438e) {
        List<String> pathSegments = uri.getPathSegments();
        int identifier = this.f24572a.getResources().getIdentifier(pathSegments.get(1), pathSegments.get(0), this.f24572a.getPackageName());
        if (identifier != 0) {
            return this.f24573b.mo21421b(Integer.valueOf(identifier), i10, i11, c9438e);
        }
        if (!Log.isLoggable("ResourceUriLoader", 5)) {
            return null;
        }
        Log.w("ResourceUriLoader", "Failed to find resource id for: " + uri);
        return null;
    }
}
