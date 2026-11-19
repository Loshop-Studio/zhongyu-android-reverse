package coil3.request;

import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import coil3.util.LifecyclesKt;
import com.alibaba.sdk.android.oss.common.RequestParameters;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlinx.coroutines.Job;
import p290y.InterfaceC9893l;

@Metadata(m13557d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\tH\u0096@¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000e\u0010\u000bJ\u000f\u0010\u000f\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000f\u0010\u000bJ\u0017\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0014R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, m13558d2 = {"Lcoil3/request/LifecycleRequestDelegate;", "Ly/l;", "Landroidx/lifecycle/DefaultLifecycleObserver;", "Landroidx/lifecycle/Lifecycle;", RequestParameters.SUBRESOURCE_LIFECYCLE, "Lkotlinx/coroutines/Job;", "job", "<init>", "(Landroidx/lifecycle/Lifecycle;Lkotlinx/coroutines/Job;)V", "", "start", "()V", "a", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "complete", "d", "Landroidx/lifecycle/LifecycleOwner;", "owner", "onDestroy", "(Landroidx/lifecycle/LifecycleOwner;)V", "Landroidx/lifecycle/Lifecycle;", "b", "Lkotlinx/coroutines/Job;", "coil-core_release"}, m13559k = 1, m13560mv = {2, 2, 0}, m13562xi = 48)
/* loaded from: classes3.dex */
public final class LifecycleRequestDelegate implements InterfaceC9893l, DefaultLifecycleObserver {

    /* renamed from: a, reason: from kotlin metadata */
    public final Lifecycle lifecycle;

    /* renamed from: b, reason: from kotlin metadata */
    public final Job job;

    public LifecycleRequestDelegate(Lifecycle lifecycle, Job job) {
        this.lifecycle = lifecycle;
        this.job = job;
    }

    @Override // p290y.InterfaceC9893l
    /* renamed from: a */
    public Object mo3178a(Continuation continuation) {
        Object objM3195a = LifecyclesKt.m3195a(this.lifecycle, continuation);
        return objM3195a == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objM3195a : Unit.INSTANCE;
    }

    @Override // p290y.InterfaceC9893l
    public void complete() {
        this.lifecycle.removeObserver(this);
    }

    /* renamed from: d */
    public void m3179d() {
        Job.DefaultImpls.cancel$default(this.job, (CancellationException) null, 1, (Object) null);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onDestroy(LifecycleOwner owner) {
        m3179d();
    }

    @Override // p290y.InterfaceC9893l
    public void start() {
        this.lifecycle.addObserver(this);
    }
}
