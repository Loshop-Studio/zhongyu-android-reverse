package androidx.compose.material.ripple;

import androidx.collection.MutableObjectList;
import androidx.compose.foundation.interaction.Interaction;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.foundation.interaction.PressInteraction;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.geometry.Size;
import androidx.compose.p011ui.graphics.ColorProducer;
import androidx.compose.p011ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.p011ui.graphics.drawscope.DrawScope;
import androidx.compose.p011ui.node.CompositionLocalConsumerModifierNode;
import androidx.compose.p011ui.node.DelegatableNodeKt;
import androidx.compose.p011ui.node.DrawModifierNode;
import androidx.compose.p011ui.node.DrawModifierNodeKt;
import androidx.compose.p011ui.node.LayoutAwareModifierNode;
import androidx.compose.p011ui.unit.Density;
import androidx.compose.p011ui.unit.IntSizeKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.AbstractC5774b;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC5824e;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.AbstractC6014x;
import kotlinx.coroutines.InterfaceC6009v;
import kotlinx.coroutines.flow.InterfaceC5910f;
import kotlinx.coroutines.flow.InterfaceC5912g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p045d6.C5443s;
import p075h6.InterfaceC5631c;
import p152r6.InterfaceC6469a;
import p152r6.InterfaceC6473e;

@StabilityInferred(parameters = 0)
@Metadata(m5109d1 = {"\u0000\u0094\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b \u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B5\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u001b\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010!\u001a\u00020\u00142\u0006\u0010\u001e\u001a\u00020\u001dH\u0016ø\u0001\u0000¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010\"\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\"\u0010#J\u0013\u0010%\u001a\u00020\u0014*\u00020$H\u0016¢\u0006\u0004\b%\u0010&J\u0013\u0010(\u001a\u00020\u0014*\u00020'H&¢\u0006\u0004\b(\u0010)J*\u00100\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020*2\u0006\u0010\u001e\u001a\u00020+2\u0006\u0010-\u001a\u00020,H&ø\u0001\u0000¢\u0006\u0004\b.\u0010/J\u0017\u00101\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020*H&¢\u0006\u0004\b1\u00102R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u00103R\u001a\u0010\b\u001a\u00020\u00078\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\b\u00104\u001a\u0004\b5\u00106R\u001a\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\n\u00107R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u00108R \u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u000f\u00109\u001a\u0004\b:\u0010;R\u001a\u0010<\u001a\u00020\u00078\u0006X\u0086D¢\u0006\f\n\u0004\b<\u00104\u001a\u0004\b=\u00106R\u0018\u0010?\u001a\u0004\u0018\u00010>8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b?\u0010@R\"\u0010-\u001a\u00020,8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b-\u00107\u001a\u0004\bA\u0010B\"\u0004\bC\u0010DR*\u0010F\u001a\u00020+2\u0006\u0010E\u001a\u00020+8\u0004@BX\u0084\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\bF\u0010G\u001a\u0004\bH\u0010IR\u0016\u0010J\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bJ\u00104R\u001a\u0010L\u001a\b\u0012\u0004\u0012\u00020\u00120K8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bL\u0010MR\u0017\u0010P\u001a\u00020N8Fø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\bO\u0010I\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006Q"}, m5110d2 = {"Landroidx/compose/material/ripple/RippleNode;", "Landroidx/compose/ui/Modifier$Node;", "Landroidx/compose/ui/node/CompositionLocalConsumerModifierNode;", "Landroidx/compose/ui/node/DrawModifierNode;", "Landroidx/compose/ui/node/LayoutAwareModifierNode;", "Landroidx/compose/foundation/interaction/InteractionSource;", "interactionSource", "", "bounded", "Landroidx/compose/ui/unit/Dp;", "radius", "Landroidx/compose/ui/graphics/ColorProducer;", TypedValues.Custom.S_COLOR, "Lkotlin/Function0;", "Landroidx/compose/material/ripple/RippleAlpha;", "rippleAlpha", "<init>", "(Landroidx/compose/foundation/interaction/InteractionSource;ZFLandroidx/compose/ui/graphics/ColorProducer;Lr6/a;Lkotlin/jvm/internal/e;)V", "Landroidx/compose/foundation/interaction/PressInteraction;", "pressInteraction", "Ld6/s;", "handlePressInteraction", "(Landroidx/compose/foundation/interaction/PressInteraction;)V", "Landroidx/compose/foundation/interaction/Interaction;", "interaction", "Lkotlinx/coroutines/v;", "scope", "updateStateLayer", "(Landroidx/compose/foundation/interaction/Interaction;Lkotlinx/coroutines/v;)V", "Landroidx/compose/ui/unit/IntSize;", "size", "onRemeasured-ozmzZPI", "(J)V", "onRemeasured", "onAttach", "()V", "Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;", "draw", "(Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;)V", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "drawRipples", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;)V", "Landroidx/compose/foundation/interaction/PressInteraction$Press;", "Landroidx/compose/ui/geometry/Size;", "", "targetRadius", "addRipple-12SF9DM", "(Landroidx/compose/foundation/interaction/PressInteraction$Press;JF)V", "addRipple", "removeRipple", "(Landroidx/compose/foundation/interaction/PressInteraction$Press;)V", "Landroidx/compose/foundation/interaction/InteractionSource;", "Z", "getBounded", "()Z", "F", "Landroidx/compose/ui/graphics/ColorProducer;", "Lr6/a;", "getRippleAlpha", "()Lr6/a;", "shouldAutoInvalidate", "getShouldAutoInvalidate", "Landroidx/compose/material/ripple/StateLayer;", "stateLayer", "Landroidx/compose/material/ripple/StateLayer;", "getTargetRadius", "()F", "setTargetRadius", "(F)V", "<set-?>", "rippleSize", "J", "getRippleSize-NH-jbRc", "()J", "hasValidSize", "Landroidx/collection/MutableObjectList;", "pendingInteractions", "Landroidx/collection/MutableObjectList;", "Landroidx/compose/ui/graphics/Color;", "getRippleColor-0d7_KjU", "rippleColor", "material-ripple_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nRipple.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Ripple.kt\nandroidx/compose/material/ripple/RippleNode\n+ 2 ObjectList.kt\nandroidx/collection/ObjectListKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ObjectList.kt\nandroidx/collection/ObjectList\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,530:1\n1516#2:531\n132#3:532\n287#4,6:533\n1#5:539\n*S KotlinDebug\n*F\n+ 1 Ripple.kt\nandroidx/compose/material/ripple/RippleNode\n*L\n338#1:531\n346#1:532\n358#1:533,6\n*E\n"})
/* loaded from: classes.dex */
public abstract class RippleNode extends Modifier.Node implements CompositionLocalConsumerModifierNode, DrawModifierNode, LayoutAwareModifierNode {
    public static final int $stable = 8;
    private final boolean bounded;

    @NotNull
    private final ColorProducer color;
    private boolean hasValidSize;

    @NotNull
    private final InteractionSource interactionSource;

    @NotNull
    private final MutableObjectList<PressInteraction> pendingInteractions;
    private final float radius;

    @NotNull
    private final InterfaceC6469a rippleAlpha;
    private long rippleSize;
    private final boolean shouldAutoInvalidate;

    @Nullable
    private StateLayer stateLayer;
    private float targetRadius;

    @Metadata(m5109d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m5110d2 = {"Lkotlinx/coroutines/v;", "Ld6/s;", "<anonymous>", "(Lkotlinx/coroutines/v;)V"}, m5111k = 3, m5112mv = {1, 9, 0})
    @DebugMetadata(m5302c = "androidx.compose.material.ripple.RippleNode$onAttach$1", m5303f = "Ripple.kt", m5304i = {}, m5305l = {364}, m5306m = "invokeSuspend", m5307n = {}, m5308s = {})
    /* renamed from: androidx.compose.material.ripple.RippleNode$onAttach$1 */
    public static final class C15091 extends SuspendLambda implements InterfaceC6473e {
        private /* synthetic */ Object L$0;
        int label;

        public C15091(InterfaceC5631c<? super C15091> interfaceC5631c) {
            super(2, interfaceC5631c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC5631c<C5443s> create(Object obj, InterfaceC5631c<?> interfaceC5631c) {
            C15091 c15091 = RippleNode.this.new C15091(interfaceC5631c);
            c15091.L$0 = obj;
            return c15091;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                AbstractC5774b.m5119b(obj);
                final InterfaceC6009v interfaceC6009v = (InterfaceC6009v) this.L$0;
                InterfaceC5910f interactions = RippleNode.this.interactionSource.getInteractions();
                final RippleNode rippleNode = RippleNode.this;
                InterfaceC5912g interfaceC5912g = new InterfaceC5912g() { // from class: androidx.compose.material.ripple.RippleNode.onAttach.1.1
                    @Override // kotlinx.coroutines.flow.InterfaceC5912g
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, InterfaceC5631c interfaceC5631c) {
                        return emit((Interaction) obj2, (InterfaceC5631c<? super C5443s>) interfaceC5631c);
                    }

                    public final Object emit(Interaction interaction, InterfaceC5631c<? super C5443s> interfaceC5631c) {
                        if (!(interaction instanceof PressInteraction)) {
                            rippleNode.updateStateLayer(interaction, interfaceC6009v);
                        } else if (rippleNode.hasValidSize) {
                            rippleNode.handlePressInteraction((PressInteraction) interaction);
                        } else {
                            rippleNode.pendingInteractions.add(interaction);
                        }
                        return C5443s.f8405a;
                    }
                };
                this.label = 1;
                if (interactions.collect(interfaceC5912g, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC5774b.m5119b(obj);
            }
            return C5443s.f8405a;
        }

        @Override // p152r6.InterfaceC6473e
        public final Object invoke(InterfaceC6009v interfaceC6009v, InterfaceC5631c<? super C5443s> interfaceC5631c) {
            return ((C15091) create(interfaceC6009v, interfaceC5631c)).invokeSuspend(C5443s.f8405a);
        }
    }

    public /* synthetic */ RippleNode(InteractionSource interactionSource, boolean z8, float f, ColorProducer colorProducer, InterfaceC6469a interfaceC6469a, AbstractC5824e abstractC5824e) {
        this(interactionSource, z8, f, colorProducer, interfaceC6469a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handlePressInteraction(PressInteraction pressInteraction) {
        if (pressInteraction instanceof PressInteraction.Press) {
            mo8117addRipple12SF9DM((PressInteraction.Press) pressInteraction, this.rippleSize, this.targetRadius);
        } else if (pressInteraction instanceof PressInteraction.Release) {
            removeRipple(((PressInteraction.Release) pressInteraction).getPress());
        } else if (pressInteraction instanceof PressInteraction.Cancel) {
            removeRipple(((PressInteraction.Cancel) pressInteraction).getPress());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateStateLayer(Interaction interaction, InterfaceC6009v scope) {
        StateLayer stateLayer = this.stateLayer;
        if (stateLayer == null) {
            stateLayer = new StateLayer(this.bounded, this.rippleAlpha);
            DrawModifierNodeKt.invalidateDraw(this);
            this.stateLayer = stateLayer;
        }
        stateLayer.handleInteraction$material_ripple_release(interaction, scope);
    }

    /* renamed from: addRipple-12SF9DM */
    public abstract void mo8117addRipple12SF9DM(@NotNull PressInteraction.Press interaction, long size, float targetRadius);

    @Override // androidx.compose.p011ui.node.DrawModifierNode
    public void draw(@NotNull ContentDrawScope contentDrawScope) throws Throwable {
        contentDrawScope.drawContent();
        StateLayer stateLayer = this.stateLayer;
        if (stateLayer != null) {
            stateLayer.m8135drawStateLayermxwnekA(contentDrawScope, this.targetRadius, m8130getRippleColor0d7_KjU());
        }
        drawRipples(contentDrawScope);
    }

    public abstract void drawRipples(@NotNull DrawScope drawScope);

    public final boolean getBounded() {
        return this.bounded;
    }

    @NotNull
    public final InterfaceC6469a getRippleAlpha() {
        return this.rippleAlpha;
    }

    /* renamed from: getRippleColor-0d7_KjU, reason: not valid java name */
    public final long m8130getRippleColor0d7_KjU() {
        return this.color.mo8454invoke0d7_KjU();
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
        AbstractC6014x.m5651v(getCoroutineScope(), null, null, new C15091(null), 3);
    }

    @Override // androidx.compose.p011ui.node.LayoutAwareModifierNode
    /* renamed from: onRemeasured-ozmzZPI */
    public void mo6891onRemeasuredozmzZPI(long size) {
        this.hasValidSize = true;
        Density densityRequireDensity = DelegatableNodeKt.requireDensity(this);
        this.rippleSize = IntSizeKt.m13488toSizeozmzZPI(size);
        this.targetRadius = Float.isNaN(this.radius) ? RippleAnimationKt.m8123getRippleEndRadiuscSwnlzA(densityRequireDensity, this.bounded, this.rippleSize) : densityRequireDensity.mo6903toPx0680j_4(this.radius);
        MutableObjectList<PressInteraction> mutableObjectList = this.pendingInteractions;
        Object[] objArr = mutableObjectList.content;
        int i = mutableObjectList._size;
        for (int i8 = 0; i8 < i; i8++) {
            handlePressInteraction((PressInteraction) objArr[i8]);
        }
        this.pendingInteractions.clear();
    }

    public abstract void removeRipple(@NotNull PressInteraction.Press interaction);

    public final void setTargetRadius(float f) {
        this.targetRadius = f;
    }

    private RippleNode(InteractionSource interactionSource, boolean z8, float f, ColorProducer colorProducer, InterfaceC6469a interfaceC6469a) {
        this.interactionSource = interactionSource;
        this.bounded = z8;
        this.radius = f;
        this.color = colorProducer;
        this.rippleAlpha = interfaceC6469a;
        this.rippleSize = Size.INSTANCE.m10519getZeroNHjbRc();
        this.pendingInteractions = new MutableObjectList<>(0, 1, null);
    }
}
