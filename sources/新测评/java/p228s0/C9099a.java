package p228s0;

import android.content.res.AssetManager;
import android.net.Uri;
import com.bumptech.glide.load.data.C5360h;
import com.bumptech.glide.load.data.C5365m;
import com.bumptech.glide.load.data.InterfaceC5356d;
import p106h1.C7617b;
import p162m0.C8539d;
import p228s0.InterfaceC9112n;

/* renamed from: s0.a */
/* loaded from: classes3.dex */
public class C9099a implements InterfaceC9112n {

    /* renamed from: c */
    public static final int f15724c = 22;

    /* renamed from: a */
    public final AssetManager f15725a;

    /* renamed from: b */
    public final a f15726b;

    /* renamed from: s0.a$a */
    public interface a {
        /* renamed from: a */
        InterfaceC5356d mo15358a(AssetManager assetManager, String str);
    }

    /* renamed from: s0.a$b */
    public static class b implements InterfaceC9113o, a {

        /* renamed from: a */
        public final AssetManager f15727a;

        public b(AssetManager assetManager) {
            this.f15727a = assetManager;
        }

        @Override // p228s0.C9099a.a
        /* renamed from: a */
        public InterfaceC5356d mo15358a(AssetManager assetManager, String str) {
            return new C5360h(assetManager, str);
        }

        @Override // p228s0.InterfaceC9113o
        /* renamed from: d */
        public InterfaceC9112n mo15359d(C9116r c9116r) {
            return new C9099a(this.f15727a, this);
        }
    }

    /* renamed from: s0.a$c */
    public static class c implements InterfaceC9113o, a {

        /* renamed from: a */
        public final AssetManager f15728a;

        public c(AssetManager assetManager) {
            this.f15728a = assetManager;
        }

        @Override // p228s0.C9099a.a
        /* renamed from: a */
        public InterfaceC5356d mo15358a(AssetManager assetManager, String str) {
            return new C5365m(assetManager, str);
        }

        @Override // p228s0.InterfaceC9113o
        /* renamed from: d */
        public InterfaceC9112n mo15359d(C9116r c9116r) {
            return new C9099a(this.f15728a, this);
        }
    }

    public C9099a(AssetManager assetManager, a aVar) {
        this.f15725a = assetManager;
        this.f15726b = aVar;
    }

    @Override // p228s0.InterfaceC9112n
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public InterfaceC9112n.a mo15355b(Uri uri, int i10, int i11, C8539d c8539d) {
        return new InterfaceC9112n.a(new C7617b(uri), this.f15726b.mo15358a(this.f15725a, uri.toString().substring(f15724c)));
    }

    @Override // p228s0.InterfaceC9112n
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean mo15354a(Uri uri) {
        return "file".equals(uri.getScheme()) && !uri.getPathSegments().isEmpty() && "android_asset".equals(uri.getPathSegments().get(0));
    }
}
