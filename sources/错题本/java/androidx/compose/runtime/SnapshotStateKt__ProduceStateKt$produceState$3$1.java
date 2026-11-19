package androidx.compose.runtime;

import androidx.exifinterface.media.ExifInterface;
import kotlin.AbstractC5774b;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.InterfaceC6009v;
import p045d6.C5443s;
import p075h6.InterfaceC5631c;
import p152r6.InterfaceC6473e;

@Metadata(m5109d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, m5110d2 = {ExifInterface.GPS_DIRECTION_TRUE, "Lkotlinx/coroutines/v;", "Ld6/s;", "<anonymous>", "(Lkotlinx/coroutines/v;)V"}, m5111k = 3, m5112mv = {1, 9, 0})
@DebugMetadata(m5302c = "androidx.compose.runtime.SnapshotStateKt__ProduceStateKt$produceState$3$1", m5303f = "ProduceState.kt", m5304i = {}, m5305l = {138}, m5306m = "invokeSuspend", m5307n = {}, m5308s = {})
/* loaded from: classes.dex */
public final class SnapshotStateKt__ProduceStateKt$produceState$3$1 extends SuspendLambda implements InterfaceC6473e {
    final /* synthetic */ InterfaceC6473e $producer;
    final /* synthetic */ MutableState<T> $result;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SnapshotStateKt__ProduceStateKt$produceState$3$1(InterfaceC6473e interfaceC6473e, MutableState<T> mutableState, InterfaceC5631c<? super SnapshotStateKt__ProduceStateKt$produceState$3$1> interfaceC5631c) {
        super(2, interfaceC5631c);
        this.$producer = interfaceC6473e;
        this.$result = mutableState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5631c<C5443s> create(Object obj, InterfaceC5631c<?> interfaceC5631c) {
        SnapshotStateKt__ProduceStateKt$produceState$3$1 snapshotStateKt__ProduceStateKt$produceState$3$1 = new SnapshotStateKt__ProduceStateKt$produceState$3$1(this.$producer, this.$result, interfaceC5631c);
        snapshotStateKt__ProduceStateKt$produceState$3$1.L$0 = obj;
        return snapshotStateKt__ProduceStateKt$produceState$3$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC5774b.m5119b(obj);
            InterfaceC6009v interfaceC6009v = (InterfaceC6009v) this.L$0;
            InterfaceC6473e interfaceC6473e = this.$producer;
            ProduceStateScopeImpl produceStateScopeImpl = new ProduceStateScopeImpl(this.$result, interfaceC6009v.getCoroutineContext());
            this.label = 1;
            if (interfaceC6473e.invoke(produceStateScopeImpl, this) == coroutineSingletons) {
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
        return ((SnapshotStateKt__ProduceStateKt$produceState$3$1) create(interfaceC6009v, interfaceC5631c)).invokeSuspend(C5443s.f8405a);
    }
}
