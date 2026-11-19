package p097l0;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.util.Log;
import java.io.InputStream;
import java.util.List;
import p053f0.C6285d;
import p097l0.InterfaceC7280n;

/* renamed from: l0.t */
/* loaded from: classes3.dex */
public final class C7286t implements InterfaceC7280n {

    /* renamed from: a */
    public final Context f9260a;

    /* renamed from: b */
    public final InterfaceC7280n f9261b;

    /* renamed from: l0.t$a */
    public static final class a implements InterfaceC7281o {

        /* renamed from: a */
        public final Context f9262a;

        public a(Context context) {
            this.f9262a = context;
        }

        @Override // p097l0.InterfaceC7281o
        /* renamed from: d */
        public InterfaceC7280n mo8195d(C7284r c7284r) {
            return new C7286t(this.f9262a, c7284r.m8265d(Integer.class, AssetFileDescriptor.class));
        }
    }

    /* renamed from: l0.t$b */
    public static final class b implements InterfaceC7281o {

        /* renamed from: a */
        public final Context f9263a;

        public b(Context context) {
            this.f9263a = context;
        }

        @Override // p097l0.InterfaceC7281o
        /* renamed from: d */
        public InterfaceC7280n mo8195d(C7284r c7284r) {
            return new C7286t(this.f9263a, c7284r.m8265d(Integer.class, InputStream.class));
        }
    }

    public C7286t(Context context, InterfaceC7280n interfaceC7280n) {
        this.f9260a = context.getApplicationContext();
        this.f9261b = interfaceC7280n;
    }

    /* renamed from: e */
    public static InterfaceC7281o m8274e(Context context) {
        return new a(context);
    }

    /* renamed from: f */
    public static InterfaceC7281o m8275f(Context context) {
        return new b(context);
    }

    @Override // p097l0.InterfaceC7280n
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public InterfaceC7280n.a mo8191b(Uri uri, int i6, int i7, C6285d c6285d) {
        List<String> pathSegments = uri.getPathSegments();
        if (pathSegments.size() == 1) {
            return m8278g(uri, i6, i7, c6285d);
        }
        if (pathSegments.size() == 2) {
            return m8279h(uri, i6, i7, c6285d);
        }
        if (!Log.isLoggable("ResourceUriLoader", 5)) {
            return null;
        }
        Log.w("ResourceUriLoader", "Failed to parse resource uri: " + uri);
        return null;
    }

    @Override // p097l0.InterfaceC7280n
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean mo8190a(Uri uri) {
        return "android.resource".equals(uri.getScheme()) && this.f9260a.getPackageName().equals(uri.getAuthority());
    }

    /* renamed from: g */
    public final InterfaceC7280n.a m8278g(Uri uri, int i6, int i7, C6285d c6285d) throws NumberFormatException {
        try {
            int i8 = Integer.parseInt(uri.getPathSegments().get(0));
            if (i8 != 0) {
                return this.f9261b.mo8191b(Integer.valueOf(i8), i6, i7, c6285d);
            }
            if (Log.isLoggable("ResourceUriLoader", 5)) {
                Log.w("ResourceUriLoader", "Failed to parse a valid non-0 resource id from: " + uri);
            }
            return null;
        } catch (NumberFormatException e6) {
            if (Log.isLoggable("ResourceUriLoader", 5)) {
                Log.w("ResourceUriLoader", "Failed to parse resource id from: " + uri, e6);
            }
            return null;
        }
    }

    /* renamed from: h */
    public final InterfaceC7280n.a m8279h(Uri uri, int i6, int i7, C6285d c6285d) {
        List<String> pathSegments = uri.getPathSegments();
        int identifier = this.f9260a.getResources().getIdentifier(pathSegments.get(1), pathSegments.get(0), this.f9260a.getPackageName());
        if (identifier != 0) {
            return this.f9261b.mo8191b(Integer.valueOf(identifier), i6, i7, c6285d);
        }
        if (!Log.isLoggable("ResourceUriLoader", 5)) {
            return null;
        }
        Log.w("ResourceUriLoader", "Failed to find resource id for: " + uri);
        return null;
    }
}
