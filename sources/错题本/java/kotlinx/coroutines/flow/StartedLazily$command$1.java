package kotlinx.coroutines.flow;

import kotlin.AbstractC5774b;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$BooleanRef;
import p045d6.C5443s;
import p075h6.InterfaceC5631c;
import p152r6.InterfaceC6473e;

@Metadata(m5109d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m5110d2 = {"Lkotlinx/coroutines/flow/g;", "Lkotlinx/coroutines/flow/SharingCommand;", "Ld6/s;", "<anonymous>", "(Lkotlinx/coroutines/flow/g;)V"}, m5111k = 3, m5112mv = {2, 1, 0})
@DebugMetadata(m5302c = "kotlinx.coroutines.flow.StartedLazily$command$1", m5303f = "SharingStarted.kt", m5304i = {}, m5305l = {151}, m5306m = "invokeSuspend", m5307n = {}, m5308s = {})
/* loaded from: classes4.dex */
final class StartedLazily$command$1 extends SuspendLambda implements InterfaceC6473e {
    final /* synthetic */ InterfaceC5944m0 $subscriptionCount;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StartedLazily$command$1(InterfaceC5944m0 interfaceC5944m0, InterfaceC5631c<? super StartedLazily$command$1> interfaceC5631c) {
        super(2, interfaceC5631c);
        this.$subscriptionCount = interfaceC5944m0;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5631c<C5443s> create(Object obj, InterfaceC5631c<?> interfaceC5631c) {
        StartedLazily$command$1 startedLazily$command$1 = new StartedLazily$command$1(this.$subscriptionCount, interfaceC5631c);
        startedLazily$command$1.L$0 = obj;
        return startedLazily$command$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC5774b.m5119b(obj);
            InterfaceC5912g interfaceC5912g = (InterfaceC5912g) this.L$0;
            Ref$BooleanRef ref$BooleanRef = new Ref$BooleanRef();
            InterfaceC5944m0 interfaceC5944m0 = this.$subscriptionCount;
            C5938j0 c5938j0 = new C5938j0(ref$BooleanRef, interfaceC5912g);
            this.label = 1;
            if (interfaceC5944m0.collect(c5938j0, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC5774b.m5119b(obj);
        }
        throw new KotlinNothingValueException();
    }

    @Override // p152r6.InterfaceC6473e
    public final Object invoke(InterfaceC5912g interfaceC5912g, InterfaceC5631c<? super C5443s> interfaceC5631c) {
        return ((StartedLazily$command$1) create(interfaceC5912g, interfaceC5631c)).invokeSuspend(C5443s.f8405a);
    }
}
