package android.view;

import android.view.Lifecycle;
import kotlinx.coroutines.channels.InterfaceC5884m;
import kotlinx.coroutines.flow.C5946n0;

/* renamed from: androidx.lifecycle.g */
/* loaded from: classes2.dex */
public final /* synthetic */ class C2762g implements LifecycleEventObserver {

    /* renamed from: a */
    public final /* synthetic */ int f1175a;

    /* renamed from: b */
    public final /* synthetic */ Object f1176b;

    public /* synthetic */ C2762g(Object obj, int i) {
        this.f1175a = i;
        this.f1176b = obj;
    }

    @Override // android.view.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        switch (this.f1175a) {
            case 0:
                LifecycleKt$eventFlow$1.invokeSuspend$lambda$0((InterfaceC5884m) this.f1176b, lifecycleOwner, event);
                break;
            default:
                Lifecycle._get_currentStateFlow_$lambda$0((C5946n0) this.f1176b, lifecycleOwner, event);
                break;
        }
    }
}
