package kotlin.collections.builders;

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
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;
import p134i7.AbstractC8773d;
import p134i7.AbstractC8781h;
import p134i7.AbstractC8797p;
import p134i7.AbstractC8807u;
import p145j7.AbstractC9025b;
import p311y7.InterfaceC10668a;
import p311y7.InterfaceC10671d;

/* loaded from: classes5.dex */
public final class ListBuilder<E> extends AbstractC8781h implements List<E>, RandomAccess, Serializable, InterfaceC10671d {

    /* renamed from: d */
    public static final C9082a f17383d = new C9082a(null);

    /* renamed from: e */
    public static final ListBuilder f17384e;

    /* renamed from: a */
    public Object[] f17385a;

    /* renamed from: b */
    public int f17386b;

    /* renamed from: c */
    public boolean f17387c;

    public static final class BuilderSubList<E> extends AbstractC8781h implements List<E>, RandomAccess, Serializable, InterfaceC10671d {

        /* renamed from: a */
        public Object[] f17388a;

        /* renamed from: b */
        public final int f17389b;

        /* renamed from: c */
        public int f17390c;

        /* renamed from: d */
        public final BuilderSubList f17391d;

        /* renamed from: e */
        public final ListBuilder f17392e;

        /* renamed from: kotlin.collections.builders.ListBuilder$BuilderSubList$a */
        public static final class C9081a implements ListIterator, InterfaceC10668a {

            /* renamed from: a */
            public final BuilderSubList f17393a;

            /* renamed from: b */
            public int f17394b;

            /* renamed from: c */
            public int f17395c;

            /* renamed from: d */
            public int f17396d;

            public C9081a(BuilderSubList list, int i10) {
                AbstractC9133u.m16133g(list, "list");
                this.f17393a = list;
                this.f17394b = i10;
                this.f17395c = -1;
                this.f17396d = ((AbstractList) list).modCount;
            }

            /* renamed from: a */
            public final void m15996a() {
                if (((AbstractList) this.f17393a.f17392e).modCount != this.f17396d) {
                    throw new ConcurrentModificationException();
                }
            }

            @Override // java.util.ListIterator
            public void add(Object obj) {
                m15996a();
                BuilderSubList builderSubList = this.f17393a;
                int i10 = this.f17394b;
                this.f17394b = i10 + 1;
                builderSubList.add(i10, obj);
                this.f17395c = -1;
                this.f17396d = ((AbstractList) this.f17393a).modCount;
            }

            @Override // java.util.ListIterator, java.util.Iterator
            public boolean hasNext() {
                return this.f17394b < this.f17393a.f17390c;
            }

            @Override // java.util.ListIterator
            public boolean hasPrevious() {
                return this.f17394b > 0;
            }

            @Override // java.util.ListIterator, java.util.Iterator
            public Object next() {
                m15996a();
                if (this.f17394b >= this.f17393a.f17390c) {
                    throw new NoSuchElementException();
                }
                int i10 = this.f17394b;
                this.f17394b = i10 + 1;
                this.f17395c = i10;
                return this.f17393a.f17388a[this.f17393a.f17389b + this.f17395c];
            }

            @Override // java.util.ListIterator
            public int nextIndex() {
                return this.f17394b;
            }

            @Override // java.util.ListIterator
            public Object previous() {
                m15996a();
                int i10 = this.f17394b;
                if (i10 <= 0) {
                    throw new NoSuchElementException();
                }
                int i11 = i10 - 1;
                this.f17394b = i11;
                this.f17395c = i11;
                return this.f17393a.f17388a[this.f17393a.f17389b + this.f17395c];
            }

            @Override // java.util.ListIterator
            public int previousIndex() {
                return this.f17394b - 1;
            }

            @Override // java.util.ListIterator, java.util.Iterator
            public void remove() {
                m15996a();
                int i10 = this.f17395c;
                if (i10 == -1) {
                    throw new IllegalStateException("Call next() or previous() before removing element from the iterator.");
                }
                this.f17393a.removeAt(i10);
                this.f17394b = this.f17395c;
                this.f17395c = -1;
                this.f17396d = ((AbstractList) this.f17393a).modCount;
            }

            @Override // java.util.ListIterator
            public void set(Object obj) {
                m15996a();
                int i10 = this.f17395c;
                if (i10 == -1) {
                    throw new IllegalStateException("Call next() or previous() before replacing element from the iterator.");
                }
                this.f17393a.set(i10, obj);
            }
        }

        public BuilderSubList(Object[] backing, int i10, int i11, BuilderSubList builderSubList, ListBuilder root) {
            AbstractC9133u.m16133g(backing, "backing");
            AbstractC9133u.m16133g(root, "root");
            this.f17388a = backing;
            this.f17389b = i10;
            this.f17390c = i11;
            this.f17391d = builderSubList;
            this.f17392e = root;
            ((AbstractList) this).modCount = ((AbstractList) root).modCount;
        }

        /* renamed from: i */
        private final void m15986i() {
            if (((AbstractList) this.f17392e).modCount != ((AbstractList) this).modCount) {
                throw new ConcurrentModificationException();
            }
        }

        /* renamed from: m */
        private final void m15987m() {
            ((AbstractList) this).modCount++;
        }

        private final void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
            throw new InvalidObjectException("Deserialization is supported via proxy only");
        }

        private final Object writeReplace() throws NotSerializableException {
            if (m15992l()) {
                return new SerializedCollection(this, 0);
            }
            throw new NotSerializableException("The list cannot be serialized while it is being built.");
        }

        @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean add(Object obj) {
            m15990j();
            m15986i();
            m15989h(this.f17389b + this.f17390c, obj);
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean addAll(Collection elements) {
            AbstractC9133u.m16133g(elements, "elements");
            m15990j();
            m15986i();
            int size = elements.size();
            m15988g(this.f17389b + this.f17390c, elements, size);
            return size > 0;
        }

        @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
        public void clear() {
            m15990j();
            m15986i();
            m15994o(this.f17389b, this.f17390c);
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public boolean equals(Object obj) {
            m15986i();
            if (obj != this) {
                return (obj instanceof List) && m15991k((List) obj);
            }
            return true;
        }

        /* renamed from: g */
        public final void m15988g(int i10, Collection collection, int i11) {
            m15987m();
            BuilderSubList builderSubList = this.f17391d;
            if (builderSubList != null) {
                builderSubList.m15988g(i10, collection, i11);
            } else {
                this.f17392e.m15969k(i10, collection, i11);
            }
            this.f17388a = this.f17392e.f17385a;
            this.f17390c += i11;
        }

        @Override // java.util.AbstractList, java.util.List
        public Object get(int i10) {
            m15986i();
            AbstractC8773d.Companion.m14512b(i10, this.f17390c);
            return this.f17388a[this.f17389b + i10];
        }

        @Override // p134i7.AbstractC8781h
        public int getSize() {
            m15986i();
            return this.f17390c;
        }

        /* renamed from: h */
        public final void m15989h(int i10, Object obj) {
            m15987m();
            BuilderSubList builderSubList = this.f17391d;
            if (builderSubList != null) {
                builderSubList.m15989h(i10, obj);
            } else {
                this.f17392e.m15970l(i10, obj);
            }
            this.f17388a = this.f17392e.f17385a;
            this.f17390c++;
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public int hashCode() {
            m15986i();
            return AbstractC9025b.m15687i(this.f17388a, this.f17389b, this.f17390c);
        }

        @Override // java.util.AbstractList, java.util.List
        public int indexOf(Object obj) {
            m15986i();
            for (int i10 = 0; i10 < this.f17390c; i10++) {
                if (AbstractC9133u.m16128b(this.f17388a[this.f17389b + i10], obj)) {
                    return i10;
                }
            }
            return -1;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean isEmpty() {
            m15986i();
            return this.f17390c == 0;
        }

        @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
        public Iterator iterator() {
            return listIterator(0);
        }

        /* renamed from: j */
        public final void m15990j() {
            if (m15992l()) {
                throw new UnsupportedOperationException();
            }
        }

        /* renamed from: k */
        public final boolean m15991k(List list) {
            return AbstractC9025b.m15686h(this.f17388a, this.f17389b, this.f17390c, list);
        }

        /* renamed from: l */
        public final boolean m15992l() {
            return this.f17392e.f17387c;
        }

        @Override // java.util.AbstractList, java.util.List
        public int lastIndexOf(Object obj) {
            m15986i();
            for (int i10 = this.f17390c - 1; i10 >= 0; i10--) {
                if (AbstractC9133u.m16128b(this.f17388a[this.f17389b + i10], obj)) {
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
        public final Object m15993n(int i10) {
            m15987m();
            BuilderSubList builderSubList = this.f17391d;
            this.f17390c--;
            return builderSubList != null ? builderSubList.m15993n(i10) : this.f17392e.m15974t(i10);
        }

        /* renamed from: o */
        public final void m15994o(int i10, int i11) {
            if (i11 > 0) {
                m15987m();
            }
            BuilderSubList builderSubList = this.f17391d;
            if (builderSubList != null) {
                builderSubList.m15994o(i10, i11);
            } else {
                this.f17392e.m15975u(i10, i11);
            }
            this.f17390c -= i11;
        }

        /* renamed from: p */
        public final int m15995p(int i10, int i11, Collection collection, boolean z10) {
            BuilderSubList builderSubList = this.f17391d;
            int iM15995p = builderSubList != null ? builderSubList.m15995p(i10, i11, collection, z10) : this.f17392e.m15976v(i10, i11, collection, z10);
            if (iM15995p > 0) {
                m15987m();
            }
            this.f17390c -= iM15995p;
            return iM15995p;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean remove(Object obj) {
            m15990j();
            m15986i();
            int iIndexOf = indexOf(obj);
            if (iIndexOf >= 0) {
                removeAt(iIndexOf);
            }
            return iIndexOf >= 0;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean removeAll(Collection elements) {
            AbstractC9133u.m16133g(elements, "elements");
            m15990j();
            m15986i();
            return m15995p(this.f17389b, this.f17390c, elements, false) > 0;
        }

        @Override // p134i7.AbstractC8781h
        public Object removeAt(int i10) {
            m15990j();
            m15986i();
            AbstractC8773d.Companion.m14512b(i10, this.f17390c);
            return m15993n(this.f17389b + i10);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean retainAll(Collection elements) {
            AbstractC9133u.m16133g(elements, "elements");
            m15990j();
            m15986i();
            return m15995p(this.f17389b, this.f17390c, elements, true) > 0;
        }

        @Override // java.util.AbstractList, java.util.List
        public Object set(int i10, Object obj) {
            m15990j();
            m15986i();
            AbstractC8773d.Companion.m14512b(i10, this.f17390c);
            Object[] objArr = this.f17388a;
            int i11 = this.f17389b;
            Object obj2 = objArr[i11 + i10];
            objArr[i11 + i10] = obj;
            return obj2;
        }

        @Override // java.util.AbstractList, java.util.List
        public List subList(int i10, int i11) {
            AbstractC8773d.Companion.m14514d(i10, i11, this.f17390c);
            return new BuilderSubList(this.f17388a, this.f17389b + i10, i11 - i10, this, this.f17392e);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public Object[] toArray(Object[] array) {
            AbstractC9133u.m16133g(array, "array");
            m15986i();
            int length = array.length;
            int i10 = this.f17390c;
            if (length >= i10) {
                Object[] objArr = this.f17388a;
                int i11 = this.f17389b;
                AbstractC8797p.m14649p(objArr, array, 0, i11, i10 + i11);
                return AbstractC8807u.m14756f(this.f17390c, array);
            }
            Object[] objArr2 = this.f17388a;
            int i12 = this.f17389b;
            Object[] objArrCopyOfRange = Arrays.copyOfRange(objArr2, i12, i10 + i12, array.getClass());
            AbstractC9133u.m16132f(objArrCopyOfRange, "copyOfRange(...)");
            return objArrCopyOfRange;
        }

        @Override // java.util.AbstractCollection
        public String toString() {
            m15986i();
            return AbstractC9025b.m15688j(this.f17388a, this.f17389b, this.f17390c, this);
        }

        @Override // java.util.AbstractList, java.util.List
        public ListIterator listIterator(int i10) {
            m15986i();
            AbstractC8773d.Companion.m14513c(i10, this.f17390c);
            return new C9081a(this, i10);
        }

        @Override // java.util.AbstractList, java.util.List
        public void add(int i10, Object obj) {
            m15990j();
            m15986i();
            AbstractC8773d.Companion.m14513c(i10, this.f17390c);
            m15989h(this.f17389b + i10, obj);
        }

        @Override // java.util.AbstractList, java.util.List
        public boolean addAll(int i10, Collection elements) {
            AbstractC9133u.m16133g(elements, "elements");
            m15990j();
            m15986i();
            AbstractC8773d.Companion.m14513c(i10, this.f17390c);
            int size = elements.size();
            m15988g(this.f17389b + i10, elements, size);
            return size > 0;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public Object[] toArray() {
            m15986i();
            Object[] objArr = this.f17388a;
            int i10 = this.f17389b;
            return AbstractC8797p.m14658y(objArr, i10, this.f17390c + i10);
        }
    }

    /* renamed from: kotlin.collections.builders.ListBuilder$a */
    public static final class C9082a {
        public /* synthetic */ C9082a(AbstractC9126n abstractC9126n) {
            this();
        }

        public C9082a() {
        }
    }

    /* renamed from: kotlin.collections.builders.ListBuilder$b */
    public static final class C9083b implements ListIterator, InterfaceC10668a {

        /* renamed from: a */
        public final ListBuilder f17397a;

        /* renamed from: b */
        public int f17398b;

        /* renamed from: c */
        public int f17399c;

        /* renamed from: d */
        public int f17400d;

        public C9083b(ListBuilder list, int i10) {
            AbstractC9133u.m16133g(list, "list");
            this.f17397a = list;
            this.f17398b = i10;
            this.f17399c = -1;
            this.f17400d = ((AbstractList) list).modCount;
        }

        /* renamed from: a */
        private final void m15997a() {
            if (((AbstractList) this.f17397a).modCount != this.f17400d) {
                throw new ConcurrentModificationException();
            }
        }

        @Override // java.util.ListIterator
        public void add(Object obj) {
            m15997a();
            ListBuilder listBuilder = this.f17397a;
            int i10 = this.f17398b;
            this.f17398b = i10 + 1;
            listBuilder.add(i10, obj);
            this.f17399c = -1;
            this.f17400d = ((AbstractList) this.f17397a).modCount;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
            return this.f17398b < this.f17397a.f17386b;
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return this.f17398b > 0;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public Object next() {
            m15997a();
            if (this.f17398b >= this.f17397a.f17386b) {
                throw new NoSuchElementException();
            }
            int i10 = this.f17398b;
            this.f17398b = i10 + 1;
            this.f17399c = i10;
            return this.f17397a.f17385a[this.f17399c];
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return this.f17398b;
        }

        @Override // java.util.ListIterator
        public Object previous() {
            m15997a();
            int i10 = this.f17398b;
            if (i10 <= 0) {
                throw new NoSuchElementException();
            }
            int i11 = i10 - 1;
            this.f17398b = i11;
            this.f17399c = i11;
            return this.f17397a.f17385a[this.f17399c];
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return this.f17398b - 1;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public void remove() {
            m15997a();
            int i10 = this.f17399c;
            if (i10 == -1) {
                throw new IllegalStateException("Call next() or previous() before removing element from the iterator.");
            }
            this.f17397a.removeAt(i10);
            this.f17398b = this.f17399c;
            this.f17399c = -1;
            this.f17400d = ((AbstractList) this.f17397a).modCount;
        }

        @Override // java.util.ListIterator
        public void set(Object obj) {
            m15997a();
            int i10 = this.f17399c;
            if (i10 == -1) {
                throw new IllegalStateException("Call next() or previous() before replacing element from the iterator.");
            }
            this.f17397a.set(i10, obj);
        }
    }

    static {
        ListBuilder listBuilder = new ListBuilder(0);
        listBuilder.f17387c = true;
        f17384e = listBuilder;
    }

    public ListBuilder(int i10) {
        this.f17385a = AbstractC9025b.m15682d(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: k */
    public final void m15969k(int i10, Collection collection, int i11) {
        m15973s();
        m15980r(i10, i11);
        Iterator<E> it = collection.iterator();
        for (int i12 = 0; i12 < i11; i12++) {
            this.f17385a[i10 + i12] = it.next();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: l */
    public final void m15970l(int i10, Object obj) {
        m15973s();
        m15980r(i10, 1);
        this.f17385a[i10] = obj;
    }

    /* renamed from: n */
    private final void m15971n() {
        if (this.f17387c) {
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: o */
    private final boolean m15972o(List list) {
        return AbstractC9025b.m15686h(this.f17385a, 0, this.f17386b, list);
    }

    /* renamed from: s */
    private final void m15973s() {
        ((AbstractList) this).modCount++;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: t */
    public final Object m15974t(int i10) {
        m15973s();
        Object[] objArr = this.f17385a;
        Object obj = objArr[i10];
        AbstractC8797p.m14649p(objArr, objArr, i10, i10 + 1, this.f17386b);
        AbstractC9025b.m15684f(this.f17385a, this.f17386b - 1);
        this.f17386b--;
        return obj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: u */
    public final void m15975u(int i10, int i11) {
        if (i11 > 0) {
            m15973s();
        }
        Object[] objArr = this.f17385a;
        AbstractC8797p.m14649p(objArr, objArr, i10, i10 + i11, this.f17386b);
        Object[] objArr2 = this.f17385a;
        int i12 = this.f17386b;
        AbstractC9025b.m15685g(objArr2, i12 - i11, i12);
        this.f17386b -= i11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: v */
    public final int m15976v(int i10, int i11, Collection collection, boolean z10) {
        int i12 = 0;
        int i13 = 0;
        while (i12 < i11) {
            int i14 = i10 + i12;
            if (collection.contains(this.f17385a[i14]) == z10) {
                Object[] objArr = this.f17385a;
                i12++;
                objArr[i13 + i10] = objArr[i14];
                i13++;
            } else {
                i12++;
            }
        }
        int i15 = i11 - i13;
        Object[] objArr2 = this.f17385a;
        AbstractC8797p.m14649p(objArr2, objArr2, i10 + i13, i11 + i10, this.f17386b);
        Object[] objArr3 = this.f17385a;
        int i16 = this.f17386b;
        AbstractC9025b.m15685g(objArr3, i16 - i15, i16);
        if (i15 > 0) {
            m15973s();
        }
        this.f17386b -= i15;
        return i15;
    }

    private final Object writeReplace() throws NotSerializableException {
        if (this.f17387c) {
            return new SerializedCollection(this, 0);
        }
        throw new NotSerializableException("The list cannot be serialized while it is being built.");
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(Object obj) {
        m15971n();
        m15970l(this.f17386b, obj);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection elements) {
        AbstractC9133u.m16133g(elements, "elements");
        m15971n();
        int size = elements.size();
        m15969k(this.f17386b, elements, size);
        return size > 0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        m15971n();
        m15975u(0, this.f17386b);
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        if (obj != this) {
            return (obj instanceof List) && m15972o((List) obj);
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public Object get(int i10) {
        AbstractC8773d.Companion.m14512b(i10, this.f17386b);
        return this.f17385a[i10];
    }

    @Override // p134i7.AbstractC8781h
    public int getSize() {
        return this.f17386b;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        return AbstractC9025b.m15687i(this.f17385a, 0, this.f17386b);
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object obj) {
        for (int i10 = 0; i10 < this.f17386b; i10++) {
            if (AbstractC9133u.m16128b(this.f17385a[i10], obj)) {
                return i10;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean isEmpty() {
        return this.f17386b == 0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator iterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.List
    public int lastIndexOf(Object obj) {
        for (int i10 = this.f17386b - 1; i10 >= 0; i10--) {
            if (AbstractC9133u.m16128b(this.f17385a[i10], obj)) {
                return i10;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public ListIterator listIterator() {
        return listIterator(0);
    }

    /* renamed from: m */
    public final List m15977m() {
        m15971n();
        this.f17387c = true;
        return this.f17386b > 0 ? this : f17384e;
    }

    /* renamed from: p */
    public final void m15978p(int i10) {
        if (i10 < 0) {
            throw new OutOfMemoryError();
        }
        Object[] objArr = this.f17385a;
        if (i10 > objArr.length) {
            this.f17385a = AbstractC9025b.m15683e(this.f17385a, AbstractC8773d.Companion.m14515e(objArr.length, i10));
        }
    }

    /* renamed from: q */
    public final void m15979q(int i10) {
        m15978p(this.f17386b + i10);
    }

    /* renamed from: r */
    public final void m15980r(int i10, int i11) {
        m15979q(i11);
        Object[] objArr = this.f17385a;
        AbstractC8797p.m14649p(objArr, objArr, i10 + i11, i10, this.f17386b);
        this.f17386b += i11;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean remove(Object obj) {
        m15971n();
        int iIndexOf = indexOf(obj);
        if (iIndexOf >= 0) {
            removeAt(iIndexOf);
        }
        return iIndexOf >= 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean removeAll(Collection elements) {
        AbstractC9133u.m16133g(elements, "elements");
        m15971n();
        return m15976v(0, this.f17386b, elements, false) > 0;
    }

    @Override // p134i7.AbstractC8781h
    public Object removeAt(int i10) {
        m15971n();
        AbstractC8773d.Companion.m14512b(i10, this.f17386b);
        return m15974t(i10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean retainAll(Collection elements) {
        AbstractC9133u.m16133g(elements, "elements");
        m15971n();
        return m15976v(0, this.f17386b, elements, true) > 0;
    }

    @Override // java.util.AbstractList, java.util.List
    public Object set(int i10, Object obj) {
        m15971n();
        AbstractC8773d.Companion.m14512b(i10, this.f17386b);
        Object[] objArr = this.f17385a;
        Object obj2 = objArr[i10];
        objArr[i10] = obj;
        return obj2;
    }

    @Override // java.util.AbstractList, java.util.List
    public List subList(int i10, int i11) {
        AbstractC8773d.Companion.m14514d(i10, i11, this.f17386b);
        return new BuilderSubList(this.f17385a, i10, i11 - i10, null, this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public Object[] toArray(Object[] array) {
        AbstractC9133u.m16133g(array, "array");
        int length = array.length;
        int i10 = this.f17386b;
        if (length >= i10) {
            AbstractC8797p.m14649p(this.f17385a, array, 0, 0, i10);
            return AbstractC8807u.m14756f(this.f17386b, array);
        }
        Object[] objArrCopyOfRange = Arrays.copyOfRange(this.f17385a, 0, i10, array.getClass());
        AbstractC9133u.m16132f(objArrCopyOfRange, "copyOfRange(...)");
        return objArrCopyOfRange;
    }

    @Override // java.util.AbstractCollection
    public String toString() {
        return AbstractC9025b.m15688j(this.f17385a, 0, this.f17386b, this);
    }

    @Override // java.util.AbstractList, java.util.List
    public ListIterator listIterator(int i10) {
        AbstractC8773d.Companion.m14513c(i10, this.f17386b);
        return new C9083b(this, i10);
    }

    public /* synthetic */ ListBuilder(int i10, int i11, AbstractC9126n abstractC9126n) {
        this((i11 & 1) != 0 ? 10 : i10);
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int i10, Object obj) {
        m15971n();
        AbstractC8773d.Companion.m14513c(i10, this.f17386b);
        m15970l(i10, obj);
    }

    @Override // java.util.AbstractList, java.util.List
    public boolean addAll(int i10, Collection elements) {
        AbstractC9133u.m16133g(elements, "elements");
        m15971n();
        AbstractC8773d.Companion.m14513c(i10, this.f17386b);
        int size = elements.size();
        m15969k(i10, elements, size);
        return size > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public Object[] toArray() {
        return AbstractC8797p.m14658y(this.f17385a, 0, this.f17386b);
    }
}
