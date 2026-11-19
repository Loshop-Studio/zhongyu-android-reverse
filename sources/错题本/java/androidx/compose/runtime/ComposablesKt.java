package androidx.compose.runtime;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.exifinterface.media.ExifInterface;
import kotlin.Metadata;
import kotlin.NotImplementedError;
import kotlin.PublishedApi;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.AbstractC5830k;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p152r6.InterfaceC6469a;
import p152r6.InterfaceC6471c;
import p152r6.InterfaceC6473e;
import p152r6.InterfaceC6474f;

@Metadata(m5109d1 = {"\u0000~\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\u001a+\u0010\u0004\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\u0013\b\u0004\u0010\u0003\u001a\r\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\u0002\b\u0002H\u0087\b¢\u0006\u0004\b\u0004\u0010\u0005\u001a5\u0010\u0004\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0013\b\u0004\u0010\u0003\u001a\r\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\u0002\b\u0002H\u0087\b¢\u0006\u0004\b\u0004\u0010\b\u001a?\u0010\u0004\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\u00062\u0013\b\u0004\u0010\u0003\u001a\r\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\u0002\b\u0002H\u0087\b¢\u0006\u0004\b\u0004\u0010\n\u001aI\u0010\u0004\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\u00062\b\u0010\u000b\u001a\u0004\u0018\u00010\u00062\u0013\b\u0004\u0010\u0003\u001a\r\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\u0002\b\u0002H\u0087\b¢\u0006\u0004\b\u0004\u0010\f\u001aC\u0010\u0004\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\u0016\u0010\u000e\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00060\r\"\u0004\u0018\u00010\u00062\u0013\b\u0004\u0010\u0003\u001a\r\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\u0002\b\u0002H\u0087\b¢\u0006\u0004\b\u0004\u0010\u000f\u001aA\u0010\u0012\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\u0016\u0010\u000e\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00060\r\"\u0004\u0018\u00010\u00062\u0011\u0010\u0011\u001a\r\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\u0002\b\u0010H\u0087\b¢\u0006\u0004\b\u0012\u0010\u0013\u001a-\u0010\u0016\u001a\u00020\u00142\b\u0010\u0012\u001a\u0004\u0018\u00010\u00062\u0011\u0010\u0015\u001a\r\u0012\u0004\u0012\u00020\u00140\u0001¢\u0006\u0002\b\u0010H\u0087\b¢\u0006\u0004\b\u0016\u0010\u0017\u001a-\u0010\u001a\u001a\u00020\u00142\u0006\u0010\u0019\u001a\u00020\u00182\u0013\b\u0004\u0010\u0015\u001a\r\u0012\u0004\u0012\u00020\u00140\u0001¢\u0006\u0002\b\u0010H\u0087\b¢\u0006\u0004\b\u001a\u0010\u001b\u001a^\u0010#\u001a\u00020\u0014\"\b\b\u0000\u0010\u0000*\u00020\u0006\"\u000e\b\u0001\u0010\u001d\u0018\u0001*\u0006\u0012\u0002\b\u00030\u001c2\u000e\b\b\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00000\u00012\"\u0010\"\u001a\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000 \u0012\u0004\u0012\u00020\u00140\u001f¢\u0006\u0002\b\u0002¢\u0006\u0002\b!H\u0087\b¢\u0006\u0004\b#\u0010$\u001a^\u0010%\u001a\u00020\u0014\"\b\b\u0000\u0010\u0000*\u00020\u0006\"\u000e\b\u0001\u0010\u001d\u0018\u0001*\u0006\u0012\u0002\b\u00030\u001c2\u000e\b\b\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00000\u00012\"\u0010\"\u001a\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000 \u0012\u0004\u0012\u00020\u00140\u001f¢\u0006\u0002\b\u0002¢\u0006\u0002\b!H\u0087\b¢\u0006\u0004\b%\u0010$\u001am\u0010#\u001a\u00020\u0014\"\u0004\b\u0000\u0010\u0000\"\u000e\b\u0001\u0010\u001d\u0018\u0001*\u0006\u0012\u0002\b\u00030\u001c2\u000e\b\b\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00000\u00012\"\u0010\"\u001a\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000 \u0012\u0004\u0012\u00020\u00140\u001f¢\u0006\u0002\b\u0002¢\u0006\u0002\b!2\u0011\u0010\u0015\u001a\r\u0012\u0004\u0012\u00020\u00140\u0001¢\u0006\u0002\b\u0010H\u0087\b¢\u0006\u0004\b#\u0010&\u001am\u0010%\u001a\u00020\u0014\"\u0004\b\u0000\u0010\u0000\"\u000e\b\u0001\u0010\u001d\u0018\u0001*\u0006\u0012\u0002\b\u00030\u001c2\u000e\b\b\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00000\u00012\"\u0010\"\u001a\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000 \u0012\u0004\u0012\u00020\u00140\u001f¢\u0006\u0002\b\u0002¢\u0006\u0002\b!2\u0011\u0010\u0015\u001a\r\u0012\u0004\u0012\u00020\u00140\u0001¢\u0006\u0002\b\u0010H\u0087\b¢\u0006\u0004\b%\u0010&\u001a\u0093\u0001\u0010#\u001a\u00020\u0014\"\u0004\b\u0000\u0010\u0000\"\u000e\b\u0001\u0010\u001d\u0018\u0001*\u0006\u0012\u0002\b\u00030\u001c2\u000e\b\b\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00000\u00012\"\u0010\"\u001a\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000 \u0012\u0004\u0012\u00020\u00140\u001f¢\u0006\u0002\b\u0002¢\u0006\u0002\b!2$\b\b\u0010(\u001a\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000'\u0012\u0004\u0012\u00020\u00140\u001f¢\u0006\u0002\b\u0010¢\u0006\u0002\b!2\u0011\u0010\u0015\u001a\r\u0012\u0004\u0012\u00020\u00140\u0001¢\u0006\u0002\b\u0010H\u0087\b¢\u0006\u0004\b#\u0010)\u001a\u0093\u0001\u0010%\u001a\u00020\u0014\"\u0004\b\u0000\u0010\u0000\"\u000e\b\u0001\u0010\u001d\u0018\u0001*\u0006\u0012\u0002\b\u00030\u001c2\u000e\b\b\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00000\u00012\"\u0010\"\u001a\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000 \u0012\u0004\u0012\u00020\u00140\u001f¢\u0006\u0002\b\u0002¢\u0006\u0002\b!2$\b\b\u0010(\u001a\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000'\u0012\u0004\u0012\u00020\u00140\u001f¢\u0006\u0002\b\u0010¢\u0006\u0002\b!2\u0011\u0010\u0015\u001a\r\u0012\u0004\u0012\u00020\u00140\u0001¢\u0006\u0002\b\u0010H\u0087\b¢\u0006\u0004\b%\u0010)\u001a\u000f\u0010*\u001a\u00020\u0014H\u0001¢\u0006\u0004\b*\u0010+\u001a\u000f\u0010-\u001a\u00020,H\u0007¢\u0006\u0004\b-\u0010.\"\u0011\u00102\u001a\u00020/8G¢\u0006\u0006\u001a\u0004\b0\u00101\"\u0011\u00106\u001a\u0002038G¢\u0006\u0006\u001a\u0004\b4\u00105\"\u0017\u0010;\u001a\u0002078G¢\u0006\f\u0012\u0004\b:\u0010+\u001a\u0004\b8\u00109\"\u0011\u0010?\u001a\u00020<8G¢\u0006\u0006\u001a\u0004\b=\u0010>¨\u0006@"}, m5110d2 = {ExifInterface.GPS_DIRECTION_TRUE, "Lkotlin/Function0;", "Landroidx/compose/runtime/DisallowComposableCalls;", "calculation", "remember", "(Lr6/a;Landroidx/compose/runtime/Composer;I)Ljava/lang/Object;", "", "key1", "(Ljava/lang/Object;Lr6/a;Landroidx/compose/runtime/Composer;I)Ljava/lang/Object;", "key2", "(Ljava/lang/Object;Ljava/lang/Object;Lr6/a;Landroidx/compose/runtime/Composer;I)Ljava/lang/Object;", "key3", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lr6/a;Landroidx/compose/runtime/Composer;I)Ljava/lang/Object;", "", "keys", "([Ljava/lang/Object;Lr6/a;Landroidx/compose/runtime/Composer;I)Ljava/lang/Object;", "Landroidx/compose/runtime/Composable;", "block", "key", "([Ljava/lang/Object;Lr6/e;Landroidx/compose/runtime/Composer;I)Ljava/lang/Object;", "Ld6/s;", "content", "ReusableContent", "(Ljava/lang/Object;Lr6/e;Landroidx/compose/runtime/Composer;I)V", "", "active", "ReusableContentHost", "(ZLr6/e;Landroidx/compose/runtime/Composer;I)V", "Landroidx/compose/runtime/Applier;", ExifInterface.LONGITUDE_EAST, "factory", "Lkotlin/Function1;", "Landroidx/compose/runtime/Updater;", "Lkotlin/ExtensionFunctionType;", "update", "ComposeNode", "(Lr6/a;Lr6/c;Landroidx/compose/runtime/Composer;I)V", "ReusableComposeNode", "(Lr6/a;Lr6/c;Lr6/e;Landroidx/compose/runtime/Composer;I)V", "Landroidx/compose/runtime/SkippableUpdater;", "skippableUpdate", "(Lr6/a;Lr6/c;Lr6/f;Lr6/e;Landroidx/compose/runtime/Composer;I)V", "invalidApplier", "()V", "Landroidx/compose/runtime/CompositionContext;", "rememberCompositionContext", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/CompositionContext;", "Landroidx/compose/runtime/Composer;", "getCurrentComposer", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/Composer;", "currentComposer", "Landroidx/compose/runtime/RecomposeScope;", "getCurrentRecomposeScope", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/RecomposeScope;", "currentRecomposeScope", "Landroidx/compose/runtime/CompositionLocalContext;", "getCurrentCompositionLocalContext", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/CompositionLocalContext;", "getCurrentCompositionLocalContext$annotations", "currentCompositionLocalContext", "", "getCurrentCompositeKeyHash", "(Landroidx/compose/runtime/Composer;I)I", "currentCompositeKeyHash", "runtime_release"}, m5111k = 2, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nComposables.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,465:1\n1247#2,6:466\n1247#2,6:472\n1247#2,6:478\n1247#2,6:484\n1247#2,6:490\n*S KotlinDebug\n*F\n+ 1 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n*L\n25#1:466,6\n33#1:472,6\n47#1:478,6\n65#1:484,6\n85#1:490,6\n*E\n"})
/* loaded from: classes.dex */
public final class ComposablesKt {
    @Composable
    public static final <T, E extends Applier<?>> void ComposeNode(InterfaceC6469a interfaceC6469a, InterfaceC6471c interfaceC6471c, Composer composer, int i) {
        composer.getApplier();
        AbstractC5830k.m5338o();
        throw null;
    }

    @Composable
    public static final <T, E extends Applier<?>> void ReusableComposeNode(InterfaceC6469a interfaceC6469a, InterfaceC6471c interfaceC6471c, Composer composer, int i) {
        composer.getApplier();
        AbstractC5830k.m5338o();
        throw null;
    }

    @Composable
    public static final void ReusableContent(@Nullable Object obj, @NotNull InterfaceC6473e interfaceC6473e, @Nullable Composer composer, int i) {
        composer.startReusableGroup(ComposerKt.reuseKey, obj);
        interfaceC6473e.invoke(composer, Integer.valueOf((i >> 3) & 14));
        composer.endReusableGroup();
    }

    @Composable
    @ComposableInferredTarget(scheme = "[0[0]]")
    public static final void ReusableContentHost(boolean z8, @NotNull InterfaceC6473e interfaceC6473e, @Nullable Composer composer, int i) {
        composer.startReusableGroup(ComposerKt.reuseKey, Boolean.valueOf(z8));
        boolean zChanged = composer.changed(z8);
        if (z8) {
            interfaceC6473e.invoke(composer, Integer.valueOf((i >> 3) & 14));
        } else {
            composer.deactivateToEndGroup(zChanged);
        }
        composer.endReusableGroup();
    }

    @JvmName(name = "getCurrentComposer")
    @NotNull
    @Composable
    @ReadOnlyComposable
    public static final Composer getCurrentComposer(@Nullable Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-554250212, i, -1, "androidx.compose.runtime.<get-currentComposer> (Composables.kt:172)");
        }
        throw new NotImplementedError("Implemented as an intrinsic");
    }

    @Composable
    @JvmName(name = "getCurrentCompositeKeyHash")
    public static final int getCurrentCompositeKeyHash(@Nullable Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(524444915, i, -1, "androidx.compose.runtime.<get-currentCompositeKeyHash> (Composables.kt:213)");
        }
        int compoundKeyHash = composer.getCompoundKeyHash();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return compoundKeyHash;
    }

    @Composable
    @JvmName(name = "getCurrentCompositionLocalContext")
    @NotNull
    public static final CompositionLocalContext getCurrentCompositionLocalContext(@Nullable Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-43352356, i, -1, "androidx.compose.runtime.<get-currentCompositionLocalContext> (Composables.kt:199)");
        }
        CompositionLocalContext compositionLocalContext = new CompositionLocalContext(composer.buildContext().getCompositionLocalScope$runtime_release());
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return compositionLocalContext;
    }

    public static /* synthetic */ void getCurrentCompositionLocalContext$annotations() {
    }

    @JvmName(name = "getCurrentRecomposeScope")
    @NotNull
    @Composable
    @ReadOnlyComposable
    public static final RecomposeScope getCurrentRecomposeScope(@Nullable Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(394957799, i, -1, "androidx.compose.runtime.<get-currentRecomposeScope> (Composables.kt:184)");
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

    @PublishedApi
    public static final void invalidApplier() {
        throw new IllegalStateException("Invalid applier");
    }

    @Composable
    @ComposableInferredTarget(scheme = "[0[0]]")
    public static final <T> T key(@NotNull Object[] objArr, @NotNull InterfaceC6473e interfaceC6473e, @Nullable Composer composer, int i) {
        return (T) interfaceC6473e.invoke(composer, Integer.valueOf((i >> 3) & 14));
    }

    @Composable
    public static final <T> T remember(@Nullable Object obj, @NotNull InterfaceC6469a interfaceC6469a, @Nullable Composer composer, int i) {
        boolean zChanged = composer.changed(obj);
        T t8 = (T) composer.rememberedValue();
        if (!zChanged && t8 != Composer.INSTANCE.getEmpty()) {
            return t8;
        }
        T t9 = (T) interfaceC6469a.invoke();
        composer.updateRememberedValue(t9);
        return t9;
    }

    @Composable
    @NotNull
    public static final CompositionContext rememberCompositionContext(@Nullable Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1165786124, i, -1, "androidx.compose.runtime.rememberCompositionContext (Composables.kt:461)");
        }
        CompositionContext compositionContextBuildContext = composer.buildContext();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return compositionContextBuildContext;
    }

    @Composable
    @ComposableInferredTarget(scheme = "[0[0]]")
    public static final <T, E extends Applier<?>> void ComposeNode(InterfaceC6469a interfaceC6469a, InterfaceC6471c interfaceC6471c, InterfaceC6473e interfaceC6473e, Composer composer, int i) {
        composer.getApplier();
        AbstractC5830k.m5338o();
        throw null;
    }

    @Composable
    @ComposableInferredTarget(scheme = "[0[0]]")
    public static final <T, E extends Applier<?>> void ReusableComposeNode(InterfaceC6469a interfaceC6469a, InterfaceC6471c interfaceC6471c, InterfaceC6473e interfaceC6473e, Composer composer, int i) {
        composer.getApplier();
        AbstractC5830k.m5338o();
        throw null;
    }

    @Composable
    @ComposableInferredTarget(scheme = "[0[0][0]]")
    public static final <T, E extends Applier<?>> void ComposeNode(InterfaceC6469a interfaceC6469a, InterfaceC6471c interfaceC6471c, InterfaceC6474f interfaceC6474f, InterfaceC6473e interfaceC6473e, Composer composer, int i) {
        composer.getApplier();
        AbstractC5830k.m5338o();
        throw null;
    }

    @Composable
    @ComposableInferredTarget(scheme = "[0[0][0]]")
    public static final <T, E extends Applier<?>> void ReusableComposeNode(InterfaceC6469a interfaceC6469a, InterfaceC6471c interfaceC6471c, InterfaceC6474f interfaceC6474f, InterfaceC6473e interfaceC6473e, Composer composer, int i) {
        composer.getApplier();
        AbstractC5830k.m5338o();
        throw null;
    }

    @Composable
    public static final <T> T remember(@Nullable Object obj, @Nullable Object obj2, @NotNull InterfaceC6469a interfaceC6469a, @Nullable Composer composer, int i) {
        boolean zChanged = composer.changed(obj) | composer.changed(obj2);
        T t8 = (T) composer.rememberedValue();
        if (!zChanged && t8 != Composer.INSTANCE.getEmpty()) {
            return t8;
        }
        T t9 = (T) interfaceC6469a.invoke();
        composer.updateRememberedValue(t9);
        return t9;
    }

    @Composable
    public static final <T> T remember(@Nullable Object obj, @Nullable Object obj2, @Nullable Object obj3, @NotNull InterfaceC6469a interfaceC6469a, @Nullable Composer composer, int i) {
        boolean zChanged = composer.changed(obj) | composer.changed(obj2) | composer.changed(obj3);
        T t8 = (T) composer.rememberedValue();
        if (!zChanged && t8 != Composer.INSTANCE.getEmpty()) {
            return t8;
        }
        T t9 = (T) interfaceC6469a.invoke();
        composer.updateRememberedValue(t9);
        return t9;
    }

    @Composable
    public static final <T> T remember(@NotNull Object[] objArr, @NotNull InterfaceC6469a interfaceC6469a, @Nullable Composer composer, int i) {
        boolean zChanged = false;
        for (Object obj : objArr) {
            zChanged |= composer.changed(obj);
        }
        T t8 = (T) composer.rememberedValue();
        if (!zChanged && t8 != Composer.INSTANCE.getEmpty()) {
            return t8;
        }
        T t9 = (T) interfaceC6469a.invoke();
        composer.updateRememberedValue(t9);
        return t9;
    }

    @Composable
    public static final <T> T remember(@NotNull InterfaceC6469a interfaceC6469a, @Nullable Composer composer, int i) {
        T t8 = (T) composer.rememberedValue();
        if (t8 != Composer.INSTANCE.getEmpty()) {
            return t8;
        }
        T t9 = (T) interfaceC6469a.invoke();
        composer.updateRememberedValue(t9);
        return t9;
    }
}
