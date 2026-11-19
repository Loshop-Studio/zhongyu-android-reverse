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
import p214q8.C8980a;
import p225r8.C9051f;
import p225r8.InterfaceC9048c;

/* loaded from: classes5.dex */
public class ToMany<TARGET> implements List<TARGET>, Serializable {

    /* renamed from: o */
    public static final Integer f13247o = 1;

    /* renamed from: a */
    public final Object f13248a;

    /* renamed from: b */
    public final RelationInfo f13249b;

    /* renamed from: c */
    public volatile ListFactory f13250c;

    /* renamed from: d */
    public List f13251d;

    /* renamed from: e */
    public Map f13252e;

    /* renamed from: f */
    public volatile Map f13253f;

    /* renamed from: g */
    public Map f13254g;

    /* renamed from: h */
    public List f13255h;

    /* renamed from: i */
    public List f13256i;

    /* renamed from: j */
    public transient BoxStore f13257j;

    /* renamed from: k */
    public transient C8980a f13258k;

    /* renamed from: l */
    public volatile transient C8980a f13259l;

    /* renamed from: m */
    public transient boolean f13260m;

    /* renamed from: n */
    public transient Comparator f13261n;

    public ToMany(Object obj, RelationInfo relationInfo) {
        if (obj == null) {
            throw new IllegalArgumentException("No source entity given (null)");
        }
        if (relationInfo == null) {
            throw new IllegalArgumentException("No relation info given (null)");
        }
        this.f13248a = obj;
        this.f13249b = relationInfo;
    }

    /* renamed from: A */
    public final void m13045A(Object obj) {
        m13049k();
        Integer num = (Integer) this.f13252e.remove(obj);
        if (num != null) {
            if (num.intValue() == 1) {
                this.f13252e.remove(obj);
                this.f13253f.remove(obj);
                this.f13254g.put(obj, Boolean.TRUE);
            } else {
                if (num.intValue() > 1) {
                    this.f13252e.put(obj, Integer.valueOf(num.intValue() - 1));
                    return;
                }
                throw new IllegalStateException("Illegal count: " + num);
            }
        }
    }

    /* renamed from: a */
    public final void m13046a(Cursor cursor, long j10, Object[] objArr, InterfaceC9048c interfaceC9048c) {
        int length = objArr.length;
        long[] jArr = new long[length];
        for (int i10 = 0; i10 < length; i10++) {
            long jMo6279a = interfaceC9048c.mo6279a(objArr[i10]);
            if (jMo6279a == 0) {
                throw new IllegalStateException("Target entity has no ID (should have been put before)");
            }
            jArr[i10] = jMo6279a;
        }
        cursor.m13006o(this.f13249b.f13246i, j10, jArr, false);
    }

    @Override // java.util.List, java.util.Collection
    public synchronized boolean add(Object obj) {
        m13060y(obj);
        return this.f13251d.add(obj);
    }

    @Override // java.util.List, java.util.Collection
    public synchronized boolean addAll(Collection collection) {
        m13061z(collection);
        return this.f13251d.addAll(collection);
    }

    @Override // java.util.List, java.util.Collection
    public synchronized void clear() {
        try {
            m13049k();
            List list = this.f13251d;
            if (list != null) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    this.f13254g.put(it.next(), Boolean.TRUE);
                }
                list.clear();
            }
            Map map = this.f13253f;
            if (map != null) {
                map.clear();
            }
            Map map2 = this.f13252e;
            if (map2 != null) {
                map2.clear();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // java.util.List, java.util.Collection
    public boolean contains(Object obj) {
        m13048j();
        return this.f13251d.contains(obj);
    }

    @Override // java.util.List, java.util.Collection
    public boolean containsAll(Collection collection) {
        m13048j();
        return this.f13251d.containsAll(collection);
    }

    /* renamed from: f */
    public final void m13047f() {
        if (this.f13259l == null) {
            try {
                BoxStore boxStore = (BoxStore) C9051f.m15203b().m15204a(this.f13248a.getClass(), "__boxStore").get(this.f13248a);
                this.f13257j = boxStore;
                if (boxStore == null) {
                    throw new DbDetachedException("Cannot resolve relation for detached entities, call box.attach(entity) beforehand.");
                }
                this.f13258k = boxStore.m12981h(this.f13249b.f13238a.mo6271e());
                this.f13259l = this.f13257j.m12981h(this.f13249b.f13239b.mo6271e());
            } catch (IllegalAccessException e10) {
                throw new RuntimeException(e10);
            }
        }
    }

    @Override // java.util.List
    public Object get(int i10) {
        m13048j();
        return this.f13251d.get(i10);
    }

    @Override // java.util.List
    public int indexOf(Object obj) {
        m13048j();
        return this.f13251d.indexOf(obj);
    }

    @Override // java.util.List, java.util.Collection
    public boolean isEmpty() {
        m13048j();
        return this.f13251d.isEmpty();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        m13048j();
        return this.f13251d.iterator();
    }

    /* renamed from: j */
    public final void m13048j() {
        if (this.f13251d == null) {
            long jMo6279a = this.f13249b.f13238a.mo6274i().mo6279a(this.f13248a);
            if (jMo6279a == 0) {
                synchronized (this) {
                    try {
                        if (this.f13251d == null) {
                            this.f13251d = m13051o().mo13044d();
                        }
                    } finally {
                    }
                }
                return;
            }
            m13047f();
            RelationInfo relationInfo = this.f13249b;
            int i10 = relationInfo.f13246i;
            List listM15044k = i10 != 0 ? this.f13259l.m15044k(relationInfo.f13238a.mo6273h(), i10, jMo6279a, false) : relationInfo.f13240c != null ? this.f13259l.m15043j(this.f13249b.f13239b.mo6273h(), this.f13249b.f13240c, jMo6279a) : this.f13259l.m15044k(this.f13249b.f13239b.mo6273h(), this.f13249b.f13241d, jMo6279a, true);
            Comparator comparator = this.f13261n;
            if (comparator != null) {
                Collections.sort(listM15044k, comparator);
            }
            synchronized (this) {
                try {
                    if (this.f13251d == null) {
                        this.f13251d = listM15044k;
                    }
                } finally {
                }
            }
        }
    }

    /* renamed from: k */
    public final void m13049k() {
        m13048j();
        if (this.f13253f == null) {
            synchronized (this) {
                try {
                    if (this.f13253f == null) {
                        this.f13253f = new LinkedHashMap();
                        this.f13254g = new LinkedHashMap();
                        this.f13252e = new HashMap();
                        for (Object obj : this.f13251d) {
                            Integer num = (Integer) this.f13252e.put(obj, f13247o);
                            if (num != null) {
                                this.f13252e.put(obj, Integer.valueOf(num.intValue() + 1));
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
        m13048j();
        return this.f13251d.lastIndexOf(obj);
    }

    @Override // java.util.List
    public ListIterator listIterator() {
        m13048j();
        return this.f13251d.listIterator();
    }

    /* renamed from: m */
    public Object m13050m(long j10) {
        m13048j();
        Object[] array = this.f13251d.toArray();
        InterfaceC9048c interfaceC9048cMo6274i = this.f13249b.f13239b.mo6274i();
        for (Object obj : array) {
            if (interfaceC9048cMo6274i.mo6279a(obj) == j10) {
                return obj;
            }
        }
        return null;
    }

    /* renamed from: o */
    public ListFactory m13051o() {
        ListFactory copyOnWriteArrayListFactory;
        ListFactory listFactory = this.f13250c;
        if (listFactory != null) {
            return listFactory;
        }
        synchronized (this) {
            try {
                copyOnWriteArrayListFactory = this.f13250c;
                if (copyOnWriteArrayListFactory == null) {
                    copyOnWriteArrayListFactory = new ListFactory.CopyOnWriteArrayListFactory();
                    this.f13250c = copyOnWriteArrayListFactory;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return copyOnWriteArrayListFactory;
    }

    /* renamed from: q */
    public boolean m13052q() {
        Map map = this.f13253f;
        if (map != null && !map.isEmpty()) {
            return true;
        }
        Map map2 = this.f13254g;
        return (map2 == null || map2.isEmpty()) ? false : true;
    }

    /* renamed from: r */
    public int m13053r(long j10) {
        m13048j();
        Object[] array = this.f13251d.toArray();
        InterfaceC9048c interfaceC9048cMo6274i = this.f13249b.f13239b.mo6274i();
        int i10 = 0;
        for (Object obj : array) {
            if (interfaceC9048cMo6274i.mo6279a(obj) == j10) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    @Override // java.util.List
    public synchronized Object remove(int i10) {
        Object objRemove;
        m13049k();
        objRemove = this.f13251d.remove(i10);
        m13045A(objRemove);
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
            m13049k();
            z9 = false;
            ArrayList arrayList = null;
            for (Object obj : this.f13251d) {
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

    /* renamed from: s */
    public void m13054s(Cursor cursor, Cursor cursor2) {
        Object[] array;
        Object[] array2;
        Object[] objArr;
        ArrayList arrayList;
        Object[] array3;
        RelationInfo relationInfo = this.f13249b;
        boolean z9 = relationInfo.f13246i != 0;
        InterfaceC9048c interfaceC9048cMo6274i = relationInfo.f13239b.mo6274i();
        synchronized (this) {
            array = null;
            if (z9) {
                try {
                    for (Object obj : this.f13253f.keySet()) {
                        if (interfaceC9048cMo6274i.mo6279a(obj) == 0) {
                            this.f13255h.add(obj);
                        }
                    }
                    if (this.f13260m) {
                        this.f13256i.addAll(this.f13254g.keySet());
                    }
                    if (this.f13253f.isEmpty()) {
                        array2 = null;
                    } else {
                        array2 = this.f13253f.keySet().toArray();
                        this.f13253f.clear();
                    }
                    if (this.f13254g.isEmpty()) {
                        objArr = array2;
                        arrayList = null;
                    } else {
                        ArrayList arrayList2 = new ArrayList(this.f13254g.keySet());
                        this.f13254g.clear();
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
            array3 = this.f13256i.isEmpty() ? null : this.f13256i.toArray();
            this.f13256i.clear();
            if (!this.f13255h.isEmpty()) {
                array = this.f13255h.toArray();
            }
            this.f13255h.clear();
        }
        if (array3 != null) {
            for (Object obj2 : array3) {
                long jMo6279a = interfaceC9048cMo6274i.mo6279a(obj2);
                if (jMo6279a != 0) {
                    cursor2.m12998f(jMo6279a);
                }
            }
        }
        if (array != null) {
            for (Object obj3 : array) {
                cursor2.mo6265p(obj3);
            }
        }
        if (z9) {
            long jMo6279a2 = this.f13249b.f13238a.mo6274i().mo6279a(this.f13248a);
            if (jMo6279a2 == 0) {
                throw new IllegalStateException("Source entity has no ID (should have been put before)");
            }
            if (arrayList != null) {
                m13059x(cursor, jMo6279a2, arrayList, interfaceC9048cMo6274i);
            }
            if (objArr != null) {
                m13046a(cursor, jMo6279a2, objArr, interfaceC9048cMo6274i);
            }
        }
    }

    @Override // java.util.List
    public synchronized Object set(int i10, Object obj) {
        Object obj2;
        m13049k();
        obj2 = this.f13251d.set(i10, obj);
        m13045A(obj2);
        m13060y(obj);
        return obj2;
    }

    @Override // java.util.List, java.util.Collection
    public int size() {
        m13048j();
        return this.f13251d.size();
    }

    @Override // java.util.List
    public List subList(int i10, int i11) {
        m13048j();
        return this.f13251d.subList(i10, i11);
    }

    /* renamed from: t */
    public boolean m13055t() throws Throwable {
        if (!m13052q()) {
            return false;
        }
        synchronized (this) {
            try {
                if (this.f13255h == null) {
                    this.f13255h = new ArrayList();
                    this.f13256i = new ArrayList();
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
        RelationInfo relationInfo = this.f13249b;
        if (relationInfo.f13246i != 0) {
            return true;
        }
        long jMo6279a = relationInfo.f13238a.mo6274i().mo6279a(this.f13248a);
        if (jMo6279a == 0) {
            throw new IllegalStateException("Source entity has no ID (should have been put before)");
        }
        InterfaceC9048c interfaceC9048cMo6274i = this.f13249b.f13239b.mo6274i();
        Map map = this.f13253f;
        Map map2 = this.f13254g;
        return this.f13249b.f13241d != 0 ? m13056u(jMo6279a, interfaceC9048cMo6274i, map, map2) : m13057v(jMo6279a, interfaceC9048cMo6274i, map, map2);
    }

    @Override // java.util.List, java.util.Collection
    public Object[] toArray() {
        m13048j();
        return this.f13251d.toArray();
    }

    /* renamed from: u */
    public final boolean m13056u(long j10, InterfaceC9048c interfaceC9048c, Map map, Map map2) {
        boolean z9;
        ToManyGetter toManyGetter = this.f13249b.f13245h;
        synchronized (this) {
            if (map != null) {
                try {
                    if (!map.isEmpty()) {
                        for (Object obj : map.keySet()) {
                            ToMany toMany = (ToMany) toManyGetter.mo6292b(obj);
                            if (toMany == null) {
                                throw new IllegalStateException("The ToMany property for " + this.f13249b.f13239b.mo6276p() + " is null");
                            }
                            if (toMany.m13050m(j10) == null) {
                                toMany.add(this.f13248a);
                                this.f13255h.add(obj);
                            } else if (interfaceC9048c.mo6279a(obj) == 0) {
                                this.f13255h.add(obj);
                            }
                        }
                        map.clear();
                    }
                } finally {
                }
            }
            if (map2 != null) {
                for (Object obj2 : map2.keySet()) {
                    ToMany toMany2 = (ToMany) toManyGetter.mo6292b(obj2);
                    if (toMany2.m13050m(j10) != null) {
                        toMany2.m13058w(j10);
                        if (interfaceC9048c.mo6279a(obj2) != 0) {
                            if (this.f13260m) {
                                this.f13256i.add(obj2);
                            } else {
                                this.f13255h.add(obj2);
                            }
                        }
                    }
                }
                map2.clear();
            }
            z9 = (this.f13255h.isEmpty() && this.f13256i.isEmpty()) ? false : true;
        }
        return z9;
    }

    /* renamed from: v */
    public final boolean m13057v(long j10, InterfaceC9048c interfaceC9048c, Map map, Map map2) {
        boolean z9;
        ToOneGetter toOneGetter = this.f13249b.f13244g;
        synchronized (this) {
            if (map != null) {
                try {
                    if (!map.isEmpty()) {
                        for (Object obj : map.keySet()) {
                            ToOne toOneMo6278l = toOneGetter.mo6278l(obj);
                            if (toOneMo6278l == null) {
                                throw new IllegalStateException("The ToOne property for " + this.f13249b.f13239b.mo6276p() + "." + this.f13249b.f13240c.f13194e + " is null");
                            }
                            if (toOneMo6278l.m13066m() != j10) {
                                toOneMo6278l.m13071t(this.f13248a);
                                this.f13255h.add(obj);
                            } else if (interfaceC9048c.mo6279a(obj) == 0) {
                                this.f13255h.add(obj);
                            }
                        }
                        map.clear();
                    }
                } finally {
                }
            }
            if (map2 != null) {
                for (Object obj2 : map2.keySet()) {
                    ToOne toOneMo6278l2 = toOneGetter.mo6278l(obj2);
                    if (toOneMo6278l2.m13066m() == j10) {
                        toOneMo6278l2.m13071t(null);
                        if (interfaceC9048c.mo6279a(obj2) != 0) {
                            if (this.f13260m) {
                                this.f13256i.add(obj2);
                            } else {
                                this.f13255h.add(obj2);
                            }
                        }
                    }
                }
                map2.clear();
            }
            z9 = (this.f13255h.isEmpty() && this.f13256i.isEmpty()) ? false : true;
        }
        return z9;
    }

    /* renamed from: w */
    public synchronized Object m13058w(long j10) {
        m13048j();
        int size = this.f13251d.size();
        InterfaceC9048c interfaceC9048cMo6274i = this.f13249b.f13239b.mo6274i();
        for (int i10 = 0; i10 < size; i10++) {
            Object obj = this.f13251d.get(i10);
            if (interfaceC9048cMo6274i.mo6279a(obj) == j10) {
                Object objRemove = remove(i10);
                if (objRemove == obj) {
                    return obj;
                }
                throw new IllegalStateException("Mismatch: " + objRemove + " vs. " + obj);
            }
        }
        return null;
    }

    /* renamed from: x */
    public final void m13059x(Cursor cursor, long j10, List list, InterfaceC9048c interfaceC9048c) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (interfaceC9048c.mo6279a(it.next()) == 0) {
                it.remove();
            }
        }
        int size = list.size();
        if (size > 0) {
            long[] jArr = new long[size];
            for (int i10 = 0; i10 < size; i10++) {
                jArr[i10] = interfaceC9048c.mo6279a(list.get(i10));
            }
            cursor.m13006o(this.f13249b.f13246i, j10, jArr, true);
        }
    }

    /* renamed from: y */
    public final void m13060y(Object obj) {
        m13049k();
        Integer num = (Integer) this.f13252e.put(obj, f13247o);
        if (num != null) {
            this.f13252e.put(obj, Integer.valueOf(num.intValue() + 1));
        }
        this.f13253f.put(obj, Boolean.TRUE);
        this.f13254g.remove(obj);
    }

    /* renamed from: z */
    public final void m13061z(Collection collection) {
        m13049k();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            m13060y(it.next());
        }
    }

    @Override // java.util.List
    public synchronized void add(int i10, Object obj) {
        m13060y(obj);
        this.f13251d.add(i10, obj);
    }

    @Override // java.util.List
    public synchronized boolean addAll(int i10, Collection collection) {
        m13061z(collection);
        return this.f13251d.addAll(i10, collection);
    }

    @Override // java.util.List
    public ListIterator listIterator(int i10) {
        m13048j();
        return this.f13251d.listIterator(i10);
    }

    @Override // java.util.List, java.util.Collection
    public Object[] toArray(Object[] objArr) {
        m13048j();
        return this.f13251d.toArray(objArr);
    }

    @Override // java.util.List, java.util.Collection
    public synchronized boolean remove(Object obj) {
        boolean zRemove;
        m13049k();
        zRemove = this.f13251d.remove(obj);
        if (zRemove) {
            m13045A(obj);
        }
        return zRemove;
    }
}
