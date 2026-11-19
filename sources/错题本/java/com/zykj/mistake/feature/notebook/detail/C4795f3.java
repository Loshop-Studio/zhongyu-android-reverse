package com.zykj.mistake.feature.notebook.detail;

import kotlin.jvm.internal.AbstractC5830k;

/* renamed from: com.zykj.mistake.feature.notebook.detail.f3 */
/* loaded from: classes3.dex */
public final class C4795f3 extends AbstractC4813i3 {

    /* renamed from: a */
    public final int f6990a;

    /* renamed from: b */
    public final String f6991b;

    public C4795f3(int i, String path) {
        AbstractC5830k.m5330g(path, "path");
        this.f6990a = i;
        this.f6991b = path;
    }

    /* renamed from: a */
    public final int m4185a() {
        return this.f6990a;
    }

    /* renamed from: b */
    public final String m4186b() {
        return this.f6991b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4795f3)) {
            return false;
        }
        C4795f3 c4795f3 = (C4795f3) obj;
        return this.f6990a == c4795f3.f6990a && AbstractC5830k.m5325b(this.f6991b, c4795f3.f6991b);
    }

    public final int hashCode() {
        return this.f6991b.hashCode() + (Integer.hashCode(this.f6990a) * 31);
    }

    public final String toString() {
        return "StemSnapshotReady(itemId=" + this.f6990a + ", path=" + this.f6991b + ")";
    }
}
