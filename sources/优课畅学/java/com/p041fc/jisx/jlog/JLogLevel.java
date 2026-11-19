package com.p041fc.jisx.jlog;

/* loaded from: classes3.dex */
public enum JLogLevel {
    VERBOSE("FINE", 2),
    DEBUG("CONFIG", 3),
    INFO("INFO", 4),
    WARN("WARNING", 5),
    ERROR("SEVERE", 6);


    /* renamed from: a */
    public String f3691a;

    /* renamed from: b */
    public int f3692b;

    JLogLevel(String str, int i10) {
        this.f3691a = str;
        this.f3692b = i10;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.f3691a;
    }
}
