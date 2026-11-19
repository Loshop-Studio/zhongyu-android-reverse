package androidx.compose.p011ui.input.pointer;

import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.input.pointer.PointerEventType;
import androidx.compose.p011ui.node.CompositionLocalConsumerModifierNode;
import androidx.compose.p011ui.node.CompositionLocalConsumerModifierNodeKt;
import androidx.compose.p011ui.node.DelegatableNodeKt;
import androidx.compose.p011ui.node.DpTouchBoundsExpansion;
import androidx.compose.p011ui.node.PointerInputModifierNode;
import androidx.compose.p011ui.node.TouchBoundsExpansion;
import androidx.compose.p011ui.node.TraversableNode;
import androidx.compose.p011ui.node.TraversableNodeKt;
import androidx.compose.p011ui.platform.CompositionLocalsKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5824e;
import kotlin.jvm.internal.AbstractC5830k;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p045d6.C5443s;
import p152r6.InterfaceC6471c;

@StabilityInferred(parameters = 0)
@Metadata(m5109d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b \u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B%\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0011\u0010\u000fJ\u000f\u0010\u0012\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0012\u0010\u000fJ\u0011\u0010\u0013\u001a\u0004\u0018\u00010\u0000H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0015\u0010\u000fJ\u0011\u0010\u0016\u001a\u0004\u0018\u00010\u0000H\u0002¢\u0006\u0004\b\u0016\u0010\u0014J\u000f\u0010\u0017\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0017\u0010\u000fJ*\u0010 \u001a\u00020\r2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001cH\u0016ø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010!\u001a\u00020\rH\u0016¢\u0006\u0004\b!\u0010\u000fJ\u000f\u0010\"\u001a\u00020\rH\u0016¢\u0006\u0004\b\"\u0010\u000fJ\u001a\u0010'\u001a\u00020\u00072\u0006\u0010$\u001a\u00020#H&ø\u0001\u0000¢\u0006\u0004\b%\u0010&J\u0019\u0010\u0011\u001a\u00020\r2\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H&¢\u0006\u0004\b\u0011\u0010(R$\u0010\n\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010)\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R*\u0010\u0006\u001a\u00020\u00052\u0006\u0010.\u001a\u00020\u00058\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010/\u001a\u0004\b0\u00101\"\u0004\b2\u0010(R*\u0010\b\u001a\u00020\u00072\u0006\u0010.\u001a\u00020\u00078\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u00103\u001a\u0004\b4\u00105\"\u0004\b6\u00107R\u0016\u00108\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u00103R\u0016\u0010<\u001a\u0004\u0018\u0001098DX\u0084\u0004¢\u0006\u0006\u001a\u0004\b:\u0010;R\u001a\u0010@\u001a\u00020=8VX\u0096\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b>\u0010?\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006A"}, m5110d2 = {"Landroidx/compose/ui/input/pointer/HoverIconModifierNode;", "Landroidx/compose/ui/Modifier$Node;", "Landroidx/compose/ui/node/TraversableNode;", "Landroidx/compose/ui/node/PointerInputModifierNode;", "Landroidx/compose/ui/node/CompositionLocalConsumerModifierNode;", "Landroidx/compose/ui/input/pointer/PointerIcon;", "icon", "", "overrideDescendants", "Landroidx/compose/ui/node/DpTouchBoundsExpansion;", "dpTouchBoundsExpansion", "<init>", "(Landroidx/compose/ui/input/pointer/PointerIcon;ZLandroidx/compose/ui/node/DpTouchBoundsExpansion;)V", "Ld6/s;", "onEnter", "()V", "onExit", "displayIcon", "displayIconIfDescendantsDoNotHavePriority", "findDescendantNodeWithCursorInBounds", "()Landroidx/compose/ui/input/pointer/HoverIconModifierNode;", "displayIconFromCurrentNodeOrDescendantsWithCursorInBounds", "findOverridingAncestorNode", "displayIconFromAncestorNodeWithCursorInBoundsOrDefaultIcon", "Landroidx/compose/ui/input/pointer/PointerEvent;", "pointerEvent", "Landroidx/compose/ui/input/pointer/PointerEventPass;", "pass", "Landroidx/compose/ui/unit/IntSize;", "bounds", "onPointerEvent-H0pRuoY", "(Landroidx/compose/ui/input/pointer/PointerEvent;Landroidx/compose/ui/input/pointer/PointerEventPass;J)V", "onPointerEvent", "onCancelPointerInput", "onDetach", "Landroidx/compose/ui/input/pointer/PointerType;", "pointerType", "isRelevantPointerType-uerMTgs", "(I)Z", "isRelevantPointerType", "(Landroidx/compose/ui/input/pointer/PointerIcon;)V", "Landroidx/compose/ui/node/DpTouchBoundsExpansion;", "getDpTouchBoundsExpansion", "()Landroidx/compose/ui/node/DpTouchBoundsExpansion;", "setDpTouchBoundsExpansion", "(Landroidx/compose/ui/node/DpTouchBoundsExpansion;)V", "value", "Landroidx/compose/ui/input/pointer/PointerIcon;", "getIcon", "()Landroidx/compose/ui/input/pointer/PointerIcon;", "setIcon", "Z", "getOverrideDescendants", "()Z", "setOverrideDescendants", "(Z)V", "cursorInBoundsOfNode", "Landroidx/compose/ui/input/pointer/PointerIconService;", "getPointerIconService", "()Landroidx/compose/ui/input/pointer/PointerIconService;", "pointerIconService", "Landroidx/compose/ui/node/TouchBoundsExpansion;", "getTouchBoundsExpansion-RZrCHBk", "()J", "touchBoundsExpansion", "ui_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nPointerIcon.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PointerIcon.kt\nandroidx/compose/ui/input/pointer/HoverIconModifierNode\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,422:1\n102#2,2:423\n34#2,6:425\n104#2:431\n1#3:432\n*S KotlinDebug\n*F\n+ 1 PointerIcon.kt\nandroidx/compose/ui/input/pointer/HoverIconModifierNode\n*L\n253#1:423,2\n253#1:425,6\n253#1:431\n*E\n"})
/* loaded from: classes2.dex */
public abstract class HoverIconModifierNode extends Modifier.Node implements TraversableNode, PointerInputModifierNode, CompositionLocalConsumerModifierNode {
    public static final int $stable = 8;
    private boolean cursorInBoundsOfNode;

    @Nullable
    private DpTouchBoundsExpansion dpTouchBoundsExpansion;

    @NotNull
    private PointerIcon icon;
    private boolean overrideDescendants;

    public /* synthetic */ HoverIconModifierNode(PointerIcon pointerIcon, boolean z8, DpTouchBoundsExpansion dpTouchBoundsExpansion, int i, AbstractC5824e abstractC5824e) {
        this(pointerIcon, (i & 2) != 0 ? false : z8, (i & 4) != 0 ? null : dpTouchBoundsExpansion);
    }

    private final void displayIcon() {
        PointerIcon pointerIcon;
        HoverIconModifierNode hoverIconModifierNodeFindOverridingAncestorNode = findOverridingAncestorNode();
        if (hoverIconModifierNodeFindOverridingAncestorNode == null || (pointerIcon = hoverIconModifierNodeFindOverridingAncestorNode.icon) == null) {
            pointerIcon = this.icon;
        }
        displayIcon(pointerIcon);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void displayIconFromAncestorNodeWithCursorInBoundsOrDefaultIcon() {
        C5443s c5443s;
        final Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        TraversableNodeKt.traverseAncestors(this, new InterfaceC6471c() { // from class: androidx.compose.ui.input.pointer.HoverIconModifierNode.displayIconFromAncestorNodeWithCursorInBoundsOrDefaultIcon.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // p152r6.InterfaceC6471c
            public final Boolean invoke(HoverIconModifierNode hoverIconModifierNode) {
                if (ref$ObjectRef.element == null && hoverIconModifierNode.cursorInBoundsOfNode) {
                    ref$ObjectRef.element = hoverIconModifierNode;
                } else if (ref$ObjectRef.element != null && hoverIconModifierNode.getOverrideDescendants() && hoverIconModifierNode.cursorInBoundsOfNode) {
                    ref$ObjectRef.element = hoverIconModifierNode;
                }
                return Boolean.TRUE;
            }
        });
        HoverIconModifierNode hoverIconModifierNode = (HoverIconModifierNode) ref$ObjectRef.element;
        if (hoverIconModifierNode != null) {
            hoverIconModifierNode.displayIcon();
            c5443s = C5443s.f8405a;
        } else {
            c5443s = null;
        }
        if (c5443s == null) {
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
        ref$BooleanRef.element = true;
        if (!this.overrideDescendants) {
            TraversableNodeKt.traverseDescendants(this, new InterfaceC6471c() { // from class: androidx.compose.ui.input.pointer.HoverIconModifierNode.displayIconIfDescendantsDoNotHavePriority.1
                {
                    super(1);
                }

                @Override // p152r6.InterfaceC6471c
                public final TraversableNode.Companion.TraverseDescendantsAction invoke(HoverIconModifierNode hoverIconModifierNode) {
                    if (!hoverIconModifierNode.cursorInBoundsOfNode) {
                        return TraversableNode.Companion.TraverseDescendantsAction.ContinueTraversal;
                    }
                    ref$BooleanRef.element = false;
                    return TraversableNode.Companion.TraverseDescendantsAction.CancelTraversal;
                }
            });
        }
        if (ref$BooleanRef.element) {
            displayIcon();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final HoverIconModifierNode findDescendantNodeWithCursorInBounds() {
        final Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        TraversableNodeKt.traverseDescendants(this, new InterfaceC6471c() { // from class: androidx.compose.ui.input.pointer.HoverIconModifierNode.findDescendantNodeWithCursorInBounds.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // p152r6.InterfaceC6471c
            public final TraversableNode.Companion.TraverseDescendantsAction invoke(HoverIconModifierNode hoverIconModifierNode) {
                TraversableNode.Companion.TraverseDescendantsAction traverseDescendantsAction = TraversableNode.Companion.TraverseDescendantsAction.ContinueTraversal;
                if (hoverIconModifierNode.cursorInBoundsOfNode) {
                    ref$ObjectRef.element = hoverIconModifierNode;
                    if (hoverIconModifierNode.getOverrideDescendants()) {
                        return TraversableNode.Companion.TraverseDescendantsAction.SkipSubtreeAndContinueTraversal;
                    }
                }
                return traverseDescendantsAction;
            }
        });
        return (HoverIconModifierNode) ref$ObjectRef.element;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final HoverIconModifierNode findOverridingAncestorNode() {
        final Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        TraversableNodeKt.traverseAncestors(this, new InterfaceC6471c() { // from class: androidx.compose.ui.input.pointer.HoverIconModifierNode.findOverridingAncestorNode.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // p152r6.InterfaceC6471c
            public final Boolean invoke(HoverIconModifierNode hoverIconModifierNode) {
                if (hoverIconModifierNode.getOverrideDescendants() && hoverIconModifierNode.cursorInBoundsOfNode) {
                    ref$ObjectRef.element = hoverIconModifierNode;
                }
                return Boolean.TRUE;
            }
        });
        return (HoverIconModifierNode) ref$ObjectRef.element;
    }

    private final void onEnter() {
        this.cursorInBoundsOfNode = true;
        displayIconIfDescendantsDoNotHavePriority();
    }

    private final void onExit() {
        if (this.cursorInBoundsOfNode) {
            this.cursorInBoundsOfNode = false;
            if (getIsAttached()) {
                displayIconFromAncestorNodeWithCursorInBoundsOrDefaultIcon();
            }
        }
    }

    public abstract void displayIcon(@Nullable PointerIcon icon);

    @Nullable
    public final DpTouchBoundsExpansion getDpTouchBoundsExpansion() {
        return this.dpTouchBoundsExpansion;
    }

    @NotNull
    public final PointerIcon getIcon() {
        return this.icon;
    }

    public final boolean getOverrideDescendants() {
        return this.overrideDescendants;
    }

    @Nullable
    public final PointerIconService getPointerIconService() {
        return (PointerIconService) CompositionLocalConsumerModifierNodeKt.currentValueOf(this, CompositionLocalsKt.getLocalPointerIconService());
    }

    @Override // androidx.compose.p011ui.node.PointerInputModifierNode
    /* renamed from: getTouchBoundsExpansion-RZrCHBk */
    public long mo7736getTouchBoundsExpansionRZrCHBk() {
        DpTouchBoundsExpansion dpTouchBoundsExpansion = this.dpTouchBoundsExpansion;
        return dpTouchBoundsExpansion != null ? dpTouchBoundsExpansion.m12196roundToTouchBoundsExpansionTW6G1oQ(DelegatableNodeKt.requireDensity(this)) : TouchBoundsExpansion.INSTANCE.m12409getNoneRZrCHBk();
    }

    /* renamed from: isRelevantPointerType-uerMTgs, reason: not valid java name */
    public abstract boolean mo11835isRelevantPointerTypeuerMTgs(int pointerType);

    @Override // androidx.compose.p011ui.node.PointerInputModifierNode
    public void onCancelPointerInput() {
        onExit();
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onDetach() {
        onExit();
        super.onDetach();
    }

    @Override // androidx.compose.p011ui.node.PointerInputModifierNode
    /* renamed from: onPointerEvent-H0pRuoY */
    public void mo6724onPointerEventH0pRuoY(@NotNull PointerEvent pointerEvent, @NotNull PointerEventPass pass, long bounds) {
        if (pass == PointerEventPass.Main) {
            List<PointerInputChange> changes = pointerEvent.getChanges();
            int size = changes.size();
            for (int i = 0; i < size; i++) {
                if (mo11835isRelevantPointerTypeuerMTgs(changes.get(i).getType())) {
                    int type = pointerEvent.getType();
                    PointerEventType.Companion companion = PointerEventType.INSTANCE;
                    if (PointerEventType.m11857equalsimpl0(type, companion.m11861getEnter7fucELk())) {
                        onEnter();
                        return;
                    } else {
                        if (PointerEventType.m11857equalsimpl0(pointerEvent.getType(), companion.m11862getExit7fucELk())) {
                            onExit();
                            return;
                        }
                        return;
                    }
                }
            }
        }
    }

    public final void setDpTouchBoundsExpansion(@Nullable DpTouchBoundsExpansion dpTouchBoundsExpansion) {
        this.dpTouchBoundsExpansion = dpTouchBoundsExpansion;
    }

    public final void setIcon(@NotNull PointerIcon pointerIcon) {
        if (AbstractC5830k.m5325b(this.icon, pointerIcon)) {
            return;
        }
        this.icon = pointerIcon;
        if (this.cursorInBoundsOfNode) {
            displayIconIfDescendantsDoNotHavePriority();
        }
    }

    public final void setOverrideDescendants(boolean z8) {
        if (this.overrideDescendants != z8) {
            this.overrideDescendants = z8;
            if (z8) {
                if (this.cursorInBoundsOfNode) {
                    displayIcon();
                }
            } else if (this.cursorInBoundsOfNode) {
                displayIconFromCurrentNodeOrDescendantsWithCursorInBounds();
            }
        }
    }

    public HoverIconModifierNode(@NotNull PointerIcon pointerIcon, boolean z8, @Nullable DpTouchBoundsExpansion dpTouchBoundsExpansion) {
        this.dpTouchBoundsExpansion = dpTouchBoundsExpansion;
        this.icon = pointerIcon;
        this.overrideDescendants = z8;
    }
}
