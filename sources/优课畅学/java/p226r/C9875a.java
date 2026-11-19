package p226r;

import android.content.res.AssetManager;
import android.net.Uri;
import com.bumptech.glide.load.data.C5409h;
import com.bumptech.glide.load.data.C5414m;
import com.bumptech.glide.load.data.InterfaceC5405d;
import p105g0.C8514b;
import p160l.C9230d;
import p226r.InterfaceC9888n;

/* renamed from: r.a */
/* loaded from: classes3.dex */
public class C9875a implements InterfaceC9888n {

    /* renamed from: c */
    public static final int f19759c = 22;

    /* renamed from: a */
    public final AssetManager f19760a;

    /* renamed from: b */
    public final a f19761b;

    /* renamed from: r.a$a */
    public interface a {
        /* renamed from: a */
        InterfaceC5405d mo18449a(AssetManager assetManager, String str);
    }

    /* renamed from: r.a$b */
    public static class b implements InterfaceC9889o, a {

        /* renamed from: a */
        public final AssetManager f19762a;

        public b(AssetManager assetManager) {
            this.f19762a = assetManager;
        }

        @Override // p226r.C9875a.a
        /* renamed from: a */
        public InterfaceC5405d mo18449a(AssetManager assetManager, String str) {
            return new C5409h(assetManager, str);
        }

        @Override // p226r.InterfaceC9889o
        /* renamed from: d */
        public InterfaceC9888n mo18450d(C9892r c9892r) {
            return new C9875a(this.f19762a, this);
        }
    }

    /* renamed from: r.a$c */
    public static class c implements InterfaceC9889o, a {

        /* renamed from: a */
        public final AssetManager f19763a;

        public c(AssetManager assetManager) {
            this.f19763a = assetManager;
        }

        @Override // p226r.C9875a.a
        /* renamed from: a */
        public InterfaceC5405d mo18449a(AssetManager assetManager, String str) {
            return new C5414m(assetManager, str);
        }

        @Override // p226r.InterfaceC9889o
        /* renamed from: d */
        public InterfaceC9888n mo18450d(C9892r c9892r) {
            return new C9875a(this.f19763a, this);
        }
    }

    public C9875a(AssetManager assetManager, a aVar) {
        this.f19760a = assetManager;
        this.f19761b = aVar;
    }

    @Override // p226r.InterfaceC9888n
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public InterfaceC9888n.a mo18446b(Uri uri, int i10, int i11, C9230d c9230d) {
        return new InterfaceC9888n.a(new C8514b(uri), this.f19761b.mo18449a(this.f19760a, uri.toString().substring(f19759c)));
    }

    @Override // p226r.InterfaceC9888n
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean mo18445a(Uri uri) {
        return "file".equals(uri.getScheme()) && !uri.getPathSegments().isEmpty() && "android_asset".equals(uri.getPathSegments().get(0));
    }
}
