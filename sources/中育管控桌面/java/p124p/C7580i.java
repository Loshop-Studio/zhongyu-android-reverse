package p124p;

import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import coil3.InterfaceC4574e;
import coil3.decode.DataSource;
import coil3.size.Precision;
import coil3.util.AbstractC4595d;
import kotlin.coroutines.Continuation;
import p023c0.C4462g;
import p087k.AbstractC6616o;
import p124p.InterfaceC7582k;
import p187y.AbstractC7876i;
import p187y.C7880m;

/* renamed from: p.i */
/* loaded from: classes3.dex */
public final class C7580i implements InterfaceC7582k {

    /* renamed from: a */
    public final Drawable f10032a;

    /* renamed from: b */
    public final C7880m f10033b;

    /* renamed from: p.i$a */
    public static final class a implements InterfaceC7582k.a {
        @Override // p124p.InterfaceC7582k.a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public InterfaceC7582k mo1960a(Drawable drawable, C7880m c7880m, InterfaceC4574e interfaceC4574e) {
            return new C7580i(drawable, c7880m);
        }
    }

    public C7580i(Drawable drawable, C7880m c7880m) {
        this.f10032a = drawable;
        this.f10033b = c7880m;
    }

    @Override // p124p.InterfaceC7582k
    /* renamed from: a */
    public Object mo1943a(Continuation continuation) {
        Drawable bitmapDrawable;
        boolean zM2059j = AbstractC4595d.m2059j(this.f10032a);
        if (zM2059j) {
            bitmapDrawable = new BitmapDrawable(this.f10033b.m9661c().getResources(), C4462g.f1332a.m1536a(this.f10032a, AbstractC7876i.m9651j(this.f10033b), this.f10033b.m9669k(), this.f10033b.m9668j(), this.f10033b.m9667i() == Precision.f1916b));
        } else {
            bitmapDrawable = this.f10032a;
        }
        return new C7584m(AbstractC6616o.m7570c(bitmapDrawable), zM2059j, DataSource.f1620b);
    }
}
