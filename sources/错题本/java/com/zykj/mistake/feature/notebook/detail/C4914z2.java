package com.zykj.mistake.feature.notebook.detail;

import java.util.List;
import kotlin.jvm.internal.AbstractC5830k;

/* renamed from: com.zykj.mistake.feature.notebook.detail.z2 */
/* loaded from: classes3.dex */
public final class C4914z2 extends AbstractC4813i3 {

    /* renamed from: a */
    public final List f7428a;

    public C4914z2(List pictureNotes) {
        AbstractC5830k.m5330g(pictureNotes, "pictureNotes");
        this.f7428a = pictureNotes;
    }

    /* renamed from: a */
    public final List m4284a() {
        return this.f7428a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C4914z2) && AbstractC5830k.m5325b(this.f7428a, ((C4914z2) obj).f7428a);
    }

    public final int hashCode() {
        return this.f7428a.hashCode();
    }

    public final String toString() {
        return "ReorderPictureNotes(pictureNotes=" + this.f7428a + ")";
    }
}
