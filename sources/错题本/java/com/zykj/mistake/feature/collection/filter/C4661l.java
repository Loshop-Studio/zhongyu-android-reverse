package com.zykj.mistake.feature.collection.filter;

import android.support.v4.media.AbstractC0037f;
import android.view.C2766k;
import androidx.collection.AbstractC0584a;
import androidx.compose.material3.AbstractC1923c;
import androidx.compose.runtime.internal.StabilityInferred;
import com.zykj.mistake.entity.req.SearchMistakeCollectionReq;
import kotlin.AbstractC5773a;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.AbstractC5830k;
import kotlinx.serialization.Serializable;
import org.jetbrains.annotations.NotNull;
import p045d6.InterfaceC5429e;

@StabilityInferred(parameters = 0)
@Serializable
/* renamed from: com.zykj.mistake.feature.collection.filter.l */
/* loaded from: classes3.dex */
public final class C4661l {

    @NotNull
    public static final C4659k Companion = new C4659k();

    /* renamed from: j */
    public static final InterfaceC5429e[] f6652j = {null, null, null, null, null, null, null, null, AbstractC5773a.m5116a(LazyThreadSafetyMode.PUBLICATION, new C2766k(19))};

    /* renamed from: a */
    public final String f6653a;

    /* renamed from: b */
    public final String f6654b;

    /* renamed from: c */
    public final int f6655c;

    /* renamed from: d */
    public final int f6656d;

    /* renamed from: e */
    public final SearchMistakeCollectionReq f6657e;

    /* renamed from: f */
    public final int f6658f;

    /* renamed from: g */
    public final int f6659g;

    /* renamed from: h */
    public final boolean f6660h;

    /* renamed from: i */
    public final MistakeCollectionFilterResultContract$SourceType f6661i;

    public /* synthetic */ C4661l(int i, String str, String str2, int i8, int i9, SearchMistakeCollectionReq searchMistakeCollectionReq, int i10, int i11, boolean z8, MistakeCollectionFilterResultContract$SourceType mistakeCollectionFilterResultContract$SourceType) {
        this.f6653a = (i & 1) == 0 ? "" : str;
        if ((i & 2) == 0) {
            this.f6654b = "错题集";
        } else {
            this.f6654b = str2;
        }
        if ((i & 4) == 0) {
            this.f6655c = 0;
        } else {
            this.f6655c = i8;
        }
        if ((i & 8) == 0) {
            this.f6656d = 100;
        } else {
            this.f6656d = i9;
        }
        if ((i & 16) == 0) {
            this.f6657e = new SearchMistakeCollectionReq();
        } else {
            this.f6657e = searchMistakeCollectionReq;
        }
        if ((i & 32) == 0) {
            this.f6658f = 0;
        } else {
            this.f6658f = i10;
        }
        if ((i & 64) == 0) {
            this.f6659g = 1;
        } else {
            this.f6659g = i11;
        }
        if ((i & 128) == 0) {
            this.f6660h = false;
        } else {
            this.f6660h = z8;
        }
        if ((i & 256) == 0) {
            this.f6661i = MistakeCollectionFilterResultContract$SourceType.CREATE_COLLECTION;
        } else {
            this.f6661i = mistakeCollectionFilterResultContract$SourceType;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4661l)) {
            return false;
        }
        C4661l c4661l = (C4661l) obj;
        return AbstractC5830k.m5325b(this.f6653a, c4661l.f6653a) && AbstractC5830k.m5325b(this.f6654b, c4661l.f6654b) && this.f6655c == c4661l.f6655c && this.f6656d == c4661l.f6656d && AbstractC5830k.m5325b(this.f6657e, c4661l.f6657e) && this.f6658f == c4661l.f6658f && this.f6659g == c4661l.f6659g && this.f6660h == c4661l.f6660h && this.f6661i == c4661l.f6661i;
    }

    public final int hashCode() {
        return this.f6661i.hashCode() + AbstractC0584a.m908i(this.f6660h, AbstractC0584a.m902c(this.f6659g, AbstractC0584a.m902c(this.f6658f, (this.f6657e.hashCode() + AbstractC0584a.m902c(this.f6656d, AbstractC0584a.m902c(this.f6655c, AbstractC0584a.m903d(this.f6653a.hashCode() * 31, 31, this.f6654b), 31), 31)) * 31, 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sbM101z = AbstractC0037f.m101z("Args(collectionId=", this.f6653a, ", title=", this.f6654b, ", currentCount=");
        AbstractC1923c.m1059w(sbM101z, this.f6655c, ", capacity=", this.f6656d, ", mistakeListReq=");
        sbM101z.append(this.f6657e);
        sbM101z.append(", currentCollectionType=");
        sbM101z.append(this.f6658f);
        sbM101z.append(", otherCollectionType=");
        sbM101z.append(this.f6659g);
        sbM101z.append(", showCurrentCollectionFilter=");
        sbM101z.append(this.f6660h);
        sbM101z.append(", sourceType=");
        sbM101z.append(this.f6661i);
        sbM101z.append(")");
        return sbM101z.toString();
    }

    public C4661l(String str, String str2, int i, SearchMistakeCollectionReq searchMistakeCollectionReq, int i8, int i9, boolean z8, MistakeCollectionFilterResultContract$SourceType sourceType) {
        AbstractC5830k.m5330g(sourceType, "sourceType");
        this.f6653a = str;
        this.f6654b = str2;
        this.f6655c = i;
        this.f6656d = 100;
        this.f6657e = searchMistakeCollectionReq;
        this.f6658f = i8;
        this.f6659g = i9;
        this.f6660h = z8;
        this.f6661i = sourceType;
    }
}
