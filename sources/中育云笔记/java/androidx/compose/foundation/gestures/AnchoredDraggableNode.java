package androidx.compose.foundation.gestures;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.foundation.OverscrollEffect;
import androidx.compose.foundation.gestures.DragEvent;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.p014ui.geometry.Offset;
import androidx.compose.p014ui.input.nestedscroll.NestedScrollSource;
import androidx.compose.p014ui.node.DelegatableNodeKt;
import androidx.compose.p014ui.unit.Density;
import androidx.compose.p014ui.unit.LayoutDirection;
import androidx.compose.p014ui.unit.Velocity;
import androidx.compose.p014ui.unit.VelocityKt;
import kotlin.AbstractC9924b;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC9979u;
import kotlin.jvm.internal.Ref$FloatRef;
import p181hd.InterfaceC9540l;
import p181hd.InterfaceC9544p;
import p181hd.InterfaceC9545q;
import p309qc.C10786q;
import p393wc.AbstractC11725a;
import p409xc.InterfaceC11829d;
import sd.AbstractC11117h;
import vc.InterfaceC11588c;

/* loaded from: classes.dex */
final class AnchoredDraggableNode<T> extends DragGestureNode {
    private Density density;
    private FlingBehavior flingBehavior;
    private Orientation orientation;
    private OverscrollEffect overscrollEffect;
    public FlingBehavior resolvedFlingBehavior;
    private Boolean reverseDirection;
    private Boolean startDragImmediately;
    private AnchoredDraggableState<T> state;

    @InterfaceC11829d(m26210c = "androidx.compose.foundation.gestures.AnchoredDraggableNode$drag$2", m26211f = "AnchoredDraggable.kt", m26212l = {408}, m26213m = "invokeSuspend")
    /* renamed from: androidx.compose.foundation.gestures.AnchoredDraggableNode$drag$2 */
    public static final class C12702 extends SuspendLambda implements InterfaceC9545q {
        final /* synthetic */ InterfaceC9544p $forEachDelta;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ AnchoredDraggableNode<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C12702(InterfaceC9544p interfaceC9544p, AnchoredDraggableNode<T> anchoredDraggableNode, InterfaceC11588c<? super C12702> interfaceC11588c) {
            super(3, interfaceC11588c);
            this.$forEachDelta = interfaceC9544p;
            this.this$0 = anchoredDraggableNode;
        }

        @Override // p181hd.InterfaceC9545q
        public final Object invoke(AnchoredDragScope anchoredDragScope, DraggableAnchors<T> draggableAnchors, InterfaceC11588c<? super C10786q> interfaceC11588c) {
            C12702 c12702 = new C12702(this.$forEachDelta, this.this$0, interfaceC11588c);
            c12702.L$0 = anchoredDragScope;
            return c12702.invokeSuspend(C10786q.f26013a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM25952f = AbstractC11725a.m25952f();
            int i10 = this.label;
            if (i10 == 0) {
                AbstractC9924b.m20071b(obj);
                final AnchoredDragScope anchoredDragScope = (AnchoredDragScope) this.L$0;
                InterfaceC9544p interfaceC9544p = this.$forEachDelta;
                final AnchoredDraggableNode<T> anchoredDraggableNode = this.this$0;
                InterfaceC9540l interfaceC9540l = new InterfaceC9540l() { // from class: androidx.compose.foundation.gestures.AnchoredDraggableNode.drag.2.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // p181hd.InterfaceC9540l
                    public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                        invoke((DragEvent.DragDelta) obj2);
                        return C10786q.f26013a;
                    }

                    public final void invoke(DragEvent.DragDelta dragDelta) {
                        AnchoredDraggableNode<T> anchoredDraggableNode2 = anchoredDraggableNode;
                        float fM27114toFloatk4lQ0M = anchoredDraggableNode2.m27114toFloatk4lQ0M(anchoredDraggableNode2.m27112reverseIfNeededMKHz9U(dragDelta.m27137getDeltaF1C5BW0()));
                        if (((AnchoredDraggableNode) anchoredDraggableNode).overscrollEffect == null) {
                            AnchoredDragScope.dragTo$default(anchoredDragScope, ((AnchoredDraggableNode) anchoredDraggableNode).state.newOffsetForDelta$foundation_release(fM27114toFloatk4lQ0M), 0.0f, 2, null);
                            return;
                        }
                        OverscrollEffect overscrollEffect = ((AnchoredDraggableNode) anchoredDraggableNode).overscrollEffect;
                        AbstractC9979u.m20291d(overscrollEffect);
                        long jM27115toOffsettuRUvjQ = anchoredDraggableNode.m27115toOffsettuRUvjQ(fM27114toFloatk4lQ0M);
                        int iM31996getUserInputWNlRxjI = NestedScrollSource.Companion.m31996getUserInputWNlRxjI();
                        final AnchoredDraggableNode<T> anchoredDraggableNode3 = anchoredDraggableNode;
                        final AnchoredDragScope anchoredDragScope2 = anchoredDragScope;
                        overscrollEffect.mo26929applyToScrollRhakbz0(jM27115toOffsettuRUvjQ, iM31996getUserInputWNlRxjI, new InterfaceC9540l() { // from class: androidx.compose.foundation.gestures.AnchoredDraggableNode.drag.2.1.1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // p181hd.InterfaceC9540l
                            public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                                return Offset.m30626boximpl(m27119invokeMKHz9U(((Offset) obj2).m30647unboximpl()));
                            }

                            /* renamed from: invoke-MK-Hz9U, reason: not valid java name */
                            public final long m27119invokeMKHz9U(long j10) {
                                float fNewOffsetForDelta$foundation_release = ((AnchoredDraggableNode) anchoredDraggableNode3).state.newOffsetForDelta$foundation_release(anchoredDraggableNode3.m27114toFloatk4lQ0M(j10));
                                AnchoredDraggableNode<T> anchoredDraggableNode4 = anchoredDraggableNode3;
                                long jM27115toOffsettuRUvjQ2 = anchoredDraggableNode4.m27115toOffsettuRUvjQ(fNewOffsetForDelta$foundation_release - ((AnchoredDraggableNode) anchoredDraggableNode4).state.requireOffset());
                                AnchoredDragScope.dragTo$default(anchoredDragScope2, fNewOffsetForDelta$foundation_release, 0.0f, 2, null);
                                return jM27115toOffsettuRUvjQ2;
                            }
                        });
                    }
                };
                this.label = 1;
                if (interfaceC9544p.invoke(interfaceC9540l, this) == objM25952f) {
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
    }

    @InterfaceC11829d(m26210c = "androidx.compose.foundation.gestures.AnchoredDraggableNode", m26211f = "AnchoredDraggable.kt", m26212l = {455, 458}, m26213m = "fling")
    /* renamed from: androidx.compose.foundation.gestures.AnchoredDraggableNode$fling$1 */
    public static final class C12711 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ AnchoredDraggableNode<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C12711(AnchoredDraggableNode<T> anchoredDraggableNode, InterfaceC11588c<? super C12711> interfaceC11588c) {
            super(interfaceC11588c);
            this.this$0 = anchoredDraggableNode;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.fling(0.0f, this);
        }
    }

    @InterfaceC11829d(m26210c = "androidx.compose.foundation.gestures.AnchoredDraggableNode$fling$2", m26211f = "AnchoredDraggable.kt", m26212l = {469}, m26213m = "invokeSuspend")
    /* renamed from: androidx.compose.foundation.gestures.AnchoredDraggableNode$fling$2 */
    public static final class C12722 extends SuspendLambda implements InterfaceC9545q {
        final /* synthetic */ Ref$FloatRef $leftoverVelocity;
        final /* synthetic */ float $velocity;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ AnchoredDraggableNode<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C12722(AnchoredDraggableNode<T> anchoredDraggableNode, Ref$FloatRef ref$FloatRef, float f10, InterfaceC11588c<? super C12722> interfaceC11588c) {
            super(3, interfaceC11588c);
            this.this$0 = anchoredDraggableNode;
            this.$leftoverVelocity = ref$FloatRef;
            this.$velocity = f10;
        }

        @Override // p181hd.InterfaceC9545q
        public final Object invoke(AnchoredDragScope anchoredDragScope, DraggableAnchors<T> draggableAnchors, InterfaceC11588c<? super C10786q> interfaceC11588c) {
            C12722 c12722 = new C12722(this.this$0, this.$leftoverVelocity, this.$velocity, interfaceC11588c);
            c12722.L$0 = anchoredDragScope;
            return c12722.invokeSuspend(C10786q.f26013a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Ref$FloatRef ref$FloatRef;
            Object objM25952f = AbstractC11725a.m25952f();
            int i10 = this.label;
            if (i10 == 0) {
                AbstractC9924b.m20071b(obj);
                final AnchoredDragScope anchoredDragScope = (AnchoredDragScope) this.L$0;
                final AnchoredDraggableNode<T> anchoredDraggableNode = this.this$0;
                ScrollScope scrollScope = new ScrollScope() { // from class: androidx.compose.foundation.gestures.AnchoredDraggableNode$fling$2$scrollScope$1
                    @Override // androidx.compose.foundation.gestures.ScrollScope
                    public float scrollBy(float f10) {
                        float fNewOffsetForDelta$foundation_release = ((AnchoredDraggableNode) anchoredDraggableNode).state.newOffsetForDelta$foundation_release(f10);
                        float offset = fNewOffsetForDelta$foundation_release - ((AnchoredDraggableNode) anchoredDraggableNode).state.getOffset();
                        AnchoredDragScope.dragTo$default(anchoredDragScope, fNewOffsetForDelta$foundation_release, 0.0f, 2, null);
                        return offset;
                    }
                };
                FlingBehavior resolvedFlingBehavior = this.this$0.getResolvedFlingBehavior();
                Ref$FloatRef ref$FloatRef2 = this.$leftoverVelocity;
                float f10 = this.$velocity;
                this.L$0 = ref$FloatRef2;
                this.label = 1;
                obj = resolvedFlingBehavior.performFling(scrollScope, f10, this);
                if (obj == objM25952f) {
                    return objM25952f;
                }
                ref$FloatRef = ref$FloatRef2;
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ref$FloatRef = (Ref$FloatRef) this.L$0;
                AbstractC9924b.m20071b(obj);
            }
            ref$FloatRef.f23399c = ((Number) obj).floatValue();
            return C10786q.f26013a;
        }
    }

    public AnchoredDraggableNode(AnchoredDraggableState<T> anchoredDraggableState, Orientation orientation, boolean z10, Boolean bool, MutableInteractionSource mutableInteractionSource, OverscrollEffect overscrollEffect, Boolean bool2, FlingBehavior flingBehavior) {
        super(AnchoredDraggableKt.AlwaysDrag, z10, mutableInteractionSource, orientation);
        this.state = anchoredDraggableState;
        this.orientation = orientation;
        this.reverseDirection = bool;
        this.overscrollEffect = overscrollEffect;
        this.startDragImmediately = bool2;
        this.flingBehavior = flingBehavior;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object fling(float r8, vc.InterfaceC11588c<? super java.lang.Float> r9) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r9 instanceof androidx.compose.foundation.gestures.AnchoredDraggableNode.C12711
            if (r0 == 0) goto L14
            r0 = r9
            androidx.compose.foundation.gestures.AnchoredDraggableNode$fling$1 r0 = (androidx.compose.foundation.gestures.AnchoredDraggableNode.C12711) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.label = r1
        L12:
            r4 = r0
            goto L1a
        L14:
            androidx.compose.foundation.gestures.AnchoredDraggableNode$fling$1 r0 = new androidx.compose.foundation.gestures.AnchoredDraggableNode$fling$1
            r0.<init>(r7, r9)
            goto L12
        L1a:
            java.lang.Object r9 = r4.result
            java.lang.Object r0 = p393wc.AbstractC11725a.m25952f()
            int r1 = r4.label
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L3e
            if (r1 == r3) goto L3a
            if (r1 != r2) goto L32
            java.lang.Object r8 = r4.L$0
            kotlin.jvm.internal.Ref$FloatRef r8 = (kotlin.jvm.internal.Ref$FloatRef) r8
            kotlin.AbstractC9924b.m20071b(r9)
            goto L73
        L32:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L3a:
            kotlin.AbstractC9924b.m20071b(r9)
            return r9
        L3e:
            kotlin.AbstractC9924b.m20071b(r9)
            androidx.compose.foundation.gestures.AnchoredDraggableState<T> r9 = r7.state
            boolean r9 = r9.getUsePreModifierChangeBehavior$foundation_release()
            if (r9 == 0) goto L55
            androidx.compose.foundation.gestures.AnchoredDraggableState<T> r9 = r7.state
            r4.label = r3
            java.lang.Object r8 = r9.settle(r8, r4)
            if (r8 != r0) goto L54
            goto L71
        L54:
            return r8
        L55:
            kotlin.jvm.internal.Ref$FloatRef r9 = new kotlin.jvm.internal.Ref$FloatRef
            r9.<init>()
            r9.f23399c = r8
            androidx.compose.foundation.gestures.AnchoredDraggableState<T> r1 = r7.state
            androidx.compose.foundation.gestures.AnchoredDraggableNode$fling$2 r3 = new androidx.compose.foundation.gestures.AnchoredDraggableNode$fling$2
            r5 = 0
            r3.<init>(r7, r9, r8, r5)
            r4.L$0 = r9
            r4.label = r2
            r2 = 0
            r5 = 1
            r6 = 0
            java.lang.Object r8 = androidx.compose.foundation.gestures.AnchoredDraggableState.anchoredDrag$default(r1, r2, r3, r4, r5, r6)
            if (r8 != r0) goto L72
        L71:
            return r0
        L72:
            r8 = r9
        L73:
            float r8 = r8.f23399c
            java.lang.Float r8 = p409xc.AbstractC11826a.m26207b(r8)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.AnchoredDraggableNode.fling(float, vc.c):java.lang.Object");
    }

    private final boolean isReverseDirection() {
        Boolean bool = this.reverseDirection;
        if (bool == null) {
            return DelegatableNodeKt.requireLayoutDirection(this) == LayoutDirection.Rtl && this.orientation == Orientation.Horizontal;
        }
        AbstractC9979u.m20291d(bool);
        return bool.booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: reverseIfNeeded-AH228Gc, reason: not valid java name */
    public final long m27111reverseIfNeededAH228Gc(long j10) {
        return Velocity.m33745timesadjELrA(j10, isReverseDirection() ? -1.0f : 1.0f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: reverseIfNeeded-MK-Hz9U, reason: not valid java name */
    public final long m27112reverseIfNeededMKHz9U(long j10) {
        return Offset.m30644timestuRUvjQ(j10, isReverseDirection() ? -1.0f : 1.0f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: toFloat-TH1AsA0, reason: not valid java name */
    public final float m27113toFloatTH1AsA0(long j10) {
        return this.orientation == Orientation.Vertical ? Velocity.m33740getYimpl(j10) : Velocity.m33739getXimpl(j10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: toFloat-k-4lQ0M, reason: not valid java name */
    public final float m27114toFloatk4lQ0M(long j10) {
        return Float.intBitsToFloat((int) (this.orientation == Orientation.Vertical ? j10 & 4294967295L : j10 >> 32));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: toOffset-tuRUvjQ, reason: not valid java name */
    public final long m27115toOffsettuRUvjQ(float f10) {
        Orientation orientation = this.orientation;
        float f11 = orientation == Orientation.Horizontal ? f10 : 0.0f;
        if (orientation != Orientation.Vertical) {
            f10 = 0.0f;
        }
        return Offset.m30629constructorimpl((Float.floatToRawIntBits(f11) << 32) | (Float.floatToRawIntBits(f10) & 4294967295L));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: toVelocity-adjELrA, reason: not valid java name */
    public final long m27116toVelocityadjELrA(float f10) {
        Orientation orientation = this.orientation;
        float f11 = orientation == Orientation.Horizontal ? f10 : 0.0f;
        if (orientation != Orientation.Vertical) {
            f10 = 0.0f;
        }
        return VelocityKt.Velocity(f11, f10);
    }

    private final void updateDensity() {
        Density densityRequireDensity = DelegatableNodeKt.requireDensity(this);
        Density density = this.density;
        if (density == null || !AbstractC9979u.m20289b(density, densityRequireDensity)) {
            this.density = densityRequireDensity;
            updateFlingBehavior(this.flingBehavior);
        }
    }

    private final void updateFlingBehavior(FlingBehavior flingBehavior) {
        if (flingBehavior == null) {
            AnchoredDraggableDefaults anchoredDraggableDefaults = AnchoredDraggableDefaults.INSTANCE;
            AnimationSpec<Float> snapAnimationSpec = anchoredDraggableDefaults.getSnapAnimationSpec();
            InterfaceC9540l positionalThreshold = anchoredDraggableDefaults.getPositionalThreshold();
            Density densityRequireDensity = DelegatableNodeKt.requireDensity(this);
            this.density = densityRequireDensity;
            flingBehavior = AnchoredDraggableKt.anchoredDraggableFlingBehavior(this.state, densityRequireDensity, positionalThreshold, snapAnimationSpec);
        }
        setResolvedFlingBehavior(flingBehavior);
    }

    @Override // androidx.compose.foundation.gestures.DragGestureNode
    public Object drag(InterfaceC9544p interfaceC9544p, InterfaceC11588c<? super C10786q> interfaceC11588c) {
        Object objAnchoredDrag$default = AnchoredDraggableState.anchoredDrag$default(this.state, null, new C12702(interfaceC9544p, this, null), interfaceC11588c, 1, null);
        return objAnchoredDrag$default == AbstractC11725a.m25952f() ? objAnchoredDrag$default : C10786q.f26013a;
    }

    public final FlingBehavior getResolvedFlingBehavior() {
        FlingBehavior flingBehavior = this.resolvedFlingBehavior;
        if (flingBehavior != null) {
            return flingBehavior;
        }
        AbstractC9979u.m20312y("resolvedFlingBehavior");
        return null;
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onAttach() {
        updateFlingBehavior(this.flingBehavior);
    }

    @Override // androidx.compose.p014ui.node.DelegatableNode, androidx.compose.p014ui.node.PointerInputModifierNode
    public void onDensityChange() {
        onCancelPointerInput();
        if (isAttached()) {
            updateDensity();
        }
    }

    @Override // androidx.compose.foundation.gestures.DragGestureNode
    /* renamed from: onDragStarted-k-4lQ0M, reason: not valid java name */
    public void mo27117onDragStartedk4lQ0M(long j10) {
    }

    @Override // androidx.compose.foundation.gestures.DragGestureNode
    /* renamed from: onDragStopped-TH1AsA0, reason: not valid java name */
    public void mo27118onDragStoppedTH1AsA0(long j10) {
        if (isAttached()) {
            AbstractC11117h.m24726d(getCoroutineScope(), null, null, new AnchoredDraggableNode$onDragStopped$1(this, j10, null), 3, null);
        }
    }

    public final void setResolvedFlingBehavior(FlingBehavior flingBehavior) {
        this.resolvedFlingBehavior = flingBehavior;
    }

    @Override // androidx.compose.foundation.gestures.DragGestureNode
    public boolean startDragImmediately() {
        Boolean bool = this.startDragImmediately;
        return bool != null ? bool.booleanValue() : this.state.isAnimationRunning();
    }

    public final void update(AnchoredDraggableState<T> anchoredDraggableState, Orientation orientation, boolean z10, Boolean bool, MutableInteractionSource mutableInteractionSource, OverscrollEffect overscrollEffect, Boolean bool2, FlingBehavior flingBehavior) {
        boolean z11;
        boolean z12;
        this.flingBehavior = flingBehavior;
        if (AbstractC9979u.m20289b(this.state, anchoredDraggableState)) {
            z11 = false;
        } else {
            this.state = anchoredDraggableState;
            updateFlingBehavior(flingBehavior);
            z11 = true;
        }
        if (this.orientation != orientation) {
            this.orientation = orientation;
            z11 = true;
        }
        if (AbstractC9979u.m20289b(this.reverseDirection, bool)) {
            z12 = z11;
        } else {
            this.reverseDirection = bool;
            z12 = true;
        }
        this.startDragImmediately = bool2;
        this.overscrollEffect = overscrollEffect;
        DragGestureNode.update$default(this, null, z10, mutableInteractionSource, orientation, z12, 1, null);
    }
}
