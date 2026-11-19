package coil3.request;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import coil3.InterfaceC5193e;
import coil3.util.LifecyclesKt;
import com.alibaba.sdk.android.oss.common.RequestParameters;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlinx.coroutines.Job;
import p002a0.InterfaceC0007b;
import p290y.AbstractC9898q;
import p290y.C9886e;
import p290y.InterfaceC9893l;

@Metadata(m13557d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B5\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0013\u0010\u0011J\u0010\u0010\u0014\u001a\u00020\u000fH\u0096@¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0016\u0010\u0011J\u0017\u0010\u0019\u001a\u00020\u000f2\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u001bR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u001cR\u0018\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0016\u0010\n\u001a\u0004\u0018\u00010\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u001fR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010 ¨\u0006!"}, m13558d2 = {"Lcoil3/request/ViewTargetRequestDelegate;", "Ly/l;", "Landroidx/lifecycle/DefaultLifecycleObserver;", "Lcoil3/e;", "imageLoader", "Ly/e;", "initialRequest", "La0/b;", TypedValues.AttributesType.S_TARGET, "Landroidx/lifecycle/Lifecycle;", RequestParameters.SUBRESOURCE_LIFECYCLE, "Lkotlinx/coroutines/Job;", "job", "<init>", "(Lcoil3/e;Ly/e;La0/b;Landroidx/lifecycle/Lifecycle;Lkotlinx/coroutines/Job;)V", "", "e", "()V", "b", "start", "a", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "d", "Landroidx/lifecycle/LifecycleOwner;", "owner", "onDestroy", "(Landroidx/lifecycle/LifecycleOwner;)V", "Lcoil3/e;", "Ly/e;", "c", "La0/b;", "Landroidx/lifecycle/Lifecycle;", "Lkotlinx/coroutines/Job;", "coil-core_release"}, m13559k = 1, m13560mv = {2, 2, 0}, m13562xi = 48)
/* loaded from: classes3.dex */
public final class ViewTargetRequestDelegate implements InterfaceC9893l, DefaultLifecycleObserver {

    /* renamed from: a, reason: from kotlin metadata */
    public final InterfaceC5193e imageLoader;

    /* renamed from: b, reason: from kotlin metadata */
    public final C9886e initialRequest;

    /* renamed from: c, reason: from kotlin metadata */
    public final InterfaceC0007b target;

    /* renamed from: d, reason: from kotlin metadata */
    public final Lifecycle lifecycle;

    /* renamed from: e, reason: from kotlin metadata */
    public final Job job;

    public ViewTargetRequestDelegate(InterfaceC5193e interfaceC5193e, C9886e c9886e, InterfaceC0007b interfaceC0007b, Lifecycle lifecycle, Job job) {
        this.imageLoader = interfaceC5193e;
        this.initialRequest = c9886e;
        this.target = interfaceC0007b;
        this.lifecycle = lifecycle;
        this.job = job;
    }

    @Override // p290y.InterfaceC9893l
    /* renamed from: a */
    public Object mo3178a(Continuation continuation) {
        Lifecycle lifecycle = this.lifecycle;
        if (lifecycle == null) {
            return Unit.INSTANCE;
        }
        Object objM3195a = LifecyclesKt.m3195a(lifecycle, continuation);
        return objM3195a == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objM3195a : Unit.INSTANCE;
    }

    @Override // p290y.InterfaceC9893l
    /* renamed from: b */
    public void mo3180b() {
        if (this.target.getView().isAttachedToWindow()) {
            return;
        }
        AbstractC9898q.m16713a(this.target.getView()).m3185c(this);
        throw new CancellationException("'ViewTarget.view' must be attached to a window.");
    }

    /* renamed from: d */
    public void m3181d() {
        Lifecycle lifecycle;
        Job.DefaultImpls.cancel$default(this.job, (CancellationException) null, 1, (Object) null);
        InterfaceC0007b interfaceC0007b = this.target;
        if ((interfaceC0007b instanceof LifecycleObserver) && (lifecycle = this.lifecycle) != null) {
            lifecycle.removeObserver((LifecycleObserver) interfaceC0007b);
        }
        Lifecycle lifecycle2 = this.lifecycle;
        if (lifecycle2 != null) {
            lifecycle2.removeObserver(this);
        }
    }

    /* renamed from: e */
    public final void m3182e() {
        this.imageLoader.mo2819d(this.initialRequest);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onDestroy(LifecycleOwner owner) {
        AbstractC9898q.m16713a(this.target.getView()).m3183a();
    }

    @Override // p290y.InterfaceC9893l
    public void start() {
        Lifecycle lifecycle;
        Lifecycle lifecycle2 = this.lifecycle;
        if (lifecycle2 != null) {
            lifecycle2.addObserver(this);
        }
        InterfaceC0007b interfaceC0007b = this.target;
        if ((interfaceC0007b instanceof LifecycleObserver) && (lifecycle = this.lifecycle) != null) {
            LifecyclesKt.m3196b(lifecycle, (LifecycleObserver) interfaceC0007b);
        }
        AbstractC9898q.m16713a(this.target.getView()).m3185c(this);
    }
}
