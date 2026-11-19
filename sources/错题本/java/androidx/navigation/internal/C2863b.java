package androidx.navigation.internal;

import android.view.Lifecycle;
import android.view.LifecycleEventObserver;
import android.view.LifecycleOwner;
import android.view.internal.SavedStateRegistryImpl;
import com.zykj.mistake.feature.notebook.detail.C4762a3;
import com.zykj.mistake.feature.notebook.detail.MistakeDetailNewViewModel;
import kotlin.jvm.internal.AbstractC5830k;

/* renamed from: androidx.navigation.internal.b */
/* loaded from: classes2.dex */
public final /* synthetic */ class C2863b implements LifecycleEventObserver {

    /* renamed from: a */
    public final /* synthetic */ int f1321a;

    /* renamed from: b */
    public final /* synthetic */ Object f1322b;

    public /* synthetic */ C2863b(Object obj, int i) {
        this.f1321a = i;
        this.f1322b = obj;
    }

    @Override // android.view.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        switch (this.f1321a) {
            case 0:
                NavControllerImpl.lifecycleObserver$lambda$1((NavControllerImpl) this.f1322b, lifecycleOwner, event);
                break;
            case 1:
                SavedStateRegistryImpl.performAttach$lambda$12((SavedStateRegistryImpl) this.f1322b, lifecycleOwner, event);
                break;
            default:
                MistakeDetailNewViewModel mistakeDetailNewViewModel = (MistakeDetailNewViewModel) this.f1322b;
                AbstractC5830k.m5330g(lifecycleOwner, "<unused var>");
                AbstractC5830k.m5330g(event, "event");
                if (event == Lifecycle.Event.ON_RESUME) {
                    mistakeDetailNewViewModel.m4162t(C4762a3.f6888a);
                    break;
                }
                break;
        }
    }
}
