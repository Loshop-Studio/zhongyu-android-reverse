package com.zykj.mistake.feature.notebook.detail;

import androidx.collection.AbstractC0584a;
import androidx.compose.material3.AbstractC1923c;
import java.util.List;
import kotlin.jvm.internal.AbstractC5830k;

/* renamed from: com.zykj.mistake.feature.notebook.detail.y0 */
/* loaded from: classes3.dex */
public final class C4906y0 extends AbstractC4823k1 {

    /* renamed from: a */
    public final long f7407a;

    /* renamed from: b */
    public final boolean f7408b;

    /* renamed from: c */
    public final String f7409c;

    /* renamed from: d */
    public final String f7410d;

    /* renamed from: e */
    public final List f7411e;

    /* renamed from: f */
    public final List f7412f;

    /* renamed from: g */
    public final List f7413g;

    public C4906y0(long j7, boolean z8, String noteUrl, String str, List stemPathList, List answerPathList, List revisedAnswerPathList) {
        AbstractC5830k.m5330g(noteUrl, "noteUrl");
        AbstractC5830k.m5330g(stemPathList, "stemPathList");
        AbstractC5830k.m5330g(answerPathList, "answerPathList");
        AbstractC5830k.m5330g(revisedAnswerPathList, "revisedAnswerPathList");
        this.f7407a = j7;
        this.f7408b = z8;
        this.f7409c = noteUrl;
        this.f7410d = str;
        this.f7411e = stemPathList;
        this.f7412f = answerPathList;
        this.f7413g = revisedAnswerPathList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4906y0)) {
            return false;
        }
        C4906y0 c4906y0 = (C4906y0) obj;
        return this.f7407a == c4906y0.f7407a && this.f7408b == c4906y0.f7408b && AbstractC5830k.m5325b(this.f7409c, c4906y0.f7409c) && AbstractC5830k.m5325b(this.f7410d, c4906y0.f7410d) && AbstractC5830k.m5325b(this.f7411e, c4906y0.f7411e) && AbstractC5830k.m5325b(this.f7412f, c4906y0.f7412f) && AbstractC5830k.m5325b(this.f7413g, c4906y0.f7413g);
    }

    public final int hashCode() {
        int iM903d = AbstractC0584a.m903d(AbstractC0584a.m908i(this.f7408b, Long.hashCode(this.f7407a) * 31, 31), 31, this.f7409c);
        String str = this.f7410d;
        return this.f7413g.hashCode() + AbstractC0584a.m907h(this.f7412f, AbstractC0584a.m907h(this.f7411e, (iM903d + (str == null ? 0 : str.hashCode())) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OpenBoardNote(itemId=");
        sb.append(this.f7407a);
        sb.append(", canOpenCamera=");
        sb.append(this.f7408b);
        AbstractC1923c.m1060x(sb, ", noteUrl=", this.f7409c, ", stemUrl=", this.f7410d);
        sb.append(", stemPathList=");
        sb.append(this.f7411e);
        sb.append(", answerPathList=");
        sb.append(this.f7412f);
        sb.append(", revisedAnswerPathList=");
        sb.append(this.f7413g);
        sb.append(")");
        return sb.toString();
    }
}
