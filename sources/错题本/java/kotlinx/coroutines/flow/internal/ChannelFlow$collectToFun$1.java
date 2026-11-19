package kotlinx.coroutines.flow.internal;

import androidx.exifinterface.media.ExifInterface;
import kotlin.AbstractC5774b;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.channels.InterfaceC5884m;
import p045d6.C5443s;
import p075h6.InterfaceC5631c;
import p152r6.InterfaceC6473e;

@Metadata(m5109d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m5110d2 = {ExifInterface.GPS_DIRECTION_TRUE, "Lkotlinx/coroutines/channels/m;", "it", "Ld6/s;", "<anonymous>", "(Lkotlinx/coroutines/channels/m;)V"}, m5111k = 3, m5112mv = {2, 1, 0})
@DebugMetadata(m5302c = "kotlinx.coroutines.flow.internal.ChannelFlow$collectToFun$1", m5303f = "ChannelFlow.kt", m5304i = {}, m5305l = {56}, m5306m = "invokeSuspend", m5307n = {}, m5308s = {})
/* loaded from: classes4.dex */
final class ChannelFlow$collectToFun$1 extends SuspendLambda implements InterfaceC6473e {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ AbstractC5922d this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChannelFlow$collectToFun$1(AbstractC5922d abstractC5922d, InterfaceC5631c<? super ChannelFlow$collectToFun$1> interfaceC5631c) {
        super(2, interfaceC5631c);
        this.this$0 = abstractC5922d;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5631c<C5443s> create(Object obj, InterfaceC5631c<?> interfaceC5631c) {
        ChannelFlow$collectToFun$1 channelFlow$collectToFun$1 = new ChannelFlow$collectToFun$1(this.this$0, interfaceC5631c);
        channelFlow$collectToFun$1.L$0 = obj;
        return channelFlow$collectToFun$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC5774b.m5119b(obj);
            InterfaceC5884m interfaceC5884m = (InterfaceC5884m) this.L$0;
            AbstractC5922d abstractC5922d = this.this$0;
            this.label = 1;
            if (abstractC5922d.mo5521e(interfaceC5884m, this) == coroutineSingletons) {
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
    public final Object invoke(InterfaceC5884m interfaceC5884m, InterfaceC5631c<? super C5443s> interfaceC5631c) {
        return ((ChannelFlow$collectToFun$1) create(interfaceC5884m, interfaceC5631c)).invokeSuspend(C5443s.f8405a);
    }
}
