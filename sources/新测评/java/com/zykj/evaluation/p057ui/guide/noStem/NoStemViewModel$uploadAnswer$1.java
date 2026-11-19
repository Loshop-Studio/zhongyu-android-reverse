package com.zykj.evaluation.p057ui.guide.noStem;

import androidx.compose.runtime.ComposerKt;
import com.zykj.evaluation.bean.GuideTaskInfo;
import com.zykj.evaluation.bean.UploadData;
import com.zykj.evaluation.upload.OssTaskManger;
import com.zykj.message.server.bean.UserInfo;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import p167m5.AbstractC8555e;

@Metadata(m13557d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m13558d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m13559k = 3, m13560mv = {2, 2, 0}, m13562xi = 48)
@DebugMetadata(m13595c = "com.zykj.evaluation.ui.guide.noStem.NoStemViewModel$uploadAnswer$1", m13596f = "NoStemViewModel.kt", m13597i = {}, m13598l = {ComposerKt.reuseKey}, m13599m = "invokeSuspend", m13600n = {}, m13601s = {})
/* loaded from: classes4.dex */
public final class NoStemViewModel$uploadAnswer$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* renamed from: a */
    public int f9610a;

    /* renamed from: b */
    public final /* synthetic */ NoStemViewModel f9611b;

    /* renamed from: c */
    public final /* synthetic */ String f9612c;

    /* renamed from: d */
    public final /* synthetic */ String f9613d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NoStemViewModel$uploadAnswer$1(NoStemViewModel noStemViewModel, String str, String str2, Continuation continuation) {
        super(2, continuation);
        this.f9611b = noStemViewModel;
        this.f9612c = str;
        this.f9613d = str2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new NoStemViewModel$uploadAnswer$1(this.f9611b, this.f9612c, this.f9613d, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return invoke2(coroutineScope, (Continuation) continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i10 = this.f9610a;
        if (i10 == 0) {
            ResultKt.throwOnFailure(obj);
            OssTaskManger ossTaskManger = this.f9611b.ossTaskManger;
            Long lM10602a = ((UserInfo) this.f9611b.userInfo.getValue()).m10602a();
            Intrinsics.checkNotNullExpressionValue(lM10602a, "getId(...)");
            long jLongValue = lM10602a.longValue();
            long jM9776q = this.f9611b.m9776q();
            GuideTaskInfo guideTaskInfo = this.f9611b.getGuideTaskInfo();
            int state = guideTaskInfo != null ? guideTaskInfo.getState() : -1;
            UploadData uploadData = new UploadData(this.f9612c, this.f9613d, null, AbstractC8555e.c.f14191b.m14097a(), 4, null);
            this.f9610a = 1;
            if (ossTaskManger.m10488t(jLongValue, jM9776q, state, uploadData, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation continuation) {
        return ((NoStemViewModel$uploadAnswer$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
