package p098n;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: n.g */
/* loaded from: classes2.dex */
public class C4398g {

    /* renamed from: a */
    public final a f4898a = new a();

    /* renamed from: b */
    public final Map f4899b = new HashMap();

    /* renamed from: n.g$a */
    public static class a {

        /* renamed from: a */
        public final Object f4900a;

        /* renamed from: b */
        public List f4901b;

        /* renamed from: c */
        public a f4902c;

        /* renamed from: d */
        public a f4903d;

        public a() {
            this(null);
        }

        /* renamed from: a */
        public void m5404a(Object obj) {
            if (this.f4901b == null) {
                this.f4901b = new ArrayList();
            }
            this.f4901b.add(obj);
        }

        /* renamed from: b */
        public Object m5405b() {
            int iM5406c = m5406c();
            if (iM5406c > 0) {
                return this.f4901b.remove(iM5406c - 1);
            }
            return null;
        }

        /* renamed from: c */
        public int m5406c() {
            List list = this.f4901b;
            if (list != null) {
                return list.size();
            }
            return 0;
        }

        public a(Object obj) {
            this.f4903d = this;
            this.f4902c = this;
            this.f4900a = obj;
        }
    }

    /* renamed from: e */
    public static void m5397e(a aVar) {
        a aVar2 = aVar.f4903d;
        aVar2.f4902c = aVar.f4902c;
        aVar.f4902c.f4903d = aVar2;
    }

    /* renamed from: g */
    public static void m5398g(a aVar) {
        aVar.f4902c.f4903d = aVar;
        aVar.f4903d.f4902c = aVar;
    }

    /* renamed from: a */
    public Object m5399a(InterfaceC4403l interfaceC4403l) {
        a aVar = (a) this.f4899b.get(interfaceC4403l);
        if (aVar == null) {
            aVar = new a(interfaceC4403l);
            this.f4899b.put(interfaceC4403l, aVar);
        } else {
            interfaceC4403l.mo5420a();
        }
        m5400b(aVar);
        return aVar.m5405b();
    }

    /* renamed from: b */
    public final void m5400b(a aVar) {
        m5397e(aVar);
        a aVar2 = this.f4898a;
        aVar.f4903d = aVar2;
        aVar.f4902c = aVar2.f4902c;
        m5398g(aVar);
    }

    /* renamed from: c */
    public final void m5401c(a aVar) {
        m5397e(aVar);
        a aVar2 = this.f4898a;
        aVar.f4903d = aVar2.f4903d;
        aVar.f4902c = aVar2;
        m5398g(aVar);
    }

    /* renamed from: d */
    public void m5402d(InterfaceC4403l interfaceC4403l, Object obj) {
        a aVar = (a) this.f4899b.get(interfaceC4403l);
        if (aVar == null) {
            aVar = new a(interfaceC4403l);
            m5401c(aVar);
            this.f4899b.put(interfaceC4403l, aVar);
        } else {
            interfaceC4403l.mo5420a();
        }
        aVar.m5404a(obj);
    }

    /* renamed from: f */
    public Object m5403f() {
        for (a aVar = this.f4898a.f4903d; !aVar.equals(this.f4898a); aVar = aVar.f4903d) {
            Object objM5405b = aVar.m5405b();
            if (objM5405b != null) {
                return objM5405b;
            }
            m5397e(aVar);
            this.f4899b.remove(aVar.f4900a);
            ((InterfaceC4403l) aVar.f4900a).mo5420a();
        }
        return null;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("GroupedLinkedMap( ");
        a aVar = this.f4898a.f4902c;
        boolean z3 = false;
        while (!aVar.equals(this.f4898a)) {
            sb.append('{');
            sb.append(aVar.f4900a);
            sb.append(':');
            sb.append(aVar.m5406c());
            sb.append("}, ");
            aVar = aVar.f4902c;
            z3 = true;
        }
        if (z3) {
            sb.delete(sb.length() - 2, sb.length());
        }
        sb.append(" )");
        return sb.toString();
    }
}
