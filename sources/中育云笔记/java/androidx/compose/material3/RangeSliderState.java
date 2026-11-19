package androidx.compose.material3;

import androidx.annotation.IntRange;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.PrimitiveSnapshotStateKt;
import androidx.compose.runtime.SnapshotIntStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.AbstractC9972n;
import p181hd.InterfaceC9529a;
import p181hd.InterfaceC9540l;
import p265nd.AbstractC10409n;
import p265nd.AbstractC10410o;
import p265nd.InterfaceC10401f;
import p309qc.C10786q;

@StabilityInferred(parameters = 0)
@ExperimentalMaterial3Api
/* loaded from: classes2.dex */
public final class RangeSliderState {
    public static final int $stable = 8;
    private final MutableFloatState activeRangeEndState$delegate;
    private final MutableFloatState activeRangeStartState$delegate;
    private final MutableFloatState endThumbWidth$delegate;
    private final InterfaceC9540l gestureEndAction;
    private final MutableState isRtl$delegate;
    private final MutableFloatState maxPx$delegate;
    private final MutableFloatState minPx$delegate;
    private InterfaceC9540l onValueChange;
    private InterfaceC9529a onValueChangeFinished;
    private final MutableFloatState rawOffsetEnd$delegate;
    private final MutableFloatState rawOffsetStart$delegate;
    private final MutableFloatState startThumbWidth$delegate;
    private final int steps;
    private final float[] tickFractions;
    private final MutableIntState totalWidth$delegate;
    private final MutableFloatState trackHeight$delegate;
    private final InterfaceC10401f valueRange;

    public RangeSliderState() {
        this(0.0f, 0.0f, 0, null, null, 31, null);
    }

    private final float getActiveRangeEndState() {
        return this.activeRangeEndState$delegate.getFloatValue();
    }

    private final float getActiveRangeStartState() {
        return this.activeRangeStartState$delegate.getFloatValue();
    }

    private final float getMaxPx() {
        return this.maxPx$delegate.getFloatValue();
    }

    private final float getMinPx() {
        return this.minPx$delegate.getFloatValue();
    }

    private final float scaleToOffset(float f10, float f11, float f12) {
        return SliderKt.scale(((Number) this.valueRange.getStart()).floatValue(), ((Number) this.valueRange.getEndInclusive()).floatValue(), f12, f10, f11);
    }

    /* renamed from: scaleToUserValue-owVgs5E, reason: not valid java name */
    private final long m28997scaleToUserValueowVgs5E(float f10, float f11, long j10) {
        return SliderKt.m29110scaleziovWd0(f10, f11, j10, ((Number) this.valueRange.getStart()).floatValue(), ((Number) this.valueRange.getEndInclusive()).floatValue());
    }

    private final void setActiveRangeEndState(float f10) {
        this.activeRangeEndState$delegate.setFloatValue(f10);
    }

    private final void setActiveRangeStartState(float f10) {
        this.activeRangeStartState$delegate.setFloatValue(f10);
    }

    private final void setMaxPx(float f10) {
        this.maxPx$delegate.setFloatValue(f10);
    }

    private final void setMinPx(float f10) {
        this.minPx$delegate.setFloatValue(f10);
    }

    public final float getActiveRangeEnd() {
        return getActiveRangeEndState();
    }

    public final float getActiveRangeStart() {
        return getActiveRangeStartState();
    }

    public final float getCoercedActiveRangeEndAsFraction$material3_release() {
        return SliderKt.calcFraction(((Number) this.valueRange.getStart()).floatValue(), ((Number) this.valueRange.getEndInclusive()).floatValue(), getActiveRangeEnd());
    }

    public final float getCoercedActiveRangeStartAsFraction$material3_release() {
        return SliderKt.calcFraction(((Number) this.valueRange.getStart()).floatValue(), ((Number) this.valueRange.getEndInclusive()).floatValue(), getActiveRangeStart());
    }

    public final int getEndSteps$material3_release() {
        return (int) Math.floor(this.steps * (1.0f - getCoercedActiveRangeStartAsFraction$material3_release()));
    }

    public final float getEndThumbWidth$material3_release() {
        return this.endThumbWidth$delegate.getFloatValue();
    }

    public final InterfaceC9540l getGestureEndAction$material3_release() {
        return this.gestureEndAction;
    }

    public final InterfaceC9540l getOnValueChange$material3_release() {
        return this.onValueChange;
    }

    public final InterfaceC9529a getOnValueChangeFinished() {
        return this.onValueChangeFinished;
    }

    public final float getRawOffsetEnd$material3_release() {
        return this.rawOffsetEnd$delegate.getFloatValue();
    }

    public final float getRawOffsetStart$material3_release() {
        return this.rawOffsetStart$delegate.getFloatValue();
    }

    public final int getStartSteps$material3_release() {
        return (int) Math.floor(this.steps * getCoercedActiveRangeEndAsFraction$material3_release());
    }

    public final float getStartThumbWidth$material3_release() {
        return this.startThumbWidth$delegate.getFloatValue();
    }

    public final int getSteps() {
        return this.steps;
    }

    public final float[] getTickFractions$material3_release() {
        return this.tickFractions;
    }

    public final int getTotalWidth$material3_release() {
        return this.totalWidth$delegate.getIntValue();
    }

    public final float getTrackHeight$material3_release() {
        return this.trackHeight$delegate.getFloatValue();
    }

    public final InterfaceC10401f getValueRange() {
        return this.valueRange;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean isRtl$material3_release() {
        return ((Boolean) this.isRtl$delegate.getValue()).booleanValue();
    }

    public final void onDrag$material3_release(boolean z10, float f10) {
        long jSliderRange;
        if (z10) {
            setRawOffsetStart$material3_release(getRawOffsetStart$material3_release() + f10);
            setRawOffsetEnd$material3_release(scaleToOffset(getMinPx(), getMaxPx(), getActiveRangeEnd()));
            float rawOffsetEnd$material3_release = getRawOffsetEnd$material3_release();
            jSliderRange = SliderKt.SliderRange(SliderKt.snapValueToTick(AbstractC10410o.m21760m(getRawOffsetStart$material3_release(), getMinPx(), rawOffsetEnd$material3_release), this.tickFractions, getMinPx(), getMaxPx()), rawOffsetEnd$material3_release);
        } else {
            setRawOffsetEnd$material3_release(getRawOffsetEnd$material3_release() + f10);
            setRawOffsetStart$material3_release(scaleToOffset(getMinPx(), getMaxPx(), getActiveRangeStart()));
            float rawOffsetStart$material3_release = getRawOffsetStart$material3_release();
            jSliderRange = SliderKt.SliderRange(rawOffsetStart$material3_release, SliderKt.snapValueToTick(AbstractC10410o.m21760m(getRawOffsetEnd$material3_release(), rawOffsetStart$material3_release, getMaxPx()), this.tickFractions, getMinPx(), getMaxPx()));
        }
        long jM28997scaleToUserValueowVgs5E = m28997scaleToUserValueowVgs5E(getMinPx(), getMaxPx(), jSliderRange);
        if (SliderRange.m29120equalsimpl0(jM28997scaleToUserValueowVgs5E, SliderKt.SliderRange(getActiveRangeStart(), getActiveRangeEnd()))) {
            return;
        }
        InterfaceC9540l interfaceC9540l = this.onValueChange;
        if (interfaceC9540l == null) {
            setActiveRangeStart(SliderRange.m29122getStartimpl(jM28997scaleToUserValueowVgs5E));
            setActiveRangeEnd(SliderRange.m29121getEndInclusiveimpl(jM28997scaleToUserValueowVgs5E));
        } else if (interfaceC9540l != null) {
            interfaceC9540l.invoke(SliderRange.m29117boximpl(jM28997scaleToUserValueowVgs5E));
        }
    }

    public final void setActiveRangeEnd(float f10) {
        setActiveRangeEndState(SliderKt.snapValueToTick(AbstractC10410o.m21760m(f10, getActiveRangeStart(), ((Number) this.valueRange.getEndInclusive()).floatValue()), this.tickFractions, ((Number) this.valueRange.getStart()).floatValue(), ((Number) this.valueRange.getEndInclusive()).floatValue()));
    }

    public final void setActiveRangeStart(float f10) {
        setActiveRangeStartState(SliderKt.snapValueToTick(AbstractC10410o.m21760m(f10, ((Number) this.valueRange.getStart()).floatValue(), getActiveRangeEnd()), this.tickFractions, ((Number) this.valueRange.getStart()).floatValue(), ((Number) this.valueRange.getEndInclusive()).floatValue()));
    }

    public final void setEndThumbWidth$material3_release(float f10) {
        this.endThumbWidth$delegate.setFloatValue(f10);
    }

    public final void setOnValueChange$material3_release(InterfaceC9540l interfaceC9540l) {
        this.onValueChange = interfaceC9540l;
    }

    public final void setOnValueChangeFinished(InterfaceC9529a interfaceC9529a) {
        this.onValueChangeFinished = interfaceC9529a;
    }

    public final void setRawOffsetEnd$material3_release(float f10) {
        this.rawOffsetEnd$delegate.setFloatValue(f10);
    }

    public final void setRawOffsetStart$material3_release(float f10) {
        this.rawOffsetStart$delegate.setFloatValue(f10);
    }

    public final void setRtl$material3_release(boolean z10) {
        this.isRtl$delegate.setValue(Boolean.valueOf(z10));
    }

    public final void setStartThumbWidth$material3_release(float f10) {
        this.startThumbWidth$delegate.setFloatValue(f10);
    }

    public final void setTotalWidth$material3_release(int i10) {
        this.totalWidth$delegate.setIntValue(i10);
    }

    public final void setTrackHeight$material3_release(float f10) {
        this.trackHeight$delegate.setFloatValue(f10);
    }

    public final void updateMinMaxPx$material3_release() {
        float f10 = 2;
        float fMax = Math.max(getTotalWidth$material3_release() - (getEndThumbWidth$material3_release() / f10), 0.0f);
        float fMin = Math.min(getStartThumbWidth$material3_release() / f10, fMax);
        if (getMinPx() == fMin && getMaxPx() == fMax) {
            return;
        }
        setMinPx(fMin);
        setMaxPx(fMax);
        setRawOffsetStart$material3_release(scaleToOffset(getMinPx(), getMaxPx(), getActiveRangeStart()));
        setRawOffsetEnd$material3_release(scaleToOffset(getMinPx(), getMaxPx(), getActiveRangeEnd()));
    }

    public RangeSliderState(float f10, float f11, @IntRange(from = 0) int i10, InterfaceC9529a interfaceC9529a, InterfaceC10401f interfaceC10401f) {
        this.steps = i10;
        this.onValueChangeFinished = interfaceC9529a;
        this.valueRange = interfaceC10401f;
        this.activeRangeStartState$delegate = PrimitiveSnapshotStateKt.mutableFloatStateOf(f10);
        this.activeRangeEndState$delegate = PrimitiveSnapshotStateKt.mutableFloatStateOf(f11);
        this.tickFractions = SliderKt.stepsToTickFractions(i10);
        this.trackHeight$delegate = PrimitiveSnapshotStateKt.mutableFloatStateOf(0.0f);
        this.startThumbWidth$delegate = PrimitiveSnapshotStateKt.mutableFloatStateOf(0.0f);
        this.endThumbWidth$delegate = PrimitiveSnapshotStateKt.mutableFloatStateOf(0.0f);
        this.totalWidth$delegate = SnapshotIntStateKt.mutableIntStateOf(0);
        this.rawOffsetStart$delegate = PrimitiveSnapshotStateKt.mutableFloatStateOf(0.0f);
        this.rawOffsetEnd$delegate = PrimitiveSnapshotStateKt.mutableFloatStateOf(0.0f);
        this.isRtl$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
        this.gestureEndAction = new InterfaceC9540l() { // from class: androidx.compose.material3.RangeSliderState$gestureEndAction$1
            {
                super(1);
            }

            @Override // p181hd.InterfaceC9540l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke(((Boolean) obj).booleanValue());
                return C10786q.f26013a;
            }

            public final void invoke(boolean z10) {
                InterfaceC9529a onValueChangeFinished = this.this$0.getOnValueChangeFinished();
                if (onValueChangeFinished != null) {
                    onValueChangeFinished.invoke();
                }
            }
        };
        this.maxPx$delegate = PrimitiveSnapshotStateKt.mutableFloatStateOf(0.0f);
        this.minPx$delegate = PrimitiveSnapshotStateKt.mutableFloatStateOf(0.0f);
    }

    public /* synthetic */ RangeSliderState(float f10, float f11, int i10, InterfaceC9529a interfaceC9529a, InterfaceC10401f interfaceC10401f, int i11, AbstractC9972n abstractC9972n) {
        this((i11 & 1) != 0 ? 0.0f : f10, (i11 & 2) != 0 ? 1.0f : f11, (i11 & 4) != 0 ? 0 : i10, (i11 & 8) != 0 ? null : interfaceC9529a, (i11 & 16) != 0 ? AbstractC10409n.m21749b(0.0f, 1.0f) : interfaceC10401f);
    }
}
