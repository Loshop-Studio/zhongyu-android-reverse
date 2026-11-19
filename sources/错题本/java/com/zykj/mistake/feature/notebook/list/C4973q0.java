package com.zykj.mistake.feature.notebook.list;

import android.support.v4.media.AbstractC0037f;
import androidx.collection.AbstractC0584a;
import kotlin.jvm.internal.AbstractC5830k;

/* renamed from: com.zykj.mistake.feature.notebook.list.q0 */
/* loaded from: classes3.dex */
public final class C4973q0 extends AbstractC4938d1 {

    /* renamed from: a */
    public final String f7595a;

    /* renamed from: b */
    public final String f7596b;

    /* renamed from: c */
    public final long f7597c;

    public C4973q0(String oldName, String newName, long j7) {
        AbstractC5830k.m5330g(oldName, "oldName");
        AbstractC5830k.m5330g(newName, "newName");
        this.f7595a = oldName;
        this.f7596b = newName;
        this.f7597c = j7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4973q0)) {
            return false;
        }
        C4973q0 c4973q0 = (C4973q0) obj;
        return AbstractC5830k.m5325b(this.f7595a, c4973q0.f7595a) && AbstractC5830k.m5325b(this.f7596b, c4973q0.f7596b) && this.f7597c == c4973q0.f7597c;
    }

    public final int hashCode() {
        return Long.hashCode(this.f7597c) + AbstractC0584a.m903d(this.f7595a.hashCode() * 31, 31, this.f7596b);
    }

    public final String toString() {
        return AbstractC0037f.m83h(this.f7597c, ")", AbstractC0037f.m101z("EditCustomTag(oldName=", this.f7595a, ", newName=", this.f7596b, ", id="));
    }
}
