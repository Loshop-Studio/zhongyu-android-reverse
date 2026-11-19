package p053e6;

import java.util.AbstractList;
import java.util.ConcurrentModificationException;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import kotlin.collections.builders.ListBuilder;
import p160s6.InterfaceC6560a;

/* renamed from: e6.a */
/* loaded from: classes2.dex */
public final class C5457a implements ListIterator, InterfaceC6560a {

    /* renamed from: a */
    public final ListBuilder f8424a;

    /* renamed from: b */
    public int f8425b;

    /* renamed from: c */
    public int f8426c = -1;

    /* renamed from: d */
    public int f8427d;

    public C5457a(ListBuilder listBuilder, int i) {
        this.f8424a = listBuilder;
        this.f8425b = i;
        this.f8427d = ((AbstractList) listBuilder).modCount;
    }

    /* renamed from: a */
    public final void m4821a() {
        if (((AbstractList) this.f8424a).modCount != this.f8427d) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        m4821a();
        int i = this.f8425b;
        this.f8425b = i + 1;
        ListBuilder listBuilder = this.f8424a;
        listBuilder.add(i, obj);
        this.f8426c = -1;
        this.f8427d = ((AbstractList) listBuilder).modCount;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.f8425b < this.f8424a.length;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f8425b > 0;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        m4821a();
        int i = this.f8425b;
        ListBuilder listBuilder = this.f8424a;
        if (i >= listBuilder.length) {
            throw new NoSuchElementException();
        }
        int i8 = this.f8425b;
        this.f8425b = i8 + 1;
        this.f8426c = i8;
        return listBuilder.backing[this.f8426c];
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f8425b;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        m4821a();
        int i = this.f8425b;
        if (i <= 0) {
            throw new NoSuchElementException();
        }
        int i8 = i - 1;
        this.f8425b = i8;
        this.f8426c = i8;
        return this.f8424a.backing[this.f8426c];
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f8425b - 1;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        m4821a();
        int i = this.f8426c;
        if (i == -1) {
            throw new IllegalStateException("Call next() or previous() before removing element from the iterator.");
        }
        ListBuilder listBuilder = this.f8424a;
        listBuilder.removeAt(i);
        this.f8425b = this.f8426c;
        this.f8426c = -1;
        this.f8427d = ((AbstractList) listBuilder).modCount;
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        m4821a();
        int i = this.f8426c;
        if (i == -1) {
            throw new IllegalStateException("Call next() or previous() before replacing element from the iterator.");
        }
        this.f8424a.set(i, obj);
    }
}
