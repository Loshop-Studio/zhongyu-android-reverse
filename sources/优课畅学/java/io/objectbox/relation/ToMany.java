package io.objectbox.relation;

import io.objectbox.BoxStore;
import io.objectbox.C8957a;
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
import p189n6.C9433f;
import p189n6.InterfaceC9430c;

/* loaded from: classes5.dex */
public class ToMany<TARGET> implements List<TARGET>, Serializable {

    /* renamed from: o */
    public static final Integer f16992o = 1;

    /* renamed from: a */
    public final Object f16993a;

    /* renamed from: b */
    public final RelationInfo f16994b;

    /* renamed from: c */
    public volatile ListFactory f16995c;

    /* renamed from: d */
    public List f16996d;

    /* renamed from: e */
    public Map f16997e;

    /* renamed from: f */
    public volatile Map f16998f;

    /* renamed from: g */
    public Map f16999g;

    /* renamed from: h */
    public List f17000h;

    /* renamed from: i */
    public List f17001i;

    /* renamed from: j */
    public transient BoxStore f17002j;

    /* renamed from: k */
    public transient C8957a f17003k;

    /* renamed from: l */
    public volatile transient C8957a f17004l;

    /* renamed from: m */
    public transient boolean f17005m;

    /* renamed from: n */
    public transient Comparator f17006n;

    public ToMany(Object obj, RelationInfo relationInfo) {
        if (obj == null) {
            throw new IllegalArgumentException("No source entity given (null)");
        }
        if (relationInfo == null) {
            throw new IllegalArgumentException("No relation info given (null)");
        }
        this.f16993a = obj;
        this.f16994b = relationInfo;
    }

    /* renamed from: a */
    public final void m15492a(Cursor cursor, long j10, Object[] objArr, InterfaceC9430c interfaceC9430c) {
        int length = objArr.length;
        long[] jArr = new long[length];
        for (int i10 = 0; i10 < length; i10++) {
            long id = interfaceC9430c.getId(objArr[i10]);
            if (id == 0) {
                throw new IllegalStateException("Target entity has no ID (should have been put before)");
            }
            jArr[i10] = id;
        }
        cursor.modifyRelations(this.f16994b.f16991i, j10, jArr, false);
    }

    @Override // java.util.List, java.util.Collection
    public synchronized boolean add(Object obj) {
        m15506p(obj);
        return this.f16996d.add(obj);
    }

    @Override // java.util.List, java.util.Collection
    public synchronized boolean addAll(Collection collection) {
        m15507q(collection);
        return this.f16996d.addAll(collection);
    }

    /* renamed from: b */
    public final void m15493b() {
        if (this.f17004l == null) {
            try {
                BoxStore boxStore = (BoxStore) C9433f.m17289b().m17290a(this.f16993a.getClass(), "__boxStore").get(this.f16993a);
                this.f17002j = boxStore;
                if (boxStore == null) {
                    throw new DbDetachedException("Cannot resolve relation for detached entities, call box.attach(entity) beforehand.");
                }
                this.f17003k = boxStore.m15370d(this.f16994b.f16983a.getEntityClass());
                this.f17004l = this.f17002j.m15370d(this.f16994b.f16984b.getEntityClass());
            } catch (IllegalAccessException e10) {
                throw new RuntimeException(e10);
            }
        }
    }

    /* renamed from: c */
    public final void m15494c() {
        if (this.f16996d == null) {
            long id = this.f16994b.f16983a.getIdGetter().getId(this.f16993a);
            if (id == 0) {
                synchronized (this) {
                    try {
                        if (this.f16996d == null) {
                            this.f16996d = m15497g().mo15491f();
                        }
                    } finally {
                    }
                }
                return;
            }
            m15493b();
            RelationInfo relationInfo = this.f16994b;
            int i10 = relationInfo.f16991i;
            List listM15413k = i10 != 0 ? this.f17004l.m15413k(relationInfo.f16983a.getEntityId(), i10, id, false) : relationInfo.f16985c != null ? this.f17004l.m15412j(this.f16994b.f16984b.getEntityId(), this.f16994b.f16985c, id) : this.f17004l.m15413k(this.f16994b.f16984b.getEntityId(), this.f16994b.f16986d, id, true);
            Comparator comparator = this.f17006n;
            if (comparator != null) {
                Collections.sort(listM15413k, comparator);
            }
            synchronized (this) {
                try {
                    if (this.f16996d == null) {
                        this.f16996d = listM15413k;
                    }
                } finally {
                }
            }
        }
    }

    @Override // java.util.List, java.util.Collection
    public synchronized void clear() {
        try {
            m15495d();
            List list = this.f16996d;
            if (list != null) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    this.f16999g.put(it.next(), Boolean.TRUE);
                }
                list.clear();
            }
            Map map = this.f16998f;
            if (map != null) {
                map.clear();
            }
            Map map2 = this.f16997e;
            if (map2 != null) {
                map2.clear();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // java.util.List, java.util.Collection
    public boolean contains(Object obj) {
        m15494c();
        return this.f16996d.contains(obj);
    }

    @Override // java.util.List, java.util.Collection
    public boolean containsAll(Collection collection) {
        m15494c();
        return this.f16996d.containsAll(collection);
    }

    /* renamed from: d */
    public final void m15495d() {
        m15494c();
        if (this.f16998f == null) {
            synchronized (this) {
                try {
                    if (this.f16998f == null) {
                        this.f16998f = new LinkedHashMap();
                        this.f16999g = new LinkedHashMap();
                        this.f16997e = new HashMap();
                        for (Object obj : this.f16996d) {
                            Integer num = (Integer) this.f16997e.put(obj, f16992o);
                            if (num != null) {
                                this.f16997e.put(obj, Integer.valueOf(num.intValue() + 1));
                            }
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    /* renamed from: e */
    public Object m15496e(long j10) {
        m15494c();
        Object[] array = this.f16996d.toArray();
        InterfaceC9430c idGetter = this.f16994b.f16984b.getIdGetter();
        for (Object obj : array) {
            if (idGetter.getId(obj) == j10) {
                return obj;
            }
        }
        return null;
    }

    /* renamed from: g */
    public ListFactory m15497g() {
        ListFactory copyOnWriteArrayListFactory;
        ListFactory listFactory = this.f16995c;
        if (listFactory != null) {
            return listFactory;
        }
        synchronized (this) {
            try {
                copyOnWriteArrayListFactory = this.f16995c;
                if (copyOnWriteArrayListFactory == null) {
                    copyOnWriteArrayListFactory = new ListFactory.CopyOnWriteArrayListFactory();
                    this.f16995c = copyOnWriteArrayListFactory;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return copyOnWriteArrayListFactory;
    }

    @Override // java.util.List
    public Object get(int i10) {
        m15494c();
        return this.f16996d.get(i10);
    }

    /* renamed from: h */
    public boolean m15498h() {
        Map map = this.f16998f;
        if (map != null && !map.isEmpty()) {
            return true;
        }
        Map map2 = this.f16999g;
        return (map2 == null || map2.isEmpty()) ? false : true;
    }

    /* renamed from: i */
    public int m15499i(long j10) {
        m15494c();
        Object[] array = this.f16996d.toArray();
        InterfaceC9430c idGetter = this.f16994b.f16984b.getIdGetter();
        int i10 = 0;
        for (Object obj : array) {
            if (idGetter.getId(obj) == j10) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    @Override // java.util.List
    public int indexOf(Object obj) {
        m15494c();
        return this.f16996d.indexOf(obj);
    }

    @Override // java.util.List, java.util.Collection
    public boolean isEmpty() {
        m15494c();
        return this.f16996d.isEmpty();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        m15494c();
        return this.f16996d.iterator();
    }

    /* renamed from: j */
    public void m15500j(Cursor cursor, Cursor cursor2) {
        Object[] array;
        Object[] array2;
        Object[] objArr;
        ArrayList arrayList;
        Object[] array3;
        RelationInfo relationInfo = this.f16994b;
        boolean z10 = relationInfo.f16991i != 0;
        InterfaceC9430c idGetter = relationInfo.f16984b.getIdGetter();
        synchronized (this) {
            array = null;
            if (z10) {
                try {
                    for (Object obj : this.f16998f.keySet()) {
                        if (idGetter.getId(obj) == 0) {
                            this.f17000h.add(obj);
                        }
                    }
                    if (this.f17005m) {
                        this.f17001i.addAll(this.f16999g.keySet());
                    }
                    if (this.f16998f.isEmpty()) {
                        array2 = null;
                    } else {
                        array2 = this.f16998f.keySet().toArray();
                        this.f16998f.clear();
                    }
                    if (this.f16999g.isEmpty()) {
                        objArr = array2;
                        arrayList = null;
                    } else {
                        ArrayList arrayList2 = new ArrayList(this.f16999g.keySet());
                        this.f16999g.clear();
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
            array3 = this.f17001i.isEmpty() ? null : this.f17001i.toArray();
            this.f17001i.clear();
            if (!this.f17000h.isEmpty()) {
                array = this.f17000h.toArray();
            }
            this.f17000h.clear();
        }
        if (array3 != null) {
            for (Object obj2 : array3) {
                long id = idGetter.getId(obj2);
                if (id != 0) {
                    cursor2.deleteEntity(id);
                }
            }
        }
        if (array != null) {
            for (Object obj3 : array) {
                cursor2.put(obj3);
            }
        }
        if (z10) {
            long id2 = this.f16994b.f16983a.getIdGetter().getId(this.f16993a);
            if (id2 == 0) {
                throw new IllegalStateException("Source entity has no ID (should have been put before)");
            }
            if (arrayList != null) {
                m15505o(cursor, id2, arrayList, idGetter);
            }
            if (objArr != null) {
                m15492a(cursor, id2, objArr, idGetter);
            }
        }
    }

    /* renamed from: k */
    public boolean m15501k() throws Throwable {
        if (!m15498h()) {
            return false;
        }
        synchronized (this) {
            try {
                if (this.f17000h == null) {
                    this.f17000h = new ArrayList();
                    this.f17001i = new ArrayList();
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
        RelationInfo relationInfo = this.f16994b;
        if (relationInfo.f16991i != 0) {
            return true;
        }
        long id = relationInfo.f16983a.getIdGetter().getId(this.f16993a);
        if (id == 0) {
            throw new IllegalStateException("Source entity has no ID (should have been put before)");
        }
        InterfaceC9430c idGetter = this.f16994b.f16984b.getIdGetter();
        Map map = this.f16998f;
        Map map2 = this.f16999g;
        return this.f16994b.f16986d != 0 ? m15502l(id, idGetter, map, map2) : m15503m(id, idGetter, map, map2);
    }

    /* renamed from: l */
    public final boolean m15502l(long j10, InterfaceC9430c interfaceC9430c, Map map, Map map2) {
        boolean z10;
        ToManyGetter toManyGetter = this.f16994b.f16990h;
        synchronized (this) {
            if (map != null) {
                try {
                    if (!map.isEmpty()) {
                        for (Object obj : map.keySet()) {
                            ToMany toMany = (ToMany) toManyGetter.getToMany(obj);
                            if (toMany == null) {
                                throw new IllegalStateException("The ToMany property for " + this.f16994b.f16984b.getEntityName() + " is null");
                            }
                            if (toMany.m15496e(j10) == null) {
                                toMany.add(this.f16993a);
                                this.f17000h.add(obj);
                            } else if (interfaceC9430c.getId(obj) == 0) {
                                this.f17000h.add(obj);
                            }
                        }
                        map.clear();
                    }
                } finally {
                }
            }
            if (map2 != null) {
                for (Object obj2 : map2.keySet()) {
                    ToMany toMany2 = (ToMany) toManyGetter.getToMany(obj2);
                    if (toMany2.m15496e(j10) != null) {
                        toMany2.m15504n(j10);
                        if (interfaceC9430c.getId(obj2) != 0) {
                            if (this.f17005m) {
                                this.f17001i.add(obj2);
                            } else {
                                this.f17000h.add(obj2);
                            }
                        }
                    }
                }
                map2.clear();
            }
            z10 = (this.f17000h.isEmpty() && this.f17001i.isEmpty()) ? false : true;
        }
        return z10;
    }

    @Override // java.util.List
    public int lastIndexOf(Object obj) {
        m15494c();
        return this.f16996d.lastIndexOf(obj);
    }

    @Override // java.util.List
    public ListIterator listIterator() {
        m15494c();
        return this.f16996d.listIterator();
    }

    /* renamed from: m */
    public final boolean m15503m(long j10, InterfaceC9430c interfaceC9430c, Map map, Map map2) {
        boolean z10;
        ToOneGetter toOneGetter = this.f16994b.f16989g;
        synchronized (this) {
            if (map != null) {
                try {
                    if (!map.isEmpty()) {
                        for (Object obj : map.keySet()) {
                            ToOne toOne = toOneGetter.getToOne(obj);
                            if (toOne == null) {
                                throw new IllegalStateException("The ToOne property for " + this.f16994b.f16984b.getEntityName() + "." + this.f16994b.f16985c.f16874e + " is null");
                            }
                            if (toOne.m15513e() != j10) {
                                toOne.m15518k(this.f16993a);
                                this.f17000h.add(obj);
                            } else if (interfaceC9430c.getId(obj) == 0) {
                                this.f17000h.add(obj);
                            }
                        }
                        map.clear();
                    }
                } finally {
                }
            }
            if (map2 != null) {
                for (Object obj2 : map2.keySet()) {
                    ToOne toOne2 = toOneGetter.getToOne(obj2);
                    if (toOne2.m15513e() == j10) {
                        toOne2.m15518k(null);
                        if (interfaceC9430c.getId(obj2) != 0) {
                            if (this.f17005m) {
                                this.f17001i.add(obj2);
                            } else {
                                this.f17000h.add(obj2);
                            }
                        }
                    }
                }
                map2.clear();
            }
            z10 = (this.f17000h.isEmpty() && this.f17001i.isEmpty()) ? false : true;
        }
        return z10;
    }

    /* renamed from: n */
    public synchronized Object m15504n(long j10) {
        m15494c();
        int size = this.f16996d.size();
        InterfaceC9430c idGetter = this.f16994b.f16984b.getIdGetter();
        for (int i10 = 0; i10 < size; i10++) {
            Object obj = this.f16996d.get(i10);
            if (idGetter.getId(obj) == j10) {
                Object objRemove = remove(i10);
                if (objRemove == obj) {
                    return obj;
                }
                throw new IllegalStateException("Mismatch: " + objRemove + " vs. " + obj);
            }
        }
        return null;
    }

    /* renamed from: o */
    public final void m15505o(Cursor cursor, long j10, List list, InterfaceC9430c interfaceC9430c) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (interfaceC9430c.getId(it.next()) == 0) {
                it.remove();
            }
        }
        int size = list.size();
        if (size > 0) {
            long[] jArr = new long[size];
            for (int i10 = 0; i10 < size; i10++) {
                jArr[i10] = interfaceC9430c.getId(list.get(i10));
            }
            cursor.modifyRelations(this.f16994b.f16991i, j10, jArr, true);
        }
    }

    /* renamed from: p */
    public final void m15506p(Object obj) {
        m15495d();
        Integer num = (Integer) this.f16997e.put(obj, f16992o);
        if (num != null) {
            this.f16997e.put(obj, Integer.valueOf(num.intValue() + 1));
        }
        this.f16998f.put(obj, Boolean.TRUE);
        this.f16999g.remove(obj);
    }

    /* renamed from: q */
    public final void m15507q(Collection collection) {
        m15495d();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            m15506p(it.next());
        }
    }

    /* renamed from: r */
    public final void m15508r(Object obj) {
        m15495d();
        Integer num = (Integer) this.f16997e.remove(obj);
        if (num != null) {
            if (num.intValue() == 1) {
                this.f16997e.remove(obj);
                this.f16998f.remove(obj);
                this.f16999g.put(obj, Boolean.TRUE);
            } else {
                if (num.intValue() > 1) {
                    this.f16997e.put(obj, Integer.valueOf(num.intValue() - 1));
                    return;
                }
                throw new IllegalStateException("Illegal count: " + num);
            }
        }
    }

    @Override // java.util.List
    public synchronized Object remove(int i10) {
        Object objRemove;
        m15495d();
        objRemove = this.f16996d.remove(i10);
        m15508r(objRemove);
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
            m15495d();
            z10 = false;
            ArrayList arrayList = null;
            for (Object obj : this.f16996d) {
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
        m15495d();
        obj2 = this.f16996d.set(i10, obj);
        m15508r(obj2);
        m15506p(obj);
        return obj2;
    }

    @Override // java.util.List, java.util.Collection
    public int size() {
        m15494c();
        return this.f16996d.size();
    }

    @Override // java.util.List
    public List subList(int i10, int i11) {
        m15494c();
        return this.f16996d.subList(i10, i11);
    }

    @Override // java.util.List, java.util.Collection
    public Object[] toArray() {
        m15494c();
        return this.f16996d.toArray();
    }

    @Override // java.util.List
    public synchronized void add(int i10, Object obj) {
        m15506p(obj);
        this.f16996d.add(i10, obj);
    }

    @Override // java.util.List
    public synchronized boolean addAll(int i10, Collection collection) {
        m15507q(collection);
        return this.f16996d.addAll(i10, collection);
    }

    @Override // java.util.List
    public ListIterator listIterator(int i10) {
        m15494c();
        return this.f16996d.listIterator(i10);
    }

    @Override // java.util.List, java.util.Collection
    public Object[] toArray(Object[] objArr) {
        m15494c();
        return this.f16996d.toArray(objArr);
    }

    @Override // java.util.List, java.util.Collection
    public synchronized boolean remove(Object obj) {
        boolean zRemove;
        m15495d();
        zRemove = this.f16996d.remove(obj);
        if (zRemove) {
            m15508r(obj);
        }
        return zRemove;
    }
}
