package androidx.compose.material3;

import kotlin.AbstractC5774b;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.InterfaceC6009v;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p045d6.C5443s;
import p075h6.InterfaceC5631c;
import p152r6.InterfaceC6474f;

@Metadata(m5109d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, m5110d2 = {"Lkotlinx/coroutines/v;", "", "it", "Ld6/s;", "<anonymous>", "(Lkotlinx/coroutines/v;F)V"}, m5111k = 3, m5112mv = {1, 8, 0})
@DebugMetadata(m5302c = "androidx.compose.material3.SliderKt$SliderImpl$drag$1$1", m5303f = "Slider.kt", m5304i = {}, m5305l = {}, m5306m = "invokeSuspend", m5307n = {}, m5308s = {})
/* loaded from: classes.dex */
public final class SliderKt$SliderImpl$drag$1$1 extends SuspendLambda implements InterfaceC6474f {
    final /* synthetic */ SliderState $state;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SliderKt$SliderImpl$drag$1$1(SliderState sliderState, InterfaceC5631c<? super SliderKt$SliderImpl$drag$1$1> interfaceC5631c) {
        super(3, interfaceC5631c);
        this.$state = sliderState;
    }

    @Override // p152r6.InterfaceC6474f
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return invoke((InterfaceC6009v) obj, ((Number) obj2).floatValue(), (InterfaceC5631c<? super C5443s>) obj3);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        AbstractC5774b.m5119b(obj);
        this.$state.getGestureEndAction().invoke();
        return C5443s.f8405a;
    }

    @Nullable
    public final Object invoke(@NotNull InterfaceC6009v interfaceC6009v, float f, @Nullable InterfaceC5631c<? super C5443s> interfaceC5631c) {
        return new SliderKt$SliderImpl$drag$1$1(this.$state, interfaceC5631c).invokeSuspend(C5443s.f8405a);
    }
}
