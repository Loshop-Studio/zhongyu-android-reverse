package com.zykj.mistake.data;

import androidx.exifinterface.media.ExifInterface;
import com.zykj.mistake.network.ApiResp;
import kotlin.AbstractC5774b;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.InterfaceC6009v;
import p045d6.C5443s;
import p075h6.InterfaceC5631c;
import p152r6.InterfaceC6471c;
import p152r6.InterfaceC6473e;

@Metadata(m5109d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00028\u0000\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00020\u0002H\n"}, m5110d2 = {"Lcom/zykj/mistake/network/ApiResp;", ExifInterface.GPS_DIRECTION_TRUE, "Lkotlinx/coroutines/v;", "<anonymous>"}, m5111k = 3, m5112mv = {2, 2, 0})
@DebugMetadata(m5302c = "com.zykj.mistake.data.UiRequestRunnerKt$runApiRequest$resp$1", m5303f = "UiRequestRunner.kt", m5304i = {}, m5305l = {15}, m5306m = "invokeSuspend", m5307n = {}, m5308s = {})
/* loaded from: classes3.dex */
final class UiRequestRunnerKt$runApiRequest$resp$1 extends SuspendLambda implements InterfaceC6473e {
    final /* synthetic */ InterfaceC6471c $request;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UiRequestRunnerKt$runApiRequest$resp$1(InterfaceC6471c interfaceC6471c, InterfaceC5631c<? super UiRequestRunnerKt$runApiRequest$resp$1> interfaceC5631c) {
        super(2, interfaceC5631c);
        this.$request = interfaceC6471c;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5631c<C5443s> create(Object obj, InterfaceC5631c<?> interfaceC5631c) {
        return new UiRequestRunnerKt$runApiRequest$resp$1(this.$request, interfaceC5631c);
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
        InterfaceC6471c interfaceC6471c = this.$request;
        this.label = 1;
        Object objInvoke = interfaceC6471c.invoke(this);
        return objInvoke == coroutineSingletons ? coroutineSingletons : objInvoke;
    }

    @Override // p152r6.InterfaceC6473e
    public final Object invoke(InterfaceC6009v interfaceC6009v, InterfaceC5631c<ApiResp> interfaceC5631c) {
        return ((UiRequestRunnerKt$runApiRequest$resp$1) create(interfaceC6009v, interfaceC5631c)).invokeSuspend(C5443s.f8405a);
    }
}
