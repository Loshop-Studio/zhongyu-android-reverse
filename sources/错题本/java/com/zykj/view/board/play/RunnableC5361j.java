package com.zykj.view.board.play;

/* renamed from: com.zykj.view.board.play.j */
/* loaded from: classes3.dex */
public final /* synthetic */ class RunnableC5361j implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f8308a;

    /* renamed from: b */
    public final /* synthetic */ SketchPlayFragment f8309b;

    public /* synthetic */ RunnableC5361j(SketchPlayFragment sketchPlayFragment, int i) {
        this.f8308a = i;
        this.f8309b = sketchPlayFragment;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f8308a) {
            case 0:
                SketchPlayFragment$playStatusListener$2$1.onPlayPause$lambda$1(this.f8309b);
                break;
            case 1:
                SketchPlayFragment$playStatusListener$2$1.onPlayEnd$lambda$0(this.f8309b);
                break;
            case 2:
                SketchPlayFragment$playStatusListener$2$1.onPlayStart$lambda$2(this.f8309b);
                break;
            default:
                SketchPlayFragment$playStatusListener$2$1.onPlayWait$lambda$3(this.f8309b);
                break;
        }
    }
}
