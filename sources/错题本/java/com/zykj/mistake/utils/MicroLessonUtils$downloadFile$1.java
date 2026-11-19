package com.zykj.mistake.utils;

import java.io.IOException;
import kotlin.AbstractC5774b;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.InterfaceC6009v;
import p045d6.C5443s;
import p075h6.InterfaceC5631c;
import p152r6.InterfaceC6469a;
import p152r6.InterfaceC6473e;

@Metadata(m5109d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m5110d2 = {"Lkotlinx/coroutines/v;", "Ld6/s;", "<anonymous>", "(Lkotlinx/coroutines/v;)V"}, m5111k = 3, m5112mv = {2, 2, 0})
@DebugMetadata(m5302c = "com.zykj.mistake.utils.MicroLessonUtils$downloadFile$1", m5303f = "MicroLessonUtils.kt", m5304i = {0}, m5305l = {127}, m5306m = "invokeSuspend", m5307n = {"$this$launch"}, m5308s = {"L$0"})
/* loaded from: classes3.dex */
final class MicroLessonUtils$downloadFile$1 extends SuspendLambda implements InterfaceC6473e {
    final /* synthetic */ InterfaceC6469a $failCallback;
    final /* synthetic */ InterfaceC6469a $successCallback;
    final /* synthetic */ String $url;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ C5103h this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MicroLessonUtils$downloadFile$1(String str, C5103h c5103h, InterfaceC6469a interfaceC6469a, InterfaceC6469a interfaceC6469a2, InterfaceC5631c<? super MicroLessonUtils$downloadFile$1> interfaceC5631c) {
        super(2, interfaceC5631c);
        this.$url = str;
        this.this$0 = c5103h;
        this.$successCallback = interfaceC6469a;
        this.$failCallback = interfaceC6469a2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5631c<C5443s> create(Object obj, InterfaceC5631c<?> interfaceC5631c) {
        MicroLessonUtils$downloadFile$1 microLessonUtils$downloadFile$1 = new MicroLessonUtils$downloadFile$1(this.$url, this.this$0, this.$successCallback, this.$failCallback, interfaceC5631c);
        microLessonUtils$downloadFile$1.L$0 = obj;
        return microLessonUtils$downloadFile$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws IOException {
        Object objM4472a;
        InterfaceC6009v interfaceC6009v = (InterfaceC6009v) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC5774b.m5119b(obj);
            String str = this.$url;
            String str2 = this.this$0.f8044a;
            MicroLessonUtils$downloadFile$1$result$1 microLessonUtils$downloadFile$1$result$1 = new MicroLessonUtils$downloadFile$1$result$1(null);
            this.L$0 = interfaceC6009v;
            this.label = 1;
            objM4472a = C5105j.f8047a.m4472a(str, str2, microLessonUtils$downloadFile$1$result$1, this);
            if (objM4472a == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC5774b.m5119b(obj);
            objM4472a = ((Result) obj).getValue();
        }
        if (((String) (Result.m13961isFailureimpl(objM4472a) ? null : objM4472a)) != null) {
            C5103h c5103h = this.this$0;
            InterfaceC6469a interfaceC6469a = this.$successCallback;
            InterfaceC6469a interfaceC6469a2 = this.$failCallback;
            c5103h.m4468c();
            if (c5103h.m4470e()) {
                interfaceC6469a.invoke();
            } else {
                interfaceC6469a2.invoke();
            }
        } else {
            this.$failCallback.invoke();
        }
        return C5443s.f8405a;
    }

    @Override // p152r6.InterfaceC6473e
    public final Object invoke(InterfaceC6009v interfaceC6009v, InterfaceC5631c<? super C5443s> interfaceC5631c) {
        return ((MicroLessonUtils$downloadFile$1) create(interfaceC6009v, interfaceC5631c)).invokeSuspend(C5443s.f8405a);
    }
}
