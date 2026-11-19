package p031c0;

import java.util.ArrayList;
import java.util.List;
import p160l.InterfaceC9232f;

/* renamed from: c0.f */
/* loaded from: classes3.dex */
public class C5227f {

    /* renamed from: a */
    public final List f2312a = new ArrayList();

    /* renamed from: c0.f$a */
    public static final class a {

        /* renamed from: a */
        public final Class f2313a;

        /* renamed from: b */
        public final InterfaceC9232f f2314b;

        public a(Class cls, InterfaceC9232f interfaceC9232f) {
            this.f2313a = cls;
            this.f2314b = interfaceC9232f;
        }

        /* renamed from: a */
        public boolean m2132a(Class cls) {
            return this.f2313a.isAssignableFrom(cls);
        }
    }

    /* renamed from: a */
    public synchronized void m2130a(Class cls, InterfaceC9232f interfaceC9232f) {
        this.f2312a.add(new a(cls, interfaceC9232f));
    }

    /* renamed from: b */
    public synchronized InterfaceC9232f m2131b(Class cls) {
        int size = this.f2312a.size();
        for (int i10 = 0; i10 < size; i10++) {
            a aVar = (a) this.f2312a.get(i10);
            if (aVar.m2132a(cls)) {
                return aVar.f2314b;
            }
        }
        return null;
    }
}
