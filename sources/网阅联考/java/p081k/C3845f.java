package p081k;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import p062g0.AbstractC3749i;
import p081k.InterfaceC3844e;

/* renamed from: k.f */
/* loaded from: classes2.dex */
public class C3845f {

    /* renamed from: b */
    public static final InterfaceC3844e.a f4741b = new a();

    /* renamed from: a */
    public final Map f4742a = new HashMap();

    /* renamed from: k.f$a */
    public class a implements InterfaceC3844e.a {
        @Override // p081k.InterfaceC3844e.a
        /* renamed from: a */
        public Class mo5129a() {
            throw new UnsupportedOperationException("Not implemented");
        }

        @Override // p081k.InterfaceC3844e.a
        /* renamed from: b */
        public InterfaceC3844e mo5130b(Object obj) {
            return new b(obj);
        }
    }

    /* renamed from: k.f$b */
    public static final class b implements InterfaceC3844e {

        /* renamed from: a */
        public final Object f4743a;

        public b(Object obj) {
            this.f4743a = obj;
        }

        @Override // p081k.InterfaceC3844e
        /* renamed from: a */
        public Object mo5127a() {
            return this.f4743a;
        }

        @Override // p081k.InterfaceC3844e
        /* renamed from: b */
        public void mo5128b() {
        }
    }

    /* renamed from: a */
    public synchronized InterfaceC3844e m5131a(Object obj) {
        InterfaceC3844e.a aVar;
        AbstractC3749i.m4768d(obj);
        aVar = (InterfaceC3844e.a) this.f4742a.get(obj.getClass());
        if (aVar == null) {
            Iterator it = this.f4742a.values().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                InterfaceC3844e.a aVar2 = (InterfaceC3844e.a) it.next();
                if (aVar2.mo5129a().isAssignableFrom(obj.getClass())) {
                    aVar = aVar2;
                    break;
                }
            }
        }
        if (aVar == null) {
            aVar = f4741b;
        }
        return aVar.mo5130b(obj);
    }

    /* renamed from: b */
    public synchronized void m5132b(InterfaceC3844e.a aVar) {
        this.f4742a.put(aVar.mo5129a(), aVar);
    }
}
