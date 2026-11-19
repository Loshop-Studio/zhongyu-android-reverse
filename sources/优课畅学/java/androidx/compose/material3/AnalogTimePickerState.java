package androidx.compose.material3;

import androidx.camera.video.AudioStats;
import androidx.collection.IntList;
import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.animation.core.AnimationResult;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.animation.core.SpringSpec;
import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.MutatorMutex;
import androidx.compose.material3.TimePickerSelectionMode;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.snapshots.Snapshot;
import kotlin.AbstractC9079b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p123h7.C8736p;
import p179m7.InterfaceC9324c;
import p190n7.AbstractC9434a;
import p201o7.AbstractC9536a;
import p201o7.InterfaceC9539d;
import p300x7.InterfaceC10570l;

@StabilityInferred(parameters = 0)
/* loaded from: classes2.dex */
public final class AnalogTimePickerState implements TimePickerState {
    public static final int $stable = 8;
    private Animatable<Float, AnimationVector1D> anim;
    private float hourAngle;
    private float minuteAngle;
    private final MutatorMutex mutex = new MutatorMutex();
    private final TimePickerState state;

    @InterfaceC9539d(m17800c = "androidx.compose.material3.AnalogTimePickerState$animateToCurrent$2", m17801f = "TimePicker.kt", m17802l = {738}, m17803m = "invokeSuspend")
    /* renamed from: androidx.compose.material3.AnalogTimePickerState$animateToCurrent$2 */
    public static final class C20052 extends SuspendLambda implements InterfaceC10570l {
        final /* synthetic */ float $end;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C20052(float f10, InterfaceC9324c<? super C20052> interfaceC9324c) {
            super(1, interfaceC9324c);
            this.$end = f10;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC9324c<C8736p> create(InterfaceC9324c<?> interfaceC9324c) {
            return AnalogTimePickerState.this.new C20052(this.$end, interfaceC9324c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM17291f = AbstractC9434a.m17291f();
            int i10 = this.label;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9079b.m15926b(obj);
                return obj;
            }
            AbstractC9079b.m15926b(obj);
            Animatable animatable = AnalogTimePickerState.this.anim;
            Float fM17797b = AbstractC9536a.m17797b(this.$end);
            SpringSpec springSpecSpring$default = AnimationSpecKt.spring$default(1.0f, 700.0f, null, 4, null);
            this.label = 1;
            Object objAnimateTo$default = Animatable.animateTo$default(animatable, fM17797b, springSpecSpring$default, null, null, this, 12, null);
            return objAnimateTo$default == objM17291f ? objM17291f : objAnimateTo$default;
        }

        @Override // p300x7.InterfaceC10570l
        public final Object invoke(InterfaceC9324c<? super AnimationResult<Float, AnimationVector1D>> interfaceC9324c) {
            return ((C20052) create(interfaceC9324c)).invokeSuspend(C8736p.f16368a);
        }
    }

    @InterfaceC9539d(m17800c = "androidx.compose.material3.AnalogTimePickerState$onGestureEnd$2", m17801f = "TimePicker.kt", m17802l = {789}, m17803m = "invokeSuspend")
    /* renamed from: androidx.compose.material3.AnalogTimePickerState$onGestureEnd$2 */
    public static final class C20062 extends SuspendLambda implements InterfaceC10570l {
        final /* synthetic */ float $end;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C20062(float f10, InterfaceC9324c<? super C20062> interfaceC9324c) {
            super(1, interfaceC9324c);
            this.$end = f10;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC9324c<C8736p> create(InterfaceC9324c<?> interfaceC9324c) {
            return AnalogTimePickerState.this.new C20062(this.$end, interfaceC9324c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM17291f = AbstractC9434a.m17291f();
            int i10 = this.label;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9079b.m15926b(obj);
                return obj;
            }
            AbstractC9079b.m15926b(obj);
            Animatable animatable = AnalogTimePickerState.this.anim;
            Float fM17797b = AbstractC9536a.m17797b(this.$end);
            SpringSpec springSpecSpring$default = AnimationSpecKt.spring$default(0.0f, 0.0f, null, 7, null);
            this.label = 1;
            Object objAnimateTo$default = Animatable.animateTo$default(animatable, fM17797b, springSpecSpring$default, null, null, this, 12, null);
            return objAnimateTo$default == objM17291f ? objM17291f : objAnimateTo$default;
        }

        @Override // p300x7.InterfaceC10570l
        public final Object invoke(InterfaceC9324c<? super AnimationResult<Float, AnimationVector1D>> interfaceC9324c) {
            return ((C20062) create(interfaceC9324c)).invokeSuspend(C8736p.f16368a);
        }
    }

    @InterfaceC9539d(m17800c = "androidx.compose.material3.AnalogTimePickerState$rotateTo$2", m17801f = "TimePicker.kt", m17802l = {803, 806}, m17803m = "invokeSuspend")
    /* renamed from: androidx.compose.material3.AnalogTimePickerState$rotateTo$2 */
    public static final class C20072 extends SuspendLambda implements InterfaceC10570l {
        final /* synthetic */ float $angle;
        final /* synthetic */ boolean $animate;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C20072(float f10, boolean z10, InterfaceC9324c<? super C20072> interfaceC9324c) {
            super(1, interfaceC9324c);
            this.$angle = f10;
            this.$animate = z10;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC9324c<C8736p> create(InterfaceC9324c<?> interfaceC9324c) {
            return AnalogTimePickerState.this.new C20072(this.$angle, this.$animate, interfaceC9324c);
        }

        /* JADX WARN: Code restructure failed: missing block: B:22:0x00a6, code lost:
        
            if (r12.snapTo(r1, r11) == r0) goto L28;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r12) throws java.lang.Throwable {
            /*
                r11 = this;
                java.lang.Object r0 = p190n7.AbstractC9434a.m17291f()
                int r1 = r11.label
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L1f
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                kotlin.AbstractC9079b.m15926b(r12)
                return r12
            L12:
                java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r12.<init>(r0)
                throw r12
            L1a:
                kotlin.AbstractC9079b.m15926b(r12)
                goto La9
            L1f:
                kotlin.AbstractC9079b.m15926b(r12)
                androidx.compose.material3.AnalogTimePickerState r12 = androidx.compose.material3.AnalogTimePickerState.this
                int r12 = r12.mo21736getSelectionyecRtBI()
                androidx.compose.material3.TimePickerSelectionMode$Companion r1 = androidx.compose.material3.TimePickerSelectionMode.Companion
                int r1 = r1.m22760getHouryecRtBI()
                boolean r12 = androidx.compose.material3.TimePickerSelectionMode.m22756equalsimpl0(r12, r1)
                if (r12 == 0) goto L67
                androidx.compose.material3.AnalogTimePickerState r12 = androidx.compose.material3.AnalogTimePickerState.this
                float r1 = r11.$angle
                int r1 = androidx.compose.material3.AnalogTimePickerState.access$toHour(r12, r1)
                r4 = 12
                int r1 = r1 % r4
                float r1 = (float) r1
                r5 = 1057360530(0x3f060a92, float:0.5235988)
                float r1 = r1 * r5
                androidx.compose.material3.AnalogTimePickerState.access$setHourAngle$p(r12, r1)
                androidx.compose.material3.AnalogTimePickerState r12 = androidx.compose.material3.AnalogTimePickerState.this
                androidx.compose.material3.TimePickerState r12 = r12.getState()
                androidx.compose.material3.AnalogTimePickerState r1 = androidx.compose.material3.AnalogTimePickerState.this
                float r5 = androidx.compose.material3.AnalogTimePickerState.access$getHourAngle$p(r1)
                int r1 = androidx.compose.material3.AnalogTimePickerState.access$toHour(r1, r5)
                int r1 = r1 % r4
                androidx.compose.material3.AnalogTimePickerState r5 = androidx.compose.material3.AnalogTimePickerState.this
                boolean r5 = r5.isAfternoon()
                if (r5 == 0) goto L61
                goto L62
            L61:
                r4 = 0
            L62:
                int r1 = r1 + r4
                r12.setHour(r1)
                goto L8a
            L67:
                androidx.compose.material3.AnalogTimePickerState r12 = androidx.compose.material3.AnalogTimePickerState.this
                float r1 = r11.$angle
                int r1 = androidx.compose.material3.AnalogTimePickerState.access$toMinute(r12, r1)
                float r1 = (float) r1
                r4 = 1037465424(0x3dd67750, float:0.10471976)
                float r1 = r1 * r4
                androidx.compose.material3.AnalogTimePickerState.access$setMinuteAngle$p(r12, r1)
                androidx.compose.material3.AnalogTimePickerState r12 = androidx.compose.material3.AnalogTimePickerState.this
                androidx.compose.material3.TimePickerState r12 = r12.getState()
                androidx.compose.material3.AnalogTimePickerState r1 = androidx.compose.material3.AnalogTimePickerState.this
                float r4 = androidx.compose.material3.AnalogTimePickerState.access$getMinuteAngle$p(r1)
                int r1 = androidx.compose.material3.AnalogTimePickerState.access$toMinute(r1, r4)
                r12.setMinute(r1)
            L8a:
                boolean r12 = r11.$animate
                if (r12 != 0) goto Lac
                androidx.compose.material3.AnalogTimePickerState r12 = androidx.compose.material3.AnalogTimePickerState.this
                androidx.compose.animation.core.Animatable r12 = androidx.compose.material3.AnalogTimePickerState.access$getAnim$p(r12)
                androidx.compose.material3.AnalogTimePickerState r1 = androidx.compose.material3.AnalogTimePickerState.this
                float r2 = r11.$angle
                float r1 = androidx.compose.material3.AnalogTimePickerState.access$offsetAngle(r1, r2)
                java.lang.Float r1 = p201o7.AbstractC9536a.m17797b(r1)
                r11.label = r3
                java.lang.Object r12 = r12.snapTo(r1, r11)
                if (r12 != r0) goto La9
                goto Ld9
            La9:
                h7.p r12 = p123h7.C8736p.f16368a
                return r12
            Lac:
                androidx.compose.material3.AnalogTimePickerState r12 = androidx.compose.material3.AnalogTimePickerState.this
                float r1 = r11.$angle
                float r1 = androidx.compose.material3.AnalogTimePickerState.access$offsetAngle(r12, r1)
                float r12 = androidx.compose.material3.AnalogTimePickerState.access$endValueForAnimation(r12, r1)
                androidx.compose.material3.AnalogTimePickerState r1 = androidx.compose.material3.AnalogTimePickerState.this
                androidx.compose.animation.core.Animatable r3 = androidx.compose.material3.AnalogTimePickerState.access$getAnim$p(r1)
                java.lang.Float r4 = p201o7.AbstractC9536a.m17797b(r12)
                r12 = 1143930880(0x442f0000, float:700.0)
                r1 = 4
                r5 = 1065353216(0x3f800000, float:1.0)
                r6 = 0
                androidx.compose.animation.core.SpringSpec r5 = androidx.compose.animation.core.AnimationSpecKt.spring$default(r5, r12, r6, r1, r6)
                r11.label = r2
                r7 = 0
                r9 = 12
                r10 = 0
                r8 = r11
                java.lang.Object r12 = androidx.compose.animation.core.Animatable.animateTo$default(r3, r4, r5, r6, r7, r8, r9, r10)
                if (r12 != r0) goto Lda
            Ld9:
                return r0
            Lda:
                return r12
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.AnalogTimePickerState.C20072.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // p300x7.InterfaceC10570l
        public final Object invoke(InterfaceC9324c<Object> interfaceC9324c) {
            return ((C20072) create(interfaceC9324c)).invokeSuspend(C8736p.f16368a);
        }
    }

    public AnalogTimePickerState(TimePickerState timePickerState) {
        this.state = timePickerState;
        this.hourAngle = ((timePickerState.getHour() % 12) * 0.5235988f) - 1.5707964f;
        this.minuteAngle = (timePickerState.getMinute() * 0.10471976f) - 1.5707964f;
        this.anim = AnimatableKt.Animatable$default(this.hourAngle, 0.0f, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final float endValueForAnimation(float f10) {
        float fFloatValue = this.anim.getValue().floatValue() - f10;
        while (fFloatValue > 3.1415927f) {
            fFloatValue -= 6.2831855f;
        }
        while (fFloatValue <= -3.1415927f) {
            fFloatValue += 6.2831855f;
        }
        return this.anim.getValue().floatValue() - fFloatValue;
    }

    private final boolean isUpdated() {
        int iMo21736getSelectionyecRtBI = mo21736getSelectionyecRtBI();
        TimePickerSelectionMode.Companion companion = TimePickerSelectionMode.Companion;
        if (TimePickerSelectionMode.m22756equalsimpl0(iMo21736getSelectionyecRtBI, companion.m22760getHouryecRtBI()) && normalize(this.anim.getTargetValue().floatValue()) == normalize(this.hourAngle)) {
            return false;
        }
        return (TimePickerSelectionMode.m22756equalsimpl0(mo21736getSelectionyecRtBI(), companion.m22761getMinuteyecRtBI()) && normalize(this.anim.getTargetValue().floatValue()) == normalize(this.minuteAngle)) ? false : true;
    }

    private final float normalize(float f10) {
        double d10 = f10 % 6.283185307179586d;
        if (d10 < AudioStats.AUDIO_AMPLITUDE_NONE) {
            d10 += 6.283185307179586d;
        }
        return (float) d10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final float offsetAngle(float f10) {
        float f11 = f10 + 1.5707964f;
        return f11 < 0.0f ? f11 + 6.2831855f : f11;
    }

    public static /* synthetic */ Object rotateTo$default(AnalogTimePickerState analogTimePickerState, float f10, boolean z10, InterfaceC9324c interfaceC9324c, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return analogTimePickerState.rotateTo(f10, z10, interfaceC9324c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int toHour(float f10) {
        return ((int) ((f10 + (0.2617994f + 1.5707963267948966d)) / 0.5235988f)) % 12;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int toMinute(float f10) {
        return ((int) ((f10 + (0.05235988f + 1.5707963267948966d)) / 0.10471976f)) % 60;
    }

    private final void updateBaseStateMinute() {
        Snapshot.Companion companion = Snapshot.Companion;
        Snapshot currentThreadSnapshot = companion.getCurrentThreadSnapshot();
        InterfaceC10570l readObserver = currentThreadSnapshot != null ? currentThreadSnapshot.getReadObserver() : null;
        Snapshot snapshotMakeCurrentNonObservable = companion.makeCurrentNonObservable(currentThreadSnapshot);
        try {
            this.state.setMinute(getMinute());
            C8736p c8736p = C8736p.f16368a;
        } finally {
            companion.restoreNonObservable(currentThreadSnapshot, snapshotMakeCurrentNonObservable, readObserver);
        }
    }

    public final Object animateToCurrent(InterfaceC9324c<? super C8736p> interfaceC9324c) {
        if (!isUpdated()) {
            return C8736p.f16368a;
        }
        Object objMutate = this.mutex.mutate(MutatePriority.PreventUserInput, new C20052(TimePickerSelectionMode.m22756equalsimpl0(mo21736getSelectionyecRtBI(), TimePickerSelectionMode.Companion.m22760getHouryecRtBI()) ? endValueForAnimation(this.hourAngle) : endValueForAnimation(this.minuteAngle), null), interfaceC9324c);
        return objMutate == AbstractC9434a.m17291f() ? objMutate : C8736p.f16368a;
    }

    public final IntList getClockFaceValues() {
        return TimePickerSelectionMode.m22756equalsimpl0(mo21736getSelectionyecRtBI(), TimePickerSelectionMode.Companion.m22761getMinuteyecRtBI()) ? TimePickerKt.Minutes : TimePickerKt.Hours;
    }

    public final float getCurrentAngle() {
        return this.anim.getValue().floatValue();
    }

    @Override // androidx.compose.material3.TimePickerState
    public int getHour() {
        return this.state.getHour();
    }

    @Override // androidx.compose.material3.TimePickerState
    public int getMinute() {
        return this.state.getMinute();
    }

    @Override // androidx.compose.material3.TimePickerState
    /* renamed from: getSelection-yecRtBI, reason: not valid java name */
    public int mo21736getSelectionyecRtBI() {
        return this.state.mo21736getSelectionyecRtBI();
    }

    public final TimePickerState getState() {
        return this.state;
    }

    @Override // androidx.compose.material3.TimePickerState
    public boolean is24hour() {
        return this.state.is24hour();
    }

    @Override // androidx.compose.material3.TimePickerState
    public boolean isAfternoon() {
        return this.state.isAfternoon();
    }

    public final Object onGestureEnd(InterfaceC9324c<? super C8736p> interfaceC9324c) {
        Object objMutate = this.mutex.mutate(MutatePriority.PreventUserInput, new C20062(endValueForAnimation(TimePickerSelectionMode.m22756equalsimpl0(mo21736getSelectionyecRtBI(), TimePickerSelectionMode.Companion.m22760getHouryecRtBI()) ? this.hourAngle : this.minuteAngle), null), interfaceC9324c);
        return objMutate == AbstractC9434a.m17291f() ? objMutate : C8736p.f16368a;
    }

    public final Object rotateTo(float f10, boolean z10, InterfaceC9324c<? super C8736p> interfaceC9324c) {
        Object objMutate = this.mutex.mutate(MutatePriority.UserInput, new C20072(f10, z10, null), interfaceC9324c);
        return objMutate == AbstractC9434a.m17291f() ? objMutate : C8736p.f16368a;
    }

    @Override // androidx.compose.material3.TimePickerState
    public void set24hour(boolean z10) {
        this.state.set24hour(z10);
    }

    @Override // androidx.compose.material3.TimePickerState
    public void setAfternoon(boolean z10) {
        this.state.setAfternoon(z10);
    }

    @Override // androidx.compose.material3.TimePickerState
    public void setHour(int i10) {
        this.hourAngle = ((i10 % 12) * 0.5235988f) - 1.5707964f;
        this.state.setHour(i10);
        if (TimePickerSelectionMode.m22756equalsimpl0(mo21736getSelectionyecRtBI(), TimePickerSelectionMode.Companion.m22760getHouryecRtBI())) {
            this.anim = AnimatableKt.Animatable$default(this.hourAngle, 0.0f, 2, null);
        }
    }

    @Override // androidx.compose.material3.TimePickerState
    public void setMinute(int i10) {
        this.minuteAngle = (i10 * 0.10471976f) - 1.5707964f;
        this.state.setMinute(i10);
        if (TimePickerSelectionMode.m22756equalsimpl0(mo21736getSelectionyecRtBI(), TimePickerSelectionMode.Companion.m22761getMinuteyecRtBI())) {
            this.anim = AnimatableKt.Animatable$default(this.minuteAngle, 0.0f, 2, null);
        }
        updateBaseStateMinute();
    }

    @Override // androidx.compose.material3.TimePickerState
    /* renamed from: setSelection-6_8s6DQ, reason: not valid java name */
    public void mo21737setSelection6_8s6DQ(int i10) {
        this.state.mo21737setSelection6_8s6DQ(i10);
    }
}
