package p137p4;

import android.support.v4.media.AbstractC0037f;
import androidx.collection.AbstractC0584a;
import androidx.compose.material3.AbstractC1923c;
import coil3.network.AbstractC3315g;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.AbstractC5830k;
import p061g.AbstractC5535a;

/* renamed from: p4.b */
/* loaded from: classes3.dex */
public final class C6383b {

    /* renamed from: a */
    public final String f10446a;

    /* renamed from: b */
    public final int f10447b;

    /* renamed from: c */
    public final int f10448c;

    /* renamed from: d */
    public final long f10449d;

    /* renamed from: e */
    public final AbstractC3315g f10450e;

    /* renamed from: f */
    public final String f10451f;

    /* renamed from: g */
    public final String f10452g;

    /* renamed from: h */
    public final String f10453h;

    /* renamed from: i */
    public final String f10454i;

    /* renamed from: j */
    public final boolean f10455j;

    /* renamed from: k */
    public final boolean f10456k;

    /* renamed from: l */
    public final boolean f10457l;

    /* renamed from: m */
    public final boolean f10458m;

    /* renamed from: n */
    public final boolean f10459n;

    /* renamed from: o */
    public final Set f10460o;

    /* renamed from: p */
    public final List f10461p;

    /* renamed from: q */
    public final int f10462q;

    /* renamed from: r */
    public final int f10463r;

    /* renamed from: s */
    public final String f10464s;

    public C6383b(String id, int i, int i8, long j7, AbstractC3315g abstractC3315g, String subject, String examName, String title, String stemShoot, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, Set collectionIds, List tags, int i9, int i10, String str) {
        AbstractC5830k.m5330g(id, "id");
        AbstractC5830k.m5330g(subject, "subject");
        AbstractC5830k.m5330g(examName, "examName");
        AbstractC5830k.m5330g(title, "title");
        AbstractC5830k.m5330g(stemShoot, "stemShoot");
        AbstractC5830k.m5330g(collectionIds, "collectionIds");
        AbstractC5830k.m5330g(tags, "tags");
        this.f10446a = id;
        this.f10447b = i;
        this.f10448c = i8;
        this.f10449d = j7;
        this.f10450e = abstractC3315g;
        this.f10451f = subject;
        this.f10452g = examName;
        this.f10453h = title;
        this.f10454i = stemShoot;
        this.f10455j = z8;
        this.f10456k = z9;
        this.f10457l = z10;
        this.f10458m = z11;
        this.f10459n = z12;
        this.f10460o = collectionIds;
        this.f10461p = tags;
        this.f10462q = i9;
        this.f10463r = i10;
        this.f10464s = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6383b)) {
            return false;
        }
        C6383b c6383b = (C6383b) obj;
        return AbstractC5830k.m5325b(this.f10446a, c6383b.f10446a) && this.f10447b == c6383b.f10447b && this.f10448c == c6383b.f10448c && this.f10449d == c6383b.f10449d && AbstractC5830k.m5325b(this.f10450e, c6383b.f10450e) && AbstractC5830k.m5325b(this.f10451f, c6383b.f10451f) && AbstractC5830k.m5325b(this.f10452g, c6383b.f10452g) && AbstractC5830k.m5325b(this.f10453h, c6383b.f10453h) && AbstractC5830k.m5325b(this.f10454i, c6383b.f10454i) && this.f10455j == c6383b.f10455j && this.f10456k == c6383b.f10456k && this.f10457l == c6383b.f10457l && this.f10458m == c6383b.f10458m && this.f10459n == c6383b.f10459n && AbstractC5830k.m5325b(this.f10460o, c6383b.f10460o) && AbstractC5830k.m5325b(this.f10461p, c6383b.f10461p) && this.f10462q == c6383b.f10462q && this.f10463r == c6383b.f10463r && AbstractC5830k.m5325b(this.f10464s, c6383b.f10464s);
    }

    public final int hashCode() {
        return this.f10464s.hashCode() + AbstractC0584a.m902c(this.f10463r, AbstractC0584a.m902c(this.f10462q, AbstractC0584a.m907h(this.f10461p, (this.f10460o.hashCode() + AbstractC0584a.m908i(this.f10459n, AbstractC0584a.m908i(this.f10458m, AbstractC0584a.m908i(this.f10457l, AbstractC0584a.m908i(this.f10456k, AbstractC0584a.m908i(this.f10455j, AbstractC0584a.m903d(AbstractC0584a.m903d(AbstractC0584a.m903d(AbstractC0584a.m903d((this.f10450e.hashCode() + AbstractC0584a.m897B(this.f10449d, AbstractC0584a.m902c(this.f10448c, AbstractC0584a.m902c(this.f10447b, this.f10446a.hashCode() * 31, 31), 31), 31)) * 31, 31, this.f10451f), 31, this.f10452g), 31, this.f10453h), 31, this.f10454i), 31), 31), 31), 31), 31)) * 31, 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MistakeItemUiState(id=");
        sb.append(this.f10446a);
        sb.append(", bookId=");
        sb.append(this.f10447b);
        sb.append(", itemId=");
        sb.append(this.f10448c);
        sb.append(", topicId=");
        sb.append(this.f10449d);
        sb.append(", stem=");
        sb.append(this.f10450e);
        sb.append(", subject=");
        sb.append(this.f10451f);
        AbstractC1923c.m1060x(sb, ", examName=", this.f10452g, ", title=", this.f10453h);
        sb.append(", stemShoot=");
        sb.append(this.f10454i);
        sb.append(", isCustomMistake=");
        sb.append(this.f10455j);
        AbstractC5535a.m4900g(", isRelatedQstGroup=", ", hasStem=", sb, this.f10456k, this.f10457l);
        AbstractC5535a.m4900g(", isMastered=", ", isInCurrentCollection=", sb, this.f10458m, this.f10459n);
        sb.append(", collectionIds=");
        sb.append(this.f10460o);
        sb.append(", tags=");
        sb.append(this.f10461p);
        sb.append(", rightCount=");
        sb.append(this.f10462q);
        sb.append(", wrongCount=");
        sb.append(this.f10463r);
        return AbstractC0037f.m92q(sb, ", addTime=", this.f10464s, ")");
    }
}
