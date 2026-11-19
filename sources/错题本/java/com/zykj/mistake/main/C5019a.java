package com.zykj.mistake.main;

import androidx.collection.AbstractC0584a;
import androidx.compose.material3.AbstractC1923c;
import kotlin.jvm.internal.AbstractC5830k;

/* renamed from: com.zykj.mistake.main.a */
/* loaded from: classes3.dex */
public final class C5019a {

    /* renamed from: a */
    public final long f7823a;

    /* renamed from: b */
    public final String f7824b;

    /* renamed from: c */
    public final String f7825c;

    /* renamed from: d */
    public final String f7826d;

    /* renamed from: e */
    public final boolean f7827e;

    public /* synthetic */ C5019a(long j7, String str, String str2, int i) {
        this((i & 1) != 0 ? 0L : j7, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? "" : str2, "", false);
    }

    /* renamed from: a */
    public static C5019a m4359a(C5019a c5019a, String str, String str2, boolean z8, int i) {
        long j7 = c5019a.f7823a;
        String originalName = c5019a.f7824b;
        if ((i & 4) != 0) {
            str = c5019a.f7825c;
        }
        String name = str;
        if ((i & 8) != 0) {
            str2 = c5019a.f7826d;
        }
        String error = str2;
        if ((i & 16) != 0) {
            z8 = c5019a.f7827e;
        }
        c5019a.getClass();
        AbstractC5830k.m5330g(originalName, "originalName");
        AbstractC5830k.m5330g(name, "name");
        AbstractC5830k.m5330g(error, "error");
        return new C5019a(j7, originalName, name, error, z8);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5019a)) {
            return false;
        }
        C5019a c5019a = (C5019a) obj;
        return this.f7823a == c5019a.f7823a && AbstractC5830k.m5325b(this.f7824b, c5019a.f7824b) && AbstractC5830k.m5325b(this.f7825c, c5019a.f7825c) && AbstractC5830k.m5325b(this.f7826d, c5019a.f7826d) && this.f7827e == c5019a.f7827e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f7827e) + AbstractC0584a.m903d(AbstractC0584a.m903d(AbstractC0584a.m903d(Long.hashCode(this.f7823a) * 31, 31, this.f7824b), 31, this.f7825c), 31, this.f7826d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CustomTagNameDialogState(id=");
        sb.append(this.f7823a);
        sb.append(", originalName=");
        sb.append(this.f7824b);
        AbstractC1923c.m1060x(sb, ", name=", this.f7825c, ", error=", this.f7826d);
        sb.append(", isSubmitting=");
        sb.append(this.f7827e);
        sb.append(")");
        return sb.toString();
    }

    public C5019a(long j7, String originalName, String name, String str, boolean z8) {
        AbstractC5830k.m5330g(originalName, "originalName");
        AbstractC5830k.m5330g(name, "name");
        this.f7823a = j7;
        this.f7824b = originalName;
        this.f7825c = name;
        this.f7826d = str;
        this.f7827e = z8;
    }
}
