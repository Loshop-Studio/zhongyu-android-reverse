package com.efs.sdk.base.p020a.p029g;

import com.efs.sdk.base.p020a.p028f.C2930b;
import com.efs.sdk.base.p020a.p029g.p030a.AbstractC2934a;
import com.efs.sdk.base.p020a.p031h.C2957d;

/* renamed from: com.efs.sdk.base.a.g.a */
/* loaded from: classes2.dex */
public abstract class AbstractC2933a {

    /* renamed from: a */
    private AbstractC2934a f1126a;

    /* renamed from: a */
    public abstract AbstractC2934a mo2160a();

    /* renamed from: a */
    public final void m2161a(C2930b c2930b) {
        try {
            if (this.f1126a == null) {
                synchronized (this) {
                    if (this.f1126a == null) {
                        AbstractC2934a abstractC2934aMo2160a = mo2160a();
                        this.f1126a = abstractC2934aMo2160a;
                        if (abstractC2934aMo2160a == null) {
                            return;
                        }
                    }
                }
            }
            this.f1126a.mo2162a(c2930b);
        } catch (Throwable th) {
            C2957d.m2214b("efs.processor", "log handle error", th);
        }
    }
}
