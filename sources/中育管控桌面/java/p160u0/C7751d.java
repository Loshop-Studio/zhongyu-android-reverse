package p160u0;

import android.content.Context;
import p160u0.InterfaceC7749b;

/* renamed from: u0.d */
/* loaded from: classes3.dex */
public final class C7751d implements InterfaceC7749b {

    /* renamed from: a */
    public final Context f10243a;

    /* renamed from: b */
    public final InterfaceC7749b.a f10244b;

    public C7751d(Context context, InterfaceC7749b.a aVar) {
        this.f10243a = context.getApplicationContext();
        this.f10244b = aVar;
    }

    /* renamed from: j */
    public final void m9260j() {
        C7765r.m9286a(this.f10243a).m9289d(this.f10244b);
    }

    /* renamed from: k */
    public final void m9261k() {
        C7765r.m9286a(this.f10243a).m9290e(this.f10244b);
    }

    @Override // p160u0.InterfaceC7759l
    public void onStart() {
        m9260j();
    }

    @Override // p160u0.InterfaceC7759l
    public void onStop() {
        m9261k();
    }

    @Override // p160u0.InterfaceC7759l
    /* renamed from: d */
    public void mo2533d() {
    }
}
