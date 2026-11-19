package com.efs.sdk.base.p035a.p044g;

import com.efs.sdk.base.p035a.p043f.C1302b;
import com.efs.sdk.base.p035a.p044g.p045a.AbstractC1306a;
import com.efs.sdk.base.p035a.p046h.C1329d;

/* renamed from: com.efs.sdk.base.a.g.a */
/* loaded from: classes.dex */
public abstract class AbstractC1305a {

    /* renamed from: a */
    private AbstractC1306a f7096a;

    /* renamed from: a */
    public abstract AbstractC1306a mo5519a();

    /* renamed from: a */
    public final void m5520a(C1302b c1302b) {
        try {
            if (this.f7096a == null) {
                synchronized (this) {
                    if (this.f7096a == null) {
                        AbstractC1306a abstractC1306aMo5519a = mo5519a();
                        this.f7096a = abstractC1306aMo5519a;
                        if (abstractC1306aMo5519a == null) {
                            return;
                        }
                    }
                }
            }
            this.f7096a.mo5521a(c1302b);
        } catch (Throwable th) {
            C1329d.m5573b("efs.processor", "log handle error", th);
        }
    }
}
