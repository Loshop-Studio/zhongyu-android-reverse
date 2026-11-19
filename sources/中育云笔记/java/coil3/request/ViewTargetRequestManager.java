package coil3.request;

import android.view.View;
import coil3.util.AbstractC5491d;
import kotlinx.coroutines.InterfaceC10045g;
import p380w.C11639s;
import sd.AbstractC11117h;
import sd.C11119h1;
import sd.C11157r0;
import sd.InterfaceC11138m0;

/* loaded from: classes3.dex */
public final class ViewTargetRequestManager implements View.OnAttachStateChangeListener {

    /* renamed from: c */
    public final View f3899c;

    /* renamed from: d */
    public C11639s f3900d;

    /* renamed from: e */
    public InterfaceC10045g f3901e;

    /* renamed from: f */
    public ViewTargetRequestDelegate f3902f;

    /* renamed from: g */
    public boolean f3903g;

    public ViewTargetRequestManager(View view) {
        this.f3899c = view;
    }

    /* renamed from: a */
    public final synchronized void m3274a() {
        try {
            InterfaceC10045g interfaceC10045g = this.f3901e;
            if (interfaceC10045g != null) {
                InterfaceC10045g.a.m20900a(interfaceC10045g, null, 1, null);
            }
            this.f3901e = AbstractC11117h.m24726d(C11119h1.f26784c, C11157r0.m24800c().mo24804i(), null, new ViewTargetRequestManager$dispose$1(this, null), 2, null);
            this.f3900d = null;
        } catch (Throwable th) {
            throw th;
        }
    }

    /* renamed from: b */
    public final synchronized C11639s m3275b(InterfaceC11138m0 interfaceC11138m0) {
        C11639s c11639s = this.f3900d;
        if (c11639s != null && AbstractC5491d.m3326i() && this.f3903g) {
            this.f3903g = false;
            c11639s.m25756a(interfaceC11138m0);
            return c11639s;
        }
        InterfaceC10045g interfaceC10045g = this.f3901e;
        if (interfaceC10045g != null) {
            InterfaceC10045g.a.m20900a(interfaceC10045g, null, 1, null);
        }
        this.f3901e = null;
        C11639s c11639s2 = new C11639s(this.f3899c, interfaceC11138m0);
        this.f3900d = c11639s2;
        return c11639s2;
    }

    /* renamed from: c */
    public final void m3276c(ViewTargetRequestDelegate viewTargetRequestDelegate) {
        ViewTargetRequestDelegate viewTargetRequestDelegate2 = this.f3902f;
        if (viewTargetRequestDelegate2 != null) {
            viewTargetRequestDelegate2.m3272d();
        }
        this.f3902f = viewTargetRequestDelegate;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
        ViewTargetRequestDelegate viewTargetRequestDelegate = this.f3902f;
        if (viewTargetRequestDelegate == null) {
            return;
        }
        this.f3903g = true;
        viewTargetRequestDelegate.m3273e();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        ViewTargetRequestDelegate viewTargetRequestDelegate = this.f3902f;
        if (viewTargetRequestDelegate != null) {
            viewTargetRequestDelegate.m3272d();
        }
    }
}
