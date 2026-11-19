package androidx.compose.material3;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.selection.SelectableKt;
import androidx.compose.foundation.selection.ToggleableKt;
import androidx.compose.p013ui.Alignment;
import androidx.compose.p013ui.ComposedModifierKt;
import androidx.compose.p013ui.Modifier;
import androidx.compose.p013ui.draw.ClipKt;
import androidx.compose.p013ui.graphics.Color;
import androidx.compose.p013ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.p013ui.graphics.RectangleShapeKt;
import androidx.compose.p013ui.graphics.Shape;
import androidx.compose.p013ui.input.pointer.C2831xe3d9cdbd;
import androidx.compose.p013ui.input.pointer.PointerInputScope;
import androidx.compose.p013ui.input.pointer.SuspendPointerInputElement;
import androidx.compose.p013ui.layout.MeasurePolicy;
import androidx.compose.p013ui.node.ComposeUiNode;
import androidx.compose.p013ui.platform.CompositionLocalsKt;
import androidx.compose.p013ui.semantics.SemanticsModifierKt;
import androidx.compose.p013ui.semantics.SemanticsPropertiesKt;
import androidx.compose.p013ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.p013ui.unit.C3127Dp;
import androidx.compose.p013ui.unit.Density;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.view.PointerIconCompat;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(m13557d1 = {"\u0000X\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\u0003\u001a\u0091\u0001\u0010\u0005\u001a\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0012\u001a\u00020\u00022\b\b\u0002\u0010\u0013\u001a\u00020\u00022\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00172\u0011\u0010\u0018\u001a\r\u0012\u0004\u0012\u00020\u00060\b¢\u0006\u0002\b\u0019H\u0007ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001b\u001am\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0012\u001a\u00020\u00022\b\b\u0002\u0010\u0013\u001a\u00020\u00022\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00152\u0011\u0010\u0018\u001a\r\u0012\u0004\u0012\u00020\u00060\b¢\u0006\u0002\b\u0019H\u0007ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001d\u001a\u0099\u0001\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u001e\u001a\u00020\f2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0012\u001a\u00020\u00022\b\b\u0002\u0010\u0013\u001a\u00020\u00022\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00172\u0011\u0010\u0018\u001a\r\u0012\u0004\u0012\u00020\u00060\b¢\u0006\u0002\b\u0019H\u0007ø\u0001\u0000¢\u0006\u0004\b\u001f\u0010 \u001a\u009f\u0001\u0010\u0005\u001a\u00020\u00062\u0006\u0010!\u001a\u00020\f2\u0012\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00060#2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0012\u001a\u00020\u00022\b\b\u0002\u0010\u0013\u001a\u00020\u00022\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00172\u0011\u0010\u0018\u001a\r\u0012\u0004\u0012\u00020\u00060\b¢\u0006\u0002\b\u0019H\u0007ø\u0001\u0000¢\u0006\u0004\b\u001f\u0010$\u001a\"\u0010%\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010&\u001a\u00020\u0002H\u0003ø\u0001\u0000¢\u0006\u0004\b'\u0010(\u001a8\u0010)\u001a\u00020\n*\u00020\n2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010*\u001a\u00020\u00102\b\u0010\u0014\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0013\u001a\u00020+H\u0003ø\u0001\u0000¢\u0006\u0004\b,\u0010-\"\u0017\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0003\u0010\u0004\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006."}, m13558d2 = {"LocalAbsoluteTonalElevation", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "Landroidx/compose/ui/unit/Dp;", "getLocalAbsoluteTonalElevation", "()Landroidx/compose/runtime/ProvidableCompositionLocal;", "Surface", "", "onClick", "Lkotlin/Function0;", "modifier", "Landroidx/compose/ui/Modifier;", "enabled", "", "shape", "Landroidx/compose/ui/graphics/Shape;", TypedValues.Custom.S_COLOR, "Landroidx/compose/ui/graphics/Color;", "contentColor", "tonalElevation", "shadowElevation", "border", "Landroidx/compose/foundation/BorderStroke;", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "content", "Landroidx/compose/runtime/Composable;", "Surface-o_FOJdg", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;ZLandroidx/compose/ui/graphics/Shape;JJFFLandroidx/compose/foundation/BorderStroke;Landroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;III)V", "Surface-T9BRK9s", "(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/graphics/Shape;JJFFLandroidx/compose/foundation/BorderStroke;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "selected", "Surface-d85dljk", "(ZLkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;ZLandroidx/compose/ui/graphics/Shape;JJFFLandroidx/compose/foundation/BorderStroke;Landroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;III)V", "checked", "onCheckedChange", "Lkotlin/Function1;", "(ZLkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZLandroidx/compose/ui/graphics/Shape;JJFFLandroidx/compose/foundation/BorderStroke;Landroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;III)V", "surfaceColorAtElevation", "elevation", "surfaceColorAtElevation-CLU3JFs", "(JFLandroidx/compose/runtime/Composer;I)J", "surface", "backgroundColor", "", "surface-XO-JAsU", "(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/graphics/Shape;JLandroidx/compose/foundation/BorderStroke;F)Landroidx/compose/ui/Modifier;", "material3_release"}, m13559k = 2, m13560mv = {1, 8, 0}, m13562xi = 48)
@SourceDebugExtension({"SMAP\nSurface.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Surface.kt\nandroidx/compose/material3/SurfaceKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 4 Dp.kt\nandroidx/compose/ui/unit/Dp\n*L\n1#1,475:1\n148#2:476\n148#2:477\n148#2:480\n148#2:481\n148#2:484\n148#2:485\n148#2:488\n148#2:489\n77#3:478\n77#3:482\n77#3:486\n77#3:490\n50#4:479\n50#4:483\n50#4:487\n50#4:491\n*S KotlinDebug\n*F\n+ 1 Surface.kt\nandroidx/compose/material3/SurfaceKt\n*L\n99#1:476\n100#1:477\n199#1:480\n200#1:481\n302#1:484\n303#1:485\n406#1:488\n407#1:489\n104#1:478\n205#1:482\n308#1:486\n412#1:490\n104#1:479\n205#1:483\n308#1:487\n412#1:491\n*E\n"})
/* loaded from: classes2.dex */
public final class SurfaceKt {
    private static final ProvidableCompositionLocal<C3127Dp> LocalAbsoluteTonalElevation = CompositionLocalKt.compositionLocalOf$default(null, new Function0<C3127Dp>() { // from class: androidx.compose.material3.SurfaceKt$LocalAbsoluteTonalElevation$1
        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ C3127Dp invoke() {
            return C3127Dp.m23559boximpl(m19288invokeD9Ej5fM());
        }

        /* renamed from: invoke-D9Ej5fM, reason: not valid java name */
        public final float m19288invokeD9Ej5fM() {
            return C3127Dp.m23561constructorimpl(0);
        }
    }, 1, null);

    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    /* renamed from: Surface-T9BRK9s, reason: not valid java name */
    public static final void m19280SurfaceT9BRK9s(Modifier modifier, Shape shape, long j10, long j11, float f10, float f11, BorderStroke borderStroke, final Function2<? super Composer, ? super Integer, Unit> function2, Composer composer, int i10, int i11) {
        if ((i11 & 1) != 0) {
            modifier = Modifier.INSTANCE;
        }
        if ((i11 & 2) != 0) {
            shape = RectangleShapeKt.getRectangleShape();
        }
        if ((i11 & 4) != 0) {
            j10 = MaterialTheme.INSTANCE.getColorScheme(composer, 6).getSurface();
        }
        if ((i11 & 8) != 0) {
            j11 = ColorSchemeKt.m18666contentColorForek8zF_U(j10, composer, (i10 >> 6) & 14);
        }
        if ((i11 & 16) != 0) {
            f10 = C3127Dp.m23561constructorimpl(0);
        }
        if ((i11 & 32) != 0) {
            f11 = C3127Dp.m23561constructorimpl(0);
        }
        if ((i11 & 64) != 0) {
            borderStroke = null;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-513881741, i10, -1, "androidx.compose.material3.Surface (Surface.kt:102)");
        }
        ProvidableCompositionLocal<C3127Dp> providableCompositionLocal = LocalAbsoluteTonalElevation;
        final float fM23561constructorimpl = C3127Dp.m23561constructorimpl(((C3127Dp) composer.consume(providableCompositionLocal)).m23575unboximpl() + f10);
        ProvidedValue[] providedValueArr = {ContentColorKt.getLocalContentColor().provides(Color.m20966boximpl(j11)), providableCompositionLocal.provides(C3127Dp.m23559boximpl(fM23561constructorimpl))};
        final long j12 = j10;
        final Shape shape2 = shape;
        final BorderStroke borderStroke2 = borderStroke;
        final float f12 = f11;
        final Modifier modifier2 = modifier;
        CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) providedValueArr, ComposableLambdaKt.rememberComposableLambda(-70914509, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.SurfaceKt$Surface$1

            @Metadata(m13557d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m13558d2 = {"<anonymous>", "", "Landroidx/compose/ui/input/pointer/PointerInputScope;"}, m13559k = 3, m13560mv = {1, 8, 0}, m13562xi = 48)
            @DebugMetadata(m13595c = "androidx.compose.material3.SurfaceKt$Surface$1$3", m13596f = "Surface.kt", m13597i = {}, m13598l = {}, m13599m = "invokeSuspend", m13600n = {}, m13601s = {})
            /* renamed from: androidx.compose.material3.SurfaceKt$Surface$1$3 */
            public static final class C23153 extends SuspendLambda implements Function2<PointerInputScope, Continuation<? super Unit>, Object> {
                int label;

                public C23153(Continuation<? super C23153> continuation) {
                    super(2, continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new C23153(continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(PointerInputScope pointerInputScope, Continuation<? super Unit> continuation) {
                    return ((C23153) create(pointerInputScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
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
            public final void invoke(Composer composer2, int i12) {
                if ((i12 & 3) == 2 && composer2.getSkipping()) {
                    composer2.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-70914509, i12, -1, "androidx.compose.material3.Surface.<anonymous> (Surface.kt:108)");
                }
                Modifier modifierThen = SemanticsModifierKt.semantics(SurfaceKt.m19286surfaceXOJAsU(modifier2, shape2, SurfaceKt.m19287surfaceColorAtElevationCLU3JFs(j12, fM23561constructorimpl, composer2, 0), borderStroke2, ((Density) composer2.consume(CompositionLocalsKt.getLocalDensity())).mo17332toPx0680j_4(f12)), false, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.SurfaceKt$Surface$1.2
                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                        invoke2(semanticsPropertyReceiver);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                        SemanticsPropertiesKt.setContainer(semanticsPropertyReceiver, true);
                    }
                }).then(new SuspendPointerInputElement(Unit.INSTANCE, null, null, new C2831xe3d9cdbd(new C23153(null)), 6, null));
                Function2<Composer, Integer, Unit> function22 = function2;
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), true);
                int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer2, modifierThen);
                ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor = companion.getConstructor();
                if (composer2.getApplier() == null) {
                    ComposablesKt.invalidApplier();
                }
                composer2.startReusableNode();
                if (composer2.getInserting()) {
                    composer2.createNode(constructor);
                } else {
                    composer2.useNode();
                }
                Composer composerM20418constructorimpl = Updater.m20418constructorimpl(composer2);
                Updater.m20425setimpl(composerM20418constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion.getSetMeasurePolicy());
                Updater.m20425setimpl(composerM20418constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
                if (composerM20418constructorimpl.getInserting() || !Intrinsics.areEqual(composerM20418constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    composerM20418constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM20418constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m20425setimpl(composerM20418constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                function22.invoke(composer2, 0);
                composer2.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }, composer, 54), composer, ProvidedValue.$stable | 48);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    /* renamed from: Surface-d85dljk, reason: not valid java name */
    public static final void m19281Surfaced85dljk(final boolean z9, final Function0<Unit> function0, Modifier modifier, boolean z10, Shape shape, long j10, long j11, float f10, float f11, BorderStroke borderStroke, MutableInteractionSource mutableInteractionSource, final Function2<? super Composer, ? super Integer, Unit> function2, Composer composer, int i10, int i11, int i12) {
        final Modifier modifier2 = (i12 & 4) != 0 ? Modifier.INSTANCE : modifier;
        final boolean z11 = (i12 & 8) != 0 ? true : z10;
        final Shape rectangleShape = (i12 & 16) != 0 ? RectangleShapeKt.getRectangleShape() : shape;
        final long surface = (i12 & 32) != 0 ? MaterialTheme.INSTANCE.getColorScheme(composer, 6).getSurface() : j10;
        long jM18666contentColorForek8zF_U = (i12 & 64) != 0 ? ColorSchemeKt.m18666contentColorForek8zF_U(surface, composer, (i10 >> 15) & 14) : j11;
        float fM23561constructorimpl = (i12 & 128) != 0 ? C3127Dp.m23561constructorimpl(0) : f10;
        final float fM23561constructorimpl2 = (i12 & 256) != 0 ? C3127Dp.m23561constructorimpl(0) : f11;
        BorderStroke borderStroke2 = (i12 & 512) != 0 ? null : borderStroke;
        final MutableInteractionSource mutableInteractionSource2 = (i12 & 1024) == 0 ? mutableInteractionSource : null;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(540296512, i10, i11, "androidx.compose.material3.Surface (Surface.kt:306)");
        }
        ProvidableCompositionLocal<C3127Dp> providableCompositionLocal = LocalAbsoluteTonalElevation;
        final float fM23561constructorimpl3 = C3127Dp.m23561constructorimpl(((C3127Dp) composer.consume(providableCompositionLocal)).m23575unboximpl() + fM23561constructorimpl);
        final BorderStroke borderStroke3 = borderStroke2;
        CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(Color.m20966boximpl(jM18666contentColorForek8zF_U)), providableCompositionLocal.provides(C3127Dp.m23559boximpl(fM23561constructorimpl3))}, ComposableLambdaKt.rememberComposableLambda(-1164547968, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.SurfaceKt$Surface$3
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
            public final void invoke(Composer composer2, int i13) {
                if ((i13 & 3) == 2 && composer2.getSkipping()) {
                    composer2.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1164547968, i13, -1, "androidx.compose.material3.Surface.<anonymous> (Surface.kt:312)");
                }
                Modifier modifierM17943selectableO2vRcR0$default = SelectableKt.m17943selectableO2vRcR0$default(SurfaceKt.m19286surfaceXOJAsU(InteractiveComponentSizeKt.minimumInteractiveComponentSize(modifier2), rectangleShape, SurfaceKt.m19287surfaceColorAtElevationCLU3JFs(surface, fM23561constructorimpl3, composer2, 0), borderStroke3, ((Density) composer2.consume(CompositionLocalsKt.getLocalDensity())).mo17332toPx0680j_4(fM23561constructorimpl2)), z9, mutableInteractionSource2, RippleKt.m19144rippleOrFallbackImplementation9IZ8Weo(false, 0.0f, 0L, composer2, 0, 7), z11, null, function0, 16, null);
                Function2<Composer, Integer, Unit> function22 = function2;
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), true);
                int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer2, modifierM17943selectableO2vRcR0$default);
                ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor = companion.getConstructor();
                if (composer2.getApplier() == null) {
                    ComposablesKt.invalidApplier();
                }
                composer2.startReusableNode();
                if (composer2.getInserting()) {
                    composer2.createNode(constructor);
                } else {
                    composer2.useNode();
                }
                Composer composerM20418constructorimpl = Updater.m20418constructorimpl(composer2);
                Updater.m20425setimpl(composerM20418constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion.getSetMeasurePolicy());
                Updater.m20425setimpl(composerM20418constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
                if (composerM20418constructorimpl.getInserting() || !Intrinsics.areEqual(composerM20418constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    composerM20418constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM20418constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m20425setimpl(composerM20418constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                function22.invoke(composer2, 0);
                composer2.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }, composer, 54), composer, ProvidedValue.$stable | 48);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    /* renamed from: Surface-o_FOJdg, reason: not valid java name */
    public static final void m19283Surfaceo_FOJdg(final Function0<Unit> function0, Modifier modifier, boolean z9, Shape shape, long j10, long j11, float f10, float f11, BorderStroke borderStroke, MutableInteractionSource mutableInteractionSource, final Function2<? super Composer, ? super Integer, Unit> function2, Composer composer, int i10, int i11, int i12) {
        final Modifier modifier2 = (i12 & 2) != 0 ? Modifier.INSTANCE : modifier;
        final boolean z10 = (i12 & 4) != 0 ? true : z9;
        final Shape rectangleShape = (i12 & 8) != 0 ? RectangleShapeKt.getRectangleShape() : shape;
        final long surface = (i12 & 16) != 0 ? MaterialTheme.INSTANCE.getColorScheme(composer, 6).getSurface() : j10;
        long jM18666contentColorForek8zF_U = (i12 & 32) != 0 ? ColorSchemeKt.m18666contentColorForek8zF_U(surface, composer, (i10 >> 12) & 14) : j11;
        float fM23561constructorimpl = (i12 & 64) != 0 ? C3127Dp.m23561constructorimpl(0) : f10;
        final float fM23561constructorimpl2 = (i12 & 128) != 0 ? C3127Dp.m23561constructorimpl(0) : f11;
        BorderStroke borderStroke2 = (i12 & 256) != 0 ? null : borderStroke;
        MutableInteractionSource mutableInteractionSource2 = (i12 & 512) == 0 ? mutableInteractionSource : null;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-789752804, i10, i11, "androidx.compose.material3.Surface (Surface.kt:203)");
        }
        ProvidableCompositionLocal<C3127Dp> providableCompositionLocal = LocalAbsoluteTonalElevation;
        final float fM23561constructorimpl3 = C3127Dp.m23561constructorimpl(((C3127Dp) composer.consume(providableCompositionLocal)).m23575unboximpl() + fM23561constructorimpl);
        final BorderStroke borderStroke3 = borderStroke2;
        final MutableInteractionSource mutableInteractionSource3 = mutableInteractionSource2;
        CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(Color.m20966boximpl(jM18666contentColorForek8zF_U)), providableCompositionLocal.provides(C3127Dp.m23559boximpl(fM23561constructorimpl3))}, ComposableLambdaKt.rememberComposableLambda(1279702876, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.SurfaceKt$Surface$2
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
            public final void invoke(Composer composer2, int i13) {
                if ((i13 & 3) == 2 && composer2.getSkipping()) {
                    composer2.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1279702876, i13, -1, "androidx.compose.material3.Surface.<anonymous> (Surface.kt:209)");
                }
                Modifier modifierM17222clickableO2vRcR0$default = ClickableKt.m17222clickableO2vRcR0$default(SurfaceKt.m19286surfaceXOJAsU(InteractiveComponentSizeKt.minimumInteractiveComponentSize(modifier2), rectangleShape, SurfaceKt.m19287surfaceColorAtElevationCLU3JFs(surface, fM23561constructorimpl3, composer2, 0), borderStroke3, ((Density) composer2.consume(CompositionLocalsKt.getLocalDensity())).mo17332toPx0680j_4(fM23561constructorimpl2)), mutableInteractionSource3, RippleKt.m19144rippleOrFallbackImplementation9IZ8Weo(false, 0.0f, 0L, composer2, 0, 7), z10, null, null, function0, 24, null);
                Function2<Composer, Integer, Unit> function22 = function2;
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), true);
                int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer2, modifierM17222clickableO2vRcR0$default);
                ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor = companion.getConstructor();
                if (composer2.getApplier() == null) {
                    ComposablesKt.invalidApplier();
                }
                composer2.startReusableNode();
                if (composer2.getInserting()) {
                    composer2.createNode(constructor);
                } else {
                    composer2.useNode();
                }
                Composer composerM20418constructorimpl = Updater.m20418constructorimpl(composer2);
                Updater.m20425setimpl(composerM20418constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion.getSetMeasurePolicy());
                Updater.m20425setimpl(composerM20418constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
                if (composerM20418constructorimpl.getInserting() || !Intrinsics.areEqual(composerM20418constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    composerM20418constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM20418constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m20425setimpl(composerM20418constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                function22.invoke(composer2, 0);
                composer2.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }, composer, 54), composer, ProvidedValue.$stable | 48);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    public static final ProvidableCompositionLocal<C3127Dp> getLocalAbsoluteTonalElevation() {
        return LocalAbsoluteTonalElevation;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Stable
    /* renamed from: surface-XO-JAsU, reason: not valid java name */
    public static final Modifier m19286surfaceXOJAsU(Modifier modifier, Shape shape, long j10, BorderStroke borderStroke, float f10) {
        Shape shape2;
        Modifier modifierM21136graphicsLayerAp8cVGQ$default;
        if (f10 > 0.0f) {
            shape2 = shape;
            modifierM21136graphicsLayerAp8cVGQ$default = GraphicsLayerModifierKt.m21136graphicsLayerAp8cVGQ$default(Modifier.INSTANCE, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, f10, 0.0f, 0.0f, 0.0f, 0.0f, 0L, shape2, false, null, 0L, 0L, 0, 124895, null);
        } else {
            shape2 = shape;
            modifierM21136graphicsLayerAp8cVGQ$default = Modifier.INSTANCE;
        }
        return ClipKt.clip(BackgroundKt.m17189backgroundbw27NRU(modifier.then(modifierM21136graphicsLayerAp8cVGQ$default).then(borderStroke != null ? BorderKt.border(Modifier.INSTANCE, borderStroke, shape2) : Modifier.INSTANCE), j10, shape2), shape2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Composable
    /* renamed from: surfaceColorAtElevation-CLU3JFs, reason: not valid java name */
    public static final long m19287surfaceColorAtElevationCLU3JFs(long j10, float f10, Composer composer, int i10) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-2079918090, i10, -1, "androidx.compose.material3.surfaceColorAtElevation (Surface.kt:465)");
        }
        long jM18664applyTonalElevationRFCenO8 = ColorSchemeKt.m18664applyTonalElevationRFCenO8(MaterialTheme.INSTANCE.getColorScheme(composer, 6), j10, f10, composer, (i10 << 3) & PointerIconCompat.TYPE_TEXT);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return jM18664applyTonalElevationRFCenO8;
    }

    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    /* renamed from: Surface-d85dljk, reason: not valid java name */
    public static final void m19282Surfaced85dljk(final boolean z9, final Function1<? super Boolean, Unit> function1, Modifier modifier, boolean z10, Shape shape, long j10, long j11, float f10, float f11, BorderStroke borderStroke, MutableInteractionSource mutableInteractionSource, final Function2<? super Composer, ? super Integer, Unit> function2, Composer composer, int i10, int i11, int i12) {
        final Modifier modifier2 = (i12 & 4) != 0 ? Modifier.INSTANCE : modifier;
        final boolean z11 = (i12 & 8) != 0 ? true : z10;
        final Shape rectangleShape = (i12 & 16) != 0 ? RectangleShapeKt.getRectangleShape() : shape;
        final long surface = (i12 & 32) != 0 ? MaterialTheme.INSTANCE.getColorScheme(composer, 6).getSurface() : j10;
        long jM18666contentColorForek8zF_U = (i12 & 64) != 0 ? ColorSchemeKt.m18666contentColorForek8zF_U(surface, composer, (i10 >> 15) & 14) : j11;
        float fM23561constructorimpl = (i12 & 128) != 0 ? C3127Dp.m23561constructorimpl(0) : f10;
        final float fM23561constructorimpl2 = (i12 & 256) != 0 ? C3127Dp.m23561constructorimpl(0) : f11;
        BorderStroke borderStroke2 = (i12 & 512) != 0 ? null : borderStroke;
        final MutableInteractionSource mutableInteractionSource2 = (i12 & 1024) == 0 ? mutableInteractionSource : null;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1877401889, i10, i11, "androidx.compose.material3.Surface (Surface.kt:410)");
        }
        ProvidableCompositionLocal<C3127Dp> providableCompositionLocal = LocalAbsoluteTonalElevation;
        final float fM23561constructorimpl3 = C3127Dp.m23561constructorimpl(((C3127Dp) composer.consume(providableCompositionLocal)).m23575unboximpl() + fM23561constructorimpl);
        final BorderStroke borderStroke3 = borderStroke2;
        CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(Color.m20966boximpl(jM18666contentColorForek8zF_U)), providableCompositionLocal.provides(C3127Dp.m23559boximpl(fM23561constructorimpl3))}, ComposableLambdaKt.rememberComposableLambda(712720927, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.SurfaceKt$Surface$4
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
            public final void invoke(Composer composer2, int i13) {
                if ((i13 & 3) == 2 && composer2.getSkipping()) {
                    composer2.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(712720927, i13, -1, "androidx.compose.material3.Surface.<anonymous> (Surface.kt:416)");
                }
                Modifier modifierM17948toggleableO2vRcR0$default = ToggleableKt.m17948toggleableO2vRcR0$default(SurfaceKt.m19286surfaceXOJAsU(InteractiveComponentSizeKt.minimumInteractiveComponentSize(modifier2), rectangleShape, SurfaceKt.m19287surfaceColorAtElevationCLU3JFs(surface, fM23561constructorimpl3, composer2, 0), borderStroke3, ((Density) composer2.consume(CompositionLocalsKt.getLocalDensity())).mo17332toPx0680j_4(fM23561constructorimpl2)), z9, mutableInteractionSource2, RippleKt.m19144rippleOrFallbackImplementation9IZ8Weo(false, 0.0f, 0L, composer2, 0, 7), z11, null, function1, 16, null);
                Function2<Composer, Integer, Unit> function22 = function2;
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), true);
                int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer2, modifierM17948toggleableO2vRcR0$default);
                ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor = companion.getConstructor();
                if (composer2.getApplier() == null) {
                    ComposablesKt.invalidApplier();
                }
                composer2.startReusableNode();
                if (composer2.getInserting()) {
                    composer2.createNode(constructor);
                } else {
                    composer2.useNode();
                }
                Composer composerM20418constructorimpl = Updater.m20418constructorimpl(composer2);
                Updater.m20425setimpl(composerM20418constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion.getSetMeasurePolicy());
                Updater.m20425setimpl(composerM20418constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
                if (composerM20418constructorimpl.getInserting() || !Intrinsics.areEqual(composerM20418constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    composerM20418constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM20418constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m20425setimpl(composerM20418constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                function22.invoke(composer2, 0);
                composer2.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }, composer, 54), composer, ProvidedValue.$stable | 48);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
