package androidx.compose.foundation;

import androidx.compose.foundation.interaction.FocusInteraction;
import androidx.compose.foundation.interaction.Interaction;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.p013ui.focus.FocusState;
import androidx.compose.p013ui.focus.FocusTargetModifierNode;
import androidx.compose.p013ui.focus.FocusTargetModifierNodeKt;
import androidx.compose.p013ui.focus.Focusability;
import androidx.compose.p013ui.layout.LayoutCoordinates;
import androidx.compose.p013ui.layout.PinnableContainer;
import androidx.compose.p013ui.layout.PinnableContainerKt;
import androidx.compose.p013ui.node.CompositionLocalConsumerModifierNode;
import androidx.compose.p013ui.node.CompositionLocalConsumerModifierNodeKt;
import androidx.compose.p013ui.node.DelegatingNode;
import androidx.compose.p013ui.node.GlobalPositionAwareModifierNode;
import androidx.compose.p013ui.node.ObserverModifierNode;
import androidx.compose.p013ui.node.ObserverModifierNodeKt;
import androidx.compose.p013ui.node.SemanticsModifierNode;
import androidx.compose.p013ui.node.SemanticsModifierNodeKt;
import androidx.compose.p013ui.node.TraversableNode;
import androidx.compose.p013ui.node.TraversableNodeKt;
import androidx.compose.p013ui.relocation.BringIntoViewModifierNodeKt;
import androidx.compose.p013ui.semantics.SemanticsPropertiesKt;
import androidx.compose.p013ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.runtime.internal.StabilityInferred;
import com.tencent.smtt.sdk.TbsListener;
import kotlin.AbstractC9079b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.InterfaceC9212n;
import p123h7.C8736p;
import p135i8.AbstractC8839h;
import p135i8.InterfaceC8822b0;
import p135i8.InterfaceC8849k0;
import p179m7.InterfaceC9324c;
import p190n7.AbstractC9434a;
import p201o7.InterfaceC9539d;
import p300x7.InterfaceC10559a;
import p300x7.InterfaceC10570l;
import p300x7.InterfaceC10574p;

@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class FocusableNode extends DelegatingNode implements SemanticsModifierNode, GlobalPositionAwareModifierNode, CompositionLocalConsumerModifierNode, ObserverModifierNode, TraversableNode {
    private final FocusTargetModifierNode focusTargetNode;
    private FocusInteraction.Focus focusedInteraction;
    private LayoutCoordinates globalLayoutCoordinates;
    private MutableInteractionSource interactionSource;
    private final InterfaceC10570l onFocusChange;
    private PinnableContainer.PinnedHandle pinnedHandle;
    private InterfaceC10559a requestFocus;
    private final boolean shouldAutoInvalidate;
    private static final TraverseKey TraverseKey = new TraverseKey(null);
    public static final int $stable = 8;

    public static final class TraverseKey {
        public /* synthetic */ TraverseKey(AbstractC9126n abstractC9126n) {
            this();
        }

        private TraverseKey() {
        }
    }

    @InterfaceC9539d(m17800c = "androidx.compose.foundation.FocusableNode$emitWithFallback$1", m17801f = "Focusable.kt", m17802l = {314}, m17803m = "invokeSuspend")
    /* renamed from: androidx.compose.foundation.FocusableNode$emitWithFallback$1 */
    public static final class C11771 extends SuspendLambda implements InterfaceC10574p {
        final /* synthetic */ InterfaceC8849k0 $handler;
        final /* synthetic */ Interaction $interaction;
        final /* synthetic */ MutableInteractionSource $this_emitWithFallback;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C11771(MutableInteractionSource mutableInteractionSource, Interaction interaction, InterfaceC8849k0 interfaceC8849k0, InterfaceC9324c<? super C11771> interfaceC9324c) {
            super(2, interfaceC9324c);
            this.$this_emitWithFallback = mutableInteractionSource;
            this.$interaction = interaction;
            this.$handler = interfaceC8849k0;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC9324c<C8736p> create(Object obj, InterfaceC9324c<?> interfaceC9324c) {
            return new C11771(this.$this_emitWithFallback, this.$interaction, this.$handler, interfaceC9324c);
        }

        @Override // p300x7.InterfaceC10574p
        public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c<? super C8736p> interfaceC9324c) {
            return ((C11771) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM17291f = AbstractC9434a.m17291f();
            int i10 = this.label;
            if (i10 == 0) {
                AbstractC9079b.m15926b(obj);
                MutableInteractionSource mutableInteractionSource = this.$this_emitWithFallback;
                Interaction interaction = this.$interaction;
                this.label = 1;
                if (mutableInteractionSource.emit(interaction, this) == objM17291f) {
                    return objM17291f;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9079b.m15926b(obj);
            }
            InterfaceC8849k0 interfaceC8849k0 = this.$handler;
            if (interfaceC8849k0 != null) {
                interfaceC8849k0.dispose();
            }
            return C8736p.f16368a;
        }
    }

    @InterfaceC9539d(m17800c = "androidx.compose.foundation.FocusableNode$onFocusStateChange$1", m17801f = "Focusable.kt", m17802l = {TbsListener.ErrorCode.COPY_TMPDIR_ERROR}, m17803m = "invokeSuspend")
    /* renamed from: androidx.compose.foundation.FocusableNode$onFocusStateChange$1 */
    public static final class C11781 extends SuspendLambda implements InterfaceC10574p {
        int label;

        public C11781(InterfaceC9324c<? super C11781> interfaceC9324c) {
            super(2, interfaceC9324c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC9324c<C8736p> create(Object obj, InterfaceC9324c<?> interfaceC9324c) {
            return FocusableNode.this.new C11781(interfaceC9324c);
        }

        @Override // p300x7.InterfaceC10574p
        public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c<? super C8736p> interfaceC9324c) {
            return ((C11781) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM17291f = AbstractC9434a.m17291f();
            int i10 = this.label;
            if (i10 == 0) {
                AbstractC9079b.m15926b(obj);
                FocusableNode focusableNode = FocusableNode.this;
                this.label = 1;
                if (BringIntoViewModifierNodeKt.bringIntoView$default(focusableNode, null, this, 1, null) == objM17291f) {
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

    public /* synthetic */ FocusableNode(MutableInteractionSource mutableInteractionSource, int i10, InterfaceC10570l interfaceC10570l, AbstractC9126n abstractC9126n) {
        this(mutableInteractionSource, i10, interfaceC10570l);
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
            InterfaceC9212n interfaceC9212n = (InterfaceC9212n) getCoroutineScope().getCoroutineContext().get(InterfaceC9212n.f18095c0);
            AbstractC8839h.m14861d(getCoroutineScope(), null, null, new C11771(mutableInteractionSource, interaction, interfaceC9212n != null ? interfaceC9212n.mo16287k(new InterfaceC10570l() { // from class: androidx.compose.foundation.FocusableNode$emitWithFallback$handler$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // p300x7.InterfaceC10570l
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((Throwable) obj);
                    return C8736p.f16368a;
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
            AbstractC9133u.m16130d(layoutCoordinates);
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
            InterfaceC10570l interfaceC10570l = this.onFocusChange;
            if (interfaceC10570l != null) {
                interfaceC10570l.invoke(Boolean.valueOf(zIsFocused));
            }
            if (zIsFocused) {
                AbstractC8839h.m14861d(getCoroutineScope(), null, null, new C11781(null), 3, null);
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
        ObserverModifierNodeKt.observeReads(this, new InterfaceC10559a() { // from class: androidx.compose.foundation.FocusableNode.retrievePinnableContainer.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // p300x7.InterfaceC10559a
            public /* bridge */ /* synthetic */ Object invoke() {
                m20405invoke();
                return C8736p.f16368a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m20405invoke() {
                ref$ObjectRef.f17473a = CompositionLocalConsumerModifierNodeKt.currentValueOf(this, PinnableContainerKt.getLocalPinnableContainer());
            }
        });
        return (PinnableContainer) ref$ObjectRef.f17473a;
    }

    @Override // androidx.compose.p013ui.node.SemanticsModifierNode
    public void applySemantics(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        SemanticsPropertiesKt.setFocused(semanticsPropertyReceiver, this.focusTargetNode.getFocusState().isFocused());
        if (this.requestFocus == null) {
            this.requestFocus = new InterfaceC10559a() { // from class: androidx.compose.foundation.FocusableNode.applySemantics.1
                {
                    super(0);
                }

                @Override // p300x7.InterfaceC10559a
                public final Boolean invoke() {
                    return Boolean.valueOf(FocusTargetModifierNode.m23945requestFocus3ESFkO8$default(FocusableNode.this.focusTargetNode, 0, 1, null));
                }
            };
        }
        SemanticsPropertiesKt.requestFocus$default(semanticsPropertyReceiver, null, this.requestFocus, 1, null);
    }

    @Override // androidx.compose.ui.Modifier.Node
    public boolean getShouldAutoInvalidate() {
        return this.shouldAutoInvalidate;
    }

    @Override // androidx.compose.p013ui.node.TraversableNode
    public Object getTraverseKey() {
        return TraverseKey;
    }

    @Override // androidx.compose.p013ui.node.GlobalPositionAwareModifierNode
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

    @Override // androidx.compose.p013ui.node.ObserverModifierNode
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
        if (AbstractC9133u.m16128b(this.interactionSource, mutableInteractionSource)) {
            return;
        }
        disposeInteractionSource();
        this.interactionSource = mutableInteractionSource;
    }

    public /* synthetic */ FocusableNode(MutableInteractionSource mutableInteractionSource, int i10, InterfaceC10570l interfaceC10570l, int i11, AbstractC9126n abstractC9126n) {
        this(mutableInteractionSource, (i11 & 2) != 0 ? Focusability.Companion.m23971getAlwaysLCbbffg() : i10, (i11 & 4) != 0 ? null : interfaceC10570l, null);
    }

    private FocusableNode(MutableInteractionSource mutableInteractionSource, int i10, InterfaceC10570l interfaceC10570l) {
        this.interactionSource = mutableInteractionSource;
        this.onFocusChange = interfaceC10570l;
        this.focusTargetNode = (FocusTargetModifierNode) delegate(FocusTargetModifierNodeKt.m23949FocusTargetModifierNodePYyLHbc(i10, new FocusableNode$focusTargetNode$1(this)));
    }
}
