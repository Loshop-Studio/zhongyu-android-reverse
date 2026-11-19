package androidx.compose.foundation;

import androidx.compose.foundation.interaction.FocusInteraction;
import androidx.compose.foundation.interaction.Interaction;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.p011ui.focus.FocusState;
import androidx.compose.p011ui.focus.FocusTargetModifierNode;
import androidx.compose.p011ui.focus.FocusTargetModifierNodeKt;
import androidx.compose.p011ui.focus.Focusability;
import androidx.compose.p011ui.layout.LayoutCoordinates;
import androidx.compose.p011ui.layout.PinnableContainer;
import androidx.compose.p011ui.layout.PinnableContainerKt;
import androidx.compose.p011ui.node.CompositionLocalConsumerModifierNode;
import androidx.compose.p011ui.node.CompositionLocalConsumerModifierNodeKt;
import androidx.compose.p011ui.node.DelegatingNode;
import androidx.compose.p011ui.node.GlobalPositionAwareModifierNode;
import androidx.compose.p011ui.node.ObserverModifierNode;
import androidx.compose.p011ui.node.ObserverModifierNodeKt;
import androidx.compose.p011ui.node.SemanticsModifierNode;
import androidx.compose.p011ui.node.SemanticsModifierNodeKt;
import androidx.compose.p011ui.node.TraversableNode;
import androidx.compose.p011ui.node.TraversableNodeKt;
import androidx.compose.p011ui.relocation.BringIntoViewModifierNodeKt;
import androidx.compose.p011ui.semantics.SemanticsPropertiesKt;
import androidx.compose.p011ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.AbstractC5774b;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC5824e;
import kotlin.jvm.internal.AbstractC5830k;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.AbstractC6014x;
import kotlinx.coroutines.C6010v0;
import kotlinx.coroutines.InterfaceC5962g0;
import kotlinx.coroutines.InterfaceC6009v;
import kotlinx.coroutines.InterfaceC6013w0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p045d6.C5443s;
import p075h6.InterfaceC5631c;
import p152r6.InterfaceC6469a;
import p152r6.InterfaceC6471c;
import p152r6.InterfaceC6473e;

@StabilityInferred(parameters = 0)
@Metadata(m5109d1 = {"\u0000\u0090\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0000\u0018\u0000 J2\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u0006:\u0001JB3\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\u0016\b\u0002\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0018\u00010\u000b¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0011\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001c\u001a\u00020\r2\u0006\u0010\u001b\u001a\u00020\fH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u001e\u0010\u001aJ\u001b\u0010!\u001a\u00020\r*\u00020\u00072\u0006\u0010 \u001a\u00020\u001fH\u0002¢\u0006\u0004\b!\u0010\"J\u0017\u0010#\u001a\u00020\r2\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b#\u0010$J\u0013\u0010&\u001a\u00020\r*\u00020%H\u0016¢\u0006\u0004\b&\u0010'J\u000f\u0010(\u001a\u00020\rH\u0016¢\u0006\u0004\b(\u0010\u001aJ\u000f\u0010)\u001a\u00020\rH\u0016¢\u0006\u0004\b)\u0010\u001aJ\u0017\u0010,\u001a\u00020\r2\u0006\u0010+\u001a\u00020*H\u0016¢\u0006\u0004\b,\u0010-R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010.R\"\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0018\u00010\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010/R\u001a\u00100\u001a\u00020\f8\u0016X\u0096D¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103R\u0018\u00105\u001a\u0004\u0018\u0001048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u00106R\u0018\u00108\u001a\u0004\u0018\u0001078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u00109R\u0018\u0010:\u001a\u0004\u0018\u00010*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u0010;R\u0014\u0010=\u001a\u00020<8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010>R\u001e\u0010@\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010?8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b@\u0010AR\u0016\u0010E\u001a\u0004\u0018\u00010B8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bC\u0010DR\u0014\u0010I\u001a\u00020F8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bG\u0010H¨\u0006K"}, m5110d2 = {"Landroidx/compose/foundation/FocusableNode;", "Landroidx/compose/ui/node/DelegatingNode;", "Landroidx/compose/ui/node/SemanticsModifierNode;", "Landroidx/compose/ui/node/GlobalPositionAwareModifierNode;", "Landroidx/compose/ui/node/CompositionLocalConsumerModifierNode;", "Landroidx/compose/ui/node/ObserverModifierNode;", "Landroidx/compose/ui/node/TraversableNode;", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "interactionSource", "Landroidx/compose/ui/focus/Focusability;", "focusability", "Lkotlin/Function1;", "", "Ld6/s;", "onFocusChange", "<init>", "(Landroidx/compose/foundation/interaction/MutableInteractionSource;ILr6/c;Lkotlin/jvm/internal/e;)V", "Landroidx/compose/ui/focus/FocusState;", "previousState", "currentState", "onFocusStateChange", "(Landroidx/compose/ui/focus/FocusState;Landroidx/compose/ui/focus/FocusState;)V", "Landroidx/compose/ui/layout/PinnableContainer;", "retrievePinnableContainer", "()Landroidx/compose/ui/layout/PinnableContainer;", "notifyObserverWhenAttached", "()V", "isFocused", "emitInteraction", "(Z)V", "disposeInteractionSource", "Landroidx/compose/foundation/interaction/Interaction;", "interaction", "emitWithFallback", "(Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/foundation/interaction/Interaction;)V", "update", "(Landroidx/compose/foundation/interaction/MutableInteractionSource;)V", "Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;", "applySemantics", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)V", "onReset", "onObservedReadsChanged", "Landroidx/compose/ui/layout/LayoutCoordinates;", "coordinates", "onGloballyPositioned", "(Landroidx/compose/ui/layout/LayoutCoordinates;)V", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "Lr6/c;", "shouldAutoInvalidate", "Z", "getShouldAutoInvalidate", "()Z", "Landroidx/compose/foundation/interaction/FocusInteraction$Focus;", "focusedInteraction", "Landroidx/compose/foundation/interaction/FocusInteraction$Focus;", "Landroidx/compose/ui/layout/PinnableContainer$PinnedHandle;", "pinnedHandle", "Landroidx/compose/ui/layout/PinnableContainer$PinnedHandle;", "globalLayoutCoordinates", "Landroidx/compose/ui/layout/LayoutCoordinates;", "Landroidx/compose/ui/focus/FocusTargetModifierNode;", "focusTargetNode", "Landroidx/compose/ui/focus/FocusTargetModifierNode;", "Lkotlin/Function0;", "requestFocus", "Lr6/a;", "Landroidx/compose/foundation/FocusedBoundsObserverNode;", "getFocusedBoundsObserver", "()Landroidx/compose/foundation/FocusedBoundsObserverNode;", "focusedBoundsObserver", "", "getTraverseKey", "()Ljava/lang/Object;", "traverseKey", "TraverseKey", "foundation_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
public final class FocusableNode extends DelegatingNode implements SemanticsModifierNode, GlobalPositionAwareModifierNode, CompositionLocalConsumerModifierNode, ObserverModifierNode, TraversableNode {

    @NotNull
    private final FocusTargetModifierNode focusTargetNode;

    @Nullable
    private FocusInteraction.Focus focusedInteraction;

    @Nullable
    private LayoutCoordinates globalLayoutCoordinates;

    @Nullable
    private MutableInteractionSource interactionSource;

    @Nullable
    private final InterfaceC6471c onFocusChange;

    @Nullable
    private PinnableContainer.PinnedHandle pinnedHandle;

    @Nullable
    private InterfaceC6469a requestFocus;
    private final boolean shouldAutoInvalidate;

    @NotNull
    private static final TraverseKey TraverseKey = new TraverseKey(null);
    public static final int $stable = 8;

    @Metadata(m5109d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m5110d2 = {"Landroidx/compose/foundation/FocusableNode$TraverseKey;", "", "()V", "foundation_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class TraverseKey {
        public /* synthetic */ TraverseKey(AbstractC5824e abstractC5824e) {
            this();
        }

        private TraverseKey() {
        }
    }

    @Metadata(m5109d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m5110d2 = {"Lkotlinx/coroutines/v;", "Ld6/s;", "<anonymous>", "(Lkotlinx/coroutines/v;)V"}, m5111k = 3, m5112mv = {1, 9, 0})
    @DebugMetadata(m5302c = "androidx.compose.foundation.FocusableNode$emitWithFallback$1", m5303f = "Focusable.kt", m5304i = {}, m5305l = {314}, m5306m = "invokeSuspend", m5307n = {}, m5308s = {})
    /* renamed from: androidx.compose.foundation.FocusableNode$emitWithFallback$1 */
    public static final class C07681 extends SuspendLambda implements InterfaceC6473e {
        final /* synthetic */ InterfaceC5962g0 $handler;
        final /* synthetic */ Interaction $interaction;
        final /* synthetic */ MutableInteractionSource $this_emitWithFallback;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C07681(MutableInteractionSource mutableInteractionSource, Interaction interaction, InterfaceC5962g0 interfaceC5962g0, InterfaceC5631c<? super C07681> interfaceC5631c) {
            super(2, interfaceC5631c);
            this.$this_emitWithFallback = mutableInteractionSource;
            this.$interaction = interaction;
            this.$handler = interfaceC5962g0;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC5631c<C5443s> create(Object obj, InterfaceC5631c<?> interfaceC5631c) {
            return new C07681(this.$this_emitWithFallback, this.$interaction, this.$handler, interfaceC5631c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                AbstractC5774b.m5119b(obj);
                MutableInteractionSource mutableInteractionSource = this.$this_emitWithFallback;
                Interaction interaction = this.$interaction;
                this.label = 1;
                if (mutableInteractionSource.emit(interaction, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC5774b.m5119b(obj);
            }
            InterfaceC5962g0 interfaceC5962g0 = this.$handler;
            if (interfaceC5962g0 != null) {
                interfaceC5962g0.dispose();
            }
            return C5443s.f8405a;
        }

        @Override // p152r6.InterfaceC6473e
        public final Object invoke(InterfaceC6009v interfaceC6009v, InterfaceC5631c<? super C5443s> interfaceC5631c) {
            return ((C07681) create(interfaceC6009v, interfaceC5631c)).invokeSuspend(C5443s.f8405a);
        }
    }

    @Metadata(m5109d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m5110d2 = {"Lkotlinx/coroutines/v;", "Ld6/s;", "<anonymous>", "(Lkotlinx/coroutines/v;)V"}, m5111k = 3, m5112mv = {1, 9, 0})
    @DebugMetadata(m5302c = "androidx.compose.foundation.FocusableNode$onFocusStateChange$1", m5303f = "Focusable.kt", m5304i = {}, m5305l = {214}, m5306m = "invokeSuspend", m5307n = {}, m5308s = {})
    /* renamed from: androidx.compose.foundation.FocusableNode$onFocusStateChange$1 */
    public static final class C07691 extends SuspendLambda implements InterfaceC6473e {
        int label;

        public C07691(InterfaceC5631c<? super C07691> interfaceC5631c) {
            super(2, interfaceC5631c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC5631c<C5443s> create(Object obj, InterfaceC5631c<?> interfaceC5631c) {
            return FocusableNode.this.new C07691(interfaceC5631c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                AbstractC5774b.m5119b(obj);
                FocusableNode focusableNode = FocusableNode.this;
                this.label = 1;
                if (BringIntoViewModifierNodeKt.bringIntoView$default(focusableNode, null, this, 1, null) == coroutineSingletons) {
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
            return ((C07691) create(interfaceC6009v, interfaceC5631c)).invokeSuspend(C5443s.f8405a);
        }
    }

    public /* synthetic */ FocusableNode(MutableInteractionSource mutableInteractionSource, int i, InterfaceC6471c interfaceC6471c, AbstractC5824e abstractC5824e) {
        this(mutableInteractionSource, i, interfaceC6471c);
    }

    private final void disposeInteractionSource() {
        FocusInteraction.Focus focus;
        MutableInteractionSource mutableInteractionSource = this.interactionSource;
        if (mutableInteractionSource != null && (focus = this.focusedInteraction) != null) {
            mutableInteractionSource.tryEmit(new FocusInteraction.Unfocus(focus));
        }
        this.focusedInteraction = null;
    }

    private final void emitInteraction(boolean isFocused) {
        MutableInteractionSource mutableInteractionSource = this.interactionSource;
        if (mutableInteractionSource != null) {
            if (!isFocused) {
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
        if (!getIsAttached()) {
            mutableInteractionSource.tryEmit(interaction);
        } else {
            InterfaceC6013w0 interfaceC6013w0 = (InterfaceC6013w0) getCoroutineScope().getCoroutineContext().get(C6010v0.f9513a);
            AbstractC6014x.m5651v(getCoroutineScope(), null, null, new C07681(mutableInteractionSource, interaction, interfaceC6013w0 != null ? interfaceC6013w0.mo5459h(new InterfaceC6471c() { // from class: androidx.compose.foundation.FocusableNode$emitWithFallback$handler$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // p152r6.InterfaceC6471c
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((Throwable) obj);
                    return C5443s.f8405a;
                }

                public final void invoke(Throwable th) {
                    mutableInteractionSource.tryEmit(interaction);
                }
            }) : null, null), 3);
        }
    }

    private final FocusedBoundsObserverNode getFocusedBoundsObserver() {
        if (getIsAttached()) {
            TraversableNode traversableNodeFindNearestAncestor = TraversableNodeKt.findNearestAncestor(this, FocusedBoundsObserverNode.INSTANCE);
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
            AbstractC5830k.m5327d(layoutCoordinates);
            if (!layoutCoordinates.isAttached() || (focusedBoundsObserver = getFocusedBoundsObserver()) == null) {
                return;
            }
            focusedBoundsObserver.onFocusBoundsChanged(this.globalLayoutCoordinates);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onFocusStateChange(FocusState previousState, FocusState currentState) {
        boolean zIsFocused;
        if (getIsAttached() && (zIsFocused = currentState.isFocused()) != previousState.isFocused()) {
            InterfaceC6471c interfaceC6471c = this.onFocusChange;
            if (interfaceC6471c != null) {
                interfaceC6471c.invoke(Boolean.valueOf(zIsFocused));
            }
            if (zIsFocused) {
                AbstractC6014x.m5651v(getCoroutineScope(), null, null, new C07691(null), 3);
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
        ObserverModifierNodeKt.observeReads(this, new InterfaceC6469a() { // from class: androidx.compose.foundation.FocusableNode.retrievePinnableContainer.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // p152r6.InterfaceC6469a
            public /* bridge */ /* synthetic */ Object invoke() {
                m6811invoke();
                return C5443s.f8405a;
            }

            /* JADX WARN: Type inference failed for: r1v1, types: [T, java.lang.Object] */
            /* renamed from: invoke, reason: collision with other method in class */
            public final void m6811invoke() {
                ref$ObjectRef.element = CompositionLocalConsumerModifierNodeKt.currentValueOf(this, PinnableContainerKt.getLocalPinnableContainer());
            }
        });
        return (PinnableContainer) ref$ObjectRef.element;
    }

    @Override // androidx.compose.p011ui.node.SemanticsModifierNode
    public void applySemantics(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver) {
        SemanticsPropertiesKt.setFocused(semanticsPropertyReceiver, this.focusTargetNode.getFocusState().isFocused());
        if (this.requestFocus == null) {
            this.requestFocus = new InterfaceC6469a() { // from class: androidx.compose.foundation.FocusableNode.applySemantics.1
                {
                    super(0);
                }

                @Override // p152r6.InterfaceC6469a
                public final Boolean invoke() {
                    return Boolean.valueOf(FocusTargetModifierNode.m10351requestFocus3ESFkO8$default(FocusableNode.this.focusTargetNode, 0, 1, null));
                }
            };
        }
        SemanticsPropertiesKt.requestFocus$default(semanticsPropertyReceiver, null, this.requestFocus, 1, null);
    }

    @Override // androidx.compose.ui.Modifier.Node
    public boolean getShouldAutoInvalidate() {
        return this.shouldAutoInvalidate;
    }

    @Override // androidx.compose.p011ui.node.TraversableNode
    @NotNull
    public Object getTraverseKey() {
        return TraverseKey;
    }

    @Override // androidx.compose.p011ui.node.GlobalPositionAwareModifierNode
    public void onGloballyPositioned(@NotNull LayoutCoordinates coordinates) {
        this.globalLayoutCoordinates = coordinates;
        if (this.focusTargetNode.getFocusState().isFocused()) {
            if (coordinates.isAttached()) {
                notifyObserverWhenAttached();
                return;
            }
            FocusedBoundsObserverNode focusedBoundsObserver = getFocusedBoundsObserver();
            if (focusedBoundsObserver != null) {
                focusedBoundsObserver.onFocusBoundsChanged(null);
            }
        }
    }

    @Override // androidx.compose.p011ui.node.ObserverModifierNode
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

    public final void update(@Nullable MutableInteractionSource interactionSource) {
        if (AbstractC5830k.m5325b(this.interactionSource, interactionSource)) {
            return;
        }
        disposeInteractionSource();
        this.interactionSource = interactionSource;
    }

    public /* synthetic */ FocusableNode(MutableInteractionSource mutableInteractionSource, int i, InterfaceC6471c interfaceC6471c, int i8, AbstractC5824e abstractC5824e) {
        this(mutableInteractionSource, (i8 & 2) != 0 ? Focusability.INSTANCE.m10377getAlwaysLCbbffg() : i, (i8 & 4) != 0 ? null : interfaceC6471c, null);
    }

    private FocusableNode(MutableInteractionSource mutableInteractionSource, int i, InterfaceC6471c interfaceC6471c) {
        this.interactionSource = mutableInteractionSource;
        this.onFocusChange = interfaceC6471c;
        this.focusTargetNode = (FocusTargetModifierNode) delegate(FocusTargetModifierNodeKt.m10355FocusTargetModifierNodePYyLHbc(i, new FocusableNode$focusTargetNode$1(this)));
    }
}
