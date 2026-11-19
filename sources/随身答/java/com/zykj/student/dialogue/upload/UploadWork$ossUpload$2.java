package com.zykj.student.dialogue.upload;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.alibaba.sdk.android.oss.OSSClient;
import com.alibaba.sdk.android.oss.model.PutObjectRequest;
import com.blankj.utilcode.util.LogUtils;
import java.io.File;
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

@Metadata(m13412d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m13413d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m13414k = 3, m13415mv = {2, 2, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@DebugMetadata(m13450c = "com.zykj.student.dialogue.upload.UploadWork$ossUpload$2", m13451f = "UploadWork.kt", m13452i = {}, m13453l = {}, m13454m = "invokeSuspend", m13455n = {}, m13456s = {})
@SourceDebugExtension({"SMAP\nUploadWork.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UploadWork.kt\ncom/zykj/student/dialogue/upload/UploadWork$ossUpload$2\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,374:1\n1#2:375\n*E\n"})
/* loaded from: classes5.dex */
public final class UploadWork$ossUpload$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Boolean>, Object> {

    /* renamed from: a */
    public int f11968a;

    /* renamed from: b */
    public final /* synthetic */ OSSClient f11969b;

    /* renamed from: c */
    public final /* synthetic */ PutObjectRequest f11970c;

    /* renamed from: d */
    public final /* synthetic */ File f11971d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UploadWork$ossUpload$2(OSSClient oSSClient, PutObjectRequest putObjectRequest, File file, Continuation continuation) {
        super(2, continuation);
        this.f11969b = oSSClient;
        this.f11970c = putObjectRequest;
        this.f11971d = file;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new UploadWork$ossUpload$2(this.f11969b, this.f11970c, this.f11971d, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Boolean> continuation) {
        return invoke2(coroutineScope, (Continuation) continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objM24758constructorimpl;
        String message;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.f11968a != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        OSSClient oSSClient = this.f11969b;
        PutObjectRequest putObjectRequest = this.f11970c;
        File file = this.f11971d;
        try {
            Result.Companion companion = Result.INSTANCE;
            oSSClient.putObject(putObjectRequest);
            LogUtils.m2956i("end ossUpload--->" + file);
            objM24758constructorimpl = Result.m24758constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM24758constructorimpl = Result.m24758constructorimpl(ResultKt.createFailure(th));
        }
        Throwable thM24761exceptionOrNullimpl = Result.m24761exceptionOrNullimpl(objM24758constructorimpl);
        if (thM24761exceptionOrNullimpl != null && (message = thM24761exceptionOrNullimpl.getMessage()) != null) {
            LogUtils.m2955e("上传失败 -> " + message);
        }
        return Boxing.boxBoolean(Result.m24765isSuccessimpl(objM24758constructorimpl));
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation continuation) {
        return ((UploadWork$ossUpload$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
