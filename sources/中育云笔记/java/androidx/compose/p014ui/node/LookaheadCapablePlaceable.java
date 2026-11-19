package androidx.compose.p014ui.node;

import androidx.collection.MutableObjectFloatMap;
import androidx.collection.MutableScatterMap;
import androidx.collection.MutableScatterSet;
import androidx.compose.p014ui.internal.InlineClassHelperKt;
import androidx.compose.p014ui.layout.AlignmentLine;
import androidx.compose.p014ui.layout.LayoutCoordinates;
import androidx.compose.p014ui.layout.MeasureResult;
import androidx.compose.p014ui.layout.Placeable;
import androidx.compose.p014ui.layout.PlaceableKt;
import androidx.compose.p014ui.layout.Ruler;
import androidx.compose.p014ui.layout.RulerScope;
import androidx.compose.p014ui.layout.VerticalAlignmentLine;
import androidx.compose.p014ui.layout.VerticalRuler;
import androidx.compose.p014ui.node.LayoutNode;
import androidx.compose.p014ui.unit.IntOffset;
import androidx.compose.p014ui.unit.LayoutDirection;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.view.ViewCompat;
import java.util.Map;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9540l;
import p309qc.C10786q;

@StabilityInferred(parameters = 1)
/* loaded from: classes2.dex */
public abstract class LookaheadCapablePlaceable extends Placeable implements MeasureScopeWithLayoutNode, MotionReferencePlacementDelegate {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private static final InterfaceC9540l onCommitAffectingRuler = new InterfaceC9540l() { // from class: androidx.compose.ui.node.LookaheadCapablePlaceable$Companion$onCommitAffectingRuler$1
        @Override // p181hd.InterfaceC9540l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((PlaceableResult) obj);
            return C10786q.f26013a;
        }

        public final void invoke(PlaceableResult placeableResult) {
            if (placeableResult.isValidOwnerScope()) {
                placeableResult.getPlaceable().captureRulers(placeableResult);
            }
        }
    };
    private RulerScope _rulerScope;
    private boolean isPlacedUnderMotionFrameOfReference;
    private boolean isPlacingForAlignment;
    private boolean isShallowPlacing;
    private final Placeable.PlacementScope placementScope = PlaceableKt.PlacementScope(this);
    private MutableScatterMap<Ruler, MutableScatterSet<WeakReference<LayoutNode>>> rulerReaders;
    private MutableObjectFloatMap<Ruler> rulerValues;
    private MutableObjectFloatMap<Ruler> rulerValuesCache;

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC9972n abstractC9972n) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x009f A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void addRulerReader(androidx.compose.p014ui.node.LayoutNode r32, androidx.compose.p014ui.layout.Ruler r33) {
        /*
            Method dump skipped, instructions count: 392
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p014ui.node.LookaheadCapablePlaceable.addRulerReader(androidx.compose.ui.node.LayoutNode, androidx.compose.ui.layout.Ruler):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:63:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0162  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void captureRulers(final androidx.compose.p014ui.node.PlaceableResult r28) {
        /*
            Method dump skipped, instructions count: 363
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p014ui.node.LookaheadCapablePlaceable.captureRulers(androidx.compose.ui.node.PlaceableResult):void");
    }

    private final LookaheadCapablePlaceable findAncestorRulerDefiner(Ruler ruler) {
        LookaheadCapablePlaceable lookaheadCapablePlaceable = this;
        while (true) {
            MutableObjectFloatMap<Ruler> mutableObjectFloatMap = lookaheadCapablePlaceable.rulerValues;
            if (mutableObjectFloatMap != null && mutableObjectFloatMap.containsKey(ruler)) {
                return lookaheadCapablePlaceable;
            }
            LookaheadCapablePlaceable parent = lookaheadCapablePlaceable.getParent();
            if (parent == null) {
                return lookaheadCapablePlaceable;
            }
            lookaheadCapablePlaceable = parent;
        }
    }

    private final void invalidateChildrenOfDefiningRuler(Ruler ruler) {
        MutableScatterMap<Ruler, MutableScatterSet<WeakReference<LayoutNode>>> mutableScatterMap = findAncestorRulerDefiner(ruler).rulerReaders;
        MutableScatterSet<WeakReference<LayoutNode>> mutableScatterSetRemove = mutableScatterMap != null ? mutableScatterMap.remove(ruler) : null;
        if (mutableScatterSetRemove != null) {
            notifyRulerValueChange(mutableScatterSetRemove);
        }
    }

    private final boolean isLayoutNodeAncestor(LayoutNode layoutNode, LayoutNode layoutNode2) {
        if (layoutNode == layoutNode2) {
            return true;
        }
        LayoutNode parent$ui_release = layoutNode.getParent$ui_release();
        if (parent$ui_release != null) {
            return isLayoutNodeAncestor(parent$ui_release, layoutNode2);
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void notifyRulerValueChange(MutableScatterSet<WeakReference<LayoutNode>> mutableScatterSet) {
        LayoutNode layoutNode;
        Object[] objArr = mutableScatterSet.elements;
        long[] jArr = mutableScatterSet.metadata;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i10 = 0;
        while (true) {
            long j10 = jArr[i10];
            if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i11 = 8 - ((~(i10 - length)) >>> 31);
                for (int i12 = 0; i12 < i11; i12++) {
                    if ((255 & j10) < 128 && (layoutNode = (LayoutNode) ((WeakReference) objArr[(i10 << 3) + i12]).get()) != null) {
                        if (isLookingAhead()) {
                            layoutNode.requestLookaheadRelayout$ui_release(false);
                        } else {
                            layoutNode.requestRelayout$ui_release(false);
                        }
                    }
                    j10 >>= 8;
                }
                if (i11 != 8) {
                    return;
                }
            }
            if (i10 == length) {
                return;
            } else {
                i10++;
            }
        }
    }

    public abstract int calculateAlignmentLine(AlignmentLine alignmentLine);

    /* JADX WARN: Removed duplicated region for block: B:19:0x004f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void captureRulers$ui_release(androidx.compose.p014ui.layout.MeasureResult r14) {
        /*
            r13 = this;
            if (r14 == 0) goto Lb
            androidx.compose.ui.node.PlaceableResult r0 = new androidx.compose.ui.node.PlaceableResult
            r0.<init>(r14, r13)
            r13.captureRulers(r0)
            return
        Lb:
            androidx.collection.MutableScatterMap<androidx.compose.ui.layout.Ruler, androidx.collection.MutableScatterSet<androidx.compose.ui.node.WeakReference<androidx.compose.ui.node.LayoutNode>>> r14 = r13.rulerReaders
            if (r14 == 0) goto L54
            java.lang.Object[] r0 = r14.values
            long[] r14 = r14.metadata
            int r1 = r14.length
            int r1 = r1 + (-2)
            if (r1 < 0) goto L54
            r2 = 0
            r3 = r2
        L1a:
            r4 = r14[r3]
            long r6 = ~r4
            r8 = 7
            long r6 = r6 << r8
            long r6 = r6 & r4
            r8 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r6 = r6 & r8
            int r6 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r6 == 0) goto L4f
            int r6 = r3 - r1
            int r6 = ~r6
            int r6 = r6 >>> 31
            r7 = 8
            int r6 = 8 - r6
            r8 = r2
        L34:
            if (r8 >= r6) goto L4d
            r9 = 255(0xff, double:1.26E-321)
            long r9 = r9 & r4
            r11 = 128(0x80, double:6.3E-322)
            int r9 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r9 >= 0) goto L49
            int r9 = r3 << 3
            int r9 = r9 + r8
            r9 = r0[r9]
            androidx.collection.MutableScatterSet r9 = (androidx.collection.MutableScatterSet) r9
            r13.notifyRulerValueChange(r9)
        L49:
            long r4 = r4 >> r7
            int r8 = r8 + 1
            goto L34
        L4d:
            if (r6 != r7) goto L54
        L4f:
            if (r3 == r1) goto L54
            int r3 = r3 + 1
            goto L1a
        L54:
            androidx.collection.MutableScatterMap<androidx.compose.ui.layout.Ruler, androidx.collection.MutableScatterSet<androidx.compose.ui.node.WeakReference<androidx.compose.ui.node.LayoutNode>>> r14 = r13.rulerReaders
            if (r14 == 0) goto L5b
            r14.clear()
        L5b:
            androidx.collection.MutableObjectFloatMap<androidx.compose.ui.layout.Ruler> r14 = r13.rulerValues
            if (r14 == 0) goto L62
            r14.clear()
        L62:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p014ui.node.LookaheadCapablePlaceable.captureRulers$ui_release(androidx.compose.ui.layout.MeasureResult):void");
    }

    public final float findRulerValue(Ruler ruler, float f10) {
        if (this.isPlacingForAlignment) {
            return f10;
        }
        LookaheadCapablePlaceable lookaheadCapablePlaceable = this;
        while (true) {
            MutableObjectFloatMap<Ruler> mutableObjectFloatMap = lookaheadCapablePlaceable.rulerValues;
            float orDefault = mutableObjectFloatMap != null ? mutableObjectFloatMap.getOrDefault(ruler, Float.NaN) : Float.NaN;
            if (!Float.isNaN(orDefault)) {
                lookaheadCapablePlaceable.addRulerReader(getLayoutNode(), ruler);
                return ruler.calculateCoordinate$ui_release(orDefault, lookaheadCapablePlaceable.getCoordinates(), getCoordinates());
            }
            LookaheadCapablePlaceable parent = lookaheadCapablePlaceable.getParent();
            if (parent == null) {
                lookaheadCapablePlaceable.addRulerReader(getLayoutNode(), ruler);
                return f10;
            }
            lookaheadCapablePlaceable = parent;
        }
    }

    @Override // androidx.compose.p014ui.layout.Measured
    public final int get(AlignmentLine alignmentLine) {
        int iCalculateAlignmentLine;
        if (getHasMeasureResult() && (iCalculateAlignmentLine = calculateAlignmentLine(alignmentLine)) != Integer.MIN_VALUE) {
            return iCalculateAlignmentLine + (alignmentLine instanceof VerticalAlignmentLine ? IntOffset.m33629getXimpl(m32287getApparentToRealOffsetnOccac()) : IntOffset.m33630getYimpl(m32287getApparentToRealOffsetnOccac()));
        }
        return Integer.MIN_VALUE;
    }

    public abstract AlignmentLinesOwner getAlignmentLinesOwner();

    public abstract LookaheadCapablePlaceable getChild();

    public abstract LayoutCoordinates getCoordinates();

    public abstract boolean getHasMeasureResult();

    @Override // androidx.compose.p014ui.node.MeasureScopeWithLayoutNode
    public abstract LayoutNode getLayoutNode();

    public abstract MeasureResult getMeasureResult$ui_release();

    public abstract LookaheadCapablePlaceable getParent();

    public final Placeable.PlacementScope getPlacementScope() {
        return this.placementScope;
    }

    /* renamed from: getPosition-nOcc-ac, reason: not valid java name */
    public abstract long mo32431getPositionnOccac();

    public final RulerScope getRulerScope() {
        RulerScope rulerScope = this._rulerScope;
        return rulerScope == null ? new RulerScope() { // from class: androidx.compose.ui.node.LookaheadCapablePlaceable$rulerScope$1
            @Override // androidx.compose.p014ui.layout.RulerScope
            public LayoutCoordinates getCoordinates() {
                this.this$0.getLayoutNode().getLayoutDelegate$ui_release().onCoordinatesUsed();
                return this.this$0.getCoordinates();
            }

            @Override // androidx.compose.p014ui.unit.Density
            public float getDensity() {
                return this.this$0.getDensity();
            }

            @Override // androidx.compose.p014ui.unit.FontScaling
            public float getFontScale() {
                return this.this$0.getFontScale();
            }

            @Override // androidx.compose.p014ui.layout.RulerScope
            public void provides(Ruler ruler, float f10) {
                this.this$0.provideRulerValue(ruler, f10);
            }

            @Override // androidx.compose.p014ui.layout.RulerScope
            public void providesRelative(VerticalRuler verticalRuler, float f10) {
                this.this$0.provideRelativeRulerValue(verticalRuler, f10);
            }
        } : rulerScope;
    }

    public final void invalidateAlignmentLinesFromPositionChange(NodeCoordinator nodeCoordinator) {
        AlignmentLines alignmentLines;
        NodeCoordinator wrapped$ui_release = nodeCoordinator.getWrapped$ui_release();
        if (!AbstractC9979u.m20289b(wrapped$ui_release != null ? wrapped$ui_release.getLayoutNode() : null, nodeCoordinator.getLayoutNode())) {
            nodeCoordinator.getAlignmentLinesOwner().getAlignmentLines().onAlignmentsChanged();
            return;
        }
        AlignmentLinesOwner parentAlignmentLinesOwner = nodeCoordinator.getAlignmentLinesOwner().getParentAlignmentLinesOwner();
        if (parentAlignmentLinesOwner == null || (alignmentLines = parentAlignmentLinesOwner.getAlignmentLines()) == null) {
            return;
        }
        alignmentLines.onAlignmentsChanged();
    }

    @Override // androidx.compose.p014ui.layout.IntrinsicMeasureScope
    public boolean isLookingAhead() {
        return false;
    }

    @Override // androidx.compose.p014ui.node.MotionReferencePlacementDelegate
    public boolean isPlacedUnderMotionFrameOfReference() {
        return this.isPlacedUnderMotionFrameOfReference;
    }

    public final boolean isPlacingForAlignment$ui_release() {
        return this.isPlacingForAlignment;
    }

    public final boolean isShallowPlacing$ui_release() {
        return this.isShallowPlacing;
    }

    @Override // androidx.compose.p014ui.layout.MeasureScope
    public MeasureResult layout(final int i10, final int i11, final Map<AlignmentLine, Integer> map, final InterfaceC9540l interfaceC9540l, final InterfaceC9540l interfaceC9540l2) {
        if (!((i10 & ViewCompat.MEASURED_STATE_MASK) == 0 && ((-16777216) & i11) == 0)) {
            InlineClassHelperKt.throwIllegalStateException("Size(" + i10 + " x " + i11 + ") is out of range. Each dimension must be between 0 and 16777215.");
        }
        return new MeasureResult() { // from class: androidx.compose.ui.node.LookaheadCapablePlaceable.layout.1
            @Override // androidx.compose.p014ui.layout.MeasureResult
            public Map<AlignmentLine, Integer> getAlignmentLines() {
                return map;
            }

            @Override // androidx.compose.p014ui.layout.MeasureResult
            public int getHeight() {
                return i11;
            }

            @Override // androidx.compose.p014ui.layout.MeasureResult
            public InterfaceC9540l getRulers() {
                return interfaceC9540l;
            }

            @Override // androidx.compose.p014ui.layout.MeasureResult
            public int getWidth() {
                return i10;
            }

            @Override // androidx.compose.p014ui.layout.MeasureResult
            public void placeChildren() {
                interfaceC9540l2.invoke(this.getPlacementScope());
            }
        };
    }

    public final void provideRelativeRulerValue(Ruler ruler, float f10) {
        MutableObjectFloatMap<Ruler> mutableObjectFloatMap = this.rulerValues;
        if (mutableObjectFloatMap == null) {
            mutableObjectFloatMap = new MutableObjectFloatMap<>(0, 1, null);
            this.rulerValues = mutableObjectFloatMap;
        }
        if (getLayoutDirection() != LayoutDirection.Ltr) {
            f10 = getWidth() - f10;
        }
        mutableObjectFloatMap.set(ruler, f10);
    }

    public final void provideRulerValue(Ruler ruler, float f10) {
        MutableObjectFloatMap<Ruler> mutableObjectFloatMap = this.rulerValues;
        if (mutableObjectFloatMap == null) {
            mutableObjectFloatMap = new MutableObjectFloatMap<>(0, 1, null);
            this.rulerValues = mutableObjectFloatMap;
        }
        mutableObjectFloatMap.set(ruler, f10);
    }

    public abstract void replace$ui_release();

    public void setPlacedUnderMotionFrameOfReference(boolean z10) {
        this.isPlacedUnderMotionFrameOfReference = z10;
    }

    public final void setPlacingForAlignment$ui_release(boolean z10) {
        this.isPlacingForAlignment = z10;
    }

    public final void setShallowPlacing$ui_release(boolean z10) {
        this.isShallowPlacing = z10;
    }

    @Override // androidx.compose.p014ui.node.MotionReferencePlacementDelegate
    public void updatePlacedUnderMotionFrameOfReference(boolean z10) {
        LookaheadCapablePlaceable parent = getParent();
        LayoutNode layoutNode = parent != null ? parent.getLayoutNode() : null;
        if (AbstractC9979u.m20289b(layoutNode, getLayoutNode())) {
            setPlacedUnderMotionFrameOfReference(z10);
            return;
        }
        if ((layoutNode != null ? layoutNode.getLayoutState$ui_release() : null) != LayoutNode.LayoutState.LayingOut) {
            if ((layoutNode != null ? layoutNode.getLayoutState$ui_release() : null) != LayoutNode.LayoutState.LookaheadLayingOut) {
                return;
            }
        }
        setPlacedUnderMotionFrameOfReference(z10);
    }
}
