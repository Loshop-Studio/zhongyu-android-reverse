package p062d1;

import java.util.ArrayList;
import java.util.List;
import p162m0.InterfaceC8541f;

/* renamed from: d1.f */
/* loaded from: classes3.dex */
public class C7284f {

    /* renamed from: a */
    public final List f11734a = new ArrayList();

    /* renamed from: d1.f$a */
    public static final class a {

        /* renamed from: a */
        public final Class f11735a;

        /* renamed from: b */
        public final InterfaceC8541f f11736b;

        public a(Class cls, InterfaceC8541f interfaceC8541f) {
            this.f11735a = cls;
            this.f11736b = interfaceC8541f;
        }

        /* renamed from: a */
        public boolean m11549a(Class cls) {
            return this.f11735a.isAssignableFrom(cls);
        }
    }

    /* renamed from: a */
    public synchronized void m11547a(Class cls, InterfaceC8541f interfaceC8541f) {
        this.f11734a.add(new a(cls, interfaceC8541f));
    }

    /* renamed from: b */
    public synchronized InterfaceC8541f m11548b(Class cls) {
        int size = this.f11734a.size();
        for (int i10 = 0; i10 < size; i10++) {
            a aVar = (a) this.f11734a.get(i10);
            if (aVar.m11549a(cls)) {
                return aVar.f11736b;
            }
        }
        return null;
    }
}
