package p039d0;

import com.bumptech.glide.load.engine.C3417c;
import p016b0.InterfaceC3072g0;
import p180v0.C6660g;

/* renamed from: d0.f */
/* loaded from: classes2.dex */
public final class C5403f extends C6660g {

    /* renamed from: d */
    public C3417c f8355d;

    @Override // p180v0.C6660g
    /* renamed from: b */
    public final int mo4797b(Object obj) {
        InterfaceC3072g0 interfaceC3072g0 = (InterfaceC3072g0) obj;
        if (interfaceC3072g0 == null) {
            return 1;
        }
        return interfaceC3072g0.getSize();
    }

    @Override // p180v0.C6660g
    /* renamed from: c */
    public final void mo4798c(Object obj, Object obj2) {
        InterfaceC3072g0 interfaceC3072g0 = (InterfaceC3072g0) obj2;
        C3417c c3417c = this.f8355d;
        if (c3417c == null || interfaceC3072g0 == null) {
            return;
        }
        c3417c.f2295e.m2039i(interfaceC3072g0, true);
    }
}
