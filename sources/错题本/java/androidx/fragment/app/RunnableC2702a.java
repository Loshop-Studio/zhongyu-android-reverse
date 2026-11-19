package androidx.fragment.app;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.DefaultSpecialEffectsController;
import androidx.fragment.app.SpecialEffectsController;

/* renamed from: androidx.fragment.app.a */
/* loaded from: classes2.dex */
public final /* synthetic */ class RunnableC2702a implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f1091a;

    /* renamed from: b */
    public final /* synthetic */ Object f1092b;

    /* renamed from: c */
    public final /* synthetic */ Object f1093c;

    /* renamed from: d */
    public final /* synthetic */ Object f1094d;

    public /* synthetic */ RunnableC2702a(Object obj, Object obj2, int i, Object obj3) {
        this.f1091a = i;
        this.f1092b = obj;
        this.f1093c = obj2;
        this.f1094d = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f1091a) {
            case 0:
                DefaultSpecialEffectsController$AnimationEffect$onCommit$1.onAnimationEnd$lambda$0((ViewGroup) this.f1092b, (View) this.f1093c, (DefaultSpecialEffectsController.AnimationEffect) this.f1094d);
                break;
            case 1:
                DefaultSpecialEffectsController.TransitionEffect.createMergedTransition$lambda$12((SpecialEffectsController.Operation) this.f1092b, (SpecialEffectsController.Operation) this.f1093c, (DefaultSpecialEffectsController.TransitionEffect) this.f1094d);
                break;
            default:
                DefaultSpecialEffectsController.TransitionEffect.createMergedTransition$lambda$13((FragmentTransitionImpl) this.f1092b, (View) this.f1093c, (Rect) this.f1094d);
                break;
        }
    }
}
