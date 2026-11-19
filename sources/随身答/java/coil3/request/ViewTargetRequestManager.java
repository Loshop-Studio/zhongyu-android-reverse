package coil3.request;

import android.view.View;
import coil3.util.AbstractC5349d;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.GlobalScope;
import kotlinx.coroutines.Job;
import p297y.C9937r;

/* loaded from: classes3.dex */
public final class ViewTargetRequestManager implements View.OnAttachStateChangeListener {

    /* renamed from: a */
    public final View f3112a;

    /* renamed from: b */
    public C9937r f3113b;

    /* renamed from: c */
    public Job f3114c;

    /* renamed from: d */
    public ViewTargetRequestDelegate f3115d;

    /* renamed from: e */
    public boolean f3116e;

    public ViewTargetRequestManager(View view) {
        this.f3112a = view;
    }

    /* renamed from: a */
    public final synchronized void m2903a() {
        try {
            Job job = this.f3114c;
            if (job != null) {
                Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
            }
            this.f3114c = BuildersKt__Builders_commonKt.launch$default(GlobalScope.INSTANCE, Dispatchers.getMain().getImmediate(), null, new ViewTargetRequestManager$dispose$1(this, null), 2, null);
            this.f3113b = null;
        } catch (Throwable th) {
            throw th;
        }
    }

    /* renamed from: b */
    public final synchronized C9937r m2904b(Deferred deferred) {
        C9937r c9937r = this.f3113b;
        if (c9937r != null && AbstractC5349d.m2949i() && this.f3116e) {
            this.f3116e = false;
            c9937r.m17121b(deferred);
            return c9937r;
        }
        Job job = this.f3114c;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        this.f3114c = null;
        C9937r c9937r2 = new C9937r(this.f3112a, deferred);
        this.f3113b = c9937r2;
        return c9937r2;
    }

    /* renamed from: c */
    public final void m2905c(ViewTargetRequestDelegate viewTargetRequestDelegate) {
        ViewTargetRequestDelegate viewTargetRequestDelegate2 = this.f3115d;
        if (viewTargetRequestDelegate2 != null) {
            viewTargetRequestDelegate2.m2901d();
        }
        this.f3115d = viewTargetRequestDelegate;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
        ViewTargetRequestDelegate viewTargetRequestDelegate = this.f3115d;
        if (viewTargetRequestDelegate == null) {
            return;
        }
        this.f3116e = true;
        viewTargetRequestDelegate.m2902e();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        ViewTargetRequestDelegate viewTargetRequestDelegate = this.f3115d;
        if (viewTargetRequestDelegate != null) {
            viewTargetRequestDelegate.m2901d();
        }
    }
}
