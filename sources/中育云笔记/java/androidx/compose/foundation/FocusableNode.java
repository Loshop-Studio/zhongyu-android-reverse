package androidx.compose.foundation;

import androidx.compose.foundation.interaction.FocusInteraction;
import androidx.compose.foundation.interaction.Interaction;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.p014ui.focus.FocusState;
import androidx.compose.p014ui.focus.FocusTargetModifierNode;
import androidx.compose.p014ui.focus.FocusTargetModifierNodeKt;
import androidx.compose.p014ui.focus.Focusability;
import androidx.compose.p014ui.layout.LayoutCoordinates;
import androidx.compose.p014ui.layout.PinnableContainer;
import androidx.compose.p014ui.layout.PinnableContainerKt;
import androidx.compose.p014ui.node.CompositionLocalConsumerModifierNode;
import androidx.compose.p014ui.node.CompositionLocalConsumerModifierNodeKt;
import androidx.compose.p014ui.node.DelegatingNode;
import androidx.compose.p014ui.node.GlobalPositionAwareModifierNode;
import androidx.compose.p014ui.node.ObserverModifierNode;
import androidx.compose.p014ui.node.ObserverModifierNodeKt;
import androidx.compose.p014ui.node.SemanticsModifierNode;
import androidx.compose.p014ui.node.SemanticsModifierNodeKt;
import androidx.compose.p014ui.node.TraversableNode;
import androidx.compose.p014ui.node.TraversableNodeKt;
import androidx.compose.p014ui.relocation.BringIntoViewModifierNodeKt;
import androidx.compose.p014ui.semantics.SemanticsPropertiesKt;
import androidx.compose.p014ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.AbstractC9924b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.InterfaceC10045g;
import p181hd.InterfaceC9529a;
import p181hd.InterfaceC9540l;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import p393wc.AbstractC11725a;
import p409xc.InterfaceC11829d;
import sd.AbstractC11117h;
import sd.InterfaceC11122i0;
import sd.InterfaceC11163t0;
import vc.InterfaceC11588c;

@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class FocusableNode extends DelegatingNode implements SemanticsModifierNode, GlobalPositionAwareModifierNode, CompositionLocalConsumerModifierNode, ObserverModifierNode, TraversableNode {
    private final FocusTargetModifierNode focusTargetNode;
    private FocusInteraction.Focus focusedInteraction;
    private LayoutCoordinates globalLayoutCoordinates;
    private MutableInteractionSource interactionSource;
    private final InterfaceC9540l onFocusChange;
    private PinnableContainer.PinnedHandle pinnedHandle;
    private InterfaceC9529a requestFocus;
    private final boolean shouldAutoInvalidate;
    private static final TraverseKey TraverseKey = new TraverseKey(null);
    public static final int $stable = 8;

    public static final class TraverseKey {
        public /* synthetic */ TraverseKey(AbstractC9972n abstractC9972n) {
            this();
        }

        private TraverseKey() {
        }
    }

    @InterfaceC11829d(m26210c = "androidx.compose.foundation.FocusableNode$emitWithFallback$1", m26211f = "Focusable.kt", m26212l = {314}, m26213m = "invokeSuspend")
    /* renamed from: androidx.compose.foundation.FocusableNode$emitWithFallback$1 */
    public static final class C12071 extends SuspendLambda implements InterfaceC9544p {
        final /* synthetic */ InterfaceC11163t0 $handler;
        final /* synthetic */ Interaction $interaction;
        final /* synthetic */ MutableInteractionSource $this_emitWithFallback;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C12071(MutableInteractionSource mutableInteractionSource, Interaction interaction, InterfaceC11163t0 interfaceC11163t0, InterfaceC11588c<? super C12071> interfaceC11588c) {
            super(2, interfaceC11588c);
            this.$this_emitWithFallback = mutableInteractionSource;
            this.$interaction = interaction;
            this.$handler = interfaceC11163t0;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC11588c<C10786q> create(Object obj, InterfaceC11588c<?> interfaceC11588c) {
            return new C12071(this.$this_emitWithFallback, this.$interaction, this.$handler, interfaceC11588c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM25952f = AbstractC11725a.m25952f();
            int i10 = this.label;
            if (i10 == 0) {
                AbstractC9924b.m20071b(obj);
                MutableInteractionSource mutableInteractionSource = this.$this_emitWithFallback;
                Interaction interaction = this.$interaction;
                this.label = 1;
                if (mutableInteractionSource.emit(interaction, this) == objM25952f) {
                    return objM25952f;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9924b.m20071b(obj);
            }
            InterfaceC11163t0 interfaceC11163t0 = this.$handler;
            if (interfaceC11163t0 != null) {
                interfaceC11163t0.dispose();
            }
            return C10786q.f26013a;
        }

        @Override // p181hd.InterfaceC9544p
        public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c<? super C10786q> interfaceC11588c) {
            return ((C12071) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
        }
    }

    @InterfaceC11829d(m26210c = "androidx.compose.foundation.FocusableNode$onFocusStateChange$1", m26211f = "Focusable.kt", m26212l = {214}, m26213m = "invokeSuspend")
    /* renamed from: androidx.compose.foundation.FocusableNode$onFocusStateChange$1 */
    public static final class C12081 extends SuspendLambda implements InterfaceC9544p {
        int label;

        public C12081(InterfaceC11588c<? super C12081> interfaceC11588c) {
            super(2, interfaceC11588c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC11588c<C10786q> create(Object obj, InterfaceC11588c<?> interfaceC11588c) {
            return FocusableNode.this.new C12081(interfaceC11588c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM25952f = AbstractC11725a.m25952f();
            int i10 = this.label;
            if (i10 == 0) {
                AbstractC9924b.m20071b(obj);
                FocusableNode focusableNode = FocusableNode.this;
                this.label = 1;
                if (BringIntoViewModifierNodeKt.bringIntoView$default(focusableNode, null, this, 1, null) == objM25952f) {
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
            return ((C12081) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
        }
    }

    public /* synthetic */ FocusableNode(MutableInteractionSource mutableInteractionSource, int i10, InterfaceC9540l interfaceC9540l, AbstractC9972n abstractC9972n) {
        this(mutableInteractionSource, i10, interfaceC9540l);
    }

    private final void disposeInteractionSource() {
        FocusInteraction.Focus focus;
        MutableInteractionSource mutableInteractionSource = this.interactionSource;
        if (mutableInteractionSource != null && (focus = this.focusedInteraction) != null) {
            mutableInteractionSource.tryEmit(new FocusInteraction.Unfocus(focus));
        }
        this.focusedInteraction = null;
    }

    private final void emitInteraction(boolean z10) {
        MutableInteractionSource mutableInteractionSource = this.interactionSource;
        if (mutableInteractionSource != null) {
            if (!z10) {
                FocusInteraction.Focus focus = this.focusedInteraction;
                if (focus != null) {
                    emitWithFallback(mutableInteractionSource, new FocusInteraction.Unfocus(focus));
                    this.focusedInteraction = null;
                    return;
                }
                return;
            }
            FocusInteraction.Focus focus2 = this.focusedInteraction;
            if (focus2 != null) {
                emitWithFallback(mutableInteractionSource, new FocusInteraction.Unfocus(focus2));
                this.focusedInteraction = null;
            }
            FocusInteraction.Focus focus3 = new FocusInteraction.Focus();
            emitWithFallback(mutableInteractionSource, focus3);
            this.focusedInteraction = focus3;
        }
    }

    private final void emitWithFallback(final MutableInteractionSource mutableInteractionSource, final Interaction interaction) {
        if (!isAttached()) {
            mutableInteractionSource.tryEmit(interaction);
        } else {
            InterfaceC10045g interfaceC10045g = (InterfaceC10045g) getCoroutineScope().getCoroutineContext().get(InterfaceC10045g.f23976b0);
            AbstractC11117h.m24726d(getCoroutineScope(), null, null, new C12071(mutableInteractionSource, interaction, interfaceC10045g != null ? interfaceC10045g.mo20404A(new InterfaceC9540l() { // from class: androidx.compose.foundation.FocusableNode$emitWithFallback$handler$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // p181hd.InterfaceC9540l
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((Throwable) obj);
                    return C10786q.f26013a;
                }

                public final void invoke(Throwable th) {
                    mutableInteractionSource.tryEmit(interaction);
                }
            }) : null, null), 3, null);
        }
    }

    private final FocusedBoundsObserverNode getFocusedBoundsObserver() {
        if (isAttached()) {
            TraversableNode traversableNodeFindNearestAncestor = TraversableNodeKt.findNearestAncestor(this, FocusedBoundsObserverNode.TraverseKey);
            if (traversableNodeFindNearestAncestor instanceof FocusedBoundsObserverNode) {
                return (FocusedBoundsObserverNode) traversableNodeFindNearestAncestor;
            }
        }
        return null;
    }

    private final void notifyObserverWhenAttached() {
        FocusedBoundsObserverNode focusedBoundsObserver;
        LayoutCoordinates layoutCoordinates = this.globalLayoutCoordinates;
        if (layoutCoordinates != null) {
            AbstractC9979u.m20291d(layoutCoordinates);
            if (!layoutCoordinates.isAttached() || (focusedBoundsObserver = getFocusedBoundsObserver()) == null) {
                return;
            }
            focusedBoundsObserver.onFocusBoundsChanged(this.globalLayoutCoordinates);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onFocusStateChange(FocusState focusState, FocusState focusState2) {
        boolean zIsFocused;
        if (isAttached() && (zIsFocused = focusState2.isFocused()) != focusState.isFocused()) {
            InterfaceC9540l interfaceC9540l = this.onFocusChange;
            if (interfaceC9540l != null) {
                interfaceC9540l.invoke(Boolean.valueOf(zIsFocused));
            }
            if (zIsFocused) {
                AbstractC11117h.m24726d(getCoroutineScope(), null, null, new C12081(null), 3, null);
                PinnableContainer pinnableContainerRetrievePinnableContainer = retrievePinnableContainer();
                this.pinnedHandle = pinnableContainerRetrievePinnableContainer != null ? pinnableContainerRetrievePinnableContainer.pin() : null;
                notifyObserverWhenAttached();
            } else {
                PinnableContainer.PinnedHandle pinnedHandle = this.pinnedHandle;
                if (pinnedHandle != null) {
                    pinnedHandle.release();
                }
                this.pinnedHandle = null;
                FocusedBoundsObserverNode focusedBoundsObserver = getFocusedBoundsObserver();
                if (focusedBoundsObserver != null) {
                    focusedBoundsObserver.onFocusBoundsChanged(null);
                }
            }
            SemanticsModifierNodeKt.invalidateSemantics(this);
            emitInteraction(zIsFocused);
        }
    }

    private final PinnableContainer retrievePinnableContainer() {
        final Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        ObserverModifierNodeKt.observeReads(this, new InterfaceC9529a() { // from class: androidx.compose.foundation.FocusableNode.retrievePinnableContainer.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // p181hd.InterfaceC9529a
            public /* bridge */ /* synthetic */ Object invoke() {
                m27007invoke();
                return C10786q.f26013a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m27007invoke() {
                ref$ObjectRef.f23402c = CompositionLocalConsumerModifierNodeKt.currentValueOf(this, PinnableContainerKt.getLocalPinnableContainer());
            }
        });
        return (PinnableContainer) ref$ObjectRef.f23402c;
    }

    @Override // androidx.compose.p014ui.node.SemanticsModifierNode
    public void applySemantics(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        SemanticsPropertiesKt.setFocused(semanticsPropertyReceiver, this.focusTargetNode.getFocusState().isFocused());
        if (this.requestFocus == null) {
            this.requestFocus = new InterfaceC9529a() { // from class: androidx.compose.foundation.FocusableNode.applySemantics.1
                {
                    super(0);
                }

                @Override // p181hd.InterfaceC9529a
                public final Boolean invoke() {
                    return Boolean.valueOf(FocusTargetModifierNode.m30547requestFocus3ESFkO8$default(FocusableNode.this.focusTargetNode, 0, 1, null));
                }
            };
        }
        SemanticsPropertiesKt.requestFocus$default(semanticsPropertyReceiver, null, this.requestFocus, 1, null);
    }

    @Override // androidx.compose.ui.Modifier.Node
    public boolean getShouldAutoInvalidate() {
        return this.shouldAutoInvalidate;
    }

    @Override // androidx.compose.p014ui.node.TraversableNode
    public Object getTraverseKey() {
        return TraverseKey;
    }

    @Override // androidx.compose.p014ui.node.GlobalPositionAwareModifierNode
    public void onGloballyPositioned(LayoutCoordinates layoutCoordinates) {
        this.globalLayoutCoordinates = layoutCoordinates;
        if (this.focusTargetNode.getFocusState().isFocused()) {
            if (layoutCoordinates.isAttached()) {
                notifyObserverWhenAttached();
                return;
            }
            FocusedBoundsObserverNode focusedBoundsObserver = getFocusedBoundsObserver();
            if (focusedBoundsObserver != null) {
                focusedBoundsObserver.onFocusBoundsChanged(null);
            }
        }
    }

    @Override // androidx.compose.p014ui.node.ObserverModifierNode
    public void onObservedReadsChanged() {
        PinnableContainer pinnableContainerRetrievePinnableContainer = retrievePinnableContainer();
        if (this.focusTargetNode.getFocusState().isFocused()) {
            PinnableContainer.PinnedHandle pinnedHandle = this.pinnedHandle;
            if (pinnedHandle != null) {
                pinnedHandle.release();
            }
            this.pinnedHandle = pinnableContainerRetrievePinnableContainer != null ? pinnableContainerRetrievePinnableContainer.pin() : null;
        }
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onReset() {
        PinnableContainer.PinnedHandle pinnedHandle = this.pinnedHandle;
        if (pinnedHandle != null) {
            pinnedHandle.release();
        }
        this.pinnedHandle = null;
    }

    public final void update(MutableInteractionSource mutableInteractionSource) {
        if (AbstractC9979u.m20289b(this.interactionSource, mutableInteractionSource)) {
            return;
        }
        disposeInteractionSource();
        this.interactionSource = mutableInteractionSource;
    }

    public /* synthetic */ FocusableNode(MutableInteractionSource mutableInteractionSource, int i10, InterfaceC9540l interfaceC9540l, int i11, AbstractC9972n abstractC9972n) {
        this(mutableInteractionSource, (i11 & 2) != 0 ? Focusability.Companion.m30573getAlwaysLCbbffg() : i10, (i11 & 4) != 0 ? null : interfaceC9540l, null);
    }

    private FocusableNode(MutableInteractionSource mutableInteractionSource, int i10, InterfaceC9540l interfaceC9540l) {
        this.interactionSource = mutableInteractionSource;
        this.onFocusChange = interfaceC9540l;
        this.focusTargetNode = (FocusTargetModifierNode) delegate(FocusTargetModifierNodeKt.m30551FocusTargetModifierNodePYyLHbc(i10, new FocusableNode$focusTargetNode$1(this)));
    }
}
