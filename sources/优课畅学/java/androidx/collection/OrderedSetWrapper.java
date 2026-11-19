package androidx.collection;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.AbstractC9079b;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.internal.AbstractC9125m;
import kotlin.jvm.internal.AbstractC9133u;
import p101f8.AbstractC8471i;
import p101f8.AbstractC8472j;
import p123h7.C8736p;
import p179m7.InterfaceC9324c;
import p190n7.AbstractC9434a;
import p201o7.InterfaceC9539d;
import p300x7.InterfaceC10574p;
import p311y7.InterfaceC10668a;

/* loaded from: classes.dex */
class OrderedSetWrapper<E> implements Set<E>, InterfaceC10668a {
    private final OrderedScatterSet<E> parent;

    @InterfaceC9539d(m17800c = "androidx.collection.OrderedSetWrapper$iterator$1", m17801f = "OrderedScatterSet.kt", m17802l = {1454}, m17803m = "invokeSuspend")
    /* renamed from: androidx.collection.OrderedSetWrapper$iterator$1 */
    public static final class C09771 extends RestrictedSuspendLambda implements InterfaceC10574p {
        int I$0;
        private /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        int label;
        final /* synthetic */ OrderedSetWrapper<E> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C09771(OrderedSetWrapper<E> orderedSetWrapper, InterfaceC9324c<? super C09771> interfaceC9324c) {
            super(2, interfaceC9324c);
            this.this$0 = orderedSetWrapper;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC9324c<C8736p> create(Object obj, InterfaceC9324c<?> interfaceC9324c) {
            C09771 c09771 = new C09771(this.this$0, interfaceC9324c);
            c09771.L$0 = obj;
            return c09771;
        }

        @Override // p300x7.InterfaceC10574p
        public final Object invoke(AbstractC8471i abstractC8471i, InterfaceC9324c<? super C8736p> interfaceC9324c) {
            return ((C09771) create(abstractC8471i, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            int i10;
            Object[] objArr;
            long[] jArr;
            AbstractC8471i abstractC8471i;
            Object objM17291f = AbstractC9434a.m17291f();
            int i11 = this.label;
            if (i11 == 0) {
                AbstractC9079b.m15926b(obj);
                AbstractC8471i abstractC8471i2 = (AbstractC8471i) this.L$0;
                OrderedScatterSet orderedScatterSet = ((OrderedSetWrapper) this.this$0).parent;
                Object[] objArr2 = orderedScatterSet.elements;
                long[] jArr2 = orderedScatterSet.nodes;
                i10 = orderedScatterSet.tail;
                objArr = objArr2;
                jArr = jArr2;
                abstractC8471i = abstractC8471i2;
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i10 = this.I$0;
                jArr = (long[]) this.L$2;
                objArr = (Object[]) this.L$1;
                abstractC8471i = (AbstractC8471i) this.L$0;
                AbstractC9079b.m15926b(obj);
            }
            while (i10 != Integer.MAX_VALUE) {
                int i12 = (int) ((jArr[i10] >> 31) & SieveCacheKt.NodeLinkMask);
                Object obj2 = objArr[i10];
                this.L$0 = abstractC8471i;
                this.L$1 = objArr;
                this.L$2 = jArr;
                this.I$0 = i12;
                this.label = 1;
                if (abstractC8471i.mo13820a(obj2, this) == objM17291f) {
                    return objM17291f;
                }
                i10 = i12;
            }
            return C8736p.f16368a;
        }
    }

    public OrderedSetWrapper(OrderedScatterSet<E> parent) {
        AbstractC9133u.m16133g(parent, "parent");
        this.parent = parent;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean add(E e10) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public boolean addAll(Collection<? extends E> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public boolean contains(Object obj) {
        return this.parent.contains(obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Set, java.util.Collection
    public boolean containsAll(Collection<? extends Object> elements) {
        AbstractC9133u.m16133g(elements, "elements");
        Iterator<T> it = elements.iterator();
        while (it.hasNext()) {
            if (!this.parent.contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return AbstractC9133u.m16128b(this.parent, ((OrderedSetWrapper) obj).parent);
    }

    public int getSize() {
        return this.parent._size;
    }

    @Override // java.util.Set, java.util.Collection
    public int hashCode() {
        return this.parent.hashCode();
    }

    @Override // java.util.Set, java.util.Collection
    public boolean isEmpty() {
        return this.parent.isEmpty();
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public Iterator<E> iterator() {
        return AbstractC8472j.m13826a(new C09771(this, null));
    }

    @Override // java.util.Set, java.util.Collection
    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public boolean removeAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public boolean retainAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public final /* bridge */ int size() {
        return getSize();
    }

    @Override // java.util.Set, java.util.Collection
    public Object[] toArray() {
        return AbstractC9125m.m16122a(this);
    }

    public String toString() {
        return this.parent.toString();
    }

    @Override // java.util.Set, java.util.Collection
    public <T> T[] toArray(T[] array) {
        AbstractC9133u.m16133g(array, "array");
        return (T[]) AbstractC9125m.m16123b(this, array);
    }
}
