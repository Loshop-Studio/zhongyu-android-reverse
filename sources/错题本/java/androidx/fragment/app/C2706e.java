package androidx.fragment.app;

import android.os.Bundle;
import android.view.SavedStateRegistry;

/* renamed from: androidx.fragment.app.e */
/* loaded from: classes2.dex */
public final /* synthetic */ class C2706e implements SavedStateRegistry.SavedStateProvider {

    /* renamed from: a */
    public final /* synthetic */ int f1103a;

    /* renamed from: b */
    public final /* synthetic */ Object f1104b;

    public /* synthetic */ C2706e(Object obj, int i) {
        this.f1103a = i;
        this.f1104b = obj;
    }

    @Override // androidx.savedstate.SavedStateRegistry.SavedStateProvider
    public final Bundle saveState() {
        switch (this.f1103a) {
            case 0:
                return ((FragmentActivity) this.f1104b).lambda$init$0();
            default:
                return ((FragmentManager) this.f1104b).lambda$attachController$5();
        }
    }
}
