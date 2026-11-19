package androidx.compose.material3;

import androidx.annotation.IntRange;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.PrimitiveSnapshotStateKt;
import androidx.compose.runtime.SnapshotIntStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.AbstractC9126n;
import p077d8.AbstractC8322g;
import p077d8.AbstractC8323h;
import p077d8.InterfaceC8317b;
import p123h7.C8736p;
import p300x7.InterfaceC10559a;
import p300x7.InterfaceC10570l;

@StabilityInferred(parameters = 0)
@ExperimentalMaterial3Api
/* loaded from: classes2.dex */
public final class RangeSliderState {
    public static final int $stable = 8;
    private final MutableFloatState activeRangeEndState$delegate;
    private final MutableFloatState activeRangeStartState$delegate;
    private final MutableFloatState endThumbWidth$delegate;
    private final InterfaceC10570l gestureEndAction;
    private final MutableState isRtl$delegate;
    private final MutableFloatState maxPx$delegate;
    private final MutableFloatState minPx$delegate;
    private InterfaceC10570l onValueChange;
    private InterfaceC10559a onValueChangeFinished;
    private final MutableFloatState rawOffsetEnd$delegate;
    private final MutableFloatState rawOffsetStart$delegate;
    private final MutableFloatState startThumbWidth$delegate;
    private final int steps;
    private final float[] tickFractions;
    private final MutableIntState totalWidth$delegate;
    private final MutableFloatState trackHeight$delegate;
    private final InterfaceC8317b valueRange;

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
    private final long m22395scaleToUserValueowVgs5E(float f10, float f11, long j10) {
        return SliderKt.m22508scaleziovWd0(f10, f11, j10, ((Number) this.valueRange.getStart()).floatValue(), ((Number) this.valueRange.getEndInclusive()).floatValue());
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

    public final InterfaceC10570l getGestureEndAction$material3_release() {
        return this.gestureEndAction;
    }

    public final InterfaceC10570l getOnValueChange$material3_release() {
        return this.onValueChange;
    }

    public final InterfaceC10559a getOnValueChangeFinished() {
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

    public final InterfaceC8317b getValueRange() {
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
            jSliderRange = SliderKt.SliderRange(SliderKt.snapValueToTick(AbstractC8323h.m13517l(getRawOffsetStart$material3_release(), getMinPx(), rawOffsetEnd$material3_release), this.tickFractions, getMinPx(), getMaxPx()), rawOffsetEnd$material3_release);
        } else {
            setRawOffsetEnd$material3_release(getRawOffsetEnd$material3_release() + f10);
            setRawOffsetStart$material3_release(scaleToOffset(getMinPx(), getMaxPx(), getActiveRangeStart()));
            float rawOffsetStart$material3_release = getRawOffsetStart$material3_release();
            jSliderRange = SliderKt.SliderRange(rawOffsetStart$material3_release, SliderKt.snapValueToTick(AbstractC8323h.m13517l(getRawOffsetEnd$material3_release(), rawOffsetStart$material3_release, getMaxPx()), this.tickFractions, getMinPx(), getMaxPx()));
        }
        long jM22395scaleToUserValueowVgs5E = m22395scaleToUserValueowVgs5E(getMinPx(), getMaxPx(), jSliderRange);
        if (SliderRange.m22518equalsimpl0(jM22395scaleToUserValueowVgs5E, SliderKt.SliderRange(getActiveRangeStart(), getActiveRangeEnd()))) {
            return;
        }
        InterfaceC10570l interfaceC10570l = this.onValueChange;
        if (interfaceC10570l == null) {
            setActiveRangeStart(SliderRange.m22520getStartimpl(jM22395scaleToUserValueowVgs5E));
            setActiveRangeEnd(SliderRange.m22519getEndInclusiveimpl(jM22395scaleToUserValueowVgs5E));
        } else if (interfaceC10570l != null) {
            interfaceC10570l.invoke(SliderRange.m22515boximpl(jM22395scaleToUserValueowVgs5E));
        }
    }

    public final void setActiveRangeEnd(float f10) {
        setActiveRangeEndState(SliderKt.snapValueToTick(AbstractC8323h.m13517l(f10, getActiveRangeStart(), ((Number) this.valueRange.getEndInclusive()).floatValue()), this.tickFractions, ((Number) this.valueRange.getStart()).floatValue(), ((Number) this.valueRange.getEndInclusive()).floatValue()));
    }

    public final void setActiveRangeStart(float f10) {
        setActiveRangeStartState(SliderKt.snapValueToTick(AbstractC8323h.m13517l(f10, ((Number) this.valueRange.getStart()).floatValue(), getActiveRangeEnd()), this.tickFractions, ((Number) this.valueRange.getStart()).floatValue(), ((Number) this.valueRange.getEndInclusive()).floatValue()));
    }

    public final void setEndThumbWidth$material3_release(float f10) {
        this.endThumbWidth$delegate.setFloatValue(f10);
    }

    public final void setOnValueChange$material3_release(InterfaceC10570l interfaceC10570l) {
        this.onValueChange = interfaceC10570l;
    }

    public final void setOnValueChangeFinished(InterfaceC10559a interfaceC10559a) {
        this.onValueChangeFinished = interfaceC10559a;
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

    public RangeSliderState(float f10, float f11, @IntRange(from = 0) int i10, InterfaceC10559a interfaceC10559a, InterfaceC8317b interfaceC8317b) {
        this.steps = i10;
        this.onValueChangeFinished = interfaceC10559a;
        this.valueRange = interfaceC8317b;
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
        this.gestureEndAction = new InterfaceC10570l() { // from class: androidx.compose.material3.RangeSliderState$gestureEndAction$1
            {
                super(1);
            }

            @Override // p300x7.InterfaceC10570l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke(((Boolean) obj).booleanValue());
                return C8736p.f16368a;
            }

            public final void invoke(boolean z10) {
                InterfaceC10559a onValueChangeFinished = this.this$0.getOnValueChangeFinished();
                if (onValueChangeFinished != null) {
                    onValueChangeFinished.invoke();
                }
            }
        };
        this.maxPx$delegate = PrimitiveSnapshotStateKt.mutableFloatStateOf(0.0f);
        this.minPx$delegate = PrimitiveSnapshotStateKt.mutableFloatStateOf(0.0f);
    }

    public /* synthetic */ RangeSliderState(float f10, float f11, int i10, InterfaceC10559a interfaceC10559a, InterfaceC8317b interfaceC8317b, int i11, AbstractC9126n abstractC9126n) {
        this((i11 & 1) != 0 ? 0.0f : f10, (i11 & 2) != 0 ? 1.0f : f11, (i11 & 4) != 0 ? 0 : i10, (i11 & 8) != 0 ? null : interfaceC10559a, (i11 & 16) != 0 ? AbstractC8322g.m13507b(0.0f, 1.0f) : interfaceC8317b);
    }
}
