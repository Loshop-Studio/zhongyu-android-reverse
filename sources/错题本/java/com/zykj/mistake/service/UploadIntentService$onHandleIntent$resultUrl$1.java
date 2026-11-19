package com.zykj.mistake.service;

import com.zykj.mistake.entity.resp.GeneratorResp;
import com.zykj.mistake.utils.C5107l;
import kotlin.AbstractC5774b;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC5830k;
import kotlinx.coroutines.InterfaceC6009v;
import p045d6.C5443s;
import p075h6.InterfaceC5631c;
import p152r6.InterfaceC6473e;

@Metadata(m5109d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m5110d2 = {"Lkotlinx/coroutines/v;", "", "<anonymous>", "(Lkotlinx/coroutines/v;)Ljava/lang/String;"}, m5111k = 3, m5112mv = {2, 2, 0})
@DebugMetadata(m5302c = "com.zykj.mistake.service.UploadIntentService$onHandleIntent$resultUrl$1", m5303f = "UploadIntentService.kt", m5304i = {}, m5305l = {111}, m5306m = "invokeSuspend", m5307n = {}, m5308s = {})
/* loaded from: classes3.dex */
final class UploadIntentService$onHandleIntent$resultUrl$1 extends SuspendLambda implements InterfaceC6473e {
    final /* synthetic */ String $localPath;
    final /* synthetic */ String $objectKey;
    final /* synthetic */ GeneratorResp $resp;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UploadIntentService$onHandleIntent$resultUrl$1(String str, String str2, GeneratorResp generatorResp, InterfaceC5631c<? super UploadIntentService$onHandleIntent$resultUrl$1> interfaceC5631c) {
        super(2, interfaceC5631c);
        this.$localPath = str;
        this.$objectKey = str2;
        this.$resp = generatorResp;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5631c<C5443s> create(Object obj, InterfaceC5631c<?> interfaceC5631c) {
        return new UploadIntentService$onHandleIntent$resultUrl$1(this.$localPath, this.$objectKey, this.$resp, interfaceC5631c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
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
        String str = this.$localPath;
        String str2 = this.$objectKey;
        GeneratorResp.Credential result = this.$resp.getResult();
        AbstractC5830k.m5327d(result);
        this.label = 1;
        Object objM4475a = C5107l.f8051a.m4475a(str, str2, result, this);
        return objM4475a == coroutineSingletons ? coroutineSingletons : objM4475a;
    }

    @Override // p152r6.InterfaceC6473e
    public final Object invoke(InterfaceC6009v interfaceC6009v, InterfaceC5631c<? super String> interfaceC5631c) {
        return ((UploadIntentService$onHandleIntent$resultUrl$1) create(interfaceC6009v, interfaceC5631c)).invokeSuspend(C5443s.f8405a);
    }
}
