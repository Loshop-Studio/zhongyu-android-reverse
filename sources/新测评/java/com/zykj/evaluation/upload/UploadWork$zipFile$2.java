package com.zykj.evaluation.upload;

import com.blankj.utilcode.util.ZipUtils;
import java.io.File;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

@Metadata(m13557d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\n"}, m13558d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m13559k = 3, m13560mv = {2, 2, 0}, m13562xi = 48)
@DebugMetadata(m13595c = "com.zykj.evaluation.upload.UploadWork$zipFile$2", m13596f = "UploadWork.kt", m13597i = {}, m13598l = {}, m13599m = "invokeSuspend", m13600n = {}, m13601s = {})
/* loaded from: classes4.dex */
public final class UploadWork$zipFile$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super String>, Object> {

    /* renamed from: a */
    public int f10528a;

    /* renamed from: b */
    public final /* synthetic */ String f10529b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UploadWork$zipFile$2(String str, Continuation continuation) {
        super(2, continuation);
        this.f10529b = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new UploadWork$zipFile$2(this.f10529b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super String> continuation) {
        return invoke2(coroutineScope, (Continuation) continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.f10528a != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        try {
            File file = new File(this.f10529b);
            File file2 = new File(file.getParent(), file.getName() + ".zip");
            File[] fileArrListFiles = file.listFiles();
            if (ZipUtils.zipFiles(fileArrListFiles != null ? ArraysKt.toList(fileArrListFiles) : null, file2)) {
                return file2.getAbsolutePath();
            }
        } catch (IOException e10) {
            e10.printStackTrace();
        }
        return null;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation continuation) {
        return ((UploadWork$zipFile$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
