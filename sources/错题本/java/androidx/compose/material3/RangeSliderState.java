package androidx.compose.material3;

import androidx.annotation.IntRange;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.PrimitiveSnapshotStateKt;
import androidx.compose.runtime.SnapshotIntStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.transformation.FabTransformationScrimBehavior;
import kotlin.Metadata;
import kotlin.collections.AbstractC5806u;
import kotlin.jvm.internal.AbstractC5824e;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p045d6.C5443s;
import p152r6.InterfaceC6469a;
import p152r6.InterfaceC6471c;
import p200x6.C6751a;
import p200x6.InterfaceC6752b;

@StabilityInferred(parameters = 0)
@ExperimentalMaterial3Api
@Metadata(m5109d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0014\n\u0002\b;\b\u0007\u0018\u00002\u00020\u0001BG\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0006\u001a\u00020\u0005\u0012\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0013\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0016\u001a\u00020\bH\u0000¢\u0006\u0004\b\u0014\u0010\u0015J*\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u0019H\u0002ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001bJ'\u0010\u001e\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u001d\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010 \u001a\u0004\b!\u0010\"R*\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010(\u001a\u0004\b)\u0010*R+\u00102\u001a\u00020\u00022\u0006\u0010+\u001a\u00020\u00028B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R+\u00106\u001a\u00020\u00022\u0006\u0010+\u001a\u00020\u00028B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b3\u0010-\u001a\u0004\b4\u0010/\"\u0004\b5\u00101R0\u00108\u001a\u0010\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\b\u0018\u0001078\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b8\u00109\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R\u001a\u0010?\u001a\u00020>8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b?\u0010@\u001a\u0004\bA\u0010BR+\u0010F\u001a\u00020\u00022\u0006\u0010+\u001a\u00020\u00028@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\bC\u0010-\u001a\u0004\bD\u0010/\"\u0004\bE\u00101R+\u0010J\u001a\u00020\u00022\u0006\u0010+\u001a\u00020\u00028@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\bG\u0010-\u001a\u0004\bH\u0010/\"\u0004\bI\u00101R+\u0010N\u001a\u00020\u00022\u0006\u0010+\u001a\u00020\u00028@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\bK\u0010-\u001a\u0004\bL\u0010/\"\u0004\bM\u00101R+\u0010T\u001a\u00020\u00052\u0006\u0010+\u001a\u00020\u00058@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\bO\u0010P\u001a\u0004\bQ\u0010\"\"\u0004\bR\u0010SR+\u0010X\u001a\u00020\u00022\u0006\u0010+\u001a\u00020\u00028@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\bU\u0010-\u001a\u0004\bV\u0010/\"\u0004\bW\u00101R+\u0010\\\u001a\u00020\u00022\u0006\u0010+\u001a\u00020\u00028@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\bY\u0010-\u001a\u0004\bZ\u0010/\"\u0004\b[\u00101R+\u0010c\u001a\u00020\u000e2\u0006\u0010+\u001a\u00020\u000e8@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\b]\u0010^\u001a\u0004\b_\u0010`\"\u0004\ba\u0010bR&\u0010d\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\b078\u0000X\u0080\u0004¢\u0006\f\n\u0004\bd\u00109\u001a\u0004\be\u0010;R+\u0010\u0018\u001a\u00020\u00022\u0006\u0010+\u001a\u00020\u00028B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\bf\u0010-\u001a\u0004\bg\u0010/\"\u0004\bh\u00101R+\u0010\u0017\u001a\u00020\u00022\u0006\u0010+\u001a\u00020\u00028B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\bi\u0010-\u001a\u0004\bj\u0010/\"\u0004\bk\u00101R$\u0010\u0003\u001a\u00020\u00022\u0006\u0010l\u001a\u00020\u00028F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bm\u0010/\"\u0004\bn\u00101R$\u0010\u0004\u001a\u00020\u00022\u0006\u0010l\u001a\u00020\u00028F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bo\u0010/\"\u0004\bp\u00101R\u0014\u0010r\u001a\u00020\u00028@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bq\u0010/R\u0014\u0010t\u001a\u00020\u00028@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bs\u0010/R\u0014\u0010v\u001a\u00020\u00058@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bu\u0010\"R\u0014\u0010x\u001a\u00020\u00058@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bw\u0010\"\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006y"}, m5110d2 = {"Landroidx/compose/material3/RangeSliderState;", "", "", "activeRangeStart", "activeRangeEnd", "", "steps", "Lkotlin/Function0;", "Ld6/s;", "onValueChangeFinished", "Lx6/b;", "valueRange", "<init>", "(FFILr6/a;Lx6/b;)V", "", "isStart", TypedValues.CycleType.S_WAVE_OFFSET, "onDrag$material3_release", "(ZF)V", "onDrag", "updateMinMaxPx$material3_release", "()V", "updateMinMaxPx", "minPx", "maxPx", "Landroidx/compose/material3/SliderRange;", "scaleToUserValue-owVgs5E", "(FFJ)J", "scaleToUserValue", "userValue", "scaleToOffset", "(FFF)F", "I", "getSteps", "()I", "Lr6/a;", "getOnValueChangeFinished", "()Lr6/a;", "setOnValueChangeFinished", "(Lr6/a;)V", "Lx6/b;", "getValueRange", "()Lx6/b;", "<set-?>", "activeRangeStartState$delegate", "Landroidx/compose/runtime/MutableFloatState;", "getActiveRangeStartState", "()F", "setActiveRangeStartState", "(F)V", "activeRangeStartState", "activeRangeEndState$delegate", "getActiveRangeEndState", "setActiveRangeEndState", "activeRangeEndState", "Lkotlin/Function1;", "onValueChange", "Lr6/c;", "getOnValueChange$material3_release", "()Lr6/c;", "setOnValueChange$material3_release", "(Lr6/c;)V", "", "tickFractions", "[F", "getTickFractions$material3_release", "()[F", "trackHeight$delegate", "getTrackHeight$material3_release", "setTrackHeight$material3_release", "trackHeight", "startThumbWidth$delegate", "getStartThumbWidth$material3_release", "setStartThumbWidth$material3_release", "startThumbWidth", "endThumbWidth$delegate", "getEndThumbWidth$material3_release", "setEndThumbWidth$material3_release", "endThumbWidth", "totalWidth$delegate", "Landroidx/compose/runtime/MutableIntState;", "getTotalWidth$material3_release", "setTotalWidth$material3_release", "(I)V", "totalWidth", "rawOffsetStart$delegate", "getRawOffsetStart$material3_release", "setRawOffsetStart$material3_release", "rawOffsetStart", "rawOffsetEnd$delegate", "getRawOffsetEnd$material3_release", "setRawOffsetEnd$material3_release", "rawOffsetEnd", "isRtl$delegate", "Landroidx/compose/runtime/MutableState;", "isRtl$material3_release", "()Z", "setRtl$material3_release", "(Z)V", "isRtl", "gestureEndAction", "getGestureEndAction$material3_release", "maxPx$delegate", "getMaxPx", "setMaxPx", "minPx$delegate", "getMinPx", "setMinPx", "newVal", "getActiveRangeStart", "setActiveRangeStart", "getActiveRangeEnd", "setActiveRangeEnd", "getCoercedActiveRangeStartAsFraction$material3_release", "coercedActiveRangeStartAsFraction", "getCoercedActiveRangeEndAsFraction$material3_release", "coercedActiveRangeEndAsFraction", "getStartSteps$material3_release", "startSteps", "getEndSteps$material3_release", "endSteps", "material3_release"}, m5111k = 1, m5112mv = {1, 8, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nSlider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Slider.kt\nandroidx/compose/material3/RangeSliderState\n+ 2 SnapshotFloatState.kt\nandroidx/compose/runtime/PrimitiveSnapshotStateKt__SnapshotFloatStateKt\n+ 3 SnapshotIntState.kt\nandroidx/compose/runtime/SnapshotIntStateKt__SnapshotIntStateKt\n+ 4 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,2263:1\n76#2:2264\n109#2,2:2265\n76#2:2267\n109#2,2:2268\n76#2:2270\n109#2,2:2271\n76#2:2273\n109#2,2:2274\n76#2:2276\n109#2,2:2277\n76#2:2282\n109#2,2:2283\n76#2:2285\n109#2,2:2286\n76#2:2291\n109#2,2:2292\n76#2:2294\n109#2,2:2295\n75#3:2279\n108#3,2:2280\n81#4:2288\n107#4,2:2289\n1#5:2297\n*S KotlinDebug\n*F\n+ 1 Slider.kt\nandroidx/compose/material3/RangeSliderState\n*L\n2069#1:2264\n2069#1:2265,2\n2070#1:2267\n2070#1:2268,2\n2106#1:2270\n2106#1:2271,2\n2107#1:2273\n2107#1:2274,2\n2108#1:2276\n2108#1:2277,2\n2110#1:2282\n2110#1:2283,2\n2111#1:2285\n2111#1:2286,2\n2117#1:2291\n2117#1:2292,2\n2118#1:2294\n2118#1:2295,2\n2109#1:2279\n2109#1:2280,2\n2113#1:2288\n2113#1:2289,2\n*E\n"})
/* loaded from: classes.dex */
public final class RangeSliderState {
    public static final int $stable = 8;

    /* renamed from: activeRangeEndState$delegate, reason: from kotlin metadata */
    @NotNull
    private final MutableFloatState activeRangeEndState;

    /* renamed from: activeRangeStartState$delegate, reason: from kotlin metadata */
    @NotNull
    private final MutableFloatState activeRangeStartState;

    /* renamed from: endThumbWidth$delegate, reason: from kotlin metadata */
    @NotNull
    private final MutableFloatState endThumbWidth;

    @NotNull
    private final InterfaceC6471c gestureEndAction;

    /* renamed from: isRtl$delegate, reason: from kotlin metadata */
    @NotNull
    private final MutableState isRtl;

    /* renamed from: maxPx$delegate, reason: from kotlin metadata */
    @NotNull
    private final MutableFloatState maxPx;

    /* renamed from: minPx$delegate, reason: from kotlin metadata */
    @NotNull
    private final MutableFloatState minPx;

    @Nullable
    private InterfaceC6471c onValueChange;

    @Nullable
    private InterfaceC6469a onValueChangeFinished;

    /* renamed from: rawOffsetEnd$delegate, reason: from kotlin metadata */
    @NotNull
    private final MutableFloatState rawOffsetEnd;

    /* renamed from: rawOffsetStart$delegate, reason: from kotlin metadata */
    @NotNull
    private final MutableFloatState rawOffsetStart;

    /* renamed from: startThumbWidth$delegate, reason: from kotlin metadata */
    @NotNull
    private final MutableFloatState startThumbWidth;
    private final int steps;

    @NotNull
    private final float[] tickFractions;

    /* renamed from: totalWidth$delegate, reason: from kotlin metadata */
    @NotNull
    private final MutableIntState totalWidth;

    /* renamed from: trackHeight$delegate, reason: from kotlin metadata */
    @NotNull
    private final MutableFloatState trackHeight;

    @NotNull
    private final InterfaceC6752b valueRange;

    public RangeSliderState() {
        this(0.0f, 0.0f, 0, null, null, 31, null);
    }

    private final float getActiveRangeEndState() {
        return this.activeRangeEndState.getFloatValue();
    }

    private final float getActiveRangeStartState() {
        return this.activeRangeStartState.getFloatValue();
    }

    private final float getMaxPx() {
        return this.maxPx.getFloatValue();
    }

    private final float getMinPx() {
        return this.minPx.getFloatValue();
    }

    private final float scaleToOffset(float minPx, float maxPx, float userValue) {
        return SliderKt.scale(Float.valueOf(((C6751a) this.valueRange).f11418a).floatValue(), Float.valueOf(((C6751a) this.valueRange).f11419b).floatValue(), userValue, minPx, maxPx);
    }

    /* renamed from: scaleToUserValue-owVgs5E, reason: not valid java name */
    private final long m8801scaleToUserValueowVgs5E(float minPx, float maxPx, long offset) {
        return SliderKt.m8914scaleziovWd0(minPx, maxPx, offset, Float.valueOf(((C6751a) this.valueRange).f11418a).floatValue(), Float.valueOf(((C6751a) this.valueRange).f11419b).floatValue());
    }

    private final void setActiveRangeEndState(float f) {
        this.activeRangeEndState.setFloatValue(f);
    }

    private final void setActiveRangeStartState(float f) {
        this.activeRangeStartState.setFloatValue(f);
    }

    private final void setMaxPx(float f) {
        this.maxPx.setFloatValue(f);
    }

    private final void setMinPx(float f) {
        this.minPx.setFloatValue(f);
    }

    public final float getActiveRangeEnd() {
        return getActiveRangeEndState();
    }

    public final float getActiveRangeStart() {
        return getActiveRangeStartState();
    }

    public final float getCoercedActiveRangeEndAsFraction$material3_release() {
        return SliderKt.calcFraction(Float.valueOf(((C6751a) this.valueRange).f11418a).floatValue(), Float.valueOf(((C6751a) this.valueRange).f11419b).floatValue(), getActiveRangeEnd());
    }

    public final float getCoercedActiveRangeStartAsFraction$material3_release() {
        return SliderKt.calcFraction(Float.valueOf(((C6751a) this.valueRange).f11418a).floatValue(), Float.valueOf(((C6751a) this.valueRange).f11419b).floatValue(), getActiveRangeStart());
    }

    public final int getEndSteps$material3_release() {
        return (int) Math.floor((1.0f - getCoercedActiveRangeStartAsFraction$material3_release()) * this.steps);
    }

    public final float getEndThumbWidth$material3_release() {
        return this.endThumbWidth.getFloatValue();
    }

    @NotNull
    /* renamed from: getGestureEndAction$material3_release, reason: from getter */
    public final InterfaceC6471c getGestureEndAction() {
        return this.gestureEndAction;
    }

    @Nullable
    /* renamed from: getOnValueChange$material3_release, reason: from getter */
    public final InterfaceC6471c getOnValueChange() {
        return this.onValueChange;
    }

    @Nullable
    public final InterfaceC6469a getOnValueChangeFinished() {
        return this.onValueChangeFinished;
    }

    public final float getRawOffsetEnd$material3_release() {
        return this.rawOffsetEnd.getFloatValue();
    }

    public final float getRawOffsetStart$material3_release() {
        return this.rawOffsetStart.getFloatValue();
    }

    public final int getStartSteps$material3_release() {
        return (int) Math.floor(getCoercedActiveRangeEndAsFraction$material3_release() * this.steps);
    }

    public final float getStartThumbWidth$material3_release() {
        return this.startThumbWidth.getFloatValue();
    }

    public final int getSteps() {
        return this.steps;
    }

    @NotNull
    /* renamed from: getTickFractions$material3_release, reason: from getter */
    public final float[] getTickFractions() {
        return this.tickFractions;
    }

    public final int getTotalWidth$material3_release() {
        return this.totalWidth.getIntValue();
    }

    public final float getTrackHeight$material3_release() {
        return this.trackHeight.getFloatValue();
    }

    @NotNull
    public final InterfaceC6752b getValueRange() {
        return this.valueRange;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean isRtl$material3_release() {
        return ((Boolean) this.isRtl.getValue()).booleanValue();
    }

    public final void onDrag$material3_release(boolean isStart, float offset) {
        long jSliderRange;
        if (isStart) {
            setRawOffsetStart$material3_release(getRawOffsetStart$material3_release() + offset);
            setRawOffsetEnd$material3_release(scaleToOffset(getMinPx(), getMaxPx(), getActiveRangeEnd()));
            float rawOffsetEnd$material3_release = getRawOffsetEnd$material3_release();
            jSliderRange = SliderKt.SliderRange(SliderKt.snapValueToTick(AbstractC5806u.m5273l(getRawOffsetStart$material3_release(), getMinPx(), rawOffsetEnd$material3_release), this.tickFractions, getMinPx(), getMaxPx()), rawOffsetEnd$material3_release);
        } else {
            setRawOffsetEnd$material3_release(getRawOffsetEnd$material3_release() + offset);
            setRawOffsetStart$material3_release(scaleToOffset(getMinPx(), getMaxPx(), getActiveRangeStart()));
            float rawOffsetStart$material3_release = getRawOffsetStart$material3_release();
            jSliderRange = SliderKt.SliderRange(rawOffsetStart$material3_release, SliderKt.snapValueToTick(AbstractC5806u.m5273l(getRawOffsetEnd$material3_release(), rawOffsetStart$material3_release, getMaxPx()), this.tickFractions, getMinPx(), getMaxPx()));
        }
        long jM8801scaleToUserValueowVgs5E = m8801scaleToUserValueowVgs5E(getMinPx(), getMaxPx(), jSliderRange);
        if (SliderRange.m8924equalsimpl0(jM8801scaleToUserValueowVgs5E, SliderKt.SliderRange(getActiveRangeStart(), getActiveRangeEnd()))) {
            return;
        }
        InterfaceC6471c interfaceC6471c = this.onValueChange;
        if (interfaceC6471c == null) {
            setActiveRangeStart(SliderRange.m8926getStartimpl(jM8801scaleToUserValueowVgs5E));
            setActiveRangeEnd(SliderRange.m8925getEndInclusiveimpl(jM8801scaleToUserValueowVgs5E));
        } else if (interfaceC6471c != null) {
            interfaceC6471c.invoke(SliderRange.m8921boximpl(jM8801scaleToUserValueowVgs5E));
        }
    }

    public final void setActiveRangeEnd(float f) {
        setActiveRangeEndState(SliderKt.snapValueToTick(AbstractC5806u.m5273l(f, getActiveRangeStart(), Float.valueOf(((C6751a) this.valueRange).f11419b).floatValue()), this.tickFractions, Float.valueOf(((C6751a) this.valueRange).f11418a).floatValue(), Float.valueOf(((C6751a) this.valueRange).f11419b).floatValue()));
    }

    public final void setActiveRangeStart(float f) {
        setActiveRangeStartState(SliderKt.snapValueToTick(AbstractC5806u.m5273l(f, Float.valueOf(((C6751a) this.valueRange).f11418a).floatValue(), getActiveRangeEnd()), this.tickFractions, Float.valueOf(((C6751a) this.valueRange).f11418a).floatValue(), Float.valueOf(((C6751a) this.valueRange).f11419b).floatValue()));
    }

    public final void setEndThumbWidth$material3_release(float f) {
        this.endThumbWidth.setFloatValue(f);
    }

    public final void setOnValueChange$material3_release(@Nullable InterfaceC6471c interfaceC6471c) {
        this.onValueChange = interfaceC6471c;
    }

    public final void setOnValueChangeFinished(@Nullable InterfaceC6469a interfaceC6469a) {
        this.onValueChangeFinished = interfaceC6469a;
    }

    public final void setRawOffsetEnd$material3_release(float f) {
        this.rawOffsetEnd.setFloatValue(f);
    }

    public final void setRawOffsetStart$material3_release(float f) {
        this.rawOffsetStart.setFloatValue(f);
    }

    public final void setRtl$material3_release(boolean z8) {
        this.isRtl.setValue(Boolean.valueOf(z8));
    }

    public final void setStartThumbWidth$material3_release(float f) {
        this.startThumbWidth.setFloatValue(f);
    }

    public final void setTotalWidth$material3_release(int i) {
        this.totalWidth.setIntValue(i);
    }

    public final void setTrackHeight$material3_release(float f) {
        this.trackHeight.setFloatValue(f);
    }

    public final void updateMinMaxPx$material3_release() {
        float f = 2;
        float fMax = Math.max(getTotalWidth$material3_release() - (getEndThumbWidth$material3_release() / f), 0.0f);
        float fMin = Math.min(getStartThumbWidth$material3_release() / f, fMax);
        if (getMinPx() == fMin && getMaxPx() == fMax) {
            return;
        }
        setMinPx(fMin);
        setMaxPx(fMax);
        setRawOffsetStart$material3_release(scaleToOffset(getMinPx(), getMaxPx(), getActiveRangeStart()));
        setRawOffsetEnd$material3_release(scaleToOffset(getMinPx(), getMaxPx(), getActiveRangeEnd()));
    }

    public RangeSliderState(float f, float f7, int i, InterfaceC6469a interfaceC6469a, InterfaceC6752b interfaceC6752b, int i8, AbstractC5824e abstractC5824e) {
        this((i8 & 1) != 0 ? 0.0f : f, (i8 & 2) != 0 ? 1.0f : f7, (i8 & 4) != 0 ? 0 : i, (i8 & 8) != 0 ? null : interfaceC6469a, (i8 & 16) != 0 ? new C6751a(0.0f, 1.0f) : interfaceC6752b);
    }

    public RangeSliderState(float f, float f7, @IntRange(from = FabTransformationScrimBehavior.COLLAPSE_DELAY) int i, @Nullable InterfaceC6469a interfaceC6469a, @NotNull InterfaceC6752b interfaceC6752b) {
        this.steps = i;
        this.onValueChangeFinished = interfaceC6469a;
        this.valueRange = interfaceC6752b;
        this.activeRangeStartState = PrimitiveSnapshotStateKt.mutableFloatStateOf(f);
        this.activeRangeEndState = PrimitiveSnapshotStateKt.mutableFloatStateOf(f7);
        this.tickFractions = SliderKt.stepsToTickFractions(i);
        this.trackHeight = PrimitiveSnapshotStateKt.mutableFloatStateOf(0.0f);
        this.startThumbWidth = PrimitiveSnapshotStateKt.mutableFloatStateOf(0.0f);
        this.endThumbWidth = PrimitiveSnapshotStateKt.mutableFloatStateOf(0.0f);
        this.totalWidth = SnapshotIntStateKt.mutableIntStateOf(0);
        this.rawOffsetStart = PrimitiveSnapshotStateKt.mutableFloatStateOf(0.0f);
        this.rawOffsetEnd = PrimitiveSnapshotStateKt.mutableFloatStateOf(0.0f);
        this.isRtl = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
        this.gestureEndAction = new InterfaceC6471c() { // from class: androidx.compose.material3.RangeSliderState$gestureEndAction$1
            {
                super(1);
            }

            @Override // p152r6.InterfaceC6471c
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke(((Boolean) obj).booleanValue());
                return C5443s.f8405a;
            }

            public final void invoke(boolean z8) {
                InterfaceC6469a onValueChangeFinished = this.this$0.getOnValueChangeFinished();
                if (onValueChangeFinished != null) {
                    onValueChangeFinished.invoke();
                }
            }
        };
        this.maxPx = PrimitiveSnapshotStateKt.mutableFloatStateOf(0.0f);
        this.minPx = PrimitiveSnapshotStateKt.mutableFloatStateOf(0.0f);
    }
}
