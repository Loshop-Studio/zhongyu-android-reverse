package p097l0;

import android.content.res.AssetManager;
import android.net.Uri;
import com.bumptech.glide.load.data.C4696h;
import com.bumptech.glide.load.data.C4701m;
import com.bumptech.glide.load.data.InterfaceC4692d;
import p002a1.C0007b;
import p053f0.C6285d;
import p097l0.InterfaceC7280n;

/* renamed from: l0.a */
/* loaded from: classes3.dex */
public class C7267a implements InterfaceC7280n {

    /* renamed from: c */
    public static final int f9170c = 22;

    /* renamed from: a */
    public final AssetManager f9171a;

    /* renamed from: b */
    public final a f9172b;

    /* renamed from: l0.a$a */
    public interface a {
        /* renamed from: a */
        InterfaceC4692d mo8194a(AssetManager assetManager, String str);
    }

    /* renamed from: l0.a$b */
    public static class b implements InterfaceC7281o, a {

        /* renamed from: a */
        public final AssetManager f9173a;

        public b(AssetManager assetManager) {
            this.f9173a = assetManager;
        }

        @Override // p097l0.C7267a.a
        /* renamed from: a */
        public InterfaceC4692d mo8194a(AssetManager assetManager, String str) {
            return new C4696h(assetManager, str);
        }

        @Override // p097l0.InterfaceC7281o
        /* renamed from: d */
        public InterfaceC7280n mo8195d(C7284r c7284r) {
            return new C7267a(this.f9173a, this);
        }
    }

    /* renamed from: l0.a$c */
    public static class c implements InterfaceC7281o, a {

        /* renamed from: a */
        public final AssetManager f9174a;

        public c(AssetManager assetManager) {
            this.f9174a = assetManager;
        }

        @Override // p097l0.C7267a.a
        /* renamed from: a */
        public InterfaceC4692d mo8194a(AssetManager assetManager, String str) {
            return new C4701m(assetManager, str);
        }

        @Override // p097l0.InterfaceC7281o
        /* renamed from: d */
        public InterfaceC7280n mo8195d(C7284r c7284r) {
            return new C7267a(this.f9174a, this);
        }
    }

    public C7267a(AssetManager assetManager, a aVar) {
        this.f9171a = assetManager;
        this.f9172b = aVar;
    }

    @Override // p097l0.InterfaceC7280n
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public InterfaceC7280n.a mo8191b(Uri uri, int i6, int i7, C6285d c6285d) {
        return new InterfaceC7280n.a(new C0007b(uri), this.f9172b.mo8194a(this.f9171a, uri.toString().substring(f9170c)));
    }

    @Override // p097l0.InterfaceC7280n
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean mo8190a(Uri uri) {
        return "file".equals(uri.getScheme()) && !uri.getPathSegments().isEmpty() && "android_asset".equals(uri.getPathSegments().get(0));
    }
}
