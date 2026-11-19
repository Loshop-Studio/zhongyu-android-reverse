package p093m;

import com.bumptech.glide.load.engine.C2878g;
import java.util.HashMap;
import java.util.Map;
import p076j.InterfaceC3792b;

/* renamed from: m.h */
/* loaded from: classes2.dex */
public final class C4359h {

    /* renamed from: a */
    public final Map f4879a = new HashMap();

    /* renamed from: b */
    public final Map f4880b = new HashMap();

    /* renamed from: a */
    public C2878g m5370a(InterfaceC3792b interfaceC3792b, boolean z3) {
        return (C2878g) m5371b(z3).get(interfaceC3792b);
    }

    /* renamed from: b */
    public final Map m5371b(boolean z3) {
        return z3 ? this.f4880b : this.f4879a;
    }

    /* renamed from: c */
    public void m5372c(InterfaceC3792b interfaceC3792b, C2878g c2878g) {
        m5371b(c2878g.m1887p()).put(interfaceC3792b, c2878g);
    }

    /* renamed from: d */
    public void m5373d(InterfaceC3792b interfaceC3792b, C2878g c2878g) {
        Map mapM5371b = m5371b(c2878g.m1887p());
        if (c2878g.equals(mapM5371b.get(interfaceC3792b))) {
            mapM5371b.remove(interfaceC3792b);
        }
    }
}
