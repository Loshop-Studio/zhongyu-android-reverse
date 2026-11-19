package com.zykj.view.board.crop;

import p152r6.InterfaceC6469a;

/* renamed from: com.zykj.view.board.crop.a */
/* loaded from: classes3.dex */
public final /* synthetic */ class C5322a implements InterfaceC6469a {

    /* renamed from: a */
    public final /* synthetic */ int f8254a;

    /* renamed from: b */
    public final /* synthetic */ BlackboardCropFragment f8255b;

    public /* synthetic */ C5322a(int i, BlackboardCropFragment blackboardCropFragment) {
        this.f8254a = i;
        this.f8255b = blackboardCropFragment;
    }

    @Override // p152r6.InterfaceC6469a
    public final Object invoke() {
        switch (this.f8254a) {
            case 0:
                return BlackboardCropFragment.load$lambda$17$lambda$16$lambda$15$lambda$14(this.f8255b);
            case 1:
                return BlackboardCropFragment.load$lambda$21$lambda$20$lambda$19(this.f8255b);
            case 2:
                return BlackboardCropFragment.initView$lambda$2$lambda$1(this.f8255b);
            case 3:
                return BlackboardCropFragment.load$lambda$17$lambda$16$lambda$15(this.f8255b);
            default:
                return BlackboardCropFragment.load$lambda$21$lambda$20(this.f8255b);
        }
    }
}
