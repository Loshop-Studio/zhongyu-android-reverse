package p134i7;

import java.util.Arrays;
import java.util.Iterator;
import java.util.RandomAccess;
import kotlin.jvm.internal.AbstractC9133u;
import p077d8.AbstractC8323h;

/* renamed from: i7.u0 */
/* loaded from: classes5.dex */
public final class C8808u0 extends AbstractC8773d implements RandomAccess {

    /* renamed from: a */
    public final Object[] f16487a;

    /* renamed from: b */
    public final int f16488b;

    /* renamed from: c */
    public int f16489c;

    /* renamed from: d */
    public int f16490d;

    /* renamed from: i7.u0$a */
    public static final class a extends AbstractC8771c {

        /* renamed from: c */
        public int f16491c;

        /* renamed from: d */
        public int f16492d;

        public a() {
            this.f16491c = C8808u0.this.size();
            this.f16492d = C8808u0.this.f16489c;
        }

        @Override // p134i7.AbstractC8771c
        /* renamed from: a */
        public void mo14506a() {
            if (this.f16491c == 0) {
                m14507b();
                return;
            }
            m14508c(C8808u0.this.f16487a[this.f16492d]);
            this.f16492d = (this.f16492d + 1) % C8808u0.this.f16488b;
            this.f16491c--;
        }
    }

    public C8808u0(Object[] buffer, int i10) {
        AbstractC9133u.m16133g(buffer, "buffer");
        this.f16487a = buffer;
        if (i10 < 0) {
            throw new IllegalArgumentException(("ring buffer filled size should not be negative but it is " + i10).toString());
        }
        if (i10 <= buffer.length) {
            this.f16488b = buffer.length;
            this.f16490d = i10;
            return;
        }
        throw new IllegalArgumentException(("ring buffer filled size: " + i10 + " cannot be larger than the buffer size: " + buffer.length).toString());
    }

    /* renamed from: g */
    public final void m14760g(Object obj) {
        if (m14762i()) {
            throw new IllegalStateException("ring buffer is full");
        }
        this.f16487a[(this.f16489c + size()) % this.f16488b] = obj;
        this.f16490d = size() + 1;
    }

    @Override // p134i7.AbstractC8773d, java.util.List
    public Object get(int i10) {
        AbstractC8773d.Companion.m14512b(i10, size());
        return this.f16487a[(this.f16489c + i10) % this.f16488b];
    }

    @Override // p134i7.AbstractC8773d, p134i7.AbstractC8769b
    public int getSize() {
        return this.f16490d;
    }

    /* renamed from: h */
    public final C8808u0 m14761h(int i10) {
        Object[] array;
        int i11 = this.f16488b;
        int iM13513h = AbstractC8323h.m13513h(i11 + (i11 >> 1) + 1, i10);
        if (this.f16489c == 0) {
            array = Arrays.copyOf(this.f16487a, iM13513h);
            AbstractC9133u.m16132f(array, "copyOf(...)");
        } else {
            array = toArray(new Object[iM13513h]);
        }
        return new C8808u0(array, size());
    }

    /* renamed from: i */
    public final boolean m14762i() {
        return size() == this.f16488b;
    }

    @Override // p134i7.AbstractC8773d, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator iterator() {
        return new a();
    }

    /* renamed from: j */
    public final void m14763j(int i10) {
        if (i10 < 0) {
            throw new IllegalArgumentException(("n shouldn't be negative but it is " + i10).toString());
        }
        if (i10 > size()) {
            throw new IllegalArgumentException(("n shouldn't be greater than the buffer size: n = " + i10 + ", size = " + size()).toString());
        }
        if (i10 > 0) {
            int i11 = this.f16489c;
            int i12 = (i11 + i10) % this.f16488b;
            if (i11 > i12) {
                AbstractC8797p.m14613C(this.f16487a, null, i11, this.f16488b);
                AbstractC8797p.m14613C(this.f16487a, null, 0, i12);
            } else {
                AbstractC8797p.m14613C(this.f16487a, null, i11, i12);
            }
            this.f16489c = i12;
            this.f16490d = size() - i10;
        }
    }

    @Override // p134i7.AbstractC8769b, java.util.Collection
    public Object[] toArray(Object[] array) {
        AbstractC9133u.m16133g(array, "array");
        if (array.length < size()) {
            array = Arrays.copyOf(array, size());
            AbstractC9133u.m16132f(array, "copyOf(...)");
        }
        int size = size();
        int i10 = 0;
        int i11 = 0;
        for (int i12 = this.f16489c; i11 < size && i12 < this.f16488b; i12++) {
            array[i11] = this.f16487a[i12];
            i11++;
        }
        while (i11 < size) {
            array[i11] = this.f16487a[i10];
            i11++;
            i10++;
        }
        return AbstractC8807u.m14756f(size, array);
    }

    public C8808u0(int i10) {
        this(new Object[i10], 0);
    }

    @Override // p134i7.AbstractC8769b, java.util.Collection
    public Object[] toArray() {
        return toArray(new Object[size()]);
    }
}
