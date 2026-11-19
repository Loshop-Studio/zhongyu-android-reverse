package com.tendcloud.tenddata;

import java.lang.reflect.Method;

/* renamed from: com.tendcloud.tenddata.ct */
/* loaded from: classes5.dex */
final class C7915ct {

    /* renamed from: a */
    private final Object f14633a;

    /* renamed from: b */
    private final Method f14634b;

    /* renamed from: c */
    private final int f14635c;

    /* renamed from: d */
    private boolean f14636d = true;

    public C7915ct(Object obj, Method method) throws SecurityException {
        if (obj == null) {
            throw new NullPointerException("EventHandler target cannot be null.");
        }
        if (method == null) {
            throw new NullPointerException("EventHandler method cannot be null.");
        }
        this.f14633a = obj;
        this.f14634b = method;
        method.setAccessible(true);
        this.f14635c = ((method.hashCode() + 31) * 31) + obj.hashCode();
    }

    /* renamed from: a */
    public boolean m11634a() {
        return this.f14636d;
    }

    /* renamed from: b */
    public void m11635b() {
        this.f14636d = false;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (C7915ct.class != obj.getClass()) {
            return false;
        }
        C7915ct c7915ct = (C7915ct) obj;
        if (this.f14634b.equals(c7915ct.f14634b)) {
            if (this.f14633a == c7915ct.f14633a) {
                return true;
            }
        }
        return false;
    }

    public void handleEvent(Object obj) {
        if (!this.f14636d) {
            C7896ca.eForInternal(toString() + " has been invalidated and can no longer handle events.");
        }
        try {
            this.f14634b.invoke(this.f14633a, obj);
        } catch (Throwable unused) {
        }
    }

    public int hashCode() {
        return this.f14635c;
    }

    public String toString() {
        return "[EventHandler " + this.f14634b + "]";
    }
}
