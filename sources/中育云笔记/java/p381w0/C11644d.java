package p381w0;

import android.content.Context;
import p381w0.InterfaceC11642b;

/* renamed from: w0.d */
/* loaded from: classes3.dex */
public final class C11644d implements InterfaceC11642b {

    /* renamed from: c */
    public final Context f27645c;

    /* renamed from: d */
    public final InterfaceC11642b.a f27646d;

    public C11644d(Context context, InterfaceC11642b.a aVar) {
        this.f27645c = context.getApplicationContext();
        this.f27646d = aVar;
    }

    /* renamed from: i */
    public final void m25761i() {
        C11658r.m25788a(this.f27645c).m25791d(this.f27646d);
    }

    /* renamed from: j */
    public final void m25762j() {
        C11658r.m25788a(this.f27645c).m25792e(this.f27646d);
    }

    @Override // p381w0.InterfaceC11652l
    public void onStart() {
        m25761i();
    }

    @Override // p381w0.InterfaceC11652l
    public void onStop() {
        m25762j();
    }

    @Override // p381w0.InterfaceC11652l
    public void onDestroy() {
    }
}
