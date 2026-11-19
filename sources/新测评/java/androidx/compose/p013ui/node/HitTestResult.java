package androidx.compose.p013ui.node;

import androidx.collection.MutableLongList;
import androidx.collection.MutableObjectList;
import androidx.compose.p013ui.Modifier;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.UnaryOperator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.CollectionToArray;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.markers.KMappedMarker;

@StabilityInferred(parameters = 0)
@Metadata(m13557d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u001e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010(\n\u0002\b\u0002\n\u0002\u0010*\n\u0002\b\u000e\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002;<B\u0005¢\u0006\u0002\u0010\u0003J\u0006\u0010\u000e\u001a\u00020\u000fJ\u0006\u0010\u0010\u001a\u00020\u000fJ\u0011\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0002H\u0096\u0002J\u0016\u0010\u0014\u001a\u00020\u00122\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u0016H\u0016J\u0015\u0010\u0017\u001a\u00020\u0018H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0011\u0010\u001b\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u0007H\u0096\u0002J\u0006\u0010\u001d\u001a\u00020\u0012J'\u0010\u001e\u001a\u00020\u000f2\u0006\u0010\u001f\u001a\u00020\u00022\u0006\u0010 \u001a\u00020\u00122\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u000f0\"H\u0086\bJ$\u0010#\u001a\u00020\u000f2\u0006\u0010\u001f\u001a\u00020\u00022\u0006\u0010 \u001a\u00020\u00122\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u000f0\"J/\u0010$\u001a\u00020\u000f2\u0006\u0010\u001f\u001a\u00020\u00022\u0006\u0010%\u001a\u00020&2\u0006\u0010 \u001a\u00020\u00122\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u000f0\"H\u0086\bJ7\u0010$\u001a\u00020\u000f2\u0006\u0010\u001f\u001a\u00020\u00022\u0006\u0010%\u001a\u00020&2\u0006\u0010 \u001a\u00020\u00122\u0006\u0010'\u001a\u00020\u00122\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u000f0\"H\u0086\bJ\u0010\u0010(\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u0002H\u0016J\b\u0010)\u001a\u00020\u0012H\u0016J\u0016\u0010*\u001a\u00020\u00122\u0006\u0010%\u001a\u00020&2\u0006\u0010 \u001a\u00020\u0012J\u000f\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00020,H\u0096\u0002J\u0010\u0010-\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u0002H\u0016J\u000e\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00020/H\u0016J\u0016\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00020/2\u0006\u0010\u001c\u001a\u00020\u0007H\u0016J\u0010\u00100\u001a\u00020\u000f2\u0006\u00101\u001a\u00020\u0007H\u0002J\u0018\u00102\u001a\u00020\u000f2\u0006\u00103\u001a\u00020\u00072\u0006\u00104\u001a\u00020\u0007H\u0002J\u0017\u00105\u001a\u00020\u000f2\f\u00106\u001a\b\u0012\u0004\u0012\u00020\u000f0\"H\u0086\bJ,\u00107\u001a\u00020\u000f2\u0006\u0010\u001f\u001a\u00020\u00022\u0006\u0010%\u001a\u00020&2\u0006\u0010 \u001a\u00020\u00122\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u000f0\"J\u001e\u00108\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u00109\u001a\u00020\u00072\u0006\u0010:\u001a\u00020\u0007H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fX\u0082\u000e¢\u0006\u0002\n\u0000\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006="}, m13558d2 = {"Landroidx/compose/ui/node/HitTestResult;", "", "Landroidx/compose/ui/Modifier$Node;", "()V", "distanceFromEdgeAndFlags", "Landroidx/collection/MutableLongList;", "hitDepth", "", "size", "getSize", "()I", "values", "Landroidx/collection/MutableObjectList;", "", "acceptHits", "", "clear", "contains", "", "element", "containsAll", "elements", "", "findBestHitDistance", "Landroidx/compose/ui/node/DistanceAndFlags;", "findBestHitDistance-fn2tFes", "()J", "get", "index", "hasHit", "hit", "node", "isInLayer", "childHitTest", "Lkotlin/Function0;", "hitExpandedTouchBounds", "hitInMinimumTouchTarget", "distanceFromEdge", "", "isInExpandedBounds", "indexOf", "isEmpty", "isHitInMinimumTouchTargetBetter", "iterator", "", "lastIndexOf", "listIterator", "", "removeNodeAtDepth", "depth", "removeNodesInRange", "startDepth", "endDepth", "siblingHits", "block", "speculativeHit", "subList", "fromIndex", "toIndex", "HitTestResultIterator", "SubList", "ui_release"}, m13559k = 1, m13560mv = {1, 9, 0}, m13562xi = 48)
@SourceDebugExtension({"SMAP\nHitTestResult.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HitTestResult.kt\nandroidx/compose/ui/node/HitTestResult\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,410:1\n100#1:411\n113#1,10:412\n113#1,10:422\n113#1,10:432\n113#1,10:442\n113#1,10:452\n100#1:462\n113#1,10:463\n100#1:473\n113#1,10:474\n1855#2,2:484\n*S KotlinDebug\n*F\n+ 1 HitTestResult.kt\nandroidx/compose/ui/node/HitTestResult\n*L\n92#1:411\n92#1:412,10\n100#1:422,10\n131#1:432,10\n144#1:442,10\n156#1:452,10\n176#1:462\n176#1:463,10\n194#1:473\n194#1:474,10\n249#1:484,2\n*E\n"})
/* loaded from: classes2.dex */
public final class HitTestResult implements List<Modifier.Node>, KMappedMarker {
    public static final int $stable = 8;
    private MutableObjectList<Object> values = new MutableObjectList<>(16);
    private MutableLongList distanceFromEdgeAndFlags = new MutableLongList(16);
    private int hitDepth = -1;

    @Metadata(m13557d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0082\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B#\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004¢\u0006\u0002\u0010\u0007J\t\u0010\u000e\u001a\u00020\u000fH\u0096\u0002J\b\u0010\u0010\u001a\u00020\u000fH\u0016J\t\u0010\u0011\u001a\u00020\u0002H\u0096\u0002J\b\u0010\u0012\u001a\u00020\u0004H\u0016J\b\u0010\u0013\u001a\u00020\u0002H\u0016J\b\u0010\u0014\u001a\u00020\u0004H\u0016R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\t¨\u0006\u0015"}, m13558d2 = {"Landroidx/compose/ui/node/HitTestResult$HitTestResultIterator;", "", "Landroidx/compose/ui/Modifier$Node;", "index", "", "minIndex", "maxIndex", "(Landroidx/compose/ui/node/HitTestResult;III)V", "getIndex", "()I", "setIndex", "(I)V", "getMaxIndex", "getMinIndex", "hasNext", "", "hasPrevious", "next", "nextIndex", "previous", "previousIndex", "ui_release"}, m13559k = 1, m13560mv = {1, 9, 0}, m13562xi = 48)
    public final class HitTestResultIterator implements ListIterator<Modifier.Node>, KMappedMarker {
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
            Intrinsics.checkNotNull(e10, "null cannot be cast to non-null type androidx.compose.ui.Modifier.Node");
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
            Intrinsics.checkNotNull(e10, "null cannot be cast to non-null type androidx.compose.ui.Modifier.Node");
            return (Modifier.Node) e10;
        }

        @Override // java.util.ListIterator
        public /* bridge */ /* synthetic */ void set(Modifier.Node node) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public /* synthetic */ HitTestResultIterator(HitTestResult hitTestResult, int i10, int i11, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this((i13 & 1) != 0 ? 0 : i10, (i13 & 2) != 0 ? 0 : i11, (i13 & 4) != 0 ? hitTestResult.size() : i12);
        }
    }

    @Metadata(m13557d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u001e\n\u0002\b\u0005\n\u0002\u0010(\n\u0002\b\u0002\n\u0002\u0010*\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0002\u0010\u0006J\u0011\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0002H\u0096\u0002J\u0016\u0010\u000f\u001a\u00020\r2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00020\u0011H\u0016J\u0011\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0004H\u0096\u0002J\u0010\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u0002H\u0016J\b\u0010\u0015\u001a\u00020\rH\u0016J\u000f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00020\u0017H\u0096\u0002J\u0010\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u0002H\u0016J\u000e\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u001aH\u0016J\u0016\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u001a2\u0006\u0010\u0013\u001a\u00020\u0004H\u0016J\u001e\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\u0004H\u0016R\u0011\u0010\u0005\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0014\u0010\n\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\b¨\u0006\u001e"}, m13558d2 = {"Landroidx/compose/ui/node/HitTestResult$SubList;", "", "Landroidx/compose/ui/Modifier$Node;", "minIndex", "", "maxIndex", "(Landroidx/compose/ui/node/HitTestResult;II)V", "getMaxIndex", "()I", "getMinIndex", "size", "getSize", "contains", "", "element", "containsAll", "elements", "", "get", "index", "indexOf", "isEmpty", "iterator", "", "lastIndexOf", "listIterator", "", "subList", "fromIndex", "toIndex", "ui_release"}, m13559k = 1, m13560mv = {1, 9, 0}, m13562xi = 48)
    @SourceDebugExtension({"SMAP\nHitTestResult.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HitTestResult.kt\nandroidx/compose/ui/node/HitTestResult$SubList\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,410:1\n1855#2,2:411\n*S KotlinDebug\n*F\n+ 1 HitTestResult.kt\nandroidx/compose/ui/node/HitTestResult$SubList\n*L\n323#1:411,2\n*E\n"})
    public final class SubList implements List<Modifier.Node>, KMappedMarker {
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
        public boolean containsAll(Collection<? extends Object> elements) {
            Iterator<T> it = elements.iterator();
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
        public List<Modifier.Node> subList(int fromIndex, int toIndex) {
            HitTestResult hitTestResult = HitTestResult.this;
            int i10 = this.minIndex;
            return hitTestResult.new SubList(fromIndex + i10, i10 + toIndex);
        }

        @Override // java.util.List, java.util.Collection
        public Object[] toArray() {
            return CollectionToArray.toArray(this);
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

        public boolean contains(Modifier.Node element) {
            return indexOf((Object) element) != -1;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.List
        public Modifier.Node get(int index) {
            E e10 = HitTestResult.this.values.get(index + this.minIndex);
            Intrinsics.checkNotNull(e10, "null cannot be cast to non-null type androidx.compose.ui.Modifier.Node");
            return (Modifier.Node) e10;
        }

        public int indexOf(Modifier.Node element) {
            int i10 = this.minIndex;
            int i11 = this.maxIndex;
            if (i10 > i11) {
                return -1;
            }
            while (!Intrinsics.areEqual(HitTestResult.this.values.get(i10), element)) {
                if (i10 == i11) {
                    return -1;
                }
                i10++;
            }
            return i10 - this.minIndex;
        }

        public int lastIndexOf(Modifier.Node element) {
            int i10 = this.maxIndex;
            int i11 = this.minIndex;
            if (i11 > i10) {
                return -1;
            }
            while (!Intrinsics.areEqual(HitTestResult.this.values.get(i10), element)) {
                if (i10 == i11) {
                    return -1;
                }
                i10--;
            }
            return i10 - this.minIndex;
        }

        @Override // java.util.List
        public ListIterator<Modifier.Node> listIterator(int index) {
            HitTestResult hitTestResult = HitTestResult.this;
            int i10 = this.minIndex;
            return hitTestResult.new HitTestResultIterator(index + i10, i10, this.maxIndex);
        }

        @Override // java.util.List
        public /* bridge */ /* synthetic */ Modifier.Node remove(int i10) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        /* renamed from: removeFirst, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ Object m22488removeFirst() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        /* renamed from: removeLast, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ Object m22489removeLast() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List
        public /* bridge */ /* synthetic */ Modifier.Node set(int i10, Modifier.Node node) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, java.util.Collection
        public <T> T[] toArray(T[] tArr) {
            return (T[]) CollectionToArray.toArray(this, tArr);
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
    private final long m22485findBestHitDistancefn2tFes() {
        long jDistanceAndFlags$default = HitTestResultKt.DistanceAndFlags$default(Float.POSITIVE_INFINITY, false, false, 4, null);
        int i10 = this.hitDepth + 1;
        int lastIndex = CollectionsKt.getLastIndex(this);
        if (i10 <= lastIndex) {
            while (true) {
                long jM22463constructorimpl = DistanceAndFlags.m22463constructorimpl(this.distanceFromEdgeAndFlags.get(i10));
                if (DistanceAndFlags.m22462compareTo9YPOF3E(jM22463constructorimpl, jDistanceAndFlags$default) < 0) {
                    jDistanceAndFlags$default = jM22463constructorimpl;
                }
                if ((DistanceAndFlags.m22466getDistanceimpl(jDistanceAndFlags$default) < 0.0f && DistanceAndFlags.m22469isInLayerimpl(jDistanceAndFlags$default)) || i10 == lastIndex) {
                    break;
                }
                i10++;
            }
        }
        return jDistanceAndFlags$default;
    }

    private final void removeNodeAtDepth(int depth) {
        this.values.removeAt(depth);
        this.distanceFromEdgeAndFlags.removeAt(depth);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void removeNodesInRange(int startDepth, int endDepth) {
        if (startDepth >= endDepth) {
            return;
        }
        this.values.removeRange(startDepth, endDepth);
        this.distanceFromEdgeAndFlags.removeRange(startDepth, endDepth);
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
    public boolean containsAll(Collection<? extends Object> elements) {
        Iterator<T> it = elements.iterator();
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
        long jM22485findBestHitDistancefn2tFes = m22485findBestHitDistancefn2tFes();
        return DistanceAndFlags.m22466getDistanceimpl(jM22485findBestHitDistancefn2tFes) < 0.0f && DistanceAndFlags.m22469isInLayerimpl(jM22485findBestHitDistancefn2tFes) && !DistanceAndFlags.m22468isInExpandedBoundsimpl(jM22485findBestHitDistancefn2tFes);
    }

    public final void hit(Modifier.Node node, boolean isInLayer, Function0<Unit> childHitTest) {
        int i10 = this.hitDepth;
        removeNodesInRange(this.hitDepth + 1, size());
        this.hitDepth++;
        this.values.add(node);
        this.distanceFromEdgeAndFlags.add(HitTestResultKt.DistanceAndFlags(-1.0f, isInLayer, false));
        childHitTest.invoke();
        this.hitDepth = i10;
    }

    public final void hitExpandedTouchBounds(Modifier.Node node, boolean isInLayer, Function0<Unit> childHitTest) {
        if (this.hitDepth == CollectionsKt.getLastIndex(this)) {
            int i10 = this.hitDepth;
            removeNodesInRange(this.hitDepth + 1, size());
            this.hitDepth++;
            this.values.add(node);
            this.distanceFromEdgeAndFlags.add(HitTestResultKt.DistanceAndFlags(0.0f, isInLayer, true));
            childHitTest.invoke();
            this.hitDepth = i10;
            return;
        }
        long jM22485findBestHitDistancefn2tFes = m22485findBestHitDistancefn2tFes();
        int i11 = this.hitDepth;
        if (!DistanceAndFlags.m22468isInExpandedBoundsimpl(jM22485findBestHitDistancefn2tFes)) {
            if (DistanceAndFlags.m22466getDistanceimpl(jM22485findBestHitDistancefn2tFes) > 0.0f) {
                int i12 = this.hitDepth;
                removeNodesInRange(this.hitDepth + 1, size());
                this.hitDepth++;
                this.values.add(node);
                this.distanceFromEdgeAndFlags.add(HitTestResultKt.DistanceAndFlags(0.0f, isInLayer, true));
                childHitTest.invoke();
                this.hitDepth = i12;
                return;
            }
            return;
        }
        this.hitDepth = CollectionsKt.getLastIndex(this);
        int i13 = this.hitDepth;
        removeNodesInRange(this.hitDepth + 1, size());
        this.hitDepth++;
        this.values.add(node);
        this.distanceFromEdgeAndFlags.add(HitTestResultKt.DistanceAndFlags(0.0f, isInLayer, true));
        childHitTest.invoke();
        this.hitDepth = i13;
        if (DistanceAndFlags.m22466getDistanceimpl(m22485findBestHitDistancefn2tFes()) < 0.0f) {
            removeNodesInRange(i11 + 1, this.hitDepth + 1);
        }
        this.hitDepth = i11;
    }

    public final void hitInMinimumTouchTarget(Modifier.Node node, float distanceFromEdge, boolean isInLayer, boolean isInExpandedBounds, Function0<Unit> childHitTest) {
        int i10 = this.hitDepth;
        removeNodesInRange(this.hitDepth + 1, size());
        this.hitDepth++;
        this.values.add(node);
        this.distanceFromEdgeAndFlags.add(HitTestResultKt.DistanceAndFlags(distanceFromEdge, isInLayer, isInExpandedBounds));
        childHitTest.invoke();
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

    public final boolean isHitInMinimumTouchTargetBetter(float distanceFromEdge, boolean isInLayer) {
        if (this.hitDepth == CollectionsKt.getLastIndex(this)) {
            return true;
        }
        return DistanceAndFlags.m22462compareTo9YPOF3E(m22485findBestHitDistancefn2tFes(), HitTestResultKt.DistanceAndFlags$default(distanceFromEdge, isInLayer, false, 4, null)) > 0;
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

    public final void siblingHits(Function0<Unit> block) {
        int i10 = this.hitDepth;
        block.invoke();
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

    public final void speculativeHit(Modifier.Node node, float distanceFromEdge, boolean isInLayer, Function0<Unit> childHitTest) {
        if (this.hitDepth == CollectionsKt.getLastIndex(this)) {
            int i10 = this.hitDepth;
            removeNodesInRange(this.hitDepth + 1, size());
            this.hitDepth++;
            this.values.add(node);
            this.distanceFromEdgeAndFlags.add(HitTestResultKt.DistanceAndFlags(distanceFromEdge, isInLayer, false));
            childHitTest.invoke();
            this.hitDepth = i10;
            if (this.hitDepth + 1 == CollectionsKt.getLastIndex(this) || DistanceAndFlags.m22468isInExpandedBoundsimpl(m22485findBestHitDistancefn2tFes())) {
                removeNodeAtDepth(this.hitDepth + 1);
                return;
            }
            return;
        }
        long jM22485findBestHitDistancefn2tFes = m22485findBestHitDistancefn2tFes();
        int i11 = this.hitDepth;
        this.hitDepth = CollectionsKt.getLastIndex(this);
        int i12 = this.hitDepth;
        removeNodesInRange(this.hitDepth + 1, size());
        this.hitDepth++;
        this.values.add(node);
        this.distanceFromEdgeAndFlags.add(HitTestResultKt.DistanceAndFlags(distanceFromEdge, isInLayer, false));
        childHitTest.invoke();
        this.hitDepth = i12;
        long jM22485findBestHitDistancefn2tFes2 = m22485findBestHitDistancefn2tFes();
        if (this.hitDepth + 1 >= CollectionsKt.getLastIndex(this) || DistanceAndFlags.m22462compareTo9YPOF3E(jM22485findBestHitDistancefn2tFes, jM22485findBestHitDistancefn2tFes2) <= 0) {
            removeNodesInRange(this.hitDepth + 1, size());
        } else {
            removeNodesInRange(i11 + 1, DistanceAndFlags.m22468isInExpandedBoundsimpl(jM22485findBestHitDistancefn2tFes2) ? this.hitDepth + 2 : this.hitDepth + 1);
        }
        this.hitDepth = i11;
    }

    @Override // java.util.List
    public List<Modifier.Node> subList(int fromIndex, int toIndex) {
        return new SubList(fromIndex, toIndex);
    }

    @Override // java.util.List, java.util.Collection
    public Object[] toArray() {
        return CollectionToArray.toArray(this);
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

    public boolean contains(Modifier.Node element) {
        return indexOf((Object) element) != -1;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // java.util.List
    public Modifier.Node get(int index) {
        Object obj = this.values.get(index);
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type androidx.compose.ui.Modifier.Node");
        return (Modifier.Node) obj;
    }

    public int indexOf(Modifier.Node element) {
        int lastIndex = CollectionsKt.getLastIndex(this);
        if (lastIndex < 0) {
            return -1;
        }
        int i10 = 0;
        while (!Intrinsics.areEqual(this.values.get(i10), element)) {
            if (i10 == lastIndex) {
                return -1;
            }
            i10++;
        }
        return i10;
    }

    public int lastIndexOf(Modifier.Node element) {
        for (int lastIndex = CollectionsKt.getLastIndex(this); -1 < lastIndex; lastIndex--) {
            if (Intrinsics.areEqual(this.values.get(lastIndex), element)) {
                return lastIndex;
            }
        }
        return -1;
    }

    @Override // java.util.List
    public ListIterator<Modifier.Node> listIterator(int index) {
        return new HitTestResultIterator(this, index, 0, 0, 6, null);
    }

    @Override // java.util.List
    public /* bridge */ /* synthetic */ Modifier.Node remove(int i10) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* renamed from: removeFirst, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m22486removeFirst() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* renamed from: removeLast, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m22487removeLast() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public /* bridge */ /* synthetic */ Modifier.Node set(int i10, Modifier.Node node) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public <T> T[] toArray(T[] tArr) {
        return (T[]) CollectionToArray.toArray(this, tArr);
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

    public final void hitInMinimumTouchTarget(Modifier.Node node, float distanceFromEdge, boolean isInLayer, Function0<Unit> childHitTest) {
        int i10 = this.hitDepth;
        removeNodesInRange(this.hitDepth + 1, size());
        this.hitDepth++;
        this.values.add(node);
        this.distanceFromEdgeAndFlags.add(HitTestResultKt.DistanceAndFlags(distanceFromEdge, isInLayer, false));
        childHitTest.invoke();
        this.hitDepth = i10;
    }
}
