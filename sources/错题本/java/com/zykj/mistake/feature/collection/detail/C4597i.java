package com.zykj.mistake.feature.collection.detail;

import android.support.v4.media.AbstractC0037f;
import androidx.collection.AbstractC0584a;
import androidx.compose.material3.AbstractC1923c;
import com.zykj.mistake.entity.req.SearchMistakeCollectionReq;
import com.zykj.mistake.feature.collection.filter.MistakeCollectionFilterResultContract$SourceType;
import kotlin.jvm.internal.AbstractC5830k;

/* renamed from: com.zykj.mistake.feature.collection.detail.i */
/* loaded from: classes3.dex */
public final class C4597i extends AbstractC4605m {

    /* renamed from: a */
    public final String f6486a;

    /* renamed from: b */
    public final String f6487b;

    /* renamed from: c */
    public final int f6488c;

    /* renamed from: d */
    public final SearchMistakeCollectionReq f6489d;

    /* renamed from: e */
    public final int f6490e;

    /* renamed from: f */
    public final int f6491f;

    /* renamed from: g */
    public final boolean f6492g;

    /* renamed from: h */
    public final MistakeCollectionFilterResultContract$SourceType f6493h;

    public C4597i(String str, String str2, int i, SearchMistakeCollectionReq searchMistakeCollectionReq, int i8, int i9, boolean z8, MistakeCollectionFilterResultContract$SourceType sourceType) {
        AbstractC5830k.m5330g(sourceType, "sourceType");
        this.f6486a = str;
        this.f6487b = str2;
        this.f6488c = i;
        this.f6489d = searchMistakeCollectionReq;
        this.f6490e = i8;
        this.f6491f = i9;
        this.f6492g = z8;
        this.f6493h = sourceType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4597i)) {
            return false;
        }
        C4597i c4597i = (C4597i) obj;
        return this.f6486a.equals(c4597i.f6486a) && this.f6487b.equals(c4597i.f6487b) && this.f6488c == c4597i.f6488c && this.f6489d.equals(c4597i.f6489d) && this.f6490e == c4597i.f6490e && this.f6491f == c4597i.f6491f && this.f6492g == c4597i.f6492g && this.f6493h == c4597i.f6493h;
    }

    public final int hashCode() {
        return this.f6493h.hashCode() + AbstractC0584a.m908i(this.f6492g, AbstractC0584a.m902c(this.f6491f, AbstractC0584a.m902c(this.f6490e, (this.f6489d.hashCode() + AbstractC0584a.m902c(100, AbstractC0584a.m902c(this.f6488c, AbstractC0584a.m903d(this.f6486a.hashCode() * 31, 31, this.f6487b), 31), 31)) * 31, 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sbM101z = AbstractC0037f.m101z("OpenFilterResult(collectionId=", this.f6486a, ", title=", this.f6487b, ", currentCount=");
        sbM101z.append(this.f6488c);
        sbM101z.append(", maxCount=100, mistakeListReq=");
        sbM101z.append(this.f6489d);
        sbM101z.append(", currentCollectionType=");
        AbstractC1923c.m1059w(sbM101z, this.f6490e, ", otherCollectionType=", this.f6491f, ", showCurrentCollectionFilter=");
        sbM101z.append(this.f6492g);
        sbM101z.append(", sourceType=");
        sbM101z.append(this.f6493h);
        sbM101z.append(")");
        return sbM101z.toString();
    }
}
