package p164l0;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: l0.g */
/* loaded from: classes3.dex */
public class C8870g {

    /* renamed from: a */
    public final a f14637a = new a();

    /* renamed from: b */
    public final Map f14638b = new HashMap();

    /* renamed from: l0.g$a */
    public static class a {

        /* renamed from: a */
        public final Object f14639a;

        /* renamed from: b */
        public List f14640b;

        /* renamed from: c */
        public a f14641c;

        /* renamed from: d */
        public a f14642d;

        public a() {
            this(null);
        }

        /* renamed from: a */
        public void m13744a(Object obj) {
            if (this.f14640b == null) {
                this.f14640b = new ArrayList();
            }
            this.f14640b.add(obj);
        }

        /* renamed from: b */
        public Object m13745b() {
            int iM13746c = m13746c();
            if (iM13746c > 0) {
                return this.f14640b.remove(iM13746c - 1);
            }
            return null;
        }

        /* renamed from: c */
        public int m13746c() {
            List list = this.f14640b;
            if (list != null) {
                return list.size();
            }
            return 0;
        }

        public a(Object obj) {
            this.f14642d = this;
            this.f14641c = this;
            this.f14639a = obj;
        }
    }

    /* renamed from: e */
    public static void m13737e(a aVar) {
        a aVar2 = aVar.f14642d;
        aVar2.f14641c = aVar.f14641c;
        aVar.f14641c.f14642d = aVar2;
    }

    /* renamed from: g */
    public static void m13738g(a aVar) {
        aVar.f14641c.f14642d = aVar;
        aVar.f14642d.f14641c = aVar;
    }

    /* renamed from: a */
    public Object m13739a(InterfaceC8875l interfaceC8875l) {
        a aVar = (a) this.f14638b.get(interfaceC8875l);
        if (aVar == null) {
            aVar = new a(interfaceC8875l);
            this.f14638b.put(interfaceC8875l, aVar);
        } else {
            interfaceC8875l.mo13760a();
        }
        m13740b(aVar);
        return aVar.m13745b();
    }

    /* renamed from: b */
    public final void m13740b(a aVar) {
        m13737e(aVar);
        a aVar2 = this.f14637a;
        aVar.f14642d = aVar2;
        aVar.f14641c = aVar2.f14641c;
        m13738g(aVar);
    }

    /* renamed from: c */
    public final void m13741c(a aVar) {
        m13737e(aVar);
        a aVar2 = this.f14637a;
        aVar.f14642d = aVar2.f14642d;
        aVar.f14641c = aVar2;
        m13738g(aVar);
    }

    /* renamed from: d */
    public void m13742d(InterfaceC8875l interfaceC8875l, Object obj) {
        a aVar = (a) this.f14638b.get(interfaceC8875l);
        if (aVar == null) {
            aVar = new a(interfaceC8875l);
            m13741c(aVar);
            this.f14638b.put(interfaceC8875l, aVar);
        } else {
            interfaceC8875l.mo13760a();
        }
        aVar.m13744a(obj);
    }

    /* renamed from: f */
    public Object m13743f() {
        for (a aVar = this.f14637a.f14642d; !aVar.equals(this.f14637a); aVar = aVar.f14642d) {
            Object objM13745b = aVar.m13745b();
            if (objM13745b != null) {
                return objM13745b;
            }
            m13737e(aVar);
            this.f14638b.remove(aVar.f14639a);
            ((InterfaceC8875l) aVar.f14639a).mo13760a();
        }
        return null;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("GroupedLinkedMap( ");
        a aVar = this.f14637a.f14641c;
        boolean z9 = false;
        while (!aVar.equals(this.f14637a)) {
            sb.append('{');
            sb.append(aVar.f14639a);
            sb.append(':');
            sb.append(aVar.m13746c());
            sb.append("}, ");
            aVar = aVar.f14641c;
            z9 = true;
        }
        if (z9) {
            sb.delete(sb.length() - 2, sb.length());
        }
        sb.append(" )");
        return sb.toString();
    }
}
