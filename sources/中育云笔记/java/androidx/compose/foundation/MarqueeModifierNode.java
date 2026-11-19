package androidx.compose.foundation;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.p014ui.Modifier;
import androidx.compose.p014ui.focus.FocusEventModifierNode;
import androidx.compose.p014ui.focus.FocusState;
import androidx.compose.p014ui.graphics.ClipOp;
import androidx.compose.p014ui.graphics.GraphicsContext;
import androidx.compose.p014ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.p014ui.graphics.drawscope.DrawContext;
import androidx.compose.p014ui.graphics.drawscope.DrawScope;
import androidx.compose.p014ui.graphics.layer.GraphicsLayer;
import androidx.compose.p014ui.graphics.layer.GraphicsLayerKt;
import androidx.compose.p014ui.layout.IntrinsicMeasurable;
import androidx.compose.p014ui.layout.IntrinsicMeasureScope;
import androidx.compose.p014ui.layout.Measurable;
import androidx.compose.p014ui.layout.MeasureResult;
import androidx.compose.p014ui.layout.MeasureScope;
import androidx.compose.p014ui.layout.Placeable;
import androidx.compose.p014ui.node.DelegatableNodeKt;
import androidx.compose.p014ui.node.DrawModifierNode;
import androidx.compose.p014ui.node.LayoutModifierNode;
import androidx.compose.p014ui.unit.C3186Dp;
import androidx.compose.p014ui.unit.Constraints;
import androidx.compose.p014ui.unit.ConstraintsKt;
import androidx.compose.p014ui.unit.IntSize;
import androidx.compose.p014ui.unit.LayoutDirection;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotIntStateKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import kotlin.AbstractC9924b;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC9972n;
import kotlinx.coroutines.InterfaceC10045g;
import p181hd.InterfaceC9529a;
import p181hd.InterfaceC9540l;
import p181hd.InterfaceC9544p;
import p211jd.AbstractC9719c;
import p309qc.C10786q;
import p379vd.AbstractC11596e;
import p379vd.InterfaceC11594c;
import p393wc.AbstractC11725a;
import p409xc.InterfaceC11829d;
import sd.AbstractC11109f;
import sd.AbstractC11117h;
import sd.InterfaceC11122i0;
import vc.InterfaceC11588c;

/* loaded from: classes.dex */
final class MarqueeModifierNode extends Modifier.Node implements LayoutModifierNode, DrawModifierNode, FocusEventModifierNode {
    private InterfaceC10045g animationJob;
    private final MutableState animationMode$delegate;
    private final MutableIntState containerWidth$delegate;
    private final MutableIntState contentWidth$delegate;
    private int delayMillis;
    private final MutableState hasFocus$delegate;
    private int initialDelayMillis;
    private int iterations;
    private GraphicsLayer marqueeLayer;
    private final Animatable<Float, AnimationVector1D> offset;
    private final MutableState spacing$delegate;
    private final State spacingPx$delegate;
    private float velocity;

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[LayoutDirection.values().length];
            try {
                iArr[LayoutDirection.Ltr.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LayoutDirection.Rtl.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @InterfaceC11829d(m26210c = "androidx.compose.foundation.MarqueeModifierNode$restartAnimation$1", m26211f = "BasicMarquee.kt", m26212l = {379, 380}, m26213m = "invokeSuspend")
    /* renamed from: androidx.compose.foundation.MarqueeModifierNode$restartAnimation$1 */
    public static final class C12181 extends SuspendLambda implements InterfaceC9544p {
        final /* synthetic */ InterfaceC10045g $oldJob;
        int label;
        final /* synthetic */ MarqueeModifierNode this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C12181(InterfaceC10045g interfaceC10045g, MarqueeModifierNode marqueeModifierNode, InterfaceC11588c<? super C12181> interfaceC11588c) {
            super(2, interfaceC11588c);
            this.$oldJob = interfaceC10045g;
            this.this$0 = marqueeModifierNode;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC11588c<C10786q> create(Object obj, InterfaceC11588c<?> interfaceC11588c) {
            return new C12181(this.$oldJob, this.this$0, interfaceC11588c);
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x0036, code lost:
        
            if (r5.runAnimation(r4) == r0) goto L17;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r5) throws java.lang.Throwable {
            /*
                r4 = this;
                java.lang.Object r0 = p393wc.AbstractC11725a.m25952f()
                int r1 = r4.label
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L1e
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                kotlin.AbstractC9924b.m20071b(r5)
                goto L39
            L12:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r0)
                throw r5
            L1a:
                kotlin.AbstractC9924b.m20071b(r5)
                goto L2e
            L1e:
                kotlin.AbstractC9924b.m20071b(r5)
                kotlinx.coroutines.g r5 = r4.$oldJob
                if (r5 == 0) goto L2e
                r4.label = r3
                java.lang.Object r5 = r5.mo20458v(r4)
                if (r5 != r0) goto L2e
                goto L38
            L2e:
                androidx.compose.foundation.MarqueeModifierNode r5 = r4.this$0
                r4.label = r2
                java.lang.Object r5 = androidx.compose.foundation.MarqueeModifierNode.access$runAnimation(r5, r4)
                if (r5 != r0) goto L39
            L38:
                return r0
            L39:
                qc.q r5 = p309qc.C10786q.f26013a
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.MarqueeModifierNode.C12181.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // p181hd.InterfaceC9544p
        public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c<? super C10786q> interfaceC11588c) {
            return ((C12181) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
        }
    }

    @InterfaceC11829d(m26210c = "androidx.compose.foundation.MarqueeModifierNode$runAnimation$2", m26211f = "BasicMarquee.kt", m26212l = {TypedValues.CycleType.TYPE_VISIBILITY}, m26213m = "invokeSuspend")
    /* renamed from: androidx.compose.foundation.MarqueeModifierNode$runAnimation$2 */
    public static final class C12192 extends SuspendLambda implements InterfaceC9544p {
        int label;

        @InterfaceC11829d(m26210c = "androidx.compose.foundation.MarqueeModifierNode$runAnimation$2$2", m26211f = "BasicMarquee.kt", m26212l = {416, 418, 422, 422}, m26213m = "invokeSuspend")
        /* renamed from: androidx.compose.foundation.MarqueeModifierNode$runAnimation$2$2, reason: invalid class name */
        public static final class AnonymousClass2 extends SuspendLambda implements InterfaceC9544p {
            /* synthetic */ Object L$0;
            Object L$1;
            int label;
            final /* synthetic */ MarqueeModifierNode this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(MarqueeModifierNode marqueeModifierNode, InterfaceC11588c<? super AnonymousClass2> interfaceC11588c) {
                super(2, interfaceC11588c);
                this.this$0 = marqueeModifierNode;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final InterfaceC11588c<C10786q> create(Object obj, InterfaceC11588c<?> interfaceC11588c) {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, interfaceC11588c);
                anonymousClass2.L$0 = obj;
                return anonymousClass2;
            }

            @Override // p181hd.InterfaceC9544p
            public final Object invoke(Float f10, InterfaceC11588c<? super C10786q> interfaceC11588c) {
                return ((AnonymousClass2) create(f10, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
            }

            /* JADX WARN: Code restructure failed: missing block: B:29:0x00bb, code lost:
            
                if (r0.snapTo(r1, r20) != r8) goto L31;
             */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r21) throws java.lang.Throwable {
                /*
                    r20 = this;
                    r5 = r20
                    java.lang.Object r8 = p393wc.AbstractC11725a.m25952f()
                    int r0 = r5.label
                    r9 = 4
                    r10 = 3
                    r1 = 2
                    r2 = 1
                    r11 = 0
                    r12 = 0
                    if (r0 == 0) goto L47
                    if (r0 == r2) goto L36
                    if (r0 == r1) goto L2e
                    if (r0 == r10) goto L29
                    if (r0 == r9) goto L20
                    java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                    java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
                    r0.<init>(r1)
                    throw r0
                L20:
                    java.lang.Object r0 = r5.L$0
                    java.lang.Throwable r0 = (java.lang.Throwable) r0
                    kotlin.AbstractC9924b.m20071b(r21)
                    goto Ld8
                L29:
                    kotlin.AbstractC9924b.m20071b(r21)
                    goto Lbe
                L2e:
                    kotlin.AbstractC9924b.m20071b(r21)     // Catch: java.lang.Throwable -> L33
                    goto Lab
                L33:
                    r0 = move-exception
                    goto Lc1
                L36:
                    java.lang.Object r0 = r5.L$1
                    androidx.compose.animation.core.AnimationSpec r0 = (androidx.compose.animation.core.AnimationSpec) r0
                    java.lang.Object r2 = r5.L$0
                    java.lang.Float r2 = (java.lang.Float) r2
                    kotlin.AbstractC9924b.m20071b(r21)
                    r19 = r2
                    r2 = r0
                    r0 = r19
                    goto L91
                L47:
                    kotlin.AbstractC9924b.m20071b(r21)
                    java.lang.Object r0 = r5.L$0
                    java.lang.Float r0 = (java.lang.Float) r0
                    if (r0 != 0) goto L53
                    qc.q r0 = p309qc.C10786q.f26013a
                    return r0
                L53:
                    androidx.compose.foundation.MarqueeModifierNode r3 = r5.this$0
                    int r13 = androidx.compose.foundation.MarqueeModifierNode.access$getIterations$p(r3)
                    float r14 = r0.floatValue()
                    androidx.compose.foundation.MarqueeModifierNode r3 = r5.this$0
                    int r15 = androidx.compose.foundation.MarqueeModifierNode.access$getInitialDelayMillis$p(r3)
                    androidx.compose.foundation.MarqueeModifierNode r3 = r5.this$0
                    int r16 = androidx.compose.foundation.MarqueeModifierNode.access$getDelayMillis$p(r3)
                    androidx.compose.foundation.MarqueeModifierNode r3 = r5.this$0
                    float r17 = androidx.compose.foundation.MarqueeModifierNode.access$getVelocity$p(r3)
                    androidx.compose.foundation.MarqueeModifierNode r3 = r5.this$0
                    androidx.compose.ui.unit.Density r18 = androidx.compose.p014ui.node.DelegatableNodeKt.requireDensity(r3)
                    androidx.compose.animation.core.AnimationSpec r3 = androidx.compose.foundation.BasicMarqueeKt.m26955access$createMarqueeAnimationSpecZ4HSEVQ(r13, r14, r15, r16, r17, r18)
                    androidx.compose.foundation.MarqueeModifierNode r4 = r5.this$0
                    androidx.compose.animation.core.Animatable r4 = androidx.compose.foundation.MarqueeModifierNode.access$getOffset$p(r4)
                    java.lang.Float r6 = p409xc.AbstractC11826a.m26207b(r12)
                    r5.L$0 = r0
                    r5.L$1 = r3
                    r5.label = r2
                    java.lang.Object r2 = r4.snapTo(r6, r5)
                    if (r2 != r8) goto L90
                    goto Ld7
                L90:
                    r2 = r3
                L91:
                    androidx.compose.foundation.MarqueeModifierNode r3 = r5.this$0     // Catch: java.lang.Throwable -> L33
                    androidx.compose.animation.core.Animatable r3 = androidx.compose.foundation.MarqueeModifierNode.access$getOffset$p(r3)     // Catch: java.lang.Throwable -> L33
                    r5.L$0 = r11     // Catch: java.lang.Throwable -> L33
                    r5.L$1 = r11     // Catch: java.lang.Throwable -> L33
                    r5.label = r1     // Catch: java.lang.Throwable -> L33
                    r1 = r0
                    r0 = r3
                    r3 = 0
                    r4 = 0
                    r6 = 12
                    r7 = 0
                    java.lang.Object r0 = androidx.compose.animation.core.Animatable.animateTo$default(r0, r1, r2, r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L33
                    if (r0 != r8) goto Lab
                    goto Ld7
                Lab:
                    androidx.compose.foundation.MarqueeModifierNode r0 = r5.this$0
                    androidx.compose.animation.core.Animatable r0 = androidx.compose.foundation.MarqueeModifierNode.access$getOffset$p(r0)
                    java.lang.Float r1 = p409xc.AbstractC11826a.m26207b(r12)
                    r5.label = r10
                    java.lang.Object r0 = r0.snapTo(r1, r5)
                    if (r0 != r8) goto Lbe
                    goto Ld7
                Lbe:
                    qc.q r0 = p309qc.C10786q.f26013a
                    return r0
                Lc1:
                    androidx.compose.foundation.MarqueeModifierNode r1 = r5.this$0
                    androidx.compose.animation.core.Animatable r1 = androidx.compose.foundation.MarqueeModifierNode.access$getOffset$p(r1)
                    java.lang.Float r2 = p409xc.AbstractC11826a.m26207b(r12)
                    r5.L$0 = r0
                    r5.L$1 = r11
                    r5.label = r9
                    java.lang.Object r1 = r1.snapTo(r2, r5)
                    if (r1 != r8) goto Ld8
                Ld7:
                    return r8
                Ld8:
                    throw r0
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.MarqueeModifierNode.C12192.AnonymousClass2.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        public C12192(InterfaceC11588c<? super C12192> interfaceC11588c) {
            super(2, interfaceC11588c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC11588c<C10786q> create(Object obj, InterfaceC11588c<?> interfaceC11588c) {
            return MarqueeModifierNode.this.new C12192(interfaceC11588c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM25952f = AbstractC11725a.m25952f();
            int i10 = this.label;
            if (i10 == 0) {
                AbstractC9924b.m20071b(obj);
                final MarqueeModifierNode marqueeModifierNode = MarqueeModifierNode.this;
                InterfaceC11594c interfaceC11594cSnapshotFlow = SnapshotStateKt.snapshotFlow(new InterfaceC9529a() { // from class: androidx.compose.foundation.MarqueeModifierNode.runAnimation.2.1
                    {
                        super(0);
                    }

                    @Override // p181hd.InterfaceC9529a
                    public final Float invoke() {
                        if (marqueeModifierNode.getContentWidth() <= marqueeModifierNode.getContainerWidth()) {
                            return null;
                        }
                        if (!MarqueeAnimationMode.m27029equalsimpl0(marqueeModifierNode.m27040getAnimationModeZbEOnfQ(), MarqueeAnimationMode.Companion.m27034getWhileFocusedZbEOnfQ()) || marqueeModifierNode.getHasFocus()) {
                            return Float.valueOf(marqueeModifierNode.getContentWidth() + marqueeModifierNode.getSpacingPx());
                        }
                        return null;
                    }
                });
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(MarqueeModifierNode.this, null);
                this.label = 1;
                if (AbstractC11596e.m25559i(interfaceC11594cSnapshotFlow, anonymousClass2, this) == objM25952f) {
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
            return ((C12192) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
        }
    }

    public /* synthetic */ MarqueeModifierNode(int i10, int i11, int i12, int i13, MarqueeSpacing marqueeSpacing, float f10, AbstractC9972n abstractC9972n) {
        this(i10, i11, i12, i13, marqueeSpacing, f10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int getContainerWidth() {
        return this.containerWidth$delegate.getIntValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int getContentWidth() {
        return this.contentWidth$delegate.getIntValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final float getDirection() {
        float fSignum = Math.signum(this.velocity);
        int i10 = WhenMappings.$EnumSwitchMapping$0[DelegatableNodeKt.requireLayoutDirection(this).ordinal()];
        int i11 = 1;
        if (i10 != 1) {
            if (i10 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            i11 = -1;
        }
        return fSignum * i11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final boolean getHasFocus() {
        return ((Boolean) this.hasFocus$delegate.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int getSpacingPx() {
        return ((Number) this.spacingPx$delegate.getValue()).intValue();
    }

    private final void restartAnimation() {
        InterfaceC10045g interfaceC10045g = this.animationJob;
        if (interfaceC10045g != null) {
            InterfaceC10045g.a.m20900a(interfaceC10045g, null, 1, null);
        }
        if (isAttached()) {
            this.animationJob = AbstractC11117h.m24726d(getCoroutineScope(), null, null, new C12181(interfaceC10045g, this, null), 3, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object runAnimation(InterfaceC11588c<? super C10786q> interfaceC11588c) {
        if (this.iterations <= 0) {
            return C10786q.f26013a;
        }
        Object objM24709g = AbstractC11109f.m24709g(FixedMotionDurationScale.INSTANCE, new C12192(null), interfaceC11588c);
        return objM24709g == AbstractC11725a.m25952f() ? objM24709g : C10786q.f26013a;
    }

    private final void setContainerWidth(int i10) {
        this.containerWidth$delegate.setIntValue(i10);
    }

    private final void setContentWidth(int i10) {
        this.contentWidth$delegate.setIntValue(i10);
    }

    private final void setHasFocus(boolean z10) {
        this.hasFocus$delegate.setValue(Boolean.valueOf(z10));
    }

    @Override // androidx.compose.p014ui.node.DrawModifierNode
    public void draw(final ContentDrawScope contentDrawScope) {
        float fFloatValue = this.offset.getValue().floatValue() * getDirection();
        boolean z10 = getDirection() != 1.0f ? this.offset.getValue().floatValue() < ((float) getContainerWidth()) : this.offset.getValue().floatValue() < ((float) getContentWidth());
        boolean z11 = getDirection() != 1.0f ? this.offset.getValue().floatValue() > ((float) getSpacingPx()) : this.offset.getValue().floatValue() > ((float) ((getContentWidth() + getSpacingPx()) - getContainerWidth()));
        float contentWidth = getDirection() == 1.0f ? getContentWidth() + getSpacingPx() : (-getContentWidth()) - getSpacingPx();
        float fIntBitsToFloat = Float.intBitsToFloat((int) (contentDrawScope.mo31429getSizeNHjbRc() & 4294967295L));
        GraphicsLayer graphicsLayer = this.marqueeLayer;
        if (graphicsLayer != null) {
            contentDrawScope.mo31430recordJVtK1S4(graphicsLayer, IntSize.m33667constructorimpl((getContentWidth() << 32) | (AbstractC9719c.m19282d(fIntBitsToFloat) & 4294967295L)), new InterfaceC9540l() { // from class: androidx.compose.foundation.MarqueeModifierNode$draw$1$1
                {
                    super(1);
                }

                @Override // p181hd.InterfaceC9540l
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((DrawScope) obj);
                    return C10786q.f26013a;
                }

                public final void invoke(DrawScope drawScope) {
                    contentDrawScope.drawContent();
                }
            });
        }
        float containerWidth = fFloatValue + getContainerWidth();
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (4294967295L & contentDrawScope.mo31429getSizeNHjbRc()));
        int iM30867getIntersectrtfAjoo = ClipOp.Companion.m30867getIntersectrtfAjoo();
        DrawContext drawContext = contentDrawScope.getDrawContext();
        long jMo31350getSizeNHjbRc = drawContext.mo31350getSizeNHjbRc();
        drawContext.getCanvas().save();
        try {
            drawContext.getTransform().mo31353clipRectN_I0leg(fFloatValue, 0.0f, containerWidth, fIntBitsToFloat2, iM30867getIntersectrtfAjoo);
            GraphicsLayer graphicsLayer2 = this.marqueeLayer;
            if (graphicsLayer2 != null) {
                if (z10) {
                    GraphicsLayerKt.drawLayer(contentDrawScope, graphicsLayer2);
                }
                if (z11) {
                    contentDrawScope.getDrawContext().getTransform().translate(contentWidth, 0.0f);
                    try {
                        GraphicsLayerKt.drawLayer(contentDrawScope, graphicsLayer2);
                        contentDrawScope.getDrawContext().getTransform().translate(-contentWidth, -0.0f);
                    } finally {
                    }
                }
            } else {
                if (z10) {
                    contentDrawScope.drawContent();
                }
                if (z11) {
                    contentDrawScope.getDrawContext().getTransform().translate(contentWidth, 0.0f);
                    try {
                        contentDrawScope.drawContent();
                        contentDrawScope.getDrawContext().getTransform().translate(-contentWidth, -0.0f);
                    } finally {
                    }
                }
            }
            drawContext.getCanvas().restore();
            drawContext.mo31351setSizeuvyYCjk(jMo31350getSizeNHjbRc);
        } catch (Throwable th) {
            drawContext.getCanvas().restore();
            drawContext.mo31351setSizeuvyYCjk(jMo31350getSizeNHjbRc);
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: getAnimationMode-ZbEOnfQ, reason: not valid java name */
    public final int m27040getAnimationModeZbEOnfQ() {
        return ((MarqueeAnimationMode) this.animationMode$delegate.getValue()).m27032unboximpl();
    }

    public final MarqueeSpacing getSpacing() {
        return (MarqueeSpacing) this.spacing$delegate.getValue();
    }

    @Override // androidx.compose.p014ui.node.LayoutModifierNode
    public int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i10) {
        return intrinsicMeasurable.maxIntrinsicHeight(Integer.MAX_VALUE);
    }

    @Override // androidx.compose.p014ui.node.LayoutModifierNode
    public int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i10) {
        return intrinsicMeasurable.maxIntrinsicWidth(i10);
    }

    @Override // androidx.compose.p014ui.node.LayoutModifierNode
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo26769measure3p2s80s(MeasureScope measureScope, Measurable measurable, long j10) {
        final Placeable placeableMo32229measureBRTryo0 = measurable.mo32229measureBRTryo0(Constraints.m33444copyZbe2FdA$default(j10, 0, Integer.MAX_VALUE, 0, 0, 13, null));
        setContainerWidth(ConstraintsKt.m33471constrainWidthK40F9xA(j10, placeableMo32229measureBRTryo0.getWidth()));
        setContentWidth(placeableMo32229measureBRTryo0.getWidth());
        return MeasureScope.layout$default(measureScope, getContainerWidth(), placeableMo32229measureBRTryo0.getHeight(), null, new InterfaceC9540l() { // from class: androidx.compose.foundation.MarqueeModifierNode$measure$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p181hd.InterfaceC9540l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Placeable.PlacementScope) obj);
                return C10786q.f26013a;
            }

            public final void invoke(Placeable.PlacementScope placementScope) {
                Placeable.PlacementScope.placeWithLayer$default(placementScope, placeableMo32229measureBRTryo0, AbstractC9719c.m19282d((-((Number) this.offset.getValue()).floatValue()) * this.getDirection()), 0, 0.0f, (InterfaceC9540l) null, 12, (Object) null);
            }
        }, 4, null);
    }

    @Override // androidx.compose.p014ui.node.LayoutModifierNode
    public int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i10) {
        return intrinsicMeasurable.minIntrinsicHeight(Integer.MAX_VALUE);
    }

    @Override // androidx.compose.p014ui.node.LayoutModifierNode
    public int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i10) {
        return 0;
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onAttach() {
        GraphicsLayer graphicsLayer = this.marqueeLayer;
        GraphicsContext graphicsContextRequireGraphicsContext = DelegatableNodeKt.requireGraphicsContext(this);
        if (graphicsLayer != null) {
            graphicsContextRequireGraphicsContext.releaseGraphicsLayer(graphicsLayer);
        }
        this.marqueeLayer = graphicsContextRequireGraphicsContext.createGraphicsLayer();
        restartAnimation();
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onDetach() {
        InterfaceC10045g interfaceC10045g = this.animationJob;
        if (interfaceC10045g != null) {
            InterfaceC10045g.a.m20900a(interfaceC10045g, null, 1, null);
        }
        this.animationJob = null;
        GraphicsLayer graphicsLayer = this.marqueeLayer;
        if (graphicsLayer != null) {
            DelegatableNodeKt.requireGraphicsContext(this).releaseGraphicsLayer(graphicsLayer);
            this.marqueeLayer = null;
        }
    }

    @Override // androidx.compose.p014ui.focus.FocusEventModifierNode
    public void onFocusEvent(FocusState focusState) {
        setHasFocus(focusState.getHasFocus());
    }

    /* renamed from: setAnimationMode-97h66l8, reason: not valid java name */
    public final void m27041setAnimationMode97h66l8(int i10) {
        this.animationMode$delegate.setValue(MarqueeAnimationMode.m27026boximpl(i10));
    }

    public final void setSpacing(MarqueeSpacing marqueeSpacing) {
        this.spacing$delegate.setValue(marqueeSpacing);
    }

    /* renamed from: update-lWfNwf4, reason: not valid java name */
    public final void m27042updatelWfNwf4(int i10, int i11, int i12, int i13, MarqueeSpacing marqueeSpacing, float f10) {
        setSpacing(marqueeSpacing);
        m27041setAnimationMode97h66l8(i11);
        if (this.iterations == i10 && this.delayMillis == i12 && this.initialDelayMillis == i13 && C3186Dp.m33506equalsimpl0(this.velocity, f10)) {
            return;
        }
        this.iterations = i10;
        this.delayMillis = i12;
        this.initialDelayMillis = i13;
        this.velocity = f10;
        restartAnimation();
    }

    private MarqueeModifierNode(int i10, int i11, int i12, int i13, final MarqueeSpacing marqueeSpacing, float f10) {
        this.iterations = i10;
        this.delayMillis = i12;
        this.initialDelayMillis = i13;
        this.velocity = f10;
        this.contentWidth$delegate = SnapshotIntStateKt.mutableIntStateOf(0);
        this.containerWidth$delegate = SnapshotIntStateKt.mutableIntStateOf(0);
        this.hasFocus$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
        this.spacing$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(marqueeSpacing, null, 2, null);
        this.animationMode$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(MarqueeAnimationMode.m27026boximpl(i11), null, 2, null);
        this.offset = AnimatableKt.Animatable$default(0.0f, 0.0f, 2, null);
        this.spacingPx$delegate = SnapshotStateKt.derivedStateOf(new InterfaceC9529a() { // from class: androidx.compose.foundation.MarqueeModifierNode$spacingPx$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // p181hd.InterfaceC9529a
            public final Integer invoke() {
                MarqueeSpacing marqueeSpacing2 = marqueeSpacing;
                MarqueeModifierNode marqueeModifierNode = this;
                return Integer.valueOf(marqueeSpacing2.calculateSpacing(DelegatableNodeKt.requireDensity(marqueeModifierNode), marqueeModifierNode.getContentWidth(), marqueeModifierNode.getContainerWidth()));
            }
        });
    }
}
