package com.zykj.view.board.crop;

import com.zykj.view.board.crop.BlackboardCropFragment;
import p152r6.InterfaceC6471c;

/* renamed from: com.zykj.view.board.crop.b */
/* loaded from: classes3.dex */
public final /* synthetic */ class C5323b implements InterfaceC6471c {

    /* renamed from: a */
    public final /* synthetic */ int f8256a;

    /* renamed from: b */
    public final /* synthetic */ BlackboardCropFragment f8257b;

    public /* synthetic */ C5323b(int i, BlackboardCropFragment blackboardCropFragment) {
        this.f8256a = i;
        this.f8257b = blackboardCropFragment;
    }

    @Override // p152r6.InterfaceC6471c
    public final Object invoke(Object obj) {
        switch (this.f8256a) {
            case 0:
                return BlackboardCropFragment.load$lambda$17(this.f8257b, ((Integer) obj).intValue());
            case 1:
                return BlackboardCropFragment.load$lambda$17$lambda$16$lambda$12(this.f8257b, ((Integer) obj).intValue());
            case 2:
                return BlackboardCropFragment.load$lambda$17$lambda$16$lambda$13(this.f8257b, (Throwable) obj);
            case 3:
                return BlackboardCropFragment.initView$lambda$6$lambda$4(this.f8257b, ((Integer) obj).intValue());
            case 4:
                return BlackboardCropFragment.C53203.onStopTrackingTouch$lambda$1(this.f8257b, ((Integer) obj).intValue());
            default:
                return BlackboardCropFragment.C53214.onStopTrackingTouch$lambda$1(this.f8257b, ((Integer) obj).intValue());
        }
    }
}
