package p312y8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import master.flame.danmaku.danmaku.model.android.DanmakuContext;
import p010a9.C0053d;
import p102f9.AbstractC8486c;
import p323z8.AbstractC10732c;
import p323z8.C10734e;
import p323z8.InterfaceC10740k;
import p323z8.InterfaceC10741l;

/* renamed from: y8.b */
/* loaded from: classes5.dex */
public class C10675b {

    /* renamed from: a */
    public final Exception f21135a = new Exception("not suuport this filter tag");

    /* renamed from: b */
    public final Map f21136b = Collections.synchronizedSortedMap(new TreeMap());

    /* renamed from: c */
    public final Map f21137c = Collections.synchronizedSortedMap(new TreeMap());

    /* renamed from: d */
    public e[] f21138d = new e[0];

    /* renamed from: e */
    public e[] f21139e = new e[0];

    /* renamed from: y8.b$c */
    public static class c extends a {

        /* renamed from: a */
        public long f21143a = 20;

        /* renamed from: c */
        private synchronized boolean m19883c(AbstractC10732c abstractC10732c, int i10, int i11, C10734e c10734e, boolean z10) {
            if (c10734e != null) {
                if (abstractC10732c.m20060s()) {
                    return AbstractC8486c.m13880b() - c10734e.f21320a >= this.f21143a;
                }
            }
            return false;
        }

        @Override // p312y8.C10675b.e
        /* renamed from: a */
        public void mo19876a(Object obj) {
            m19884d();
        }

        @Override // p312y8.C10675b.e
        /* renamed from: b */
        public boolean mo19877b(AbstractC10732c abstractC10732c, int i10, int i11, C10734e c10734e, boolean z10, DanmakuContext danmakuContext) {
            boolean zM19883c = m19883c(abstractC10732c, i10, i11, c10734e, z10);
            if (zM19883c) {
                abstractC10732c.f21288F |= 4;
            }
            return zM19883c;
        }

        @Override // p312y8.C10675b.a, p312y8.C10675b.e
        public void clear() {
            m19884d();
        }

        /* renamed from: d */
        public synchronized void m19884d() {
        }
    }

    /* renamed from: y8.b$d */
    public static class d extends a {

        /* renamed from: a */
        public Boolean f21144a = Boolean.FALSE;

        @Override // p312y8.C10675b.e
        /* renamed from: b */
        public boolean mo19877b(AbstractC10732c abstractC10732c, int i10, int i11, C10734e c10734e, boolean z10, DanmakuContext danmakuContext) {
            boolean z11 = this.f21144a.booleanValue() && abstractC10732c.f21285C;
            if (z11) {
                abstractC10732c.f21288F |= 64;
            }
            return z11;
        }

        @Override // p312y8.C10675b.e
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void mo19876a(Boolean bool) {
            this.f21144a = bool;
        }
    }

    /* renamed from: y8.b$e */
    public interface e {
        /* renamed from: a */
        void mo19876a(Object obj);

        /* renamed from: b */
        boolean mo19877b(AbstractC10732c abstractC10732c, int i10, int i11, C10734e c10734e, boolean z10, DanmakuContext danmakuContext);

        void clear();
    }

    /* renamed from: y8.b$f */
    public static class f extends a {

        /* renamed from: a */
        public Map f21145a;

        @Override // p312y8.C10675b.e
        /* renamed from: b */
        public boolean mo19877b(AbstractC10732c abstractC10732c, int i10, int i11, C10734e c10734e, boolean z10, DanmakuContext danmakuContext) {
            Map map = this.f21145a;
            boolean z11 = false;
            if (map != null) {
                Integer num = (Integer) map.get(Integer.valueOf(abstractC10732c.mo20054m()));
                if (num != null && i10 >= num.intValue()) {
                    z11 = true;
                }
                if (z11) {
                    abstractC10732c.f21288F |= 256;
                }
            }
            return z11;
        }

        @Override // p312y8.C10675b.e
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void mo19876a(Map map) {
            this.f21145a = map;
        }
    }

    /* renamed from: y8.b$g */
    public static class g extends a {

        /* renamed from: a */
        public Map f21146a;

        @Override // p312y8.C10675b.e
        /* renamed from: b */
        public boolean mo19877b(AbstractC10732c abstractC10732c, int i10, int i11, C10734e c10734e, boolean z10, DanmakuContext danmakuContext) {
            Map map = this.f21146a;
            boolean z11 = false;
            if (map != null) {
                Boolean bool = (Boolean) map.get(Integer.valueOf(abstractC10732c.mo20054m()));
                if (bool != null && bool.booleanValue() && z10) {
                    z11 = true;
                }
                if (z11) {
                    abstractC10732c.f21288F |= 512;
                }
            }
            return z11;
        }

        @Override // p312y8.C10675b.e
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void mo19876a(Map map) {
            this.f21146a = map;
        }
    }

    /* renamed from: y8.b$h */
    public static class h extends a {

        /* renamed from: a */
        public int f21147a = -1;

        /* renamed from: b */
        public AbstractC10732c f21148b = null;

        /* renamed from: c */
        public float f21149c = 1.0f;

        @Override // p312y8.C10675b.e
        /* renamed from: b */
        public synchronized boolean mo19877b(AbstractC10732c abstractC10732c, int i10, int i11, C10734e c10734e, boolean z10, DanmakuContext danmakuContext) throws Throwable {
            try {
                try {
                    boolean zM19888c = m19888c(abstractC10732c, i10, i11, c10734e, z10, danmakuContext);
                    if (zM19888c) {
                        abstractC10732c.f21288F |= 2;
                    }
                    return zM19888c;
                } catch (Throwable th) {
                    th = th;
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                throw th;
            }
        }

        /* renamed from: c */
        public final boolean m19888c(AbstractC10732c abstractC10732c, int i10, int i11, C10734e c10734e, boolean z10, DanmakuContext danmakuContext) {
            if (this.f21147a > 0 && abstractC10732c.mo20054m() == 1) {
                AbstractC10732c abstractC10732c2 = this.f21148b;
                if (abstractC10732c2 != null && !abstractC10732c2.m20064w()) {
                    long jM20043b = abstractC10732c.m20043b() - this.f21148b.m20043b();
                    if ((jM20043b >= 0 && jM20043b < danmakuContext.f18428A.f156f.f21324c * this.f21149c) || i10 > this.f21147a) {
                        return true;
                    }
                    this.f21148b = abstractC10732c;
                    return false;
                }
                this.f21148b = abstractC10732c;
            }
            return false;
        }

        @Override // p312y8.C10675b.a, p312y8.C10675b.e
        public void clear() {
            m19889d();
        }

        /* renamed from: d */
        public synchronized void m19889d() {
            this.f21148b = null;
        }

        @Override // p312y8.C10675b.e
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public void mo19876a(Integer num) {
            m19889d();
            if (num == null || num.intValue() == this.f21147a) {
                return;
            }
            int iIntValue = num.intValue() + (num.intValue() / 5);
            this.f21147a = iIntValue;
            this.f21149c = 1.0f / iIntValue;
        }
    }

    /* renamed from: y8.b$i */
    public static class i extends a {

        /* renamed from: a */
        public List f21150a = new ArrayList();

        @Override // p312y8.C10675b.e
        /* renamed from: b */
        public boolean mo19877b(AbstractC10732c abstractC10732c, int i10, int i11, C10734e c10734e, boolean z10, DanmakuContext danmakuContext) {
            boolean z11 = (abstractC10732c == null || this.f21150a.contains(Integer.valueOf(abstractC10732c.f21299f))) ? false : true;
            if (z11) {
                abstractC10732c.f21288F |= 8;
            }
            return z11;
        }

        /* renamed from: c */
        public final void m19891c(Integer num) {
            if (this.f21150a.contains(num)) {
                return;
            }
            this.f21150a.add(num);
        }

        /* renamed from: d */
        public void m19892d() {
            this.f21150a.clear();
        }

        @Override // p312y8.C10675b.e
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public void mo19876a(List list) {
            m19892d();
            if (list != null) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    m19891c((Integer) it.next());
                }
            }
        }
    }

    /* renamed from: y8.b$j */
    public static class j extends a {

        /* renamed from: a */
        public final List f21151a = Collections.synchronizedList(new ArrayList());

        @Override // p312y8.C10675b.e
        /* renamed from: b */
        public boolean mo19877b(AbstractC10732c abstractC10732c, int i10, int i11, C10734e c10734e, boolean z10, DanmakuContext danmakuContext) {
            boolean z11 = abstractC10732c != null && this.f21151a.contains(Integer.valueOf(abstractC10732c.mo20054m()));
            if (z11) {
                abstractC10732c.f21288F = 1 | abstractC10732c.f21288F;
            }
            return z11;
        }

        /* renamed from: c */
        public void m19894c(Integer num) {
            if (this.f21151a.contains(num)) {
                return;
            }
            this.f21151a.add(num);
        }

        /* renamed from: d */
        public void m19895d() {
            this.f21151a.clear();
        }

        @Override // p312y8.C10675b.e
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public void mo19876a(List list) {
            m19895d();
            if (list != null) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    m19894c((Integer) it.next());
                }
            }
        }
    }

    /* renamed from: y8.b$k */
    public static abstract class k extends a {

        /* renamed from: a */
        public List f21152a = new ArrayList();

        /* renamed from: c */
        public final void m19897c(Object obj) {
            if (this.f21152a.contains(obj)) {
                return;
            }
            this.f21152a.add(obj);
        }

        /* renamed from: d */
        public void m19898d() {
            this.f21152a.clear();
        }

        @Override // p312y8.C10675b.e
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public void mo19876a(List list) {
            m19898d();
            if (list != null) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    m19897c(it.next());
                }
            }
        }
    }

    /* renamed from: y8.b$l */
    public static class l extends k {
        @Override // p312y8.C10675b.e
        /* renamed from: b */
        public boolean mo19877b(AbstractC10732c abstractC10732c, int i10, int i11, C10734e c10734e, boolean z10, DanmakuContext danmakuContext) {
            boolean z11 = abstractC10732c != null && this.f21152a.contains(abstractC10732c.f21284B);
            if (z11) {
                abstractC10732c.f21288F |= 32;
            }
            return z11;
        }
    }

    /* renamed from: y8.b$m */
    public static class m extends k {
        @Override // p312y8.C10675b.e
        /* renamed from: b */
        public boolean mo19877b(AbstractC10732c abstractC10732c, int i10, int i11, C10734e c10734e, boolean z10, DanmakuContext danmakuContext) {
            boolean z11 = abstractC10732c != null && this.f21152a.contains(Integer.valueOf(abstractC10732c.f21283A));
            if (z11) {
                abstractC10732c.f21288F |= 16;
            }
            return z11;
        }
    }

    /* renamed from: a */
    public void m19868a() {
        for (e eVar : this.f21138d) {
            if (eVar != null) {
                eVar.clear();
            }
        }
        for (e eVar2 : this.f21139e) {
            if (eVar2 != null) {
                eVar2.clear();
            }
        }
    }

    /* renamed from: b */
    public void m19869b(AbstractC10732c abstractC10732c, int i10, int i11, C10734e c10734e, boolean z10, DanmakuContext danmakuContext) {
        for (e eVar : this.f21138d) {
            if (eVar != null) {
                boolean zMo19877b = eVar.mo19877b(abstractC10732c, i10, i11, c10734e, z10, danmakuContext);
                abstractC10732c.f21289G = danmakuContext.f18453y.f21333c;
                if (zMo19877b) {
                    return;
                }
            }
        }
    }

    /* renamed from: c */
    public boolean m19870c(AbstractC10732c abstractC10732c, int i10, int i11, C10734e c10734e, boolean z10, DanmakuContext danmakuContext) {
        for (e eVar : this.f21139e) {
            if (eVar != null) {
                boolean zMo19877b = eVar.mo19877b(abstractC10732c, i10, i11, c10734e, z10, danmakuContext);
                abstractC10732c.f21289G = danmakuContext.f18453y.f21333c;
                if (zMo19877b) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: d */
    public e m19871d(String str) {
        return m19872e(str, true);
    }

    /* renamed from: e */
    public e m19872e(String str, boolean z10) throws Exception {
        if (str == null) {
            m19873f();
            return null;
        }
        e gVar = (e) this.f21136b.get(str);
        if (gVar == null) {
            if ("1010_Filter".equals(str)) {
                gVar = new j();
            } else if ("1011_Filter".equals(str)) {
                gVar = new h();
            } else if ("1012_Filter".equals(str)) {
                gVar = new c();
            } else if ("1013_Filter".equals(str)) {
                gVar = new i();
            } else if ("1014_Filter".equals(str)) {
                gVar = new m();
            } else if ("1015_Filter".equals(str)) {
                gVar = new l();
            } else if ("1016_Filter".equals(str)) {
                gVar = new d();
            } else if ("1017_Filter".equals(str)) {
                gVar = new b();
            } else if ("1018_Filter".equals(str)) {
                gVar = new f();
            } else if ("1019_Filter".equals(str)) {
                gVar = new g();
            }
        }
        if (gVar == null) {
            m19873f();
            return null;
        }
        gVar.mo19876a(null);
        if (z10) {
            this.f21136b.put(str, gVar);
            this.f21138d = (e[]) this.f21136b.values().toArray(this.f21138d);
            return gVar;
        }
        this.f21137c.put(str, gVar);
        this.f21139e = (e[]) this.f21137c.values().toArray(this.f21139e);
        return gVar;
    }

    /* renamed from: f */
    public final void m19873f() throws Exception {
        try {
            throw this.f21135a;
        } catch (Exception unused) {
        }
    }

    /* renamed from: g */
    public void m19874g(String str) {
        m19875h(str, true);
    }

    /* renamed from: h */
    public void m19875h(String str, boolean z10) {
        e eVar = (e) (z10 ? this.f21136b : this.f21137c).remove(str);
        if (eVar != null) {
            eVar.clear();
            if (z10) {
                this.f21138d = (e[]) this.f21136b.values().toArray(this.f21138d);
            } else {
                this.f21139e = (e[]) this.f21137c.values().toArray(this.f21139e);
            }
        }
    }

    /* renamed from: y8.b$a */
    public static abstract class a implements e {
        @Override // p312y8.C10675b.e
        public void clear() {
        }
    }

    /* renamed from: y8.b$b */
    public static class b extends a {

        /* renamed from: a */
        public final InterfaceC10741l f21140a = new C0053d(4);

        /* renamed from: b */
        public final LinkedHashMap f21141b = new LinkedHashMap();

        /* renamed from: c */
        public final InterfaceC10741l f21142c = new C0053d(4);

        @Override // p312y8.C10675b.e
        /* renamed from: b */
        public boolean mo19877b(AbstractC10732c abstractC10732c, int i10, int i11, C10734e c10734e, boolean z10, DanmakuContext danmakuContext) {
            boolean zM19878c = m19878c(abstractC10732c, i10, i11, c10734e, z10);
            if (zM19878c) {
                abstractC10732c.f21288F |= 128;
            }
            return zM19878c;
        }

        /* renamed from: c */
        public synchronized boolean m19878c(AbstractC10732c abstractC10732c, int i10, int i11, C10734e c10734e, boolean z10) {
            m19880e(this.f21140a, 2L);
            m19880e(this.f21142c, 2L);
            m19879d(this.f21141b, 3);
            if (this.f21140a.mo181d(abstractC10732c) && !abstractC10732c.m20060s()) {
                return true;
            }
            if (this.f21142c.mo181d(abstractC10732c)) {
                return false;
            }
            if (!this.f21141b.containsKey(abstractC10732c.f21296c)) {
                this.f21141b.put(String.valueOf(abstractC10732c.f21296c), abstractC10732c);
                this.f21142c.mo182e(abstractC10732c);
                return false;
            }
            this.f21141b.put(String.valueOf(abstractC10732c.f21296c), abstractC10732c);
            this.f21140a.mo179b(abstractC10732c);
            this.f21140a.mo182e(abstractC10732c);
            return true;
        }

        @Override // p312y8.C10675b.a, p312y8.C10675b.e
        public void clear() {
            m19881f();
        }

        /* renamed from: d */
        public final void m19879d(LinkedHashMap linkedHashMap, int i10) {
            Iterator it = linkedHashMap.entrySet().iterator();
            long jM13880b = AbstractC8486c.m13880b();
            while (it.hasNext()) {
                try {
                    if (!((AbstractC10732c) ((Map.Entry) it.next()).getValue()).m20064w()) {
                        return;
                    }
                    it.remove();
                    if (AbstractC8486c.m13880b() - jM13880b > i10) {
                        return;
                    }
                } catch (Exception unused) {
                    return;
                }
            }
        }

        /* renamed from: e */
        public final void m19880e(InterfaceC10741l interfaceC10741l, long j10) {
            InterfaceC10740k it = interfaceC10741l.iterator();
            long jM13880b = AbstractC8486c.m13880b();
            while (it.hasNext()) {
                try {
                    if (!it.next().m20064w()) {
                        return;
                    }
                    it.remove();
                    if (AbstractC8486c.m13880b() - jM13880b > j10) {
                        return;
                    }
                } catch (Exception unused) {
                    return;
                }
            }
        }

        /* renamed from: f */
        public synchronized void m19881f() {
            this.f21142c.clear();
            this.f21140a.clear();
            this.f21141b.clear();
        }

        @Override // p312y8.C10675b.e
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public void mo19876a(Void r12) {
        }
    }
}
