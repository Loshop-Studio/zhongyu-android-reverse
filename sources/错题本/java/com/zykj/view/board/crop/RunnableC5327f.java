package com.zykj.view.board.crop;

import androidx.fragment.app.Fragment;
import com.zykj.view.board.play.SketchPlayFragment;
import com.zykj.view.board.play.SketchPlayFragment$playStatusListener$2$1;

/* renamed from: com.zykj.view.board.crop.f */
/* loaded from: classes3.dex */
public final /* synthetic */ class RunnableC5327f implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f8264a;

    /* renamed from: b */
    public final /* synthetic */ long f8265b;

    /* renamed from: c */
    public final /* synthetic */ Fragment f8266c;

    public /* synthetic */ RunnableC5327f(Fragment fragment, long j7, int i) {
        this.f8264a = i;
        this.f8266c = fragment;
        this.f8265b = j7;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f8264a) {
            case 0:
                BlackboardCropFragment$load$2$1$1.onProgress$lambda$4((BlackboardCropFragment) this.f8266c, this.f8265b);
                break;
            default:
                SketchPlayFragment$playStatusListener$2$1.onProgress$lambda$4((SketchPlayFragment) this.f8266c, this.f8265b);
                break;
        }
    }
}
