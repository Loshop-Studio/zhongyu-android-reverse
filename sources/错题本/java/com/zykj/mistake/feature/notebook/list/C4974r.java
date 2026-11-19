package com.zykj.mistake.feature.notebook.list;

import android.support.v4.media.AbstractC0037f;
import androidx.collection.AbstractC0584a;
import androidx.compose.material3.AbstractC1923c;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC5830k;
import p061g.AbstractC5535a;

/* renamed from: com.zykj.mistake.feature.notebook.list.r */
/* loaded from: classes3.dex */
public final class C4974r extends AbstractC4988y {

    /* renamed from: a */
    public final int f7598a;

    /* renamed from: b */
    public final int f7599b;

    /* renamed from: c */
    public final long f7600c;

    /* renamed from: d */
    public final String f7601d;

    /* renamed from: e */
    public final String f7602e;

    /* renamed from: f */
    public final String f7603f;

    /* renamed from: g */
    public final String f7604g;

    /* renamed from: h */
    public final boolean f7605h;

    /* renamed from: i */
    public final boolean f7606i;

    /* renamed from: j */
    public final boolean f7607j;

    /* renamed from: k */
    public final List f7608k;

    /* renamed from: l */
    public final ArrayList f7609l;

    /* renamed from: m */
    public final int f7610m;

    public C4974r(int i, int i8, long j7, String subject, String examName, String title, String stemShoot, boolean z8, boolean z9, boolean z10, List tags, ArrayList arrayList, int i9) {
        AbstractC5830k.m5330g(subject, "subject");
        AbstractC5830k.m5330g(examName, "examName");
        AbstractC5830k.m5330g(title, "title");
        AbstractC5830k.m5330g(stemShoot, "stemShoot");
        AbstractC5830k.m5330g(tags, "tags");
        this.f7598a = i;
        this.f7599b = i8;
        this.f7600c = j7;
        this.f7601d = subject;
        this.f7602e = examName;
        this.f7603f = title;
        this.f7604g = stemShoot;
        this.f7605h = z8;
        this.f7606i = z9;
        this.f7607j = z10;
        this.f7608k = tags;
        this.f7609l = arrayList;
        this.f7610m = i9;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4974r)) {
            return false;
        }
        C4974r c4974r = (C4974r) obj;
        return this.f7598a == c4974r.f7598a && this.f7599b == c4974r.f7599b && this.f7600c == c4974r.f7600c && AbstractC5830k.m5325b(this.f7601d, c4974r.f7601d) && AbstractC5830k.m5325b(this.f7602e, c4974r.f7602e) && AbstractC5830k.m5325b(this.f7603f, c4974r.f7603f) && AbstractC5830k.m5325b(this.f7604g, c4974r.f7604g) && this.f7605h == c4974r.f7605h && this.f7606i == c4974r.f7606i && this.f7607j == c4974r.f7607j && AbstractC5830k.m5325b(this.f7608k, c4974r.f7608k) && this.f7609l.equals(c4974r.f7609l) && this.f7610m == c4974r.f7610m;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f7610m) + ((this.f7609l.hashCode() + AbstractC0584a.m907h(this.f7608k, AbstractC0584a.m908i(this.f7607j, AbstractC0584a.m908i(this.f7606i, AbstractC0584a.m908i(this.f7605h, AbstractC0584a.m903d(AbstractC0584a.m903d(AbstractC0584a.m903d(AbstractC0584a.m903d(AbstractC0584a.m897B(this.f7600c, AbstractC0584a.m902c(this.f7599b, Integer.hashCode(this.f7598a) * 31, 31), 31), 31, this.f7601d), 31, this.f7602e), 31, this.f7603f), 31, this.f7604g), 31), 31), 31), 31)) * 31);
    }

    public final String toString() {
        StringBuilder sbM99x = AbstractC0037f.m99x("OpenMistakeDetail(bookId=", ", itemId=", this.f7598a, ", topicId=", this.f7599b);
        sbM99x.append(this.f7600c);
        sbM99x.append(", subject=");
        sbM99x.append(this.f7601d);
        AbstractC1923c.m1060x(sbM99x, ", examName=", this.f7602e, ", title=", this.f7603f);
        sbM99x.append(", stemShoot=");
        sbM99x.append(this.f7604g);
        sbM99x.append(", hasStem=");
        sbM99x.append(this.f7605h);
        AbstractC5535a.m4900g(", isCustomMistake=", ", isRelatedQstGroup=", sbM99x, this.f7606i, this.f7607j);
        sbM99x.append(", tags=");
        sbM99x.append(this.f7608k);
        sbM99x.append(", navItems=");
        sbM99x.append(this.f7609l);
        sbM99x.append(", navIndex=");
        sbM99x.append(this.f7610m);
        sbM99x.append(")");
        return sbM99x.toString();
    }
}
