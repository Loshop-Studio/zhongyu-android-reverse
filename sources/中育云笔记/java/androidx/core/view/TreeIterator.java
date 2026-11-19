package androidx.core.view;

import id.InterfaceC9624a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p181hd.InterfaceC9540l;
import p325rc.AbstractC10937b0;
import p325rc.AbstractC10947g0;

/* loaded from: classes2.dex */
public final class TreeIterator<T> implements Iterator<T>, InterfaceC9624a {
    private final InterfaceC9540l getChildIterator;
    private Iterator<? extends T> iterator;
    private final List<Iterator<T>> stack = new ArrayList();

    public TreeIterator(Iterator<? extends T> it, InterfaceC9540l interfaceC9540l) {
        this.getChildIterator = interfaceC9540l;
        this.iterator = it;
    }

    private final void prepareNextIterator(T t10) {
        Iterator<? extends T> it = (Iterator) this.getChildIterator.invoke(t10);
        if (it != null && it.hasNext()) {
            this.stack.add(this.iterator);
            this.iterator = it;
        } else {
            while (!this.iterator.hasNext() && !this.stack.isEmpty()) {
                this.iterator = (Iterator) AbstractC10947g0.m23956y0(this.stack);
                AbstractC10937b0.m23870O(this.stack);
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
