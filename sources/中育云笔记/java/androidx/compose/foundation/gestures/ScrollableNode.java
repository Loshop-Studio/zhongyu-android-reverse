package androidx.compose.foundation.gestures;

import android.view.KeyEvent;
import androidx.compose.animation.SplineBasedDecayKt;
import androidx.compose.foundation.FocusedBoundsObserverNode;
import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.OverscrollEffect;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.relocation.BringIntoViewResponderNode;
import androidx.compose.p014ui.focus.FocusTargetModifierNodeKt;
import androidx.compose.p014ui.focus.Focusability;
import androidx.compose.p014ui.geometry.Offset;
import androidx.compose.p014ui.input.key.Key;
import androidx.compose.p014ui.input.key.KeyEventType;
import androidx.compose.p014ui.input.key.KeyEvent_androidKt;
import androidx.compose.p014ui.input.key.KeyInputModifierNode;
import androidx.compose.p014ui.input.nestedscroll.NestedScrollDispatcher;
import androidx.compose.p014ui.input.nestedscroll.NestedScrollNodeKt;
import androidx.compose.p014ui.input.pointer.PointerEvent;
import androidx.compose.p014ui.input.pointer.PointerEventPass;
import androidx.compose.p014ui.input.pointer.PointerEventType;
import androidx.compose.p014ui.input.pointer.PointerInputChange;
import androidx.compose.p014ui.layout.LayoutCoordinates;
import androidx.compose.p014ui.node.CompositionLocalConsumerModifierNode;
import androidx.compose.p014ui.node.DelegatableNodeKt;
import androidx.compose.p014ui.node.SemanticsModifierNode;
import androidx.compose.p014ui.node.SemanticsModifierNodeKt;
import androidx.compose.p014ui.semantics.SemanticsPropertiesKt;
import androidx.compose.p014ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.p014ui.unit.Velocity;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.List;
import kotlin.AbstractC9924b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AdaptedFunctionReference;
import p181hd.InterfaceC9529a;
import p181hd.InterfaceC9540l;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import p393wc.AbstractC11725a;
import p409xc.InterfaceC11829d;
import sd.AbstractC11117h;
import sd.InterfaceC11122i0;
import vc.InterfaceC11588c;

@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class ScrollableNode extends DragGestureNode implements KeyInputModifierNode, SemanticsModifierNode, CompositionLocalConsumerModifierNode {
    public static final int $stable = 8;
    private final ContentInViewNode contentInViewNode;
    private final DefaultFlingBehavior defaultFlingBehavior;
    private FlingBehavior flingBehavior;
    private MouseWheelScrollingLogic mouseWheelScrollingLogic;
    private final ScrollableNestedScrollConnection nestedScrollConnection;
    private final NestedScrollDispatcher nestedScrollDispatcher;
    private OverscrollEffect overscrollEffect;
    private InterfaceC9544p scrollByAction;
    private InterfaceC9544p scrollByOffsetAction;
    private final ScrollableContainerNode scrollableContainerNode;
    private final ScrollingLogic scrollingLogic;
    private final boolean shouldAutoInvalidate;

    /* renamed from: androidx.compose.foundation.gestures.ScrollableNode$ensureMouseWheelScrollNodeInitialized$1 */
    public /* synthetic */ class C13421 extends AdaptedFunctionReference implements InterfaceC9544p {
        public C13421(Object obj) {
            super(2, obj, ScrollableNode.class, "onWheelScrollStopped", "onWheelScrollStopped-TH1AsA0(J)V", 4);
        }

        @Override // p181hd.InterfaceC9544p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return m27232invokesFctU(((Velocity) obj).m33748unboximpl(), (InterfaceC11588c) obj2);
        }

        /* renamed from: invoke-sF-c-tU, reason: not valid java name */
        public final Object m27232invokesFctU(long j10, InterfaceC11588c<? super C10786q> interfaceC11588c) {
            return ScrollableNode.ensureMouseWheelScrollNodeInitialized$onWheelScrollStopped((ScrollableNode) this.receiver, j10, interfaceC11588c);
        }
    }

    @InterfaceC11829d(m26210c = "androidx.compose.foundation.gestures.ScrollableNode$setScrollSemanticsActions$2", m26211f = "Scrollable.kt", m26212l = {522}, m26213m = "invokeSuspend")
    /* renamed from: androidx.compose.foundation.gestures.ScrollableNode$setScrollSemanticsActions$2 */
    public static final class C13452 extends SuspendLambda implements InterfaceC9544p {
        /* synthetic */ long J$0;
        int label;

        public C13452(InterfaceC11588c<? super C13452> interfaceC11588c) {
            super(2, interfaceC11588c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC11588c<C10786q> create(Object obj, InterfaceC11588c<?> interfaceC11588c) {
            C13452 c13452 = ScrollableNode.this.new C13452(interfaceC11588c);
            c13452.J$0 = ((Offset) obj).m30647unboximpl();
            return c13452;
        }

        @Override // p181hd.InterfaceC9544p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return m27233invoke3MmeM6k(((Offset) obj).m30647unboximpl(), (InterfaceC11588c) obj2);
        }

        /* renamed from: invoke-3MmeM6k, reason: not valid java name */
        public final Object m27233invoke3MmeM6k(long j10, InterfaceC11588c<? super Offset> interfaceC11588c) {
            return ((C13452) create(Offset.m30626boximpl(j10), interfaceC11588c)).invokeSuspend(C10786q.f26013a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM25952f = AbstractC11725a.m25952f();
            int i10 = this.label;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9924b.m20071b(obj);
                return obj;
            }
            AbstractC9924b.m20071b(obj);
            long j10 = this.J$0;
            ScrollingLogic scrollingLogic = ScrollableNode.this.scrollingLogic;
            this.label = 1;
            Object objM27228semanticsScrollByd4ec7I = ScrollableKt.m27228semanticsScrollByd4ec7I(scrollingLogic, j10, this);
            return objM27228semanticsScrollByd4ec7I == objM25952f ? objM25952f : objM27228semanticsScrollByd4ec7I;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v3, types: [androidx.compose.foundation.gestures.FlingBehavior] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3 */
    public ScrollableNode(ScrollableState scrollableState, OverscrollEffect overscrollEffect, FlingBehavior flingBehavior, Orientation orientation, boolean z10, boolean z11, MutableInteractionSource mutableInteractionSource, BringIntoViewSpec bringIntoViewSpec) {
        super(ScrollableKt.CanDragCalculation, z10, mutableInteractionSource, orientation);
        this.overscrollEffect = overscrollEffect;
        this.flingBehavior = flingBehavior;
        NestedScrollDispatcher nestedScrollDispatcher = new NestedScrollDispatcher();
        this.nestedScrollDispatcher = nestedScrollDispatcher;
        this.scrollableContainerNode = (ScrollableContainerNode) delegate(new ScrollableContainerNode(z10));
        DefaultFlingBehavior defaultFlingBehavior = new DefaultFlingBehavior(SplineBasedDecayKt.splineBasedDecay(ScrollableKt.UnityDensity), null, 2, 0 == true ? 1 : 0);
        this.defaultFlingBehavior = defaultFlingBehavior;
        OverscrollEffect overscrollEffect2 = this.overscrollEffect;
        ?? r14 = this.flingBehavior;
        ScrollingLogic scrollingLogic = new ScrollingLogic(scrollableState, overscrollEffect2, r14 == 0 ? defaultFlingBehavior : r14, orientation, z11, nestedScrollDispatcher, new InterfaceC9529a() { // from class: androidx.compose.foundation.gestures.ScrollableNode$scrollingLogic$1
            {
                super(0);
            }

            @Override // p181hd.InterfaceC9529a
            public final Boolean invoke() {
                return Boolean.valueOf(this.this$0.isAttached());
            }
        });
        this.scrollingLogic = scrollingLogic;
        ScrollableNestedScrollConnection scrollableNestedScrollConnection = new ScrollableNestedScrollConnection(scrollingLogic, z10);
        this.nestedScrollConnection = scrollableNestedScrollConnection;
        ContentInViewNode contentInViewNode = (ContentInViewNode) delegate(new ContentInViewNode(orientation, scrollingLogic, z11, bringIntoViewSpec));
        this.contentInViewNode = contentInViewNode;
        delegate(NestedScrollNodeKt.nestedScrollModifierNode(scrollableNestedScrollConnection, nestedScrollDispatcher));
        delegate(FocusTargetModifierNodeKt.m30552FocusTargetModifierNodePYyLHbc$default(Focusability.Companion.m30574getNeverLCbbffg(), null, 2, null));
        delegate(new BringIntoViewResponderNode(contentInViewNode));
        delegate(new FocusedBoundsObserverNode(new InterfaceC9540l() { // from class: androidx.compose.foundation.gestures.ScrollableNode.1
            {
                super(1);
            }

            @Override // p181hd.InterfaceC9540l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((LayoutCoordinates) obj);
                return C10786q.f26013a;
            }

            public final void invoke(LayoutCoordinates layoutCoordinates) {
                ScrollableNode.this.contentInViewNode.onFocusBoundsChanged(layoutCoordinates);
            }
        }));
    }

    private final void clearScrollSemanticsActions() {
        this.scrollByAction = null;
        this.scrollByOffsetAction = null;
    }

    private final void ensureMouseWheelScrollNodeInitialized() {
        if (this.mouseWheelScrollingLogic == null) {
            this.mouseWheelScrollingLogic = new MouseWheelScrollingLogic(this.scrollingLogic, AndroidScrollable_androidKt.platformScrollConfig(this), new C13421(this), DelegatableNodeKt.requireDensity(this));
        }
        MouseWheelScrollingLogic mouseWheelScrollingLogic = this.mouseWheelScrollingLogic;
        if (mouseWheelScrollingLogic != null) {
            mouseWheelScrollingLogic.startReceivingMouseWheelEvents(getCoroutineScope());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ Object ensureMouseWheelScrollNodeInitialized$onWheelScrollStopped(ScrollableNode scrollableNode, long j10, InterfaceC11588c interfaceC11588c) {
        scrollableNode.m27231onWheelScrollStoppedTH1AsA0(j10);
        return C10786q.f26013a;
    }

    /* renamed from: onWheelScrollStopped-TH1AsA0, reason: not valid java name */
    private final void m27231onWheelScrollStoppedTH1AsA0(long j10) {
        AbstractC11117h.m24726d(this.nestedScrollDispatcher.getCoroutineScope(), null, null, new ScrollableNode$onWheelScrollStopped$1(this, j10, null), 3, null);
    }

    private final void setScrollSemanticsActions() {
        this.scrollByAction = new InterfaceC9544p() { // from class: androidx.compose.foundation.gestures.ScrollableNode.setScrollSemanticsActions.1

            @InterfaceC11829d(m26210c = "androidx.compose.foundation.gestures.ScrollableNode$setScrollSemanticsActions$1$1", m26211f = "Scrollable.kt", m26212l = {518}, m26213m = "invokeSuspend")
            /* renamed from: androidx.compose.foundation.gestures.ScrollableNode$setScrollSemanticsActions$1$1, reason: invalid class name */
            public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC9544p {

                /* renamed from: $x */
                final /* synthetic */ float f1080$x;

                /* renamed from: $y */
                final /* synthetic */ float f1081$y;
                int label;
                final /* synthetic */ ScrollableNode this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass1(ScrollableNode scrollableNode, float f10, float f11, InterfaceC11588c<? super AnonymousClass1> interfaceC11588c) {
                    super(2, interfaceC11588c);
                    this.this$0 = scrollableNode;
                    this.f1080$x = f10;
                    this.f1081$y = f11;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final InterfaceC11588c<C10786q> create(Object obj, InterfaceC11588c<?> interfaceC11588c) {
                    return new AnonymousClass1(this.this$0, this.f1080$x, this.f1081$y, interfaceC11588c);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) throws Throwable {
                    Object objM25952f = AbstractC11725a.m25952f();
                    int i10 = this.label;
                    if (i10 == 0) {
                        AbstractC9924b.m20071b(obj);
                        ScrollingLogic scrollingLogic = this.this$0.scrollingLogic;
                        float f10 = this.f1080$x;
                        float f11 = this.f1081$y;
                        long jM30629constructorimpl = Offset.m30629constructorimpl((Float.floatToRawIntBits(f10) << 32) | (Float.floatToRawIntBits(f11) & 4294967295L));
                        this.label = 1;
                        if (ScrollableKt.m27228semanticsScrollByd4ec7I(scrollingLogic, jM30629constructorimpl, this) == objM25952f) {
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
                    return ((AnonymousClass1) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
                }
            }

            {
                super(2);
            }

            @Override // p181hd.InterfaceC9544p
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                return invoke(((Number) obj).floatValue(), ((Number) obj2).floatValue());
            }

            public final Boolean invoke(float f10, float f11) {
                AbstractC11117h.m24726d(ScrollableNode.this.getCoroutineScope(), null, null, new AnonymousClass1(ScrollableNode.this, f10, f11, null), 3, null);
                return Boolean.TRUE;
            }
        };
        this.scrollByOffsetAction = new C13452(null);
    }

    private final void updateDefaultFlingBehavior() {
        if (isAttached()) {
            this.defaultFlingBehavior.updateDensity(DelegatableNodeKt.requireDensity(this));
        }
    }

    @Override // androidx.compose.p014ui.node.SemanticsModifierNode
    public void applySemantics(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        if (getEnabled() && (this.scrollByAction == null || this.scrollByOffsetAction == null)) {
            setScrollSemanticsActions();
        }
        InterfaceC9544p interfaceC9544p = this.scrollByAction;
        if (interfaceC9544p != null) {
            SemanticsPropertiesKt.scrollBy$default(semanticsPropertyReceiver, null, interfaceC9544p, 1, null);
        }
        InterfaceC9544p interfaceC9544p2 = this.scrollByOffsetAction;
        if (interfaceC9544p2 != null) {
            SemanticsPropertiesKt.scrollByOffset(semanticsPropertyReceiver, interfaceC9544p2);
        }
    }

    @Override // androidx.compose.foundation.gestures.DragGestureNode
    public Object drag(InterfaceC9544p interfaceC9544p, InterfaceC11588c<? super C10786q> interfaceC11588c) {
        ScrollingLogic scrollingLogic = this.scrollingLogic;
        Object objScroll = scrollingLogic.scroll(MutatePriority.UserInput, new ScrollableNode$drag$2$1(interfaceC9544p, scrollingLogic, null), interfaceC11588c);
        return objScroll == AbstractC11725a.m25952f() ? objScroll : C10786q.f26013a;
    }

    @Override // androidx.compose.ui.Modifier.Node
    public boolean getShouldAutoInvalidate() {
        return this.shouldAutoInvalidate;
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onAttach() {
        updateDefaultFlingBehavior();
        MouseWheelScrollingLogic mouseWheelScrollingLogic = this.mouseWheelScrollingLogic;
        if (mouseWheelScrollingLogic != null) {
            mouseWheelScrollingLogic.updateDensity(DelegatableNodeKt.requireDensity(this));
        }
    }

    @Override // androidx.compose.p014ui.node.DelegatableNode, androidx.compose.p014ui.node.PointerInputModifierNode
    public void onDensityChange() {
        onCancelPointerInput();
        updateDefaultFlingBehavior();
        MouseWheelScrollingLogic mouseWheelScrollingLogic = this.mouseWheelScrollingLogic;
        if (mouseWheelScrollingLogic != null) {
            mouseWheelScrollingLogic.updateDensity(DelegatableNodeKt.requireDensity(this));
        }
    }

    @Override // androidx.compose.foundation.gestures.DragGestureNode
    /* renamed from: onDragStarted-k-4lQ0M */
    public void mo27117onDragStartedk4lQ0M(long j10) {
    }

    @Override // androidx.compose.foundation.gestures.DragGestureNode
    /* renamed from: onDragStopped-TH1AsA0 */
    public void mo27118onDragStoppedTH1AsA0(long j10) {
        AbstractC11117h.m24726d(this.nestedScrollDispatcher.getCoroutineScope(), null, null, new ScrollableNode$onDragStopped$1(this, j10, null), 3, null);
    }

    @Override // androidx.compose.p014ui.input.key.KeyInputModifierNode
    /* renamed from: onKeyEvent-ZmokQxo */
    public boolean mo26919onKeyEventZmokQxo(KeyEvent keyEvent) {
        long jM30629constructorimpl;
        if (!getEnabled()) {
            return false;
        }
        long jM31959getKeyZmokQxo = KeyEvent_androidKt.m31959getKeyZmokQxo(keyEvent);
        Key.Companion companion = Key.Companion;
        if ((!Key.m31651equalsimpl0(jM31959getKeyZmokQxo, companion.m31839getPageDownEK5gGoQ()) && !Key.m31651equalsimpl0(KeyEvent_androidKt.m31959getKeyZmokQxo(keyEvent), companion.m31840getPageUpEK5gGoQ())) || !KeyEventType.m31952equalsimpl0(KeyEvent_androidKt.m31960getTypeZmokQxo(keyEvent), KeyEventType.Companion.m31956getKeyDownCS__XNY()) || KeyEvent_androidKt.m31963isCtrlPressedZmokQxo(keyEvent)) {
            return false;
        }
        if (this.scrollingLogic.isVertical()) {
            int iM27132getViewportSizeYbymL2g$foundation_release = (int) (this.contentInViewNode.m27132getViewportSizeYbymL2g$foundation_release() & 4294967295L);
            jM30629constructorimpl = Offset.m30629constructorimpl((Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(Key.m31651equalsimpl0(KeyEvent_androidKt.m31959getKeyZmokQxo(keyEvent), companion.m31840getPageUpEK5gGoQ()) ? iM27132getViewportSizeYbymL2g$foundation_release : -iM27132getViewportSizeYbymL2g$foundation_release) & 4294967295L));
        } else {
            int iM27132getViewportSizeYbymL2g$foundation_release2 = (int) (this.contentInViewNode.m27132getViewportSizeYbymL2g$foundation_release() >> 32);
            jM30629constructorimpl = Offset.m30629constructorimpl((Float.floatToRawIntBits(0.0f) & 4294967295L) | (Float.floatToRawIntBits(Key.m31651equalsimpl0(KeyEvent_androidKt.m31959getKeyZmokQxo(keyEvent), companion.m31840getPageUpEK5gGoQ()) ? iM27132getViewportSizeYbymL2g$foundation_release2 : -iM27132getViewportSizeYbymL2g$foundation_release2) << 32));
        }
        AbstractC11117h.m24726d(getCoroutineScope(), null, null, new ScrollableNode$onKeyEvent$1(this, jM30629constructorimpl, null), 3, null);
        return true;
    }

    @Override // androidx.compose.foundation.gestures.DragGestureNode, androidx.compose.p014ui.node.PointerInputModifierNode
    /* renamed from: onPointerEvent-H0pRuoY */
    public void mo26920onPointerEventH0pRuoY(PointerEvent pointerEvent, PointerEventPass pointerEventPass, long j10) {
        List<PointerInputChange> changes = pointerEvent.getChanges();
        int size = changes.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                break;
            }
            if (((Boolean) getCanDrag().invoke(changes.get(i10))).booleanValue()) {
                super.mo26920onPointerEventH0pRuoY(pointerEvent, pointerEventPass, j10);
                break;
            }
            i10++;
        }
        if (getEnabled()) {
            if (pointerEventPass == PointerEventPass.Initial && PointerEventType.m32053equalsimpl0(pointerEvent.m32046getType7fucELk(), PointerEventType.Companion.m32062getScroll7fucELk())) {
                ensureMouseWheelScrollNodeInitialized();
            }
            MouseWheelScrollingLogic mouseWheelScrollingLogic = this.mouseWheelScrollingLogic;
            if (mouseWheelScrollingLogic != null) {
                mouseWheelScrollingLogic.m27194onPointerEventH0pRuoY(pointerEvent, pointerEventPass, j10);
            }
        }
    }

    @Override // androidx.compose.p014ui.input.key.KeyInputModifierNode
    /* renamed from: onPreKeyEvent-ZmokQxo */
    public boolean mo26921onPreKeyEventZmokQxo(KeyEvent keyEvent) {
        return false;
    }

    @Override // androidx.compose.foundation.gestures.DragGestureNode
    public boolean startDragImmediately() {
        return this.scrollingLogic.shouldScrollImmediately();
    }

    public final void update(ScrollableState scrollableState, Orientation orientation, OverscrollEffect overscrollEffect, boolean z10, boolean z11, FlingBehavior flingBehavior, MutableInteractionSource mutableInteractionSource, BringIntoViewSpec bringIntoViewSpec) {
        boolean z12;
        if (getEnabled() != z10) {
            this.nestedScrollConnection.setEnabled(z10);
            this.scrollableContainerNode.update(z10);
            z12 = true;
        } else {
            z12 = false;
        }
        boolean z13 = z12;
        boolean zUpdate = this.scrollingLogic.update(scrollableState, orientation, overscrollEffect, z11, flingBehavior == null ? this.defaultFlingBehavior : flingBehavior, this.nestedScrollDispatcher);
        this.contentInViewNode.update(orientation, z11, bringIntoViewSpec);
        this.overscrollEffect = overscrollEffect;
        this.flingBehavior = flingBehavior;
        update(ScrollableKt.CanDragCalculation, z10, mutableInteractionSource, this.scrollingLogic.isVertical() ? Orientation.Vertical : Orientation.Horizontal, zUpdate);
        if (z13) {
            clearScrollSemanticsActions();
            SemanticsModifierNodeKt.invalidateSemantics(this);
        }
    }
}
