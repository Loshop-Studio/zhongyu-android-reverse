package com.zykj.mistake.feature.ask;

import kotlin.jvm.internal.AbstractC5830k;

/* renamed from: com.zykj.mistake.feature.ask.s */
/* loaded from: classes3.dex */
public final class C4543s extends AbstractC4545u {

    /* renamed from: a */
    public final MistakeAskMaterialContract$MaterialType f6295a;

    /* renamed from: b */
    public final String f6296b;

    public C4543s(MistakeAskMaterialContract$MaterialType type, String itemId) {
        AbstractC5830k.m5330g(type, "type");
        AbstractC5830k.m5330g(itemId, "itemId");
        this.f6295a = type;
        this.f6296b = itemId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4543s)) {
            return false;
        }
        C4543s c4543s = (C4543s) obj;
        return this.f6295a == c4543s.f6295a && AbstractC5830k.m5325b(this.f6296b, c4543s.f6296b);
    }

    public final int hashCode() {
        return this.f6296b.hashCode() + (this.f6295a.hashCode() * 31);
    }

    public final String toString() {
        return "ToggleItem(type=" + this.f6295a + ", itemId=" + this.f6296b + ")";
    }
}
