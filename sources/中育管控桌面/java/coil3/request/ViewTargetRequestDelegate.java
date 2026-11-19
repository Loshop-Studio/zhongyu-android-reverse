package coil3.request;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import coil3.InterfaceC4574e;
import coil3.util.LifecyclesKt;
import com.alibaba.sdk.android.oss.common.RequestParameters;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlinx.coroutines.Job;
import p001a0.InterfaceC0005b;
import p187y.AbstractC7886s;
import p187y.C7872e;
import p187y.InterfaceC7881n;

@Metadata(m7879d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B5\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0013\u0010\u0011J\u0010\u0010\u0014\u001a\u00020\u000fH\u0096@¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0016\u0010\u0011J\u0017\u0010\u0019\u001a\u00020\u000f2\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u001bR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u001cR\u0018\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0016\u0010\n\u001a\u0004\u0018\u00010\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u001fR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010 ¨\u0006!"}, m7880d2 = {"Lcoil3/request/ViewTargetRequestDelegate;", "Ly/n;", "Landroidx/lifecycle/DefaultLifecycleObserver;", "Lcoil3/e;", "imageLoader", "Ly/e;", "initialRequest", "La0/b;", TypedValues.AttributesType.S_TARGET, "Landroidx/lifecycle/Lifecycle;", RequestParameters.SUBRESOURCE_LIFECYCLE, "Lkotlinx/coroutines/Job;", "job", "<init>", "(Lcoil3/e;Ly/e;La0/b;Landroidx/lifecycle/Lifecycle;Lkotlinx/coroutines/Job;)V", "", "e", "()V", "b", "start", "a", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "d", "Landroidx/lifecycle/LifecycleOwner;", "owner", "onDestroy", "(Landroidx/lifecycle/LifecycleOwner;)V", "Lcoil3/e;", "Ly/e;", "c", "La0/b;", "Landroidx/lifecycle/Lifecycle;", "Lkotlinx/coroutines/Job;", "coil-core_release"}, m7881k = 1, m7882mv = {2, 2, 0}, m7884xi = 48)
/* loaded from: classes3.dex */
public final class ViewTargetRequestDelegate implements InterfaceC7881n, DefaultLifecycleObserver {

    /* renamed from: a, reason: from kotlin metadata */
    public final InterfaceC4574e imageLoader;

    /* renamed from: b, reason: from kotlin metadata */
    public final C7872e initialRequest;

    /* renamed from: c, reason: from kotlin metadata */
    public final InterfaceC0005b target;

    /* renamed from: d, reason: from kotlin metadata */
    public final Lifecycle lifecycle;

    /* renamed from: e, reason: from kotlin metadata */
    public final Job job;

    public ViewTargetRequestDelegate(InterfaceC4574e interfaceC4574e, C7872e c7872e, InterfaceC0005b interfaceC0005b, Lifecycle lifecycle, Job job) {
        this.imageLoader = interfaceC4574e;
        this.initialRequest = c7872e;
        this.target = interfaceC0005b;
        this.lifecycle = lifecycle;
        this.job = job;
    }

    @Override // p187y.InterfaceC7881n
    /* renamed from: a */
    public Object mo2004a(Continuation continuation) {
        Lifecycle lifecycle = this.lifecycle;
        if (lifecycle == null) {
            return Unit.INSTANCE;
        }
        Object objM2021a = LifecyclesKt.m2021a(lifecycle, continuation);
        return objM2021a == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objM2021a : Unit.INSTANCE;
    }

    @Override // p187y.InterfaceC7881n
    /* renamed from: b */
    public void mo2006b() {
        if (this.target.getView().isAttachedToWindow()) {
            return;
        }
        AbstractC7886s.m9676a(this.target.getView()).m2011c(this);
        throw new CancellationException("'ViewTarget.view' must be attached to a window.");
    }

    /* renamed from: d */
    public void m2007d() {
        Lifecycle lifecycle;
        Job.DefaultImpls.cancel$default(this.job, (CancellationException) null, 1, (Object) null);
        InterfaceC0005b interfaceC0005b = this.target;
        if ((interfaceC0005b instanceof LifecycleObserver) && (lifecycle = this.lifecycle) != null) {
            lifecycle.removeObserver((LifecycleObserver) interfaceC0005b);
        }
        Lifecycle lifecycle2 = this.lifecycle;
        if (lifecycle2 != null) {
            lifecycle2.removeObserver(this);
        }
    }

    /* renamed from: e */
    public final void m2008e() {
        this.imageLoader.mo1653d(this.initialRequest);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onDestroy(LifecycleOwner owner) {
        AbstractC7886s.m9676a(this.target.getView()).m2009a();
    }

    @Override // p187y.InterfaceC7881n
    public void start() {
        Lifecycle lifecycle;
        Lifecycle lifecycle2 = this.lifecycle;
        if (lifecycle2 != null) {
            lifecycle2.addObserver(this);
        }
        InterfaceC0005b interfaceC0005b = this.target;
        if ((interfaceC0005b instanceof LifecycleObserver) && (lifecycle = this.lifecycle) != null) {
            LifecyclesKt.m2022b(lifecycle, (LifecycleObserver) interfaceC0005b);
        }
        AbstractC7886s.m9676a(this.target.getView()).m2011c(this);
    }
}
