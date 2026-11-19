package p308z0;

import java.util.ArrayList;
import java.util.List;
import p122h0.InterfaceC8081a;

/* renamed from: z0.a */
/* loaded from: classes3.dex */
public class C9981a {

    /* renamed from: a */
    public final List f17957a = new ArrayList();

    /* renamed from: z0.a$a */
    public static final class a {

        /* renamed from: a */
        public final Class f17958a;

        /* renamed from: b */
        public final InterfaceC8081a f17959b;

        public a(Class cls, InterfaceC8081a interfaceC8081a) {
            this.f17958a = cls;
            this.f17959b = interfaceC8081a;
        }

        /* renamed from: a */
        public boolean m17273a(Class cls) {
            return this.f17958a.isAssignableFrom(cls);
        }
    }

    /* renamed from: a */
    public synchronized void m17271a(Class cls, InterfaceC8081a interfaceC8081a) {
        this.f17957a.add(new a(cls, interfaceC8081a));
    }

    /* renamed from: b */
    public synchronized InterfaceC8081a m17272b(Class cls) {
        for (a aVar : this.f17957a) {
            if (aVar.m17273a(cls)) {
                return aVar.f17959b;
            }
        }
        return null;
    }
}
