package io.reactivex.internal.queue;

import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReferenceArray;
import p008a7.InterfaceC0044c;
import p088e7.AbstractC8372e;

/* loaded from: classes5.dex */
public final class SpscArrayQueue<E> extends AtomicReferenceArray<E> implements InterfaceC0044c {

    /* renamed from: f */
    public static final Integer f17092f = Integer.getInteger("jctools.spsc.max.lookahead.step", 4096);

    /* renamed from: a */
    public final int f17093a;

    /* renamed from: b */
    public final AtomicLong f17094b;

    /* renamed from: c */
    public long f17095c;

    /* renamed from: d */
    public final AtomicLong f17096d;

    /* renamed from: e */
    public final int f17097e;

    public SpscArrayQueue(int i10) {
        super(AbstractC8372e.m13669a(i10));
        this.f17093a = length() - 1;
        this.f17094b = new AtomicLong();
        this.f17096d = new AtomicLong();
        this.f17097e = Math.min(i10 / 4, f17092f.intValue());
    }

    /* renamed from: b */
    public int m15555b(long j10) {
        return ((int) j10) & this.f17093a;
    }

    /* renamed from: c */
    public int m15556c(long j10, int i10) {
        return ((int) j10) & i10;
    }

    @Override // p008a7.InterfaceC0044c
    public void clear() {
        while (true) {
            if (poll() == null && isEmpty()) {
                return;
            }
        }
    }

    /* renamed from: d */
    public Object m15557d(int i10) {
        return get(i10);
    }

    /* renamed from: e */
    public void m15558e(long j10) {
        this.f17096d.lazySet(j10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: g */
    public void m15559g(int i10, Object obj) {
        lazySet(i10, obj);
    }

    /* renamed from: h */
    public void m15560h(long j10) {
        this.f17094b.lazySet(j10);
    }

    @Override // p008a7.InterfaceC0044c
    public boolean isEmpty() {
        return this.f17094b.get() == this.f17096d.get();
    }

    @Override // p008a7.InterfaceC0044c
    public boolean offer(Object obj) {
        if (obj == null) {
            throw new NullPointerException("Null is not a valid element");
        }
        int i10 = this.f17093a;
        long j10 = this.f17094b.get();
        int iM15556c = m15556c(j10, i10);
        if (j10 >= this.f17095c) {
            long j11 = this.f17097e + j10;
            if (m15557d(m15556c(j11, i10)) == null) {
                this.f17095c = j11;
            } else if (m15557d(iM15556c) != null) {
                return false;
            }
        }
        m15559g(iM15556c, obj);
        m15560h(j10 + 1);
        return true;
    }

    @Override // p008a7.InterfaceC0044c
    public Object poll() {
        long j10 = this.f17096d.get();
        int iM15555b = m15555b(j10);
        Object objM15557d = m15557d(iM15555b);
        if (objM15557d == null) {
            return null;
        }
        m15558e(j10 + 1);
        m15559g(iM15555b, null);
        return objM15557d;
    }
}
