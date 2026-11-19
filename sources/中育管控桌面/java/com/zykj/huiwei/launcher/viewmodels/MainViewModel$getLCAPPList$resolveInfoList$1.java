package com.zykj.huiwei.launcher.viewmodels;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

@Metadata(m7879d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\u0010\u0000\u001a.\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0015\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u00020\u0005¢\u0006\u0002\b\u00040\u0001¢\u0006\u0002\b\u0004*\u00020\u0006H\n"}, m7880d2 = {"<anonymous>", "", "Landroid/content/pm/ResolveInfo;", "kotlin.jvm.PlatformType", "Lkotlin/jvm/internal/EnhancedNullability;", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7881k = 3, m7882mv = {2, 2, 0}, m7884xi = 48)
@DebugMetadata(m7917c = "com.zykj.huiwei.launcher.viewmodels.MainViewModel$getLCAPPList$resolveInfoList$1", m7918f = "MainViewModel.kt", m7919i = {}, m7920l = {}, m7921m = "invokeSuspend", m7922n = {}, m7923s = {})
/* loaded from: classes4.dex */
public final class MainViewModel$getLCAPPList$resolveInfoList$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super List<ResolveInfo>>, Object> {

    /* renamed from: a */
    public int f7225a;

    /* renamed from: b */
    public final /* synthetic */ PackageManager f7226b;

    /* renamed from: c */
    public final /* synthetic */ Intent f7227c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MainViewModel$getLCAPPList$resolveInfoList$1(PackageManager packageManager, Intent intent, Continuation continuation) {
        super(2, continuation);
        this.f7226b = packageManager;
        this.f7227c = intent;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new MainViewModel$getLCAPPList$resolveInfoList$1(this.f7226b, this.f7227c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super List<ResolveInfo>> continuation) {
        return invoke2(coroutineScope, (Continuation) continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.f7225a != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        return this.f7226b.queryIntentActivities(this.f7227c, 0);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation continuation) {
        return ((MainViewModel$getLCAPPList$resolveInfoList$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
