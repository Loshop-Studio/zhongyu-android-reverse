package p031c0;

import java.util.ArrayList;
import java.util.List;
import p160l.InterfaceC9227a;

/* renamed from: c0.a */
/* loaded from: classes3.dex */
public class C5222a {

    /* renamed from: a */
    public final List f2298a = new ArrayList();

    /* renamed from: c0.a$a */
    public static final class a {

        /* renamed from: a */
        public final Class f2299a;

        /* renamed from: b */
        public final InterfaceC9227a f2300b;

        public a(Class cls, InterfaceC9227a interfaceC9227a) {
            this.f2299a = cls;
            this.f2300b = interfaceC9227a;
        }

        /* renamed from: a */
        public boolean m2115a(Class cls) {
            return this.f2299a.isAssignableFrom(cls);
        }
    }

    /* renamed from: a */
    public synchronized void m2113a(Class cls, InterfaceC9227a interfaceC9227a) {
        this.f2298a.add(new a(cls, interfaceC9227a));
    }

    /* renamed from: b */
    public synchronized InterfaceC9227a m2114b(Class cls) {
        for (a aVar : this.f2298a) {
            if (aVar.m2115a(cls)) {
                return aVar.f2300b;
            }
        }
        return null;
    }
}
