package p413y0;

import java.util.ArrayList;
import java.util.List;
import p168h0.InterfaceC9434a;

/* renamed from: y0.a */
/* loaded from: classes3.dex */
public class C11881a {

    /* renamed from: a */
    public final List f28186a = new ArrayList();

    /* renamed from: y0.a$a */
    public static final class a {

        /* renamed from: a */
        public final Class f28187a;

        /* renamed from: b */
        public final InterfaceC9434a f28188b;

        public a(Class cls, InterfaceC9434a interfaceC9434a) {
            this.f28187a = cls;
            this.f28188b = interfaceC9434a;
        }

        /* renamed from: a */
        public boolean m26419a(Class cls) {
            return this.f28187a.isAssignableFrom(cls);
        }
    }

    /* renamed from: a */
    public synchronized void m26417a(Class cls, InterfaceC9434a interfaceC9434a) {
        this.f28186a.add(new a(cls, interfaceC9434a));
    }

    /* renamed from: b */
    public synchronized InterfaceC9434a m26418b(Class cls) {
        for (a aVar : this.f28186a) {
            if (aVar.m26419a(cls)) {
                return aVar.f28188b;
            }
        }
        return null;
    }
}
