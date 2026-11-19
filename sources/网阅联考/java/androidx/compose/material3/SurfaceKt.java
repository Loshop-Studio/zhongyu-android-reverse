package androidx.compose.material3;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.selection.SelectableKt;
import androidx.compose.foundation.selection.ToggleableKt;
import androidx.compose.material.ripple.RippleKt;
import androidx.compose.p006ui.Alignment;
import androidx.compose.p006ui.Modifier;
import androidx.compose.p006ui.draw.ClipKt;
import androidx.compose.p006ui.draw.ShadowKt;
import androidx.compose.p006ui.graphics.Color;
import androidx.compose.p006ui.graphics.RectangleShapeKt;
import androidx.compose.p006ui.graphics.Shape;
import androidx.compose.p006ui.input.pointer.PointerInputScope;
import androidx.compose.p006ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.p006ui.layout.LayoutKt;
import androidx.compose.p006ui.layout.MeasurePolicy;
import androidx.compose.p006ui.node.ComposeUiNode;
import androidx.compose.p006ui.platform.CompositionLocalsKt;
import androidx.compose.p006ui.platform.ViewConfiguration;
import androidx.compose.p006ui.semantics.Role;
import androidx.compose.p006ui.semantics.SemanticsModifierKt;
import androidx.compose.p006ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.p006ui.unit.C1700Dp;
import androidx.compose.p006ui.unit.Density;
import androidx.compose.p006ui.unit.LayoutDirection;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

@Metadata(m5174d1 = {"\u0000P\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\n\u001a\u0092\u0001\u0010\u0005\u001a\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0012\u001a\u00020\u00022\b\b\u0002\u0010\u0013\u001a\u00020\u00022\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00152\b\b\u0002\u0010\u0016\u001a\u00020\u00172\u0011\u0010\u0018\u001a\r\u0012\u0004\u0012\u00020\u00060\b¢\u0006\u0002\b\u0019H\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001b\u001ap\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0012\u001a\u00020\u00022\b\b\u0002\u0010\u0013\u001a\u00020\u00022\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00152\u0011\u0010\u0018\u001a\r\u0012\u0004\u0012\u00020\u00060\b¢\u0006\u0002\b\u0019H\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001d\u001a\u009a\u0001\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u001e\u001a\u00020\f2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0012\u001a\u00020\u00022\b\b\u0002\u0010\u0013\u001a\u00020\u00022\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00152\b\b\u0002\u0010\u0016\u001a\u00020\u00172\u0011\u0010\u0018\u001a\r\u0012\u0004\u0012\u00020\u00060\b¢\u0006\u0002\b\u0019H\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u001f\u0010 \u001a \u0001\u0010\u0005\u001a\u00020\u00062\u0006\u0010!\u001a\u00020\f2\u0012\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00060#2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0012\u001a\u00020\u00022\b\b\u0002\u0010\u0013\u001a\u00020\u00022\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00152\b\b\u0002\u0010\u0016\u001a\u00020\u00172\u0011\u0010\u0018\u001a\r\u0012\u0004\u0012\u00020\u00060\b¢\u0006\u0002\b\u0019H\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u001f\u0010$\u001a%\u0010%\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010&\u001a\u00020\u0002H\u0003ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b'\u0010(\u001a;\u0010)\u001a\u00020\n*\u00020\n2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010*\u001a\u00020\u00102\b\u0010\u0014\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0013\u001a\u00020\u0002H\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b+\u0010,\"\u001a\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001ø\u0001\u0000¢\u0006\b\n\u0000\u001a\u0004\b\u0003\u0010\u0004\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006-"}, m5175d2 = {"LocalAbsoluteTonalElevation", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "Landroidx/compose/ui/unit/Dp;", "getLocalAbsoluteTonalElevation", "()Landroidx/compose/runtime/ProvidableCompositionLocal;", "Surface", "", "onClick", "Lkotlin/Function0;", "modifier", "Landroidx/compose/ui/Modifier;", "enabled", "", "shape", "Landroidx/compose/ui/graphics/Shape;", "color", "Landroidx/compose/ui/graphics/Color;", "contentColor", "tonalElevation", "shadowElevation", "border", "Landroidx/compose/foundation/BorderStroke;", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "content", "Landroidx/compose/runtime/Composable;", "Surface-o_FOJdg", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;ZLandroidx/compose/ui/graphics/Shape;JJFFLandroidx/compose/foundation/BorderStroke;Landroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;III)V", "Surface-T9BRK9s", "(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/graphics/Shape;JJFFLandroidx/compose/foundation/BorderStroke;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "selected", "Surface-d85dljk", "(ZLkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;ZLandroidx/compose/ui/graphics/Shape;JJFFLandroidx/compose/foundation/BorderStroke;Landroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;III)V", "checked", "onCheckedChange", "Lkotlin/Function1;", "(ZLkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZLandroidx/compose/ui/graphics/Shape;JJFFLandroidx/compose/foundation/BorderStroke;Landroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;III)V", "surfaceColorAtElevation", "elevation", "surfaceColorAtElevation-CLU3JFs", "(JFLandroidx/compose/runtime/Composer;I)J", "surface", "backgroundColor", "surface-8ww4TTg", "(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/graphics/Shape;JLandroidx/compose/foundation/BorderStroke;F)Landroidx/compose/ui/Modifier;", "material3_release"}, m5176k = 2, m5177mv = {1, 7, 1}, m5179xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
public final class SurfaceKt {
    private static final ProvidableCompositionLocal<C1700Dp> LocalAbsoluteTonalElevation = CompositionLocalKt.compositionLocalOf$default(null, new Function0<C1700Dp>() { // from class: androidx.compose.material3.SurfaceKt$LocalAbsoluteTonalElevation$1
        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ C1700Dp invoke() {
            return C1700Dp.m11523boximpl(m8150invokeD9Ej5fM());
        }

        /* renamed from: invoke-D9Ej5fM, reason: not valid java name */
        public final float m8150invokeD9Ej5fM() {
            return C1700Dp.m11525constructorimpl(0);
        }
    }, 1, null);

    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    /* renamed from: Surface-T9BRK9s, reason: not valid java name */
    public static final void m8142SurfaceT9BRK9s(Modifier modifier, Shape shape, long j4, long j5, float f4, float f5, BorderStroke borderStroke, final Function2<? super Composer, ? super Integer, Unit> content, Composer composer, final int i4, int i5) {
        Intrinsics.checkNotNullParameter(content, "content");
        composer.startReplaceableGroup(-513881741);
        final Modifier modifier2 = (i5 & 1) != 0 ? Modifier.INSTANCE : modifier;
        final Shape rectangleShape = (i5 & 2) != 0 ? RectangleShapeKt.getRectangleShape() : shape;
        final long jM7879getSurface0d7_KjU = (i5 & 4) != 0 ? MaterialTheme.INSTANCE.getColorScheme(composer, 6).m7879getSurface0d7_KjU() : j4;
        long jM7915contentColorForek8zF_U = (i5 & 8) != 0 ? ColorSchemeKt.m7915contentColorForek8zF_U(jM7879getSurface0d7_KjU, composer, (i4 >> 6) & 14) : j5;
        float fM11525constructorimpl = (i5 & 16) != 0 ? C1700Dp.m11525constructorimpl(0) : f4;
        float fM11525constructorimpl2 = (i5 & 32) != 0 ? C1700Dp.m11525constructorimpl(0) : f5;
        BorderStroke borderStroke2 = (i5 & 64) != 0 ? null : borderStroke;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-513881741, i4, -1, "androidx.compose.material3.Surface (Surface.kt:98)");
        }
        ProvidableCompositionLocal<C1700Dp> providableCompositionLocal = LocalAbsoluteTonalElevation;
        final float fM11525constructorimpl3 = C1700Dp.m11525constructorimpl(((C1700Dp) composer.consume(providableCompositionLocal)).m11539unboximpl() + fM11525constructorimpl);
        ProvidedValue[] providedValueArr = {ContentColorKt.getLocalContentColor().provides(Color.m9168boximpl(jM7915contentColorForek8zF_U)), providableCompositionLocal.provides(C1700Dp.m11523boximpl(fM11525constructorimpl3))};
        final BorderStroke borderStroke3 = borderStroke2;
        final float f6 = fM11525constructorimpl2;
        CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) providedValueArr, ComposableLambdaKt.composableLambda(composer, -70914509, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.SurfaceKt$Surface$1

            @Metadata(m5176k = 3, m5177mv = {1, 7, 1}, m5179xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
            @DebugMetadata(m5191c = "androidx.compose.material3.SurfaceKt$Surface$1$2", m5192f = "Surface.kt", m5193i = {}, m5194l = {}, m5195m = "invokeSuspend", m5196n = {}, m5197s = {})
            /* renamed from: androidx.compose.material3.SurfaceKt$Surface$1$2 */
            public static final class C10902 extends SuspendLambda implements Function2<PointerInputScope, Continuation<? super Unit>, Object> {
                int label;

                public C10902(Continuation<? super C10902> continuation) {
                    super(2, continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new C10902(continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(PointerInputScope pointerInputScope, Continuation<? super Unit> continuation) {
                    return ((C10902) create(pointerInputScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return Unit.INSTANCE;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                invoke(composer2, num.intValue());
                return Unit.INSTANCE;
            }

            @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
            @Composable
            public final void invoke(Composer composer2, int i6) {
                if ((i6 & 11) == 2 && composer2.getSkipping()) {
                    composer2.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-70914509, i6, -1, "androidx.compose.material3.Surface.<anonymous> (Surface.kt:112)");
                }
                Modifier modifierPointerInput = SuspendingPointerInputFilterKt.pointerInput(SemanticsModifierKt.semantics(SurfaceKt.m8148surface8ww4TTg(modifier2, rectangleShape, SurfaceKt.m8149surfaceColorAtElevationCLU3JFs(jM7879getSurface0d7_KjU, fM11525constructorimpl3, composer2, (i4 >> 6) & 14), borderStroke3, f6), false, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.SurfaceKt$Surface$1.1
                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(SemanticsPropertyReceiver semantics) {
                        Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                        invoke2(semanticsPropertyReceiver);
                        return Unit.INSTANCE;
                    }
                }), Unit.INSTANCE, new C10902(null));
                Function2<Composer, Integer, Unit> function2 = content;
                int i7 = i4;
                composer2.startReplaceableGroup(733328855);
                MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), true, composer2, 48);
                composer2.startReplaceableGroup(-1323940314);
                Density density = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
                LayoutDirection layoutDirection = (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
                ViewConfiguration viewConfiguration = (ViewConfiguration) composer2.consume(CompositionLocalsKt.getLocalViewConfiguration());
                ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor = companion.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(modifierPointerInput);
                if (!(composer2.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composer2.startReusableNode();
                if (composer2.getInserting()) {
                    composer2.createNode(constructor);
                } else {
                    composer2.useNode();
                }
                composer2.disableReusing();
                Composer composerM8824constructorimpl = Updater.m8824constructorimpl(composer2);
                Updater.m8831setimpl(composerM8824constructorimpl, measurePolicyRememberBoxMeasurePolicy, companion.getSetMeasurePolicy());
                Updater.m8831setimpl(composerM8824constructorimpl, density, companion.getSetDensity());
                Updater.m8831setimpl(composerM8824constructorimpl, layoutDirection, companion.getSetLayoutDirection());
                Updater.m8831setimpl(composerM8824constructorimpl, viewConfiguration, companion.getSetViewConfiguration());
                composer2.enableReusing();
                function3MaterializerOf.invoke(SkippableUpdater.m8815boximpl(SkippableUpdater.m8816constructorimpl(composer2)), composer2, 0);
                composer2.startReplaceableGroup(2058660585);
                composer2.startReplaceableGroup(-2137368960);
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                composer2.startReplaceableGroup(1703151929);
                function2.invoke(composer2, Integer.valueOf((i7 >> 21) & 14));
                composer2.endReplaceableGroup();
                composer2.endReplaceableGroup();
                composer2.endReplaceableGroup();
                composer2.endNode();
                composer2.endReplaceableGroup();
                composer2.endReplaceableGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }), composer, 56);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
    }

    @Composable
    @ExperimentalMaterial3Api
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    /* renamed from: Surface-d85dljk, reason: not valid java name */
    public static final void m8143Surfaced85dljk(final boolean z3, final Function0<Unit> onClick, Modifier modifier, boolean z4, Shape shape, long j4, long j5, float f4, float f5, BorderStroke borderStroke, MutableInteractionSource mutableInteractionSource, final Function2<? super Composer, ? super Integer, Unit> content, Composer composer, final int i4, final int i5, int i6) {
        MutableInteractionSource mutableInteractionSource2;
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        Intrinsics.checkNotNullParameter(content, "content");
        composer.startReplaceableGroup(540296512);
        Modifier modifier2 = (i6 & 4) != 0 ? Modifier.INSTANCE : modifier;
        final boolean z5 = (i6 & 8) != 0 ? true : z4;
        Shape rectangleShape = (i6 & 16) != 0 ? RectangleShapeKt.getRectangleShape() : shape;
        long jM7879getSurface0d7_KjU = (i6 & 32) != 0 ? MaterialTheme.INSTANCE.getColorScheme(composer, 6).m7879getSurface0d7_KjU() : j4;
        long jM7915contentColorForek8zF_U = (i6 & 64) != 0 ? ColorSchemeKt.m7915contentColorForek8zF_U(jM7879getSurface0d7_KjU, composer, (i4 >> 15) & 14) : j5;
        float fM11525constructorimpl = (i6 & 128) != 0 ? C1700Dp.m11525constructorimpl(0) : f4;
        float fM11525constructorimpl2 = (i6 & 256) != 0 ? C1700Dp.m11525constructorimpl(0) : f5;
        BorderStroke borderStroke2 = (i6 & 512) != 0 ? null : borderStroke;
        if ((i6 & 1024) != 0) {
            composer.startReplaceableGroup(-492369756);
            Object objRememberedValue = composer.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceableGroup();
            mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
        } else {
            mutableInteractionSource2 = mutableInteractionSource;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(540296512, i4, i5, "androidx.compose.material3.Surface (Surface.kt:311)");
        }
        ProvidableCompositionLocal<C1700Dp> providableCompositionLocal = LocalAbsoluteTonalElevation;
        final float fM11525constructorimpl3 = C1700Dp.m11525constructorimpl(((C1700Dp) composer.consume(providableCompositionLocal)).m11539unboximpl() + fM11525constructorimpl);
        ProvidedValue[] providedValueArr = {ContentColorKt.getLocalContentColor().provides(Color.m9168boximpl(jM7915contentColorForek8zF_U)), providableCompositionLocal.provides(C1700Dp.m11523boximpl(fM11525constructorimpl3))};
        final Modifier modifier3 = modifier2;
        final Shape shape2 = rectangleShape;
        final long j6 = jM7879getSurface0d7_KjU;
        final BorderStroke borderStroke3 = borderStroke2;
        final float f6 = fM11525constructorimpl2;
        final MutableInteractionSource mutableInteractionSource3 = mutableInteractionSource2;
        CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) providedValueArr, ComposableLambdaKt.composableLambda(composer, -1164547968, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.SurfaceKt$Surface$5
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                invoke(composer2, num.intValue());
                return Unit.INSTANCE;
            }

            @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
            @Composable
            public final void invoke(Composer composer2, int i7) {
                if ((i7 & 11) == 2 && composer2.getSkipping()) {
                    composer2.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1164547968, i7, -1, "androidx.compose.material3.Surface.<anonymous> (Surface.kt:329)");
                }
                Modifier modifierM7559selectableO2vRcR0 = SelectableKt.m7559selectableO2vRcR0(SurfaceKt.m8148surface8ww4TTg(TouchTargetKt.minimumTouchTargetSize(modifier3), shape2, SurfaceKt.m8149surfaceColorAtElevationCLU3JFs(j6, fM11525constructorimpl3, composer2, (i4 >> 15) & 14), borderStroke3, f6), z3, mutableInteractionSource3, RippleKt.m7794rememberRipple9IZ8Weo(false, 0.0f, 0L, composer2, 0, 7), z5, Role.m10917boximpl(Role.INSTANCE.m10930getTabo7Vup1c()), onClick);
                Function2<Composer, Integer, Unit> function2 = content;
                int i8 = i5;
                composer2.startReplaceableGroup(733328855);
                MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), true, composer2, 48);
                composer2.startReplaceableGroup(-1323940314);
                Density density = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
                LayoutDirection layoutDirection = (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
                ViewConfiguration viewConfiguration = (ViewConfiguration) composer2.consume(CompositionLocalsKt.getLocalViewConfiguration());
                ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor = companion.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(modifierM7559selectableO2vRcR0);
                if (!(composer2.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composer2.startReusableNode();
                if (composer2.getInserting()) {
                    composer2.createNode(constructor);
                } else {
                    composer2.useNode();
                }
                composer2.disableReusing();
                Composer composerM8824constructorimpl = Updater.m8824constructorimpl(composer2);
                Updater.m8831setimpl(composerM8824constructorimpl, measurePolicyRememberBoxMeasurePolicy, companion.getSetMeasurePolicy());
                Updater.m8831setimpl(composerM8824constructorimpl, density, companion.getSetDensity());
                Updater.m8831setimpl(composerM8824constructorimpl, layoutDirection, companion.getSetLayoutDirection());
                Updater.m8831setimpl(composerM8824constructorimpl, viewConfiguration, companion.getSetViewConfiguration());
                composer2.enableReusing();
                function3MaterializerOf.invoke(SkippableUpdater.m8815boximpl(SkippableUpdater.m8816constructorimpl(composer2)), composer2, 0);
                composer2.startReplaceableGroup(2058660585);
                composer2.startReplaceableGroup(-2137368960);
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                composer2.startReplaceableGroup(796134330);
                function2.invoke(composer2, Integer.valueOf((i8 >> 3) & 14));
                composer2.endReplaceableGroup();
                composer2.endReplaceableGroup();
                composer2.endReplaceableGroup();
                composer2.endNode();
                composer2.endReplaceableGroup();
                composer2.endReplaceableGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }), composer, 56);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
    }

    @Composable
    @ExperimentalMaterial3Api
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    /* renamed from: Surface-o_FOJdg, reason: not valid java name */
    public static final void m8145Surfaceo_FOJdg(final Function0<Unit> onClick, Modifier modifier, boolean z3, Shape shape, long j4, long j5, float f4, float f5, BorderStroke borderStroke, MutableInteractionSource mutableInteractionSource, final Function2<? super Composer, ? super Integer, Unit> content, Composer composer, final int i4, final int i5, int i6) {
        MutableInteractionSource mutableInteractionSource2;
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        Intrinsics.checkNotNullParameter(content, "content");
        composer.startReplaceableGroup(-789752804);
        Modifier modifier2 = (i6 & 2) != 0 ? Modifier.INSTANCE : modifier;
        final boolean z4 = (i6 & 4) != 0 ? true : z3;
        Shape rectangleShape = (i6 & 8) != 0 ? RectangleShapeKt.getRectangleShape() : shape;
        long jM7879getSurface0d7_KjU = (i6 & 16) != 0 ? MaterialTheme.INSTANCE.getColorScheme(composer, 6).m7879getSurface0d7_KjU() : j4;
        long jM7915contentColorForek8zF_U = (i6 & 32) != 0 ? ColorSchemeKt.m7915contentColorForek8zF_U(jM7879getSurface0d7_KjU, composer, (i4 >> 12) & 14) : j5;
        float fM11525constructorimpl = (i6 & 64) != 0 ? C1700Dp.m11525constructorimpl(0) : f4;
        float fM11525constructorimpl2 = (i6 & 128) != 0 ? C1700Dp.m11525constructorimpl(0) : f5;
        BorderStroke borderStroke2 = (i6 & 256) != 0 ? null : borderStroke;
        if ((i6 & 512) != 0) {
            composer.startReplaceableGroup(-492369756);
            Object objRememberedValue = composer.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceableGroup();
            mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
        } else {
            mutableInteractionSource2 = mutableInteractionSource;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-789752804, i4, i5, "androidx.compose.material3.Surface (Surface.kt:200)");
        }
        ProvidableCompositionLocal<C1700Dp> providableCompositionLocal = LocalAbsoluteTonalElevation;
        final float fM11525constructorimpl3 = C1700Dp.m11525constructorimpl(((C1700Dp) composer.consume(providableCompositionLocal)).m11539unboximpl() + fM11525constructorimpl);
        ProvidedValue[] providedValueArr = {ContentColorKt.getLocalContentColor().provides(Color.m9168boximpl(jM7915contentColorForek8zF_U)), providableCompositionLocal.provides(C1700Dp.m11523boximpl(fM11525constructorimpl3))};
        final Modifier modifier3 = modifier2;
        final Shape shape2 = rectangleShape;
        final long j6 = jM7879getSurface0d7_KjU;
        final BorderStroke borderStroke3 = borderStroke2;
        final float f6 = fM11525constructorimpl2;
        final MutableInteractionSource mutableInteractionSource3 = mutableInteractionSource2;
        CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) providedValueArr, ComposableLambdaKt.composableLambda(composer, 1279702876, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.SurfaceKt$Surface$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                invoke(composer2, num.intValue());
                return Unit.INSTANCE;
            }

            @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
            @Composable
            public final void invoke(Composer composer2, int i7) {
                if ((i7 & 11) == 2 && composer2.getSkipping()) {
                    composer2.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1279702876, i7, -1, "androidx.compose.material3.Surface.<anonymous> (Surface.kt:217)");
                }
                Modifier modifierM7090clickableO2vRcR0$default = ClickableKt.m7090clickableO2vRcR0$default(SurfaceKt.m8148surface8ww4TTg(TouchTargetKt.minimumTouchTargetSize(modifier3), shape2, SurfaceKt.m8149surfaceColorAtElevationCLU3JFs(j6, fM11525constructorimpl3, composer2, (i4 >> 12) & 14), borderStroke3, f6), mutableInteractionSource3, RippleKt.m7794rememberRipple9IZ8Weo(false, 0.0f, 0L, composer2, 0, 7), z4, null, Role.m10917boximpl(Role.INSTANCE.m10924getButtono7Vup1c()), onClick, 8, null);
                Function2<Composer, Integer, Unit> function2 = content;
                int i8 = i5;
                composer2.startReplaceableGroup(733328855);
                MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), true, composer2, 48);
                composer2.startReplaceableGroup(-1323940314);
                Density density = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
                LayoutDirection layoutDirection = (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
                ViewConfiguration viewConfiguration = (ViewConfiguration) composer2.consume(CompositionLocalsKt.getLocalViewConfiguration());
                ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor = companion.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(modifierM7090clickableO2vRcR0$default);
                if (!(composer2.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composer2.startReusableNode();
                if (composer2.getInserting()) {
                    composer2.createNode(constructor);
                } else {
                    composer2.useNode();
                }
                composer2.disableReusing();
                Composer composerM8824constructorimpl = Updater.m8824constructorimpl(composer2);
                Updater.m8831setimpl(composerM8824constructorimpl, measurePolicyRememberBoxMeasurePolicy, companion.getSetMeasurePolicy());
                Updater.m8831setimpl(composerM8824constructorimpl, density, companion.getSetDensity());
                Updater.m8831setimpl(composerM8824constructorimpl, layoutDirection, companion.getSetLayoutDirection());
                Updater.m8831setimpl(composerM8824constructorimpl, viewConfiguration, companion.getSetViewConfiguration());
                composer2.enableReusing();
                function3MaterializerOf.invoke(SkippableUpdater.m8815boximpl(SkippableUpdater.m8816constructorimpl(composer2)), composer2, 0);
                composer2.startReplaceableGroup(2058660585);
                composer2.startReplaceableGroup(-2137368960);
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                composer2.startReplaceableGroup(-126864234);
                function2.invoke(composer2, Integer.valueOf(i8 & 14));
                composer2.endReplaceableGroup();
                composer2.endReplaceableGroup();
                composer2.endReplaceableGroup();
                composer2.endNode();
                composer2.endReplaceableGroup();
                composer2.endReplaceableGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }), composer, 56);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
    }

    public static final ProvidableCompositionLocal<C1700Dp> getLocalAbsoluteTonalElevation() {
        return LocalAbsoluteTonalElevation;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: surface-8ww4TTg, reason: not valid java name */
    public static final Modifier m8148surface8ww4TTg(Modifier modifier, Shape shape, long j4, BorderStroke borderStroke, float f4) {
        return ClipKt.clip(BackgroundKt.m7067backgroundbw27NRU(ShadowKt.m8864shadows4CzXII$default(modifier, f4, shape, false, 0L, 0L, 24, null).then(borderStroke != null ? BorderKt.border(Modifier.INSTANCE, borderStroke, shape) : Modifier.INSTANCE), j4, shape), shape);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Composable
    /* renamed from: surfaceColorAtElevation-CLU3JFs, reason: not valid java name */
    public static final long m8149surfaceColorAtElevationCLU3JFs(long j4, float f4, Composer composer, int i4) {
        composer.startReplaceableGroup(-2079918090);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-2079918090, i4, -1, "androidx.compose.material3.surfaceColorAtElevation (Surface.kt:481)");
        }
        MaterialTheme materialTheme = MaterialTheme.INSTANCE;
        if (Color.m9179equalsimpl0(j4, materialTheme.getColorScheme(composer, 6).m7879getSurface0d7_KjU())) {
            j4 = ColorSchemeKt.m7920surfaceColorAtElevation3ABfNKs(materialTheme.getColorScheme(composer, 6), f4);
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return j4;
    }

    @Composable
    @ExperimentalMaterial3Api
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    /* renamed from: Surface-d85dljk, reason: not valid java name */
    public static final void m8144Surfaced85dljk(final boolean z3, final Function1<? super Boolean, Unit> onCheckedChange, Modifier modifier, boolean z4, Shape shape, long j4, long j5, float f4, float f5, BorderStroke borderStroke, MutableInteractionSource mutableInteractionSource, final Function2<? super Composer, ? super Integer, Unit> content, Composer composer, final int i4, final int i5, int i6) {
        MutableInteractionSource mutableInteractionSource2;
        Intrinsics.checkNotNullParameter(onCheckedChange, "onCheckedChange");
        Intrinsics.checkNotNullParameter(content, "content");
        composer.startReplaceableGroup(-1877401889);
        Modifier modifier2 = (i6 & 4) != 0 ? Modifier.INSTANCE : modifier;
        final boolean z5 = (i6 & 8) != 0 ? true : z4;
        Shape rectangleShape = (i6 & 16) != 0 ? RectangleShapeKt.getRectangleShape() : shape;
        long jM7879getSurface0d7_KjU = (i6 & 32) != 0 ? MaterialTheme.INSTANCE.getColorScheme(composer, 6).m7879getSurface0d7_KjU() : j4;
        long jM7915contentColorForek8zF_U = (i6 & 64) != 0 ? ColorSchemeKt.m7915contentColorForek8zF_U(jM7879getSurface0d7_KjU, composer, (i4 >> 15) & 14) : j5;
        float fM11525constructorimpl = (i6 & 128) != 0 ? C1700Dp.m11525constructorimpl(0) : f4;
        float fM11525constructorimpl2 = (i6 & 256) != 0 ? C1700Dp.m11525constructorimpl(0) : f5;
        BorderStroke borderStroke2 = (i6 & 512) != 0 ? null : borderStroke;
        if ((i6 & 1024) != 0) {
            composer.startReplaceableGroup(-492369756);
            Object objRememberedValue = composer.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceableGroup();
            mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
        } else {
            mutableInteractionSource2 = mutableInteractionSource;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1877401889, i4, i5, "androidx.compose.material3.Surface (Surface.kt:424)");
        }
        ProvidableCompositionLocal<C1700Dp> providableCompositionLocal = LocalAbsoluteTonalElevation;
        final float fM11525constructorimpl3 = C1700Dp.m11525constructorimpl(((C1700Dp) composer.consume(providableCompositionLocal)).m11539unboximpl() + fM11525constructorimpl);
        ProvidedValue[] providedValueArr = {ContentColorKt.getLocalContentColor().provides(Color.m9168boximpl(jM7915contentColorForek8zF_U)), providableCompositionLocal.provides(C1700Dp.m11523boximpl(fM11525constructorimpl3))};
        final Modifier modifier3 = modifier2;
        final Shape shape2 = rectangleShape;
        final long j6 = jM7879getSurface0d7_KjU;
        final BorderStroke borderStroke3 = borderStroke2;
        final float f6 = fM11525constructorimpl2;
        final MutableInteractionSource mutableInteractionSource3 = mutableInteractionSource2;
        CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) providedValueArr, ComposableLambdaKt.composableLambda(composer, 712720927, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.SurfaceKt$Surface$7
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                invoke(composer2, num.intValue());
                return Unit.INSTANCE;
            }

            @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
            @Composable
            public final void invoke(Composer composer2, int i7) {
                if ((i7 & 11) == 2 && composer2.getSkipping()) {
                    composer2.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(712720927, i7, -1, "androidx.compose.material3.Surface.<anonymous> (Surface.kt:442)");
                }
                Modifier modifierM7563toggleableO2vRcR0 = ToggleableKt.m7563toggleableO2vRcR0(SurfaceKt.m8148surface8ww4TTg(TouchTargetKt.minimumTouchTargetSize(modifier3), shape2, SurfaceKt.m8149surfaceColorAtElevationCLU3JFs(j6, fM11525constructorimpl3, composer2, (i4 >> 15) & 14), borderStroke3, f6), z3, mutableInteractionSource3, RippleKt.m7794rememberRipple9IZ8Weo(false, 0.0f, 0L, composer2, 0, 7), z5, Role.m10917boximpl(Role.INSTANCE.m10929getSwitcho7Vup1c()), onCheckedChange);
                Function2<Composer, Integer, Unit> function2 = content;
                int i8 = i5;
                composer2.startReplaceableGroup(733328855);
                MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), true, composer2, 48);
                composer2.startReplaceableGroup(-1323940314);
                Density density = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
                LayoutDirection layoutDirection = (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
                ViewConfiguration viewConfiguration = (ViewConfiguration) composer2.consume(CompositionLocalsKt.getLocalViewConfiguration());
                ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor = companion.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(modifierM7563toggleableO2vRcR0);
                if (!(composer2.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composer2.startReusableNode();
                if (composer2.getInserting()) {
                    composer2.createNode(constructor);
                } else {
                    composer2.useNode();
                }
                composer2.disableReusing();
                Composer composerM8824constructorimpl = Updater.m8824constructorimpl(composer2);
                Updater.m8831setimpl(composerM8824constructorimpl, measurePolicyRememberBoxMeasurePolicy, companion.getSetMeasurePolicy());
                Updater.m8831setimpl(composerM8824constructorimpl, density, companion.getSetDensity());
                Updater.m8831setimpl(composerM8824constructorimpl, layoutDirection, companion.getSetLayoutDirection());
                Updater.m8831setimpl(composerM8824constructorimpl, viewConfiguration, companion.getSetViewConfiguration());
                composer2.enableReusing();
                function3MaterializerOf.invoke(SkippableUpdater.m8815boximpl(SkippableUpdater.m8816constructorimpl(composer2)), composer2, 0);
                composer2.startReplaceableGroup(2058660585);
                composer2.startReplaceableGroup(-2137368960);
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                composer2.startReplaceableGroup(-1621564071);
                function2.invoke(composer2, Integer.valueOf((i8 >> 3) & 14));
                composer2.endReplaceableGroup();
                composer2.endReplaceableGroup();
                composer2.endReplaceableGroup();
                composer2.endNode();
                composer2.endReplaceableGroup();
                composer2.endReplaceableGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }), composer, 56);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
    }
}
