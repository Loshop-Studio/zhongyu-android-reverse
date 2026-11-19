package androidx.compose.p014ui.node;

import androidx.collection.MutableObjectIntMap;
import androidx.collection.ObjectIntMapKt;
import androidx.compose.p014ui.internal.InlineClassHelperKt;
import androidx.compose.p014ui.layout.AlignmentLine;
import androidx.compose.p014ui.layout.LayoutCoordinates;
import androidx.compose.p014ui.layout.LookaheadLayoutCoordinates;
import androidx.compose.p014ui.layout.Measurable;
import androidx.compose.p014ui.layout.MeasureResult;
import androidx.compose.p014ui.layout.Placeable;
import androidx.compose.p014ui.unit.IntOffset;
import androidx.compose.p014ui.unit.IntSize;
import androidx.compose.p014ui.unit.LayoutDirection;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.KotlinNothingValueException;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9529a;
import p181hd.InterfaceC9540l;
import p309qc.C10786q;

@StabilityInferred(parameters = 1)
/* loaded from: classes2.dex */
public abstract class LookaheadDelegate extends LookaheadCapablePlaceable implements Measurable {
    public static final int $stable = 0;
    private MeasureResult _measureResult;
    private final NodeCoordinator coordinator;
    private Map<AlignmentLine, Integer> oldAlignmentLines;
    private long position = IntOffset.Companion.m33640getZeronOccac();
    private final LookaheadLayoutCoordinates lookaheadLayoutCoordinates = new LookaheadLayoutCoordinates(this);
    private final MutableObjectIntMap<AlignmentLine> cachedAlignmentLinesMap = ObjectIntMapKt.mutableObjectIntMapOf();

    public LookaheadDelegate(NodeCoordinator nodeCoordinator) {
        this.coordinator = nodeCoordinator;
    }

    /* renamed from: placeSelf--gyyYBs, reason: not valid java name */
    private final void m32434placeSelfgyyYBs(long j10) {
        if (!IntOffset.m33628equalsimpl0(mo32431getPositionnOccac(), j10)) {
            m32440setPositiongyyYBs(j10);
            LookaheadPassDelegate lookaheadPassDelegate$ui_release = getLayoutNode().getLayoutDelegate$ui_release().getLookaheadPassDelegate$ui_release();
            if (lookaheadPassDelegate$ui_release != null) {
                lookaheadPassDelegate$ui_release.notifyChildrenUsingLookaheadCoordinatesWhilePlacing();
            }
            invalidateAlignmentLinesFromPositionChange(this.coordinator);
        }
        if (isPlacingForAlignment$ui_release()) {
            return;
        }
        captureRulers$ui_release(getMeasureResult$ui_release());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void set_measureResult(MeasureResult measureResult) {
        C10786q c10786q;
        Map<AlignmentLine, Integer> map;
        if (measureResult != null) {
            m32291setMeasuredSizeozmzZPI(IntSize.m33667constructorimpl((measureResult.getHeight() & 4294967295L) | (measureResult.getWidth() << 32)));
            c10786q = C10786q.f26013a;
        } else {
            c10786q = null;
        }
        if (c10786q == null) {
            m32291setMeasuredSizeozmzZPI(IntSize.Companion.m33677getZeroYbymL2g());
        }
        if (!AbstractC9979u.m20289b(this._measureResult, measureResult) && measureResult != null && ((((map = this.oldAlignmentLines) != null && !map.isEmpty()) || !measureResult.getAlignmentLines().isEmpty()) && !AbstractC9979u.m20289b(measureResult.getAlignmentLines(), this.oldAlignmentLines))) {
            getAlignmentLinesOwner().getAlignmentLines().onAlignmentsChanged();
            Map linkedHashMap = this.oldAlignmentLines;
            if (linkedHashMap == null) {
                linkedHashMap = new LinkedHashMap();
                this.oldAlignmentLines = linkedHashMap;
            }
            linkedHashMap.clear();
            linkedHashMap.putAll(measureResult.getAlignmentLines());
        }
        this._measureResult = measureResult;
    }

    @Override // androidx.compose.p014ui.node.LookaheadCapablePlaceable
    public AlignmentLinesOwner getAlignmentLinesOwner() {
        AlignmentLinesOwner lookaheadAlignmentLinesOwner$ui_release = this.coordinator.getLayoutNode().getLayoutDelegate$ui_release().getLookaheadAlignmentLinesOwner$ui_release();
        AbstractC9979u.m20291d(lookaheadAlignmentLinesOwner$ui_release);
        return lookaheadAlignmentLinesOwner$ui_release;
    }

    public final int getCachedAlignmentLine$ui_release(AlignmentLine alignmentLine) {
        return this.cachedAlignmentLinesMap.getOrDefault(alignmentLine, Integer.MIN_VALUE);
    }

    public final MutableObjectIntMap<AlignmentLine> getCachedAlignmentLinesMap() {
        return this.cachedAlignmentLinesMap;
    }

    @Override // androidx.compose.p014ui.node.LookaheadCapablePlaceable
    public LookaheadCapablePlaceable getChild() {
        NodeCoordinator wrapped$ui_release = this.coordinator.getWrapped$ui_release();
        if (wrapped$ui_release != null) {
            return wrapped$ui_release.getLookaheadDelegate();
        }
        return null;
    }

    /* renamed from: getConstraints-msEJaDk$ui_release, reason: not valid java name */
    public final long m32435getConstraintsmsEJaDk$ui_release() {
        return m32289getMeasurementConstraintsmsEJaDk();
    }

    @Override // androidx.compose.p014ui.node.LookaheadCapablePlaceable
    public LayoutCoordinates getCoordinates() {
        return this.lookaheadLayoutCoordinates;
    }

    public final NodeCoordinator getCoordinator() {
        return this.coordinator;
    }

    @Override // androidx.compose.p014ui.unit.Density
    public float getDensity() {
        return this.coordinator.getDensity();
    }

    @Override // androidx.compose.p014ui.unit.FontScaling
    public float getFontScale() {
        return this.coordinator.getFontScale();
    }

    @Override // androidx.compose.p014ui.node.LookaheadCapablePlaceable
    public boolean getHasMeasureResult() {
        return this._measureResult != null;
    }

    @Override // androidx.compose.p014ui.layout.IntrinsicMeasureScope
    public LayoutDirection getLayoutDirection() {
        return this.coordinator.getLayoutDirection();
    }

    @Override // androidx.compose.p014ui.node.LookaheadCapablePlaceable, androidx.compose.p014ui.node.MeasureScopeWithLayoutNode
    public LayoutNode getLayoutNode() {
        return this.coordinator.getLayoutNode();
    }

    public final LookaheadLayoutCoordinates getLookaheadLayoutCoordinates() {
        return this.lookaheadLayoutCoordinates;
    }

    @Override // androidx.compose.p014ui.node.LookaheadCapablePlaceable
    public MeasureResult getMeasureResult$ui_release() {
        MeasureResult measureResult = this._measureResult;
        if (measureResult != null) {
            return measureResult;
        }
        InlineClassHelperKt.throwIllegalStateExceptionForNullCheck("LookaheadDelegate has not been measured yet when measureResult is requested.");
        throw new KotlinNothingValueException();
    }

    @Override // androidx.compose.p014ui.node.LookaheadCapablePlaceable
    public LookaheadCapablePlaceable getParent() {
        NodeCoordinator wrappedBy$ui_release = this.coordinator.getWrappedBy$ui_release();
        if (wrappedBy$ui_release != null) {
            return wrappedBy$ui_release.getLookaheadDelegate();
        }
        return null;
    }

    @Override // androidx.compose.p014ui.layout.Measured, androidx.compose.p014ui.layout.IntrinsicMeasurable
    public Object getParentData() {
        return this.coordinator.getParentData();
    }

    @Override // androidx.compose.p014ui.node.LookaheadCapablePlaceable
    /* renamed from: getPosition-nOcc-ac */
    public long mo32431getPositionnOccac() {
        return this.position;
    }

    /* renamed from: getSize-YbymL2g$ui_release, reason: not valid java name */
    public final long m32436getSizeYbymL2g$ui_release() {
        return IntSize.m33667constructorimpl((getHeight() & 4294967295L) | (getWidth() << 32));
    }

    @Override // androidx.compose.p014ui.node.LookaheadCapablePlaceable, androidx.compose.p014ui.layout.IntrinsicMeasureScope
    public boolean isLookingAhead() {
        return true;
    }

    public int maxIntrinsicHeight(int i10) {
        NodeCoordinator wrapped$ui_release = this.coordinator.getWrapped$ui_release();
        AbstractC9979u.m20291d(wrapped$ui_release);
        LookaheadDelegate lookaheadDelegate = wrapped$ui_release.getLookaheadDelegate();
        AbstractC9979u.m20291d(lookaheadDelegate);
        return lookaheadDelegate.maxIntrinsicHeight(i10);
    }

    public int maxIntrinsicWidth(int i10) {
        NodeCoordinator wrapped$ui_release = this.coordinator.getWrapped$ui_release();
        AbstractC9979u.m20291d(wrapped$ui_release);
        LookaheadDelegate lookaheadDelegate = wrapped$ui_release.getLookaheadDelegate();
        AbstractC9979u.m20291d(lookaheadDelegate);
        return lookaheadDelegate.maxIntrinsicWidth(i10);
    }

    public int minIntrinsicHeight(int i10) {
        NodeCoordinator wrapped$ui_release = this.coordinator.getWrapped$ui_release();
        AbstractC9979u.m20291d(wrapped$ui_release);
        LookaheadDelegate lookaheadDelegate = wrapped$ui_release.getLookaheadDelegate();
        AbstractC9979u.m20291d(lookaheadDelegate);
        return lookaheadDelegate.minIntrinsicHeight(i10);
    }

    public int minIntrinsicWidth(int i10) {
        NodeCoordinator wrapped$ui_release = this.coordinator.getWrapped$ui_release();
        AbstractC9979u.m20291d(wrapped$ui_release);
        LookaheadDelegate lookaheadDelegate = wrapped$ui_release.getLookaheadDelegate();
        AbstractC9979u.m20291d(lookaheadDelegate);
        return lookaheadDelegate.minIntrinsicWidth(i10);
    }

    /* renamed from: performingMeasure-K40F9xA, reason: not valid java name */
    public final Placeable m32437performingMeasureK40F9xA(long j10, InterfaceC9529a interfaceC9529a) {
        m32292setMeasurementConstraintsBRTryo0(j10);
        set_measureResult((MeasureResult) interfaceC9529a.invoke());
        return this;
    }

    @Override // androidx.compose.p014ui.layout.Placeable
    /* renamed from: placeAt-f8xVGno */
    public final void mo32230placeAtf8xVGno(long j10, float f10, InterfaceC9540l interfaceC9540l) {
        m32434placeSelfgyyYBs(j10);
        if (isShallowPlacing$ui_release()) {
            return;
        }
        placeChildren();
    }

    public void placeChildren() {
        getMeasureResult$ui_release().placeChildren();
    }

    /* renamed from: placeSelfApparentToRealOffset--gyyYBs$ui_release, reason: not valid java name */
    public final void m32438placeSelfApparentToRealOffsetgyyYBs$ui_release(long j10) {
        m32434placeSelfgyyYBs(IntOffset.m33633plusqkQi6aY(j10, m32287getApparentToRealOffsetnOccac()));
    }

    /* renamed from: positionIn-iSbpLlY$ui_release, reason: not valid java name */
    public final long m32439positionIniSbpLlY$ui_release(LookaheadDelegate lookaheadDelegate, boolean z10) {
        long jM33640getZeronOccac = IntOffset.Companion.m33640getZeronOccac();
        LookaheadDelegate lookaheadDelegate2 = this;
        while (!AbstractC9979u.m20289b(lookaheadDelegate2, lookaheadDelegate)) {
            if (!lookaheadDelegate2.isPlacedUnderMotionFrameOfReference() || !z10) {
                jM33640getZeronOccac = IntOffset.m33633plusqkQi6aY(jM33640getZeronOccac, lookaheadDelegate2.mo32431getPositionnOccac());
            }
            NodeCoordinator wrappedBy$ui_release = lookaheadDelegate2.coordinator.getWrappedBy$ui_release();
            AbstractC9979u.m20291d(wrappedBy$ui_release);
            lookaheadDelegate2 = wrappedBy$ui_release.getLookaheadDelegate();
            AbstractC9979u.m20291d(lookaheadDelegate2);
        }
        return jM33640getZeronOccac;
    }

    @Override // androidx.compose.p014ui.node.LookaheadCapablePlaceable
    public void replace$ui_release() {
        mo32230placeAtf8xVGno(mo32431getPositionnOccac(), 0.0f, (InterfaceC9540l) null);
    }

    /* renamed from: setPosition--gyyYBs, reason: not valid java name */
    public void m32440setPositiongyyYBs(long j10) {
        this.position = j10;
    }
}
