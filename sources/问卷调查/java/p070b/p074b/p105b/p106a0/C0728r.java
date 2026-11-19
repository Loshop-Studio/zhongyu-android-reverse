package p070b.p074b.p105b.p106a0;

import java.math.BigDecimal;

/* renamed from: b.b.b.a0.r */
/* loaded from: classes.dex */
public final class C0728r extends Number {

    /* renamed from: b */
    public final String f4234b;

    public C0728r(String str) {
        this.f4234b = str;
    }

    @Override // java.lang.Number
    public double doubleValue() {
        return Double.parseDouble(this.f4234b);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0728r)) {
            return false;
        }
        String str = this.f4234b;
        String str2 = ((C0728r) obj).f4234b;
        return str == str2 || str.equals(str2);
    }

    @Override // java.lang.Number
    public float floatValue() {
        return Float.parseFloat(this.f4234b);
    }

    public int hashCode() {
        return this.f4234b.hashCode();
    }

    @Override // java.lang.Number
    public int intValue() {
        try {
            try {
                return Integer.parseInt(this.f4234b);
            } catch (NumberFormatException unused) {
                return (int) Long.parseLong(this.f4234b);
            }
        } catch (NumberFormatException unused2) {
            return new BigDecimal(this.f4234b).intValue();
        }
    }

    @Override // java.lang.Number
    public long longValue() {
        try {
            return Long.parseLong(this.f4234b);
        } catch (NumberFormatException unused) {
            return new BigDecimal(this.f4234b).longValue();
        }
    }

    public String toString() {
        return this.f4234b;
    }
}
