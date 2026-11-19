package com.zykj.insight.network;

import com.zykj.http.bean.HeaderBean;
import com.zykj.message.client.MessageClient;
import com.zykj.message.server.bean.ServerInfo;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

@Metadata(m5174d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m5175d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, m5176k = 3, m5177mv = {1, 8, 0})
@DebugMetadata(m5191c = "com.zykj.insight.network.RefreshRepositoryImpl$refreshToken$2", m5192f = "RefreshRepositoryImpl.kt", m5193i = {}, m5194l = {}, m5195m = "invokeSuspend", m5196n = {}, m5197s = {})
/* loaded from: classes2.dex */
public final class RefreshRepositoryImpl$refreshToken$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* renamed from: a */
    public int f4168a;

    /* renamed from: b */
    public final /* synthetic */ RefreshRepositoryImpl f4169b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RefreshRepositoryImpl$refreshToken$2(RefreshRepositoryImpl refreshRepositoryImpl, Continuation continuation) {
        super(2, continuation);
        this.f4169b = refreshRepositoryImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new RefreshRepositoryImpl$refreshToken$2(this.f4169b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return invoke2(coroutineScope, (Continuation) continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.f4168a != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        MessageClient messageClient = MessageClient.f4242a;
        final RefreshRepositoryImpl refreshRepositoryImpl = this.f4169b;
        messageClient.mo4633c(new Function1<ServerInfo, Unit>() { // from class: com.zykj.insight.network.RefreshRepositoryImpl$refreshToken$2.1
            {
                super(1);
            }

            /* renamed from: a */
            public final void m4606a(ServerInfo serverInfo) {
                HeaderBean headerBeanCopy$default;
                if (serverInfo != null) {
                    RefreshRepositoryImpl refreshRepositoryImpl2 = refreshRepositoryImpl;
                    HeaderBean value = refreshRepositoryImpl2.f4161a.getValue();
                    if (value != null && (headerBeanCopy$default = HeaderBean.copy$default(value, null, null, null, serverInfo.m4656e(), null, 23, null)) != null) {
                        refreshRepositoryImpl2.f4161a.postValue(headerBeanCopy$default);
                    }
                    refreshRepositoryImpl2.f4163c.insert(0, serverInfo.m4656e());
                    int iHashCode = refreshRepositoryImpl2.hashCode();
                    StringBuilder sb = new StringBuilder();
                    sb.append(iHashCode);
                    sb.append(" token获取成功");
                }
                refreshRepositoryImpl.f4162b.compareAndSet(true, false);
                int iHashCode2 = refreshRepositoryImpl.hashCode();
                StringBuilder sb2 = new StringBuilder();
                sb2.append(iHashCode2);
                sb2.append(" token获取失败");
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(ServerInfo serverInfo) {
                m4606a(serverInfo);
                return Unit.INSTANCE;
            }
        });
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation continuation) {
        return ((RefreshRepositoryImpl$refreshToken$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
