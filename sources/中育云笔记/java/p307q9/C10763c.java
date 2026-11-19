package p307q9;

import kotlin.jvm.internal.AbstractC9979u;

/* renamed from: q9.c */
/* loaded from: classes5.dex */
public final class C10763c {

    /* renamed from: a */
    public final String f25952a;

    /* renamed from: b */
    public final int f25953b;

    public C10763c(String sourceFileName, int i10) {
        AbstractC9979u.m20294g(sourceFileName, "sourceFileName");
        this.f25952a = sourceFileName;
        this.f25953b = i10;
    }

    /* renamed from: a */
    public final String m22920a() {
        return this.f25952a;
    }

    /* renamed from: b */
    public final int m22921b() {
        return this.f25953b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10763c)) {
            return false;
        }
        C10763c c10763c = (C10763c) obj;
        return AbstractC9979u.m20289b(this.f25952a, c10763c.f25952a) && this.f25953b == c10763c.f25953b;
    }

    public int hashCode() {
        return (this.f25952a.hashCode() * 31) + Integer.hashCode(this.f25953b);
    }

    public String toString() {
        return "CommonSourceResult(sourceFileName=" + this.f25952a + ", sourceId=" + this.f25953b + ')';
    }
}
