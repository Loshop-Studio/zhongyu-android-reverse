package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList;

import androidx.compose.runtime.PreconditionsKt;
import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList;
import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.CommonFunctionsKt;
import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.ListImplementation;
import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.MutabilityOwnership;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.jvm.internal.AbstractC9117e;
import kotlin.jvm.internal.AbstractC9133u;
import p077d8.AbstractC8323h;
import p134i7.AbstractC8781h;
import p134i7.AbstractC8797p;
import p300x7.InterfaceC10570l;

@StabilityInferred(parameters = 0)
/* loaded from: classes2.dex */
public final class PersistentVectorBuilder<E> extends AbstractC8781h implements PersistentList.Builder<E> {
    public static final int $stable = 8;
    private MutabilityOwnership ownership = new MutabilityOwnership();
    private Object[] root;
    private int rootShift;
    private int size;
    private Object[] tail;
    private PersistentList<? extends E> vector;
    private Object[] vectorRoot;
    private Object[] vectorTail;

    public PersistentVectorBuilder(PersistentList<? extends E> persistentList, Object[] objArr, Object[] objArr2, int i10) {
        this.vector = persistentList;
        this.vectorRoot = objArr;
        this.vectorTail = objArr2;
        this.rootShift = i10;
        this.root = this.vectorRoot;
        this.tail = this.vectorTail;
        this.size = this.vector.size();
    }

    private final Object[] bufferFor(int i10) {
        if (rootSize() <= i10) {
            return this.tail;
        }
        Object[] objArr = this.root;
        AbstractC9133u.m16130d(objArr);
        for (int i11 = this.rootShift; i11 > 0; i11 -= 5) {
            Object[] objArr2 = objArr[UtilsKt.indexSegment(i10, i11)];
            AbstractC9133u.m16131e(objArr2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            objArr = objArr2;
        }
        return objArr;
    }

    private final Object[] copyToBuffer(Object[] objArr, int i10, Iterator<? extends Object> it) {
        while (i10 < 32 && it.hasNext()) {
            objArr[i10] = it.next();
            i10++;
        }
        return objArr;
    }

    private final Object[] insertIntoRoot(Object[] objArr, int i10, int i11, Object obj, ObjectRef objectRef) {
        Object obj2;
        int iIndexSegment = UtilsKt.indexSegment(i11, i10);
        if (i10 == 0) {
            objectRef.setValue(objArr[31]);
            Object[] objArrM14649p = AbstractC8797p.m14649p(objArr, makeMutable(objArr), iIndexSegment + 1, iIndexSegment, 31);
            objArrM14649p[iIndexSegment] = obj;
            return objArrM14649p;
        }
        Object[] objArrMakeMutable = makeMutable(objArr);
        int i12 = i10 - 5;
        Object obj3 = objArrMakeMutable[iIndexSegment];
        AbstractC9133u.m16131e(obj3, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        objArrMakeMutable[iIndexSegment] = insertIntoRoot((Object[]) obj3, i12, i11, obj, objectRef);
        while (true) {
            iIndexSegment++;
            if (iIndexSegment >= 32 || (obj2 = objArrMakeMutable[iIndexSegment]) == null) {
                break;
            }
            AbstractC9133u.m16131e(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            objArrMakeMutable[iIndexSegment] = insertIntoRoot((Object[]) obj2, i12, 0, objectRef.getValue(), objectRef);
        }
        return objArrMakeMutable;
    }

    private final void insertIntoTail(Object[] objArr, int i10, E e10) {
        int iTailSize = tailSize();
        Object[] objArrMakeMutable = makeMutable(this.tail);
        if (iTailSize < 32) {
            AbstractC8797p.m14649p(this.tail, objArrMakeMutable, i10 + 1, i10, iTailSize);
            objArrMakeMutable[i10] = e10;
            this.root = objArr;
            this.tail = objArrMakeMutable;
            this.size = size() + 1;
            return;
        }
        Object[] objArr2 = this.tail;
        Object obj = objArr2[31];
        AbstractC8797p.m14649p(objArr2, objArrMakeMutable, i10 + 1, i10, 31);
        objArrMakeMutable[i10] = e10;
        pushFilledTail(objArr, objArrMakeMutable, mutableBufferWith(obj));
    }

    private final boolean isMutable(Object[] objArr) {
        return objArr.length == 33 && objArr[32] == this.ownership;
    }

    private final ListIterator<Object[]> leafBufferIterator(int i10) {
        Object[] objArr = this.root;
        if (objArr == null) {
            throw new IllegalStateException("Invalid root");
        }
        int iRootSize = rootSize() >> 5;
        ListImplementation.checkPositionIndex$runtime_release(i10, iRootSize);
        int i11 = this.rootShift;
        return i11 == 0 ? new SingleElementListIterator(objArr, i10) : new TrieIterator(objArr, i10, iRootSize, i11 / 5);
    }

    private final Object[] makeMutable(Object[] objArr) {
        return objArr == null ? mutableBuffer() : isMutable(objArr) ? objArr : AbstractC8797p.m14655v(objArr, mutableBuffer(), 0, 0, AbstractC8323h.m13513h(objArr.length, 32), 6, null);
    }

    private final Object[] makeMutableShiftingRight(Object[] objArr, int i10) {
        return isMutable(objArr) ? AbstractC8797p.m14649p(objArr, objArr, i10, 0, 32 - i10) : AbstractC8797p.m14649p(objArr, mutableBuffer(), i10, 0, 32 - i10);
    }

    private final Object[] mutableBuffer() {
        Object[] objArr = new Object[33];
        objArr[32] = this.ownership;
        return objArr;
    }

    private final Object[] mutableBufferWith(Object obj) {
        Object[] objArr = new Object[33];
        objArr[0] = obj;
        objArr[32] = this.ownership;
        return objArr;
    }

    private final Object[] nullifyAfter(Object[] objArr, int i10, int i11) {
        if (!(i11 >= 0)) {
            PreconditionsKt.throwIllegalArgumentException("shift should be positive");
        }
        if (i11 == 0) {
            return objArr;
        }
        int iIndexSegment = UtilsKt.indexSegment(i10, i11);
        Object obj = objArr[iIndexSegment];
        AbstractC9133u.m16131e(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        Object objNullifyAfter = nullifyAfter((Object[]) obj, i10, i11 - 5);
        if (iIndexSegment < 31) {
            int i12 = iIndexSegment + 1;
            if (objArr[i12] != null) {
                if (isMutable(objArr)) {
                    AbstractC8797p.m14613C(objArr, null, i12, 32);
                }
                objArr = AbstractC8797p.m14649p(objArr, mutableBuffer(), 0, 0, i12);
            }
        }
        if (objNullifyAfter == objArr[iIndexSegment]) {
            return objArr;
        }
        Object[] objArrMakeMutable = makeMutable(objArr);
        objArrMakeMutable[iIndexSegment] = objNullifyAfter;
        return objArrMakeMutable;
    }

    private final Object[] pullLastBuffer(Object[] objArr, int i10, int i11, ObjectRef objectRef) {
        Object[] objArrPullLastBuffer;
        int iIndexSegment = UtilsKt.indexSegment(i11 - 1, i10);
        if (i10 == 5) {
            objectRef.setValue(objArr[iIndexSegment]);
            objArrPullLastBuffer = null;
        } else {
            Object obj = objArr[iIndexSegment];
            AbstractC9133u.m16131e(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            objArrPullLastBuffer = pullLastBuffer((Object[]) obj, i10 - 5, i11, objectRef);
        }
        if (objArrPullLastBuffer == null && iIndexSegment == 0) {
            return null;
        }
        Object[] objArrMakeMutable = makeMutable(objArr);
        objArrMakeMutable[iIndexSegment] = objArrPullLastBuffer;
        return objArrMakeMutable;
    }

    private final void pullLastBufferFromRoot(Object[] objArr, int i10, int i11) {
        if (i11 == 0) {
            this.root = null;
            if (objArr == null) {
                objArr = new Object[0];
            }
            this.tail = objArr;
            this.size = i10;
            this.rootShift = i11;
            return;
        }
        ObjectRef objectRef = new ObjectRef(null);
        AbstractC9133u.m16130d(objArr);
        Object[] objArrPullLastBuffer = pullLastBuffer(objArr, i11, i10, objectRef);
        AbstractC9133u.m16130d(objArrPullLastBuffer);
        Object value = objectRef.getValue();
        AbstractC9133u.m16131e(value, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        this.tail = (Object[]) value;
        this.size = i10;
        if (objArrPullLastBuffer[1] == null) {
            this.root = (Object[]) objArrPullLastBuffer[0];
            this.rootShift = i11 - 5;
        } else {
            this.root = objArrPullLastBuffer;
            this.rootShift = i11;
        }
    }

    private final Object[] pushBuffers(Object[] objArr, int i10, int i11, Iterator<Object[]> it) {
        if (!it.hasNext()) {
            PreconditionsKt.throwIllegalArgumentException("invalid buffersIterator");
        }
        if (!(i11 >= 0)) {
            PreconditionsKt.throwIllegalArgumentException("negative shift");
        }
        if (i11 == 0) {
            return it.next();
        }
        Object[] objArrMakeMutable = makeMutable(objArr);
        int iIndexSegment = UtilsKt.indexSegment(i10, i11);
        int i12 = i11 - 5;
        objArrMakeMutable[iIndexSegment] = pushBuffers((Object[]) objArrMakeMutable[iIndexSegment], i10, i12, it);
        while (true) {
            iIndexSegment++;
            if (iIndexSegment >= 32 || !it.hasNext()) {
                break;
            }
            objArrMakeMutable[iIndexSegment] = pushBuffers((Object[]) objArrMakeMutable[iIndexSegment], 0, i12, it);
        }
        return objArrMakeMutable;
    }

    private final Object[] pushBuffersIncreasingHeightIfNeeded(Object[] objArr, int i10, Object[][] objArr2) {
        Iterator<Object[]> itM16110a = AbstractC9117e.m16110a(objArr2);
        int i11 = i10 >> 5;
        int i12 = this.rootShift;
        Object[] objArrPushBuffers = i11 < (1 << i12) ? pushBuffers(objArr, i10, i12, itM16110a) : makeMutable(objArr);
        while (itM16110a.hasNext()) {
            this.rootShift += 5;
            objArrPushBuffers = mutableBufferWith(objArrPushBuffers);
            int i13 = this.rootShift;
            pushBuffers(objArrPushBuffers, 1 << i13, i13, itM16110a);
        }
        return objArrPushBuffers;
    }

    private final void pushFilledTail(Object[] objArr, Object[] objArr2, Object[] objArr3) {
        int size = size() >> 5;
        int i10 = this.rootShift;
        if (size > (1 << i10)) {
            this.root = pushTail(mutableBufferWith(objArr), objArr2, this.rootShift + 5);
            this.tail = objArr3;
            this.rootShift += 5;
            this.size = size() + 1;
            return;
        }
        if (objArr == null) {
            this.root = objArr2;
            this.tail = objArr3;
            this.size = size() + 1;
        } else {
            this.root = pushTail(objArr, objArr2, i10);
            this.tail = objArr3;
            this.size = size() + 1;
        }
    }

    private final Object[] pushTail(Object[] objArr, Object[] objArr2, int i10) {
        int iIndexSegment = UtilsKt.indexSegment(size() - 1, i10);
        Object[] objArrMakeMutable = makeMutable(objArr);
        if (i10 == 5) {
            objArrMakeMutable[iIndexSegment] = objArr2;
            return objArrMakeMutable;
        }
        objArrMakeMutable[iIndexSegment] = pushTail((Object[]) objArrMakeMutable[iIndexSegment], objArr2, i10 - 5);
        return objArrMakeMutable;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final int recyclableRemoveAll(InterfaceC10570l interfaceC10570l, Object[] objArr, int i10, int i11, ObjectRef objectRef, List<Object[]> list, List<Object[]> list2) {
        if (isMutable(objArr)) {
            list.add(objArr);
        }
        Object value = objectRef.getValue();
        AbstractC9133u.m16131e(value, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        Object[] objArr2 = (Object[]) value;
        Object[] objArrRemove = objArr2;
        for (int i12 = 0; i12 < i10; i12++) {
            Object obj = objArr[i12];
            if (!((Boolean) interfaceC10570l.invoke(obj)).booleanValue()) {
                if (i11 == 32) {
                    objArrRemove = !list.isEmpty() ? list.remove(list.size() - 1) : mutableBuffer();
                    i11 = 0;
                }
                objArrRemove[i11] = obj;
                i11++;
            }
        }
        objectRef.setValue(objArrRemove);
        if (objArr2 != objectRef.getValue()) {
            list2.add(objArr2);
        }
        return i11;
    }

    private final int removeAllFromTail(InterfaceC10570l interfaceC10570l, int i10, ObjectRef objectRef) {
        int iRemoveAll = removeAll(interfaceC10570l, this.tail, i10, objectRef);
        if (iRemoveAll == i10) {
            CommonFunctionsKt.m23816assert(objectRef.getValue() == this.tail);
            return i10;
        }
        Object value = objectRef.getValue();
        AbstractC9133u.m16131e(value, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        Object[] objArr = (Object[]) value;
        AbstractC8797p.m14613C(objArr, null, iRemoveAll, i10);
        this.tail = objArr;
        this.size = size() - (i10 - iRemoveAll);
        return iRemoveAll;
    }

    private final Object[] removeFromRootAt(Object[] objArr, int i10, int i11, ObjectRef objectRef) {
        int iIndexSegment = UtilsKt.indexSegment(i11, i10);
        if (i10 == 0) {
            Object obj = objArr[iIndexSegment];
            Object[] objArrM14649p = AbstractC8797p.m14649p(objArr, makeMutable(objArr), iIndexSegment, iIndexSegment + 1, 32);
            objArrM14649p[31] = objectRef.getValue();
            objectRef.setValue(obj);
            return objArrM14649p;
        }
        int iIndexSegment2 = objArr[31] == null ? UtilsKt.indexSegment(rootSize() - 1, i10) : 31;
        Object[] objArrMakeMutable = makeMutable(objArr);
        int i12 = i10 - 5;
        int i13 = iIndexSegment + 1;
        if (i13 <= iIndexSegment2) {
            while (true) {
                Object obj2 = objArrMakeMutable[iIndexSegment2];
                AbstractC9133u.m16131e(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                objArrMakeMutable[iIndexSegment2] = removeFromRootAt((Object[]) obj2, i12, 0, objectRef);
                if (iIndexSegment2 == i13) {
                    break;
                }
                iIndexSegment2--;
            }
        }
        Object obj3 = objArrMakeMutable[iIndexSegment];
        AbstractC9133u.m16131e(obj3, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        objArrMakeMutable[iIndexSegment] = removeFromRootAt((Object[]) obj3, i12, i11, objectRef);
        return objArrMakeMutable;
    }

    private final Object removeFromTailAt(Object[] objArr, int i10, int i11, int i12) {
        int size = size() - i10;
        CommonFunctionsKt.m23816assert(i12 < size);
        if (size == 1) {
            Object obj = this.tail[0];
            pullLastBufferFromRoot(objArr, i10, i11);
            return obj;
        }
        Object[] objArr2 = this.tail;
        Object obj2 = objArr2[i12];
        Object[] objArrM14649p = AbstractC8797p.m14649p(objArr2, makeMutable(objArr2), i12, i12 + 1, size);
        objArrM14649p[size - 1] = null;
        this.root = objArr;
        this.tail = objArrM14649p;
        this.size = (i10 + size) - 1;
        this.rootShift = i11;
        return obj2;
    }

    private final Object[] retainFirst(Object[] objArr, int i10) {
        if (!((i10 & 31) == 0)) {
            PreconditionsKt.throwIllegalArgumentException("invalid size");
        }
        if (i10 == 0) {
            this.rootShift = 0;
            return null;
        }
        int i11 = i10 - 1;
        while (true) {
            int i12 = this.rootShift;
            if ((i11 >> i12) != 0) {
                return nullifyAfter(objArr, i11, i12);
            }
            this.rootShift = i12 - 5;
            Object[] objArr2 = objArr[0];
            AbstractC9133u.m16131e(objArr2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            objArr = objArr2;
        }
    }

    private final int rootSize() {
        if (size() <= 32) {
            return 0;
        }
        return UtilsKt.rootSize(size());
    }

    private final Object[] setInRoot(Object[] objArr, int i10, int i11, E e10, ObjectRef objectRef) {
        int iIndexSegment = UtilsKt.indexSegment(i11, i10);
        Object[] objArrMakeMutable = makeMutable(objArr);
        if (i10 != 0) {
            Object obj = objArrMakeMutable[iIndexSegment];
            AbstractC9133u.m16131e(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            objArrMakeMutable[iIndexSegment] = setInRoot((Object[]) obj, i10 - 5, i11, e10, objectRef);
            return objArrMakeMutable;
        }
        if (objArrMakeMutable != objArr) {
            ((AbstractList) this).modCount++;
        }
        objectRef.setValue(objArrMakeMutable[iIndexSegment]);
        objArrMakeMutable[iIndexSegment] = e10;
        return objArrMakeMutable;
    }

    private final Object[] shiftLeafBuffers(int i10, int i11, Object[][] objArr, int i12, Object[] objArr2) {
        if (this.root == null) {
            throw new IllegalStateException("root is null");
        }
        ListIterator<Object[]> listIteratorLeafBufferIterator = leafBufferIterator(rootSize() >> 5);
        while (listIteratorLeafBufferIterator.previousIndex() != i10) {
            Object[] objArrPrevious = listIteratorLeafBufferIterator.previous();
            AbstractC8797p.m14649p(objArrPrevious, objArr2, 0, 32 - i11, 32);
            objArr2 = makeMutableShiftingRight(objArrPrevious, i11);
            i12--;
            objArr[i12] = objArr2;
        }
        return listIteratorLeafBufferIterator.previous();
    }

    private final void splitToBuffers(Collection<? extends E> collection, int i10, Object[] objArr, int i11, Object[][] objArr2, int i12, Object[] objArr3) {
        Object[] objArrMutableBuffer;
        if (!(i12 >= 1)) {
            PreconditionsKt.throwIllegalArgumentException("requires at least one nullBuffer");
        }
        Object[] objArrMakeMutable = makeMutable(objArr);
        objArr2[0] = objArrMakeMutable;
        int i13 = i10 & 31;
        int size = ((i10 + collection.size()) - 1) & 31;
        int i14 = (i11 - i13) + size;
        if (i14 < 32) {
            AbstractC8797p.m14649p(objArrMakeMutable, objArr3, size + 1, i13, i11);
        } else {
            int i15 = i14 - 31;
            if (i12 == 1) {
                objArrMutableBuffer = objArrMakeMutable;
            } else {
                objArrMutableBuffer = mutableBuffer();
                i12--;
                objArr2[i12] = objArrMutableBuffer;
            }
            int i16 = i11 - i15;
            AbstractC8797p.m14649p(objArrMakeMutable, objArr3, 0, i16, i11);
            AbstractC8797p.m14649p(objArrMakeMutable, objArrMutableBuffer, size + 1, i13, i16);
            objArr3 = objArrMutableBuffer;
        }
        Iterator<? extends E> it = collection.iterator();
        copyToBuffer(objArrMakeMutable, i13, it);
        for (int i17 = 1; i17 < i12; i17++) {
            objArr2[i17] = copyToBuffer(mutableBuffer(), 0, it);
        }
        copyToBuffer(objArr3, 0, it);
    }

    private final int tailSize(int i10) {
        return i10 <= 32 ? i10 : i10 - UtilsKt.rootSize(i10);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(E e10) {
        ((AbstractList) this).modCount++;
        int iTailSize = tailSize();
        if (iTailSize < 32) {
            Object[] objArrMakeMutable = makeMutable(this.tail);
            objArrMakeMutable[iTailSize] = e10;
            this.tail = objArrMakeMutable;
            this.size = size() + 1;
        } else {
            pushFilledTail(this.root, this.tail, mutableBufferWith(e10));
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends E> collection) {
        if (collection.isEmpty()) {
            return false;
        }
        ((AbstractList) this).modCount++;
        int iTailSize = tailSize();
        Iterator<? extends E> it = collection.iterator();
        if (32 - iTailSize >= collection.size()) {
            this.tail = copyToBuffer(makeMutable(this.tail), iTailSize, it);
            this.size = size() + collection.size();
        } else {
            int size = ((collection.size() + iTailSize) - 1) / 32;
            Object[][] objArr = new Object[size][];
            objArr[0] = copyToBuffer(makeMutable(this.tail), iTailSize, it);
            for (int i10 = 1; i10 < size; i10++) {
                objArr[i10] = copyToBuffer(mutableBuffer(), 0, it);
            }
            this.root = pushBuffersIncreasingHeightIfNeeded(this.root, rootSize(), objArr);
            this.tail = copyToBuffer(mutableBuffer(), 0, it);
            this.size = size() + collection.size();
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public E get(int i10) {
        ListImplementation.checkElementIndex$runtime_release(i10, size());
        return (E) bufferFor(i10)[i10 & 31];
    }

    public final int getModCount$runtime_release() {
        return ((AbstractList) this).modCount;
    }

    public final Object[] getRoot$runtime_release() {
        return this.root;
    }

    public final int getRootShift$runtime_release() {
        return this.rootShift;
    }

    @Override // p134i7.AbstractC8781h
    public int getSize() {
        return this.size;
    }

    public final Object[] getTail$runtime_release() {
        return this.tail;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator<E> iterator() {
        return listIterator();
    }

    @Override // java.util.AbstractList, java.util.List
    public ListIterator<E> listIterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean removeAll(final Collection<? extends Object> collection) {
        return removeAllWithPredicate(new InterfaceC10570l() { // from class: androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.PersistentVectorBuilder.removeAll.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // p300x7.InterfaceC10570l
            public final Boolean invoke(E e10) {
                return Boolean.valueOf(collection.contains(e10));
            }

            @Override // p300x7.InterfaceC10570l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return invoke((C25591) obj);
            }
        });
    }

    public final boolean removeAllWithPredicate(InterfaceC10570l interfaceC10570l) {
        boolean zRemoveAll = removeAll(interfaceC10570l);
        if (zRemoveAll) {
            ((AbstractList) this).modCount++;
        }
        return zRemoveAll;
    }

    @Override // p134i7.AbstractC8781h
    public E removeAt(int i10) {
        ListImplementation.checkElementIndex$runtime_release(i10, size());
        ((AbstractList) this).modCount++;
        int iRootSize = rootSize();
        if (i10 >= iRootSize) {
            return (E) removeFromTailAt(this.root, iRootSize, this.rootShift, i10 - iRootSize);
        }
        ObjectRef objectRef = new ObjectRef(this.tail[0]);
        Object[] objArr = this.root;
        AbstractC9133u.m16130d(objArr);
        removeFromTailAt(removeFromRootAt(objArr, this.rootShift, i10, objectRef), iRootSize, this.rootShift, 0);
        return (E) objectRef.getValue();
    }

    @Override // java.util.AbstractList, java.util.List
    public E set(int i10, E e10) {
        ListImplementation.checkElementIndex$runtime_release(i10, size());
        if (rootSize() > i10) {
            ObjectRef objectRef = new ObjectRef(null);
            Object[] objArr = this.root;
            AbstractC9133u.m16130d(objArr);
            this.root = setInRoot(objArr, this.rootShift, i10, e10, objectRef);
            return (E) objectRef.getValue();
        }
        Object[] objArrMakeMutable = makeMutable(this.tail);
        if (objArrMakeMutable != this.tail) {
            ((AbstractList) this).modCount++;
        }
        int i11 = i10 & 31;
        E e11 = (E) objArrMakeMutable[i11];
        objArrMakeMutable[i11] = e10;
        this.tail = objArrMakeMutable;
        return e11;
    }

    public final void setRootShift$runtime_release(int i10) {
        this.rootShift = i10;
    }

    private final boolean removeAll(InterfaceC10570l interfaceC10570l) {
        Object[] objArrPushBuffers;
        int iTailSize = tailSize();
        ObjectRef objectRef = new ObjectRef(null);
        if (this.root == null) {
            return removeAllFromTail(interfaceC10570l, iTailSize, objectRef) != iTailSize;
        }
        ListIterator<Object[]> listIteratorLeafBufferIterator = leafBufferIterator(0);
        int iRemoveAll = 32;
        while (iRemoveAll == 32 && listIteratorLeafBufferIterator.hasNext()) {
            iRemoveAll = removeAll(interfaceC10570l, listIteratorLeafBufferIterator.next(), 32, objectRef);
        }
        if (iRemoveAll == 32) {
            CommonFunctionsKt.m23816assert(!listIteratorLeafBufferIterator.hasNext());
            int iRemoveAllFromTail = removeAllFromTail(interfaceC10570l, iTailSize, objectRef);
            if (iRemoveAllFromTail == 0) {
                pullLastBufferFromRoot(this.root, size(), this.rootShift);
            }
            return iRemoveAllFromTail != iTailSize;
        }
        int iPreviousIndex = listIteratorLeafBufferIterator.previousIndex() << 5;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int iRecyclableRemoveAll = iRemoveAll;
        while (listIteratorLeafBufferIterator.hasNext()) {
            iRecyclableRemoveAll = recyclableRemoveAll(interfaceC10570l, listIteratorLeafBufferIterator.next(), 32, iRecyclableRemoveAll, objectRef, arrayList2, arrayList);
        }
        int iRecyclableRemoveAll2 = recyclableRemoveAll(interfaceC10570l, this.tail, iTailSize, iRecyclableRemoveAll, objectRef, arrayList2, arrayList);
        Object value = objectRef.getValue();
        AbstractC9133u.m16131e(value, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        Object[] objArr = (Object[]) value;
        AbstractC8797p.m14613C(objArr, null, iRecyclableRemoveAll2, 32);
        if (arrayList.isEmpty()) {
            objArrPushBuffers = this.root;
            AbstractC9133u.m16130d(objArrPushBuffers);
        } else {
            objArrPushBuffers = pushBuffers(this.root, iPreviousIndex, this.rootShift, arrayList.iterator());
        }
        int size = iPreviousIndex + (arrayList.size() << 5);
        this.root = retainFirst(objArrPushBuffers, size);
        this.tail = objArr;
        this.size = size + iRecyclableRemoveAll2;
        return true;
    }

    private final int tailSize() {
        return tailSize(size());
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection.Builder
    public PersistentList<E> build() {
        PersistentVector persistentVector;
        if (this.root == this.vectorRoot && this.tail == this.vectorTail) {
            persistentVector = this.vector;
        } else {
            this.ownership = new MutabilityOwnership();
            Object[] objArr = this.root;
            this.vectorRoot = objArr;
            Object[] objArr2 = this.tail;
            this.vectorTail = objArr2;
            if (objArr != null) {
                Object[] objArr3 = this.root;
                AbstractC9133u.m16130d(objArr3);
                persistentVector = new PersistentVector(objArr3, this.tail, size(), this.rootShift);
            } else if (objArr2.length == 0) {
                persistentVector = UtilsKt.persistentVectorOf();
            } else {
                Object[] objArrCopyOf = Arrays.copyOf(this.tail, size());
                AbstractC9133u.m16132f(objArrCopyOf, "copyOf(...)");
                persistentVector = new SmallPersistentVector(objArrCopyOf);
            }
        }
        this.vector = persistentVector;
        return (PersistentList<E>) persistentVector;
    }

    @Override // java.util.AbstractList, java.util.List
    public ListIterator<E> listIterator(int i10) {
        ListImplementation.checkPositionIndex$runtime_release(i10, size());
        return new PersistentVectorMutableIterator(this, i10);
    }

    private final void insertIntoRoot(Collection<? extends E> collection, int i10, int i11, Object[][] objArr, int i12, Object[] objArr2) {
        Object[] objArr3;
        if (this.root != null) {
            int i13 = i10 >> 5;
            Object[] objArrShiftLeafBuffers = shiftLeafBuffers(i13, i11, objArr, i12, objArr2);
            int iRootSize = i12 - (((rootSize() >> 5) - 1) - i13);
            if (iRootSize < i12) {
                Object[] objArr4 = objArr[iRootSize];
                AbstractC9133u.m16130d(objArr4);
                objArr3 = objArr4;
            } else {
                objArr3 = objArr2;
            }
            splitToBuffers(collection, i10, objArrShiftLeafBuffers, 32, objArr, iRootSize, objArr3);
            return;
        }
        throw new IllegalStateException("root is null");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractList, java.util.List
    public void add(int i10, E e10) {
        ListImplementation.checkPositionIndex$runtime_release(i10, size());
        if (i10 == size()) {
            add(e10);
            return;
        }
        ((AbstractList) this).modCount++;
        int iRootSize = rootSize();
        if (i10 >= iRootSize) {
            insertIntoTail(this.root, i10 - iRootSize, e10);
            return;
        }
        ObjectRef objectRef = new ObjectRef(null);
        Object[] objArr = this.root;
        AbstractC9133u.m16130d(objArr);
        insertIntoTail(insertIntoRoot(objArr, this.rootShift, i10, e10, objectRef), 0, objectRef.getValue());
    }

    @Override // java.util.AbstractList, java.util.List
    public boolean addAll(int i10, Collection<? extends E> collection) {
        PersistentVectorBuilder<E> persistentVectorBuilder;
        Collection<? extends E> collection2;
        Object[] objArrM14649p;
        Object[][] objArr;
        ListImplementation.checkPositionIndex$runtime_release(i10, size());
        if (i10 == size()) {
            return addAll(collection);
        }
        if (collection.isEmpty()) {
            return false;
        }
        ((AbstractList) this).modCount++;
        int i11 = (i10 >> 5) << 5;
        int size = (((size() - i11) + collection.size()) - 1) / 32;
        if (size == 0) {
            CommonFunctionsKt.m23816assert(i10 >= rootSize());
            int i12 = i10 & 31;
            int size2 = ((i10 + collection.size()) - 1) & 31;
            Object[] objArr2 = this.tail;
            Object[] objArrM14649p2 = AbstractC8797p.m14649p(objArr2, makeMutable(objArr2), size2 + 1, i12, tailSize());
            copyToBuffer(objArrM14649p2, i12, collection.iterator());
            this.tail = objArrM14649p2;
            this.size = size() + collection.size();
            return true;
        }
        Object[][] objArr3 = new Object[size][];
        int iTailSize = tailSize();
        int iTailSize2 = tailSize(size() + collection.size());
        if (i10 >= rootSize()) {
            objArrM14649p = mutableBuffer();
            objArr = objArr3;
            persistentVectorBuilder = this;
            collection2 = collection;
            persistentVectorBuilder.splitToBuffers(collection2, i10, this.tail, iTailSize, objArr, size, objArrM14649p);
        } else {
            persistentVectorBuilder = this;
            collection2 = collection;
            if (iTailSize2 > iTailSize) {
                int i13 = iTailSize2 - iTailSize;
                Object[] objArrMakeMutableShiftingRight = makeMutableShiftingRight(persistentVectorBuilder.tail, i13);
                persistentVectorBuilder.insertIntoRoot(collection2, i10, i13, objArr3, size, objArrMakeMutableShiftingRight);
                objArr = objArr3;
                objArrM14649p = objArrMakeMutableShiftingRight;
            } else {
                int i14 = iTailSize - iTailSize2;
                objArrM14649p = AbstractC8797p.m14649p(persistentVectorBuilder.tail, mutableBuffer(), 0, i14, iTailSize);
                int i15 = 32 - i14;
                Object[] objArrMakeMutableShiftingRight2 = makeMutableShiftingRight(persistentVectorBuilder.tail, i15);
                int i16 = size - 1;
                objArr3[i16] = objArrMakeMutableShiftingRight2;
                persistentVectorBuilder.insertIntoRoot(collection2, i10, i15, objArr3, i16, objArrMakeMutableShiftingRight2);
                collection2 = collection2;
                objArr = objArr3;
                persistentVectorBuilder = persistentVectorBuilder;
            }
        }
        persistentVectorBuilder.root = pushBuffersIncreasingHeightIfNeeded(persistentVectorBuilder.root, i11, objArr);
        persistentVectorBuilder.tail = objArrM14649p;
        persistentVectorBuilder.size = size() + collection2.size();
        return true;
    }

    private final int removeAll(InterfaceC10570l interfaceC10570l, Object[] objArr, int i10, ObjectRef objectRef) {
        Object[] objArrMakeMutable = objArr;
        int i11 = i10;
        boolean z10 = false;
        for (int i12 = 0; i12 < i10; i12++) {
            Object obj = objArr[i12];
            if (((Boolean) interfaceC10570l.invoke(obj)).booleanValue()) {
                if (!z10) {
                    objArrMakeMutable = makeMutable(objArr);
                    z10 = true;
                    i11 = i12;
                }
            } else if (z10) {
                objArrMakeMutable[i11] = obj;
                i11++;
            }
        }
        objectRef.setValue(objArrMakeMutable);
        return i11;
    }
}
