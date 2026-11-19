package coil3.request;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import coil3.InterfaceC5328e;
import coil3.util.LifecyclesKt;
import com.alibaba.sdk.android.oss.common.RequestParameters;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlinx.coroutines.Job;
import p029c0.InterfaceC5218b;
import p297y.AbstractC9938s;
import p297y.C9924e;
import p297y.InterfaceC9933n;

@Metadata(m13412d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B5\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0013\u0010\u0011J\u0010\u0010\u0014\u001a\u00020\u000fH\u0096@¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0016\u0010\u0011J\u0017\u0010\u0019\u001a\u00020\u000f2\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u001bR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u001cR\u0018\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0016\u0010\n\u001a\u0004\u0018\u00010\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u001fR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010 ¨\u0006!"}, m13413d2 = {"Lcoil3/request/ViewTargetRequestDelegate;", "Ly/n;", "Landroidx/lifecycle/DefaultLifecycleObserver;", "Lcoil3/e;", "imageLoader", "Ly/e;", "initialRequest", "Lc0/b;", TypedValues.AttributesType.S_TARGET, "Landroidx/lifecycle/Lifecycle;", RequestParameters.SUBRESOURCE_LIFECYCLE, "Lkotlinx/coroutines/Job;", "job", "<init>", "(Lcoil3/e;Ly/e;Lc0/b;Landroidx/lifecycle/Lifecycle;Lkotlinx/coroutines/Job;)V", "", "e", "()V", "b", "start", "a", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "d", "Landroidx/lifecycle/LifecycleOwner;", "owner", "onDestroy", "(Landroidx/lifecycle/LifecycleOwner;)V", "Lcoil3/e;", "Ly/e;", "c", "Lc0/b;", "Landroidx/lifecycle/Lifecycle;", "Lkotlinx/coroutines/Job;", "coil-core_release"}, m13414k = 1, m13415mv = {2, 1, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes3.dex */
public final class ViewTargetRequestDelegate implements InterfaceC9933n, DefaultLifecycleObserver {

    /* renamed from: a, reason: from kotlin metadata */
    public final InterfaceC5328e imageLoader;

    /* renamed from: b, reason: from kotlin metadata */
    public final C9924e initialRequest;

    /* renamed from: c, reason: from kotlin metadata */
    public final InterfaceC5218b target;

    /* renamed from: d, reason: from kotlin metadata */
    public final Lifecycle lifecycle;

    /* renamed from: e, reason: from kotlin metadata */
    public final Job job;

    public ViewTargetRequestDelegate(InterfaceC5328e interfaceC5328e, C9924e c9924e, InterfaceC5218b interfaceC5218b, Lifecycle lifecycle, Job job) {
        this.imageLoader = interfaceC5328e;
        this.initialRequest = c9924e;
        this.target = interfaceC5218b;
        this.lifecycle = lifecycle;
        this.job = job;
    }

    @Override // p297y.InterfaceC9933n
    /* renamed from: a */
    public Object mo2898a(Continuation continuation) {
        Lifecycle lifecycle = this.lifecycle;
        if (lifecycle == null) {
            return Unit.INSTANCE;
        }
        Object objM2915a = LifecyclesKt.m2915a(lifecycle, continuation);
        return objM2915a == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objM2915a : Unit.INSTANCE;
    }

    @Override // p297y.InterfaceC9933n
    /* renamed from: b */
    public void mo2900b() {
        if (this.target.getView().isAttachedToWindow()) {
            return;
        }
        AbstractC9938s.m17122a(this.target.getView()).m2905c(this);
        throw new CancellationException("'ViewTarget.view' must be attached to a window.");
    }

    /* renamed from: d */
    public void m2901d() {
        Lifecycle lifecycle;
        Job.DefaultImpls.cancel$default(this.job, (CancellationException) null, 1, (Object) null);
        InterfaceC5218b interfaceC5218b = this.target;
        if ((interfaceC5218b instanceof LifecycleObserver) && (lifecycle = this.lifecycle) != null) {
            lifecycle.removeObserver((LifecycleObserver) interfaceC5218b);
        }
        Lifecycle lifecycle2 = this.lifecycle;
        if (lifecycle2 != null) {
            lifecycle2.removeObserver(this);
        }
    }

    /* renamed from: e */
    public final void m2902e() {
        this.imageLoader.mo2548d(this.initialRequest);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onDestroy(LifecycleOwner owner) {
        AbstractC9938s.m17122a(this.target.getView()).m2903a();
    }

    @Override // p297y.InterfaceC9933n
    public void start() {
        Lifecycle lifecycle;
        Lifecycle lifecycle2 = this.lifecycle;
        if (lifecycle2 != null) {
            lifecycle2.addObserver(this);
        }
        InterfaceC5218b interfaceC5218b = this.target;
        if ((interfaceC5218b instanceof LifecycleObserver) && (lifecycle = this.lifecycle) != null) {
            LifecyclesKt.m2916b(lifecycle, (LifecycleObserver) interfaceC5218b);
        }
        AbstractC9938s.m17122a(this.target.getView()).m2905c(this);
    }
}
