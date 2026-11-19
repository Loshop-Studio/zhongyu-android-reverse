package p187y;

import android.graphics.Bitmap;
import android.view.KeyEvent;
import android.view.View;
import android.widget.ImageView;
import androidx.lifecycle.Lifecycle;
import coil3.C4550c;
import coil3.InterfaceC4574e;
import coil3.request.LifecycleRequestDelegate;
import coil3.request.ViewTargetRequestDelegate;
import coil3.size.Precision;
import coil3.size.Scale;
import coil3.util.AbstractC4595d;
import coil3.util.Logger;
import kotlin.collections.ArraysKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.Job;
import p001a0.InterfaceC0004a;
import p001a0.InterfaceC0005b;
import p023c0.AbstractC4455a;
import p023c0.AbstractC4458c;
import p023c0.AbstractC4468m;
import p023c0.InterfaceC4467l;
import p023c0.InterfaceC4479x;
import p087k.C6602a;
import p087k.InterfaceC6611j;
import p152t.InterfaceC7708d;
import p187y.C7872e;
import p194z.AbstractC7928j;
import p194z.C7923e;
import p194z.InterfaceC7925g;
import p194z.InterfaceC7927i;

/* renamed from: y.a */
/* loaded from: classes3.dex */
public final class C7868a implements InterfaceC7882o {

    /* renamed from: a */
    public final InterfaceC4574e f10487a;

    /* renamed from: b */
    public final InterfaceC4479x f10488b;

    /* renamed from: c */
    public final InterfaceC4467l f10489c = AbstractC4468m.m1548a(null);

    public C7868a(InterfaceC4574e interfaceC4574e, InterfaceC4479x interfaceC4479x, Logger logger) {
        this.f10487a = interfaceC4574e;
        this.f10488b = interfaceC4479x;
    }

    @Override // p187y.InterfaceC7882o
    /* renamed from: a */
    public InterfaceC7881n mo9548a(C7872e c7872e, Job job, boolean z6) {
        InterfaceC0004a interfaceC0004aM9596y = c7872e.m9596y();
        if (interfaceC0004aM9596y instanceof InterfaceC0005b) {
            Lifecycle lifecycleM9654m = AbstractC7876i.m9654m(c7872e);
            if (lifecycleM9654m == null) {
                lifecycleM9654m = m9553f(c7872e);
            }
            return new ViewTargetRequestDelegate(this.f10487a, c7872e, (InterfaceC0005b) interfaceC0004aM9596y, lifecycleM9654m, job);
        }
        Lifecycle lifecycleM9654m2 = AbstractC7876i.m9654m(c7872e);
        if (lifecycleM9654m2 == null) {
            lifecycleM9654m2 = z6 ? m9553f(c7872e) : null;
        }
        return lifecycleM9654m2 != null ? new LifecycleRequestDelegate(lifecycleM9654m2, job) : C7869b.m9561d(C7869b.m9562e(job));
    }

    @Override // p187y.InterfaceC7882o
    /* renamed from: b */
    public boolean mo9549b(C7872e c7872e, InterfaceC7708d.c cVar) {
        InterfaceC6611j interfaceC6611jM9181b = cVar.m9181b();
        C6602a c6602a = interfaceC6611jM9181b instanceof C6602a ? (C6602a) interfaceC6611jM9181b : null;
        if (c6602a == null) {
            return true;
        }
        return m9556i(c7872e, AbstractC4455a.m1521c(c6602a.m7566b()));
    }

    @Override // p187y.InterfaceC7882o
    /* renamed from: c */
    public C7880m mo9550c(C7872e c7872e, C7923e c7923e) {
        return new C7880m(c7872e.m9574c(), c7923e, c7872e.m9594w(), c7872e.m9593v(), c7872e.m9580i(), c7872e.m9585n(), c7872e.m9590s(), c7872e.m9581j(), c7872e.m9591t(), m9557j(c7872e, c7923e));
    }

    @Override // p187y.InterfaceC7882o
    /* renamed from: d */
    public C7872e mo9551d(C7872e c7872e) {
        C7872e.a aVarM9601d = C7872e.m9570A(c7872e, null, 1, null).m9601d(this.f10487a.mo1651b());
        InterfaceC7925g interfaceC7925gM9636m = c7872e.m9579h().m9636m();
        if (interfaceC7925gM9636m == null) {
            interfaceC7925gM9636m = m9560m(c7872e);
            aVarM9601d.m9606i(interfaceC7925gM9636m);
        }
        if (c7872e.m9579h().m9635l() == null) {
            aVarM9601d.m9605h(m9559l(c7872e));
        }
        if (c7872e.m9579h().m9634k() == null) {
            aVarM9601d.m9604g(m9558k(c7872e, interfaceC7925gM9636m));
        }
        return aVarM9601d.m9598a();
    }

    @Override // p187y.InterfaceC7882o
    /* renamed from: e */
    public C7880m mo9552e(C7880m c7880m) {
        boolean z6;
        C4550c c4550cM9664f = c7880m.m9664f();
        if (m9555h(c7880m)) {
            z6 = false;
        } else {
            c4550cM9664f = c4550cM9664f.m1724d().m1726b(AbstractC7876i.m9652k(C4550c.c.f1507b), Bitmap.Config.ARGB_8888).m1725a();
            z6 = true;
        }
        return z6 ? C7880m.m9659b(c7880m, null, null, null, null, null, null, null, null, null, c4550cM9664f, 511, null) : c7880m;
    }

    /* renamed from: f */
    public final Lifecycle m9553f(C7872e c7872e) {
        InterfaceC0004a interfaceC0004aM9596y = c7872e.m9596y();
        return AbstractC4458c.m1532e(interfaceC0004aM9596y instanceof InterfaceC0005b ? ((InterfaceC0005b) interfaceC0004aM9596y).getView().getContext() : c7872e.m9574c());
    }

    /* renamed from: g */
    public final boolean m9554g(C7872e c7872e, C7923e c7923e) {
        return (AbstractC7873f.m9641e(c7872e).isEmpty() || ArraysKt.contains(AbstractC4595d.m2055f(), AbstractC7876i.m9650i(c7872e))) && (!AbstractC4455a.m1522d(AbstractC7876i.m9650i(c7872e)) || (m9556i(c7872e, AbstractC7876i.m9650i(c7872e)) && this.f10489c.mo1547b(c7923e)));
    }

    /* renamed from: h */
    public final boolean m9555h(C7880m c7880m) {
        return !AbstractC4455a.m1522d(AbstractC7876i.m9651j(c7880m)) || this.f10489c.mo1546a();
    }

    /* renamed from: i */
    public final boolean m9556i(C7872e c7872e, Bitmap.Config config) {
        if (!AbstractC4455a.m1522d(config)) {
            return true;
        }
        if (!AbstractC7876i.m9646e(c7872e)) {
            return false;
        }
        InterfaceC0004a interfaceC0004aM9596y = c7872e.m9596y();
        if (interfaceC0004aM9596y instanceof InterfaceC0005b) {
            View view = ((InterfaceC0005b) interfaceC0004aM9596y).getView();
            if (view.isAttachedToWindow() && !view.isHardwareAccelerated()) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: j */
    public final C4550c m9557j(C7872e c7872e, C7923e c7923e) {
        Bitmap.Config configM9650i = AbstractC7876i.m9650i(c7872e);
        boolean zM9648g = AbstractC7876i.m9648g(c7872e);
        if (!m9554g(c7872e, c7923e)) {
            configM9650i = Bitmap.Config.ARGB_8888;
        }
        boolean z6 = zM9648g && AbstractC7873f.m9641e(c7872e).isEmpty() && configM9650i != Bitmap.Config.ALPHA_8;
        C4550c.a aVar = new C4550c.a(MapsKt.plus(c7872e.m9578g().m9613f().m1722b(), c7872e.m9582k().m1722b()));
        if (configM9650i != AbstractC7876i.m9650i(c7872e)) {
            aVar = aVar.m1726b(AbstractC7876i.m9652k(C4550c.c.f1507b), configM9650i);
        }
        if (z6 != AbstractC7876i.m9648g(c7872e)) {
            aVar = aVar.m1726b(AbstractC7876i.m9647f(C4550c.c.f1507b), Boolean.valueOf(z6));
        }
        return aVar.m1725a();
    }

    /* renamed from: k */
    public final Precision m9558k(C7872e c7872e, InterfaceC7925g interfaceC7925g) {
        return (c7872e.m9579h().m9636m() == null && Intrinsics.areEqual(interfaceC7925g, InterfaceC7925g.f10647c0)) ? Precision.f1916b : ((c7872e.m9596y() instanceof InterfaceC0005b) && (interfaceC7925g instanceof InterfaceC7927i) && (((InterfaceC0005b) c7872e.m9596y()).getView() instanceof ImageView) && ((InterfaceC0005b) c7872e.m9596y()).getView() == ((InterfaceC7927i) interfaceC7925g).getView()) ? Precision.f1916b : Precision.f1915a;
    }

    /* renamed from: l */
    public final Scale m9559l(C7872e c7872e) {
        InterfaceC0004a interfaceC0004aM9596y = c7872e.m9596y();
        InterfaceC0005b interfaceC0005b = interfaceC0004aM9596y instanceof InterfaceC0005b ? (InterfaceC0005b) interfaceC0004aM9596y : null;
        KeyEvent.Callback view = interfaceC0005b != null ? interfaceC0005b.getView() : null;
        ImageView imageView = view instanceof ImageView ? (ImageView) view : null;
        return imageView != null ? AbstractC4595d.m2054e(imageView) : c7872e.m9594w();
    }

    /* renamed from: m */
    public final InterfaceC7925g m9560m(C7872e c7872e) {
        ImageView.ScaleType scaleType;
        if (!(c7872e.m9596y() instanceof InterfaceC0005b)) {
            return InterfaceC7925g.f10647c0;
        }
        View view = ((InterfaceC0005b) c7872e.m9596y()).getView();
        return ((view instanceof ImageView) && ((scaleType = ((ImageView) view).getScaleType()) == ImageView.ScaleType.CENTER || scaleType == ImageView.ScaleType.MATRIX)) ? InterfaceC7925g.f10647c0 : AbstractC7928j.m9731b(view, false, 2, null);
    }
}
