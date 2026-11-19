package com.zykj.view.board.crop;

/* renamed from: com.zykj.view.board.crop.c */
/* loaded from: classes3.dex */
public final /* synthetic */ class RunnableC5324c implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f8258a;

    /* renamed from: b */
    public final /* synthetic */ BlackboardCropFragment f8259b;

    public /* synthetic */ RunnableC5324c(int i, BlackboardCropFragment blackboardCropFragment) {
        this.f8258a = i;
        this.f8259b = blackboardCropFragment;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f8258a) {
            case 0:
                BlackboardCropFragment.load$lambda$21(this.f8259b);
                break;
            case 1:
                BlackboardCropFragment.initView$lambda$6$lambda$4$lambda$3(this.f8259b);
                break;
            case 2:
                this.f8259b.hideProgress();
                break;
            case 3:
                this.f8259b.hideProgress();
                break;
            case 4:
                BlackboardCropFragment$load$2$1$1.onPlayWait$lambda$3(this.f8259b);
                break;
            case 5:
                BlackboardCropFragment$load$2$1$1.onPlayPause$lambda$1(this.f8259b);
                break;
            case 6:
                BlackboardCropFragment$load$2$1$1.onPlayEnd$lambda$0(this.f8259b);
                break;
            default:
                BlackboardCropFragment$load$2$1$1.onPlayStart$lambda$2(this.f8259b);
                break;
        }
    }
}
