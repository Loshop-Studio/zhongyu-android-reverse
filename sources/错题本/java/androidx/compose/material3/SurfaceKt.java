package androidx.compose.material3;

import androidx.collection.AbstractC0584a;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.selection.SelectableKt;
import androidx.compose.foundation.selection.ToggleableKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifierKt;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.draw.ClipKt;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.p011ui.graphics.RectangleShapeKt;
import androidx.compose.p011ui.graphics.Shape;
import androidx.compose.p011ui.input.pointer.C2142xe3d9cdbd;
import androidx.compose.p011ui.input.pointer.PointerInputScope;
import androidx.compose.p011ui.input.pointer.SuspendPointerInputElement;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.CompositionLocalsKt;
import androidx.compose.p011ui.semantics.SemanticsModifierKt;
import androidx.compose.p011ui.semantics.SemanticsPropertiesKt;
import androidx.compose.p011ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.p011ui.unit.C2331Dp;
import androidx.compose.p011ui.unit.Density;
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
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.PointerIconCompat;
import kotlin.AbstractC5774b;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC5830k;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p045d6.C5443s;
import p075h6.InterfaceC5631c;
import p152r6.InterfaceC6469a;
import p152r6.InterfaceC6471c;
import p152r6.InterfaceC6473e;

@Metadata(m5109d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\u001am\u0010\u0012\u001a\u00020\r2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0011\u0010\u000f\u001a\r\u0012\u0004\u0012\u00020\r0\f¢\u0006\u0002\b\u000eH\u0007ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u0091\u0001\u0010\u0012\u001a\u00020\r2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\r0\f2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0015\u001a\u00020\u00142\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00162\u0011\u0010\u000f\u001a\r\u0012\u0004\u0012\u00020\r0\f¢\u0006\u0002\b\u000eH\u0007ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019\u001a\u0099\u0001\u0010\u0012\u001a\u00020\r2\u0006\u0010\u001a\u001a\u00020\u00142\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\r0\f2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0015\u001a\u00020\u00142\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00162\u0011\u0010\u000f\u001a\r\u0012\u0004\u0012\u00020\r0\f¢\u0006\u0002\b\u000eH\u0007ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001c\u001a\u009f\u0001\u0010\u0012\u001a\u00020\r2\u0006\u0010\u001d\u001a\u00020\u00142\u0012\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\r0\u001e2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0015\u001a\u00020\u00142\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00162\u0011\u0010\u000f\u001a\r\u0012\u0004\u0012\u00020\r0\f¢\u0006\u0002\b\u000eH\u0007ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010 \u001a8\u0010%\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010!\u001a\u00020\u00042\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\t\u001a\u00020\"H\u0003ø\u0001\u0000¢\u0006\u0004\b#\u0010$\u001a\"\u0010)\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010&\u001a\u00020\u0007H\u0003ø\u0001\u0000¢\u0006\u0004\b'\u0010(\"\u001d\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00070*8\u0006¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006/"}, m5110d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "Landroidx/compose/ui/graphics/Shape;", "shape", "Landroidx/compose/ui/graphics/Color;", TypedValues.Custom.S_COLOR, "contentColor", "Landroidx/compose/ui/unit/Dp;", "tonalElevation", "shadowElevation", "Landroidx/compose/foundation/BorderStroke;", "border", "Lkotlin/Function0;", "Ld6/s;", "Landroidx/compose/runtime/Composable;", "content", "Surface-T9BRK9s", "(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/graphics/Shape;JJFFLandroidx/compose/foundation/BorderStroke;Lr6/e;Landroidx/compose/runtime/Composer;II)V", "Surface", "onClick", "", "enabled", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "interactionSource", "Surface-o_FOJdg", "(Lr6/a;Landroidx/compose/ui/Modifier;ZLandroidx/compose/ui/graphics/Shape;JJFFLandroidx/compose/foundation/BorderStroke;Landroidx/compose/foundation/interaction/MutableInteractionSource;Lr6/e;Landroidx/compose/runtime/Composer;III)V", "selected", "Surface-d85dljk", "(ZLr6/a;Landroidx/compose/ui/Modifier;ZLandroidx/compose/ui/graphics/Shape;JJFFLandroidx/compose/foundation/BorderStroke;Landroidx/compose/foundation/interaction/MutableInteractionSource;Lr6/e;Landroidx/compose/runtime/Composer;III)V", "checked", "Lkotlin/Function1;", "onCheckedChange", "(ZLr6/c;Landroidx/compose/ui/Modifier;ZLandroidx/compose/ui/graphics/Shape;JJFFLandroidx/compose/foundation/BorderStroke;Landroidx/compose/foundation/interaction/MutableInteractionSource;Lr6/e;Landroidx/compose/runtime/Composer;III)V", "backgroundColor", "", "surface-XO-JAsU", "(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/graphics/Shape;JLandroidx/compose/foundation/BorderStroke;F)Landroidx/compose/ui/Modifier;", "surface", "elevation", "surfaceColorAtElevation-CLU3JFs", "(JFLandroidx/compose/runtime/Composer;I)J", "surfaceColorAtElevation", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "LocalAbsoluteTonalElevation", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "getLocalAbsoluteTonalElevation", "()Landroidx/compose/runtime/ProvidableCompositionLocal;", "material3_release"}, m5111k = 2, m5112mv = {1, 8, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nSurface.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Surface.kt\nandroidx/compose/material3/SurfaceKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 4 Dp.kt\nandroidx/compose/ui/unit/Dp\n*L\n1#1,475:1\n148#2:476\n148#2:477\n148#2:480\n148#2:481\n148#2:484\n148#2:485\n148#2:488\n148#2:489\n77#3:478\n77#3:482\n77#3:486\n77#3:490\n50#4:479\n50#4:483\n50#4:487\n50#4:491\n*S KotlinDebug\n*F\n+ 1 Surface.kt\nandroidx/compose/material3/SurfaceKt\n*L\n99#1:476\n100#1:477\n199#1:480\n200#1:481\n302#1:484\n303#1:485\n406#1:488\n407#1:489\n104#1:478\n205#1:482\n308#1:486\n412#1:490\n104#1:479\n205#1:483\n308#1:487\n412#1:491\n*E\n"})
/* loaded from: classes.dex */
public final class SurfaceKt {

    @NotNull
    private static final ProvidableCompositionLocal<C2331Dp> LocalAbsoluteTonalElevation = CompositionLocalKt.compositionLocalOf$default(null, new InterfaceC6469a() { // from class: androidx.compose.material3.SurfaceKt$LocalAbsoluteTonalElevation$1
        @Override // p152r6.InterfaceC6469a
        public /* bridge */ /* synthetic */ Object invoke() {
            return C2331Dp.m13303boximpl(m8963invokeD9Ej5fM());
        }

        /* renamed from: invoke-D9Ej5fM, reason: not valid java name */
        public final float m8963invokeD9Ej5fM() {
            return C2331Dp.m13305constructorimpl(0);
        }
    }, 1, null);

    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    /* renamed from: Surface-T9BRK9s, reason: not valid java name */
    public static final void m8955SurfaceT9BRK9s(@Nullable Modifier modifier, @Nullable Shape shape, long j7, long j8, float f, float f7, @Nullable BorderStroke borderStroke, @NotNull final InterfaceC6473e interfaceC6473e, @Nullable Composer composer, int i, int i8) {
        if ((i8 & 1) != 0) {
            modifier = Modifier.INSTANCE;
        }
        if ((i8 & 2) != 0) {
            shape = RectangleShapeKt.getRectangleShape();
        }
        if ((i8 & 4) != 0) {
            j7 = MaterialTheme.INSTANCE.getColorScheme(composer, 6).getSurface();
        }
        if ((i8 & 8) != 0) {
            j8 = ColorSchemeKt.m8316contentColorForek8zF_U(j7, composer, (i >> 6) & 14);
        }
        if ((i8 & 16) != 0) {
            f = C2331Dp.m13305constructorimpl(0);
        }
        if ((i8 & 32) != 0) {
            f7 = C2331Dp.m13305constructorimpl(0);
        }
        if ((i8 & 64) != 0) {
            borderStroke = null;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-513881741, i, -1, "androidx.compose.material3.Surface (Surface.kt:102)");
        }
        ProvidableCompositionLocal<C2331Dp> providableCompositionLocal = LocalAbsoluteTonalElevation;
        final float fM13305constructorimpl = C2331Dp.m13305constructorimpl(((C2331Dp) composer.consume(providableCompositionLocal)).m13319unboximpl() + f);
        ProvidedValue[] providedValueArr = {ContentColorKt.getLocalContentColor().provides(Color.m10672boximpl(j8)), providableCompositionLocal.provides(C2331Dp.m13303boximpl(fM13305constructorimpl))};
        final long j9 = j7;
        final Shape shape2 = shape;
        final BorderStroke borderStroke2 = borderStroke;
        final float f8 = f7;
        final Modifier modifier2 = modifier;
        CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) providedValueArr, ComposableLambdaKt.rememberComposableLambda(-70914509, true, new InterfaceC6473e() { // from class: androidx.compose.material3.SurfaceKt$Surface$1

            @Metadata(m5109d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m5110d2 = {"Landroidx/compose/ui/input/pointer/PointerInputScope;", "Ld6/s;", "<anonymous>", "(Landroidx/compose/ui/input/pointer/PointerInputScope;)V"}, m5111k = 3, m5112mv = {1, 8, 0})
            @DebugMetadata(m5302c = "androidx.compose.material3.SurfaceKt$Surface$1$3", m5303f = "Surface.kt", m5304i = {}, m5305l = {}, m5306m = "invokeSuspend", m5307n = {}, m5308s = {})
            /* renamed from: androidx.compose.material3.SurfaceKt$Surface$1$3 */
            public static final class C18543 extends SuspendLambda implements InterfaceC6473e {
                int label;

                public C18543(InterfaceC5631c<? super C18543> interfaceC5631c) {
                    super(2, interfaceC5631c);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @NotNull
                public final InterfaceC5631c<C5443s> create(@Nullable Object obj, @NotNull InterfaceC5631c<?> interfaceC5631c) {
                    return new C18543(interfaceC5631c);
                }

                @Override // p152r6.InterfaceC6473e
                @Nullable
                public final Object invoke(@NotNull PointerInputScope pointerInputScope, @Nullable InterfaceC5631c<? super C5443s> interfaceC5631c) {
                    return ((C18543) create(pointerInputScope, interfaceC5631c)).invokeSuspend(C5443s.f8405a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Nullable
                public final Object invokeSuspend(@NotNull Object obj) {
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC5774b.m5119b(obj);
                    return C5443s.f8405a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // p152r6.InterfaceC6473e
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((Composer) obj, ((Number) obj2).intValue());
                return C5443s.f8405a;
            }

            @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
            @Composable
            public final void invoke(@Nullable Composer composer2, int i9) {
                if ((i9 & 3) == 2 && composer2.getSkipping()) {
                    composer2.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-70914509, i9, -1, "androidx.compose.material3.Surface.<anonymous> (Surface.kt:108)");
                }
                Modifier modifierThen = SemanticsModifierKt.semantics(SurfaceKt.m8961surfaceXOJAsU(modifier2, shape2, SurfaceKt.m8962surfaceColorAtElevationCLU3JFs(j9, fM13305constructorimpl, composer2, 0), borderStroke2, ((Density) composer2.consume(CompositionLocalsKt.getLocalDensity())).mo6903toPx0680j_4(f8)), false, new InterfaceC6471c() { // from class: androidx.compose.material3.SurfaceKt$Surface$1.2
                    @Override // p152r6.InterfaceC6471c
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        invoke((SemanticsPropertyReceiver) obj);
                        return C5443s.f8405a;
                    }

                    public final void invoke(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver) {
                        SemanticsPropertiesKt.setContainer(semanticsPropertyReceiver, true);
                    }
                }).then(new SuspendPointerInputElement(C5443s.f8405a, null, null, new C2142xe3d9cdbd(new C18543(null)), 6, null));
                InterfaceC6473e interfaceC6473e2 = interfaceC6473e;
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), true);
                int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer2, modifierThen);
                ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                InterfaceC6469a constructor = companion.getConstructor();
                if (composer2.getApplier() == null) {
                    ComposablesKt.invalidApplier();
                }
                composer2.startReusableNode();
                if (composer2.getInserting()) {
                    composer2.createNode(constructor);
                } else {
                    composer2.useNode();
                }
                Composer composerM10109constructorimpl = Updater.m10109constructorimpl(composer2);
                InterfaceC6473e interfaceC6473eM917r = AbstractC0584a.m917r(companion, composerM10109constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, composerM10109constructorimpl, currentCompositionLocalMap);
                if (composerM10109constructorimpl.getInserting() || !AbstractC5830k.m5325b(composerM10109constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    AbstractC0584a.m918s(currentCompositeKeyHash, composerM10109constructorimpl, currentCompositeKeyHash, interfaceC6473eM917r);
                }
                Updater.m10116setimpl(composerM10109constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                if (AbstractC0584a.m924y(composer2, 0, interfaceC6473e2)) {
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
    public static final void m8956Surfaced85dljk(final boolean z8, @NotNull final InterfaceC6469a interfaceC6469a, @Nullable Modifier modifier, boolean z9, @Nullable Shape shape, long j7, long j8, float f, float f7, @Nullable BorderStroke borderStroke, @Nullable MutableInteractionSource mutableInteractionSource, @NotNull final InterfaceC6473e interfaceC6473e, @Nullable Composer composer, int i, int i8, int i9) {
        final Modifier modifier2 = (i9 & 4) != 0 ? Modifier.INSTANCE : modifier;
        final boolean z10 = (i9 & 8) != 0 ? true : z9;
        final Shape rectangleShape = (i9 & 16) != 0 ? RectangleShapeKt.getRectangleShape() : shape;
        final long surface = (i9 & 32) != 0 ? MaterialTheme.INSTANCE.getColorScheme(composer, 6).getSurface() : j7;
        long jM8316contentColorForek8zF_U = (i9 & 64) != 0 ? ColorSchemeKt.m8316contentColorForek8zF_U(surface, composer, (i >> 15) & 14) : j8;
        float fM13305constructorimpl = (i9 & 128) != 0 ? C2331Dp.m13305constructorimpl(0) : f;
        final float fM13305constructorimpl2 = (i9 & 256) != 0 ? C2331Dp.m13305constructorimpl(0) : f7;
        BorderStroke borderStroke2 = (i9 & 512) != 0 ? null : borderStroke;
        final MutableInteractionSource mutableInteractionSource2 = (i9 & 1024) == 0 ? mutableInteractionSource : null;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(540296512, i, i8, "androidx.compose.material3.Surface (Surface.kt:306)");
        }
        ProvidableCompositionLocal<C2331Dp> providableCompositionLocal = LocalAbsoluteTonalElevation;
        final float fM13305constructorimpl3 = C2331Dp.m13305constructorimpl(((C2331Dp) composer.consume(providableCompositionLocal)).m13319unboximpl() + fM13305constructorimpl);
        final BorderStroke borderStroke3 = borderStroke2;
        CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(Color.m10672boximpl(jM8316contentColorForek8zF_U)), providableCompositionLocal.provides(C2331Dp.m13303boximpl(fM13305constructorimpl3))}, ComposableLambdaKt.rememberComposableLambda(-1164547968, true, new InterfaceC6473e() { // from class: androidx.compose.material3.SurfaceKt$Surface$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // p152r6.InterfaceC6473e
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((Composer) obj, ((Number) obj2).intValue());
                return C5443s.f8405a;
            }

            @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
            @Composable
            public final void invoke(@Nullable Composer composer2, int i10) {
                if ((i10 & 3) == 2 && composer2.getSkipping()) {
                    composer2.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1164547968, i10, -1, "androidx.compose.material3.Surface.<anonymous> (Surface.kt:312)");
                }
                Modifier modifierM7526selectableO2vRcR0$default = SelectableKt.m7526selectableO2vRcR0$default(SurfaceKt.m8961surfaceXOJAsU(InteractiveComponentSizeKt.minimumInteractiveComponentSize(modifier2), rectangleShape, SurfaceKt.m8962surfaceColorAtElevationCLU3JFs(surface, fM13305constructorimpl3, composer2, 0), borderStroke3, ((Density) composer2.consume(CompositionLocalsKt.getLocalDensity())).mo6903toPx0680j_4(fM13305constructorimpl2)), z8, mutableInteractionSource2, RippleKt.m8813rippleOrFallbackImplementation9IZ8Weo(false, 0.0f, 0L, composer2, 0, 7), z10, null, interfaceC6469a, 16, null);
                InterfaceC6473e interfaceC6473e2 = interfaceC6473e;
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), true);
                int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer2, modifierM7526selectableO2vRcR0$default);
                ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                InterfaceC6469a constructor = companion.getConstructor();
                if (composer2.getApplier() == null) {
                    ComposablesKt.invalidApplier();
                }
                composer2.startReusableNode();
                if (composer2.getInserting()) {
                    composer2.createNode(constructor);
                } else {
                    composer2.useNode();
                }
                Composer composerM10109constructorimpl = Updater.m10109constructorimpl(composer2);
                InterfaceC6473e interfaceC6473eM917r = AbstractC0584a.m917r(companion, composerM10109constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, composerM10109constructorimpl, currentCompositionLocalMap);
                if (composerM10109constructorimpl.getInserting() || !AbstractC5830k.m5325b(composerM10109constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    AbstractC0584a.m918s(currentCompositeKeyHash, composerM10109constructorimpl, currentCompositeKeyHash, interfaceC6473eM917r);
                }
                Updater.m10116setimpl(composerM10109constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                if (AbstractC0584a.m924y(composer2, 0, interfaceC6473e2)) {
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
    public static final void m8958Surfaceo_FOJdg(@NotNull final InterfaceC6469a interfaceC6469a, @Nullable Modifier modifier, boolean z8, @Nullable Shape shape, long j7, long j8, float f, float f7, @Nullable BorderStroke borderStroke, @Nullable MutableInteractionSource mutableInteractionSource, @NotNull final InterfaceC6473e interfaceC6473e, @Nullable Composer composer, int i, int i8, int i9) {
        final Modifier modifier2 = (i9 & 2) != 0 ? Modifier.INSTANCE : modifier;
        final boolean z9 = (i9 & 4) != 0 ? true : z8;
        final Shape rectangleShape = (i9 & 8) != 0 ? RectangleShapeKt.getRectangleShape() : shape;
        final long surface = (i9 & 16) != 0 ? MaterialTheme.INSTANCE.getColorScheme(composer, 6).getSurface() : j7;
        long jM8316contentColorForek8zF_U = (i9 & 32) != 0 ? ColorSchemeKt.m8316contentColorForek8zF_U(surface, composer, (i >> 12) & 14) : j8;
        float fM13305constructorimpl = (i9 & 64) != 0 ? C2331Dp.m13305constructorimpl(0) : f;
        final float fM13305constructorimpl2 = (i9 & 128) != 0 ? C2331Dp.m13305constructorimpl(0) : f7;
        BorderStroke borderStroke2 = (i9 & 256) != 0 ? null : borderStroke;
        MutableInteractionSource mutableInteractionSource2 = (i9 & 512) == 0 ? mutableInteractionSource : null;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-789752804, i, i8, "androidx.compose.material3.Surface (Surface.kt:203)");
        }
        ProvidableCompositionLocal<C2331Dp> providableCompositionLocal = LocalAbsoluteTonalElevation;
        final float fM13305constructorimpl3 = C2331Dp.m13305constructorimpl(((C2331Dp) composer.consume(providableCompositionLocal)).m13319unboximpl() + fM13305constructorimpl);
        final BorderStroke borderStroke3 = borderStroke2;
        final MutableInteractionSource mutableInteractionSource3 = mutableInteractionSource2;
        CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(Color.m10672boximpl(jM8316contentColorForek8zF_U)), providableCompositionLocal.provides(C2331Dp.m13303boximpl(fM13305constructorimpl3))}, ComposableLambdaKt.rememberComposableLambda(1279702876, true, new InterfaceC6473e() { // from class: androidx.compose.material3.SurfaceKt$Surface$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // p152r6.InterfaceC6473e
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((Composer) obj, ((Number) obj2).intValue());
                return C5443s.f8405a;
            }

            @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
            @Composable
            public final void invoke(@Nullable Composer composer2, int i10) {
                if ((i10 & 3) == 2 && composer2.getSkipping()) {
                    composer2.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1279702876, i10, -1, "androidx.compose.material3.Surface.<anonymous> (Surface.kt:209)");
                }
                Modifier modifierM6788clickableO2vRcR0$default = ClickableKt.m6788clickableO2vRcR0$default(SurfaceKt.m8961surfaceXOJAsU(InteractiveComponentSizeKt.minimumInteractiveComponentSize(modifier2), rectangleShape, SurfaceKt.m8962surfaceColorAtElevationCLU3JFs(surface, fM13305constructorimpl3, composer2, 0), borderStroke3, ((Density) composer2.consume(CompositionLocalsKt.getLocalDensity())).mo6903toPx0680j_4(fM13305constructorimpl2)), mutableInteractionSource3, RippleKt.m8813rippleOrFallbackImplementation9IZ8Weo(false, 0.0f, 0L, composer2, 0, 7), z9, null, null, interfaceC6469a, 24, null);
                InterfaceC6473e interfaceC6473e2 = interfaceC6473e;
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), true);
                int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer2, modifierM6788clickableO2vRcR0$default);
                ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                InterfaceC6469a constructor = companion.getConstructor();
                if (composer2.getApplier() == null) {
                    ComposablesKt.invalidApplier();
                }
                composer2.startReusableNode();
                if (composer2.getInserting()) {
                    composer2.createNode(constructor);
                } else {
                    composer2.useNode();
                }
                Composer composerM10109constructorimpl = Updater.m10109constructorimpl(composer2);
                InterfaceC6473e interfaceC6473eM917r = AbstractC0584a.m917r(companion, composerM10109constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, composerM10109constructorimpl, currentCompositionLocalMap);
                if (composerM10109constructorimpl.getInserting() || !AbstractC5830k.m5325b(composerM10109constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    AbstractC0584a.m918s(currentCompositeKeyHash, composerM10109constructorimpl, currentCompositeKeyHash, interfaceC6473eM917r);
                }
                Updater.m10116setimpl(composerM10109constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                if (AbstractC0584a.m924y(composer2, 0, interfaceC6473e2)) {
                    ComposerKt.traceEventEnd();
                }
            }
        }, composer, 54), composer, ProvidedValue.$stable | 48);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    @NotNull
    public static final ProvidableCompositionLocal<C2331Dp> getLocalAbsoluteTonalElevation() {
        return LocalAbsoluteTonalElevation;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Stable
    /* renamed from: surface-XO-JAsU, reason: not valid java name */
    public static final Modifier m8961surfaceXOJAsU(Modifier modifier, Shape shape, long j7, BorderStroke borderStroke, float f) {
        Shape shape2;
        Modifier modifierM10842graphicsLayerAp8cVGQ$default;
        if (f > 0.0f) {
            shape2 = shape;
            modifierM10842graphicsLayerAp8cVGQ$default = GraphicsLayerModifierKt.m10842graphicsLayerAp8cVGQ$default(Modifier.INSTANCE, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, f, 0.0f, 0.0f, 0.0f, 0.0f, 0L, shape2, false, null, 0L, 0L, 0, 124895, null);
        } else {
            shape2 = shape;
            modifierM10842graphicsLayerAp8cVGQ$default = Modifier.INSTANCE;
        }
        return ClipKt.clip(BackgroundKt.m6753backgroundbw27NRU(modifier.then(modifierM10842graphicsLayerAp8cVGQ$default).then(borderStroke != null ? BorderKt.border(Modifier.INSTANCE, borderStroke, shape2) : Modifier.INSTANCE), j7, shape2), shape2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Composable
    /* renamed from: surfaceColorAtElevation-CLU3JFs, reason: not valid java name */
    public static final long m8962surfaceColorAtElevationCLU3JFs(long j7, float f, Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-2079918090, i, -1, "androidx.compose.material3.surfaceColorAtElevation (Surface.kt:465)");
        }
        long jM8314applyTonalElevationRFCenO8 = ColorSchemeKt.m8314applyTonalElevationRFCenO8(MaterialTheme.INSTANCE.getColorScheme(composer, 6), j7, f, composer, (i << 3) & PointerIconCompat.TYPE_TEXT);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return jM8314applyTonalElevationRFCenO8;
    }

    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    /* renamed from: Surface-d85dljk, reason: not valid java name */
    public static final void m8957Surfaced85dljk(final boolean z8, @NotNull final InterfaceC6471c interfaceC6471c, @Nullable Modifier modifier, boolean z9, @Nullable Shape shape, long j7, long j8, float f, float f7, @Nullable BorderStroke borderStroke, @Nullable MutableInteractionSource mutableInteractionSource, @NotNull final InterfaceC6473e interfaceC6473e, @Nullable Composer composer, int i, int i8, int i9) {
        final Modifier modifier2 = (i9 & 4) != 0 ? Modifier.INSTANCE : modifier;
        final boolean z10 = (i9 & 8) != 0 ? true : z9;
        final Shape rectangleShape = (i9 & 16) != 0 ? RectangleShapeKt.getRectangleShape() : shape;
        final long surface = (i9 & 32) != 0 ? MaterialTheme.INSTANCE.getColorScheme(composer, 6).getSurface() : j7;
        long jM8316contentColorForek8zF_U = (i9 & 64) != 0 ? ColorSchemeKt.m8316contentColorForek8zF_U(surface, composer, (i >> 15) & 14) : j8;
        float fM13305constructorimpl = (i9 & 128) != 0 ? C2331Dp.m13305constructorimpl(0) : f;
        final float fM13305constructorimpl2 = (i9 & 256) != 0 ? C2331Dp.m13305constructorimpl(0) : f7;
        BorderStroke borderStroke2 = (i9 & 512) != 0 ? null : borderStroke;
        final MutableInteractionSource mutableInteractionSource2 = (i9 & 1024) == 0 ? mutableInteractionSource : null;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1877401889, i, i8, "androidx.compose.material3.Surface (Surface.kt:410)");
        }
        ProvidableCompositionLocal<C2331Dp> providableCompositionLocal = LocalAbsoluteTonalElevation;
        final float fM13305constructorimpl3 = C2331Dp.m13305constructorimpl(((C2331Dp) composer.consume(providableCompositionLocal)).m13319unboximpl() + fM13305constructorimpl);
        final BorderStroke borderStroke3 = borderStroke2;
        CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(Color.m10672boximpl(jM8316contentColorForek8zF_U)), providableCompositionLocal.provides(C2331Dp.m13303boximpl(fM13305constructorimpl3))}, ComposableLambdaKt.rememberComposableLambda(712720927, true, new InterfaceC6473e() { // from class: androidx.compose.material3.SurfaceKt$Surface$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // p152r6.InterfaceC6473e
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((Composer) obj, ((Number) obj2).intValue());
                return C5443s.f8405a;
            }

            @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
            @Composable
            public final void invoke(@Nullable Composer composer2, int i10) {
                if ((i10 & 3) == 2 && composer2.getSkipping()) {
                    composer2.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(712720927, i10, -1, "androidx.compose.material3.Surface.<anonymous> (Surface.kt:416)");
                }
                Modifier modifierM7531toggleableO2vRcR0$default = ToggleableKt.m7531toggleableO2vRcR0$default(SurfaceKt.m8961surfaceXOJAsU(InteractiveComponentSizeKt.minimumInteractiveComponentSize(modifier2), rectangleShape, SurfaceKt.m8962surfaceColorAtElevationCLU3JFs(surface, fM13305constructorimpl3, composer2, 0), borderStroke3, ((Density) composer2.consume(CompositionLocalsKt.getLocalDensity())).mo6903toPx0680j_4(fM13305constructorimpl2)), z8, mutableInteractionSource2, RippleKt.m8813rippleOrFallbackImplementation9IZ8Weo(false, 0.0f, 0L, composer2, 0, 7), z10, null, interfaceC6471c, 16, null);
                InterfaceC6473e interfaceC6473e2 = interfaceC6473e;
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), true);
                int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer2, modifierM7531toggleableO2vRcR0$default);
                ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                InterfaceC6469a constructor = companion.getConstructor();
                if (composer2.getApplier() == null) {
                    ComposablesKt.invalidApplier();
                }
                composer2.startReusableNode();
                if (composer2.getInserting()) {
                    composer2.createNode(constructor);
                } else {
                    composer2.useNode();
                }
                Composer composerM10109constructorimpl = Updater.m10109constructorimpl(composer2);
                InterfaceC6473e interfaceC6473eM917r = AbstractC0584a.m917r(companion, composerM10109constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, composerM10109constructorimpl, currentCompositionLocalMap);
                if (composerM10109constructorimpl.getInserting() || !AbstractC5830k.m5325b(composerM10109constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    AbstractC0584a.m918s(currentCompositeKeyHash, composerM10109constructorimpl, currentCompositeKeyHash, interfaceC6473eM917r);
                }
                Updater.m10116setimpl(composerM10109constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                if (AbstractC0584a.m924y(composer2, 0, interfaceC6473e2)) {
                    ComposerKt.traceEventEnd();
                }
            }
        }, composer, 54), composer, ProvidedValue.$stable | 48);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
