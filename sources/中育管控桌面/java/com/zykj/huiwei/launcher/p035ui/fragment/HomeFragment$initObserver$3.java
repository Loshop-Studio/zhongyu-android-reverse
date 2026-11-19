package com.zykj.huiwei.launcher.p035ui.fragment;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavDestination;
import androidx.navigation.NavOptions;
import androidx.navigation.fragment.FragmentKt;
import com.zykj.huiwei.launcher.app.App;
import com.zykj.huiwei.launcher.p035ui.dialog.TipsDialogArgs;
import com.zykj.huiwei.launcher.p035ui.fragment.HomeFragment$initObserver$3;
import com.zykj.huiwei.launcher.viewmodels.AppUpdateViewModel;
import com.zykj.manage.R;
import kotlin.KotlinNothingValueException;
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
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.MutableSharedFlow;

@Metadata(m7879d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m7880d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7881k = 3, m7882mv = {2, 2, 0}, m7884xi = 48)
@DebugMetadata(m7917c = "com.zykj.huiwei.launcher.ui.fragment.HomeFragment$initObserver$3", m7918f = "HomeFragment.kt", m7919i = {}, m7920l = {154}, m7921m = "invokeSuspend", m7922n = {}, m7923s = {})
/* loaded from: classes4.dex */
public final class HomeFragment$initObserver$3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* renamed from: a */
    public int f6675a;

    /* renamed from: b */
    public final /* synthetic */ HomeFragment f6676b;

    /* renamed from: com.zykj.huiwei.launcher.ui.fragment.HomeFragment$initObserver$3$a */
    public static final class C6137a implements FlowCollector {

        /* renamed from: a */
        public final /* synthetic */ HomeFragment f6677a;

        public C6137a(HomeFragment homeFragment) {
            this.f6677a = homeFragment;
        }

        /* renamed from: c */
        public static final Unit m5901c(HomeFragment homeFragment, String str, Bundle bundle) {
            Intrinsics.checkNotNullParameter(str, "<unused var>");
            Intrinsics.checkNotNullParameter(bundle, "<unused var>");
            AppUpdateViewModel appUpdateViewModelM5884G = homeFragment.m5884G();
            String packageName = App.INSTANCE.m5206a().getPackageName();
            Intrinsics.checkNotNullExpressionValue(packageName, "getPackageName(...)");
            appUpdateViewModelM5884G.m6032o(packageName);
            return Unit.INSTANCE;
        }

        /* renamed from: b */
        public final Object m5902b(boolean z6, Continuation continuation) {
            NavDestination currentDestination = FragmentKt.findNavController(this.f6677a).getCurrentDestination();
            if (currentDestination != null && currentDestination.getId() == R.id.tipsDialog) {
                return Unit.INSTANCE;
            }
            this.f6677a.m5884G().m6039v();
            Fragment parentFragment = this.f6677a;
            while (parentFragment != null && !(parentFragment instanceof MainFragment)) {
                parentFragment = parentFragment.getParentFragment();
            }
            if (!(parentFragment instanceof MainFragment)) {
                parentFragment = null;
            }
            MainFragment mainFragment = (MainFragment) parentFragment;
            if (mainFragment != null) {
                final HomeFragment homeFragment = this.f6677a;
                androidx.fragment.app.FragmentKt.setFragmentResultListener(mainFragment, "TipsDialogRequestKey", new Function2() { // from class: f4.k
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return HomeFragment$initObserver$3.C6137a.m5901c(homeFragment, (String) obj, (Bundle) obj2);
                    }
                });
            }
            HomeFragment homeFragment2 = this.f6677a;
            String string = homeFragment2.getString(R.string.hw_new_version_title);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            String string2 = this.f6677a.getString(R.string.hw_update_now);
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            homeFragment2.mo5283d(R.id.tipsDialog, new TipsDialogArgs(string, null, string2, false, false, false, 2, null).m5752g(), new NavOptions.Builder().setLaunchSingleTop(true).build());
            return Unit.INSTANCE;
        }

        @Override // kotlinx.coroutines.flow.FlowCollector
        public /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation) {
            return m5902b(((Boolean) obj).booleanValue(), continuation);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HomeFragment$initObserver$3(HomeFragment homeFragment, Continuation continuation) {
        super(2, continuation);
        this.f6676b = homeFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new HomeFragment$initObserver$3(this.f6676b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return invoke2(coroutineScope, (Continuation) continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i6 = this.f6675a;
        if (i6 == 0) {
            ResultKt.throwOnFailure(obj);
            MutableSharedFlow showUpdateSharedFlow = this.f6676b.m5884G().getShowUpdateSharedFlow();
            C6137a c6137a = new C6137a(this.f6676b);
            this.f6675a = 1;
            if (showUpdateSharedFlow.collect(c6137a, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i6 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        throw new KotlinNothingValueException();
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation continuation) {
        return ((HomeFragment$initObserver$3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
