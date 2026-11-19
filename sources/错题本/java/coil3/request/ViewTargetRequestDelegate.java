package coil3.request;

import android.view.DefaultLifecycleObserver;
import android.view.Lifecycle;
import android.view.LifecycleOwner;
import androidx.constraintlayout.widget.ConstraintLayout;
import coil3.C3333r;
import coil3.target.GenericViewTarget;
import coil3.util.AbstractC3343g;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.InterfaceC6013w0;
import p045d6.C5443s;
import p075h6.InterfaceC5631c;
import p154s.C6532f;
import p154s.InterfaceC6539m;
import p204y1.AbstractC6768a;

@Metadata(m5109d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, m5110d2 = {"Lcoil3/request/ViewTargetRequestDelegate;", "Ls/m;", "Landroidx/lifecycle/DefaultLifecycleObserver;", "coil-core_release"}, m5111k = 1, m5112mv = {2, 1, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes2.dex */
public final class ViewTargetRequestDelegate implements InterfaceC6539m, DefaultLifecycleObserver {

    /* renamed from: a */
    public final C3333r f2054a;

    /* renamed from: b */
    public final C6532f f2055b;

    /* renamed from: c */
    public final GenericViewTarget f2056c;

    /* renamed from: d */
    public final Lifecycle f2057d;

    /* renamed from: e */
    public final InterfaceC6013w0 f2058e;

    public ViewTargetRequestDelegate(C3333r c3333r, C6532f c6532f, GenericViewTarget genericViewTarget, Lifecycle lifecycle, InterfaceC6013w0 interfaceC6013w0) {
        this.f2054a = c3333r;
        this.f2055b = c6532f;
        this.f2056c = genericViewTarget;
        this.f2057d = lifecycle;
        this.f2058e = interfaceC6013w0;
    }

    @Override // p154s.InterfaceC6539m
    /* renamed from: a */
    public final Object mo2279a(InterfaceC5631c interfaceC5631c) {
        Object objM2287a;
        Lifecycle lifecycle = this.f2057d;
        return (lifecycle == null || (objM2287a = AbstractC3343g.m2287a(lifecycle, (ContinuationImpl) interfaceC5631c)) != CoroutineSingletons.COROUTINE_SUSPENDED) ? C5443s.f8405a : objM2287a;
    }

    @Override // p154s.InterfaceC6539m
    /* renamed from: b */
    public final void mo2280b() {
        this.f2056c.getClass();
        throw null;
    }

    @Override // android.view.DefaultLifecycleObserver
    public final void onDestroy(LifecycleOwner lifecycleOwner) {
        this.f2056c.getClass();
        AbstractC6768a.m6449n(null);
        throw null;
    }

    @Override // p154s.InterfaceC6539m
    public final void start() {
        Lifecycle lifecycle = this.f2057d;
        if (lifecycle != null) {
            lifecycle.addObserver(this);
        }
        GenericViewTarget genericViewTarget = this.f2056c;
        if (genericViewTarget != null && lifecycle != null) {
            lifecycle.removeObserver(genericViewTarget);
            lifecycle.addObserver(genericViewTarget);
        }
        genericViewTarget.getClass();
        AbstractC6768a.m6449n(null);
        throw null;
    }
}
