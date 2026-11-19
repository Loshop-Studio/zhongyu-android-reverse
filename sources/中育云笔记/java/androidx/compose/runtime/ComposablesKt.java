package androidx.compose.runtime;

import androidx.exifinterface.media.ExifInterface;
import kotlin.NotImplementedError;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9529a;
import p181hd.InterfaceC9540l;
import p181hd.InterfaceC9544p;
import p181hd.InterfaceC9545q;

/* loaded from: classes2.dex */
public final class ComposablesKt {
    @Composable
    public static final /* synthetic */ <T, E extends Applier<?>> void ComposeNode(InterfaceC9529a interfaceC9529a, InterfaceC9540l interfaceC9540l, Composer composer, int i10) {
        Applier<?> applier = composer.getApplier();
        AbstractC9979u.m20300m(3, ExifInterface.LONGITUDE_EAST);
        if (applier == null) {
            invalidApplier();
        }
        composer.startNode();
        if (composer.getInserting()) {
            composer.createNode(interfaceC9529a);
        } else {
            composer.useNode();
        }
        interfaceC9540l.invoke(Updater.m30304boximpl(Updater.m30305constructorimpl(composer)));
        composer.endNode();
    }

    @Composable
    public static final /* synthetic */ <T, E extends Applier<?>> void ReusableComposeNode(InterfaceC9529a interfaceC9529a, InterfaceC9540l interfaceC9540l, Composer composer, int i10) {
        Applier<?> applier = composer.getApplier();
        AbstractC9979u.m20300m(3, ExifInterface.LONGITUDE_EAST);
        if (applier == null) {
            invalidApplier();
        }
        composer.startReusableNode();
        if (composer.getInserting()) {
            composer.createNode(interfaceC9529a);
        } else {
            composer.useNode();
        }
        interfaceC9540l.invoke(Updater.m30304boximpl(Updater.m30305constructorimpl(composer)));
        composer.endNode();
    }

    @Composable
    public static final void ReusableContent(Object obj, InterfaceC9544p interfaceC9544p, Composer composer, int i10) {
        composer.startReusableGroup(ComposerKt.reuseKey, obj);
        interfaceC9544p.invoke(composer, Integer.valueOf((i10 >> 3) & 14));
        composer.endReusableGroup();
    }

    @Composable
    @ComposableInferredTarget(scheme = "[0[0]]")
    public static final void ReusableContentHost(boolean z10, InterfaceC9544p interfaceC9544p, Composer composer, int i10) {
        composer.startReusableGroup(ComposerKt.reuseKey, Boolean.valueOf(z10));
        boolean zChanged = composer.changed(z10);
        if (z10) {
            interfaceC9544p.invoke(composer, Integer.valueOf((i10 >> 3) & 14));
        } else {
            composer.deactivateToEndGroup(zChanged);
        }
        composer.endReusableGroup();
    }

    @Composable
    @ReadOnlyComposable
    public static final Composer getCurrentComposer(Composer composer, int i10) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-554250212, i10, -1, "androidx.compose.runtime.<get-currentComposer> (Composables.kt:172)");
        }
        throw new NotImplementedError("Implemented as an intrinsic");
    }

    @Composable
    public static final int getCurrentCompositeKeyHash(Composer composer, int i10) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(524444915, i10, -1, "androidx.compose.runtime.<get-currentCompositeKeyHash> (Composables.kt:213)");
        }
        int compoundKeyHash = composer.getCompoundKeyHash();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return compoundKeyHash;
    }

    @Composable
    public static final CompositionLocalContext getCurrentCompositionLocalContext(Composer composer, int i10) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-43352356, i10, -1, "androidx.compose.runtime.<get-currentCompositionLocalContext> (Composables.kt:199)");
        }
        CompositionLocalContext compositionLocalContext = new CompositionLocalContext(composer.buildContext().getCompositionLocalScope$runtime_release());
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return compositionLocalContext;
    }

    public static /* synthetic */ void getCurrentCompositionLocalContext$annotations() {
    }

    @Composable
    @ReadOnlyComposable
    public static final RecomposeScope getCurrentRecomposeScope(Composer composer, int i10) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(394957799, i10, -1, "androidx.compose.runtime.<get-currentRecomposeScope> (Composables.kt:184)");
        }
        RecomposeScope recomposeScope = composer.getRecomposeScope();
        if (recomposeScope == null) {
            throw new IllegalStateException("no recompose scope found");
        }
        composer.recordUsed(recomposeScope);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return recomposeScope;
    }

    public static final void invalidApplier() {
        throw new IllegalStateException("Invalid applier");
    }

    @Composable
    @ComposableInferredTarget(scheme = "[0[0]]")
    public static final <T> T key(Object[] objArr, InterfaceC9544p interfaceC9544p, Composer composer, int i10) {
        return (T) interfaceC9544p.invoke(composer, Integer.valueOf((i10 >> 3) & 14));
    }

    @Composable
    public static final <T> T remember(Object obj, InterfaceC9529a interfaceC9529a, Composer composer, int i10) {
        boolean zChanged = composer.changed(obj);
        T t10 = (T) composer.rememberedValue();
        if (!zChanged && t10 != Composer.Companion.getEmpty()) {
            return t10;
        }
        T t11 = (T) interfaceC9529a.invoke();
        composer.updateRememberedValue(t11);
        return t11;
    }

    @Composable
    public static final CompositionContext rememberCompositionContext(Composer composer, int i10) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1165786124, i10, -1, "androidx.compose.runtime.rememberCompositionContext (Composables.kt:461)");
        }
        CompositionContext compositionContextBuildContext = composer.buildContext();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return compositionContextBuildContext;
    }

    @Composable
    public static final <T> T remember(Object obj, Object obj2, InterfaceC9529a interfaceC9529a, Composer composer, int i10) {
        boolean zChanged = composer.changed(obj) | composer.changed(obj2);
        T t10 = (T) composer.rememberedValue();
        if (!zChanged && t10 != Composer.Companion.getEmpty()) {
            return t10;
        }
        T t11 = (T) interfaceC9529a.invoke();
        composer.updateRememberedValue(t11);
        return t11;
    }

    @Composable
    @ComposableInferredTarget(scheme = "[0[0]]")
    public static final /* synthetic */ <T, E extends Applier<?>> void ComposeNode(InterfaceC9529a interfaceC9529a, InterfaceC9540l interfaceC9540l, InterfaceC9544p interfaceC9544p, Composer composer, int i10) {
        Applier<?> applier = composer.getApplier();
        AbstractC9979u.m20300m(3, ExifInterface.LONGITUDE_EAST);
        if (applier == null) {
            invalidApplier();
        }
        composer.startNode();
        if (composer.getInserting()) {
            composer.createNode(interfaceC9529a);
        } else {
            composer.useNode();
        }
        interfaceC9540l.invoke(Updater.m30304boximpl(Updater.m30305constructorimpl(composer)));
        interfaceC9544p.invoke(composer, Integer.valueOf((i10 >> 6) & 14));
        composer.endNode();
    }

    @Composable
    @ComposableInferredTarget(scheme = "[0[0]]")
    public static final /* synthetic */ <T, E extends Applier<?>> void ReusableComposeNode(InterfaceC9529a interfaceC9529a, InterfaceC9540l interfaceC9540l, InterfaceC9544p interfaceC9544p, Composer composer, int i10) {
        Applier<?> applier = composer.getApplier();
        AbstractC9979u.m20300m(3, ExifInterface.LONGITUDE_EAST);
        if (applier == null) {
            invalidApplier();
        }
        composer.startReusableNode();
        if (composer.getInserting()) {
            composer.createNode(interfaceC9529a);
        } else {
            composer.useNode();
        }
        interfaceC9540l.invoke(Updater.m30304boximpl(Updater.m30305constructorimpl(composer)));
        interfaceC9544p.invoke(composer, Integer.valueOf((i10 >> 6) & 14));
        composer.endNode();
    }

    @Composable
    public static final <T> T remember(Object obj, Object obj2, Object obj3, InterfaceC9529a interfaceC9529a, Composer composer, int i10) {
        boolean zChanged = composer.changed(obj) | composer.changed(obj2) | composer.changed(obj3);
        T t10 = (T) composer.rememberedValue();
        if (!zChanged && t10 != Composer.Companion.getEmpty()) {
            return t10;
        }
        T t11 = (T) interfaceC9529a.invoke();
        composer.updateRememberedValue(t11);
        return t11;
    }

    @Composable
    @ComposableInferredTarget(scheme = "[0[0][0]]")
    public static final /* synthetic */ <T, E extends Applier<?>> void ComposeNode(InterfaceC9529a interfaceC9529a, InterfaceC9540l interfaceC9540l, InterfaceC9545q interfaceC9545q, InterfaceC9544p interfaceC9544p, Composer composer, int i10) {
        Applier<?> applier = composer.getApplier();
        AbstractC9979u.m20300m(3, ExifInterface.LONGITUDE_EAST);
        if (applier == null) {
            invalidApplier();
        }
        composer.startNode();
        if (composer.getInserting()) {
            composer.createNode(interfaceC9529a);
        } else {
            composer.useNode();
        }
        interfaceC9540l.invoke(Updater.m30304boximpl(Updater.m30305constructorimpl(composer)));
        interfaceC9545q.invoke(SkippableUpdater.m30276boximpl(SkippableUpdater.m30277constructorimpl(composer)), composer, Integer.valueOf((i10 >> 3) & 112));
        composer.startReplaceableGroup(2058660585);
        interfaceC9544p.invoke(composer, Integer.valueOf((i10 >> 9) & 14));
        composer.endReplaceableGroup();
        composer.endNode();
    }

    @Composable
    @ComposableInferredTarget(scheme = "[0[0][0]]")
    public static final /* synthetic */ <T, E extends Applier<?>> void ReusableComposeNode(InterfaceC9529a interfaceC9529a, InterfaceC9540l interfaceC9540l, InterfaceC9545q interfaceC9545q, InterfaceC9544p interfaceC9544p, Composer composer, int i10) {
        Applier<?> applier = composer.getApplier();
        AbstractC9979u.m20300m(3, ExifInterface.LONGITUDE_EAST);
        if (applier == null) {
            invalidApplier();
        }
        composer.startReusableNode();
        if (composer.getInserting()) {
            composer.createNode(interfaceC9529a);
        } else {
            composer.useNode();
        }
        interfaceC9540l.invoke(Updater.m30304boximpl(Updater.m30305constructorimpl(composer)));
        interfaceC9545q.invoke(SkippableUpdater.m30276boximpl(SkippableUpdater.m30277constructorimpl(composer)), composer, Integer.valueOf((i10 >> 3) & 112));
        composer.startReplaceableGroup(2058660585);
        interfaceC9544p.invoke(composer, Integer.valueOf((i10 >> 9) & 14));
        composer.endReplaceableGroup();
        composer.endNode();
    }

    @Composable
    public static final <T> T remember(Object[] objArr, InterfaceC9529a interfaceC9529a, Composer composer, int i10) {
        boolean zChanged = false;
        for (Object obj : objArr) {
            zChanged |= composer.changed(obj);
        }
        T t10 = (T) composer.rememberedValue();
        if (!zChanged && t10 != Composer.Companion.getEmpty()) {
            return t10;
        }
        T t11 = (T) interfaceC9529a.invoke();
        composer.updateRememberedValue(t11);
        return t11;
    }

    @Composable
    public static final <T> T remember(InterfaceC9529a interfaceC9529a, Composer composer, int i10) {
        T t10 = (T) composer.rememberedValue();
        if (t10 != Composer.Companion.getEmpty()) {
            return t10;
        }
        T t11 = (T) interfaceC9529a.invoke();
        composer.updateRememberedValue(t11);
        return t11;
    }
}
