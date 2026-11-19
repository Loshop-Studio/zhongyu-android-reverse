package com.zykj.student.dialogue.p076ui.home;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.ViewModelKt;
import com.blankj.utilcode.util.AppUtils;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import p172l8.C8923v;
import p172l8.C8924w;
import p172l8.C8926y;
import p172l8.InterfaceC8906e;
import p172l8.InterfaceC8907f;

@Metadata(m13412d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m13413d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m13414k = 3, m13415mv = {2, 2, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@DebugMetadata(m13450c = "com.zykj.student.dialogue.ui.home.HomeViewModel$checkVersion$1", m13451f = "HomeViewModel.kt", m13452i = {}, m13453l = {}, m13454m = "invokeSuspend", m13455n = {}, m13456s = {})
/* loaded from: classes5.dex */
public final class HomeViewModel$checkVersion$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* renamed from: a */
    public int f11650a;

    /* renamed from: b */
    public final /* synthetic */ String f11651b;

    /* renamed from: c */
    public final /* synthetic */ HomeViewModel f11652c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HomeViewModel$checkVersion$1(String str, HomeViewModel homeViewModel, Continuation continuation) {
        super(2, continuation);
        this.f11651b = str;
        this.f11652c = homeViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new HomeViewModel$checkVersion$1(this.f11651b, this.f11652c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return invoke2(coroutineScope, (Continuation) continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.f11650a != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        InterfaceC8906e interfaceC8906eMo13868b = new C8923v.a().m14102c().mo13868b(new C8924w.a().m14151n(this.f11651b + "/api/services/app/AppStore/CheckUpdateAsync?packageName=" + AppUtils.getAppPackageName() + "&version=" + AppUtils.getAppVersionCode() + "&appType=0").m14140b());
        final HomeViewModel homeViewModel = this.f11652c;
        interfaceC8906eMo13868b.mo13867k(new InterfaceC8907f() { // from class: com.zykj.student.dialogue.ui.home.HomeViewModel$checkVersion$1.1
            @Override // p172l8.InterfaceC8907f
            /* renamed from: a */
            public void mo2463a(InterfaceC8906e call, IOException e10) {
                Intrinsics.checkNotNullParameter(call, "call");
                Intrinsics.checkNotNullParameter(e10, "e");
            }

            @Override // p172l8.InterfaceC8907f
            /* renamed from: b */
            public void mo2464b(InterfaceC8906e call, C8926y response) {
                Intrinsics.checkNotNullParameter(call, "call");
                Intrinsics.checkNotNullParameter(response, "response");
                BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(homeViewModel), Dispatchers.getIO(), null, new HomeViewModel$checkVersion$1$1$onResponse$1(response, homeViewModel, null), 2, null);
            }
        });
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation continuation) {
        return ((HomeViewModel$checkVersion$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
