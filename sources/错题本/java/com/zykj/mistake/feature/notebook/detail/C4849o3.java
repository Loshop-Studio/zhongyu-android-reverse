package com.zykj.mistake.feature.notebook.detail;

import android.support.v4.media.AbstractC0037f;
import androidx.collection.AbstractC0584a;
import kotlin.jvm.internal.AbstractC5830k;

/* renamed from: com.zykj.mistake.feature.notebook.detail.o3 */
/* loaded from: classes3.dex */
public final class C4849o3 {

    /* renamed from: a */
    public final String f7230a;

    /* renamed from: b */
    public final String f7231b;

    /* renamed from: c */
    public final String f7232c;

    public C4849o3(String name, String answerPath, String str) {
        AbstractC5830k.m5330g(name, "name");
        AbstractC5830k.m5330g(answerPath, "answerPath");
        this.f7230a = name;
        this.f7231b = answerPath;
        this.f7232c = str;
    }

    /* renamed from: a */
    public static C4849o3 m4225a(C4849o3 c4849o3, String name) {
        String answerPath = c4849o3.f7231b;
        String str = c4849o3.f7232c;
        c4849o3.getClass();
        AbstractC5830k.m5330g(name, "name");
        AbstractC5830k.m5330g(answerPath, "answerPath");
        return new C4849o3(name, answerPath, str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4849o3)) {
            return false;
        }
        C4849o3 c4849o3 = (C4849o3) obj;
        return AbstractC5830k.m5325b(this.f7230a, c4849o3.f7230a) && AbstractC5830k.m5325b(this.f7231b, c4849o3.f7231b) && AbstractC5830k.m5325b(this.f7232c, c4849o3.f7232c);
    }

    public final int hashCode() {
        int iM903d = AbstractC0584a.m903d(this.f7230a.hashCode() * 31, 31, this.f7231b);
        String str = this.f7232c;
        return iM903d + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return AbstractC0037f.m91p(AbstractC0037f.m101z("TypicalAnswerUiState(name=", this.f7230a, ", answerPath=", this.f7231b, ", commentPath="), this.f7232c, ")");
    }
}
