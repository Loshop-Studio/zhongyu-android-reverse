package p067h0;

import com.bumptech.glide.load.engine.C4716g;
import java.util.HashMap;
import java.util.Map;
import p053f0.InterfaceC6283b;

/* renamed from: h0.h */
/* loaded from: classes3.dex */
public final class C6438h {

    /* renamed from: a */
    public final Map f8126a = new HashMap();

    /* renamed from: b */
    public final Map f8127b = new HashMap();

    /* renamed from: a */
    public C4716g m7045a(InterfaceC6283b interfaceC6283b, boolean z6) {
        return (C4716g) m7046b(z6).get(interfaceC6283b);
    }

    /* renamed from: b */
    public final Map m7046b(boolean z6) {
        return z6 ? this.f8127b : this.f8126a;
    }

    /* renamed from: c */
    public void m7047c(InterfaceC6283b interfaceC6283b, C4716g c4716g) {
        m7046b(c4716g.m2740p()).put(interfaceC6283b, c4716g);
    }

    /* renamed from: d */
    public void m7048d(InterfaceC6283b interfaceC6283b, C4716g c4716g) {
        Map mapM7046b = m7046b(c4716g.m2740p());
        if (c4716g.equals(mapM7046b.get(interfaceC6283b))) {
            mapM7046b.remove(interfaceC6283b);
        }
    }
}
