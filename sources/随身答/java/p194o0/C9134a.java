package p194o0;

import android.content.res.AssetManager;
import android.net.Uri;
import p080d1.C7737b;
import p122h0.C8084d;
import p132i0.C8119h;
import p132i0.C8125n;
import p132i0.InterfaceC8115d;
import p194o0.InterfaceC9146m;

/* renamed from: o0.a */
/* loaded from: classes3.dex */
public class C9134a implements InterfaceC9146m {

    /* renamed from: c */
    public static final int f15374c = 22;

    /* renamed from: a */
    public final AssetManager f15375a;

    /* renamed from: b */
    public final a f15376b;

    /* renamed from: o0.a$a */
    public interface a {
        /* renamed from: a */
        InterfaceC8115d mo14659a(AssetManager assetManager, String str);
    }

    /* renamed from: o0.a$b */
    public static class b implements InterfaceC9147n, a {

        /* renamed from: a */
        public final AssetManager f15377a;

        public b(AssetManager assetManager) {
            this.f15377a = assetManager;
        }

        @Override // p194o0.C9134a.a
        /* renamed from: a */
        public InterfaceC8115d mo14659a(AssetManager assetManager, String str) {
            return new C8119h(assetManager, str);
        }

        @Override // p194o0.InterfaceC9147n
        /* renamed from: b */
        public InterfaceC9146m mo14660b(C9150q c9150q) {
            return new C9134a(this.f15377a, this);
        }
    }

    /* renamed from: o0.a$c */
    public static class c implements InterfaceC9147n, a {

        /* renamed from: a */
        public final AssetManager f15378a;

        public c(AssetManager assetManager) {
            this.f15378a = assetManager;
        }

        @Override // p194o0.C9134a.a
        /* renamed from: a */
        public InterfaceC8115d mo14659a(AssetManager assetManager, String str) {
            return new C8125n(assetManager, str);
        }

        @Override // p194o0.InterfaceC9147n
        /* renamed from: b */
        public InterfaceC9146m mo14660b(C9150q c9150q) {
            return new C9134a(this.f15378a, this);
        }
    }

    public C9134a(AssetManager assetManager, a aVar) {
        this.f15375a = assetManager;
        this.f15376b = aVar;
    }

    @Override // p194o0.InterfaceC9146m
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public InterfaceC9146m.a mo14656b(Uri uri, int i9, int i10, C8084d c8084d) {
        return new InterfaceC9146m.a(new C7737b(uri), this.f15376b.mo14659a(this.f15375a, uri.toString().substring(f15374c)));
    }

    @Override // p194o0.InterfaceC9146m
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean mo14655a(Uri uri) {
        return "file".equals(uri.getScheme()) && !uri.getPathSegments().isEmpty() && "android_asset".equals(uri.getPathSegments().get(0));
    }
}
