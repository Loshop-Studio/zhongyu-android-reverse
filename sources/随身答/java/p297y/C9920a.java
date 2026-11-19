package p297y;

import android.graphics.Bitmap;
import android.view.KeyEvent;
import android.view.View;
import android.widget.ImageView;
import androidx.lifecycle.Lifecycle;
import coil3.C5304c;
import coil3.InterfaceC5328e;
import coil3.request.LifecycleRequestDelegate;
import coil3.request.ViewTargetRequestDelegate;
import coil3.size.Precision;
import coil3.size.Scale;
import coil3.util.AbstractC5349d;
import coil3.util.Logger;
import kotlin.collections.ArraysKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.Job;
import p029c0.InterfaceC5217a;
import p029c0.InterfaceC5218b;
import p090e0.AbstractC7803a;
import p090e0.AbstractC7805c;
import p090e0.AbstractC7814l;
import p090e0.InterfaceC7813k;
import p090e0.InterfaceC7825w;
import p151k.C8230a;
import p151k.InterfaceC8239j;
import p247t.InterfaceC9595d;
import p297y.C9924e;
import p307z.AbstractC9980j;
import p307z.C9975e;
import p307z.InterfaceC9977g;
import p307z.InterfaceC9979i;

/* renamed from: y.a */
/* loaded from: classes3.dex */
public final class C9920a implements InterfaceC9934o {

    /* renamed from: a */
    public final InterfaceC5328e f17748a;

    /* renamed from: b */
    public final InterfaceC7825w f17749b;

    /* renamed from: c */
    public final InterfaceC7813k f17750c = AbstractC7814l.m12198a(null);

    public C9920a(InterfaceC5328e interfaceC5328e, InterfaceC7825w interfaceC7825w, Logger logger) {
        this.f17748a = interfaceC5328e;
        this.f17749b = interfaceC7825w;
    }

    @Override // p297y.InterfaceC9934o
    /* renamed from: a */
    public InterfaceC9933n mo16992a(C9924e c9924e, Job job, boolean z9) {
        InterfaceC5217a interfaceC5217aM17041y = c9924e.m17041y();
        if (interfaceC5217aM17041y instanceof InterfaceC5218b) {
            Lifecycle lifecycleM17100m = AbstractC9928i.m17100m(c9924e);
            if (lifecycleM17100m == null) {
                lifecycleM17100m = m16997f(c9924e);
            }
            return new ViewTargetRequestDelegate(this.f17748a, c9924e, (InterfaceC5218b) interfaceC5217aM17041y, lifecycleM17100m, job);
        }
        Lifecycle lifecycleM17100m2 = AbstractC9928i.m17100m(c9924e);
        if (lifecycleM17100m2 == null) {
            lifecycleM17100m2 = z9 ? m16997f(c9924e) : null;
        }
        return lifecycleM17100m2 != null ? new LifecycleRequestDelegate(lifecycleM17100m2, job) : C9921b.m17005d(C9921b.m17006e(job));
    }

    @Override // p297y.InterfaceC9934o
    /* renamed from: b */
    public boolean mo16993b(C9924e c9924e, InterfaceC9595d.c cVar) {
        InterfaceC8239j interfaceC8239jM15804b = cVar.m15804b();
        C8230a c8230a = interfaceC8239jM15804b instanceof C8230a ? (C8230a) interfaceC8239jM15804b : null;
        if (c8230a == null) {
            return true;
        }
        return m17000i(c9924e, AbstractC7803a.m12172c(c8230a.m13266b()));
    }

    @Override // p297y.InterfaceC9934o
    /* renamed from: c */
    public C9932m mo16994c(C9924e c9924e, C9975e c9975e) {
        return new C9932m(c9924e.m17019c(), c9975e, c9924e.m17039w(), c9924e.m17038v(), c9924e.m17025i(), c9924e.m17030n(), c9924e.m17035s(), c9924e.m17026j(), c9924e.m17036t(), m17001j(c9924e, c9975e));
    }

    @Override // p297y.InterfaceC9934o
    /* renamed from: d */
    public C9924e mo16995d(C9924e c9924e) {
        C9924e.a aVarM17047e = C9924e.m17015A(c9924e, null, 1, null).m17047e(this.f17748a.mo2546b());
        InterfaceC9977g interfaceC9977gM17082m = c9924e.m17024h().m17082m();
        if (interfaceC9977gM17082m == null) {
            interfaceC9977gM17082m = m17004m(c9924e);
            aVarM17047e.m17052j(interfaceC9977gM17082m);
        }
        if (c9924e.m17024h().m17081l() == null) {
            aVarM17047e.m17051i(m17003l(c9924e));
        }
        if (c9924e.m17024h().m17080k() == null) {
            aVarM17047e.m17050h(m17002k(c9924e, interfaceC9977gM17082m));
        }
        return aVarM17047e.m17043a();
    }

    @Override // p297y.InterfaceC9934o
    /* renamed from: e */
    public C9932m mo16996e(C9932m c9932m) {
        boolean z9;
        C5304c c5304cM17111f = c9932m.m17111f();
        if (m16999h(c9932m)) {
            z9 = false;
        } else {
            c5304cM17111f = c5304cM17111f.m2618d().m2620b(AbstractC9928i.m17098k(C5304c.c.f2758b), Bitmap.Config.ARGB_8888).m2619a();
            z9 = true;
        }
        return z9 ? C9932m.m17106b(c9932m, null, null, null, null, null, null, null, null, null, c5304cM17111f, 511, null) : c9932m;
    }

    /* renamed from: f */
    public final Lifecycle m16997f(C9924e c9924e) {
        InterfaceC5217a interfaceC5217aM17041y = c9924e.m17041y();
        return AbstractC7805c.m12183e(interfaceC5217aM17041y instanceof InterfaceC5218b ? ((InterfaceC5218b) interfaceC5217aM17041y).getView().getContext() : c9924e.m17019c());
    }

    /* renamed from: g */
    public final boolean m16998g(C9924e c9924e, C9975e c9975e) {
        return (AbstractC9925f.m17087e(c9924e).isEmpty() || ArraysKt.contains(AbstractC5349d.m2946f(), AbstractC9928i.m17096i(c9924e))) && (!AbstractC7803a.m12173d(AbstractC9928i.m17096i(c9924e)) || (m17000i(c9924e, AbstractC9928i.m17096i(c9924e)) && this.f17750c.mo12197b(c9975e)));
    }

    /* renamed from: h */
    public final boolean m16999h(C9932m c9932m) {
        return !AbstractC7803a.m12173d(AbstractC9928i.m17097j(c9932m)) || this.f17750c.mo12196a();
    }

    /* renamed from: i */
    public final boolean m17000i(C9924e c9924e, Bitmap.Config config) {
        if (!AbstractC7803a.m12173d(config)) {
            return true;
        }
        if (!AbstractC9928i.m17092e(c9924e)) {
            return false;
        }
        InterfaceC5217a interfaceC5217aM17041y = c9924e.m17041y();
        if (interfaceC5217aM17041y instanceof InterfaceC5218b) {
            View view = ((InterfaceC5218b) interfaceC5217aM17041y).getView();
            if (view.isAttachedToWindow() && !view.isHardwareAccelerated()) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: j */
    public final C5304c m17001j(C9924e c9924e, C9975e c9975e) {
        Bitmap.Config configM17096i = AbstractC9928i.m17096i(c9924e);
        boolean zM17094g = AbstractC9928i.m17094g(c9924e);
        if (!m16998g(c9924e, c9975e)) {
            configM17096i = Bitmap.Config.ARGB_8888;
        }
        boolean z9 = zM17094g && AbstractC9925f.m17087e(c9924e).isEmpty() && configM17096i != Bitmap.Config.ALPHA_8;
        C5304c.a aVar = new C5304c.a(MapsKt.plus(c9924e.m17023g().m17059f().m2616b(), c9924e.m17027k().m2616b()));
        if (configM17096i != AbstractC9928i.m17096i(c9924e)) {
            aVar = aVar.m2620b(AbstractC9928i.m17098k(C5304c.c.f2758b), configM17096i);
        }
        if (z9 != AbstractC9928i.m17094g(c9924e)) {
            aVar = aVar.m2620b(AbstractC9928i.m17093f(C5304c.c.f2758b), Boolean.valueOf(z9));
        }
        return aVar.m2619a();
    }

    /* renamed from: k */
    public final Precision m17002k(C9924e c9924e, InterfaceC9977g interfaceC9977g) {
        return (c9924e.m17024h().m17082m() == null && Intrinsics.areEqual(interfaceC9977g, InterfaceC9977g.f17948b0)) ? Precision.f3120b : ((c9924e.m17041y() instanceof InterfaceC5218b) && (interfaceC9977g instanceof InterfaceC9979i) && (((InterfaceC5218b) c9924e.m17041y()).getView() instanceof ImageView) && ((InterfaceC5218b) c9924e.m17041y()).getView() == ((InterfaceC9979i) interfaceC9977g).getView()) ? Precision.f3120b : Precision.f3119a;
    }

    /* renamed from: l */
    public final Scale m17003l(C9924e c9924e) {
        InterfaceC5217a interfaceC5217aM17041y = c9924e.m17041y();
        InterfaceC5218b interfaceC5218b = interfaceC5217aM17041y instanceof InterfaceC5218b ? (InterfaceC5218b) interfaceC5217aM17041y : null;
        KeyEvent.Callback view = interfaceC5218b != null ? interfaceC5218b.getView() : null;
        ImageView imageView = view instanceof ImageView ? (ImageView) view : null;
        return imageView != null ? AbstractC5349d.m2945e(imageView) : c9924e.m17039w();
    }

    /* renamed from: m */
    public final InterfaceC9977g m17004m(C9924e c9924e) {
        ImageView.ScaleType scaleType;
        if (!(c9924e.m17041y() instanceof InterfaceC5218b)) {
            return InterfaceC9977g.f17948b0;
        }
        View view = ((InterfaceC5218b) c9924e.m17041y()).getView();
        return ((view instanceof ImageView) && ((scaleType = ((ImageView) view).getScaleType()) == ImageView.ScaleType.CENTER || scaleType == ImageView.ScaleType.MATRIX)) ? InterfaceC9977g.f17948b0 : AbstractC9980j.m17270b(view, false, 2, null);
    }
}
