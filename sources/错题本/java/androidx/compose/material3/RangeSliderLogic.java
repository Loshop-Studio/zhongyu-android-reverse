package androidx.compose.material3;

import androidx.compose.foundation.interaction.Interaction;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.AbstractC5774b;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.AbstractC6014x;
import kotlinx.coroutines.InterfaceC6009v;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p045d6.C5443s;
import p075h6.InterfaceC5631c;
import p152r6.InterfaceC6473e;

@Metadata(m5109d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0002\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0010\u0010\u0011J-\u0010\u0018\u001a\u00020\u00172\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001d\u001a\u0004\b \u0010\u001f¨\u0006!"}, m5110d2 = {"Landroidx/compose/material3/RangeSliderLogic;", "", "Landroidx/compose/material3/RangeSliderState;", "state", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "startInteractionSource", "endInteractionSource", "<init>", "(Landroidx/compose/material3/RangeSliderState;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/foundation/interaction/MutableInteractionSource;)V", "", "draggingStart", "activeInteraction", "(Z)Landroidx/compose/foundation/interaction/MutableInteractionSource;", "", "eventX", "", "compareOffsets", "(F)I", "posX", "Landroidx/compose/foundation/interaction/Interaction;", "interaction", "Lkotlinx/coroutines/v;", "scope", "Ld6/s;", "captureThumb", "(ZFLandroidx/compose/foundation/interaction/Interaction;Lkotlinx/coroutines/v;)V", "Landroidx/compose/material3/RangeSliderState;", "getState", "()Landroidx/compose/material3/RangeSliderState;", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "getStartInteractionSource", "()Landroidx/compose/foundation/interaction/MutableInteractionSource;", "getEndInteractionSource", "material3_release"}, m5111k = 1, m5112mv = {1, 8, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
final class RangeSliderLogic {

    @NotNull
    private final MutableInteractionSource endInteractionSource;

    @NotNull
    private final MutableInteractionSource startInteractionSource;

    @NotNull
    private final RangeSliderState state;

    @Metadata(m5109d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m5110d2 = {"Lkotlinx/coroutines/v;", "Ld6/s;", "<anonymous>", "(Lkotlinx/coroutines/v;)V"}, m5111k = 3, m5112mv = {1, 8, 0})
    @DebugMetadata(m5302c = "androidx.compose.material3.RangeSliderLogic$captureThumb$1", m5303f = "Slider.kt", m5304i = {}, m5305l = {1739}, m5306m = "invokeSuspend", m5307n = {}, m5308s = {})
    /* renamed from: androidx.compose.material3.RangeSliderLogic$captureThumb$1 */
    public static final class C17781 extends SuspendLambda implements InterfaceC6473e {
        final /* synthetic */ boolean $draggingStart;
        final /* synthetic */ Interaction $interaction;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C17781(boolean z8, Interaction interaction, InterfaceC5631c<? super C17781> interfaceC5631c) {
            super(2, interfaceC5631c);
            this.$draggingStart = z8;
            this.$interaction = interaction;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final InterfaceC5631c<C5443s> create(@Nullable Object obj, @NotNull InterfaceC5631c<?> interfaceC5631c) {
            return RangeSliderLogic.this.new C17781(this.$draggingStart, this.$interaction, interfaceC5631c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                AbstractC5774b.m5119b(obj);
                MutableInteractionSource mutableInteractionSourceActiveInteraction = RangeSliderLogic.this.activeInteraction(this.$draggingStart);
                Interaction interaction = this.$interaction;
                this.label = 1;
                if (mutableInteractionSourceActiveInteraction.emit(interaction, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC5774b.m5119b(obj);
            }
            return C5443s.f8405a;
        }

        @Override // p152r6.InterfaceC6473e
        @Nullable
        public final Object invoke(@NotNull InterfaceC6009v interfaceC6009v, @Nullable InterfaceC5631c<? super C5443s> interfaceC5631c) {
            return ((C17781) create(interfaceC6009v, interfaceC5631c)).invokeSuspend(C5443s.f8405a);
        }
    }

    public RangeSliderLogic(@NotNull RangeSliderState rangeSliderState, @NotNull MutableInteractionSource mutableInteractionSource, @NotNull MutableInteractionSource mutableInteractionSource2) {
        this.state = rangeSliderState;
        this.startInteractionSource = mutableInteractionSource;
        this.endInteractionSource = mutableInteractionSource2;
    }

    @NotNull
    public final MutableInteractionSource activeInteraction(boolean draggingStart) {
        return draggingStart ? this.startInteractionSource : this.endInteractionSource;
    }

    public final void captureThumb(boolean draggingStart, float posX, @NotNull Interaction interaction, @NotNull InterfaceC6009v scope) {
        RangeSliderState rangeSliderState = this.state;
        rangeSliderState.onDrag$material3_release(draggingStart, posX - (draggingStart ? rangeSliderState.getRawOffsetStart$material3_release() : rangeSliderState.getRawOffsetEnd$material3_release()));
        AbstractC6014x.m5651v(scope, null, null, new C17781(draggingStart, interaction, null), 3);
    }

    public final int compareOffsets(float eventX) {
        return Float.compare(Math.abs(this.state.getRawOffsetStart$material3_release() - eventX), Math.abs(this.state.getRawOffsetEnd$material3_release() - eventX));
    }

    @NotNull
    public final MutableInteractionSource getEndInteractionSource() {
        return this.endInteractionSource;
    }

    @NotNull
    public final MutableInteractionSource getStartInteractionSource() {
        return this.startInteractionSource;
    }

    @NotNull
    public final RangeSliderState getState() {
        return this.state;
    }
}
