package p253n;

import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import coil3.InterfaceC5470e;
import coil3.decode.DataSource;
import coil3.size.Precision;
import coil3.util.AbstractC5491d;
import p001a0.C0010g;
import p212k.AbstractC9761o;
import p253n.InterfaceC10281k;
import p380w.AbstractC11630j;
import p380w.C11634n;
import vc.InterfaceC11588c;

/* renamed from: n.i */
/* loaded from: classes3.dex */
public final class C10279i implements InterfaceC10281k {

    /* renamed from: a */
    public final Drawable f24468a;

    /* renamed from: b */
    public final C11634n f24469b;

    /* renamed from: n.i$a */
    public static final class a implements InterfaceC10281k.a {
        @Override // p253n.InterfaceC10281k.a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public InterfaceC10281k mo3225a(Drawable drawable, C11634n c11634n, InterfaceC5470e interfaceC5470e) {
            return new C10279i(drawable, c11634n);
        }
    }

    public C10279i(Drawable drawable, C11634n c11634n) {
        this.f24468a = drawable;
        this.f24469b = c11634n;
    }

    @Override // p253n.InterfaceC10281k
    /* renamed from: a */
    public Object mo3208a(InterfaceC11588c interfaceC11588c) {
        Drawable bitmapDrawable;
        boolean zM3327j = AbstractC5491d.m3327j(this.f24468a);
        if (zM3327j) {
            bitmapDrawable = new BitmapDrawable(this.f24469b.m25743c().getResources(), C0010g.f2a.m20a(this.f24468a, AbstractC11630j.m25733j(this.f24469b), this.f24469b.m25751k(), this.f24469b.m25750j(), this.f24469b.m25749i() == Precision.f3907d));
        } else {
            bitmapDrawable = this.f24468a;
        }
        return new C10283m(AbstractC9761o.m19680c(bitmapDrawable), zM3327j, DataSource.f3611d);
    }
}
