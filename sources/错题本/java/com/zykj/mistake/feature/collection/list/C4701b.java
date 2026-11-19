package com.zykj.mistake.feature.collection.list;

import android.support.v4.media.AbstractC0037f;
import androidx.collection.AbstractC0584a;
import kotlin.jvm.internal.AbstractC5830k;

/* renamed from: com.zykj.mistake.feature.collection.list.b */
/* loaded from: classes3.dex */
public final class C4701b {

    /* renamed from: a */
    public final String f6746a;

    /* renamed from: b */
    public final String f6747b;

    /* renamed from: c */
    public final int f6748c;

    /* renamed from: d */
    public final String f6749d;

    public C4701b(int i, String id, String title, String str) {
        AbstractC5830k.m5330g(id, "id");
        AbstractC5830k.m5330g(title, "title");
        this.f6746a = id;
        this.f6747b = title;
        this.f6748c = i;
        this.f6749d = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4701b)) {
            return false;
        }
        C4701b c4701b = (C4701b) obj;
        return AbstractC5830k.m5325b(this.f6746a, c4701b.f6746a) && AbstractC5830k.m5325b(this.f6747b, c4701b.f6747b) && this.f6748c == c4701b.f6748c && AbstractC5830k.m5325b(this.f6749d, c4701b.f6749d);
    }

    public final int hashCode() {
        return this.f6749d.hashCode() + AbstractC0584a.m902c(this.f6748c, AbstractC0584a.m903d(this.f6746a.hashCode() * 31, 31, this.f6747b), 31);
    }

    public final String toString() {
        StringBuilder sbM101z = AbstractC0037f.m101z("CollectionItemUiState(id=", this.f6746a, ", title=", this.f6747b, ", mistakeCount=");
        sbM101z.append(this.f6748c);
        sbM101z.append(", date=");
        sbM101z.append(this.f6749d);
        sbM101z.append(")");
        return sbM101z.toString();
    }
}
