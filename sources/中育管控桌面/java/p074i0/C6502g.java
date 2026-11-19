package p074i0;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: i0.g */
/* loaded from: classes3.dex */
public class C6502g {

    /* renamed from: a */
    public final a f8301a = new a();

    /* renamed from: b */
    public final Map f8302b = new HashMap();

    /* renamed from: i0.g$a */
    public static class a {

        /* renamed from: a */
        public final Object f8303a;

        /* renamed from: b */
        public List f8304b;

        /* renamed from: c */
        public a f8305c;

        /* renamed from: d */
        public a f8306d;

        public a() {
            this(null);
        }

        /* renamed from: a */
        public void m7209a(Object obj) {
            if (this.f8304b == null) {
                this.f8304b = new ArrayList();
            }
            this.f8304b.add(obj);
        }

        /* renamed from: b */
        public Object m7210b() {
            int iM7211c = m7211c();
            if (iM7211c > 0) {
                return this.f8304b.remove(iM7211c - 1);
            }
            return null;
        }

        /* renamed from: c */
        public int m7211c() {
            List list = this.f8304b;
            if (list != null) {
                return list.size();
            }
            return 0;
        }

        public a(Object obj) {
            this.f8306d = this;
            this.f8305c = this;
            this.f8303a = obj;
        }
    }

    /* renamed from: e */
    public static void m7202e(a aVar) {
        a aVar2 = aVar.f8306d;
        aVar2.f8305c = aVar.f8305c;
        aVar.f8305c.f8306d = aVar2;
    }

    /* renamed from: g */
    public static void m7203g(a aVar) {
        aVar.f8305c.f8306d = aVar;
        aVar.f8306d.f8305c = aVar;
    }

    /* renamed from: a */
    public Object m7204a(InterfaceC6507l interfaceC6507l) {
        a aVar = (a) this.f8302b.get(interfaceC6507l);
        if (aVar == null) {
            aVar = new a(interfaceC6507l);
            this.f8302b.put(interfaceC6507l, aVar);
        } else {
            interfaceC6507l.mo7225a();
        }
        m7205b(aVar);
        return aVar.m7210b();
    }

    /* renamed from: b */
    public final void m7205b(a aVar) {
        m7202e(aVar);
        a aVar2 = this.f8301a;
        aVar.f8306d = aVar2;
        aVar.f8305c = aVar2.f8305c;
        m7203g(aVar);
    }

    /* renamed from: c */
    public final void m7206c(a aVar) {
        m7202e(aVar);
        a aVar2 = this.f8301a;
        aVar.f8306d = aVar2.f8306d;
        aVar.f8305c = aVar2;
        m7203g(aVar);
    }

    /* renamed from: d */
    public void m7207d(InterfaceC6507l interfaceC6507l, Object obj) {
        a aVar = (a) this.f8302b.get(interfaceC6507l);
        if (aVar == null) {
            aVar = new a(interfaceC6507l);
            m7206c(aVar);
            this.f8302b.put(interfaceC6507l, aVar);
        } else {
            interfaceC6507l.mo7225a();
        }
        aVar.m7209a(obj);
    }

    /* renamed from: f */
    public Object m7208f() {
        for (a aVar = this.f8301a.f8306d; !aVar.equals(this.f8301a); aVar = aVar.f8306d) {
            Object objM7210b = aVar.m7210b();
            if (objM7210b != null) {
                return objM7210b;
            }
            m7202e(aVar);
            this.f8302b.remove(aVar.f8303a);
            ((InterfaceC6507l) aVar.f8303a).mo7225a();
        }
        return null;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("GroupedLinkedMap( ");
        a aVar = this.f8301a.f8305c;
        boolean z6 = false;
        while (!aVar.equals(this.f8301a)) {
            sb.append('{');
            sb.append(aVar.f8303a);
            sb.append(':');
            sb.append(aVar.m7211c());
            sb.append("}, ");
            aVar = aVar.f8305c;
            z6 = true;
        }
        if (z6) {
            sb.delete(sb.length() - 2, sb.length());
        }
        sb.append(" )");
        return sb.toString();
    }
}
