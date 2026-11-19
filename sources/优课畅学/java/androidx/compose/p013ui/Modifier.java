package androidx.compose.p013ui;

import androidx.compose.p013ui.internal.InlineClassHelperKt;
import androidx.compose.p013ui.node.DelegatableNode;
import androidx.compose.p013ui.node.DelegatableNodeKt;
import androidx.compose.p013ui.node.NodeCoordinator;
import androidx.compose.p013ui.node.ObserverNodeOwnerScope;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlinx.coroutines.AbstractC9165e;
import kotlinx.coroutines.InterfaceC9212n;
import p135i8.AbstractC8823b1;
import p135i8.InterfaceC8822b0;
import p300x7.InterfaceC10559a;
import p300x7.InterfaceC10570l;
import p300x7.InterfaceC10574p;

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
            public static boolean all(Element element, InterfaceC10570l interfaceC10570l) {
                return Element.super.all(interfaceC10570l);
            }

            @Deprecated
            public static boolean any(Element element, InterfaceC10570l interfaceC10570l) {
                return Element.super.any(interfaceC10570l);
            }

            @Deprecated
            public static <R> R foldIn(Element element, R r10, InterfaceC10574p interfaceC10574p) {
                return (R) Element.super.foldIn(r10, interfaceC10574p);
            }

            @Deprecated
            public static <R> R foldOut(Element element, R r10, InterfaceC10574p interfaceC10574p) {
                return (R) Element.super.foldOut(r10, interfaceC10574p);
            }

            @Deprecated
            public static Modifier then(Element element, Modifier modifier) {
                return Element.super.then(modifier);
            }
        }

        @Override // androidx.compose.p013ui.Modifier
        default boolean all(InterfaceC10570l interfaceC10570l) {
            return ((Boolean) interfaceC10570l.invoke(this)).booleanValue();
        }

        @Override // androidx.compose.p013ui.Modifier
        default boolean any(InterfaceC10570l interfaceC10570l) {
            return ((Boolean) interfaceC10570l.invoke(this)).booleanValue();
        }

        @Override // androidx.compose.p013ui.Modifier
        default <R> R foldIn(R r10, InterfaceC10574p interfaceC10574p) {
            return (R) interfaceC10574p.invoke(r10, this);
        }

        @Override // androidx.compose.p013ui.Modifier
        default <R> R foldOut(R r10, InterfaceC10574p interfaceC10574p) {
            return (R) interfaceC10574p.invoke(this, r10);
        }
    }

    @StabilityInferred(parameters = 0)
    public static abstract class Node implements DelegatableNode {
        public static final int $stable = 8;
        private Node child;
        private NodeCoordinator coordinator;
        private InterfaceC10559a detachedListener;
        private boolean insertedNodeAwaitingAttachForInvalidation;
        private boolean isAttached;
        private int kindSet;
        private boolean onAttachRunExpected;
        private boolean onDetachRunExpected;
        private ObserverNodeOwnerScope ownerScope;
        private Node parent;
        private InterfaceC8822b0 scope;
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

        public final InterfaceC8822b0 getCoroutineScope() {
            InterfaceC8822b0 interfaceC8822b0 = this.scope;
            if (interfaceC8822b0 != null) {
                return interfaceC8822b0;
            }
            InterfaceC8822b0 interfaceC8822b0M16552a = AbstractC9165e.m16552a(DelegatableNodeKt.requireOwner(this).getCoroutineContext().plus(AbstractC8823b1.m14805a((InterfaceC9212n) DelegatableNodeKt.requireOwner(this).getCoroutineContext().get(InterfaceC9212n.f18095c0))));
            this.scope = interfaceC8822b0M16552a;
            return interfaceC8822b0M16552a;
        }

        public final InterfaceC10559a getDetachedListener$ui_release() {
            return this.detachedListener;
        }

        public final boolean getInsertedNodeAwaitingAttachForInvalidation$ui_release() {
            return this.insertedNodeAwaitingAttachForInvalidation;
        }

        public final int getKindSet$ui_release() {
            return this.kindSet;
        }

        @Override // androidx.compose.p013ui.node.DelegatableNode
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
        public final boolean m23845isKindH91voCI$ui_release(int i10) {
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
            InterfaceC8822b0 interfaceC8822b0 = this.scope;
            if (interfaceC8822b0 != null) {
                AbstractC9165e.m16554c(interfaceC8822b0, new ModifierNodeDetachedCancellationException());
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
            InterfaceC10559a interfaceC10559a = this.detachedListener;
            if (interfaceC10559a != null) {
                interfaceC10559a.invoke();
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

        public final void setDetachedListener$ui_release(InterfaceC10559a interfaceC10559a) {
            this.detachedListener = interfaceC10559a;
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

        public final void sideEffect(InterfaceC10559a interfaceC10559a) {
            DelegatableNodeKt.requireOwner(this).registerOnEndApplyChangesListener(interfaceC10559a);
        }

        public void updateCoordinator$ui_release(NodeCoordinator nodeCoordinator) {
            this.coordinator = nodeCoordinator;
        }
    }

    boolean all(InterfaceC10570l interfaceC10570l);

    boolean any(InterfaceC10570l interfaceC10570l);

    <R> R foldIn(R r10, InterfaceC10574p interfaceC10574p);

    <R> R foldOut(R r10, InterfaceC10574p interfaceC10574p);

    default Modifier then(Modifier modifier) {
        return modifier == Companion ? this : new CombinedModifier(this, modifier);
    }

    public static final class Companion implements Modifier {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        @Override // androidx.compose.p013ui.Modifier
        public boolean all(InterfaceC10570l interfaceC10570l) {
            return true;
        }

        @Override // androidx.compose.p013ui.Modifier
        public boolean any(InterfaceC10570l interfaceC10570l) {
            return false;
        }

        @Override // androidx.compose.p013ui.Modifier
        public Modifier then(Modifier modifier) {
            return modifier;
        }

        public String toString() {
            return "Modifier";
        }

        @Override // androidx.compose.p013ui.Modifier
        public <R> R foldIn(R r10, InterfaceC10574p interfaceC10574p) {
            return r10;
        }

        @Override // androidx.compose.p013ui.Modifier
        public <R> R foldOut(R r10, InterfaceC10574p interfaceC10574p) {
            return r10;
        }
    }
}
