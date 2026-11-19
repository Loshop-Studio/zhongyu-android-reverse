package p213k0;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: k0.g */
/* loaded from: classes3.dex */
public class C9775g {

    /* renamed from: a */
    public final a f22932a = new a();

    /* renamed from: b */
    public final Map f22933b = new HashMap();

    /* renamed from: k0.g$a */
    public static class a {

        /* renamed from: a */
        public final Object f22934a;

        /* renamed from: b */
        public List f22935b;

        /* renamed from: c */
        public a f22936c;

        /* renamed from: d */
        public a f22937d;

        public a() {
            this(null);
        }

        /* renamed from: a */
        public void m19722a(Object obj) {
            if (this.f22935b == null) {
                this.f22935b = new ArrayList();
            }
            this.f22935b.add(obj);
        }

        /* renamed from: b */
        public Object m19723b() {
            int iM19724c = m19724c();
            if (iM19724c > 0) {
                return this.f22935b.remove(iM19724c - 1);
            }
            return null;
        }

        /* renamed from: c */
        public int m19724c() {
            List list = this.f22935b;
            if (list != null) {
                return list.size();
            }
            return 0;
        }

        public a(Object obj) {
            this.f22937d = this;
            this.f22936c = this;
            this.f22934a = obj;
        }
    }

    /* renamed from: e */
    public static void m19715e(a aVar) {
        a aVar2 = aVar.f22937d;
        aVar2.f22936c = aVar.f22936c;
        aVar.f22936c.f22937d = aVar2;
    }

    /* renamed from: g */
    public static void m19716g(a aVar) {
        aVar.f22936c.f22937d = aVar;
        aVar.f22937d.f22936c = aVar;
    }

    /* renamed from: a */
    public Object m19717a(InterfaceC9780l interfaceC9780l) {
        a aVar = (a) this.f22933b.get(interfaceC9780l);
        if (aVar == null) {
            aVar = new a(interfaceC9780l);
            this.f22933b.put(interfaceC9780l, aVar);
        } else {
            interfaceC9780l.mo19738a();
        }
        m19718b(aVar);
        return aVar.m19723b();
    }

    /* renamed from: b */
    public final void m19718b(a aVar) {
        m19715e(aVar);
        a aVar2 = this.f22932a;
        aVar.f22937d = aVar2;
        aVar.f22936c = aVar2.f22936c;
        m19716g(aVar);
    }

    /* renamed from: c */
    public final void m19719c(a aVar) {
        m19715e(aVar);
        a aVar2 = this.f22932a;
        aVar.f22937d = aVar2.f22937d;
        aVar.f22936c = aVar2;
        m19716g(aVar);
    }

    /* renamed from: d */
    public void m19720d(InterfaceC9780l interfaceC9780l, Object obj) {
        a aVar = (a) this.f22933b.get(interfaceC9780l);
        if (aVar == null) {
            aVar = new a(interfaceC9780l);
            m19719c(aVar);
            this.f22933b.put(interfaceC9780l, aVar);
        } else {
            interfaceC9780l.mo19738a();
        }
        aVar.m19722a(obj);
    }

    /* renamed from: f */
    public Object m19721f() {
        for (a aVar = this.f22932a.f22937d; !aVar.equals(this.f22932a); aVar = aVar.f22937d) {
            Object objM19723b = aVar.m19723b();
            if (objM19723b != null) {
                return objM19723b;
            }
            m19715e(aVar);
            this.f22933b.remove(aVar.f22934a);
            ((InterfaceC9780l) aVar.f22934a).mo19738a();
        }
        return null;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("GroupedLinkedMap( ");
        a aVar = this.f22932a.f22936c;
        boolean z10 = false;
        while (!aVar.equals(this.f22932a)) {
            sb2.append('{');
            sb2.append(aVar.f22934a);
            sb2.append(':');
            sb2.append(aVar.m19724c());
            sb2.append("}, ");
            aVar = aVar.f22936c;
            z10 = true;
        }
        if (z10) {
            sb2.delete(sb2.length() - 2, sb2.length());
        }
        sb2.append(" )");
        return sb2.toString();
    }
}
