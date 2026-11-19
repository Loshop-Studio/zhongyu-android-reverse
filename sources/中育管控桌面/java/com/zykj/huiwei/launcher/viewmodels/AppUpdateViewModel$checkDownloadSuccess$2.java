package com.zykj.huiwei.launcher.viewmodels;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

@Metadata(m7879d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m7880d2 = {"<anonymous>", "", "it", ""}, m7881k = 3, m7882mv = {2, 2, 0}, m7884xi = 48)
@DebugMetadata(m7917c = "com.zykj.huiwei.launcher.viewmodels.AppUpdateViewModel$checkDownloadSuccess$2", m7918f = "AppUpdateViewModel.kt", m7919i = {}, m7920l = {}, m7921m = "invokeSuspend", m7922n = {}, m7923s = {})
/* loaded from: classes4.dex */
public final class AppUpdateViewModel$checkDownloadSuccess$2 extends SuspendLambda implements Function2<String, Continuation<? super Unit>, Object> {

    /* renamed from: a */
    public int f6956a;

    /* renamed from: b */
    public /* synthetic */ Object f6957b;

    /* renamed from: c */
    public final /* synthetic */ AppUpdateViewModel f6958c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppUpdateViewModel$checkDownloadSuccess$2(AppUpdateViewModel appUpdateViewModel, Continuation continuation) {
        super(2, continuation);
        this.f6958c = appUpdateViewModel;
    }

    @Override // kotlin.jvm.functions.Function2
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Object invoke(String str, Continuation continuation) {
        return ((AppUpdateViewModel$checkDownloadSuccess$2) create(str, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        AppUpdateViewModel$checkDownloadSuccess$2 appUpdateViewModel$checkDownloadSuccess$2 = new AppUpdateViewModel$checkDownloadSuccess$2(this.f6958c, continuation);
        appUpdateViewModel$checkDownloadSuccess$2.f6957b = obj;
        return appUpdateViewModel$checkDownloadSuccess$2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        String str = (String) this.f6957b;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.f6956a != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        if (str.length() > 0) {
            this.f6958c.getDownloadSuccess().setValue(str);
        }
        return Unit.INSTANCE;
    }
}
