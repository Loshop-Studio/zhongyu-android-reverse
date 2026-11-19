package com.zykj.mistake.feature.notebook.list;

import android.support.v4.media.AbstractC0037f;
import androidx.collection.AbstractC0584a;
import androidx.compose.p011ui.graphics.Color;
import kotlin.jvm.internal.AbstractC5830k;

/* renamed from: com.zykj.mistake.feature.notebook.list.l1 */
/* loaded from: classes3.dex */
public final class C4962l1 {

    /* renamed from: a */
    public final String f7580a;

    /* renamed from: b */
    public final float f7581b;

    /* renamed from: c */
    public final float f7582c;

    /* renamed from: d */
    public final long f7583d;

    /* renamed from: e */
    public final int f7584e;

    public C4962l1(String str, float f, float f7, long j7, int i) {
        this.f7580a = str;
        this.f7581b = f;
        this.f7582c = f7;
        this.f7583d = j7;
        this.f7584e = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4962l1)) {
            return false;
        }
        C4962l1 c4962l1 = (C4962l1) obj;
        return AbstractC5830k.m5325b(this.f7580a, c4962l1.f7580a) && Float.compare(this.f7581b, c4962l1.f7581b) == 0 && Float.compare(this.f7582c, c4962l1.f7582c) == 0 && Color.m10683equalsimpl0(this.f7583d, c4962l1.f7583d) && this.f7584e == c4962l1.f7584e;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f7584e) + AbstractC0584a.m904e(this.f7583d, AbstractC0584a.m901b(this.f7582c, AbstractC0584a.m901b(this.f7581b, this.f7580a.hashCode() * 31, 31), 31), 31);
    }

    public final String toString() {
        String strM10690toStringimpl = Color.m10690toStringimpl(this.f7583d);
        StringBuilder sb = new StringBuilder("MistakeTagDrawInfo(text=");
        sb.append(this.f7580a);
        sb.append(", x=");
        sb.append(this.f7581b);
        sb.append(", width=");
        sb.append(this.f7582c);
        sb.append(", backgroundColor=");
        sb.append(strM10690toStringimpl);
        sb.append(", textColor=");
        return AbstractC0037f.m90o(sb, ")", this.f7584e);
    }
}
