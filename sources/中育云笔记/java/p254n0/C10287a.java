package p254n0;

import android.content.res.AssetManager;
import android.net.Uri;
import com.bumptech.glide.load.data.C5828h;
import com.bumptech.glide.load.data.C5833m;
import com.bumptech.glide.load.data.InterfaceC5824d;
import p039c1.C5222d;
import p168h0.C9438e;
import p254n0.InterfaceC10300n;

/* renamed from: n0.a */
/* loaded from: classes3.dex */
public class C10287a implements InterfaceC10300n {

    /* renamed from: c */
    public static final int f24482c = 22;

    /* renamed from: a */
    public final AssetManager f24483a;

    /* renamed from: b */
    public final a f24484b;

    /* renamed from: n0.a$a */
    public interface a {
        /* renamed from: a */
        InterfaceC5824d mo21424a(AssetManager assetManager, String str);
    }

    /* renamed from: n0.a$b */
    public static class b implements InterfaceC10301o, a {

        /* renamed from: a */
        public final AssetManager f24485a;

        public b(AssetManager assetManager) {
            this.f24485a = assetManager;
        }

        @Override // p254n0.C10287a.a
        /* renamed from: a */
        public InterfaceC5824d mo21424a(AssetManager assetManager, String str) {
            return new C5828h(assetManager, str);
        }

        @Override // p254n0.InterfaceC10301o
        /* renamed from: c */
        public InterfaceC10300n mo21425c(C10304r c10304r) {
            return new C10287a(this.f24485a, this);
        }
    }

    /* renamed from: n0.a$c */
    public static class c implements InterfaceC10301o, a {

        /* renamed from: a */
        public final AssetManager f24486a;

        public c(AssetManager assetManager) {
            this.f24486a = assetManager;
        }

        @Override // p254n0.C10287a.a
        /* renamed from: a */
        public InterfaceC5824d mo21424a(AssetManager assetManager, String str) {
            return new C5833m(assetManager, str);
        }

        @Override // p254n0.InterfaceC10301o
        /* renamed from: c */
        public InterfaceC10300n mo21425c(C10304r c10304r) {
            return new C10287a(this.f24486a, this);
        }
    }

    public C10287a(AssetManager assetManager, a aVar) {
        this.f24483a = assetManager;
        this.f24484b = aVar;
    }

    @Override // p254n0.InterfaceC10300n
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public InterfaceC10300n.a mo21421b(Uri uri, int i10, int i11, C9438e c9438e) {
        return new InterfaceC10300n.a(new C5222d(uri), this.f24484b.mo21424a(this.f24483a, uri.toString().substring(f24482c)));
    }

    @Override // p254n0.InterfaceC10300n
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean mo21420a(Uri uri) {
        return "file".equals(uri.getScheme()) && !uri.getPathSegments().isEmpty() && "android_asset".equals(uri.getPathSegments().get(0));
    }
}
