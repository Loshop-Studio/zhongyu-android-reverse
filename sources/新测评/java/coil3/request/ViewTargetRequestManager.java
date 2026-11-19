package coil3.request;

import android.view.View;
import coil3.util.AbstractC5214d;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.GlobalScope;
import kotlinx.coroutines.Job;
import p290y.C9897p;

/* loaded from: classes3.dex */
public final class ViewTargetRequestManager implements View.OnAttachStateChangeListener {

    /* renamed from: a */
    public final View f3224a;

    /* renamed from: b */
    public C9897p f3225b;

    /* renamed from: c */
    public Job f3226c;

    /* renamed from: d */
    public ViewTargetRequestDelegate f3227d;

    /* renamed from: e */
    public boolean f3228e;

    public ViewTargetRequestManager(View view) {
        this.f3224a = view;
    }

    /* renamed from: a */
    public final synchronized void m3183a() {
        try {
            Job job = this.f3226c;
            if (job != null) {
                Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
            }
            this.f3226c = BuildersKt__Builders_commonKt.launch$default(GlobalScope.INSTANCE, Dispatchers.getMain().getImmediate(), null, new ViewTargetRequestManager$dispose$1(this, null), 2, null);
            this.f3225b = null;
        } catch (Throwable th) {
            throw th;
        }
    }

    /* renamed from: b */
    public final synchronized C9897p m3184b(Deferred deferred) {
        C9897p c9897p = this.f3225b;
        if (c9897p != null && AbstractC5214d.m3232i() && this.f3228e) {
            this.f3228e = false;
            c9897p.m16712b(deferred);
            return c9897p;
        }
        Job job = this.f3226c;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        this.f3226c = null;
        C9897p c9897p2 = new C9897p(this.f3224a, deferred);
        this.f3225b = c9897p2;
        return c9897p2;
    }

    /* renamed from: c */
    public final void m3185c(ViewTargetRequestDelegate viewTargetRequestDelegate) {
        ViewTargetRequestDelegate viewTargetRequestDelegate2 = this.f3227d;
        if (viewTargetRequestDelegate2 != null) {
            viewTargetRequestDelegate2.m3181d();
        }
        this.f3227d = viewTargetRequestDelegate;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
        ViewTargetRequestDelegate viewTargetRequestDelegate = this.f3227d;
        if (viewTargetRequestDelegate == null) {
            return;
        }
        this.f3228e = true;
        viewTargetRequestDelegate.m3182e();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        ViewTargetRequestDelegate viewTargetRequestDelegate = this.f3227d;
        if (viewTargetRequestDelegate != null) {
            viewTargetRequestDelegate.m3181d();
        }
    }
}
