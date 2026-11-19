package com.zykj.mistake.main;

import com.zykj.mistake.platform.picker.CollectionDatePickerTarget;
import kotlin.jvm.internal.AbstractC5830k;

/* renamed from: com.zykj.mistake.main.u0 */
/* loaded from: classes3.dex */
public final class C5077u0 extends AbstractC5057l {

    /* renamed from: a */
    public final CollectionDatePickerTarget f7965a;

    public C5077u0(CollectionDatePickerTarget target) {
        AbstractC5830k.m5330g(target, "target");
        this.f7965a = target;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C5077u0) && this.f7965a == ((C5077u0) obj).f7965a;
    }

    public final int hashCode() {
        return this.f7965a.hashCode();
    }

    public final String toString() {
        return "ResetCollectionCustomTime(target=" + this.f7965a + ")";
    }
}
