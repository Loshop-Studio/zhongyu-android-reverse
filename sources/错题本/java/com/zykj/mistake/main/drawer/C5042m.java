package com.zykj.mistake.main.drawer;

import androidx.collection.AbstractC0584a;
import androidx.compose.material3.AbstractC1923c;
import kotlin.jvm.internal.AbstractC5830k;
import p152r6.InterfaceC6469a;

/* renamed from: com.zykj.mistake.main.drawer.m */
/* loaded from: classes3.dex */
public final class C5042m {

    /* renamed from: a */
    public final String f7898a;

    /* renamed from: b */
    public final boolean f7899b;

    /* renamed from: c */
    public final boolean f7900c;

    /* renamed from: d */
    public final boolean f7901d;

    /* renamed from: e */
    public final boolean f7902e;

    /* renamed from: f */
    public final InterfaceC6469a f7903f;

    public C5042m(String text, boolean z8, boolean z9, InterfaceC6469a onClick, int i) {
        z9 = (i & 4) != 0 ? false : z9;
        boolean z10 = (i & 8) == 0;
        boolean z11 = (i & 16) == 0;
        AbstractC5830k.m5330g(text, "text");
        AbstractC5830k.m5330g(onClick, "onClick");
        this.f7898a = text;
        this.f7899b = z8;
        this.f7900c = z9;
        this.f7901d = z10;
        this.f7902e = z11;
        this.f7903f = onClick;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5042m)) {
            return false;
        }
        C5042m c5042m = (C5042m) obj;
        return AbstractC5830k.m5325b(this.f7898a, c5042m.f7898a) && this.f7899b == c5042m.f7899b && this.f7900c == c5042m.f7900c && this.f7901d == c5042m.f7901d && this.f7902e == c5042m.f7902e && AbstractC5830k.m5325b(this.f7903f, c5042m.f7903f);
    }

    public final int hashCode() {
        return this.f7903f.hashCode() + AbstractC0584a.m908i(this.f7902e, AbstractC0584a.m908i(this.f7901d, AbstractC0584a.m908i(this.f7900c, AbstractC0584a.m908i(this.f7899b, this.f7898a.hashCode() * 31, 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NotebookFilterOption(text=");
        sb.append(this.f7898a);
        sb.append(", selected=");
        sb.append(this.f7899b);
        sb.append(", wide=");
        AbstractC1923c.m1058v(", wrapContent=", ", adaptiveWidth=", sb, this.f7900c, this.f7901d);
        sb.append(this.f7902e);
        sb.append(", onClick=");
        sb.append(this.f7903f);
        sb.append(")");
        return sb.toString();
    }
}
