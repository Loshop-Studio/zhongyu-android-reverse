package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap;

import androidx.compose.runtime.PreconditionsKt;
import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.CommonFunctionsKt;
import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.DeltaCounter;
import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.MutabilityOwnership;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.Arrays;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;
import p077d8.AbstractC8323h;
import p077d8.C8319d;
import p300x7.InterfaceC10570l;
import p300x7.InterfaceC10577s;

@StabilityInferred(parameters = 0)
/* loaded from: classes2.dex */
public final class TrieNode<K, V> {
    private Object[] buffer;
    private int dataMap;
    private int nodeMap;
    private final MutabilityOwnership ownedBy;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final TrieNode EMPTY = new TrieNode(0, 0, new Object[0]);

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC9126n abstractC9126n) {
            this();
        }

        public final TrieNode getEMPTY$runtime_release() {
            return TrieNode.EMPTY;
        }

        private Companion() {
        }
    }

    @StabilityInferred(parameters = 0)
    public static final class ModificationResult<K, V> {
        public static final int $stable = 8;
        private TrieNode<K, V> node;
        private final int sizeDelta;

        public ModificationResult(TrieNode<K, V> trieNode, int i10) {
            this.node = trieNode;
            this.sizeDelta = i10;
        }

        public final TrieNode<K, V> getNode() {
            return this.node;
        }

        public final int getSizeDelta() {
            return this.sizeDelta;
        }

        public final ModificationResult<K, V> replaceNode(InterfaceC10570l interfaceC10570l) {
            setNode((TrieNode) interfaceC10570l.invoke(getNode()));
            return this;
        }

        public final void setNode(TrieNode<K, V> trieNode) {
            this.node = trieNode;
        }
    }

    public TrieNode(int i10, int i11, Object[] objArr, MutabilityOwnership mutabilityOwnership) {
        this.dataMap = i10;
        this.nodeMap = i11;
        this.ownedBy = mutabilityOwnership;
        this.buffer = objArr;
    }

    private final void accept(InterfaceC10577s interfaceC10577s, int i10, int i11) {
        interfaceC10577s.invoke(this, Integer.valueOf(i11), Integer.valueOf(i10), Integer.valueOf(this.dataMap), Integer.valueOf(this.nodeMap));
        int i12 = this.nodeMap;
        while (i12 != 0) {
            int iLowestOneBit = Integer.lowestOneBit(i12);
            nodeAtIndex$runtime_release(nodeIndex$runtime_release(iLowestOneBit)).accept(interfaceC10577s, (Integer.numberOfTrailingZeros(iLowestOneBit) << i11) + i10, i11 + 5);
            i12 -= iLowestOneBit;
        }
    }

    private final ModificationResult<K, V> asInsertResult() {
        return new ModificationResult<>(this, 1);
    }

    private final ModificationResult<K, V> asUpdateResult() {
        return new ModificationResult<>(this, 0);
    }

    private final Object[] bufferMoveEntryToNode(int i10, int i11, int i12, K k10, V v10, int i13, MutabilityOwnership mutabilityOwnership) {
        K kKeyAtIndex = keyAtIndex(i10);
        return TrieNodeKt.replaceEntryWithNode(this.buffer, i10, nodeIndex$runtime_release(i11) + 1, makeNode(kKeyAtIndex != null ? kKeyAtIndex.hashCode() : 0, kKeyAtIndex, valueAtKeyIndex(i10), i12, k10, v10, i13 + 5, mutabilityOwnership));
    }

    private final int calculateSize() {
        if (this.nodeMap == 0) {
            return this.buffer.length / 2;
        }
        int iBitCount = Integer.bitCount(this.dataMap);
        int length = this.buffer.length;
        for (int i10 = iBitCount * 2; i10 < length; i10++) {
            iBitCount += nodeAtIndex$runtime_release(i10).calculateSize();
        }
        return iBitCount;
    }

    private final boolean collisionContainsKey(K k10) {
        C8319d c8319dM13524s = AbstractC8323h.m13524s(AbstractC8323h.m13525t(0, this.buffer.length), 2);
        int iM13496b = c8319dM13524s.m13496b();
        int iM13497c = c8319dM13524s.m13497c();
        int iM13498d = c8319dM13524s.m13498d();
        if ((iM13498d > 0 && iM13496b <= iM13497c) || (iM13498d < 0 && iM13497c <= iM13496b)) {
            while (!AbstractC9133u.m16128b(k10, this.buffer[iM13496b])) {
                if (iM13496b != iM13497c) {
                    iM13496b += iM13498d;
                }
            }
            return true;
        }
        return false;
    }

    private final V collisionGet(K k10) {
        C8319d c8319dM13524s = AbstractC8323h.m13524s(AbstractC8323h.m13525t(0, this.buffer.length), 2);
        int iM13496b = c8319dM13524s.m13496b();
        int iM13497c = c8319dM13524s.m13497c();
        int iM13498d = c8319dM13524s.m13498d();
        if ((iM13498d <= 0 || iM13496b > iM13497c) && (iM13498d >= 0 || iM13497c > iM13496b)) {
            return null;
        }
        while (!AbstractC9133u.m16128b(k10, keyAtIndex(iM13496b))) {
            if (iM13496b == iM13497c) {
                return null;
            }
            iM13496b += iM13498d;
        }
        return valueAtKeyIndex(iM13496b);
    }

    private final ModificationResult<K, V> collisionPut(K k10, V v10) {
        C8319d c8319dM13524s = AbstractC8323h.m13524s(AbstractC8323h.m13525t(0, this.buffer.length), 2);
        int iM13496b = c8319dM13524s.m13496b();
        int iM13497c = c8319dM13524s.m13497c();
        int iM13498d = c8319dM13524s.m13498d();
        if ((iM13498d > 0 && iM13496b <= iM13497c) || (iM13498d < 0 && iM13497c <= iM13496b)) {
            while (!AbstractC9133u.m16128b(k10, keyAtIndex(iM13496b))) {
                if (iM13496b != iM13497c) {
                    iM13496b += iM13498d;
                }
            }
            if (v10 == valueAtKeyIndex(iM13496b)) {
                return null;
            }
            Object[] objArr = this.buffer;
            Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
            AbstractC9133u.m16132f(objArrCopyOf, "copyOf(...)");
            objArrCopyOf[iM13496b + 1] = v10;
            return new TrieNode(0, 0, objArrCopyOf).asUpdateResult();
        }
        return new TrieNode(0, 0, TrieNodeKt.insertEntryAtIndex(this.buffer, 0, k10, v10)).asInsertResult();
    }

    private final TrieNode<K, V> collisionRemove(K k10) {
        C8319d c8319dM13524s = AbstractC8323h.m13524s(AbstractC8323h.m13525t(0, this.buffer.length), 2);
        int iM13496b = c8319dM13524s.m13496b();
        int iM13497c = c8319dM13524s.m13497c();
        int iM13498d = c8319dM13524s.m13498d();
        if ((iM13498d > 0 && iM13496b <= iM13497c) || (iM13498d < 0 && iM13497c <= iM13496b)) {
            while (!AbstractC9133u.m16128b(k10, keyAtIndex(iM13496b))) {
                if (iM13496b != iM13497c) {
                    iM13496b += iM13498d;
                }
            }
            return collisionRemoveEntryAtIndex(iM13496b);
        }
        return this;
    }

    private final TrieNode<K, V> collisionRemoveEntryAtIndex(int i10) {
        Object[] objArr = this.buffer;
        if (objArr.length == 2) {
            return null;
        }
        return new TrieNode<>(0, 0, TrieNodeKt.removeEntryAtIndex(objArr, i10));
    }

    private final boolean elementsIdentityEquals(TrieNode<K, V> trieNode) {
        if (this == trieNode) {
            return true;
        }
        if (this.nodeMap != trieNode.nodeMap || this.dataMap != trieNode.dataMap) {
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

    private final boolean hasNodeAt(int i10) {
        return (i10 & this.nodeMap) != 0;
    }

    private final TrieNode<K, V> insertEntryAt(int i10, K k10, V v10) {
        return new TrieNode<>(i10 | this.dataMap, this.nodeMap, TrieNodeKt.insertEntryAtIndex(this.buffer, entryKeyIndex$runtime_release(i10), k10, v10));
    }

    private final K keyAtIndex(int i10) {
        return (K) this.buffer[i10];
    }

    private final TrieNode<K, V> makeNode(int i10, K k10, V v10, int i11, K k11, V v11, int i12, MutabilityOwnership mutabilityOwnership) {
        if (i12 > 30) {
            return new TrieNode<>(0, 0, new Object[]{k10, v10, k11, v11}, mutabilityOwnership);
        }
        int iIndexSegment = TrieNodeKt.indexSegment(i10, i12);
        int iIndexSegment2 = TrieNodeKt.indexSegment(i11, i12);
        if (iIndexSegment != iIndexSegment2) {
            return new TrieNode<>((1 << iIndexSegment) | (1 << iIndexSegment2), 0, iIndexSegment < iIndexSegment2 ? new Object[]{k10, v10, k11, v11} : new Object[]{k11, v11, k10, v10}, mutabilityOwnership);
        }
        return new TrieNode<>(0, 1 << iIndexSegment, new Object[]{makeNode(i10, k10, v10, i11, k11, v11, i12 + 5, mutabilityOwnership)}, mutabilityOwnership);
    }

    private final TrieNode<K, V> moveEntryToNode(int i10, int i11, int i12, K k10, V v10, int i13) {
        return new TrieNode<>(this.dataMap ^ i11, this.nodeMap | i11, bufferMoveEntryToNode(i10, i11, i12, k10, v10, i13, null));
    }

    private final TrieNode<K, V> mutableCollisionPut(K k10, V v10, PersistentHashMapBuilder<K, V> persistentHashMapBuilder) {
        C8319d c8319dM13524s = AbstractC8323h.m13524s(AbstractC8323h.m13525t(0, this.buffer.length), 2);
        int iM13496b = c8319dM13524s.m13496b();
        int iM13497c = c8319dM13524s.m13497c();
        int iM13498d = c8319dM13524s.m13498d();
        if ((iM13498d > 0 && iM13496b <= iM13497c) || (iM13498d < 0 && iM13497c <= iM13496b)) {
            while (!AbstractC9133u.m16128b(k10, keyAtIndex(iM13496b))) {
                if (iM13496b != iM13497c) {
                    iM13496b += iM13498d;
                }
            }
            persistentHashMapBuilder.setOperationResult$runtime_release(valueAtKeyIndex(iM13496b));
            if (this.ownedBy == persistentHashMapBuilder.getOwnership()) {
                this.buffer[iM13496b + 1] = v10;
                return this;
            }
            persistentHashMapBuilder.setModCount$runtime_release(persistentHashMapBuilder.getModCount$runtime_release() + 1);
            Object[] objArr = this.buffer;
            Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
            AbstractC9133u.m16132f(objArrCopyOf, "copyOf(...)");
            objArrCopyOf[iM13496b + 1] = v10;
            return new TrieNode<>(0, 0, objArrCopyOf, persistentHashMapBuilder.getOwnership());
        }
        persistentHashMapBuilder.setSize(persistentHashMapBuilder.size() + 1);
        return new TrieNode<>(0, 0, TrieNodeKt.insertEntryAtIndex(this.buffer, 0, k10, v10), persistentHashMapBuilder.getOwnership());
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final TrieNode<K, V> mutableCollisionPutAll(TrieNode<K, V> trieNode, DeltaCounter deltaCounter, MutabilityOwnership mutabilityOwnership) {
        CommonFunctionsKt.m23816assert(this.nodeMap == 0);
        CommonFunctionsKt.m23816assert(this.dataMap == 0);
        CommonFunctionsKt.m23816assert(trieNode.nodeMap == 0);
        CommonFunctionsKt.m23816assert(trieNode.dataMap == 0);
        Object[] objArr = this.buffer;
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length + trieNode.buffer.length);
        AbstractC9133u.m16132f(objArrCopyOf, "copyOf(...)");
        int length = this.buffer.length;
        C8319d c8319dM13524s = AbstractC8323h.m13524s(AbstractC8323h.m13525t(0, trieNode.buffer.length), 2);
        int iM13496b = c8319dM13524s.m13496b();
        int iM13497c = c8319dM13524s.m13497c();
        int iM13498d = c8319dM13524s.m13498d();
        if ((iM13498d > 0 && iM13496b <= iM13497c) || (iM13498d < 0 && iM13497c <= iM13496b)) {
            while (true) {
                if (collisionContainsKey(trieNode.buffer[iM13496b])) {
                    deltaCounter.setCount(deltaCounter.getCount() + 1);
                } else {
                    Object[] objArr2 = trieNode.buffer;
                    objArrCopyOf[length] = objArr2[iM13496b];
                    objArrCopyOf[length + 1] = objArr2[iM13496b + 1];
                    length += 2;
                }
                if (iM13496b == iM13497c) {
                    break;
                }
                iM13496b += iM13498d;
            }
        }
        if (length == this.buffer.length) {
            return this;
        }
        if (length == trieNode.buffer.length) {
            return trieNode;
        }
        if (length == objArrCopyOf.length) {
            return new TrieNode<>(0, 0, objArrCopyOf, mutabilityOwnership);
        }
        Object[] objArrCopyOf2 = Arrays.copyOf(objArrCopyOf, length);
        AbstractC9133u.m16132f(objArrCopyOf2, "copyOf(...)");
        return new TrieNode<>(0, 0, objArrCopyOf2, mutabilityOwnership);
    }

    private final TrieNode<K, V> mutableCollisionRemove(K k10, PersistentHashMapBuilder<K, V> persistentHashMapBuilder) {
        C8319d c8319dM13524s = AbstractC8323h.m13524s(AbstractC8323h.m13525t(0, this.buffer.length), 2);
        int iM13496b = c8319dM13524s.m13496b();
        int iM13497c = c8319dM13524s.m13497c();
        int iM13498d = c8319dM13524s.m13498d();
        if ((iM13498d > 0 && iM13496b <= iM13497c) || (iM13498d < 0 && iM13497c <= iM13496b)) {
            while (!AbstractC9133u.m16128b(k10, keyAtIndex(iM13496b))) {
                if (iM13496b != iM13497c) {
                    iM13496b += iM13498d;
                }
            }
            return mutableCollisionRemoveEntryAtIndex(iM13496b, persistentHashMapBuilder);
        }
        return this;
    }

    private final TrieNode<K, V> mutableCollisionRemoveEntryAtIndex(int i10, PersistentHashMapBuilder<K, V> persistentHashMapBuilder) {
        persistentHashMapBuilder.setSize(persistentHashMapBuilder.size() - 1);
        persistentHashMapBuilder.setOperationResult$runtime_release(valueAtKeyIndex(i10));
        if (this.buffer.length == 2) {
            return null;
        }
        if (this.ownedBy != persistentHashMapBuilder.getOwnership()) {
            return new TrieNode<>(0, 0, TrieNodeKt.removeEntryAtIndex(this.buffer, i10), persistentHashMapBuilder.getOwnership());
        }
        this.buffer = TrieNodeKt.removeEntryAtIndex(this.buffer, i10);
        return this;
    }

    private final TrieNode<K, V> mutableInsertEntryAt(int i10, K k10, V v10, MutabilityOwnership mutabilityOwnership) {
        int iEntryKeyIndex$runtime_release = entryKeyIndex$runtime_release(i10);
        if (this.ownedBy != mutabilityOwnership) {
            return new TrieNode<>(i10 | this.dataMap, this.nodeMap, TrieNodeKt.insertEntryAtIndex(this.buffer, iEntryKeyIndex$runtime_release, k10, v10), mutabilityOwnership);
        }
        this.buffer = TrieNodeKt.insertEntryAtIndex(this.buffer, iEntryKeyIndex$runtime_release, k10, v10);
        this.dataMap = i10 | this.dataMap;
        return this;
    }

    private final TrieNode<K, V> mutableMoveEntryToNode(int i10, int i11, int i12, K k10, V v10, int i13, MutabilityOwnership mutabilityOwnership) {
        if (this.ownedBy != mutabilityOwnership) {
            return new TrieNode<>(this.dataMap ^ i11, i11 | this.nodeMap, bufferMoveEntryToNode(i10, i11, i12, k10, v10, i13, mutabilityOwnership), mutabilityOwnership);
        }
        this.buffer = bufferMoveEntryToNode(i10, i11, i12, k10, v10, i13, mutabilityOwnership);
        this.dataMap ^= i11;
        this.nodeMap |= i11;
        return this;
    }

    private final TrieNode<K, V> mutablePutAllFromOtherNodeCell(TrieNode<K, V> trieNode, int i10, int i11, DeltaCounter deltaCounter, PersistentHashMapBuilder<K, V> persistentHashMapBuilder) {
        if (hasNodeAt(i10)) {
            TrieNode<K, V> trieNodeNodeAtIndex$runtime_release = nodeAtIndex$runtime_release(nodeIndex$runtime_release(i10));
            if (trieNode.hasNodeAt(i10)) {
                return trieNodeNodeAtIndex$runtime_release.mutablePutAll(trieNode.nodeAtIndex$runtime_release(trieNode.nodeIndex$runtime_release(i10)), i11 + 5, deltaCounter, persistentHashMapBuilder);
            }
            if (!trieNode.hasEntryAt$runtime_release(i10)) {
                return trieNodeNodeAtIndex$runtime_release;
            }
            int iEntryKeyIndex$runtime_release = trieNode.entryKeyIndex$runtime_release(i10);
            K kKeyAtIndex = trieNode.keyAtIndex(iEntryKeyIndex$runtime_release);
            V vValueAtKeyIndex = trieNode.valueAtKeyIndex(iEntryKeyIndex$runtime_release);
            int size = persistentHashMapBuilder.size();
            TrieNode<K, V> trieNodeMutablePut = trieNodeNodeAtIndex$runtime_release.mutablePut(kKeyAtIndex != null ? kKeyAtIndex.hashCode() : 0, kKeyAtIndex, vValueAtKeyIndex, i11 + 5, persistentHashMapBuilder);
            if (persistentHashMapBuilder.size() == size) {
                deltaCounter.setCount(deltaCounter.getCount() + 1);
            }
            return trieNodeMutablePut;
        }
        if (!trieNode.hasNodeAt(i10)) {
            int iEntryKeyIndex$runtime_release2 = entryKeyIndex$runtime_release(i10);
            K kKeyAtIndex2 = keyAtIndex(iEntryKeyIndex$runtime_release2);
            V vValueAtKeyIndex2 = valueAtKeyIndex(iEntryKeyIndex$runtime_release2);
            int iEntryKeyIndex$runtime_release3 = trieNode.entryKeyIndex$runtime_release(i10);
            K kKeyAtIndex3 = trieNode.keyAtIndex(iEntryKeyIndex$runtime_release3);
            return makeNode(kKeyAtIndex2 != null ? kKeyAtIndex2.hashCode() : 0, kKeyAtIndex2, vValueAtKeyIndex2, kKeyAtIndex3 != null ? kKeyAtIndex3.hashCode() : 0, kKeyAtIndex3, trieNode.valueAtKeyIndex(iEntryKeyIndex$runtime_release3), i11 + 5, persistentHashMapBuilder.getOwnership());
        }
        TrieNode<K, V> trieNodeNodeAtIndex$runtime_release2 = trieNode.nodeAtIndex$runtime_release(trieNode.nodeIndex$runtime_release(i10));
        if (!hasEntryAt$runtime_release(i10)) {
            return trieNodeNodeAtIndex$runtime_release2;
        }
        int iEntryKeyIndex$runtime_release4 = entryKeyIndex$runtime_release(i10);
        K kKeyAtIndex4 = keyAtIndex(iEntryKeyIndex$runtime_release4);
        int i12 = i11 + 5;
        if (!trieNodeNodeAtIndex$runtime_release2.containsKey(kKeyAtIndex4 != null ? kKeyAtIndex4.hashCode() : 0, kKeyAtIndex4, i12)) {
            return trieNodeNodeAtIndex$runtime_release2.mutablePut(kKeyAtIndex4 != null ? kKeyAtIndex4.hashCode() : 0, kKeyAtIndex4, valueAtKeyIndex(iEntryKeyIndex$runtime_release4), i12, persistentHashMapBuilder);
        }
        deltaCounter.setCount(deltaCounter.getCount() + 1);
        return trieNodeNodeAtIndex$runtime_release2;
    }

    private final TrieNode<K, V> mutableRemoveEntryAtIndex(int i10, int i11, PersistentHashMapBuilder<K, V> persistentHashMapBuilder) {
        persistentHashMapBuilder.setSize(persistentHashMapBuilder.size() - 1);
        persistentHashMapBuilder.setOperationResult$runtime_release(valueAtKeyIndex(i10));
        if (this.buffer.length == 2) {
            return null;
        }
        if (this.ownedBy != persistentHashMapBuilder.getOwnership()) {
            return new TrieNode<>(i11 ^ this.dataMap, this.nodeMap, TrieNodeKt.removeEntryAtIndex(this.buffer, i10), persistentHashMapBuilder.getOwnership());
        }
        this.buffer = TrieNodeKt.removeEntryAtIndex(this.buffer, i10);
        this.dataMap ^= i11;
        return this;
    }

    private final TrieNode<K, V> mutableRemoveNodeAtIndex(int i10, int i11, MutabilityOwnership mutabilityOwnership) {
        Object[] objArr = this.buffer;
        if (objArr.length == 1) {
            return null;
        }
        if (this.ownedBy != mutabilityOwnership) {
            return new TrieNode<>(this.dataMap, i11 ^ this.nodeMap, TrieNodeKt.removeNodeAtIndex(objArr, i10), mutabilityOwnership);
        }
        this.buffer = TrieNodeKt.removeNodeAtIndex(objArr, i10);
        this.nodeMap ^= i11;
        return this;
    }

    private final TrieNode<K, V> mutableReplaceNode(TrieNode<K, V> trieNode, TrieNode<K, V> trieNode2, int i10, int i11, MutabilityOwnership mutabilityOwnership) {
        return trieNode2 == null ? mutableRemoveNodeAtIndex(i10, i11, mutabilityOwnership) : (this.ownedBy == mutabilityOwnership || trieNode != trieNode2) ? mutableUpdateNodeAtIndex(i10, trieNode2, mutabilityOwnership) : this;
    }

    private final TrieNode<K, V> mutableUpdateNodeAtIndex(int i10, TrieNode<K, V> trieNode, MutabilityOwnership mutabilityOwnership) {
        Object[] objArr = this.buffer;
        if (objArr.length == 1 && trieNode.buffer.length == 2 && trieNode.nodeMap == 0) {
            trieNode.dataMap = this.nodeMap;
            return trieNode;
        }
        if (this.ownedBy == mutabilityOwnership) {
            objArr[i10] = trieNode;
            return this;
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        AbstractC9133u.m16132f(objArrCopyOf, "copyOf(...)");
        objArrCopyOf[i10] = trieNode;
        return new TrieNode<>(this.dataMap, this.nodeMap, objArrCopyOf, mutabilityOwnership);
    }

    private final TrieNode<K, V> mutableUpdateValueAtIndex(int i10, V v10, PersistentHashMapBuilder<K, V> persistentHashMapBuilder) {
        if (this.ownedBy == persistentHashMapBuilder.getOwnership()) {
            this.buffer[i10 + 1] = v10;
            return this;
        }
        persistentHashMapBuilder.setModCount$runtime_release(persistentHashMapBuilder.getModCount$runtime_release() + 1);
        Object[] objArr = this.buffer;
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        AbstractC9133u.m16132f(objArrCopyOf, "copyOf(...)");
        objArrCopyOf[i10 + 1] = v10;
        return new TrieNode<>(this.dataMap, this.nodeMap, objArrCopyOf, persistentHashMapBuilder.getOwnership());
    }

    private final TrieNode<K, V> removeEntryAtIndex(int i10, int i11) {
        Object[] objArr = this.buffer;
        if (objArr.length == 2) {
            return null;
        }
        return new TrieNode<>(i11 ^ this.dataMap, this.nodeMap, TrieNodeKt.removeEntryAtIndex(objArr, i10));
    }

    private final TrieNode<K, V> removeNodeAtIndex(int i10, int i11) {
        Object[] objArr = this.buffer;
        if (objArr.length == 1) {
            return null;
        }
        return new TrieNode<>(this.dataMap, i11 ^ this.nodeMap, TrieNodeKt.removeNodeAtIndex(objArr, i10));
    }

    private final TrieNode<K, V> replaceNode(TrieNode<K, V> trieNode, TrieNode<K, V> trieNode2, int i10, int i11) {
        return trieNode2 == null ? removeNodeAtIndex(i10, i11) : trieNode != trieNode2 ? updateNodeAtIndex(i10, i11, trieNode2) : this;
    }

    private final TrieNode<K, V> updateNodeAtIndex(int i10, int i11, TrieNode<K, V> trieNode) {
        Object[] objArr = trieNode.buffer;
        if (objArr.length != 2 || trieNode.nodeMap != 0) {
            Object[] objArr2 = this.buffer;
            Object[] objArrCopyOf = Arrays.copyOf(objArr2, objArr2.length);
            AbstractC9133u.m16132f(objArrCopyOf, "copyOf(...)");
            objArrCopyOf[i10] = trieNode;
            return new TrieNode<>(this.dataMap, this.nodeMap, objArrCopyOf);
        }
        if (this.buffer.length == 1) {
            trieNode.dataMap = this.nodeMap;
            return trieNode;
        }
        return new TrieNode<>(this.dataMap ^ i11, i11 ^ this.nodeMap, TrieNodeKt.replaceNodeWithEntry(this.buffer, i10, entryKeyIndex$runtime_release(i11), objArr[0], objArr[1]));
    }

    private final TrieNode<K, V> updateValueAtIndex(int i10, V v10) {
        Object[] objArr = this.buffer;
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        AbstractC9133u.m16132f(objArrCopyOf, "copyOf(...)");
        objArrCopyOf[i10 + 1] = v10;
        return new TrieNode<>(this.dataMap, this.nodeMap, objArrCopyOf);
    }

    private final V valueAtKeyIndex(int i10) {
        return (V) this.buffer[i10 + 1];
    }

    public final void accept$runtime_release(InterfaceC10577s interfaceC10577s) {
        accept(interfaceC10577s, 0, 0);
    }

    public final boolean containsKey(int i10, K k10, int i11) {
        int iIndexSegment = 1 << TrieNodeKt.indexSegment(i10, i11);
        if (hasEntryAt$runtime_release(iIndexSegment)) {
            return AbstractC9133u.m16128b(k10, keyAtIndex(entryKeyIndex$runtime_release(iIndexSegment)));
        }
        if (!hasNodeAt(iIndexSegment)) {
            return false;
        }
        TrieNode<K, V> trieNodeNodeAtIndex$runtime_release = nodeAtIndex$runtime_release(nodeIndex$runtime_release(iIndexSegment));
        return i11 == 30 ? trieNodeNodeAtIndex$runtime_release.collisionContainsKey(k10) : trieNodeNodeAtIndex$runtime_release.containsKey(i10, k10, i11 + 5);
    }

    public final int entryCount$runtime_release() {
        return Integer.bitCount(this.dataMap);
    }

    public final int entryKeyIndex$runtime_release(int i10) {
        return Integer.bitCount((i10 - 1) & this.dataMap) * 2;
    }

    public final V get(int i10, K k10, int i11) {
        int iIndexSegment = 1 << TrieNodeKt.indexSegment(i10, i11);
        if (hasEntryAt$runtime_release(iIndexSegment)) {
            int iEntryKeyIndex$runtime_release = entryKeyIndex$runtime_release(iIndexSegment);
            if (AbstractC9133u.m16128b(k10, keyAtIndex(iEntryKeyIndex$runtime_release))) {
                return valueAtKeyIndex(iEntryKeyIndex$runtime_release);
            }
            return null;
        }
        if (!hasNodeAt(iIndexSegment)) {
            return null;
        }
        TrieNode<K, V> trieNodeNodeAtIndex$runtime_release = nodeAtIndex$runtime_release(nodeIndex$runtime_release(iIndexSegment));
        return i11 == 30 ? trieNodeNodeAtIndex$runtime_release.collisionGet(k10) : trieNodeNodeAtIndex$runtime_release.get(i10, k10, i11 + 5);
    }

    public final Object[] getBuffer$runtime_release() {
        return this.buffer;
    }

    public final boolean hasEntryAt$runtime_release(int i10) {
        return (i10 & this.dataMap) != 0;
    }

    public final TrieNode<K, V> mutablePut(int i10, K k10, V v10, int i11, PersistentHashMapBuilder<K, V> persistentHashMapBuilder) {
        PersistentHashMapBuilder<K, V> persistentHashMapBuilder2;
        TrieNode<K, V> trieNodeMutablePut;
        int iIndexSegment = 1 << TrieNodeKt.indexSegment(i10, i11);
        if (hasEntryAt$runtime_release(iIndexSegment)) {
            int iEntryKeyIndex$runtime_release = entryKeyIndex$runtime_release(iIndexSegment);
            if (AbstractC9133u.m16128b(k10, keyAtIndex(iEntryKeyIndex$runtime_release))) {
                persistentHashMapBuilder.setOperationResult$runtime_release(valueAtKeyIndex(iEntryKeyIndex$runtime_release));
                return valueAtKeyIndex(iEntryKeyIndex$runtime_release) == v10 ? this : mutableUpdateValueAtIndex(iEntryKeyIndex$runtime_release, v10, persistentHashMapBuilder);
            }
            persistentHashMapBuilder.setSize(persistentHashMapBuilder.size() + 1);
            return mutableMoveEntryToNode(iEntryKeyIndex$runtime_release, iIndexSegment, i10, k10, v10, i11, persistentHashMapBuilder.getOwnership());
        }
        if (!hasNodeAt(iIndexSegment)) {
            persistentHashMapBuilder.setSize(persistentHashMapBuilder.size() + 1);
            return mutableInsertEntryAt(iIndexSegment, k10, v10, persistentHashMapBuilder.getOwnership());
        }
        int iNodeIndex$runtime_release = nodeIndex$runtime_release(iIndexSegment);
        TrieNode<K, V> trieNodeNodeAtIndex$runtime_release = nodeAtIndex$runtime_release(iNodeIndex$runtime_release);
        if (i11 == 30) {
            trieNodeMutablePut = trieNodeNodeAtIndex$runtime_release.mutableCollisionPut(k10, v10, persistentHashMapBuilder);
            persistentHashMapBuilder2 = persistentHashMapBuilder;
        } else {
            persistentHashMapBuilder2 = persistentHashMapBuilder;
            trieNodeMutablePut = trieNodeNodeAtIndex$runtime_release.mutablePut(i10, k10, v10, i11 + 5, persistentHashMapBuilder2);
        }
        return trieNodeNodeAtIndex$runtime_release == trieNodeMutablePut ? this : mutableUpdateNodeAtIndex(iNodeIndex$runtime_release, trieNodeMutablePut, persistentHashMapBuilder2.getOwnership());
    }

    public final TrieNode<K, V> mutablePutAll(TrieNode<K, V> trieNode, int i10, DeltaCounter deltaCounter, PersistentHashMapBuilder<K, V> persistentHashMapBuilder) {
        if (this == trieNode) {
            deltaCounter.plusAssign(calculateSize());
            return this;
        }
        int i11 = i10;
        if (i11 > 30) {
            return mutableCollisionPutAll(trieNode, deltaCounter, persistentHashMapBuilder.getOwnership());
        }
        int i12 = this.nodeMap | trieNode.nodeMap;
        int i13 = this.dataMap;
        int i14 = trieNode.dataMap;
        int i15 = (i13 ^ i14) & (~i12);
        int i16 = i13 & i14;
        while (i16 != 0) {
            int iLowestOneBit = Integer.lowestOneBit(i16);
            if (AbstractC9133u.m16128b(keyAtIndex(entryKeyIndex$runtime_release(iLowestOneBit)), trieNode.keyAtIndex(trieNode.entryKeyIndex$runtime_release(iLowestOneBit)))) {
                i15 |= iLowestOneBit;
            } else {
                i12 |= iLowestOneBit;
            }
            i16 ^= iLowestOneBit;
        }
        int i17 = 0;
        if (!((i12 & i15) == 0)) {
            PreconditionsKt.throwIllegalStateException("Check failed.");
        }
        TrieNode<K, V> trieNode2 = (AbstractC9133u.m16128b(this.ownedBy, persistentHashMapBuilder.getOwnership()) && this.dataMap == i15 && this.nodeMap == i12) ? this : new TrieNode<>(i15, i12, new Object[(Integer.bitCount(i15) * 2) + Integer.bitCount(i12)]);
        int i18 = i12;
        int i19 = 0;
        while (i18 != 0) {
            int iLowestOneBit2 = Integer.lowestOneBit(i18);
            Object[] objArr = trieNode2.buffer;
            objArr[(objArr.length - 1) - i19] = mutablePutAllFromOtherNodeCell(trieNode, iLowestOneBit2, i11, deltaCounter, persistentHashMapBuilder);
            i19++;
            i18 ^= iLowestOneBit2;
            i11 = i10;
        }
        while (i15 != 0) {
            int iLowestOneBit3 = Integer.lowestOneBit(i15);
            int i20 = i17 * 2;
            if (trieNode.hasEntryAt$runtime_release(iLowestOneBit3)) {
                int iEntryKeyIndex$runtime_release = trieNode.entryKeyIndex$runtime_release(iLowestOneBit3);
                trieNode2.buffer[i20] = trieNode.keyAtIndex(iEntryKeyIndex$runtime_release);
                trieNode2.buffer[i20 + 1] = trieNode.valueAtKeyIndex(iEntryKeyIndex$runtime_release);
                if (hasEntryAt$runtime_release(iLowestOneBit3)) {
                    deltaCounter.setCount(deltaCounter.getCount() + 1);
                }
            } else {
                int iEntryKeyIndex$runtime_release2 = entryKeyIndex$runtime_release(iLowestOneBit3);
                trieNode2.buffer[i20] = keyAtIndex(iEntryKeyIndex$runtime_release2);
                trieNode2.buffer[i20 + 1] = valueAtKeyIndex(iEntryKeyIndex$runtime_release2);
            }
            i17++;
            i15 ^= iLowestOneBit3;
        }
        return elementsIdentityEquals(trieNode2) ? this : trieNode.elementsIdentityEquals(trieNode2) ? trieNode : trieNode2;
    }

    public final TrieNode<K, V> mutableRemove(int i10, K k10, int i11, PersistentHashMapBuilder<K, V> persistentHashMapBuilder) {
        int iIndexSegment = 1 << TrieNodeKt.indexSegment(i10, i11);
        if (hasEntryAt$runtime_release(iIndexSegment)) {
            int iEntryKeyIndex$runtime_release = entryKeyIndex$runtime_release(iIndexSegment);
            if (AbstractC9133u.m16128b(k10, keyAtIndex(iEntryKeyIndex$runtime_release))) {
                return mutableRemoveEntryAtIndex(iEntryKeyIndex$runtime_release, iIndexSegment, persistentHashMapBuilder);
            }
        } else if (hasNodeAt(iIndexSegment)) {
            int iNodeIndex$runtime_release = nodeIndex$runtime_release(iIndexSegment);
            TrieNode<K, V> trieNodeNodeAtIndex$runtime_release = nodeAtIndex$runtime_release(iNodeIndex$runtime_release);
            return mutableReplaceNode(trieNodeNodeAtIndex$runtime_release, i11 == 30 ? trieNodeNodeAtIndex$runtime_release.mutableCollisionRemove(k10, persistentHashMapBuilder) : trieNodeNodeAtIndex$runtime_release.mutableRemove(i10, k10, i11 + 5, persistentHashMapBuilder), iNodeIndex$runtime_release, iIndexSegment, persistentHashMapBuilder.getOwnership());
        }
        return this;
    }

    public final TrieNode<K, V> nodeAtIndex$runtime_release(int i10) {
        Object obj = this.buffer[i10];
        AbstractC9133u.m16131e(obj, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode>");
        return (TrieNode) obj;
    }

    public final int nodeIndex$runtime_release(int i10) {
        return (this.buffer.length - 1) - Integer.bitCount((i10 - 1) & this.nodeMap);
    }

    public final ModificationResult<K, V> put(int i10, K k10, V v10, int i11) {
        ModificationResult<K, V> modificationResultPut;
        int iIndexSegment = 1 << TrieNodeKt.indexSegment(i10, i11);
        if (hasEntryAt$runtime_release(iIndexSegment)) {
            int iEntryKeyIndex$runtime_release = entryKeyIndex$runtime_release(iIndexSegment);
            if (!AbstractC9133u.m16128b(k10, keyAtIndex(iEntryKeyIndex$runtime_release))) {
                return moveEntryToNode(iEntryKeyIndex$runtime_release, iIndexSegment, i10, k10, v10, i11).asInsertResult();
            }
            if (valueAtKeyIndex(iEntryKeyIndex$runtime_release) == v10) {
                return null;
            }
            return updateValueAtIndex(iEntryKeyIndex$runtime_release, v10).asUpdateResult();
        }
        if (!hasNodeAt(iIndexSegment)) {
            return insertEntryAt(iIndexSegment, k10, v10).asInsertResult();
        }
        int iNodeIndex$runtime_release = nodeIndex$runtime_release(iIndexSegment);
        TrieNode<K, V> trieNodeNodeAtIndex$runtime_release = nodeAtIndex$runtime_release(iNodeIndex$runtime_release);
        if (i11 == 30) {
            modificationResultPut = trieNodeNodeAtIndex$runtime_release.collisionPut(k10, v10);
            if (modificationResultPut == null) {
                return null;
            }
        } else {
            modificationResultPut = trieNodeNodeAtIndex$runtime_release.put(i10, k10, v10, i11 + 5);
            if (modificationResultPut == null) {
                return null;
            }
        }
        modificationResultPut.setNode(updateNodeAtIndex(iNodeIndex$runtime_release, iIndexSegment, modificationResultPut.getNode()));
        return modificationResultPut;
    }

    public final TrieNode<K, V> remove(int i10, K k10, int i11) {
        int iIndexSegment = 1 << TrieNodeKt.indexSegment(i10, i11);
        if (hasEntryAt$runtime_release(iIndexSegment)) {
            int iEntryKeyIndex$runtime_release = entryKeyIndex$runtime_release(iIndexSegment);
            if (AbstractC9133u.m16128b(k10, keyAtIndex(iEntryKeyIndex$runtime_release))) {
                return removeEntryAtIndex(iEntryKeyIndex$runtime_release, iIndexSegment);
            }
        } else if (hasNodeAt(iIndexSegment)) {
            int iNodeIndex$runtime_release = nodeIndex$runtime_release(iIndexSegment);
            TrieNode<K, V> trieNodeNodeAtIndex$runtime_release = nodeAtIndex$runtime_release(iNodeIndex$runtime_release);
            return replaceNode(trieNodeNodeAtIndex$runtime_release, i11 == 30 ? trieNodeNodeAtIndex$runtime_release.collisionRemove(k10) : trieNodeNodeAtIndex$runtime_release.remove(i10, k10, i11 + 5), iNodeIndex$runtime_release, iIndexSegment);
        }
        return this;
    }

    private final TrieNode<K, V> collisionRemove(K k10, V v10) {
        C8319d c8319dM13524s = AbstractC8323h.m13524s(AbstractC8323h.m13525t(0, this.buffer.length), 2);
        int iM13496b = c8319dM13524s.m13496b();
        int iM13497c = c8319dM13524s.m13497c();
        int iM13498d = c8319dM13524s.m13498d();
        if ((iM13498d > 0 && iM13496b <= iM13497c) || (iM13498d < 0 && iM13497c <= iM13496b)) {
            while (true) {
                if (!AbstractC9133u.m16128b(k10, keyAtIndex(iM13496b)) || !AbstractC9133u.m16128b(v10, valueAtKeyIndex(iM13496b))) {
                    if (iM13496b == iM13497c) {
                        break;
                    }
                    iM13496b += iM13498d;
                } else {
                    return collisionRemoveEntryAtIndex(iM13496b);
                }
            }
        }
        return this;
    }

    private final TrieNode<K, V> mutableCollisionRemove(K k10, V v10, PersistentHashMapBuilder<K, V> persistentHashMapBuilder) {
        C8319d c8319dM13524s = AbstractC8323h.m13524s(AbstractC8323h.m13525t(0, this.buffer.length), 2);
        int iM13496b = c8319dM13524s.m13496b();
        int iM13497c = c8319dM13524s.m13497c();
        int iM13498d = c8319dM13524s.m13498d();
        if ((iM13498d > 0 && iM13496b <= iM13497c) || (iM13498d < 0 && iM13497c <= iM13496b)) {
            while (true) {
                if (!AbstractC9133u.m16128b(k10, keyAtIndex(iM13496b)) || !AbstractC9133u.m16128b(v10, valueAtKeyIndex(iM13496b))) {
                    if (iM13496b == iM13497c) {
                        break;
                    }
                    iM13496b += iM13498d;
                } else {
                    return mutableCollisionRemoveEntryAtIndex(iM13496b, persistentHashMapBuilder);
                }
            }
        }
        return this;
    }

    public TrieNode(int i10, int i11, Object[] objArr) {
        this(i10, i11, objArr, null);
    }

    public final TrieNode<K, V> mutableRemove(int i10, K k10, V v10, int i11, PersistentHashMapBuilder<K, V> persistentHashMapBuilder) {
        TrieNode<K, V> trieNodeMutableRemove;
        int iIndexSegment = 1 << TrieNodeKt.indexSegment(i10, i11);
        if (hasEntryAt$runtime_release(iIndexSegment)) {
            int iEntryKeyIndex$runtime_release = entryKeyIndex$runtime_release(iIndexSegment);
            if (AbstractC9133u.m16128b(k10, keyAtIndex(iEntryKeyIndex$runtime_release)) && AbstractC9133u.m16128b(v10, valueAtKeyIndex(iEntryKeyIndex$runtime_release))) {
                return mutableRemoveEntryAtIndex(iEntryKeyIndex$runtime_release, iIndexSegment, persistentHashMapBuilder);
            }
        } else if (hasNodeAt(iIndexSegment)) {
            int iNodeIndex$runtime_release = nodeIndex$runtime_release(iIndexSegment);
            TrieNode<K, V> trieNodeNodeAtIndex$runtime_release = nodeAtIndex$runtime_release(iNodeIndex$runtime_release);
            if (i11 == 30) {
                trieNodeMutableRemove = trieNodeNodeAtIndex$runtime_release.mutableCollisionRemove(k10, v10, persistentHashMapBuilder);
            } else {
                trieNodeMutableRemove = trieNodeNodeAtIndex$runtime_release.mutableRemove(i10, k10, v10, i11 + 5, persistentHashMapBuilder);
            }
            return mutableReplaceNode(trieNodeNodeAtIndex$runtime_release, trieNodeMutableRemove, iNodeIndex$runtime_release, iIndexSegment, persistentHashMapBuilder.getOwnership());
        }
        return this;
    }

    public final TrieNode<K, V> remove(int i10, K k10, V v10, int i11) {
        TrieNode<K, V> trieNodeRemove;
        int iIndexSegment = 1 << TrieNodeKt.indexSegment(i10, i11);
        if (hasEntryAt$runtime_release(iIndexSegment)) {
            int iEntryKeyIndex$runtime_release = entryKeyIndex$runtime_release(iIndexSegment);
            if (AbstractC9133u.m16128b(k10, keyAtIndex(iEntryKeyIndex$runtime_release)) && AbstractC9133u.m16128b(v10, valueAtKeyIndex(iEntryKeyIndex$runtime_release))) {
                return removeEntryAtIndex(iEntryKeyIndex$runtime_release, iIndexSegment);
            }
        } else if (hasNodeAt(iIndexSegment)) {
            int iNodeIndex$runtime_release = nodeIndex$runtime_release(iIndexSegment);
            TrieNode<K, V> trieNodeNodeAtIndex$runtime_release = nodeAtIndex$runtime_release(iNodeIndex$runtime_release);
            if (i11 == 30) {
                trieNodeRemove = trieNodeNodeAtIndex$runtime_release.collisionRemove(k10, v10);
            } else {
                trieNodeRemove = trieNodeNodeAtIndex$runtime_release.remove(i10, k10, v10, i11 + 5);
            }
            return replaceNode(trieNodeNodeAtIndex$runtime_release, trieNodeRemove, iNodeIndex$runtime_release, iIndexSegment);
        }
        return this;
    }
}
