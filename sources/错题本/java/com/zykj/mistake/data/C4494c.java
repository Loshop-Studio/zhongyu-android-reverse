package com.zykj.mistake.data;

import android.support.v4.media.AbstractC0037f;
import androidx.collection.AbstractC0584a;
import androidx.compose.material3.AbstractC1923c;
import kotlin.jvm.internal.AbstractC5830k;

/* renamed from: com.zykj.mistake.data.c */
/* loaded from: classes3.dex */
public final class C4494c {

    /* renamed from: a */
    public final String f6007a;

    /* renamed from: b */
    public final String f6008b;

    /* renamed from: c */
    public final int f6009c;

    /* renamed from: d */
    public final int f6010d;

    /* renamed from: e */
    public final boolean f6011e;

    public C4494c(String id, String name, int i, int i8, boolean z8) {
        AbstractC5830k.m5330g(id, "id");
        AbstractC5830k.m5330g(name, "name");
        this.f6007a = id;
        this.f6008b = name;
        this.f6009c = i;
        this.f6010d = i8;
        this.f6011e = z8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4494c)) {
            return false;
        }
        C4494c c4494c = (C4494c) obj;
        return AbstractC5830k.m5325b(this.f6007a, c4494c.f6007a) && AbstractC5830k.m5325b(this.f6008b, c4494c.f6008b) && this.f6009c == c4494c.f6009c && this.f6010d == c4494c.f6010d && this.f6011e == c4494c.f6011e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f6011e) + AbstractC0584a.m902c(this.f6010d, AbstractC0584a.m902c(this.f6009c, AbstractC0584a.m903d(this.f6007a.hashCode() * 31, 31, this.f6008b), 31), 31);
    }

    public final String toString() {
        StringBuilder sbM101z = AbstractC0037f.m101z("JoinableCollection(id=", this.f6007a, ", name=", this.f6008b, ", currentCount=");
        AbstractC1923c.m1059w(sbM101z, this.f6009c, ", maxCount=", this.f6010d, ", isJoined=");
        sbM101z.append(this.f6011e);
        sbM101z.append(")");
        return sbM101z.toString();
    }

    public /* synthetic */ C4494c(String str, String str2, int i, boolean z8, int i8) {
        this(str, str2, i, 100, (i8 & 16) != 0 ? false : z8);
    }
}
