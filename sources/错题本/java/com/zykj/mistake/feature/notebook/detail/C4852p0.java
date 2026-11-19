package com.zykj.mistake.feature.notebook.detail;

import android.support.v4.media.AbstractC0037f;
import androidx.collection.AbstractC0584a;
import kotlin.jvm.internal.AbstractC5830k;

/* renamed from: com.zykj.mistake.feature.notebook.detail.p0 */
/* loaded from: classes3.dex */
public final class C4852p0 {

    /* renamed from: a */
    public final String f7239a;

    /* renamed from: b */
    public final String f7240b;

    /* renamed from: c */
    public final String f7241c;

    public C4852p0(String str, String str2, String str3) {
        this.f7239a = str;
        this.f7240b = str2;
        this.f7241c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4852p0)) {
            return false;
        }
        C4852p0 c4852p0 = (C4852p0) obj;
        return AbstractC5830k.m5325b(this.f7239a, c4852p0.f7239a) && AbstractC5830k.m5325b(this.f7240b, c4852p0.f7240b) && AbstractC5830k.m5325b(this.f7241c, c4852p0.f7241c);
    }

    public final int hashCode() {
        return this.f7241c.hashCode() + AbstractC0584a.m903d(this.f7239a.hashCode() * 31, 31, this.f7240b);
    }

    public final String toString() {
        return AbstractC0037f.m91p(AbstractC0037f.m101z("AnswerMicroLessonUiState(name=", this.f7239a, ", snapshot=", this.f7240b, ", address="), this.f7241c, ")");
    }
}
