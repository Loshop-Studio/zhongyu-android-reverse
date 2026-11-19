package p182n;

import com.bumptech.glide.load.engine.C5429g;
import java.util.HashMap;
import java.util.Map;
import p160l.InterfaceC9228b;

/* renamed from: n.h */
/* loaded from: classes3.dex */
public final class C9355h {

    /* renamed from: a */
    public final Map f18478a = new HashMap();

    /* renamed from: b */
    public final Map f18479b = new HashMap();

    /* renamed from: a */
    public C5429g m17232a(InterfaceC9228b interfaceC9228b, boolean z10) {
        return (C5429g) m17233b(z10).get(interfaceC9228b);
    }

    /* renamed from: b */
    public final Map m17233b(boolean z10) {
        return z10 ? this.f18479b : this.f18478a;
    }

    /* renamed from: c */
    public void m17234c(InterfaceC9228b interfaceC9228b, C5429g c5429g) {
        m17233b(c5429g.m3006p()).put(interfaceC9228b, c5429g);
    }

    /* renamed from: d */
    public void m17235d(InterfaceC9228b interfaceC9228b, C5429g c5429g) {
        Map mapM17233b = m17233b(c5429g.m3006p());
        if (c5429g.equals(mapM17233b.get(interfaceC9228b))) {
            mapM17233b.remove(interfaceC9228b);
        }
    }
}
