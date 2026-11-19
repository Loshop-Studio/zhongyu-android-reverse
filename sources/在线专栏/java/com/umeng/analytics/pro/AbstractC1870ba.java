package com.umeng.analytics.pro;

import com.umeng.analytics.pro.AbstractC1870ba;
import com.umeng.analytics.pro.InterfaceC1866ax;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: com.umeng.analytics.pro.ba */
/* loaded from: classes.dex */
public abstract class AbstractC1870ba<T extends AbstractC1870ba<?, ?>, F extends InterfaceC1866ax> implements InterfaceC1859aq<T, F> {

    /* renamed from: c */
    private static final Map<Class<? extends InterfaceC1893bx>, InterfaceC1894by> f8433c;

    /* renamed from: a */
    protected Object f8434a;

    /* renamed from: b */
    protected F f8435b;

    /* renamed from: com.umeng.analytics.pro.ba$a */
    private static class a extends AbstractC1895bz<AbstractC1870ba> {
        private a() {
        }

        @Override // com.umeng.analytics.pro.InterfaceC1893bx
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void mo6835b(AbstractC1885bp abstractC1885bp, AbstractC1870ba abstractC1870ba) throws C1865aw {
            abstractC1870ba.f8435b = null;
            abstractC1870ba.f8434a = null;
            abstractC1885bp.mo6987j();
            C1880bk c1880bkMo6989l = abstractC1885bp.mo6989l();
            Object objM6933a = abstractC1870ba.m6933a(abstractC1885bp, c1880bkMo6989l);
            abstractC1870ba.f8434a = objM6933a;
            if (objM6933a != null) {
                abstractC1870ba.f8435b = (F) abstractC1870ba.m6930a(c1880bkMo6989l.f8500c);
            }
            abstractC1885bp.mo6990m();
            abstractC1885bp.mo6989l();
            abstractC1885bp.mo6988k();
        }

        @Override // com.umeng.analytics.pro.InterfaceC1893bx
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void mo6833a(AbstractC1885bp abstractC1885bp, AbstractC1870ba abstractC1870ba) throws C1865aw {
            if (abstractC1870ba.m6929a() == null || abstractC1870ba.m6938b() == null) {
                throw new C1886bq("Cannot write a TUnion with no set value!");
            }
            abstractC1885bp.mo6971a(abstractC1870ba.m6945d());
            abstractC1885bp.mo6966a(abstractC1870ba.m6943c(abstractC1870ba.f8435b));
            abstractC1870ba.m6937a(abstractC1885bp);
            abstractC1885bp.mo6978c();
            abstractC1885bp.mo6980d();
            abstractC1885bp.mo6977b();
        }
    }

    /* renamed from: com.umeng.analytics.pro.ba$b */
    private static class b implements InterfaceC1894by {
        private b() {
        }

        @Override // com.umeng.analytics.pro.InterfaceC1894by
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public a mo6837b() {
            return new a();
        }
    }

    /* renamed from: com.umeng.analytics.pro.ba$c */
    private static class c extends AbstractC1897ca<AbstractC1870ba> {
        private c() {
        }

        @Override // com.umeng.analytics.pro.InterfaceC1893bx
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void mo6835b(AbstractC1885bp abstractC1885bp, AbstractC1870ba abstractC1870ba) throws C1865aw {
            abstractC1870ba.f8435b = null;
            abstractC1870ba.f8434a = null;
            short sMo6999v = abstractC1885bp.mo6999v();
            Object objM6934a = abstractC1870ba.m6934a(abstractC1885bp, sMo6999v);
            abstractC1870ba.f8434a = objM6934a;
            if (objM6934a != null) {
                abstractC1870ba.f8435b = (F) abstractC1870ba.m6930a(sMo6999v);
            }
        }

        @Override // com.umeng.analytics.pro.InterfaceC1893bx
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void mo6833a(AbstractC1885bp abstractC1885bp, AbstractC1870ba abstractC1870ba) throws C1865aw {
            if (abstractC1870ba.m6929a() == null || abstractC1870ba.m6938b() == null) {
                throw new C1886bq("Cannot write a TUnion with no set value!");
            }
            abstractC1885bp.mo6974a(abstractC1870ba.f8435b.mo6844a());
            abstractC1870ba.m6940b(abstractC1885bp);
        }
    }

    /* renamed from: com.umeng.analytics.pro.ba$d */
    private static class d implements InterfaceC1894by {
        private d() {
        }

        @Override // com.umeng.analytics.pro.InterfaceC1894by
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public c mo6837b() {
            return new c();
        }
    }

    static {
        HashMap map = new HashMap();
        f8433c = map;
        map.put(AbstractC1895bz.class, new b());
        map.put(AbstractC1897ca.class, new d());
    }

    protected AbstractC1870ba() {
        this.f8435b = null;
        this.f8434a = null;
    }

    /* renamed from: a */
    private static Object m6925a(Object obj) {
        return obj instanceof InterfaceC1859aq ? ((InterfaceC1859aq) obj).deepCopy() : obj instanceof ByteBuffer ? C1860ar.m6903d((ByteBuffer) obj) : obj instanceof List ? m6926a((List) obj) : obj instanceof Set ? m6928a((Set) obj) : obj instanceof Map ? m6927a((Map<Object, Object>) obj) : obj;
    }

    /* renamed from: a */
    protected abstract F m6930a(short s3);

    /* renamed from: a */
    protected abstract Object m6933a(AbstractC1885bp abstractC1885bp, C1880bk c1880bk) throws C1865aw;

    /* renamed from: a */
    protected abstract Object m6934a(AbstractC1885bp abstractC1885bp, short s3) throws C1865aw;

    /* renamed from: a */
    protected abstract void m6937a(AbstractC1885bp abstractC1885bp) throws C1865aw;

    /* renamed from: b */
    public Object m6938b() {
        return this.f8434a;
    }

    /* renamed from: b */
    protected abstract void m6939b(F f4, Object obj) throws ClassCastException;

    /* renamed from: b */
    protected abstract void m6940b(AbstractC1885bp abstractC1885bp) throws C1865aw;

    /* renamed from: c */
    protected abstract C1880bk m6943c(F f4);

    /* renamed from: c */
    public boolean m6944c() {
        return this.f8435b != null;
    }

    @Override // com.umeng.analytics.pro.InterfaceC1859aq
    public final void clear() {
        this.f8435b = null;
        this.f8434a = null;
    }

    /* renamed from: d */
    protected abstract C1890bu m6945d();

    @Override // com.umeng.analytics.pro.InterfaceC1859aq
    public void read(AbstractC1885bp abstractC1885bp) throws C1865aw {
        f8433c.get(abstractC1885bp.mo7029D()).mo6837b().mo6835b(abstractC1885bp, this);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("<");
        sb.append(getClass().getSimpleName());
        sb.append(" ");
        if (m6929a() != null) {
            Object objM6938b = m6938b();
            sb.append(m6943c(m6929a()).f8498a);
            sb.append(":");
            if (objM6938b instanceof ByteBuffer) {
                C1860ar.m6898a((ByteBuffer) objM6938b, sb);
            } else {
                sb.append(objM6938b.toString());
            }
        }
        sb.append(">");
        return sb.toString();
    }

    @Override // com.umeng.analytics.pro.InterfaceC1859aq
    public void write(AbstractC1885bp abstractC1885bp) throws C1865aw {
        f8433c.get(abstractC1885bp.mo7029D()).mo6837b().mo6833a(abstractC1885bp, this);
    }

    /* renamed from: b */
    public boolean m6942b(F f4) {
        return this.f8435b == f4;
    }

    /* renamed from: b */
    public boolean m6941b(int i4) {
        return m6942b((AbstractC1870ba<T, F>) m6930a((short) i4));
    }

    protected AbstractC1870ba(F f4, Object obj) throws ClassCastException {
        m6936a((AbstractC1870ba<T, F>) f4, obj);
    }

    protected AbstractC1870ba(AbstractC1870ba<T, F> abstractC1870ba) {
        if (abstractC1870ba.getClass().equals(getClass())) {
            this.f8435b = abstractC1870ba.f8435b;
            this.f8434a = m6925a(abstractC1870ba.f8434a);
            return;
        }
        throw new ClassCastException();
    }

    /* renamed from: a */
    private static Map m6927a(Map<Object, Object> map) {
        HashMap map2 = new HashMap();
        for (Map.Entry<Object, Object> entry : map.entrySet()) {
            map2.put(m6925a(entry.getKey()), m6925a(entry.getValue()));
        }
        return map2;
    }

    /* renamed from: a */
    private static Set m6928a(Set set) {
        HashSet hashSet = new HashSet();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            hashSet.add(m6925a(it.next()));
        }
        return hashSet;
    }

    /* renamed from: a */
    private static List m6926a(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(m6925a(it.next()));
        }
        return arrayList;
    }

    /* renamed from: a */
    public F m6929a() {
        return this.f8435b;
    }

    /* renamed from: a */
    public Object m6932a(F f4) {
        if (f4 == this.f8435b) {
            return m6938b();
        }
        throw new IllegalArgumentException("Cannot get the value of field " + f4 + " because union's set field is " + this.f8435b);
    }

    /* renamed from: a */
    public Object m6931a(int i4) {
        return m6932a((AbstractC1870ba<T, F>) m6930a((short) i4));
    }

    /* renamed from: a */
    public void m6936a(F f4, Object obj) throws ClassCastException {
        m6939b(f4, obj);
        this.f8435b = f4;
        this.f8434a = obj;
    }

    /* renamed from: a */
    public void m6935a(int i4, Object obj) throws ClassCastException {
        m6936a((AbstractC1870ba<T, F>) m6930a((short) i4), obj);
    }
}
