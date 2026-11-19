package p132i0;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import p091e1.AbstractC7837i;
import p132i0.InterfaceC8116e;

/* renamed from: i0.f */
/* loaded from: classes3.dex */
public class C8117f {

    /* renamed from: b */
    public static final InterfaceC8116e.a f13873b = new a();

    /* renamed from: a */
    public final Map f13874a = new HashMap();

    /* renamed from: i0.f$a */
    public class a implements InterfaceC8116e.a {
        @Override // p132i0.InterfaceC8116e.a
        /* renamed from: a */
        public Class mo12993a() {
            throw new UnsupportedOperationException("Not implemented");
        }

        @Override // p132i0.InterfaceC8116e.a
        /* renamed from: b */
        public InterfaceC8116e mo12994b(Object obj) {
            return new b(obj);
        }
    }

    /* renamed from: a */
    public synchronized InterfaceC8116e m12995a(Object obj) {
        InterfaceC8116e.a aVar;
        try {
            AbstractC7837i.m12256d(obj);
            aVar = (InterfaceC8116e.a) this.f13874a.get(obj.getClass());
            if (aVar == null) {
                Iterator it = this.f13874a.values().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    InterfaceC8116e.a aVar2 = (InterfaceC8116e.a) it.next();
                    if (aVar2.mo12993a().isAssignableFrom(obj.getClass())) {
                        aVar = aVar2;
                        break;
                    }
                }
            }
            if (aVar == null) {
                aVar = f13873b;
            }
        } catch (Throwable th) {
            throw th;
        }
        return aVar.mo12994b(obj);
    }

    /* renamed from: b */
    public synchronized void m12996b(InterfaceC8116e.a aVar) {
        this.f13874a.put(aVar.mo12993a(), aVar);
    }

    /* renamed from: i0.f$b */
    public static final class b implements InterfaceC8116e {

        /* renamed from: a */
        public final Object f13875a;

        public b(Object obj) {
            this.f13875a = obj;
        }

        @Override // p132i0.InterfaceC8116e
        /* renamed from: a */
        public Object mo12991a() {
            return this.f13875a;
        }

        @Override // p132i0.InterfaceC8116e
        /* renamed from: b */
        public void mo12992b() {
        }
    }
}
