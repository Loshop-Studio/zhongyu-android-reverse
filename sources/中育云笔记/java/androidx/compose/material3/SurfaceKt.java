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
import androidx.compose.p014ui.Alignment;
import androidx.compose.p014ui.ComposedModifierKt;
import androidx.compose.p014ui.Modifier;
import androidx.compose.p014ui.draw.ClipKt;
import androidx.compose.p014ui.graphics.Color;
import androidx.compose.p014ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.p014ui.graphics.RectangleShapeKt;
import androidx.compose.p014ui.graphics.Shape;
import androidx.compose.p014ui.input.pointer.C2890xe3d9cdbd;
import androidx.compose.p014ui.input.pointer.PointerInputScope;
import androidx.compose.p014ui.input.pointer.SuspendPointerInputElement;
import androidx.compose.p014ui.layout.MeasurePolicy;
import androidx.compose.p014ui.node.ComposeUiNode;
import androidx.compose.p014ui.platform.CompositionLocalsKt;
import androidx.compose.p014ui.semantics.SemanticsModifierKt;
import androidx.compose.p014ui.semantics.SemanticsPropertiesKt;
import androidx.compose.p014ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.p014ui.unit.C3186Dp;
import androidx.compose.p014ui.unit.Density;
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
import kotlin.AbstractC9924b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9529a;
import p181hd.InterfaceC9540l;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import p393wc.AbstractC11725a;
import p409xc.InterfaceC11829d;
import vc.InterfaceC11588c;

/* loaded from: classes2.dex */
public final class SurfaceKt {
    private static final ProvidableCompositionLocal<C3186Dp> LocalAbsoluteTonalElevation = CompositionLocalKt.compositionLocalOf$default(null, new InterfaceC9529a() { // from class: androidx.compose.material3.SurfaceKt$LocalAbsoluteTonalElevation$1
        @Override // p181hd.InterfaceC9529a
        public /* bridge */ /* synthetic */ Object invoke() {
            return C3186Dp.m33499boximpl(m29159invokeD9Ej5fM());
        }

        /* renamed from: invoke-D9Ej5fM, reason: not valid java name */
        public final float m29159invokeD9Ej5fM() {
            return C3186Dp.m33501constructorimpl(0);
        }
    }, 1, null);

    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    /* renamed from: Surface-T9BRK9s, reason: not valid java name */
    public static final void m29151SurfaceT9BRK9s(Modifier modifier, Shape shape, long j10, long j11, float f10, float f11, BorderStroke borderStroke, final InterfaceC9544p interfaceC9544p, Composer composer, int i10, int i11) {
        if ((i11 & 1) != 0) {
            modifier = Modifier.Companion;
        }
        if ((i11 & 2) != 0) {
            shape = RectangleShapeKt.getRectangleShape();
        }
        if ((i11 & 4) != 0) {
            j10 = MaterialTheme.INSTANCE.getColorScheme(composer, 6).m28498getSurface0d7_KjU();
        }
        if ((i11 & 8) != 0) {
            j11 = ColorSchemeKt.m28512contentColorForek8zF_U(j10, composer, (i10 >> 6) & 14);
        }
        if ((i11 & 16) != 0) {
            f10 = C3186Dp.m33501constructorimpl(0);
        }
        if ((i11 & 32) != 0) {
            f11 = C3186Dp.m33501constructorimpl(0);
        }
        if ((i11 & 64) != 0) {
            borderStroke = null;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-513881741, i10, -1, "androidx.compose.material3.Surface (Surface.kt:102)");
        }
        ProvidableCompositionLocal<C3186Dp> providableCompositionLocal = LocalAbsoluteTonalElevation;
        final float fM33501constructorimpl = C3186Dp.m33501constructorimpl(((C3186Dp) composer.consume(providableCompositionLocal)).m33515unboximpl() + f10);
        ProvidedValue[] providedValueArr = {ContentColorKt.getLocalContentColor().provides(Color.m30868boximpl(j11)), providableCompositionLocal.provides(C3186Dp.m33499boximpl(fM33501constructorimpl))};
        final long j12 = j10;
        final Shape shape2 = shape;
        final BorderStroke borderStroke2 = borderStroke;
        final float f12 = f11;
        final Modifier modifier2 = modifier;
        CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) providedValueArr, ComposableLambdaKt.rememberComposableLambda(-70914509, true, new InterfaceC9544p() { // from class: androidx.compose.material3.SurfaceKt$Surface$1

            @InterfaceC11829d(m26210c = "androidx.compose.material3.SurfaceKt$Surface$1$3", m26211f = "Surface.kt", m26212l = {}, m26213m = "invokeSuspend")
            /* renamed from: androidx.compose.material3.SurfaceKt$Surface$1$3 */
            public static final class C23743 extends SuspendLambda implements InterfaceC9544p {
                int label;

                public C23743(InterfaceC11588c<? super C23743> interfaceC11588c) {
                    super(2, interfaceC11588c);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final InterfaceC11588c<C10786q> create(Object obj, InterfaceC11588c<?> interfaceC11588c) {
                    return new C23743(interfaceC11588c);
                }

                @Override // p181hd.InterfaceC9544p
                public final Object invoke(PointerInputScope pointerInputScope, InterfaceC11588c<? super C10786q> interfaceC11588c) {
                    return ((C23743) create(pointerInputScope, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) throws Throwable {
                    AbstractC11725a.m25952f();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC9924b.m20071b(obj);
                    return C10786q.f26013a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // p181hd.InterfaceC9544p
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((Composer) obj, ((Number) obj2).intValue());
                return C10786q.f26013a;
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
                Modifier modifierThen = SemanticsModifierKt.semantics(SurfaceKt.m29157surfaceXOJAsU(modifier2, shape2, SurfaceKt.m29158surfaceColorAtElevationCLU3JFs(j12, fM33501constructorimpl, composer2, 0), borderStroke2, ((Density) composer2.consume(CompositionLocalsKt.getLocalDensity())).mo27099toPx0680j_4(f12)), false, new InterfaceC9540l() { // from class: androidx.compose.material3.SurfaceKt$Surface$1.2
                    @Override // p181hd.InterfaceC9540l
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        invoke((SemanticsPropertyReceiver) obj);
                        return C10786q.f26013a;
                    }

                    public final void invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                        SemanticsPropertiesKt.setContainer(semanticsPropertyReceiver, true);
                    }
                }).then(new SuspendPointerInputElement(C10786q.f26013a, null, null, new C2890xe3d9cdbd(new C23743(null)), 6, null));
                InterfaceC9544p interfaceC9544p2 = interfaceC9544p;
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopStart(), true);
                int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer2, modifierThen);
                ComposeUiNode.Companion companion = ComposeUiNode.Companion;
                InterfaceC9529a constructor = companion.getConstructor();
                if (composer2.getApplier() == null) {
                    ComposablesKt.invalidApplier();
                }
                composer2.startReusableNode();
                if (composer2.getInserting()) {
                    composer2.createNode(constructor);
                } else {
                    composer2.useNode();
                }
                Composer composerM30305constructorimpl = Updater.m30305constructorimpl(composer2);
                Updater.m30312setimpl(composerM30305constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion.getSetMeasurePolicy());
                Updater.m30312setimpl(composerM30305constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                InterfaceC9544p setCompositeKeyHash = companion.getSetCompositeKeyHash();
                if (composerM30305constructorimpl.getInserting() || !AbstractC9979u.m20289b(composerM30305constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    composerM30305constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM30305constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m30312setimpl(composerM30305constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                interfaceC9544p2.invoke(composer2, 0);
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
    public static final void m29152Surfaced85dljk(final boolean z10, final InterfaceC9529a interfaceC9529a, Modifier modifier, boolean z11, Shape shape, long j10, long j11, float f10, float f11, BorderStroke borderStroke, MutableInteractionSource mutableInteractionSource, final InterfaceC9544p interfaceC9544p, Composer composer, int i10, int i11, int i12) {
        final Modifier modifier2 = (i12 & 4) != 0 ? Modifier.Companion : modifier;
        final boolean z12 = (i12 & 8) != 0 ? true : z11;
        final Shape rectangleShape = (i12 & 16) != 0 ? RectangleShapeKt.getRectangleShape() : shape;
        final long jM28498getSurface0d7_KjU = (i12 & 32) != 0 ? MaterialTheme.INSTANCE.getColorScheme(composer, 6).m28498getSurface0d7_KjU() : j10;
        long jM28512contentColorForek8zF_U = (i12 & 64) != 0 ? ColorSchemeKt.m28512contentColorForek8zF_U(jM28498getSurface0d7_KjU, composer, (i10 >> 15) & 14) : j11;
        float fM33501constructorimpl = (i12 & 128) != 0 ? C3186Dp.m33501constructorimpl(0) : f10;
        final float fM33501constructorimpl2 = (i12 & 256) != 0 ? C3186Dp.m33501constructorimpl(0) : f11;
        BorderStroke borderStroke2 = (i12 & 512) != 0 ? null : borderStroke;
        final MutableInteractionSource mutableInteractionSource2 = (i12 & 1024) == 0 ? mutableInteractionSource : null;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(540296512, i10, i11, "androidx.compose.material3.Surface (Surface.kt:306)");
        }
        ProvidableCompositionLocal<C3186Dp> providableCompositionLocal = LocalAbsoluteTonalElevation;
        final float fM33501constructorimpl3 = C3186Dp.m33501constructorimpl(((C3186Dp) composer.consume(providableCompositionLocal)).m33515unboximpl() + fM33501constructorimpl);
        final BorderStroke borderStroke3 = borderStroke2;
        CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(Color.m30868boximpl(jM28512contentColorForek8zF_U)), providableCompositionLocal.provides(C3186Dp.m33499boximpl(fM33501constructorimpl3))}, ComposableLambdaKt.rememberComposableLambda(-1164547968, true, new InterfaceC9544p() { // from class: androidx.compose.material3.SurfaceKt$Surface$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // p181hd.InterfaceC9544p
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((Composer) obj, ((Number) obj2).intValue());
                return C10786q.f26013a;
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
                Modifier modifierM27722selectableO2vRcR0$default = SelectableKt.m27722selectableO2vRcR0$default(SurfaceKt.m29157surfaceXOJAsU(InteractiveComponentSizeKt.minimumInteractiveComponentSize(modifier2), rectangleShape, SurfaceKt.m29158surfaceColorAtElevationCLU3JFs(jM28498getSurface0d7_KjU, fM33501constructorimpl3, composer2, 0), borderStroke3, ((Density) composer2.consume(CompositionLocalsKt.getLocalDensity())).mo27099toPx0680j_4(fM33501constructorimpl2)), z10, mutableInteractionSource2, RippleKt.m29009rippleOrFallbackImplementation9IZ8Weo(false, 0.0f, 0L, composer2, 0, 7), z12, null, interfaceC9529a, 16, null);
                InterfaceC9544p interfaceC9544p2 = interfaceC9544p;
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopStart(), true);
                int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer2, modifierM27722selectableO2vRcR0$default);
                ComposeUiNode.Companion companion = ComposeUiNode.Companion;
                InterfaceC9529a constructor = companion.getConstructor();
                if (composer2.getApplier() == null) {
                    ComposablesKt.invalidApplier();
                }
                composer2.startReusableNode();
                if (composer2.getInserting()) {
                    composer2.createNode(constructor);
                } else {
                    composer2.useNode();
                }
                Composer composerM30305constructorimpl = Updater.m30305constructorimpl(composer2);
                Updater.m30312setimpl(composerM30305constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion.getSetMeasurePolicy());
                Updater.m30312setimpl(composerM30305constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                InterfaceC9544p setCompositeKeyHash = companion.getSetCompositeKeyHash();
                if (composerM30305constructorimpl.getInserting() || !AbstractC9979u.m20289b(composerM30305constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    composerM30305constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM30305constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m30312setimpl(composerM30305constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                interfaceC9544p2.invoke(composer2, 0);
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
    public static final void m29154Surfaceo_FOJdg(final InterfaceC9529a interfaceC9529a, Modifier modifier, boolean z10, Shape shape, long j10, long j11, float f10, float f11, BorderStroke borderStroke, MutableInteractionSource mutableInteractionSource, final InterfaceC9544p interfaceC9544p, Composer composer, int i10, int i11, int i12) {
        final Modifier modifier2 = (i12 & 2) != 0 ? Modifier.Companion : modifier;
        final boolean z11 = (i12 & 4) != 0 ? true : z10;
        final Shape rectangleShape = (i12 & 8) != 0 ? RectangleShapeKt.getRectangleShape() : shape;
        final long jM28498getSurface0d7_KjU = (i12 & 16) != 0 ? MaterialTheme.INSTANCE.getColorScheme(composer, 6).m28498getSurface0d7_KjU() : j10;
        long jM28512contentColorForek8zF_U = (i12 & 32) != 0 ? ColorSchemeKt.m28512contentColorForek8zF_U(jM28498getSurface0d7_KjU, composer, (i10 >> 12) & 14) : j11;
        float fM33501constructorimpl = (i12 & 64) != 0 ? C3186Dp.m33501constructorimpl(0) : f10;
        final float fM33501constructorimpl2 = (i12 & 128) != 0 ? C3186Dp.m33501constructorimpl(0) : f11;
        BorderStroke borderStroke2 = (i12 & 256) != 0 ? null : borderStroke;
        MutableInteractionSource mutableInteractionSource2 = (i12 & 512) == 0 ? mutableInteractionSource : null;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-789752804, i10, i11, "androidx.compose.material3.Surface (Surface.kt:203)");
        }
        ProvidableCompositionLocal<C3186Dp> providableCompositionLocal = LocalAbsoluteTonalElevation;
        final float fM33501constructorimpl3 = C3186Dp.m33501constructorimpl(((C3186Dp) composer.consume(providableCompositionLocal)).m33515unboximpl() + fM33501constructorimpl);
        final BorderStroke borderStroke3 = borderStroke2;
        final MutableInteractionSource mutableInteractionSource3 = mutableInteractionSource2;
        CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(Color.m30868boximpl(jM28512contentColorForek8zF_U)), providableCompositionLocal.provides(C3186Dp.m33499boximpl(fM33501constructorimpl3))}, ComposableLambdaKt.rememberComposableLambda(1279702876, true, new InterfaceC9544p() { // from class: androidx.compose.material3.SurfaceKt$Surface$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // p181hd.InterfaceC9544p
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((Composer) obj, ((Number) obj2).intValue());
                return C10786q.f26013a;
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
                Modifier modifierM26984clickableO2vRcR0$default = ClickableKt.m26984clickableO2vRcR0$default(SurfaceKt.m29157surfaceXOJAsU(InteractiveComponentSizeKt.minimumInteractiveComponentSize(modifier2), rectangleShape, SurfaceKt.m29158surfaceColorAtElevationCLU3JFs(jM28498getSurface0d7_KjU, fM33501constructorimpl3, composer2, 0), borderStroke3, ((Density) composer2.consume(CompositionLocalsKt.getLocalDensity())).mo27099toPx0680j_4(fM33501constructorimpl2)), mutableInteractionSource3, RippleKt.m29009rippleOrFallbackImplementation9IZ8Weo(false, 0.0f, 0L, composer2, 0, 7), z11, null, null, interfaceC9529a, 24, null);
                InterfaceC9544p interfaceC9544p2 = interfaceC9544p;
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopStart(), true);
                int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer2, modifierM26984clickableO2vRcR0$default);
                ComposeUiNode.Companion companion = ComposeUiNode.Companion;
                InterfaceC9529a constructor = companion.getConstructor();
                if (composer2.getApplier() == null) {
                    ComposablesKt.invalidApplier();
                }
                composer2.startReusableNode();
                if (composer2.getInserting()) {
                    composer2.createNode(constructor);
                } else {
                    composer2.useNode();
                }
                Composer composerM30305constructorimpl = Updater.m30305constructorimpl(composer2);
                Updater.m30312setimpl(composerM30305constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion.getSetMeasurePolicy());
                Updater.m30312setimpl(composerM30305constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                InterfaceC9544p setCompositeKeyHash = companion.getSetCompositeKeyHash();
                if (composerM30305constructorimpl.getInserting() || !AbstractC9979u.m20289b(composerM30305constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    composerM30305constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM30305constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m30312setimpl(composerM30305constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                interfaceC9544p2.invoke(composer2, 0);
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

    public static final ProvidableCompositionLocal<C3186Dp> getLocalAbsoluteTonalElevation() {
        return LocalAbsoluteTonalElevation;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Stable
    /* renamed from: surface-XO-JAsU, reason: not valid java name */
    public static final Modifier m29157surfaceXOJAsU(Modifier modifier, Shape shape, long j10, BorderStroke borderStroke, float f10) {
        Shape shape2;
        Modifier modifierM31038graphicsLayerAp8cVGQ$default;
        if (f10 > 0.0f) {
            shape2 = shape;
            modifierM31038graphicsLayerAp8cVGQ$default = GraphicsLayerModifierKt.m31038graphicsLayerAp8cVGQ$default(Modifier.Companion, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, f10, 0.0f, 0.0f, 0.0f, 0.0f, 0L, shape2, false, null, 0L, 0L, 0, 124895, null);
        } else {
            shape2 = shape;
            modifierM31038graphicsLayerAp8cVGQ$default = Modifier.Companion;
        }
        return ClipKt.clip(BackgroundKt.m26949backgroundbw27NRU(modifier.then(modifierM31038graphicsLayerAp8cVGQ$default).then(borderStroke != null ? BorderKt.border(Modifier.Companion, borderStroke, shape2) : Modifier.Companion), j10, shape2), shape2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Composable
    /* renamed from: surfaceColorAtElevation-CLU3JFs, reason: not valid java name */
    public static final long m29158surfaceColorAtElevationCLU3JFs(long j10, float f10, Composer composer, int i10) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-2079918090, i10, -1, "androidx.compose.material3.surfaceColorAtElevation (Surface.kt:465)");
        }
        long jM28510applyTonalElevationRFCenO8 = ColorSchemeKt.m28510applyTonalElevationRFCenO8(MaterialTheme.INSTANCE.getColorScheme(composer, 6), j10, f10, composer, (i10 << 3) & 1008);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return jM28510applyTonalElevationRFCenO8;
    }

    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    /* renamed from: Surface-d85dljk, reason: not valid java name */
    public static final void m29153Surfaced85dljk(final boolean z10, final InterfaceC9540l interfaceC9540l, Modifier modifier, boolean z11, Shape shape, long j10, long j11, float f10, float f11, BorderStroke borderStroke, MutableInteractionSource mutableInteractionSource, final InterfaceC9544p interfaceC9544p, Composer composer, int i10, int i11, int i12) {
        final Modifier modifier2 = (i12 & 4) != 0 ? Modifier.Companion : modifier;
        final boolean z12 = (i12 & 8) != 0 ? true : z11;
        final Shape rectangleShape = (i12 & 16) != 0 ? RectangleShapeKt.getRectangleShape() : shape;
        final long jM28498getSurface0d7_KjU = (i12 & 32) != 0 ? MaterialTheme.INSTANCE.getColorScheme(composer, 6).m28498getSurface0d7_KjU() : j10;
        long jM28512contentColorForek8zF_U = (i12 & 64) != 0 ? ColorSchemeKt.m28512contentColorForek8zF_U(jM28498getSurface0d7_KjU, composer, (i10 >> 15) & 14) : j11;
        float fM33501constructorimpl = (i12 & 128) != 0 ? C3186Dp.m33501constructorimpl(0) : f10;
        final float fM33501constructorimpl2 = (i12 & 256) != 0 ? C3186Dp.m33501constructorimpl(0) : f11;
        BorderStroke borderStroke2 = (i12 & 512) != 0 ? null : borderStroke;
        final MutableInteractionSource mutableInteractionSource2 = (i12 & 1024) == 0 ? mutableInteractionSource : null;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1877401889, i10, i11, "androidx.compose.material3.Surface (Surface.kt:410)");
        }
        ProvidableCompositionLocal<C3186Dp> providableCompositionLocal = LocalAbsoluteTonalElevation;
        final float fM33501constructorimpl3 = C3186Dp.m33501constructorimpl(((C3186Dp) composer.consume(providableCompositionLocal)).m33515unboximpl() + fM33501constructorimpl);
        final BorderStroke borderStroke3 = borderStroke2;
        CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(Color.m30868boximpl(jM28512contentColorForek8zF_U)), providableCompositionLocal.provides(C3186Dp.m33499boximpl(fM33501constructorimpl3))}, ComposableLambdaKt.rememberComposableLambda(712720927, true, new InterfaceC9544p() { // from class: androidx.compose.material3.SurfaceKt$Surface$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // p181hd.InterfaceC9544p
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((Composer) obj, ((Number) obj2).intValue());
                return C10786q.f26013a;
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
                Modifier modifierM27727toggleableO2vRcR0$default = ToggleableKt.m27727toggleableO2vRcR0$default(SurfaceKt.m29157surfaceXOJAsU(InteractiveComponentSizeKt.minimumInteractiveComponentSize(modifier2), rectangleShape, SurfaceKt.m29158surfaceColorAtElevationCLU3JFs(jM28498getSurface0d7_KjU, fM33501constructorimpl3, composer2, 0), borderStroke3, ((Density) composer2.consume(CompositionLocalsKt.getLocalDensity())).mo27099toPx0680j_4(fM33501constructorimpl2)), z10, mutableInteractionSource2, RippleKt.m29009rippleOrFallbackImplementation9IZ8Weo(false, 0.0f, 0L, composer2, 0, 7), z12, null, interfaceC9540l, 16, null);
                InterfaceC9544p interfaceC9544p2 = interfaceC9544p;
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopStart(), true);
                int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer2, modifierM27727toggleableO2vRcR0$default);
                ComposeUiNode.Companion companion = ComposeUiNode.Companion;
                InterfaceC9529a constructor = companion.getConstructor();
                if (composer2.getApplier() == null) {
                    ComposablesKt.invalidApplier();
                }
                composer2.startReusableNode();
                if (composer2.getInserting()) {
                    composer2.createNode(constructor);
                } else {
                    composer2.useNode();
                }
                Composer composerM30305constructorimpl = Updater.m30305constructorimpl(composer2);
                Updater.m30312setimpl(composerM30305constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion.getSetMeasurePolicy());
                Updater.m30312setimpl(composerM30305constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                InterfaceC9544p setCompositeKeyHash = companion.getSetCompositeKeyHash();
                if (composerM30305constructorimpl.getInserting() || !AbstractC9979u.m20289b(composerM30305constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    composerM30305constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM30305constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m30312setimpl(composerM30305constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                interfaceC9544p2.invoke(composer2, 0);
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
