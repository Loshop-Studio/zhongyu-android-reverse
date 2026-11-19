package com.zykj.sketch.core.record;

import java.io.IOException;
import p152r6.InterfaceC6469a;
import p152r6.InterfaceC6471c;

/* renamed from: com.zykj.sketch.core.record.b */
/* loaded from: classes3.dex */
public final /* synthetic */ class RunnableC5215b implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f8174a;

    /* renamed from: b */
    public final /* synthetic */ SketchRecorderView f8175b;

    /* renamed from: c */
    public final /* synthetic */ String f8176c;

    /* renamed from: d */
    public final /* synthetic */ InterfaceC6471c f8177d;

    /* renamed from: e */
    public final /* synthetic */ InterfaceC6469a f8178e;

    public /* synthetic */ RunnableC5215b(SketchRecorderView sketchRecorderView, String str, InterfaceC6471c interfaceC6471c, InterfaceC6469a interfaceC6469a, int i) {
        this.f8174a = i;
        this.f8175b = sketchRecorderView;
        this.f8176c = str;
        this.f8177d = interfaceC6471c;
        this.f8178e = interfaceC6469a;
    }

    @Override // java.lang.Runnable
    public final void run() throws IOException {
        switch (this.f8174a) {
            case 0:
                SketchRecorderView.m13880loadData$lambda12(this.f8175b, this.f8176c, this.f8177d, this.f8178e);
                break;
            default:
                SketchRecorderView.m13881loadData$lambda12$lambda11(this.f8175b, this.f8176c, this.f8177d, this.f8178e);
                break;
        }
    }
}
