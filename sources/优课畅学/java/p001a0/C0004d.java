package p001a0;

import android.content.Context;
import p001a0.InterfaceC0002b;

/* renamed from: a0.d */
/* loaded from: classes3.dex */
public final class C0004d implements InterfaceC0002b {

    /* renamed from: a */
    public final Context f15a;

    /* renamed from: b */
    public final InterfaceC0002b.a f16b;

    public C0004d(Context context, InterfaceC0002b.a aVar) {
        this.f15a = context.getApplicationContext();
        this.f16b = aVar;
    }

    /* renamed from: i */
    public final void m4i() {
        C0018r.m31a(this.f15a).m34d(this.f16b);
    }

    /* renamed from: j */
    public final void m5j() {
        C0018r.m31a(this.f15a).m35e(this.f16b);
    }

    @Override // p001a0.InterfaceC0012l
    public void onStart() {
        m4i();
    }

    @Override // p001a0.InterfaceC0012l
    public void onStop() {
        m5j();
    }

    @Override // p001a0.InterfaceC0012l
    public void onDestroy() {
    }
}
