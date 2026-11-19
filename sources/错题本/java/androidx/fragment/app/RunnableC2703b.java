package androidx.fragment.app;

import androidx.fragment.app.DefaultSpecialEffectsController;
import androidx.fragment.app.DefaultSpecialEffectsController$TransitionEffect$onStart$4;
import java.util.ArrayList;
import kotlin.jvm.internal.Ref$ObjectRef;

/* renamed from: androidx.fragment.app.b */
/* loaded from: classes2.dex */
public final /* synthetic */ class RunnableC2703b implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f1095a;

    /* renamed from: b */
    public final /* synthetic */ Object f1096b;

    public /* synthetic */ RunnableC2703b(Object obj, int i) {
        this.f1095a = i;
        this.f1096b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f1095a) {
            case 0:
                DefaultSpecialEffectsController.TransitionEffect.createMergedTransition$lambda$14((ArrayList) this.f1096b);
                break;
            case 1:
                DefaultSpecialEffectsController.TransitionEffect.onStart$lambda$6$lambda$4((Ref$ObjectRef) this.f1096b);
                break;
            case 2:
                DefaultSpecialEffectsController$TransitionEffect$onStart$4.C26411.invoke$lambda$4((DefaultSpecialEffectsController.TransitionEffect) this.f1096b);
                break;
            case 3:
                ((Fragment) this.f1096b).lambda$performCreateView$0();
                break;
            default:
                ((FragmentManager) this.f1096b).lambda$cancelBackStackTransition$4();
                break;
        }
    }
}
