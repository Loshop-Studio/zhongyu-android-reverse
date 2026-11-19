package p020b1;

import android.content.Context;
import p020b1.InterfaceC4943b;

/* renamed from: b1.d */
/* loaded from: classes3.dex */
public final class C4945d implements InterfaceC4943b {

    /* renamed from: a */
    public final Context f2353a;

    /* renamed from: b */
    public final InterfaceC4943b.a f2354b;

    public C4945d(Context context, InterfaceC4943b.a aVar) {
        this.f2353a = context.getApplicationContext();
        this.f2354b = aVar;
    }

    /* renamed from: i */
    public final void m2332i() {
        C4959r.m2359a(this.f2353a).m2362d(this.f2354b);
    }

    /* renamed from: j */
    public final void m2333j() {
        C4959r.m2359a(this.f2353a).m2363e(this.f2354b);
    }

    @Override // p020b1.InterfaceC4953l
    public void onStart() {
        m2332i();
    }

    @Override // p020b1.InterfaceC4953l
    public void onStop() {
        m2333j();
    }

    @Override // p020b1.InterfaceC4953l
    public void onDestroy() {
    }
}
