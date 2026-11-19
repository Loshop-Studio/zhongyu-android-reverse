package p111m0;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import p155s0.AbstractC6544c;

/* renamed from: m0.c */
/* loaded from: classes2.dex */
public final class C6080c extends AbstractC6544c {

    /* renamed from: d */
    public final Handler f9688d;

    /* renamed from: e */
    public final int f9689e;

    /* renamed from: f */
    public final long f9690f;

    /* renamed from: g */
    public Bitmap f9691g;

    public C6080c(Handler handler, int i, long j7) {
        this.f9688d = handler;
        this.f9689e = i;
        this.f9690f = j7;
    }

    @Override // p155s0.InterfaceC6550i
    /* renamed from: c */
    public final void mo2380c(Object obj) {
        this.f9691g = (Bitmap) obj;
        Handler handler = this.f9688d;
        handler.sendMessageAtTime(handler.obtainMessage(1, this), this.f9690f);
    }

    @Override // p155s0.InterfaceC6550i
    /* renamed from: f */
    public final void mo5786f(Drawable drawable) {
        this.f9691g = null;
    }
}
