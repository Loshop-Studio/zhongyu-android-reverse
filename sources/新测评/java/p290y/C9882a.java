package p290y;

import android.graphics.Bitmap;
import android.view.KeyEvent;
import android.view.View;
import android.widget.ImageView;
import androidx.lifecycle.Lifecycle;
import coil3.C5169c;
import coil3.InterfaceC5193e;
import coil3.request.LifecycleRequestDelegate;
import coil3.request.ViewTargetRequestDelegate;
import coil3.size.Precision;
import coil3.size.Scale;
import coil3.util.AbstractC5214d;
import coil3.util.Logger;
import kotlin.collections.ArraysKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.Job;
import p002a0.InterfaceC0006a;
import p002a0.InterfaceC0007b;
import p030c0.AbstractC5075a;
import p030c0.AbstractC5078c;
import p030c0.AbstractC5088m;
import p030c0.InterfaceC5087l;
import p030c0.InterfaceC5099x;
import p137k.C7829a;
import p137k.InterfaceC7838j;
import p238t.InterfaceC9363d;
import p290y.C9886e;
import p300z.AbstractC9963j;
import p300z.C9958e;
import p300z.InterfaceC9960g;
import p300z.InterfaceC9962i;

/* renamed from: y.a */
/* loaded from: classes3.dex */
public final class C9882a implements InterfaceC9894m {

    /* renamed from: a */
    public final InterfaceC5193e f17514a;

    /* renamed from: b */
    public final InterfaceC5099x f17515b;

    /* renamed from: c */
    public final InterfaceC5087l f17516c = AbstractC5088m.m2690a(null);

    public C9882a(InterfaceC5193e interfaceC5193e, InterfaceC5099x interfaceC5099x, Logger logger) {
        this.f17514a = interfaceC5193e;
        this.f17515b = interfaceC5099x;
    }

    @Override // p290y.InterfaceC9894m
    /* renamed from: a */
    public InterfaceC9893l mo16591a(C9886e c9886e, Job job, boolean z9) {
        InterfaceC0006a interfaceC0006aM16639y = c9886e.m16639y();
        if (interfaceC0006aM16639y instanceof InterfaceC0007b) {
            Lifecycle lifecycleM16695i = AbstractC9888g.m16695i(c9886e);
            if (lifecycleM16695i == null) {
                lifecycleM16695i = m16596f(c9886e);
            }
            return new ViewTargetRequestDelegate(this.f17514a, c9886e, (InterfaceC0007b) interfaceC0006aM16639y, lifecycleM16695i, job);
        }
        Lifecycle lifecycleM16695i2 = AbstractC9888g.m16695i(c9886e);
        if (lifecycleM16695i2 == null) {
            lifecycleM16695i2 = z9 ? m16596f(c9886e) : null;
        }
        return lifecycleM16695i2 != null ? new LifecycleRequestDelegate(lifecycleM16695i2, job) : C9883b.m16604d(C9883b.m16605e(job));
    }

    @Override // p290y.InterfaceC9894m
    /* renamed from: b */
    public boolean mo16592b(C9886e c9886e, InterfaceC9363d.c cVar) {
        InterfaceC7838j interfaceC7838jM15632b = cVar.m15632b();
        C7829a c7829a = interfaceC7838jM15632b instanceof C7829a ? (C7829a) interfaceC7838jM15632b : null;
        if (c7829a == null) {
            return true;
        }
        return m16599i(c9886e, AbstractC5075a.m2664c(c7829a.m13297b()));
    }

    @Override // p290y.InterfaceC9894m
    /* renamed from: c */
    public C9892k mo16593c(C9886e c9886e, C9958e c9958e) {
        return new C9892k(c9886e.m16617c(), c9958e, c9886e.m16637w(), c9886e.m16636v(), c9886e.m16623i(), c9886e.m16628n(), c9886e.m16633s(), c9886e.m16624j(), c9886e.m16634t(), m16600j(c9886e, c9958e));
    }

    @Override // p290y.InterfaceC9894m
    /* renamed from: d */
    public C9886e mo16594d(C9886e c9886e) {
        C9886e.a aVarM16644d = C9886e.m16613A(c9886e, null, 1, null).m16644d(this.f17514a.mo2817b());
        InterfaceC9960g interfaceC9960gM16681m = c9886e.m16622h().m16681m();
        if (interfaceC9960gM16681m == null) {
            interfaceC9960gM16681m = m16603m(c9886e);
            aVarM16644d.m16651k(interfaceC9960gM16681m);
        }
        if (c9886e.m16622h().m16680l() == null) {
            aVarM16644d.m16648h(m16602l(c9886e));
        }
        if (c9886e.m16622h().m16679k() == null) {
            aVarM16644d.m16647g(m16601k(c9886e, interfaceC9960gM16681m));
        }
        return aVarM16644d.m16641a();
    }

    @Override // p290y.InterfaceC9894m
    /* renamed from: e */
    public C9892k mo16595e(C9892k c9892k) {
        boolean z9;
        C5169c c5169cM16703f = c9892k.m16703f();
        if (m16598h(c9892k)) {
            z9 = false;
        } else {
            c5169cM16703f = c5169cM16703f.m2890d().m2892b(AbstractC9888g.m16693g(C5169c.c.f2823b), Bitmap.Config.ARGB_8888).m2891a();
            z9 = true;
        }
        return z9 ? C9892k.m16698b(c9892k, null, null, null, null, null, null, null, null, null, c5169cM16703f, 511, null) : c9892k;
    }

    /* renamed from: f */
    public final Lifecycle m16596f(C9886e c9886e) {
        InterfaceC0006a interfaceC0006aM16639y = c9886e.m16639y();
        return AbstractC5078c.m2675e(interfaceC0006aM16639y instanceof InterfaceC0007b ? ((InterfaceC0007b) interfaceC0006aM16639y).getView().getContext() : c9886e.m16617c());
    }

    /* renamed from: g */
    public final boolean m16597g(C9886e c9886e, C9958e c9958e) {
        return (AbstractC9887f.m16686e(c9886e).isEmpty() || ArraysKt.contains(AbstractC5214d.m3229f(), AbstractC9888g.m16691e(c9886e))) && (!AbstractC5075a.m2665d(AbstractC9888g.m16691e(c9886e)) || (m16599i(c9886e, AbstractC9888g.m16691e(c9886e)) && this.f17516c.mo2689b(c9958e)));
    }

    /* renamed from: h */
    public final boolean m16598h(C9892k c9892k) {
        return !AbstractC5075a.m2665d(AbstractC9888g.m16692f(c9892k)) || this.f17516c.mo2688a();
    }

    /* renamed from: i */
    public final boolean m16599i(C9886e c9886e, Bitmap.Config config) {
        if (!AbstractC5075a.m2665d(config)) {
            return true;
        }
        if (!AbstractC9888g.m16687a(c9886e)) {
            return false;
        }
        InterfaceC0006a interfaceC0006aM16639y = c9886e.m16639y();
        if (interfaceC0006aM16639y instanceof InterfaceC0007b) {
            View view = ((InterfaceC0007b) interfaceC0006aM16639y).getView();
            if (view.isAttachedToWindow() && !view.isHardwareAccelerated()) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: j */
    public final C5169c m16600j(C9886e c9886e, C9958e c9958e) {
        Bitmap.Config configM16691e = AbstractC9888g.m16691e(c9886e);
        boolean zM16689c = AbstractC9888g.m16689c(c9886e);
        if (!m16597g(c9886e, c9958e)) {
            configM16691e = Bitmap.Config.ARGB_8888;
        }
        boolean z9 = zM16689c && AbstractC9887f.m16686e(c9886e).isEmpty() && configM16691e != Bitmap.Config.ALPHA_8;
        C5169c.a aVar = new C5169c.a(MapsKt.plus(c9886e.m16621g().m16658f().m2888b(), c9886e.m16625k().m2888b()));
        if (configM16691e != AbstractC9888g.m16691e(c9886e)) {
            aVar = aVar.m2892b(AbstractC9888g.m16693g(C5169c.c.f2823b), configM16691e);
        }
        if (z9 != AbstractC9888g.m16689c(c9886e)) {
            aVar = aVar.m2892b(AbstractC9888g.m16688b(C5169c.c.f2823b), Boolean.valueOf(z9));
        }
        return aVar.m2891a();
    }

    /* renamed from: k */
    public final Precision m16601k(C9886e c9886e, InterfaceC9960g interfaceC9960g) {
        return (c9886e.m16622h().m16681m() == null && Intrinsics.areEqual(interfaceC9960g, InterfaceC9960g.f17804b0)) ? Precision.f3232b : ((c9886e.m16639y() instanceof InterfaceC0007b) && (interfaceC9960g instanceof InterfaceC9962i) && (((InterfaceC0007b) c9886e.m16639y()).getView() instanceof ImageView) && ((InterfaceC0007b) c9886e.m16639y()).getView() == ((InterfaceC9962i) interfaceC9960g).getView()) ? Precision.f3232b : Precision.f3231a;
    }

    /* renamed from: l */
    public final Scale m16602l(C9886e c9886e) {
        InterfaceC0006a interfaceC0006aM16639y = c9886e.m16639y();
        InterfaceC0007b interfaceC0007b = interfaceC0006aM16639y instanceof InterfaceC0007b ? (InterfaceC0007b) interfaceC0006aM16639y : null;
        KeyEvent.Callback view = interfaceC0007b != null ? interfaceC0007b.getView() : null;
        ImageView imageView = view instanceof ImageView ? (ImageView) view : null;
        return imageView != null ? AbstractC5214d.m3228e(imageView) : c9886e.m16637w();
    }

    /* renamed from: m */
    public final InterfaceC9960g m16603m(C9886e c9886e) {
        ImageView.ScaleType scaleType;
        if (!(c9886e.m16639y() instanceof InterfaceC0007b)) {
            return InterfaceC9960g.f17804b0;
        }
        View view = ((InterfaceC0007b) c9886e.m16639y()).getView();
        return ((view instanceof ImageView) && ((scaleType = ((ImageView) view).getScaleType()) == ImageView.ScaleType.CENTER || scaleType == ImageView.ScaleType.MATRIX)) ? InterfaceC9960g.f17804b0 : AbstractC9963j.m16783b(view, false, 2, null);
    }
}
