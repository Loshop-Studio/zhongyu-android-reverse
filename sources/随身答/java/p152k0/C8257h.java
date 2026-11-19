package p152k0;

import com.bumptech.glide.load.engine.C5491g;
import java.util.HashMap;
import java.util.Map;
import p122h0.InterfaceC8082b;

/* renamed from: k0.h */
/* loaded from: classes3.dex */
public final class C8257h {

    /* renamed from: a */
    public final Map f14337a = new HashMap();

    /* renamed from: b */
    public final Map f14338b = new HashMap();

    /* renamed from: a */
    public C5491g m13297a(InterfaceC8082b interfaceC8082b, boolean z9) {
        return (C5491g) m13298b(z9).get(interfaceC8082b);
    }

    /* renamed from: b */
    public final Map m13298b(boolean z9) {
        return z9 ? this.f14338b : this.f14337a;
    }

    /* renamed from: c */
    public void m13299c(InterfaceC8082b interfaceC8082b, C5491g c5491g) {
        m13298b(c5491g.m3212p()).put(interfaceC8082b, c5491g);
    }

    /* renamed from: d */
    public void m13300d(InterfaceC8082b interfaceC8082b, C5491g c5491g) {
        Map mapM13298b = m13298b(c5491g.m3212p());
        if (c5491g.equals(mapM13298b.get(interfaceC8082b))) {
            mapM13298b.remove(interfaceC8082b);
        }
    }
}
