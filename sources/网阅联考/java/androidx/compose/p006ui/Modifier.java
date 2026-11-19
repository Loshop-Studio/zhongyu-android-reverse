package androidx.compose.p006ui;

import androidx.compose.p006ui.node.DelegatableNode;
import androidx.compose.p006ui.node.DelegatableNodeKt;
import androidx.compose.p006ui.node.ModifierNodeOwnerScope;
import androidx.compose.p006ui.node.NodeCoordinator;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

@Stable
@Metadata(m5174d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\bg\u0018\u0000 \u00112\u00020\u0001:\u0003\u0011\u0012\u0013J\u001c\u0010\u0002\u001a\u00020\u00032\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00030\u0005H&J\u001c\u0010\u0007\u001a\u00020\u00032\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00030\u0005H&J5\u0010\b\u001a\u0002H\t\"\u0004\b\u0000\u0010\t2\u0006\u0010\n\u001a\u0002H\t2\u0018\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u0002H\t\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u0002H\t0\fH&¢\u0006\u0002\u0010\rJ5\u0010\u000e\u001a\u0002H\t\"\u0004\b\u0000\u0010\t2\u0006\u0010\n\u001a\u0002H\t2\u0018\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u0002H\t\u0012\u0004\u0012\u0002H\t0\fH&¢\u0006\u0002\u0010\rJ\u0011\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u0000H\u0096\u0004ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0014À\u0006\u0003"}, m5175d2 = {"Landroidx/compose/ui/Modifier;", "", "all", "", "predicate", "Lkotlin/Function1;", "Landroidx/compose/ui/Modifier$Element;", "any", "foldIn", "R", "initial", "operation", "Lkotlin/Function2;", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;", "foldOut", "then", "other", "Companion", "Element", "Node", "ui_release"}, m5176k = 1, m5177mv = {1, 8, 0}, m5179xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
public interface Modifier {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(m5174d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001c\u0010\u0003\u001a\u00020\u00042\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00040\u0006H\u0016J\u001c\u0010\b\u001a\u00020\u00042\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00040\u0006H\u0016J5\u0010\t\u001a\u0002H\n\"\u0004\b\u0000\u0010\n2\u0006\u0010\u000b\u001a\u0002H\n2\u0018\u0010\f\u001a\u0014\u0012\u0004\u0012\u0002H\n\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u0002H\n0\rH\u0016¢\u0006\u0002\u0010\u000eJ5\u0010\u000f\u001a\u0002H\n\"\u0004\b\u0000\u0010\n2\u0006\u0010\u000b\u001a\u0002H\n2\u0018\u0010\f\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u0002H\n\u0012\u0004\u0012\u0002H\n0\rH\u0016¢\u0006\u0002\u0010\u000eJ\u0011\u0010\u0010\u001a\u00020\u00012\u0006\u0010\u0011\u001a\u00020\u0001H\u0096\u0004J\b\u0010\u0012\u001a\u00020\u0013H\u0016¨\u0006\u0014"}, m5175d2 = {"Landroidx/compose/ui/Modifier$Companion;", "Landroidx/compose/ui/Modifier;", "()V", "all", "", "predicate", "Lkotlin/Function1;", "Landroidx/compose/ui/Modifier$Element;", "any", "foldIn", "R", "initial", "operation", "Lkotlin/Function2;", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;", "foldOut", "then", "other", "toString", "", "ui_release"}, m5176k = 1, m5177mv = {1, 8, 0}, m5179xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class Companion implements Modifier {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        @Override // androidx.compose.p006ui.Modifier
        public boolean all(Function1<? super Element, Boolean> predicate) {
            Intrinsics.checkNotNullParameter(predicate, "predicate");
            return true;
        }

        @Override // androidx.compose.p006ui.Modifier
        public boolean any(Function1<? super Element, Boolean> predicate) {
            Intrinsics.checkNotNullParameter(predicate, "predicate");
            return false;
        }

        @Override // androidx.compose.p006ui.Modifier
        public <R> R foldIn(R initial, Function2<? super R, ? super Element, ? extends R> operation) {
            Intrinsics.checkNotNullParameter(operation, "operation");
            return initial;
        }

        @Override // androidx.compose.p006ui.Modifier
        public <R> R foldOut(R initial, Function2<? super Element, ? super R, ? extends R> operation) {
            Intrinsics.checkNotNullParameter(operation, "operation");
            return initial;
        }

        @Override // androidx.compose.p006ui.Modifier
        public Modifier then(Modifier other) {
            Intrinsics.checkNotNullParameter(other, "other");
            return other;
        }

        public String toString() {
            return "Modifier";
        }
    }

    @Metadata(m5176k = 3, m5177mv = {1, 8, 0}, m5179xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class DefaultImpls {
        @Deprecated
        public static Modifier then(Modifier modifier, Modifier other) {
            Intrinsics.checkNotNullParameter(other, "other");
            return AbstractC1266a.m307a(modifier, other);
        }
    }

    @Metadata(m5174d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u001c\u0010\u0002\u001a\u00020\u00032\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00030\u0005H\u0016J\u001c\u0010\u0006\u001a\u00020\u00032\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00030\u0005H\u0016J5\u0010\u0007\u001a\u0002H\b\"\u0004\b\u0000\u0010\b2\u0006\u0010\t\u001a\u0002H\b2\u0018\u0010\n\u001a\u0014\u0012\u0004\u0012\u0002H\b\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u0002H\b0\u000bH\u0016¢\u0006\u0002\u0010\fJ5\u0010\r\u001a\u0002H\b\"\u0004\b\u0000\u0010\b2\u0006\u0010\t\u001a\u0002H\b2\u0018\u0010\n\u001a\u0014\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u0002H\b\u0012\u0004\u0012\u0002H\b0\u000bH\u0016¢\u0006\u0002\u0010\fø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000eÀ\u0006\u0003"}, m5175d2 = {"Landroidx/compose/ui/Modifier$Element;", "Landroidx/compose/ui/Modifier;", "all", "", "predicate", "Lkotlin/Function1;", "any", "foldIn", "R", "initial", "operation", "Lkotlin/Function2;", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;", "foldOut", "ui_release"}, m5176k = 1, m5177mv = {1, 8, 0}, m5179xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public interface Element extends Modifier {

        @Metadata(m5176k = 3, m5177mv = {1, 8, 0}, m5179xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
        public static final class DefaultImpls {
            @Deprecated
            public static boolean all(Element element, Function1<? super Element, Boolean> predicate) {
                Intrinsics.checkNotNullParameter(predicate, "predicate");
                return AbstractC1267b.m309a(element, predicate);
            }

            @Deprecated
            public static boolean any(Element element, Function1<? super Element, Boolean> predicate) {
                Intrinsics.checkNotNullParameter(predicate, "predicate");
                return AbstractC1267b.m310b(element, predicate);
            }

            @Deprecated
            public static <R> R foldIn(Element element, R r3, Function2<? super R, ? super Element, ? extends R> operation) {
                Intrinsics.checkNotNullParameter(operation, "operation");
                return (R) AbstractC1267b.m311c(element, r3, operation);
            }

            @Deprecated
            public static <R> R foldOut(Element element, R r3, Function2<? super Element, ? super R, ? extends R> operation) {
                Intrinsics.checkNotNullParameter(operation, "operation");
                return (R) AbstractC1267b.m312d(element, r3, operation);
            }

            @Deprecated
            public static Modifier then(Element element, Modifier other) {
                Intrinsics.checkNotNullParameter(other, "other");
                return AbstractC1266a.m307a(element, other);
            }
        }

        @Override // androidx.compose.p006ui.Modifier
        boolean all(Function1<? super Element, Boolean> predicate);

        @Override // androidx.compose.p006ui.Modifier
        boolean any(Function1<? super Element, Boolean> predicate);

        @Override // androidx.compose.p006ui.Modifier
        <R> R foldIn(R initial, Function2<? super R, ? super Element, ? extends R> operation);

        @Override // androidx.compose.p006ui.Modifier
        <R> R foldOut(R initial, Function2<? super Element, ? super R, ? extends R> operation);
    }

    @StabilityInferred(parameters = 0)
    @Metadata(m5174d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\b'\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\r\u0010,\u001a\u00020-H\u0010¢\u0006\u0002\b.J\r\u0010/\u001a\u00020-H\u0010¢\u0006\u0002\b0J\"\u00101\u001a\u00020\u00142\n\u00102\u001a\u0006\u0012\u0002\b\u000303H\u0080\bø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b4\u00105J\b\u00106\u001a\u00020-H\u0016J\b\u00107\u001a\u00020-H\u0016J\b\u00108\u001a\u00020-H\u0016J\r\u00109\u001a\u00020-H\u0010¢\u0006\u0002\b:J\u0015\u0010;\u001a\u00020-2\u0006\u0010<\u001a\u00020\u0000H\u0000¢\u0006\u0002\b=J\u0014\u0010>\u001a\u00020-2\f\u0010?\u001a\b\u0012\u0004\u0012\u00020-0@J\u0017\u0010A\u001a\u00020-2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0010¢\u0006\u0002\bBR\u001a\u0010\u0003\u001a\u00020\u0004X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\u0000X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\"\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f@BX\u0080\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0013\u001a\u00020\u0014X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001e\u0010\u0019\u001a\u00020\u00142\u0006\u0010\u000e\u001a\u00020\u0014@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0016R\u001a\u0010\u001a\u001a\u00020\u0004X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0006\"\u0004\b\u001c\u0010\bR$\u0010\u001d\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u0000@BX\u0086\u000e¢\u0006\u000e\n\u0000\u0012\u0004\b\u001e\u0010\u0002\u001a\u0004\b\u001f\u0010\u000bR\u001c\u0010 \u001a\u0004\u0018\u00010!X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\u001c\u0010&\u001a\u0004\u0018\u00010\u0000X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010\u000b\"\u0004\b(\u0010\rR\u001a\u0010)\u001a\u00020\u0014X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010\u0016\"\u0004\b+\u0010\u0018\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006C"}, m5175d2 = {"Landroidx/compose/ui/Modifier$Node;", "Landroidx/compose/ui/node/DelegatableNode;", "()V", "aggregateChildKindSet", "", "getAggregateChildKindSet$ui_release", "()I", "setAggregateChildKindSet$ui_release", "(I)V", "child", "getChild$ui_release", "()Landroidx/compose/ui/Modifier$Node;", "setChild$ui_release", "(Landroidx/compose/ui/Modifier$Node;)V", "<set-?>", "Landroidx/compose/ui/node/NodeCoordinator;", "coordinator", "getCoordinator$ui_release", "()Landroidx/compose/ui/node/NodeCoordinator;", "insertedNodeAwaitingAttachForInvalidation", "", "getInsertedNodeAwaitingAttachForInvalidation$ui_release", "()Z", "setInsertedNodeAwaitingAttachForInvalidation$ui_release", "(Z)V", "isAttached", "kindSet", "getKindSet$ui_release", "setKindSet$ui_release", "node", "getNode$annotations", "getNode", "ownerScope", "Landroidx/compose/ui/node/ModifierNodeOwnerScope;", "getOwnerScope$ui_release", "()Landroidx/compose/ui/node/ModifierNodeOwnerScope;", "setOwnerScope$ui_release", "(Landroidx/compose/ui/node/ModifierNodeOwnerScope;)V", "parent", "getParent$ui_release", "setParent$ui_release", "updatedNodeAwaitingAttachForInvalidation", "getUpdatedNodeAwaitingAttachForInvalidation$ui_release", "setUpdatedNodeAwaitingAttachForInvalidation$ui_release", "attach", "", "attach$ui_release", "detach", "detach$ui_release", "isKind", "kind", "Landroidx/compose/ui/node/NodeKind;", "isKind-H91voCI$ui_release", "(I)Z", "onAttach", "onDetach", "onReset", "reset", "reset$ui_release", "setAsDelegateTo", "owner", "setAsDelegateTo$ui_release", "sideEffect", "effect", "Lkotlin/Function0;", "updateCoordinator", "updateCoordinator$ui_release", "ui_release"}, m5176k = 1, m5177mv = {1, 8, 0}, m5179xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    @ExperimentalComposeUiApi
    public static abstract class Node implements DelegatableNode {
        public static final int $stable = 8;
        private int aggregateChildKindSet;
        private Node child;
        private NodeCoordinator coordinator;
        private boolean insertedNodeAwaitingAttachForInvalidation;
        private boolean isAttached;
        private int kindSet;
        private Node node = this;
        private ModifierNodeOwnerScope ownerScope;
        private Node parent;
        private boolean updatedNodeAwaitingAttachForInvalidation;

        public static /* synthetic */ void getNode$annotations() {
        }

        public void attach$ui_release() {
            if (!(!this.isAttached)) {
                throw new IllegalStateException("Check failed.".toString());
            }
            if (!(this.coordinator != null)) {
                throw new IllegalStateException("Check failed.".toString());
            }
            this.isAttached = true;
            onAttach();
        }

        public void detach$ui_release() {
            if (!this.isAttached) {
                throw new IllegalStateException("Check failed.".toString());
            }
            if (!(this.coordinator != null)) {
                throw new IllegalStateException("Check failed.".toString());
            }
            onDetach();
            this.isAttached = false;
        }

        /* renamed from: getAggregateChildKindSet$ui_release, reason: from getter */
        public final int getAggregateChildKindSet() {
            return this.aggregateChildKindSet;
        }

        /* renamed from: getChild$ui_release, reason: from getter */
        public final Node getChild() {
            return this.child;
        }

        /* renamed from: getCoordinator$ui_release, reason: from getter */
        public final NodeCoordinator getCoordinator() {
            return this.coordinator;
        }

        /* renamed from: getInsertedNodeAwaitingAttachForInvalidation$ui_release, reason: from getter */
        public final boolean getInsertedNodeAwaitingAttachForInvalidation() {
            return this.insertedNodeAwaitingAttachForInvalidation;
        }

        /* renamed from: getKindSet$ui_release, reason: from getter */
        public final int getKindSet() {
            return this.kindSet;
        }

        @Override // androidx.compose.p006ui.node.DelegatableNode
        public final Node getNode() {
            return this.node;
        }

        /* renamed from: getOwnerScope$ui_release, reason: from getter */
        public final ModifierNodeOwnerScope getOwnerScope() {
            return this.ownerScope;
        }

        /* renamed from: getParent$ui_release, reason: from getter */
        public final Node getParent() {
            return this.parent;
        }

        /* renamed from: getUpdatedNodeAwaitingAttachForInvalidation$ui_release, reason: from getter */
        public final boolean getUpdatedNodeAwaitingAttachForInvalidation() {
            return this.updatedNodeAwaitingAttachForInvalidation;
        }

        /* renamed from: isAttached, reason: from getter */
        public final boolean getIsAttached() {
            return this.isAttached;
        }

        /* renamed from: isKind-H91voCI$ui_release, reason: not valid java name */
        public final boolean m8842isKindH91voCI$ui_release(int kind) {
            return (kind & getKindSet()) != 0;
        }

        public void onAttach() {
        }

        public void onDetach() {
        }

        public void onReset() {
        }

        public void reset$ui_release() {
            if (!this.isAttached) {
                throw new IllegalStateException("Check failed.".toString());
            }
            onReset();
        }

        public final void setAggregateChildKindSet$ui_release(int i4) {
            this.aggregateChildKindSet = i4;
        }

        public final void setAsDelegateTo$ui_release(Node owner) {
            Intrinsics.checkNotNullParameter(owner, "owner");
            this.node = owner;
        }

        public final void setChild$ui_release(Node node) {
            this.child = node;
        }

        public final void setInsertedNodeAwaitingAttachForInvalidation$ui_release(boolean z3) {
            this.insertedNodeAwaitingAttachForInvalidation = z3;
        }

        public final void setKindSet$ui_release(int i4) {
            this.kindSet = i4;
        }

        public final void setOwnerScope$ui_release(ModifierNodeOwnerScope modifierNodeOwnerScope) {
            this.ownerScope = modifierNodeOwnerScope;
        }

        public final void setParent$ui_release(Node node) {
            this.parent = node;
        }

        public final void setUpdatedNodeAwaitingAttachForInvalidation$ui_release(boolean z3) {
            this.updatedNodeAwaitingAttachForInvalidation = z3;
        }

        public final void sideEffect(Function0<Unit> effect) {
            Intrinsics.checkNotNullParameter(effect, "effect");
            DelegatableNodeKt.requireOwner(this).registerOnEndApplyChangesListener(effect);
        }

        public void updateCoordinator$ui_release(NodeCoordinator coordinator) {
            this.coordinator = coordinator;
        }
    }

    boolean all(Function1<? super Element, Boolean> predicate);

    boolean any(Function1<? super Element, Boolean> predicate);

    <R> R foldIn(R initial, Function2<? super R, ? super Element, ? extends R> operation);

    <R> R foldOut(R initial, Function2<? super Element, ? super R, ? extends R> operation);

    Modifier then(Modifier other);
}
