package p228s0;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.util.Log;
import java.io.InputStream;
import java.util.List;
import p162m0.C8539d;
import p228s0.InterfaceC9112n;

/* renamed from: s0.t */
/* loaded from: classes3.dex */
public final class C9118t implements InterfaceC9112n {

    /* renamed from: a */
    public final Context f15814a;

    /* renamed from: b */
    public final InterfaceC9112n f15815b;

    /* renamed from: s0.t$a */
    public static final class a implements InterfaceC9113o {

        /* renamed from: a */
        public final Context f15816a;

        public a(Context context) {
            this.f15816a = context;
        }

        @Override // p228s0.InterfaceC9113o
        /* renamed from: d */
        public InterfaceC9112n mo15359d(C9116r c9116r) {
            return new C9118t(this.f15816a, c9116r.m15429d(Integer.class, AssetFileDescriptor.class));
        }
    }

    /* renamed from: s0.t$b */
    public static final class b implements InterfaceC9113o {

        /* renamed from: a */
        public final Context f15817a;

        public b(Context context) {
            this.f15817a = context;
        }

        @Override // p228s0.InterfaceC9113o
        /* renamed from: d */
        public InterfaceC9112n mo15359d(C9116r c9116r) {
            return new C9118t(this.f15817a, c9116r.m15429d(Integer.class, InputStream.class));
        }
    }

    public C9118t(Context context, InterfaceC9112n interfaceC9112n) {
        this.f15814a = context.getApplicationContext();
        this.f15815b = interfaceC9112n;
    }

    /* renamed from: e */
    public static InterfaceC9113o m15438e(Context context) {
        return new a(context);
    }

    /* renamed from: f */
    public static InterfaceC9113o m15439f(Context context) {
        return new b(context);
    }

    @Override // p228s0.InterfaceC9112n
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public InterfaceC9112n.a mo15355b(Uri uri, int i10, int i11, C8539d c8539d) {
        List<String> pathSegments = uri.getPathSegments();
        if (pathSegments.size() == 1) {
            return m15442g(uri, i10, i11, c8539d);
        }
        if (pathSegments.size() == 2) {
            return m15443h(uri, i10, i11, c8539d);
        }
        if (!Log.isLoggable("ResourceUriLoader", 5)) {
            return null;
        }
        Log.w("ResourceUriLoader", "Failed to parse resource uri: " + uri);
        return null;
    }

    @Override // p228s0.InterfaceC9112n
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean mo15354a(Uri uri) {
        return "android.resource".equals(uri.getScheme()) && this.f15814a.getPackageName().equals(uri.getAuthority());
    }

    /* renamed from: g */
    public final InterfaceC9112n.a m15442g(Uri uri, int i10, int i11, C8539d c8539d) throws NumberFormatException {
        try {
            int i12 = Integer.parseInt(uri.getPathSegments().get(0));
            if (i12 != 0) {
                return this.f15815b.mo15355b(Integer.valueOf(i12), i10, i11, c8539d);
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
    public final InterfaceC9112n.a m15443h(Uri uri, int i10, int i11, C8539d c8539d) {
        List<String> pathSegments = uri.getPathSegments();
        int identifier = this.f15814a.getResources().getIdentifier(pathSegments.get(1), pathSegments.get(0), this.f15814a.getPackageName());
        if (identifier != 0) {
            return this.f15815b.mo15355b(Integer.valueOf(identifier), i10, i11, c8539d);
        }
        if (!Log.isLoggable("ResourceUriLoader", 5)) {
            return null;
        }
        Log.w("ResourceUriLoader", "Failed to find resource id for: " + uri);
        return null;
    }
}
