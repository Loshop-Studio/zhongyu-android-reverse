package androidx.compose.material3.carousel;

import androidx.compose.runtime.internal.StabilityInferred;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.function.UnaryOperator;
import kotlin.jvm.internal.AbstractC9125m;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;
import p077d8.AbstractC8323h;
import p077d8.C8321f;
import p134i7.AbstractC8778f0;
import p134i7.AbstractC8809v;
import p311y7.InterfaceC10668a;

@StabilityInferred(parameters = 0)
/* loaded from: classes2.dex */
public final class KeylineList implements List<Keyline>, InterfaceC10668a {
    private final /* synthetic */ List<Keyline> $$delegate_0;
    private final int firstFocalIndex;
    private final int firstNonAnchorIndex;
    private final int lastFocalIndex;
    private final int lastNonAnchorIndex;
    private final int pivotIndex;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final KeylineList Empty = new KeylineList(AbstractC8809v.m14771n());

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC9126n abstractC9126n) {
            this();
        }

        public final KeylineList getEmpty() {
            return KeylineList.Empty;
        }

        private Companion() {
        }
    }

    public KeylineList(List<Keyline> list) {
        int iNextIndex;
        int iNextIndex2;
        this.$$delegate_0 = list;
        Iterator<Keyline> it = iterator();
        int i10 = 0;
        int i11 = 0;
        while (true) {
            iNextIndex = -1;
            if (!it.hasNext()) {
                i11 = -1;
                break;
            } else if (it.next().isPivot()) {
                break;
            } else {
                i11++;
            }
        }
        this.pivotIndex = i11;
        Iterator<Keyline> it2 = iterator();
        int i12 = 0;
        while (true) {
            if (!it2.hasNext()) {
                i12 = -1;
                break;
            } else if (!it2.next().isAnchor()) {
                break;
            } else {
                i12++;
            }
        }
        this.firstNonAnchorIndex = i12;
        ListIterator<Keyline> listIterator = listIterator(size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                iNextIndex2 = -1;
                break;
            } else if (!listIterator.previous().isAnchor()) {
                iNextIndex2 = listIterator.nextIndex();
                break;
            }
        }
        this.lastNonAnchorIndex = iNextIndex2;
        Iterator<Keyline> it3 = iterator();
        while (true) {
            if (!it3.hasNext()) {
                i10 = -1;
                break;
            } else if (it3.next().isFocal()) {
                break;
            } else {
                i10++;
            }
        }
        this.firstFocalIndex = i10;
        ListIterator<Keyline> listIterator2 = listIterator(size());
        while (true) {
            if (!listIterator2.hasPrevious()) {
                break;
            } else if (listIterator2.previous().isFocal()) {
                iNextIndex = listIterator2.nextIndex();
                break;
            }
        }
        this.lastFocalIndex = iNextIndex;
    }

    /* renamed from: add, reason: avoid collision after fix types in other method */
    public void add2(int i10, Keyline keyline) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public boolean addAll(int i10, Collection<? extends Keyline> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean contains(Keyline keyline) {
        return this.$$delegate_0.contains(keyline);
    }

    @Override // java.util.List, java.util.Collection
    public boolean containsAll(Collection<? extends Object> collection) {
        return this.$$delegate_0.containsAll(collection);
    }

    @Override // java.util.List, java.util.Collection
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof KeylineList)) {
            return false;
        }
        KeylineList keylineList = (KeylineList) obj;
        if (size() != keylineList.size()) {
            return false;
        }
        int size = size();
        for (int i10 = 0; i10 < size; i10++) {
            if (!AbstractC9133u.m16128b(get(i10), keylineList.get(i10))) {
                return false;
            }
        }
        return true;
    }

    public final int firstIndexAfterFocalRangeWithSize(float f10) {
        Object next;
        Iterator it = new C8321f(this.lastFocalIndex, AbstractC8809v.m14773p(this)).iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (get(((Number) next).intValue()).getSize() == f10) {
                break;
            }
        }
        Integer num = (Integer) next;
        return num != null ? num.intValue() : AbstractC8809v.m14773p(this);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // java.util.List
    public Keyline get(int i10) {
        return this.$$delegate_0.get(i10);
    }

    public final Keyline getFirstFocal() {
        Keyline keyline = (Keyline) AbstractC8778f0.m14569o0(this, this.firstFocalIndex);
        if (keyline != null) {
            return keyline;
        }
        throw new NoSuchElementException("All KeylineLists must have at least one focal keyline");
    }

    public final int getFirstFocalIndex() {
        return this.firstFocalIndex;
    }

    public final Keyline getFirstNonAnchor() {
        return get(this.firstNonAnchorIndex);
    }

    public final int getFirstNonAnchorIndex() {
        return this.firstNonAnchorIndex;
    }

    public final Keyline getKeylineAfter(float f10) {
        Keyline keyline;
        int size = size();
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                keyline = null;
                break;
            }
            keyline = get(i10);
            if (keyline.getUnadjustedOffset() >= f10) {
                break;
            }
            i10++;
        }
        Keyline keyline2 = keyline;
        return keyline2 == null ? (Keyline) AbstractC8778f0.m14578x0(this) : keyline2;
    }

    public final Keyline getKeylineBefore(float f10) {
        int size = size() - 1;
        if (size >= 0) {
            while (true) {
                int i10 = size - 1;
                Keyline keyline = get(size);
                if (keyline.getUnadjustedOffset() < f10) {
                    return keyline;
                }
                if (i10 < 0) {
                    break;
                }
                size = i10;
            }
        }
        return (Keyline) AbstractC8778f0.m14566l0(this);
    }

    public final Keyline getLastFocal() {
        Keyline keyline = (Keyline) AbstractC8778f0.m14569o0(this, this.lastFocalIndex);
        if (keyline != null) {
            return keyline;
        }
        throw new NoSuchElementException("All KeylineLists must have at least one focal keyline");
    }

    public final int getLastFocalIndex() {
        return this.lastFocalIndex;
    }

    public final Keyline getLastNonAnchor() {
        return get(this.lastNonAnchorIndex);
    }

    public final int getLastNonAnchorIndex() {
        return this.lastNonAnchorIndex;
    }

    public final Keyline getPivot() {
        return get(this.pivotIndex);
    }

    public final int getPivotIndex() {
        return this.pivotIndex;
    }

    public int getSize() {
        return this.$$delegate_0.size();
    }

    @Override // java.util.List, java.util.Collection
    public int hashCode() {
        int size = size();
        int iHashCode = 0;
        for (int i10 = 0; i10 < size; i10++) {
            iHashCode += get(i10).hashCode() * 31;
        }
        return iHashCode;
    }

    public int indexOf(Keyline keyline) {
        return this.$$delegate_0.indexOf(keyline);
    }

    @Override // java.util.List, java.util.Collection
    public boolean isEmpty() {
        return this.$$delegate_0.isEmpty();
    }

    public final boolean isFirstFocalItemAtStartOfContainer() {
        return getFirstFocal().getOffset() - (getFirstFocal().getSize() / ((float) 2)) >= 0.0f && AbstractC9133u.m16128b(getFirstFocal(), getFirstNonAnchor());
    }

    public final boolean isLastFocalItemAtEndOfContainer(float f10) {
        return getLastFocal().getOffset() + (getLastFocal().getSize() / ((float) 2)) <= f10 && AbstractC9133u.m16128b(getLastFocal(), getLastNonAnchor());
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public Iterator<Keyline> iterator() {
        return this.$$delegate_0.iterator();
    }

    public final int lastIndexBeforeFocalRangeWithSize(float f10) {
        Object next;
        Iterator it = AbstractC8323h.m13522q(this.firstFocalIndex - 1, 0).iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (get(((Number) next).intValue()).getSize() == f10) {
                break;
            }
        }
        Integer num = (Integer) next;
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    public int lastIndexOf(Keyline keyline) {
        return this.$$delegate_0.lastIndexOf(keyline);
    }

    @Override // java.util.List
    public ListIterator<Keyline> listIterator() {
        return this.$$delegate_0.listIterator();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // java.util.List
    public Keyline remove(int i10) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean removeAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public void replaceAll(UnaryOperator<Keyline> unaryOperator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean retainAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* renamed from: set, reason: avoid collision after fix types in other method */
    public Keyline set2(int i10, Keyline keyline) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ int size() {
        return getSize();
    }

    @Override // java.util.List
    public void sort(Comparator<? super Keyline> comparator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public List<Keyline> subList(int i10, int i11) {
        return this.$$delegate_0.subList(i10, i11);
    }

    @Override // java.util.List, java.util.Collection
    public Object[] toArray() {
        return AbstractC9125m.m16122a(this);
    }

    @Override // java.util.List
    public /* bridge */ /* synthetic */ void add(int i10, Keyline keyline) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean addAll(Collection<? extends Keyline> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof Keyline) {
            return contains((Keyline) obj);
        }
        return false;
    }

    @Override // java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof Keyline) {
            return indexOf((Keyline) obj);
        }
        return -1;
    }

    @Override // java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof Keyline) {
            return lastIndexOf((Keyline) obj);
        }
        return -1;
    }

    @Override // java.util.List
    public ListIterator<Keyline> listIterator(int i10) {
        return this.$$delegate_0.listIterator(i10);
    }

    @Override // java.util.List
    public /* bridge */ /* synthetic */ Keyline remove(int i10) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public /* bridge */ /* synthetic */ Keyline set(int i10, Keyline keyline) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public <T> T[] toArray(T[] tArr) {
        return (T[]) AbstractC9125m.m16123b(this, tArr);
    }

    public boolean add(Keyline keyline) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
