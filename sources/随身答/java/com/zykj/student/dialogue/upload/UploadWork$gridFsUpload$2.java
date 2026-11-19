package com.zykj.student.dialogue.upload;

import android.util.Log;
import androidx.constraintlayout.widget.ConstraintLayout;
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
import p172l8.C8923v;
import p172l8.C8924w;

@Metadata(m13412d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m13413d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m13414k = 3, m13415mv = {2, 2, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@DebugMetadata(m13450c = "com.zykj.student.dialogue.upload.UploadWork$gridFsUpload$2", m13451f = "UploadWork.kt", m13452i = {}, m13453l = {}, m13454m = "invokeSuspend", m13455n = {}, m13456s = {})
/* loaded from: classes5.dex */
public final class UploadWork$gridFsUpload$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Boolean>, Object> {

    /* renamed from: a */
    public int f11966a;

    /* renamed from: b */
    public final /* synthetic */ C8924w f11967b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UploadWork$gridFsUpload$2(C8924w c8924w, Continuation continuation) {
        super(2, continuation);
        this.f11967b = c8924w;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new UploadWork$gridFsUpload$2(this.f11967b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Boolean> continuation) {
        return invoke2(coroutineScope, (Continuation) continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objM24758constructorimpl;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.f11966a != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        C8924w c8924w = this.f11967b;
        try {
            Result.Companion companion = Result.INSTANCE;
            objM24758constructorimpl = Result.m24758constructorimpl(new C8923v().mo13868b(c8924w).execute());
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM24758constructorimpl = Result.m24758constructorimpl(ResultKt.createFailure(th));
        }
        Throwable thM24761exceptionOrNullimpl = Result.m24761exceptionOrNullimpl(objM24758constructorimpl);
        if (thM24761exceptionOrNullimpl != null) {
            String message = thM24761exceptionOrNullimpl.getMessage();
            if (message == null) {
                message = "";
            }
            Log.i("UploadDataWork", message);
        }
        return Boxing.boxBoolean(Result.m24765isSuccessimpl(objM24758constructorimpl));
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation continuation) {
        return ((UploadWork$gridFsUpload$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
