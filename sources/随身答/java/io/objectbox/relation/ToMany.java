package io.objectbox.relation;

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
import p026b8.C5206a;
import p037c8.C5271f;
import p037c8.InterfaceC5268c;

/* loaded from: classes5.dex */
public class ToMany<TARGET> implements List<TARGET>, Serializable {

    /* renamed from: o */
    public static final Integer f14061o = 1;

    /* renamed from: a */
    public final Object f14062a;

    /* renamed from: b */
    public final RelationInfo f14063b;

    /* renamed from: c */
    public volatile ListFactory f14064c;

    /* renamed from: d */
    public List f14065d;

    /* renamed from: e */
    public Map f14066e;

    /* renamed from: f */
    public volatile Map f14067f;

    /* renamed from: g */
    public Map f14068g;

    /* renamed from: h */
    public List f14069h;

    /* renamed from: i */
    public List f14070i;

    /* renamed from: j */
    public transient BoxStore f14071j;

    /* renamed from: k */
    public transient C5206a f14072k;

    /* renamed from: l */
    public volatile transient C5206a f14073l;

    /* renamed from: m */
    public transient boolean f14074m;

    /* renamed from: n */
    public transient Comparator f14075n;

    public ToMany(Object obj, RelationInfo relationInfo) {
        if (obj == null) {
            throw new IllegalArgumentException("No source entity given (null)");
        }
        if (relationInfo == null) {
            throw new IllegalArgumentException("No relation info given (null)");
        }
        this.f14062a = obj;
        this.f14063b = relationInfo;
    }

    /* renamed from: A */
    public final void m13164A(Cursor cursor, long j9, List list, InterfaceC5268c interfaceC5268c) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (interfaceC5268c.mo2406a(it.next()) == 0) {
                it.remove();
            }
        }
        int size = list.size();
        if (size > 0) {
            long[] jArr = new long[size];
            for (int i9 = 0; i9 < size; i9++) {
                jArr[i9] = interfaceC5268c.mo2406a(list.get(i9));
            }
            cursor.m13126o(this.f14063b.f14060i, j9, jArr, true);
        }
    }

    /* renamed from: B */
    public final void m13165B(Object obj) {
        m13171k();
        Integer num = (Integer) this.f14066e.put(obj, f14061o);
        if (num != null) {
            this.f14066e.put(obj, Integer.valueOf(num.intValue() + 1));
        }
        this.f14067f.put(obj, Boolean.TRUE);
        this.f14068g.remove(obj);
    }

    /* renamed from: C */
    public final void m13166C(Collection collection) {
        m13171k();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            m13165B(it.next());
        }
    }

    /* renamed from: D */
    public final void m13167D(Object obj) {
        m13171k();
        Integer num = (Integer) this.f14066e.remove(obj);
        if (num != null) {
            if (num.intValue() == 1) {
                this.f14066e.remove(obj);
                this.f14067f.remove(obj);
                this.f14068g.put(obj, Boolean.TRUE);
            } else {
                if (num.intValue() > 1) {
                    this.f14066e.put(obj, Integer.valueOf(num.intValue() - 1));
                    return;
                }
                throw new IllegalStateException("Illegal count: " + num);
            }
        }
    }

    /* renamed from: a */
    public final void m13168a(Cursor cursor, long j9, Object[] objArr, InterfaceC5268c interfaceC5268c) {
        int length = objArr.length;
        long[] jArr = new long[length];
        for (int i9 = 0; i9 < length; i9++) {
            long jMo2406a = interfaceC5268c.mo2406a(objArr[i9]);
            if (jMo2406a == 0) {
                throw new IllegalStateException("Target entity has no ID (should have been put before)");
            }
            jArr[i9] = jMo2406a;
        }
        cursor.m13126o(this.f14063b.f14060i, j9, jArr, false);
    }

    @Override // java.util.List, java.util.Collection
    public synchronized boolean add(Object obj) {
        m13165B(obj);
        return this.f14065d.add(obj);
    }

    @Override // java.util.List, java.util.Collection
    public synchronized boolean addAll(Collection collection) {
        m13166C(collection);
        return this.f14065d.addAll(collection);
    }

    /* renamed from: c */
    public final void m13169c() {
        if (this.f14073l == null) {
            try {
                BoxStore boxStore = (BoxStore) C5271f.m2412b().m2413a(this.f14062a.getClass(), "__boxStore").get(this.f14062a);
                this.f14071j = boxStore;
                if (boxStore == null) {
                    throw new DbDetachedException("Cannot resolve relation for detached entities, call box.attach(entity) beforehand.");
                }
                this.f14072k = boxStore.m13101h(this.f14063b.f14052a.mo7364f());
                this.f14073l = this.f14071j.m13101h(this.f14063b.f14053b.mo7364f());
            } catch (IllegalAccessException e10) {
                throw new RuntimeException(e10);
            }
        }
    }

    @Override // java.util.List, java.util.Collection
    public synchronized void clear() {
        try {
            m13171k();
            List list = this.f14065d;
            if (list != null) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    this.f14068g.put(it.next(), Boolean.TRUE);
                }
                list.clear();
            }
            Map map = this.f14067f;
            if (map != null) {
                map.clear();
            }
            Map map2 = this.f14066e;
            if (map2 != null) {
                map2.clear();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // java.util.List, java.util.Collection
    public boolean contains(Object obj) {
        m13170g();
        return this.f14065d.contains(obj);
    }

    @Override // java.util.List, java.util.Collection
    public boolean containsAll(Collection collection) {
        m13170g();
        return this.f14065d.containsAll(collection);
    }

    /* renamed from: g */
    public final void m13170g() {
        if (this.f14065d == null) {
            long jMo2406a = this.f14063b.f14052a.mo7367l().mo2406a(this.f14062a);
            if (jMo2406a == 0) {
                synchronized (this) {
                    try {
                        if (this.f14065d == null) {
                            this.f14065d = m13173q().mo13163e();
                        }
                    } finally {
                    }
                }
                return;
            }
            m13169c();
            RelationInfo relationInfo = this.f14063b;
            int i9 = relationInfo.f14060i;
            List listM2254k = i9 != 0 ? this.f14073l.m2254k(relationInfo.f14052a.mo7366j(), i9, jMo2406a, false) : relationInfo.f14054c != null ? this.f14073l.m2253j(this.f14063b.f14053b.mo7366j(), this.f14063b.f14054c, jMo2406a) : this.f14073l.m2254k(this.f14063b.f14053b.mo7366j(), this.f14063b.f14055d, jMo2406a, true);
            Comparator comparator = this.f14075n;
            if (comparator != null) {
                Collections.sort(listM2254k, comparator);
            }
            synchronized (this) {
                try {
                    if (this.f14065d == null) {
                        this.f14065d = listM2254k;
                    }
                } finally {
                }
            }
        }
    }

    @Override // java.util.List
    public Object get(int i9) {
        m13170g();
        return this.f14065d.get(i9);
    }

    @Override // java.util.List
    public int indexOf(Object obj) {
        m13170g();
        return this.f14065d.indexOf(obj);
    }

    @Override // java.util.List, java.util.Collection
    public boolean isEmpty() {
        m13170g();
        return this.f14065d.isEmpty();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        m13170g();
        return this.f14065d.iterator();
    }

    /* renamed from: k */
    public final void m13171k() {
        m13170g();
        if (this.f14067f == null) {
            synchronized (this) {
                try {
                    if (this.f14067f == null) {
                        this.f14067f = new LinkedHashMap();
                        this.f14068g = new LinkedHashMap();
                        this.f14066e = new HashMap();
                        for (Object obj : this.f14065d) {
                            Integer num = (Integer) this.f14066e.put(obj, f14061o);
                            if (num != null) {
                                this.f14066e.put(obj, Integer.valueOf(num.intValue() + 1));
                            }
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Override // java.util.List
    public int lastIndexOf(Object obj) {
        m13170g();
        return this.f14065d.lastIndexOf(obj);
    }

    @Override // java.util.List
    public ListIterator listIterator() {
        m13170g();
        return this.f14065d.listIterator();
    }

    /* renamed from: n */
    public Object m13172n(long j9) {
        m13170g();
        Object[] array = this.f14065d.toArray();
        InterfaceC5268c interfaceC5268cMo7367l = this.f14063b.f14053b.mo7367l();
        for (Object obj : array) {
            if (interfaceC5268cMo7367l.mo2406a(obj) == j9) {
                return obj;
            }
        }
        return null;
    }

    /* renamed from: q */
    public ListFactory m13173q() {
        ListFactory copyOnWriteArrayListFactory;
        ListFactory listFactory = this.f14064c;
        if (listFactory != null) {
            return listFactory;
        }
        synchronized (this) {
            try {
                copyOnWriteArrayListFactory = this.f14064c;
                if (copyOnWriteArrayListFactory == null) {
                    copyOnWriteArrayListFactory = new ListFactory.CopyOnWriteArrayListFactory();
                    this.f14064c = copyOnWriteArrayListFactory;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return copyOnWriteArrayListFactory;
    }

    @Override // java.util.List
    public synchronized Object remove(int i9) {
        Object objRemove;
        m13171k();
        objRemove = this.f14065d.remove(i9);
        m13167D(objRemove);
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
        boolean z9;
        try {
            m13171k();
            z9 = false;
            ArrayList arrayList = null;
            for (Object obj : this.f14065d) {
                if (!collection.contains(obj)) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(obj);
                    z9 = true;
                }
            }
            if (arrayList != null) {
                removeAll(arrayList);
            }
        } catch (Throwable th) {
            throw th;
        }
        return z9;
    }

    @Override // java.util.List
    public synchronized Object set(int i9, Object obj) {
        Object obj2;
        m13171k();
        obj2 = this.f14065d.set(i9, obj);
        m13167D(obj2);
        m13165B(obj);
        return obj2;
    }

    @Override // java.util.List, java.util.Collection
    public int size() {
        m13170g();
        return this.f14065d.size();
    }

    @Override // java.util.List
    public List subList(int i9, int i10) {
        m13170g();
        return this.f14065d.subList(i9, i10);
    }

    /* renamed from: t */
    public boolean m13174t() {
        Map map = this.f14067f;
        if (map != null && !map.isEmpty()) {
            return true;
        }
        Map map2 = this.f14068g;
        return (map2 == null || map2.isEmpty()) ? false : true;
    }

    @Override // java.util.List, java.util.Collection
    public Object[] toArray() {
        m13170g();
        return this.f14065d.toArray();
    }

    /* renamed from: u */
    public int m13175u(long j9) {
        m13170g();
        Object[] array = this.f14065d.toArray();
        InterfaceC5268c interfaceC5268cMo7367l = this.f14063b.f14053b.mo7367l();
        int i9 = 0;
        for (Object obj : array) {
            if (interfaceC5268cMo7367l.mo2406a(obj) == j9) {
                return i9;
            }
            i9++;
        }
        return -1;
    }

    /* renamed from: v */
    public void m13176v(Cursor cursor, Cursor cursor2) {
        Object[] array;
        Object[] array2;
        Object[] objArr;
        ArrayList arrayList;
        Object[] array3;
        RelationInfo relationInfo = this.f14063b;
        boolean z9 = relationInfo.f14060i != 0;
        InterfaceC5268c interfaceC5268cMo7367l = relationInfo.f14053b.mo7367l();
        synchronized (this) {
            array = null;
            if (z9) {
                try {
                    for (Object obj : this.f14067f.keySet()) {
                        if (interfaceC5268cMo7367l.mo2406a(obj) == 0) {
                            this.f14069h.add(obj);
                        }
                    }
                    if (this.f14074m) {
                        this.f14070i.addAll(this.f14068g.keySet());
                    }
                    if (this.f14067f.isEmpty()) {
                        array2 = null;
                    } else {
                        array2 = this.f14067f.keySet().toArray();
                        this.f14067f.clear();
                    }
                    if (this.f14068g.isEmpty()) {
                        objArr = array2;
                        arrayList = null;
                    } else {
                        ArrayList arrayList2 = new ArrayList(this.f14068g.keySet());
                        this.f14068g.clear();
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
            array3 = this.f14070i.isEmpty() ? null : this.f14070i.toArray();
            this.f14070i.clear();
            if (!this.f14069h.isEmpty()) {
                array = this.f14069h.toArray();
            }
            this.f14069h.clear();
        }
        if (array3 != null) {
            for (Object obj2 : array3) {
                long jMo2406a = interfaceC5268cMo7367l.mo2406a(obj2);
                if (jMo2406a != 0) {
                    cursor2.m13118c(jMo2406a);
                }
            }
        }
        if (array != null) {
            for (Object obj3 : array) {
                cursor2.mo7359p(obj3);
            }
        }
        if (z9) {
            long jMo2406a2 = this.f14063b.f14052a.mo7367l().mo2406a(this.f14062a);
            if (jMo2406a2 == 0) {
                throw new IllegalStateException("Source entity has no ID (should have been put before)");
            }
            if (arrayList != null) {
                m13164A(cursor, jMo2406a2, arrayList, interfaceC5268cMo7367l);
            }
            if (objArr != null) {
                m13168a(cursor, jMo2406a2, objArr, interfaceC5268cMo7367l);
            }
        }
    }

    /* renamed from: w */
    public boolean m13177w() throws Throwable {
        if (!m13174t()) {
            return false;
        }
        synchronized (this) {
            try {
                if (this.f14069h == null) {
                    this.f14069h = new ArrayList();
                    this.f14070i = new ArrayList();
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
        RelationInfo relationInfo = this.f14063b;
        if (relationInfo.f14060i != 0) {
            return true;
        }
        long jMo2406a = relationInfo.f14052a.mo7367l().mo2406a(this.f14062a);
        if (jMo2406a == 0) {
            throw new IllegalStateException("Source entity has no ID (should have been put before)");
        }
        InterfaceC5268c interfaceC5268cMo7367l = this.f14063b.f14053b.mo7367l();
        Map map = this.f14067f;
        Map map2 = this.f14068g;
        return this.f14063b.f14055d != 0 ? m13178x(jMo2406a, interfaceC5268cMo7367l, map, map2) : m13179y(jMo2406a, interfaceC5268cMo7367l, map, map2);
    }

    /* renamed from: x */
    public final boolean m13178x(long j9, InterfaceC5268c interfaceC5268c, Map map, Map map2) {
        boolean z9;
        ToManyGetter toManyGetter = this.f14063b.f14059h;
        synchronized (this) {
            if (map != null) {
                try {
                    if (!map.isEmpty()) {
                        for (Object obj : map.keySet()) {
                            ToMany toMany = (ToMany) toManyGetter.mo7385b(obj);
                            if (toMany == null) {
                                throw new IllegalStateException("The ToMany property for " + this.f14063b.f14053b.mo7369s() + " is null");
                            }
                            if (toMany.m13172n(j9) == null) {
                                toMany.add(this.f14062a);
                                this.f14069h.add(obj);
                            } else if (interfaceC5268c.mo2406a(obj) == 0) {
                                this.f14069h.add(obj);
                            }
                        }
                        map.clear();
                    }
                } finally {
                }
            }
            if (map2 != null) {
                for (Object obj2 : map2.keySet()) {
                    ToMany toMany2 = (ToMany) toManyGetter.mo7385b(obj2);
                    if (toMany2.m13172n(j9) != null) {
                        toMany2.m13180z(j9);
                        if (interfaceC5268c.mo2406a(obj2) != 0) {
                            if (this.f14074m) {
                                this.f14070i.add(obj2);
                            } else {
                                this.f14069h.add(obj2);
                            }
                        }
                    }
                }
                map2.clear();
            }
            z9 = (this.f14069h.isEmpty() && this.f14070i.isEmpty()) ? false : true;
        }
        return z9;
    }

    /* renamed from: y */
    public final boolean m13179y(long j9, InterfaceC5268c interfaceC5268c, Map map, Map map2) {
        boolean z9;
        ToOneGetter toOneGetter = this.f14063b.f14058g;
        synchronized (this) {
            if (map != null) {
                try {
                    if (!map.isEmpty()) {
                        for (Object obj : map.keySet()) {
                            ToOne toOneMo7371o = toOneGetter.mo7371o(obj);
                            if (toOneMo7371o == null) {
                                throw new IllegalStateException("The ToOne property for " + this.f14063b.f14053b.mo7369s() + "." + this.f14063b.f14054c.f14008e + " is null");
                            }
                            if (toOneMo7371o.m13185n() != j9) {
                                toOneMo7371o.m13190w(this.f14062a);
                                this.f14069h.add(obj);
                            } else if (interfaceC5268c.mo2406a(obj) == 0) {
                                this.f14069h.add(obj);
                            }
                        }
                        map.clear();
                    }
                } finally {
                }
            }
            if (map2 != null) {
                for (Object obj2 : map2.keySet()) {
                    ToOne toOneMo7371o2 = toOneGetter.mo7371o(obj2);
                    if (toOneMo7371o2.m13185n() == j9) {
                        toOneMo7371o2.m13190w(null);
                        if (interfaceC5268c.mo2406a(obj2) != 0) {
                            if (this.f14074m) {
                                this.f14070i.add(obj2);
                            } else {
                                this.f14069h.add(obj2);
                            }
                        }
                    }
                }
                map2.clear();
            }
            z9 = (this.f14069h.isEmpty() && this.f14070i.isEmpty()) ? false : true;
        }
        return z9;
    }

    /* renamed from: z */
    public synchronized Object m13180z(long j9) {
        m13170g();
        int size = this.f14065d.size();
        InterfaceC5268c interfaceC5268cMo7367l = this.f14063b.f14053b.mo7367l();
        for (int i9 = 0; i9 < size; i9++) {
            Object obj = this.f14065d.get(i9);
            if (interfaceC5268cMo7367l.mo2406a(obj) == j9) {
                Object objRemove = remove(i9);
                if (objRemove == obj) {
                    return obj;
                }
                throw new IllegalStateException("Mismatch: " + objRemove + " vs. " + obj);
            }
        }
        return null;
    }

    @Override // java.util.List
    public synchronized void add(int i9, Object obj) {
        m13165B(obj);
        this.f14065d.add(i9, obj);
    }

    @Override // java.util.List
    public synchronized boolean addAll(int i9, Collection collection) {
        m13166C(collection);
        return this.f14065d.addAll(i9, collection);
    }

    @Override // java.util.List
    public ListIterator listIterator(int i9) {
        m13170g();
        return this.f14065d.listIterator(i9);
    }

    @Override // java.util.List, java.util.Collection
    public Object[] toArray(Object[] objArr) {
        m13170g();
        return this.f14065d.toArray(objArr);
    }

    @Override // java.util.List, java.util.Collection
    public synchronized boolean remove(Object obj) {
        boolean zRemove;
        m13171k();
        zRemove = this.f14065d.remove(obj);
        if (zRemove) {
            m13167D(obj);
        }
        return zRemove;
    }
}
