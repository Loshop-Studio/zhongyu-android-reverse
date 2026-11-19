package com.zykj.mistake.feature.notebook.detail;

import android.support.v4.media.AbstractC0037f;
import kotlin.jvm.internal.AbstractC5830k;

/* renamed from: com.zykj.mistake.feature.notebook.detail.u2 */
/* loaded from: classes3.dex */
public final class C4884u2 extends AbstractC4813i3 {

    /* renamed from: a */
    public final String f7337a;

    /* renamed from: b */
    public final String f7338b;

    public C4884u2(String str, String str2) {
        this.f7337a = str;
        this.f7338b = str2;
    }

    /* renamed from: a */
    public final String m4267a() {
        return this.f7338b;
    }

    /* renamed from: b */
    public final String m4268b() {
        return this.f7337a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4884u2)) {
            return false;
        }
        C4884u2 c4884u2 = (C4884u2) obj;
        return AbstractC5830k.m5325b(this.f7337a, c4884u2.f7337a) && AbstractC5830k.m5325b(this.f7338b, c4884u2.f7338b);
    }

    public final int hashCode() {
        String str = this.f7337a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f7338b;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return AbstractC0037f.m87l("PreviewAnswerImage(path=", this.f7337a, ", coverPath=", this.f7338b, ")");
    }
}
