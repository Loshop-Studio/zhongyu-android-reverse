package p413y0;

import java.util.ArrayList;
import java.util.List;
import p168h0.InterfaceC9440g;

/* renamed from: y0.f */
/* loaded from: classes3.dex */
public class C11886f {

    /* renamed from: a */
    public final List f28200a = new ArrayList();

    /* renamed from: y0.f$a */
    public static final class a {

        /* renamed from: a */
        public final Class f28201a;

        /* renamed from: b */
        public final InterfaceC9440g f28202b;

        public a(Class cls, InterfaceC9440g interfaceC9440g) {
            this.f28201a = cls;
            this.f28202b = interfaceC9440g;
        }

        /* renamed from: a */
        public boolean m26436a(Class cls) {
            return this.f28201a.isAssignableFrom(cls);
        }
    }

    /* renamed from: a */
    public synchronized void m26434a(Class cls, InterfaceC9440g interfaceC9440g) {
        this.f28200a.add(new a(cls, interfaceC9440g));
    }

    /* renamed from: b */
    public synchronized InterfaceC9440g m26435b(Class cls) {
        int size = this.f28200a.size();
        for (int i10 = 0; i10 < size; i10++) {
            a aVar = (a) this.f28200a.get(i10);
            if (aVar.m26436a(cls)) {
                return aVar.f28202b;
            }
        }
        return null;
    }
}
