package p174w0;

import java.util.ArrayList;
import java.util.List;
import p053f0.InterfaceC6282a;

/* renamed from: w0.a */
/* loaded from: classes3.dex */
public class C7803a {

    /* renamed from: a */
    public final List f10355a = new ArrayList();

    /* renamed from: w0.a$a */
    public static final class a {

        /* renamed from: a */
        public final Class f10356a;

        /* renamed from: b */
        public final InterfaceC6282a f10357b;

        public a(Class cls, InterfaceC6282a interfaceC6282a) {
            this.f10356a = cls;
            this.f10357b = interfaceC6282a;
        }

        /* renamed from: a */
        public boolean m9383a(Class cls) {
            return this.f10356a.isAssignableFrom(cls);
        }
    }

    /* renamed from: a */
    public synchronized void m9381a(Class cls, InterfaceC6282a interfaceC6282a) {
        this.f10355a.add(new a(cls, interfaceC6282a));
    }

    /* renamed from: b */
    public synchronized InterfaceC6282a m9382b(Class cls) {
        for (a aVar : this.f10355a) {
            if (aVar.m9383a(cls)) {
                return aVar.f10357b;
            }
        }
        return null;
    }
}
