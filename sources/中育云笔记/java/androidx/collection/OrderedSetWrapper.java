package androidx.collection;

import id.InterfaceC9624a;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.AbstractC9924b;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.internal.AbstractC9971m;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9544p;
import p296pd.AbstractC10661i;
import p296pd.AbstractC10662j;
import p309qc.C10786q;
import p393wc.AbstractC11725a;
import p409xc.InterfaceC11829d;
import vc.InterfaceC11588c;

/* loaded from: classes.dex */
class OrderedSetWrapper<E> implements Set<E>, InterfaceC9624a {
    private final OrderedScatterSet<E> parent;

    @InterfaceC11829d(m26210c = "androidx.collection.OrderedSetWrapper$iterator$1", m26211f = "OrderedScatterSet.kt", m26212l = {1454}, m26213m = "invokeSuspend")
    /* renamed from: androidx.collection.OrderedSetWrapper$iterator$1 */
    public static final class C10071 extends RestrictedSuspendLambda implements InterfaceC9544p {
        int I$0;
        private /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        int label;
        final /* synthetic */ OrderedSetWrapper<E> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10071(OrderedSetWrapper<E> orderedSetWrapper, InterfaceC11588c<? super C10071> interfaceC11588c) {
            super(2, interfaceC11588c);
            this.this$0 = orderedSetWrapper;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC11588c<C10786q> create(Object obj, InterfaceC11588c<?> interfaceC11588c) {
            C10071 c10071 = new C10071(this.this$0, interfaceC11588c);
            c10071.L$0 = obj;
            return c10071;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            int i10;
            Object[] objArr;
            long[] jArr;
            AbstractC10661i abstractC10661i;
            Object objM25952f = AbstractC11725a.m25952f();
            int i11 = this.label;
            if (i11 == 0) {
                AbstractC9924b.m20071b(obj);
                AbstractC10661i abstractC10661i2 = (AbstractC10661i) this.L$0;
                OrderedScatterSet orderedScatterSet = ((OrderedSetWrapper) this.this$0).parent;
                Object[] objArr2 = orderedScatterSet.elements;
                long[] jArr2 = orderedScatterSet.nodes;
                i10 = orderedScatterSet.tail;
                objArr = objArr2;
                jArr = jArr2;
                abstractC10661i = abstractC10661i2;
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i10 = this.I$0;
                jArr = (long[]) this.L$2;
                objArr = (Object[]) this.L$1;
                abstractC10661i = (AbstractC10661i) this.L$0;
                AbstractC9924b.m20071b(obj);
            }
            while (i10 != Integer.MAX_VALUE) {
                int i12 = (int) ((jArr[i10] >> 31) & SieveCacheKt.NodeLinkMask);
                Object obj2 = objArr[i10];
                this.L$0 = abstractC10661i;
                this.L$1 = objArr;
                this.L$2 = jArr;
                this.I$0 = i12;
                this.label = 1;
                if (abstractC10661i.mo22551a(obj2, this) == objM25952f) {
                    return objM25952f;
                }
                i10 = i12;
            }
            return C10786q.f26013a;
        }

        @Override // p181hd.InterfaceC9544p
        public final Object invoke(AbstractC10661i abstractC10661i, InterfaceC11588c<? super C10786q> interfaceC11588c) {
            return ((C10071) create(abstractC10661i, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
        }
    }

    public OrderedSetWrapper(OrderedScatterSet<E> parent) {
        AbstractC9979u.m20294g(parent, "parent");
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
        AbstractC9979u.m20294g(elements, "elements");
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
        return AbstractC9979u.m20289b(this.parent, ((OrderedSetWrapper) obj).parent);
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
        return AbstractC10662j.m22557a(new C10071(this, null));
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
        return AbstractC9971m.m20283a(this);
    }

    public String toString() {
        return this.parent.toString();
    }

    @Override // java.util.Set, java.util.Collection
    public <T> T[] toArray(T[] array) {
        AbstractC9979u.m20294g(array, "array");
        return (T[]) AbstractC9971m.m20284b(this, array);
    }
}
