package kotlin.collections.builders;

import id.InterfaceC9624a;
import id.InterfaceC9627d;
import java.io.InvalidObjectException;
import java.io.NotSerializableException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;
import p325rc.AbstractC10940d;
import p325rc.AbstractC10948h;
import p325rc.AbstractC10964p;
import p325rc.AbstractC10976v;
import sc.AbstractC11088b;

/* loaded from: classes6.dex */
public final class ListBuilder<E> extends AbstractC10948h implements List<E>, RandomAccess, Serializable, InterfaceC9627d {

    /* renamed from: f */
    public static final C9927a f23296f = new C9927a(null);

    /* renamed from: g */
    public static final ListBuilder f23297g;

    /* renamed from: c */
    public Object[] f23298c;

    /* renamed from: d */
    public int f23299d;

    /* renamed from: e */
    public boolean f23300e;

    public static final class BuilderSubList<E> extends AbstractC10948h implements List<E>, RandomAccess, Serializable, InterfaceC9627d {

        /* renamed from: c */
        public Object[] f23301c;

        /* renamed from: d */
        public final int f23302d;

        /* renamed from: e */
        public int f23303e;

        /* renamed from: f */
        public final BuilderSubList f23304f;

        /* renamed from: g */
        public final ListBuilder f23305g;

        /* renamed from: kotlin.collections.builders.ListBuilder$BuilderSubList$a */
        public static final class C9926a implements ListIterator, InterfaceC9624a {

            /* renamed from: c */
            public final BuilderSubList f23306c;

            /* renamed from: d */
            public int f23307d;

            /* renamed from: e */
            public int f23308e;

            /* renamed from: f */
            public int f23309f;

            public C9926a(BuilderSubList list, int i10) {
                AbstractC9979u.m20294g(list, "list");
                this.f23306c = list;
                this.f23307d = i10;
                this.f23308e = -1;
                this.f23309f = ((AbstractList) list).modCount;
            }

            /* renamed from: a */
            public final void m20141a() {
                if (((AbstractList) this.f23306c.f23305g).modCount != this.f23309f) {
                    throw new ConcurrentModificationException();
                }
            }

            @Override // java.util.ListIterator
            public void add(Object obj) {
                m20141a();
                BuilderSubList builderSubList = this.f23306c;
                int i10 = this.f23307d;
                this.f23307d = i10 + 1;
                builderSubList.add(i10, obj);
                this.f23308e = -1;
                this.f23309f = ((AbstractList) this.f23306c).modCount;
            }

            @Override // java.util.ListIterator, java.util.Iterator
            public boolean hasNext() {
                return this.f23307d < this.f23306c.f23303e;
            }

            @Override // java.util.ListIterator
            public boolean hasPrevious() {
                return this.f23307d > 0;
            }

            @Override // java.util.ListIterator, java.util.Iterator
            public Object next() {
                m20141a();
                if (this.f23307d >= this.f23306c.f23303e) {
                    throw new NoSuchElementException();
                }
                int i10 = this.f23307d;
                this.f23307d = i10 + 1;
                this.f23308e = i10;
                return this.f23306c.f23301c[this.f23306c.f23302d + this.f23308e];
            }

            @Override // java.util.ListIterator
            public int nextIndex() {
                return this.f23307d;
            }

            @Override // java.util.ListIterator
            public Object previous() {
                m20141a();
                int i10 = this.f23307d;
                if (i10 <= 0) {
                    throw new NoSuchElementException();
                }
                int i11 = i10 - 1;
                this.f23307d = i11;
                this.f23308e = i11;
                return this.f23306c.f23301c[this.f23306c.f23302d + this.f23308e];
            }

            @Override // java.util.ListIterator
            public int previousIndex() {
                return this.f23307d - 1;
            }

            @Override // java.util.ListIterator, java.util.Iterator
            public void remove() {
                m20141a();
                int i10 = this.f23308e;
                if (i10 == -1) {
                    throw new IllegalStateException("Call next() or previous() before removing element from the iterator.");
                }
                this.f23306c.removeAt(i10);
                this.f23307d = this.f23308e;
                this.f23308e = -1;
                this.f23309f = ((AbstractList) this.f23306c).modCount;
            }

            @Override // java.util.ListIterator
            public void set(Object obj) {
                m20141a();
                int i10 = this.f23308e;
                if (i10 == -1) {
                    throw new IllegalStateException("Call next() or previous() before replacing element from the iterator.");
                }
                this.f23306c.set(i10, obj);
            }
        }

        public BuilderSubList(Object[] backing, int i10, int i11, BuilderSubList builderSubList, ListBuilder root) {
            AbstractC9979u.m20294g(backing, "backing");
            AbstractC9979u.m20294g(root, "root");
            this.f23301c = backing;
            this.f23302d = i10;
            this.f23303e = i11;
            this.f23304f = builderSubList;
            this.f23305g = root;
            ((AbstractList) this).modCount = ((AbstractList) root).modCount;
        }

        /* renamed from: m */
        private final void m20131m() {
            if (((AbstractList) this.f23305g).modCount != ((AbstractList) this).modCount) {
                throw new ConcurrentModificationException();
            }
        }

        /* renamed from: r */
        private final void m20132r() {
            ((AbstractList) this).modCount++;
        }

        private final void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
            throw new InvalidObjectException("Deserialization is supported via proxy only");
        }

        private final Object writeReplace() throws NotSerializableException {
            if (m20137p()) {
                return new SerializedCollection(this, 0);
            }
            throw new NotSerializableException("The list cannot be serialized while it is being built.");
        }

        @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean add(Object obj) {
            m20135n();
            m20131m();
            m20134k(this.f23302d + this.f23303e, obj);
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean addAll(Collection elements) {
            AbstractC9979u.m20294g(elements, "elements");
            m20135n();
            m20131m();
            int size = elements.size();
            m20133g(this.f23302d + this.f23303e, elements, size);
            return size > 0;
        }

        @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
        public void clear() {
            m20135n();
            m20131m();
            m20139u(this.f23302d, this.f23303e);
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public boolean equals(Object obj) {
            m20131m();
            if (obj != this) {
                return (obj instanceof List) && m20136o((List) obj);
            }
            return true;
        }

        /* renamed from: g */
        public final void m20133g(int i10, Collection collection, int i11) {
            m20132r();
            BuilderSubList builderSubList = this.f23304f;
            if (builderSubList != null) {
                builderSubList.m20133g(i10, collection, i11);
            } else {
                this.f23305g.m20118o(i10, collection, i11);
            }
            this.f23301c = this.f23305g.f23298c;
            this.f23303e += i11;
        }

        @Override // java.util.AbstractList, java.util.List
        public Object get(int i10) {
            m20131m();
            AbstractC10940d.Companion.m23886b(i10, this.f23303e);
            return this.f23301c[this.f23302d + i10];
        }

        @Override // p325rc.AbstractC10948h
        public int getSize() {
            m20131m();
            return this.f23303e;
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public int hashCode() {
            m20131m();
            return AbstractC11088b.m24672i(this.f23301c, this.f23302d, this.f23303e);
        }

        @Override // java.util.AbstractList, java.util.List
        public int indexOf(Object obj) {
            m20131m();
            for (int i10 = 0; i10 < this.f23303e; i10++) {
                if (AbstractC9979u.m20289b(this.f23301c[this.f23302d + i10], obj)) {
                    return i10;
                }
            }
            return -1;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean isEmpty() {
            m20131m();
            return this.f23303e == 0;
        }

        @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
        public Iterator iterator() {
            return listIterator(0);
        }

        /* renamed from: k */
        public final void m20134k(int i10, Object obj) {
            m20132r();
            BuilderSubList builderSubList = this.f23304f;
            if (builderSubList != null) {
                builderSubList.m20134k(i10, obj);
            } else {
                this.f23305g.m20119p(i10, obj);
            }
            this.f23301c = this.f23305g.f23298c;
            this.f23303e++;
        }

        @Override // java.util.AbstractList, java.util.List
        public int lastIndexOf(Object obj) {
            m20131m();
            for (int i10 = this.f23303e - 1; i10 >= 0; i10--) {
                if (AbstractC9979u.m20289b(this.f23301c[this.f23302d + i10], obj)) {
                    return i10;
                }
            }
            return -1;
        }

        @Override // java.util.AbstractList, java.util.List
        public ListIterator listIterator() {
            return listIterator(0);
        }

        /* renamed from: n */
        public final void m20135n() {
            if (m20137p()) {
                throw new UnsupportedOperationException();
            }
        }

        /* renamed from: o */
        public final boolean m20136o(List list) {
            return AbstractC11088b.m24671h(this.f23301c, this.f23302d, this.f23303e, list);
        }

        /* renamed from: p */
        public final boolean m20137p() {
            return this.f23305g.f23300e;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean remove(Object obj) {
            m20135n();
            m20131m();
            int iIndexOf = indexOf(obj);
            if (iIndexOf >= 0) {
                removeAt(iIndexOf);
            }
            return iIndexOf >= 0;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean removeAll(Collection elements) {
            AbstractC9979u.m20294g(elements, "elements");
            m20135n();
            m20131m();
            return m20140v(this.f23302d, this.f23303e, elements, false) > 0;
        }

        @Override // p325rc.AbstractC10948h
        public Object removeAt(int i10) {
            m20135n();
            m20131m();
            AbstractC10940d.Companion.m23886b(i10, this.f23303e);
            return m20138t(this.f23302d + i10);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean retainAll(Collection elements) {
            AbstractC9979u.m20294g(elements, "elements");
            m20135n();
            m20131m();
            return m20140v(this.f23302d, this.f23303e, elements, true) > 0;
        }

        @Override // java.util.AbstractList, java.util.List
        public Object set(int i10, Object obj) {
            m20135n();
            m20131m();
            AbstractC10940d.Companion.m23886b(i10, this.f23303e);
            Object[] objArr = this.f23301c;
            int i11 = this.f23302d;
            Object obj2 = objArr[i11 + i10];
            objArr[i11 + i10] = obj;
            return obj2;
        }

        @Override // java.util.AbstractList, java.util.List
        public List subList(int i10, int i11) {
            AbstractC10940d.Companion.m23888d(i10, i11, this.f23303e);
            return new BuilderSubList(this.f23301c, this.f23302d + i10, i11 - i10, this, this.f23305g);
        }

        /* renamed from: t */
        public final Object m20138t(int i10) {
            m20132r();
            BuilderSubList builderSubList = this.f23304f;
            this.f23303e--;
            return builderSubList != null ? builderSubList.m20138t(i10) : this.f23305g.m20106C(i10);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public Object[] toArray(Object[] array) {
            AbstractC9979u.m20294g(array, "array");
            m20131m();
            int length = array.length;
            int i10 = this.f23303e;
            if (length >= i10) {
                Object[] objArr = this.f23301c;
                int i11 = this.f23302d;
                AbstractC10964p.m24023p(objArr, array, 0, i11, i10 + i11);
                return AbstractC10976v.m24127f(this.f23303e, array);
            }
            Object[] objArr2 = this.f23301c;
            int i12 = this.f23302d;
            Object[] objArrCopyOfRange = Arrays.copyOfRange(objArr2, i12, i10 + i12, array.getClass());
            AbstractC9979u.m20293f(objArrCopyOfRange, "copyOfRange(...)");
            return objArrCopyOfRange;
        }

        @Override // java.util.AbstractCollection
        public String toString() {
            m20131m();
            return AbstractC11088b.m24673j(this.f23301c, this.f23302d, this.f23303e, this);
        }

        /* renamed from: u */
        public final void m20139u(int i10, int i11) {
            if (i11 > 0) {
                m20132r();
            }
            BuilderSubList builderSubList = this.f23304f;
            if (builderSubList != null) {
                builderSubList.m20139u(i10, i11);
            } else {
                this.f23305g.m20107D(i10, i11);
            }
            this.f23303e -= i11;
        }

        /* renamed from: v */
        public final int m20140v(int i10, int i11, Collection collection, boolean z10) {
            BuilderSubList builderSubList = this.f23304f;
            int iM20140v = builderSubList != null ? builderSubList.m20140v(i10, i11, collection, z10) : this.f23305g.m20108E(i10, i11, collection, z10);
            if (iM20140v > 0) {
                m20132r();
            }
            this.f23303e -= iM20140v;
            return iM20140v;
        }

        @Override // java.util.AbstractList, java.util.List
        public ListIterator listIterator(int i10) {
            m20131m();
            AbstractC10940d.Companion.m23887c(i10, this.f23303e);
            return new C9926a(this, i10);
        }

        @Override // java.util.AbstractList, java.util.List
        public void add(int i10, Object obj) {
            m20135n();
            m20131m();
            AbstractC10940d.Companion.m23887c(i10, this.f23303e);
            m20134k(this.f23302d + i10, obj);
        }

        @Override // java.util.AbstractList, java.util.List
        public boolean addAll(int i10, Collection elements) {
            AbstractC9979u.m20294g(elements, "elements");
            m20135n();
            m20131m();
            AbstractC10940d.Companion.m23887c(i10, this.f23303e);
            int size = elements.size();
            m20133g(this.f23302d + i10, elements, size);
            return size > 0;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public Object[] toArray() {
            m20131m();
            Object[] objArr = this.f23301c;
            int i10 = this.f23302d;
            return AbstractC10964p.m24032y(objArr, i10, this.f23303e + i10);
        }
    }

    /* renamed from: kotlin.collections.builders.ListBuilder$a */
    public static final class C9927a {
        public /* synthetic */ C9927a(AbstractC9972n abstractC9972n) {
            this();
        }

        public C9927a() {
        }
    }

    /* renamed from: kotlin.collections.builders.ListBuilder$b */
    public static final class C9928b implements ListIterator, InterfaceC9624a {

        /* renamed from: c */
        public final ListBuilder f23310c;

        /* renamed from: d */
        public int f23311d;

        /* renamed from: e */
        public int f23312e;

        /* renamed from: f */
        public int f23313f;

        public C9928b(ListBuilder list, int i10) {
            AbstractC9979u.m20294g(list, "list");
            this.f23310c = list;
            this.f23311d = i10;
            this.f23312e = -1;
            this.f23313f = ((AbstractList) list).modCount;
        }

        /* renamed from: a */
        private final void m20142a() {
            if (((AbstractList) this.f23310c).modCount != this.f23313f) {
                throw new ConcurrentModificationException();
            }
        }

        @Override // java.util.ListIterator
        public void add(Object obj) {
            m20142a();
            ListBuilder listBuilder = this.f23310c;
            int i10 = this.f23311d;
            this.f23311d = i10 + 1;
            listBuilder.add(i10, obj);
            this.f23312e = -1;
            this.f23313f = ((AbstractList) this.f23310c).modCount;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
            return this.f23311d < this.f23310c.f23299d;
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return this.f23311d > 0;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public Object next() {
            m20142a();
            if (this.f23311d >= this.f23310c.f23299d) {
                throw new NoSuchElementException();
            }
            int i10 = this.f23311d;
            this.f23311d = i10 + 1;
            this.f23312e = i10;
            return this.f23310c.f23298c[this.f23312e];
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return this.f23311d;
        }

        @Override // java.util.ListIterator
        public Object previous() {
            m20142a();
            int i10 = this.f23311d;
            if (i10 <= 0) {
                throw new NoSuchElementException();
            }
            int i11 = i10 - 1;
            this.f23311d = i11;
            this.f23312e = i11;
            return this.f23310c.f23298c[this.f23312e];
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return this.f23311d - 1;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public void remove() {
            m20142a();
            int i10 = this.f23312e;
            if (i10 == -1) {
                throw new IllegalStateException("Call next() or previous() before removing element from the iterator.");
            }
            this.f23310c.removeAt(i10);
            this.f23311d = this.f23312e;
            this.f23312e = -1;
            this.f23313f = ((AbstractList) this.f23310c).modCount;
        }

        @Override // java.util.ListIterator
        public void set(Object obj) {
            m20142a();
            int i10 = this.f23312e;
            if (i10 == -1) {
                throw new IllegalStateException("Call next() or previous() before replacing element from the iterator.");
            }
            this.f23310c.set(i10, obj);
        }
    }

    static {
        ListBuilder listBuilder = new ListBuilder(0);
        listBuilder.f23300e = true;
        f23297g = listBuilder;
    }

    public ListBuilder(int i10) {
        this.f23298c = AbstractC11088b.m24667d(i10);
    }

    /* renamed from: A */
    private final void m20105A() {
        ((AbstractList) this).modCount++;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: C */
    public final Object m20106C(int i10) {
        m20105A();
        Object[] objArr = this.f23298c;
        Object obj = objArr[i10];
        AbstractC10964p.m24023p(objArr, objArr, i10, i10 + 1, this.f23299d);
        AbstractC11088b.m24669f(this.f23298c, this.f23299d - 1);
        this.f23299d--;
        return obj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: D */
    public final void m20107D(int i10, int i11) {
        if (i11 > 0) {
            m20105A();
        }
        Object[] objArr = this.f23298c;
        AbstractC10964p.m24023p(objArr, objArr, i10, i10 + i11, this.f23299d);
        Object[] objArr2 = this.f23298c;
        int i12 = this.f23299d;
        AbstractC11088b.m24670g(objArr2, i12 - i11, i12);
        this.f23299d -= i11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: E */
    public final int m20108E(int i10, int i11, Collection collection, boolean z10) {
        int i12 = 0;
        int i13 = 0;
        while (i12 < i11) {
            int i14 = i10 + i12;
            if (collection.contains(this.f23298c[i14]) == z10) {
                Object[] objArr = this.f23298c;
                i12++;
                objArr[i13 + i10] = objArr[i14];
                i13++;
            } else {
                i12++;
            }
        }
        int i15 = i11 - i13;
        Object[] objArr2 = this.f23298c;
        AbstractC10964p.m24023p(objArr2, objArr2, i10 + i13, i11 + i10, this.f23299d);
        Object[] objArr3 = this.f23298c;
        int i16 = this.f23299d;
        AbstractC11088b.m24670g(objArr3, i16 - i15, i16);
        if (i15 > 0) {
            m20105A();
        }
        this.f23299d -= i15;
        return i15;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: o */
    public final void m20118o(int i10, Collection collection, int i11) {
        m20105A();
        m20125z(i10, i11);
        Iterator<E> it = collection.iterator();
        for (int i12 = 0; i12 < i11; i12++) {
            this.f23298c[i10 + i12] = it.next();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: p */
    public final void m20119p(int i10, Object obj) {
        m20105A();
        m20125z(i10, 1);
        this.f23298c[i10] = obj;
    }

    /* renamed from: t */
    private final void m20120t() {
        if (this.f23300e) {
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: u */
    private final boolean m20121u(List list) {
        return AbstractC11088b.m24671h(this.f23298c, 0, this.f23299d, list);
    }

    private final Object writeReplace() throws NotSerializableException {
        if (this.f23300e) {
            return new SerializedCollection(this, 0);
        }
        throw new NotSerializableException("The list cannot be serialized while it is being built.");
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(Object obj) {
        m20120t();
        m20119p(this.f23299d, obj);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection elements) {
        AbstractC9979u.m20294g(elements, "elements");
        m20120t();
        int size = elements.size();
        m20118o(this.f23299d, elements, size);
        return size > 0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        m20120t();
        m20107D(0, this.f23299d);
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        if (obj != this) {
            return (obj instanceof List) && m20121u((List) obj);
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public Object get(int i10) {
        AbstractC10940d.Companion.m23886b(i10, this.f23299d);
        return this.f23298c[i10];
    }

    @Override // p325rc.AbstractC10948h
    public int getSize() {
        return this.f23299d;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        return AbstractC11088b.m24672i(this.f23298c, 0, this.f23299d);
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object obj) {
        for (int i10 = 0; i10 < this.f23299d; i10++) {
            if (AbstractC9979u.m20289b(this.f23298c[i10], obj)) {
                return i10;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean isEmpty() {
        return this.f23299d == 0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator iterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.List
    public int lastIndexOf(Object obj) {
        for (int i10 = this.f23299d - 1; i10 >= 0; i10--) {
            if (AbstractC9979u.m20289b(this.f23298c[i10], obj)) {
                return i10;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public ListIterator listIterator() {
        return listIterator(0);
    }

    /* renamed from: r */
    public final List m20122r() {
        m20120t();
        this.f23300e = true;
        return this.f23299d > 0 ? this : f23297g;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean remove(Object obj) {
        m20120t();
        int iIndexOf = indexOf(obj);
        if (iIndexOf >= 0) {
            removeAt(iIndexOf);
        }
        return iIndexOf >= 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean removeAll(Collection elements) {
        AbstractC9979u.m20294g(elements, "elements");
        m20120t();
        return m20108E(0, this.f23299d, elements, false) > 0;
    }

    @Override // p325rc.AbstractC10948h
    public Object removeAt(int i10) {
        m20120t();
        AbstractC10940d.Companion.m23886b(i10, this.f23299d);
        return m20106C(i10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean retainAll(Collection elements) {
        AbstractC9979u.m20294g(elements, "elements");
        m20120t();
        return m20108E(0, this.f23299d, elements, true) > 0;
    }

    @Override // java.util.AbstractList, java.util.List
    public Object set(int i10, Object obj) {
        m20120t();
        AbstractC10940d.Companion.m23886b(i10, this.f23299d);
        Object[] objArr = this.f23298c;
        Object obj2 = objArr[i10];
        objArr[i10] = obj;
        return obj2;
    }

    @Override // java.util.AbstractList, java.util.List
    public List subList(int i10, int i11) {
        AbstractC10940d.Companion.m23888d(i10, i11, this.f23299d);
        return new BuilderSubList(this.f23298c, i10, i11 - i10, null, this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public Object[] toArray(Object[] array) {
        AbstractC9979u.m20294g(array, "array");
        int length = array.length;
        int i10 = this.f23299d;
        if (length >= i10) {
            AbstractC10964p.m24023p(this.f23298c, array, 0, 0, i10);
            return AbstractC10976v.m24127f(this.f23299d, array);
        }
        Object[] objArrCopyOfRange = Arrays.copyOfRange(this.f23298c, 0, i10, array.getClass());
        AbstractC9979u.m20293f(objArrCopyOfRange, "copyOfRange(...)");
        return objArrCopyOfRange;
    }

    @Override // java.util.AbstractCollection
    public String toString() {
        return AbstractC11088b.m24673j(this.f23298c, 0, this.f23299d, this);
    }

    /* renamed from: v */
    public final void m20123v(int i10) {
        if (i10 < 0) {
            throw new OutOfMemoryError();
        }
        Object[] objArr = this.f23298c;
        if (i10 > objArr.length) {
            this.f23298c = AbstractC11088b.m24668e(this.f23298c, AbstractC10940d.Companion.m23889e(objArr.length, i10));
        }
    }

    /* renamed from: y */
    public final void m20124y(int i10) {
        m20123v(this.f23299d + i10);
    }

    /* renamed from: z */
    public final void m20125z(int i10, int i11) {
        m20124y(i11);
        Object[] objArr = this.f23298c;
        AbstractC10964p.m24023p(objArr, objArr, i10 + i11, i10, this.f23299d);
        this.f23299d += i11;
    }

    @Override // java.util.AbstractList, java.util.List
    public ListIterator listIterator(int i10) {
        AbstractC10940d.Companion.m23887c(i10, this.f23299d);
        return new C9928b(this, i10);
    }

    public /* synthetic */ ListBuilder(int i10, int i11, AbstractC9972n abstractC9972n) {
        this((i11 & 1) != 0 ? 10 : i10);
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int i10, Object obj) {
        m20120t();
        AbstractC10940d.Companion.m23887c(i10, this.f23299d);
        m20119p(i10, obj);
    }

    @Override // java.util.AbstractList, java.util.List
    public boolean addAll(int i10, Collection elements) {
        AbstractC9979u.m20294g(elements, "elements");
        m20120t();
        AbstractC10940d.Companion.m23887c(i10, this.f23299d);
        int size = elements.size();
        m20118o(i10, elements, size);
        return size > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public Object[] toArray() {
        return AbstractC10964p.m24032y(this.f23298c, 0, this.f23299d);
    }
}
