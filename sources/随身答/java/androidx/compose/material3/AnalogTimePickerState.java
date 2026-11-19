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
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred(parameters = 0)
@Metadata(m13412d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u000f\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0002\u0010\u0003J\u000e\u0010*\u001a\u00020+H\u0086@¢\u0006\u0002\u0010,J\u0010\u0010-\u001a\u00020\u00062\u0006\u0010.\u001a\u00020\u0006H\u0002J\b\u0010/\u001a\u00020\u0018H\u0002J\u0010\u00100\u001a\u00020\u00062\u0006\u00101\u001a\u00020\u0006H\u0002J\u000e\u00102\u001a\u00020+H\u0086@¢\u0006\u0002\u0010,J \u00103\u001a\u00020+2\u0006\u00101\u001a\u00020\u00062\b\b\u0002\u00104\u001a\u00020\u0018H\u0086@¢\u0006\u0002\u00105J\b\u00106\u001a\u00020+H\u0002J\f\u00107\u001a\u00020\u0006*\u00020\u0006H\u0002J\f\u00108\u001a\u00020\u0010*\u00020\u0006H\u0002J\f\u00109\u001a\u00020\u0010*\u00020\u0006H\u0002R\u001a\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\f\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR$\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u00108V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u000e\u0010\u0016\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u0018\u0010\u0017\u001a\u00020\u0018X\u0096\u000f¢\u0006\f\u001a\u0004\b\u0017\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u0018\u0010\u001c\u001a\u00020\u0018X\u0096\u000f¢\u0006\f\u001a\u0004\b\u001c\u0010\u0019\"\u0004\b\u001d\u0010\u001bR$\u0010\u001e\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u00108V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u001f\u0010\u0013\"\u0004\b \u0010\u0015R\u000e\u0010!\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020#X\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010$\u001a\u00020%X\u0096\u000fø\u0001\u0000ø\u0001\u0001¢\u0006\f\u001a\u0004\b&\u0010\u0013\"\u0004\b'\u0010\u0015R\u0011\u0010\u0002\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006:"}, m13413d2 = {"Landroidx/compose/material3/AnalogTimePickerState;", "Landroidx/compose/material3/TimePickerState;", "state", "(Landroidx/compose/material3/TimePickerState;)V", "anim", "Landroidx/compose/animation/core/Animatable;", "", "Landroidx/compose/animation/core/AnimationVector1D;", "clockFaceValues", "Landroidx/collection/IntList;", "getClockFaceValues", "()Landroidx/collection/IntList;", "currentAngle", "getCurrentAngle", "()F", "value", "", "hour", "getHour", "()I", "setHour", "(I)V", "hourAngle", "is24hour", "", "()Z", "set24hour", "(Z)V", "isAfternoon", "setAfternoon", "minute", "getMinute", "setMinute", "minuteAngle", "mutex", "Landroidx/compose/foundation/MutatorMutex;", "selection", "Landroidx/compose/material3/TimePickerSelectionMode;", "getSelection-yecRtBI", "setSelection-6_8s6DQ", "getState", "()Landroidx/compose/material3/TimePickerState;", "animateToCurrent", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "endValueForAnimation", "new", "isUpdated", "offsetAngle", "angle", "onGestureEnd", "rotateTo", "animate", "(FZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateBaseStateMinute", "normalize", "toHour", "toMinute", "material3_release"}, m13414k = 1, m13415mv = {1, 8, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nTimePicker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TimePicker.kt\nandroidx/compose/material3/AnalogTimePickerState\n+ 2 Snapshot.kt\nandroidx/compose/runtime/snapshots/Snapshot$Companion\n*L\n1#1,2008:1\n602#2,8:2009\n*S KotlinDebug\n*F\n+ 1 TimePicker.kt\nandroidx/compose/material3/AnalogTimePickerState\n*L\n822#1:2009,8\n*E\n"})
/* loaded from: classes2.dex */
public final class AnalogTimePickerState implements TimePickerState {
    public static final int $stable = 8;
    private Animatable<Float, AnimationVector1D> anim;
    private float hourAngle;
    private float minuteAngle;
    private final MutatorMutex mutex = new MutatorMutex();
    private final TimePickerState state;

    @Metadata(m13412d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001H\u008a@"}, m13413d2 = {"<anonymous>", "Landroidx/compose/animation/core/AnimationResult;", "", "Landroidx/compose/animation/core/AnimationVector1D;"}, m13414k = 3, m13415mv = {1, 8, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    @DebugMetadata(m13450c = "androidx.compose.material3.AnalogTimePickerState$animateToCurrent$2", m13451f = "TimePicker.kt", m13452i = {}, m13453l = {738}, m13454m = "invokeSuspend", m13455n = {}, m13456s = {})
    /* renamed from: androidx.compose.material3.AnalogTimePickerState$animateToCurrent$2 */
    public static final class C19642 extends SuspendLambda implements Function1<Continuation<? super AnimationResult<Float, AnimationVector1D>>, Object> {
        final /* synthetic */ float $end;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C19642(float f10, Continuation<? super C19642> continuation) {
            super(1, continuation);
            this.$end = f10;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Continuation<?> continuation) {
            return AnalogTimePickerState.this.new C19642(this.$end, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i9 = this.label;
            if (i9 != 0) {
                if (i9 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return obj;
            }
            ResultKt.throwOnFailure(obj);
            Animatable animatable = AnalogTimePickerState.this.anim;
            Float fBoxFloat = Boxing.boxFloat(this.$end);
            SpringSpec springSpecSpring$default = AnimationSpecKt.spring$default(1.0f, 700.0f, null, 4, null);
            this.label = 1;
            Object objAnimateTo$default = Animatable.animateTo$default(animatable, fBoxFloat, springSpecSpring$default, null, null, this, 12, null);
            return objAnimateTo$default == coroutine_suspended ? coroutine_suspended : objAnimateTo$default;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Continuation<? super AnimationResult<Float, AnimationVector1D>> continuation) {
            return ((C19642) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @Metadata(m13412d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001H\u008a@"}, m13413d2 = {"<anonymous>", "Landroidx/compose/animation/core/AnimationResult;", "", "Landroidx/compose/animation/core/AnimationVector1D;"}, m13414k = 3, m13415mv = {1, 8, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    @DebugMetadata(m13450c = "androidx.compose.material3.AnalogTimePickerState$onGestureEnd$2", m13451f = "TimePicker.kt", m13452i = {}, m13453l = {789}, m13454m = "invokeSuspend", m13455n = {}, m13456s = {})
    /* renamed from: androidx.compose.material3.AnalogTimePickerState$onGestureEnd$2 */
    public static final class C19652 extends SuspendLambda implements Function1<Continuation<? super AnimationResult<Float, AnimationVector1D>>, Object> {
        final /* synthetic */ float $end;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C19652(float f10, Continuation<? super C19652> continuation) {
            super(1, continuation);
            this.$end = f10;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Continuation<?> continuation) {
            return AnalogTimePickerState.this.new C19652(this.$end, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i9 = this.label;
            if (i9 != 0) {
                if (i9 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return obj;
            }
            ResultKt.throwOnFailure(obj);
            Animatable animatable = AnalogTimePickerState.this.anim;
            Float fBoxFloat = Boxing.boxFloat(this.$end);
            SpringSpec springSpecSpring$default = AnimationSpecKt.spring$default(0.0f, 0.0f, null, 7, null);
            this.label = 1;
            Object objAnimateTo$default = Animatable.animateTo$default(animatable, fBoxFloat, springSpecSpring$default, null, null, this, 12, null);
            return objAnimateTo$default == coroutine_suspended ? coroutine_suspended : objAnimateTo$default;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Continuation<? super AnimationResult<Float, AnimationVector1D>> continuation) {
            return ((C19652) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @Metadata(m13412d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0000\u0010\u0000\u001a\u00020\u0001H\u008a@"}, m13413d2 = {"<anonymous>", ""}, m13414k = 3, m13415mv = {1, 8, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    @DebugMetadata(m13450c = "androidx.compose.material3.AnalogTimePickerState$rotateTo$2", m13451f = "TimePicker.kt", m13452i = {}, m13453l = {803, 806}, m13454m = "invokeSuspend", m13455n = {}, m13456s = {})
    /* renamed from: androidx.compose.material3.AnalogTimePickerState$rotateTo$2 */
    public static final class C19662 extends SuspendLambda implements Function1<Continuation<? super Object>, Object> {
        final /* synthetic */ float $angle;
        final /* synthetic */ boolean $animate;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C19662(float f10, boolean z9, Continuation<? super C19662> continuation) {
            super(1, continuation);
            this.$angle = f10;
            this.$animate = z9;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Continuation<?> continuation) {
            return AnalogTimePickerState.this.new C19662(this.$angle, this.$animate, continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Continuation<? super Object> continuation) {
            return invoke2((Continuation<Object>) continuation);
        }

        /* JADX WARN: Code restructure failed: missing block: B:22:0x00a6, code lost:
        
            if (r12.snapTo(r1, r11) == r0) goto L28;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r12) {
            /*
                r11 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r11.label
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L1f
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                kotlin.ResultKt.throwOnFailure(r12)
                return r12
            L12:
                java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r12.<init>(r0)
                throw r12
            L1a:
                kotlin.ResultKt.throwOnFailure(r12)
                goto La9
            L1f:
                kotlin.ResultKt.throwOnFailure(r12)
                androidx.compose.material3.AnalogTimePickerState r12 = androidx.compose.material3.AnalogTimePickerState.this
                int r12 = r12.mo18929getSelectionyecRtBI()
                androidx.compose.material3.TimePickerSelectionMode$Companion r1 = androidx.compose.material3.TimePickerSelectionMode.INSTANCE
                int r1 = r1.m19921getHouryecRtBI()
                boolean r12 = androidx.compose.material3.TimePickerSelectionMode.m19917equalsimpl0(r12, r1)
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
                java.lang.Float r1 = kotlin.coroutines.jvm.internal.Boxing.boxFloat(r1)
                r11.label = r3
                java.lang.Object r12 = r12.snapTo(r1, r11)
                if (r12 != r0) goto La9
                goto Ld9
            La9:
                kotlin.Unit r12 = kotlin.Unit.INSTANCE
                return r12
            Lac:
                androidx.compose.material3.AnalogTimePickerState r12 = androidx.compose.material3.AnalogTimePickerState.this
                float r1 = r11.$angle
                float r1 = androidx.compose.material3.AnalogTimePickerState.access$offsetAngle(r12, r1)
                float r12 = androidx.compose.material3.AnalogTimePickerState.access$endValueForAnimation(r12, r1)
                androidx.compose.material3.AnalogTimePickerState r1 = androidx.compose.material3.AnalogTimePickerState.this
                androidx.compose.animation.core.Animatable r3 = androidx.compose.material3.AnalogTimePickerState.access$getAnim$p(r1)
                java.lang.Float r4 = kotlin.coroutines.jvm.internal.Boxing.boxFloat(r12)
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
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.AnalogTimePickerState.C19662.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(Continuation<Object> continuation) {
            return ((C19662) create(continuation)).invokeSuspend(Unit.INSTANCE);
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
        int iMo18929getSelectionyecRtBI = mo18929getSelectionyecRtBI();
        TimePickerSelectionMode.Companion companion = TimePickerSelectionMode.INSTANCE;
        if (TimePickerSelectionMode.m19917equalsimpl0(iMo18929getSelectionyecRtBI, companion.m19921getHouryecRtBI()) && normalize(this.anim.getTargetValue().floatValue()) == normalize(this.hourAngle)) {
            return false;
        }
        return (TimePickerSelectionMode.m19917equalsimpl0(mo18929getSelectionyecRtBI(), companion.m19922getMinuteyecRtBI()) && normalize(this.anim.getTargetValue().floatValue()) == normalize(this.minuteAngle)) ? false : true;
    }

    private final float normalize(float f10) {
        double d10 = f10 % 6.283185307179586d;
        if (d10 < AudioStats.AUDIO_AMPLITUDE_NONE) {
            d10 += 6.283185307179586d;
        }
        return (float) d10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final float offsetAngle(float angle) {
        float f10 = angle + 1.5707964f;
        return f10 < 0.0f ? f10 + 6.2831855f : f10;
    }

    public static /* synthetic */ Object rotateTo$default(AnalogTimePickerState analogTimePickerState, float f10, boolean z9, Continuation continuation, int i9, Object obj) {
        if ((i9 & 2) != 0) {
            z9 = false;
        }
        return analogTimePickerState.rotateTo(f10, z9, continuation);
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
        Snapshot.Companion companion = Snapshot.INSTANCE;
        Snapshot currentThreadSnapshot = companion.getCurrentThreadSnapshot();
        Function1<Object, Unit> readObserver = currentThreadSnapshot != null ? currentThreadSnapshot.getReadObserver() : null;
        Snapshot snapshotMakeCurrentNonObservable = companion.makeCurrentNonObservable(currentThreadSnapshot);
        try {
            this.state.setMinute(getMinute());
            Unit unit = Unit.INSTANCE;
        } finally {
            companion.restoreNonObservable(currentThreadSnapshot, snapshotMakeCurrentNonObservable, readObserver);
        }
    }

    public final Object animateToCurrent(Continuation<? super Unit> continuation) {
        if (!isUpdated()) {
            return Unit.INSTANCE;
        }
        Object objMutate = this.mutex.mutate(MutatePriority.PreventUserInput, new C19642(TimePickerSelectionMode.m19917equalsimpl0(mo18929getSelectionyecRtBI(), TimePickerSelectionMode.INSTANCE.m19921getHouryecRtBI()) ? endValueForAnimation(this.hourAngle) : endValueForAnimation(this.minuteAngle), null), continuation);
        return objMutate == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objMutate : Unit.INSTANCE;
    }

    public final IntList getClockFaceValues() {
        return TimePickerSelectionMode.m19917equalsimpl0(mo18929getSelectionyecRtBI(), TimePickerSelectionMode.INSTANCE.m19922getMinuteyecRtBI()) ? TimePickerKt.Minutes : TimePickerKt.Hours;
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
    public int mo18929getSelectionyecRtBI() {
        return this.state.mo18929getSelectionyecRtBI();
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

    public final Object onGestureEnd(Continuation<? super Unit> continuation) {
        Object objMutate = this.mutex.mutate(MutatePriority.PreventUserInput, new C19652(endValueForAnimation(TimePickerSelectionMode.m19917equalsimpl0(mo18929getSelectionyecRtBI(), TimePickerSelectionMode.INSTANCE.m19921getHouryecRtBI()) ? this.hourAngle : this.minuteAngle), null), continuation);
        return objMutate == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objMutate : Unit.INSTANCE;
    }

    public final Object rotateTo(float f10, boolean z9, Continuation<? super Unit> continuation) {
        Object objMutate = this.mutex.mutate(MutatePriority.UserInput, new C19662(f10, z9, null), continuation);
        return objMutate == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objMutate : Unit.INSTANCE;
    }

    @Override // androidx.compose.material3.TimePickerState
    public void set24hour(boolean z9) {
        this.state.set24hour(z9);
    }

    @Override // androidx.compose.material3.TimePickerState
    public void setAfternoon(boolean z9) {
        this.state.setAfternoon(z9);
    }

    @Override // androidx.compose.material3.TimePickerState
    public void setHour(int i9) {
        this.hourAngle = ((i9 % 12) * 0.5235988f) - 1.5707964f;
        this.state.setHour(i9);
        if (TimePickerSelectionMode.m19917equalsimpl0(mo18929getSelectionyecRtBI(), TimePickerSelectionMode.INSTANCE.m19921getHouryecRtBI())) {
            this.anim = AnimatableKt.Animatable$default(this.hourAngle, 0.0f, 2, null);
        }
    }

    @Override // androidx.compose.material3.TimePickerState
    public void setMinute(int i9) {
        this.minuteAngle = (i9 * 0.10471976f) - 1.5707964f;
        this.state.setMinute(i9);
        if (TimePickerSelectionMode.m19917equalsimpl0(mo18929getSelectionyecRtBI(), TimePickerSelectionMode.INSTANCE.m19922getMinuteyecRtBI())) {
            this.anim = AnimatableKt.Animatable$default(this.minuteAngle, 0.0f, 2, null);
        }
        updateBaseStateMinute();
    }

    @Override // androidx.compose.material3.TimePickerState
    /* renamed from: setSelection-6_8s6DQ, reason: not valid java name */
    public void mo18930setSelection6_8s6DQ(int i9) {
        this.state.mo18930setSelection6_8s6DQ(i9);
    }
}
