package com.zykj.evaluation.p057ui.detail.toCorrect;

import android.graphics.Bitmap;
import com.blankj.utilcode.util.ImageUtils;
import com.blankj.utilcode.util.LogUtils;
import com.zykj.evaluation.bean.UploadData;
import java.io.File;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.CoroutineScope;
import p167m5.AbstractC8555e;

@Metadata(m13557d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m13558d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m13559k = 3, m13560mv = {2, 2, 0}, m13562xi = 48)
@DebugMetadata(m13595c = "com.zykj.evaluation.ui.detail.toCorrect.ToCorrectDetailViewModel$commitAnswer$2$2", m13596f = "ToCorrectDetailViewModel.kt", m13597i = {}, m13598l = {}, m13599m = "invokeSuspend", m13600n = {}, m13601s = {})
/* loaded from: classes4.dex */
public final class ToCorrectDetailViewModel$commitAnswer$2$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* renamed from: a */
    public int f9398a;

    /* renamed from: b */
    public final /* synthetic */ ToCorrectDetailViewModel f9399b;

    /* renamed from: c */
    public final /* synthetic */ Bitmap f9400c;

    /* renamed from: d */
    public final /* synthetic */ Ref.ObjectRef f9401d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ToCorrectDetailViewModel$commitAnswer$2$2(ToCorrectDetailViewModel toCorrectDetailViewModel, Bitmap bitmap, Ref.ObjectRef objectRef, Continuation continuation) {
        super(2, continuation);
        this.f9399b = toCorrectDetailViewModel;
        this.f9400c = bitmap;
        this.f9401d = objectRef;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ToCorrectDetailViewModel$commitAnswer$2$2(this.f9399b, this.f9400c, this.f9401d, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return invoke2(coroutineScope, (Continuation) continuation);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v5, types: [T, com.zykj.evaluation.bean.UploadData] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.f9398a != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        File file = new File(this.f9399b.m9268K().m12463i(this.f9399b.m9274Q()), UUID.randomUUID() + ".webp");
        ImageUtils.save(this.f9400c, file, Bitmap.CompressFormat.WEBP, true);
        LogUtils.m3237d("清理旧草稿图片,DraftSave", "图片保存地址: " + file.getAbsolutePath() + " ");
        Ref.ObjectRef objectRef = this.f9401d;
        UploadData uploadData = (UploadData) objectRef.element;
        String absolutePath = file.getAbsolutePath();
        Intrinsics.checkNotNullExpressionValue(absolutePath, "getAbsolutePath(...)");
        objectRef.element = UploadData.copy$default(uploadData, null, absolutePath, null, AbstractC8555e.c.f14191b.m14097a(), 5, null);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation continuation) {
        return ((ToCorrectDetailViewModel$commitAnswer$2$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
