package p000a.p052k.p053b;

import android.graphics.Rect;
import android.view.View;
import p000a.p021e.C0129a;

/* renamed from: a.k.b.q0 */
/* loaded from: classes.dex */
public class RunnableC0329q0 implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ ComponentCallbacksC0320m f2044b;

    /* renamed from: c */
    public final /* synthetic */ ComponentCallbacksC0320m f2045c;

    /* renamed from: d */
    public final /* synthetic */ boolean f2046d;

    /* renamed from: e */
    public final /* synthetic */ C0129a f2047e;

    /* renamed from: f */
    public final /* synthetic */ View f2048f;

    /* renamed from: g */
    public final /* synthetic */ AbstractC0337u0 f2049g;

    /* renamed from: h */
    public final /* synthetic */ Rect f2050h;

    public RunnableC0329q0(ComponentCallbacksC0320m componentCallbacksC0320m, ComponentCallbacksC0320m componentCallbacksC0320m2, boolean z, C0129a c0129a, View view, AbstractC0337u0 abstractC0337u0, Rect rect) {
        this.f2044b = componentCallbacksC0320m;
        this.f2045c = componentCallbacksC0320m2;
        this.f2046d = z;
        this.f2047e = c0129a;
        this.f2048f = view;
        this.f2049g = abstractC0337u0;
        this.f2050h = rect;
    }

    @Override // java.lang.Runnable
    public void run() {
        C0333s0.m1202c(this.f2044b, this.f2045c, this.f2046d, this.f2047e, false);
        View view = this.f2048f;
        if (view != null) {
            this.f2049g.m1239j(view, this.f2050h);
        }
    }
}
