package androidx.compose.runtime.collection;

import androidx.compose.runtime.internal.StabilityInferred;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import kotlin.KotlinNothingValueException;
import kotlin.jvm.internal.AbstractC9125m;
import kotlin.jvm.internal.AbstractC9133u;
import p077d8.AbstractC8323h;
import p077d8.C8321f;
import p134i7.AbstractC8797p;
import p134i7.AbstractC8809v;
import p300x7.InterfaceC10570l;
import p300x7.InterfaceC10574p;
import p300x7.InterfaceC10575q;
import p311y7.InterfaceC10668a;
import p311y7.InterfaceC10671d;

@StabilityInferred(parameters = 0)
/* loaded from: classes2.dex */
public final class MutableVector<T> implements RandomAccess {
    public static final int $stable = 8;
    public T[] content;
    private List<T> list;
    private int size;

    public static final class MutableVectorList<T> implements List<T>, InterfaceC10671d {
        private final MutableVector<T> vector;

        public MutableVectorList(MutableVector<T> mutableVector) {
            this.vector = mutableVector;
        }

        @Override // java.util.List, java.util.Collection
        public boolean add(T t10) {
            return this.vector.add(t10);
        }

        @Override // java.util.List
        public boolean addAll(int i10, Collection<? extends T> collection) {
            return this.vector.addAll(i10, collection);
        }

        @Override // java.util.List, java.util.Collection
        public void clear() {
            this.vector.clear();
        }

        @Override // java.util.List, java.util.Collection
        public boolean contains(Object obj) {
            return this.vector.contains(obj);
        }

        @Override // java.util.List, java.util.Collection
        public boolean containsAll(Collection<? extends Object> collection) {
            return this.vector.containsAll(collection);
        }

        @Override // java.util.List
        public T get(int i10) {
            MutableVectorKt.checkIndex(this, i10);
            return this.vector.content[i10];
        }

        public int getSize() {
            return this.vector.getSize();
        }

        @Override // java.util.List
        public int indexOf(Object obj) {
            return this.vector.indexOf(obj);
        }

        @Override // java.util.List, java.util.Collection
        public boolean isEmpty() {
            return this.vector.getSize() == 0;
        }

        @Override // java.util.List, java.util.Collection, java.lang.Iterable
        public Iterator<T> iterator() {
            return new VectorListIterator(this, 0);
        }

        @Override // java.util.List
        public int lastIndexOf(Object obj) {
            return this.vector.lastIndexOf(obj);
        }

        @Override // java.util.List
        public ListIterator<T> listIterator() {
            return new VectorListIterator(this, 0);
        }

        @Override // java.util.List
        public final /* bridge */ T remove(int i10) {
            return removeAt(i10);
        }

        @Override // java.util.List, java.util.Collection
        public boolean removeAll(Collection<? extends Object> collection) {
            return this.vector.removeAll(collection);
        }

        public T removeAt(int i10) {
            MutableVectorKt.checkIndex(this, i10);
            return this.vector.removeAt(i10);
        }

        @Override // java.util.List, java.util.Collection
        public boolean retainAll(Collection<? extends Object> collection) {
            return this.vector.retainAll(collection);
        }

        @Override // java.util.List
        public T set(int i10, T t10) {
            MutableVectorKt.checkIndex(this, i10);
            return this.vector.set(i10, t10);
        }

        @Override // java.util.List, java.util.Collection
        public final /* bridge */ int size() {
            return getSize();
        }

        @Override // java.util.List
        public List<T> subList(int i10, int i11) {
            MutableVectorKt.checkSubIndex(this, i10, i11);
            return new SubList(this, i10, i11);
        }

        @Override // java.util.List, java.util.Collection
        public Object[] toArray() {
            return AbstractC9125m.m16122a(this);
        }

        @Override // java.util.List
        public void add(int i10, T t10) {
            this.vector.add(i10, t10);
        }

        @Override // java.util.List, java.util.Collection
        public boolean addAll(Collection<? extends T> collection) {
            return this.vector.addAll(collection);
        }

        @Override // java.util.List
        public ListIterator<T> listIterator(int i10) {
            return new VectorListIterator(this, i10);
        }

        @Override // java.util.List, java.util.Collection
        public boolean remove(Object obj) {
            return this.vector.remove(obj);
        }

        @Override // java.util.List, java.util.Collection
        public <T> T[] toArray(T[] tArr) {
            return (T[]) AbstractC9125m.m16123b(this, tArr);
        }
    }

    public static final class SubList<T> implements List<T>, InterfaceC10671d {
        private int end;
        private final List<T> list;
        private final int start;

        public SubList(List<T> list, int i10, int i11) {
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
        public boolean addAll(int i10, Collection<? extends T> collection) {
            this.list.addAll(i10 + this.start, collection);
            int size = collection.size();
            this.end += size;
            return size > 0;
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
        public boolean containsAll(Collection<? extends Object> collection) {
            Iterator<T> it = collection.iterator();
            while (it.hasNext()) {
                if (!contains(it.next())) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.List
        public T get(int i10) {
            MutableVectorKt.checkIndex(this, i10);
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
            return new VectorListIterator(this, 0);
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
            return new VectorListIterator(this, 0);
        }

        @Override // java.util.List
        public final /* bridge */ T remove(int i10) {
            return removeAt(i10);
        }

        @Override // java.util.List, java.util.Collection
        public boolean removeAll(Collection<? extends Object> collection) {
            int i10 = this.end;
            Iterator<T> it = collection.iterator();
            while (it.hasNext()) {
                remove(it.next());
            }
            return i10 != this.end;
        }

        public T removeAt(int i10) {
            MutableVectorKt.checkIndex(this, i10);
            this.end--;
            return this.list.remove(i10 + this.start);
        }

        @Override // java.util.List, java.util.Collection
        public boolean retainAll(Collection<? extends Object> collection) {
            int i10 = this.end;
            int i11 = i10 - 1;
            int i12 = this.start;
            if (i12 <= i11) {
                while (true) {
                    if (!collection.contains(this.list.get(i11))) {
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
            MutableVectorKt.checkIndex(this, i10);
            return this.list.set(i10 + this.start, t10);
        }

        @Override // java.util.List, java.util.Collection
        public final /* bridge */ int size() {
            return getSize();
        }

        @Override // java.util.List
        public List<T> subList(int i10, int i11) {
            MutableVectorKt.checkSubIndex(this, i10, i11);
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
            return new VectorListIterator(this, i10);
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
        public <T> T[] toArray(T[] tArr) {
            return (T[]) AbstractC9125m.m16123b(this, tArr);
        }

        @Override // java.util.List, java.util.Collection
        public boolean addAll(Collection<? extends T> collection) {
            this.list.addAll(this.end, collection);
            int size = collection.size();
            this.end += size;
            return size > 0;
        }
    }

    public static final class VectorListIterator<T> implements ListIterator<T>, InterfaceC10668a {
        private int index;
        private final List<T> list;

        public VectorListIterator(List<T> list, int i10) {
            this.list = list;
            this.index = i10;
        }

        @Override // java.util.ListIterator
        public void add(T t10) {
            this.list.add(this.index, t10);
            this.index++;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
            return this.index < this.list.size();
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return this.index > 0;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public T next() {
            List<T> list = this.list;
            int i10 = this.index;
            this.index = i10 + 1;
            return list.get(i10);
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return this.index;
        }

        @Override // java.util.ListIterator
        public T previous() {
            int i10 = this.index - 1;
            this.index = i10;
            return this.list.get(i10);
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return this.index - 1;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public void remove() {
            int i10 = this.index - 1;
            this.index = i10;
            this.list.remove(i10);
        }

        @Override // java.util.ListIterator
        public void set(T t10) {
            this.list.set(this.index, t10);
        }
    }

    public MutableVector(T[] tArr, int i10) {
        this.content = tArr;
        this.size = i10;
    }

    public static /* synthetic */ void getContent$annotations() {
    }

    public final boolean add(T t10) {
        int i10 = this.size + 1;
        if (this.content.length < i10) {
            resizeStorage(i10);
        }
        T[] tArr = this.content;
        int i11 = this.size;
        tArr[i11] = t10;
        this.size = i11 + 1;
        return true;
    }

    public final boolean addAll(int i10, List<? extends T> list) {
        if (list.isEmpty()) {
            return false;
        }
        int size = list.size();
        int i11 = this.size + size;
        if (this.content.length < i11) {
            resizeStorage(i11);
        }
        T[] tArr = this.content;
        int i12 = this.size;
        if (i10 != i12) {
            System.arraycopy(tArr, i10, tArr, i10 + size, i12 - i10);
        }
        int size2 = list.size();
        for (int i13 = 0; i13 < size2; i13++) {
            tArr[i10 + i13] = list.get(i13);
        }
        this.size += size;
        return true;
    }

    public final boolean any(InterfaceC10570l interfaceC10570l) {
        T[] tArr = this.content;
        int size = getSize();
        for (int i10 = 0; i10 < size; i10++) {
            if (((Boolean) interfaceC10570l.invoke(tArr[i10])).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    public final List<T> asMutableList() {
        List<T> list = this.list;
        if (list != null) {
            return list;
        }
        MutableVectorList mutableVectorList = new MutableVectorList(this);
        this.list = mutableVectorList;
        return mutableVectorList;
    }

    public final void clear() {
        T[] tArr = this.content;
        int i10 = this.size;
        for (int i11 = 0; i11 < i10; i11++) {
            tArr[i11] = null;
        }
        this.size = 0;
    }

    public final boolean contains(T t10) {
        int size = getSize() - 1;
        if (size >= 0) {
            for (int i10 = 0; !AbstractC9133u.m16128b(this.content[i10], t10); i10++) {
                if (i10 != size) {
                }
            }
            return true;
        }
        return false;
    }

    public final boolean containsAll(List<? extends T> list) {
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (!contains(list.get(i10))) {
                return false;
            }
        }
        return true;
    }

    public final boolean contentEquals(MutableVector<T> mutableVector) {
        if (mutableVector.size != this.size) {
            return false;
        }
        int size = getSize() - 1;
        if (size >= 0) {
            for (int i10 = 0; AbstractC9133u.m16128b(mutableVector.content[i10], this.content[i10]); i10++) {
                if (i10 != size) {
                }
            }
            return false;
        }
        return true;
    }

    public final void ensureCapacity(int i10) {
        if (this.content.length < i10) {
            resizeStorage(i10);
        }
    }

    public final T first(InterfaceC10570l interfaceC10570l) {
        T[] tArr = this.content;
        int size = getSize();
        for (int i10 = 0; i10 < size; i10++) {
            T t10 = tArr[i10];
            if (((Boolean) interfaceC10570l.invoke(t10)).booleanValue()) {
                return t10;
            }
        }
        throwNoSuchElementException("MutableVector contains no element matching the predicate.");
        throw new KotlinNothingValueException();
    }

    public final T firstOrNull(InterfaceC10570l interfaceC10570l) {
        T[] tArr = this.content;
        int size = getSize();
        for (int i10 = 0; i10 < size; i10++) {
            T t10 = tArr[i10];
            if (((Boolean) interfaceC10570l.invoke(t10)).booleanValue()) {
                return t10;
            }
        }
        return null;
    }

    public final <R> R fold(R r10, InterfaceC10574p interfaceC10574p) {
        T[] tArr = this.content;
        int size = getSize();
        for (int i10 = 0; i10 < size; i10++) {
            r10 = (R) interfaceC10574p.invoke(r10, tArr[i10]);
        }
        return r10;
    }

    public final <R> R foldIndexed(R r10, InterfaceC10575q interfaceC10575q) {
        T[] tArr = this.content;
        int size = getSize();
        for (int i10 = 0; i10 < size; i10++) {
            r10 = (R) interfaceC10575q.invoke(Integer.valueOf(i10), r10, tArr[i10]);
        }
        return r10;
    }

    public final <R> R foldRight(R r10, InterfaceC10574p interfaceC10574p) {
        int size = getSize() - 1;
        T[] tArr = this.content;
        if (size >= tArr.length) {
            return r10;
        }
        while (size >= 0) {
            r10 = (R) interfaceC10574p.invoke(tArr[size], r10);
            size--;
        }
        return r10;
    }

    public final <R> R foldRightIndexed(R r10, InterfaceC10575q interfaceC10575q) {
        int size = getSize() - 1;
        T[] tArr = this.content;
        if (size >= tArr.length) {
            return r10;
        }
        while (size >= 0) {
            r10 = (R) interfaceC10575q.invoke(Integer.valueOf(size), tArr[size], r10);
            size--;
        }
        return r10;
    }

    public final void forEach(InterfaceC10570l interfaceC10570l) {
        T[] tArr = this.content;
        int size = getSize();
        for (int i10 = 0; i10 < size; i10++) {
            interfaceC10570l.invoke(tArr[i10]);
        }
    }

    public final void forEachIndexed(InterfaceC10574p interfaceC10574p) {
        T[] tArr = this.content;
        int size = getSize();
        for (int i10 = 0; i10 < size; i10++) {
            interfaceC10574p.invoke(Integer.valueOf(i10), tArr[i10]);
        }
    }

    public final void forEachReversed(InterfaceC10570l interfaceC10570l) {
        int size = getSize() - 1;
        T[] tArr = this.content;
        if (size >= tArr.length) {
            return;
        }
        while (size >= 0) {
            interfaceC10570l.invoke(tArr[size]);
            size--;
        }
    }

    public final void forEachReversedIndexed(InterfaceC10574p interfaceC10574p) {
        int size = getSize() - 1;
        T[] tArr = this.content;
        if (size >= tArr.length) {
            return;
        }
        while (size >= 0) {
            interfaceC10574p.invoke(Integer.valueOf(size), tArr[size]);
            size--;
        }
    }

    public final T get(int i10) {
        return this.content[i10];
    }

    public final T[] getContent() {
        return this.content;
    }

    public final C8321f getIndices() {
        return AbstractC8323h.m13525t(0, getSize());
    }

    public final int getLastIndex() {
        return getSize() - 1;
    }

    public final int getSize() {
        return this.size;
    }

    public final int indexOf(T t10) {
        T[] tArr = this.content;
        int i10 = this.size;
        for (int i11 = 0; i11 < i10; i11++) {
            if (AbstractC9133u.m16128b(t10, tArr[i11])) {
                return i11;
            }
        }
        return -1;
    }

    public final int indexOfFirst(InterfaceC10570l interfaceC10570l) {
        T[] tArr = this.content;
        int size = getSize();
        for (int i10 = 0; i10 < size; i10++) {
            if (((Boolean) interfaceC10570l.invoke(tArr[i10])).booleanValue()) {
                return i10;
            }
        }
        return -1;
    }

    public final int indexOfLast(InterfaceC10570l interfaceC10570l) {
        int size = getSize() - 1;
        T[] tArr = this.content;
        if (size >= tArr.length) {
            return -1;
        }
        while (size >= 0) {
            if (((Boolean) interfaceC10570l.invoke(tArr[size])).booleanValue()) {
                return size;
            }
            size--;
        }
        return -1;
    }

    public final boolean isEmpty() {
        return getSize() == 0;
    }

    public final boolean isNotEmpty() {
        return getSize() != 0;
    }

    public final T last(InterfaceC10570l interfaceC10570l) {
        T[] tArr = this.content;
        for (int size = getSize() - 1; size >= 0; size--) {
            T t10 = tArr[size];
            if (((Boolean) interfaceC10570l.invoke(t10)).booleanValue()) {
                return t10;
            }
        }
        throwNoSuchElementException("MutableVector contains no element matching the predicate.");
        throw new KotlinNothingValueException();
    }

    public final int lastIndexOf(T t10) {
        T[] tArr = this.content;
        for (int i10 = this.size - 1; i10 >= 0; i10--) {
            if (AbstractC9133u.m16128b(t10, tArr[i10])) {
                return i10;
            }
        }
        return -1;
    }

    public final T lastOrNull(InterfaceC10570l interfaceC10570l) {
        T[] tArr = this.content;
        for (int size = getSize() - 1; size >= 0; size--) {
            T t10 = tArr[size];
            if (((Boolean) interfaceC10570l.invoke(t10)).booleanValue()) {
                return t10;
            }
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final /* synthetic */ <R> R[] map(InterfaceC10570l interfaceC10570l) {
        int size = getSize();
        AbstractC9133u.m16139m(0, "R");
        R[] rArr = (R[]) new Object[size];
        for (int i10 = 0; i10 < size; i10++) {
            rArr[i10] = interfaceC10570l.invoke(this.content[i10]);
        }
        return rArr;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final /* synthetic */ <R> R[] mapIndexed(InterfaceC10574p interfaceC10574p) {
        int size = getSize();
        AbstractC9133u.m16139m(0, "R");
        R[] rArr = (R[]) new Object[size];
        for (int i10 = 0; i10 < size; i10++) {
            rArr[i10] = interfaceC10574p.invoke(Integer.valueOf(i10), this.content[i10]);
        }
        return rArr;
    }

    public final /* synthetic */ <R> MutableVector<R> mapIndexedNotNull(InterfaceC10574p interfaceC10574p) {
        int size = getSize();
        AbstractC9133u.m16139m(0, "R?");
        Object[] objArr = new Object[size];
        T[] tArr = this.content;
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            Object objInvoke = interfaceC10574p.invoke(Integer.valueOf(i11), tArr[i11]);
            if (objInvoke != null) {
                objArr[i10] = objInvoke;
                i10++;
            }
        }
        return new MutableVector<>(objArr, i10);
    }

    public final /* synthetic */ <R> MutableVector<R> mapNotNull(InterfaceC10570l interfaceC10570l) {
        int size = getSize();
        AbstractC9133u.m16139m(0, "R?");
        Object[] objArr = new Object[size];
        T[] tArr = this.content;
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            Object objInvoke = interfaceC10570l.invoke(tArr[i11]);
            if (objInvoke != null) {
                objArr[i10] = objInvoke;
                i10++;
            }
        }
        return new MutableVector<>(objArr, i10);
    }

    public final void minusAssign(T t10) {
        remove(t10);
    }

    public final void plusAssign(T t10) {
        add(t10);
    }

    public final boolean remove(T t10) {
        int iIndexOf = indexOf(t10);
        if (iIndexOf < 0) {
            return false;
        }
        removeAt(iIndexOf);
        return true;
    }

    public final boolean removeAll(List<? extends T> list) {
        int i10 = this.size;
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            remove(list.get(i11));
        }
        return i10 != this.size;
    }

    public final T removeAt(int i10) {
        T[] tArr = this.content;
        T t10 = tArr[i10];
        if (i10 != getSize() - 1) {
            int i11 = i10 + 1;
            System.arraycopy(tArr, i11, tArr, i10, this.size - i11);
        }
        int i12 = this.size - 1;
        this.size = i12;
        tArr[i12] = null;
        return t10;
    }

    public final void removeIf(InterfaceC10570l interfaceC10570l) {
        int size = getSize();
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            if (((Boolean) interfaceC10570l.invoke(this.content[i11])).booleanValue()) {
                i10++;
            } else if (i10 > 0) {
                T[] tArr = this.content;
                tArr[i11 - i10] = tArr[i11];
            }
        }
        int i12 = size - i10;
        AbstractC8797p.m14613C(this.content, null, i12, size);
        setSize(i12);
    }

    public final void removeRange(int i10, int i11) {
        if (i11 > i10) {
            int i12 = this.size;
            if (i11 < i12) {
                T[] tArr = this.content;
                System.arraycopy(tArr, i11, tArr, i10, i12 - i11);
            }
            int i13 = this.size - (i11 - i10);
            int size = getSize() - 1;
            if (i13 <= size) {
                int i14 = i13;
                while (true) {
                    this.content[i14] = null;
                    if (i14 == size) {
                        break;
                    } else {
                        i14++;
                    }
                }
            }
            this.size = i13;
        }
    }

    public final void resizeStorage(int i10) {
        T[] tArr = this.content;
        int length = tArr.length;
        T[] tArr2 = (T[]) new Object[Math.max(i10, length * 2)];
        System.arraycopy(tArr, 0, tArr2, 0, length);
        this.content = tArr2;
    }

    public final boolean retainAll(Collection<? extends T> collection) {
        int i10 = this.size;
        for (int size = getSize() - 1; -1 < size; size--) {
            if (!collection.contains(this.content[size])) {
                removeAt(size);
            }
        }
        return i10 != this.size;
    }

    public final boolean reversedAny(InterfaceC10570l interfaceC10570l) {
        T[] tArr = this.content;
        for (int size = getSize() - 1; size >= 0; size--) {
            if (((Boolean) interfaceC10570l.invoke(tArr[size])).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    public final T set(int i10, T t10) {
        T[] tArr = this.content;
        T t11 = tArr[i10];
        tArr[i10] = t10;
        return t11;
    }

    public final void setSize(int i10) {
        this.size = i10;
    }

    public final void sortWith(Comparator<T> comparator) {
        AbstractC8797p.m14634X(this.content, comparator, 0, this.size);
    }

    public final int sumBy(InterfaceC10570l interfaceC10570l) {
        T[] tArr = this.content;
        int iIntValue = 0;
        for (int i10 = 0; i10 < getSize(); i10++) {
            iIntValue += ((Number) interfaceC10570l.invoke(tArr[i10])).intValue();
        }
        return iIntValue;
    }

    public final Void throwNoSuchElementException() {
        throwNoSuchElementException("MutableVector is empty.");
        throw new KotlinNothingValueException();
    }

    public final Void throwNoSuchElementException(String str) {
        throw new NoSuchElementException(str);
    }

    public final boolean containsAll(Collection<? extends T> collection) {
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    public final T firstOrNull() {
        if (getSize() == 0) {
            return null;
        }
        return this.content[0];
    }

    public final T lastOrNull() {
        if (getSize() == 0) {
            return null;
        }
        return this.content[getSize() - 1];
    }

    public final boolean removeAll(MutableVector<T> mutableVector) {
        int i10 = this.size;
        int size = mutableVector.getSize() - 1;
        if (size >= 0) {
            int i11 = 0;
            while (true) {
                remove(mutableVector.content[i11]);
                if (i11 == size) {
                    break;
                }
                i11++;
            }
        }
        return i10 != this.size;
    }

    public final void add(int i10, T t10) {
        int i11 = this.size + 1;
        if (this.content.length < i11) {
            resizeStorage(i11);
        }
        T[] tArr = this.content;
        int i12 = this.size;
        if (i10 != i12) {
            System.arraycopy(tArr, i10, tArr, i10 + 1, i12 - i10);
        }
        tArr[i10] = t10;
        this.size++;
    }

    public final boolean containsAll(MutableVector<T> mutableVector) {
        C8321f c8321fM13525t = AbstractC8323h.m13525t(0, mutableVector.getSize());
        int iM13496b = c8321fM13525t.m13496b();
        int iM13497c = c8321fM13525t.m13497c();
        if (iM13496b > iM13497c) {
            return true;
        }
        while (contains(mutableVector.content[iM13496b])) {
            if (iM13496b == iM13497c) {
                return true;
            }
            iM13496b++;
        }
        return false;
    }

    public final T first() {
        if (getSize() != 0) {
            return this.content[0];
        }
        throwNoSuchElementException("MutableVector is empty.");
        throw new KotlinNothingValueException();
    }

    public final T last() {
        if (getSize() != 0) {
            return this.content[getSize() - 1];
        }
        throwNoSuchElementException("MutableVector is empty.");
        throw new KotlinNothingValueException();
    }

    public final boolean removeAll(Collection<? extends T> collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int i10 = this.size;
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            remove(it.next());
        }
        return i10 != this.size;
    }

    public final boolean addAll(int i10, MutableVector<T> mutableVector) {
        int i11 = mutableVector.size;
        if (i11 == 0) {
            return false;
        }
        int i12 = this.size + i11;
        if (this.content.length < i12) {
            resizeStorage(i12);
        }
        T[] tArr = this.content;
        int i13 = this.size;
        if (i10 != i13) {
            System.arraycopy(tArr, i10, tArr, i10 + i11, i13 - i10);
        }
        System.arraycopy(mutableVector.content, 0, tArr, i10, i11);
        this.size += i11;
        return true;
    }

    public final boolean addAll(List<? extends T> list) {
        return addAll(getSize(), (List) list);
    }

    public final boolean addAll(MutableVector<T> mutableVector) {
        return addAll(getSize(), mutableVector);
    }

    public final boolean addAll(T[] tArr) {
        int length = tArr.length;
        if (length == 0) {
            return false;
        }
        int i10 = this.size + length;
        if (this.content.length < i10) {
            resizeStorage(i10);
        }
        System.arraycopy(tArr, 0, this.content, this.size, length);
        this.size += length;
        return true;
    }

    public final boolean addAll(int i10, Collection<? extends T> collection) {
        int i11 = 0;
        if (collection.isEmpty()) {
            return false;
        }
        int size = collection.size();
        int i12 = this.size + size;
        if (this.content.length < i12) {
            resizeStorage(i12);
        }
        T[] tArr = this.content;
        int i13 = this.size;
        if (i10 != i13) {
            System.arraycopy(tArr, i10, tArr, i10 + size, i13 - i10);
        }
        for (T t10 : collection) {
            int i14 = i11 + 1;
            if (i11 < 0) {
                AbstractC8809v.m14780w();
            }
            tArr[i11 + i10] = t10;
            i11 = i14;
        }
        this.size += size;
        return true;
    }

    public final boolean addAll(Collection<? extends T> collection) {
        return addAll(this.size, collection);
    }
}
