package androidx.navigation.compose;

import androidx.compose.animation.core.SeekableTransitionState;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.State;
import androidx.navigation.NavBackStackEntry;
import java.util.List;
import kotlin.AbstractC5774b;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.InterfaceC6009v;
import p045d6.C5443s;
import p075h6.InterfaceC5631c;
import p152r6.InterfaceC6473e;

@Metadata(m5109d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m5110d2 = {"Lkotlinx/coroutines/v;", "Ld6/s;", "<anonymous>", "(Lkotlinx/coroutines/v;)V"}, m5111k = 3, m5112mv = {2, 0, 0})
@DebugMetadata(m5302c = "androidx.navigation.compose.NavHostKt$NavHost$28$1", m5303f = "NavHost.kt", m5304i = {}, m5305l = {620}, m5306m = "invokeSuspend", m5307n = {}, m5308s = {})
/* loaded from: classes2.dex */
public final class NavHostKt$NavHost$28$1 extends SuspendLambda implements InterfaceC6473e {
    final /* synthetic */ State<List<NavBackStackEntry>> $currentBackStack$delegate;
    final /* synthetic */ MutableFloatState $progress$delegate;
    final /* synthetic */ SeekableTransitionState<NavBackStackEntry> $transitionState;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public NavHostKt$NavHost$28$1(SeekableTransitionState<NavBackStackEntry> seekableTransitionState, State<? extends List<NavBackStackEntry>> state, MutableFloatState mutableFloatState, InterfaceC5631c<? super NavHostKt$NavHost$28$1> interfaceC5631c) {
        super(2, interfaceC5631c);
        this.$transitionState = seekableTransitionState;
        this.$currentBackStack$delegate = state;
        this.$progress$delegate = mutableFloatState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5631c<C5443s> create(Object obj, InterfaceC5631c<?> interfaceC5631c) {
        return new NavHostKt$NavHost$28$1(this.$transitionState, this.$currentBackStack$delegate, this.$progress$delegate, interfaceC5631c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC5774b.m5119b(obj);
            NavBackStackEntry navBackStackEntry = (NavBackStackEntry) NavHostKt.NavHost$lambda$38(this.$currentBackStack$delegate).get(NavHostKt.NavHost$lambda$38(this.$currentBackStack$delegate).size() - 2);
            SeekableTransitionState<NavBackStackEntry> seekableTransitionState = this.$transitionState;
            float floatValue = this.$progress$delegate.getFloatValue();
            this.label = 1;
            if (seekableTransitionState.seekTo(floatValue, navBackStackEntry, this) == coroutineSingletons) {
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
    public final Object invoke(InterfaceC6009v interfaceC6009v, InterfaceC5631c<? super C5443s> interfaceC5631c) {
        return ((NavHostKt$NavHost$28$1) create(interfaceC6009v, interfaceC5631c)).invokeSuspend(C5443s.f8405a);
    }
}
