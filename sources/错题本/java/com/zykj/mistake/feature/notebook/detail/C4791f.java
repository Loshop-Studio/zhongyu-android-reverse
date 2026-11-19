package com.zykj.mistake.feature.notebook.detail;

import android.support.v4.media.AbstractC0037f;
import androidx.collection.AbstractC0584a;
import java.util.List;
import kotlin.jvm.internal.AbstractC5830k;

/* renamed from: com.zykj.mistake.feature.notebook.detail.f */
/* loaded from: classes3.dex */
public final class C4791f {

    /* renamed from: a */
    public final String f6981a;

    /* renamed from: b */
    public final String f6982b;

    /* renamed from: c */
    public final List f6983c;

    /* renamed from: d */
    public final int f6984d;

    public C4791f(String path, String str, List stemPathList, int i) {
        AbstractC5830k.m5330g(path, "path");
        AbstractC5830k.m5330g(stemPathList, "stemPathList");
        this.f6981a = path;
        this.f6982b = str;
        this.f6983c = stemPathList;
        this.f6984d = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4791f)) {
            return false;
        }
        C4791f c4791f = (C4791f) obj;
        return AbstractC5830k.m5325b(this.f6981a, c4791f.f6981a) && AbstractC5830k.m5325b(this.f6982b, c4791f.f6982b) && AbstractC5830k.m5325b(this.f6983c, c4791f.f6983c) && this.f6984d == c4791f.f6984d;
    }

    public final int hashCode() {
        int iHashCode = this.f6981a.hashCode() * 31;
        String str = this.f6982b;
        return Integer.hashCode(this.f6984d) + AbstractC0584a.m907h(this.f6983c, (iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31);
    }

    public final String toString() {
        StringBuilder sbM101z = AbstractC0037f.m101z("DraftLoadKey(path=", this.f6981a, ", stemUrl=", this.f6982b, ", stemPathList=");
        sbM101z.append(this.f6983c);
        sbM101z.append(", draftRestoreVersion=");
        sbM101z.append(this.f6984d);
        sbM101z.append(")");
        return sbM101z.toString();
    }
}
