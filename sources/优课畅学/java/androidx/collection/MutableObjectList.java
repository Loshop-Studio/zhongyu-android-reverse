package androidx.collection;

import androidx.annotation.IntRange;
import androidx.collection.internal.RuntimeHelpersKt;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.jvm.internal.AbstractC9125m;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;
import p077d8.AbstractC8323h;
import p077d8.C8321f;
import p101f8.AbstractC8479q;
import p101f8.InterfaceC8469g;
import p134i7.AbstractC8778f0;
import p134i7.AbstractC8797p;
import p134i7.AbstractC8801r;
import p134i7.AbstractC8809v;
import p300x7.InterfaceC10570l;
import p311y7.InterfaceC10668a;
import p311y7.InterfaceC10671d;

/* loaded from: classes.dex */
public final class MutableObjectList<E> extends ObjectList<E> {
    private ObjectListMutableList<E> list;

    public static final class MutableObjectListIterator<T> implements ListIterator<T>, InterfaceC10668a {
        private final List<T> list;
        private int prevIndex;

        public MutableObjectListIterator(List<T> list, int i10) {
            AbstractC9133u.m16133g(list, "list");
            this.list = list;
            this.prevIndex = i10 - 1;
        }

        @Override // java.util.ListIterator
        public void add(T t10) {
            List<T> list = this.list;
            int i10 = this.prevIndex + 1;
            this.prevIndex = i10;
            list.add(i10, t10);
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
            return this.prevIndex < this.list.size() - 1;
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return this.prevIndex >= 0;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public T next() {
            List<T> list = this.list;
            int i10 = this.prevIndex + 1;
            this.prevIndex = i10;
            return list.get(i10);
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return this.prevIndex + 1;
        }

        @Override // java.util.ListIterator
        public T previous() {
            List<T> list = this.list;
            int i10 = this.prevIndex;
            this.prevIndex = i10 - 1;
            return list.get(i10);
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return this.prevIndex;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public void remove() {
            this.list.remove(this.prevIndex);
            this.prevIndex--;
        }

        @Override // java.util.ListIterator
        public void set(T t10) {
            this.list.set(this.prevIndex, t10);
        }
    }

    public static final class ObjectListMutableList<T> implements List<T>, InterfaceC10671d {
        private final MutableObjectList<T> objectList;

        public ObjectListMutableList(MutableObjectList<T> objectList) {
            AbstractC9133u.m16133g(objectList, "objectList");
            this.objectList = objectList;
        }

        @Override // java.util.List, java.util.Collection
        public boolean add(T t10) {
            return this.objectList.add(t10);
        }

        @Override // java.util.List
        public boolean addAll(int i10, Collection<? extends T> elements) {
            AbstractC9133u.m16133g(elements, "elements");
            return this.objectList.addAll(i10, elements);
        }

        @Override // java.util.List, java.util.Collection
        public void clear() {
            this.objectList.clear();
        }

        @Override // java.util.List, java.util.Collection
        public boolean contains(Object obj) {
            return this.objectList.contains(obj);
        }

        @Override // java.util.List, java.util.Collection
        public boolean containsAll(Collection<? extends Object> elements) {
            AbstractC9133u.m16133g(elements, "elements");
            return this.objectList.containsAll(elements);
        }

        @Override // java.util.List
        public T get(int i10) {
            ObjectListKt.checkIndex(this, i10);
            return this.objectList.get(i10);
        }

        public int getSize() {
            return this.objectList.getSize();
        }

        @Override // java.util.List
        public int indexOf(Object obj) {
            return this.objectList.indexOf(obj);
        }

        @Override // java.util.List, java.util.Collection
        public boolean isEmpty() {
            return this.objectList.isEmpty();
        }

        @Override // java.util.List, java.util.Collection, java.lang.Iterable
        public Iterator<T> iterator() {
            return new MutableObjectListIterator(this, 0);
        }

        @Override // java.util.List
        public int lastIndexOf(Object obj) {
            return this.objectList.lastIndexOf(obj);
        }

        @Override // java.util.List
        public ListIterator<T> listIterator() {
            return new MutableObjectListIterator(this, 0);
        }

        @Override // java.util.List
        public final /* bridge */ T remove(int i10) {
            return removeAt(i10);
        }

        @Override // java.util.List, java.util.Collection
        public boolean removeAll(Collection<? extends Object> elements) {
            AbstractC9133u.m16133g(elements, "elements");
            return this.objectList.removeAll(elements);
        }

        public T removeAt(int i10) {
            ObjectListKt.checkIndex(this, i10);
            return this.objectList.removeAt(i10);
        }

        @Override // java.util.List, java.util.Collection
        public boolean retainAll(Collection<? extends Object> elements) {
            AbstractC9133u.m16133g(elements, "elements");
            return this.objectList.retainAll((Collection<? extends T>) elements);
        }

        @Override // java.util.List
        public T set(int i10, T t10) {
            ObjectListKt.checkIndex(this, i10);
            return this.objectList.set(i10, t10);
        }

        @Override // java.util.List, java.util.Collection
        public final /* bridge */ int size() {
            return getSize();
        }

        @Override // java.util.List
        public List<T> subList(int i10, int i11) {
            ObjectListKt.checkSubIndex(this, i10, i11);
            return new SubList(this, i10, i11);
        }

        @Override // java.util.List, java.util.Collection
        public Object[] toArray() {
            return AbstractC9125m.m16122a(this);
        }

        @Override // java.util.List
        public void add(int i10, T t10) {
            this.objectList.add(i10, t10);
        }

        @Override // java.util.List, java.util.Collection
        public boolean addAll(Collection<? extends T> elements) {
            AbstractC9133u.m16133g(elements, "elements");
            return this.objectList.addAll(elements);
        }

        @Override // java.util.List
        public ListIterator<T> listIterator(int i10) {
            return new MutableObjectListIterator(this, i10);
        }

        @Override // java.util.List, java.util.Collection
        public boolean remove(Object obj) {
            return this.objectList.remove(obj);
        }

        @Override // java.util.List, java.util.Collection
        public <T> T[] toArray(T[] array) {
            AbstractC9133u.m16133g(array, "array");
            return (T[]) AbstractC9125m.m16123b(this, array);
        }
    }

    public static final class SubList<T> implements List<T>, InterfaceC10671d {
        private int end;
        private final List<T> list;
        private final int start;

        public SubList(List<T> list, int i10, int i11) {
            AbstractC9133u.m16133g(list, "list");
            this.list = list;
            this.start = i10;
            this.end = i11;
        }

        @Override // java.util.List, java.util.Collection
        public boolean add(T t10) {
            List<T> list = this.list;
            int i10 = this.end;
            this.end = i10 + 1;
            list.add(i10, t10);
            return true;
        }

        @Override // java.util.List
        public boolean addAll(int i10, Collection<? extends T> elements) {
            AbstractC9133u.m16133g(elements, "elements");
            this.list.addAll(i10 + this.start, elements);
            this.end += elements.size();
            return elements.size() > 0;
        }

        @Override // java.util.List, java.util.Collection
        public void clear() {
            int i10 = this.end - 1;
            int i11 = this.start;
            if (i11 <= i10) {
                while (true) {
                    this.list.remove(i10);
                    if (i10 == i11) {
                        break;
                    } else {
                        i10--;
                    }
                }
            }
            this.end = this.start;
        }

        @Override // java.util.List, java.util.Collection
        public boolean contains(Object obj) {
            int i10 = this.end;
            for (int i11 = this.start; i11 < i10; i11++) {
                if (AbstractC9133u.m16128b(this.list.get(i11), obj)) {
                    return true;
                }
            }
            return false;
        }

        @Override // java.util.List, java.util.Collection
        public boolean containsAll(Collection<? extends Object> elements) {
            AbstractC9133u.m16133g(elements, "elements");
            Iterator<T> it = elements.iterator();
            while (it.hasNext()) {
                if (!contains(it.next())) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.List
        public T get(int i10) {
            ObjectListKt.checkIndex(this, i10);
            return this.list.get(i10 + this.start);
        }

        public int getSize() {
            return this.end - this.start;
        }

        @Override // java.util.List
        public int indexOf(Object obj) {
            int i10 = this.end;
            for (int i11 = this.start; i11 < i10; i11++) {
                if (AbstractC9133u.m16128b(this.list.get(i11), obj)) {
                    return i11 - this.start;
                }
            }
            return -1;
        }

        @Override // java.util.List, java.util.Collection
        public boolean isEmpty() {
            return this.end == this.start;
        }

        @Override // java.util.List, java.util.Collection, java.lang.Iterable
        public Iterator<T> iterator() {
            return new MutableObjectListIterator(this, 0);
        }

        @Override // java.util.List
        public int lastIndexOf(Object obj) {
            int i10 = this.end - 1;
            int i11 = this.start;
            if (i11 > i10) {
                return -1;
            }
            while (!AbstractC9133u.m16128b(this.list.get(i10), obj)) {
                if (i10 == i11) {
                    return -1;
                }
                i10--;
            }
            return i10 - this.start;
        }

        @Override // java.util.List
        public ListIterator<T> listIterator() {
            return new MutableObjectListIterator(this, 0);
        }

        @Override // java.util.List
        public final /* bridge */ T remove(int i10) {
            return removeAt(i10);
        }

        @Override // java.util.List, java.util.Collection
        public boolean removeAll(Collection<? extends Object> elements) {
            AbstractC9133u.m16133g(elements, "elements");
            int i10 = this.end;
            Iterator<T> it = elements.iterator();
            while (it.hasNext()) {
                remove(it.next());
            }
            return i10 != this.end;
        }

        public T removeAt(int i10) {
            ObjectListKt.checkIndex(this, i10);
            this.end--;
            return this.list.remove(i10 + this.start);
        }

        @Override // java.util.List, java.util.Collection
        public boolean retainAll(Collection<? extends Object> elements) {
            AbstractC9133u.m16133g(elements, "elements");
            int i10 = this.end;
            int i11 = i10 - 1;
            int i12 = this.start;
            if (i12 <= i11) {
                while (true) {
                    if (!elements.contains(this.list.get(i11))) {
                        this.list.remove(i11);
                        this.end--;
                    }
                    if (i11 == i12) {
                        break;
                    }
                    i11--;
                }
            }
            return i10 != this.end;
        }

        @Override // java.util.List
        public T set(int i10, T t10) {
            ObjectListKt.checkIndex(this, i10);
            return this.list.set(i10 + this.start, t10);
        }

        @Override // java.util.List, java.util.Collection
        public final /* bridge */ int size() {
            return getSize();
        }

        @Override // java.util.List
        public List<T> subList(int i10, int i11) {
            ObjectListKt.checkSubIndex(this, i10, i11);
            return new SubList(this, i10, i11);
        }

        @Override // java.util.List, java.util.Collection
        public Object[] toArray() {
            return AbstractC9125m.m16122a(this);
        }

        @Override // java.util.List
        public void add(int i10, T t10) {
            this.list.add(i10 + this.start, t10);
            this.end++;
        }

        @Override // java.util.List
        public ListIterator<T> listIterator(int i10) {
            return new MutableObjectListIterator(this, i10);
        }

        @Override // java.util.List, java.util.Collection
        public boolean remove(Object obj) {
            int i10 = this.end;
            for (int i11 = this.start; i11 < i10; i11++) {
                if (AbstractC9133u.m16128b(this.list.get(i11), obj)) {
                    this.list.remove(i11);
                    this.end--;
                    return true;
                }
            }
            return false;
        }

        @Override // java.util.List, java.util.Collection
        public <T> T[] toArray(T[] array) {
            AbstractC9133u.m16133g(array, "array");
            return (T[]) AbstractC9125m.m16123b(this, array);
        }

        @Override // java.util.List, java.util.Collection
        public boolean addAll(Collection<? extends T> elements) {
            AbstractC9133u.m16133g(elements, "elements");
            this.list.addAll(this.end, elements);
            this.end += elements.size();
            return elements.size() > 0;
        }
    }

    public MutableObjectList() {
        this(0, 1, null);
    }

    private final void throwIndexOutOfBoundsInclusiveException(int i10) {
        RuntimeHelpersKt.throwIndexOutOfBoundsException("Index " + i10 + " must be in 0.." + this._size);
    }

    public static /* synthetic */ void trim$default(MutableObjectList mutableObjectList, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = mutableObjectList._size;
        }
        mutableObjectList.trim(i10);
    }

    public final boolean add(E e10) {
        int i10 = this._size + 1;
        Object[] objArr = this.content;
        if (objArr.length < i10) {
            resizeStorage(i10, objArr);
        }
        Object[] objArr2 = this.content;
        int i11 = this._size;
        objArr2[i11] = e10;
        this._size = i11 + 1;
        return true;
    }

    public final boolean addAll(@IntRange(from = 0) int i10, E[] elements) {
        AbstractC9133u.m16133g(elements, "elements");
        if (i10 < 0 || i10 > this._size) {
            throwIndexOutOfBoundsInclusiveException(i10);
        }
        if (elements.length == 0) {
            return false;
        }
        int length = this._size + elements.length;
        Object[] objArr = this.content;
        if (objArr.length < length) {
            resizeStorage(length, objArr);
        }
        Object[] objArr2 = this.content;
        int i11 = this._size;
        if (i10 != i11) {
            AbstractC8797p.m14649p(objArr2, objArr2, elements.length + i10, i10, i11);
        }
        AbstractC8797p.m14655v(elements, objArr2, i10, 0, 0, 12, null);
        this._size += elements.length;
        return true;
    }

    @Override // androidx.collection.ObjectList
    public List<E> asList() {
        return asMutableList();
    }

    public final List<E> asMutableList() {
        ObjectListMutableList<E> objectListMutableList = this.list;
        if (objectListMutableList != null) {
            return objectListMutableList;
        }
        ObjectListMutableList<E> objectListMutableList2 = new ObjectListMutableList<>(this);
        this.list = objectListMutableList2;
        return objectListMutableList2;
    }

    public final void clear() {
        AbstractC8797p.m14613C(this.content, null, 0, this._size);
        this._size = 0;
    }

    public final void ensureCapacity(int i10) {
        Object[] objArr = this.content;
        if (objArr.length < i10) {
            resizeStorage(i10, objArr);
        }
    }

    public final int getCapacity() {
        return this.content.length;
    }

    public final void minusAssign(E e10) {
        remove(e10);
    }

    public final void plusAssign(ObjectList<E> elements) {
        AbstractC9133u.m16133g(elements, "elements");
        if (elements.isEmpty()) {
            return;
        }
        int i10 = this._size + elements._size;
        Object[] objArr = this.content;
        if (objArr.length < i10) {
            resizeStorage(i10, objArr);
        }
        AbstractC8797p.m14649p(elements.content, this.content, this._size, 0, elements._size);
        this._size += elements._size;
    }

    public final boolean remove(E e10) {
        int iIndexOf = indexOf(e10);
        if (iIndexOf < 0) {
            return false;
        }
        removeAt(iIndexOf);
        return true;
    }

    public final boolean removeAll(E[] elements) {
        AbstractC9133u.m16133g(elements, "elements");
        int i10 = this._size;
        for (E e10 : elements) {
            remove(e10);
        }
        return i10 != this._size;
    }

    public final E removeAt(@IntRange(from = 0) int i10) {
        if (i10 < 0 || i10 >= this._size) {
            throwIndexOutOfBoundsExclusiveException$collection(i10);
        }
        Object[] objArr = this.content;
        E e10 = (E) objArr[i10];
        int i11 = this._size;
        if (i10 != i11 - 1) {
            AbstractC8797p.m14649p(objArr, objArr, i10, i10 + 1, i11);
        }
        int i12 = this._size - 1;
        this._size = i12;
        objArr[i12] = null;
        return e10;
    }

    public final void removeIf(InterfaceC10570l predicate) {
        AbstractC9133u.m16133g(predicate, "predicate");
        int i10 = this._size;
        Object[] objArr = this.content;
        int i11 = 0;
        C8321f c8321fM13525t = AbstractC8323h.m13525t(0, i10);
        int iM13496b = c8321fM13525t.m13496b();
        int iM13497c = c8321fM13525t.m13497c();
        if (iM13496b <= iM13497c) {
            while (true) {
                objArr[iM13496b - i11] = objArr[iM13496b];
                if (((Boolean) predicate.invoke(objArr[iM13496b])).booleanValue()) {
                    i11++;
                }
                if (iM13496b == iM13497c) {
                    break;
                } else {
                    iM13496b++;
                }
            }
        }
        AbstractC8797p.m14613C(objArr, null, i10 - i11, i10);
        this._size -= i11;
    }

    public final void removeRange(@IntRange(from = 0) int i10, @IntRange(from = 0) int i11) {
        int i12;
        if (i10 < 0 || i10 > (i12 = this._size) || i11 < 0 || i11 > i12) {
            RuntimeHelpersKt.throwIndexOutOfBoundsException("Start (" + i10 + ") and end (" + i11 + ") must be in 0.." + this._size);
        }
        if (i11 < i10) {
            RuntimeHelpersKt.throwIllegalArgumentException("Start (" + i10 + ") is more than end (" + i11 + ')');
        }
        if (i11 != i10) {
            int i13 = this._size;
            if (i11 < i13) {
                Object[] objArr = this.content;
                AbstractC8797p.m14649p(objArr, objArr, i10, i11, i13);
            }
            int i14 = this._size;
            int i15 = i14 - (i11 - i10);
            AbstractC8797p.m14613C(this.content, null, i15, i14);
            this._size = i15;
        }
    }

    public final void resizeStorage(int i10, Object[] oldContent) {
        AbstractC9133u.m16133g(oldContent, "oldContent");
        int length = oldContent.length;
        this.content = AbstractC8797p.m14649p(oldContent, new Object[Math.max(i10, (length * 3) / 2)], 0, 0, length);
    }

    public final boolean retainAll(E[] elements) {
        AbstractC9133u.m16133g(elements, "elements");
        int i10 = this._size;
        Object[] objArr = this.content;
        for (int i11 = i10 - 1; -1 < i11; i11--) {
            if (AbstractC8801r.m14679H0(elements, objArr[i11]) < 0) {
                removeAt(i11);
            }
        }
        return i10 != this._size;
    }

    public final E set(@IntRange(from = 0) int i10, E e10) {
        if (i10 < 0 || i10 >= this._size) {
            throwIndexOutOfBoundsExclusiveException$collection(i10);
        }
        Object[] objArr = this.content;
        E e11 = (E) objArr[i10];
        objArr[i10] = e10;
        return e11;
    }

    public final void trim(int i10) {
        int iMax = Math.max(i10, this._size);
        Object[] objArr = this.content;
        if (objArr.length > iMax) {
            Object[] objArrCopyOf = Arrays.copyOf(objArr, iMax);
            AbstractC9133u.m16132f(objArrCopyOf, "copyOf(...)");
            this.content = objArrCopyOf;
        }
    }

    public MutableObjectList(int i10) {
        super(i10, null);
    }

    public final void minusAssign(List<? extends E> elements) {
        AbstractC9133u.m16133g(elements, "elements");
        int size = elements.size();
        for (int i10 = 0; i10 < size; i10++) {
            remove(elements.get(i10));
        }
    }

    public /* synthetic */ MutableObjectList(int i10, int i11, AbstractC9126n abstractC9126n) {
        this((i11 & 1) != 0 ? 16 : i10);
    }

    public final void minusAssign(E[] elements) {
        AbstractC9133u.m16133g(elements, "elements");
        for (E e10 : elements) {
            remove(e10);
        }
    }

    public final boolean removeAll(ObjectList<E> elements) {
        AbstractC9133u.m16133g(elements, "elements");
        int i10 = this._size;
        minusAssign((ObjectList) elements);
        return i10 != this._size;
    }

    public final void add(@IntRange(from = 0) int i10, E e10) {
        if (i10 < 0 || i10 > this._size) {
            throwIndexOutOfBoundsInclusiveException(i10);
        }
        int i11 = this._size + 1;
        Object[] objArr = this.content;
        if (objArr.length < i11) {
            resizeStorage(i11, objArr);
        }
        Object[] objArr2 = this.content;
        int i12 = this._size;
        if (i10 != i12) {
            AbstractC8797p.m14649p(objArr2, objArr2, i10 + 1, i10, i12);
        }
        objArr2[i10] = e10;
        this._size++;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void minusAssign(ObjectList<E> elements) {
        AbstractC9133u.m16133g(elements, "elements");
        Object[] objArr = elements.content;
        int i10 = elements._size;
        for (int i11 = 0; i11 < i10; i11++) {
            remove(objArr[i11]);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean retainAll(ObjectList<E> elements) {
        AbstractC9133u.m16133g(elements, "elements");
        int i10 = this._size;
        Object[] objArr = this.content;
        for (int i11 = i10 - 1; -1 < i11; i11--) {
            if (!elements.contains(objArr[i11])) {
                removeAt(i11);
            }
        }
        return i10 != this._size;
    }

    public final boolean removeAll(ScatterSet<E> elements) {
        AbstractC9133u.m16133g(elements, "elements");
        int i10 = this._size;
        minusAssign((ScatterSet) elements);
        return i10 != this._size;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void minusAssign(ScatterSet<E> elements) {
        AbstractC9133u.m16133g(elements, "elements");
        Object[] objArr = elements.elements;
        long[] jArr = elements.metadata;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i10 = 0;
        while (true) {
            long j10 = jArr[i10];
            if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i11 = 8 - ((~(i10 - length)) >>> 31);
                for (int i12 = 0; i12 < i11; i12++) {
                    if ((255 & j10) < 128) {
                        remove(objArr[(i10 << 3) + i12]);
                    }
                    j10 >>= 8;
                }
                if (i11 != 8) {
                    return;
                }
            }
            if (i10 == length) {
                return;
            } else {
                i10++;
            }
        }
    }

    public final boolean removeAll(List<? extends E> elements) {
        AbstractC9133u.m16133g(elements, "elements");
        int i10 = this._size;
        minusAssign((List) elements);
        return i10 != this._size;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void plusAssign(ScatterSet<E> elements) {
        AbstractC9133u.m16133g(elements, "elements");
        if (elements.isEmpty()) {
            return;
        }
        int size = this._size + elements.getSize();
        Object[] objArr = this.content;
        if (objArr.length < size) {
            resizeStorage(size, objArr);
        }
        Object[] objArr2 = elements.elements;
        long[] jArr = elements.metadata;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i10 = 0;
        while (true) {
            long j10 = jArr[i10];
            if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i11 = 8 - ((~(i10 - length)) >>> 31);
                for (int i12 = 0; i12 < i11; i12++) {
                    if ((255 & j10) < 128) {
                        add(objArr2[(i10 << 3) + i12]);
                    }
                    j10 >>= 8;
                }
                if (i11 != 8) {
                    return;
                }
            }
            if (i10 == length) {
                return;
            } else {
                i10++;
            }
        }
    }

    public final boolean retainAll(Collection<? extends E> elements) {
        AbstractC9133u.m16133g(elements, "elements");
        int i10 = this._size;
        Object[] objArr = this.content;
        for (int i11 = i10 - 1; -1 < i11; i11--) {
            if (!elements.contains(objArr[i11])) {
                removeAt(i11);
            }
        }
        return i10 != this._size;
    }

    public final boolean addAll(@IntRange(from = 0) int i10, Collection<? extends E> elements) {
        AbstractC9133u.m16133g(elements, "elements");
        if (i10 < 0 || i10 > this._size) {
            throwIndexOutOfBoundsInclusiveException(i10);
        }
        int i11 = 0;
        if (elements.isEmpty()) {
            return false;
        }
        int size = this._size + elements.size();
        Object[] objArr = this.content;
        if (objArr.length < size) {
            resizeStorage(size, objArr);
        }
        Object[] objArr2 = this.content;
        if (i10 != this._size) {
            AbstractC8797p.m14649p(objArr2, objArr2, elements.size() + i10, i10, this._size);
        }
        for (Object obj : elements) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                AbstractC8809v.m14780w();
            }
            objArr2[i11 + i10] = obj;
            i11 = i12;
        }
        this._size += elements.size();
        return true;
    }

    public final boolean removeAll(Iterable<? extends E> elements) {
        AbstractC9133u.m16133g(elements, "elements");
        int i10 = this._size;
        minusAssign((Iterable) elements);
        return i10 != this._size;
    }

    public final void minusAssign(Iterable<? extends E> elements) {
        AbstractC9133u.m16133g(elements, "elements");
        Iterator<? extends E> it = elements.iterator();
        while (it.hasNext()) {
            remove(it.next());
        }
    }

    public final boolean removeAll(InterfaceC8469g elements) {
        AbstractC9133u.m16133g(elements, "elements");
        int i10 = this._size;
        minusAssign(elements);
        return i10 != this._size;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void minusAssign(InterfaceC8469g elements) {
        AbstractC9133u.m16133g(elements, "elements");
        Iterator it = elements.iterator();
        while (it.hasNext()) {
            remove(it.next());
        }
    }

    public final boolean retainAll(Iterable<? extends E> elements) {
        AbstractC9133u.m16133g(elements, "elements");
        int i10 = this._size;
        Object[] objArr = this.content;
        for (int i11 = i10 - 1; -1 < i11; i11--) {
            if (!AbstractC8778f0.m14556d0(elements, objArr[i11])) {
                removeAt(i11);
            }
        }
        return i10 != this._size;
    }

    public final void plusAssign(E[] elements) {
        AbstractC9133u.m16133g(elements, "elements");
        if (elements.length == 0) {
            return;
        }
        int length = this._size + elements.length;
        Object[] objArr = this.content;
        if (objArr.length < length) {
            resizeStorage(length, objArr);
        }
        AbstractC8797p.m14655v(elements, this.content, this._size, 0, 0, 12, null);
        this._size += elements.length;
    }

    public final boolean retainAll(InterfaceC8469g elements) {
        AbstractC9133u.m16133g(elements, "elements");
        int i10 = this._size;
        Object[] objArr = this.content;
        for (int i11 = i10 - 1; -1 < i11; i11--) {
            if (!AbstractC8479q.m13846o(elements, objArr[i11])) {
                removeAt(i11);
            }
        }
        return i10 != this._size;
    }

    public final boolean addAll(@IntRange(from = 0) int i10, ObjectList<E> elements) {
        AbstractC9133u.m16133g(elements, "elements");
        if (i10 < 0 || i10 > this._size) {
            throwIndexOutOfBoundsInclusiveException(i10);
        }
        if (elements.isEmpty()) {
            return false;
        }
        int i11 = this._size + elements._size;
        Object[] objArr = this.content;
        if (objArr.length < i11) {
            resizeStorage(i11, objArr);
        }
        Object[] objArr2 = this.content;
        int i12 = this._size;
        if (i10 != i12) {
            AbstractC8797p.m14649p(objArr2, objArr2, elements._size + i10, i10, i12);
        }
        AbstractC8797p.m14649p(elements.content, objArr2, i10, 0, elements._size);
        this._size += elements._size;
        return true;
    }

    public final void plusAssign(List<? extends E> elements) {
        AbstractC9133u.m16133g(elements, "elements");
        if (elements.isEmpty()) {
            return;
        }
        int i10 = this._size;
        int size = elements.size() + i10;
        Object[] objArr = this.content;
        if (objArr.length < size) {
            resizeStorage(size, objArr);
        }
        Object[] objArr2 = this.content;
        int size2 = elements.size();
        for (int i11 = 0; i11 < size2; i11++) {
            objArr2[i11 + i10] = elements.get(i11);
        }
        this._size += elements.size();
    }

    public final void plusAssign(E e10) {
        add(e10);
    }

    public final void plusAssign(Iterable<? extends E> elements) {
        AbstractC9133u.m16133g(elements, "elements");
        Iterator<? extends E> it = elements.iterator();
        while (it.hasNext()) {
            add(it.next());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void plusAssign(InterfaceC8469g elements) {
        AbstractC9133u.m16133g(elements, "elements");
        Iterator it = elements.iterator();
        while (it.hasNext()) {
            add(it.next());
        }
    }

    public final boolean addAll(ObjectList<E> elements) {
        AbstractC9133u.m16133g(elements, "elements");
        int i10 = this._size;
        plusAssign((ObjectList) elements);
        return i10 != this._size;
    }

    public final boolean addAll(ScatterSet<E> elements) {
        AbstractC9133u.m16133g(elements, "elements");
        int i10 = this._size;
        plusAssign((ScatterSet) elements);
        return i10 != this._size;
    }

    public final boolean addAll(E[] elements) {
        AbstractC9133u.m16133g(elements, "elements");
        int i10 = this._size;
        plusAssign((Object[]) elements);
        return i10 != this._size;
    }

    public final boolean addAll(List<? extends E> elements) {
        AbstractC9133u.m16133g(elements, "elements");
        int i10 = this._size;
        plusAssign((List) elements);
        return i10 != this._size;
    }

    public final boolean addAll(Iterable<? extends E> elements) {
        AbstractC9133u.m16133g(elements, "elements");
        int i10 = this._size;
        plusAssign((Iterable) elements);
        return i10 != this._size;
    }

    public final boolean addAll(InterfaceC8469g elements) {
        AbstractC9133u.m16133g(elements, "elements");
        int i10 = this._size;
        plusAssign(elements);
        return i10 != this._size;
    }
}
