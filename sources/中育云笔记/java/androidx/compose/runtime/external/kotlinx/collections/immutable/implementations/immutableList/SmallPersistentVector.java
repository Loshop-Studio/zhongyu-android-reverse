package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList;

import androidx.compose.runtime.external.kotlinx.collections.immutable.ImmutableList;
import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection;
import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList;
import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.CommonFunctionsKt;
import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.ListImplementation;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9540l;
import p325rc.AbstractC10964p;
import p325rc.AbstractC10968r;

@StabilityInferred(parameters = 0)
/* loaded from: classes2.dex */
public final class SmallPersistentVector<E> extends AbstractPersistentList<E> implements ImmutableList<E> {
    private final Object[] buffer;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final SmallPersistentVector EMPTY = new SmallPersistentVector(new Object[0]);

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC9972n abstractC9972n) {
            this();
        }

        public final SmallPersistentVector getEMPTY() {
            return SmallPersistentVector.EMPTY;
        }

        private Companion() {
        }
    }

    public SmallPersistentVector(Object[] objArr) {
        this.buffer = objArr;
        CommonFunctionsKt.m30418assert(objArr.length <= 32);
    }

    private final Object[] bufferOfSize(int i10) {
        return new Object[i10];
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Collection, java.util.List, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection
    public /* bridge */ /* synthetic */ PersistentCollection add(Object obj) {
        return add((SmallPersistentVector<E>) obj);
    }

    @Override // p325rc.AbstractC10940d, java.util.List
    public E get(int i10) {
        ListImplementation.checkElementIndex$runtime_release(i10, size());
        return (E) this.buffer[i10];
    }

    @Override // p325rc.AbstractC10940d, p325rc.AbstractC10936b
    public int getSize() {
        return this.buffer.length;
    }

    @Override // p325rc.AbstractC10940d, java.util.List
    public int indexOf(Object obj) {
        return AbstractC10968r.m24048G0(this.buffer, obj);
    }

    @Override // p325rc.AbstractC10940d, java.util.List
    public int lastIndexOf(Object obj) {
        return AbstractC10968r.m24054M0(this.buffer, obj);
    }

    @Override // p325rc.AbstractC10940d, java.util.List
    public ListIterator<E> listIterator(int i10) {
        ListImplementation.checkPositionIndex$runtime_release(i10, size());
        return new BufferIterator(this.buffer, i10, size());
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList
    public PersistentList<E> removeAt(int i10) {
        ListImplementation.checkElementIndex$runtime_release(i10, size());
        if (size() == 1) {
            return EMPTY;
        }
        Object[] objArrCopyOf = Arrays.copyOf(this.buffer, size() - 1);
        AbstractC9979u.m20293f(objArrCopyOf, "copyOf(...)");
        AbstractC10964p.m24023p(this.buffer, objArrCopyOf, i10, i10 + 1, size());
        return new SmallPersistentVector(objArrCopyOf);
    }

    @Override // p325rc.AbstractC10940d, java.util.List, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList
    public PersistentList<E> set(int i10, E e10) {
        ListImplementation.checkElementIndex$runtime_release(i10, size());
        Object[] objArr = this.buffer;
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        AbstractC9979u.m20293f(objArrCopyOf, "copyOf(...)");
        objArrCopyOf[i10] = e10;
        return new SmallPersistentVector(objArrCopyOf);
    }

    @Override // java.util.Collection, java.util.List, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection
    public PersistentList<E> add(E e10) {
        if (size() >= 32) {
            return new PersistentVector(this.buffer, UtilsKt.presizedBufferWith(e10), size() + 1, 0);
        }
        Object[] objArrCopyOf = Arrays.copyOf(this.buffer, size() + 1);
        AbstractC9979u.m20293f(objArrCopyOf, "copyOf(...)");
        objArrCopyOf[size()] = e10;
        return new SmallPersistentVector(objArrCopyOf);
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.AbstractPersistentList, java.util.Collection, java.util.List, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection
    public PersistentList<E> addAll(Collection<? extends E> collection) {
        if (size() + collection.size() > 32) {
            PersistentList.Builder<E> builder = builder();
            builder.addAll(collection);
            return builder.build();
        }
        Object[] objArrCopyOf = Arrays.copyOf(this.buffer, size() + collection.size());
        AbstractC9979u.m20293f(objArrCopyOf, "copyOf(...)");
        int size = size();
        Iterator<? extends E> it = collection.iterator();
        while (it.hasNext()) {
            objArrCopyOf[size] = it.next();
            size++;
        }
        return new SmallPersistentVector(objArrCopyOf);
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection
    public PersistentList.Builder<E> builder() {
        return new PersistentVectorBuilder(this, null, this.buffer, 0);
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection
    public PersistentList<E> removeAll(InterfaceC9540l interfaceC9540l) {
        Object[] objArrCopyOf = this.buffer;
        int size = size();
        int size2 = size();
        boolean z10 = false;
        for (int i10 = 0; i10 < size2; i10++) {
            Object obj = this.buffer[i10];
            if (((Boolean) interfaceC9540l.invoke(obj)).booleanValue()) {
                if (!z10) {
                    Object[] objArr = this.buffer;
                    objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
                    AbstractC9979u.m20293f(objArrCopyOf, "copyOf(...)");
                    z10 = true;
                    size = i10;
                }
            } else if (z10) {
                objArrCopyOf[size] = obj;
                size++;
            }
        }
        return size == size() ? this : size == 0 ? EMPTY : new SmallPersistentVector(AbstractC10964p.m24032y(objArrCopyOf, 0, size));
    }

    @Override // java.util.List, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList
    public PersistentList<E> add(int i10, E e10) {
        ListImplementation.checkPositionIndex$runtime_release(i10, size());
        if (i10 == size()) {
            return add((SmallPersistentVector<E>) e10);
        }
        if (size() < 32) {
            Object[] objArrBufferOfSize = bufferOfSize(size() + 1);
            AbstractC10964p.m24029v(this.buffer, objArrBufferOfSize, 0, 0, i10, 6, null);
            AbstractC10964p.m24023p(this.buffer, objArrBufferOfSize, i10 + 1, i10, size());
            objArrBufferOfSize[i10] = e10;
            return new SmallPersistentVector(objArrBufferOfSize);
        }
        Object[] objArr = this.buffer;
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        AbstractC9979u.m20293f(objArrCopyOf, "copyOf(...)");
        AbstractC10964p.m24023p(this.buffer, objArrCopyOf, i10 + 1, i10, size() - 1);
        objArrCopyOf[i10] = e10;
        return new PersistentVector(objArrCopyOf, UtilsKt.presizedBufferWith(this.buffer[31]), size() + 1, 0);
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.AbstractPersistentList, java.util.List, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList
    public PersistentList<E> addAll(int i10, Collection<? extends E> collection) {
        ListImplementation.checkPositionIndex$runtime_release(i10, size());
        if (size() + collection.size() <= 32) {
            Object[] objArrBufferOfSize = bufferOfSize(size() + collection.size());
            int i11 = i10;
            AbstractC10964p.m24029v(this.buffer, objArrBufferOfSize, 0, 0, i11, 6, null);
            AbstractC10964p.m24023p(this.buffer, objArrBufferOfSize, collection.size() + i11, i11, size());
            Iterator<? extends E> it = collection.iterator();
            while (it.hasNext()) {
                objArrBufferOfSize[i11] = it.next();
                i11++;
            }
            return new SmallPersistentVector(objArrBufferOfSize);
        }
        PersistentList.Builder<E> builder = builder();
        builder.addAll(i10, collection);
        return builder.build();
    }
}
