package androidx.compose.p014ui;

import androidx.compose.p014ui.internal.InlineClassHelperKt;
import androidx.compose.p014ui.node.DelegatableNode;
import androidx.compose.p014ui.node.DelegatableNodeKt;
import androidx.compose.p014ui.node.NodeCoordinator;
import androidx.compose.p014ui.node.ObserverNodeOwnerScope;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlinx.coroutines.AbstractC10006d;
import kotlinx.coroutines.InterfaceC10045g;
import p181hd.InterfaceC9529a;
import p181hd.InterfaceC9540l;
import p181hd.InterfaceC9544p;
import sd.AbstractC11147o1;
import sd.InterfaceC11122i0;

@Stable
/* loaded from: classes2.dex */
public interface Modifier {
    public static final Companion Companion = Companion.$$INSTANCE;

    public static final class DefaultImpls {
        @Deprecated
        public static Modifier then(Modifier modifier, Modifier modifier2) {
            return Modifier.super.then(modifier2);
        }
    }

    public interface Element extends Modifier {

        public static final class DefaultImpls {
            @Deprecated
            public static boolean all(Element element, InterfaceC9540l interfaceC9540l) {
                return Element.super.all(interfaceC9540l);
            }

            @Deprecated
            public static boolean any(Element element, InterfaceC9540l interfaceC9540l) {
                return Element.super.any(interfaceC9540l);
            }

            @Deprecated
            public static <R> R foldIn(Element element, R r10, InterfaceC9544p interfaceC9544p) {
                return (R) Element.super.foldIn(r10, interfaceC9544p);
            }

            @Deprecated
            public static <R> R foldOut(Element element, R r10, InterfaceC9544p interfaceC9544p) {
                return (R) Element.super.foldOut(r10, interfaceC9544p);
            }

            @Deprecated
            public static Modifier then(Element element, Modifier modifier) {
                return Element.super.then(modifier);
            }
        }

        @Override // androidx.compose.p014ui.Modifier
        default boolean all(InterfaceC9540l interfaceC9540l) {
            return ((Boolean) interfaceC9540l.invoke(this)).booleanValue();
        }

        @Override // androidx.compose.p014ui.Modifier
        default boolean any(InterfaceC9540l interfaceC9540l) {
            return ((Boolean) interfaceC9540l.invoke(this)).booleanValue();
        }

        @Override // androidx.compose.p014ui.Modifier
        default <R> R foldIn(R r10, InterfaceC9544p interfaceC9544p) {
            return (R) interfaceC9544p.invoke(r10, this);
        }

        @Override // androidx.compose.p014ui.Modifier
        default <R> R foldOut(R r10, InterfaceC9544p interfaceC9544p) {
            return (R) interfaceC9544p.invoke(this, r10);
        }
    }

    @StabilityInferred(parameters = 0)
    public static abstract class Node implements DelegatableNode {
        public static final int $stable = 8;
        private Node child;
        private NodeCoordinator coordinator;
        private InterfaceC9529a detachedListener;
        private boolean insertedNodeAwaitingAttachForInvalidation;
        private boolean isAttached;
        private int kindSet;
        private boolean onAttachRunExpected;
        private boolean onDetachRunExpected;
        private ObserverNodeOwnerScope ownerScope;
        private Node parent;
        private InterfaceC11122i0 scope;
        private boolean updatedNodeAwaitingAttachForInvalidation;
        private Node node = this;
        private int aggregateChildKindSet = -1;

        public static /* synthetic */ void getNode$annotations() {
        }

        public static /* synthetic */ void getShouldAutoInvalidate$annotations() {
        }

        public final int getAggregateChildKindSet$ui_release() {
            return this.aggregateChildKindSet;
        }

        public final Node getChild$ui_release() {
            return this.child;
        }

        public final NodeCoordinator getCoordinator$ui_release() {
            return this.coordinator;
        }

        public final InterfaceC11122i0 getCoroutineScope() {
            InterfaceC11122i0 interfaceC11122i0 = this.scope;
            if (interfaceC11122i0 != null) {
                return interfaceC11122i0;
            }
            InterfaceC11122i0 interfaceC11122i0M20744a = AbstractC10006d.m20744a(DelegatableNodeKt.requireOwner(this).getCoroutineContext().plus(AbstractC11147o1.m24767a((InterfaceC10045g) DelegatableNodeKt.requireOwner(this).getCoroutineContext().get(InterfaceC10045g.f23976b0))));
            this.scope = interfaceC11122i0M20744a;
            return interfaceC11122i0M20744a;
        }

        public final InterfaceC9529a getDetachedListener$ui_release() {
            return this.detachedListener;
        }

        public final boolean getInsertedNodeAwaitingAttachForInvalidation$ui_release() {
            return this.insertedNodeAwaitingAttachForInvalidation;
        }

        public final int getKindSet$ui_release() {
            return this.kindSet;
        }

        @Override // androidx.compose.p014ui.node.DelegatableNode
        public final Node getNode() {
            return this.node;
        }

        public final ObserverNodeOwnerScope getOwnerScope$ui_release() {
            return this.ownerScope;
        }

        public final Node getParent$ui_release() {
            return this.parent;
        }

        public boolean getShouldAutoInvalidate() {
            return true;
        }

        public final boolean getUpdatedNodeAwaitingAttachForInvalidation$ui_release() {
            return this.updatedNodeAwaitingAttachForInvalidation;
        }

        public final boolean isAttached() {
            return this.isAttached;
        }

        /* renamed from: isKind-H91voCI$ui_release, reason: not valid java name */
        public final boolean m30447isKindH91voCI$ui_release(int i10) {
            return (i10 & getKindSet$ui_release()) != 0;
        }

        public void markAsAttached$ui_release() {
            if (this.isAttached) {
                InlineClassHelperKt.throwIllegalStateException("node attached multiple times");
            }
            if (!(this.coordinator != null)) {
                InlineClassHelperKt.throwIllegalStateException("attach invoked on a node without a coordinator");
            }
            this.isAttached = true;
            this.onAttachRunExpected = true;
        }

        public void markAsDetached$ui_release() {
            if (!this.isAttached) {
                InlineClassHelperKt.throwIllegalStateException("Cannot detach a node that is not attached");
            }
            if (this.onAttachRunExpected) {
                InlineClassHelperKt.throwIllegalStateException("Must run runAttachLifecycle() before markAsDetached()");
            }
            if (this.onDetachRunExpected) {
                InlineClassHelperKt.throwIllegalStateException("Must run runDetachLifecycle() before markAsDetached()");
            }
            this.isAttached = false;
            InterfaceC11122i0 interfaceC11122i0 = this.scope;
            if (interfaceC11122i0 != null) {
                AbstractC10006d.m20746c(interfaceC11122i0, new ModifierNodeDetachedCancellationException());
                this.scope = null;
            }
        }

        public void onAttach() {
        }

        public void onDetach() {
        }

        public void onReset() {
        }

        public void reset$ui_release() {
            if (!this.isAttached) {
                InlineClassHelperKt.throwIllegalStateException("reset() called on an unattached node");
            }
            onReset();
        }

        public void runAttachLifecycle$ui_release() {
            if (!this.isAttached) {
                InlineClassHelperKt.throwIllegalStateException("Must run markAsAttached() prior to runAttachLifecycle");
            }
            if (!this.onAttachRunExpected) {
                InlineClassHelperKt.throwIllegalStateException("Must run runAttachLifecycle() only once after markAsAttached()");
            }
            this.onAttachRunExpected = false;
            onAttach();
            this.onDetachRunExpected = true;
        }

        public void runDetachLifecycle$ui_release() {
            if (!this.isAttached) {
                InlineClassHelperKt.throwIllegalStateException("node detached multiple times");
            }
            if (!(this.coordinator != null)) {
                InlineClassHelperKt.throwIllegalStateException("detach invoked on a node without a coordinator");
            }
            if (!this.onDetachRunExpected) {
                InlineClassHelperKt.throwIllegalStateException("Must run runDetachLifecycle() once after runAttachLifecycle() and before markAsDetached()");
            }
            this.onDetachRunExpected = false;
            InterfaceC9529a interfaceC9529a = this.detachedListener;
            if (interfaceC9529a != null) {
                interfaceC9529a.invoke();
            }
            onDetach();
        }

        public final void setAggregateChildKindSet$ui_release(int i10) {
            this.aggregateChildKindSet = i10;
        }

        public void setAsDelegateTo$ui_release(Node node) {
            this.node = node;
        }

        public final void setChild$ui_release(Node node) {
            this.child = node;
        }

        public final void setDetachedListener$ui_release(InterfaceC9529a interfaceC9529a) {
            this.detachedListener = interfaceC9529a;
        }

        public final void setInsertedNodeAwaitingAttachForInvalidation$ui_release(boolean z10) {
            this.insertedNodeAwaitingAttachForInvalidation = z10;
        }

        public final void setKindSet$ui_release(int i10) {
            this.kindSet = i10;
        }

        public final void setOwnerScope$ui_release(ObserverNodeOwnerScope observerNodeOwnerScope) {
            this.ownerScope = observerNodeOwnerScope;
        }

        public final void setParent$ui_release(Node node) {
            this.parent = node;
        }

        public final void setUpdatedNodeAwaitingAttachForInvalidation$ui_release(boolean z10) {
            this.updatedNodeAwaitingAttachForInvalidation = z10;
        }

        public final void sideEffect(InterfaceC9529a interfaceC9529a) {
            DelegatableNodeKt.requireOwner(this).registerOnEndApplyChangesListener(interfaceC9529a);
        }

        public void updateCoordinator$ui_release(NodeCoordinator nodeCoordinator) {
            this.coordinator = nodeCoordinator;
        }
    }

    boolean all(InterfaceC9540l interfaceC9540l);

    boolean any(InterfaceC9540l interfaceC9540l);

    <R> R foldIn(R r10, InterfaceC9544p interfaceC9544p);

    <R> R foldOut(R r10, InterfaceC9544p interfaceC9544p);

    default Modifier then(Modifier modifier) {
        return modifier == Companion ? this : new CombinedModifier(this, modifier);
    }

    public static final class Companion implements Modifier {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        @Override // androidx.compose.p014ui.Modifier
        public boolean all(InterfaceC9540l interfaceC9540l) {
            return true;
        }

        @Override // androidx.compose.p014ui.Modifier
        public boolean any(InterfaceC9540l interfaceC9540l) {
            return false;
        }

        @Override // androidx.compose.p014ui.Modifier
        public Modifier then(Modifier modifier) {
            return modifier;
        }

        public String toString() {
            return "Modifier";
        }

        @Override // androidx.compose.p014ui.Modifier
        public <R> R foldIn(R r10, InterfaceC9544p interfaceC9544p) {
            return r10;
        }

        @Override // androidx.compose.p014ui.Modifier
        public <R> R foldOut(R r10, InterfaceC9544p interfaceC9544p) {
            return r10;
        }
    }
}
