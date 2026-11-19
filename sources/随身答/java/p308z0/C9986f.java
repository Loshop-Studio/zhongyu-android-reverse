package p308z0;

import java.util.ArrayList;
import java.util.List;
import p122h0.InterfaceC8086f;

/* renamed from: z0.f */
/* loaded from: classes3.dex */
public class C9986f {

    /* renamed from: a */
    public final List f17971a = new ArrayList();

    /* renamed from: z0.f$a */
    public static final class a {

        /* renamed from: a */
        public final Class f17972a;

        /* renamed from: b */
        public final InterfaceC8086f f17973b;

        public a(Class cls, InterfaceC8086f interfaceC8086f) {
            this.f17972a = cls;
            this.f17973b = interfaceC8086f;
        }

        /* renamed from: a */
        public boolean m17290a(Class cls) {
            return this.f17972a.isAssignableFrom(cls);
        }
    }

    /* renamed from: a */
    public synchronized void m17288a(Class cls, InterfaceC8086f interfaceC8086f) {
        this.f17971a.add(new a(cls, interfaceC8086f));
    }

    /* renamed from: b */
    public synchronized InterfaceC8086f m17289b(Class cls) {
        int size = this.f17971a.size();
        for (int i9 = 0; i9 < size; i9++) {
            a aVar = (a) this.f17971a.get(i9);
            if (aVar.m17290a(cls)) {
                return aVar.f17973b;
            }
        }
        return null;
    }
}
