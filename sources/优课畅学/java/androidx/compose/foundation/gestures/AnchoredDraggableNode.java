package androidx.compose.foundation.gestures;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.foundation.OverscrollEffect;
import androidx.compose.foundation.gestures.DragEvent;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.p013ui.geometry.Offset;
import androidx.compose.p013ui.input.nestedscroll.NestedScrollSource;
import androidx.compose.p013ui.node.DelegatableNodeKt;
import androidx.compose.p013ui.unit.Density;
import androidx.compose.p013ui.unit.LayoutDirection;
import androidx.compose.p013ui.unit.Velocity;
import androidx.compose.p013ui.unit.VelocityKt;
import com.tencent.smtt.sdk.TbsListener;
import kotlin.AbstractC9079b;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC9133u;
import kotlin.jvm.internal.Ref$FloatRef;
import p123h7.C8736p;
import p135i8.AbstractC8839h;
import p179m7.InterfaceC9324c;
import p190n7.AbstractC9434a;
import p201o7.InterfaceC9539d;
import p300x7.InterfaceC10570l;
import p300x7.InterfaceC10574p;
import p300x7.InterfaceC10575q;

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

    @InterfaceC9539d(m17800c = "androidx.compose.foundation.gestures.AnchoredDraggableNode$drag$2", m17801f = "AnchoredDraggable.kt", m17802l = {TbsListener.ErrorCode.INFO_CAN_NOT_DISABLED_BY_CRASH}, m17803m = "invokeSuspend")
    /* renamed from: androidx.compose.foundation.gestures.AnchoredDraggableNode$drag$2 */
    public static final class C12402 extends SuspendLambda implements InterfaceC10575q {
        final /* synthetic */ InterfaceC10574p $forEachDelta;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ AnchoredDraggableNode<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C12402(InterfaceC10574p interfaceC10574p, AnchoredDraggableNode<T> anchoredDraggableNode, InterfaceC9324c<? super C12402> interfaceC9324c) {
            super(3, interfaceC9324c);
            this.$forEachDelta = interfaceC10574p;
            this.this$0 = anchoredDraggableNode;
        }

        @Override // p300x7.InterfaceC10575q
        public final Object invoke(AnchoredDragScope anchoredDragScope, DraggableAnchors<T> draggableAnchors, InterfaceC9324c<? super C8736p> interfaceC9324c) {
            C12402 c12402 = new C12402(this.$forEachDelta, this.this$0, interfaceC9324c);
            c12402.L$0 = anchoredDragScope;
            return c12402.invokeSuspend(C8736p.f16368a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM17291f = AbstractC9434a.m17291f();
            int i10 = this.label;
            if (i10 == 0) {
                AbstractC9079b.m15926b(obj);
                final AnchoredDragScope anchoredDragScope = (AnchoredDragScope) this.L$0;
                InterfaceC10574p interfaceC10574p = this.$forEachDelta;
                final AnchoredDraggableNode<T> anchoredDraggableNode = this.this$0;
                InterfaceC10570l interfaceC10570l = new InterfaceC10570l() { // from class: androidx.compose.foundation.gestures.AnchoredDraggableNode.drag.2.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // p300x7.InterfaceC10570l
                    public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                        invoke((DragEvent.DragDelta) obj2);
                        return C8736p.f16368a;
                    }

                    public final void invoke(DragEvent.DragDelta dragDelta) {
                        AnchoredDraggableNode<T> anchoredDraggableNode2 = anchoredDraggableNode;
                        float fM20512toFloatk4lQ0M = anchoredDraggableNode2.m20512toFloatk4lQ0M(anchoredDraggableNode2.m20510reverseIfNeededMKHz9U(dragDelta.m20535getDeltaF1C5BW0()));
                        if (((AnchoredDraggableNode) anchoredDraggableNode).overscrollEffect == null) {
                            AnchoredDragScope.dragTo$default(anchoredDragScope, ((AnchoredDraggableNode) anchoredDraggableNode).state.newOffsetForDelta$foundation_release(fM20512toFloatk4lQ0M), 0.0f, 2, null);
                            return;
                        }
                        OverscrollEffect overscrollEffect = ((AnchoredDraggableNode) anchoredDraggableNode).overscrollEffect;
                        AbstractC9133u.m16130d(overscrollEffect);
                        long jM20513toOffsettuRUvjQ = anchoredDraggableNode.m20513toOffsettuRUvjQ(fM20512toFloatk4lQ0M);
                        int iM25394getUserInputWNlRxjI = NestedScrollSource.Companion.m25394getUserInputWNlRxjI();
                        final AnchoredDraggableNode<T> anchoredDraggableNode3 = anchoredDraggableNode;
                        final AnchoredDragScope anchoredDragScope2 = anchoredDragScope;
                        overscrollEffect.mo20327applyToScrollRhakbz0(jM20513toOffsettuRUvjQ, iM25394getUserInputWNlRxjI, new InterfaceC10570l() { // from class: androidx.compose.foundation.gestures.AnchoredDraggableNode.drag.2.1.1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // p300x7.InterfaceC10570l
                            public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                                return Offset.m24024boximpl(m20517invokeMKHz9U(((Offset) obj2).m24045unboximpl()));
                            }

                            /* renamed from: invoke-MK-Hz9U, reason: not valid java name */
                            public final long m20517invokeMKHz9U(long j10) {
                                float fNewOffsetForDelta$foundation_release = ((AnchoredDraggableNode) anchoredDraggableNode3).state.newOffsetForDelta$foundation_release(anchoredDraggableNode3.m20512toFloatk4lQ0M(j10));
                                AnchoredDraggableNode<T> anchoredDraggableNode4 = anchoredDraggableNode3;
                                long jM20513toOffsettuRUvjQ2 = anchoredDraggableNode4.m20513toOffsettuRUvjQ(fNewOffsetForDelta$foundation_release - ((AnchoredDraggableNode) anchoredDraggableNode4).state.requireOffset());
                                AnchoredDragScope.dragTo$default(anchoredDragScope2, fNewOffsetForDelta$foundation_release, 0.0f, 2, null);
                                return jM20513toOffsettuRUvjQ2;
                            }
                        });
                    }
                };
                this.label = 1;
                if (interfaceC10574p.invoke(interfaceC10570l, this) == objM17291f) {
                    return objM17291f;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9079b.m15926b(obj);
            }
            return C8736p.f16368a;
        }
    }

    @InterfaceC9539d(m17800c = "androidx.compose.foundation.gestures.AnchoredDraggableNode", m17801f = "AnchoredDraggable.kt", m17802l = {455, 458}, m17803m = "fling")
    /* renamed from: androidx.compose.foundation.gestures.AnchoredDraggableNode$fling$1 */
    public static final class C12411 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ AnchoredDraggableNode<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C12411(AnchoredDraggableNode<T> anchoredDraggableNode, InterfaceC9324c<? super C12411> interfaceC9324c) {
            super(interfaceC9324c);
            this.this$0 = anchoredDraggableNode;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.fling(0.0f, this);
        }
    }

    @InterfaceC9539d(m17800c = "androidx.compose.foundation.gestures.AnchoredDraggableNode$fling$2", m17801f = "AnchoredDraggable.kt", m17802l = {469}, m17803m = "invokeSuspend")
    /* renamed from: androidx.compose.foundation.gestures.AnchoredDraggableNode$fling$2 */
    public static final class C12422 extends SuspendLambda implements InterfaceC10575q {
        final /* synthetic */ Ref$FloatRef $leftoverVelocity;
        final /* synthetic */ float $velocity;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ AnchoredDraggableNode<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C12422(AnchoredDraggableNode<T> anchoredDraggableNode, Ref$FloatRef ref$FloatRef, float f10, InterfaceC9324c<? super C12422> interfaceC9324c) {
            super(3, interfaceC9324c);
            this.this$0 = anchoredDraggableNode;
            this.$leftoverVelocity = ref$FloatRef;
            this.$velocity = f10;
        }

        @Override // p300x7.InterfaceC10575q
        public final Object invoke(AnchoredDragScope anchoredDragScope, DraggableAnchors<T> draggableAnchors, InterfaceC9324c<? super C8736p> interfaceC9324c) {
            C12422 c12422 = new C12422(this.this$0, this.$leftoverVelocity, this.$velocity, interfaceC9324c);
            c12422.L$0 = anchoredDragScope;
            return c12422.invokeSuspend(C8736p.f16368a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Ref$FloatRef ref$FloatRef;
            Object objM17291f = AbstractC9434a.m17291f();
            int i10 = this.label;
            if (i10 == 0) {
                AbstractC9079b.m15926b(obj);
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
                if (obj == objM17291f) {
                    return objM17291f;
                }
                ref$FloatRef = ref$FloatRef2;
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ref$FloatRef = (Ref$FloatRef) this.L$0;
                AbstractC9079b.m15926b(obj);
            }
            ref$FloatRef.f17470a = ((Number) obj).floatValue();
            return C8736p.f16368a;
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
    public final java.lang.Object fling(float r8, p179m7.InterfaceC9324c<? super java.lang.Float> r9) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r9 instanceof androidx.compose.foundation.gestures.AnchoredDraggableNode.C12411
            if (r0 == 0) goto L14
            r0 = r9
            androidx.compose.foundation.gestures.AnchoredDraggableNode$fling$1 r0 = (androidx.compose.foundation.gestures.AnchoredDraggableNode.C12411) r0
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
            java.lang.Object r0 = p190n7.AbstractC9434a.m17291f()
            int r1 = r4.label
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L3e
            if (r1 == r3) goto L3a
            if (r1 != r2) goto L32
            java.lang.Object r8 = r4.L$0
            kotlin.jvm.internal.Ref$FloatRef r8 = (kotlin.jvm.internal.Ref$FloatRef) r8
            kotlin.AbstractC9079b.m15926b(r9)
            goto L73
        L32:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L3a:
            kotlin.AbstractC9079b.m15926b(r9)
            return r9
        L3e:
            kotlin.AbstractC9079b.m15926b(r9)
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
            r9.f17470a = r8
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
            float r8 = r8.f17470a
            java.lang.Float r8 = p201o7.AbstractC9536a.m17797b(r8)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.AnchoredDraggableNode.fling(float, m7.c):java.lang.Object");
    }

    private final boolean isReverseDirection() {
        Boolean bool = this.reverseDirection;
        if (bool == null) {
            return DelegatableNodeKt.requireLayoutDirection(this) == LayoutDirection.Rtl && this.orientation == Orientation.Horizontal;
        }
        AbstractC9133u.m16130d(bool);
        return bool.booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: reverseIfNeeded-AH228Gc, reason: not valid java name */
    public final long m20509reverseIfNeededAH228Gc(long j10) {
        return Velocity.m27143timesadjELrA(j10, isReverseDirection() ? -1.0f : 1.0f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: reverseIfNeeded-MK-Hz9U, reason: not valid java name */
    public final long m20510reverseIfNeededMKHz9U(long j10) {
        return Offset.m24042timestuRUvjQ(j10, isReverseDirection() ? -1.0f : 1.0f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: toFloat-TH1AsA0, reason: not valid java name */
    public final float m20511toFloatTH1AsA0(long j10) {
        return this.orientation == Orientation.Vertical ? Velocity.m27138getYimpl(j10) : Velocity.m27137getXimpl(j10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: toFloat-k-4lQ0M, reason: not valid java name */
    public final float m20512toFloatk4lQ0M(long j10) {
        return Float.intBitsToFloat((int) (this.orientation == Orientation.Vertical ? j10 & 4294967295L : j10 >> 32));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: toOffset-tuRUvjQ, reason: not valid java name */
    public final long m20513toOffsettuRUvjQ(float f10) {
        Orientation orientation = this.orientation;
        float f11 = orientation == Orientation.Horizontal ? f10 : 0.0f;
        if (orientation != Orientation.Vertical) {
            f10 = 0.0f;
        }
        return Offset.m24027constructorimpl((Float.floatToRawIntBits(f11) << 32) | (Float.floatToRawIntBits(f10) & 4294967295L));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: toVelocity-adjELrA, reason: not valid java name */
    public final long m20514toVelocityadjELrA(float f10) {
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
        if (density == null || !AbstractC9133u.m16128b(density, densityRequireDensity)) {
            this.density = densityRequireDensity;
            updateFlingBehavior(this.flingBehavior);
        }
    }

    private final void updateFlingBehavior(FlingBehavior flingBehavior) {
        if (flingBehavior == null) {
            AnchoredDraggableDefaults anchoredDraggableDefaults = AnchoredDraggableDefaults.INSTANCE;
            AnimationSpec<Float> snapAnimationSpec = anchoredDraggableDefaults.getSnapAnimationSpec();
            InterfaceC10570l positionalThreshold = anchoredDraggableDefaults.getPositionalThreshold();
            Density densityRequireDensity = DelegatableNodeKt.requireDensity(this);
            this.density = densityRequireDensity;
            flingBehavior = AnchoredDraggableKt.anchoredDraggableFlingBehavior(this.state, densityRequireDensity, positionalThreshold, snapAnimationSpec);
        }
        setResolvedFlingBehavior(flingBehavior);
    }

    @Override // androidx.compose.foundation.gestures.DragGestureNode
    public Object drag(InterfaceC10574p interfaceC10574p, InterfaceC9324c<? super C8736p> interfaceC9324c) {
        Object objAnchoredDrag$default = AnchoredDraggableState.anchoredDrag$default(this.state, null, new C12402(interfaceC10574p, this, null), interfaceC9324c, 1, null);
        return objAnchoredDrag$default == AbstractC9434a.m17291f() ? objAnchoredDrag$default : C8736p.f16368a;
    }

    public final FlingBehavior getResolvedFlingBehavior() {
        FlingBehavior flingBehavior = this.resolvedFlingBehavior;
        if (flingBehavior != null) {
            return flingBehavior;
        }
        AbstractC9133u.m16151y("resolvedFlingBehavior");
        return null;
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onAttach() {
        updateFlingBehavior(this.flingBehavior);
    }

    @Override // androidx.compose.p013ui.node.DelegatableNode, androidx.compose.p013ui.node.PointerInputModifierNode
    public void onDensityChange() {
        onCancelPointerInput();
        if (isAttached()) {
            updateDensity();
        }
    }

    @Override // androidx.compose.foundation.gestures.DragGestureNode
    /* renamed from: onDragStarted-k-4lQ0M, reason: not valid java name */
    public void mo20515onDragStartedk4lQ0M(long j10) {
    }

    @Override // androidx.compose.foundation.gestures.DragGestureNode
    /* renamed from: onDragStopped-TH1AsA0, reason: not valid java name */
    public void mo20516onDragStoppedTH1AsA0(long j10) {
        if (isAttached()) {
            AbstractC8839h.m14861d(getCoroutineScope(), null, null, new AnchoredDraggableNode$onDragStopped$1(this, j10, null), 3, null);
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
        if (AbstractC9133u.m16128b(this.state, anchoredDraggableState)) {
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
        if (AbstractC9133u.m16128b(this.reverseDirection, bool)) {
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
