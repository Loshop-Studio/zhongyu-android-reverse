package kotlinx.serialization.json.internal;

import kotlin.jvm.internal.AbstractC5830k;
import p016b0.C3080k0;
import p041d2.C5413c;

/* renamed from: kotlinx.serialization.json.internal.f */
/* loaded from: classes4.dex */
public final class C6025f extends C3080k0 {

    /* renamed from: c */
    public final boolean f9550c;

    public C6025f(C5413c c5413c, boolean z8) {
        super(c5413c);
        this.f9550c = z8;
    }

    @Override // p016b0.C3080k0
    /* renamed from: h */
    public final void mo2038h(String value) {
        AbstractC5830k.m5330g(value, "value");
        if (this.f9550c) {
            super.mo2038h(value);
        } else {
            m2036f(value);
        }
    }
}
