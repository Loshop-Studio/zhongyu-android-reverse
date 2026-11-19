package com.zykj.mistake.feature.ask;

import android.support.v4.media.AbstractC0037f;
import androidx.collection.AbstractC0584a;
import androidx.compose.material3.AbstractC1923c;
import kotlin.jvm.internal.AbstractC5830k;

/* renamed from: com.zykj.mistake.feature.ask.y */
/* loaded from: classes3.dex */
public final class C4549y {

    /* renamed from: a */
    public final String f6307a;

    /* renamed from: b */
    public final String f6308b;

    /* renamed from: c */
    public final MistakeAskMaterialContract$SourceType f6309c;

    /* renamed from: d */
    public final String f6310d;

    /* renamed from: e */
    public final String f6311e;

    /* renamed from: f */
    public final String f6312f;

    /* renamed from: g */
    public final C4515c0 f6313g;

    /* renamed from: h */
    public final boolean f6314h;

    public C4549y(String id, String title, MistakeAskMaterialContract$SourceType sourceType, String imageSource, String webUrl, String str, C4515c0 c4515c0, boolean z8) {
        AbstractC5830k.m5330g(id, "id");
        AbstractC5830k.m5330g(title, "title");
        AbstractC5830k.m5330g(sourceType, "sourceType");
        AbstractC5830k.m5330g(imageSource, "imageSource");
        AbstractC5830k.m5330g(webUrl, "webUrl");
        this.f6307a = id;
        this.f6308b = title;
        this.f6309c = sourceType;
        this.f6310d = imageSource;
        this.f6311e = webUrl;
        this.f6312f = str;
        this.f6313g = c4515c0;
        this.f6314h = z8;
    }

    /* renamed from: a */
    public static C4549y m4016a(C4549y c4549y, String str, boolean z8, int i) {
        String id = c4549y.f6307a;
        String title = c4549y.f6308b;
        MistakeAskMaterialContract$SourceType sourceType = c4549y.f6309c;
        String imageSource = c4549y.f6310d;
        String webUrl = c4549y.f6311e;
        if ((i & 32) != 0) {
            str = c4549y.f6312f;
        }
        String previewPath = str;
        C4515c0 c4515c0 = c4549y.f6313g;
        if ((i & 128) != 0) {
            z8 = c4549y.f6314h;
        }
        AbstractC5830k.m5330g(id, "id");
        AbstractC5830k.m5330g(title, "title");
        AbstractC5830k.m5330g(sourceType, "sourceType");
        AbstractC5830k.m5330g(imageSource, "imageSource");
        AbstractC5830k.m5330g(webUrl, "webUrl");
        AbstractC5830k.m5330g(previewPath, "previewPath");
        return new C4549y(id, title, sourceType, imageSource, webUrl, previewPath, c4515c0, z8);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4549y)) {
            return false;
        }
        C4549y c4549y = (C4549y) obj;
        return AbstractC5830k.m5325b(this.f6307a, c4549y.f6307a) && AbstractC5830k.m5325b(this.f6308b, c4549y.f6308b) && this.f6309c == c4549y.f6309c && AbstractC5830k.m5325b(this.f6310d, c4549y.f6310d) && AbstractC5830k.m5325b(this.f6311e, c4549y.f6311e) && AbstractC5830k.m5325b(this.f6312f, c4549y.f6312f) && AbstractC5830k.m5325b(this.f6313g, c4549y.f6313g) && this.f6314h == c4549y.f6314h;
    }

    public final int hashCode() {
        int iM903d = AbstractC0584a.m903d(AbstractC0584a.m903d(AbstractC0584a.m903d((this.f6309c.hashCode() + AbstractC0584a.m903d(this.f6307a.hashCode() * 31, 31, this.f6308b)) * 31, 31, this.f6310d), 31, this.f6311e), 31, this.f6312f);
        C4515c0 c4515c0 = this.f6313g;
        return Boolean.hashCode(this.f6314h) + ((iM903d + (c4515c0 == null ? 0 : c4515c0.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sbM101z = AbstractC0037f.m101z("ItemUiState(id=", this.f6307a, ", title=", this.f6308b, ", sourceType=");
        sbM101z.append(this.f6309c);
        sbM101z.append(", imageSource=");
        sbM101z.append(this.f6310d);
        sbM101z.append(", webUrl=");
        AbstractC1923c.m1060x(sbM101z, this.f6311e, ", previewPath=", this.f6312f, ", textPayload=");
        sbM101z.append(this.f6313g);
        sbM101z.append(", selected=");
        sbM101z.append(this.f6314h);
        sbM101z.append(")");
        return sbM101z.toString();
    }
}
