package com.zykj.mistake.feature.notebook.detail;

import android.support.v4.media.AbstractC0037f;
import androidx.collection.AbstractC0584a;
import androidx.compose.material3.AbstractC1923c;
import com.zykj.mistake.feature.review.ReviewContract$PracticePoolType;
import com.zykj.mistake.feature.review.ReviewContract$PracticeScene;
import java.util.List;
import kotlin.jvm.internal.AbstractC5830k;
import p061g.AbstractC5535a;

/* renamed from: com.zykj.mistake.feature.notebook.detail.k2 */
/* loaded from: classes3.dex */
public final class C4824k2 extends AbstractC4813i3 {

    /* renamed from: a */
    public final int f7059a;

    /* renamed from: b */
    public final int f7060b;

    /* renamed from: c */
    public final long f7061c;

    /* renamed from: d */
    public final String f7062d;

    /* renamed from: e */
    public final String f7063e;

    /* renamed from: f */
    public final String f7064f;

    /* renamed from: g */
    public final String f7065g;

    /* renamed from: h */
    public final boolean f7066h;

    /* renamed from: i */
    public final boolean f7067i;

    /* renamed from: j */
    public final boolean f7068j;

    /* renamed from: k */
    public final List f7069k;

    /* renamed from: l */
    public final List f7070l;

    /* renamed from: m */
    public final int f7071m;

    /* renamed from: n */
    public final MistakeDetailNewContract$EntryMode f7072n;

    /* renamed from: o */
    public final String f7073o;

    /* renamed from: p */
    public final String f7074p;

    /* renamed from: q */
    public final ReviewContract$PracticeScene f7075q;

    /* renamed from: r */
    public final ReviewContract$PracticePoolType f7076r;

    public C4824k2(int i, int i8, long j7, String str, String str2, String str3, String str4, boolean z8, boolean z9, boolean z10, List tags, List navItems, int i9, MistakeDetailNewContract$EntryMode entryMode, String reviewPracticeSessionId, String reviewPracticeRoundId, ReviewContract$PracticeScene reviewPracticeScene, ReviewContract$PracticePoolType reviewContract$PracticePoolType) {
        AbstractC5830k.m5330g(tags, "tags");
        AbstractC5830k.m5330g(navItems, "navItems");
        AbstractC5830k.m5330g(entryMode, "entryMode");
        AbstractC5830k.m5330g(reviewPracticeSessionId, "reviewPracticeSessionId");
        AbstractC5830k.m5330g(reviewPracticeRoundId, "reviewPracticeRoundId");
        AbstractC5830k.m5330g(reviewPracticeScene, "reviewPracticeScene");
        this.f7059a = i;
        this.f7060b = i8;
        this.f7061c = j7;
        this.f7062d = str;
        this.f7063e = str2;
        this.f7064f = str3;
        this.f7065g = str4;
        this.f7066h = z8;
        this.f7067i = z9;
        this.f7068j = z10;
        this.f7069k = tags;
        this.f7070l = navItems;
        this.f7071m = i9;
        this.f7072n = entryMode;
        this.f7073o = reviewPracticeSessionId;
        this.f7074p = reviewPracticeRoundId;
        this.f7075q = reviewPracticeScene;
        this.f7076r = reviewContract$PracticePoolType;
    }

    /* renamed from: a */
    public final int m4199a() {
        return this.f7059a;
    }

    /* renamed from: b */
    public final int m4200b() {
        return this.f7071m;
    }

    /* renamed from: c */
    public final String m4201c() {
        return this.f7074p;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4824k2)) {
            return false;
        }
        C4824k2 c4824k2 = (C4824k2) obj;
        return this.f7059a == c4824k2.f7059a && this.f7060b == c4824k2.f7060b && this.f7061c == c4824k2.f7061c && AbstractC5830k.m5325b(this.f7062d, c4824k2.f7062d) && AbstractC5830k.m5325b(this.f7063e, c4824k2.f7063e) && AbstractC5830k.m5325b(this.f7064f, c4824k2.f7064f) && AbstractC5830k.m5325b(this.f7065g, c4824k2.f7065g) && this.f7066h == c4824k2.f7066h && this.f7067i == c4824k2.f7067i && this.f7068j == c4824k2.f7068j && AbstractC5830k.m5325b(this.f7069k, c4824k2.f7069k) && AbstractC5830k.m5325b(this.f7070l, c4824k2.f7070l) && this.f7071m == c4824k2.f7071m && this.f7072n == c4824k2.f7072n && AbstractC5830k.m5325b(this.f7073o, c4824k2.f7073o) && AbstractC5830k.m5325b(this.f7074p, c4824k2.f7074p) && this.f7075q == c4824k2.f7075q && this.f7076r == c4824k2.f7076r;
    }

    public final int hashCode() {
        int iM897B = AbstractC0584a.m897B(this.f7061c, AbstractC0584a.m902c(this.f7060b, Integer.hashCode(this.f7059a) * 31, 31), 31);
        String str = this.f7062d;
        int iHashCode = (iM897B + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f7063e;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f7064f;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f7065g;
        int iHashCode4 = (this.f7075q.hashCode() + AbstractC0584a.m903d(AbstractC0584a.m903d((this.f7072n.hashCode() + AbstractC0584a.m902c(this.f7071m, AbstractC0584a.m907h(this.f7070l, AbstractC0584a.m907h(this.f7069k, AbstractC0584a.m908i(this.f7068j, AbstractC0584a.m908i(this.f7067i, AbstractC0584a.m908i(this.f7066h, (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31, 31), 31), 31), 31), 31), 31)) * 31, 31, this.f7073o), 31, this.f7074p)) * 31;
        ReviewContract$PracticePoolType reviewContract$PracticePoolType = this.f7076r;
        return iHashCode4 + (reviewContract$PracticePoolType != null ? reviewContract$PracticePoolType.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbM99x = AbstractC0037f.m99x("Init(bookId=", ", itemId=", this.f7059a, ", topicId=", this.f7060b);
        sbM99x.append(this.f7061c);
        sbM99x.append(", subject=");
        sbM99x.append(this.f7062d);
        AbstractC1923c.m1060x(sbM99x, ", examName=", this.f7063e, ", title=", this.f7064f);
        sbM99x.append(", stemShoot=");
        sbM99x.append(this.f7065g);
        sbM99x.append(", hasStem=");
        sbM99x.append(this.f7066h);
        AbstractC5535a.m4900g(", isCustomMistake=", ", isRelatedQstGroup=", sbM99x, this.f7067i, this.f7068j);
        sbM99x.append(", tags=");
        sbM99x.append(this.f7069k);
        sbM99x.append(", navItems=");
        sbM99x.append(this.f7070l);
        sbM99x.append(", navIndex=");
        sbM99x.append(this.f7071m);
        sbM99x.append(", entryMode=");
        sbM99x.append(this.f7072n);
        AbstractC1923c.m1060x(sbM99x, ", reviewPracticeSessionId=", this.f7073o, ", reviewPracticeRoundId=", this.f7074p);
        sbM99x.append(", reviewPracticeScene=");
        sbM99x.append(this.f7075q);
        sbM99x.append(", reviewPracticePoolType=");
        sbM99x.append(this.f7076r);
        sbM99x.append(")");
        return sbM99x.toString();
    }
}
