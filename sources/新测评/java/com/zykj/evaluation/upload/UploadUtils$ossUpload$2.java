package com.zykj.evaluation.upload;

import com.alibaba.sdk.android.oss.OSSClient;
import com.alibaba.sdk.android.oss.model.PutObjectRequest;
import com.blankj.utilcode.util.LogUtils;
import com.tencent.bugly.crashreport.CrashReport;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;

@Metadata(m13557d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m13558d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m13559k = 3, m13560mv = {2, 2, 0}, m13562xi = 48)
@DebugMetadata(m13595c = "com.zykj.evaluation.upload.UploadUtils$ossUpload$2", m13596f = "UploadUtils.kt", m13597i = {}, m13598l = {}, m13599m = "invokeSuspend", m13600n = {}, m13601s = {})
@SourceDebugExtension({"SMAP\nUploadUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UploadUtils.kt\ncom/zykj/evaluation/upload/UploadUtils$ossUpload$2\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,151:1\n1#2:152\n*E\n"})
/* loaded from: classes4.dex */
public final class UploadUtils$ossUpload$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Boolean>, Object> {

    /* renamed from: a */
    public int f10483a;

    /* renamed from: b */
    public final /* synthetic */ OSSClient f10484b;

    /* renamed from: c */
    public final /* synthetic */ PutObjectRequest f10485c;

    /* renamed from: d */
    public final /* synthetic */ String f10486d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UploadUtils$ossUpload$2(OSSClient oSSClient, PutObjectRequest putObjectRequest, String str, Continuation continuation) {
        super(2, continuation);
        this.f10484b = oSSClient;
        this.f10485c = putObjectRequest;
        this.f10486d = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new UploadUtils$ossUpload$2(this.f10484b, this.f10485c, this.f10486d, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Boolean> continuation) {
        return invoke2(coroutineScope, (Continuation) continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objM24299constructorimpl;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.f10483a != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        OSSClient oSSClient = this.f10484b;
        PutObjectRequest putObjectRequest = this.f10485c;
        String str = this.f10486d;
        try {
            Result.Companion companion = Result.INSTANCE;
            oSSClient.putObject(putObjectRequest);
            LogUtils.m3239i("end ossUpload--->" + str);
            objM24299constructorimpl = Result.m24299constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM24299constructorimpl = Result.m24299constructorimpl(ResultKt.createFailure(th));
        }
        Throwable thM24302exceptionOrNullimpl = Result.m24302exceptionOrNullimpl(objM24299constructorimpl);
        if (thM24302exceptionOrNullimpl != null) {
            CrashReport.postCatchedException(thM24302exceptionOrNullimpl);
            String message = thM24302exceptionOrNullimpl.getMessage();
            if (message != null) {
                LogUtils.m3238e(message);
            }
        }
        return Boxing.boxBoolean(Result.m24306isSuccessimpl(objM24299constructorimpl));
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation continuation) {
        return ((UploadUtils$ossUpload$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
