package androidx.compose.material3;

import androidx.annotation.IntRange;
import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.MutatorMutex;
import androidx.compose.foundation.gestures.DragScope;
import androidx.compose.foundation.gestures.DraggableState;
import androidx.compose.p011ui.geometry.Offset;
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
import kotlin.AbstractC5774b;
import kotlin.Metadata;
import kotlin.collections.AbstractC5806u;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC5824e;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.AbstractC6014x;
import kotlinx.coroutines.InterfaceC6009v;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p045d6.C5443s;
import p075h6.InterfaceC5631c;
import p152r6.InterfaceC6469a;
import p152r6.InterfaceC6471c;
import p152r6.InterfaceC6473e;
import p200x6.C6751a;
import p200x6.InterfaceC6752b;

@StabilityInferred(parameters = 0)
@ExperimentalMaterial3Api
@Metadata(m5109d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0014\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u001f\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B=\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0005\u001a\u00020\u0004\u0012\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\t¢\u0006\u0004\b\u000b\u0010\fJA\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\r2'\u0010\u0014\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0011\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u000f¢\u0006\u0002\b\u0013H\u0096@¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u001f\u0010\u001e\u001a\u00020\u00072\u0006\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010#\u001a\u00020\u00072\u0006\u0010 \u001a\u00020\u001fH\u0000ø\u0001\u0000¢\u0006\u0004\b!\u0010\"J'\u0010'\u001a\u00020\u00022\u0006\u0010$\u001a\u00020\u00022\u0006\u0010%\u001a\u00020\u00022\u0006\u0010&\u001a\u00020\u0002H\u0002¢\u0006\u0004\b'\u0010(J'\u0010*\u001a\u00020\u00022\u0006\u0010$\u001a\u00020\u00022\u0006\u0010%\u001a\u00020\u00022\u0006\u0010)\u001a\u00020\u0002H\u0002¢\u0006\u0004\b*\u0010(R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010+\u001a\u0004\b,\u0010-R*\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010.\u001a\u0004\b/\u00100\"\u0004\b1\u00102R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u00103\u001a\u0004\b4\u00105R+\u0010<\u001a\u00020\u00022\u0006\u00106\u001a\u00020\u00028B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b7\u00108\u001a\u0004\b9\u0010:\"\u0004\b;\u0010\u0019R0\u0010>\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0007\u0018\u00010=8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b>\u0010?\u001a\u0004\b@\u0010A\"\u0004\bB\u0010CR\u001a\u0010E\u001a\u00020D8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bE\u0010F\u001a\u0004\bG\u0010HR+\u0010N\u001a\u00020\u00042\u0006\u00106\u001a\u00020\u00048B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\bI\u0010J\u001a\u0004\bK\u0010-\"\u0004\bL\u0010MR\"\u0010P\u001a\u00020O8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bP\u0010Q\u001a\u0004\bR\u0010S\"\u0004\bT\u0010UR+\u0010Y\u001a\u00020\u00022\u0006\u00106\u001a\u00020\u00028@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\bV\u00108\u001a\u0004\bW\u0010:\"\u0004\bX\u0010\u0019R+\u0010]\u001a\u00020\u00022\u0006\u00106\u001a\u00020\u00028@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\bZ\u00108\u001a\u0004\b[\u0010:\"\u0004\b\\\u0010\u0019R+\u0010b\u001a\u00020O2\u0006\u00106\u001a\u00020O8@@BX\u0080\u008e\u0002¢\u0006\u0012\n\u0004\b^\u0010_\u001a\u0004\b`\u0010S\"\u0004\ba\u0010UR \u0010c\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0000X\u0080\u0004¢\u0006\f\n\u0004\bc\u0010.\u001a\u0004\bd\u00100R+\u0010h\u001a\u00020\u00022\u0006\u00106\u001a\u00020\u00028B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\be\u00108\u001a\u0004\bf\u0010:\"\u0004\bg\u0010\u0019R+\u0010l\u001a\u00020\u00022\u0006\u00106\u001a\u00020\u00028B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\bi\u00108\u001a\u0004\bj\u0010:\"\u0004\bk\u0010\u0019R\u0014\u0010m\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bm\u0010nR\u0014\u0010p\u001a\u00020o8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bp\u0010qR$\u0010\u0003\u001a\u00020\u00022\u0006\u0010r\u001a\u00020\u00028F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bs\u0010:\"\u0004\bt\u0010\u0019R\u0014\u0010v\u001a\u00020\u00028@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bu\u0010:\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006w"}, m5110d2 = {"Landroidx/compose/material3/SliderState;", "Landroidx/compose/foundation/gestures/DraggableState;", "", "value", "", "steps", "Lkotlin/Function0;", "Ld6/s;", "onValueChangeFinished", "Lx6/b;", "valueRange", "<init>", "(FILr6/a;Lx6/b;)V", "Landroidx/compose/foundation/MutatePriority;", "dragPriority", "Lkotlin/Function2;", "Landroidx/compose/foundation/gestures/DragScope;", "Lh6/c;", "", "Lkotlin/ExtensionFunctionType;", "block", "drag", "(Landroidx/compose/foundation/MutatePriority;Lr6/e;Lh6/c;)Ljava/lang/Object;", "delta", "dispatchRawDelta", "(F)V", "newTrackHeight", "newTotalWidth", "updateDimensions$material3_release", "(FI)V", "updateDimensions", "Landroidx/compose/ui/geometry/Offset;", "pos", "onPress-k-4lQ0M$material3_release", "(J)V", "onPress", "minPx", "maxPx", TypedValues.CycleType.S_WAVE_OFFSET, "scaleToUserValue", "(FFF)F", "userValue", "scaleToOffset", "I", "getSteps", "()I", "Lr6/a;", "getOnValueChangeFinished", "()Lr6/a;", "setOnValueChangeFinished", "(Lr6/a;)V", "Lx6/b;", "getValueRange", "()Lx6/b;", "<set-?>", "valueState$delegate", "Landroidx/compose/runtime/MutableFloatState;", "getValueState", "()F", "setValueState", "valueState", "Lkotlin/Function1;", "onValueChange", "Lr6/c;", "getOnValueChange$material3_release", "()Lr6/c;", "setOnValueChange$material3_release", "(Lr6/c;)V", "", "tickFractions", "[F", "getTickFractions$material3_release", "()[F", "totalWidth$delegate", "Landroidx/compose/runtime/MutableIntState;", "getTotalWidth", "setTotalWidth", "(I)V", "totalWidth", "", "isRtl", "Z", "isRtl$material3_release", "()Z", "setRtl$material3_release", "(Z)V", "trackHeight$delegate", "getTrackHeight$material3_release", "setTrackHeight$material3_release", "trackHeight", "thumbWidth$delegate", "getThumbWidth$material3_release", "setThumbWidth$material3_release", "thumbWidth", "isDragging$delegate", "Landroidx/compose/runtime/MutableState;", "isDragging$material3_release", "setDragging", "isDragging", "gestureEndAction", "getGestureEndAction$material3_release", "rawOffset$delegate", "getRawOffset", "setRawOffset", "rawOffset", "pressOffset$delegate", "getPressOffset", "setPressOffset", "pressOffset", "dragScope", "Landroidx/compose/foundation/gestures/DragScope;", "Landroidx/compose/foundation/MutatorMutex;", "scrollMutex", "Landroidx/compose/foundation/MutatorMutex;", "newVal", "getValue", "setValue", "getCoercedValueAsFraction$material3_release", "coercedValueAsFraction", "material3_release"}, m5111k = 1, m5112mv = {1, 8, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nSlider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Slider.kt\nandroidx/compose/material3/SliderState\n+ 2 SnapshotFloatState.kt\nandroidx/compose/runtime/PrimitiveSnapshotStateKt__SnapshotFloatStateKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 SnapshotIntState.kt\nandroidx/compose/runtime/SnapshotIntStateKt__SnapshotIntStateKt\n+ 5 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,2263:1\n76#2:2264\n109#2,2:2265\n76#2:2271\n109#2,2:2272\n76#2:2274\n109#2,2:2275\n76#2:2280\n109#2,2:2281\n76#2:2283\n109#2,2:2284\n1#3:2267\n75#4:2268\n108#4,2:2269\n81#5:2277\n107#5,2:2278\n*S KotlinDebug\n*F\n+ 1 Slider.kt\nandroidx/compose/material3/SliderState\n*L\n1948#1:2264\n1948#1:2265,2\n1998#1:2271\n1998#1:2272,2\n1999#1:2274\n1999#1:2275,2\n2029#1:2280\n2029#1:2281,2\n2030#1:2283\n2030#1:2284,2\n1996#1:2268\n1996#1:2269,2\n2009#1:2277\n2009#1:2278,2\n*E\n"})
/* loaded from: classes.dex */
public final class SliderState implements DraggableState {
    public static final int $stable = 8;

    @NotNull
    private final DragScope dragScope;

    @NotNull
    private final InterfaceC6469a gestureEndAction;

    /* renamed from: isDragging$delegate, reason: from kotlin metadata */
    @NotNull
    private final MutableState isDragging;
    private boolean isRtl;

    @Nullable
    private InterfaceC6471c onValueChange;

    @Nullable
    private InterfaceC6469a onValueChangeFinished;

    /* renamed from: pressOffset$delegate, reason: from kotlin metadata */
    @NotNull
    private final MutableFloatState pressOffset;

    /* renamed from: rawOffset$delegate, reason: from kotlin metadata */
    @NotNull
    private final MutableFloatState rawOffset;

    @NotNull
    private final MutatorMutex scrollMutex;
    private final int steps;

    /* renamed from: thumbWidth$delegate, reason: from kotlin metadata */
    @NotNull
    private final MutableFloatState thumbWidth;

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

    /* renamed from: valueState$delegate, reason: from kotlin metadata */
    @NotNull
    private final MutableFloatState valueState;

    @Metadata(m5109d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m5110d2 = {"Lkotlinx/coroutines/v;", "Ld6/s;", "<anonymous>", "(Lkotlinx/coroutines/v;)V"}, m5111k = 3, m5112mv = {1, 8, 0})
    @DebugMetadata(m5302c = "androidx.compose.material3.SliderState$drag$2", m5303f = "Slider.kt", m5304i = {}, m5305l = {1972}, m5306m = "invokeSuspend", m5307n = {}, m5308s = {})
    /* renamed from: androidx.compose.material3.SliderState$drag$2 */
    public static final class C18432 extends SuspendLambda implements InterfaceC6473e {
        final /* synthetic */ InterfaceC6473e $block;
        final /* synthetic */ MutatePriority $dragPriority;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C18432(MutatePriority mutatePriority, InterfaceC6473e interfaceC6473e, InterfaceC5631c<? super C18432> interfaceC5631c) {
            super(2, interfaceC5631c);
            this.$dragPriority = mutatePriority;
            this.$block = interfaceC6473e;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final InterfaceC5631c<C5443s> create(@Nullable Object obj, @NotNull InterfaceC5631c<?> interfaceC5631c) {
            return SliderState.this.new C18432(this.$dragPriority, this.$block, interfaceC5631c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                AbstractC5774b.m5119b(obj);
                SliderState.this.setDragging(true);
                MutatorMutex mutatorMutex = SliderState.this.scrollMutex;
                DragScope dragScope = SliderState.this.dragScope;
                MutatePriority mutatePriority = this.$dragPriority;
                InterfaceC6473e interfaceC6473e = this.$block;
                this.label = 1;
                if (mutatorMutex.mutateWith(dragScope, mutatePriority, interfaceC6473e, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC5774b.m5119b(obj);
            }
            SliderState.this.setDragging(false);
            return C5443s.f8405a;
        }

        @Override // p152r6.InterfaceC6473e
        @Nullable
        public final Object invoke(@NotNull InterfaceC6009v interfaceC6009v, @Nullable InterfaceC5631c<? super C5443s> interfaceC5631c) {
            return ((C18432) create(interfaceC6009v, interfaceC5631c)).invokeSuspend(C5443s.f8405a);
        }
    }

    public SliderState() {
        this(0.0f, 0, null, null, 15, null);
    }

    private final float getPressOffset() {
        return this.pressOffset.getFloatValue();
    }

    private final float getRawOffset() {
        return this.rawOffset.getFloatValue();
    }

    private final int getTotalWidth() {
        return this.totalWidth.getIntValue();
    }

    private final float getValueState() {
        return this.valueState.getFloatValue();
    }

    private final float scaleToOffset(float minPx, float maxPx, float userValue) {
        return SliderKt.scale(Float.valueOf(((C6751a) this.valueRange).f11418a).floatValue(), Float.valueOf(((C6751a) this.valueRange).f11419b).floatValue(), userValue, minPx, maxPx);
    }

    private final float scaleToUserValue(float minPx, float maxPx, float offset) {
        return SliderKt.scale(minPx, maxPx, offset, Float.valueOf(((C6751a) this.valueRange).f11418a).floatValue(), Float.valueOf(((C6751a) this.valueRange).f11419b).floatValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setDragging(boolean z8) {
        this.isDragging.setValue(Boolean.valueOf(z8));
    }

    private final void setPressOffset(float f) {
        this.pressOffset.setFloatValue(f);
    }

    private final void setRawOffset(float f) {
        this.rawOffset.setFloatValue(f);
    }

    private final void setTotalWidth(int i) {
        this.totalWidth.setIntValue(i);
    }

    private final void setValueState(float f) {
        this.valueState.setFloatValue(f);
    }

    @Override // androidx.compose.foundation.gestures.DraggableState
    public void dispatchRawDelta(float delta) {
        float f = 2;
        float fMax = Math.max(getTotalWidth() - (getThumbWidth$material3_release() / f), 0.0f);
        float fMin = Math.min(getThumbWidth$material3_release() / f, fMax);
        setRawOffset(getRawOffset() + delta + getPressOffset());
        setPressOffset(0.0f);
        float fScaleToUserValue = scaleToUserValue(fMin, fMax, SliderKt.snapValueToTick(getRawOffset(), this.tickFractions, fMin, fMax));
        if (fScaleToUserValue == getValue()) {
            return;
        }
        InterfaceC6471c interfaceC6471c = this.onValueChange;
        if (interfaceC6471c == null) {
            setValue(fScaleToUserValue);
        } else if (interfaceC6471c != null) {
            interfaceC6471c.invoke(Float.valueOf(fScaleToUserValue));
        }
    }

    @Override // androidx.compose.foundation.gestures.DraggableState
    @Nullable
    public Object drag(@NotNull MutatePriority mutatePriority, @NotNull InterfaceC6473e interfaceC6473e, @NotNull InterfaceC5631c<? super C5443s> interfaceC5631c) {
        Object objM5637h = AbstractC6014x.m5637h(new C18432(mutatePriority, interfaceC6473e, null), interfaceC5631c);
        return objM5637h == CoroutineSingletons.COROUTINE_SUSPENDED ? objM5637h : C5443s.f8405a;
    }

    public final float getCoercedValueAsFraction$material3_release() {
        return SliderKt.calcFraction(Float.valueOf(((C6751a) this.valueRange).f11418a).floatValue(), Float.valueOf(((C6751a) this.valueRange).f11419b).floatValue(), AbstractC5806u.m5273l(getValue(), Float.valueOf(((C6751a) this.valueRange).f11418a).floatValue(), Float.valueOf(((C6751a) this.valueRange).f11419b).floatValue()));
    }

    @NotNull
    /* renamed from: getGestureEndAction$material3_release, reason: from getter */
    public final InterfaceC6469a getGestureEndAction() {
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

    public final int getSteps() {
        return this.steps;
    }

    public final float getThumbWidth$material3_release() {
        return this.thumbWidth.getFloatValue();
    }

    @NotNull
    /* renamed from: getTickFractions$material3_release, reason: from getter */
    public final float[] getTickFractions() {
        return this.tickFractions;
    }

    public final float getTrackHeight$material3_release() {
        return this.trackHeight.getFloatValue();
    }

    public final float getValue() {
        return getValueState();
    }

    @NotNull
    public final InterfaceC6752b getValueRange() {
        return this.valueRange;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean isDragging$material3_release() {
        return ((Boolean) this.isDragging.getValue()).booleanValue();
    }

    /* renamed from: isRtl$material3_release, reason: from getter */
    public final boolean getIsRtl() {
        return this.isRtl;
    }

    /* renamed from: onPress-k-4lQ0M$material3_release, reason: not valid java name */
    public final void m8932onPressk4lQ0M$material3_release(long pos) {
        setPressOffset((this.isRtl ? getTotalWidth() - Offset.m10441getXimpl(pos) : Offset.m10441getXimpl(pos)) - getRawOffset());
    }

    public final void setOnValueChange$material3_release(@Nullable InterfaceC6471c interfaceC6471c) {
        this.onValueChange = interfaceC6471c;
    }

    public final void setOnValueChangeFinished(@Nullable InterfaceC6469a interfaceC6469a) {
        this.onValueChangeFinished = interfaceC6469a;
    }

    public final void setRtl$material3_release(boolean z8) {
        this.isRtl = z8;
    }

    public final void setThumbWidth$material3_release(float f) {
        this.thumbWidth.setFloatValue(f);
    }

    public final void setTrackHeight$material3_release(float f) {
        this.trackHeight.setFloatValue(f);
    }

    public final void setValue(float f) {
        setValueState(SliderKt.snapValueToTick(AbstractC5806u.m5273l(f, Float.valueOf(((C6751a) this.valueRange).f11418a).floatValue(), Float.valueOf(((C6751a) this.valueRange).f11419b).floatValue()), this.tickFractions, Float.valueOf(((C6751a) this.valueRange).f11418a).floatValue(), Float.valueOf(((C6751a) this.valueRange).f11419b).floatValue()));
    }

    public final void updateDimensions$material3_release(float newTrackHeight, int newTotalWidth) {
        setTrackHeight$material3_release(newTrackHeight);
        setTotalWidth(newTotalWidth);
    }

    public SliderState(float f, int i, InterfaceC6469a interfaceC6469a, InterfaceC6752b interfaceC6752b, int i8, AbstractC5824e abstractC5824e) {
        this((i8 & 1) != 0 ? 0.0f : f, (i8 & 2) != 0 ? 0 : i, (i8 & 4) != 0 ? null : interfaceC6469a, (i8 & 8) != 0 ? new C6751a(0.0f, 1.0f) : interfaceC6752b);
    }

    public SliderState(float f, @IntRange(from = FabTransformationScrimBehavior.COLLAPSE_DELAY) int i, @Nullable InterfaceC6469a interfaceC6469a, @NotNull InterfaceC6752b interfaceC6752b) {
        this.steps = i;
        this.onValueChangeFinished = interfaceC6469a;
        this.valueRange = interfaceC6752b;
        this.valueState = PrimitiveSnapshotStateKt.mutableFloatStateOf(f);
        this.tickFractions = SliderKt.stepsToTickFractions(i);
        this.totalWidth = SnapshotIntStateKt.mutableIntStateOf(0);
        this.trackHeight = PrimitiveSnapshotStateKt.mutableFloatStateOf(0.0f);
        this.thumbWidth = PrimitiveSnapshotStateKt.mutableFloatStateOf(0.0f);
        this.isDragging = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
        this.gestureEndAction = new InterfaceC6469a() { // from class: androidx.compose.material3.SliderState$gestureEndAction$1
            {
                super(0);
            }

            @Override // p152r6.InterfaceC6469a
            public /* bridge */ /* synthetic */ Object invoke() {
                m8933invoke();
                return C5443s.f8405a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m8933invoke() {
                InterfaceC6469a onValueChangeFinished;
                if (this.this$0.isDragging$material3_release() || (onValueChangeFinished = this.this$0.getOnValueChangeFinished()) == null) {
                    return;
                }
                onValueChangeFinished.invoke();
            }
        };
        this.rawOffset = PrimitiveSnapshotStateKt.mutableFloatStateOf(scaleToOffset(0.0f, 0.0f, f));
        this.pressOffset = PrimitiveSnapshotStateKt.mutableFloatStateOf(0.0f);
        this.dragScope = new DragScope() { // from class: androidx.compose.material3.SliderState$dragScope$1
            @Override // androidx.compose.foundation.gestures.DragScope
            public void dragBy(float pixels) {
                this.this$0.dispatchRawDelta(pixels);
            }
        };
        this.scrollMutex = new MutatorMutex();
    }
}
