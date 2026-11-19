package androidx.compose.p006ui.focus;

import android.view.KeyEvent;
import androidx.compose.p006ui.ExperimentalComposeUiApi;
import androidx.compose.p006ui.Modifier;
import androidx.compose.p006ui.focus.FocusDirection;
import androidx.compose.p006ui.focus.FocusRequester;
import androidx.compose.p006ui.geometry.Rect;
import androidx.compose.p006ui.input.key.KeyInputModifierNode;
import androidx.compose.p006ui.input.rotary.RotaryInputModifierNode;
import androidx.compose.p006ui.input.rotary.RotaryScrollEvent;
import androidx.compose.p006ui.node.DelegatableNode;
import androidx.compose.p006ui.node.DelegatableNodeKt;
import androidx.compose.p006ui.node.ModifierNodeElement;
import androidx.compose.p006ui.node.NodeKind;
import androidx.compose.p006ui.platform.InspectorInfo;
import androidx.compose.p006ui.unit.LayoutDirection;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.app.NotificationCompat;
import androidx.exifinterface.media.ExifInterface;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(m5174d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0018\u0010\u0002\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\u0010\u0006J\u0010\u0010\u001c\u001a\u00020\u00052\u0006\u0010\u001d\u001a\u00020\u001eH\u0016J\u0018\u0010\u001c\u001a\u00020\u00052\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u001eH\u0016J\u001d\u0010 \u001a\u00020\u001e2\u0006\u0010!\u001a\u00020\"H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u001e2\u0006\u0010&\u001a\u00020'H\u0016J\n\u0010(\u001a\u0004\u0018\u00010)H\u0016J\u001d\u0010*\u001a\u00020\u001e2\u0006\u0010+\u001a\u00020,H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b-\u0010.J\b\u0010/\u001a\u00020\u0005H\u0016J\u0010\u00100\u001a\u00020\u00052\u0006\u00101\u001a\u000202H\u0016J\u0010\u00100\u001a\u00020\u00052\u0006\u00101\u001a\u000203H\u0016J\u0010\u00100\u001a\u00020\u00052\u0006\u00101\u001a\u00020\u0016H\u0016J\b\u00104\u001a\u00020\u0005H\u0016J\u001d\u00105\u001a\u00020\u001e2\u0006\u0010+\u001a\u00020,H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b6\u0010.J\u000e\u00107\u001a\u0004\u0018\u000108*\u000209H\u0002J\\\u0010:\u001a\u00020\u0005\"\n\b\u0000\u0010;\u0018\u0001*\u000209*\u0002H;2\f\u0010<\u001a\b\u0012\u0004\u0012\u0002H;0=2\u0012\u0010>\u001a\u000e\u0012\u0004\u0012\u0002H;\u0012\u0004\u0012\u00020\u00050\u00032\u0012\u0010?\u001a\u000e\u0012\u0004\u0012\u0002H;\u0012\u0004\u0012\u00020\u00050\u0003H\u0083\bø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b@\u0010AR\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\t\u001a\u00020\nX\u0096.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u0010X\u0096\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R \u0010\u0015\u001a\u00020\u0016X\u0080\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u0017\u0010\u0012\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001b\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006B"}, m5175d2 = {"Landroidx/compose/ui/focus/FocusOwnerImpl;", "Landroidx/compose/ui/focus/FocusOwner;", "onRequestApplyChangesListener", "Lkotlin/Function1;", "Lkotlin/Function0;", "", "(Lkotlin/jvm/functions/Function1;)V", "focusInvalidationManager", "Landroidx/compose/ui/focus/FocusInvalidationManager;", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "getLayoutDirection", "()Landroidx/compose/ui/unit/LayoutDirection;", "setLayoutDirection", "(Landroidx/compose/ui/unit/LayoutDirection;)V", "modifier", "Landroidx/compose/ui/Modifier;", "getModifier$annotations", "()V", "getModifier", "()Landroidx/compose/ui/Modifier;", "rootFocusNode", "Landroidx/compose/ui/focus/FocusTargetModifierNode;", "getRootFocusNode$ui_release$annotations", "getRootFocusNode$ui_release", "()Landroidx/compose/ui/focus/FocusTargetModifierNode;", "setRootFocusNode$ui_release", "(Landroidx/compose/ui/focus/FocusTargetModifierNode;)V", "clearFocus", "force", "", "refreshFocusEvents", "dispatchKeyEvent", "keyEvent", "Landroidx/compose/ui/input/key/KeyEvent;", "dispatchKeyEvent-ZmokQxo", "(Landroid/view/KeyEvent;)Z", "dispatchRotaryEvent", NotificationCompat.CATEGORY_EVENT, "Landroidx/compose/ui/input/rotary/RotaryScrollEvent;", "getFocusRect", "Landroidx/compose/ui/geometry/Rect;", "moveFocus", "focusDirection", "Landroidx/compose/ui/focus/FocusDirection;", "moveFocus-3ESFkO8", "(I)Z", "releaseFocus", "scheduleInvalidation", "node", "Landroidx/compose/ui/focus/FocusEventModifierNode;", "Landroidx/compose/ui/focus/FocusPropertiesModifierNode;", "takeFocus", "wrapAroundFocus", "wrapAroundFocus-3ESFkO8", "lastLocalKeyInputNode", "Landroidx/compose/ui/input/key/KeyInputModifierNode;", "Landroidx/compose/ui/node/DelegatableNode;", "traverseAncestors", ExifInterface.GPS_DIRECTION_TRUE, "type", "Landroidx/compose/ui/node/NodeKind;", "onPreVisit", "onVisit", "traverseAncestors-Y-YKmho", "(Landroidx/compose/ui/node/DelegatableNode;ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "ui_release"}, m5176k = 1, m5177mv = {1, 8, 0}, m5179xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nFocusOwnerImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FocusOwnerImpl.kt\nandroidx/compose/ui/focus/FocusOwnerImpl\n+ 2 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n+ 3 DelegatableNode.kt\nandroidx/compose/ui/node/DelegatableNodeKt\n+ 4 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 5 NodeKind.kt\nandroidx/compose/ui/node/NodeKind\n+ 6 Modifier.kt\nandroidx/compose/ui/Modifier$Node\n*L\n1#1,275:1\n224#1:279\n225#1:281\n226#1,3:288\n229#1:297\n224#1:301\n225#1:303\n226#1,3:310\n229#1:319\n93#2:276\n93#2:278\n95#2:298\n95#2:300\n87#2,7:333\n87#2:348\n324#3:277\n320#3:280\n324#3:299\n320#3:302\n320#3:320\n262#3,7:341\n270#3,3:350\n51#4,6:282\n33#4,6:291\n51#4,6:304\n33#4,6:313\n51#4,6:321\n33#4,6:327\n47#5:340\n196#6:349\n*S KotlinDebug\n*F\n+ 1 FocusOwnerImpl.kt\nandroidx/compose/ui/focus/FocusOwnerImpl\n*L\n177#1:279\n177#1:281\n177#1:288,3\n177#1:297\n194#1:301\n194#1:303\n194#1:310,3\n194#1:319\n175#1:276\n178#1:278\n192#1:298\n195#1:300\n242#1:333,7\n243#1:348\n175#1:277\n177#1:280\n192#1:299\n194#1:302\n224#1:320\n242#1:341,7\n242#1:350,3\n177#1:282,6\n177#1:291,6\n194#1:304,6\n194#1:313,6\n225#1:321,6\n228#1:327,6\n242#1:340\n243#1:349\n*E\n"})
/* loaded from: classes.dex */
public final class FocusOwnerImpl implements FocusOwner {
    private final FocusInvalidationManager focusInvalidationManager;
    public LayoutDirection layoutDirection;
    private final Modifier modifier;
    private FocusTargetModifierNode rootFocusNode;

    @Metadata(m5176k = 3, m5177mv = {1, 8, 0}, m5179xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[FocusStateImpl.values().length];
            try {
                iArr[FocusStateImpl.Active.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[FocusStateImpl.ActiveParent.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[FocusStateImpl.Captured.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[FocusStateImpl.Inactive.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public FocusOwnerImpl(Function1<? super Function0<Unit>, Unit> onRequestApplyChangesListener) {
        Intrinsics.checkNotNullParameter(onRequestApplyChangesListener, "onRequestApplyChangesListener");
        this.rootFocusNode = new FocusTargetModifierNode();
        this.focusInvalidationManager = new FocusInvalidationManager(onRequestApplyChangesListener);
        this.modifier = new ModifierNodeElement<FocusTargetModifierNode>() { // from class: androidx.compose.ui.focus.FocusOwnerImpl$modifier$1
            @Override // androidx.compose.p006ui.node.ModifierNodeElement
            public boolean equals(Object other) {
                return other == this;
            }

            @Override // androidx.compose.p006ui.node.ModifierNodeElement
            public int hashCode() {
                return this.this$0.getRootFocusNode().hashCode();
            }

            @Override // androidx.compose.p006ui.node.ModifierNodeElement
            public void inspectableProperties(InspectorInfo inspectorInfo) {
                Intrinsics.checkNotNullParameter(inspectorInfo, "<this>");
                inspectorInfo.setName("RootFocusTarget");
            }

            @Override // androidx.compose.p006ui.node.ModifierNodeElement
            public FocusTargetModifierNode update(FocusTargetModifierNode node) {
                Intrinsics.checkNotNullParameter(node, "node");
                return node;
            }

            @Override // androidx.compose.p006ui.node.ModifierNodeElement
            public FocusTargetModifierNode create() {
                return this.this$0.getRootFocusNode();
            }
        };
    }

    public static /* synthetic */ void getModifier$annotations() {
    }

    public static /* synthetic */ void getRootFocusNode$ui_release$annotations() {
    }

    private final KeyInputModifierNode lastLocalKeyInputNode(DelegatableNode delegatableNode) {
        int iM10773constructorimpl = NodeKind.m10773constructorimpl(1024) | NodeKind.m10773constructorimpl(8192);
        if (!delegatableNode.getNode().getIsAttached()) {
            throw new IllegalStateException("Check failed.".toString());
        }
        Modifier.Node node = delegatableNode.getNode();
        Object obj = null;
        if ((node.getAggregateChildKindSet() & iM10773constructorimpl) != 0) {
            for (Modifier.Node child = node.getChild(); child != null; child = child.getChild()) {
                if ((child.getKindSet() & iM10773constructorimpl) != 0) {
                    if ((NodeKind.m10773constructorimpl(1024) & child.getKindSet()) != 0) {
                        return (KeyInputModifierNode) obj;
                    }
                    if (!(child instanceof KeyInputModifierNode)) {
                        throw new IllegalStateException("Check failed.".toString());
                    }
                    obj = child;
                }
            }
        }
        return (KeyInputModifierNode) obj;
    }

    @ExperimentalComposeUiApi
    /* renamed from: traverseAncestors-Y-YKmho, reason: not valid java name */
    private final /* synthetic */ <T extends DelegatableNode> void m8891traverseAncestorsYYKmho(T t3, int i4, Function1<? super T, Unit> function1, Function1<? super T, Unit> function12) {
        int size;
        List<Modifier.Node> listAncestors = DelegatableNodeKt.ancestors(t3, i4);
        if (!(listAncestors instanceof List)) {
            listAncestors = null;
        }
        if (listAncestors != null && listAncestors.size() - 1 >= 0) {
            while (true) {
                int i5 = size - 1;
                function1.invoke(listAncestors.get(size));
                if (i5 < 0) {
                    break;
                } else {
                    size = i5;
                }
            }
        }
        function1.invoke(t3);
        function12.invoke(t3);
        if (listAncestors != null) {
            int size2 = listAncestors.size();
            for (int i6 = 0; i6 < size2; i6++) {
                function12.invoke(listAncestors.get(i6));
            }
        }
    }

    /* renamed from: wrapAroundFocus-3ESFkO8, reason: not valid java name */
    private final boolean m8892wrapAroundFocus3ESFkO8(int focusDirection) {
        if (this.rootFocusNode.getFocusState().getHasFocus() && !this.rootFocusNode.getFocusState().isFocused()) {
            FocusDirection.Companion companion = FocusDirection.INSTANCE;
            if (FocusDirection.m8871equalsimpl0(focusDirection, companion.m8884getNextdhqQ8s()) ? true : FocusDirection.m8871equalsimpl0(focusDirection, companion.m8886getPreviousdhqQ8s())) {
                clearFocus(false);
                if (this.rootFocusNode.getFocusState().isFocused()) {
                    return mo8889moveFocus3ESFkO8(focusDirection);
                }
                return false;
            }
        }
        return false;
    }

    @Override // androidx.compose.p006ui.focus.FocusManager
    public void clearFocus(boolean force) {
        clearFocus(force, true);
    }

    @Override // androidx.compose.p006ui.focus.FocusOwner
    /* renamed from: dispatchKeyEvent-ZmokQxo */
    public boolean mo8890dispatchKeyEventZmokQxo(KeyEvent keyEvent) {
        int size;
        Intrinsics.checkNotNullParameter(keyEvent, "keyEvent");
        FocusTargetModifierNode focusTargetModifierNodeFindActiveFocusNode = FocusTraversalKt.findActiveFocusNode(this.rootFocusNode);
        if (focusTargetModifierNodeFindActiveFocusNode == null) {
            throw new IllegalStateException("Event can't be processed because we do not have an active focus target.".toString());
        }
        KeyInputModifierNode keyInputModifierNodeLastLocalKeyInputNode = lastLocalKeyInputNode(focusTargetModifierNodeFindActiveFocusNode);
        if (keyInputModifierNodeLastLocalKeyInputNode == null) {
            Object objNearestAncestor = DelegatableNodeKt.nearestAncestor(focusTargetModifierNodeFindActiveFocusNode, NodeKind.m10773constructorimpl(8192));
            if (!(objNearestAncestor instanceof KeyInputModifierNode)) {
                objNearestAncestor = null;
            }
            keyInputModifierNodeLastLocalKeyInputNode = (KeyInputModifierNode) objNearestAncestor;
        }
        if (keyInputModifierNodeLastLocalKeyInputNode != null) {
            List<Modifier.Node> listAncestors = DelegatableNodeKt.ancestors(keyInputModifierNodeLastLocalKeyInputNode, NodeKind.m10773constructorimpl(8192));
            List<Modifier.Node> list = listAncestors instanceof List ? listAncestors : null;
            if (list != null && list.size() - 1 >= 0) {
                while (true) {
                    int i4 = size - 1;
                    if (((KeyInputModifierNode) list.get(size)).mo10374onPreKeyEventZmokQxo(keyEvent)) {
                        return true;
                    }
                    if (i4 < 0) {
                        break;
                    }
                    size = i4;
                }
            }
            if (keyInputModifierNodeLastLocalKeyInputNode.mo10374onPreKeyEventZmokQxo(keyEvent) || keyInputModifierNodeLastLocalKeyInputNode.mo10373onKeyEventZmokQxo(keyEvent)) {
                return true;
            }
            if (list != null) {
                int size2 = list.size();
                for (int i5 = 0; i5 < size2; i5++) {
                    if (((KeyInputModifierNode) list.get(i5)).mo10373onKeyEventZmokQxo(keyEvent)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // androidx.compose.p006ui.focus.FocusOwner
    public boolean dispatchRotaryEvent(RotaryScrollEvent event) {
        RotaryInputModifierNode rotaryInputModifierNode;
        int size;
        Intrinsics.checkNotNullParameter(event, "event");
        FocusTargetModifierNode focusTargetModifierNodeFindActiveFocusNode = FocusTraversalKt.findActiveFocusNode(this.rootFocusNode);
        if (focusTargetModifierNodeFindActiveFocusNode != null) {
            Object objNearestAncestor = DelegatableNodeKt.nearestAncestor(focusTargetModifierNodeFindActiveFocusNode, NodeKind.m10773constructorimpl(16384));
            if (!(objNearestAncestor instanceof RotaryInputModifierNode)) {
                objNearestAncestor = null;
            }
            rotaryInputModifierNode = (RotaryInputModifierNode) objNearestAncestor;
        } else {
            rotaryInputModifierNode = null;
        }
        if (rotaryInputModifierNode != null) {
            List<Modifier.Node> listAncestors = DelegatableNodeKt.ancestors(rotaryInputModifierNode, NodeKind.m10773constructorimpl(16384));
            List<Modifier.Node> list = listAncestors instanceof List ? listAncestors : null;
            if (list != null && list.size() - 1 >= 0) {
                while (true) {
                    int i4 = size - 1;
                    if (((RotaryInputModifierNode) list.get(size)).onPreRotaryScrollEvent(event)) {
                        return true;
                    }
                    if (i4 < 0) {
                        break;
                    }
                    size = i4;
                }
            }
            if (rotaryInputModifierNode.onPreRotaryScrollEvent(event) || rotaryInputModifierNode.onRotaryScrollEvent(event)) {
                return true;
            }
            if (list != null) {
                int size2 = list.size();
                for (int i5 = 0; i5 < size2; i5++) {
                    if (((RotaryInputModifierNode) list.get(i5)).onRotaryScrollEvent(event)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // androidx.compose.p006ui.focus.FocusOwner
    public Rect getFocusRect() {
        FocusTargetModifierNode focusTargetModifierNodeFindActiveFocusNode = FocusTraversalKt.findActiveFocusNode(this.rootFocusNode);
        if (focusTargetModifierNodeFindActiveFocusNode != null) {
            return FocusTraversalKt.focusRect(focusTargetModifierNodeFindActiveFocusNode);
        }
        return null;
    }

    @Override // androidx.compose.p006ui.focus.FocusOwner
    public LayoutDirection getLayoutDirection() {
        LayoutDirection layoutDirection = this.layoutDirection;
        if (layoutDirection != null) {
            return layoutDirection;
        }
        Intrinsics.throwUninitializedPropertyAccessException("layoutDirection");
        return null;
    }

    @Override // androidx.compose.p006ui.focus.FocusOwner
    public Modifier getModifier() {
        return this.modifier;
    }

    /* renamed from: getRootFocusNode$ui_release, reason: from getter */
    public final FocusTargetModifierNode getRootFocusNode() {
        return this.rootFocusNode;
    }

    @Override // androidx.compose.p006ui.focus.FocusManager
    /* renamed from: moveFocus-3ESFkO8 */
    public boolean mo8889moveFocus3ESFkO8(int focusDirection) {
        final FocusTargetModifierNode focusTargetModifierNodeFindActiveFocusNode = FocusTraversalKt.findActiveFocusNode(this.rootFocusNode);
        if (focusTargetModifierNodeFindActiveFocusNode == null) {
            return false;
        }
        FocusRequester focusRequesterM8897customFocusSearchOMvw8 = FocusTraversalKt.m8897customFocusSearchOMvw8(focusTargetModifierNodeFindActiveFocusNode, focusDirection, getLayoutDirection());
        FocusRequester.Companion companion = FocusRequester.INSTANCE;
        if (Intrinsics.areEqual(focusRequesterM8897customFocusSearchOMvw8, companion.getCancel())) {
            return false;
        }
        return Intrinsics.areEqual(focusRequesterM8897customFocusSearchOMvw8, companion.getDefault()) ? FocusTraversalKt.m8898focusSearchsMXa3k8(this.rootFocusNode, focusDirection, getLayoutDirection(), new Function1<FocusTargetModifierNode, Boolean>() { // from class: androidx.compose.ui.focus.FocusOwnerImpl$moveFocus$foundNextItem$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Boolean invoke(FocusTargetModifierNode destination) {
                Intrinsics.checkNotNullParameter(destination, "destination");
                if (Intrinsics.areEqual(destination, focusTargetModifierNodeFindActiveFocusNode)) {
                    return Boolean.FALSE;
                }
                Modifier.Node nodeNearestAncestor = DelegatableNodeKt.nearestAncestor(destination, NodeKind.m10773constructorimpl(1024));
                if (!(nodeNearestAncestor instanceof FocusTargetModifierNode)) {
                    nodeNearestAncestor = null;
                }
                if (((FocusTargetModifierNode) nodeNearestAncestor) != null) {
                    return Boolean.valueOf(FocusTransactionsKt.requestFocus(destination));
                }
                throw new IllegalStateException("Focus search landed at the root.".toString());
            }
        }) || m8892wrapAroundFocus3ESFkO8(focusDirection) : focusRequesterM8897customFocusSearchOMvw8.findFocusTarget$ui_release(new Function1<FocusTargetModifierNode, Boolean>() { // from class: androidx.compose.ui.focus.FocusOwnerImpl$moveFocus$1
            @Override // kotlin.jvm.functions.Function1
            public final Boolean invoke(FocusTargetModifierNode it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return Boolean.valueOf(FocusTransactionsKt.requestFocus(it));
            }
        });
    }

    @Override // androidx.compose.p006ui.focus.FocusOwner
    public void releaseFocus() {
        FocusTransactionsKt.clearFocus(this.rootFocusNode, true, true);
    }

    @Override // androidx.compose.p006ui.focus.FocusOwner
    public void scheduleInvalidation(FocusTargetModifierNode node) {
        Intrinsics.checkNotNullParameter(node, "node");
        this.focusInvalidationManager.scheduleInvalidation(node);
    }

    @Override // androidx.compose.p006ui.focus.FocusOwner
    public void setLayoutDirection(LayoutDirection layoutDirection) {
        Intrinsics.checkNotNullParameter(layoutDirection, "<set-?>");
        this.layoutDirection = layoutDirection;
    }

    public final void setRootFocusNode$ui_release(FocusTargetModifierNode focusTargetModifierNode) {
        Intrinsics.checkNotNullParameter(focusTargetModifierNode, "<set-?>");
        this.rootFocusNode = focusTargetModifierNode;
    }

    @Override // androidx.compose.p006ui.focus.FocusOwner
    public void takeFocus() {
        if (this.rootFocusNode.getFocusStateImpl() == FocusStateImpl.Inactive) {
            this.rootFocusNode.setFocusStateImpl$ui_release(FocusStateImpl.Active);
        }
    }

    @Override // androidx.compose.p006ui.focus.FocusOwner
    public void clearFocus(boolean force, boolean refreshFocusEvents) {
        FocusStateImpl focusStateImpl;
        FocusStateImpl focusStateImpl2 = this.rootFocusNode.getFocusStateImpl();
        if (FocusTransactionsKt.clearFocus(this.rootFocusNode, force, refreshFocusEvents)) {
            FocusTargetModifierNode focusTargetModifierNode = this.rootFocusNode;
            int i4 = WhenMappings.$EnumSwitchMapping$0[focusStateImpl2.ordinal()];
            if (i4 == 1 || i4 == 2 || i4 == 3) {
                focusStateImpl = FocusStateImpl.Active;
            } else {
                if (i4 != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                focusStateImpl = FocusStateImpl.Inactive;
            }
            focusTargetModifierNode.setFocusStateImpl$ui_release(focusStateImpl);
        }
    }

    @Override // androidx.compose.p006ui.focus.FocusOwner
    public void scheduleInvalidation(FocusEventModifierNode node) {
        Intrinsics.checkNotNullParameter(node, "node");
        this.focusInvalidationManager.scheduleInvalidation(node);
    }

    @Override // androidx.compose.p006ui.focus.FocusOwner
    public void scheduleInvalidation(FocusPropertiesModifierNode node) {
        Intrinsics.checkNotNullParameter(node, "node");
        this.focusInvalidationManager.scheduleInvalidation(node);
    }
}
