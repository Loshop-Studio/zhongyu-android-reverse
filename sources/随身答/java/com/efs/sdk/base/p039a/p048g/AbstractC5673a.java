package com.efs.sdk.base.p039a.p048g;

import com.efs.sdk.base.p039a.p047f.C5670b;
import com.efs.sdk.base.p039a.p048g.p049a.AbstractC5674a;
import com.efs.sdk.base.p039a.p050h.C5697d;

/* renamed from: com.efs.sdk.base.a.g.a */
/* loaded from: classes3.dex */
public abstract class AbstractC5673a {

    /* renamed from: a */
    private AbstractC5674a f4730a;

    /* renamed from: a */
    public abstract AbstractC5674a mo4129a();

    /* renamed from: a */
    public final void m4130a(C5670b c5670b) {
        try {
            if (this.f4730a == null) {
                synchronized (this) {
                    try {
                        if (this.f4730a == null) {
                            AbstractC5674a abstractC5674aMo4129a = mo4129a();
                            this.f4730a = abstractC5674aMo4129a;
                            if (abstractC5674aMo4129a == null) {
                                return;
                            }
                        }
                    } finally {
                    }
                }
            }
            this.f4730a.mo4131a(c5670b);
        } catch (Throwable th) {
            C5697d.m4183b("efs.processor", "log handle error", th);
        }
    }
}
