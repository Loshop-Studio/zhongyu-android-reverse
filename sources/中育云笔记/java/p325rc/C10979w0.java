package p325rc;

import java.util.Arrays;
import java.util.Iterator;
import java.util.RandomAccess;
import kotlin.jvm.internal.AbstractC9979u;
import p265nd.AbstractC10410o;

/* renamed from: rc.w0 */
/* loaded from: classes6.dex */
public final class C10979w0 extends AbstractC10940d implements RandomAccess {

    /* renamed from: c */
    public final Object[] f26484c;

    /* renamed from: d */
    public final int f26485d;

    /* renamed from: e */
    public int f26486e;

    /* renamed from: f */
    public int f26487f;

    /* renamed from: rc.w0$a */
    public static final class a extends AbstractC10938c {

        /* renamed from: e */
        public int f26488e;

        /* renamed from: f */
        public int f26489f;

        public a() {
            this.f26488e = C10979w0.this.size();
            this.f26489f = C10979w0.this.f26486e;
        }

        @Override // p325rc.AbstractC10938c
        /* renamed from: a */
        public void mo2912a() {
            if (this.f26488e == 0) {
                m23874b();
                return;
            }
            m23875c(C10979w0.this.f26484c[this.f26489f]);
            this.f26489f = (this.f26489f + 1) % C10979w0.this.f26485d;
            this.f26488e--;
        }
    }

    public C10979w0(Object[] buffer, int i10) {
        AbstractC9979u.m20294g(buffer, "buffer");
        this.f26484c = buffer;
        if (i10 < 0) {
            throw new IllegalArgumentException(("ring buffer filled size should not be negative but it is " + i10).toString());
        }
        if (i10 <= buffer.length) {
            this.f26485d = buffer.length;
            this.f26487f = i10;
            return;
        }
        throw new IllegalArgumentException(("ring buffer filled size: " + i10 + " cannot be larger than the buffer size: " + buffer.length).toString());
    }

    /* renamed from: g */
    public final void m24149g(Object obj) {
        if (m24151m()) {
            throw new IllegalStateException("ring buffer is full");
        }
        this.f26484c[(this.f26486e + size()) % this.f26485d] = obj;
        this.f26487f = size() + 1;
    }

    @Override // p325rc.AbstractC10940d, java.util.List
    public Object get(int i10) {
        AbstractC10940d.Companion.m23886b(i10, size());
        return this.f26484c[(this.f26486e + i10) % this.f26485d];
    }

    @Override // p325rc.AbstractC10940d, p325rc.AbstractC10936b
    public int getSize() {
        return this.f26487f;
    }

    @Override // p325rc.AbstractC10940d, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator iterator() {
        return new a();
    }

    /* renamed from: k */
    public final C10979w0 m24150k(int i10) {
        Object[] array;
        int i11 = this.f26485d;
        int iM21756i = AbstractC10410o.m21756i(i11 + (i11 >> 1) + 1, i10);
        if (this.f26486e == 0) {
            array = Arrays.copyOf(this.f26484c, iM21756i);
            AbstractC9979u.m20293f(array, "copyOf(...)");
        } else {
            array = toArray(new Object[iM21756i]);
        }
        return new C10979w0(array, size());
    }

    /* renamed from: m */
    public final boolean m24151m() {
        return size() == this.f26485d;
    }

    /* renamed from: n */
    public final void m24152n(int i10) {
        if (i10 < 0) {
            throw new IllegalArgumentException(("n shouldn't be negative but it is " + i10).toString());
        }
        if (i10 > size()) {
            throw new IllegalArgumentException(("n shouldn't be greater than the buffer size: n = " + i10 + ", size = " + size()).toString());
        }
        if (i10 > 0) {
            int i11 = this.f26486e;
            int i12 = (i11 + i10) % this.f26485d;
            if (i11 > i12) {
                AbstractC10964p.m23987B(this.f26484c, null, i11, this.f26485d);
                AbstractC10964p.m23987B(this.f26484c, null, 0, i12);
            } else {
                AbstractC10964p.m23987B(this.f26484c, null, i11, i12);
            }
            this.f26486e = i12;
            this.f26487f = size() - i10;
        }
    }

    @Override // p325rc.AbstractC10936b, java.util.Collection
    public Object[] toArray(Object[] array) {
        AbstractC9979u.m20294g(array, "array");
        if (array.length < size()) {
            array = Arrays.copyOf(array, size());
            AbstractC9979u.m20293f(array, "copyOf(...)");
        }
        int size = size();
        int i10 = 0;
        int i11 = 0;
        for (int i12 = this.f26486e; i11 < size && i12 < this.f26485d; i12++) {
            array[i11] = this.f26484c[i12];
            i11++;
        }
        while (i11 < size) {
            array[i11] = this.f26484c[i10];
            i11++;
            i10++;
        }
        return AbstractC10976v.m24127f(size, array);
    }

    public C10979w0(int i10) {
        this(new Object[i10], 0);
    }

    @Override // p325rc.AbstractC10936b, java.util.Collection
    public Object[] toArray() {
        return toArray(new Object[size()]);
    }
}
