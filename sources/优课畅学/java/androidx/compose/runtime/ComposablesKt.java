package androidx.compose.runtime;

import androidx.exifinterface.media.ExifInterface;
import com.tencent.smtt.sdk.TbsListener;
import kotlin.NotImplementedError;
import kotlin.jvm.internal.AbstractC9133u;
import p300x7.InterfaceC10559a;
import p300x7.InterfaceC10570l;
import p300x7.InterfaceC10574p;
import p300x7.InterfaceC10575q;

/* loaded from: classes2.dex */
public final class ComposablesKt {
    @Composable
    public static final /* synthetic */ <T, E extends Applier<?>> void ComposeNode(InterfaceC10559a interfaceC10559a, InterfaceC10570l interfaceC10570l, Composer composer, int i10) {
        Applier<?> applier = composer.getApplier();
        AbstractC9133u.m16139m(3, ExifInterface.LONGITUDE_EAST);
        if (applier == null) {
            invalidApplier();
        }
        composer.startNode();
        if (composer.getInserting()) {
            composer.createNode(interfaceC10559a);
        } else {
            composer.useNode();
        }
        interfaceC10570l.invoke(Updater.m23702boximpl(Updater.m23703constructorimpl(composer)));
        composer.endNode();
    }

    @Composable
    public static final /* synthetic */ <T, E extends Applier<?>> void ReusableComposeNode(InterfaceC10559a interfaceC10559a, InterfaceC10570l interfaceC10570l, Composer composer, int i10) {
        Applier<?> applier = composer.getApplier();
        AbstractC9133u.m16139m(3, ExifInterface.LONGITUDE_EAST);
        if (applier == null) {
            invalidApplier();
        }
        composer.startReusableNode();
        if (composer.getInserting()) {
            composer.createNode(interfaceC10559a);
        } else {
            composer.useNode();
        }
        interfaceC10570l.invoke(Updater.m23702boximpl(Updater.m23703constructorimpl(composer)));
        composer.endNode();
    }

    @Composable
    public static final void ReusableContent(Object obj, InterfaceC10574p interfaceC10574p, Composer composer, int i10) {
        composer.startReusableGroup(207, obj);
        interfaceC10574p.invoke(composer, Integer.valueOf((i10 >> 3) & 14));
        composer.endReusableGroup();
    }

    @Composable
    @ComposableInferredTarget(scheme = "[0[0]]")
    public static final void ReusableContentHost(boolean z10, InterfaceC10574p interfaceC10574p, Composer composer, int i10) {
        composer.startReusableGroup(207, Boolean.valueOf(z10));
        boolean zChanged = composer.changed(z10);
        if (z10) {
            interfaceC10574p.invoke(composer, Integer.valueOf((i10 >> 3) & 14));
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
    public static final <T> T key(Object[] objArr, InterfaceC10574p interfaceC10574p, Composer composer, int i10) {
        return (T) interfaceC10574p.invoke(composer, Integer.valueOf((i10 >> 3) & 14));
    }

    @Composable
    public static final <T> T remember(Object obj, InterfaceC10559a interfaceC10559a, Composer composer, int i10) {
        boolean zChanged = composer.changed(obj);
        T t10 = (T) composer.rememberedValue();
        if (!zChanged && t10 != Composer.Companion.getEmpty()) {
            return t10;
        }
        T t11 = (T) interfaceC10559a.invoke();
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
    public static final <T> T remember(Object obj, Object obj2, InterfaceC10559a interfaceC10559a, Composer composer, int i10) {
        boolean zChanged = composer.changed(obj) | composer.changed(obj2);
        T t10 = (T) composer.rememberedValue();
        if (!zChanged && t10 != Composer.Companion.getEmpty()) {
            return t10;
        }
        T t11 = (T) interfaceC10559a.invoke();
        composer.updateRememberedValue(t11);
        return t11;
    }

    @Composable
    @ComposableInferredTarget(scheme = "[0[0]]")
    public static final /* synthetic */ <T, E extends Applier<?>> void ComposeNode(InterfaceC10559a interfaceC10559a, InterfaceC10570l interfaceC10570l, InterfaceC10574p interfaceC10574p, Composer composer, int i10) {
        Applier<?> applier = composer.getApplier();
        AbstractC9133u.m16139m(3, ExifInterface.LONGITUDE_EAST);
        if (applier == null) {
            invalidApplier();
        }
        composer.startNode();
        if (composer.getInserting()) {
            composer.createNode(interfaceC10559a);
        } else {
            composer.useNode();
        }
        interfaceC10570l.invoke(Updater.m23702boximpl(Updater.m23703constructorimpl(composer)));
        interfaceC10574p.invoke(composer, Integer.valueOf((i10 >> 6) & 14));
        composer.endNode();
    }

    @Composable
    @ComposableInferredTarget(scheme = "[0[0]]")
    public static final /* synthetic */ <T, E extends Applier<?>> void ReusableComposeNode(InterfaceC10559a interfaceC10559a, InterfaceC10570l interfaceC10570l, InterfaceC10574p interfaceC10574p, Composer composer, int i10) {
        Applier<?> applier = composer.getApplier();
        AbstractC9133u.m16139m(3, ExifInterface.LONGITUDE_EAST);
        if (applier == null) {
            invalidApplier();
        }
        composer.startReusableNode();
        if (composer.getInserting()) {
            composer.createNode(interfaceC10559a);
        } else {
            composer.useNode();
        }
        interfaceC10570l.invoke(Updater.m23702boximpl(Updater.m23703constructorimpl(composer)));
        interfaceC10574p.invoke(composer, Integer.valueOf((i10 >> 6) & 14));
        composer.endNode();
    }

    @Composable
    public static final <T> T remember(Object obj, Object obj2, Object obj3, InterfaceC10559a interfaceC10559a, Composer composer, int i10) {
        boolean zChanged = composer.changed(obj) | composer.changed(obj2) | composer.changed(obj3);
        T t10 = (T) composer.rememberedValue();
        if (!zChanged && t10 != Composer.Companion.getEmpty()) {
            return t10;
        }
        T t11 = (T) interfaceC10559a.invoke();
        composer.updateRememberedValue(t11);
        return t11;
    }

    @Composable
    @ComposableInferredTarget(scheme = "[0[0][0]]")
    public static final /* synthetic */ <T, E extends Applier<?>> void ComposeNode(InterfaceC10559a interfaceC10559a, InterfaceC10570l interfaceC10570l, InterfaceC10575q interfaceC10575q, InterfaceC10574p interfaceC10574p, Composer composer, int i10) {
        Applier<?> applier = composer.getApplier();
        AbstractC9133u.m16139m(3, ExifInterface.LONGITUDE_EAST);
        if (applier == null) {
            invalidApplier();
        }
        composer.startNode();
        if (composer.getInserting()) {
            composer.createNode(interfaceC10559a);
        } else {
            composer.useNode();
        }
        interfaceC10570l.invoke(Updater.m23702boximpl(Updater.m23703constructorimpl(composer)));
        interfaceC10575q.invoke(SkippableUpdater.m23674boximpl(SkippableUpdater.m23675constructorimpl(composer)), composer, Integer.valueOf((i10 >> 3) & TbsListener.ErrorCode.DOWNLOAD_OVER_FLOW));
        composer.startReplaceableGroup(2058660585);
        interfaceC10574p.invoke(composer, Integer.valueOf((i10 >> 9) & 14));
        composer.endReplaceableGroup();
        composer.endNode();
    }

    @Composable
    @ComposableInferredTarget(scheme = "[0[0][0]]")
    public static final /* synthetic */ <T, E extends Applier<?>> void ReusableComposeNode(InterfaceC10559a interfaceC10559a, InterfaceC10570l interfaceC10570l, InterfaceC10575q interfaceC10575q, InterfaceC10574p interfaceC10574p, Composer composer, int i10) {
        Applier<?> applier = composer.getApplier();
        AbstractC9133u.m16139m(3, ExifInterface.LONGITUDE_EAST);
        if (applier == null) {
            invalidApplier();
        }
        composer.startReusableNode();
        if (composer.getInserting()) {
            composer.createNode(interfaceC10559a);
        } else {
            composer.useNode();
        }
        interfaceC10570l.invoke(Updater.m23702boximpl(Updater.m23703constructorimpl(composer)));
        interfaceC10575q.invoke(SkippableUpdater.m23674boximpl(SkippableUpdater.m23675constructorimpl(composer)), composer, Integer.valueOf((i10 >> 3) & TbsListener.ErrorCode.DOWNLOAD_OVER_FLOW));
        composer.startReplaceableGroup(2058660585);
        interfaceC10574p.invoke(composer, Integer.valueOf((i10 >> 9) & 14));
        composer.endReplaceableGroup();
        composer.endNode();
    }

    @Composable
    public static final <T> T remember(Object[] objArr, InterfaceC10559a interfaceC10559a, Composer composer, int i10) {
        boolean zChanged = false;
        for (Object obj : objArr) {
            zChanged |= composer.changed(obj);
        }
        T t10 = (T) composer.rememberedValue();
        if (!zChanged && t10 != Composer.Companion.getEmpty()) {
            return t10;
        }
        T t11 = (T) interfaceC10559a.invoke();
        composer.updateRememberedValue(t11);
        return t11;
    }

    @Composable
    public static final <T> T remember(InterfaceC10559a interfaceC10559a, Composer composer, int i10) {
        T t10 = (T) composer.rememberedValue();
        if (t10 != Composer.Companion.getEmpty()) {
            return t10;
        }
        T t11 = (T) interfaceC10559a.invoke();
        composer.updateRememberedValue(t11);
        return t11;
    }
}
