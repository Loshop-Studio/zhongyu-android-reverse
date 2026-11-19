package com.google.gson;

import com.google.gson.internal.AbstractC3848e;
import com.google.gson.internal.LazilyParsedNumber;
import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Objects;

/* renamed from: com.google.gson.m */
/* loaded from: classes2.dex */
public final class C3866m extends AbstractC3863j {

    /* renamed from: a */
    public final Serializable f3058a;

    public C3866m(Boolean bool) {
        Objects.requireNonNull(bool);
        this.f3058a = bool;
    }

    /* renamed from: d */
    public static boolean m2816d(C3866m c3866m) {
        Serializable serializable = c3866m.f3058a;
        if (!(serializable instanceof Number)) {
            return false;
        }
        Number number = (Number) serializable;
        return (number instanceof BigInteger) || (number instanceof Long) || (number instanceof Integer) || (number instanceof Short) || (number instanceof Byte);
    }

    /* renamed from: a */
    public final BigInteger m2817a() {
        Serializable serializable = this.f3058a;
        if (serializable instanceof BigInteger) {
            return (BigInteger) serializable;
        }
        if (m2816d(this)) {
            return BigInteger.valueOf(m2818b().longValue());
        }
        String strM2819c = m2819c();
        AbstractC3848e.m2803d(strM2819c);
        return new BigInteger(strM2819c);
    }

    /* renamed from: b */
    public final Number m2818b() {
        Serializable serializable = this.f3058a;
        if (serializable instanceof Number) {
            return (Number) serializable;
        }
        if (serializable instanceof String) {
            return new LazilyParsedNumber((String) serializable);
        }
        throw new UnsupportedOperationException("Primitive is neither a number nor a string");
    }

    /* renamed from: c */
    public final String m2819c() {
        Serializable serializable = this.f3058a;
        if (serializable instanceof String) {
            return (String) serializable;
        }
        if (serializable instanceof Number) {
            return m2818b().toString();
        }
        if (serializable instanceof Boolean) {
            return ((Boolean) serializable).toString();
        }
        throw new AssertionError("Unexpected value type: " + serializable.getClass());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C3866m.class != obj.getClass()) {
            return false;
        }
        C3866m c3866m = (C3866m) obj;
        Serializable serializable = c3866m.f3058a;
        Serializable serializable2 = this.f3058a;
        if (serializable2 == null) {
            return serializable == null;
        }
        if (m2816d(this) && m2816d(c3866m)) {
            return ((serializable2 instanceof BigInteger) || (serializable instanceof BigInteger)) ? m2817a().equals(c3866m.m2817a()) : m2818b().longValue() == c3866m.m2818b().longValue();
        }
        if (!(serializable2 instanceof Number) || !(serializable instanceof Number)) {
            return serializable2.equals(serializable);
        }
        if ((serializable2 instanceof BigDecimal) && (serializable instanceof BigDecimal)) {
            return (serializable2 instanceof BigDecimal ? (BigDecimal) serializable2 : AbstractC3848e.m2808i(m2819c())).compareTo(serializable instanceof BigDecimal ? (BigDecimal) serializable : AbstractC3848e.m2808i(c3866m.m2819c())) == 0;
        }
        double dDoubleValue = serializable2 instanceof Number ? m2818b().doubleValue() : Double.parseDouble(m2819c());
        double dDoubleValue2 = serializable instanceof Number ? c3866m.m2818b().doubleValue() : Double.parseDouble(c3866m.m2819c());
        if (dDoubleValue != dDoubleValue2) {
            return Double.isNaN(dDoubleValue) && Double.isNaN(dDoubleValue2);
        }
        return true;
    }

    public final int hashCode() {
        long jDoubleToLongBits;
        Serializable serializable = this.f3058a;
        if (serializable == null) {
            return 31;
        }
        if (m2816d(this)) {
            jDoubleToLongBits = m2818b().longValue();
        } else {
            if (!(serializable instanceof Number)) {
                return serializable.hashCode();
            }
            jDoubleToLongBits = Double.doubleToLongBits(m2818b().doubleValue());
        }
        return (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
    }

    public C3866m(Number number) {
        Objects.requireNonNull(number);
        this.f3058a = number;
    }

    public C3866m(String str) {
        Objects.requireNonNull(str);
        this.f3058a = str;
    }
}
