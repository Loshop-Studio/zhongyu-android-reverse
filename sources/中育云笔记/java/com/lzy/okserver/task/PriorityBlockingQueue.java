package com.lzy.okserver.task;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.AbstractQueue;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import p191i7.C9611a;

/* loaded from: classes5.dex */
public class PriorityBlockingQueue<E> extends AbstractQueue<E> implements BlockingQueue<E>, Serializable {

    /* renamed from: c */
    public final int f12733c;

    /* renamed from: d */
    public final AtomicInteger f12734d;

    /* renamed from: e */
    public transient C7518b f12735e;

    /* renamed from: f */
    public transient C7518b f12736f;

    /* renamed from: g */
    public final ReentrantLock f12737g;

    /* renamed from: h */
    public final Condition f12738h;

    /* renamed from: i */
    public final ReentrantLock f12739i;

    /* renamed from: j */
    public final Condition f12740j;

    /* renamed from: com.lzy.okserver.task.PriorityBlockingQueue$a */
    public class C7517a implements Iterator {

        /* renamed from: c */
        public C7518b f12741c;

        /* renamed from: d */
        public C7518b f12742d;

        /* renamed from: e */
        public Object f12743e;

        public C7517a() {
            PriorityBlockingQueue.this.m9692d();
            try {
                C7518b c7518b = PriorityBlockingQueue.this.f12735e.f12747c;
                this.f12741c = c7518b;
                if (c7518b != null) {
                    this.f12743e = c7518b.m9700b();
                }
            } finally {
                PriorityBlockingQueue.this.m9693e();
            }
        }

        /* renamed from: a */
        public final C7518b m9698a(C7518b c7518b) {
            C7518b c7518b2;
            while (true) {
                c7518b2 = c7518b.f12747c;
                if (c7518b2 == c7518b) {
                    return PriorityBlockingQueue.this.f12735e.f12747c;
                }
                if (c7518b2 == null || c7518b2.m9700b() != null) {
                    break;
                }
                c7518b = c7518b2;
            }
            return c7518b2;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f12741c != null;
        }

        @Override // java.util.Iterator
        public Object next() {
            PriorityBlockingQueue.this.m9692d();
            try {
                C7518b c7518b = this.f12741c;
                if (c7518b == null) {
                    throw new NoSuchElementException();
                }
                Object obj = this.f12743e;
                this.f12742d = c7518b;
                C7518b c7518bM9698a = m9698a(c7518b);
                this.f12741c = c7518bM9698a;
                this.f12743e = c7518bM9698a == null ? null : c7518bM9698a.m9700b();
                return obj;
            } finally {
                PriorityBlockingQueue.this.m9693e();
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:9:0x001b, code lost:
        
            r4.f12744f.m9697m(r1, r2);
         */
        @Override // java.util.Iterator
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void remove() {
            /*
                r4 = this;
                com.lzy.okserver.task.PriorityBlockingQueue$b r0 = r4.f12742d
                if (r0 == 0) goto L2f
                com.lzy.okserver.task.PriorityBlockingQueue r0 = com.lzy.okserver.task.PriorityBlockingQueue.this
                r0.m9692d()
                com.lzy.okserver.task.PriorityBlockingQueue$b r0 = r4.f12742d     // Catch: java.lang.Throwable -> L21
                r1 = 0
                r4.f12742d = r1     // Catch: java.lang.Throwable -> L21
                com.lzy.okserver.task.PriorityBlockingQueue r1 = com.lzy.okserver.task.PriorityBlockingQueue.this     // Catch: java.lang.Throwable -> L21
                com.lzy.okserver.task.PriorityBlockingQueue$b r1 = r1.f12735e     // Catch: java.lang.Throwable -> L21
            L12:
                com.lzy.okserver.task.PriorityBlockingQueue$b r2 = r1.f12747c     // Catch: java.lang.Throwable -> L21
                r3 = r2
                r2 = r1
                r1 = r3
                if (r1 == 0) goto L23
                if (r1 != r0) goto L12
                com.lzy.okserver.task.PriorityBlockingQueue r0 = com.lzy.okserver.task.PriorityBlockingQueue.this     // Catch: java.lang.Throwable -> L21
                r0.m9697m(r1, r2)     // Catch: java.lang.Throwable -> L21
                goto L23
            L21:
                r0 = move-exception
                goto L29
            L23:
                com.lzy.okserver.task.PriorityBlockingQueue r0 = com.lzy.okserver.task.PriorityBlockingQueue.this
                r0.m9693e()
                return
            L29:
                com.lzy.okserver.task.PriorityBlockingQueue r1 = com.lzy.okserver.task.PriorityBlockingQueue.this
                r1.m9693e()
                throw r0
            L2f:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                r0.<init>()
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.lzy.okserver.task.PriorityBlockingQueue.C7517a.remove():void");
        }
    }

    /* renamed from: com.lzy.okserver.task.PriorityBlockingQueue$b */
    public class C7518b {

        /* renamed from: a */
        public boolean f12745a = false;

        /* renamed from: b */
        public C9611a f12746b;

        /* renamed from: c */
        public C7518b f12747c;

        public C7518b(Object obj) {
            m9701c(obj);
        }

        /* renamed from: a */
        public int m9699a() {
            return this.f12746b.f22134c;
        }

        /* renamed from: b */
        public Object m9700b() {
            C9611a c9611a = this.f12746b;
            if (c9611a == null) {
                return null;
            }
            return this.f12745a ? c9611a : c9611a.f22135d;
        }

        /* renamed from: c */
        public void m9701c(Object obj) {
            if (obj == null) {
                this.f12746b = null;
            } else if (!(obj instanceof C9611a)) {
                this.f12746b = new C9611a(0, obj);
            } else {
                this.f12746b = (C9611a) obj;
                this.f12745a = true;
            }
        }
    }

    public PriorityBlockingQueue() {
        this(Integer.MAX_VALUE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        this.f12734d.set(0);
        C7518b c7518b = new C7518b(null);
        this.f12735e = c7518b;
        this.f12736f = c7518b;
        while (true) {
            Object object = objectInputStream.readObject();
            if (object == null) {
                return;
            } else {
                add(object);
            }
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        m9692d();
        try {
            objectOutputStream.defaultWriteObject();
            C7518b c7518b = this.f12735e;
            while (true) {
                c7518b = c7518b.f12747c;
                if (c7518b == null) {
                    objectOutputStream.writeObject(null);
                    m9693e();
                    return;
                }
                objectOutputStream.writeObject(c7518b.m9700b());
            }
        } catch (Throwable th) {
            m9693e();
            throw th;
        }
    }

    /* renamed from: a */
    public final Object m9690a() {
        C7518b c7518b = this.f12735e;
        C7518b c7518b2 = c7518b.f12747c;
        c7518b.f12747c = c7518b;
        this.f12735e = c7518b2;
        Object objM9700b = c7518b2.m9700b();
        c7518b2.m9701c(null);
        return objM9700b;
    }

    /* renamed from: c */
    public final void m9691c(C7518b c7518b) {
        C7518b c7518b2 = this.f12735e;
        while (true) {
            C7518b c7518b3 = c7518b2.f12747c;
            if (c7518b3 == null) {
                this.f12736f.f12747c = c7518b;
                this.f12736f = c7518b;
                return;
            } else {
                if (c7518b3.m9699a() < c7518b.m9699a()) {
                    c7518b2.f12747c = c7518b;
                    c7518b.f12747c = c7518b3;
                    return;
                }
                c7518b2 = c7518b2.f12747c;
            }
        }
    }

    @Override // java.util.AbstractQueue, java.util.AbstractCollection, java.util.Collection
    public void clear() {
        m9692d();
        try {
            C7518b c7518b = this.f12735e;
            while (true) {
                C7518b c7518b2 = c7518b.f12747c;
                if (c7518b2 == null) {
                    break;
                }
                c7518b.f12747c = c7518b;
                c7518b2.m9701c(null);
                c7518b = c7518b2;
            }
            this.f12735e = this.f12736f;
            if (this.f12734d.getAndSet(0) == this.f12733c) {
                this.f12740j.signal();
            }
            m9693e();
        } catch (Throwable th) {
            m9693e();
            throw th;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.concurrent.BlockingQueue
    public boolean contains(Object obj) {
        if (obj == null) {
            return false;
        }
        m9692d();
        try {
            C7518b c7518b = this.f12735e;
            do {
                c7518b = c7518b.f12747c;
                if (c7518b == null) {
                    return false;
                }
            } while (!obj.equals(c7518b.m9700b()));
            m9693e();
            return true;
        } finally {
            m9693e();
        }
    }

    /* renamed from: d */
    public void m9692d() {
        this.f12739i.lock();
        this.f12737g.lock();
    }

    @Override // java.util.concurrent.BlockingQueue
    public int drainTo(Collection collection) {
        return drainTo(collection, Integer.MAX_VALUE);
    }

    /* renamed from: e */
    public void m9693e() {
        this.f12737g.unlock();
        this.f12739i.unlock();
    }

    /* renamed from: f */
    public final synchronized Object m9694f(C7518b c7518b) {
        if (c7518b == null) {
            return m9690a();
        }
        m9691c(c7518b);
        return null;
    }

    /* renamed from: g */
    public final void m9695g() {
        ReentrantLock reentrantLock = this.f12737g;
        reentrantLock.lock();
        try {
            this.f12738h.signal();
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        return new C7517a();
    }

    /* renamed from: k */
    public final void m9696k() {
        ReentrantLock reentrantLock = this.f12739i;
        reentrantLock.lock();
        try {
            this.f12740j.signal();
        } finally {
            reentrantLock.unlock();
        }
    }

    /* renamed from: m */
    public void m9697m(C7518b c7518b, C7518b c7518b2) {
        c7518b.m9701c(null);
        c7518b2.f12747c = c7518b.f12747c;
        if (this.f12736f == c7518b) {
            this.f12736f = c7518b2;
        }
        if (this.f12734d.getAndDecrement() == this.f12733c) {
            this.f12740j.signal();
        }
    }

    @Override // java.util.concurrent.BlockingQueue
    public boolean offer(Object obj, long j10, TimeUnit timeUnit) throws InterruptedException {
        obj.getClass();
        long nanos = timeUnit.toNanos(j10);
        ReentrantLock reentrantLock = this.f12739i;
        AtomicInteger atomicInteger = this.f12734d;
        reentrantLock.lockInterruptibly();
        while (atomicInteger.get() == this.f12733c) {
            try {
                if (nanos <= 0) {
                    reentrantLock.unlock();
                    return false;
                }
                nanos = this.f12740j.awaitNanos(nanos);
            } catch (Throwable th) {
                reentrantLock.unlock();
                throw th;
            }
        }
        m9694f(new C7518b(obj));
        int andIncrement = atomicInteger.getAndIncrement();
        if (andIncrement + 1 < this.f12733c) {
            this.f12740j.signal();
        }
        reentrantLock.unlock();
        if (andIncrement != 0) {
            return true;
        }
        m9695g();
        return true;
    }

    @Override // java.util.Queue
    public Object peek() {
        if (this.f12734d.get() == 0) {
            return null;
        }
        ReentrantLock reentrantLock = this.f12737g;
        reentrantLock.lock();
        try {
            C7518b c7518b = this.f12735e.f12747c;
            if (c7518b == null) {
                return null;
            }
            return c7518b.m9700b();
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // java.util.concurrent.BlockingQueue
    public Object poll(long j10, TimeUnit timeUnit) throws InterruptedException {
        long nanos = timeUnit.toNanos(j10);
        AtomicInteger atomicInteger = this.f12734d;
        ReentrantLock reentrantLock = this.f12737g;
        reentrantLock.lockInterruptibly();
        while (atomicInteger.get() == 0) {
            try {
                if (nanos <= 0) {
                    reentrantLock.unlock();
                    return null;
                }
                nanos = this.f12738h.awaitNanos(nanos);
            } catch (Throwable th) {
                reentrantLock.unlock();
                throw th;
            }
        }
        Object objM9694f = m9694f(null);
        int andDecrement = atomicInteger.getAndDecrement();
        if (andDecrement > 1) {
            this.f12738h.signal();
        }
        reentrantLock.unlock();
        if (andDecrement == this.f12733c) {
            m9696k();
        }
        return objM9694f;
    }

    @Override // java.util.concurrent.BlockingQueue
    public void put(Object obj) throws InterruptedException {
        obj.getClass();
        C7518b c7518b = new C7518b(obj);
        ReentrantLock reentrantLock = this.f12739i;
        AtomicInteger atomicInteger = this.f12734d;
        reentrantLock.lockInterruptibly();
        while (atomicInteger.get() == this.f12733c) {
            try {
                this.f12740j.await();
            } catch (Throwable th) {
                reentrantLock.unlock();
                throw th;
            }
        }
        m9694f(c7518b);
        int andIncrement = atomicInteger.getAndIncrement();
        if (andIncrement + 1 < this.f12733c) {
            this.f12740j.signal();
        }
        reentrantLock.unlock();
        if (andIncrement == 0) {
            m9695g();
        }
    }

    @Override // java.util.concurrent.BlockingQueue
    public int remainingCapacity() {
        return this.f12733c - this.f12734d.get();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.concurrent.BlockingQueue
    public boolean remove(Object obj) {
        C7518b c7518b;
        if (obj == null) {
            return false;
        }
        m9692d();
        try {
            C7518b c7518b2 = this.f12735e;
            do {
                c7518b = c7518b2;
                c7518b2 = c7518b2.f12747c;
                if (c7518b2 == null) {
                    return false;
                }
            } while (!obj.equals(c7518b2.m9700b()));
            m9697m(c7518b2, c7518b);
            m9693e();
            return true;
        } finally {
            m9693e();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public int size() {
        return this.f12734d.get();
    }

    @Override // java.util.concurrent.BlockingQueue
    public Object take() throws InterruptedException {
        AtomicInteger atomicInteger = this.f12734d;
        ReentrantLock reentrantLock = this.f12737g;
        reentrantLock.lockInterruptibly();
        while (atomicInteger.get() == 0) {
            try {
                this.f12738h.await();
            } catch (Throwable th) {
                reentrantLock.unlock();
                throw th;
            }
        }
        Object objM9694f = m9694f(null);
        int andDecrement = atomicInteger.getAndDecrement();
        if (andDecrement > 1) {
            this.f12738h.signal();
        }
        reentrantLock.unlock();
        if (andDecrement == this.f12733c) {
            m9696k();
        }
        return objM9694f;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public Object[] toArray() {
        m9692d();
        try {
            Object[] objArr = new Object[this.f12734d.get()];
            C7518b c7518b = this.f12735e.f12747c;
            int i10 = 0;
            while (c7518b != null) {
                int i11 = i10 + 1;
                objArr[i10] = c7518b.m9700b();
                c7518b = c7518b.f12747c;
                i10 = i11;
            }
            return objArr;
        } finally {
            m9693e();
        }
    }

    public PriorityBlockingQueue(int i10) {
        this.f12734d = new AtomicInteger();
        ReentrantLock reentrantLock = new ReentrantLock();
        this.f12737g = reentrantLock;
        this.f12738h = reentrantLock.newCondition();
        ReentrantLock reentrantLock2 = new ReentrantLock();
        this.f12739i = reentrantLock2;
        this.f12740j = reentrantLock2.newCondition();
        if (i10 <= 0) {
            throw new IllegalArgumentException();
        }
        this.f12733c = i10;
        C7518b c7518b = new C7518b(null);
        this.f12735e = c7518b;
        this.f12736f = c7518b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.concurrent.BlockingQueue
    public int drainTo(Collection collection, int i10) {
        collection.getClass();
        if (collection == this) {
            throw new IllegalArgumentException();
        }
        boolean z10 = false;
        if (i10 <= 0) {
            return 0;
        }
        ReentrantLock reentrantLock = this.f12737g;
        reentrantLock.lock();
        try {
            int iMin = Math.min(i10, this.f12734d.get());
            C7518b c7518b = this.f12735e;
            int i11 = 0;
            while (i11 < iMin) {
                try {
                    C7518b c7518b2 = c7518b.f12747c;
                    collection.add(c7518b2.m9700b());
                    c7518b2.m9701c(null);
                    c7518b.f12747c = c7518b;
                    i11++;
                    c7518b = c7518b2;
                } catch (Throwable th) {
                    if (i11 > 0) {
                        this.f12735e = c7518b;
                        if (this.f12734d.getAndAdd(-i11) == this.f12733c) {
                        }
                    }
                    throw th;
                }
            }
            if (i11 > 0) {
                this.f12735e = c7518b;
                if (this.f12734d.getAndAdd(-i11) == this.f12733c) {
                    z10 = true;
                }
            }
            reentrantLock.unlock();
            if (z10) {
                m9696k();
            }
            return iMin;
        } catch (Throwable th2) {
            reentrantLock.unlock();
            if (0 != 0) {
                m9696k();
            }
            throw th2;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public Object[] toArray(Object[] objArr) {
        m9692d();
        try {
            int i10 = this.f12734d.get();
            if (objArr.length < i10) {
                objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i10);
            }
            C7518b c7518b = this.f12735e.f12747c;
            int i11 = 0;
            while (c7518b != null) {
                objArr[i11] = c7518b.m9700b();
                c7518b = c7518b.f12747c;
                i11++;
            }
            if (objArr.length > i11) {
                objArr[i11] = null;
            }
            m9693e();
            return objArr;
        } catch (Throwable th) {
            m9693e();
            throw th;
        }
    }

    @Override // java.util.Queue
    public Object poll() {
        int andDecrement;
        AtomicInteger atomicInteger = this.f12734d;
        Object objM9694f = null;
        if (atomicInteger.get() == 0) {
            return null;
        }
        ReentrantLock reentrantLock = this.f12737g;
        reentrantLock.lock();
        try {
            if (atomicInteger.get() > 0) {
                objM9694f = m9694f(null);
                andDecrement = atomicInteger.getAndDecrement();
                if (andDecrement > 1) {
                    this.f12738h.signal();
                }
            } else {
                andDecrement = -1;
            }
            reentrantLock.unlock();
            if (andDecrement == this.f12733c) {
                m9696k();
            }
            return objM9694f;
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    @Override // java.util.Queue, java.util.concurrent.BlockingQueue
    public boolean offer(Object obj) {
        int andIncrement;
        obj.getClass();
        AtomicInteger atomicInteger = this.f12734d;
        if (atomicInteger.get() == this.f12733c) {
            return false;
        }
        C7518b c7518b = new C7518b(obj);
        ReentrantLock reentrantLock = this.f12739i;
        reentrantLock.lock();
        try {
            if (atomicInteger.get() < this.f12733c) {
                m9694f(c7518b);
                andIncrement = atomicInteger.getAndIncrement();
                if (andIncrement + 1 < this.f12733c) {
                    this.f12740j.signal();
                }
            } else {
                andIncrement = -1;
            }
            if (andIncrement == 0) {
                m9695g();
            }
            return andIncrement >= 0;
        } finally {
            reentrantLock.unlock();
        }
    }
}
