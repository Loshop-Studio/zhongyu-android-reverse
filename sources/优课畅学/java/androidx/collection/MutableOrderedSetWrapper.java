package androidx.collection;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.internal.AbstractC9133u;
import p101f8.AbstractC8472j;
import p311y7.InterfaceC10668a;
import p311y7.InterfaceC10673f;

/* loaded from: classes.dex */
final class MutableOrderedSetWrapper<E> extends OrderedSetWrapper<E> implements Set<E>, InterfaceC10673f {
    private final MutableOrderedScatterSet<E> parent;

    /* renamed from: androidx.collection.MutableOrderedSetWrapper$iterator$1 */
    public static final class C09721 implements Iterator<E>, InterfaceC10668a {
        private int current = -1;
        private final Iterator<E> iterator;
        final /* synthetic */ MutableOrderedSetWrapper<E> this$0;

        public C09721(MutableOrderedSetWrapper<E> mutableOrderedSetWrapper) {
            this.this$0 = mutableOrderedSetWrapper;
            this.iterator = AbstractC8472j.m13826a(new MutableOrderedSetWrapper$iterator$1$iterator$1(mutableOrderedSetWrapper, this, null));
        }

        public final int getCurrent() {
            return this.current;
        }

        public final Iterator<E> getIterator() {
            return this.iterator;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.iterator.hasNext();
        }

        @Override // java.util.Iterator
        public E next() {
            return this.iterator.next();
        }

        @Override // java.util.Iterator
        public void remove() {
            if (this.current != -1) {
                ((MutableOrderedSetWrapper) this.this$0).parent.removeElementAt(this.current);
                this.current = -1;
            }
        }

        public final void setCurrent(int i10) {
            this.current = i10;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MutableOrderedSetWrapper(MutableOrderedScatterSet<E> parent) {
        super(parent);
        AbstractC9133u.m16133g(parent, "parent");
        this.parent = parent;
    }

    @Override // androidx.collection.OrderedSetWrapper, java.util.Set, java.util.Collection
    public boolean add(E e10) {
        return this.parent.add(e10);
    }

    @Override // androidx.collection.OrderedSetWrapper, java.util.Set, java.util.Collection
    public boolean addAll(Collection<? extends E> elements) {
        AbstractC9133u.m16133g(elements, "elements");
        return this.parent.addAll(elements);
    }

    @Override // androidx.collection.OrderedSetWrapper, java.util.Set, java.util.Collection
    public void clear() {
        this.parent.clear();
    }

    @Override // androidx.collection.OrderedSetWrapper, java.util.Set, java.util.Collection, java.lang.Iterable
    public Iterator<E> iterator() {
        return new C09721(this);
    }

    @Override // androidx.collection.OrderedSetWrapper, java.util.Set, java.util.Collection
    public boolean remove(Object obj) {
        return this.parent.remove(obj);
    }

    @Override // androidx.collection.OrderedSetWrapper, java.util.Set, java.util.Collection
    public boolean removeAll(Collection<? extends Object> elements) {
        AbstractC9133u.m16133g(elements, "elements");
        return this.parent.removeAll(elements);
    }

    @Override // androidx.collection.OrderedSetWrapper, java.util.Set, java.util.Collection
    public boolean retainAll(Collection<? extends Object> elements) {
        AbstractC9133u.m16133g(elements, "elements");
        return this.parent.retainAll(elements);
    }
}
