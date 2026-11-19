package com.zykj.mistake.feature.notebook.detail;

import java.io.File;
import kotlin.jvm.internal.AbstractC5830k;

/* renamed from: com.zykj.mistake.feature.notebook.detail.g4 */
/* loaded from: classes3.dex */
public final class C4802g4 extends AbstractC4808h4 {

    /* renamed from: a */
    public final File f7002a;

    public C4802g4(File strokeFile) {
        AbstractC5830k.m5330g(strokeFile, "strokeFile");
        this.f7002a = strokeFile;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C4802g4) && AbstractC5830k.m5325b(this.f7002a, ((C4802g4) obj).f7002a);
    }

    public final int hashCode() {
        return this.f7002a.hashCode();
    }

    public final String toString() {
        return "Upload(strokeFile=" + this.f7002a + ")";
    }
}
