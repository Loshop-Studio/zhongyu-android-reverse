package androidx.compose.p013ui.node;

import androidx.collection.MutableObjectIntMap;
import androidx.collection.ObjectIntMapKt;
import androidx.compose.p013ui.internal.InlineClassHelperKt;
import androidx.compose.p013ui.layout.AlignmentLine;
import androidx.compose.p013ui.layout.LayoutCoordinates;
import androidx.compose.p013ui.layout.LookaheadLayoutCoordinates;
import androidx.compose.p013ui.layout.Measurable;
import androidx.compose.p013ui.layout.MeasureResult;
import androidx.compose.p013ui.layout.Placeable;
import androidx.compose.p013ui.unit.IntOffset;
import androidx.compose.p013ui.unit.IntSize;
import androidx.compose.p013ui.unit.LayoutDirection;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.KotlinNothingValueException;
import kotlin.jvm.internal.AbstractC9133u;
import p123h7.C8736p;
import p300x7.InterfaceC10559a;
import p300x7.InterfaceC10570l;

@StabilityInferred(parameters = 1)
/* loaded from: classes2.dex */
public abstract class LookaheadDelegate extends LookaheadCapablePlaceable implements Measurable {
    public static final int $stable = 0;
    private MeasureResult _measureResult;
    private final NodeCoordinator coordinator;
    private Map<AlignmentLine, Integer> oldAlignmentLines;
    private long position = IntOffset.Companion.m27038getZeronOccac();
    private final LookaheadLayoutCoordinates lookaheadLayoutCoordinates = new LookaheadLayoutCoordinates(this);
    private final MutableObjectIntMap<AlignmentLine> cachedAlignmentLinesMap = ObjectIntMapKt.mutableObjectIntMapOf();

    public LookaheadDelegate(NodeCoordinator nodeCoordinator) {
        this.coordinator = nodeCoordinator;
    }

    /* renamed from: placeSelf--gyyYBs, reason: not valid java name */
    private final void m25832placeSelfgyyYBs(long j10) {
        if (!IntOffset.m27026equalsimpl0(mo25829getPositionnOccac(), j10)) {
            m25838setPositiongyyYBs(j10);
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
        C8736p c8736p;
        Map<AlignmentLine, Integer> map;
        if (measureResult != null) {
            m25689setMeasuredSizeozmzZPI(IntSize.m27065constructorimpl((measureResult.getHeight() & 4294967295L) | (measureResult.getWidth() << 32)));
            c8736p = C8736p.f16368a;
        } else {
            c8736p = null;
        }
        if (c8736p == null) {
            m25689setMeasuredSizeozmzZPI(IntSize.Companion.m27075getZeroYbymL2g());
        }
        if (!AbstractC9133u.m16128b(this._measureResult, measureResult) && measureResult != null && ((((map = this.oldAlignmentLines) != null && !map.isEmpty()) || !measureResult.getAlignmentLines().isEmpty()) && !AbstractC9133u.m16128b(measureResult.getAlignmentLines(), this.oldAlignmentLines))) {
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

    @Override // androidx.compose.p013ui.node.LookaheadCapablePlaceable
    public AlignmentLinesOwner getAlignmentLinesOwner() {
        AlignmentLinesOwner lookaheadAlignmentLinesOwner$ui_release = this.coordinator.getLayoutNode().getLayoutDelegate$ui_release().getLookaheadAlignmentLinesOwner$ui_release();
        AbstractC9133u.m16130d(lookaheadAlignmentLinesOwner$ui_release);
        return lookaheadAlignmentLinesOwner$ui_release;
    }

    public final int getCachedAlignmentLine$ui_release(AlignmentLine alignmentLine) {
        return this.cachedAlignmentLinesMap.getOrDefault(alignmentLine, Integer.MIN_VALUE);
    }

    public final MutableObjectIntMap<AlignmentLine> getCachedAlignmentLinesMap() {
        return this.cachedAlignmentLinesMap;
    }

    @Override // androidx.compose.p013ui.node.LookaheadCapablePlaceable
    public LookaheadCapablePlaceable getChild() {
        NodeCoordinator wrapped$ui_release = this.coordinator.getWrapped$ui_release();
        if (wrapped$ui_release != null) {
            return wrapped$ui_release.getLookaheadDelegate();
        }
        return null;
    }

    /* renamed from: getConstraints-msEJaDk$ui_release, reason: not valid java name */
    public final long m25833getConstraintsmsEJaDk$ui_release() {
        return m25687getMeasurementConstraintsmsEJaDk();
    }

    @Override // androidx.compose.p013ui.node.LookaheadCapablePlaceable
    public LayoutCoordinates getCoordinates() {
        return this.lookaheadLayoutCoordinates;
    }

    public final NodeCoordinator getCoordinator() {
        return this.coordinator;
    }

    @Override // androidx.compose.p013ui.unit.Density
    public float getDensity() {
        return this.coordinator.getDensity();
    }

    @Override // androidx.compose.p013ui.unit.FontScaling
    public float getFontScale() {
        return this.coordinator.getFontScale();
    }

    @Override // androidx.compose.p013ui.node.LookaheadCapablePlaceable
    public boolean getHasMeasureResult() {
        return this._measureResult != null;
    }

    @Override // androidx.compose.p013ui.layout.IntrinsicMeasureScope
    public LayoutDirection getLayoutDirection() {
        return this.coordinator.getLayoutDirection();
    }

    @Override // androidx.compose.p013ui.node.LookaheadCapablePlaceable, androidx.compose.p013ui.node.MeasureScopeWithLayoutNode
    public LayoutNode getLayoutNode() {
        return this.coordinator.getLayoutNode();
    }

    public final LookaheadLayoutCoordinates getLookaheadLayoutCoordinates() {
        return this.lookaheadLayoutCoordinates;
    }

    @Override // androidx.compose.p013ui.node.LookaheadCapablePlaceable
    public MeasureResult getMeasureResult$ui_release() {
        MeasureResult measureResult = this._measureResult;
        if (measureResult != null) {
            return measureResult;
        }
        InlineClassHelperKt.throwIllegalStateExceptionForNullCheck("LookaheadDelegate has not been measured yet when measureResult is requested.");
        throw new KotlinNothingValueException();
    }

    @Override // androidx.compose.p013ui.node.LookaheadCapablePlaceable
    public LookaheadCapablePlaceable getParent() {
        NodeCoordinator wrappedBy$ui_release = this.coordinator.getWrappedBy$ui_release();
        if (wrappedBy$ui_release != null) {
            return wrappedBy$ui_release.getLookaheadDelegate();
        }
        return null;
    }

    @Override // androidx.compose.p013ui.layout.Measured, androidx.compose.p013ui.layout.IntrinsicMeasurable
    public Object getParentData() {
        return this.coordinator.getParentData();
    }

    @Override // androidx.compose.p013ui.node.LookaheadCapablePlaceable
    /* renamed from: getPosition-nOcc-ac */
    public long mo25829getPositionnOccac() {
        return this.position;
    }

    /* renamed from: getSize-YbymL2g$ui_release, reason: not valid java name */
    public final long m25834getSizeYbymL2g$ui_release() {
        return IntSize.m27065constructorimpl((getHeight() & 4294967295L) | (getWidth() << 32));
    }

    @Override // androidx.compose.p013ui.node.LookaheadCapablePlaceable, androidx.compose.p013ui.layout.IntrinsicMeasureScope
    public boolean isLookingAhead() {
        return true;
    }

    public int maxIntrinsicHeight(int i10) {
        NodeCoordinator wrapped$ui_release = this.coordinator.getWrapped$ui_release();
        AbstractC9133u.m16130d(wrapped$ui_release);
        LookaheadDelegate lookaheadDelegate = wrapped$ui_release.getLookaheadDelegate();
        AbstractC9133u.m16130d(lookaheadDelegate);
        return lookaheadDelegate.maxIntrinsicHeight(i10);
    }

    public int maxIntrinsicWidth(int i10) {
        NodeCoordinator wrapped$ui_release = this.coordinator.getWrapped$ui_release();
        AbstractC9133u.m16130d(wrapped$ui_release);
        LookaheadDelegate lookaheadDelegate = wrapped$ui_release.getLookaheadDelegate();
        AbstractC9133u.m16130d(lookaheadDelegate);
        return lookaheadDelegate.maxIntrinsicWidth(i10);
    }

    public int minIntrinsicHeight(int i10) {
        NodeCoordinator wrapped$ui_release = this.coordinator.getWrapped$ui_release();
        AbstractC9133u.m16130d(wrapped$ui_release);
        LookaheadDelegate lookaheadDelegate = wrapped$ui_release.getLookaheadDelegate();
        AbstractC9133u.m16130d(lookaheadDelegate);
        return lookaheadDelegate.minIntrinsicHeight(i10);
    }

    public int minIntrinsicWidth(int i10) {
        NodeCoordinator wrapped$ui_release = this.coordinator.getWrapped$ui_release();
        AbstractC9133u.m16130d(wrapped$ui_release);
        LookaheadDelegate lookaheadDelegate = wrapped$ui_release.getLookaheadDelegate();
        AbstractC9133u.m16130d(lookaheadDelegate);
        return lookaheadDelegate.minIntrinsicWidth(i10);
    }

    /* renamed from: performingMeasure-K40F9xA, reason: not valid java name */
    public final Placeable m25835performingMeasureK40F9xA(long j10, InterfaceC10559a interfaceC10559a) {
        m25690setMeasurementConstraintsBRTryo0(j10);
        set_measureResult((MeasureResult) interfaceC10559a.invoke());
        return this;
    }

    @Override // androidx.compose.p013ui.layout.Placeable
    /* renamed from: placeAt-f8xVGno */
    public final void mo25628placeAtf8xVGno(long j10, float f10, InterfaceC10570l interfaceC10570l) {
        m25832placeSelfgyyYBs(j10);
        if (isShallowPlacing$ui_release()) {
            return;
        }
        placeChildren();
    }

    public void placeChildren() {
        getMeasureResult$ui_release().placeChildren();
    }

    /* renamed from: placeSelfApparentToRealOffset--gyyYBs$ui_release, reason: not valid java name */
    public final void m25836placeSelfApparentToRealOffsetgyyYBs$ui_release(long j10) {
        m25832placeSelfgyyYBs(IntOffset.m27031plusqkQi6aY(j10, m25685getApparentToRealOffsetnOccac()));
    }

    /* renamed from: positionIn-iSbpLlY$ui_release, reason: not valid java name */
    public final long m25837positionIniSbpLlY$ui_release(LookaheadDelegate lookaheadDelegate, boolean z10) {
        long jM27038getZeronOccac = IntOffset.Companion.m27038getZeronOccac();
        LookaheadDelegate lookaheadDelegate2 = this;
        while (!AbstractC9133u.m16128b(lookaheadDelegate2, lookaheadDelegate)) {
            if (!lookaheadDelegate2.isPlacedUnderMotionFrameOfReference() || !z10) {
                jM27038getZeronOccac = IntOffset.m27031plusqkQi6aY(jM27038getZeronOccac, lookaheadDelegate2.mo25829getPositionnOccac());
            }
            NodeCoordinator wrappedBy$ui_release = lookaheadDelegate2.coordinator.getWrappedBy$ui_release();
            AbstractC9133u.m16130d(wrappedBy$ui_release);
            lookaheadDelegate2 = wrappedBy$ui_release.getLookaheadDelegate();
            AbstractC9133u.m16130d(lookaheadDelegate2);
        }
        return jM27038getZeronOccac;
    }

    @Override // androidx.compose.p013ui.node.LookaheadCapablePlaceable
    public void replace$ui_release() {
        mo25628placeAtf8xVGno(mo25829getPositionnOccac(), 0.0f, (InterfaceC10570l) null);
    }

    /* renamed from: setPosition--gyyYBs, reason: not valid java name */
    public void m25838setPositiongyyYBs(long j10) {
        this.position = j10;
    }
}
