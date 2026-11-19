package p011b0;

import java.util.ArrayList;
import java.util.List;
import p076j.InterfaceC3796f;

/* renamed from: b0.f */
/* loaded from: classes2.dex */
public class C2714f {

    /* renamed from: a */
    public final List f458a = new ArrayList();

    /* renamed from: b0.f$a */
    public static final class a {

        /* renamed from: a */
        public final Class f459a;

        /* renamed from: b */
        public final InterfaceC3796f f460b;

        public a(Class cls, InterfaceC3796f interfaceC3796f) {
            this.f459a = cls;
            this.f460b = interfaceC3796f;
        }

        /* renamed from: a */
        public boolean m1503a(Class cls) {
            return this.f459a.isAssignableFrom(cls);
        }
    }

    /* renamed from: a */
    public synchronized void m1501a(Class cls, InterfaceC3796f interfaceC3796f) {
        this.f458a.add(new a(cls, interfaceC3796f));
    }

    /* renamed from: b */
    public synchronized InterfaceC3796f m1502b(Class cls) {
        int size = this.f458a.size();
        for (int i4 = 0; i4 < size; i4++) {
            a aVar = (a) this.f458a.get(i4);
            if (aVar.m1503a(cls)) {
                return aVar.f460b;
            }
        }
        return null;
    }
}
