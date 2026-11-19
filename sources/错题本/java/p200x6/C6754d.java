package p200x6;

import p160s6.InterfaceC6560a;
import p185v7.AbstractC6683l;

/* renamed from: x6.d */
/* loaded from: classes2.dex */
public class C6754d implements Iterable, InterfaceC6560a {

    /* renamed from: a */
    public final int f11420a;

    /* renamed from: b */
    public final int f11421b;

    /* renamed from: c */
    public final int f11422c;

    public C6754d(int i, int i8, int i9) {
        if (i9 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        }
        if (i9 == Integer.MIN_VALUE) {
            throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
        this.f11420a = i;
        this.f11421b = AbstractC6683l.m6373m(i, i8, i9);
        this.f11422c = i9;
    }

    @Override // java.lang.Iterable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C6755e iterator() {
        return new C6755e(this.f11420a, this.f11421b, this.f11422c);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C6754d)) {
            return false;
        }
        if (isEmpty() && ((C6754d) obj).isEmpty()) {
            return true;
        }
        C6754d c6754d = (C6754d) obj;
        return this.f11420a == c6754d.f11420a && this.f11421b == c6754d.f11421b && this.f11422c == c6754d.f11422c;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (((this.f11420a * 31) + this.f11421b) * 31) + this.f11422c;
    }

    public boolean isEmpty() {
        int i = this.f11422c;
        int i8 = this.f11421b;
        int i9 = this.f11420a;
        return i > 0 ? i9 > i8 : i9 < i8;
    }

    public String toString() {
        StringBuilder sb;
        int i = this.f11421b;
        int i8 = this.f11420a;
        int i9 = this.f11422c;
        if (i9 > 0) {
            sb = new StringBuilder();
            sb.append(i8);
            sb.append("..");
            sb.append(i);
            sb.append(" step ");
            sb.append(i9);
        } else {
            sb = new StringBuilder();
            sb.append(i8);
            sb.append(" downTo ");
            sb.append(i);
            sb.append(" step ");
            sb.append(-i9);
        }
        return sb.toString();
    }
}
