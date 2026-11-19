package com.umeng.analytics.pro;

import com.umeng.analytics.pro.AbstractC3354ba;
import com.umeng.analytics.pro.InterfaceC3350ax;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: com.umeng.analytics.pro.ba */
/* loaded from: classes2.dex */
public abstract class AbstractC3354ba<T extends AbstractC3354ba<?, ?>, F extends InterfaceC3350ax> implements InterfaceC3343aq<T, F> {

    /* renamed from: c */
    private static final Map<Class<? extends InterfaceC3377bx>, InterfaceC3378by> f1841c;

    /* renamed from: a */
    protected Object f1842a;

    /* renamed from: b */
    protected F f1843b;

    /* renamed from: com.umeng.analytics.pro.ba$a */
    public static class a extends AbstractC3379bz<AbstractC3354ba> {
        private a() {
        }

        @Override // com.umeng.analytics.pro.InterfaceC3377bx
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void mo2912b(AbstractC3369bp abstractC3369bp, AbstractC3354ba abstractC3354ba) throws C3349aw {
            abstractC3354ba.f1843b = null;
            abstractC3354ba.f1842a = null;
            abstractC3369bp.mo3064j();
            C3364bk c3364bkMo3066l = abstractC3369bp.mo3066l();
            Object objM3010a = abstractC3354ba.m3010a(abstractC3369bp, c3364bkMo3066l);
            abstractC3354ba.f1842a = objM3010a;
            if (objM3010a != null) {
                abstractC3354ba.f1843b = (F) abstractC3354ba.m3007a(c3364bkMo3066l.f1908c);
            }
            abstractC3369bp.mo3067m();
            abstractC3369bp.mo3066l();
            abstractC3369bp.mo3065k();
        }

        @Override // com.umeng.analytics.pro.InterfaceC3377bx
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void mo2910a(AbstractC3369bp abstractC3369bp, AbstractC3354ba abstractC3354ba) throws C3349aw {
            if (abstractC3354ba.m3006a() == null || abstractC3354ba.m3015b() == null) {
                throw new C3370bq("Cannot write a TUnion with no set value!");
            }
            abstractC3369bp.mo3048a(abstractC3354ba.m3022d());
            abstractC3369bp.mo3043a(abstractC3354ba.m3020c(abstractC3354ba.f1843b));
            abstractC3354ba.m3014a(abstractC3369bp);
            abstractC3369bp.mo3055c();
            abstractC3369bp.mo3057d();
            abstractC3369bp.mo3054b();
        }
    }

    /* renamed from: com.umeng.analytics.pro.ba$b */
    public static class b implements InterfaceC3378by {
        private b() {
        }

        @Override // com.umeng.analytics.pro.InterfaceC3378by
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public a mo2914b() {
            return new a();
        }
    }

    /* renamed from: com.umeng.analytics.pro.ba$c */
    public static class c extends AbstractC3381ca<AbstractC3354ba> {
        private c() {
        }

        @Override // com.umeng.analytics.pro.InterfaceC3377bx
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void mo2912b(AbstractC3369bp abstractC3369bp, AbstractC3354ba abstractC3354ba) throws C3349aw {
            abstractC3354ba.f1843b = null;
            abstractC3354ba.f1842a = null;
            short sMo3076v = abstractC3369bp.mo3076v();
            Object objM3011a = abstractC3354ba.m3011a(abstractC3369bp, sMo3076v);
            abstractC3354ba.f1842a = objM3011a;
            if (objM3011a != null) {
                abstractC3354ba.f1843b = (F) abstractC3354ba.m3007a(sMo3076v);
            }
        }

        @Override // com.umeng.analytics.pro.InterfaceC3377bx
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void mo2910a(AbstractC3369bp abstractC3369bp, AbstractC3354ba abstractC3354ba) throws C3349aw {
            if (abstractC3354ba.m3006a() == null || abstractC3354ba.m3015b() == null) {
                throw new C3370bq("Cannot write a TUnion with no set value!");
            }
            abstractC3369bp.mo3051a(abstractC3354ba.f1843b.mo2921a());
            abstractC3354ba.m3017b(abstractC3369bp);
        }
    }

    /* renamed from: com.umeng.analytics.pro.ba$d */
    public static class d implements InterfaceC3378by {
        private d() {
        }

        @Override // com.umeng.analytics.pro.InterfaceC3378by
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public c mo2914b() {
            return new c();
        }
    }

    static {
        HashMap map = new HashMap();
        f1841c = map;
        map.put(AbstractC3379bz.class, new b());
        map.put(AbstractC3381ca.class, new d());
    }

    public AbstractC3354ba() {
        this.f1843b = null;
        this.f1842a = null;
    }

    /* renamed from: a */
    private static Object m3002a(Object obj) {
        return obj instanceof InterfaceC3343aq ? ((InterfaceC3343aq) obj).deepCopy() : obj instanceof ByteBuffer ? C3344ar.m2980d((ByteBuffer) obj) : obj instanceof List ? m3003a((List) obj) : obj instanceof Set ? m3005a((Set) obj) : obj instanceof Map ? m3004a((Map<Object, Object>) obj) : obj;
    }

    /* renamed from: a */
    public abstract F m3007a(short s3);

    /* renamed from: a */
    public abstract Object m3010a(AbstractC3369bp abstractC3369bp, C3364bk c3364bk) throws C3349aw;

    /* renamed from: a */
    public abstract Object m3011a(AbstractC3369bp abstractC3369bp, short s3) throws C3349aw;

    /* renamed from: a */
    public abstract void m3014a(AbstractC3369bp abstractC3369bp) throws C3349aw;

    /* renamed from: b */
    public Object m3015b() {
        return this.f1842a;
    }

    /* renamed from: b */
    public abstract void m3016b(F f4, Object obj) throws ClassCastException;

    /* renamed from: b */
    public abstract void m3017b(AbstractC3369bp abstractC3369bp) throws C3349aw;

    /* renamed from: c */
    public abstract C3364bk m3020c(F f4);

    /* renamed from: c */
    public boolean m3021c() {
        return this.f1843b != null;
    }

    @Override // com.umeng.analytics.pro.InterfaceC3343aq
    public final void clear() {
        this.f1843b = null;
        this.f1842a = null;
    }

    /* renamed from: d */
    public abstract C3374bu m3022d();

    @Override // com.umeng.analytics.pro.InterfaceC3343aq
    public void read(AbstractC3369bp abstractC3369bp) throws C3349aw {
        f1841c.get(abstractC3369bp.mo3106D()).mo2914b().mo2912b(abstractC3369bp, this);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("<");
        sb.append(getClass().getSimpleName());
        sb.append(" ");
        if (m3006a() != null) {
            Object objM3015b = m3015b();
            sb.append(m3020c(m3006a()).f1906a);
            sb.append(":");
            if (objM3015b instanceof ByteBuffer) {
                C3344ar.m2975a((ByteBuffer) objM3015b, sb);
            } else {
                sb.append(objM3015b.toString());
            }
        }
        sb.append(">");
        return sb.toString();
    }

    @Override // com.umeng.analytics.pro.InterfaceC3343aq
    public void write(AbstractC3369bp abstractC3369bp) throws C3349aw {
        f1841c.get(abstractC3369bp.mo3106D()).mo2914b().mo2910a(abstractC3369bp, this);
    }

    /* renamed from: b */
    public boolean m3019b(F f4) {
        return this.f1843b == f4;
    }

    /* renamed from: b */
    public boolean m3018b(int i4) {
        return m3019b((AbstractC3354ba<T, F>) m3007a((short) i4));
    }

    public AbstractC3354ba(F f4, Object obj) throws ClassCastException {
        m3013a((AbstractC3354ba<T, F>) f4, obj);
    }

    public AbstractC3354ba(AbstractC3354ba<T, F> abstractC3354ba) {
        if (abstractC3354ba.getClass().equals(getClass())) {
            this.f1843b = abstractC3354ba.f1843b;
            this.f1842a = m3002a(abstractC3354ba.f1842a);
            return;
        }
        throw new ClassCastException();
    }

    /* renamed from: a */
    private static Map m3004a(Map<Object, Object> map) {
        HashMap map2 = new HashMap();
        for (Map.Entry<Object, Object> entry : map.entrySet()) {
            map2.put(m3002a(entry.getKey()), m3002a(entry.getValue()));
        }
        return map2;
    }

    /* renamed from: a */
    private static Set m3005a(Set set) {
        HashSet hashSet = new HashSet();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            hashSet.add(m3002a(it.next()));
        }
        return hashSet;
    }

    /* renamed from: a */
    private static List m3003a(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(m3002a(it.next()));
        }
        return arrayList;
    }

    /* renamed from: a */
    public F m3006a() {
        return this.f1843b;
    }

    /* renamed from: a */
    public Object m3009a(F f4) {
        if (f4 == this.f1843b) {
            return m3015b();
        }
        throw new IllegalArgumentException("Cannot get the value of field " + f4 + " because union's set field is " + this.f1843b);
    }

    /* renamed from: a */
    public Object m3008a(int i4) {
        return m3009a((AbstractC3354ba<T, F>) m3007a((short) i4));
    }

    /* renamed from: a */
    public void m3013a(F f4, Object obj) throws ClassCastException {
        m3016b(f4, obj);
        this.f1843b = f4;
        this.f1842a = obj;
    }

    /* renamed from: a */
    public void m3012a(int i4, Object obj) throws ClassCastException {
        m3013a((AbstractC3354ba<T, F>) m3007a((short) i4), obj);
    }
}
