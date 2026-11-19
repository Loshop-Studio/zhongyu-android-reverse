package p380w;

import android.graphics.Bitmap;
import android.view.KeyEvent;
import android.view.View;
import android.widget.ImageView;
import androidx.lifecycle.Lifecycle;
import coil3.C5454c;
import coil3.InterfaceC5470e;
import coil3.request.LifecycleRequestDelegate;
import coil3.request.ViewTargetRequestDelegate;
import coil3.size.Precision;
import coil3.size.Scale;
import coil3.util.AbstractC5491d;
import coil3.util.Logger;
import kotlin.collections.AbstractC9925a;
import kotlin.jvm.internal.AbstractC9979u;
import kotlinx.coroutines.InterfaceC10045g;
import p001a0.AbstractC0003a;
import p001a0.AbstractC0006c;
import p001a0.AbstractC0016m;
import p001a0.InterfaceC0015l;
import p001a0.InterfaceC0027x;
import p212k.C9747a;
import p212k.InterfaceC9756j;
import p312r.InterfaceC10825d;
import p325rc.AbstractC10968r;
import p380w.C11627g;
import p396x.AbstractC11754j;
import p396x.C11749e;
import p396x.InterfaceC11751g;
import p396x.InterfaceC11753i;
import p412y.InterfaceC11879a;
import p412y.InterfaceC11880b;

/* renamed from: w.a */
/* loaded from: classes3.dex */
public final class C11621a implements InterfaceC11636p {

    /* renamed from: a */
    public final InterfaceC5470e f27522a;

    /* renamed from: b */
    public final InterfaceC0027x f27523b;

    /* renamed from: c */
    public final InterfaceC0015l f27524c = AbstractC0016m.m31a(null);

    public C11621a(InterfaceC5470e interfaceC5470e, InterfaceC0027x interfaceC0027x, Logger logger) {
        this.f27522a = interfaceC5470e;
        this.f27523b = interfaceC0027x;
    }

    @Override // p380w.InterfaceC11636p
    /* renamed from: a */
    public C11634n mo25622a(C11627g c11627g, C11749e c11749e) {
        return new C11634n(c11627g.m25647c(), c11749e, c11627g.m25667w(), c11627g.m25666v(), c11627g.m25653i(), c11627g.m25658n(), c11627g.m25663s(), c11627g.m25654j(), c11627g.m25664t(), m25631j(c11627g, c11749e));
    }

    @Override // p380w.InterfaceC11636p
    /* renamed from: b */
    public InterfaceC11635o mo25623b(C11627g c11627g, InterfaceC10045g interfaceC10045g, boolean z10) {
        InterfaceC11879a interfaceC11879aM25669y = c11627g.m25669y();
        if (interfaceC11879aM25669y instanceof InterfaceC11880b) {
            Lifecycle lifecycleM25736m = AbstractC11630j.m25736m(c11627g);
            if (lifecycleM25736m == null) {
                lifecycleM25736m = m25627f(c11627g);
            }
            return new ViewTargetRequestDelegate(this.f27522a, c11627g, (InterfaceC11880b) interfaceC11879aM25669y, lifecycleM25736m, interfaceC10045g);
        }
        Lifecycle lifecycleM25736m2 = AbstractC11630j.m25736m(c11627g);
        if (lifecycleM25736m2 == null) {
            lifecycleM25736m2 = z10 ? m25627f(c11627g) : null;
        }
        return lifecycleM25736m2 != null ? new LifecycleRequestDelegate(lifecycleM25736m2, interfaceC10045g) : C11622b.m25635d(C11622b.m25636e(interfaceC10045g));
    }

    @Override // p380w.InterfaceC11636p
    /* renamed from: c */
    public C11627g mo25624c(C11627g c11627g) {
        C11627g.a aVarM25677e = C11627g.m25643A(c11627g, null, 1, null).m25677e(this.f27522a.mo2977b());
        InterfaceC11751g interfaceC11751gM25718m = c11627g.m25652h().m25718m();
        if (interfaceC11751gM25718m == null) {
            interfaceC11751gM25718m = m25634m(c11627g);
            aVarM25677e.m25688r(interfaceC11751gM25718m);
        }
        if (c11627g.m25652h().m25717l() == null) {
            aVarM25677e.m25687q(m25633l(c11627g));
        }
        if (c11627g.m25652h().m25716k() == null) {
            aVarM25677e.m25686p(m25632k(c11627g, interfaceC11751gM25718m));
        }
        return aVarM25677e.m25675c();
    }

    @Override // p380w.InterfaceC11636p
    /* renamed from: d */
    public boolean mo25625d(C11627g c11627g, InterfaceC10825d.c cVar) {
        InterfaceC9756j interfaceC9756jM23295b = cVar.m23295b();
        C9747a c9747a = interfaceC9756jM23295b instanceof C9747a ? (C9747a) interfaceC9756jM23295b : null;
        if (c9747a == null) {
            return true;
        }
        return m25630i(c11627g, AbstractC0003a.m5c(c9747a.m19676b()));
    }

    @Override // p380w.InterfaceC11636p
    /* renamed from: e */
    public C11634n mo25626e(C11634n c11634n) {
        boolean z10;
        C5454c c5454cM25746f = c11634n.m25746f();
        if (m25629h(c11634n)) {
            z10 = false;
        } else {
            c5454cM25746f = c5454cM25746f.m3049d().m3051b(AbstractC11630j.m25734k(C5454c.c.f3594b), Bitmap.Config.ARGB_8888).m3050a();
            z10 = true;
        }
        return z10 ? C11634n.m25741b(c11634n, null, null, null, null, null, null, null, null, null, c5454cM25746f, 511, null) : c11634n;
    }

    /* renamed from: f */
    public final Lifecycle m25627f(C11627g c11627g) {
        InterfaceC11879a interfaceC11879aM25669y = c11627g.m25669y();
        return AbstractC0006c.m16e(interfaceC11879aM25669y instanceof InterfaceC11880b ? ((InterfaceC11880b) interfaceC11879aM25669y).getView().getContext() : c11627g.m25647c());
    }

    /* renamed from: g */
    public final boolean m25628g(C11627g c11627g, C11749e c11749e) {
        return (AbstractC11628h.m25723e(c11627g).isEmpty() || AbstractC10968r.m24090m0(AbstractC5491d.m3323f(), AbstractC11630j.m25732i(c11627g))) && (!AbstractC0003a.m6d(AbstractC11630j.m25732i(c11627g)) || (m25630i(c11627g, AbstractC11630j.m25732i(c11627g)) && this.f27524c.mo29a(c11749e)));
    }

    /* renamed from: h */
    public final boolean m25629h(C11634n c11634n) {
        return !AbstractC0003a.m6d(AbstractC11630j.m25733j(c11634n)) || this.f27524c.mo30b();
    }

    /* renamed from: i */
    public final boolean m25630i(C11627g c11627g, Bitmap.Config config) {
        if (!AbstractC0003a.m6d(config)) {
            return true;
        }
        if (!AbstractC11630j.m25728e(c11627g)) {
            return false;
        }
        InterfaceC11879a interfaceC11879aM25669y = c11627g.m25669y();
        if (interfaceC11879aM25669y instanceof InterfaceC11880b) {
            View view = ((InterfaceC11880b) interfaceC11879aM25669y).getView();
            if (view.isAttachedToWindow() && !view.isHardwareAccelerated()) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: j */
    public final C5454c m25631j(C11627g c11627g, C11749e c11749e) {
        Bitmap.Config configM25732i = AbstractC11630j.m25732i(c11627g);
        boolean zM25730g = AbstractC11630j.m25730g(c11627g);
        if (!m25628g(c11627g, c11749e)) {
            configM25732i = Bitmap.Config.ARGB_8888;
        }
        boolean z10 = zM25730g && AbstractC11628h.m25723e(c11627g).isEmpty() && configM25732i != Bitmap.Config.ALPHA_8;
        C5454c.a aVar = new C5454c.a(AbstractC9925a.m20094n(c11627g.m25651g().m25695f().m3047b(), c11627g.m25655k().m3047b()));
        if (configM25732i != AbstractC11630j.m25732i(c11627g)) {
            aVar = aVar.m3051b(AbstractC11630j.m25734k(C5454c.c.f3594b), configM25732i);
        }
        if (z10 != AbstractC11630j.m25730g(c11627g)) {
            aVar = aVar.m3051b(AbstractC11630j.m25729f(C5454c.c.f3594b), Boolean.valueOf(z10));
        }
        return aVar.m3050a();
    }

    /* renamed from: k */
    public final Precision m25632k(C11627g c11627g, InterfaceC11751g interfaceC11751g) {
        return (c11627g.m25652h().m25718m() == null && AbstractC9979u.m20289b(interfaceC11751g, InterfaceC11751g.f27927b)) ? Precision.f3907d : ((c11627g.m25669y() instanceof InterfaceC11880b) && (interfaceC11751g instanceof InterfaceC11753i) && (((InterfaceC11880b) c11627g.m25669y()).getView() instanceof ImageView) && ((InterfaceC11880b) c11627g.m25669y()).getView() == ((InterfaceC11753i) interfaceC11751g).getView()) ? Precision.f3907d : Precision.f3906c;
    }

    /* renamed from: l */
    public final Scale m25633l(C11627g c11627g) {
        InterfaceC11879a interfaceC11879aM25669y = c11627g.m25669y();
        InterfaceC11880b interfaceC11880b = interfaceC11879aM25669y instanceof InterfaceC11880b ? (InterfaceC11880b) interfaceC11879aM25669y : null;
        KeyEvent.Callback view = interfaceC11880b != null ? interfaceC11880b.getView() : null;
        ImageView imageView = view instanceof ImageView ? (ImageView) view : null;
        return imageView != null ? AbstractC5491d.m3322e(imageView) : c11627g.m25667w();
    }

    /* renamed from: m */
    public final InterfaceC11751g m25634m(C11627g c11627g) {
        ImageView.ScaleType scaleType;
        if (!(c11627g.m25669y() instanceof InterfaceC11880b)) {
            return InterfaceC11751g.f27927b;
        }
        View view = ((InterfaceC11880b) c11627g.m25669y()).getView();
        return ((view instanceof ImageView) && ((scaleType = ((ImageView) view).getScaleType()) == ImageView.ScaleType.CENTER || scaleType == ImageView.ScaleType.MATRIX)) ? InterfaceC11751g.f27927b : AbstractC11754j.m26011b(view, false, 2, null);
    }
}
