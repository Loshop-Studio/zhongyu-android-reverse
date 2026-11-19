package p207p;

import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import coil3.InterfaceC5328e;
import coil3.decode.DataSource;
import coil3.size.Precision;
import coil3.util.AbstractC5349d;
import kotlin.coroutines.Continuation;
import p090e0.C7808f;
import p151k.AbstractC8243n;
import p207p.InterfaceC9298k;
import p297y.AbstractC9928i;
import p297y.C9932m;

/* renamed from: p.i */
/* loaded from: classes3.dex */
public final class C9296i implements InterfaceC9298k {

    /* renamed from: a */
    public final Drawable f16097a;

    /* renamed from: b */
    public final C9932m f16098b;

    /* renamed from: p.i$a */
    public static final class a implements InterfaceC9298k.a {
        @Override // p207p.InterfaceC9298k.a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public InterfaceC9298k mo2854a(Drawable drawable, C9932m c9932m, InterfaceC5328e interfaceC5328e) {
            return new C9296i(drawable, c9932m);
        }
    }

    public C9296i(Drawable drawable, C9932m c9932m) {
        this.f16097a = drawable;
        this.f16098b = c9932m;
    }

    @Override // p207p.InterfaceC9298k
    /* renamed from: a */
    public Object mo2837a(Continuation continuation) {
        Drawable bitmapDrawable;
        boolean zM2950j = AbstractC5349d.m2950j(this.f16097a);
        if (zM2950j) {
            bitmapDrawable = new BitmapDrawable(this.f16098b.m17108c().getResources(), C7808f.f13124a.m12187a(this.f16097a, AbstractC9928i.m17097j(this.f16098b), this.f16098b.m17116k(), this.f16098b.m17115j(), this.f16098b.m17114i() == Precision.f3120b));
        } else {
            bitmapDrawable = this.f16097a;
        }
        return new C9300m(AbstractC8243n.m13270c(bitmapDrawable), zM2950j, DataSource.f2865b);
    }
}
