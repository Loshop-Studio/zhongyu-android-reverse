package p184o0;

import com.bumptech.glide.load.engine.C5380g;
import java.util.HashMap;
import java.util.Map;
import p162m0.InterfaceC8537b;

/* renamed from: o0.h */
/* loaded from: classes3.dex */
public final class C8688h {

    /* renamed from: a */
    public final Map f14436a = new HashMap();

    /* renamed from: b */
    public final Map f14437b = new HashMap();

    /* renamed from: a */
    public C5380g m14286a(InterfaceC8537b interfaceC8537b, boolean z9) {
        return (C5380g) m14287b(z9).get(interfaceC8537b);
    }

    /* renamed from: b */
    public final Map m14287b(boolean z9) {
        return z9 ? this.f14437b : this.f14436a;
    }

    /* renamed from: c */
    public void m14288c(InterfaceC8537b interfaceC8537b, C5380g c5380g) {
        m14287b(c5380g.m3560p()).put(interfaceC8537b, c5380g);
    }

    /* renamed from: d */
    public void m14289d(InterfaceC8537b interfaceC8537b, C5380g c5380g) {
        Map mapM14287b = m14287b(c5380g.m3560p());
        if (c5380g.equals(mapM14287b.get(interfaceC8537b))) {
            mapM14287b.remove(interfaceC8537b);
        }
    }
}
