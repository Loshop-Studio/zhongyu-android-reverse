package com.zykj.mistake.feature.notebook.detail;

import android.support.v4.media.AbstractC0037f;
import androidx.collection.AbstractC0584a;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.AbstractC5830k;

/* renamed from: com.zykj.mistake.feature.notebook.detail.q0 */
/* loaded from: classes3.dex */
public final class C4858q0 {

    /* renamed from: a */
    public final String f7261a;

    /* renamed from: b */
    public final List f7262b;

    /* renamed from: c */
    public final List f7263c;

    /* renamed from: d */
    public final List f7264d;

    /* renamed from: e */
    public final String f7265e;

    public C4858q0(String str, List list, List list2, List list3, int i) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? EmptyList.INSTANCE : list, (i & 4) != 0 ? EmptyList.INSTANCE : list2, (i & 8) != 0 ? EmptyList.INSTANCE : list3, (String) null);
    }

    /* renamed from: a */
    public static C4858q0 m4226a(C4858q0 c4858q0, String str) {
        String str2 = c4858q0.f7261a;
        List stemPathList = c4858q0.f7262b;
        List answerPathList = c4858q0.f7263c;
        List revisedAnswerPathList = c4858q0.f7264d;
        c4858q0.getClass();
        AbstractC5830k.m5330g(stemPathList, "stemPathList");
        AbstractC5830k.m5330g(answerPathList, "answerPathList");
        AbstractC5830k.m5330g(revisedAnswerPathList, "revisedAnswerPathList");
        return new C4858q0(str2, stemPathList, answerPathList, revisedAnswerPathList, str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4858q0)) {
            return false;
        }
        C4858q0 c4858q0 = (C4858q0) obj;
        return AbstractC5830k.m5325b(this.f7261a, c4858q0.f7261a) && AbstractC5830k.m5325b(this.f7262b, c4858q0.f7262b) && AbstractC5830k.m5325b(this.f7263c, c4858q0.f7263c) && AbstractC5830k.m5325b(this.f7264d, c4858q0.f7264d) && AbstractC5830k.m5325b(this.f7265e, c4858q0.f7265e);
    }

    public final int hashCode() {
        String str = this.f7261a;
        int iM907h = AbstractC0584a.m907h(this.f7264d, AbstractC0584a.m907h(this.f7263c, AbstractC0584a.m907h(this.f7262b, (str == null ? 0 : str.hashCode()) * 31, 31), 31), 31);
        String str2 = this.f7265e;
        return iM907h + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BoardSketchParams(stemUrl=");
        sb.append(this.f7261a);
        sb.append(", stemPathList=");
        sb.append(this.f7262b);
        sb.append(", answerPathList=");
        sb.append(this.f7263c);
        sb.append(", revisedAnswerPathList=");
        sb.append(this.f7264d);
        sb.append(", stemSnapshotPath=");
        return AbstractC0037f.m91p(sb, this.f7265e, ")");
    }

    public C4858q0(String str, List stemPathList, List answerPathList, List revisedAnswerPathList, String str2) {
        AbstractC5830k.m5330g(stemPathList, "stemPathList");
        AbstractC5830k.m5330g(answerPathList, "answerPathList");
        AbstractC5830k.m5330g(revisedAnswerPathList, "revisedAnswerPathList");
        this.f7261a = str;
        this.f7262b = stemPathList;
        this.f7263c = answerPathList;
        this.f7264d = revisedAnswerPathList;
        this.f7265e = str2;
    }
}
