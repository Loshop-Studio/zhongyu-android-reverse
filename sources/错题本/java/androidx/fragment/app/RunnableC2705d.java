package androidx.fragment.app;

import android.view.ViewGroup;
import androidx.fragment.app.DefaultSpecialEffectsController;
import androidx.fragment.app.DefaultSpecialEffectsController$TransitionEffect$onStart$4;
import androidx.fragment.app.SpecialEffectsController;

/* renamed from: androidx.fragment.app.d */
/* loaded from: classes2.dex */
public final /* synthetic */ class RunnableC2705d implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f1100a;

    /* renamed from: b */
    public final /* synthetic */ Object f1101b;

    /* renamed from: c */
    public final /* synthetic */ Object f1102c;

    public /* synthetic */ RunnableC2705d(int i, Object obj, Object obj2) {
        this.f1100a = i;
        this.f1101b = obj;
        this.f1102c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f1100a) {
            case 0:
                DefaultSpecialEffectsController$TransitionEffect$onStart$4.C26411.invoke$lambda$2((DefaultSpecialEffectsController.TransitionEffect) this.f1101b, (ViewGroup) this.f1102c);
                break;
            default:
                DefaultSpecialEffectsController.collectEffects$lambda$2((DefaultSpecialEffectsController) this.f1101b, (SpecialEffectsController.Operation) this.f1102c);
                break;
        }
    }
}
