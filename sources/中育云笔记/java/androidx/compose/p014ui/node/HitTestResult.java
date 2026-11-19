package androidx.compose.p014ui.node;

import androidx.collection.MutableLongList;
import androidx.collection.MutableObjectList;
import androidx.compose.p014ui.Modifier;
import androidx.compose.runtime.internal.StabilityInferred;
import id.InterfaceC9624a;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.UnaryOperator;
import kotlin.jvm.internal.AbstractC9971m;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9529a;
import p325rc.AbstractC10978w;

@StabilityInferred(parameters = 0)
/* loaded from: classes2.dex */
public final class HitTestResult implements List<Modifier.Node>, InterfaceC9624a {
    public static final int $stable = 8;
    private MutableObjectList<Object> values = new MutableObjectList<>(16);
    private MutableLongList distanceFromEdgeAndFlags = new MutableLongList(16);
    private int hitDepth = -1;

    public final class HitTestResultIterator implements ListIterator<Modifier.Node>, InterfaceC9624a {
        private int index;
        private final int maxIndex;
        private final int minIndex;

        public HitTestResultIterator(int i10, int i11, int i12) {
            this.index = i10;
            this.minIndex = i11;
            this.maxIndex = i12;
        }

        /* renamed from: add, reason: avoid collision after fix types in other method */
        public void add2(Modifier.Node node) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public final int getIndex() {
            return this.index;
        }

        public final int getMaxIndex() {
            return this.maxIndex;
        }

        public final int getMinIndex() {
            return this.minIndex;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
            return this.index < this.maxIndex;
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return this.index > this.minIndex;
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return this.index - this.minIndex;
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return (this.index - this.minIndex) - 1;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        /* renamed from: set, reason: avoid collision after fix types in other method */
        public void set2(Modifier.Node node) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public final void setIndex(int i10) {
            this.index = i10;
        }

        @Override // java.util.ListIterator
        public /* bridge */ /* synthetic */ void add(Modifier.Node node) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.ListIterator, java.util.Iterator
        public Modifier.Node next() {
            MutableObjectList mutableObjectList = HitTestResult.this.values;
            int i10 = this.index;
            this.index = i10 + 1;
            E e10 = mutableObjectList.get(i10);
            AbstractC9979u.m20292e(e10, "null cannot be cast to non-null type androidx.compose.ui.Modifier.Node");
            return (Modifier.Node) e10;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.ListIterator
        public Modifier.Node previous() {
            MutableObjectList mutableObjectList = HitTestResult.this.values;
            int i10 = this.index - 1;
            this.index = i10;
            E e10 = mutableObjectList.get(i10);
            AbstractC9979u.m20292e(e10, "null cannot be cast to non-null type androidx.compose.ui.Modifier.Node");
            return (Modifier.Node) e10;
        }

        @Override // java.util.ListIterator
        public /* bridge */ /* synthetic */ void set(Modifier.Node node) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public /* synthetic */ HitTestResultIterator(HitTestResult hitTestResult, int i10, int i11, int i12, int i13, AbstractC9972n abstractC9972n) {
            this((i13 & 1) != 0 ? 0 : i10, (i13 & 2) != 0 ? 0 : i11, (i13 & 4) != 0 ? hitTestResult.size() : i12);
        }
    }

    public final class SubList implements List<Modifier.Node>, InterfaceC9624a {
        private final int maxIndex;
        private final int minIndex;

        public SubList(int i10, int i11) {
            this.minIndex = i10;
            this.maxIndex = i11;
        }

        /* renamed from: add, reason: avoid collision after fix types in other method */
        public void add2(int i10, Modifier.Node node) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List
        public boolean addAll(int i10, Collection<? extends Modifier.Node> collection) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public void addFirst(Modifier.Node node) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public void addLast(Modifier.Node node) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, java.util.Collection
        public void clear() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, java.util.Collection
        public final /* bridge */ boolean contains(Object obj) {
            if (obj instanceof Modifier.Node) {
                return contains((Modifier.Node) obj);
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

        public final int getMaxIndex() {
            return this.maxIndex;
        }

        public final int getMinIndex() {
            return this.minIndex;
        }

        public int getSize() {
            return this.maxIndex - this.minIndex;
        }

        @Override // java.util.List
        public final /* bridge */ int indexOf(Object obj) {
            if (obj instanceof Modifier.Node) {
                return indexOf((Modifier.Node) obj);
            }
            return -1;
        }

        @Override // java.util.List, java.util.Collection
        public boolean isEmpty() {
            return size() == 0;
        }

        @Override // java.util.List, java.util.Collection, java.lang.Iterable
        public Iterator<Modifier.Node> iterator() {
            HitTestResult hitTestResult = HitTestResult.this;
            int i10 = this.minIndex;
            return hitTestResult.new HitTestResultIterator(i10, i10, this.maxIndex);
        }

        @Override // java.util.List
        public final /* bridge */ int lastIndexOf(Object obj) {
            if (obj instanceof Modifier.Node) {
                return lastIndexOf((Modifier.Node) obj);
            }
            return -1;
        }

        @Override // java.util.List
        public ListIterator<Modifier.Node> listIterator() {
            HitTestResult hitTestResult = HitTestResult.this;
            int i10 = this.minIndex;
            return hitTestResult.new HitTestResultIterator(i10, i10, this.maxIndex);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // java.util.List
        public Modifier.Node remove(int i10) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, java.util.Collection
        public boolean removeAll(Collection<? extends Object> collection) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public Modifier.Node removeFirst() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public Modifier.Node removeLast() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List
        public void replaceAll(UnaryOperator<Modifier.Node> unaryOperator) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, java.util.Collection
        public boolean retainAll(Collection<? extends Object> collection) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        /* renamed from: set, reason: avoid collision after fix types in other method */
        public Modifier.Node set2(int i10, Modifier.Node node) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, java.util.Collection
        public final /* bridge */ int size() {
            return getSize();
        }

        @Override // java.util.List
        public void sort(Comparator<? super Modifier.Node> comparator) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List
        public List<Modifier.Node> subList(int i10, int i11) {
            HitTestResult hitTestResult = HitTestResult.this;
            int i12 = this.minIndex;
            return hitTestResult.new SubList(i10 + i12, i12 + i11);
        }

        @Override // java.util.List, java.util.Collection
        public Object[] toArray() {
            return AbstractC9971m.m20283a(this);
        }

        @Override // java.util.List
        public /* bridge */ /* synthetic */ void add(int i10, Modifier.Node node) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, java.util.Collection
        public boolean addAll(Collection<? extends Modifier.Node> collection) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public /* bridge */ /* synthetic */ void addFirst(Object obj) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public /* bridge */ /* synthetic */ void addLast(Object obj) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public boolean contains(Modifier.Node node) {
            return indexOf((Object) node) != -1;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.List
        public Modifier.Node get(int i10) {
            E e10 = HitTestResult.this.values.get(i10 + this.minIndex);
            AbstractC9979u.m20292e(e10, "null cannot be cast to non-null type androidx.compose.ui.Modifier.Node");
            return (Modifier.Node) e10;
        }

        public int indexOf(Modifier.Node node) {
            int i10 = this.minIndex;
            int i11 = this.maxIndex;
            if (i10 > i11) {
                return -1;
            }
            while (!AbstractC9979u.m20289b(HitTestResult.this.values.get(i10), node)) {
                if (i10 == i11) {
                    return -1;
                }
                i10++;
            }
            return i10 - this.minIndex;
        }

        public int lastIndexOf(Modifier.Node node) {
            int i10 = this.maxIndex;
            int i11 = this.minIndex;
            if (i11 > i10) {
                return -1;
            }
            while (!AbstractC9979u.m20289b(HitTestResult.this.values.get(i10), node)) {
                if (i10 == i11) {
                    return -1;
                }
                i10--;
            }
            return i10 - this.minIndex;
        }

        @Override // java.util.List
        public ListIterator<Modifier.Node> listIterator(int i10) {
            HitTestResult hitTestResult = HitTestResult.this;
            int i11 = this.minIndex;
            return hitTestResult.new HitTestResultIterator(i10 + i11, i11, this.maxIndex);
        }

        @Override // java.util.List
        public /* bridge */ /* synthetic */ Modifier.Node remove(int i10) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        /* renamed from: removeFirst, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ Object m32398removeFirst() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        /* renamed from: removeLast, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ Object m32399removeLast() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List
        public /* bridge */ /* synthetic */ Modifier.Node set(int i10, Modifier.Node node) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, java.util.Collection
        public <T> T[] toArray(T[] tArr) {
            return (T[]) AbstractC9971m.m20284b(this, tArr);
        }

        public boolean add(Modifier.Node node) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, java.util.Collection
        public boolean remove(Object obj) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, java.util.Collection
        public /* bridge */ /* synthetic */ boolean add(Object obj) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* renamed from: findBestHitDistance-fn2tFes, reason: not valid java name */
    private final long m32395findBestHitDistancefn2tFes() {
        long jDistanceAndFlags$default = HitTestResultKt.DistanceAndFlags$default(Float.POSITIVE_INFINITY, false, false, 4, null);
        int i10 = this.hitDepth + 1;
        int iM24138p = AbstractC10978w.m24138p(this);
        if (i10 <= iM24138p) {
            while (true) {
                long jM32373constructorimpl = DistanceAndFlags.m32373constructorimpl(this.distanceFromEdgeAndFlags.get(i10));
                if (DistanceAndFlags.m32372compareTo9YPOF3E(jM32373constructorimpl, jDistanceAndFlags$default) < 0) {
                    jDistanceAndFlags$default = jM32373constructorimpl;
                }
                if ((DistanceAndFlags.m32376getDistanceimpl(jDistanceAndFlags$default) < 0.0f && DistanceAndFlags.m32379isInLayerimpl(jDistanceAndFlags$default)) || i10 == iM24138p) {
                    break;
                }
                i10++;
            }
        }
        return jDistanceAndFlags$default;
    }

    private final void removeNodeAtDepth(int i10) {
        this.values.removeAt(i10);
        this.distanceFromEdgeAndFlags.removeAt(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void removeNodesInRange(int i10, int i11) {
        if (i10 >= i11) {
            return;
        }
        this.values.removeRange(i10, i11);
        this.distanceFromEdgeAndFlags.removeRange(i10, i11);
    }

    public final void acceptHits() {
        this.hitDepth = size() - 1;
    }

    /* renamed from: add, reason: avoid collision after fix types in other method */
    public void add2(int i10, Modifier.Node node) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public boolean addAll(int i10, Collection<? extends Modifier.Node> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public void addFirst(Modifier.Node node) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public void addLast(Modifier.Node node) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        this.hitDepth = -1;
        this.values.clear();
        this.distanceFromEdgeAndFlags.clear();
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof Modifier.Node) {
            return contains((Modifier.Node) obj);
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

    public int getSize() {
        return this.values.getSize();
    }

    public final boolean hasHit() {
        long jM32395findBestHitDistancefn2tFes = m32395findBestHitDistancefn2tFes();
        return DistanceAndFlags.m32376getDistanceimpl(jM32395findBestHitDistancefn2tFes) < 0.0f && DistanceAndFlags.m32379isInLayerimpl(jM32395findBestHitDistancefn2tFes) && !DistanceAndFlags.m32378isInExpandedBoundsimpl(jM32395findBestHitDistancefn2tFes);
    }

    public final void hit(Modifier.Node node, boolean z10, InterfaceC9529a interfaceC9529a) {
        int i10 = this.hitDepth;
        removeNodesInRange(this.hitDepth + 1, size());
        this.hitDepth++;
        this.values.add(node);
        this.distanceFromEdgeAndFlags.add(HitTestResultKt.DistanceAndFlags(-1.0f, z10, false));
        interfaceC9529a.invoke();
        this.hitDepth = i10;
    }

    public final void hitExpandedTouchBounds(Modifier.Node node, boolean z10, InterfaceC9529a interfaceC9529a) {
        if (this.hitDepth == AbstractC10978w.m24138p(this)) {
            int i10 = this.hitDepth;
            removeNodesInRange(this.hitDepth + 1, size());
            this.hitDepth++;
            this.values.add(node);
            this.distanceFromEdgeAndFlags.add(HitTestResultKt.DistanceAndFlags(0.0f, z10, true));
            interfaceC9529a.invoke();
            this.hitDepth = i10;
            return;
        }
        long jM32395findBestHitDistancefn2tFes = m32395findBestHitDistancefn2tFes();
        int i11 = this.hitDepth;
        if (!DistanceAndFlags.m32378isInExpandedBoundsimpl(jM32395findBestHitDistancefn2tFes)) {
            if (DistanceAndFlags.m32376getDistanceimpl(jM32395findBestHitDistancefn2tFes) > 0.0f) {
                int i12 = this.hitDepth;
                removeNodesInRange(this.hitDepth + 1, size());
                this.hitDepth++;
                this.values.add(node);
                this.distanceFromEdgeAndFlags.add(HitTestResultKt.DistanceAndFlags(0.0f, z10, true));
                interfaceC9529a.invoke();
                this.hitDepth = i12;
                return;
            }
            return;
        }
        this.hitDepth = AbstractC10978w.m24138p(this);
        int i13 = this.hitDepth;
        removeNodesInRange(this.hitDepth + 1, size());
        this.hitDepth++;
        this.values.add(node);
        this.distanceFromEdgeAndFlags.add(HitTestResultKt.DistanceAndFlags(0.0f, z10, true));
        interfaceC9529a.invoke();
        this.hitDepth = i13;
        if (DistanceAndFlags.m32376getDistanceimpl(m32395findBestHitDistancefn2tFes()) < 0.0f) {
            removeNodesInRange(i11 + 1, this.hitDepth + 1);
        }
        this.hitDepth = i11;
    }

    public final void hitInMinimumTouchTarget(Modifier.Node node, float f10, boolean z10, boolean z11, InterfaceC9529a interfaceC9529a) {
        int i10 = this.hitDepth;
        removeNodesInRange(this.hitDepth + 1, size());
        this.hitDepth++;
        this.values.add(node);
        this.distanceFromEdgeAndFlags.add(HitTestResultKt.DistanceAndFlags(f10, z10, z11));
        interfaceC9529a.invoke();
        this.hitDepth = i10;
    }

    @Override // java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof Modifier.Node) {
            return indexOf((Modifier.Node) obj);
        }
        return -1;
    }

    @Override // java.util.List, java.util.Collection
    public boolean isEmpty() {
        return this.values.isEmpty();
    }

    public final boolean isHitInMinimumTouchTargetBetter(float f10, boolean z10) {
        if (this.hitDepth == AbstractC10978w.m24138p(this)) {
            return true;
        }
        return DistanceAndFlags.m32372compareTo9YPOF3E(m32395findBestHitDistancefn2tFes(), HitTestResultKt.DistanceAndFlags$default(f10, z10, false, 4, null)) > 0;
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public Iterator<Modifier.Node> iterator() {
        return new HitTestResultIterator(this, 0, 0, 0, 7, null);
    }

    @Override // java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof Modifier.Node) {
            return lastIndexOf((Modifier.Node) obj);
        }
        return -1;
    }

    @Override // java.util.List
    public ListIterator<Modifier.Node> listIterator() {
        return new HitTestResultIterator(this, 0, 0, 0, 7, null);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // java.util.List
    public Modifier.Node remove(int i10) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean removeAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public Modifier.Node removeFirst() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public Modifier.Node removeLast() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public void replaceAll(UnaryOperator<Modifier.Node> unaryOperator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean retainAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* renamed from: set, reason: avoid collision after fix types in other method */
    public Modifier.Node set2(int i10, Modifier.Node node) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final void siblingHits(InterfaceC9529a interfaceC9529a) {
        int i10 = this.hitDepth;
        interfaceC9529a.invoke();
        this.hitDepth = i10;
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ int size() {
        return getSize();
    }

    @Override // java.util.List
    public void sort(Comparator<? super Modifier.Node> comparator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final void speculativeHit(Modifier.Node node, float f10, boolean z10, InterfaceC9529a interfaceC9529a) {
        if (this.hitDepth == AbstractC10978w.m24138p(this)) {
            int i10 = this.hitDepth;
            removeNodesInRange(this.hitDepth + 1, size());
            this.hitDepth++;
            this.values.add(node);
            this.distanceFromEdgeAndFlags.add(HitTestResultKt.DistanceAndFlags(f10, z10, false));
            interfaceC9529a.invoke();
            this.hitDepth = i10;
            if (this.hitDepth + 1 == AbstractC10978w.m24138p(this) || DistanceAndFlags.m32378isInExpandedBoundsimpl(m32395findBestHitDistancefn2tFes())) {
                removeNodeAtDepth(this.hitDepth + 1);
                return;
            }
            return;
        }
        long jM32395findBestHitDistancefn2tFes = m32395findBestHitDistancefn2tFes();
        int i11 = this.hitDepth;
        this.hitDepth = AbstractC10978w.m24138p(this);
        int i12 = this.hitDepth;
        removeNodesInRange(this.hitDepth + 1, size());
        this.hitDepth++;
        this.values.add(node);
        this.distanceFromEdgeAndFlags.add(HitTestResultKt.DistanceAndFlags(f10, z10, false));
        interfaceC9529a.invoke();
        this.hitDepth = i12;
        long jM32395findBestHitDistancefn2tFes2 = m32395findBestHitDistancefn2tFes();
        if (this.hitDepth + 1 >= AbstractC10978w.m24138p(this) || DistanceAndFlags.m32372compareTo9YPOF3E(jM32395findBestHitDistancefn2tFes, jM32395findBestHitDistancefn2tFes2) <= 0) {
            removeNodesInRange(this.hitDepth + 1, size());
        } else {
            removeNodesInRange(i11 + 1, DistanceAndFlags.m32378isInExpandedBoundsimpl(jM32395findBestHitDistancefn2tFes2) ? this.hitDepth + 2 : this.hitDepth + 1);
        }
        this.hitDepth = i11;
    }

    @Override // java.util.List
    public List<Modifier.Node> subList(int i10, int i11) {
        return new SubList(i10, i11);
    }

    @Override // java.util.List, java.util.Collection
    public Object[] toArray() {
        return AbstractC9971m.m20283a(this);
    }

    @Override // java.util.List
    public /* bridge */ /* synthetic */ void add(int i10, Modifier.Node node) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean addAll(Collection<? extends Modifier.Node> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public /* bridge */ /* synthetic */ void addFirst(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public /* bridge */ /* synthetic */ void addLast(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean contains(Modifier.Node node) {
        return indexOf((Object) node) != -1;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // java.util.List
    public Modifier.Node get(int i10) {
        Object obj = this.values.get(i10);
        AbstractC9979u.m20292e(obj, "null cannot be cast to non-null type androidx.compose.ui.Modifier.Node");
        return (Modifier.Node) obj;
    }

    public int indexOf(Modifier.Node node) {
        int iM24138p = AbstractC10978w.m24138p(this);
        if (iM24138p < 0) {
            return -1;
        }
        int i10 = 0;
        while (!AbstractC9979u.m20289b(this.values.get(i10), node)) {
            if (i10 == iM24138p) {
                return -1;
            }
            i10++;
        }
        return i10;
    }

    public int lastIndexOf(Modifier.Node node) {
        for (int iM24138p = AbstractC10978w.m24138p(this); -1 < iM24138p; iM24138p--) {
            if (AbstractC9979u.m20289b(this.values.get(iM24138p), node)) {
                return iM24138p;
            }
        }
        return -1;
    }

    @Override // java.util.List
    public ListIterator<Modifier.Node> listIterator(int i10) {
        return new HitTestResultIterator(this, i10, 0, 0, 6, null);
    }

    @Override // java.util.List
    public /* bridge */ /* synthetic */ Modifier.Node remove(int i10) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* renamed from: removeFirst, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m32396removeFirst() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* renamed from: removeLast, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m32397removeLast() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public /* bridge */ /* synthetic */ Modifier.Node set(int i10, Modifier.Node node) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public <T> T[] toArray(T[] tArr) {
        return (T[]) AbstractC9971m.m20284b(this, tArr);
    }

    public boolean add(Modifier.Node node) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final void hitInMinimumTouchTarget(Modifier.Node node, float f10, boolean z10, InterfaceC9529a interfaceC9529a) {
        int i10 = this.hitDepth;
        removeNodesInRange(this.hitDepth + 1, size());
        this.hitDepth++;
        this.values.add(node);
        this.distanceFromEdgeAndFlags.add(HitTestResultKt.DistanceAndFlags(f10, z10, false));
        interfaceC9529a.invoke();
        this.hitDepth = i10;
    }
}
