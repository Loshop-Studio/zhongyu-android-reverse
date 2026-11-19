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
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;
import p134i7.AbstractC8797p;
import p134i7.AbstractC8801r;
import p300x7.InterfaceC10570l;

@StabilityInferred(parameters = 0)
/* loaded from: classes2.dex */
public final class SmallPersistentVector<E> extends AbstractPersistentList<E> implements ImmutableList<E> {
    private final Object[] buffer;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final SmallPersistentVector EMPTY = new SmallPersistentVector(new Object[0]);

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC9126n abstractC9126n) {
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
        CommonFunctionsKt.m23816assert(objArr.length <= 32);
    }

    private final Object[] bufferOfSize(int i10) {
        return new Object[i10];
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Collection, java.util.List, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection
    public /* bridge */ /* synthetic */ PersistentCollection add(Object obj) {
        return add((SmallPersistentVector<E>) obj);
    }

    @Override // p134i7.AbstractC8773d, java.util.List
    public E get(int i10) {
        ListImplementation.checkElementIndex$runtime_release(i10, size());
        return (E) this.buffer[i10];
    }

    @Override // p134i7.AbstractC8773d, p134i7.AbstractC8769b
    public int getSize() {
        return this.buffer.length;
    }

    @Override // p134i7.AbstractC8773d, java.util.List
    public int indexOf(Object obj) {
        return AbstractC8801r.m14679H0(this.buffer, obj);
    }

    @Override // p134i7.AbstractC8773d, java.util.List
    public int lastIndexOf(Object obj) {
        return AbstractC8801r.m14688Q0(this.buffer, obj);
    }

    @Override // p134i7.AbstractC8773d, java.util.List
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
        AbstractC9133u.m16132f(objArrCopyOf, "copyOf(...)");
        AbstractC8797p.m14649p(this.buffer, objArrCopyOf, i10, i10 + 1, size());
        return new SmallPersistentVector(objArrCopyOf);
    }

    @Override // p134i7.AbstractC8773d, java.util.List, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList
    public PersistentList<E> set(int i10, E e10) {
        ListImplementation.checkElementIndex$runtime_release(i10, size());
        Object[] objArr = this.buffer;
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        AbstractC9133u.m16132f(objArrCopyOf, "copyOf(...)");
        objArrCopyOf[i10] = e10;
        return new SmallPersistentVector(objArrCopyOf);
    }

    @Override // java.util.Collection, java.util.List, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection
    public PersistentList<E> add(E e10) {
        if (size() >= 32) {
            return new PersistentVector(this.buffer, UtilsKt.presizedBufferWith(e10), size() + 1, 0);
        }
        Object[] objArrCopyOf = Arrays.copyOf(this.buffer, size() + 1);
        AbstractC9133u.m16132f(objArrCopyOf, "copyOf(...)");
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
        AbstractC9133u.m16132f(objArrCopyOf, "copyOf(...)");
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
    public PersistentList<E> removeAll(InterfaceC10570l interfaceC10570l) {
        Object[] objArrCopyOf = this.buffer;
        int size = size();
        int size2 = size();
        boolean z10 = false;
        for (int i10 = 0; i10 < size2; i10++) {
            Object obj = this.buffer[i10];
            if (((Boolean) interfaceC10570l.invoke(obj)).booleanValue()) {
                if (!z10) {
                    Object[] objArr = this.buffer;
                    objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
                    AbstractC9133u.m16132f(objArrCopyOf, "copyOf(...)");
                    z10 = true;
                    size = i10;
                }
            } else if (z10) {
                objArrCopyOf[size] = obj;
                size++;
            }
        }
        return size == size() ? this : size == 0 ? EMPTY : new SmallPersistentVector(AbstractC8797p.m14658y(objArrCopyOf, 0, size));
    }

    @Override // java.util.List, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList
    public PersistentList<E> add(int i10, E e10) {
        ListImplementation.checkPositionIndex$runtime_release(i10, size());
        if (i10 == size()) {
            return add((SmallPersistentVector<E>) e10);
        }
        if (size() < 32) {
            Object[] objArrBufferOfSize = bufferOfSize(size() + 1);
            AbstractC8797p.m14655v(this.buffer, objArrBufferOfSize, 0, 0, i10, 6, null);
            AbstractC8797p.m14649p(this.buffer, objArrBufferOfSize, i10 + 1, i10, size());
            objArrBufferOfSize[i10] = e10;
            return new SmallPersistentVector(objArrBufferOfSize);
        }
        Object[] objArr = this.buffer;
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        AbstractC9133u.m16132f(objArrCopyOf, "copyOf(...)");
        AbstractC8797p.m14649p(this.buffer, objArrCopyOf, i10 + 1, i10, size() - 1);
        objArrCopyOf[i10] = e10;
        return new PersistentVector(objArrCopyOf, UtilsKt.presizedBufferWith(this.buffer[31]), size() + 1, 0);
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.AbstractPersistentList, java.util.List, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList
    public PersistentList<E> addAll(int i10, Collection<? extends E> collection) {
        ListImplementation.checkPositionIndex$runtime_release(i10, size());
        if (size() + collection.size() <= 32) {
            Object[] objArrBufferOfSize = bufferOfSize(size() + collection.size());
            int i11 = i10;
            AbstractC8797p.m14655v(this.buffer, objArrBufferOfSize, 0, 0, i11, 6, null);
            AbstractC8797p.m14649p(this.buffer, objArrBufferOfSize, collection.size() + i11, i11, size());
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
