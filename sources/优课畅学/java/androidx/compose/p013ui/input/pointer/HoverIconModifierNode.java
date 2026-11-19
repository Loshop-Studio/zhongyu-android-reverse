package androidx.compose.p013ui.input.pointer;

import androidx.compose.p013ui.Modifier;
import androidx.compose.p013ui.input.pointer.PointerEventType;
import androidx.compose.p013ui.node.CompositionLocalConsumerModifierNode;
import androidx.compose.p013ui.node.CompositionLocalConsumerModifierNodeKt;
import androidx.compose.p013ui.node.DelegatableNodeKt;
import androidx.compose.p013ui.node.DpTouchBoundsExpansion;
import androidx.compose.p013ui.node.PointerInputModifierNode;
import androidx.compose.p013ui.node.TouchBoundsExpansion;
import androidx.compose.p013ui.node.TraversableNode;
import androidx.compose.p013ui.node.TraversableNodeKt;
import androidx.compose.p013ui.platform.CompositionLocalsKt;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.List;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlin.jvm.internal.Ref$ObjectRef;
import p123h7.C8736p;
import p300x7.InterfaceC10570l;

@StabilityInferred(parameters = 0)
/* loaded from: classes2.dex */
public abstract class HoverIconModifierNode extends Modifier.Node implements TraversableNode, PointerInputModifierNode, CompositionLocalConsumerModifierNode {
    public static final int $stable = 8;
    private boolean cursorInBoundsOfNode;
    private DpTouchBoundsExpansion dpTouchBoundsExpansion;
    private PointerIcon icon;
    private boolean overrideDescendants;

    public /* synthetic */ HoverIconModifierNode(PointerIcon pointerIcon, boolean z10, DpTouchBoundsExpansion dpTouchBoundsExpansion, int i10, AbstractC9126n abstractC9126n) {
        this(pointerIcon, (i10 & 2) != 0 ? false : z10, (i10 & 4) != 0 ? null : dpTouchBoundsExpansion);
    }

    private final void displayIcon() {
        PointerIcon pointerIcon;
        HoverIconModifierNode hoverIconModifierNodeFindOverridingAncestorNode = findOverridingAncestorNode();
        if (hoverIconModifierNodeFindOverridingAncestorNode == null || (pointerIcon = hoverIconModifierNodeFindOverridingAncestorNode.icon) == null) {
            pointerIcon = this.icon;
        }
        displayIcon(pointerIcon);
    }

    private final void displayIconFromAncestorNodeWithCursorInBoundsOrDefaultIcon() {
        C8736p c8736p;
        final Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        TraversableNodeKt.traverseAncestors(this, new InterfaceC10570l() { // from class: androidx.compose.ui.input.pointer.HoverIconModifierNode.displayIconFromAncestorNodeWithCursorInBoundsOrDefaultIcon.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p300x7.InterfaceC10570l
            public final Boolean invoke(HoverIconModifierNode hoverIconModifierNode) {
                if (ref$ObjectRef.f17473a == null && hoverIconModifierNode.cursorInBoundsOfNode) {
                    ref$ObjectRef.f17473a = hoverIconModifierNode;
                } else if (ref$ObjectRef.f17473a != null && hoverIconModifierNode.getOverrideDescendants() && hoverIconModifierNode.cursorInBoundsOfNode) {
                    ref$ObjectRef.f17473a = hoverIconModifierNode;
                }
                return Boolean.TRUE;
            }
        });
        HoverIconModifierNode hoverIconModifierNode = (HoverIconModifierNode) ref$ObjectRef.f17473a;
        if (hoverIconModifierNode != null) {
            hoverIconModifierNode.displayIcon();
            c8736p = C8736p.f16368a;
        } else {
            c8736p = null;
        }
        if (c8736p == null) {
            displayIcon(null);
        }
    }

    private final void displayIconFromCurrentNodeOrDescendantsWithCursorInBounds() {
        HoverIconModifierNode hoverIconModifierNodeFindDescendantNodeWithCursorInBounds;
        if (this.cursorInBoundsOfNode) {
            if (this.overrideDescendants || (hoverIconModifierNodeFindDescendantNodeWithCursorInBounds = findDescendantNodeWithCursorInBounds()) == null) {
                hoverIconModifierNodeFindDescendantNodeWithCursorInBounds = this;
            }
            hoverIconModifierNodeFindDescendantNodeWithCursorInBounds.displayIcon();
        }
    }

    private final void displayIconIfDescendantsDoNotHavePriority() {
        final Ref$BooleanRef ref$BooleanRef = new Ref$BooleanRef();
        ref$BooleanRef.f17469a = true;
        if (!this.overrideDescendants) {
            TraversableNodeKt.traverseDescendants(this, new InterfaceC10570l() { // from class: androidx.compose.ui.input.pointer.HoverIconModifierNode.displayIconIfDescendantsDoNotHavePriority.1
                {
                    super(1);
                }

                @Override // p300x7.InterfaceC10570l
                public final TraversableNode.Companion.TraverseDescendantsAction invoke(HoverIconModifierNode hoverIconModifierNode) {
                    if (!hoverIconModifierNode.cursorInBoundsOfNode) {
                        return TraversableNode.Companion.TraverseDescendantsAction.ContinueTraversal;
                    }
                    ref$BooleanRef.f17469a = false;
                    return TraversableNode.Companion.TraverseDescendantsAction.CancelTraversal;
                }
            });
        }
        if (ref$BooleanRef.f17469a) {
            displayIcon();
        }
    }

    private final HoverIconModifierNode findDescendantNodeWithCursorInBounds() {
        final Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        TraversableNodeKt.traverseDescendants(this, new InterfaceC10570l() { // from class: androidx.compose.ui.input.pointer.HoverIconModifierNode.findDescendantNodeWithCursorInBounds.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p300x7.InterfaceC10570l
            public final TraversableNode.Companion.TraverseDescendantsAction invoke(HoverIconModifierNode hoverIconModifierNode) {
                TraversableNode.Companion.TraverseDescendantsAction traverseDescendantsAction = TraversableNode.Companion.TraverseDescendantsAction.ContinueTraversal;
                if (hoverIconModifierNode.cursorInBoundsOfNode) {
                    ref$ObjectRef.f17473a = hoverIconModifierNode;
                    if (hoverIconModifierNode.getOverrideDescendants()) {
                        return TraversableNode.Companion.TraverseDescendantsAction.SkipSubtreeAndContinueTraversal;
                    }
                }
                return traverseDescendantsAction;
            }
        });
        return (HoverIconModifierNode) ref$ObjectRef.f17473a;
    }

    private final HoverIconModifierNode findOverridingAncestorNode() {
        final Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        TraversableNodeKt.traverseAncestors(this, new InterfaceC10570l() { // from class: androidx.compose.ui.input.pointer.HoverIconModifierNode.findOverridingAncestorNode.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p300x7.InterfaceC10570l
            public final Boolean invoke(HoverIconModifierNode hoverIconModifierNode) {
                if (hoverIconModifierNode.getOverrideDescendants() && hoverIconModifierNode.cursorInBoundsOfNode) {
                    ref$ObjectRef.f17473a = hoverIconModifierNode;
                }
                return Boolean.TRUE;
            }
        });
        return (HoverIconModifierNode) ref$ObjectRef.f17473a;
    }

    private final void onEnter() {
        this.cursorInBoundsOfNode = true;
        displayIconIfDescendantsDoNotHavePriority();
    }

    private final void onExit() {
        if (this.cursorInBoundsOfNode) {
            this.cursorInBoundsOfNode = false;
            if (isAttached()) {
                displayIconFromAncestorNodeWithCursorInBoundsOrDefaultIcon();
            }
        }
    }

    public abstract void displayIcon(PointerIcon pointerIcon);

    public final DpTouchBoundsExpansion getDpTouchBoundsExpansion() {
        return this.dpTouchBoundsExpansion;
    }

    public final PointerIcon getIcon() {
        return this.icon;
    }

    public final boolean getOverrideDescendants() {
        return this.overrideDescendants;
    }

    public final PointerIconService getPointerIconService() {
        return (PointerIconService) CompositionLocalConsumerModifierNodeKt.currentValueOf(this, CompositionLocalsKt.getLocalPointerIconService());
    }

    @Override // androidx.compose.p013ui.node.PointerInputModifierNode
    /* renamed from: getTouchBoundsExpansion-RZrCHBk */
    public long mo21330getTouchBoundsExpansionRZrCHBk() {
        DpTouchBoundsExpansion dpTouchBoundsExpansion = this.dpTouchBoundsExpansion;
        return dpTouchBoundsExpansion != null ? dpTouchBoundsExpansion.m25790roundToTouchBoundsExpansionTW6G1oQ(DelegatableNodeKt.requireDensity(this)) : TouchBoundsExpansion.Companion.m26003getNoneRZrCHBk();
    }

    /* renamed from: isRelevantPointerType-uerMTgs, reason: not valid java name */
    public abstract boolean mo25429isRelevantPointerTypeuerMTgs(int i10);

    @Override // androidx.compose.p013ui.node.PointerInputModifierNode
    public void onCancelPointerInput() {
        onExit();
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onDetach() {
        onExit();
        super.onDetach();
    }

    @Override // androidx.compose.p013ui.node.PointerInputModifierNode
    /* renamed from: onPointerEvent-H0pRuoY */
    public void mo20318onPointerEventH0pRuoY(PointerEvent pointerEvent, PointerEventPass pointerEventPass, long j10) {
        if (pointerEventPass == PointerEventPass.Main) {
            List<PointerInputChange> changes = pointerEvent.getChanges();
            int size = changes.size();
            for (int i10 = 0; i10 < size; i10++) {
                if (mo25429isRelevantPointerTypeuerMTgs(changes.get(i10).m25505getTypeT8wyACA())) {
                    int iM25444getType7fucELk = pointerEvent.m25444getType7fucELk();
                    PointerEventType.Companion companion = PointerEventType.Companion;
                    if (PointerEventType.m25451equalsimpl0(iM25444getType7fucELk, companion.m25455getEnter7fucELk())) {
                        onEnter();
                        return;
                    } else {
                        if (PointerEventType.m25451equalsimpl0(pointerEvent.m25444getType7fucELk(), companion.m25456getExit7fucELk())) {
                            onExit();
                            return;
                        }
                        return;
                    }
                }
            }
        }
    }

    public final void setDpTouchBoundsExpansion(DpTouchBoundsExpansion dpTouchBoundsExpansion) {
        this.dpTouchBoundsExpansion = dpTouchBoundsExpansion;
    }

    public final void setIcon(PointerIcon pointerIcon) {
        if (AbstractC9133u.m16128b(this.icon, pointerIcon)) {
            return;
        }
        this.icon = pointerIcon;
        if (this.cursorInBoundsOfNode) {
            displayIconIfDescendantsDoNotHavePriority();
        }
    }

    public final void setOverrideDescendants(boolean z10) {
        if (this.overrideDescendants != z10) {
            this.overrideDescendants = z10;
            if (z10) {
                if (this.cursorInBoundsOfNode) {
                    displayIcon();
                }
            } else if (this.cursorInBoundsOfNode) {
                displayIconFromCurrentNodeOrDescendantsWithCursorInBounds();
            }
        }
    }

    public HoverIconModifierNode(PointerIcon pointerIcon, boolean z10, DpTouchBoundsExpansion dpTouchBoundsExpansion) {
        this.dpTouchBoundsExpansion = dpTouchBoundsExpansion;
        this.icon = pointerIcon;
        this.overrideDescendants = z10;
    }
}
