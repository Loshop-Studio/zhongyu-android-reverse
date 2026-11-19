package p198j0;

import com.bumptech.glide.load.engine.C5848g;
import java.util.HashMap;
import java.util.Map;
import p168h0.InterfaceC9435b;

/* renamed from: j0.h */
/* loaded from: classes3.dex */
public final class C9655h {

    /* renamed from: a */
    public final Map f22369a = new HashMap();

    /* renamed from: b */
    public final Map f22370b = new HashMap();

    /* renamed from: a */
    public C5848g m19050a(InterfaceC9435b interfaceC9435b, boolean z10) {
        return (C5848g) m19051b(z10).get(interfaceC9435b);
    }

    /* renamed from: b */
    public final Map m19051b(boolean z10) {
        return z10 ? this.f22370b : this.f22369a;
    }

    /* renamed from: c */
    public void m19052c(InterfaceC9435b interfaceC9435b, C5848g c5848g) {
        m19051b(c5848g.m4210p()).put(interfaceC9435b, c5848g);
    }

    /* renamed from: d */
    public void m19053d(InterfaceC9435b interfaceC9435b, C5848g c5848g) {
        Map mapM19051b = m19051b(c5848g.m4210p());
        if (c5848g.equals(mapM19051b.get(interfaceC9435b))) {
            mapM19051b.remove(interfaceC9435b);
        }
    }
}
