package p193o;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: o.g */
/* loaded from: classes3.dex */
public class C9503g {

    /* renamed from: a */
    public final a f18849a = new a();

    /* renamed from: b */
    public final Map f18850b = new HashMap();

    /* renamed from: o.g$a */
    public static class a {

        /* renamed from: a */
        public final Object f18851a;

        /* renamed from: b */
        public List f18852b;

        /* renamed from: c */
        public a f18853c;

        /* renamed from: d */
        public a f18854d;

        public a() {
            this(null);
        }

        /* renamed from: a */
        public void m17632a(Object obj) {
            if (this.f18852b == null) {
                this.f18852b = new ArrayList();
            }
            this.f18852b.add(obj);
        }

        /* renamed from: b */
        public Object m17633b() {
            int iM17634c = m17634c();
            if (iM17634c > 0) {
                return this.f18852b.remove(iM17634c - 1);
            }
            return null;
        }

        /* renamed from: c */
        public int m17634c() {
            List list = this.f18852b;
            if (list != null) {
                return list.size();
            }
            return 0;
        }

        public a(Object obj) {
            this.f18854d = this;
            this.f18853c = this;
            this.f18851a = obj;
        }
    }

    /* renamed from: e */
    public static void m17625e(a aVar) {
        a aVar2 = aVar.f18854d;
        aVar2.f18853c = aVar.f18853c;
        aVar.f18853c.f18854d = aVar2;
    }

    /* renamed from: g */
    public static void m17626g(a aVar) {
        aVar.f18853c.f18854d = aVar;
        aVar.f18854d.f18853c = aVar;
    }

    /* renamed from: a */
    public Object m17627a(InterfaceC9508l interfaceC9508l) {
        a aVar = (a) this.f18850b.get(interfaceC9508l);
        if (aVar == null) {
            aVar = new a(interfaceC9508l);
            this.f18850b.put(interfaceC9508l, aVar);
        } else {
            interfaceC9508l.mo17648a();
        }
        m17628b(aVar);
        return aVar.m17633b();
    }

    /* renamed from: b */
    public final void m17628b(a aVar) {
        m17625e(aVar);
        a aVar2 = this.f18849a;
        aVar.f18854d = aVar2;
        aVar.f18853c = aVar2.f18853c;
        m17626g(aVar);
    }

    /* renamed from: c */
    public final void m17629c(a aVar) {
        m17625e(aVar);
        a aVar2 = this.f18849a;
        aVar.f18854d = aVar2.f18854d;
        aVar.f18853c = aVar2;
        m17626g(aVar);
    }

    /* renamed from: d */
    public void m17630d(InterfaceC9508l interfaceC9508l, Object obj) {
        a aVar = (a) this.f18850b.get(interfaceC9508l);
        if (aVar == null) {
            aVar = new a(interfaceC9508l);
            m17629c(aVar);
            this.f18850b.put(interfaceC9508l, aVar);
        } else {
            interfaceC9508l.mo17648a();
        }
        aVar.m17632a(obj);
    }

    /* renamed from: f */
    public Object m17631f() {
        for (a aVar = this.f18849a.f18854d; !aVar.equals(this.f18849a); aVar = aVar.f18854d) {
            Object objM17633b = aVar.m17633b();
            if (objM17633b != null) {
                return objM17633b;
            }
            m17625e(aVar);
            this.f18850b.remove(aVar.f18851a);
            ((InterfaceC9508l) aVar.f18851a).mo17648a();
        }
        return null;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("GroupedLinkedMap( ");
        a aVar = this.f18849a.f18853c;
        boolean z10 = false;
        while (!aVar.equals(this.f18849a)) {
            sb.append('{');
            sb.append(aVar.f18851a);
            sb.append(':');
            sb.append(aVar.m17634c());
            sb.append("}, ");
            aVar = aVar.f18853c;
            z10 = true;
        }
        if (z10) {
            sb.delete(sb.length() - 2, sb.length());
        }
        sb.append(" )");
        return sb.toString();
    }
}
