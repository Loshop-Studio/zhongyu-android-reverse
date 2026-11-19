package kotlin.collections.builders;

import java.util.AbstractList;
import java.util.ConcurrentModificationException;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import kotlin.collections.builders.ListBuilder;
import p160s6.InterfaceC6560a;

/* renamed from: kotlin.collections.builders.a */
/* loaded from: classes2.dex */
public final class C5779a implements ListIterator, InterfaceC6560a {

    /* renamed from: a */
    public final ListBuilder.BuilderSubList f9173a;

    /* renamed from: b */
    public int f9174b;

    /* renamed from: c */
    public int f9175c = -1;

    /* renamed from: d */
    public int f9176d;

    public C5779a(ListBuilder.BuilderSubList builderSubList, int i) {
        this.f9173a = builderSubList;
        this.f9174b = i;
        this.f9176d = ((AbstractList) builderSubList).modCount;
    }

    /* renamed from: a */
    public final void m5141a() {
        if (((AbstractList) this.f9173a.root).modCount != this.f9176d) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        m5141a();
        int i = this.f9174b;
        this.f9174b = i + 1;
        ListBuilder.BuilderSubList builderSubList = this.f9173a;
        builderSubList.add(i, obj);
        this.f9175c = -1;
        this.f9176d = ((AbstractList) builderSubList).modCount;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.f9174b < this.f9173a.length;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f9174b > 0;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        m5141a();
        int i = this.f9174b;
        ListBuilder.BuilderSubList builderSubList = this.f9173a;
        if (i >= builderSubList.length) {
            throw new NoSuchElementException();
        }
        int i8 = this.f9174b;
        this.f9174b = i8 + 1;
        this.f9175c = i8;
        return builderSubList.backing[builderSubList.offset + this.f9175c];
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f9174b;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        m5141a();
        int i = this.f9174b;
        if (i <= 0) {
            throw new NoSuchElementException();
        }
        int i8 = i - 1;
        this.f9174b = i8;
        this.f9175c = i8;
        ListBuilder.BuilderSubList builderSubList = this.f9173a;
        return builderSubList.backing[builderSubList.offset + this.f9175c];
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f9174b - 1;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        m5141a();
        int i = this.f9175c;
        if (i == -1) {
            throw new IllegalStateException("Call next() or previous() before removing element from the iterator.");
        }
        ListBuilder.BuilderSubList builderSubList = this.f9173a;
        builderSubList.removeAt(i);
        this.f9174b = this.f9175c;
        this.f9175c = -1;
        this.f9176d = ((AbstractList) builderSubList).modCount;
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        m5141a();
        int i = this.f9175c;
        if (i == -1) {
            throw new IllegalStateException("Call next() or previous() before replacing element from the iterator.");
        }
        this.f9173a.set(i, obj);
    }
}
