package com.zykj.mistake.utils;

import com.alibaba.sdk.android.oss.OSSClient;
import com.alibaba.sdk.android.oss.model.PutObjectRequest;
import com.blankj.utilcode.util.AbstractC3387g;
import com.tencent.bugly.crashreport.CrashReport;
import kotlin.AbstractC5774b;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.InterfaceC6009v;
import p045d6.C5443s;
import p075h6.InterfaceC5631c;
import p152r6.InterfaceC6473e;

@Metadata(m5109d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m5110d2 = {"Lkotlinx/coroutines/v;", "", "<anonymous>", "(Lkotlinx/coroutines/v;)Z"}, m5111k = 3, m5112mv = {2, 2, 0})
@DebugMetadata(m5302c = "com.zykj.mistake.utils.UploadUtils$ossUpload$2", m5303f = "UploadUtils.kt", m5304i = {}, m5305l = {}, m5306m = "invokeSuspend", m5307n = {}, m5308s = {})
@SourceDebugExtension({"SMAP\nUploadUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UploadUtils.kt\ncom/zykj/mistake/utils/UploadUtils$ossUpload$2\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,152:1\n1#2:153\n*E\n"})
/* loaded from: classes3.dex */
final class UploadUtils$ossUpload$2 extends SuspendLambda implements InterfaceC6473e {
    final /* synthetic */ String $localPath;
    final /* synthetic */ OSSClient $ossClient;
    final /* synthetic */ PutObjectRequest $request;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UploadUtils$ossUpload$2(OSSClient oSSClient, PutObjectRequest putObjectRequest, String str, InterfaceC5631c<? super UploadUtils$ossUpload$2> interfaceC5631c) {
        super(2, interfaceC5631c);
        this.$ossClient = oSSClient;
        this.$request = putObjectRequest;
        this.$localPath = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5631c<C5443s> create(Object obj, InterfaceC5631c<?> interfaceC5631c) {
        UploadUtils$ossUpload$2 uploadUtils$ossUpload$2 = new UploadUtils$ossUpload$2(this.$ossClient, this.$request, this.$localPath, interfaceC5631c);
        uploadUtils$ossUpload$2.L$0 = obj;
        return uploadUtils$ossUpload$2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objM13956constructorimpl;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        AbstractC5774b.m5119b(obj);
        OSSClient oSSClient = this.$ossClient;
        PutObjectRequest putObjectRequest = this.$request;
        String str = this.$localPath;
        try {
            oSSClient.putObject(putObjectRequest);
            AbstractC3387g.m2342e("end ossUpload--->" + str);
            objM13956constructorimpl = Result.m13956constructorimpl(C5443s.f8405a);
        } catch (Throwable th) {
            objM13956constructorimpl = Result.m13956constructorimpl(AbstractC5774b.m5118a(th));
        }
        Throwable thM13959exceptionOrNullimpl = Result.m13959exceptionOrNullimpl(objM13956constructorimpl);
        if (thM13959exceptionOrNullimpl != null) {
            CrashReport.postCatchedException(thM13959exceptionOrNullimpl);
            String message = thM13959exceptionOrNullimpl.getMessage();
            if (message != null) {
                AbstractC3387g.m2339b(message);
            }
        }
        return Boolean.valueOf(Result.m13962isSuccessimpl(objM13956constructorimpl));
    }

    @Override // p152r6.InterfaceC6473e
    public final Object invoke(InterfaceC6009v interfaceC6009v, InterfaceC5631c<? super Boolean> interfaceC5631c) {
        return ((UploadUtils$ossUpload$2) create(interfaceC6009v, interfaceC5631c)).invokeSuspend(C5443s.f8405a);
    }
}
