package androidx.compose.p014ui.node;

import androidx.compose.p014ui.Modifier;
import androidx.compose.p014ui.draw.BuildDrawCacheParams;
import androidx.compose.p014ui.draw.DrawCacheModifier;
import androidx.compose.p014ui.draw.DrawModifier;
import androidx.compose.p014ui.focus.FocusEventModifier;
import androidx.compose.p014ui.focus.FocusEventModifierNode;
import androidx.compose.p014ui.focus.FocusOrder;
import androidx.compose.p014ui.focus.FocusOrderModifier;
import androidx.compose.p014ui.focus.FocusProperties;
import androidx.compose.p014ui.focus.FocusPropertiesModifierNode;
import androidx.compose.p014ui.focus.FocusRequesterModifier;
import androidx.compose.p014ui.focus.FocusRequesterModifierNode;
import androidx.compose.p014ui.focus.FocusState;
import androidx.compose.p014ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.p014ui.input.pointer.PointerEvent;
import androidx.compose.p014ui.input.pointer.PointerEventPass;
import androidx.compose.p014ui.input.pointer.PointerInputModifier;
import androidx.compose.p014ui.internal.InlineClassHelperKt;
import androidx.compose.p014ui.layout.IntrinsicMeasurable;
import androidx.compose.p014ui.layout.IntrinsicMeasureScope;
import androidx.compose.p014ui.layout.LayoutCoordinates;
import androidx.compose.p014ui.layout.LayoutModifier;
import androidx.compose.p014ui.layout.Measurable;
import androidx.compose.p014ui.layout.MeasureResult;
import androidx.compose.p014ui.layout.MeasureScope;
import androidx.compose.p014ui.layout.OnGloballyPositionedModifier;
import androidx.compose.p014ui.layout.OnPlacedModifier;
import androidx.compose.p014ui.layout.OnRemeasuredModifier;
import androidx.compose.p014ui.layout.ParentDataModifier;
import androidx.compose.p014ui.layout.RemeasurementModifier;
import androidx.compose.p014ui.modifier.BackwardsCompatLocalMap;
import androidx.compose.p014ui.modifier.ModifierLocal;
import androidx.compose.p014ui.modifier.ModifierLocalConsumer;
import androidx.compose.p014ui.modifier.ModifierLocalMap;
import androidx.compose.p014ui.modifier.ModifierLocalModifierNode;
import androidx.compose.p014ui.modifier.ModifierLocalModifierNodeKt;
import androidx.compose.p014ui.modifier.ModifierLocalProvider;
import androidx.compose.p014ui.modifier.ModifierLocalReadScope;
import androidx.compose.p014ui.node.Owner;
import androidx.compose.p014ui.semantics.SemanticsConfiguration;
import androidx.compose.p014ui.semantics.SemanticsModifier;
import androidx.compose.p014ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.p014ui.unit.Density;
import androidx.compose.p014ui.unit.IntSizeKt;
import androidx.compose.p014ui.unit.LayoutDirection;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.HashSet;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9529a;
import p309qc.C10786q;

@StabilityInferred(parameters = 0)
/* loaded from: classes2.dex */
public final class BackwardsCompatNode extends Modifier.Node implements LayoutModifierNode, DrawModifierNode, SemanticsModifierNode, PointerInputModifierNode, ModifierLocalModifierNode, ModifierLocalReadScope, ParentDataModifierNode, LayoutAwareModifierNode, GlobalPositionAwareModifierNode, FocusEventModifierNode, FocusPropertiesModifierNode, FocusRequesterModifierNode, OwnerScope, BuildDrawCacheParams {
    public static final int $stable = 8;
    private BackwardsCompatLocalMap _providedValues;
    private Modifier.Element element;
    private boolean invalidateCache;
    private LayoutCoordinates lastOnPlacedCoordinates;
    private HashSet<ModifierLocal<?>> readValues;

    public BackwardsCompatNode(Modifier.Element element) {
        setKindSet$ui_release(NodeKindKt.calculateNodeKindSetFrom(element));
        this.element = element;
        this.invalidateCache = true;
        this.readValues = new HashSet<>();
    }

    private final void initializeModifier(boolean z10) {
        if (!isAttached()) {
            InlineClassHelperKt.throwIllegalStateException("initializeModifier called on unattached node");
        }
        Modifier.Element element = this.element;
        if ((NodeKind.m32510constructorimpl(32) & getKindSet$ui_release()) != 0) {
            if (element instanceof ModifierLocalConsumer) {
                sideEffect(new InterfaceC9529a() { // from class: androidx.compose.ui.node.BackwardsCompatNode.initializeModifier.2
                    {
                        super(0);
                    }

                    @Override // p181hd.InterfaceC9529a
                    public /* bridge */ /* synthetic */ Object invoke() {
                        m32339invoke();
                        return C10786q.f26013a;
                    }

                    /* renamed from: invoke, reason: collision with other method in class */
                    public final void m32339invoke() {
                        BackwardsCompatNode.this.updateModifierLocalConsumer();
                    }
                });
            }
            if (element instanceof ModifierLocalProvider) {
                updateModifierLocalProvider((ModifierLocalProvider) element);
            }
        }
        if ((NodeKind.m32510constructorimpl(4) & getKindSet$ui_release()) != 0) {
            if (element instanceof DrawCacheModifier) {
                this.invalidateCache = true;
            }
            if (!z10) {
                LayoutModifierNodeKt.invalidateLayer(this);
            }
        }
        if ((NodeKind.m32510constructorimpl(2) & getKindSet$ui_release()) != 0) {
            if (BackwardsCompatNodeKt.isChainUpdate(this)) {
                NodeCoordinator coordinator$ui_release = getCoordinator$ui_release();
                AbstractC9979u.m20291d(coordinator$ui_release);
                ((LayoutModifierNodeCoordinator) coordinator$ui_release).setLayoutModifierNode$ui_release(this);
                coordinator$ui_release.onLayoutModifierNodeChanged();
            }
            if (!z10) {
                LayoutModifierNodeKt.invalidateLayer(this);
                DelegatableNodeKt.requireLayoutNode(this).invalidateMeasurements$ui_release();
            }
        }
        if (element instanceof RemeasurementModifier) {
            ((RemeasurementModifier) element).onRemeasurementAvailable(DelegatableNodeKt.requireLayoutNode(this));
        }
        if ((NodeKind.m32510constructorimpl(128) & getKindSet$ui_release()) != 0) {
            if ((element instanceof OnRemeasuredModifier) && BackwardsCompatNodeKt.isChainUpdate(this)) {
                DelegatableNodeKt.requireLayoutNode(this).invalidateMeasurements$ui_release();
            }
            if (element instanceof OnPlacedModifier) {
                this.lastOnPlacedCoordinates = null;
                if (BackwardsCompatNodeKt.isChainUpdate(this)) {
                    DelegatableNodeKt.requireOwner(this).registerOnLayoutCompletedListener(new Owner.OnLayoutCompletedListener() { // from class: androidx.compose.ui.node.BackwardsCompatNode.initializeModifier.3
                        @Override // androidx.compose.ui.node.Owner.OnLayoutCompletedListener
                        public void onLayoutComplete() {
                            if (BackwardsCompatNode.this.lastOnPlacedCoordinates == null) {
                                BackwardsCompatNode backwardsCompatNode = BackwardsCompatNode.this;
                                backwardsCompatNode.onPlaced(DelegatableNodeKt.m32356requireCoordinator64DMado(backwardsCompatNode, NodeKind.m32510constructorimpl(128)));
                            }
                        }
                    });
                }
            }
        }
        if ((NodeKind.m32510constructorimpl(256) & getKindSet$ui_release()) != 0 && (element instanceof OnGloballyPositionedModifier) && BackwardsCompatNodeKt.isChainUpdate(this)) {
            DelegatableNodeKt.requireLayoutNode(this).invalidateMeasurements$ui_release();
        }
        if (element instanceof FocusRequesterModifier) {
            ((FocusRequesterModifier) element).getFocusRequester().getFocusRequesterNodes$ui_release().add(this);
        }
        if ((NodeKind.m32510constructorimpl(16) & getKindSet$ui_release()) != 0 && (element instanceof PointerInputModifier)) {
            ((PointerInputModifier) element).getPointerInputFilter().setLayoutCoordinates$ui_release(getCoordinator$ui_release());
        }
        if ((NodeKind.m32510constructorimpl(8) & getKindSet$ui_release()) != 0) {
            DelegatableNodeKt.requireOwner(this).onSemanticsChange();
        }
    }

    private final void unInitializeModifier() {
        if (!isAttached()) {
            InlineClassHelperKt.throwIllegalStateException("unInitializeModifier called on unattached node");
        }
        Modifier.Element element = this.element;
        if ((NodeKind.m32510constructorimpl(32) & getKindSet$ui_release()) != 0) {
            if (element instanceof ModifierLocalProvider) {
                DelegatableNodeKt.requireOwner(this).getModifierLocalManager().removedProvider(this, ((ModifierLocalProvider) element).getKey());
            }
            if (element instanceof ModifierLocalConsumer) {
                ((ModifierLocalConsumer) element).onModifierLocalsUpdated(BackwardsCompatNodeKt.DetachedModifierLocalReadScope);
            }
        }
        if ((NodeKind.m32510constructorimpl(8) & getKindSet$ui_release()) != 0) {
            DelegatableNodeKt.requireOwner(this).onSemanticsChange();
        }
        if (element instanceof FocusRequesterModifier) {
            ((FocusRequesterModifier) element).getFocusRequester().getFocusRequesterNodes$ui_release().remove(this);
        }
    }

    private final void updateDrawCache() {
        final Modifier.Element element = this.element;
        if (element instanceof DrawCacheModifier) {
            DelegatableNodeKt.requireOwner(this).getSnapshotObserver().observeReads$ui_release(this, BackwardsCompatNodeKt.onDrawCacheReadsChanged, new InterfaceC9529a() { // from class: androidx.compose.ui.node.BackwardsCompatNode.updateDrawCache.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // p181hd.InterfaceC9529a
                public /* bridge */ /* synthetic */ Object invoke() {
                    m32340invoke();
                    return C10786q.f26013a;
                }

                /* renamed from: invoke, reason: collision with other method in class */
                public final void m32340invoke() {
                    ((DrawCacheModifier) element).onBuildCache(this);
                }
            });
        }
        this.invalidateCache = false;
    }

    private final void updateModifierLocalProvider(ModifierLocalProvider<?> modifierLocalProvider) {
        BackwardsCompatLocalMap backwardsCompatLocalMap = this._providedValues;
        if (backwardsCompatLocalMap != null && backwardsCompatLocalMap.contains$ui_release(modifierLocalProvider.getKey())) {
            backwardsCompatLocalMap.setElement(modifierLocalProvider);
            DelegatableNodeKt.requireOwner(this).getModifierLocalManager().updatedProvider(this, modifierLocalProvider.getKey());
        } else {
            this._providedValues = new BackwardsCompatLocalMap(modifierLocalProvider);
            if (BackwardsCompatNodeKt.isChainUpdate(this)) {
                DelegatableNodeKt.requireOwner(this).getModifierLocalManager().insertedProvider(this, modifierLocalProvider.getKey());
            }
        }
    }

    @Override // androidx.compose.p014ui.focus.FocusPropertiesModifierNode
    public void applyFocusProperties(FocusProperties focusProperties) {
        Modifier.Element element = this.element;
        if (!(element instanceof FocusOrderModifier)) {
            InlineClassHelperKt.throwIllegalStateException("applyFocusProperties called on wrong node");
        }
        ((FocusOrderModifier) element).populateFocusOrder(new FocusOrder(focusProperties));
    }

    @Override // androidx.compose.p014ui.node.SemanticsModifierNode
    public void applySemantics(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        Modifier.Element element = this.element;
        AbstractC9979u.m20292e(element, "null cannot be cast to non-null type androidx.compose.ui.semantics.SemanticsModifier");
        SemanticsConfiguration semanticsConfiguration = ((SemanticsModifier) element).getSemanticsConfiguration();
        AbstractC9979u.m20292e(semanticsPropertyReceiver, "null cannot be cast to non-null type androidx.compose.ui.semantics.SemanticsConfiguration");
        ((SemanticsConfiguration) semanticsPropertyReceiver).collapsePeer$ui_release(semanticsConfiguration);
    }

    @Override // androidx.compose.p014ui.node.DrawModifierNode
    public void draw(ContentDrawScope contentDrawScope) {
        Modifier.Element element = this.element;
        AbstractC9979u.m20292e(element, "null cannot be cast to non-null type androidx.compose.ui.draw.DrawModifier");
        DrawModifier drawModifier = (DrawModifier) element;
        if (this.invalidateCache && (element instanceof DrawCacheModifier)) {
            updateDrawCache();
        }
        drawModifier.draw(contentDrawScope);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v10, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r3v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [androidx.compose.runtime.collection.MutableVector] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [androidx.compose.runtime.collection.MutableVector] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    @Override // androidx.compose.p014ui.modifier.ModifierLocalModifierNode, androidx.compose.p014ui.modifier.ModifierLocalReadScope
    public <T> T getCurrent(ModifierLocal<T> modifierLocal) {
        NodeChain nodes$ui_release;
        this.readValues.add(modifierLocal);
        int iM32510constructorimpl = NodeKind.m32510constructorimpl(32);
        if (!getNode().isAttached()) {
            InlineClassHelperKt.throwIllegalStateException("visitAncestors called on an unattached node");
        }
        Modifier.Node parent$ui_release = getNode().getParent$ui_release();
        LayoutNode layoutNodeRequireLayoutNode = DelegatableNodeKt.requireLayoutNode(this);
        while (layoutNodeRequireLayoutNode != null) {
            if ((layoutNodeRequireLayoutNode.getNodes$ui_release().getHead$ui_release().getAggregateChildKindSet$ui_release() & iM32510constructorimpl) != 0) {
                while (parent$ui_release != null) {
                    if ((parent$ui_release.getKindSet$ui_release() & iM32510constructorimpl) != 0) {
                        DelegatingNode delegatingNodePop = parent$ui_release;
                        ?? mutableVector = 0;
                        while (delegatingNodePop != 0) {
                            if (delegatingNodePop instanceof ModifierLocalModifierNode) {
                                ModifierLocalModifierNode modifierLocalModifierNode = (ModifierLocalModifierNode) delegatingNodePop;
                                if (modifierLocalModifierNode.getProvidedValues().contains$ui_release(modifierLocal)) {
                                    return (T) modifierLocalModifierNode.getProvidedValues().get$ui_release(modifierLocal);
                                }
                            } else if ((delegatingNodePop.getKindSet$ui_release() & iM32510constructorimpl) != 0 && (delegatingNodePop instanceof DelegatingNode)) {
                                Modifier.Node delegate$ui_release = delegatingNodePop.getDelegate$ui_release();
                                int i10 = 0;
                                delegatingNodePop = delegatingNodePop;
                                mutableVector = mutableVector;
                                while (delegate$ui_release != null) {
                                    if ((delegate$ui_release.getKindSet$ui_release() & iM32510constructorimpl) != 0) {
                                        i10++;
                                        mutableVector = mutableVector;
                                        if (i10 == 1) {
                                            delegatingNodePop = delegate$ui_release;
                                        } else {
                                            if (mutableVector == 0) {
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
                                    mutableVector = mutableVector;
                                }
                                if (i10 == 1) {
                                }
                            }
                            delegatingNodePop = DelegatableNodeKt.pop(mutableVector);
                        }
                    }
                    parent$ui_release = parent$ui_release.getParent$ui_release();
                }
            }
            layoutNodeRequireLayoutNode = layoutNodeRequireLayoutNode.getParent$ui_release();
            parent$ui_release = (layoutNodeRequireLayoutNode == null || (nodes$ui_release = layoutNodeRequireLayoutNode.getNodes$ui_release()) == null) ? null : nodes$ui_release.getTail$ui_release();
        }
        return (T) modifierLocal.getDefaultFactory$ui_release().invoke();
    }

    @Override // androidx.compose.p014ui.draw.BuildDrawCacheParams
    public Density getDensity() {
        return DelegatableNodeKt.requireLayoutNode(this).getDensity();
    }

    public final Modifier.Element getElement() {
        return this.element;
    }

    @Override // androidx.compose.p014ui.draw.BuildDrawCacheParams
    public LayoutDirection getLayoutDirection() {
        return DelegatableNodeKt.requireLayoutNode(this).getLayoutDirection();
    }

    @Override // androidx.compose.p014ui.modifier.ModifierLocalModifierNode
    public ModifierLocalMap getProvidedValues() {
        BackwardsCompatLocalMap backwardsCompatLocalMap = this._providedValues;
        return backwardsCompatLocalMap != null ? backwardsCompatLocalMap : ModifierLocalModifierNodeKt.modifierLocalMapOf();
    }

    public final HashSet<ModifierLocal<?>> getReadValues() {
        return this.readValues;
    }

    @Override // androidx.compose.p014ui.draw.BuildDrawCacheParams
    /* renamed from: getSize-NH-jbRc */
    public long mo30488getSizeNHjbRc() {
        return IntSizeKt.m33684toSizeozmzZPI(DelegatableNodeKt.m32356requireCoordinator64DMado(this, NodeKind.m32510constructorimpl(128)).mo32237getSizeYbymL2g());
    }

    @Override // androidx.compose.p014ui.node.PointerInputModifierNode
    public boolean interceptOutOfBoundsChildEvents() {
        Modifier.Element element = this.element;
        AbstractC9979u.m20292e(element, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.PointerInputModifier");
        return ((PointerInputModifier) element).getPointerInputFilter().getInterceptOutOfBoundsChildEvents();
    }

    @Override // androidx.compose.p014ui.node.OwnerScope
    public boolean isValidOwnerScope() {
        return isAttached();
    }

    @Override // androidx.compose.p014ui.node.LayoutModifierNode
    public int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i10) {
        Modifier.Element element = this.element;
        AbstractC9979u.m20292e(element, "null cannot be cast to non-null type androidx.compose.ui.layout.LayoutModifier");
        return ((LayoutModifier) element).maxIntrinsicHeight(intrinsicMeasureScope, intrinsicMeasurable, i10);
    }

    @Override // androidx.compose.p014ui.node.LayoutModifierNode
    public int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i10) {
        Modifier.Element element = this.element;
        AbstractC9979u.m20292e(element, "null cannot be cast to non-null type androidx.compose.ui.layout.LayoutModifier");
        return ((LayoutModifier) element).maxIntrinsicWidth(intrinsicMeasureScope, intrinsicMeasurable, i10);
    }

    @Override // androidx.compose.p014ui.node.LayoutModifierNode
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo26769measure3p2s80s(MeasureScope measureScope, Measurable measurable, long j10) {
        Modifier.Element element = this.element;
        AbstractC9979u.m20292e(element, "null cannot be cast to non-null type androidx.compose.ui.layout.LayoutModifier");
        return ((LayoutModifier) element).mo27378measure3p2s80s(measureScope, measurable, j10);
    }

    @Override // androidx.compose.p014ui.node.LayoutModifierNode
    public int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i10) {
        Modifier.Element element = this.element;
        AbstractC9979u.m20292e(element, "null cannot be cast to non-null type androidx.compose.ui.layout.LayoutModifier");
        return ((LayoutModifier) element).minIntrinsicHeight(intrinsicMeasureScope, intrinsicMeasurable, i10);
    }

    @Override // androidx.compose.p014ui.node.LayoutModifierNode
    public int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i10) {
        Modifier.Element element = this.element;
        AbstractC9979u.m20292e(element, "null cannot be cast to non-null type androidx.compose.ui.layout.LayoutModifier");
        return ((LayoutModifier) element).minIntrinsicWidth(intrinsicMeasureScope, intrinsicMeasurable, i10);
    }

    @Override // androidx.compose.p014ui.node.ParentDataModifierNode
    public Object modifyParentData(Density density, Object obj) {
        Modifier.Element element = this.element;
        AbstractC9979u.m20292e(element, "null cannot be cast to non-null type androidx.compose.ui.layout.ParentDataModifier");
        return ((ParentDataModifier) element).modifyParentData(density, obj);
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onAttach() {
        initializeModifier(true);
    }

    @Override // androidx.compose.p014ui.node.PointerInputModifierNode
    public void onCancelPointerInput() {
        Modifier.Element element = this.element;
        AbstractC9979u.m20292e(element, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.PointerInputModifier");
        ((PointerInputModifier) element).getPointerInputFilter().onCancel();
    }

    @Override // androidx.compose.p014ui.node.DelegatableNode, androidx.compose.p014ui.node.PointerInputModifierNode
    public void onDensityChange() {
        if (this.element instanceof PointerInputModifier) {
            onCancelPointerInput();
        }
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onDetach() {
        unInitializeModifier();
    }

    public final void onDrawCacheReadsChanged$ui_release() {
        this.invalidateCache = true;
        DrawModifierNodeKt.invalidateDraw(this);
    }

    @Override // androidx.compose.p014ui.focus.FocusEventModifierNode
    public void onFocusEvent(FocusState focusState) {
        Modifier.Element element = this.element;
        if (!(element instanceof FocusEventModifier)) {
            InlineClassHelperKt.throwIllegalStateException("onFocusEvent called on wrong node");
        }
        ((FocusEventModifier) element).onFocusEvent(focusState);
    }

    @Override // androidx.compose.p014ui.node.GlobalPositionAwareModifierNode
    public void onGloballyPositioned(LayoutCoordinates layoutCoordinates) {
        Modifier.Element element = this.element;
        AbstractC9979u.m20292e(element, "null cannot be cast to non-null type androidx.compose.ui.layout.OnGloballyPositionedModifier");
        ((OnGloballyPositionedModifier) element).onGloballyPositioned(layoutCoordinates);
    }

    @Override // androidx.compose.p014ui.node.DrawModifierNode
    public void onMeasureResultChanged() {
        this.invalidateCache = true;
        DrawModifierNodeKt.invalidateDraw(this);
    }

    @Override // androidx.compose.p014ui.node.LayoutAwareModifierNode
    public void onPlaced(LayoutCoordinates layoutCoordinates) {
        this.lastOnPlacedCoordinates = layoutCoordinates;
        Modifier.Element element = this.element;
        if (element instanceof OnPlacedModifier) {
            ((OnPlacedModifier) element).onPlaced(layoutCoordinates);
        }
    }

    @Override // androidx.compose.p014ui.node.PointerInputModifierNode
    /* renamed from: onPointerEvent-H0pRuoY */
    public void mo26920onPointerEventH0pRuoY(PointerEvent pointerEvent, PointerEventPass pointerEventPass, long j10) {
        Modifier.Element element = this.element;
        AbstractC9979u.m20292e(element, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.PointerInputModifier");
        ((PointerInputModifier) element).getPointerInputFilter().mo32127onPointerEventH0pRuoY(pointerEvent, pointerEventPass, j10);
    }

    @Override // androidx.compose.p014ui.node.LayoutAwareModifierNode
    /* renamed from: onRemeasured-ozmzZPI */
    public void mo27087onRemeasuredozmzZPI(long j10) {
        Modifier.Element element = this.element;
        if (element instanceof OnRemeasuredModifier) {
            ((OnRemeasuredModifier) element).m32283onRemeasuredozmzZPI(j10);
        }
    }

    public final void setElement(Modifier.Element element) {
        if (isAttached()) {
            unInitializeModifier();
        }
        this.element = element;
        setKindSet$ui_release(NodeKindKt.calculateNodeKindSetFrom(element));
        if (isAttached()) {
            initializeModifier(false);
        }
    }

    public final void setReadValues(HashSet<ModifierLocal<?>> hashSet) {
        this.readValues = hashSet;
    }

    @Override // androidx.compose.p014ui.node.PointerInputModifierNode
    public boolean sharePointerInputWithSiblings() {
        Modifier.Element element = this.element;
        AbstractC9979u.m20292e(element, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.PointerInputModifier");
        return ((PointerInputModifier) element).getPointerInputFilter().getShareWithSiblings();
    }

    public String toString() {
        return this.element.toString();
    }

    public final void updateModifierLocalConsumer() {
        if (isAttached()) {
            this.readValues.clear();
            DelegatableNodeKt.requireOwner(this).getSnapshotObserver().observeReads$ui_release(this, BackwardsCompatNodeKt.updateModifierLocalConsumer, new InterfaceC9529a() { // from class: androidx.compose.ui.node.BackwardsCompatNode.updateModifierLocalConsumer.1
                {
                    super(0);
                }

                @Override // p181hd.InterfaceC9529a
                public /* bridge */ /* synthetic */ Object invoke() {
                    m32341invoke();
                    return C10786q.f26013a;
                }

                /* renamed from: invoke, reason: collision with other method in class */
                public final void m32341invoke() {
                    Modifier.Element element = BackwardsCompatNode.this.getElement();
                    AbstractC9979u.m20292e(element, "null cannot be cast to non-null type androidx.compose.ui.modifier.ModifierLocalConsumer");
                    ((ModifierLocalConsumer) element).onModifierLocalsUpdated(BackwardsCompatNode.this);
                }
            });
        }
    }
}
