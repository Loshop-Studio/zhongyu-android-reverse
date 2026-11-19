package io.objectbox.relation;

import io.objectbox.BoxStore;
import io.objectbox.C5696a;
import io.objectbox.Cursor;
import io.objectbox.Property;
import io.objectbox.annotation.apihint.Beta;
import io.objectbox.annotation.apihint.Experimental;
import io.objectbox.annotation.apihint.Internal;
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
import javax.annotation.Nonnull;
import p009a8.RunnableC0023a;
import p116m5.C6114f;
import p116m5.InterfaceC6110b;
import p131o5.InterfaceC6273c;

/* loaded from: classes3.dex */
public class ToMany<TARGET> implements List<TARGET>, Serializable {
    private static final long serialVersionUID = 2367317778240689006L;

    /* renamed from: a */
    public transient BoxStore f8982a;

    /* renamed from: b */
    public transient C5696a f8983b;

    /* renamed from: c */
    public volatile transient C5696a f8984c;

    /* renamed from: d */
    public transient boolean f8985d;

    /* renamed from: e */
    public transient Comparator f8986e;
    private List<TARGET> entities;
    private volatile Map<TARGET, Boolean> entitiesAdded;
    private Map<TARGET, Boolean> entitiesRemoved;
    List<TARGET> entitiesToPut;
    List<TARGET> entitiesToRemoveFromDb;
    private final Object entity;
    private Map<TARGET, Integer> entityCounts;
    private volatile ListFactory listFactory;
    private final RelationInfo<Object, TARGET> relationInfo;

    public ToMany(Object obj, RelationInfo<?, TARGET> relationInfo) {
        if (obj == null) {
            throw new IllegalArgumentException("No source entity given (null)");
        }
        if (relationInfo == null) {
            throw new IllegalArgumentException("No relation info given (null)");
        }
        this.entity = obj;
        this.relationInfo = relationInfo;
    }

    /* renamed from: a */
    public final void m5065a() {
        if (this.f8984c == null) {
            try {
                BoxStore boxStore = (BoxStore) C6114f.f9760b.m5808a(this.entity.getClass(), "__boxStore").get(this.entity);
                this.f8982a = boxStore;
                if (boxStore == null) {
                    throw new DbDetachedException("Cannot resolve relation for detached entities, call box.attach(entity) beforehand.");
                }
                this.f8983b = boxStore.m5018c(this.relationInfo.sourceInfo.getEntityClass());
                this.f8984c = this.f8982a.m5018c(this.relationInfo.targetInfo.getEntityClass());
            } catch (IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }
    }

    @Override // java.util.List, java.util.Collection
    public synchronized boolean add(TARGET target) {
        m5068d(target);
        return this.entities.add(target);
    }

    @Override // java.util.List
    public synchronized boolean addAll(int i, Collection<? extends TARGET> collection) {
        m5067c();
        Iterator<? extends TARGET> it = collection.iterator();
        while (it.hasNext()) {
            m5068d(it.next());
        }
        return this.entities.addAll(i, collection);
    }

    public void applyChangesToDb() {
        if (this.relationInfo.sourceInfo.getIdGetter().getId(this.entity) == 0) {
            throw new IllegalStateException("The source entity was not yet persisted (no ID), use box.put() on it instead");
        }
        try {
            m5065a();
            if (internalCheckApplyToDbRequired()) {
                this.f8982a.m5021h(new RunnableC0023a(this, 23));
            }
        } catch (DbDetachedException unused) {
            throw new IllegalStateException("The source entity was not yet persisted, use box.put() on it instead");
        }
    }

    /* renamed from: b */
    public final void m5066b() {
        C5696a c5696a;
        List<TARGET> relationEntities;
        if (this.entities == null) {
            long id = this.relationInfo.sourceInfo.getIdGetter().getId(this.entity);
            if (id == 0) {
                synchronized (this) {
                    try {
                        if (this.entities == null) {
                            this.entities = getListFactory().createList();
                        }
                    } finally {
                    }
                }
                return;
            }
            m5065a();
            RelationInfo<Object, TARGET> relationInfo = this.relationInfo;
            int i = relationInfo.relationId;
            if (i != 0) {
                try {
                    relationEntities = this.f8984c.m5032c().getRelationEntities(relationInfo.sourceInfo.getEntityId(), i, id, false);
                } finally {
                }
            } else if (relationInfo.targetIdProperty != null) {
                c5696a = this.f8984c;
                int entityId = this.relationInfo.targetInfo.getEntityId();
                Property<?> property = this.relationInfo.targetIdProperty;
                Cursor cursorM5032c = c5696a.m5032c();
                try {
                    relationEntities = cursorM5032c.getBacklinkEntities(entityId, property, id);
                    c5696a.m5037h(cursorM5032c);
                } finally {
                }
            } else {
                c5696a = this.f8984c;
                try {
                    relationEntities = c5696a.m5032c().getRelationEntities(this.relationInfo.targetInfo.getEntityId(), this.relationInfo.targetRelationId, id, true);
                } finally {
                }
            }
            Comparator comparator = this.f8986e;
            if (comparator != null) {
                Collections.sort(relationEntities, comparator);
            }
            synchronized (this) {
                try {
                    if (this.entities == null) {
                        this.entities = relationEntities;
                    }
                } finally {
                }
            }
        }
    }

    /* renamed from: c */
    public final void m5067c() {
        m5066b();
        if (this.entitiesAdded == null) {
            synchronized (this) {
                try {
                    if (this.entitiesAdded == null) {
                        this.entitiesAdded = new LinkedHashMap();
                        this.entitiesRemoved = new LinkedHashMap();
                        this.entityCounts = new HashMap();
                        for (TARGET target : this.entities) {
                            Integer numPut = this.entityCounts.put(target, 1);
                            if (numPut != null) {
                                this.entityCounts.put(target, Integer.valueOf(numPut.intValue() + 1));
                            }
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Override // java.util.List, java.util.Collection
    public synchronized void clear() {
        try {
            m5067c();
            List<TARGET> list = this.entities;
            if (list != null) {
                Iterator<TARGET> it = list.iterator();
                while (it.hasNext()) {
                    this.entitiesRemoved.put(it.next(), Boolean.TRUE);
                }
                list.clear();
            }
            Map<TARGET, Boolean> map = this.entitiesAdded;
            if (map != null) {
                map.clear();
            }
            Map<TARGET, Integer> map2 = this.entityCounts;
            if (map2 != null) {
                map2.clear();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // java.util.List, java.util.Collection
    public boolean contains(Object obj) {
        m5066b();
        return this.entities.contains(obj);
    }

    @Override // java.util.List, java.util.Collection
    public boolean containsAll(Collection<?> collection) {
        m5066b();
        return this.entities.containsAll(collection);
    }

    /* renamed from: d */
    public final void m5068d(Object obj) {
        m5067c();
        Integer numPut = this.entityCounts.put(obj, 1);
        if (numPut != null) {
            this.entityCounts.put(obj, Integer.valueOf(numPut.intValue() + 1));
        }
        this.entitiesAdded.put(obj, Boolean.TRUE);
        this.entitiesRemoved.remove(obj);
    }

    /* renamed from: e */
    public final void m5069e(Object obj) {
        m5067c();
        Integer numRemove = this.entityCounts.remove(obj);
        if (numRemove != null) {
            if (numRemove.intValue() == 1) {
                this.entityCounts.remove(obj);
                this.entitiesAdded.remove(obj);
                this.entitiesRemoved.put(obj, Boolean.TRUE);
            } else if (numRemove.intValue() > 1) {
                this.entityCounts.put(obj, Integer.valueOf(numRemove.intValue() - 1));
            } else {
                throw new IllegalStateException("Illegal count: " + numRemove);
            }
        }
    }

    @Override // java.util.List
    public TARGET get(int i) {
        m5066b();
        return this.entities.get(i);
    }

    public int getAddCount() {
        Map<TARGET, Boolean> map = this.entitiesAdded;
        if (map != null) {
            return map.size();
        }
        return 0;
    }

    @Beta
    public TARGET getById(long j7) {
        m5066b();
        Object[] array = this.entities.toArray();
        InterfaceC6110b idGetter = this.relationInfo.targetInfo.getIdGetter();
        for (Object obj : array) {
            TARGET target = (TARGET) obj;
            if (idGetter.getId(target) == j7) {
                return target;
            }
        }
        return null;
    }

    public Object getEntity() {
        return this.entity;
    }

    public ListFactory getListFactory() {
        ListFactory copyOnWriteArrayListFactory;
        ListFactory listFactory = this.listFactory;
        if (listFactory != null) {
            return listFactory;
        }
        synchronized (this) {
            try {
                copyOnWriteArrayListFactory = this.listFactory;
                if (copyOnWriteArrayListFactory == null) {
                    copyOnWriteArrayListFactory = new ListFactory.CopyOnWriteArrayListFactory();
                    this.listFactory = copyOnWriteArrayListFactory;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return copyOnWriteArrayListFactory;
    }

    public int getRemoveCount() {
        Map<TARGET, Boolean> map = this.entitiesRemoved;
        if (map != null) {
            return map.size();
        }
        return 0;
    }

    @Beta
    public boolean hasA(InterfaceC6273c interfaceC6273c) {
        for (Object obj : toArray()) {
            if (interfaceC6273c.m5871a()) {
                return true;
            }
        }
        return false;
    }

    @Beta
    public boolean hasAll(InterfaceC6273c interfaceC6273c) {
        Object[] array = toArray();
        if (array.length != 0) {
            for (Object obj : array) {
                if (interfaceC6273c.m5871a()) {
                }
            }
            return true;
        }
        return false;
    }

    public boolean hasPendingDbChanges() {
        Map<TARGET, Boolean> map = this.entitiesAdded;
        if (map != null && !map.isEmpty()) {
            return true;
        }
        Map<TARGET, Boolean> map2 = this.entitiesRemoved;
        return (map2 == null || map2.isEmpty()) ? false : true;
    }

    @Override // java.util.List
    public int indexOf(Object obj) {
        m5066b();
        return this.entities.indexOf(obj);
    }

    @Beta
    public int indexOfId(long j7) {
        m5066b();
        Object[] array = this.entities.toArray();
        InterfaceC6110b idGetter = this.relationInfo.targetInfo.getIdGetter();
        int i = 0;
        for (Object obj : array) {
            if (idGetter.getId(obj) == j7) {
                return i;
            }
            i++;
        }
        return -1;
    }

    @Internal
    public void internalApplyToDb(Cursor<?> cursor, Cursor<TARGET> cursor2) {
        Object[] array;
        Object[] array2;
        ArrayList arrayList;
        Object[] array3;
        RelationInfo<Object, TARGET> relationInfo = this.relationInfo;
        boolean z8 = relationInfo.relationId != 0;
        InterfaceC6110b idGetter = relationInfo.targetInfo.getIdGetter();
        synchronized (this) {
            array = null;
            if (z8) {
                try {
                    for (TARGET target : this.entitiesAdded.keySet()) {
                        if (idGetter.getId(target) == 0) {
                            this.entitiesToPut.add(target);
                        }
                    }
                    if (this.f8985d) {
                        this.entitiesToRemoveFromDb.addAll(this.entitiesRemoved.keySet());
                    }
                    if (this.entitiesAdded.isEmpty()) {
                        array2 = null;
                    } else {
                        array2 = this.entitiesAdded.keySet().toArray();
                        this.entitiesAdded.clear();
                    }
                    if (this.entitiesRemoved.isEmpty()) {
                        arrayList = null;
                    } else {
                        arrayList = new ArrayList(this.entitiesRemoved.keySet());
                        this.entitiesRemoved.clear();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            } else {
                array2 = null;
                arrayList = null;
            }
            array3 = this.entitiesToRemoveFromDb.isEmpty() ? null : this.entitiesToRemoveFromDb.toArray();
            this.entitiesToRemoveFromDb.clear();
            if (!this.entitiesToPut.isEmpty()) {
                array = this.entitiesToPut.toArray();
            }
            this.entitiesToPut.clear();
        }
        if (array3 != null) {
            for (Object obj : array3) {
                long id = idGetter.getId(obj);
                if (id != 0) {
                    cursor2.deleteEntity(id);
                }
            }
        }
        if (array != null) {
            for (Object obj2 : array) {
                cursor2.put(obj2);
            }
        }
        if (z8) {
            long id2 = this.relationInfo.sourceInfo.getIdGetter().getId(this.entity);
            if (id2 == 0) {
                throw new IllegalStateException("Source entity has no ID (should have been put before)");
            }
            if (arrayList != null) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    if (idGetter.getId(it.next()) == 0) {
                        it.remove();
                    }
                }
                int size = arrayList.size();
                if (size > 0) {
                    long[] jArr = new long[size];
                    for (int i = 0; i < size; i++) {
                        jArr[i] = idGetter.getId(arrayList.get(i));
                    }
                    cursor.modifyRelations(this.relationInfo.relationId, id2, jArr, true);
                }
            }
            if (array2 != null) {
                int length = array2.length;
                long[] jArr2 = new long[length];
                for (int i8 = 0; i8 < length; i8++) {
                    long id3 = idGetter.getId(array2[i8]);
                    if (id3 == 0) {
                        throw new IllegalStateException("Target entity has no ID (should have been put before)");
                    }
                    jArr2[i8] = id3;
                }
                cursor.modifyRelations(this.relationInfo.relationId, id2, jArr2, false);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Internal
    public boolean internalCheckApplyToDbRequired() {
        boolean z8;
        if (!hasPendingDbChanges()) {
            return false;
        }
        synchronized (this) {
            try {
                if (this.entitiesToPut == null) {
                    this.entitiesToPut = new ArrayList();
                    this.entitiesToRemoveFromDb = new ArrayList();
                }
            } finally {
            }
        }
        RelationInfo<Object, TARGET> relationInfo = this.relationInfo;
        if (relationInfo.relationId != 0) {
            return true;
        }
        long id = relationInfo.sourceInfo.getIdGetter().getId(this.entity);
        if (id == 0) {
            throw new IllegalStateException("Source entity has no ID (should have been put before)");
        }
        InterfaceC6110b idGetter = this.relationInfo.targetInfo.getIdGetter();
        Map<TARGET, Boolean> map = this.entitiesAdded;
        Map<TARGET, Boolean> map2 = this.entitiesRemoved;
        RelationInfo<Object, TARGET> relationInfo2 = this.relationInfo;
        if (relationInfo2.targetRelationId != 0) {
            ToManyGetter<TARGET> toManyGetter = relationInfo2.backlinkToManyGetter;
            synchronized (this) {
                if (map != null) {
                    try {
                        if (!map.isEmpty()) {
                            for (TARGET target : map.keySet()) {
                                ToMany toMany = (ToMany) toManyGetter.getToMany(target);
                                if (toMany == 0) {
                                    throw new IllegalStateException("The ToMany property for " + this.relationInfo.targetInfo.getEntityName() + " is null");
                                }
                                if (toMany.getById(id) == null) {
                                    toMany.add(this.entity);
                                    this.entitiesToPut.add(target);
                                } else if (idGetter.getId(target) == 0) {
                                    this.entitiesToPut.add(target);
                                }
                            }
                            map.clear();
                        }
                    } finally {
                    }
                }
                if (map2 != null) {
                    for (TARGET target2 : map2.keySet()) {
                        ToMany toMany2 = (ToMany) toManyGetter.getToMany(target2);
                        if (toMany2.getById(id) != null) {
                            toMany2.removeById(id);
                            if (idGetter.getId(target2) != 0) {
                                if (this.f8985d) {
                                    this.entitiesToRemoveFromDb.add(target2);
                                } else {
                                    this.entitiesToPut.add(target2);
                                }
                            }
                        }
                    }
                    map2.clear();
                }
                z8 = (this.entitiesToPut.isEmpty() && this.entitiesToRemoveFromDb.isEmpty()) ? false : true;
            }
            return z8;
        }
        ToOneGetter<TARGET> toOneGetter = relationInfo2.backlinkToOneGetter;
        synchronized (this) {
            if (map != null) {
                try {
                    if (!map.isEmpty()) {
                        for (TARGET target3 : map.keySet()) {
                            ToOne<TARGET> toOne = toOneGetter.getToOne(target3);
                            if (toOne == 0) {
                                throw new IllegalStateException("The ToOne property for " + this.relationInfo.targetInfo.getEntityName() + "." + this.relationInfo.targetIdProperty.name + " is null");
                            }
                            if (toOne.getTargetId() != id) {
                                toOne.setTarget(this.entity);
                                this.entitiesToPut.add(target3);
                            } else if (idGetter.getId(target3) == 0) {
                                this.entitiesToPut.add(target3);
                            }
                        }
                        map.clear();
                    }
                } finally {
                }
            }
            if (map2 != null) {
                for (TARGET target4 : map2.keySet()) {
                    ToOne<TARGET> toOne2 = toOneGetter.getToOne(target4);
                    if (toOne2.getTargetId() == id) {
                        toOne2.setTarget(null);
                        if (idGetter.getId(target4) != 0) {
                            if (this.f8985d) {
                                this.entitiesToRemoveFromDb.add(target4);
                            } else {
                                this.entitiesToPut.add(target4);
                            }
                        }
                    }
                }
                map2.clear();
            }
            z8 = (this.entitiesToPut.isEmpty() && this.entitiesToRemoveFromDb.isEmpty()) ? false : true;
        }
        return z8;
    }

    @Override // java.util.List, java.util.Collection
    public boolean isEmpty() {
        m5066b();
        return this.entities.isEmpty();
    }

    public boolean isResolved() {
        return this.entities != null;
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    @Nonnull
    public Iterator<TARGET> iterator() {
        m5066b();
        return this.entities.iterator();
    }

    @Override // java.util.List
    public int lastIndexOf(Object obj) {
        m5066b();
        return this.entities.lastIndexOf(obj);
    }

    @Override // java.util.List
    @Nonnull
    public ListIterator<TARGET> listIterator() {
        m5066b();
        return this.entities.listIterator();
    }

    @Override // java.util.List
    public synchronized TARGET remove(int i) {
        TARGET targetRemove;
        m5067c();
        targetRemove = this.entities.remove(i);
        m5069e(targetRemove);
        return targetRemove;
    }

    @Override // java.util.List, java.util.Collection
    public synchronized boolean removeAll(Collection<?> collection) {
        boolean zRemove;
        Iterator<?> it = collection.iterator();
        zRemove = false;
        while (it.hasNext()) {
            zRemove |= remove(it.next());
        }
        return zRemove;
    }

    public synchronized TARGET removeById(long j7) {
        m5066b();
        int size = this.entities.size();
        InterfaceC6110b idGetter = this.relationInfo.targetInfo.getIdGetter();
        for (int i = 0; i < size; i++) {
            TARGET target = this.entities.get(i);
            if (idGetter.getId(target) == j7) {
                TARGET targetRemove = remove(i);
                if (targetRemove == target) {
                    return target;
                }
                throw new IllegalStateException("Mismatch: " + targetRemove + " vs. " + target);
            }
        }
        return null;
    }

    public synchronized void reset() {
        this.entities = null;
        this.entitiesAdded = null;
        this.entitiesRemoved = null;
        this.entitiesToRemoveFromDb = null;
        this.entitiesToPut = null;
        this.entityCounts = null;
    }

    @Override // java.util.List, java.util.Collection
    public synchronized boolean retainAll(Collection<?> collection) {
        boolean z8;
        try {
            m5067c();
            z8 = false;
            ArrayList arrayList = null;
            for (TARGET target : this.entities) {
                if (!collection.contains(target)) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(target);
                    z8 = true;
                }
            }
            if (arrayList != null) {
                removeAll(arrayList);
            }
        } catch (Throwable th) {
            throw th;
        }
        return z8;
    }

    @Override // java.util.List
    public synchronized TARGET set(int i, TARGET target) {
        TARGET target2;
        m5067c();
        target2 = this.entities.set(i, target);
        m5069e(target2);
        m5068d(target);
        return target2;
    }

    @Experimental
    public void setComparator(Comparator<TARGET> comparator) {
        this.f8986e = comparator;
    }

    @Experimental
    public void setListFactory(ListFactory listFactory) {
        if (listFactory == null) {
            throw new IllegalArgumentException("ListFactory is null");
        }
        this.listFactory = listFactory;
    }

    @Experimental
    public synchronized void setRemoveFromTargetBox(boolean z8) {
        this.f8985d = z8;
    }

    @Override // java.util.List, java.util.Collection
    public int size() {
        m5066b();
        return this.entities.size();
    }

    public void sortById() {
        m5066b();
        List<TARGET> list = this.entities;
        C5703a c5703a = new C5703a();
        c5703a.f8991a = this.relationInfo.targetInfo.getIdGetter();
        Collections.sort(list, c5703a);
    }

    @Override // java.util.List
    @Nonnull
    public List<TARGET> subList(int i, int i8) {
        m5066b();
        return this.entities.subList(i, i8);
    }

    @Override // java.util.List, java.util.Collection
    @Nonnull
    public Object[] toArray() {
        m5066b();
        return this.entities.toArray();
    }

    @Override // java.util.List
    public synchronized void add(int i, TARGET target) {
        m5068d(target);
        this.entities.add(i, target);
    }

    @Override // java.util.List
    @Nonnull
    public ListIterator<TARGET> listIterator(int i) {
        m5066b();
        return this.entities.listIterator(i);
    }

    @Override // java.util.List, java.util.Collection
    @Nonnull
    public <T> T[] toArray(T[] tArr) {
        m5066b();
        return (T[]) this.entities.toArray(tArr);
    }

    @Override // java.util.List, java.util.Collection
    public synchronized boolean addAll(Collection<? extends TARGET> collection) {
        m5067c();
        Iterator<? extends TARGET> it = collection.iterator();
        while (it.hasNext()) {
            m5068d(it.next());
        }
        return this.entities.addAll(collection);
    }

    @Override // java.util.List, java.util.Collection
    public synchronized boolean remove(Object obj) {
        boolean zRemove;
        m5067c();
        zRemove = this.entities.remove(obj);
        if (zRemove) {
            m5069e(obj);
        }
        return zRemove;
    }
}
