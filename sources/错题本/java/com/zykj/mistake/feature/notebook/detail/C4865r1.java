package com.zykj.mistake.feature.notebook.detail;

import android.support.v4.media.AbstractC0037f;
import kotlin.jvm.internal.AbstractC5830k;

/* renamed from: com.zykj.mistake.feature.notebook.detail.r1 */
/* loaded from: classes3.dex */
public final class C4865r1 extends AbstractC4813i3 {

    /* renamed from: a */
    public final String f7281a;

    public C4865r1(String name) {
        AbstractC5830k.m5330g(name, "name");
        this.f7281a = name;
    }

    /* renamed from: a */
    public final String m4236a() {
        return this.f7281a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C4865r1) && AbstractC5830k.m5325b(this.f7281a, ((C4865r1) obj).f7281a);
    }

    public final int hashCode() {
        return this.f7281a.hashCode();
    }

    public final String toString() {
        return AbstractC0037f.m86k("ChangeCreateCollectionName(name=", this.f7281a, ")");
    }
}
