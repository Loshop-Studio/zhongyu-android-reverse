package androidx.compose.runtime;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.exifinterface.media.ExifInterface;
import kotlin.Metadata;
import kotlin.coroutines.EmptyCoroutineContext;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.TestOnly;
import p075h6.InterfaceC5636h;
import p152r6.InterfaceC6469a;

@Metadata(m5109d1 = {"\u0000N\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u001a)\u0010\u0004\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a0\u0010\f\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0006*\u00020\u00072\u0006\u0010\t\u001a\u00020\b2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\nH\u0080\b¢\u0006\u0004\b\f\u0010\r\u001a!\u0010\u0012\u001a\u00020\u00012\n\u0010\u000f\u001a\u0006\u0012\u0002\b\u00030\u000e2\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013\u001a!\u0010\u0015\u001a\u00020\u00142\n\u0010\u000f\u001a\u0006\u0012\u0002\b\u00030\u000e2\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0015\u0010\u0016\u001a#\u0010\u0017\u001a\u00020\u00072\n\u0010\u000f\u001a\u0006\u0012\u0002\b\u00030\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0007¢\u0006\u0004\b\u0017\u0010\u0018\u001a+\u0010\u0012\u001a\u00020\u00012\n\u0010\u000f\u001a\u0006\u0012\u0002\b\u00030\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u001a\u001a\u00020\u0019H\u0007¢\u0006\u0004\b\u0012\u0010\u001b\u001a+\u0010\u0017\u001a\u00020\u00072\n\u0010\u000f\u001a\u0006\u0012\u0002\b\u00030\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u001a\u001a\u00020\u0019H\u0007¢\u0006\u0004\b\u0017\u0010\u001c\"\u0014\u0010\u001e\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f\" \u0010!\u001a\b\u0012\u0004\u0012\u00020 0\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$\"\u001e\u0010\u001a\u001a\u00020\u0019*\u00020\u00078GX\u0087\u0004¢\u0006\f\u0012\u0004\b'\u0010(\u001a\u0004\b%\u0010&¨\u0006)"}, m5110d2 = {ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/compose/runtime/Composition;", "Landroidx/compose/runtime/CompositionServiceKey;", "key", "getCompositionService", "(Landroidx/compose/runtime/Composition;Landroidx/compose/runtime/CompositionServiceKey;)Ljava/lang/Object;", "R", "Landroidx/compose/runtime/ControlledComposition;", "Landroidx/compose/runtime/ShouldPauseCallback;", "shouldPause", "Lkotlin/Function0;", "block", "pausable", "(Landroidx/compose/runtime/ControlledComposition;Landroidx/compose/runtime/ShouldPauseCallback;Lr6/a;)Ljava/lang/Object;", "Landroidx/compose/runtime/Applier;", "applier", "Landroidx/compose/runtime/CompositionContext;", "parent", "Composition", "(Landroidx/compose/runtime/Applier;Landroidx/compose/runtime/CompositionContext;)Landroidx/compose/runtime/Composition;", "Landroidx/compose/runtime/ReusableComposition;", "ReusableComposition", "(Landroidx/compose/runtime/Applier;Landroidx/compose/runtime/CompositionContext;)Landroidx/compose/runtime/ReusableComposition;", "ControlledComposition", "(Landroidx/compose/runtime/Applier;Landroidx/compose/runtime/CompositionContext;)Landroidx/compose/runtime/ControlledComposition;", "Lh6/h;", "recomposeCoroutineContext", "(Landroidx/compose/runtime/Applier;Landroidx/compose/runtime/CompositionContext;Lh6/h;)Landroidx/compose/runtime/Composition;", "(Landroidx/compose/runtime/Applier;Landroidx/compose/runtime/CompositionContext;Lh6/h;)Landroidx/compose/runtime/ControlledComposition;", "", "PendingApplyNoModifications", "Ljava/lang/Object;", "Landroidx/compose/runtime/CompositionImpl;", "CompositionImplServiceKey", "Landroidx/compose/runtime/CompositionServiceKey;", "getCompositionImplServiceKey", "()Landroidx/compose/runtime/CompositionServiceKey;", "getRecomposeCoroutineContext", "(Landroidx/compose/runtime/ControlledComposition;)Lh6/h;", "getRecomposeCoroutineContext$annotations", "(Landroidx/compose/runtime/ControlledComposition;)V", "runtime_release"}, m5111k = 2, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
public final class CompositionKt {

    @NotNull
    private static final Object PendingApplyNoModifications = new Object();

    @NotNull
    private static final CompositionServiceKey<CompositionImpl> CompositionImplServiceKey = new CompositionServiceKey<CompositionImpl>() { // from class: androidx.compose.runtime.CompositionKt$CompositionImplServiceKey$1
    };

    @NotNull
    public static final Composition Composition(@NotNull Applier<?> applier, @NotNull CompositionContext compositionContext) {
        return new CompositionImpl(compositionContext, applier, null, 4, null);
    }

    @TestOnly
    @NotNull
    public static final ControlledComposition ControlledComposition(@NotNull Applier<?> applier, @NotNull CompositionContext compositionContext) {
        return new CompositionImpl(compositionContext, applier, null, 4, null);
    }

    @NotNull
    public static final ReusableComposition ReusableComposition(@NotNull Applier<?> applier, @NotNull CompositionContext compositionContext) {
        return new CompositionImpl(compositionContext, applier, null, 4, null);
    }

    @NotNull
    public static final CompositionServiceKey<CompositionImpl> getCompositionImplServiceKey() {
        return CompositionImplServiceKey;
    }

    @Nullable
    public static final <T> T getCompositionService(@NotNull Composition composition, @NotNull CompositionServiceKey<T> compositionServiceKey) {
        CompositionServices compositionServices = composition instanceof CompositionServices ? (CompositionServices) composition : null;
        if (compositionServices != null) {
            return (T) compositionServices.getCompositionService(compositionServiceKey);
        }
        return null;
    }

    @ExperimentalComposeApi
    @NotNull
    public static final InterfaceC5636h getRecomposeCoroutineContext(@NotNull ControlledComposition controlledComposition) {
        InterfaceC5636h recomposeContext;
        CompositionImpl compositionImpl = controlledComposition instanceof CompositionImpl ? (CompositionImpl) controlledComposition : null;
        return (compositionImpl == null || (recomposeContext = compositionImpl.getRecomposeContext()) == null) ? EmptyCoroutineContext.INSTANCE : recomposeContext;
    }

    @ExperimentalComposeApi
    public static /* synthetic */ void getRecomposeCoroutineContext$annotations(ControlledComposition controlledComposition) {
    }

    public static final <R> R pausable(@NotNull ControlledComposition controlledComposition, @NotNull ShouldPauseCallback shouldPauseCallback, @NotNull InterfaceC6469a interfaceC6469a) {
        ShouldPauseCallback andSetShouldPauseCallback = controlledComposition.getAndSetShouldPauseCallback(shouldPauseCallback);
        try {
            return (R) interfaceC6469a.invoke();
        } finally {
            controlledComposition.getAndSetShouldPauseCallback(andSetShouldPauseCallback);
        }
    }

    @ExperimentalComposeApi
    @NotNull
    public static final Composition Composition(@NotNull Applier<?> applier, @NotNull CompositionContext compositionContext, @NotNull InterfaceC5636h interfaceC5636h) {
        return new CompositionImpl(compositionContext, applier, interfaceC5636h);
    }

    @TestOnly
    @ExperimentalComposeApi
    @NotNull
    public static final ControlledComposition ControlledComposition(@NotNull Applier<?> applier, @NotNull CompositionContext compositionContext, @NotNull InterfaceC5636h interfaceC5636h) {
        return new CompositionImpl(compositionContext, applier, interfaceC5636h);
    }
}
