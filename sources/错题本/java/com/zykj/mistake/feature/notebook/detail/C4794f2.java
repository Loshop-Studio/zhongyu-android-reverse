package com.zykj.mistake.feature.notebook.detail;

import android.support.v4.media.AbstractC0037f;
import androidx.collection.AbstractC0584a;
import kotlin.jvm.internal.AbstractC5830k;

/* renamed from: com.zykj.mistake.feature.notebook.detail.f2 */
/* loaded from: classes3.dex */
public final class C4794f2 extends AbstractC4813i3 {

    /* renamed from: a */
    public final String f6987a;

    /* renamed from: b */
    public final String f6988b;

    /* renamed from: c */
    public final long f6989c;

    public C4794f2(String oldName, String newName, long j7) {
        AbstractC5830k.m5330g(oldName, "oldName");
        AbstractC5830k.m5330g(newName, "newName");
        this.f6987a = oldName;
        this.f6988b = newName;
        this.f6989c = j7;
    }

    /* renamed from: a */
    public final long m4183a() {
        return this.f6989c;
    }

    /* renamed from: b */
    public final String m4184b() {
        return this.f6988b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4794f2)) {
            return false;
        }
        C4794f2 c4794f2 = (C4794f2) obj;
        return AbstractC5830k.m5325b(this.f6987a, c4794f2.f6987a) && AbstractC5830k.m5325b(this.f6988b, c4794f2.f6988b) && this.f6989c == c4794f2.f6989c;
    }

    public final int hashCode() {
        return Long.hashCode(this.f6989c) + AbstractC0584a.m903d(this.f6987a.hashCode() * 31, 31, this.f6988b);
    }

    public final String toString() {
        return AbstractC0037f.m83h(this.f6989c, ")", AbstractC0037f.m101z("EditCustomTag(oldName=", this.f6987a, ", newName=", this.f6988b, ", id="));
    }
}
