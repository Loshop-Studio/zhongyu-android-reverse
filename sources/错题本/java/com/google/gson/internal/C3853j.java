package com.google.gson.internal;

import java.util.Map;

/* renamed from: com.google.gson.internal.j */
/* loaded from: classes2.dex */
public final class C3853j implements Map.Entry {

    /* renamed from: a */
    public C3853j f3039a;

    /* renamed from: b */
    public C3853j f3040b;

    /* renamed from: c */
    public C3853j f3041c;

    /* renamed from: d */
    public C3853j f3042d;

    /* renamed from: e */
    public C3853j f3043e;

    /* renamed from: f */
    public final Object f3044f;

    /* renamed from: g */
    public final boolean f3045g;

    /* renamed from: h */
    public Object f3046h;

    /* renamed from: i */
    public int f3047i;

    public C3853j(boolean z8) {
        this.f3044f = null;
        this.f3045g = z8;
        this.f3043e = this;
        this.f3042d = this;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object obj2 = this.f3044f;
            if (obj2 != null ? obj2.equals(entry.getKey()) : entry.getKey() == null) {
                Object obj3 = this.f3046h;
                if (obj3 == null) {
                    if (entry.getValue() == null) {
                        return true;
                    }
                } else if (obj3.equals(entry.getValue())) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f3044f;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f3046h;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Object obj = this.f3044f;
        int iHashCode = obj == null ? 0 : obj.hashCode();
        Object obj2 = this.f3046h;
        return (obj2 != null ? obj2.hashCode() : 0) ^ iHashCode;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        if (obj == null && !this.f3045g) {
            throw new NullPointerException("value == null");
        }
        Object obj2 = this.f3046h;
        this.f3046h = obj;
        return obj2;
    }

    public final String toString() {
        return this.f3044f + "=" + this.f3046h;
    }

    public C3853j(boolean z8, C3853j c3853j, Object obj, C3853j c3853j2, C3853j c3853j3) {
        this.f3039a = c3853j;
        this.f3044f = obj;
        this.f3045g = z8;
        this.f3047i = 1;
        this.f3042d = c3853j2;
        this.f3043e = c3853j3;
        c3853j3.f3042d = this;
        c3853j2.f3043e = this;
    }
}
