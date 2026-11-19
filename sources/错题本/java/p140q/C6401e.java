package p140q;

import java.util.LinkedHashMap;
import p041d2.C5413c;

/* renamed from: q.e */
/* loaded from: classes2.dex */
public final class C6401e {

    /* renamed from: a */
    public final InterfaceC6405i f10501a;

    /* renamed from: b */
    public final C5413c f10502b;

    /* renamed from: c */
    public final Object f10503c = new Object();

    public C6401e(InterfaceC6405i interfaceC6405i, C5413c c5413c) {
        this.f10501a = interfaceC6405i;
        this.f10502b = c5413c;
    }

    /* renamed from: a */
    public final void m6067a() {
        synchronized (this.f10503c) {
            this.f10501a.clear();
            C5413c c5413c = this.f10502b;
            c5413c.f8374b = 0;
            ((LinkedHashMap) c5413c.f8375c).clear();
        }
    }
}
