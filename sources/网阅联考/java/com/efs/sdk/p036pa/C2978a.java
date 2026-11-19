package com.efs.sdk.p036pa;

/* renamed from: com.efs.sdk.pa.a */
/* loaded from: classes2.dex */
public final class C2978a implements PAANRListener {

    /* renamed from: a */
    private PAFactory f1190a;

    /* renamed from: b */
    private PATraceListener f1191b;

    public C2978a(PAFactory pAFactory) {
        this.f1190a = pAFactory;
        this.f1191b = pAFactory.getTraceListener();
        boolean zEnableTracer = pAFactory.getConfigManager().enableTracer();
        if (zEnableTracer) {
            C2987c.m2244a(this.f1190a, "patracepv", null);
        }
        PATraceListener pATraceListener = this.f1191b;
        if (pATraceListener != null) {
            pATraceListener.onCheck(zEnableTracer);
        }
    }

    @Override // com.efs.sdk.p036pa.PAANRListener
    public final void anrStack(String str) {
        if (str == null || str.length() <= 200) {
            return;
        }
        C2987c.m2244a(this.f1190a, "patrace", str);
        PATraceListener pATraceListener = this.f1191b;
        if (pATraceListener != null) {
            pATraceListener.onAnrTrace();
        }
    }

    @Override // com.efs.sdk.p036pa.PAANRListener
    public final void unexcept(Object obj) {
        PATraceListener pATraceListener = this.f1191b;
        if (pATraceListener != null) {
            pATraceListener.onUnexcept(obj);
        }
    }
}
