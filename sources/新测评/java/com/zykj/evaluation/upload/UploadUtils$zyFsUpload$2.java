package com.zykj.evaluation.upload;

import android.util.Log;
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
import kotlinx.coroutines.CoroutineScope;
import p011a9.C0059v;
import p011a9.C0060w;

@Metadata(m13557d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m13558d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m13559k = 3, m13560mv = {2, 2, 0}, m13562xi = 48)
@DebugMetadata(m13595c = "com.zykj.evaluation.upload.UploadUtils$zyFsUpload$2", m13596f = "UploadUtils.kt", m13597i = {}, m13598l = {}, m13599m = "invokeSuspend", m13600n = {}, m13601s = {})
/* loaded from: classes4.dex */
public final class UploadUtils$zyFsUpload$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Boolean>, Object> {

    /* renamed from: a */
    public int f10493a;

    /* renamed from: b */
    public final /* synthetic */ C0060w f10494b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UploadUtils$zyFsUpload$2(C0060w c0060w, Continuation continuation) {
        super(2, continuation);
        this.f10494b = c0060w;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new UploadUtils$zyFsUpload$2(this.f10494b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Boolean> continuation) {
        return invoke2(coroutineScope, (Continuation) continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objM24299constructorimpl;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.f10493a != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        C0060w c0060w = this.f10494b;
        try {
            Result.Companion companion = Result.INSTANCE;
            objM24299constructorimpl = Result.m24299constructorimpl(new C0059v().mo109b(c0060w).execute());
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM24299constructorimpl = Result.m24299constructorimpl(ResultKt.createFailure(th));
        }
        Throwable thM24302exceptionOrNullimpl = Result.m24302exceptionOrNullimpl(objM24299constructorimpl);
        if (thM24302exceptionOrNullimpl != null) {
            String message = thM24302exceptionOrNullimpl.getMessage();
            if (message == null) {
                message = "";
            }
            Log.i("UploadDataWork", message);
        }
        return Boxing.boxBoolean(Result.m24306isSuccessimpl(objM24299constructorimpl));
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation continuation) {
        return ((UploadUtils$zyFsUpload$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
