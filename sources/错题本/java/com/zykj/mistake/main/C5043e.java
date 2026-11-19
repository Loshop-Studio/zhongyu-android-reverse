package com.zykj.mistake.main;

import androidx.collection.AbstractC0584a;
import kotlin.jvm.internal.AbstractC5830k;

/* renamed from: com.zykj.mistake.main.e */
/* loaded from: classes3.dex */
public final class C5043e {

    /* renamed from: a */
    public final long f7904a;

    /* renamed from: b */
    public final String f7905b;

    /* renamed from: c */
    public final int f7906c;

    public C5043e(long j7, int i, String str) {
        this.f7904a = j7;
        this.f7905b = str;
        this.f7906c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5043e)) {
            return false;
        }
        C5043e c5043e = (C5043e) obj;
        return this.f7904a == c5043e.f7904a && AbstractC5830k.m5325b(this.f7905b, c5043e.f7905b) && this.f7906c == c5043e.f7906c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f7906c) + AbstractC0584a.m903d(Long.hashCode(this.f7904a) * 31, 31, this.f7905b);
    }

    public final String toString() {
        return "HomeAccountSession(userId=" + this.f7904a + ", studentName=" + this.f7905b + ", version=" + this.f7906c + ")";
    }
}
