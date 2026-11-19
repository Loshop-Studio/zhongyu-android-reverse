package p070b.p074b.p105b;

import java.math.BigInteger;
import java.util.Objects;
import p070b.p074b.p105b.p106a0.C0728r;

/* renamed from: b.b.b.s */
/* loaded from: classes.dex */
public final class C0778s extends AbstractC0773n {

    /* renamed from: a */
    public final Object f4444a;

    public C0778s(Boolean bool) {
        Objects.requireNonNull(bool);
        this.f4444a = bool;
    }

    /* renamed from: e */
    public static boolean m2456e(C0778s c0778s) {
        Object obj = c0778s.f4444a;
        if (obj instanceof Number) {
            Number number = (Number) obj;
            if ((number instanceof BigInteger) || (number instanceof Long) || (number instanceof Integer) || (number instanceof Short) || (number instanceof Byte)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    public boolean m2457b() {
        Object obj = this.f4444a;
        return obj instanceof Boolean ? ((Boolean) obj).booleanValue() : Boolean.parseBoolean(m2459d());
    }

    /* renamed from: c */
    public Number m2458c() {
        Object obj = this.f4444a;
        return obj instanceof String ? new C0728r((String) this.f4444a) : (Number) obj;
    }

    /* renamed from: d */
    public String m2459d() {
        Object obj = this.f4444a;
        return obj instanceof Number ? m2458c().toString() : obj instanceof Boolean ? ((Boolean) obj).toString() : (String) obj;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0778s.class != obj.getClass()) {
            return false;
        }
        C0778s c0778s = (C0778s) obj;
        if (this.f4444a == null) {
            return c0778s.f4444a == null;
        }
        if (m2456e(this) && m2456e(c0778s)) {
            return m2458c().longValue() == c0778s.m2458c().longValue();
        }
        Object obj2 = this.f4444a;
        if (!(obj2 instanceof Number) || !(c0778s.f4444a instanceof Number)) {
            return obj2.equals(c0778s.f4444a);
        }
        double dDoubleValue = m2458c().doubleValue();
        double dDoubleValue2 = c0778s.m2458c().doubleValue();
        if (dDoubleValue != dDoubleValue2) {
            return Double.isNaN(dDoubleValue) && Double.isNaN(dDoubleValue2);
        }
        return true;
    }

    public int hashCode() {
        long jDoubleToLongBits;
        if (this.f4444a == null) {
            return 31;
        }
        if (m2456e(this)) {
            jDoubleToLongBits = m2458c().longValue();
        } else {
            Object obj = this.f4444a;
            if (!(obj instanceof Number)) {
                return obj.hashCode();
            }
            jDoubleToLongBits = Double.doubleToLongBits(m2458c().doubleValue());
        }
        return (int) ((jDoubleToLongBits >>> 32) ^ jDoubleToLongBits);
    }

    public C0778s(Number number) {
        Objects.requireNonNull(number);
        this.f4444a = number;
    }

    public C0778s(String str) {
        Objects.requireNonNull(str);
        this.f4444a = str;
    }
}
