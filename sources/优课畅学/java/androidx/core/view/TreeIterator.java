package androidx.core.view;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p134i7.AbstractC8768a0;
import p134i7.AbstractC8778f0;
import p300x7.InterfaceC10570l;
import p311y7.InterfaceC10668a;

/* loaded from: classes2.dex */
public final class TreeIterator<T> implements Iterator<T>, InterfaceC10668a {
    private final InterfaceC10570l getChildIterator;
    private Iterator<? extends T> iterator;
    private final List<Iterator<T>> stack = new ArrayList();

    public TreeIterator(Iterator<? extends T> it, InterfaceC10570l interfaceC10570l) {
        this.getChildIterator = interfaceC10570l;
        this.iterator = it;
    }

    private final void prepareNextIterator(T t10) {
        Iterator<? extends T> it = (Iterator) this.getChildIterator.invoke(t10);
        if (it != null && it.hasNext()) {
            this.stack.add(this.iterator);
            this.iterator = it;
        } else {
            while (!this.iterator.hasNext() && !this.stack.isEmpty()) {
                this.iterator = (Iterator) AbstractC8778f0.m14578x0(this.stack);
                AbstractC8768a0.m14493O(this.stack);
            }
        }
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.iterator.hasNext();
    }

    @Override // java.util.Iterator
    public T next() {
        T next = this.iterator.next();
        prepareNextIterator(next);
        return next;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
