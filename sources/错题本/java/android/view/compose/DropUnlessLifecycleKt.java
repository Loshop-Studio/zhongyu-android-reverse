package android.view.compose;

import android.view.Lifecycle;
import android.view.LifecycleOwner;
import androidx.annotation.CheckResult;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p045d6.C5443s;
import p152r6.InterfaceC6469a;

@Metadata(m5109d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a5\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0003¢\u0006\u0004\b\u0007\u0010\b\u001a-\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0002\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0007¢\u0006\u0004\b\t\u0010\n\u001a-\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0002\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0007¢\u0006\u0004\b\u000b\u0010\n¨\u0006\f"}, m5110d2 = {"Landroidx/lifecycle/Lifecycle$State;", "state", "Landroidx/lifecycle/LifecycleOwner;", "lifecycleOwner", "Lkotlin/Function0;", "Ld6/s;", "block", "dropUnlessStateIsAtLeast", "(Landroidx/lifecycle/Lifecycle$State;Landroidx/lifecycle/LifecycleOwner;Lr6/a;Landroidx/compose/runtime/Composer;II)Lr6/a;", "dropUnlessStarted", "(Landroidx/lifecycle/LifecycleOwner;Lr6/a;Landroidx/compose/runtime/Composer;II)Lr6/a;", "dropUnlessResumed", "lifecycle-runtime-compose_release"}, m5111k = 2, m5112mv = {2, 0, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nDropUnlessLifecycle.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DropUnlessLifecycle.kt\nandroidx/lifecycle/compose/DropUnlessLifecycleKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,101:1\n77#2:102\n77#2:109\n77#2:110\n1225#3,6:103\n*S KotlinDebug\n*F\n+ 1 DropUnlessLifecycle.kt\nandroidx/lifecycle/compose/DropUnlessLifecycleKt\n*L\n46#1:102\n76#1:109\n98#1:110\n54#1:103,6\n*E\n"})
/* loaded from: classes2.dex */
public final class DropUnlessLifecycleKt {
    @CheckResult
    @Composable
    @NotNull
    public static final InterfaceC6469a dropUnlessResumed(@Nullable LifecycleOwner lifecycleOwner, @NotNull InterfaceC6469a interfaceC6469a, @Nullable Composer composer, int i, int i8) {
        if ((i8 & 1) != 0) {
            lifecycleOwner = (LifecycleOwner) composer.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner());
        }
        LifecycleOwner lifecycleOwner2 = lifecycleOwner;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1331131589, i, -1, "androidx.lifecycle.compose.dropUnlessResumed (DropUnlessLifecycle.kt:99)");
        }
        int i9 = i << 3;
        InterfaceC6469a interfaceC6469aDropUnlessStateIsAtLeast = dropUnlessStateIsAtLeast(Lifecycle.State.RESUMED, lifecycleOwner2, interfaceC6469a, composer, (i9 & 112) | 6 | (i9 & 896), 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return interfaceC6469aDropUnlessStateIsAtLeast;
    }

    @CheckResult
    @Composable
    @NotNull
    public static final InterfaceC6469a dropUnlessStarted(@Nullable LifecycleOwner lifecycleOwner, @NotNull InterfaceC6469a interfaceC6469a, @Nullable Composer composer, int i, int i8) {
        if ((i8 & 1) != 0) {
            lifecycleOwner = (LifecycleOwner) composer.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner());
        }
        LifecycleOwner lifecycleOwner2 = lifecycleOwner;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1207869935, i, -1, "androidx.lifecycle.compose.dropUnlessStarted (DropUnlessLifecycle.kt:77)");
        }
        int i9 = i << 3;
        InterfaceC6469a interfaceC6469aDropUnlessStateIsAtLeast = dropUnlessStateIsAtLeast(Lifecycle.State.STARTED, lifecycleOwner2, interfaceC6469a, composer, (i9 & 112) | 6 | (i9 & 896), 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return interfaceC6469aDropUnlessStateIsAtLeast;
    }

    @CheckResult
    @Composable
    private static final InterfaceC6469a dropUnlessStateIsAtLeast(Lifecycle.State state, LifecycleOwner lifecycleOwner, InterfaceC6469a interfaceC6469a, Composer composer, int i, int i8) {
        if ((i8 & 2) != 0) {
            lifecycleOwner = (LifecycleOwner) composer.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner());
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-2057956404, i, -1, "androidx.lifecycle.compose.dropUnlessStateIsAtLeast (DropUnlessLifecycle.kt:47)");
        }
        if (state == Lifecycle.State.DESTROYED) {
            throw new IllegalArgumentException("Target state is not allowed to be `Lifecycle.State.DESTROYED` because Compose disposes of the composition before `Lifecycle.Event.ON_DESTROY` observers are invoked.");
        }
        boolean zChangedInstance = composer.changedInstance(lifecycleOwner) | ((((i & 14) ^ 6) > 4 && composer.changed(state.ordinal())) || (i & 6) == 4) | ((((i & 896) ^ 384) > 256 && composer.changed(interfaceC6469a)) || (i & 384) == 256);
        Object objRememberedValue = composer.rememberedValue();
        if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new C2750a(lifecycleOwner, state, 0, interfaceC6469a);
            composer.updateRememberedValue(objRememberedValue);
        }
        InterfaceC6469a interfaceC6469a2 = (InterfaceC6469a) objRememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return interfaceC6469a2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C5443s dropUnlessStateIsAtLeast$lambda$2$lambda$1(LifecycleOwner lifecycleOwner, Lifecycle.State state, InterfaceC6469a interfaceC6469a) {
        if (lifecycleOwner.getLifecycle().getState().isAtLeast(state)) {
            interfaceC6469a.invoke();
        }
        return C5443s.f8405a;
    }
}
