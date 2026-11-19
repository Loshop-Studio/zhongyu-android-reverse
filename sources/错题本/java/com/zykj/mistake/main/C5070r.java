package com.zykj.mistake.main;

import com.zykj.mistake.platform.picker.CollectionDatePickerTarget;
import kotlin.jvm.internal.AbstractC5830k;

/* renamed from: com.zykj.mistake.main.r */
/* loaded from: classes3.dex */
public final class C5070r extends AbstractC5020a0 {

    /* renamed from: a */
    public final CollectionDatePickerTarget f7958a;

    public C5070r(CollectionDatePickerTarget target) {
        AbstractC5830k.m5330g(target, "target");
        this.f7958a = target;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C5070r) && this.f7958a == ((C5070r) obj).f7958a;
    }

    public final int hashCode() {
        return this.f7958a.hashCode();
    }

    public final String toString() {
        return "CollectionCustomTimeReset(target=" + this.f7958a + ")";
    }
}
