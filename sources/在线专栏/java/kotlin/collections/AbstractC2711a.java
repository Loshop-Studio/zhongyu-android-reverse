package kotlin.collections;

import java.util.Collection;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC2770m;
import kotlin.jvm.internal.C2763f;
import kotlin.jvm.internal.C2769l;
import org.jetbrains.annotations.NotNull;
import p171x2.InterfaceC3470l;
import p175y2.InterfaceC3498a;

/* renamed from: kotlin.collections.a */
/* loaded from: classes.dex */
public abstract class AbstractC2711a<E> implements Collection<E>, InterfaceC3498a {

    /* renamed from: kotlin.collections.a$a */
    static final class a extends AbstractC2770m implements InterfaceC3470l<E, CharSequence> {

        /* renamed from: a */
        final /* synthetic */ AbstractC2711a<E> f10696a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(AbstractC2711a<? extends E> abstractC2711a) {
            super(1);
            this.f10696a = abstractC2711a;
        }

        @Override // p171x2.InterfaceC3470l
        @NotNull
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CharSequence invoke(E e4) {
            return e4 == this.f10696a ? "(this Collection)" : String.valueOf(e4);
        }
    }

    protected AbstractC2711a() {
    }

    @Override // java.util.Collection
    public boolean add(E e4) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean addAll(Collection<? extends E> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean contains(E e4) {
        if (isEmpty()) {
            return false;
        }
        Iterator<E> it = iterator();
        while (it.hasNext()) {
            if (C2769l.m9237a(it.next(), e4)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Collection
    public boolean containsAll(@NotNull Collection<? extends Object> elements) {
        C2769l.m9241e(elements, "elements");
        if (elements.isEmpty()) {
            return true;
        }
        Iterator<T> it = elements.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    public abstract int getSize();

    @Override // java.util.Collection
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.Collection, java.lang.Iterable
    @NotNull
    public abstract Iterator<E> iterator();

    @Override // java.util.Collection
    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean removeAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean retainAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final /* bridge */ int size() {
        return getSize();
    }

    @Override // java.util.Collection
    @NotNull
    public Object[] toArray() {
        return C2763f.m9232a(this);
    }

    @NotNull
    public String toString() {
        return C2738t.m9154B(this, ", ", "[", "]", 0, null, new a(this), 24, null);
    }

    @Override // java.util.Collection
    @NotNull
    public <T> T[] toArray(@NotNull T[] array) {
        C2769l.m9241e(array, "array");
        return (T[]) C2763f.m9233b(this, array);
    }
}
