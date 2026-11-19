package androidx.fragment.app;

import androidx.fragment.app.DefaultSpecialEffectsController;
import androidx.fragment.app.SpecialEffectsController;

/* renamed from: androidx.fragment.app.c */
/* loaded from: classes2.dex */
public final /* synthetic */ class RunnableC2704c implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f1097a;

    /* renamed from: b */
    public final /* synthetic */ SpecialEffectsController.Operation f1098b;

    /* renamed from: c */
    public final /* synthetic */ DefaultSpecialEffectsController.TransitionEffect f1099c;

    public /* synthetic */ RunnableC2704c(SpecialEffectsController.Operation operation, DefaultSpecialEffectsController.TransitionEffect transitionEffect, int i) {
        this.f1097a = i;
        this.f1098b = operation;
        this.f1099c = transitionEffect;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f1097a) {
            case 0:
                DefaultSpecialEffectsController.TransitionEffect.onStart$lambda$6$lambda$5(this.f1098b, this.f1099c);
                break;
            default:
                DefaultSpecialEffectsController.TransitionEffect.onCommit$lambda$11$lambda$10(this.f1098b, this.f1099c);
                break;
        }
    }
}
