package coil3.intercept;

import coil3.AbstractC3297h;
import coil3.C3259d;
import kotlin.AbstractC5774b;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.InterfaceC6009v;
import p045d6.C5443s;
import p075h6.InterfaceC5631c;
import p119n.C6206k;
import p119n.InterfaceC6200e;
import p152r6.InterfaceC6473e;
import p154s.C6532f;
import p154s.C6538l;

@Metadata(m5109d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m5110d2 = {"Lkotlinx/coroutines/v;", "Lcoil3/intercept/a;", "<anonymous>", "(Lkotlinx/coroutines/v;)Lcoil3/intercept/a;"}, m5111k = 3, m5112mv = {2, 1, 0})
@DebugMetadata(m5302c = "coil3.intercept.EngineInterceptor$execute$executeResult$1", m5303f = "EngineInterceptor.kt", m5304i = {}, m5305l = {131}, m5306m = "invokeSuspend", m5307n = {}, m5308s = {})
/* loaded from: classes2.dex */
final class EngineInterceptor$execute$executeResult$1 extends SuspendLambda implements InterfaceC6473e {
    final /* synthetic */ Ref$ObjectRef<C3259d> $components;
    final /* synthetic */ AbstractC3297h $eventListener;
    final /* synthetic */ Ref$ObjectRef<InterfaceC6200e> $fetchResult;
    final /* synthetic */ Object $mappedData;
    final /* synthetic */ Ref$ObjectRef<C6538l> $options;
    final /* synthetic */ C6532f $request;
    int label;
    final /* synthetic */ C3300b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EngineInterceptor$execute$executeResult$1(C3300b c3300b, Ref$ObjectRef<InterfaceC6200e> ref$ObjectRef, Ref$ObjectRef<C3259d> ref$ObjectRef2, C6532f c6532f, Object obj, Ref$ObjectRef<C6538l> ref$ObjectRef3, AbstractC3297h abstractC3297h, InterfaceC5631c<? super EngineInterceptor$execute$executeResult$1> interfaceC5631c) {
        super(2, interfaceC5631c);
        this.this$0 = c3300b;
        this.$fetchResult = ref$ObjectRef;
        this.$components = ref$ObjectRef2;
        this.$request = c6532f;
        this.$mappedData = obj;
        this.$options = ref$ObjectRef3;
        this.$eventListener = abstractC3297h;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5631c<C5443s> create(Object obj, InterfaceC5631c<?> interfaceC5631c) {
        return new EngineInterceptor$execute$executeResult$1(this.this$0, this.$fetchResult, this.$components, this.$request, this.$mappedData, this.$options, this.$eventListener, interfaceC5631c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC5774b.m5119b(obj);
            return obj;
        }
        AbstractC5774b.m5119b(obj);
        C3300b c3300b = this.this$0;
        C6206k c6206k = (C6206k) this.$fetchResult.element;
        C3259d c3259d = this.$components.element;
        C6532f c6532f = this.$request;
        Object obj2 = this.$mappedData;
        C6538l c6538l = this.$options.element;
        AbstractC3297h abstractC3297h = this.$eventListener;
        this.label = 1;
        Object objM2226a = C3300b.m2226a(c3300b, c6206k, c3259d, c6532f, obj2, c6538l, abstractC3297h, this);
        return objM2226a == coroutineSingletons ? coroutineSingletons : objM2226a;
    }

    @Override // p152r6.InterfaceC6473e
    public final Object invoke(InterfaceC6009v interfaceC6009v, InterfaceC5631c<? super C3299a> interfaceC5631c) {
        return ((EngineInterceptor$execute$executeResult$1) create(interfaceC6009v, interfaceC5631c)).invokeSuspend(C5443s.f8405a);
    }
}
