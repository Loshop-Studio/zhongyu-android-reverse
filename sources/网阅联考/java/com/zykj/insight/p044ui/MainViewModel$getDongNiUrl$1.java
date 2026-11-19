package com.zykj.insight.p044ui;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.zykj.base.utils.XToastUtils;
import com.zykj.insight.bean.GetAllSettingsResp;
import com.zykj.insight.bean.SettingSwitch;
import com.zykj.insight.network.BaseResponse;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlinx.coroutines.CoroutineScope;
import p128u1.AbstractC4610h;
import p128u1.InterfaceC4609g;

@Metadata(m5174d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m5175d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, m5176k = 3, m5177mv = {1, 8, 0})
@DebugMetadata(m5191c = "com.zykj.insight.ui.MainViewModel$getDongNiUrl$1", m5192f = "MainViewModel.kt", m5193i = {}, m5194l = {ConstraintLayout.LayoutParams.Table.LAYOUT_EDITOR_ABSOLUTEX, 50}, m5195m = "invokeSuspend", m5196n = {}, m5197s = {})
/* loaded from: classes2.dex */
public final class MainViewModel$getDongNiUrl$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* renamed from: a */
    public int f4196a;

    /* renamed from: b */
    public final /* synthetic */ MainViewModel f4197b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MainViewModel$getDongNiUrl$1(MainViewModel mainViewModel, Continuation continuation) {
        super(2, continuation);
        this.f4197b = mainViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new MainViewModel$getDongNiUrl$1(this.f4197b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return invoke2(coroutineScope, (Continuation) continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i4 = this.f4196a;
        try {
        } catch (Exception e4) {
            e4.printStackTrace();
        }
        if (i4 == 0) {
            ResultKt.throwOnFailure(obj);
            InterfaceC4609g interfaceC4609g = this.f4197b.androidx.core.app.NotificationCompat.CATEGORY_SERVICE java.lang.String;
            this.f4196a = 1;
            obj = interfaceC4609g.m6355b(this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i4 != 1) {
                if (i4 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                String strReplace$default = StringsKt__StringsJVMKt.replace$default((String) AbstractC4610h.m6357a((BaseResponse) obj), "\"", "", false, 4, (Object) null);
                MainViewModel mainViewModel = this.f4197b;
                mainViewModel.m4622e(mainViewModel.m4621d().m6415a(strReplace$default));
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
        }
        if (((GetAllSettingsResp) AbstractC4610h.m6357a((BaseResponse) obj)).getDnOrder() != SettingSwitch.OPEN) {
            XToastUtils.INSTANCE.toast("登陆失败");
            return Unit.INSTANCE;
        }
        InterfaceC4609g interfaceC4609g2 = this.f4197b.androidx.core.app.NotificationCompat.CATEGORY_SERVICE java.lang.String;
        this.f4196a = 2;
        obj = InterfaceC4609g.a.m6356a(interfaceC4609g2, 0, this, 1, null);
        if (obj == coroutine_suspended) {
            return coroutine_suspended;
        }
        String strReplace$default2 = StringsKt__StringsJVMKt.replace$default((String) AbstractC4610h.m6357a((BaseResponse) obj), "\"", "", false, 4, (Object) null);
        MainViewModel mainViewModel2 = this.f4197b;
        mainViewModel2.m4622e(mainViewModel2.m4621d().m6415a(strReplace$default2));
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation continuation) {
        return ((MainViewModel$getDongNiUrl$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
