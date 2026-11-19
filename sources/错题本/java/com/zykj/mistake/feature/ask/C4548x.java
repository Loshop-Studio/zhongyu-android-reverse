package com.zykj.mistake.feature.ask;

import android.support.v4.media.AbstractC0037f;
import android.view.C2766k;
import androidx.collection.AbstractC0584a;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.AbstractC5773a;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.AbstractC5830k;
import kotlinx.serialization.Serializable;
import org.jetbrains.annotations.NotNull;
import p045d6.InterfaceC5429e;
import p118m7.AbstractC6191y0;

@StabilityInferred(parameters = 0)
@Serializable
/* renamed from: com.zykj.mistake.feature.ask.x */
/* loaded from: classes3.dex */
public final class C4548x {

    @NotNull
    public static final C4547w Companion = new C4547w();

    /* renamed from: g */
    public static final InterfaceC5429e[] f6300g = {null, null, AbstractC5773a.m5116a(LazyThreadSafetyMode.PUBLICATION, new C2766k(16)), null, null, null};

    /* renamed from: a */
    public final String f6301a;

    /* renamed from: b */
    public final String f6302b;

    /* renamed from: c */
    public final MistakeAskMaterialContract$SourceType f6303c;

    /* renamed from: d */
    public final String f6304d;

    /* renamed from: e */
    public final String f6305e;

    /* renamed from: f */
    public final C4515c0 f6306f;

    public /* synthetic */ C4548x(int i, String str, String str2, MistakeAskMaterialContract$SourceType mistakeAskMaterialContract$SourceType, String str3, String str4, C4515c0 c4515c0) {
        if (7 != (i & 7)) {
            AbstractC6191y0.m5841k(C4546v.f6299a.getDescriptor(), i, 7);
            throw null;
        }
        this.f6301a = str;
        this.f6302b = str2;
        this.f6303c = mistakeAskMaterialContract$SourceType;
        if ((i & 8) == 0) {
            this.f6304d = "";
        } else {
            this.f6304d = str3;
        }
        if ((i & 16) == 0) {
            this.f6305e = "";
        } else {
            this.f6305e = str4;
        }
        if ((i & 32) == 0) {
            this.f6306f = null;
        } else {
            this.f6306f = c4515c0;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4548x)) {
            return false;
        }
        C4548x c4548x = (C4548x) obj;
        return AbstractC5830k.m5325b(this.f6301a, c4548x.f6301a) && AbstractC5830k.m5325b(this.f6302b, c4548x.f6302b) && this.f6303c == c4548x.f6303c && AbstractC5830k.m5325b(this.f6304d, c4548x.f6304d) && AbstractC5830k.m5325b(this.f6305e, c4548x.f6305e) && AbstractC5830k.m5325b(this.f6306f, c4548x.f6306f);
    }

    public final int hashCode() {
        int iM903d = AbstractC0584a.m903d(AbstractC0584a.m903d((this.f6303c.hashCode() + AbstractC0584a.m903d(this.f6301a.hashCode() * 31, 31, this.f6302b)) * 31, 31, this.f6304d), 31, this.f6305e);
        C4515c0 c4515c0 = this.f6306f;
        return iM903d + (c4515c0 == null ? 0 : c4515c0.hashCode());
    }

    public final String toString() {
        StringBuilder sbM101z = AbstractC0037f.m101z("Item(id=", this.f6301a, ", title=", this.f6302b, ", sourceType=");
        sbM101z.append(this.f6303c);
        sbM101z.append(", imageSource=");
        sbM101z.append(this.f6304d);
        sbM101z.append(", webUrl=");
        sbM101z.append(this.f6305e);
        sbM101z.append(", textPayload=");
        sbM101z.append(this.f6306f);
        sbM101z.append(")");
        return sbM101z.toString();
    }

    public C4548x(String id, String title, MistakeAskMaterialContract$SourceType sourceType, String imageSource, String webUrl, C4515c0 c4515c0, int i) {
        imageSource = (i & 8) != 0 ? "" : imageSource;
        webUrl = (i & 16) != 0 ? "" : webUrl;
        c4515c0 = (i & 32) != 0 ? null : c4515c0;
        AbstractC5830k.m5330g(id, "id");
        AbstractC5830k.m5330g(title, "title");
        AbstractC5830k.m5330g(sourceType, "sourceType");
        AbstractC5830k.m5330g(imageSource, "imageSource");
        AbstractC5830k.m5330g(webUrl, "webUrl");
        this.f6301a = id;
        this.f6302b = title;
        this.f6303c = sourceType;
        this.f6304d = imageSource;
        this.f6305e = webUrl;
        this.f6306f = c4515c0;
    }
}
