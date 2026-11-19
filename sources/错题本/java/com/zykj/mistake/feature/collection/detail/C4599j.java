package com.zykj.mistake.feature.collection.detail;

import android.support.v4.media.AbstractC0037f;
import androidx.collection.AbstractC0584a;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.AbstractC5830k;
import p061g.AbstractC5535a;

/* renamed from: com.zykj.mistake.feature.collection.detail.j */
/* loaded from: classes3.dex */
public final class C4599j extends AbstractC4605m {

    /* renamed from: a */
    public final int f6495a;

    /* renamed from: b */
    public final int f6496b;

    /* renamed from: c */
    public final long f6497c;

    /* renamed from: d */
    public final String f6498d;

    /* renamed from: e */
    public final boolean f6499e;

    /* renamed from: f */
    public final boolean f6500f;

    /* renamed from: g */
    public final List f6501g;

    /* renamed from: h */
    public final ArrayList f6502h;

    /* renamed from: i */
    public final int f6503i;

    public C4599j(int i, int i8, long j7, String stemShoot, boolean z8, boolean z9, EmptyList tags, ArrayList arrayList, int i9) {
        AbstractC5830k.m5330g(stemShoot, "stemShoot");
        AbstractC5830k.m5330g(tags, "tags");
        this.f6495a = i;
        this.f6496b = i8;
        this.f6497c = j7;
        this.f6498d = stemShoot;
        this.f6499e = z8;
        this.f6500f = z9;
        this.f6501g = tags;
        this.f6502h = arrayList;
        this.f6503i = i9;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4599j)) {
            return false;
        }
        C4599j c4599j = (C4599j) obj;
        return this.f6495a == c4599j.f6495a && this.f6496b == c4599j.f6496b && this.f6497c == c4599j.f6497c && AbstractC5830k.m5325b(this.f6498d, c4599j.f6498d) && this.f6499e == c4599j.f6499e && this.f6500f == c4599j.f6500f && AbstractC5830k.m5325b(this.f6501g, c4599j.f6501g) && this.f6502h.equals(c4599j.f6502h) && this.f6503i == c4599j.f6503i;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f6503i) + ((this.f6502h.hashCode() + AbstractC0584a.m907h(this.f6501g, AbstractC0584a.m908i(false, AbstractC0584a.m908i(this.f6500f, AbstractC0584a.m908i(this.f6499e, AbstractC0584a.m903d(AbstractC0584a.m897B(this.f6497c, AbstractC0584a.m902c(this.f6496b, Integer.hashCode(this.f6495a) * 31, 31), 923521), 31, this.f6498d), 31), 31), 31), 31)) * 31);
    }

    public final String toString() {
        StringBuilder sbM99x = AbstractC0037f.m99x("OpenMistakeDetail(bookId=", ", itemId=", this.f6495a, ", topicId=", this.f6496b);
        sbM99x.append(this.f6497c);
        sbM99x.append(", subject=, examName=, title=, stemShoot=");
        sbM99x.append(this.f6498d);
        AbstractC5535a.m4900g(", hasStem=", ", isCustomMistake=", sbM99x, this.f6499e, this.f6500f);
        sbM99x.append(", isRelatedQstGroup=false, tags=");
        sbM99x.append(this.f6501g);
        sbM99x.append(", navItems=");
        sbM99x.append(this.f6502h);
        sbM99x.append(", navIndex=");
        sbM99x.append(this.f6503i);
        sbM99x.append(")");
        return sbM99x.toString();
    }
}
