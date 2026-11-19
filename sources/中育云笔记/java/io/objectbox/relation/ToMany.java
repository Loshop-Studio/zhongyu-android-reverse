package io.objectbox.relation;

import com.alibaba.android.arouter.utils.Consts;
import io.objectbox.BoxStore;
import io.objectbox.Cursor;
import io.objectbox.exception.DbDetachedException;
import io.objectbox.internal.ToManyGetter;
import io.objectbox.internal.ToOneGetter;
import io.objectbox.relation.ListFactory;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import p210jc.C9710a;
import p225kc.C9913f;
import p225kc.InterfaceC9910c;

/* loaded from: classes6.dex */
public class ToMany<TARGET> implements List<TARGET>, Serializable {

    /* renamed from: q */
    public static final Integer f22320q = 1;

    /* renamed from: c */
    public final Object f22321c;

    /* renamed from: d */
    public final RelationInfo f22322d;

    /* renamed from: e */
    public volatile ListFactory f22323e;

    /* renamed from: f */
    public List f22324f;

    /* renamed from: g */
    public Map f22325g;

    /* renamed from: h */
    public volatile Map f22326h;

    /* renamed from: i */
    public Map f22327i;

    /* renamed from: j */
    public List f22328j;

    /* renamed from: k */
    public List f22329k;

    /* renamed from: l */
    public transient BoxStore f22330l;

    /* renamed from: m */
    public transient C9710a f22331m;

    /* renamed from: n */
    public volatile transient C9710a f22332n;

    /* renamed from: o */
    public transient boolean f22333o;

    /* renamed from: p */
    public transient Comparator f22334p;

    public ToMany(Object obj, RelationInfo relationInfo) {
        if (obj == null) {
            throw new IllegalArgumentException("No source entity given (null)");
        }
        if (relationInfo == null) {
            throw new IllegalArgumentException("No relation info given (null)");
        }
        this.f22321c = obj;
        this.f22322d = relationInfo;
    }

    /* renamed from: a */
    public final void m19017a(Cursor cursor, long j10, Object[] objArr, InterfaceC9910c interfaceC9910c) {
        int length = objArr.length;
        long[] jArr = new long[length];
        for (int i10 = 0; i10 < length; i10++) {
            long jMo14001a = interfaceC9910c.mo14001a(objArr[i10]);
            if (jMo14001a == 0) {
                throw new IllegalStateException("Target entity has no ID (should have been put before)");
            }
            jArr[i10] = jMo14001a;
        }
        cursor.m18978p(this.f22322d.f22319k, j10, jArr, false);
    }

    @Override // java.util.List, java.util.Collection
    public synchronized boolean add(Object obj) {
        m19031v(obj);
        return this.f22324f.add(obj);
    }

    @Override // java.util.List, java.util.Collection
    public synchronized boolean addAll(Collection collection) {
        m19032y(collection);
        return this.f22324f.addAll(collection);
    }

    /* renamed from: c */
    public final void m19018c() {
        if (this.f22332n == null) {
            try {
                BoxStore boxStore = (BoxStore) C9913f.m19986b().m19987a(this.f22321c.getClass(), "__boxStore").get(this.f22321c);
                this.f22330l = boxStore;
                if (boxStore == null) {
                    throw new DbDetachedException("Cannot resolve relation for detached entities, call box.attach(entity) beforehand.");
                }
                this.f22331m = boxStore.m18954g(this.f22322d.f22311c.mo13994j());
                this.f22332n = this.f22330l.m18954g(this.f22322d.f22312d.mo13994j());
            } catch (IllegalAccessException e10) {
                throw new RuntimeException(e10);
            }
        }
    }

    @Override // java.util.List, java.util.Collection
    public synchronized void clear() {
        try {
            m19020e();
            List list = this.f22324f;
            if (list != null) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    this.f22327i.put(it.next(), Boolean.TRUE);
                }
                list.clear();
            }
            Map map = this.f22326h;
            if (map != null) {
                map.clear();
            }
            Map map2 = this.f22325g;
            if (map2 != null) {
                map2.clear();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // java.util.List, java.util.Collection
    public boolean contains(Object obj) {
        m19019d();
        return this.f22324f.contains(obj);
    }

    @Override // java.util.List, java.util.Collection
    public boolean containsAll(Collection collection) {
        m19019d();
        return this.f22324f.containsAll(collection);
    }

    /* renamed from: d */
    public final void m19019d() {
        if (this.f22324f == null) {
            long jMo14001a = this.f22322d.f22311c.mo13997s().mo14001a(this.f22321c);
            if (jMo14001a == 0) {
                synchronized (this) {
                    try {
                        if (this.f22324f == null) {
                            this.f22324f = m19022g().mo19016i();
                        }
                    } finally {
                    }
                }
                return;
            }
            m19018c();
            RelationInfo relationInfo = this.f22322d;
            int i10 = relationInfo.f22319k;
            List listM19226l = i10 != 0 ? this.f22332n.m19226l(relationInfo.f22311c.mo13996q(), i10, jMo14001a, false) : relationInfo.f22313e != null ? this.f22332n.m19225k(this.f22322d.f22312d.mo13996q(), this.f22322d.f22313e, jMo14001a) : this.f22332n.m19226l(this.f22322d.f22312d.mo13996q(), this.f22322d.f22314f, jMo14001a, true);
            Comparator comparator = this.f22334p;
            if (comparator != null) {
                Collections.sort(listM19226l, comparator);
            }
            synchronized (this) {
                try {
                    if (this.f22324f == null) {
                        this.f22324f = listM19226l;
                    }
                } finally {
                }
            }
        }
    }

    /* renamed from: e */
    public final void m19020e() {
        m19019d();
        if (this.f22326h == null) {
            synchronized (this) {
                try {
                    if (this.f22326h == null) {
                        this.f22326h = new LinkedHashMap();
                        this.f22327i = new LinkedHashMap();
                        this.f22325g = new HashMap();
                        for (Object obj : this.f22324f) {
                            Integer num = (Integer) this.f22325g.put(obj, f22320q);
                            if (num != null) {
                                this.f22325g.put(obj, Integer.valueOf(num.intValue() + 1));
                            }
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    /* renamed from: f */
    public Object m19021f(long j10) {
        m19019d();
        Object[] array = this.f22324f.toArray();
        InterfaceC9910c interfaceC9910cMo13997s = this.f22322d.f22312d.mo13997s();
        for (Object obj : array) {
            if (interfaceC9910cMo13997s.mo14001a(obj) == j10) {
                return obj;
            }
        }
        return null;
    }

    /* renamed from: g */
    public ListFactory m19022g() {
        ListFactory copyOnWriteArrayListFactory;
        ListFactory listFactory = this.f22323e;
        if (listFactory != null) {
            return listFactory;
        }
        synchronized (this) {
            try {
                copyOnWriteArrayListFactory = this.f22323e;
                if (copyOnWriteArrayListFactory == null) {
                    copyOnWriteArrayListFactory = new ListFactory.CopyOnWriteArrayListFactory();
                    this.f22323e = copyOnWriteArrayListFactory;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return copyOnWriteArrayListFactory;
    }

    @Override // java.util.List
    public Object get(int i10) {
        m19019d();
        return this.f22324f.get(i10);
    }

    @Override // java.util.List
    public int indexOf(Object obj) {
        m19019d();
        return this.f22324f.indexOf(obj);
    }

    @Override // java.util.List, java.util.Collection
    public boolean isEmpty() {
        m19019d();
        return this.f22324f.isEmpty();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        m19019d();
        return this.f22324f.iterator();
    }

    /* renamed from: k */
    public boolean m19023k() {
        Map map = this.f22326h;
        if (map != null && !map.isEmpty()) {
            return true;
        }
        Map map2 = this.f22327i;
        return (map2 == null || map2.isEmpty()) ? false : true;
    }

    @Override // java.util.List
    public int lastIndexOf(Object obj) {
        m19019d();
        return this.f22324f.lastIndexOf(obj);
    }

    @Override // java.util.List
    public ListIterator listIterator() {
        m19019d();
        return this.f22324f.listIterator();
    }

    /* renamed from: m */
    public int m19024m(long j10) {
        m19019d();
        Object[] array = this.f22324f.toArray();
        InterfaceC9910c interfaceC9910cMo13997s = this.f22322d.f22312d.mo13997s();
        int i10 = 0;
        for (Object obj : array) {
            if (interfaceC9910cMo13997s.mo14001a(obj) == j10) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    /* renamed from: n */
    public void m19025n(Cursor cursor, Cursor cursor2) {
        Object[] array;
        Object[] array2;
        Object[] objArr;
        ArrayList arrayList;
        Object[] array3;
        RelationInfo relationInfo = this.f22322d;
        boolean z10 = relationInfo.f22319k != 0;
        InterfaceC9910c interfaceC9910cMo13997s = relationInfo.f22312d.mo13997s();
        synchronized (this) {
            array = null;
            if (z10) {
                try {
                    for (Object obj : this.f22326h.keySet()) {
                        if (interfaceC9910cMo13997s.mo14001a(obj) == 0) {
                            this.f22328j.add(obj);
                        }
                    }
                    if (this.f22333o) {
                        this.f22329k.addAll(this.f22327i.keySet());
                    }
                    if (this.f22326h.isEmpty()) {
                        array2 = null;
                    } else {
                        array2 = this.f22326h.keySet().toArray();
                        this.f22326h.clear();
                    }
                    if (this.f22327i.isEmpty()) {
                        objArr = array2;
                        arrayList = null;
                    } else {
                        ArrayList arrayList2 = new ArrayList(this.f22327i.keySet());
                        this.f22327i.clear();
                        objArr = array2;
                        arrayList = arrayList2;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            } else {
                arrayList = null;
                objArr = null;
            }
            array3 = this.f22329k.isEmpty() ? null : this.f22329k.toArray();
            this.f22329k.clear();
            if (!this.f22328j.isEmpty()) {
                array = this.f22328j.toArray();
            }
            this.f22328j.clear();
        }
        if (array3 != null) {
            for (Object obj2 : array3) {
                long jMo14001a = interfaceC9910cMo13997s.mo14001a(obj2);
                if (jMo14001a != 0) {
                    cursor2.m18969c(jMo14001a);
                }
            }
        }
        if (array != null) {
            for (Object obj3 : array) {
                cursor2.mo13987s(obj3);
            }
        }
        if (z10) {
            long jMo14001a2 = this.f22322d.f22311c.mo13997s().mo14001a(this.f22321c);
            if (jMo14001a2 == 0) {
                throw new IllegalStateException("Source entity has no ID (should have been put before)");
            }
            if (arrayList != null) {
                m19030u(cursor, jMo14001a2, arrayList, interfaceC9910cMo13997s);
            }
            if (objArr != null) {
                m19017a(cursor, jMo14001a2, objArr, interfaceC9910cMo13997s);
            }
        }
    }

    /* renamed from: o */
    public boolean m19026o() throws Throwable {
        if (!m19023k()) {
            return false;
        }
        synchronized (this) {
            try {
                if (this.f22328j == null) {
                    this.f22328j = new ArrayList();
                    this.f22329k = new ArrayList();
                }
            } catch (Throwable th) {
                th = th;
                while (true) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        th = th2;
                    }
                }
            }
        }
        RelationInfo relationInfo = this.f22322d;
        if (relationInfo.f22319k != 0) {
            return true;
        }
        long jMo14001a = relationInfo.f22311c.mo13997s().mo14001a(this.f22321c);
        if (jMo14001a == 0) {
            throw new IllegalStateException("Source entity has no ID (should have been put before)");
        }
        InterfaceC9910c interfaceC9910cMo13997s = this.f22322d.f22312d.mo13997s();
        Map map = this.f22326h;
        Map map2 = this.f22327i;
        return this.f22322d.f22314f != 0 ? m19027p(jMo14001a, interfaceC9910cMo13997s, map, map2) : m19028r(jMo14001a, interfaceC9910cMo13997s, map, map2);
    }

    /* renamed from: p */
    public final boolean m19027p(long j10, InterfaceC9910c interfaceC9910c, Map map, Map map2) {
        boolean z10;
        ToManyGetter toManyGetter = this.f22322d.f22318j;
        synchronized (this) {
            if (map != null) {
                try {
                    if (!map.isEmpty()) {
                        for (Object obj : map.keySet()) {
                            ToMany toMany = (ToMany) toManyGetter.mo14015b(obj);
                            if (toMany == null) {
                                throw new IllegalStateException("The ToMany property for " + this.f22322d.f22312d.mo13992B() + " is null");
                            }
                            if (toMany.m19021f(j10) == null) {
                                toMany.add(this.f22321c);
                                this.f22328j.add(obj);
                            } else if (interfaceC9910c.mo14001a(obj) == 0) {
                                this.f22328j.add(obj);
                            }
                        }
                        map.clear();
                    }
                } finally {
                }
            }
            if (map2 != null) {
                for (Object obj2 : map2.keySet()) {
                    ToMany toMany2 = (ToMany) toManyGetter.mo14015b(obj2);
                    if (toMany2.m19021f(j10) != null) {
                        toMany2.m19029t(j10);
                        if (interfaceC9910c.mo14001a(obj2) != 0) {
                            if (this.f22333o) {
                                this.f22329k.add(obj2);
                            } else {
                                this.f22328j.add(obj2);
                            }
                        }
                    }
                }
                map2.clear();
            }
            z10 = (this.f22328j.isEmpty() && this.f22329k.isEmpty()) ? false : true;
        }
        return z10;
    }

    /* renamed from: r */
    public final boolean m19028r(long j10, InterfaceC9910c interfaceC9910c, Map map, Map map2) {
        boolean z10;
        ToOneGetter toOneGetter = this.f22322d.f22317i;
        synchronized (this) {
            if (map != null) {
                try {
                    if (!map.isEmpty()) {
                        for (Object obj : map.keySet()) {
                            ToOne toOneMo14000w = toOneGetter.mo14000w(obj);
                            if (toOneMo14000w == null) {
                                throw new IllegalStateException("The ToOne property for " + this.f22322d.f22312d.mo13992B() + Consts.DOT + this.f22322d.f22313e.f22267g + " is null");
                            }
                            if (toOneMo14000w.m19038f() != j10) {
                                toOneMo14000w.m19043o(this.f22321c);
                                this.f22328j.add(obj);
                            } else if (interfaceC9910c.mo14001a(obj) == 0) {
                                this.f22328j.add(obj);
                            }
                        }
                        map.clear();
                    }
                } finally {
                }
            }
            if (map2 != null) {
                for (Object obj2 : map2.keySet()) {
                    ToOne toOneMo14000w2 = toOneGetter.mo14000w(obj2);
                    if (toOneMo14000w2.m19038f() == j10) {
                        toOneMo14000w2.m19043o(null);
                        if (interfaceC9910c.mo14001a(obj2) != 0) {
                            if (this.f22333o) {
                                this.f22329k.add(obj2);
                            } else {
                                this.f22328j.add(obj2);
                            }
                        }
                    }
                }
                map2.clear();
            }
            z10 = (this.f22328j.isEmpty() && this.f22329k.isEmpty()) ? false : true;
        }
        return z10;
    }

    @Override // java.util.List
    public synchronized Object remove(int i10) {
        Object objRemove;
        m19020e();
        objRemove = this.f22324f.remove(i10);
        m19033z(objRemove);
        return objRemove;
    }

    @Override // java.util.List, java.util.Collection
    public synchronized boolean removeAll(Collection collection) {
        boolean zRemove;
        Iterator it = collection.iterator();
        zRemove = false;
        while (it.hasNext()) {
            zRemove |= remove(it.next());
        }
        return zRemove;
    }

    @Override // java.util.List, java.util.Collection
    public synchronized boolean retainAll(Collection collection) {
        boolean z10;
        try {
            m19020e();
            z10 = false;
            ArrayList arrayList = null;
            for (Object obj : this.f22324f) {
                if (!collection.contains(obj)) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(obj);
                    z10 = true;
                }
            }
            if (arrayList != null) {
                removeAll(arrayList);
            }
        } catch (Throwable th) {
            throw th;
        }
        return z10;
    }

    @Override // java.util.List
    public synchronized Object set(int i10, Object obj) {
        Object obj2;
        m19020e();
        obj2 = this.f22324f.set(i10, obj);
        m19033z(obj2);
        m19031v(obj);
        return obj2;
    }

    @Override // java.util.List, java.util.Collection
    public int size() {
        m19019d();
        return this.f22324f.size();
    }

    @Override // java.util.List
    public List subList(int i10, int i11) {
        m19019d();
        return this.f22324f.subList(i10, i11);
    }

    /* renamed from: t */
    public synchronized Object m19029t(long j10) {
        m19019d();
        int size = this.f22324f.size();
        InterfaceC9910c interfaceC9910cMo13997s = this.f22322d.f22312d.mo13997s();
        for (int i10 = 0; i10 < size; i10++) {
            Object obj = this.f22324f.get(i10);
            if (interfaceC9910cMo13997s.mo14001a(obj) == j10) {
                Object objRemove = remove(i10);
                if (objRemove == obj) {
                    return obj;
                }
                throw new IllegalStateException("Mismatch: " + objRemove + " vs. " + obj);
            }
        }
        return null;
    }

    @Override // java.util.List, java.util.Collection
    public Object[] toArray() {
        m19019d();
        return this.f22324f.toArray();
    }

    /* renamed from: u */
    public final void m19030u(Cursor cursor, long j10, List list, InterfaceC9910c interfaceC9910c) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (interfaceC9910c.mo14001a(it.next()) == 0) {
                it.remove();
            }
        }
        int size = list.size();
        if (size > 0) {
            long[] jArr = new long[size];
            for (int i10 = 0; i10 < size; i10++) {
                jArr[i10] = interfaceC9910c.mo14001a(list.get(i10));
            }
            cursor.m18978p(this.f22322d.f22319k, j10, jArr, true);
        }
    }

    /* renamed from: v */
    public final void m19031v(Object obj) {
        m19020e();
        Integer num = (Integer) this.f22325g.put(obj, f22320q);
        if (num != null) {
            this.f22325g.put(obj, Integer.valueOf(num.intValue() + 1));
        }
        this.f22326h.put(obj, Boolean.TRUE);
        this.f22327i.remove(obj);
    }

    /* renamed from: y */
    public final void m19032y(Collection collection) {
        m19020e();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            m19031v(it.next());
        }
    }

    /* renamed from: z */
    public final void m19033z(Object obj) {
        m19020e();
        Integer num = (Integer) this.f22325g.remove(obj);
        if (num != null) {
            if (num.intValue() == 1) {
                this.f22325g.remove(obj);
                this.f22326h.remove(obj);
                this.f22327i.put(obj, Boolean.TRUE);
            } else {
                if (num.intValue() > 1) {
                    this.f22325g.put(obj, Integer.valueOf(num.intValue() - 1));
                    return;
                }
                throw new IllegalStateException("Illegal count: " + num);
            }
        }
    }

    @Override // java.util.List
    public synchronized void add(int i10, Object obj) {
        m19031v(obj);
        this.f22324f.add(i10, obj);
    }

    @Override // java.util.List
    public synchronized boolean addAll(int i10, Collection collection) {
        m19032y(collection);
        return this.f22324f.addAll(i10, collection);
    }

    @Override // java.util.List
    public ListIterator listIterator(int i10) {
        m19019d();
        return this.f22324f.listIterator(i10);
    }

    @Override // java.util.List, java.util.Collection
    public Object[] toArray(Object[] objArr) {
        m19019d();
        return this.f22324f.toArray(objArr);
    }

    @Override // java.util.List, java.util.Collection
    public synchronized boolean remove(Object obj) {
        boolean zRemove;
        m19020e();
        zRemove = this.f22324f.remove(obj);
        if (zRemove) {
            m19033z(obj);
        }
        return zRemove;
    }
}
