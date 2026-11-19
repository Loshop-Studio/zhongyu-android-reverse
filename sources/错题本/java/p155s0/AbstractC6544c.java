package p155s0;

import android.graphics.drawable.Drawable;
import com.bumptech.glide.request.C3420a;
import p147r0.InterfaceC6444b;
import p180v0.AbstractC6664k;

/* renamed from: s0.c */
/* loaded from: classes2.dex */
public abstract class AbstractC6544c implements InterfaceC6550i {

    /* renamed from: a */
    public final int f10918a;

    /* renamed from: b */
    public final int f10919b;

    /* renamed from: c */
    public InterfaceC6444b f10920c;

    public AbstractC6544c() {
        if (!AbstractC6664k.m6327g(Integer.MIN_VALUE, Integer.MIN_VALUE)) {
            throw new IllegalArgumentException("Width and height must both be > 0 or Target#SIZE_ORIGINAL, but given width: -2147483648 and height: -2147483648");
        }
        this.f10918a = Integer.MIN_VALUE;
        this.f10919b = Integer.MIN_VALUE;
    }

    @Override // p155s0.InterfaceC6550i
    /* renamed from: a */
    public final InterfaceC6444b mo6101a() {
        return this.f10920c;
    }

    @Override // p155s0.InterfaceC6550i
    /* renamed from: d */
    public final void mo6103d(C3420a c3420a) throws Throwable {
        c3420a.m2431m(this.f10918a, this.f10919b);
    }

    @Override // p155s0.InterfaceC6550i
    /* renamed from: g */
    public final void mo6105g(C3420a c3420a) {
        this.f10920c = c3420a;
    }

    @Override // p127o0.InterfaceC6260f
    public final void onDestroy() {
    }

    @Override // p127o0.InterfaceC6260f
    public final void onStart() {
    }

    @Override // p127o0.InterfaceC6260f
    public final void onStop() {
    }

    @Override // p155s0.InterfaceC6550i
    /* renamed from: b */
    public final void mo6102b(C3420a c3420a) {
    }

    @Override // p155s0.InterfaceC6550i
    /* renamed from: e */
    public final void mo6104e(Drawable drawable) {
    }

    @Override // p155s0.InterfaceC6550i
    /* renamed from: h */
    public final void mo2381h(Drawable drawable) {
    }
}
