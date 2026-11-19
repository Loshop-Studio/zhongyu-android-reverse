package com.zykj.huiwei.launcher.p035ui;

import android.net.Uri;
import com.zykj.huiwei.launcher.viewmodels.MainViewModel;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

@Metadata(m7879d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m7880d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7881k = 3, m7882mv = {2, 2, 0}, m7884xi = 48)
@DebugMetadata(m7917c = "com.zykj.huiwei.launcher.ui.MainActivity$initFloatLaunchers$3$1", m7918f = "MainActivity.kt", m7919i = {}, m7920l = {442}, m7921m = "invokeSuspend", m7922n = {}, m7923s = {})
/* loaded from: classes4.dex */
public final class MainActivity$initFloatLaunchers$3$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* renamed from: a */
    public int f6334a;

    /* renamed from: b */
    public final /* synthetic */ MainActivity f6335b;

    /* renamed from: c */
    public final /* synthetic */ Uri f6336c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MainActivity$initFloatLaunchers$3$1(MainActivity mainActivity, Uri uri, Continuation continuation) {
        super(2, continuation);
        this.f6335b = mainActivity;
        this.f6336c = uri;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new MainActivity$initFloatLaunchers$3$1(this.f6335b, this.f6336c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return invoke2(coroutineScope, (Continuation) continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i6 = this.f6334a;
        if (i6 == 0) {
            ResultKt.throwOnFailure(obj);
            MainViewModel mainViewModelM5552S = this.f6335b.m5552S();
            Uri uri = this.f6336c;
            this.f6334a = 1;
            if (mainViewModelM5552S.m6157m(uri, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i6 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation continuation) {
        return ((MainActivity$initFloatLaunchers$3$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
