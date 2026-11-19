package p194p;

import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import coil3.InterfaceC5193e;
import coil3.decode.DataSource;
import coil3.size.Precision;
import coil3.util.AbstractC5214d;
import kotlin.coroutines.Continuation;
import p030c0.C5082g;
import p137k.AbstractC7843o;
import p194p.InterfaceC8795k;
import p290y.AbstractC9888g;
import p290y.C9892k;

/* renamed from: p.i */
/* loaded from: classes3.dex */
public final class C8793i implements InterfaceC8795k {

    /* renamed from: a */
    public final Drawable f14932a;

    /* renamed from: b */
    public final C9892k f14933b;

    /* renamed from: p.i$a */
    public static final class a implements InterfaceC8795k.a {
        @Override // p194p.InterfaceC8795k.a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public InterfaceC8795k mo3134a(Drawable drawable, C9892k c9892k, InterfaceC5193e interfaceC5193e) {
            return new C8793i(drawable, c9892k);
        }
    }

    public C8793i(Drawable drawable, C9892k c9892k) {
        this.f14932a = drawable;
        this.f14933b = c9892k;
    }

    @Override // p194p.InterfaceC8795k
    /* renamed from: a */
    public Object mo3117a(Continuation continuation) {
        Drawable bitmapDrawable;
        boolean zM3233j = AbstractC5214d.m3233j(this.f14932a);
        if (zM3233j) {
            bitmapDrawable = new BitmapDrawable(this.f14933b.m16700c().getResources(), C5082g.f2652a.m2679a(this.f14932a, AbstractC9888g.m16692f(this.f14933b), this.f14933b.m16708k(), this.f14933b.m16707j(), this.f14933b.m16706i() == Precision.f3232b));
        } else {
            bitmapDrawable = this.f14932a;
        }
        return new C8797m(AbstractC7843o.m13301c(bitmapDrawable), zM3233j, DataSource.f2936b);
    }
}
