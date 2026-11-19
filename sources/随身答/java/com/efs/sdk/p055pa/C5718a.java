package com.efs.sdk.p055pa;

/* renamed from: com.efs.sdk.pa.a */
/* loaded from: classes3.dex */
public final class C5718a implements PAANRListener {

    /* renamed from: a */
    private PAFactory f4794a;

    /* renamed from: b */
    private PATraceListener f4795b;

    public C5718a(PAFactory pAFactory) {
        this.f4794a = pAFactory;
        this.f4795b = pAFactory.getTraceListener();
        boolean zEnableTracer = pAFactory.getConfigManager().enableTracer();
        if (zEnableTracer) {
            C5727c.m4213a(this.f4794a, "patracepv", null);
        }
        PATraceListener pATraceListener = this.f4795b;
        if (pATraceListener != null) {
            pATraceListener.onCheck(zEnableTracer);
        }
    }

    @Override // com.efs.sdk.p055pa.PAANRListener
    public final void anrStack(String str) {
        if (str == null || str.length() <= 200) {
            return;
        }
        C5727c.m4213a(this.f4794a, "patrace", str);
        PATraceListener pATraceListener = this.f4795b;
        if (pATraceListener != null) {
            pATraceListener.onAnrTrace();
        }
    }

    @Override // com.efs.sdk.p055pa.PAANRListener
    public final void unexcept(Object obj) {
        PATraceListener pATraceListener = this.f4795b;
        if (pATraceListener != null) {
            pATraceListener.onUnexcept(obj);
        }
    }
}
