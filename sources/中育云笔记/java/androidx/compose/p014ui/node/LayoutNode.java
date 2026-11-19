package androidx.compose.p014ui.node;

import android.view.View;
import androidx.compose.p014ui.ComposeUiFlags;
import androidx.compose.p014ui.InternalComposeUiApi;
import androidx.compose.p014ui.Modifier;
import androidx.compose.p014ui.graphics.Canvas;
import androidx.compose.p014ui.graphics.layer.GraphicsLayer;
import androidx.compose.p014ui.input.pointer.PointerType;
import androidx.compose.p014ui.internal.InlineClassHelperKt;
import androidx.compose.p014ui.layout.IntrinsicMeasurable;
import androidx.compose.p014ui.layout.IntrinsicMeasureScope;
import androidx.compose.p014ui.layout.LayoutCoordinates;
import androidx.compose.p014ui.layout.LayoutInfo;
import androidx.compose.p014ui.layout.LayoutNodeSubcompositionsState;
import androidx.compose.p014ui.layout.Measurable;
import androidx.compose.p014ui.layout.MeasurePolicy;
import androidx.compose.p014ui.layout.MeasureResult;
import androidx.compose.p014ui.layout.MeasureScope;
import androidx.compose.p014ui.layout.ModifierInfo;
import androidx.compose.p014ui.layout.Placeable;
import androidx.compose.p014ui.layout.Remeasurement;
import androidx.compose.p014ui.node.Owner;
import androidx.compose.p014ui.platform.CompositionLocalsKt;
import androidx.compose.p014ui.platform.JvmActuals_jvmKt;
import androidx.compose.p014ui.platform.ViewConfiguration;
import androidx.compose.p014ui.semantics.SemanticsConfiguration;
import androidx.compose.p014ui.semantics.SemanticsInfo;
import androidx.compose.p014ui.semantics.SemanticsModifierKt;
import androidx.compose.p014ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.p014ui.unit.Constraints;
import androidx.compose.p014ui.unit.Density;
import androidx.compose.p014ui.unit.DpSize;
import androidx.compose.p014ui.unit.IntOffset;
import androidx.compose.p014ui.unit.IntSize;
import androidx.compose.p014ui.unit.LayoutDirection;
import androidx.compose.p014ui.viewinterop.AndroidViewHolder;
import androidx.compose.runtime.ComposeNodeLifecycleCallback;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.Comparator;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.enums.AbstractC9953a;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;
import kotlin.jvm.internal.Ref$ObjectRef;
import p181hd.InterfaceC9529a;
import p181hd.InterfaceC9540l;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import p309qc.InterfaceC10770a;
import p425yc.InterfaceC11943a;

@StabilityInferred(parameters = 0)
/* loaded from: classes2.dex */
public final class LayoutNode implements ComposeNodeLifecycleCallback, Remeasurement, OwnerScope, LayoutInfo, SemanticsInfo, ComposeUiNode, InteroperableComposeUiNode, Owner.OnLayoutCompletedListener {
    public static final int NotPlacedPlaceOrder = Integer.MAX_VALUE;
    private final MutableVectorWithMutationTracking<LayoutNode> _foldedChildren;
    private LayoutNode _foldedParent;
    private NodeCoordinator _innerLayerCoordinator;
    private Modifier _modifier;
    private SemanticsConfiguration _semanticsConfiguration;
    private MutableVector<LayoutNode> _unfoldedChildren;
    private final MutableVector<LayoutNode> _zSortedChildren;
    private boolean canMultiMeasure;
    private int compositeKeyHash;
    private CompositionLocalMap compositionLocalMap;
    private Density density;
    private int depth;
    private boolean forceUseOldLayers;
    private boolean ignoreRemeasureRequests;
    private boolean innerLayerCoordinatorIsDirty;
    private AndroidViewHolder interopViewFactoryHolder;
    private IntrinsicsPolicy intrinsicsPolicy;
    private UsageByParent intrinsicsUsageByParent;
    private boolean isCurrentlyCalculatingSemanticsConfiguration;
    private boolean isDeactivated;
    private boolean isSemanticsInvalidated;
    private final boolean isVirtual;
    private boolean isVirtualLookaheadRoot;
    private long lastSize;
    private final LayoutNodeLayoutDelegate layoutDelegate;
    private LayoutDirection layoutDirection;
    private LayoutNode lookaheadRoot;
    private MeasurePolicy measurePolicy;
    private boolean needsOnPositionedDispatch;
    private final NodeChain nodes;
    private long offsetFromRoot;
    private InterfaceC9540l onAttach;
    private InterfaceC9540l onDetach;
    private long outerToInnerOffset;
    private boolean outerToInnerOffsetDirty;
    private Owner owner;
    private Modifier pendingModifier;
    private UsageByParent previousIntrinsicsUsageByParent;
    private int semanticsId;
    private LayoutNodeSubcompositionsState subcompositionsState;
    private boolean unfoldedVirtualChildrenListDirty;
    private ViewConfiguration viewConfiguration;
    private int virtualChildrenCount;
    private boolean zSortedChildrenInvalidated;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final NoIntrinsicsMeasurePolicy ErrorMeasurePolicy = new NoIntrinsicsMeasurePolicy() { // from class: androidx.compose.ui.node.LayoutNode$Companion$ErrorMeasurePolicy$1
        @Override // androidx.compose.p014ui.layout.MeasurePolicy
        /* renamed from: measure-3p2s80s */
        public /* bridge */ /* synthetic */ MeasureResult mo26741measure3p2s80s(MeasureScope measureScope, List list, long j10) {
            return (MeasureResult) m32419measure3p2s80s(measureScope, (List<? extends Measurable>) list, j10);
        }

        /* renamed from: measure-3p2s80s, reason: not valid java name */
        public Void m32419measure3p2s80s(MeasureScope measureScope, List<? extends Measurable> list, long j10) {
            throw new IllegalStateException("Undefined measure and it is required");
        }
    };
    private static final InterfaceC9529a Constructor = new InterfaceC9529a() { // from class: androidx.compose.ui.node.LayoutNode$Companion$Constructor$1
        /* JADX WARN: Multi-variable type inference failed */
        @Override // p181hd.InterfaceC9529a
        public final LayoutNode invoke() {
            return new LayoutNode(false, 0 == true ? 1 : 0, 3, null);
        }
    };
    private static final ViewConfiguration DummyViewConfiguration = new ViewConfiguration() { // from class: androidx.compose.ui.node.LayoutNode$Companion$DummyViewConfiguration$1
        @Override // androidx.compose.p014ui.platform.ViewConfiguration
        public long getDoubleTapMinTimeMillis() {
            return 40L;
        }

        @Override // androidx.compose.p014ui.platform.ViewConfiguration
        public long getDoubleTapTimeoutMillis() {
            return 300L;
        }

        @Override // androidx.compose.p014ui.platform.ViewConfiguration
        public long getLongPressTimeoutMillis() {
            return 400L;
        }

        @Override // androidx.compose.p014ui.platform.ViewConfiguration
        /* renamed from: getMinimumTouchTargetSize-MYxV2XQ, reason: not valid java name */
        public long mo32418getMinimumTouchTargetSizeMYxV2XQ() {
            return DpSize.Companion.m33609getZeroMYxV2XQ();
        }

        @Override // androidx.compose.p014ui.platform.ViewConfiguration
        public float getTouchSlop() {
            return 16.0f;
        }
    };
    private static final Comparator<LayoutNode> ZComparator = new Comparator() { // from class: androidx.compose.ui.node.a
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return LayoutNode.ZComparator$lambda$37((LayoutNode) obj, (LayoutNode) obj2);
        }
    };

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC9972n abstractC9972n) {
            this();
        }

        public static /* synthetic */ void getNotPlacedPlaceOrder$ui_release$annotations() {
        }

        public final InterfaceC9529a getConstructor$ui_release() {
            return LayoutNode.Constructor;
        }

        public final ViewConfiguration getDummyViewConfiguration$ui_release() {
            return LayoutNode.DummyViewConfiguration;
        }

        public final Comparator<LayoutNode> getZComparator$ui_release() {
            return LayoutNode.ZComparator;
        }

        private Companion() {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class LayoutState {
        private static final /* synthetic */ InterfaceC11943a $ENTRIES;
        private static final /* synthetic */ LayoutState[] $VALUES;
        public static final LayoutState Measuring = new LayoutState("Measuring", 0);
        public static final LayoutState LookaheadMeasuring = new LayoutState("LookaheadMeasuring", 1);
        public static final LayoutState LayingOut = new LayoutState("LayingOut", 2);
        public static final LayoutState LookaheadLayingOut = new LayoutState("LookaheadLayingOut", 3);
        public static final LayoutState Idle = new LayoutState("Idle", 4);

        private static final /* synthetic */ LayoutState[] $values() {
            return new LayoutState[]{Measuring, LookaheadMeasuring, LayingOut, LookaheadLayingOut, Idle};
        }

        static {
            LayoutState[] layoutStateArr$values = $values();
            $VALUES = layoutStateArr$values;
            $ENTRIES = AbstractC9953a.m20230a(layoutStateArr$values);
        }

        private LayoutState(String str, int i10) {
        }

        public static InterfaceC11943a getEntries() {
            return $ENTRIES;
        }

        public static LayoutState valueOf(String str) {
            return (LayoutState) Enum.valueOf(LayoutState.class, str);
        }

        public static LayoutState[] values() {
            return (LayoutState[]) $VALUES.clone();
        }
    }

    @StabilityInferred(parameters = 1)
    public static abstract class NoIntrinsicsMeasurePolicy implements MeasurePolicy {
        public static final int $stable = 0;
        private final String error;

        public NoIntrinsicsMeasurePolicy(String str) {
            this.error = str;
        }

        @Override // androidx.compose.p014ui.layout.MeasurePolicy
        public /* bridge */ /* synthetic */ int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i10) {
            return ((Number) m32420maxIntrinsicHeight(intrinsicMeasureScope, (List<? extends IntrinsicMeasurable>) list, i10)).intValue();
        }

        @Override // androidx.compose.p014ui.layout.MeasurePolicy
        public /* bridge */ /* synthetic */ int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i10) {
            return ((Number) m32421maxIntrinsicWidth(intrinsicMeasureScope, (List<? extends IntrinsicMeasurable>) list, i10)).intValue();
        }

        @Override // androidx.compose.p014ui.layout.MeasurePolicy
        public /* bridge */ /* synthetic */ int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i10) {
            return ((Number) m32422minIntrinsicHeight(intrinsicMeasureScope, (List<? extends IntrinsicMeasurable>) list, i10)).intValue();
        }

        @Override // androidx.compose.p014ui.layout.MeasurePolicy
        public /* bridge */ /* synthetic */ int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i10) {
            return ((Number) m32423minIntrinsicWidth(intrinsicMeasureScope, (List<? extends IntrinsicMeasurable>) list, i10)).intValue();
        }

        /* renamed from: maxIntrinsicHeight, reason: collision with other method in class */
        public Void m32420maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, int i10) {
            throw new IllegalStateException(this.error.toString());
        }

        /* renamed from: maxIntrinsicWidth, reason: collision with other method in class */
        public Void m32421maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, int i10) {
            throw new IllegalStateException(this.error.toString());
        }

        /* renamed from: minIntrinsicHeight, reason: collision with other method in class */
        public Void m32422minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, int i10) {
            throw new IllegalStateException(this.error.toString());
        }

        /* renamed from: minIntrinsicWidth, reason: collision with other method in class */
        public Void m32423minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, int i10) {
            throw new IllegalStateException(this.error.toString());
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class UsageByParent {
        private static final /* synthetic */ InterfaceC11943a $ENTRIES;
        private static final /* synthetic */ UsageByParent[] $VALUES;
        public static final UsageByParent InMeasureBlock = new UsageByParent("InMeasureBlock", 0);
        public static final UsageByParent InLayoutBlock = new UsageByParent("InLayoutBlock", 1);
        public static final UsageByParent NotUsed = new UsageByParent("NotUsed", 2);

        private static final /* synthetic */ UsageByParent[] $values() {
            return new UsageByParent[]{InMeasureBlock, InLayoutBlock, NotUsed};
        }

        static {
            UsageByParent[] usageByParentArr$values = $values();
            $VALUES = usageByParentArr$values;
            $ENTRIES = AbstractC9953a.m20230a(usageByParentArr$values);
        }

        private UsageByParent(String str, int i10) {
        }

        public static InterfaceC11943a getEntries() {
            return $ENTRIES;
        }

        public static UsageByParent valueOf(String str) {
            return (UsageByParent) Enum.valueOf(UsageByParent.class, str);
        }

        public static UsageByParent[] values() {
            return (UsageByParent[]) $VALUES.clone();
        }
    }

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[LayoutState.values().length];
            try {
                iArr[LayoutState.Idle.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public LayoutNode() {
        this(false, 0 == true ? 1 : 0, 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int ZComparator$lambda$37(LayoutNode layoutNode, LayoutNode layoutNode2) {
        return layoutNode.getZIndex() == layoutNode2.getZIndex() ? AbstractC9979u.m20296i(layoutNode.getPlaceOrder$ui_release(), layoutNode2.getPlaceOrder$ui_release()) : Float.compare(layoutNode.getZIndex(), layoutNode2.getZIndex());
    }

    private final void applyModifier(Modifier modifier) {
        this._modifier = modifier;
        this.nodes.updateFrom$ui_release(modifier);
        this.layoutDelegate.updateParentData();
        if (this.lookaheadRoot == null && this.nodes.m32466hasH91voCI$ui_release(NodeKind.m32510constructorimpl(512))) {
            setLookaheadRoot(this);
        }
    }

    private final SemanticsConfiguration calculateSemanticsConfiguration() {
        this.isCurrentlyCalculatingSemanticsConfiguration = true;
        final Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        ref$ObjectRef.f23402c = new SemanticsConfiguration();
        LayoutNodeKt.requireOwner(this).getSnapshotObserver().observeSemanticsReads$ui_release(this, new InterfaceC9529a() { // from class: androidx.compose.ui.node.LayoutNode.calculateSemanticsConfiguration.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // p181hd.InterfaceC9529a
            public /* bridge */ /* synthetic */ Object invoke() {
                m32425invoke();
                return C10786q.f26013a;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r4v0 */
            /* JADX WARN: Type inference failed for: r4v1, types: [androidx.compose.ui.Modifier$Node] */
            /* JADX WARN: Type inference failed for: r4v10 */
            /* JADX WARN: Type inference failed for: r4v11 */
            /* JADX WARN: Type inference failed for: r4v3 */
            /* JADX WARN: Type inference failed for: r4v4, types: [androidx.compose.ui.Modifier$Node] */
            /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r4v6 */
            /* JADX WARN: Type inference failed for: r4v7 */
            /* JADX WARN: Type inference failed for: r4v8 */
            /* JADX WARN: Type inference failed for: r4v9 */
            /* renamed from: invoke, reason: collision with other method in class */
            public final void m32425invoke() {
                NodeChain nodes$ui_release = LayoutNode.this.getNodes$ui_release();
                int iM32510constructorimpl = NodeKind.m32510constructorimpl(8);
                Ref$ObjectRef<SemanticsConfiguration> ref$ObjectRef2 = ref$ObjectRef;
                if ((nodes$ui_release.getAggregateChildKindSet() & iM32510constructorimpl) != 0) {
                    for (Modifier.Node tail$ui_release = nodes$ui_release.getTail$ui_release(); tail$ui_release != null; tail$ui_release = tail$ui_release.getParent$ui_release()) {
                        if ((tail$ui_release.getKindSet$ui_release() & iM32510constructorimpl) != 0) {
                            DelegatingNode delegatingNodePop = tail$ui_release;
                            MutableVector mutableVector = null;
                            while (delegatingNodePop != 0) {
                                if (delegatingNodePop instanceof SemanticsModifierNode) {
                                    SemanticsModifierNode semanticsModifierNode = (SemanticsModifierNode) delegatingNodePop;
                                    if (semanticsModifierNode.getShouldClearDescendantSemantics()) {
                                        SemanticsConfiguration semanticsConfiguration = new SemanticsConfiguration();
                                        ref$ObjectRef2.f23402c = semanticsConfiguration;
                                        semanticsConfiguration.setClearingSemantics(true);
                                    }
                                    if (semanticsModifierNode.getShouldMergeDescendantSemantics()) {
                                        ((SemanticsConfiguration) ref$ObjectRef2.f23402c).setMergingSemanticsOfDescendants(true);
                                    }
                                    semanticsModifierNode.applySemantics((SemanticsPropertyReceiver) ref$ObjectRef2.f23402c);
                                } else if ((delegatingNodePop.getKindSet$ui_release() & iM32510constructorimpl) != 0 && (delegatingNodePop instanceof DelegatingNode)) {
                                    Modifier.Node delegate$ui_release = delegatingNodePop.getDelegate$ui_release();
                                    int i10 = 0;
                                    delegatingNodePop = delegatingNodePop;
                                    while (delegate$ui_release != null) {
                                        if ((delegate$ui_release.getKindSet$ui_release() & iM32510constructorimpl) != 0) {
                                            i10++;
                                            if (i10 == 1) {
                                                delegatingNodePop = delegate$ui_release;
                                            } else {
                                                if (mutableVector == null) {
                                                    mutableVector = new MutableVector(new Modifier.Node[16], 0);
                                                }
                                                if (delegatingNodePop != 0) {
                                                    mutableVector.add(delegatingNodePop);
                                                    delegatingNodePop = 0;
                                                }
                                                mutableVector.add(delegate$ui_release);
                                            }
                                        }
                                        delegate$ui_release = delegate$ui_release.getChild$ui_release();
                                        delegatingNodePop = delegatingNodePop;
                                    }
                                    if (i10 == 1) {
                                    }
                                }
                                delegatingNodePop = DelegatableNodeKt.pop(mutableVector);
                            }
                        }
                    }
                }
            }
        });
        this.isCurrentlyCalculatingSemanticsConfiguration = false;
        return (SemanticsConfiguration) ref$ObjectRef.f23402c;
    }

    private final void clearSubtreePlacementIntrinsicsUsage() {
        this.previousIntrinsicsUsageByParent = this.intrinsicsUsageByParent;
        this.intrinsicsUsageByParent = UsageByParent.NotUsed;
        MutableVector<LayoutNode> mutableVector = get_children$ui_release();
        LayoutNode[] layoutNodeArr = mutableVector.content;
        int size = mutableVector.getSize();
        for (int i10 = 0; i10 < size; i10++) {
            LayoutNode layoutNode = layoutNodeArr[i10];
            if (layoutNode.intrinsicsUsageByParent == UsageByParent.InLayoutBlock) {
                layoutNode.clearSubtreePlacementIntrinsicsUsage();
            }
        }
    }

    private final String debugTreeToString(int i10) {
        StringBuilder sb2 = new StringBuilder();
        for (int i11 = 0; i11 < i10; i11++) {
            sb2.append("  ");
        }
        sb2.append("|-");
        sb2.append(toString());
        sb2.append('\n');
        MutableVector<LayoutNode> mutableVector = get_children$ui_release();
        LayoutNode[] layoutNodeArr = mutableVector.content;
        int size = mutableVector.getSize();
        for (int i12 = 0; i12 < size; i12++) {
            sb2.append(layoutNodeArr[i12].debugTreeToString(i10 + 1));
        }
        String string = sb2.toString();
        if (i10 != 0) {
            return string;
        }
        String strSubstring = string.substring(0, string.length() - 1);
        AbstractC9979u.m20293f(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static /* synthetic */ String debugTreeToString$default(LayoutNode layoutNode, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = 0;
        }
        return layoutNode.debugTreeToString(i10);
    }

    private final String exceptionMessageForParentingOrOwnership(LayoutNode layoutNode) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Cannot insert ");
        sb2.append(layoutNode);
        sb2.append(" because it already has a parent or an owner. This tree: ");
        sb2.append(debugTreeToString$default(this, 0, 1, null));
        sb2.append(" Other tree: ");
        LayoutNode layoutNode2 = layoutNode._foldedParent;
        sb2.append(layoutNode2 != null ? debugTreeToString$default(layoutNode2, 0, 1, null) : null);
        return sb2.toString();
    }

    @InterfaceC10770a
    public static /* synthetic */ void getCanMultiMeasure$ui_release$annotations() {
    }

    private final IntrinsicsPolicy getOrCreateIntrinsicsPolicy() {
        IntrinsicsPolicy intrinsicsPolicy = this.intrinsicsPolicy;
        if (intrinsicsPolicy != null) {
            return intrinsicsPolicy;
        }
        IntrinsicsPolicy intrinsicsPolicy2 = new IntrinsicsPolicy(this, getMeasurePolicy());
        this.intrinsicsPolicy = intrinsicsPolicy2;
        return intrinsicsPolicy2;
    }

    private final float getZIndex() {
        return getMeasurePassDelegate$ui_release().getZIndex$ui_release();
    }

    public static /* synthetic */ void getZSortedChildren$annotations() {
    }

    /* renamed from: hitTest-6fMxITs$ui_release$default, reason: not valid java name */
    public static /* synthetic */ void m32404hitTest6fMxITs$ui_release$default(LayoutNode layoutNode, long j10, HitTestResult hitTestResult, int i10, boolean z10, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            i10 = PointerType.Companion.m32183getUnknownT8wyACA();
        }
        int i12 = i10;
        if ((i11 & 8) != 0) {
            z10 = true;
        }
        layoutNode.m32411hitTest6fMxITs$ui_release(j10, hitTestResult, i12, z10);
    }

    /* renamed from: hitTestSemantics-6fMxITs$ui_release$default, reason: not valid java name */
    public static /* synthetic */ void m32405hitTestSemantics6fMxITs$ui_release$default(LayoutNode layoutNode, long j10, HitTestResult hitTestResult, int i10, boolean z10, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            i10 = PointerType.Companion.m32182getTouchT8wyACA();
        }
        int i12 = i10;
        if ((i11 & 8) != 0) {
            z10 = true;
        }
        layoutNode.m32412hitTestSemantics6fMxITs$ui_release(j10, hitTestResult, i12, z10);
    }

    public static /* synthetic */ void invalidateSubtree$default(LayoutNode layoutNode, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = true;
        }
        layoutNode.invalidateSubtree(z10);
    }

    private final void invalidateUnfoldedVirtualChildren() {
        LayoutNode layoutNode;
        if (this.virtualChildrenCount > 0) {
            this.unfoldedVirtualChildrenListDirty = true;
        }
        if (!this.isVirtual || (layoutNode = this._foldedParent) == null) {
            return;
        }
        layoutNode.invalidateUnfoldedVirtualChildren();
    }

    /* renamed from: lookaheadRemeasure-_Sx5XlM$ui_release$default, reason: not valid java name */
    public static /* synthetic */ boolean m32406lookaheadRemeasure_Sx5XlM$ui_release$default(LayoutNode layoutNode, Constraints constraints, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            constraints = layoutNode.layoutDelegate.m32429getLastLookaheadConstraintsDWUhwKw();
        }
        return layoutNode.m32413lookaheadRemeasure_Sx5XlM$ui_release(constraints);
    }

    private final void onChildRemoved(LayoutNode layoutNode) {
        if (layoutNode.layoutDelegate.getChildrenAccessingCoordinatesDuringPlacement() > 0) {
            this.layoutDelegate.setChildrenAccessingCoordinatesDuringPlacement(r0.getChildrenAccessingCoordinatesDuringPlacement() - 1);
        }
        if (this.owner != null) {
            layoutNode.detach$ui_release();
        }
        layoutNode._foldedParent = null;
        layoutNode.getOuterCoordinator$ui_release().setWrappedBy$ui_release(null);
        if (layoutNode.isVirtual) {
            this.virtualChildrenCount--;
            MutableVector<LayoutNode> vector = layoutNode._foldedChildren.getVector();
            LayoutNode[] layoutNodeArr = vector.content;
            int size = vector.getSize();
            for (int i10 = 0; i10 < size; i10++) {
                layoutNodeArr[i10].getOuterCoordinator$ui_release().setWrappedBy$ui_release(null);
            }
        }
        invalidateUnfoldedVirtualChildren();
        onZSortedChildrenInvalidated$ui_release();
    }

    private final void onDensityOrLayoutDirectionChanged() {
        invalidateMeasurements$ui_release();
        LayoutNode parent$ui_release = getParent$ui_release();
        if (parent$ui_release != null) {
            parent$ui_release.invalidateLayer$ui_release();
        }
        invalidateLayers$ui_release();
    }

    private final void recreateUnfoldedChildrenIfDirty() {
        if (this.unfoldedVirtualChildrenListDirty) {
            this.unfoldedVirtualChildrenListDirty = false;
            MutableVector<LayoutNode> mutableVector = this._unfoldedChildren;
            if (mutableVector == null) {
                mutableVector = new MutableVector<>(new LayoutNode[16], 0);
                this._unfoldedChildren = mutableVector;
            }
            mutableVector.clear();
            MutableVector<LayoutNode> vector = this._foldedChildren.getVector();
            LayoutNode[] layoutNodeArr = vector.content;
            int size = vector.getSize();
            for (int i10 = 0; i10 < size; i10++) {
                LayoutNode layoutNode = layoutNodeArr[i10];
                if (layoutNode.isVirtual) {
                    mutableVector.addAll(mutableVector.getSize(), layoutNode.get_children$ui_release());
                } else {
                    mutableVector.add(layoutNode);
                }
            }
            this.layoutDelegate.markChildrenDirty();
        }
    }

    /* renamed from: remeasure-_Sx5XlM$ui_release$default, reason: not valid java name */
    public static /* synthetic */ boolean m32407remeasure_Sx5XlM$ui_release$default(LayoutNode layoutNode, Constraints constraints, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            constraints = layoutNode.layoutDelegate.m32428getLastConstraintsDWUhwKw();
        }
        return layoutNode.m32414remeasure_Sx5XlM$ui_release(constraints);
    }

    public static /* synthetic */ void requestLookaheadRelayout$ui_release$default(LayoutNode layoutNode, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        layoutNode.requestLookaheadRelayout$ui_release(z10);
    }

    public static /* synthetic */ void requestLookaheadRemeasure$ui_release$default(LayoutNode layoutNode, boolean z10, boolean z11, boolean z12, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        if ((i10 & 2) != 0) {
            z11 = true;
        }
        if ((i10 & 4) != 0) {
            z12 = true;
        }
        layoutNode.requestLookaheadRemeasure$ui_release(z10, z11, z12);
    }

    public static /* synthetic */ void requestRelayout$ui_release$default(LayoutNode layoutNode, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        layoutNode.requestRelayout$ui_release(z10);
    }

    public static /* synthetic */ void requestRemeasure$ui_release$default(LayoutNode layoutNode, boolean z10, boolean z11, boolean z12, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        if ((i10 & 2) != 0) {
            z11 = true;
        }
        if ((i10 & 4) != 0) {
            z12 = true;
        }
        layoutNode.requestRemeasure$ui_release(z10, z11, z12);
    }

    private final void resetModifierState() {
        this.nodes.resetState$ui_release();
    }

    private final void setLookaheadRoot(LayoutNode layoutNode) {
        if (AbstractC9979u.m20289b(layoutNode, this.lookaheadRoot)) {
            return;
        }
        this.lookaheadRoot = layoutNode;
        if (layoutNode != null) {
            this.layoutDelegate.ensureLookaheadDelegateCreated$ui_release();
            NodeCoordinator wrapped$ui_release = getInnerCoordinator$ui_release().getWrapped$ui_release();
            for (NodeCoordinator outerCoordinator$ui_release = getOuterCoordinator$ui_release(); !AbstractC9979u.m20289b(outerCoordinator$ui_release, wrapped$ui_release) && outerCoordinator$ui_release != null; outerCoordinator$ui_release = outerCoordinator$ui_release.getWrapped$ui_release()) {
                outerCoordinator$ui_release.ensureLookaheadDelegateCreated();
            }
        } else {
            this.layoutDelegate.clearLookaheadDelegate();
        }
        invalidateMeasurements$ui_release();
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x003f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void attach$ui_release(androidx.compose.p014ui.node.Owner r7) {
        /*
            Method dump skipped, instructions count: 380
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p014ui.node.LayoutNode.attach$ui_release(androidx.compose.ui.node.Owner):void");
    }

    public final void clearSubtreeIntrinsicsUsage$ui_release() {
        this.previousIntrinsicsUsageByParent = this.intrinsicsUsageByParent;
        this.intrinsicsUsageByParent = UsageByParent.NotUsed;
        MutableVector<LayoutNode> mutableVector = get_children$ui_release();
        LayoutNode[] layoutNodeArr = mutableVector.content;
        int size = mutableVector.getSize();
        for (int i10 = 0; i10 < size; i10++) {
            LayoutNode layoutNode = layoutNodeArr[i10];
            if (layoutNode.intrinsicsUsageByParent != UsageByParent.NotUsed) {
                layoutNode.clearSubtreeIntrinsicsUsage$ui_release();
            }
        }
    }

    public final void detach$ui_release() {
        Owner owner = this.owner;
        if (owner == null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Cannot detach node that is already detached!  Tree: ");
            LayoutNode parent$ui_release = getParent$ui_release();
            sb2.append(parent$ui_release != null ? debugTreeToString$default(parent$ui_release, 0, 1, null) : null);
            InlineClassHelperKt.throwIllegalStateExceptionForNullCheck(sb2.toString());
            throw new KotlinNothingValueException();
        }
        LayoutNode parent$ui_release2 = getParent$ui_release();
        if (parent$ui_release2 != null) {
            parent$ui_release2.invalidateLayer$ui_release();
            parent$ui_release2.invalidateMeasurements$ui_release();
            MeasurePassDelegate measurePassDelegate$ui_release = getMeasurePassDelegate$ui_release();
            UsageByParent usageByParent = UsageByParent.NotUsed;
            measurePassDelegate$ui_release.setMeasuredByParent$ui_release(usageByParent);
            LookaheadPassDelegate lookaheadPassDelegate$ui_release = getLookaheadPassDelegate$ui_release();
            if (lookaheadPassDelegate$ui_release != null) {
                lookaheadPassDelegate$ui_release.setMeasuredByParent$ui_release(usageByParent);
            }
        }
        this.layoutDelegate.resetAlignmentLines();
        InterfaceC9540l interfaceC9540l = this.onDetach;
        if (interfaceC9540l != null) {
            interfaceC9540l.invoke(owner);
        }
        if (!ComposeUiFlags.isSemanticAutofillEnabled && this.nodes.m32466hasH91voCI$ui_release(NodeKind.m32510constructorimpl(8))) {
            invalidateSemantics$ui_release();
        }
        this.nodes.runDetachLifecycle$ui_release();
        this.ignoreRemeasureRequests = true;
        MutableVector<LayoutNode> vector = this._foldedChildren.getVector();
        LayoutNode[] layoutNodeArr = vector.content;
        int size = vector.getSize();
        for (int i10 = 0; i10 < size; i10++) {
            layoutNodeArr[i10].detach$ui_release();
        }
        this.ignoreRemeasureRequests = false;
        this.nodes.markAsDetached$ui_release();
        owner.onDetach(this);
        this.owner = null;
        setLookaheadRoot(null);
        this.depth = 0;
        getMeasurePassDelegate$ui_release().onNodeDetached();
        LookaheadPassDelegate lookaheadPassDelegate$ui_release2 = getLookaheadPassDelegate$ui_release();
        if (lookaheadPassDelegate$ui_release2 != null) {
            lookaheadPassDelegate$ui_release2.onNodeDetached();
        }
        if (ComposeUiFlags.isSemanticAutofillEnabled && this.nodes.m32466hasH91voCI$ui_release(NodeKind.m32510constructorimpl(8))) {
            SemanticsConfiguration semanticsConfiguration = this._semanticsConfiguration;
            this._semanticsConfiguration = null;
            this.isSemanticsInvalidated = false;
            owner.getSemanticsOwner().notifySemanticsChange$ui_release(this, semanticsConfiguration);
            owner.onSemanticsChange();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    public final void dispatchOnPositionedCallbacks$ui_release() {
        if (getLayoutState$ui_release() != LayoutState.Idle || getLayoutPending$ui_release() || getMeasurePending$ui_release() || isDeactivated() || !isPlaced()) {
            return;
        }
        NodeChain nodeChain = this.nodes;
        int iM32510constructorimpl = NodeKind.m32510constructorimpl(256);
        if ((nodeChain.getAggregateChildKindSet() & iM32510constructorimpl) != 0) {
            for (Modifier.Node head$ui_release = nodeChain.getHead$ui_release(); head$ui_release != null; head$ui_release = head$ui_release.getChild$ui_release()) {
                if ((head$ui_release.getKindSet$ui_release() & iM32510constructorimpl) != 0) {
                    DelegatingNode delegatingNodePop = head$ui_release;
                    MutableVector mutableVector = null;
                    while (delegatingNodePop != 0) {
                        if (delegatingNodePop instanceof GlobalPositionAwareModifierNode) {
                            GlobalPositionAwareModifierNode globalPositionAwareModifierNode = (GlobalPositionAwareModifierNode) delegatingNodePop;
                            globalPositionAwareModifierNode.onGloballyPositioned(DelegatableNodeKt.m32356requireCoordinator64DMado(globalPositionAwareModifierNode, NodeKind.m32510constructorimpl(256)));
                        } else if ((delegatingNodePop.getKindSet$ui_release() & iM32510constructorimpl) != 0 && (delegatingNodePop instanceof DelegatingNode)) {
                            Modifier.Node delegate$ui_release = delegatingNodePop.getDelegate$ui_release();
                            int i10 = 0;
                            delegatingNodePop = delegatingNodePop;
                            while (delegate$ui_release != null) {
                                if ((delegate$ui_release.getKindSet$ui_release() & iM32510constructorimpl) != 0) {
                                    i10++;
                                    if (i10 == 1) {
                                        delegatingNodePop = delegate$ui_release;
                                    } else {
                                        if (mutableVector == null) {
                                            mutableVector = new MutableVector(new Modifier.Node[16], 0);
                                        }
                                        if (delegatingNodePop != 0) {
                                            mutableVector.add(delegatingNodePop);
                                            delegatingNodePop = 0;
                                        }
                                        mutableVector.add(delegate$ui_release);
                                    }
                                }
                                delegate$ui_release = delegate$ui_release.getChild$ui_release();
                                delegatingNodePop = delegatingNodePop;
                            }
                            if (i10 == 1) {
                            }
                        }
                        delegatingNodePop = DelegatableNodeKt.pop(mutableVector);
                    }
                }
                if ((head$ui_release.getAggregateChildKindSet$ui_release() & iM32510constructorimpl) == 0) {
                    return;
                }
            }
        }
    }

    public final void draw$ui_release(Canvas canvas, GraphicsLayer graphicsLayer) {
        getOuterCoordinator$ui_release().draw(canvas, graphicsLayer);
    }

    public final void forEachChild(InterfaceC9540l interfaceC9540l) {
        MutableVector<LayoutNode> mutableVector = get_children$ui_release();
        LayoutNode[] layoutNodeArr = mutableVector.content;
        int size = mutableVector.getSize();
        for (int i10 = 0; i10 < size; i10++) {
            interfaceC9540l.invoke(layoutNodeArr[i10]);
        }
    }

    public final void forEachChildIndexed(InterfaceC9544p interfaceC9544p) {
        MutableVector<LayoutNode> mutableVector = get_children$ui_release();
        LayoutNode[] layoutNodeArr = mutableVector.content;
        int size = mutableVector.getSize();
        for (int i10 = 0; i10 < size; i10++) {
            interfaceC9544p.invoke(Integer.valueOf(i10), layoutNodeArr[i10]);
        }
    }

    public final void forEachCoordinator$ui_release(InterfaceC9540l interfaceC9540l) {
        NodeCoordinator innerCoordinator$ui_release = getInnerCoordinator$ui_release();
        for (NodeCoordinator outerCoordinator$ui_release = getOuterCoordinator$ui_release(); outerCoordinator$ui_release != innerCoordinator$ui_release; outerCoordinator$ui_release = outerCoordinator$ui_release.getWrapped$ui_release()) {
            AbstractC9979u.m20292e(outerCoordinator$ui_release, "null cannot be cast to non-null type androidx.compose.ui.node.LayoutModifierNodeCoordinator");
            interfaceC9540l.invoke((LayoutModifierNodeCoordinator) outerCoordinator$ui_release);
        }
    }

    public final void forEachCoordinatorIncludingInner$ui_release(InterfaceC9540l interfaceC9540l) {
        NodeCoordinator wrapped$ui_release = getInnerCoordinator$ui_release().getWrapped$ui_release();
        for (NodeCoordinator outerCoordinator$ui_release = getOuterCoordinator$ui_release(); !AbstractC9979u.m20289b(outerCoordinator$ui_release, wrapped$ui_release) && outerCoordinator$ui_release != null; outerCoordinator$ui_release = outerCoordinator$ui_release.getWrapped$ui_release()) {
            interfaceC9540l.invoke(outerCoordinator$ui_release);
        }
    }

    @Override // androidx.compose.p014ui.layout.Remeasurement
    public void forceRemeasure() {
        LayoutNode layoutNode;
        if (this.lookaheadRoot != null) {
            layoutNode = this;
            requestLookaheadRemeasure$ui_release$default(layoutNode, false, false, false, 5, null);
        } else {
            requestRemeasure$ui_release$default(this, false, false, false, 5, null);
            layoutNode = this;
        }
        Constraints constraintsM32428getLastConstraintsDWUhwKw = layoutNode.layoutDelegate.m32428getLastConstraintsDWUhwKw();
        if (constraintsM32428getLastConstraintsDWUhwKw != null) {
            Owner owner = layoutNode.owner;
            if (owner != null) {
                owner.mo32571measureAndLayout0kLqBqw(this, constraintsM32428getLastConstraintsDWUhwKw.m33460unboximpl());
                return;
            }
            return;
        }
        Owner owner2 = layoutNode.owner;
        if (owner2 != null) {
            Owner.measureAndLayout$default(owner2, false, 1, null);
        }
    }

    public final boolean getAlignmentLinesRequired$ui_release() {
        AlignmentLinesOwner lookaheadAlignmentLinesOwner$ui_release;
        AlignmentLines alignmentLines;
        LayoutNodeLayoutDelegate layoutNodeLayoutDelegate = this.layoutDelegate;
        return layoutNodeLayoutDelegate.getAlignmentLinesOwner$ui_release().getAlignmentLines().getRequired$ui_release() || !((lookaheadAlignmentLinesOwner$ui_release = layoutNodeLayoutDelegate.getLookaheadAlignmentLinesOwner$ui_release()) == null || (alignmentLines = lookaheadAlignmentLinesOwner$ui_release.getAlignmentLines()) == null || !alignmentLines.getRequired$ui_release());
    }

    public final boolean getApplyingModifierOnAttach$ui_release() {
        return this.pendingModifier != null;
    }

    public final boolean getCanMultiMeasure$ui_release() {
        return this.canMultiMeasure;
    }

    public final List<Measurable> getChildLookaheadMeasurables$ui_release() {
        LookaheadPassDelegate lookaheadPassDelegate$ui_release = getLookaheadPassDelegate$ui_release();
        AbstractC9979u.m20291d(lookaheadPassDelegate$ui_release);
        return lookaheadPassDelegate$ui_release.getChildDelegates$ui_release();
    }

    public final List<Measurable> getChildMeasurables$ui_release() {
        return getMeasurePassDelegate$ui_release().getChildDelegates$ui_release();
    }

    public final List<LayoutNode> getChildren$ui_release() {
        return get_children$ui_release().asMutableList();
    }

    @Override // androidx.compose.p014ui.semantics.SemanticsInfo
    public List<SemanticsInfo> getChildrenInfo() {
        return getChildren$ui_release();
    }

    @Override // androidx.compose.p014ui.node.ComposeUiNode
    public int getCompositeKeyHash() {
        return this.compositeKeyHash;
    }

    @Override // androidx.compose.p014ui.node.ComposeUiNode
    public CompositionLocalMap getCompositionLocalMap() {
        return this.compositionLocalMap;
    }

    @Override // androidx.compose.p014ui.layout.LayoutInfo
    public LayoutCoordinates getCoordinates() {
        return getInnerCoordinator$ui_release();
    }

    @Override // androidx.compose.p014ui.layout.LayoutInfo, androidx.compose.p014ui.node.ComposeUiNode
    public Density getDensity() {
        return this.density;
    }

    public final int getDepth$ui_release() {
        return this.depth;
    }

    public final List<LayoutNode> getFoldedChildren$ui_release() {
        return this._foldedChildren.getVector().asMutableList();
    }

    public final boolean getForceUseOldLayers() {
        return this.forceUseOldLayers;
    }

    public final boolean getHasFixedInnerContentConstraints$ui_release() {
        long jM32489getLastMeasurementConstraintsmsEJaDk$ui_release = getInnerCoordinator$ui_release().m32489getLastMeasurementConstraintsmsEJaDk$ui_release();
        return Constraints.m33452getHasFixedWidthimpl(jM32489getLastMeasurementConstraintsmsEJaDk$ui_release) && Constraints.m33451getHasFixedHeightimpl(jM32489getLastMeasurementConstraintsmsEJaDk$ui_release);
    }

    @Override // androidx.compose.p014ui.layout.LayoutInfo
    public int getHeight() {
        return this.layoutDelegate.getHeight$ui_release();
    }

    public final NodeCoordinator getInnerCoordinator$ui_release() {
        return this.nodes.getInnerCoordinator$ui_release();
    }

    public final NodeCoordinator getInnerLayerCoordinator$ui_release() {
        if (this.innerLayerCoordinatorIsDirty) {
            NodeCoordinator innerCoordinator$ui_release = getInnerCoordinator$ui_release();
            NodeCoordinator wrappedBy$ui_release = getOuterCoordinator$ui_release().getWrappedBy$ui_release();
            this._innerLayerCoordinator = null;
            while (true) {
                if (AbstractC9979u.m20289b(innerCoordinator$ui_release, wrappedBy$ui_release)) {
                    break;
                }
                if ((innerCoordinator$ui_release != null ? innerCoordinator$ui_release.getLayer() : null) != null) {
                    this._innerLayerCoordinator = innerCoordinator$ui_release;
                    break;
                }
                innerCoordinator$ui_release = innerCoordinator$ui_release != null ? innerCoordinator$ui_release.getWrappedBy$ui_release() : null;
            }
        }
        NodeCoordinator nodeCoordinator = this._innerLayerCoordinator;
        if (nodeCoordinator == null || nodeCoordinator.getLayer() != null) {
            return nodeCoordinator;
        }
        InlineClassHelperKt.throwIllegalStateExceptionForNullCheck("layer was not set");
        throw new KotlinNothingValueException();
    }

    public final boolean getInnerLayerCoordinatorIsDirty$ui_release() {
        return this.innerLayerCoordinatorIsDirty;
    }

    @Override // androidx.compose.p014ui.node.InteroperableComposeUiNode
    @InternalComposeUiApi
    public View getInteropView() {
        AndroidViewHolder androidViewHolder = this.interopViewFactoryHolder;
        if (androidViewHolder != null) {
            return androidViewHolder.getInteropView();
        }
        return null;
    }

    public final AndroidViewHolder getInteropViewFactoryHolder$ui_release() {
        return this.interopViewFactoryHolder;
    }

    public final UsageByParent getIntrinsicsUsageByParent$ui_release() {
        return this.intrinsicsUsageByParent;
    }

    /* renamed from: getLastSize-YbymL2g$ui_release, reason: not valid java name */
    public final long m32408getLastSizeYbymL2g$ui_release() {
        return this.lastSize;
    }

    public final LayoutNodeLayoutDelegate getLayoutDelegate$ui_release() {
        return this.layoutDelegate;
    }

    @Override // androidx.compose.p014ui.layout.LayoutInfo, androidx.compose.p014ui.node.ComposeUiNode
    public LayoutDirection getLayoutDirection() {
        return this.layoutDirection;
    }

    public final boolean getLayoutPending$ui_release() {
        return this.layoutDelegate.getLayoutPending$ui_release();
    }

    public final LayoutState getLayoutState$ui_release() {
        return this.layoutDelegate.getLayoutState$ui_release();
    }

    public final boolean getLookaheadLayoutPending$ui_release() {
        return this.layoutDelegate.getLookaheadLayoutPending$ui_release();
    }

    public final boolean getLookaheadMeasurePending$ui_release() {
        return this.layoutDelegate.getLookaheadMeasurePending$ui_release();
    }

    public final LookaheadPassDelegate getLookaheadPassDelegate$ui_release() {
        return this.layoutDelegate.getLookaheadPassDelegate$ui_release();
    }

    public final LayoutNode getLookaheadRoot$ui_release() {
        return this.lookaheadRoot;
    }

    public final LayoutNodeDrawScope getMDrawScope$ui_release() {
        return LayoutNodeKt.requireOwner(this).getSharedDrawScope();
    }

    public final MeasurePassDelegate getMeasurePassDelegate$ui_release() {
        return this.layoutDelegate.getMeasurePassDelegate$ui_release();
    }

    public final boolean getMeasurePending$ui_release() {
        return this.layoutDelegate.getMeasurePending$ui_release();
    }

    @Override // androidx.compose.p014ui.node.ComposeUiNode
    public MeasurePolicy getMeasurePolicy() {
        return this.measurePolicy;
    }

    public final UsageByParent getMeasuredByParent$ui_release() {
        return getMeasurePassDelegate$ui_release().getMeasuredByParent$ui_release();
    }

    public final UsageByParent getMeasuredByParentInLookahead$ui_release() {
        UsageByParent measuredByParent$ui_release;
        LookaheadPassDelegate lookaheadPassDelegate$ui_release = getLookaheadPassDelegate$ui_release();
        return (lookaheadPassDelegate$ui_release == null || (measuredByParent$ui_release = lookaheadPassDelegate$ui_release.getMeasuredByParent$ui_release()) == null) ? UsageByParent.NotUsed : measuredByParent$ui_release;
    }

    @Override // androidx.compose.p014ui.node.ComposeUiNode
    public Modifier getModifier() {
        return this._modifier;
    }

    @Override // androidx.compose.p014ui.layout.LayoutInfo
    public List<ModifierInfo> getModifierInfo() {
        return this.nodes.getModifierInfo();
    }

    public final boolean getNeedsOnPositionedDispatch$ui_release() {
        return this.needsOnPositionedDispatch;
    }

    public final NodeChain getNodes$ui_release() {
        return this.nodes;
    }

    /* renamed from: getOffsetFromRoot-nOcc-ac$ui_release, reason: not valid java name */
    public final long m32409getOffsetFromRootnOccac$ui_release() {
        return this.offsetFromRoot;
    }

    public final InterfaceC9540l getOnAttach$ui_release() {
        return this.onAttach;
    }

    public final InterfaceC9540l getOnDetach$ui_release() {
        return this.onDetach;
    }

    public final NodeCoordinator getOuterCoordinator$ui_release() {
        return this.nodes.getOuterCoordinator$ui_release();
    }

    /* renamed from: getOuterToInnerOffset-nOcc-ac$ui_release, reason: not valid java name */
    public final long m32410getOuterToInnerOffsetnOccac$ui_release() {
        return this.outerToInnerOffset;
    }

    public final boolean getOuterToInnerOffsetDirty$ui_release() {
        return this.outerToInnerOffsetDirty;
    }

    public final Owner getOwner$ui_release() {
        return this.owner;
    }

    public final LayoutNode getParent$ui_release() {
        LayoutNode layoutNode = this._foldedParent;
        while (layoutNode != null && layoutNode.isVirtual) {
            layoutNode = layoutNode._foldedParent;
        }
        return layoutNode;
    }

    public final int getPlaceOrder$ui_release() {
        return getMeasurePassDelegate$ui_release().getPlaceOrder$ui_release();
    }

    @Override // androidx.compose.p014ui.semantics.SemanticsInfo
    public SemanticsConfiguration getSemanticsConfiguration() {
        if (!isAttached() || isDeactivated() || !this.nodes.m32466hasH91voCI$ui_release(NodeKind.m32510constructorimpl(8))) {
            return null;
        }
        if (!ComposeUiFlags.isSemanticAutofillEnabled && this._semanticsConfiguration == null) {
            this._semanticsConfiguration = calculateSemanticsConfiguration();
        }
        return this._semanticsConfiguration;
    }

    @Override // androidx.compose.p014ui.layout.LayoutInfo
    public int getSemanticsId() {
        return this.semanticsId;
    }

    public final LayoutNodeSubcompositionsState getSubcompositionsState$ui_release() {
        return this.subcompositionsState;
    }

    @Override // androidx.compose.p014ui.layout.LayoutInfo, androidx.compose.p014ui.node.ComposeUiNode
    public ViewConfiguration getViewConfiguration() {
        return this.viewConfiguration;
    }

    @Override // androidx.compose.p014ui.layout.LayoutInfo
    public int getWidth() {
        return this.layoutDelegate.getWidth$ui_release();
    }

    public final MutableVector<LayoutNode> getZSortedChildren() {
        if (this.zSortedChildrenInvalidated) {
            this._zSortedChildren.clear();
            MutableVector<LayoutNode> mutableVector = this._zSortedChildren;
            mutableVector.addAll(mutableVector.getSize(), get_children$ui_release());
            this._zSortedChildren.sortWith(ZComparator);
            this.zSortedChildrenInvalidated = false;
        }
        return this._zSortedChildren;
    }

    public final MutableVector<LayoutNode> get_children$ui_release() {
        updateChildrenIfDirty$ui_release();
        if (this.virtualChildrenCount == 0) {
            return this._foldedChildren.getVector();
        }
        MutableVector<LayoutNode> mutableVector = this._unfoldedChildren;
        AbstractC9979u.m20291d(mutableVector);
        return mutableVector;
    }

    /* renamed from: hitTest-6fMxITs$ui_release, reason: not valid java name */
    public final void m32411hitTest6fMxITs$ui_release(long j10, HitTestResult hitTestResult, int i10, boolean z10) {
        getOuterCoordinator$ui_release().m32492hitTestqzLsGqo(NodeCoordinator.Companion.getPointerInputSource(), NodeCoordinator.m32474fromParentPosition8S9VItk$default(getOuterCoordinator$ui_release(), j10, false, 2, null), hitTestResult, i10, z10);
    }

    /* renamed from: hitTestSemantics-6fMxITs$ui_release, reason: not valid java name */
    public final void m32412hitTestSemantics6fMxITs$ui_release(long j10, HitTestResult hitTestResult, int i10, boolean z10) {
        getOuterCoordinator$ui_release().m32492hitTestqzLsGqo(NodeCoordinator.Companion.getSemanticsSource(), NodeCoordinator.m32474fromParentPosition8S9VItk$default(getOuterCoordinator$ui_release(), j10, false, 2, null), hitTestResult, PointerType.Companion.m32182getTouchT8wyACA(), z10);
    }

    public final void ignoreRemeasureRequests$ui_release(InterfaceC9529a interfaceC9529a) {
        this.ignoreRemeasureRequests = true;
        interfaceC9529a.invoke();
        this.ignoreRemeasureRequests = false;
    }

    public final void insertAt$ui_release(int i10, LayoutNode layoutNode) {
        if (!(layoutNode._foldedParent == null || layoutNode.owner == null)) {
            InlineClassHelperKt.throwIllegalStateException(exceptionMessageForParentingOrOwnership(layoutNode));
        }
        layoutNode._foldedParent = this;
        this._foldedChildren.add(i10, layoutNode);
        onZSortedChildrenInvalidated$ui_release();
        if (layoutNode.isVirtual) {
            this.virtualChildrenCount++;
        }
        invalidateUnfoldedVirtualChildren();
        Owner owner = this.owner;
        if (owner != null) {
            layoutNode.attach$ui_release(owner);
        }
        if (layoutNode.layoutDelegate.getChildrenAccessingCoordinatesDuringPlacement() > 0) {
            LayoutNodeLayoutDelegate layoutNodeLayoutDelegate = this.layoutDelegate;
            layoutNodeLayoutDelegate.setChildrenAccessingCoordinatesDuringPlacement(layoutNodeLayoutDelegate.getChildrenAccessingCoordinatesDuringPlacement() + 1);
        }
    }

    public final void invalidateLayer$ui_release() {
        NodeCoordinator innerLayerCoordinator$ui_release = getInnerLayerCoordinator$ui_release();
        if (innerLayerCoordinator$ui_release != null) {
            innerLayerCoordinator$ui_release.invalidateLayer();
            return;
        }
        LayoutNode parent$ui_release = getParent$ui_release();
        if (parent$ui_release != null) {
            parent$ui_release.invalidateLayer$ui_release();
        }
    }

    public final void invalidateLayers$ui_release() {
        NodeCoordinator innerCoordinator$ui_release = getInnerCoordinator$ui_release();
        for (NodeCoordinator outerCoordinator$ui_release = getOuterCoordinator$ui_release(); outerCoordinator$ui_release != innerCoordinator$ui_release; outerCoordinator$ui_release = outerCoordinator$ui_release.getWrapped$ui_release()) {
            AbstractC9979u.m20292e(outerCoordinator$ui_release, "null cannot be cast to non-null type androidx.compose.ui.node.LayoutModifierNodeCoordinator");
            OwnedLayer layer = ((LayoutModifierNodeCoordinator) outerCoordinator$ui_release).getLayer();
            if (layer != null) {
                layer.invalidate();
            }
        }
        OwnedLayer layer2 = getInnerCoordinator$ui_release().getLayer();
        if (layer2 != null) {
            layer2.invalidate();
        }
    }

    public final void invalidateMeasurements$ui_release() {
        this.outerToInnerOffsetDirty = true;
        if (this.lookaheadRoot != null) {
            requestLookaheadRemeasure$ui_release$default(this, false, false, false, 7, null);
        } else {
            requestRemeasure$ui_release$default(this, false, false, false, 7, null);
        }
    }

    public final void invalidateOnPositioned$ui_release() {
        if (getLayoutPending$ui_release() || getMeasurePending$ui_release() || this.needsOnPositionedDispatch) {
            return;
        }
        LayoutNodeKt.requireOwner(this).requestOnPositionedCallback(this);
    }

    public final void invalidateParentData$ui_release() {
        this.layoutDelegate.invalidateParentData();
    }

    public final void invalidateSemantics$ui_release() {
        if (this.isCurrentlyCalculatingSemanticsConfiguration) {
            return;
        }
        if (!ComposeUiFlags.isSemanticAutofillEnabled) {
            this._semanticsConfiguration = null;
            LayoutNodeKt.requireOwner(this).onSemanticsChange();
        } else {
            if (this.nodes.isUpdating$ui_release() || getApplyingModifierOnAttach$ui_release()) {
                this.isSemanticsInvalidated = true;
                return;
            }
            SemanticsConfiguration semanticsConfiguration = this._semanticsConfiguration;
            this._semanticsConfiguration = calculateSemanticsConfiguration();
            this.isSemanticsInvalidated = false;
            Owner ownerRequireOwner = LayoutNodeKt.requireOwner(this);
            ownerRequireOwner.getSemanticsOwner().notifySemanticsChange$ui_release(this, semanticsConfiguration);
            ownerRequireOwner.onSemanticsChange();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v2, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r5v8, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v9 */
    public final void invalidateSubtree(boolean z10) {
        LayoutNode parent$ui_release;
        if (z10 && (parent$ui_release = getParent$ui_release()) != null) {
            parent$ui_release.invalidateLayer$ui_release();
        }
        invalidateSemantics$ui_release();
        requestRemeasure$ui_release$default(this, false, false, false, 7, null);
        NodeChain nodeChain = this.nodes;
        int iM32510constructorimpl = NodeKind.m32510constructorimpl(2);
        if ((nodeChain.getAggregateChildKindSet() & iM32510constructorimpl) != 0) {
            for (Modifier.Node head$ui_release = nodeChain.getHead$ui_release(); head$ui_release != null; head$ui_release = head$ui_release.getChild$ui_release()) {
                if ((head$ui_release.getKindSet$ui_release() & iM32510constructorimpl) != 0) {
                    DelegatingNode delegatingNodePop = head$ui_release;
                    MutableVector mutableVector = null;
                    while (delegatingNodePop != 0) {
                        if (delegatingNodePop instanceof LayoutModifierNode) {
                            OwnedLayer layer = DelegatableNodeKt.m32356requireCoordinator64DMado((LayoutModifierNode) delegatingNodePop, NodeKind.m32510constructorimpl(2)).getLayer();
                            if (layer != null) {
                                layer.invalidate();
                            }
                        } else if ((delegatingNodePop.getKindSet$ui_release() & iM32510constructorimpl) != 0 && (delegatingNodePop instanceof DelegatingNode)) {
                            Modifier.Node delegate$ui_release = delegatingNodePop.getDelegate$ui_release();
                            int i10 = 0;
                            delegatingNodePop = delegatingNodePop;
                            while (delegate$ui_release != null) {
                                if ((delegate$ui_release.getKindSet$ui_release() & iM32510constructorimpl) != 0) {
                                    i10++;
                                    if (i10 == 1) {
                                        delegatingNodePop = delegate$ui_release;
                                    } else {
                                        if (mutableVector == null) {
                                            mutableVector = new MutableVector(new Modifier.Node[16], 0);
                                        }
                                        if (delegatingNodePop != 0) {
                                            mutableVector.add(delegatingNodePop);
                                            delegatingNodePop = 0;
                                        }
                                        mutableVector.add(delegate$ui_release);
                                    }
                                }
                                delegate$ui_release = delegate$ui_release.getChild$ui_release();
                                delegatingNodePop = delegatingNodePop;
                            }
                            if (i10 == 1) {
                            }
                        }
                        delegatingNodePop = DelegatableNodeKt.pop(mutableVector);
                    }
                }
                if ((head$ui_release.getAggregateChildKindSet$ui_release() & iM32510constructorimpl) == 0) {
                    break;
                }
            }
        }
        MutableVector<LayoutNode> mutableVector2 = get_children$ui_release();
        LayoutNode[] layoutNodeArr = mutableVector2.content;
        int size = mutableVector2.getSize();
        for (int i11 = 0; i11 < size; i11++) {
            layoutNodeArr[i11].invalidateSubtree(false);
        }
    }

    @Override // androidx.compose.p014ui.layout.LayoutInfo
    public boolean isAttached() {
        return this.owner != null;
    }

    @Override // androidx.compose.p014ui.layout.LayoutInfo
    public boolean isDeactivated() {
        return this.isDeactivated;
    }

    @Override // androidx.compose.p014ui.layout.LayoutInfo
    public boolean isPlaced() {
        return getMeasurePassDelegate$ui_release().isPlaced();
    }

    public final boolean isPlacedByParent() {
        return getMeasurePassDelegate$ui_release().isPlacedByParent();
    }

    public final Boolean isPlacedInLookahead() {
        LookaheadPassDelegate lookaheadPassDelegate$ui_release = getLookaheadPassDelegate$ui_release();
        if (lookaheadPassDelegate$ui_release != null) {
            return Boolean.valueOf(lookaheadPassDelegate$ui_release.isPlaced());
        }
        return null;
    }

    public final boolean isSemanticsInvalidated$ui_release() {
        return this.isSemanticsInvalidated;
    }

    @Override // androidx.compose.p014ui.semantics.SemanticsInfo
    public boolean isTransparent() {
        return getOuterCoordinator$ui_release().isTransparent();
    }

    @Override // androidx.compose.p014ui.node.OwnerScope
    public boolean isValidOwnerScope() {
        return isAttached();
    }

    public final boolean isVirtualLookaheadRoot$ui_release() {
        return this.isVirtualLookaheadRoot;
    }

    /* renamed from: lookaheadRemeasure-_Sx5XlM$ui_release, reason: not valid java name */
    public final boolean m32413lookaheadRemeasure_Sx5XlM$ui_release(Constraints constraints) {
        if (constraints == null || this.lookaheadRoot == null) {
            return false;
        }
        LookaheadPassDelegate lookaheadPassDelegate$ui_release = getLookaheadPassDelegate$ui_release();
        AbstractC9979u.m20291d(lookaheadPassDelegate$ui_release);
        return lookaheadPassDelegate$ui_release.m32444remeasureBRTryo0(constraints.m33460unboximpl());
    }

    public final void lookaheadReplace$ui_release() {
        if (this.intrinsicsUsageByParent == UsageByParent.NotUsed) {
            clearSubtreePlacementIntrinsicsUsage();
        }
        LookaheadPassDelegate lookaheadPassDelegate$ui_release = getLookaheadPassDelegate$ui_release();
        AbstractC9979u.m20291d(lookaheadPassDelegate$ui_release);
        lookaheadPassDelegate$ui_release.replace();
    }

    public final void markLayoutPending$ui_release() {
        this.layoutDelegate.markLayoutPending$ui_release();
    }

    public final void markLookaheadLayoutPending$ui_release() {
        this.layoutDelegate.markLookaheadLayoutPending$ui_release();
    }

    public final void markLookaheadMeasurePending$ui_release() {
        this.layoutDelegate.markLookaheadMeasurePending$ui_release();
    }

    public final void markMeasurePending$ui_release() {
        this.layoutDelegate.markMeasurePending$ui_release();
    }

    public final int maxIntrinsicHeight(int i10) {
        return getOrCreateIntrinsicsPolicy().maxIntrinsicHeight(i10);
    }

    public final int maxIntrinsicWidth(int i10) {
        return getOrCreateIntrinsicsPolicy().maxIntrinsicWidth(i10);
    }

    public final int maxLookaheadIntrinsicHeight(int i10) {
        return getOrCreateIntrinsicsPolicy().maxLookaheadIntrinsicHeight(i10);
    }

    public final int maxLookaheadIntrinsicWidth(int i10) {
        return getOrCreateIntrinsicsPolicy().maxLookaheadIntrinsicWidth(i10);
    }

    public final int minIntrinsicHeight(int i10) {
        return getOrCreateIntrinsicsPolicy().minIntrinsicHeight(i10);
    }

    public final int minIntrinsicWidth(int i10) {
        return getOrCreateIntrinsicsPolicy().minIntrinsicWidth(i10);
    }

    public final int minLookaheadIntrinsicHeight(int i10) {
        return getOrCreateIntrinsicsPolicy().minLookaheadIntrinsicHeight(i10);
    }

    public final int minLookaheadIntrinsicWidth(int i10) {
        return getOrCreateIntrinsicsPolicy().minLookaheadIntrinsicWidth(i10);
    }

    public final void move$ui_release(int i10, int i11, int i12) {
        if (i10 == i11) {
            return;
        }
        for (int i13 = 0; i13 < i12; i13++) {
            this._foldedChildren.add(i10 > i11 ? i11 + i13 : (i11 + i12) - 2, this._foldedChildren.removeAt(i10 > i11 ? i10 + i13 : i10));
        }
        onZSortedChildrenInvalidated$ui_release();
        invalidateUnfoldedVirtualChildren();
        invalidateMeasurements$ui_release();
    }

    @Override // androidx.compose.runtime.ComposeNodeLifecycleCallback
    public void onDeactivate() {
        if (!ComposeUiFlags.isRemoveFocusedViewFixEnabled) {
            AndroidViewHolder androidViewHolder = this.interopViewFactoryHolder;
            if (androidViewHolder != null) {
                androidViewHolder.onDeactivate();
            }
            LayoutNodeSubcompositionsState layoutNodeSubcompositionsState = this.subcompositionsState;
            if (layoutNodeSubcompositionsState != null) {
                layoutNodeSubcompositionsState.onDeactivate();
            }
        }
        this.isDeactivated = true;
        resetModifierState();
        if (isAttached()) {
            if (ComposeUiFlags.isSemanticAutofillEnabled) {
                this._semanticsConfiguration = null;
                this.isSemanticsInvalidated = false;
            } else {
                invalidateSemantics$ui_release();
            }
        }
        Owner owner = this.owner;
        if (owner != null) {
            owner.onLayoutNodeDeactivated(this);
        }
        if (ComposeUiFlags.isRemoveFocusedViewFixEnabled) {
            AndroidViewHolder androidViewHolder2 = this.interopViewFactoryHolder;
            if (androidViewHolder2 != null) {
                androidViewHolder2.onDeactivate();
            }
            LayoutNodeSubcompositionsState layoutNodeSubcompositionsState2 = this.subcompositionsState;
            if (layoutNodeSubcompositionsState2 != null) {
                layoutNodeSubcompositionsState2.onDeactivate();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    @Override // androidx.compose.ui.node.Owner.OnLayoutCompletedListener
    public void onLayoutComplete() {
        NodeCoordinator innerCoordinator$ui_release = getInnerCoordinator$ui_release();
        int iM32510constructorimpl = NodeKind.m32510constructorimpl(128);
        boolean zM32519getIncludeSelfInTraversalH91voCI = NodeKindKt.m32519getIncludeSelfInTraversalH91voCI(iM32510constructorimpl);
        Modifier.Node tail = innerCoordinator$ui_release.getTail();
        if (!zM32519getIncludeSelfInTraversalH91voCI && (tail = tail.getParent$ui_release()) == null) {
            return;
        }
        for (Modifier.Node nodeHeadNode = innerCoordinator$ui_release.headNode(zM32519getIncludeSelfInTraversalH91voCI); nodeHeadNode != null && (nodeHeadNode.getAggregateChildKindSet$ui_release() & iM32510constructorimpl) != 0; nodeHeadNode = nodeHeadNode.getChild$ui_release()) {
            if ((nodeHeadNode.getKindSet$ui_release() & iM32510constructorimpl) != 0) {
                DelegatingNode delegatingNodePop = nodeHeadNode;
                MutableVector mutableVector = null;
                while (delegatingNodePop != 0) {
                    if (delegatingNodePop instanceof LayoutAwareModifierNode) {
                        ((LayoutAwareModifierNode) delegatingNodePop).onPlaced(getInnerCoordinator$ui_release());
                    } else if ((delegatingNodePop.getKindSet$ui_release() & iM32510constructorimpl) != 0 && (delegatingNodePop instanceof DelegatingNode)) {
                        Modifier.Node delegate$ui_release = delegatingNodePop.getDelegate$ui_release();
                        int i10 = 0;
                        delegatingNodePop = delegatingNodePop;
                        while (delegate$ui_release != null) {
                            if ((delegate$ui_release.getKindSet$ui_release() & iM32510constructorimpl) != 0) {
                                i10++;
                                if (i10 == 1) {
                                    delegatingNodePop = delegate$ui_release;
                                } else {
                                    if (mutableVector == null) {
                                        mutableVector = new MutableVector(new Modifier.Node[16], 0);
                                    }
                                    if (delegatingNodePop != 0) {
                                        mutableVector.add(delegatingNodePop);
                                        delegatingNodePop = 0;
                                    }
                                    mutableVector.add(delegate$ui_release);
                                }
                            }
                            delegate$ui_release = delegate$ui_release.getChild$ui_release();
                            delegatingNodePop = delegatingNodePop;
                        }
                        if (i10 == 1) {
                        }
                    }
                    delegatingNodePop = DelegatableNodeKt.pop(mutableVector);
                }
            }
            if (nodeHeadNode == tail) {
                return;
            }
        }
    }

    @Override // androidx.compose.runtime.ComposeNodeLifecycleCallback
    public void onRelease() {
        if (!ComposeUiFlags.isRemoveFocusedViewFixEnabled) {
            AndroidViewHolder androidViewHolder = this.interopViewFactoryHolder;
            if (androidViewHolder != null) {
                androidViewHolder.onRelease();
            }
            LayoutNodeSubcompositionsState layoutNodeSubcompositionsState = this.subcompositionsState;
            if (layoutNodeSubcompositionsState != null) {
                layoutNodeSubcompositionsState.onRelease();
            }
        }
        NodeCoordinator wrapped$ui_release = getInnerCoordinator$ui_release().getWrapped$ui_release();
        for (NodeCoordinator outerCoordinator$ui_release = getOuterCoordinator$ui_release(); !AbstractC9979u.m20289b(outerCoordinator$ui_release, wrapped$ui_release) && outerCoordinator$ui_release != null; outerCoordinator$ui_release = outerCoordinator$ui_release.getWrapped$ui_release()) {
            outerCoordinator$ui_release.onRelease();
        }
        if (ComposeUiFlags.isRemoveFocusedViewFixEnabled) {
            AndroidViewHolder androidViewHolder2 = this.interopViewFactoryHolder;
            if (androidViewHolder2 != null) {
                androidViewHolder2.onRelease();
            }
            LayoutNodeSubcompositionsState layoutNodeSubcompositionsState2 = this.subcompositionsState;
            if (layoutNodeSubcompositionsState2 != null) {
                layoutNodeSubcompositionsState2.onRelease();
            }
        }
    }

    @Override // androidx.compose.runtime.ComposeNodeLifecycleCallback
    public void onReuse() {
        if (!isAttached()) {
            InlineClassHelperKt.throwIllegalArgumentException("onReuse is only expected on attached node");
        }
        if (!ComposeUiFlags.isRemoveFocusedViewFixEnabled) {
            AndroidViewHolder androidViewHolder = this.interopViewFactoryHolder;
            if (androidViewHolder != null) {
                androidViewHolder.onReuse();
            }
            LayoutNodeSubcompositionsState layoutNodeSubcompositionsState = this.subcompositionsState;
            if (layoutNodeSubcompositionsState != null) {
                layoutNodeSubcompositionsState.onReuse();
            }
        }
        this.isCurrentlyCalculatingSemanticsConfiguration = false;
        if (isDeactivated()) {
            this.isDeactivated = false;
            if (!ComposeUiFlags.isSemanticAutofillEnabled) {
                invalidateSemantics$ui_release();
            }
        } else {
            resetModifierState();
        }
        int semanticsId = getSemanticsId();
        setSemanticsId(SemanticsModifierKt.generateSemanticsId());
        Owner owner = this.owner;
        if (owner != null) {
            owner.onPreLayoutNodeReused(this, semanticsId);
        }
        if (ComposeUiFlags.isRemoveFocusedViewFixEnabled) {
            AndroidViewHolder androidViewHolder2 = this.interopViewFactoryHolder;
            if (androidViewHolder2 != null) {
                androidViewHolder2.onReuse();
            }
            LayoutNodeSubcompositionsState layoutNodeSubcompositionsState2 = this.subcompositionsState;
            if (layoutNodeSubcompositionsState2 != null) {
                layoutNodeSubcompositionsState2.onReuse();
            }
        }
        this.nodes.markAsAttached();
        this.nodes.runAttachLifecycle();
        if (ComposeUiFlags.isSemanticAutofillEnabled && this.nodes.m32466hasH91voCI$ui_release(NodeKind.m32510constructorimpl(8))) {
            invalidateSemantics$ui_release();
        }
        rescheduleRemeasureOrRelayout$ui_release(this);
        Owner owner2 = this.owner;
        if (owner2 != null) {
            owner2.onPostLayoutNodeReused(this, semanticsId);
        }
    }

    public final void onZSortedChildrenInvalidated$ui_release() {
        if (!this.isVirtual) {
            this.zSortedChildrenInvalidated = true;
            return;
        }
        LayoutNode parent$ui_release = getParent$ui_release();
        if (parent$ui_release != null) {
            parent$ui_release.onZSortedChildrenInvalidated$ui_release();
        }
    }

    public final void place$ui_release(int i10, int i11) {
        Placeable.PlacementScope placementScope;
        NodeCoordinator innerCoordinator$ui_release;
        if (this.intrinsicsUsageByParent == UsageByParent.NotUsed) {
            clearSubtreePlacementIntrinsicsUsage();
        }
        LayoutNode parent$ui_release = getParent$ui_release();
        if (parent$ui_release == null || (innerCoordinator$ui_release = parent$ui_release.getInnerCoordinator$ui_release()) == null || (placementScope = innerCoordinator$ui_release.getPlacementScope()) == null) {
            placementScope = LayoutNodeKt.requireOwner(this).getPlacementScope();
        }
        Placeable.PlacementScope.placeRelative$default(placementScope, getMeasurePassDelegate$ui_release(), i10, i11, 0.0f, 4, null);
    }

    /* renamed from: remeasure-_Sx5XlM$ui_release, reason: not valid java name */
    public final boolean m32414remeasure_Sx5XlM$ui_release(Constraints constraints) {
        if (constraints == null) {
            return false;
        }
        if (this.intrinsicsUsageByParent == UsageByParent.NotUsed) {
            clearSubtreeIntrinsicsUsage$ui_release();
        }
        return getMeasurePassDelegate$ui_release().m32458remeasureBRTryo0(constraints.m33460unboximpl());
    }

    public final void removeAll$ui_release() {
        int size = this._foldedChildren.getVector().getSize();
        while (true) {
            size--;
            if (-1 >= size) {
                this._foldedChildren.clear();
                return;
            }
            onChildRemoved(this._foldedChildren.getVector().content[size]);
        }
    }

    public final void removeAt$ui_release(int i10, int i11) {
        if (!(i11 >= 0)) {
            InlineClassHelperKt.throwIllegalArgumentException("count (" + i11 + ") must be greater than 0");
        }
        int i12 = (i11 + i10) - 1;
        if (i10 > i12) {
            return;
        }
        while (true) {
            onChildRemoved(this._foldedChildren.getVector().content[i12]);
            this._foldedChildren.removeAt(i12);
            if (i12 == i10) {
                return;
            } else {
                i12--;
            }
        }
    }

    public final void replace$ui_release() {
        if (this.intrinsicsUsageByParent == UsageByParent.NotUsed) {
            clearSubtreePlacementIntrinsicsUsage();
        }
        getMeasurePassDelegate$ui_release().replace();
    }

    public final void requestAutofill$ui_release() {
        if (this.isCurrentlyCalculatingSemanticsConfiguration) {
            return;
        }
        LayoutNodeKt.requireOwner(this).requestAutofill(this);
    }

    public final void requestLookaheadRelayout$ui_release(boolean z10) {
        Owner owner;
        if (this.isVirtual || (owner = this.owner) == null) {
            return;
        }
        owner.onRequestRelayout(this, true, z10);
    }

    public final void requestLookaheadRemeasure$ui_release(boolean z10, boolean z11, boolean z12) {
        if (!(this.lookaheadRoot != null)) {
            InlineClassHelperKt.throwIllegalStateException("Lookahead measure cannot be requested on a node that is not a part of theLookaheadScope");
        }
        Owner owner = this.owner;
        if (owner == null || this.ignoreRemeasureRequests || this.isVirtual) {
            return;
        }
        owner.onRequestMeasure(this, true, z10, z11);
        if (z12) {
            LookaheadPassDelegate lookaheadPassDelegate$ui_release = getLookaheadPassDelegate$ui_release();
            AbstractC9979u.m20291d(lookaheadPassDelegate$ui_release);
            lookaheadPassDelegate$ui_release.invalidateIntrinsicsParent(z10);
        }
    }

    public final void requestRelayout$ui_release(boolean z10) {
        Owner owner;
        this.outerToInnerOffsetDirty = true;
        if (this.isVirtual || (owner = this.owner) == null) {
            return;
        }
        Owner.onRequestRelayout$default(owner, this, false, z10, 2, null);
    }

    public final void requestRemeasure$ui_release(boolean z10, boolean z11, boolean z12) {
        Owner owner;
        if (this.ignoreRemeasureRequests || this.isVirtual || (owner = this.owner) == null) {
            return;
        }
        Owner.onRequestMeasure$default(owner, this, false, z10, z11, 2, null);
        if (z12) {
            getMeasurePassDelegate$ui_release().invalidateIntrinsicsParent(z10);
        }
    }

    public final void rescheduleRemeasureOrRelayout$ui_release(LayoutNode layoutNode) {
        if (WhenMappings.$EnumSwitchMapping$0[layoutNode.getLayoutState$ui_release().ordinal()] != 1) {
            throw new IllegalStateException("Unexpected state " + layoutNode.getLayoutState$ui_release());
        }
        if (layoutNode.getLookaheadMeasurePending$ui_release()) {
            requestLookaheadRemeasure$ui_release$default(layoutNode, true, false, false, 6, null);
            return;
        }
        if (layoutNode.getLookaheadLayoutPending$ui_release()) {
            layoutNode.requestLookaheadRelayout$ui_release(true);
        }
        if (layoutNode.getMeasurePending$ui_release()) {
            requestRemeasure$ui_release$default(layoutNode, true, false, false, 6, null);
        } else if (layoutNode.getLayoutPending$ui_release()) {
            layoutNode.requestRelayout$ui_release(true);
        }
    }

    public final void resetSubtreeIntrinsicsUsage$ui_release() {
        MutableVector<LayoutNode> mutableVector = get_children$ui_release();
        LayoutNode[] layoutNodeArr = mutableVector.content;
        int size = mutableVector.getSize();
        for (int i10 = 0; i10 < size; i10++) {
            LayoutNode layoutNode = layoutNodeArr[i10];
            UsageByParent usageByParent = layoutNode.previousIntrinsicsUsageByParent;
            layoutNode.intrinsicsUsageByParent = usageByParent;
            if (usageByParent != UsageByParent.NotUsed) {
                layoutNode.resetSubtreeIntrinsicsUsage$ui_release();
            }
        }
    }

    public final void setCanMultiMeasure$ui_release(boolean z10) {
        this.canMultiMeasure = z10;
    }

    @Override // androidx.compose.p014ui.node.ComposeUiNode
    public void setCompositeKeyHash(int i10) {
        this.compositeKeyHash = i10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9 */
    @Override // androidx.compose.p014ui.node.ComposeUiNode
    public void setCompositionLocalMap(CompositionLocalMap compositionLocalMap) {
        this.compositionLocalMap = compositionLocalMap;
        setDensity((Density) compositionLocalMap.get(CompositionLocalsKt.getLocalDensity()));
        setLayoutDirection((LayoutDirection) compositionLocalMap.get(CompositionLocalsKt.getLocalLayoutDirection()));
        setViewConfiguration((ViewConfiguration) compositionLocalMap.get(CompositionLocalsKt.getLocalViewConfiguration()));
        NodeChain nodeChain = this.nodes;
        int iM32510constructorimpl = NodeKind.m32510constructorimpl(32768);
        if ((nodeChain.getAggregateChildKindSet() & iM32510constructorimpl) != 0) {
            for (Modifier.Node head$ui_release = nodeChain.getHead$ui_release(); head$ui_release != null; head$ui_release = head$ui_release.getChild$ui_release()) {
                if ((head$ui_release.getKindSet$ui_release() & iM32510constructorimpl) != 0) {
                    DelegatingNode delegatingNodePop = head$ui_release;
                    MutableVector mutableVector = null;
                    while (delegatingNodePop != 0) {
                        if (delegatingNodePop instanceof CompositionLocalConsumerModifierNode) {
                            Modifier.Node node = ((CompositionLocalConsumerModifierNode) delegatingNodePop).getNode();
                            if (node.isAttached()) {
                                NodeKindKt.autoInvalidateUpdatedNode(node);
                            } else {
                                node.setUpdatedNodeAwaitingAttachForInvalidation$ui_release(true);
                            }
                        } else if ((delegatingNodePop.getKindSet$ui_release() & iM32510constructorimpl) != 0 && (delegatingNodePop instanceof DelegatingNode)) {
                            Modifier.Node delegate$ui_release = delegatingNodePop.getDelegate$ui_release();
                            int i10 = 0;
                            delegatingNodePop = delegatingNodePop;
                            while (delegate$ui_release != null) {
                                if ((delegate$ui_release.getKindSet$ui_release() & iM32510constructorimpl) != 0) {
                                    i10++;
                                    if (i10 == 1) {
                                        delegatingNodePop = delegate$ui_release;
                                    } else {
                                        if (mutableVector == null) {
                                            mutableVector = new MutableVector(new Modifier.Node[16], 0);
                                        }
                                        if (delegatingNodePop != 0) {
                                            mutableVector.add(delegatingNodePop);
                                            delegatingNodePop = 0;
                                        }
                                        mutableVector.add(delegate$ui_release);
                                    }
                                }
                                delegate$ui_release = delegate$ui_release.getChild$ui_release();
                                delegatingNodePop = delegatingNodePop;
                            }
                            if (i10 == 1) {
                            }
                        }
                        delegatingNodePop = DelegatableNodeKt.pop(mutableVector);
                    }
                }
                if ((head$ui_release.getAggregateChildKindSet$ui_release() & iM32510constructorimpl) == 0) {
                    return;
                }
            }
        }
    }

    @Override // androidx.compose.p014ui.node.ComposeUiNode
    public void setDensity(Density density) {
        if (AbstractC9979u.m20289b(this.density, density)) {
            return;
        }
        this.density = density;
        onDensityOrLayoutDirectionChanged();
        for (Modifier.Node head$ui_release = this.nodes.getHead$ui_release(); head$ui_release != null; head$ui_release = head$ui_release.getChild$ui_release()) {
            head$ui_release.onDensityChange();
        }
    }

    public final void setDepth$ui_release(int i10) {
        this.depth = i10;
    }

    public final void setForceUseOldLayers(boolean z10) {
        this.forceUseOldLayers = z10;
    }

    public final void setInnerLayerCoordinatorIsDirty$ui_release(boolean z10) {
        this.innerLayerCoordinatorIsDirty = z10;
    }

    public final void setInteropViewFactoryHolder$ui_release(AndroidViewHolder androidViewHolder) {
        this.interopViewFactoryHolder = androidViewHolder;
    }

    public final void setIntrinsicsUsageByParent$ui_release(UsageByParent usageByParent) {
        this.intrinsicsUsageByParent = usageByParent;
    }

    /* renamed from: setLastSize-ozmzZPI$ui_release, reason: not valid java name */
    public final void m32415setLastSizeozmzZPI$ui_release(long j10) {
        this.lastSize = j10;
    }

    @Override // androidx.compose.p014ui.node.ComposeUiNode
    public void setLayoutDirection(LayoutDirection layoutDirection) {
        if (this.layoutDirection != layoutDirection) {
            this.layoutDirection = layoutDirection;
            onDensityOrLayoutDirectionChanged();
            for (Modifier.Node head$ui_release = this.nodes.getHead$ui_release(); head$ui_release != null; head$ui_release = head$ui_release.getChild$ui_release()) {
                head$ui_release.onLayoutDirectionChange();
            }
        }
    }

    @Override // androidx.compose.p014ui.node.ComposeUiNode
    public void setMeasurePolicy(MeasurePolicy measurePolicy) {
        if (AbstractC9979u.m20289b(this.measurePolicy, measurePolicy)) {
            return;
        }
        this.measurePolicy = measurePolicy;
        IntrinsicsPolicy intrinsicsPolicy = this.intrinsicsPolicy;
        if (intrinsicsPolicy != null) {
            intrinsicsPolicy.updateFrom(getMeasurePolicy());
        }
        invalidateMeasurements$ui_release();
    }

    @Override // androidx.compose.p014ui.node.ComposeUiNode
    public void setModifier(Modifier modifier) {
        if (!(!this.isVirtual || getModifier() == Modifier.Companion)) {
            InlineClassHelperKt.throwIllegalArgumentException("Modifiers are not supported on virtual LayoutNodes");
        }
        if (isDeactivated()) {
            InlineClassHelperKt.throwIllegalArgumentException("modifier is updated when deactivated");
        }
        if (!isAttached()) {
            this.pendingModifier = modifier;
            return;
        }
        applyModifier(modifier);
        if (this.isSemanticsInvalidated) {
            invalidateSemantics$ui_release();
        }
    }

    public final void setNeedsOnPositionedDispatch$ui_release(boolean z10) {
        this.needsOnPositionedDispatch = z10;
    }

    /* renamed from: setOffsetFromRoot--gyyYBs$ui_release, reason: not valid java name */
    public final void m32416setOffsetFromRootgyyYBs$ui_release(long j10) {
        this.offsetFromRoot = j10;
    }

    public final void setOnAttach$ui_release(InterfaceC9540l interfaceC9540l) {
        this.onAttach = interfaceC9540l;
    }

    public final void setOnDetach$ui_release(InterfaceC9540l interfaceC9540l) {
        this.onDetach = interfaceC9540l;
    }

    /* renamed from: setOuterToInnerOffset--gyyYBs$ui_release, reason: not valid java name */
    public final void m32417setOuterToInnerOffsetgyyYBs$ui_release(long j10) {
        this.outerToInnerOffset = j10;
    }

    public final void setOuterToInnerOffsetDirty$ui_release(boolean z10) {
        this.outerToInnerOffsetDirty = z10;
    }

    public void setSemanticsId(int i10) {
        this.semanticsId = i10;
    }

    public final void setSemanticsInvalidated$ui_release(boolean z10) {
        this.isSemanticsInvalidated = z10;
    }

    public final void setSubcompositionsState$ui_release(LayoutNodeSubcompositionsState layoutNodeSubcompositionsState) {
        this.subcompositionsState = layoutNodeSubcompositionsState;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9 */
    @Override // androidx.compose.p014ui.node.ComposeUiNode
    public void setViewConfiguration(ViewConfiguration viewConfiguration) {
        if (AbstractC9979u.m20289b(this.viewConfiguration, viewConfiguration)) {
            return;
        }
        this.viewConfiguration = viewConfiguration;
        NodeChain nodeChain = this.nodes;
        int iM32510constructorimpl = NodeKind.m32510constructorimpl(16);
        if ((nodeChain.getAggregateChildKindSet() & iM32510constructorimpl) != 0) {
            for (Modifier.Node head$ui_release = nodeChain.getHead$ui_release(); head$ui_release != null; head$ui_release = head$ui_release.getChild$ui_release()) {
                if ((head$ui_release.getKindSet$ui_release() & iM32510constructorimpl) != 0) {
                    DelegatingNode delegatingNodePop = head$ui_release;
                    MutableVector mutableVector = null;
                    while (delegatingNodePop != 0) {
                        if (delegatingNodePop instanceof PointerInputModifierNode) {
                            ((PointerInputModifierNode) delegatingNodePop).onViewConfigurationChange();
                        } else if ((delegatingNodePop.getKindSet$ui_release() & iM32510constructorimpl) != 0 && (delegatingNodePop instanceof DelegatingNode)) {
                            Modifier.Node delegate$ui_release = delegatingNodePop.getDelegate$ui_release();
                            int i10 = 0;
                            delegatingNodePop = delegatingNodePop;
                            while (delegate$ui_release != null) {
                                if ((delegate$ui_release.getKindSet$ui_release() & iM32510constructorimpl) != 0) {
                                    i10++;
                                    if (i10 == 1) {
                                        delegatingNodePop = delegate$ui_release;
                                    } else {
                                        if (mutableVector == null) {
                                            mutableVector = new MutableVector(new Modifier.Node[16], 0);
                                        }
                                        if (delegatingNodePop != 0) {
                                            mutableVector.add(delegatingNodePop);
                                            delegatingNodePop = 0;
                                        }
                                        mutableVector.add(delegate$ui_release);
                                    }
                                }
                                delegate$ui_release = delegate$ui_release.getChild$ui_release();
                                delegatingNodePop = delegatingNodePop;
                            }
                            if (i10 == 1) {
                            }
                        }
                        delegatingNodePop = DelegatableNodeKt.pop(mutableVector);
                    }
                }
                if ((head$ui_release.getAggregateChildKindSet$ui_release() & iM32510constructorimpl) == 0) {
                    return;
                }
            }
        }
    }

    public final void setVirtualLookaheadRoot$ui_release(boolean z10) {
        this.isVirtualLookaheadRoot = z10;
    }

    public String toString() {
        return JvmActuals_jvmKt.simpleIdentityToString(this, null) + " children: " + getChildren$ui_release().size() + " measurePolicy: " + getMeasurePolicy();
    }

    public final void updateChildrenIfDirty$ui_release() {
        if (this.virtualChildrenCount > 0) {
            recreateUnfoldedChildrenIfDirty();
        }
    }

    public LayoutNode(boolean z10, int i10) {
        this.isVirtual = z10;
        this.semanticsId = i10;
        IntOffset.Companion companion = IntOffset.Companion;
        this.offsetFromRoot = companion.m33639getMaxnOccac();
        this.lastSize = IntSize.Companion.m33677getZeroYbymL2g();
        this.outerToInnerOffset = companion.m33639getMaxnOccac();
        this.outerToInnerOffsetDirty = true;
        this._foldedChildren = new MutableVectorWithMutationTracking<>(new MutableVector(new LayoutNode[16], 0), new InterfaceC9529a() { // from class: androidx.compose.ui.node.LayoutNode$_foldedChildren$1
            {
                super(0);
            }

            @Override // p181hd.InterfaceC9529a
            public /* bridge */ /* synthetic */ Object invoke() {
                m32424invoke();
                return C10786q.f26013a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m32424invoke() {
                this.this$0.getLayoutDelegate$ui_release().markChildrenDirty();
            }
        });
        this._zSortedChildren = new MutableVector<>(new LayoutNode[16], 0);
        this.zSortedChildrenInvalidated = true;
        this.measurePolicy = ErrorMeasurePolicy;
        this.density = LayoutNodeKt.DefaultDensity;
        this.layoutDirection = LayoutDirection.Ltr;
        this.viewConfiguration = DummyViewConfiguration;
        this.compositionLocalMap = CompositionLocalMap.Companion.getEmpty();
        UsageByParent usageByParent = UsageByParent.NotUsed;
        this.intrinsicsUsageByParent = usageByParent;
        this.previousIntrinsicsUsageByParent = usageByParent;
        this.nodes = new NodeChain(this);
        this.layoutDelegate = new LayoutNodeLayoutDelegate(this);
        this.innerLayerCoordinatorIsDirty = true;
        this._modifier = Modifier.Companion;
    }

    @Override // androidx.compose.p014ui.layout.LayoutInfo
    public SemanticsInfo getParentInfo() {
        return getParent$ui_release();
    }

    public /* synthetic */ LayoutNode(boolean z10, int i10, int i11, AbstractC9972n abstractC9972n) {
        this((i11 & 1) != 0 ? false : z10, (i11 & 2) != 0 ? SemanticsModifierKt.generateSemanticsId() : i10);
    }
}
