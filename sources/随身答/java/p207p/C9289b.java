package p207p;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import coil3.InterfaceC5328e;
import coil3.decode.DataSource;
import kotlin.coroutines.Continuation;
import p151k.AbstractC8243n;
import p207p.InterfaceC9298k;
import p297y.C9932m;

/* renamed from: p.b */
/* loaded from: classes3.dex */
public final class C9289b implements InterfaceC9298k {

    /* renamed from: a */
    public final Bitmap f16084a;

    /* renamed from: b */
    public final C9932m f16085b;

    /* renamed from: p.b$a */
    public static final class a implements InterfaceC9298k.a {
        @Override // p207p.InterfaceC9298k.a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public InterfaceC9298k mo2854a(Bitmap bitmap, C9932m c9932m, InterfaceC5328e interfaceC5328e) {
            return new C9289b(bitmap, c9932m);
        }
    }

    public C9289b(Bitmap bitmap, C9932m c9932m) {
        this.f16084a = bitmap;
        this.f16085b = c9932m;
    }

    @Override // p207p.InterfaceC9298k
    /* renamed from: a */
    public Object mo2837a(Continuation continuation) {
        return new C9300m(AbstractC8243n.m13270c(new BitmapDrawable(this.f16085b.m17108c().getResources(), this.f16084a)), false, DataSource.f2865b);
    }
}
