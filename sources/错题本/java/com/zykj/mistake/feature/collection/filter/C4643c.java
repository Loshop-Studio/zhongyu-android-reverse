package com.zykj.mistake.feature.collection.filter;

import androidx.collection.AbstractC0584a;
import androidx.compose.material3.AbstractC1923c;
import kotlin.jvm.internal.AbstractC5830k;
import p152r6.InterfaceC6469a;

/* renamed from: com.zykj.mistake.feature.collection.filter.c */
/* loaded from: classes3.dex */
public final class C4643c {

    /* renamed from: a */
    public final String f6585a;

    /* renamed from: b */
    public final boolean f6586b;

    /* renamed from: c */
    public final boolean f6587c;

    /* renamed from: d */
    public final boolean f6588d;

    /* renamed from: e */
    public final InterfaceC6469a f6589e;

    public C4643c(int i, String text, InterfaceC6469a onClick, boolean z8) {
        boolean z9 = (i & 4) == 0;
        boolean z10 = (i & 8) == 0;
        AbstractC5830k.m5330g(text, "text");
        AbstractC5830k.m5330g(onClick, "onClick");
        this.f6585a = text;
        this.f6586b = z8;
        this.f6587c = z9;
        this.f6588d = z10;
        this.f6589e = onClick;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4643c)) {
            return false;
        }
        C4643c c4643c = (C4643c) obj;
        return AbstractC5830k.m5325b(this.f6585a, c4643c.f6585a) && this.f6586b == c4643c.f6586b && this.f6587c == c4643c.f6587c && this.f6588d == c4643c.f6588d && AbstractC5830k.m5325b(this.f6589e, c4643c.f6589e);
    }

    public final int hashCode() {
        return this.f6589e.hashCode() + AbstractC0584a.m908i(this.f6588d, AbstractC0584a.m908i(this.f6587c, AbstractC0584a.m908i(this.f6586b, this.f6585a.hashCode() * 31, 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FilterOption(text=");
        sb.append(this.f6585a);
        sb.append(", selected=");
        sb.append(this.f6586b);
        sb.append(", wrapContent=");
        AbstractC1923c.m1058v(", adaptiveWidth=", ", onClick=", sb, this.f6587c, this.f6588d);
        sb.append(this.f6589e);
        sb.append(")");
        return sb.toString();
    }
}
