package com.zykj.view.widget;

/* renamed from: com.zykj.view.widget.a */
/* loaded from: classes3.dex */
public final /* synthetic */ class RunnableC5394a implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f8343a;

    /* renamed from: b */
    public final /* synthetic */ SketchProgressView f8344b;

    public /* synthetic */ RunnableC5394a(SketchProgressView sketchProgressView, int i) {
        this.f8343a = i;
        this.f8344b = sketchProgressView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f8343a) {
            case 0:
                this.f8344b.setVisibility(8);
                break;
            default:
                this.f8344b.setVisibility(0);
                break;
        }
    }
}
