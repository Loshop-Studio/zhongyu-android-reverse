package p174w0;

import java.util.ArrayList;
import java.util.List;
import p053f0.InterfaceC6287f;

/* renamed from: w0.f */
/* loaded from: classes3.dex */
public class C7808f {

    /* renamed from: a */
    public final List f10369a = new ArrayList();

    /* renamed from: w0.f$a */
    public static final class a {

        /* renamed from: a */
        public final Class f10370a;

        /* renamed from: b */
        public final InterfaceC6287f f10371b;

        public a(Class cls, InterfaceC6287f interfaceC6287f) {
            this.f10370a = cls;
            this.f10371b = interfaceC6287f;
        }

        /* renamed from: a */
        public boolean m9400a(Class cls) {
            return this.f10370a.isAssignableFrom(cls);
        }
    }

    /* renamed from: a */
    public synchronized void m9398a(Class cls, InterfaceC6287f interfaceC6287f) {
        this.f10369a.add(new a(cls, interfaceC6287f));
    }

    /* renamed from: b */
    public synchronized InterfaceC6287f m9399b(Class cls) {
        int size = this.f10369a.size();
        for (int i6 = 0; i6 < size; i6++) {
            a aVar = (a) this.f10369a.get(i6);
            if (aVar.m9400a(cls)) {
                return aVar.f10371b;
            }
        }
        return null;
    }
}
