package com.zykj.mistake.feature.notebook.list;

import android.support.v4.media.AbstractC0037f;
import androidx.collection.AbstractC0584a;
import androidx.compose.material3.AbstractC1923c;
import kotlin.jvm.internal.AbstractC5830k;

/* renamed from: com.zykj.mistake.feature.notebook.list.a */
/* loaded from: classes3.dex */
public final class C4927a {

    /* renamed from: a */
    public final String f7456a;

    /* renamed from: b */
    public final String f7457b;

    /* renamed from: c */
    public final int f7458c;

    /* renamed from: d */
    public final int f7459d;

    /* renamed from: e */
    public final boolean f7460e;

    /* renamed from: f */
    public final boolean f7461f;

    public C4927a(String id, String name, int i, int i8, boolean z8, boolean z9) {
        AbstractC5830k.m5330g(id, "id");
        AbstractC5830k.m5330g(name, "name");
        this.f7456a = id;
        this.f7457b = name;
        this.f7458c = i;
        this.f7459d = i8;
        this.f7460e = z8;
        this.f7461f = z9;
    }

    /* renamed from: a */
    public final String m4297a() {
        return this.f7456a;
    }

    /* renamed from: b */
    public final boolean m4298b() {
        return this.f7460e;
    }

    /* renamed from: c */
    public final boolean m4299c() {
        return this.f7461f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4927a)) {
            return false;
        }
        C4927a c4927a = (C4927a) obj;
        return AbstractC5830k.m5325b(this.f7456a, c4927a.f7456a) && AbstractC5830k.m5325b(this.f7457b, c4927a.f7457b) && this.f7458c == c4927a.f7458c && this.f7459d == c4927a.f7459d && this.f7460e == c4927a.f7460e && this.f7461f == c4927a.f7461f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f7461f) + AbstractC0584a.m908i(this.f7460e, AbstractC0584a.m902c(this.f7459d, AbstractC0584a.m902c(this.f7458c, AbstractC0584a.m903d(this.f7456a.hashCode() * 31, 31, this.f7457b), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sbM101z = AbstractC0037f.m101z("JoinCollectionDialogItem(id=", this.f7456a, ", name=", this.f7457b, ", currentCount=");
        AbstractC1923c.m1059w(sbM101z, this.f7458c, ", maxCount=", this.f7459d, ", isFull=");
        sbM101z.append(this.f7460e);
        sbM101z.append(", isJoined=");
        sbM101z.append(this.f7461f);
        sbM101z.append(")");
        return sbM101z.toString();
    }
}
