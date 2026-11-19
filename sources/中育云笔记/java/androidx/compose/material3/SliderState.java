package androidx.compose.material3;

import androidx.annotation.IntRange;
import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.MutatorMutex;
import androidx.compose.foundation.gestures.DragScope;
import androidx.compose.foundation.gestures.DraggableState;
import androidx.compose.p014ui.geometry.Offset;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.PrimitiveSnapshotStateKt;
import androidx.compose.runtime.SnapshotIntStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.AbstractC9924b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC9972n;
import kotlinx.coroutines.AbstractC10006d;
import p181hd.InterfaceC9529a;
import p181hd.InterfaceC9540l;
import p181hd.InterfaceC9544p;
import p265nd.AbstractC10409n;
import p265nd.AbstractC10410o;
import p265nd.InterfaceC10401f;
import p309qc.C10786q;
import p393wc.AbstractC11725a;
import p409xc.InterfaceC11829d;
import sd.InterfaceC11122i0;
import vc.InterfaceC11588c;

@StabilityInferred(parameters = 0)
@ExperimentalMaterial3Api
/* loaded from: classes2.dex */
public final class SliderState implements DraggableState {
    public static final int $stable = 8;
    private final DragScope dragScope;
    private final InterfaceC9529a gestureEndAction;
    private final MutableState isDragging$delegate;
    private boolean isRtl;
    private InterfaceC9540l onValueChange;
    private InterfaceC9529a onValueChangeFinished;
    private final MutableFloatState pressOffset$delegate;
    private final MutableFloatState rawOffset$delegate;
    private final MutatorMutex scrollMutex;
    private final int steps;
    private final MutableFloatState thumbWidth$delegate;
    private final float[] tickFractions;
    private final MutableIntState totalWidth$delegate;
    private final MutableFloatState trackHeight$delegate;
    private final InterfaceC10401f valueRange;
    private final MutableFloatState valueState$delegate;

    @InterfaceC11829d(m26210c = "androidx.compose.material3.SliderState$drag$2", m26211f = "Slider.kt", m26212l = {1972}, m26213m = "invokeSuspend")
    /* renamed from: androidx.compose.material3.SliderState$drag$2 */
    public static final class C23632 extends SuspendLambda implements InterfaceC9544p {
        final /* synthetic */ InterfaceC9544p $block;
        final /* synthetic */ MutatePriority $dragPriority;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23632(MutatePriority mutatePriority, InterfaceC9544p interfaceC9544p, InterfaceC11588c<? super C23632> interfaceC11588c) {
            super(2, interfaceC11588c);
            this.$dragPriority = mutatePriority;
            this.$block = interfaceC9544p;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC11588c<C10786q> create(Object obj, InterfaceC11588c<?> interfaceC11588c) {
            return SliderState.this.new C23632(this.$dragPriority, this.$block, interfaceC11588c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM25952f = AbstractC11725a.m25952f();
            int i10 = this.label;
            if (i10 == 0) {
                AbstractC9924b.m20071b(obj);
                SliderState.this.setDragging(true);
                MutatorMutex mutatorMutex = SliderState.this.scrollMutex;
                DragScope dragScope = SliderState.this.dragScope;
                MutatePriority mutatePriority = this.$dragPriority;
                InterfaceC9544p interfaceC9544p = this.$block;
                this.label = 1;
                if (mutatorMutex.mutateWith(dragScope, mutatePriority, interfaceC9544p, this) == objM25952f) {
                    return objM25952f;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9924b.m20071b(obj);
            }
            SliderState.this.setDragging(false);
            return C10786q.f26013a;
        }

        @Override // p181hd.InterfaceC9544p
        public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c<? super C10786q> interfaceC11588c) {
            return ((C23632) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
        }
    }

    public SliderState() {
        this(0.0f, 0, null, null, 15, null);
    }

    private final float getPressOffset() {
        return this.pressOffset$delegate.getFloatValue();
    }

    private final float getRawOffset() {
        return this.rawOffset$delegate.getFloatValue();
    }

    private final int getTotalWidth() {
        return this.totalWidth$delegate.getIntValue();
    }

    private final float getValueState() {
        return this.valueState$delegate.getFloatValue();
    }

    private final float scaleToOffset(float f10, float f11, float f12) {
        return SliderKt.scale(((Number) this.valueRange.getStart()).floatValue(), ((Number) this.valueRange.getEndInclusive()).floatValue(), f12, f10, f11);
    }

    private final float scaleToUserValue(float f10, float f11, float f12) {
        return SliderKt.scale(f10, f11, f12, ((Number) this.valueRange.getStart()).floatValue(), ((Number) this.valueRange.getEndInclusive()).floatValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setDragging(boolean z10) {
        this.isDragging$delegate.setValue(Boolean.valueOf(z10));
    }

    private final void setPressOffset(float f10) {
        this.pressOffset$delegate.setFloatValue(f10);
    }

    private final void setRawOffset(float f10) {
        this.rawOffset$delegate.setFloatValue(f10);
    }

    private final void setTotalWidth(int i10) {
        this.totalWidth$delegate.setIntValue(i10);
    }

    private final void setValueState(float f10) {
        this.valueState$delegate.setFloatValue(f10);
    }

    @Override // androidx.compose.foundation.gestures.DraggableState
    public void dispatchRawDelta(float f10) {
        float f11 = 2;
        float fMax = Math.max(getTotalWidth() - (getThumbWidth$material3_release() / f11), 0.0f);
        float fMin = Math.min(getThumbWidth$material3_release() / f11, fMax);
        setRawOffset(getRawOffset() + f10 + getPressOffset());
        setPressOffset(0.0f);
        float fScaleToUserValue = scaleToUserValue(fMin, fMax, SliderKt.snapValueToTick(getRawOffset(), this.tickFractions, fMin, fMax));
        if (fScaleToUserValue == getValue()) {
            return;
        }
        InterfaceC9540l interfaceC9540l = this.onValueChange;
        if (interfaceC9540l == null) {
            setValue(fScaleToUserValue);
        } else if (interfaceC9540l != null) {
            interfaceC9540l.invoke(Float.valueOf(fScaleToUserValue));
        }
    }

    @Override // androidx.compose.foundation.gestures.DraggableState
    public Object drag(MutatePriority mutatePriority, InterfaceC9544p interfaceC9544p, InterfaceC11588c<? super C10786q> interfaceC11588c) {
        Object objM20748e = AbstractC10006d.m20748e(new C23632(mutatePriority, interfaceC9544p, null), interfaceC11588c);
        return objM20748e == AbstractC11725a.m25952f() ? objM20748e : C10786q.f26013a;
    }

    public final float getCoercedValueAsFraction$material3_release() {
        return SliderKt.calcFraction(((Number) this.valueRange.getStart()).floatValue(), ((Number) this.valueRange.getEndInclusive()).floatValue(), AbstractC10410o.m21760m(getValue(), ((Number) this.valueRange.getStart()).floatValue(), ((Number) this.valueRange.getEndInclusive()).floatValue()));
    }

    public final InterfaceC9529a getGestureEndAction$material3_release() {
        return this.gestureEndAction;
    }

    public final InterfaceC9540l getOnValueChange$material3_release() {
        return this.onValueChange;
    }

    public final InterfaceC9529a getOnValueChangeFinished() {
        return this.onValueChangeFinished;
    }

    public final int getSteps() {
        return this.steps;
    }

    public final float getThumbWidth$material3_release() {
        return this.thumbWidth$delegate.getFloatValue();
    }

    public final float[] getTickFractions$material3_release() {
        return this.tickFractions;
    }

    public final float getTrackHeight$material3_release() {
        return this.trackHeight$delegate.getFloatValue();
    }

    public final float getValue() {
        return getValueState();
    }

    public final InterfaceC10401f getValueRange() {
        return this.valueRange;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean isDragging$material3_release() {
        return ((Boolean) this.isDragging$delegate.getValue()).booleanValue();
    }

    public final boolean isRtl$material3_release() {
        return this.isRtl;
    }

    /* renamed from: onPress-k-4lQ0M$material3_release, reason: not valid java name */
    public final void m29128onPressk4lQ0M$material3_release(long j10) {
        setPressOffset((this.isRtl ? getTotalWidth() - Offset.m30637getXimpl(j10) : Offset.m30637getXimpl(j10)) - getRawOffset());
    }

    public final void setOnValueChange$material3_release(InterfaceC9540l interfaceC9540l) {
        this.onValueChange = interfaceC9540l;
    }

    public final void setOnValueChangeFinished(InterfaceC9529a interfaceC9529a) {
        this.onValueChangeFinished = interfaceC9529a;
    }

    public final void setRtl$material3_release(boolean z10) {
        this.isRtl = z10;
    }

    public final void setThumbWidth$material3_release(float f10) {
        this.thumbWidth$delegate.setFloatValue(f10);
    }

    public final void setTrackHeight$material3_release(float f10) {
        this.trackHeight$delegate.setFloatValue(f10);
    }

    public final void setValue(float f10) {
        setValueState(SliderKt.snapValueToTick(AbstractC10410o.m21760m(f10, ((Number) this.valueRange.getStart()).floatValue(), ((Number) this.valueRange.getEndInclusive()).floatValue()), this.tickFractions, ((Number) this.valueRange.getStart()).floatValue(), ((Number) this.valueRange.getEndInclusive()).floatValue()));
    }

    public final void updateDimensions$material3_release(float f10, int i10) {
        setTrackHeight$material3_release(f10);
        setTotalWidth(i10);
    }

    public SliderState(float f10, @IntRange(from = 0) int i10, InterfaceC9529a interfaceC9529a, InterfaceC10401f interfaceC10401f) {
        this.steps = i10;
        this.onValueChangeFinished = interfaceC9529a;
        this.valueRange = interfaceC10401f;
        this.valueState$delegate = PrimitiveSnapshotStateKt.mutableFloatStateOf(f10);
        this.tickFractions = SliderKt.stepsToTickFractions(i10);
        this.totalWidth$delegate = SnapshotIntStateKt.mutableIntStateOf(0);
        this.trackHeight$delegate = PrimitiveSnapshotStateKt.mutableFloatStateOf(0.0f);
        this.thumbWidth$delegate = PrimitiveSnapshotStateKt.mutableFloatStateOf(0.0f);
        this.isDragging$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
        this.gestureEndAction = new InterfaceC9529a() { // from class: androidx.compose.material3.SliderState$gestureEndAction$1
            {
                super(0);
            }

            @Override // p181hd.InterfaceC9529a
            public /* bridge */ /* synthetic */ Object invoke() {
                m29129invoke();
                return C10786q.f26013a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m29129invoke() {
                InterfaceC9529a onValueChangeFinished;
                if (this.this$0.isDragging$material3_release() || (onValueChangeFinished = this.this$0.getOnValueChangeFinished()) == null) {
                    return;
                }
                onValueChangeFinished.invoke();
            }
        };
        this.rawOffset$delegate = PrimitiveSnapshotStateKt.mutableFloatStateOf(scaleToOffset(0.0f, 0.0f, f10));
        this.pressOffset$delegate = PrimitiveSnapshotStateKt.mutableFloatStateOf(0.0f);
        this.dragScope = new DragScope() { // from class: androidx.compose.material3.SliderState$dragScope$1
            @Override // androidx.compose.foundation.gestures.DragScope
            public void dragBy(float f11) {
                this.this$0.dispatchRawDelta(f11);
            }
        };
        this.scrollMutex = new MutatorMutex();
    }

    public /* synthetic */ SliderState(float f10, int i10, InterfaceC9529a interfaceC9529a, InterfaceC10401f interfaceC10401f, int i11, AbstractC9972n abstractC9972n) {
        this((i11 & 1) != 0 ? 0.0f : f10, (i11 & 2) != 0 ? 0 : i10, (i11 & 4) != 0 ? null : interfaceC9529a, (i11 & 8) != 0 ? AbstractC10409n.m21749b(0.0f, 1.0f) : interfaceC10401f);
    }
}
