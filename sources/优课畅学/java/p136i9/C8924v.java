package p136i9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TreeMap;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;
import kotlin.jvm.internal.C9114c0;
import p113g8.AbstractC8661c0;
import p113g8.AbstractC8687z;
import p147j9.AbstractC9035e;
import p311y7.InterfaceC10668a;

/* renamed from: i9.v */
/* loaded from: classes5.dex */
public final class C8924v implements Iterable, InterfaceC10668a {

    /* renamed from: b */
    public static final b f16793b = new b(null);

    /* renamed from: c */
    public static final C8924v f16794c = new C8924v(new String[0]);

    /* renamed from: a */
    public final String[] f16795a;

    /* renamed from: i9.v$a */
    public static final class a {

        /* renamed from: a */
        public final List f16796a = new ArrayList(20);

        /* renamed from: a */
        public final a m15267a(String name, String value) {
            AbstractC9133u.m16133g(name, "name");
            AbstractC9133u.m16133g(value, "value");
            return AbstractC9035e.m15710b(this, name, value);
        }

        /* renamed from: b */
        public final a m15268b(C8924v headers) {
            AbstractC9133u.m16133g(headers, "headers");
            return AbstractC9035e.m15711c(this, headers);
        }

        /* renamed from: c */
        public final a m15269c(String line) {
            AbstractC9133u.m16133g(line, "line");
            int iM13990e0 = AbstractC8661c0.m13990e0(line, ':', 1, false, 4, null);
            if (iM13990e0 != -1) {
                String strSubstring = line.substring(0, iM13990e0);
                AbstractC9133u.m16132f(strSubstring, "substring(...)");
                String strSubstring2 = line.substring(iM13990e0 + 1);
                AbstractC9133u.m16132f(strSubstring2, "substring(...)");
                m15270d(strSubstring, strSubstring2);
                return this;
            }
            if (line.charAt(0) != ':') {
                m15270d("", line);
                return this;
            }
            String strSubstring3 = line.substring(1);
            AbstractC9133u.m16132f(strSubstring3, "substring(...)");
            m15270d("", strSubstring3);
            return this;
        }

        /* renamed from: d */
        public final a m15270d(String name, String value) {
            AbstractC9133u.m16133g(name, "name");
            AbstractC9133u.m16133g(value, "value");
            return AbstractC9035e.m15712d(this, name, value);
        }

        /* renamed from: e */
        public final a m15271e(String name, String value) {
            AbstractC9133u.m16133g(name, "name");
            AbstractC9133u.m16133g(value, "value");
            AbstractC9035e.m15726r(name);
            m15270d(name, value);
            return this;
        }

        /* renamed from: f */
        public final C8924v m15272f() {
            return AbstractC9035e.m15713e(this);
        }

        /* renamed from: g */
        public final List m15273g() {
            return this.f16796a;
        }

        /* renamed from: h */
        public final a m15274h(String name) {
            AbstractC9133u.m16133g(name, "name");
            return AbstractC9035e.m15721m(this, name);
        }

        /* renamed from: i */
        public final a m15275i(String name, String value) {
            AbstractC9133u.m16133g(name, "name");
            AbstractC9133u.m16133g(value, "value");
            return AbstractC9035e.m15722n(this, name, value);
        }
    }

    /* renamed from: i9.v$b */
    public static final class b {
        public /* synthetic */ b(AbstractC9126n abstractC9126n) {
            this();
        }

        /* renamed from: a */
        public final C8924v m15276a(String... namesAndValues) {
            AbstractC9133u.m16133g(namesAndValues, "namesAndValues");
            return AbstractC9035e.m15717i((String[]) Arrays.copyOf(namesAndValues, namesAndValues.length));
        }

        public b() {
        }
    }

    public C8924v(String[] namesAndValues) {
        AbstractC9133u.m16133g(namesAndValues, "namesAndValues");
        this.f16795a = namesAndValues;
    }

    /* renamed from: e */
    public static final C8924v m15259e(String... strArr) {
        return f16793b.m15276a(strArr);
    }

    /* renamed from: a */
    public final String m15260a(String name) {
        AbstractC9133u.m16133g(name, "name");
        return AbstractC9035e.m15716h(this.f16795a, name);
    }

    /* renamed from: b */
    public final String[] m15261b() {
        return this.f16795a;
    }

    /* renamed from: c */
    public final String m15262c(int i10) {
        return AbstractC9035e.m15719k(this, i10);
    }

    /* renamed from: d */
    public final a m15263d() {
        return AbstractC9035e.m15720l(this);
    }

    public boolean equals(Object obj) {
        return AbstractC9035e.m15714f(this, obj);
    }

    /* renamed from: f */
    public final Map m15264f() {
        TreeMap treeMap = new TreeMap(AbstractC8687z.m14095C(C9114c0.f17482a));
        int size = size();
        for (int i10 = 0; i10 < size; i10++) {
            String strM15262c = m15262c(i10);
            Locale US = Locale.US;
            AbstractC9133u.m16132f(US, "US");
            String lowerCase = strM15262c.toLowerCase(US);
            AbstractC9133u.m16132f(lowerCase, "toLowerCase(...)");
            List arrayList = (List) treeMap.get(lowerCase);
            if (arrayList == null) {
                arrayList = new ArrayList(2);
                treeMap.put(lowerCase, arrayList);
            }
            arrayList.add(m15265g(i10));
        }
        return treeMap;
    }

    /* renamed from: g */
    public final String m15265g(int i10) {
        return AbstractC9035e.m15724p(this, i10);
    }

    /* renamed from: h */
    public final List m15266h(String name) {
        AbstractC9133u.m16133g(name, "name");
        return AbstractC9035e.m15725q(this, name);
    }

    public int hashCode() {
        return AbstractC9035e.m15715g(this);
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        return AbstractC9035e.m15718j(this);
    }

    public final int size() {
        return this.f16795a.length / 2;
    }

    public String toString() {
        return AbstractC9035e.m15723o(this);
    }
}
