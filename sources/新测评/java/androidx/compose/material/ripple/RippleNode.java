package androidx.compose.material.ripple;

import androidx.collection.MutableObjectList;
import androidx.compose.foundation.interaction.Interaction;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.foundation.interaction.PressInteraction;
import androidx.compose.p013ui.Modifier;
import androidx.compose.p013ui.geometry.Size;
import androidx.compose.p013ui.graphics.ColorProducer;
import androidx.compose.p013ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.p013ui.graphics.drawscope.DrawScope;
import androidx.compose.p013ui.node.CompositionLocalConsumerModifierNode;
import androidx.compose.p013ui.node.DelegatableNodeKt;
import androidx.compose.p013ui.node.DrawModifierNode;
import androidx.compose.p013ui.node.DrawModifierNodeKt;
import androidx.compose.p013ui.node.LayoutAwareModifierNode;
import androidx.compose.p013ui.unit.Density;
import androidx.compose.p013ui.unit.IntSizeKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

@StabilityInferred(parameters = 0)
@Metadata(m13557d1 = {"\u0000\u0092\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b \u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B3\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e¢\u0006\u0002\u0010\u0010J*\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u0002002\u0006\u00101\u001a\u00020\u001f2\u0006\u0010'\u001a\u00020(H&ø\u0001\u0000¢\u0006\u0004\b2\u00103J\u0010\u00104\u001a\u00020.2\u0006\u00105\u001a\u00020\u0016H\u0002J\b\u00106\u001a\u00020.H\u0016J\u001a\u00107\u001a\u00020.2\u0006\u00101\u001a\u000208H\u0016ø\u0001\u0000¢\u0006\u0004\b9\u0010:J\u0010\u0010;\u001a\u00020.2\u0006\u0010/\u001a\u000200H&J\u0018\u0010<\u001a\u00020.2\u0006\u0010/\u001a\u00020=2\u0006\u0010>\u001a\u00020?H\u0002J\f\u0010@\u001a\u00020.*\u00020AH\u0016J\f\u0010B\u001a\u00020.*\u00020CH&R\u0014\u0010\u0007\u001a\u00020\bX\u0084\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\t\u001a\u00020\nX\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\u0017R\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eX\u0084\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u001a\u001a\u00020\u001b8Fø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR&\u0010 \u001a\u00020\u001f2\u0006\u0010\u001e\u001a\u00020\u001f@BX\u0084\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\"\u001a\u0004\b!\u0010\u001dR\u0014\u0010#\u001a\u00020\bX\u0086D¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u0012R\u0010\u0010%\u001a\u0004\u0018\u00010&X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010'\u001a\u00020(X\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006D"}, m13558d2 = {"Landroidx/compose/material/ripple/RippleNode;", "Landroidx/compose/ui/Modifier$Node;", "Landroidx/compose/ui/node/CompositionLocalConsumerModifierNode;", "Landroidx/compose/ui/node/DrawModifierNode;", "Landroidx/compose/ui/node/LayoutAwareModifierNode;", "interactionSource", "Landroidx/compose/foundation/interaction/InteractionSource;", "bounded", "", "radius", "Landroidx/compose/ui/unit/Dp;", TypedValues.Custom.S_COLOR, "Landroidx/compose/ui/graphics/ColorProducer;", "rippleAlpha", "Lkotlin/Function0;", "Landroidx/compose/material/ripple/RippleAlpha;", "(Landroidx/compose/foundation/interaction/InteractionSource;ZFLandroidx/compose/ui/graphics/ColorProducer;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "getBounded", "()Z", "hasValidSize", "pendingInteractions", "Landroidx/collection/MutableObjectList;", "Landroidx/compose/foundation/interaction/PressInteraction;", "F", "getRippleAlpha", "()Lkotlin/jvm/functions/Function0;", "rippleColor", "Landroidx/compose/ui/graphics/Color;", "getRippleColor-0d7_KjU", "()J", "<set-?>", "Landroidx/compose/ui/geometry/Size;", "rippleSize", "getRippleSize-NH-jbRc", "J", "shouldAutoInvalidate", "getShouldAutoInvalidate", "stateLayer", "Landroidx/compose/material/ripple/StateLayer;", "targetRadius", "", "getTargetRadius", "()F", "setTargetRadius", "(F)V", "addRipple", "", "interaction", "Landroidx/compose/foundation/interaction/PressInteraction$Press;", "size", "addRipple-12SF9DM", "(Landroidx/compose/foundation/interaction/PressInteraction$Press;JF)V", "handlePressInteraction", "pressInteraction", "onAttach", "onRemeasured", "Landroidx/compose/ui/unit/IntSize;", "onRemeasured-ozmzZPI", "(J)V", "removeRipple", "updateStateLayer", "Landroidx/compose/foundation/interaction/Interaction;", "scope", "Lkotlinx/coroutines/CoroutineScope;", "draw", "Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;", "drawRipples", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "material-ripple_release"}, m13559k = 1, m13560mv = {1, 9, 0}, m13562xi = 48)
@SourceDebugExtension({"SMAP\nRipple.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Ripple.kt\nandroidx/compose/material/ripple/RippleNode\n+ 2 ObjectList.kt\nandroidx/collection/ObjectListKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ObjectList.kt\nandroidx/collection/ObjectList\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,530:1\n1516#2:531\n132#3:532\n287#4,6:533\n1#5:539\n*S KotlinDebug\n*F\n+ 1 Ripple.kt\nandroidx/compose/material/ripple/RippleNode\n*L\n338#1:531\n346#1:532\n358#1:533,6\n*E\n"})
/* loaded from: classes2.dex */
public abstract class RippleNode extends Modifier.Node implements CompositionLocalConsumerModifierNode, DrawModifierNode, LayoutAwareModifierNode {
    public static final int $stable = 8;
    private final boolean bounded;
    private final ColorProducer color;
    private boolean hasValidSize;
    private final InteractionSource interactionSource;
    private final MutableObjectList<PressInteraction> pendingInteractions;
    private final float radius;
    private final Function0<RippleAlpha> rippleAlpha;
    private long rippleSize;
    private final boolean shouldAutoInvalidate;
    private StateLayer stateLayer;
    private float targetRadius;

    @Metadata(m13557d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m13558d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m13559k = 3, m13560mv = {1, 9, 0}, m13562xi = 48)
    @DebugMetadata(m13595c = "androidx.compose.material.ripple.RippleNode$onAttach$1", m13596f = "Ripple.kt", m13597i = {}, m13598l = {364}, m13599m = "invokeSuspend", m13600n = {}, m13601s = {})
    /* renamed from: androidx.compose.material.ripple.RippleNode$onAttach$1 */
    public static final class C19691 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        public C19691(Continuation<? super C19691> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C19691 c19691 = RippleNode.this.new C19691(continuation);
            c19691.L$0 = obj;
            return c19691;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i10 = this.label;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                final CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
                Flow<Interaction> interactions = RippleNode.this.interactionSource.getInteractions();
                final RippleNode rippleNode = RippleNode.this;
                FlowCollector<? super Interaction> flowCollector = new FlowCollector() { // from class: androidx.compose.material.ripple.RippleNode.onAttach.1.1
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        return emit((Interaction) obj2, (Continuation<? super Unit>) continuation);
                    }

                    public final Object emit(Interaction interaction, Continuation<? super Unit> continuation) {
                        if (!(interaction instanceof PressInteraction)) {
                            rippleNode.updateStateLayer(interaction, coroutineScope);
                        } else if (rippleNode.hasValidSize) {
                            rippleNode.handlePressInteraction((PressInteraction) interaction);
                        } else {
                            rippleNode.pendingInteractions.add(interaction);
                        }
                        return Unit.INSTANCE;
                    }
                };
                this.label = 1;
                if (interactions.collect(flowCollector, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C19691) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public /* synthetic */ RippleNode(InteractionSource interactionSource, boolean z9, float f10, ColorProducer colorProducer, Function0 function0, DefaultConstructorMarker defaultConstructorMarker) {
        this(interactionSource, z9, f10, colorProducer, function0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handlePressInteraction(PressInteraction pressInteraction) {
        if (pressInteraction instanceof PressInteraction.Press) {
            mo18472addRipple12SF9DM((PressInteraction.Press) pressInteraction, this.rippleSize, this.targetRadius);
        } else if (pressInteraction instanceof PressInteraction.Release) {
            removeRipple(((PressInteraction.Release) pressInteraction).getPress());
        } else if (pressInteraction instanceof PressInteraction.Cancel) {
            removeRipple(((PressInteraction.Cancel) pressInteraction).getPress());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateStateLayer(Interaction interaction, CoroutineScope scope) {
        StateLayer stateLayer = this.stateLayer;
        if (stateLayer == null) {
            stateLayer = new StateLayer(this.bounded, this.rippleAlpha);
            DrawModifierNodeKt.invalidateDraw(this);
            this.stateLayer = stateLayer;
        }
        stateLayer.handleInteraction$material_ripple_release(interaction, scope);
    }

    /* renamed from: addRipple-12SF9DM */
    public abstract void mo18472addRipple12SF9DM(PressInteraction.Press interaction, long size, float targetRadius);

    @Override // androidx.compose.p013ui.node.DrawModifierNode
    public void draw(ContentDrawScope contentDrawScope) throws Throwable {
        contentDrawScope.drawContent();
        StateLayer stateLayer = this.stateLayer;
        if (stateLayer != null) {
            stateLayer.m18489drawStateLayermxwnekA(contentDrawScope, this.targetRadius, m18484getRippleColor0d7_KjU());
        }
        drawRipples(contentDrawScope);
    }

    public abstract void drawRipples(DrawScope drawScope);

    public final boolean getBounded() {
        return this.bounded;
    }

    public final Function0<RippleAlpha> getRippleAlpha() {
        return this.rippleAlpha;
    }

    /* renamed from: getRippleColor-0d7_KjU, reason: not valid java name */
    public final long m18484getRippleColor0d7_KjU() {
        return this.color.mo18797invoke0d7_KjU();
    }

    /* renamed from: getRippleSize-NH-jbRc, reason: not valid java name and from getter */
    public final long getRippleSize() {
        return this.rippleSize;
    }

    @Override // androidx.compose.ui.Modifier.Node
    public final boolean getShouldAutoInvalidate() {
        return this.shouldAutoInvalidate;
    }

    public final float getTargetRadius() {
        return this.targetRadius;
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onAttach() {
        BuildersKt__Builders_commonKt.launch$default(getCoroutineScope(), null, null, new C19691(null), 3, null);
    }

    @Override // androidx.compose.p013ui.node.LayoutAwareModifierNode
    /* renamed from: onRemeasured-ozmzZPI */
    public void mo17320onRemeasuredozmzZPI(long size) {
        this.hasValidSize = true;
        Density densityRequireDensity = DelegatableNodeKt.requireDensity(this);
        this.rippleSize = IntSizeKt.m23744toSizeozmzZPI(size);
        this.targetRadius = Float.isNaN(this.radius) ? RippleAnimationKt.m18477getRippleEndRadiuscSwnlzA(densityRequireDensity, this.bounded, this.rippleSize) : densityRequireDensity.mo17332toPx0680j_4(this.radius);
        MutableObjectList<PressInteraction> mutableObjectList = this.pendingInteractions;
        Object[] objArr = mutableObjectList.content;
        int i10 = mutableObjectList._size;
        for (int i11 = 0; i11 < i10; i11++) {
            handlePressInteraction((PressInteraction) objArr[i11]);
        }
        this.pendingInteractions.clear();
    }

    public abstract void removeRipple(PressInteraction.Press interaction);

    public final void setTargetRadius(float f10) {
        this.targetRadius = f10;
    }

    private RippleNode(InteractionSource interactionSource, boolean z9, float f10, ColorProducer colorProducer, Function0<RippleAlpha> function0) {
        this.interactionSource = interactionSource;
        this.bounded = z9;
        this.radius = f10;
        this.color = colorProducer;
        this.rippleAlpha = function0;
        this.rippleSize = Size.INSTANCE.m20813getZeroNHjbRc();
        this.pendingInteractions = new MutableObjectList<>(0, 1, null);
    }
}
