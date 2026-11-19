package p062d1;

import java.util.ArrayList;
import java.util.List;
import p162m0.InterfaceC8536a;

/* renamed from: d1.a */
/* loaded from: classes3.dex */
public class C7279a {

    /* renamed from: a */
    public final List f11720a = new ArrayList();

    /* renamed from: d1.a$a */
    public static final class a {

        /* renamed from: a */
        public final Class f11721a;

        /* renamed from: b */
        public final InterfaceC8536a f11722b;

        public a(Class cls, InterfaceC8536a interfaceC8536a) {
            this.f11721a = cls;
            this.f11722b = interfaceC8536a;
        }

        /* renamed from: a */
        public boolean m11532a(Class cls) {
            return this.f11721a.isAssignableFrom(cls);
        }
    }

    /* renamed from: a */
    public synchronized void m11530a(Class cls, InterfaceC8536a interfaceC8536a) {
        this.f11720a.add(new a(cls, interfaceC8536a));
    }

    /* renamed from: b */
    public synchronized InterfaceC8536a m11531b(Class cls) {
        for (a aVar : this.f11720a) {
            if (aVar.m11532a(cls)) {
                return aVar.f11722b;
            }
        }
        return null;
    }
}
