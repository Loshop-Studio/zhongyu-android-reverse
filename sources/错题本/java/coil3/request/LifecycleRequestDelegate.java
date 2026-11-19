package coil3.request;

import android.view.DefaultLifecycleObserver;
import android.view.Lifecycle;
import android.view.LifecycleOwner;
import androidx.constraintlayout.widget.ConstraintLayout;
import coil3.util.AbstractC3343g;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.InterfaceC6013w0;
import p045d6.C5443s;
import p075h6.InterfaceC5631c;
import p154s.InterfaceC6539m;

@Metadata(m5109d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, m5110d2 = {"Lcoil3/request/LifecycleRequestDelegate;", "Ls/m;", "Landroidx/lifecycle/DefaultLifecycleObserver;", "coil-core_release"}, m5111k = 1, m5112mv = {2, 1, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes2.dex */
public final class LifecycleRequestDelegate implements InterfaceC6539m, DefaultLifecycleObserver {

    /* renamed from: a */
    public final Lifecycle f2052a;

    /* renamed from: b */
    public final InterfaceC6013w0 f2053b;

    public LifecycleRequestDelegate(Lifecycle lifecycle, InterfaceC6013w0 interfaceC6013w0) {
        this.f2052a = lifecycle;
        this.f2053b = interfaceC6013w0;
    }

    @Override // p154s.InterfaceC6539m
    /* renamed from: a */
    public final Object mo2279a(InterfaceC5631c interfaceC5631c) throws Throwable {
        Object objM2287a = AbstractC3343g.m2287a(this.f2052a, (ContinuationImpl) interfaceC5631c);
        return objM2287a == CoroutineSingletons.COROUTINE_SUSPENDED ? objM2287a : C5443s.f8405a;
    }

    @Override // p154s.InterfaceC6539m
    public final void complete() {
        this.f2052a.removeObserver(this);
    }

    @Override // android.view.DefaultLifecycleObserver
    public final void onDestroy(LifecycleOwner lifecycleOwner) {
        this.f2053b.cancel(null);
    }

    @Override // p154s.InterfaceC6539m
    public final void start() {
        this.f2052a.addObserver(this);
    }
}
