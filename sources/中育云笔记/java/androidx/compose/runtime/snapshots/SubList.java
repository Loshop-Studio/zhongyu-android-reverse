package androidx.compose.runtime.snapshots;

import androidx.compose.runtime.PreconditionsKt;
import id.InterfaceC9624a;
import id.InterfaceC9627d;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.KotlinNothingValueException;
import kotlin.jvm.internal.AbstractC9971m;
import kotlin.jvm.internal.AbstractC9979u;
import kotlin.jvm.internal.Ref$IntRef;
import p265nd.AbstractC10410o;
import p325rc.AbstractC10961n0;

/* loaded from: classes2.dex */
final class SubList<T> implements List<T>, InterfaceC9627d {
    private final int offset;
    private final SnapshotStateList<T> parentList;
    private int size;
    private int structure;

    /* renamed from: androidx.compose.runtime.snapshots.SubList$listIterator$1 */
    public static final class C26311 implements ListIterator<T>, InterfaceC9624a {
        final /* synthetic */ Ref$IntRef $current;
        final /* synthetic */ SubList<T> this$0;

        public C26311(Ref$IntRef ref$IntRef, SubList<T> subList) {
            this.$current = ref$IntRef;
            this.this$0 = subList;
        }

        @Override // java.util.ListIterator
        public /* bridge */ /* synthetic */ void add(Object obj) {
            add((C26311) obj);
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
            return this.$current.f23400c < this.this$0.size() - 1;
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return this.$current.f23400c >= 0;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public T next() {
            int i10 = this.$current.f23400c + 1;
            SnapshotStateListKt.validateRange(i10, this.this$0.size());
            this.$current.f23400c = i10;
            return this.this$0.get(i10);
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return this.$current.f23400c + 1;
        }

        @Override // java.util.ListIterator
        public T previous() {
            int i10 = this.$current.f23400c;
            SnapshotStateListKt.validateRange(i10, this.this$0.size());
            this.$current.f23400c = i10 - 1;
            return this.this$0.get(i10);
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return this.$current.f23400c;
        }

        @Override // java.util.ListIterator
        public /* bridge */ /* synthetic */ void set(Object obj) {
            set((C26311) obj);
        }

        @Override // java.util.ListIterator
        public Void add(T t10) {
            SnapshotStateListKt.modificationError();
            throw new KotlinNothingValueException();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public Void remove() {
            SnapshotStateListKt.modificationError();
            throw new KotlinNothingValueException();
        }

        @Override // java.util.ListIterator
        public Void set(T t10) {
            SnapshotStateListKt.modificationError();
            throw new KotlinNothingValueException();
        }
    }

    public SubList(SnapshotStateList<T> snapshotStateList, int i10, int i11) {
        this.parentList = snapshotStateList;
        this.offset = i10;
        this.structure = snapshotStateList.getStructure$runtime_release();
        this.size = i11 - i10;
    }

    private final void validateModification() {
        if (this.parentList.getStructure$runtime_release() != this.structure) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.List, java.util.Collection
    public boolean add(T t10) {
        validateModification();
        this.parentList.add(this.offset + size(), t10);
        this.size = size() + 1;
        this.structure = this.parentList.getStructure$runtime_release();
        return true;
    }

    @Override // java.util.List
    public boolean addAll(int i10, Collection<? extends T> collection) {
        validateModification();
        boolean zAddAll = this.parentList.addAll(i10 + this.offset, collection);
        if (zAddAll) {
            this.size = size() + collection.size();
            this.structure = this.parentList.getStructure$runtime_release();
        }
        return zAddAll;
    }

    @Override // java.util.List, java.util.Collection
    public void clear() {
        if (size() > 0) {
            validateModification();
            SnapshotStateList<T> snapshotStateList = this.parentList;
            int i10 = this.offset;
            snapshotStateList.removeRange(i10, size() + i10);
            this.size = 0;
            this.structure = this.parentList.getStructure$runtime_release();
        }
    }

    @Override // java.util.List, java.util.Collection
    public boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.List, java.util.Collection
    public boolean containsAll(Collection<? extends Object> collection) {
        Collection<? extends Object> collection2 = collection;
        if ((collection2 instanceof Collection) && collection2.isEmpty()) {
            return true;
        }
        Iterator<T> it = collection2.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.List
    public T get(int i10) {
        validateModification();
        SnapshotStateListKt.validateRange(i10, size());
        return this.parentList.get(this.offset + i10);
    }

    public final SnapshotStateList<T> getParentList() {
        return this.parentList;
    }

    public int getSize() {
        return this.size;
    }

    @Override // java.util.List
    public int indexOf(Object obj) {
        validateModification();
        int i10 = this.offset;
        Iterator<T> it = AbstractC10410o.m21768u(i10, size() + i10).iterator();
        while (it.hasNext()) {
            int iNextInt = ((AbstractC10961n0) it).nextInt();
            if (AbstractC9979u.m20289b(obj, this.parentList.get(iNextInt))) {
                return iNextInt - this.offset;
            }
        }
        return -1;
    }

    @Override // java.util.List, java.util.Collection
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public Iterator<T> iterator() {
        return listIterator();
    }

    @Override // java.util.List
    public int lastIndexOf(Object obj) {
        validateModification();
        int size = this.offset + size();
        do {
            size--;
            if (size < this.offset) {
                return -1;
            }
        } while (!AbstractC9979u.m20289b(obj, this.parentList.get(size)));
        return size - this.offset;
    }

    @Override // java.util.List
    public ListIterator<T> listIterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    public final /* bridge */ T remove(int i10) {
        return removeAt(i10);
    }

    @Override // java.util.List, java.util.Collection
    public boolean removeAll(Collection<? extends Object> collection) {
        Iterator<? extends Object> it = collection.iterator();
        while (true) {
            boolean z10 = false;
            while (it.hasNext()) {
                if (remove(it.next()) || z10) {
                    z10 = true;
                }
            }
            return z10;
        }
    }

    public T removeAt(int i10) {
        validateModification();
        T tRemove = this.parentList.remove(this.offset + i10);
        this.size = size() - 1;
        this.structure = this.parentList.getStructure$runtime_release();
        return tRemove;
    }

    @Override // java.util.List, java.util.Collection
    public boolean retainAll(Collection<? extends Object> collection) {
        validateModification();
        SnapshotStateList<T> snapshotStateList = this.parentList;
        int i10 = this.offset;
        int iRetainAllInRange$runtime_release = snapshotStateList.retainAllInRange$runtime_release(collection, i10, size() + i10);
        if (iRetainAllInRange$runtime_release > 0) {
            this.structure = this.parentList.getStructure$runtime_release();
            this.size = size() - iRetainAllInRange$runtime_release;
        }
        return iRetainAllInRange$runtime_release > 0;
    }

    @Override // java.util.List
    public T set(int i10, T t10) {
        SnapshotStateListKt.validateRange(i10, size());
        validateModification();
        T t11 = this.parentList.set(i10 + this.offset, t10);
        this.structure = this.parentList.getStructure$runtime_release();
        return t11;
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ int size() {
        return getSize();
    }

    @Override // java.util.List
    public List<T> subList(int i10, int i11) {
        if (!(i10 >= 0 && i10 <= i11 && i11 <= size())) {
            PreconditionsKt.throwIllegalArgumentException("fromIndex or toIndex are out of bounds");
        }
        validateModification();
        SnapshotStateList<T> snapshotStateList = this.parentList;
        int i12 = this.offset;
        return new SubList(snapshotStateList, i10 + i12, i11 + i12);
    }

    @Override // java.util.List, java.util.Collection
    public Object[] toArray() {
        return AbstractC9971m.m20283a(this);
    }

    @Override // java.util.List
    public ListIterator<T> listIterator(int i10) {
        validateModification();
        Ref$IntRef ref$IntRef = new Ref$IntRef();
        ref$IntRef.f23400c = i10 - 1;
        return new C26311(ref$IntRef, this);
    }

    @Override // java.util.List, java.util.Collection
    public boolean remove(Object obj) {
        int iIndexOf = indexOf(obj);
        if (iIndexOf < 0) {
            return false;
        }
        remove(iIndexOf);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public <T> T[] toArray(T[] tArr) {
        return (T[]) AbstractC9971m.m20284b(this, tArr);
    }

    @Override // java.util.List
    public void add(int i10, T t10) {
        validateModification();
        this.parentList.add(this.offset + i10, t10);
        this.size = size() + 1;
        this.structure = this.parentList.getStructure$runtime_release();
    }

    @Override // java.util.List, java.util.Collection
    public boolean addAll(Collection<? extends T> collection) {
        return addAll(size(), collection);
    }
}
