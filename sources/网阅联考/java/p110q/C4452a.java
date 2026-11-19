package p110q;

import android.content.res.AssetManager;
import android.net.Uri;
import p057f0.C3731b;
import p076j.C3794d;
import p081k.C3847h;
import p081k.C3853n;
import p081k.InterfaceC3843d;
import p110q.InterfaceC4464m;

/* renamed from: q.a */
/* loaded from: classes2.dex */
public class C4452a implements InterfaceC4464m {

    /* renamed from: c */
    public static final int f5143c = 22;

    /* renamed from: a */
    public final AssetManager f5144a;

    /* renamed from: b */
    public final a f5145b;

    /* renamed from: q.a$a */
    public interface a {
        /* renamed from: a */
        InterfaceC3843d mo5674a(AssetManager assetManager, String str);
    }

    /* renamed from: q.a$b */
    public static class b implements InterfaceC4465n, a {

        /* renamed from: a */
        public final AssetManager f5146a;

        public b(AssetManager assetManager) {
            this.f5146a = assetManager;
        }

        @Override // p110q.C4452a.a
        /* renamed from: a */
        public InterfaceC3843d mo5674a(AssetManager assetManager, String str) {
            return new C3847h(assetManager, str);
        }

        @Override // p110q.InterfaceC4465n
        /* renamed from: b */
        public InterfaceC4464m mo5675b(C4468q c4468q) {
            return new C4452a(this.f5146a, this);
        }
    }

    /* renamed from: q.a$c */
    public static class c implements InterfaceC4465n, a {

        /* renamed from: a */
        public final AssetManager f5147a;

        public c(AssetManager assetManager) {
            this.f5147a = assetManager;
        }

        @Override // p110q.C4452a.a
        /* renamed from: a */
        public InterfaceC3843d mo5674a(AssetManager assetManager, String str) {
            return new C3853n(assetManager, str);
        }

        @Override // p110q.InterfaceC4465n
        /* renamed from: b */
        public InterfaceC4464m mo5675b(C4468q c4468q) {
            return new C4452a(this.f5147a, this);
        }
    }

    public C4452a(AssetManager assetManager, a aVar) {
        this.f5144a = assetManager;
        this.f5145b = aVar;
    }

    @Override // p110q.InterfaceC4464m
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public InterfaceC4464m.a mo5671b(Uri uri, int i4, int i5, C3794d c3794d) {
        return new InterfaceC4464m.a(new C3731b(uri), this.f5145b.mo5674a(this.f5144a, uri.toString().substring(f5143c)));
    }

    @Override // p110q.InterfaceC4464m
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean mo5670a(Uri uri) {
        return "file".equals(uri.getScheme()) && !uri.getPathSegments().isEmpty() && "android_asset".equals(uri.getPathSegments().get(0));
    }
}
