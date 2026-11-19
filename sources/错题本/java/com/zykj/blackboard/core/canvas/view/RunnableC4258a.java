package com.zykj.blackboard.core.canvas.view;

/* renamed from: com.zykj.blackboard.core.canvas.view.a */
/* loaded from: classes3.dex */
public final /* synthetic */ class RunnableC4258a implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f5190a;

    /* renamed from: b */
    public final /* synthetic */ MaskView f5191b;

    public /* synthetic */ RunnableC4258a(MaskView maskView, int i) {
        this.f5190a = i;
        this.f5191b = maskView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f5190a) {
            case 0:
                MaskView.m13759hide$lambda5(this.f5191b);
                break;
            default:
                MaskView.m13760show$lambda4(this.f5191b);
                break;
        }
    }
}
