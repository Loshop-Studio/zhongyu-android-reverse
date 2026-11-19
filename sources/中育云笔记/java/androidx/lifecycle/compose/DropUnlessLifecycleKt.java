package androidx.lifecycle.compose;

import androidx.annotation.CheckResult;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import p181hd.InterfaceC9529a;
import p309qc.C10786q;

/* loaded from: classes2.dex */
public final class DropUnlessLifecycleKt {
    @CheckResult
    @Composable
    public static final InterfaceC9529a dropUnlessResumed(LifecycleOwner lifecycleOwner, InterfaceC9529a interfaceC9529a, Composer composer, int i10, int i11) {
        if ((i11 & 1) != 0) {
            lifecycleOwner = (LifecycleOwner) composer.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner());
        }
        LifecycleOwner lifecycleOwner2 = lifecycleOwner;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1331131589, i10, -1, "androidx.lifecycle.compose.dropUnlessResumed (DropUnlessLifecycle.kt:99)");
        }
        int i12 = i10 << 3;
        InterfaceC9529a interfaceC9529aDropUnlessStateIsAtLeast = dropUnlessStateIsAtLeast(Lifecycle.State.RESUMED, lifecycleOwner2, interfaceC9529a, composer, (i12 & 112) | 6 | (i12 & 896), 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return interfaceC9529aDropUnlessStateIsAtLeast;
    }

    @CheckResult
    @Composable
    public static final InterfaceC9529a dropUnlessStarted(LifecycleOwner lifecycleOwner, InterfaceC9529a interfaceC9529a, Composer composer, int i10, int i11) {
        if ((i11 & 1) != 0) {
            lifecycleOwner = (LifecycleOwner) composer.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner());
        }
        LifecycleOwner lifecycleOwner2 = lifecycleOwner;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1207869935, i10, -1, "androidx.lifecycle.compose.dropUnlessStarted (DropUnlessLifecycle.kt:77)");
        }
        int i12 = i10 << 3;
        InterfaceC9529a interfaceC9529aDropUnlessStateIsAtLeast = dropUnlessStateIsAtLeast(Lifecycle.State.STARTED, lifecycleOwner2, interfaceC9529a, composer, (i12 & 112) | 6 | (i12 & 896), 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return interfaceC9529aDropUnlessStateIsAtLeast;
    }

    @CheckResult
    @Composable
    private static final InterfaceC9529a dropUnlessStateIsAtLeast(final Lifecycle.State state, final LifecycleOwner lifecycleOwner, final InterfaceC9529a interfaceC9529a, Composer composer, int i10, int i11) {
        if ((i11 & 2) != 0) {
            lifecycleOwner = (LifecycleOwner) composer.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner());
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-2057956404, i10, -1, "androidx.lifecycle.compose.dropUnlessStateIsAtLeast (DropUnlessLifecycle.kt:47)");
        }
        if (state == Lifecycle.State.DESTROYED) {
            throw new IllegalArgumentException("Target state is not allowed to be `Lifecycle.State.DESTROYED` because Compose disposes of the composition before `Lifecycle.Event.ON_DESTROY` observers are invoked.");
        }
        boolean zChangedInstance = composer.changedInstance(lifecycleOwner) | ((((i10 & 14) ^ 6) > 4 && composer.changed(state.ordinal())) || (i10 & 6) == 4) | ((((i10 & 896) ^ 384) > 256 && composer.changed(interfaceC9529a)) || (i10 & 384) == 256);
        Object objRememberedValue = composer.rememberedValue();
        if (zChangedInstance || objRememberedValue == Composer.Companion.getEmpty()) {
            objRememberedValue = new InterfaceC9529a() { // from class: androidx.lifecycle.compose.a
                @Override // p181hd.InterfaceC9529a
                public final Object invoke() {
                    return DropUnlessLifecycleKt.dropUnlessStateIsAtLeast$lambda$2$lambda$1(lifecycleOwner, state, interfaceC9529a);
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        InterfaceC9529a interfaceC9529a2 = (InterfaceC9529a) objRememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return interfaceC9529a2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C10786q dropUnlessStateIsAtLeast$lambda$2$lambda$1(LifecycleOwner lifecycleOwner, Lifecycle.State state, InterfaceC9529a interfaceC9529a) {
        if (lifecycleOwner.getLifecycle().getCurrentState().isAtLeast(state)) {
            interfaceC9529a.invoke();
        }
        return C10786q.f26013a;
    }
}
