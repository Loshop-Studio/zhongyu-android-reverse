package p000a.p052k.p053b;

import android.content.res.Resources;
import p000a.p031h.p039f.C0217a;
import p000a.p052k.p053b.AbstractC0301c0;
import p000a.p052k.p053b.C0333s0;

/* renamed from: a.k.b.m0 */
/* loaded from: classes.dex */
public class RunnableC0321m0 implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ C0333s0.a f2020b;

    /* renamed from: c */
    public final /* synthetic */ ComponentCallbacksC0320m f2021c;

    /* renamed from: d */
    public final /* synthetic */ C0217a f2022d;

    public RunnableC0321m0(C0333s0.a aVar, ComponentCallbacksC0320m componentCallbacksC0320m, C0217a c0217a) {
        this.f2020b = aVar;
        this.f2021c = componentCallbacksC0320m;
        this.f2022d = c0217a;
    }

    @Override // java.lang.Runnable
    public void run() throws Resources.NotFoundException {
        ((AbstractC0301c0.d) this.f2020b).m1067a(this.f2021c, this.f2022d);
    }
}
