package p077d8;

import kotlin.jvm.internal.AbstractC9126n;
import p134i7.AbstractC8792m0;
import p223q7.AbstractC9844c;
import p311y7.InterfaceC10668a;

/* renamed from: d8.d */
/* loaded from: classes5.dex */
public class C8319d implements Iterable, InterfaceC10668a {

    /* renamed from: d */
    public static final a f15776d = new a(null);

    /* renamed from: a */
    public final int f15777a;

    /* renamed from: b */
    public final int f15778b;

    /* renamed from: c */
    public final int f15779c;

    /* renamed from: d8.d$a */
    public static final class a {
        public /* synthetic */ a(AbstractC9126n abstractC9126n) {
            this();
        }

        /* renamed from: a */
        public final C8319d m13500a(int i10, int i11, int i12) {
            return new C8319d(i10, i11, i12);
        }

        public a() {
        }
    }

    public C8319d(int i10, int i11, int i12) {
        if (i12 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        }
        if (i12 == Integer.MIN_VALUE) {
            throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
        this.f15777a = i10;
        this.f15778b = AbstractC9844c.m18367b(i10, i11, i12);
        this.f15779c = i12;
    }

    /* renamed from: b */
    public final int m13496b() {
        return this.f15777a;
    }

    /* renamed from: c */
    public final int m13497c() {
        return this.f15778b;
    }

    /* renamed from: d */
    public final int m13498d() {
        return this.f15779c;
    }

    @Override // java.lang.Iterable
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public AbstractC8792m0 iterator() {
        return new C8320e(this.f15777a, this.f15778b, this.f15779c);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C8319d)) {
            return false;
        }
        if (isEmpty() && ((C8319d) obj).isEmpty()) {
            return true;
        }
        C8319d c8319d = (C8319d) obj;
        return this.f15777a == c8319d.f15777a && this.f15778b == c8319d.f15778b && this.f15779c == c8319d.f15779c;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (((this.f15777a * 31) + this.f15778b) * 31) + this.f15779c;
    }

    public boolean isEmpty() {
        return this.f15779c > 0 ? this.f15777a > this.f15778b : this.f15777a < this.f15778b;
    }

    public String toString() {
        StringBuilder sb;
        int i10;
        if (this.f15779c > 0) {
            sb = new StringBuilder();
            sb.append(this.f15777a);
            sb.append("..");
            sb.append(this.f15778b);
            sb.append(" step ");
            i10 = this.f15779c;
        } else {
            sb = new StringBuilder();
            sb.append(this.f15777a);
            sb.append(" downTo ");
            sb.append(this.f15778b);
            sb.append(" step ");
            i10 = -this.f15779c;
        }
        sb.append(i10);
        return sb.toString();
    }
}
