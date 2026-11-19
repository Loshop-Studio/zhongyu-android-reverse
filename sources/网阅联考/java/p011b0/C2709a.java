package p011b0;

import java.util.ArrayList;
import java.util.List;
import p076j.InterfaceC3791a;

/* renamed from: b0.a */
/* loaded from: classes2.dex */
public class C2709a {

    /* renamed from: a */
    public final List f444a = new ArrayList();

    /* renamed from: b0.a$a */
    public static final class a {

        /* renamed from: a */
        public final Class f445a;

        /* renamed from: b */
        public final InterfaceC3791a f446b;

        public a(Class cls, InterfaceC3791a interfaceC3791a) {
            this.f445a = cls;
            this.f446b = interfaceC3791a;
        }

        /* renamed from: a */
        public boolean m1486a(Class cls) {
            return this.f445a.isAssignableFrom(cls);
        }
    }

    /* renamed from: a */
    public synchronized void m1484a(Class cls, InterfaceC3791a interfaceC3791a) {
        this.f444a.add(new a(cls, interfaceC3791a));
    }

    /* renamed from: b */
    public synchronized InterfaceC3791a m1485b(Class cls) {
        for (a aVar : this.f444a) {
            if (aVar.m1486a(cls)) {
                return aVar.f446b;
            }
        }
        return null;
    }
}
