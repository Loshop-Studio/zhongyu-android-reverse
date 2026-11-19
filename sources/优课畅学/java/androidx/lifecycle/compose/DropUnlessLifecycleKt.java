package androidx.lifecycle.compose;

import androidx.annotation.CheckResult;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.tencent.smtt.sdk.TbsListener;
import p123h7.C8736p;
import p300x7.InterfaceC10559a;

/* loaded from: classes3.dex */
public final class DropUnlessLifecycleKt {
    @CheckResult
    @Composable
    public static final InterfaceC10559a dropUnlessResumed(LifecycleOwner lifecycleOwner, InterfaceC10559a interfaceC10559a, Composer composer, int i10, int i11) {
        if ((i11 & 1) != 0) {
            lifecycleOwner = (LifecycleOwner) composer.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner());
        }
        LifecycleOwner lifecycleOwner2 = lifecycleOwner;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1331131589, i10, -1, "androidx.lifecycle.compose.dropUnlessResumed (DropUnlessLifecycle.kt:99)");
        }
        int i12 = i10 << 3;
        InterfaceC10559a interfaceC10559aDropUnlessStateIsAtLeast = dropUnlessStateIsAtLeast(Lifecycle.State.RESUMED, lifecycleOwner2, interfaceC10559a, composer, (i12 & TbsListener.ErrorCode.DOWNLOAD_OVER_FLOW) | 6 | (i12 & 896), 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return interfaceC10559aDropUnlessStateIsAtLeast;
    }

    @CheckResult
    @Composable
    public static final InterfaceC10559a dropUnlessStarted(LifecycleOwner lifecycleOwner, InterfaceC10559a interfaceC10559a, Composer composer, int i10, int i11) {
        if ((i11 & 1) != 0) {
            lifecycleOwner = (LifecycleOwner) composer.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner());
        }
        LifecycleOwner lifecycleOwner2 = lifecycleOwner;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1207869935, i10, -1, "androidx.lifecycle.compose.dropUnlessStarted (DropUnlessLifecycle.kt:77)");
        }
        int i12 = i10 << 3;
        InterfaceC10559a interfaceC10559aDropUnlessStateIsAtLeast = dropUnlessStateIsAtLeast(Lifecycle.State.STARTED, lifecycleOwner2, interfaceC10559a, composer, (i12 & TbsListener.ErrorCode.DOWNLOAD_OVER_FLOW) | 6 | (i12 & 896), 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return interfaceC10559aDropUnlessStateIsAtLeast;
    }

    @CheckResult
    @Composable
    private static final InterfaceC10559a dropUnlessStateIsAtLeast(final Lifecycle.State state, final LifecycleOwner lifecycleOwner, final InterfaceC10559a interfaceC10559a, Composer composer, int i10, int i11) {
        if ((i11 & 2) != 0) {
            lifecycleOwner = (LifecycleOwner) composer.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner());
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-2057956404, i10, -1, "androidx.lifecycle.compose.dropUnlessStateIsAtLeast (DropUnlessLifecycle.kt:47)");
        }
        if (state == Lifecycle.State.DESTROYED) {
            throw new IllegalArgumentException("Target state is not allowed to be `Lifecycle.State.DESTROYED` because Compose disposes of the composition before `Lifecycle.Event.ON_DESTROY` observers are invoked.");
        }
        boolean zChangedInstance = composer.changedInstance(lifecycleOwner) | ((((i10 & 14) ^ 6) > 4 && composer.changed(state.ordinal())) || (i10 & 6) == 4) | ((((i10 & 896) ^ 384) > 256 && composer.changed(interfaceC10559a)) || (i10 & 384) == 256);
        Object objRememberedValue = composer.rememberedValue();
        if (zChangedInstance || objRememberedValue == Composer.Companion.getEmpty()) {
            objRememberedValue = new InterfaceC10559a() { // from class: androidx.lifecycle.compose.a
                @Override // p300x7.InterfaceC10559a
                public final Object invoke() {
                    return DropUnlessLifecycleKt.dropUnlessStateIsAtLeast$lambda$2$lambda$1(lifecycleOwner, state, interfaceC10559a);
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        InterfaceC10559a interfaceC10559a2 = (InterfaceC10559a) objRememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return interfaceC10559a2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C8736p dropUnlessStateIsAtLeast$lambda$2$lambda$1(LifecycleOwner lifecycleOwner, Lifecycle.State state, InterfaceC10559a interfaceC10559a) {
        if (lifecycleOwner.getLifecycle().getCurrentState().isAtLeast(state)) {
            interfaceC10559a.invoke();
        }
        return C8736p.f16368a;
    }
}
