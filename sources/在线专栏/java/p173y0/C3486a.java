package p173y0;

import android.os.Handler;
import android.os.Looper;
import p169x0.InterfaceC3451t;
import p172y.C3484c;

/* renamed from: y0.a */
/* loaded from: classes.dex */
public class C3486a implements InterfaceC3451t {

    /* renamed from: a */
    private final Handler f12160a = C3484c.m10558a(Looper.getMainLooper());

    @Override // p169x0.InterfaceC3451t
    /* renamed from: a */
    public void mo10516a(long j4, Runnable runnable) {
        this.f12160a.postDelayed(runnable, j4);
    }

    @Override // p169x0.InterfaceC3451t
    /* renamed from: b */
    public void mo10517b(Runnable runnable) {
        this.f12160a.removeCallbacks(runnable);
    }
}
