package androidx.collection;

import id.InterfaceC9624a;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
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
final class Entries<K, V> implements Set<Map.Entry<? extends K, ? extends V>>, InterfaceC9624a {
    private final ScatterMap<K, V> parent;

    @InterfaceC11829d(m26210c = "androidx.collection.Entries$iterator$1", m26211f = "ScatterMap.kt", m26212l = {1414}, m26213m = "invokeSuspend")
    /* renamed from: androidx.collection.Entries$iterator$1 */
    public static final class C09921 extends RestrictedSuspendLambda implements InterfaceC9544p {
        int I$0;
        int I$1;
        int I$2;
        int I$3;
        long J$0;
        private /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        int label;
        final /* synthetic */ Entries<K, V> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C09921(Entries<K, V> entries, InterfaceC11588c<? super C09921> interfaceC11588c) {
            super(2, interfaceC11588c);
            this.this$0 = entries;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC11588c<C10786q> create(Object obj, InterfaceC11588c<?> interfaceC11588c) {
            C09921 c09921 = new C09921(this.this$0, interfaceC11588c);
            c09921.L$0 = obj;
            return c09921;
        }

        /* JADX WARN: Removed duplicated region for block: B:13:0x0059  */
        /* JADX WARN: Removed duplicated region for block: B:15:0x006c  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x00b0  */
        /* JADX WARN: Removed duplicated region for block: B:25:0x00b8  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x00bb  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x0059 -> B:14:0x006a). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0073 -> B:20:0x00a8). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x00a5 -> B:21:0x00aa). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x00b8 -> B:26:0x00b9). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r21) throws java.lang.Throwable {
            /*
                Method dump skipped, instructions count: 194
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.collection.Entries.C09921.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // p181hd.InterfaceC9544p
        public final Object invoke(AbstractC10661i abstractC10661i, InterfaceC11588c<? super C10786q> interfaceC11588c) {
            return ((C09921) create(abstractC10661i, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
        }
    }

    public Entries(ScatterMap<K, V> parent) {
        AbstractC9979u.m20294g(parent, "parent");
        this.parent = parent;
    }

    @Override // java.util.Set, java.util.Collection
    public /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public boolean addAll(Collection<? extends Map.Entry<? extends K, ? extends V>> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            return contains((Map.Entry) obj);
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Set, java.util.Collection
    public boolean containsAll(Collection<? extends Object> elements) {
        AbstractC9979u.m20294g(elements, "elements");
        Collection<? extends Object> collection = elements;
        if (collection.isEmpty()) {
            return true;
        }
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            if (!AbstractC9979u.m20289b(this.parent.get(entry.getKey()), entry.getValue())) {
                return false;
            }
        }
        return true;
    }

    public int getSize() {
        return this.parent._size;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean isEmpty() {
        return this.parent.isEmpty();
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public Iterator<Map.Entry<K, V>> iterator() {
        return AbstractC10662j.m22557a(new C09921(this, null));
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

    public boolean add(Map.Entry<? extends K, ? extends V> entry) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean contains(Map.Entry<? extends K, ? extends V> element) {
        AbstractC9979u.m20294g(element, "element");
        return AbstractC9979u.m20289b(this.parent.get(element.getKey()), element.getValue());
    }

    @Override // java.util.Set, java.util.Collection
    public <T> T[] toArray(T[] array) {
        AbstractC9979u.m20294g(array, "array");
        return (T[]) AbstractC9971m.m20284b(this, array);
    }
}
