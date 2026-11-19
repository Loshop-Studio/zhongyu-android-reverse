package androidx.collection;

import id.InterfaceC9624a;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.internal.AbstractC9971m;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9544p;
import p296pd.AbstractC10661i;
import p296pd.AbstractC10662j;
import p309qc.C10786q;
import p409xc.InterfaceC11829d;
import vc.InterfaceC11588c;

/* loaded from: classes.dex */
class SetWrapper<E> implements Set<E>, InterfaceC9624a {
    private final ScatterSet<E> parent;

    @InterfaceC11829d(m26210c = "androidx.collection.SetWrapper$iterator$1", m26211f = "ScatterSet.kt", m26212l = {1153}, m26213m = "invokeSuspend")
    /* renamed from: androidx.collection.SetWrapper$iterator$1 */
    public static final class C10091 extends RestrictedSuspendLambda implements InterfaceC9544p {
        int I$0;
        int I$1;
        int I$2;
        int I$3;
        long J$0;
        private /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        int label;
        final /* synthetic */ SetWrapper<E> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10091(SetWrapper<E> setWrapper, InterfaceC11588c<? super C10091> interfaceC11588c) {
            super(2, interfaceC11588c);
            this.this$0 = setWrapper;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC11588c<C10786q> create(Object obj, InterfaceC11588c<?> interfaceC11588c) {
            C10091 c10091 = new C10091(this.this$0, interfaceC11588c);
            c10091.L$0 = obj;
            return c10091;
        }

        /* JADX WARN: Removed duplicated region for block: B:13:0x005a  */
        /* JADX WARN: Removed duplicated region for block: B:15:0x006d  */
        /* JADX WARN: Removed duplicated region for block: B:21:0x0097  */
        /* JADX WARN: Removed duplicated region for block: B:24:0x009f  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0058 -> B:23:0x009d). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x005a -> B:14:0x006b). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0074 -> B:20:0x0094). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0091 -> B:20:0x0094). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r21) throws java.lang.Throwable {
            /*
                r20 = this;
                r0 = r20
                java.lang.Object r1 = p393wc.AbstractC11725a.m25952f()
                int r2 = r0.label
                r3 = 0
                r4 = 8
                r5 = 1
                if (r2 == 0) goto L33
                if (r2 != r5) goto L2b
                int r2 = r0.I$3
                int r6 = r0.I$2
                long r7 = r0.J$0
                int r9 = r0.I$1
                int r10 = r0.I$0
                java.lang.Object r11 = r0.L$2
                long[] r11 = (long[]) r11
                java.lang.Object r12 = r0.L$1
                java.lang.Object[] r12 = (java.lang.Object[]) r12
                java.lang.Object r13 = r0.L$0
                pd.i r13 = (p296pd.AbstractC10661i) r13
                kotlin.AbstractC9924b.m20071b(r21)
                goto L94
            L2b:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                r1.<init>(r2)
                throw r1
            L33:
                kotlin.AbstractC9924b.m20071b(r21)
                java.lang.Object r2 = r0.L$0
                pd.i r2 = (p296pd.AbstractC10661i) r2
                androidx.collection.SetWrapper<E> r6 = r0.this$0
                androidx.collection.ScatterSet r6 = androidx.collection.SetWrapper.access$getParent$p(r6)
                java.lang.Object[] r7 = r6.elements
                long[] r6 = r6.metadata
                int r8 = r6.length
                int r8 = r8 + (-2)
                if (r8 < 0) goto La2
                r9 = r3
            L4a:
                r10 = r6[r9]
                long r12 = ~r10
                r14 = 7
                long r12 = r12 << r14
                long r12 = r12 & r10
                r14 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
                long r12 = r12 & r14
                int r12 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
                if (r12 == 0) goto L9d
                int r12 = r9 - r8
                int r12 = ~r12
                int r12 = r12 >>> 31
                int r12 = 8 - r12
                r13 = r2
                r2 = r3
                r18 = r10
                r11 = r6
                r10 = r8
                r6 = r12
                r12 = r7
                r7 = r18
            L6b:
                if (r2 >= r6) goto L97
                r14 = 255(0xff, double:1.26E-321)
                long r14 = r14 & r7
                r16 = 128(0x80, double:6.3E-322)
                int r14 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
                if (r14 >= 0) goto L94
                int r14 = r9 << 3
                int r14 = r14 + r2
                r14 = r12[r14]
                r0.L$0 = r13
                r0.L$1 = r12
                r0.L$2 = r11
                r0.I$0 = r10
                r0.I$1 = r9
                r0.J$0 = r7
                r0.I$2 = r6
                r0.I$3 = r2
                r0.label = r5
                java.lang.Object r14 = r13.mo22551a(r14, r0)
                if (r14 != r1) goto L94
                return r1
            L94:
                long r7 = r7 >> r4
                int r2 = r2 + r5
                goto L6b
            L97:
                if (r6 != r4) goto La2
                r8 = r10
                r6 = r11
                r7 = r12
                r2 = r13
            L9d:
                if (r9 == r8) goto La2
                int r9 = r9 + 1
                goto L4a
            La2:
                qc.q r1 = p309qc.C10786q.f26013a
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.collection.SetWrapper.C10091.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // p181hd.InterfaceC9544p
        public final Object invoke(AbstractC10661i abstractC10661i, InterfaceC11588c<? super C10786q> interfaceC11588c) {
            return ((C10091) create(abstractC10661i, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
        }
    }

    public SetWrapper(ScatterSet<E> parent) {
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
        return AbstractC9979u.m20289b(this.parent, ((SetWrapper) obj).parent);
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
        return AbstractC10662j.m22557a(new C10091(this, null));
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
