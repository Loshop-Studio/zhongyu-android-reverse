package p195p0;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: p0.g */
/* loaded from: classes3.dex */
public class C8807g {

    /* renamed from: a */
    public final a f14947a = new a();

    /* renamed from: b */
    public final Map f14948b = new HashMap();

    /* renamed from: p0.g$a */
    public static class a {

        /* renamed from: a */
        public final Object f14949a;

        /* renamed from: b */
        public List f14950b;

        /* renamed from: c */
        public a f14951c;

        /* renamed from: d */
        public a f14952d;

        public a() {
            this(null);
        }

        /* renamed from: a */
        public void m14724a(Object obj) {
            if (this.f14950b == null) {
                this.f14950b = new ArrayList();
            }
            this.f14950b.add(obj);
        }

        /* renamed from: b */
        public Object m14725b() {
            int iM14726c = m14726c();
            if (iM14726c > 0) {
                return this.f14950b.remove(iM14726c - 1);
            }
            return null;
        }

        /* renamed from: c */
        public int m14726c() {
            List list = this.f14950b;
            if (list != null) {
                return list.size();
            }
            return 0;
        }

        public a(Object obj) {
            this.f14952d = this;
            this.f14951c = this;
            this.f14949a = obj;
        }
    }

    /* renamed from: e */
    public static void m14717e(a aVar) {
        a aVar2 = aVar.f14952d;
        aVar2.f14951c = aVar.f14951c;
        aVar.f14951c.f14952d = aVar2;
    }

    /* renamed from: g */
    public static void m14718g(a aVar) {
        aVar.f14951c.f14952d = aVar;
        aVar.f14952d.f14951c = aVar;
    }

    /* renamed from: a */
    public Object m14719a(InterfaceC8812l interfaceC8812l) {
        a aVar = (a) this.f14948b.get(interfaceC8812l);
        if (aVar == null) {
            aVar = new a(interfaceC8812l);
            this.f14948b.put(interfaceC8812l, aVar);
        } else {
            interfaceC8812l.mo14740a();
        }
        m14720b(aVar);
        return aVar.m14725b();
    }

    /* renamed from: b */
    public final void m14720b(a aVar) {
        m14717e(aVar);
        a aVar2 = this.f14947a;
        aVar.f14952d = aVar2;
        aVar.f14951c = aVar2.f14951c;
        m14718g(aVar);
    }

    /* renamed from: c */
    public final void m14721c(a aVar) {
        m14717e(aVar);
        a aVar2 = this.f14947a;
        aVar.f14952d = aVar2.f14952d;
        aVar.f14951c = aVar2;
        m14718g(aVar);
    }

    /* renamed from: d */
    public void m14722d(InterfaceC8812l interfaceC8812l, Object obj) {
        a aVar = (a) this.f14948b.get(interfaceC8812l);
        if (aVar == null) {
            aVar = new a(interfaceC8812l);
            m14721c(aVar);
            this.f14948b.put(interfaceC8812l, aVar);
        } else {
            interfaceC8812l.mo14740a();
        }
        aVar.m14724a(obj);
    }

    /* renamed from: f */
    public Object m14723f() {
        for (a aVar = this.f14947a.f14952d; !aVar.equals(this.f14947a); aVar = aVar.f14952d) {
            Object objM14725b = aVar.m14725b();
            if (objM14725b != null) {
                return objM14725b;
            }
            m14717e(aVar);
            this.f14948b.remove(aVar.f14949a);
            ((InterfaceC8812l) aVar.f14949a).mo14740a();
        }
        return null;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("GroupedLinkedMap( ");
        a aVar = this.f14947a.f14951c;
        boolean z9 = false;
        while (!aVar.equals(this.f14947a)) {
            sb.append('{');
            sb.append(aVar.f14949a);
            sb.append(':');
            sb.append(aVar.m14726c());
            sb.append("}, ");
            aVar = aVar.f14951c;
            z9 = true;
        }
        if (z9) {
            sb.delete(sb.length() - 2, sb.length());
        }
        sb.append(" )");
        return sb.toString();
    }
}
