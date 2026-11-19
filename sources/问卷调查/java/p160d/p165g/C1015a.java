package p160d.p165g;

import java.util.Iterator;
import p070b.p113c.p114a.C0787a;

/* JADX WARN: Unexpected interfaces in signature: [java.lang.Object] */
/* renamed from: d.g.a */
/* loaded from: classes.dex */
public class C1015a implements Iterable<Integer> {

    /* renamed from: b */
    public final int f5485b;

    /* renamed from: c */
    public final int f5486c;

    /* renamed from: d */
    public final int f5487d;

    public C1015a(int i, int i2, int i3) {
        if (i3 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        }
        if (i3 == Integer.MIN_VALUE) {
            throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
        this.f5485b = i;
        if (i3 > 0) {
            if (i < i2) {
                i2 -= C0787a.m2490x(C0787a.m2490x(i2, i3) - C0787a.m2490x(i, i3), i3);
            }
        } else {
            if (i3 >= 0) {
                throw new IllegalArgumentException("Step is zero.");
            }
            if (i > i2) {
                int i4 = -i3;
                i2 += C0787a.m2490x(C0787a.m2490x(i, i4) - C0787a.m2490x(i2, i4), i4);
            }
        }
        this.f5486c = i2;
        this.f5487d = i3;
    }

    public boolean equals(Object obj) {
        if (obj instanceof C1015a) {
            if (!isEmpty() || !((C1015a) obj).isEmpty()) {
                C1015a c1015a = (C1015a) obj;
                if (this.f5485b != c1015a.f5485b || this.f5486c != c1015a.f5486c || this.f5487d != c1015a.f5487d) {
                }
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (((this.f5485b * 31) + this.f5486c) * 31) + this.f5487d;
    }

    public boolean isEmpty() {
        if (this.f5487d > 0) {
            if (this.f5485b > this.f5486c) {
                return true;
            }
        } else if (this.f5485b < this.f5486c) {
            return true;
        }
        return false;
    }

    @Override // java.lang.Iterable
    public Iterator<Integer> iterator() {
        return new C1016b(this.f5485b, this.f5486c, this.f5487d);
    }

    public String toString() {
        StringBuilder sb;
        int i;
        if (this.f5487d > 0) {
            sb = new StringBuilder();
            sb.append(this.f5485b);
            sb.append("..");
            sb.append(this.f5486c);
            sb.append(" step ");
            i = this.f5487d;
        } else {
            sb = new StringBuilder();
            sb.append(this.f5485b);
            sb.append(" downTo ");
            sb.append(this.f5486c);
            sb.append(" step ");
            i = -this.f5487d;
        }
        sb.append(i);
        return sb.toString();
    }
}
