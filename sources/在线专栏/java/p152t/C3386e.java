package p152t;

import android.graphics.Insets;
import android.graphics.Rect;

/* renamed from: t.e */
/* loaded from: classes.dex */
public final class C3386e {

    /* renamed from: e */
    public static final C3386e f11899e = new C3386e(0, 0, 0, 0);

    /* renamed from: a */
    public final int f11900a;

    /* renamed from: b */
    public final int f11901b;

    /* renamed from: c */
    public final int f11902c;

    /* renamed from: d */
    public final int f11903d;

    private C3386e(int i4, int i5, int i6, int i7) {
        this.f11900a = i4;
        this.f11901b = i5;
        this.f11902c = i6;
        this.f11903d = i7;
    }

    /* renamed from: a */
    public static C3386e m10304a(C3386e c3386e, C3386e c3386e2) {
        return m10305b(Math.max(c3386e.f11900a, c3386e2.f11900a), Math.max(c3386e.f11901b, c3386e2.f11901b), Math.max(c3386e.f11902c, c3386e2.f11902c), Math.max(c3386e.f11903d, c3386e2.f11903d));
    }

    /* renamed from: b */
    public static C3386e m10305b(int i4, int i5, int i6, int i7) {
        return (i4 == 0 && i5 == 0 && i6 == 0 && i7 == 0) ? f11899e : new C3386e(i4, i5, i6, i7);
    }

    /* renamed from: c */
    public static C3386e m10306c(Rect rect) {
        return m10305b(rect.left, rect.top, rect.right, rect.bottom);
    }

    /* renamed from: d */
    public static C3386e m10307d(Insets insets) {
        return m10305b(insets.left, insets.top, insets.right, insets.bottom);
    }

    /* renamed from: e */
    public Insets m10308e() {
        return Insets.of(this.f11900a, this.f11901b, this.f11902c, this.f11903d);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C3386e.class != obj.getClass()) {
            return false;
        }
        C3386e c3386e = (C3386e) obj;
        return this.f11903d == c3386e.f11903d && this.f11900a == c3386e.f11900a && this.f11902c == c3386e.f11902c && this.f11901b == c3386e.f11901b;
    }

    public int hashCode() {
        return (((((this.f11900a * 31) + this.f11901b) * 31) + this.f11902c) * 31) + this.f11903d;
    }

    public String toString() {
        return "Insets{left=" + this.f11900a + ", top=" + this.f11901b + ", right=" + this.f11902c + ", bottom=" + this.f11903d + '}';
    }
}
