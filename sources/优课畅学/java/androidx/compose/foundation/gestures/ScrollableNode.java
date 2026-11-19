package androidx.compose.foundation.gestures;

import android.view.KeyEvent;
import androidx.compose.animation.SplineBasedDecayKt;
import androidx.compose.foundation.FocusedBoundsObserverNode;
import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.OverscrollEffect;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.relocation.BringIntoViewResponderNode;
import androidx.compose.p013ui.focus.FocusTargetModifierNodeKt;
import androidx.compose.p013ui.focus.Focusability;
import androidx.compose.p013ui.geometry.Offset;
import androidx.compose.p013ui.input.key.Key;
import androidx.compose.p013ui.input.key.KeyEventType;
import androidx.compose.p013ui.input.key.KeyEvent_androidKt;
import androidx.compose.p013ui.input.key.KeyInputModifierNode;
import androidx.compose.p013ui.input.nestedscroll.NestedScrollDispatcher;
import androidx.compose.p013ui.input.nestedscroll.NestedScrollNodeKt;
import androidx.compose.p013ui.input.pointer.PointerEvent;
import androidx.compose.p013ui.input.pointer.PointerEventPass;
import androidx.compose.p013ui.input.pointer.PointerEventType;
import androidx.compose.p013ui.input.pointer.PointerInputChange;
import androidx.compose.p013ui.layout.LayoutCoordinates;
import androidx.compose.p013ui.node.CompositionLocalConsumerModifierNode;
import androidx.compose.p013ui.node.DelegatableNodeKt;
import androidx.compose.p013ui.node.SemanticsModifierNode;
import androidx.compose.p013ui.node.SemanticsModifierNodeKt;
import androidx.compose.p013ui.semantics.SemanticsPropertiesKt;
import androidx.compose.p013ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.p013ui.unit.Velocity;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.List;
import kotlin.AbstractC9079b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AdaptedFunctionReference;
import p123h7.C8736p;
import p135i8.AbstractC8839h;
import p135i8.InterfaceC8822b0;
import p179m7.InterfaceC9324c;
import p190n7.AbstractC9434a;
import p201o7.InterfaceC9539d;
import p300x7.InterfaceC10559a;
import p300x7.InterfaceC10570l;
import p300x7.InterfaceC10574p;

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
    private InterfaceC10574p scrollByAction;
    private InterfaceC10574p scrollByOffsetAction;
    private final ScrollableContainerNode scrollableContainerNode;
    private final ScrollingLogic scrollingLogic;
    private final boolean shouldAutoInvalidate;

    /* renamed from: androidx.compose.foundation.gestures.ScrollableNode$ensureMouseWheelScrollNodeInitialized$1 */
    public /* synthetic */ class C13121 extends AdaptedFunctionReference implements InterfaceC10574p {
        public C13121(Object obj) {
            super(2, obj, ScrollableNode.class, "onWheelScrollStopped", "onWheelScrollStopped-TH1AsA0(J)V", 4);
        }

        @Override // p300x7.InterfaceC10574p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return m20630invokesFctU(((Velocity) obj).m27146unboximpl(), (InterfaceC9324c) obj2);
        }

        /* renamed from: invoke-sF-c-tU, reason: not valid java name */
        public final Object m20630invokesFctU(long j10, InterfaceC9324c<? super C8736p> interfaceC9324c) {
            return ScrollableNode.ensureMouseWheelScrollNodeInitialized$onWheelScrollStopped((ScrollableNode) this.receiver, j10, interfaceC9324c);
        }
    }

    @InterfaceC9539d(m17800c = "androidx.compose.foundation.gestures.ScrollableNode$setScrollSemanticsActions$2", m17801f = "Scrollable.kt", m17802l = {522}, m17803m = "invokeSuspend")
    /* renamed from: androidx.compose.foundation.gestures.ScrollableNode$setScrollSemanticsActions$2 */
    public static final class C13152 extends SuspendLambda implements InterfaceC10574p {
        /* synthetic */ long J$0;
        int label;

        public C13152(InterfaceC9324c<? super C13152> interfaceC9324c) {
            super(2, interfaceC9324c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC9324c<C8736p> create(Object obj, InterfaceC9324c<?> interfaceC9324c) {
            C13152 c13152 = ScrollableNode.this.new C13152(interfaceC9324c);
            c13152.J$0 = ((Offset) obj).m24045unboximpl();
            return c13152;
        }

        @Override // p300x7.InterfaceC10574p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return m20631invoke3MmeM6k(((Offset) obj).m24045unboximpl(), (InterfaceC9324c) obj2);
        }

        /* renamed from: invoke-3MmeM6k, reason: not valid java name */
        public final Object m20631invoke3MmeM6k(long j10, InterfaceC9324c<? super Offset> interfaceC9324c) {
            return ((C13152) create(Offset.m24024boximpl(j10), interfaceC9324c)).invokeSuspend(C8736p.f16368a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM17291f = AbstractC9434a.m17291f();
            int i10 = this.label;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9079b.m15926b(obj);
                return obj;
            }
            AbstractC9079b.m15926b(obj);
            long j10 = this.J$0;
            ScrollingLogic scrollingLogic = ScrollableNode.this.scrollingLogic;
            this.label = 1;
            Object objM20626semanticsScrollByd4ec7I = ScrollableKt.m20626semanticsScrollByd4ec7I(scrollingLogic, j10, this);
            return objM20626semanticsScrollByd4ec7I == objM17291f ? objM17291f : objM20626semanticsScrollByd4ec7I;
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
        ScrollingLogic scrollingLogic = new ScrollingLogic(scrollableState, overscrollEffect2, r14 == 0 ? defaultFlingBehavior : r14, orientation, z11, nestedScrollDispatcher, new InterfaceC10559a() { // from class: androidx.compose.foundation.gestures.ScrollableNode$scrollingLogic$1
            {
                super(0);
            }

            @Override // p300x7.InterfaceC10559a
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
        delegate(FocusTargetModifierNodeKt.m23950FocusTargetModifierNodePYyLHbc$default(Focusability.Companion.m23972getNeverLCbbffg(), null, 2, null));
        delegate(new BringIntoViewResponderNode(contentInViewNode));
        delegate(new FocusedBoundsObserverNode(new InterfaceC10570l() { // from class: androidx.compose.foundation.gestures.ScrollableNode.1
            {
                super(1);
            }

            @Override // p300x7.InterfaceC10570l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((LayoutCoordinates) obj);
                return C8736p.f16368a;
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
            this.mouseWheelScrollingLogic = new MouseWheelScrollingLogic(this.scrollingLogic, AndroidScrollable_androidKt.platformScrollConfig(this), new C13121(this), DelegatableNodeKt.requireDensity(this));
        }
        MouseWheelScrollingLogic mouseWheelScrollingLogic = this.mouseWheelScrollingLogic;
        if (mouseWheelScrollingLogic != null) {
            mouseWheelScrollingLogic.startReceivingMouseWheelEvents(getCoroutineScope());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ Object ensureMouseWheelScrollNodeInitialized$onWheelScrollStopped(ScrollableNode scrollableNode, long j10, InterfaceC9324c interfaceC9324c) {
        scrollableNode.m20629onWheelScrollStoppedTH1AsA0(j10);
        return C8736p.f16368a;
    }

    /* renamed from: onWheelScrollStopped-TH1AsA0, reason: not valid java name */
    private final void m20629onWheelScrollStoppedTH1AsA0(long j10) {
        AbstractC8839h.m14861d(this.nestedScrollDispatcher.getCoroutineScope(), null, null, new ScrollableNode$onWheelScrollStopped$1(this, j10, null), 3, null);
    }

    private final void setScrollSemanticsActions() {
        this.scrollByAction = new InterfaceC10574p() { // from class: androidx.compose.foundation.gestures.ScrollableNode.setScrollSemanticsActions.1

            @InterfaceC9539d(m17800c = "androidx.compose.foundation.gestures.ScrollableNode$setScrollSemanticsActions$1$1", m17801f = "Scrollable.kt", m17802l = {518}, m17803m = "invokeSuspend")
            /* renamed from: androidx.compose.foundation.gestures.ScrollableNode$setScrollSemanticsActions$1$1, reason: invalid class name */
            public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC10574p {

                /* renamed from: $x */
                final /* synthetic */ float f1150$x;

                /* renamed from: $y */
                final /* synthetic */ float f1151$y;
                int label;
                final /* synthetic */ ScrollableNode this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass1(ScrollableNode scrollableNode, float f10, float f11, InterfaceC9324c<? super AnonymousClass1> interfaceC9324c) {
                    super(2, interfaceC9324c);
                    this.this$0 = scrollableNode;
                    this.f1150$x = f10;
                    this.f1151$y = f11;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final InterfaceC9324c<C8736p> create(Object obj, InterfaceC9324c<?> interfaceC9324c) {
                    return new AnonymousClass1(this.this$0, this.f1150$x, this.f1151$y, interfaceC9324c);
                }

                @Override // p300x7.InterfaceC10574p
                public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c<? super C8736p> interfaceC9324c) {
                    return ((AnonymousClass1) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) throws Throwable {
                    Object objM17291f = AbstractC9434a.m17291f();
                    int i10 = this.label;
                    if (i10 == 0) {
                        AbstractC9079b.m15926b(obj);
                        ScrollingLogic scrollingLogic = this.this$0.scrollingLogic;
                        float f10 = this.f1150$x;
                        float f11 = this.f1151$y;
                        long jM24027constructorimpl = Offset.m24027constructorimpl((Float.floatToRawIntBits(f10) << 32) | (Float.floatToRawIntBits(f11) & 4294967295L));
                        this.label = 1;
                        if (ScrollableKt.m20626semanticsScrollByd4ec7I(scrollingLogic, jM24027constructorimpl, this) == objM17291f) {
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

            {
                super(2);
            }

            @Override // p300x7.InterfaceC10574p
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                return invoke(((Number) obj).floatValue(), ((Number) obj2).floatValue());
            }

            public final Boolean invoke(float f10, float f11) {
                AbstractC8839h.m14861d(ScrollableNode.this.getCoroutineScope(), null, null, new AnonymousClass1(ScrollableNode.this, f10, f11, null), 3, null);
                return Boolean.TRUE;
            }
        };
        this.scrollByOffsetAction = new C13152(null);
    }

    private final void updateDefaultFlingBehavior() {
        if (isAttached()) {
            this.defaultFlingBehavior.updateDensity(DelegatableNodeKt.requireDensity(this));
        }
    }

    @Override // androidx.compose.p013ui.node.SemanticsModifierNode
    public void applySemantics(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        if (getEnabled() && (this.scrollByAction == null || this.scrollByOffsetAction == null)) {
            setScrollSemanticsActions();
        }
        InterfaceC10574p interfaceC10574p = this.scrollByAction;
        if (interfaceC10574p != null) {
            SemanticsPropertiesKt.scrollBy$default(semanticsPropertyReceiver, null, interfaceC10574p, 1, null);
        }
        InterfaceC10574p interfaceC10574p2 = this.scrollByOffsetAction;
        if (interfaceC10574p2 != null) {
            SemanticsPropertiesKt.scrollByOffset(semanticsPropertyReceiver, interfaceC10574p2);
        }
    }

    @Override // androidx.compose.foundation.gestures.DragGestureNode
    public Object drag(InterfaceC10574p interfaceC10574p, InterfaceC9324c<? super C8736p> interfaceC9324c) {
        ScrollingLogic scrollingLogic = this.scrollingLogic;
        Object objScroll = scrollingLogic.scroll(MutatePriority.UserInput, new ScrollableNode$drag$2$1(interfaceC10574p, scrollingLogic, null), interfaceC9324c);
        return objScroll == AbstractC9434a.m17291f() ? objScroll : C8736p.f16368a;
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

    @Override // androidx.compose.p013ui.node.DelegatableNode, androidx.compose.p013ui.node.PointerInputModifierNode
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
    public void mo20515onDragStartedk4lQ0M(long j10) {
    }

    @Override // androidx.compose.foundation.gestures.DragGestureNode
    /* renamed from: onDragStopped-TH1AsA0 */
    public void mo20516onDragStoppedTH1AsA0(long j10) {
        AbstractC8839h.m14861d(this.nestedScrollDispatcher.getCoroutineScope(), null, null, new ScrollableNode$onDragStopped$1(this, j10, null), 3, null);
    }

    @Override // androidx.compose.p013ui.input.key.KeyInputModifierNode
    /* renamed from: onKeyEvent-ZmokQxo */
    public boolean mo20317onKeyEventZmokQxo(KeyEvent keyEvent) {
        long jM24027constructorimpl;
        if (!getEnabled()) {
            return false;
        }
        long jM25357getKeyZmokQxo = KeyEvent_androidKt.m25357getKeyZmokQxo(keyEvent);
        Key.Companion companion = Key.Companion;
        if ((!Key.m25049equalsimpl0(jM25357getKeyZmokQxo, companion.m25237getPageDownEK5gGoQ()) && !Key.m25049equalsimpl0(KeyEvent_androidKt.m25357getKeyZmokQxo(keyEvent), companion.m25238getPageUpEK5gGoQ())) || !KeyEventType.m25350equalsimpl0(KeyEvent_androidKt.m25358getTypeZmokQxo(keyEvent), KeyEventType.Companion.m25354getKeyDownCS__XNY()) || KeyEvent_androidKt.m25361isCtrlPressedZmokQxo(keyEvent)) {
            return false;
        }
        if (this.scrollingLogic.isVertical()) {
            int iM20530getViewportSizeYbymL2g$foundation_release = (int) (this.contentInViewNode.m20530getViewportSizeYbymL2g$foundation_release() & 4294967295L);
            jM24027constructorimpl = Offset.m24027constructorimpl((Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(Key.m25049equalsimpl0(KeyEvent_androidKt.m25357getKeyZmokQxo(keyEvent), companion.m25238getPageUpEK5gGoQ()) ? iM20530getViewportSizeYbymL2g$foundation_release : -iM20530getViewportSizeYbymL2g$foundation_release) & 4294967295L));
        } else {
            int iM20530getViewportSizeYbymL2g$foundation_release2 = (int) (this.contentInViewNode.m20530getViewportSizeYbymL2g$foundation_release() >> 32);
            jM24027constructorimpl = Offset.m24027constructorimpl((Float.floatToRawIntBits(0.0f) & 4294967295L) | (Float.floatToRawIntBits(Key.m25049equalsimpl0(KeyEvent_androidKt.m25357getKeyZmokQxo(keyEvent), companion.m25238getPageUpEK5gGoQ()) ? iM20530getViewportSizeYbymL2g$foundation_release2 : -iM20530getViewportSizeYbymL2g$foundation_release2) << 32));
        }
        AbstractC8839h.m14861d(getCoroutineScope(), null, null, new ScrollableNode$onKeyEvent$1(this, jM24027constructorimpl, null), 3, null);
        return true;
    }

    @Override // androidx.compose.foundation.gestures.DragGestureNode, androidx.compose.p013ui.node.PointerInputModifierNode
    /* renamed from: onPointerEvent-H0pRuoY */
    public void mo20318onPointerEventH0pRuoY(PointerEvent pointerEvent, PointerEventPass pointerEventPass, long j10) {
        List<PointerInputChange> changes = pointerEvent.getChanges();
        int size = changes.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                break;
            }
            if (((Boolean) getCanDrag().invoke(changes.get(i10))).booleanValue()) {
                super.mo20318onPointerEventH0pRuoY(pointerEvent, pointerEventPass, j10);
                break;
            }
            i10++;
        }
        if (getEnabled()) {
            if (pointerEventPass == PointerEventPass.Initial && PointerEventType.m25451equalsimpl0(pointerEvent.m25444getType7fucELk(), PointerEventType.Companion.m25460getScroll7fucELk())) {
                ensureMouseWheelScrollNodeInitialized();
            }
            MouseWheelScrollingLogic mouseWheelScrollingLogic = this.mouseWheelScrollingLogic;
            if (mouseWheelScrollingLogic != null) {
                mouseWheelScrollingLogic.m20592onPointerEventH0pRuoY(pointerEvent, pointerEventPass, j10);
            }
        }
    }

    @Override // androidx.compose.p013ui.input.key.KeyInputModifierNode
    /* renamed from: onPreKeyEvent-ZmokQxo */
    public boolean mo20319onPreKeyEventZmokQxo(KeyEvent keyEvent) {
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
