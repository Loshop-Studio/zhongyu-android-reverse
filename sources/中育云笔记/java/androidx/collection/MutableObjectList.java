package androidx.collection;

import androidx.annotation.IntRange;
import androidx.collection.internal.RuntimeHelpersKt;
import id.InterfaceC9624a;
import id.InterfaceC9627d;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.jvm.internal.AbstractC9971m;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9540l;
import p265nd.AbstractC10410o;
import p265nd.C10405j;
import p296pd.AbstractC10669q;
import p296pd.InterfaceC10659g;
import p325rc.AbstractC10947g0;
import p325rc.AbstractC10964p;
import p325rc.AbstractC10968r;
import p325rc.AbstractC10978w;

/* loaded from: classes.dex */
public final class MutableObjectList<E> extends ObjectList<E> {
    private ObjectListMutableList<E> list;

    public static final class MutableObjectListIterator<T> implements ListIterator<T>, InterfaceC9624a {
        private final List<T> list;
        private int prevIndex;

        public MutableObjectListIterator(List<T> list, int i10) {
            AbstractC9979u.m20294g(list, "list");
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

    public static final class ObjectListMutableList<T> implements List<T>, InterfaceC9627d {
        private final MutableObjectList<T> objectList;

        public ObjectListMutableList(MutableObjectList<T> objectList) {
            AbstractC9979u.m20294g(objectList, "objectList");
            this.objectList = objectList;
        }

        @Override // java.util.List, java.util.Collection
        public boolean add(T t10) {
            return this.objectList.add(t10);
        }

        @Override // java.util.List
        public boolean addAll(int i10, Collection<? extends T> elements) {
            AbstractC9979u.m20294g(elements, "elements");
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
            AbstractC9979u.m20294g(elements, "elements");
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
            AbstractC9979u.m20294g(elements, "elements");
            return this.objectList.removeAll(elements);
        }

        public T removeAt(int i10) {
            ObjectListKt.checkIndex(this, i10);
            return this.objectList.removeAt(i10);
        }

        @Override // java.util.List, java.util.Collection
        public boolean retainAll(Collection<? extends Object> elements) {
            AbstractC9979u.m20294g(elements, "elements");
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
            return AbstractC9971m.m20283a(this);
        }

        @Override // java.util.List
        public void add(int i10, T t10) {
            this.objectList.add(i10, t10);
        }

        @Override // java.util.List, java.util.Collection
        public boolean addAll(Collection<? extends T> elements) {
            AbstractC9979u.m20294g(elements, "elements");
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
            AbstractC9979u.m20294g(array, "array");
            return (T[]) AbstractC9971m.m20284b(this, array);
        }
    }

    public static final class SubList<T> implements List<T>, InterfaceC9627d {
        private int end;
        private final List<T> list;
        private final int start;

        public SubList(List<T> list, int i10, int i11) {
            AbstractC9979u.m20294g(list, "list");
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
            AbstractC9979u.m20294g(elements, "elements");
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
                if (AbstractC9979u.m20289b(this.list.get(i11), obj)) {
                    return true;
                }
            }
            return false;
        }

        @Override // java.util.List, java.util.Collection
        public boolean containsAll(Collection<? extends Object> elements) {
            AbstractC9979u.m20294g(elements, "elements");
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
                if (AbstractC9979u.m20289b(this.list.get(i11), obj)) {
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
            while (!AbstractC9979u.m20289b(this.list.get(i10), obj)) {
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
            AbstractC9979u.m20294g(elements, "elements");
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
            AbstractC9979u.m20294g(elements, "elements");
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
            return AbstractC9971m.m20283a(this);
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
                if (AbstractC9979u.m20289b(this.list.get(i11), obj)) {
                    this.list.remove(i11);
                    this.end--;
                    return true;
                }
            }
            return false;
        }

        @Override // java.util.List, java.util.Collection
        public <T> T[] toArray(T[] array) {
            AbstractC9979u.m20294g(array, "array");
            return (T[]) AbstractC9971m.m20284b(this, array);
        }

        @Override // java.util.List, java.util.Collection
        public boolean addAll(Collection<? extends T> elements) {
            AbstractC9979u.m20294g(elements, "elements");
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
        AbstractC9979u.m20294g(elements, "elements");
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
            AbstractC10964p.m24023p(objArr2, objArr2, elements.length + i10, i10, i11);
        }
        AbstractC10964p.m24029v(elements, objArr2, i10, 0, 0, 12, null);
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
        AbstractC10964p.m23987B(this.content, null, 0, this._size);
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
        AbstractC9979u.m20294g(elements, "elements");
        if (elements.isEmpty()) {
            return;
        }
        int i10 = this._size + elements._size;
        Object[] objArr = this.content;
        if (objArr.length < i10) {
            resizeStorage(i10, objArr);
        }
        AbstractC10964p.m24023p(elements.content, this.content, this._size, 0, elements._size);
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
        AbstractC9979u.m20294g(elements, "elements");
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
            AbstractC10964p.m24023p(objArr, objArr, i10, i10 + 1, i11);
        }
        int i12 = this._size - 1;
        this._size = i12;
        objArr[i12] = null;
        return e10;
    }

    public final void removeIf(InterfaceC9540l predicate) {
        AbstractC9979u.m20294g(predicate, "predicate");
        int i10 = this._size;
        Object[] objArr = this.content;
        int i11 = 0;
        C10405j c10405jM21768u = AbstractC10410o.m21768u(0, i10);
        int iM21733b = c10405jM21768u.m21733b();
        int iM21734c = c10405jM21768u.m21734c();
        if (iM21733b <= iM21734c) {
            while (true) {
                objArr[iM21733b - i11] = objArr[iM21733b];
                if (((Boolean) predicate.invoke(objArr[iM21733b])).booleanValue()) {
                    i11++;
                }
                if (iM21733b == iM21734c) {
                    break;
                } else {
                    iM21733b++;
                }
            }
        }
        AbstractC10964p.m23987B(objArr, null, i10 - i11, i10);
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
                AbstractC10964p.m24023p(objArr, objArr, i10, i11, i13);
            }
            int i14 = this._size;
            int i15 = i14 - (i11 - i10);
            AbstractC10964p.m23987B(this.content, null, i15, i14);
            this._size = i15;
        }
    }

    public final void resizeStorage(int i10, Object[] oldContent) {
        AbstractC9979u.m20294g(oldContent, "oldContent");
        int length = oldContent.length;
        this.content = AbstractC10964p.m24023p(oldContent, new Object[Math.max(i10, (length * 3) / 2)], 0, 0, length);
    }

    public final boolean retainAll(E[] elements) {
        AbstractC9979u.m20294g(elements, "elements");
        int i10 = this._size;
        Object[] objArr = this.content;
        for (int i11 = i10 - 1; -1 < i11; i11--) {
            if (AbstractC10968r.m24048G0(elements, objArr[i11]) < 0) {
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
            AbstractC9979u.m20293f(objArrCopyOf, "copyOf(...)");
            this.content = objArrCopyOf;
        }
    }

    public MutableObjectList(int i10) {
        super(i10, null);
    }

    public final void minusAssign(List<? extends E> elements) {
        AbstractC9979u.m20294g(elements, "elements");
        int size = elements.size();
        for (int i10 = 0; i10 < size; i10++) {
            remove(elements.get(i10));
        }
    }

    public /* synthetic */ MutableObjectList(int i10, int i11, AbstractC9972n abstractC9972n) {
        this((i11 & 1) != 0 ? 16 : i10);
    }

    public final void minusAssign(E[] elements) {
        AbstractC9979u.m20294g(elements, "elements");
        for (E e10 : elements) {
            remove(e10);
        }
    }

    public final boolean removeAll(ObjectList<E> elements) {
        AbstractC9979u.m20294g(elements, "elements");
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
            AbstractC10964p.m24023p(objArr2, objArr2, i10 + 1, i10, i12);
        }
        objArr2[i10] = e10;
        this._size++;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void minusAssign(ObjectList<E> elements) {
        AbstractC9979u.m20294g(elements, "elements");
        Object[] objArr = elements.content;
        int i10 = elements._size;
        for (int i11 = 0; i11 < i10; i11++) {
            remove(objArr[i11]);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean retainAll(ObjectList<E> elements) {
        AbstractC9979u.m20294g(elements, "elements");
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
        AbstractC9979u.m20294g(elements, "elements");
        int i10 = this._size;
        minusAssign((ScatterSet) elements);
        return i10 != this._size;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void minusAssign(ScatterSet<E> elements) {
        AbstractC9979u.m20294g(elements, "elements");
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
        AbstractC9979u.m20294g(elements, "elements");
        int i10 = this._size;
        minusAssign((List) elements);
        return i10 != this._size;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void plusAssign(ScatterSet<E> elements) {
        AbstractC9979u.m20294g(elements, "elements");
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
        AbstractC9979u.m20294g(elements, "elements");
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
        AbstractC9979u.m20294g(elements, "elements");
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
            AbstractC10964p.m24023p(objArr2, objArr2, elements.size() + i10, i10, this._size);
        }
        for (Object obj : elements) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                AbstractC10978w.m24145w();
            }
            objArr2[i11 + i10] = obj;
            i11 = i12;
        }
        this._size += elements.size();
        return true;
    }

    public final boolean removeAll(Iterable<? extends E> elements) {
        AbstractC9979u.m20294g(elements, "elements");
        int i10 = this._size;
        minusAssign((Iterable) elements);
        return i10 != this._size;
    }

    public final void minusAssign(Iterable<? extends E> elements) {
        AbstractC9979u.m20294g(elements, "elements");
        Iterator<? extends E> it = elements.iterator();
        while (it.hasNext()) {
            remove(it.next());
        }
    }

    public final boolean removeAll(InterfaceC10659g elements) {
        AbstractC9979u.m20294g(elements, "elements");
        int i10 = this._size;
        minusAssign(elements);
        return i10 != this._size;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void minusAssign(InterfaceC10659g elements) {
        AbstractC9979u.m20294g(elements, "elements");
        Iterator it = elements.iterator();
        while (it.hasNext()) {
            remove(it.next());
        }
    }

    public final boolean retainAll(Iterable<? extends E> elements) {
        AbstractC9979u.m20294g(elements, "elements");
        int i10 = this._size;
        Object[] objArr = this.content;
        for (int i11 = i10 - 1; -1 < i11; i11--) {
            if (!AbstractC10947g0.m23932e0(elements, objArr[i11])) {
                removeAt(i11);
            }
        }
        return i10 != this._size;
    }

    public final void plusAssign(E[] elements) {
        AbstractC9979u.m20294g(elements, "elements");
        if (elements.length == 0) {
            return;
        }
        int length = this._size + elements.length;
        Object[] objArr = this.content;
        if (objArr.length < length) {
            resizeStorage(length, objArr);
        }
        AbstractC10964p.m24029v(elements, this.content, this._size, 0, 0, 12, null);
        this._size += elements.length;
    }

    public final boolean retainAll(InterfaceC10659g elements) {
        AbstractC9979u.m20294g(elements, "elements");
        int i10 = this._size;
        Object[] objArr = this.content;
        for (int i11 = i10 - 1; -1 < i11; i11--) {
            if (!AbstractC10669q.m22577o(elements, objArr[i11])) {
                removeAt(i11);
            }
        }
        return i10 != this._size;
    }

    public final boolean addAll(@IntRange(from = 0) int i10, ObjectList<E> elements) {
        AbstractC9979u.m20294g(elements, "elements");
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
            AbstractC10964p.m24023p(objArr2, objArr2, elements._size + i10, i10, i12);
        }
        AbstractC10964p.m24023p(elements.content, objArr2, i10, 0, elements._size);
        this._size += elements._size;
        return true;
    }

    public final void plusAssign(List<? extends E> elements) {
        AbstractC9979u.m20294g(elements, "elements");
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
        AbstractC9979u.m20294g(elements, "elements");
        Iterator<? extends E> it = elements.iterator();
        while (it.hasNext()) {
            add(it.next());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void plusAssign(InterfaceC10659g elements) {
        AbstractC9979u.m20294g(elements, "elements");
        Iterator it = elements.iterator();
        while (it.hasNext()) {
            add(it.next());
        }
    }

    public final boolean addAll(ObjectList<E> elements) {
        AbstractC9979u.m20294g(elements, "elements");
        int i10 = this._size;
        plusAssign((ObjectList) elements);
        return i10 != this._size;
    }

    public final boolean addAll(ScatterSet<E> elements) {
        AbstractC9979u.m20294g(elements, "elements");
        int i10 = this._size;
        plusAssign((ScatterSet) elements);
        return i10 != this._size;
    }

    public final boolean addAll(E[] elements) {
        AbstractC9979u.m20294g(elements, "elements");
        int i10 = this._size;
        plusAssign((Object[]) elements);
        return i10 != this._size;
    }

    public final boolean addAll(List<? extends E> elements) {
        AbstractC9979u.m20294g(elements, "elements");
        int i10 = this._size;
        plusAssign((List) elements);
        return i10 != this._size;
    }

    public final boolean addAll(Iterable<? extends E> elements) {
        AbstractC9979u.m20294g(elements, "elements");
        int i10 = this._size;
        plusAssign((Iterable) elements);
        return i10 != this._size;
    }

    public final boolean addAll(InterfaceC10659g elements) {
        AbstractC9979u.m20294g(elements, "elements");
        int i10 = this._size;
        plusAssign(elements);
        return i10 != this._size;
    }
}
