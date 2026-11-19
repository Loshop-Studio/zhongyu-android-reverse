package com.huawei.hms.framework.common;

import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.concurrent.ConcurrentLinkedQueue;

/* loaded from: classes5.dex */
public class LimitQueue<E> extends ConcurrentLinkedQueue<E> {

    /* renamed from: c */
    public int f11634c;

    /* renamed from: d */
    public boolean f11635d;

    public LimitQueue(int i10) {
        this.f11635d = false;
        this.f11634c = i10;
    }

    @Override // java.util.concurrent.ConcurrentLinkedQueue, java.util.AbstractQueue, java.util.AbstractCollection, java.util.Collection, java.util.Queue
    public boolean add(E e10) {
        if (this.f11635d) {
            super.remove(e10);
        }
        if (super.size() >= this.f11634c) {
            super.poll();
        }
        return super.add(e10);
    }

    @Override // java.util.concurrent.ConcurrentLinkedQueue, java.util.AbstractQueue, java.util.AbstractCollection, java.util.Collection
    public boolean addAll(Collection<? extends E> collection) {
        if (collection.size() > this.f11634c) {
            return false;
        }
        if (this.f11635d) {
            super.removeAll(collection);
        }
        for (int size = (collection.size() + super.size()) - this.f11634c; size > 0; size--) {
            super.poll();
        }
        return super.addAll(collection);
    }

    @Override // java.util.concurrent.ConcurrentLinkedQueue, java.util.AbstractQueue, java.util.AbstractCollection, java.util.Collection
    public void clear() {
        super.clear();
    }

    public E get(int i10) {
        Iterator<E> it = iterator();
        E next = null;
        for (int i11 = 0; i11 <= i10 && it.hasNext(); i11++) {
            next = it.next();
        }
        return next;
    }

    public int getLimit() {
        return this.f11634c;
    }

    @Override // java.util.concurrent.ConcurrentLinkedQueue, java.util.Queue
    public boolean offer(E e10) {
        if (this.f11635d) {
            super.remove(e10);
        }
        if (super.size() >= this.f11634c) {
            super.poll();
        }
        return super.offer(e10);
    }

    public E peekLast() {
        Iterator<E> it = iterator();
        E next = null;
        while (it.hasNext()) {
            next = it.next();
        }
        return next;
    }

    @Override // java.util.concurrent.ConcurrentLinkedQueue, java.util.Queue
    public E poll() {
        return (E) super.poll();
    }

    @Override // java.util.AbstractQueue, java.util.Queue
    public E remove() {
        try {
            return (E) super.remove();
        } catch (NoSuchElementException unused) {
            Logger.m8588w("LimitQueue", "remove failed, limitQueue is empty");
            return null;
        }
    }

    public LimitQueue(int i10, boolean z10) {
        this.f11634c = i10;
        this.f11635d = z10;
    }

    public LimitQueue(Collection<? extends E> collection, boolean z10) {
        this(collection.size(), z10);
        addAll(collection);
    }
}
