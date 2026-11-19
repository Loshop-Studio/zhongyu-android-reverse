package coil3.request;

import android.view.View;
import coil3.util.AbstractC4595d;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.GlobalScope;
import kotlinx.coroutines.Job;
import p187y.C7885r;

/* loaded from: classes3.dex */
public final class ViewTargetRequestManager implements View.OnAttachStateChangeListener {

    /* renamed from: a */
    public final View f1908a;

    /* renamed from: b */
    public C7885r f1909b;

    /* renamed from: c */
    public Job f1910c;

    /* renamed from: d */
    public ViewTargetRequestDelegate f1911d;

    /* renamed from: e */
    public boolean f1912e;

    public ViewTargetRequestManager(View view) {
        this.f1908a = view;
    }

    /* renamed from: a */
    public final synchronized void m2009a() {
        try {
            Job job = this.f1910c;
            if (job != null) {
                Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
            }
            this.f1910c = BuildersKt__Builders_commonKt.launch$default(GlobalScope.INSTANCE, Dispatchers.getMain().getImmediate(), null, new ViewTargetRequestManager$dispose$1(this, null), 2, null);
            this.f1909b = null;
        } catch (Throwable th) {
            throw th;
        }
    }

    /* renamed from: b */
    public final synchronized C7885r m2010b(Deferred deferred) {
        C7885r c7885r = this.f1909b;
        if (c7885r != null && AbstractC4595d.m2058i() && this.f1912e) {
            this.f1912e = false;
            c7885r.m9675b(deferred);
            return c7885r;
        }
        Job job = this.f1910c;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        this.f1910c = null;
        C7885r c7885r2 = new C7885r(this.f1908a, deferred);
        this.f1909b = c7885r2;
        return c7885r2;
    }

    /* renamed from: c */
    public final void m2011c(ViewTargetRequestDelegate viewTargetRequestDelegate) {
        ViewTargetRequestDelegate viewTargetRequestDelegate2 = this.f1911d;
        if (viewTargetRequestDelegate2 != null) {
            viewTargetRequestDelegate2.m2007d();
        }
        this.f1911d = viewTargetRequestDelegate;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
        ViewTargetRequestDelegate viewTargetRequestDelegate = this.f1911d;
        if (viewTargetRequestDelegate == null) {
            return;
        }
        this.f1912e = true;
        viewTargetRequestDelegate.m2008e();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        ViewTargetRequestDelegate viewTargetRequestDelegate = this.f1911d;
        if (viewTargetRequestDelegate != null) {
            viewTargetRequestDelegate.m2007d();
        }
    }
}
