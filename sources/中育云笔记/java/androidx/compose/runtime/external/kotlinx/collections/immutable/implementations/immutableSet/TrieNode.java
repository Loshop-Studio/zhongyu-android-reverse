package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet;

import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.CommonFunctionsKt;
import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.DeltaCounter;
import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.MutabilityOwnership;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.Arrays;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;
import p309qc.C10786q;
import p325rc.AbstractC10968r;

@StabilityInferred(parameters = 0)
/* loaded from: classes2.dex */
public final class TrieNode<E> {
    private int bitmap;
    private Object[] buffer;
    private MutabilityOwnership ownedBy;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final TrieNode EMPTY = new TrieNode(0, new Object[0]);

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC9972n abstractC9972n) {
            this();
        }

        public final TrieNode getEMPTY$runtime_release() {
            return TrieNode.EMPTY;
        }

        private Companion() {
        }
    }

    public TrieNode(int i10, Object[] objArr, MutabilityOwnership mutabilityOwnership) {
        this.bitmap = i10;
        this.buffer = objArr;
        this.ownedBy = mutabilityOwnership;
    }

    private final TrieNode<E> addElementAt(int i10, E e10) {
        return new TrieNode<>(i10 | this.bitmap, TrieNodeKt.addElementAtIndex(this.buffer, indexOfCellAt$runtime_release(i10), e10));
    }

    private final int calculateSize() {
        if (this.bitmap == 0) {
            return this.buffer.length;
        }
        int iCalculateSize = 0;
        for (Object obj : this.buffer) {
            iCalculateSize += obj instanceof TrieNode ? ((TrieNode) obj).calculateSize() : 1;
        }
        return iCalculateSize;
    }

    private final TrieNode<E> collisionAdd(E e10) {
        return collisionContainsElement(e10) ? this : new TrieNode<>(0, TrieNodeKt.addElementAtIndex(this.buffer, 0, e10));
    }

    private final boolean collisionContainsElement(E e10) {
        return AbstractC10968r.m24090m0(this.buffer, e10);
    }

    private final TrieNode<E> collisionRemove(E e10) {
        int iM24048G0 = AbstractC10968r.m24048G0(this.buffer, e10);
        return iM24048G0 != -1 ? collisionRemoveElementAtIndex(iM24048G0) : this;
    }

    private final TrieNode<E> collisionRemoveElementAtIndex(int i10) {
        return new TrieNode<>(0, TrieNodeKt.removeCellAtIndex(this.buffer, i10));
    }

    private final E elementAtIndex(int i10) {
        return (E) this.buffer[i10];
    }

    private final boolean elementsIdentityEquals(TrieNode<E> trieNode) {
        if (this == trieNode) {
            return true;
        }
        if (this.bitmap != trieNode.bitmap) {
            return false;
        }
        int length = this.buffer.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (this.buffer[i10] != trieNode.buffer[i10]) {
                return false;
            }
        }
        return true;
    }

    private final boolean hasNoCellAt(int i10) {
        return (i10 & this.bitmap) == 0;
    }

    private final TrieNode<E> makeNode(int i10, E e10, int i11, E e11, int i12, MutabilityOwnership mutabilityOwnership) {
        if (i12 > 30) {
            return new TrieNode<>(0, new Object[]{e10, e11}, mutabilityOwnership);
        }
        int iIndexSegment = TrieNodeKt.indexSegment(i10, i12);
        int iIndexSegment2 = TrieNodeKt.indexSegment(i11, i12);
        if (iIndexSegment != iIndexSegment2) {
            return new TrieNode<>((1 << iIndexSegment) | (1 << iIndexSegment2), iIndexSegment < iIndexSegment2 ? new Object[]{e10, e11} : new Object[]{e11, e10}, mutabilityOwnership);
        }
        return new TrieNode<>(1 << iIndexSegment, new Object[]{makeNode(i10, e10, i11, e11, i12 + 5, mutabilityOwnership)}, mutabilityOwnership);
    }

    private final TrieNode<E> makeNodeAtIndex(int i10, int i11, E e10, int i12, MutabilityOwnership mutabilityOwnership) {
        E eElementAtIndex = elementAtIndex(i10);
        return makeNode(eElementAtIndex != null ? eElementAtIndex.hashCode() : 0, eElementAtIndex, i11, e10, i12 + 5, mutabilityOwnership);
    }

    private final TrieNode<E> moveElementToNode(int i10, int i11, E e10, int i12) {
        Object[] objArr = this.buffer;
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        AbstractC9979u.m20293f(objArrCopyOf, "copyOf(...)");
        objArrCopyOf[i10] = makeNodeAtIndex(i10, i11, e10, i12, null);
        return new TrieNode<>(this.bitmap, objArrCopyOf);
    }

    private final TrieNode<E> mutableAddElementAt(int i10, E e10, MutabilityOwnership mutabilityOwnership) {
        int iIndexOfCellAt$runtime_release = indexOfCellAt$runtime_release(i10);
        if (this.ownedBy != mutabilityOwnership) {
            return new TrieNode<>(i10 | this.bitmap, TrieNodeKt.addElementAtIndex(this.buffer, iIndexOfCellAt$runtime_release, e10), mutabilityOwnership);
        }
        this.buffer = TrieNodeKt.addElementAtIndex(this.buffer, iIndexOfCellAt$runtime_release, e10);
        this.bitmap = i10 | this.bitmap;
        return this;
    }

    private final TrieNode<E> mutableCollisionAdd(E e10, PersistentHashSetBuilder<?> persistentHashSetBuilder) {
        if (collisionContainsElement(e10)) {
            return this;
        }
        persistentHashSetBuilder.setSize(persistentHashSetBuilder.size() + 1);
        if (this.ownedBy != persistentHashSetBuilder.getOwnership$runtime_release()) {
            return new TrieNode<>(0, TrieNodeKt.addElementAtIndex(this.buffer, 0, e10), persistentHashSetBuilder.getOwnership$runtime_release());
        }
        this.buffer = TrieNodeKt.addElementAtIndex(this.buffer, 0, e10);
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final TrieNode<E> mutableCollisionAddAll(TrieNode<E> trieNode, DeltaCounter deltaCounter, MutabilityOwnership mutabilityOwnership) {
        if (this == trieNode) {
            deltaCounter.plusAssign(this.buffer.length);
            return this;
        }
        Object[] objArr = this.buffer;
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length + trieNode.buffer.length);
        AbstractC9979u.m20293f(objArrCopyOf, "copyOf(...)");
        Object[] objArr2 = trieNode.buffer;
        int length = this.buffer.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < objArr2.length) {
            CommonFunctionsKt.m30418assert(i11 <= i10);
            if (!collisionContainsElement(objArr2[i10])) {
                objArrCopyOf[length + i11] = objArr2[i10];
                i11++;
                CommonFunctionsKt.m30418assert(length + i11 <= objArrCopyOf.length);
            }
            i10++;
        }
        int length2 = i11 + this.buffer.length;
        deltaCounter.plusAssign(objArrCopyOf.length - length2);
        if (length2 == this.buffer.length) {
            return this;
        }
        if (length2 == trieNode.buffer.length) {
            return trieNode;
        }
        if (length2 != objArrCopyOf.length) {
            objArrCopyOf = Arrays.copyOf(objArrCopyOf, length2);
            AbstractC9979u.m20293f(objArrCopyOf, "copyOf(...)");
        }
        if (!AbstractC9979u.m20289b(this.ownedBy, mutabilityOwnership)) {
            return new TrieNode<>(0, objArrCopyOf, mutabilityOwnership);
        }
        this.buffer = objArrCopyOf;
        return this;
    }

    private final TrieNode<E> mutableCollisionRemove(E e10, PersistentHashSetBuilder<?> persistentHashSetBuilder) {
        int iM24048G0 = AbstractC10968r.m24048G0(this.buffer, e10);
        if (iM24048G0 == -1) {
            return this;
        }
        persistentHashSetBuilder.setSize(persistentHashSetBuilder.size() - 1);
        return mutableCollisionRemoveElementAtIndex(iM24048G0, persistentHashSetBuilder.getOwnership$runtime_release());
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final Object mutableCollisionRemoveAll(TrieNode<E> trieNode, DeltaCounter deltaCounter, MutabilityOwnership mutabilityOwnership) {
        if (this == trieNode) {
            deltaCounter.plusAssign(this.buffer.length);
            return EMPTY;
        }
        Object[] objArr = AbstractC9979u.m20289b(mutabilityOwnership, this.ownedBy) ? this.buffer : new Object[this.buffer.length];
        Object[] objArr2 = this.buffer;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            if (i10 >= objArr2.length) {
                break;
            }
            CommonFunctionsKt.m30418assert(i11 <= i10);
            if (!trieNode.collisionContainsElement(objArr2[i10])) {
                objArr[i11] = objArr2[i10];
                i11++;
                CommonFunctionsKt.m30418assert(i11 <= objArr.length);
            }
            i10++;
        }
        deltaCounter.plusAssign(this.buffer.length - i11);
        if (i11 == 0) {
            return EMPTY;
        }
        if (i11 == 1) {
            return objArr[0];
        }
        if (i11 == this.buffer.length) {
            return this;
        }
        if (i11 == objArr.length) {
            return new TrieNode(0, objArr, mutabilityOwnership);
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr, i11);
        AbstractC9979u.m20293f(objArrCopyOf, "copyOf(...)");
        return new TrieNode(0, objArrCopyOf, mutabilityOwnership);
    }

    private final TrieNode<E> mutableCollisionRemoveElementAtIndex(int i10, MutabilityOwnership mutabilityOwnership) {
        if (this.ownedBy != mutabilityOwnership) {
            return new TrieNode<>(0, TrieNodeKt.removeCellAtIndex(this.buffer, i10), mutabilityOwnership);
        }
        this.buffer = TrieNodeKt.removeCellAtIndex(this.buffer, i10);
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final Object mutableCollisionRetainAll(TrieNode<E> trieNode, DeltaCounter deltaCounter, MutabilityOwnership mutabilityOwnership) {
        if (this == trieNode) {
            deltaCounter.plusAssign(this.buffer.length);
            return this;
        }
        Object[] objArr = AbstractC9979u.m20289b(mutabilityOwnership, this.ownedBy) ? this.buffer : new Object[Math.min(this.buffer.length, trieNode.buffer.length)];
        Object[] objArr2 = this.buffer;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            if (i10 >= objArr2.length) {
                break;
            }
            CommonFunctionsKt.m30418assert(i11 <= i10);
            if (trieNode.collisionContainsElement(objArr2[i10])) {
                objArr[i11] = objArr2[i10];
                i11++;
                CommonFunctionsKt.m30418assert(i11 <= objArr.length);
            }
            i10++;
        }
        deltaCounter.plusAssign(i11);
        if (i11 == 0) {
            return EMPTY;
        }
        if (i11 == 1) {
            return objArr[0];
        }
        if (i11 == this.buffer.length) {
            return this;
        }
        if (i11 == trieNode.buffer.length) {
            return trieNode;
        }
        if (i11 == objArr.length) {
            return new TrieNode(0, objArr, mutabilityOwnership);
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr, i11);
        AbstractC9979u.m20293f(objArrCopyOf, "copyOf(...)");
        return new TrieNode(0, objArrCopyOf, mutabilityOwnership);
    }

    private final TrieNode<E> mutableMoveElementToNode(int i10, int i11, E e10, int i12, MutabilityOwnership mutabilityOwnership) {
        if (this.ownedBy == mutabilityOwnership) {
            this.buffer[i10] = makeNodeAtIndex(i10, i11, e10, i12, mutabilityOwnership);
            return this;
        }
        Object[] objArr = this.buffer;
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        AbstractC9979u.m20293f(objArrCopyOf, "copyOf(...)");
        objArrCopyOf[i10] = makeNodeAtIndex(i10, i11, e10, i12, mutabilityOwnership);
        return new TrieNode<>(this.bitmap, objArrCopyOf, mutabilityOwnership);
    }

    private final TrieNode<E> mutableRemoveCellAtIndex(int i10, int i11, MutabilityOwnership mutabilityOwnership) {
        if (this.ownedBy != mutabilityOwnership) {
            return new TrieNode<>(i11 ^ this.bitmap, TrieNodeKt.removeCellAtIndex(this.buffer, i10), mutabilityOwnership);
        }
        this.buffer = TrieNodeKt.removeCellAtIndex(this.buffer, i10);
        this.bitmap ^= i11;
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r0v4 */
    private final TrieNode<E> mutableUpdateNodeAtIndex(int i10, TrieNode<E> trieNode, MutabilityOwnership mutabilityOwnership) {
        ?? r02 = trieNode.buffer;
        if (r02.length == 1) {
            ?? r03 = r02[0];
            if (!(r03 instanceof TrieNode)) {
                if (this.buffer.length == 1) {
                    trieNode.bitmap = this.bitmap;
                    return trieNode;
                }
                trieNode = r03;
            }
        }
        if (this.ownedBy == mutabilityOwnership) {
            this.buffer[i10] = trieNode;
            return this;
        }
        Object[] objArr = this.buffer;
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        AbstractC9979u.m20293f(objArrCopyOf, "copyOf(...)");
        objArrCopyOf[i10] = trieNode;
        return new TrieNode<>(this.bitmap, objArrCopyOf, mutabilityOwnership);
    }

    private final TrieNode<E> nodeAtIndex(int i10) {
        Object obj = this.buffer[i10];
        AbstractC9979u.m20292e(obj, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode>");
        return (TrieNode) obj;
    }

    private final TrieNode<E> removeCellAtIndex(int i10, int i11) {
        return new TrieNode<>(i11 ^ this.bitmap, TrieNodeKt.removeCellAtIndex(this.buffer, i10));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r0v3 */
    private final TrieNode<E> updateNodeAtIndex(int i10, TrieNode<E> trieNode) {
        ?? r02 = trieNode.buffer;
        if (r02.length == 1) {
            ?? r03 = r02[0];
            if (!(r03 instanceof TrieNode)) {
                if (this.buffer.length == 1) {
                    trieNode.bitmap = this.bitmap;
                    return trieNode;
                }
                trieNode = r03;
            }
        }
        Object[] objArr = this.buffer;
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        AbstractC9979u.m20293f(objArrCopyOf, "copyOf(...)");
        objArrCopyOf[i10] = trieNode;
        return new TrieNode<>(this.bitmap, objArrCopyOf);
    }

    public final TrieNode<E> add(int i10, E e10, int i11) {
        int iIndexSegment = 1 << TrieNodeKt.indexSegment(i10, i11);
        if (hasNoCellAt(iIndexSegment)) {
            return addElementAt(iIndexSegment, e10);
        }
        int iIndexOfCellAt$runtime_release = indexOfCellAt$runtime_release(iIndexSegment);
        Object obj = this.buffer[iIndexOfCellAt$runtime_release];
        if (obj instanceof TrieNode) {
            TrieNode<E> trieNodeNodeAtIndex = nodeAtIndex(iIndexOfCellAt$runtime_release);
            TrieNode<E> trieNodeCollisionAdd = i11 == 30 ? trieNodeNodeAtIndex.collisionAdd(e10) : trieNodeNodeAtIndex.add(i10, e10, i11 + 5);
            if (trieNodeNodeAtIndex != trieNodeCollisionAdd) {
                return updateNodeAtIndex(iIndexOfCellAt$runtime_release, trieNodeCollisionAdd);
            }
        } else if (!AbstractC9979u.m20289b(e10, obj)) {
            return moveElementToNode(iIndexOfCellAt$runtime_release, i10, e10, i11);
        }
        return this;
    }

    public final boolean contains(int i10, E e10, int i11) {
        int iIndexSegment = 1 << TrieNodeKt.indexSegment(i10, i11);
        if (hasNoCellAt(iIndexSegment)) {
            return false;
        }
        int iIndexOfCellAt$runtime_release = indexOfCellAt$runtime_release(iIndexSegment);
        Object obj = this.buffer[iIndexOfCellAt$runtime_release];
        if (!(obj instanceof TrieNode)) {
            return AbstractC9979u.m20289b(e10, obj);
        }
        TrieNode<E> trieNodeNodeAtIndex = nodeAtIndex(iIndexOfCellAt$runtime_release);
        return i11 == 30 ? trieNodeNodeAtIndex.collisionContainsElement(e10) : trieNodeNodeAtIndex.contains(i10, e10, i11 + 5);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean containsAll(TrieNode<E> trieNode, int i10) {
        if (this == trieNode) {
            return true;
        }
        if (i10 > 30) {
            for (Object obj : trieNode.buffer) {
                if (!AbstractC10968r.m24090m0(this.buffer, obj)) {
                    return false;
                }
            }
            return true;
        }
        int i11 = this.bitmap;
        int i12 = trieNode.bitmap;
        int i13 = i11 & i12;
        if (i13 != i12) {
            return false;
        }
        while (i13 != 0) {
            int iLowestOneBit = Integer.lowestOneBit(i13);
            int iIndexOfCellAt$runtime_release = indexOfCellAt$runtime_release(iLowestOneBit);
            int iIndexOfCellAt$runtime_release2 = trieNode.indexOfCellAt$runtime_release(iLowestOneBit);
            Object obj2 = this.buffer[iIndexOfCellAt$runtime_release];
            Object obj3 = trieNode.buffer[iIndexOfCellAt$runtime_release2];
            boolean z10 = obj2 instanceof TrieNode;
            boolean z11 = obj3 instanceof TrieNode;
            if (z10 && z11) {
                AbstractC9979u.m20292e(obj2, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode>");
                AbstractC9979u.m20292e(obj3, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode>");
                if (!((TrieNode) obj2).containsAll((TrieNode) obj3, i10 + 5)) {
                    return false;
                }
            } else if (z10) {
                AbstractC9979u.m20292e(obj2, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode>");
                if (!((TrieNode) obj2).contains(obj3 != null ? obj3.hashCode() : 0, obj3, i10 + 5)) {
                    return false;
                }
            } else if (z11 || !AbstractC9979u.m20289b(obj2, obj3)) {
                return false;
            }
            i13 ^= iLowestOneBit;
        }
        return true;
    }

    public final int getBitmap() {
        return this.bitmap;
    }

    public final Object[] getBuffer() {
        return this.buffer;
    }

    public final MutabilityOwnership getOwnedBy() {
        return this.ownedBy;
    }

    public final int indexOfCellAt$runtime_release(int i10) {
        return Integer.bitCount((i10 - 1) & this.bitmap);
    }

    public final TrieNode<E> mutableAdd(int i10, E e10, int i11, PersistentHashSetBuilder<?> persistentHashSetBuilder) {
        int iIndexSegment = 1 << TrieNodeKt.indexSegment(i10, i11);
        if (hasNoCellAt(iIndexSegment)) {
            persistentHashSetBuilder.setSize(persistentHashSetBuilder.size() + 1);
            return mutableAddElementAt(iIndexSegment, e10, persistentHashSetBuilder.getOwnership$runtime_release());
        }
        int iIndexOfCellAt$runtime_release = indexOfCellAt$runtime_release(iIndexSegment);
        Object obj = this.buffer[iIndexOfCellAt$runtime_release];
        if (obj instanceof TrieNode) {
            TrieNode<E> trieNodeNodeAtIndex = nodeAtIndex(iIndexOfCellAt$runtime_release);
            TrieNode<E> trieNodeMutableCollisionAdd = i11 == 30 ? trieNodeNodeAtIndex.mutableCollisionAdd(e10, persistentHashSetBuilder) : trieNodeNodeAtIndex.mutableAdd(i10, e10, i11 + 5, persistentHashSetBuilder);
            if (trieNodeNodeAtIndex != trieNodeMutableCollisionAdd) {
                return mutableUpdateNodeAtIndex(iIndexOfCellAt$runtime_release, trieNodeMutableCollisionAdd, persistentHashSetBuilder.getOwnership$runtime_release());
            }
        } else if (!AbstractC9979u.m20289b(e10, obj)) {
            persistentHashSetBuilder.setSize(persistentHashSetBuilder.size() + 1);
            return mutableMoveElementToNode(iIndexOfCellAt$runtime_release, i10, e10, i11, persistentHashSetBuilder.getOwnership$runtime_release());
        }
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final TrieNode<E> mutableAddAll(TrieNode<E> trieNode, int i10, DeltaCounter deltaCounter, PersistentHashSetBuilder<?> persistentHashSetBuilder) {
        Object objMakeNode;
        Object[] objArr;
        if (this == trieNode) {
            deltaCounter.setCount(deltaCounter.getCount() + calculateSize());
            return this;
        }
        if (i10 > 30) {
            return mutableCollisionAddAll(trieNode, deltaCounter, persistentHashSetBuilder.getOwnership$runtime_release());
        }
        int i11 = this.bitmap;
        int i12 = trieNode.bitmap | i11;
        TrieNode<E> trieNode2 = (i12 == i11 && AbstractC9979u.m20289b(this.ownedBy, persistentHashSetBuilder.getOwnership$runtime_release())) ? this : new TrieNode<>(i12, new Object[Integer.bitCount(i12)], persistentHashSetBuilder.getOwnership$runtime_release());
        int i13 = i12;
        int i14 = 0;
        while (i13 != 0) {
            int iLowestOneBit = Integer.lowestOneBit(i13);
            int iIndexOfCellAt$runtime_release = indexOfCellAt$runtime_release(iLowestOneBit);
            int iIndexOfCellAt$runtime_release2 = trieNode.indexOfCellAt$runtime_release(iLowestOneBit);
            Object[] objArr2 = trieNode2.buffer;
            if (hasNoCellAt(iLowestOneBit)) {
                objMakeNode = trieNode.buffer[iIndexOfCellAt$runtime_release2];
            } else if (trieNode.hasNoCellAt(iLowestOneBit)) {
                objMakeNode = this.buffer[iIndexOfCellAt$runtime_release];
            } else {
                objMakeNode = this.buffer[iIndexOfCellAt$runtime_release];
                Object obj = trieNode.buffer[iIndexOfCellAt$runtime_release2];
                boolean z10 = objMakeNode instanceof TrieNode;
                boolean z11 = obj instanceof TrieNode;
                if (z10 && z11) {
                    AbstractC9979u.m20292e(objMakeNode, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode>");
                    AbstractC9979u.m20292e(obj, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode>");
                    objMakeNode = ((TrieNode) objMakeNode).mutableAddAll((TrieNode) obj, i10 + 5, deltaCounter, persistentHashSetBuilder);
                } else if (z10) {
                    AbstractC9979u.m20292e(objMakeNode, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode>");
                    TrieNode trieNode3 = (TrieNode) objMakeNode;
                    int size = persistentHashSetBuilder.size();
                    objMakeNode = trieNode3.mutableAdd(obj != null ? obj.hashCode() : 0, obj, i10 + 5, persistentHashSetBuilder);
                    if (persistentHashSetBuilder.size() == size) {
                        deltaCounter.setCount(deltaCounter.getCount() + 1);
                    }
                    C10786q c10786q = C10786q.f26013a;
                } else if (z11) {
                    AbstractC9979u.m20292e(obj, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode>");
                    TrieNode trieNode4 = (TrieNode) obj;
                    int size2 = persistentHashSetBuilder.size();
                    objMakeNode = trieNode4.mutableAdd(objMakeNode != null ? objMakeNode.hashCode() : 0, objMakeNode, i10 + 5, persistentHashSetBuilder);
                    if (persistentHashSetBuilder.size() == size2) {
                        deltaCounter.setCount(deltaCounter.getCount() + 1);
                    }
                    C10786q c10786q2 = C10786q.f26013a;
                } else if (AbstractC9979u.m20289b(objMakeNode, obj)) {
                    deltaCounter.setCount(deltaCounter.getCount() + 1);
                    C10786q c10786q3 = C10786q.f26013a;
                } else {
                    objArr = objArr2;
                    objMakeNode = makeNode(objMakeNode != null ? objMakeNode.hashCode() : 0, objMakeNode, obj != null ? obj.hashCode() : 0, obj, i10 + 5, persistentHashSetBuilder.getOwnership$runtime_release());
                    objArr[i14] = objMakeNode;
                    i14++;
                    i13 ^= iLowestOneBit;
                }
            }
            objArr = objArr2;
            objArr[i14] = objMakeNode;
            i14++;
            i13 ^= iLowestOneBit;
        }
        return elementsIdentityEquals(trieNode2) ? this : trieNode.elementsIdentityEquals(trieNode2) ? trieNode : trieNode2;
    }

    public final TrieNode<E> mutableRemove(int i10, E e10, int i11, PersistentHashSetBuilder<?> persistentHashSetBuilder) {
        int iIndexSegment = 1 << TrieNodeKt.indexSegment(i10, i11);
        if (!hasNoCellAt(iIndexSegment)) {
            int iIndexOfCellAt$runtime_release = indexOfCellAt$runtime_release(iIndexSegment);
            Object obj = this.buffer[iIndexOfCellAt$runtime_release];
            if (obj instanceof TrieNode) {
                TrieNode<E> trieNodeNodeAtIndex = nodeAtIndex(iIndexOfCellAt$runtime_release);
                TrieNode<E> trieNodeMutableCollisionRemove = i11 == 30 ? trieNodeNodeAtIndex.mutableCollisionRemove(e10, persistentHashSetBuilder) : trieNodeNodeAtIndex.mutableRemove(i10, e10, i11 + 5, persistentHashSetBuilder);
                if (this.ownedBy == persistentHashSetBuilder.getOwnership$runtime_release() || trieNodeNodeAtIndex != trieNodeMutableCollisionRemove) {
                    return mutableUpdateNodeAtIndex(iIndexOfCellAt$runtime_release, trieNodeMutableCollisionRemove, persistentHashSetBuilder.getOwnership$runtime_release());
                }
            } else if (AbstractC9979u.m20289b(e10, obj)) {
                persistentHashSetBuilder.setSize(persistentHashSetBuilder.size() - 1);
                return mutableRemoveCellAtIndex(iIndexOfCellAt$runtime_release, iIndexSegment, persistentHashSetBuilder.getOwnership$runtime_release());
            }
        }
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00b7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object mutableRemoveAll(androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E> r18, int r19, androidx.compose.runtime.external.kotlinx.collections.immutable.internal.DeltaCounter r20, androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.PersistentHashSetBuilder<?> r21) {
        /*
            Method dump skipped, instructions count: 352
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode.mutableRemoveAll(androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode, int, androidx.compose.runtime.external.kotlinx.collections.immutable.internal.DeltaCounter, androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.PersistentHashSetBuilder):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Object mutableRetainAll(TrieNode<E> trieNode, int i10, DeltaCounter deltaCounter, PersistentHashSetBuilder<?> persistentHashSetBuilder) {
        if (this == trieNode) {
            deltaCounter.plusAssign(calculateSize());
            return this;
        }
        if (i10 > 30) {
            return mutableCollisionRetainAll(trieNode, deltaCounter, persistentHashSetBuilder.getOwnership$runtime_release());
        }
        int i11 = this.bitmap & trieNode.bitmap;
        if (i11 == 0) {
            return EMPTY;
        }
        TrieNode<E> trieNode2 = (AbstractC9979u.m20289b(this.ownedBy, persistentHashSetBuilder.getOwnership$runtime_release()) && i11 == this.bitmap) ? this : new TrieNode<>(i11, new Object[Integer.bitCount(i11)], persistentHashSetBuilder.getOwnership$runtime_release());
        int i12 = i11;
        int i13 = 0;
        int i14 = 0;
        while (i12 != 0) {
            int iLowestOneBit = Integer.lowestOneBit(i12);
            int iIndexOfCellAt$runtime_release = indexOfCellAt$runtime_release(iLowestOneBit);
            int iIndexOfCellAt$runtime_release2 = trieNode.indexOfCellAt$runtime_release(iLowestOneBit);
            Object objMutableRetainAll = this.buffer[iIndexOfCellAt$runtime_release];
            Object obj = trieNode.buffer[iIndexOfCellAt$runtime_release2];
            boolean z10 = objMutableRetainAll instanceof TrieNode;
            boolean z11 = obj instanceof TrieNode;
            if (z10 && z11) {
                AbstractC9979u.m20292e(objMutableRetainAll, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode>");
                AbstractC9979u.m20292e(obj, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode>");
                objMutableRetainAll = ((TrieNode) objMutableRetainAll).mutableRetainAll((TrieNode) obj, i10 + 5, deltaCounter, persistentHashSetBuilder);
            } else if (z10) {
                AbstractC9979u.m20292e(objMutableRetainAll, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode>");
                if (((TrieNode) objMutableRetainAll).contains(obj != null ? obj.hashCode() : 0, obj, i10 + 5)) {
                    deltaCounter.plusAssign(1);
                    objMutableRetainAll = obj;
                } else {
                    objMutableRetainAll = EMPTY;
                }
            } else if (z11) {
                AbstractC9979u.m20292e(obj, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode>");
                if (((TrieNode) obj).contains(objMutableRetainAll != null ? objMutableRetainAll.hashCode() : 0, objMutableRetainAll, i10 + 5)) {
                    deltaCounter.plusAssign(1);
                } else {
                    objMutableRetainAll = EMPTY;
                }
            } else if (AbstractC9979u.m20289b(objMutableRetainAll, obj)) {
                deltaCounter.plusAssign(1);
            } else {
                objMutableRetainAll = EMPTY;
            }
            if (objMutableRetainAll != EMPTY) {
                i13 |= iLowestOneBit;
            }
            trieNode2.buffer[i14] = objMutableRetainAll;
            i14++;
            i12 ^= iLowestOneBit;
        }
        int iBitCount = Integer.bitCount(i13);
        if (i13 == 0) {
            return EMPTY;
        }
        if (i13 == i11) {
            return trieNode2.elementsIdentityEquals(this) ? this : trieNode2.elementsIdentityEquals(trieNode) ? trieNode : trieNode2;
        }
        if (iBitCount == 1 && i10 != 0) {
            Object obj2 = trieNode2.buffer[trieNode2.indexOfCellAt$runtime_release(i13)];
            return obj2 instanceof TrieNode ? new TrieNode(i13, new Object[]{obj2}, persistentHashSetBuilder.getOwnership$runtime_release()) : obj2;
        }
        Object[] objArr = new Object[iBitCount];
        Object[] objArr2 = trieNode2.buffer;
        int i15 = 0;
        int i16 = 0;
        while (i15 < objArr2.length) {
            CommonFunctionsKt.m30418assert(i16 <= i15);
            if (objArr2[i15] != Companion.getEMPTY$runtime_release()) {
                objArr[i16] = objArr2[i15];
                i16++;
                CommonFunctionsKt.m30418assert(i16 <= iBitCount);
            }
            i15++;
        }
        return new TrieNode(i13, objArr, persistentHashSetBuilder.getOwnership$runtime_release());
    }

    public final TrieNode<E> remove(int i10, E e10, int i11) {
        int iIndexSegment = 1 << TrieNodeKt.indexSegment(i10, i11);
        if (!hasNoCellAt(iIndexSegment)) {
            int iIndexOfCellAt$runtime_release = indexOfCellAt$runtime_release(iIndexSegment);
            Object obj = this.buffer[iIndexOfCellAt$runtime_release];
            if (obj instanceof TrieNode) {
                TrieNode<E> trieNodeNodeAtIndex = nodeAtIndex(iIndexOfCellAt$runtime_release);
                TrieNode<E> trieNodeCollisionRemove = i11 == 30 ? trieNodeNodeAtIndex.collisionRemove(e10) : trieNodeNodeAtIndex.remove(i10, e10, i11 + 5);
                if (trieNodeNodeAtIndex != trieNodeCollisionRemove) {
                    return updateNodeAtIndex(iIndexOfCellAt$runtime_release, trieNodeCollisionRemove);
                }
            } else if (AbstractC9979u.m20289b(e10, obj)) {
                return removeCellAtIndex(iIndexOfCellAt$runtime_release, iIndexSegment);
            }
        }
        return this;
    }

    public final void setBitmap(int i10) {
        this.bitmap = i10;
    }

    public final void setBuffer(Object[] objArr) {
        this.buffer = objArr;
    }

    public final void setOwnedBy(MutabilityOwnership mutabilityOwnership) {
        this.ownedBy = mutabilityOwnership;
    }

    public TrieNode(int i10, Object[] objArr) {
        this(i10, objArr, null);
    }
}
