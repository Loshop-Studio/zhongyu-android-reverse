package com.zykj.student.dialogue.p076ui.home;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.blankj.utilcode.util.AppUtils;
import com.blankj.utilcode.util.GsonUtils;
import com.zykj.student.dialogue.bean.resp.VersionResult;
import com.zykj.student.dialogue.bean.resp.VersionUpdate;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SpillingKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;
import p172l8.AbstractC8927z;
import p172l8.C8926y;

@Metadata(m13412d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m13413d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m13414k = 3, m13415mv = {2, 2, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@DebugMetadata(m13450c = "com.zykj.student.dialogue.ui.home.HomeViewModel$checkVersion$1$1$onResponse$1", m13451f = "HomeViewModel.kt", m13452i = {0, 0, 0, 0, 0}, m13453l = {126}, m13454m = "invokeSuspend", m13455n = {"json", "$this$invokeSuspend_u24lambda_u240", "fromJson", "$i$a$-apply-HomeViewModel$checkVersion$1$1$onResponse$1$1", "appVersionCode"}, m13456s = {"L$0", "L$2", "L$3", "I$0", "I$1"})
/* loaded from: classes5.dex */
public final class HomeViewModel$checkVersion$1$1$onResponse$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* renamed from: a */
    public Object f11654a;

    /* renamed from: b */
    public Object f11655b;

    /* renamed from: c */
    public Object f11656c;

    /* renamed from: d */
    public Object f11657d;

    /* renamed from: e */
    public int f11658e;

    /* renamed from: f */
    public int f11659f;

    /* renamed from: g */
    public int f11660g;

    /* renamed from: h */
    public final /* synthetic */ C8926y f11661h;

    /* renamed from: i */
    public final /* synthetic */ HomeViewModel f11662i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HomeViewModel$checkVersion$1$1$onResponse$1(C8926y c8926y, HomeViewModel homeViewModel, Continuation continuation) {
        super(2, continuation);
        this.f11661h = c8926y;
        this.f11662i = homeViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new HomeViewModel$checkVersion$1$1$onResponse$1(this.f11661h, this.f11662i, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return invoke2(coroutineScope, (Continuation) continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i9 = this.f11660g;
        try {
            if (i9 == 0) {
                ResultKt.throwOnFailure(obj);
                AbstractC8927z abstractC8927zM14170a = this.f11661h.m14170a();
                String strString = abstractC8927zM14170a != null ? abstractC8927zM14170a.string() : null;
                if (strString != null) {
                    HomeViewModel homeViewModel = this.f11662i;
                    VersionUpdate versionUpdate = (VersionUpdate) GsonUtils.fromJson(strString, VersionUpdate.class);
                    int appVersionCode = AppUtils.getAppVersionCode();
                    VersionResult result = versionUpdate.getResult();
                    if ((result != null ? result.getVersionCode() : 0) > appVersionCode) {
                        MutableSharedFlow mutableSharedFlow = homeViewModel._hasNewVersion;
                        VersionResult result2 = versionUpdate.getResult();
                        this.f11654a = SpillingKt.nullOutSpilledVariable(strString);
                        this.f11655b = strString;
                        this.f11656c = SpillingKt.nullOutSpilledVariable(strString);
                        this.f11657d = SpillingKt.nullOutSpilledVariable(versionUpdate);
                        this.f11658e = 0;
                        this.f11659f = appVersionCode;
                        this.f11660g = 1;
                        if (mutableSharedFlow.emit(result2, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                }
            } else {
                if (i9 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation continuation) {
        return ((HomeViewModel$checkVersion$1$1$onResponse$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
