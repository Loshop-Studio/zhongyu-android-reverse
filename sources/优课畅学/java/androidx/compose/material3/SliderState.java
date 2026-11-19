package androidx.compose.material3;

import androidx.annotation.IntRange;
import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.MutatorMutex;
import androidx.compose.foundation.gestures.DragScope;
import androidx.compose.foundation.gestures.DraggableState;
import androidx.compose.p013ui.geometry.Offset;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.PrimitiveSnapshotStateKt;
import androidx.compose.runtime.SnapshotIntStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.AbstractC9079b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC9126n;
import kotlinx.coroutines.AbstractC9165e;
import p077d8.AbstractC8322g;
import p077d8.AbstractC8323h;
import p077d8.InterfaceC8317b;
import p123h7.C8736p;
import p135i8.InterfaceC8822b0;
import p179m7.InterfaceC9324c;
import p190n7.AbstractC9434a;
import p201o7.InterfaceC9539d;
import p300x7.InterfaceC10559a;
import p300x7.InterfaceC10570l;
import p300x7.InterfaceC10574p;

@StabilityInferred(parameters = 0)
@ExperimentalMaterial3Api
/* loaded from: classes2.dex */
public final class SliderState implements DraggableState {
    public static final int $stable = 8;
    private final DragScope dragScope;
    private final InterfaceC10559a gestureEndAction;
    private final MutableState isDragging$delegate;
    private boolean isRtl;
    private InterfaceC10570l onValueChange;
    private InterfaceC10559a onValueChangeFinished;
    private final MutableFloatState pressOffset$delegate;
    private final MutableFloatState rawOffset$delegate;
    private final MutatorMutex scrollMutex;
    private final int steps;
    private final MutableFloatState thumbWidth$delegate;
    private final float[] tickFractions;
    private final MutableIntState totalWidth$delegate;
    private final MutableFloatState trackHeight$delegate;
    private final InterfaceC8317b valueRange;
    private final MutableFloatState valueState$delegate;

    @InterfaceC9539d(m17800c = "androidx.compose.material3.SliderState$drag$2", m17801f = "Slider.kt", m17802l = {1972}, m17803m = "invokeSuspend")
    /* renamed from: androidx.compose.material3.SliderState$drag$2 */
    public static final class C23332 extends SuspendLambda implements InterfaceC10574p {
        final /* synthetic */ InterfaceC10574p $block;
        final /* synthetic */ MutatePriority $dragPriority;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23332(MutatePriority mutatePriority, InterfaceC10574p interfaceC10574p, InterfaceC9324c<? super C23332> interfaceC9324c) {
            super(2, interfaceC9324c);
            this.$dragPriority = mutatePriority;
            this.$block = interfaceC10574p;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC9324c<C8736p> create(Object obj, InterfaceC9324c<?> interfaceC9324c) {
            return SliderState.this.new C23332(this.$dragPriority, this.$block, interfaceC9324c);
        }

        @Override // p300x7.InterfaceC10574p
        public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c<? super C8736p> interfaceC9324c) {
            return ((C23332) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM17291f = AbstractC9434a.m17291f();
            int i10 = this.label;
            if (i10 == 0) {
                AbstractC9079b.m15926b(obj);
                SliderState.this.setDragging(true);
                MutatorMutex mutatorMutex = SliderState.this.scrollMutex;
                DragScope dragScope = SliderState.this.dragScope;
                MutatePriority mutatePriority = this.$dragPriority;
                InterfaceC10574p interfaceC10574p = this.$block;
                this.label = 1;
                if (mutatorMutex.mutateWith(dragScope, mutatePriority, interfaceC10574p, this) == objM17291f) {
                    return objM17291f;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9079b.m15926b(obj);
            }
            SliderState.this.setDragging(false);
            return C8736p.f16368a;
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
        InterfaceC10570l interfaceC10570l = this.onValueChange;
        if (interfaceC10570l == null) {
            setValue(fScaleToUserValue);
        } else if (interfaceC10570l != null) {
            interfaceC10570l.invoke(Float.valueOf(fScaleToUserValue));
        }
    }

    @Override // androidx.compose.foundation.gestures.DraggableState
    public Object drag(MutatePriority mutatePriority, InterfaceC10574p interfaceC10574p, InterfaceC9324c<? super C8736p> interfaceC9324c) {
        Object objM16556e = AbstractC9165e.m16556e(new C23332(mutatePriority, interfaceC10574p, null), interfaceC9324c);
        return objM16556e == AbstractC9434a.m17291f() ? objM16556e : C8736p.f16368a;
    }

    public final float getCoercedValueAsFraction$material3_release() {
        return SliderKt.calcFraction(((Number) this.valueRange.getStart()).floatValue(), ((Number) this.valueRange.getEndInclusive()).floatValue(), AbstractC8323h.m13517l(getValue(), ((Number) this.valueRange.getStart()).floatValue(), ((Number) this.valueRange.getEndInclusive()).floatValue()));
    }

    public final InterfaceC10559a getGestureEndAction$material3_release() {
        return this.gestureEndAction;
    }

    public final InterfaceC10570l getOnValueChange$material3_release() {
        return this.onValueChange;
    }

    public final InterfaceC10559a getOnValueChangeFinished() {
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

    public final InterfaceC8317b getValueRange() {
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
    public final void m22526onPressk4lQ0M$material3_release(long j10) {
        setPressOffset((this.isRtl ? getTotalWidth() - Offset.m24035getXimpl(j10) : Offset.m24035getXimpl(j10)) - getRawOffset());
    }

    public final void setOnValueChange$material3_release(InterfaceC10570l interfaceC10570l) {
        this.onValueChange = interfaceC10570l;
    }

    public final void setOnValueChangeFinished(InterfaceC10559a interfaceC10559a) {
        this.onValueChangeFinished = interfaceC10559a;
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
        setValueState(SliderKt.snapValueToTick(AbstractC8323h.m13517l(f10, ((Number) this.valueRange.getStart()).floatValue(), ((Number) this.valueRange.getEndInclusive()).floatValue()), this.tickFractions, ((Number) this.valueRange.getStart()).floatValue(), ((Number) this.valueRange.getEndInclusive()).floatValue()));
    }

    public final void updateDimensions$material3_release(float f10, int i10) {
        setTrackHeight$material3_release(f10);
        setTotalWidth(i10);
    }

    public SliderState(float f10, @IntRange(from = 0) int i10, InterfaceC10559a interfaceC10559a, InterfaceC8317b interfaceC8317b) {
        this.steps = i10;
        this.onValueChangeFinished = interfaceC10559a;
        this.valueRange = interfaceC8317b;
        this.valueState$delegate = PrimitiveSnapshotStateKt.mutableFloatStateOf(f10);
        this.tickFractions = SliderKt.stepsToTickFractions(i10);
        this.totalWidth$delegate = SnapshotIntStateKt.mutableIntStateOf(0);
        this.trackHeight$delegate = PrimitiveSnapshotStateKt.mutableFloatStateOf(0.0f);
        this.thumbWidth$delegate = PrimitiveSnapshotStateKt.mutableFloatStateOf(0.0f);
        this.isDragging$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
        this.gestureEndAction = new InterfaceC10559a() { // from class: androidx.compose.material3.SliderState$gestureEndAction$1
            {
                super(0);
            }

            @Override // p300x7.InterfaceC10559a
            public /* bridge */ /* synthetic */ Object invoke() {
                m22527invoke();
                return C8736p.f16368a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m22527invoke() {
                InterfaceC10559a onValueChangeFinished;
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

    public /* synthetic */ SliderState(float f10, int i10, InterfaceC10559a interfaceC10559a, InterfaceC8317b interfaceC8317b, int i11, AbstractC9126n abstractC9126n) {
        this((i11 & 1) != 0 ? 0.0f : f10, (i11 & 2) != 0 ? 0 : i10, (i11 & 4) != 0 ? null : interfaceC10559a, (i11 & 8) != 0 ? AbstractC8322g.m13507b(0.0f, 1.0f) : interfaceC8317b);
    }
}
