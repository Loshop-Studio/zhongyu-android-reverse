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
import androidx.compose.p013ui.input.pointer.C2860xe3d9cdbd;
import androidx.compose.p013ui.input.pointer.PointerInputScope;
import androidx.compose.p013ui.input.pointer.SuspendPointerInputElement;
import androidx.compose.p013ui.layout.MeasurePolicy;
import androidx.compose.p013ui.node.ComposeUiNode;
import androidx.compose.p013ui.platform.CompositionLocalsKt;
import androidx.compose.p013ui.semantics.SemanticsModifierKt;
import androidx.compose.p013ui.semantics.SemanticsPropertiesKt;
import androidx.compose.p013ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.p013ui.unit.C3156Dp;
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
import kotlin.AbstractC9079b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC9133u;
import p123h7.C8736p;
import p179m7.InterfaceC9324c;
import p190n7.AbstractC9434a;
import p201o7.InterfaceC9539d;
import p300x7.InterfaceC10559a;
import p300x7.InterfaceC10570l;
import p300x7.InterfaceC10574p;

/* loaded from: classes2.dex */
public final class SurfaceKt {
    private static final ProvidableCompositionLocal<C3156Dp> LocalAbsoluteTonalElevation = CompositionLocalKt.compositionLocalOf$default(null, new InterfaceC10559a() { // from class: androidx.compose.material3.SurfaceKt$LocalAbsoluteTonalElevation$1
        @Override // p300x7.InterfaceC10559a
        public /* bridge */ /* synthetic */ Object invoke() {
            return C3156Dp.m26897boximpl(m22557invokeD9Ej5fM());
        }

        /* renamed from: invoke-D9Ej5fM, reason: not valid java name */
        public final float m22557invokeD9Ej5fM() {
            return C3156Dp.m26899constructorimpl(0);
        }
    }, 1, null);

    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    /* renamed from: Surface-T9BRK9s, reason: not valid java name */
    public static final void m22549SurfaceT9BRK9s(Modifier modifier, Shape shape, long j10, long j11, float f10, float f11, BorderStroke borderStroke, final InterfaceC10574p interfaceC10574p, Composer composer, int i10, int i11) {
        if ((i11 & 1) != 0) {
            modifier = Modifier.Companion;
        }
        if ((i11 & 2) != 0) {
            shape = RectangleShapeKt.getRectangleShape();
        }
        if ((i11 & 4) != 0) {
            j10 = MaterialTheme.INSTANCE.getColorScheme(composer, 6).m21896getSurface0d7_KjU();
        }
        if ((i11 & 8) != 0) {
            j11 = ColorSchemeKt.m21910contentColorForek8zF_U(j10, composer, (i10 >> 6) & 14);
        }
        if ((i11 & 16) != 0) {
            f10 = C3156Dp.m26899constructorimpl(0);
        }
        if ((i11 & 32) != 0) {
            f11 = C3156Dp.m26899constructorimpl(0);
        }
        if ((i11 & 64) != 0) {
            borderStroke = null;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-513881741, i10, -1, "androidx.compose.material3.Surface (Surface.kt:102)");
        }
        ProvidableCompositionLocal<C3156Dp> providableCompositionLocal = LocalAbsoluteTonalElevation;
        final float fM26899constructorimpl = C3156Dp.m26899constructorimpl(((C3156Dp) composer.consume(providableCompositionLocal)).m26913unboximpl() + f10);
        ProvidedValue[] providedValueArr = {ContentColorKt.getLocalContentColor().provides(Color.m24266boximpl(j11)), providableCompositionLocal.provides(C3156Dp.m26897boximpl(fM26899constructorimpl))};
        final long j12 = j10;
        final Shape shape2 = shape;
        final BorderStroke borderStroke2 = borderStroke;
        final float f12 = f11;
        final Modifier modifier2 = modifier;
        CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) providedValueArr, ComposableLambdaKt.rememberComposableLambda(-70914509, true, new InterfaceC10574p() { // from class: androidx.compose.material3.SurfaceKt$Surface$1

            @InterfaceC9539d(m17800c = "androidx.compose.material3.SurfaceKt$Surface$1$3", m17801f = "Surface.kt", m17802l = {}, m17803m = "invokeSuspend")
            /* renamed from: androidx.compose.material3.SurfaceKt$Surface$1$3 */
            public static final class C23443 extends SuspendLambda implements InterfaceC10574p {
                int label;

                public C23443(InterfaceC9324c<? super C23443> interfaceC9324c) {
                    super(2, interfaceC9324c);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final InterfaceC9324c<C8736p> create(Object obj, InterfaceC9324c<?> interfaceC9324c) {
                    return new C23443(interfaceC9324c);
                }

                @Override // p300x7.InterfaceC10574p
                public final Object invoke(PointerInputScope pointerInputScope, InterfaceC9324c<? super C8736p> interfaceC9324c) {
                    return ((C23443) create(pointerInputScope, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) throws Throwable {
                    AbstractC9434a.m17291f();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC9079b.m15926b(obj);
                    return C8736p.f16368a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // p300x7.InterfaceC10574p
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((Composer) obj, ((Number) obj2).intValue());
                return C8736p.f16368a;
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
                Modifier modifierThen = SemanticsModifierKt.semantics(SurfaceKt.m22555surfaceXOJAsU(modifier2, shape2, SurfaceKt.m22556surfaceColorAtElevationCLU3JFs(j12, fM26899constructorimpl, composer2, 0), borderStroke2, ((Density) composer2.consume(CompositionLocalsKt.getLocalDensity())).mo20497toPx0680j_4(f12)), false, new InterfaceC10570l() { // from class: androidx.compose.material3.SurfaceKt$Surface$1.2
                    @Override // p300x7.InterfaceC10570l
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        invoke((SemanticsPropertyReceiver) obj);
                        return C8736p.f16368a;
                    }

                    public final void invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                        SemanticsPropertiesKt.setContainer(semanticsPropertyReceiver, true);
                    }
                }).then(new SuspendPointerInputElement(C8736p.f16368a, null, null, new C2860xe3d9cdbd(new C23443(null)), 6, null));
                InterfaceC10574p interfaceC10574p2 = interfaceC10574p;
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopStart(), true);
                int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer2, modifierThen);
                ComposeUiNode.Companion companion = ComposeUiNode.Companion;
                InterfaceC10559a constructor = companion.getConstructor();
                if (composer2.getApplier() == null) {
                    ComposablesKt.invalidApplier();
                }
                composer2.startReusableNode();
                if (composer2.getInserting()) {
                    composer2.createNode(constructor);
                } else {
                    composer2.useNode();
                }
                Composer composerM23703constructorimpl = Updater.m23703constructorimpl(composer2);
                Updater.m23710setimpl(composerM23703constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion.getSetMeasurePolicy());
                Updater.m23710setimpl(composerM23703constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                InterfaceC10574p setCompositeKeyHash = companion.getSetCompositeKeyHash();
                if (composerM23703constructorimpl.getInserting() || !AbstractC9133u.m16128b(composerM23703constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    composerM23703constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM23703constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m23710setimpl(composerM23703constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                interfaceC10574p2.invoke(composer2, 0);
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
    public static final void m22550Surfaced85dljk(final boolean z10, final InterfaceC10559a interfaceC10559a, Modifier modifier, boolean z11, Shape shape, long j10, long j11, float f10, float f11, BorderStroke borderStroke, MutableInteractionSource mutableInteractionSource, final InterfaceC10574p interfaceC10574p, Composer composer, int i10, int i11, int i12) {
        final Modifier modifier2 = (i12 & 4) != 0 ? Modifier.Companion : modifier;
        final boolean z12 = (i12 & 8) != 0 ? true : z11;
        final Shape rectangleShape = (i12 & 16) != 0 ? RectangleShapeKt.getRectangleShape() : shape;
        final long jM21896getSurface0d7_KjU = (i12 & 32) != 0 ? MaterialTheme.INSTANCE.getColorScheme(composer, 6).m21896getSurface0d7_KjU() : j10;
        long jM21910contentColorForek8zF_U = (i12 & 64) != 0 ? ColorSchemeKt.m21910contentColorForek8zF_U(jM21896getSurface0d7_KjU, composer, (i10 >> 15) & 14) : j11;
        float fM26899constructorimpl = (i12 & 128) != 0 ? C3156Dp.m26899constructorimpl(0) : f10;
        final float fM26899constructorimpl2 = (i12 & 256) != 0 ? C3156Dp.m26899constructorimpl(0) : f11;
        BorderStroke borderStroke2 = (i12 & 512) != 0 ? null : borderStroke;
        final MutableInteractionSource mutableInteractionSource2 = (i12 & 1024) == 0 ? mutableInteractionSource : null;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(540296512, i10, i11, "androidx.compose.material3.Surface (Surface.kt:306)");
        }
        ProvidableCompositionLocal<C3156Dp> providableCompositionLocal = LocalAbsoluteTonalElevation;
        final float fM26899constructorimpl3 = C3156Dp.m26899constructorimpl(((C3156Dp) composer.consume(providableCompositionLocal)).m26913unboximpl() + fM26899constructorimpl);
        final BorderStroke borderStroke3 = borderStroke2;
        CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(Color.m24266boximpl(jM21910contentColorForek8zF_U)), providableCompositionLocal.provides(C3156Dp.m26897boximpl(fM26899constructorimpl3))}, ComposableLambdaKt.rememberComposableLambda(-1164547968, true, new InterfaceC10574p() { // from class: androidx.compose.material3.SurfaceKt$Surface$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // p300x7.InterfaceC10574p
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((Composer) obj, ((Number) obj2).intValue());
                return C8736p.f16368a;
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
                Modifier modifierM21120selectableO2vRcR0$default = SelectableKt.m21120selectableO2vRcR0$default(SurfaceKt.m22555surfaceXOJAsU(InteractiveComponentSizeKt.minimumInteractiveComponentSize(modifier2), rectangleShape, SurfaceKt.m22556surfaceColorAtElevationCLU3JFs(jM21896getSurface0d7_KjU, fM26899constructorimpl3, composer2, 0), borderStroke3, ((Density) composer2.consume(CompositionLocalsKt.getLocalDensity())).mo20497toPx0680j_4(fM26899constructorimpl2)), z10, mutableInteractionSource2, RippleKt.m22407rippleOrFallbackImplementation9IZ8Weo(false, 0.0f, 0L, composer2, 0, 7), z12, null, interfaceC10559a, 16, null);
                InterfaceC10574p interfaceC10574p2 = interfaceC10574p;
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopStart(), true);
                int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer2, modifierM21120selectableO2vRcR0$default);
                ComposeUiNode.Companion companion = ComposeUiNode.Companion;
                InterfaceC10559a constructor = companion.getConstructor();
                if (composer2.getApplier() == null) {
                    ComposablesKt.invalidApplier();
                }
                composer2.startReusableNode();
                if (composer2.getInserting()) {
                    composer2.createNode(constructor);
                } else {
                    composer2.useNode();
                }
                Composer composerM23703constructorimpl = Updater.m23703constructorimpl(composer2);
                Updater.m23710setimpl(composerM23703constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion.getSetMeasurePolicy());
                Updater.m23710setimpl(composerM23703constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                InterfaceC10574p setCompositeKeyHash = companion.getSetCompositeKeyHash();
                if (composerM23703constructorimpl.getInserting() || !AbstractC9133u.m16128b(composerM23703constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    composerM23703constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM23703constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m23710setimpl(composerM23703constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                interfaceC10574p2.invoke(composer2, 0);
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
    public static final void m22552Surfaceo_FOJdg(final InterfaceC10559a interfaceC10559a, Modifier modifier, boolean z10, Shape shape, long j10, long j11, float f10, float f11, BorderStroke borderStroke, MutableInteractionSource mutableInteractionSource, final InterfaceC10574p interfaceC10574p, Composer composer, int i10, int i11, int i12) {
        final Modifier modifier2 = (i12 & 2) != 0 ? Modifier.Companion : modifier;
        final boolean z11 = (i12 & 4) != 0 ? true : z10;
        final Shape rectangleShape = (i12 & 8) != 0 ? RectangleShapeKt.getRectangleShape() : shape;
        final long jM21896getSurface0d7_KjU = (i12 & 16) != 0 ? MaterialTheme.INSTANCE.getColorScheme(composer, 6).m21896getSurface0d7_KjU() : j10;
        long jM21910contentColorForek8zF_U = (i12 & 32) != 0 ? ColorSchemeKt.m21910contentColorForek8zF_U(jM21896getSurface0d7_KjU, composer, (i10 >> 12) & 14) : j11;
        float fM26899constructorimpl = (i12 & 64) != 0 ? C3156Dp.m26899constructorimpl(0) : f10;
        final float fM26899constructorimpl2 = (i12 & 128) != 0 ? C3156Dp.m26899constructorimpl(0) : f11;
        BorderStroke borderStroke2 = (i12 & 256) != 0 ? null : borderStroke;
        MutableInteractionSource mutableInteractionSource2 = (i12 & 512) == 0 ? mutableInteractionSource : null;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-789752804, i10, i11, "androidx.compose.material3.Surface (Surface.kt:203)");
        }
        ProvidableCompositionLocal<C3156Dp> providableCompositionLocal = LocalAbsoluteTonalElevation;
        final float fM26899constructorimpl3 = C3156Dp.m26899constructorimpl(((C3156Dp) composer.consume(providableCompositionLocal)).m26913unboximpl() + fM26899constructorimpl);
        final BorderStroke borderStroke3 = borderStroke2;
        final MutableInteractionSource mutableInteractionSource3 = mutableInteractionSource2;
        CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(Color.m24266boximpl(jM21910contentColorForek8zF_U)), providableCompositionLocal.provides(C3156Dp.m26897boximpl(fM26899constructorimpl3))}, ComposableLambdaKt.rememberComposableLambda(1279702876, true, new InterfaceC10574p() { // from class: androidx.compose.material3.SurfaceKt$Surface$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // p300x7.InterfaceC10574p
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((Composer) obj, ((Number) obj2).intValue());
                return C8736p.f16368a;
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
                Modifier modifierM20382clickableO2vRcR0$default = ClickableKt.m20382clickableO2vRcR0$default(SurfaceKt.m22555surfaceXOJAsU(InteractiveComponentSizeKt.minimumInteractiveComponentSize(modifier2), rectangleShape, SurfaceKt.m22556surfaceColorAtElevationCLU3JFs(jM21896getSurface0d7_KjU, fM26899constructorimpl3, composer2, 0), borderStroke3, ((Density) composer2.consume(CompositionLocalsKt.getLocalDensity())).mo20497toPx0680j_4(fM26899constructorimpl2)), mutableInteractionSource3, RippleKt.m22407rippleOrFallbackImplementation9IZ8Weo(false, 0.0f, 0L, composer2, 0, 7), z11, null, null, interfaceC10559a, 24, null);
                InterfaceC10574p interfaceC10574p2 = interfaceC10574p;
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopStart(), true);
                int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer2, modifierM20382clickableO2vRcR0$default);
                ComposeUiNode.Companion companion = ComposeUiNode.Companion;
                InterfaceC10559a constructor = companion.getConstructor();
                if (composer2.getApplier() == null) {
                    ComposablesKt.invalidApplier();
                }
                composer2.startReusableNode();
                if (composer2.getInserting()) {
                    composer2.createNode(constructor);
                } else {
                    composer2.useNode();
                }
                Composer composerM23703constructorimpl = Updater.m23703constructorimpl(composer2);
                Updater.m23710setimpl(composerM23703constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion.getSetMeasurePolicy());
                Updater.m23710setimpl(composerM23703constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                InterfaceC10574p setCompositeKeyHash = companion.getSetCompositeKeyHash();
                if (composerM23703constructorimpl.getInserting() || !AbstractC9133u.m16128b(composerM23703constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    composerM23703constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM23703constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m23710setimpl(composerM23703constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                interfaceC10574p2.invoke(composer2, 0);
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

    public static final ProvidableCompositionLocal<C3156Dp> getLocalAbsoluteTonalElevation() {
        return LocalAbsoluteTonalElevation;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Stable
    /* renamed from: surface-XO-JAsU, reason: not valid java name */
    public static final Modifier m22555surfaceXOJAsU(Modifier modifier, Shape shape, long j10, BorderStroke borderStroke, float f10) {
        Shape shape2;
        Modifier modifierM24436graphicsLayerAp8cVGQ$default;
        if (f10 > 0.0f) {
            shape2 = shape;
            modifierM24436graphicsLayerAp8cVGQ$default = GraphicsLayerModifierKt.m24436graphicsLayerAp8cVGQ$default(Modifier.Companion, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, f10, 0.0f, 0.0f, 0.0f, 0.0f, 0L, shape2, false, null, 0L, 0L, 0, 124895, null);
        } else {
            shape2 = shape;
            modifierM24436graphicsLayerAp8cVGQ$default = Modifier.Companion;
        }
        return ClipKt.clip(BackgroundKt.m20347backgroundbw27NRU(modifier.then(modifierM24436graphicsLayerAp8cVGQ$default).then(borderStroke != null ? BorderKt.border(Modifier.Companion, borderStroke, shape2) : Modifier.Companion), j10, shape2), shape2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Composable
    /* renamed from: surfaceColorAtElevation-CLU3JFs, reason: not valid java name */
    public static final long m22556surfaceColorAtElevationCLU3JFs(long j10, float f10, Composer composer, int i10) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-2079918090, i10, -1, "androidx.compose.material3.surfaceColorAtElevation (Surface.kt:465)");
        }
        long jM21908applyTonalElevationRFCenO8 = ColorSchemeKt.m21908applyTonalElevationRFCenO8(MaterialTheme.INSTANCE.getColorScheme(composer, 6), j10, f10, composer, (i10 << 3) & 1008);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return jM21908applyTonalElevationRFCenO8;
    }

    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    /* renamed from: Surface-d85dljk, reason: not valid java name */
    public static final void m22551Surfaced85dljk(final boolean z10, final InterfaceC10570l interfaceC10570l, Modifier modifier, boolean z11, Shape shape, long j10, long j11, float f10, float f11, BorderStroke borderStroke, MutableInteractionSource mutableInteractionSource, final InterfaceC10574p interfaceC10574p, Composer composer, int i10, int i11, int i12) {
        final Modifier modifier2 = (i12 & 4) != 0 ? Modifier.Companion : modifier;
        final boolean z12 = (i12 & 8) != 0 ? true : z11;
        final Shape rectangleShape = (i12 & 16) != 0 ? RectangleShapeKt.getRectangleShape() : shape;
        final long jM21896getSurface0d7_KjU = (i12 & 32) != 0 ? MaterialTheme.INSTANCE.getColorScheme(composer, 6).m21896getSurface0d7_KjU() : j10;
        long jM21910contentColorForek8zF_U = (i12 & 64) != 0 ? ColorSchemeKt.m21910contentColorForek8zF_U(jM21896getSurface0d7_KjU, composer, (i10 >> 15) & 14) : j11;
        float fM26899constructorimpl = (i12 & 128) != 0 ? C3156Dp.m26899constructorimpl(0) : f10;
        final float fM26899constructorimpl2 = (i12 & 256) != 0 ? C3156Dp.m26899constructorimpl(0) : f11;
        BorderStroke borderStroke2 = (i12 & 512) != 0 ? null : borderStroke;
        final MutableInteractionSource mutableInteractionSource2 = (i12 & 1024) == 0 ? mutableInteractionSource : null;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1877401889, i10, i11, "androidx.compose.material3.Surface (Surface.kt:410)");
        }
        ProvidableCompositionLocal<C3156Dp> providableCompositionLocal = LocalAbsoluteTonalElevation;
        final float fM26899constructorimpl3 = C3156Dp.m26899constructorimpl(((C3156Dp) composer.consume(providableCompositionLocal)).m26913unboximpl() + fM26899constructorimpl);
        final BorderStroke borderStroke3 = borderStroke2;
        CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(Color.m24266boximpl(jM21910contentColorForek8zF_U)), providableCompositionLocal.provides(C3156Dp.m26897boximpl(fM26899constructorimpl3))}, ComposableLambdaKt.rememberComposableLambda(712720927, true, new InterfaceC10574p() { // from class: androidx.compose.material3.SurfaceKt$Surface$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // p300x7.InterfaceC10574p
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((Composer) obj, ((Number) obj2).intValue());
                return C8736p.f16368a;
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
                Modifier modifierM21125toggleableO2vRcR0$default = ToggleableKt.m21125toggleableO2vRcR0$default(SurfaceKt.m22555surfaceXOJAsU(InteractiveComponentSizeKt.minimumInteractiveComponentSize(modifier2), rectangleShape, SurfaceKt.m22556surfaceColorAtElevationCLU3JFs(jM21896getSurface0d7_KjU, fM26899constructorimpl3, composer2, 0), borderStroke3, ((Density) composer2.consume(CompositionLocalsKt.getLocalDensity())).mo20497toPx0680j_4(fM26899constructorimpl2)), z10, mutableInteractionSource2, RippleKt.m22407rippleOrFallbackImplementation9IZ8Weo(false, 0.0f, 0L, composer2, 0, 7), z12, null, interfaceC10570l, 16, null);
                InterfaceC10574p interfaceC10574p2 = interfaceC10574p;
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopStart(), true);
                int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer2, modifierM21125toggleableO2vRcR0$default);
                ComposeUiNode.Companion companion = ComposeUiNode.Companion;
                InterfaceC10559a constructor = companion.getConstructor();
                if (composer2.getApplier() == null) {
                    ComposablesKt.invalidApplier();
                }
                composer2.startReusableNode();
                if (composer2.getInserting()) {
                    composer2.createNode(constructor);
                } else {
                    composer2.useNode();
                }
                Composer composerM23703constructorimpl = Updater.m23703constructorimpl(composer2);
                Updater.m23710setimpl(composerM23703constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion.getSetMeasurePolicy());
                Updater.m23710setimpl(composerM23703constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                InterfaceC10574p setCompositeKeyHash = companion.getSetCompositeKeyHash();
                if (composerM23703constructorimpl.getInserting() || !AbstractC9133u.m16128b(composerM23703constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    composerM23703constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM23703constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m23710setimpl(composerM23703constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                interfaceC10574p2.invoke(composer2, 0);
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
