package androidx.compose.material.ripple;

import androidx.collection.MutableObjectList;
import androidx.compose.foundation.interaction.Interaction;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.foundation.interaction.PressInteraction;
import androidx.compose.p014ui.Modifier;
import androidx.compose.p014ui.geometry.Size;
import androidx.compose.p014ui.graphics.ColorProducer;
import androidx.compose.p014ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.p014ui.graphics.drawscope.DrawScope;
import androidx.compose.p014ui.node.CompositionLocalConsumerModifierNode;
import androidx.compose.p014ui.node.DelegatableNodeKt;
import androidx.compose.p014ui.node.DrawModifierNode;
import androidx.compose.p014ui.node.DrawModifierNodeKt;
import androidx.compose.p014ui.node.LayoutAwareModifierNode;
import androidx.compose.p014ui.unit.Density;
import androidx.compose.p014ui.unit.IntSizeKt;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.AbstractC9924b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC9972n;
import p181hd.InterfaceC9529a;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import p379vd.InterfaceC11594c;
import p379vd.InterfaceC11595d;
import p393wc.AbstractC11725a;
import p409xc.InterfaceC11829d;
import sd.AbstractC11117h;
import sd.InterfaceC11122i0;
import vc.InterfaceC11588c;

@StabilityInferred(parameters = 0)
/* loaded from: classes2.dex */
public abstract class RippleNode extends Modifier.Node implements CompositionLocalConsumerModifierNode, DrawModifierNode, LayoutAwareModifierNode {
    public static final int $stable = 8;
    private final boolean bounded;
    private final ColorProducer color;
    private boolean hasValidSize;
    private final InteractionSource interactionSource;
    private final MutableObjectList<PressInteraction> pendingInteractions;
    private final float radius;
    private final InterfaceC9529a rippleAlpha;
    private long rippleSize;
    private final boolean shouldAutoInvalidate;
    private StateLayer stateLayer;
    private float targetRadius;

    @InterfaceC11829d(m26210c = "androidx.compose.material.ripple.RippleNode$onAttach$1", m26211f = "Ripple.kt", m26212l = {364}, m26213m = "invokeSuspend")
    /* renamed from: androidx.compose.material.ripple.RippleNode$onAttach$1 */
    public static final class C20281 extends SuspendLambda implements InterfaceC9544p {
        private /* synthetic */ Object L$0;
        int label;

        public C20281(InterfaceC11588c<? super C20281> interfaceC11588c) {
            super(2, interfaceC11588c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC11588c<C10786q> create(Object obj, InterfaceC11588c<?> interfaceC11588c) {
            C20281 c20281 = RippleNode.this.new C20281(interfaceC11588c);
            c20281.L$0 = obj;
            return c20281;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM25952f = AbstractC11725a.m25952f();
            int i10 = this.label;
            if (i10 == 0) {
                AbstractC9924b.m20071b(obj);
                final InterfaceC11122i0 interfaceC11122i0 = (InterfaceC11122i0) this.L$0;
                InterfaceC11594c interactions = RippleNode.this.interactionSource.getInteractions();
                final RippleNode rippleNode = RippleNode.this;
                InterfaceC11595d interfaceC11595d = new InterfaceC11595d() { // from class: androidx.compose.material.ripple.RippleNode.onAttach.1.1
                    @Override // p379vd.InterfaceC11595d
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, InterfaceC11588c interfaceC11588c) {
                        return emit((Interaction) obj2, (InterfaceC11588c<? super C10786q>) interfaceC11588c);
                    }

                    public final Object emit(Interaction interaction, InterfaceC11588c<? super C10786q> interfaceC11588c) {
                        if (!(interaction instanceof PressInteraction)) {
                            rippleNode.updateStateLayer(interaction, interfaceC11122i0);
                        } else if (rippleNode.hasValidSize) {
                            rippleNode.handlePressInteraction((PressInteraction) interaction);
                        } else {
                            rippleNode.pendingInteractions.add(interaction);
                        }
                        return C10786q.f26013a;
                    }
                };
                this.label = 1;
                if (interactions.collect(interfaceC11595d, this) == objM25952f) {
                    return objM25952f;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9924b.m20071b(obj);
            }
            return C10786q.f26013a;
        }

        @Override // p181hd.InterfaceC9544p
        public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c<? super C10786q> interfaceC11588c) {
            return ((C20281) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
        }
    }

    public /* synthetic */ RippleNode(InteractionSource interactionSource, boolean z10, float f10, ColorProducer colorProducer, InterfaceC9529a interfaceC9529a, AbstractC9972n abstractC9972n) {
        this(interactionSource, z10, f10, colorProducer, interfaceC9529a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handlePressInteraction(PressInteraction pressInteraction) {
        if (pressInteraction instanceof PressInteraction.Press) {
            mo28313addRipple12SF9DM((PressInteraction.Press) pressInteraction, this.rippleSize, this.targetRadius);
        } else if (pressInteraction instanceof PressInteraction.Release) {
            removeRipple(((PressInteraction.Release) pressInteraction).getPress());
        } else if (pressInteraction instanceof PressInteraction.Cancel) {
            removeRipple(((PressInteraction.Cancel) pressInteraction).getPress());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateStateLayer(Interaction interaction, InterfaceC11122i0 interfaceC11122i0) {
        StateLayer stateLayer = this.stateLayer;
        if (stateLayer == null) {
            stateLayer = new StateLayer(this.bounded, this.rippleAlpha);
            DrawModifierNodeKt.invalidateDraw(this);
            this.stateLayer = stateLayer;
        }
        stateLayer.handleInteraction$material_ripple_release(interaction, interfaceC11122i0);
    }

    /* renamed from: addRipple-12SF9DM */
    public abstract void mo28313addRipple12SF9DM(PressInteraction.Press press, long j10, float f10);

    @Override // androidx.compose.p014ui.node.DrawModifierNode
    public void draw(ContentDrawScope contentDrawScope) throws Throwable {
        contentDrawScope.drawContent();
        StateLayer stateLayer = this.stateLayer;
        if (stateLayer != null) {
            stateLayer.m28331drawStateLayermxwnekA(contentDrawScope, this.targetRadius, m28326getRippleColor0d7_KjU());
        }
        drawRipples(contentDrawScope);
    }

    public abstract void drawRipples(DrawScope drawScope);

    public final boolean getBounded() {
        return this.bounded;
    }

    public final InterfaceC9529a getRippleAlpha() {
        return this.rippleAlpha;
    }

    /* renamed from: getRippleColor-0d7_KjU, reason: not valid java name */
    public final long m28326getRippleColor0d7_KjU() {
        return this.color.mo28650invoke0d7_KjU();
    }

    /* renamed from: getRippleSize-NH-jbRc, reason: not valid java name */
    public final long m28327getRippleSizeNHjbRc() {
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
        AbstractC11117h.m24726d(getCoroutineScope(), null, null, new C20281(null), 3, null);
    }

    @Override // androidx.compose.p014ui.node.LayoutAwareModifierNode
    /* renamed from: onRemeasured-ozmzZPI */
    public void mo27087onRemeasuredozmzZPI(long j10) {
        this.hasValidSize = true;
        Density densityRequireDensity = DelegatableNodeKt.requireDensity(this);
        this.rippleSize = IntSizeKt.m33684toSizeozmzZPI(j10);
        this.targetRadius = Float.isNaN(this.radius) ? RippleAnimationKt.m28319getRippleEndRadiuscSwnlzA(densityRequireDensity, this.bounded, this.rippleSize) : densityRequireDensity.mo27099toPx0680j_4(this.radius);
        MutableObjectList<PressInteraction> mutableObjectList = this.pendingInteractions;
        Object[] objArr = mutableObjectList.content;
        int i10 = mutableObjectList._size;
        for (int i11 = 0; i11 < i10; i11++) {
            handlePressInteraction((PressInteraction) objArr[i11]);
        }
        this.pendingInteractions.clear();
    }

    public abstract void removeRipple(PressInteraction.Press press);

    public final void setTargetRadius(float f10) {
        this.targetRadius = f10;
    }

    private RippleNode(InteractionSource interactionSource, boolean z10, float f10, ColorProducer colorProducer, InterfaceC9529a interfaceC9529a) {
        this.interactionSource = interactionSource;
        this.bounded = z10;
        this.radius = f10;
        this.color = colorProducer;
        this.rippleAlpha = interfaceC9529a;
        this.rippleSize = Size.Companion.m30715getZeroNHjbRc();
        this.pendingInteractions = new MutableObjectList<>(0, 1, null);
    }
}
