package androidx.core.view;

import android.view.Lifecycle;
import android.view.LifecycleEventObserver;
import android.view.LifecycleOwner;
import android.view.compose.LifecycleEffectKt;
import android.view.compose.LifecycleResumePauseEffectScope;
import android.view.compose.LifecycleStartStopEffectScope;
import java.io.Serializable;
import kotlin.jvm.internal.Ref$ObjectRef;
import p152r6.InterfaceC6471c;

/* renamed from: androidx.core.view.e */
/* loaded from: classes2.dex */
public final /* synthetic */ class C2513e implements LifecycleEventObserver {

    /* renamed from: a */
    public final /* synthetic */ int f1048a;

    /* renamed from: b */
    public final /* synthetic */ Object f1049b;

    /* renamed from: c */
    public final /* synthetic */ Serializable f1050c;

    /* renamed from: d */
    public final /* synthetic */ Object f1051d;

    public /* synthetic */ C2513e(int i, Serializable serializable, Object obj, Object obj2) {
        this.f1048a = i;
        this.f1049b = obj;
        this.f1050c = serializable;
        this.f1051d = obj2;
    }

    @Override // android.view.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        switch (this.f1048a) {
            case 0:
                ((MenuHostHelper) this.f1049b).lambda$addMenuProvider$1((Lifecycle.State) this.f1050c, (MenuProvider) this.f1051d, lifecycleOwner, event);
                break;
            case 1:
                LifecycleEffectKt.LifecycleStartEffectImpl$lambda$19$lambda$18$lambda$16((LifecycleStartStopEffectScope) this.f1049b, (Ref$ObjectRef) this.f1050c, (InterfaceC6471c) this.f1051d, lifecycleOwner, event);
                break;
            default:
                LifecycleEffectKt.LifecycleResumeEffectImpl$lambda$34$lambda$33$lambda$31((LifecycleResumePauseEffectScope) this.f1049b, (Ref$ObjectRef) this.f1050c, (InterfaceC6471c) this.f1051d, lifecycleOwner, event);
                break;
        }
    }
}
