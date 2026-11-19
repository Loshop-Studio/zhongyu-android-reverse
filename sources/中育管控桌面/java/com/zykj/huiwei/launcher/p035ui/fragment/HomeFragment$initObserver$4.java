package com.zykj.huiwei.launcher.p035ui.fragment;

import com.zykj.huiwei.launcher.app.App;
import com.zykj.huiwei.launcher.viewmodels.AppUpdateViewModel;
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
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import p119o1.InterfaceC7516a;

@Metadata(m7879d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m7880d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7881k = 3, m7882mv = {2, 2, 0}, m7884xi = 48)
@DebugMetadata(m7917c = "com.zykj.huiwei.launcher.ui.fragment.HomeFragment$initObserver$4", m7918f = "HomeFragment.kt", m7919i = {}, m7920l = {182}, m7921m = "invokeSuspend", m7922n = {}, m7923s = {})
/* loaded from: classes4.dex */
public final class HomeFragment$initObserver$4 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* renamed from: a */
    public int f6678a;

    /* renamed from: b */
    public final /* synthetic */ HomeFragment f6679b;

    @Metadata(m7879d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m7880d2 = {"Lo1/a;", "iCheckAppUpdate", "", "<anonymous>", "(Lo1/a;)V"}, m7881k = 3, m7882mv = {2, 2, 0})
    @DebugMetadata(m7917c = "com.zykj.huiwei.launcher.ui.fragment.HomeFragment$initObserver$4$1", m7918f = "HomeFragment.kt", m7919i = {}, m7920l = {}, m7921m = "invokeSuspend", m7922n = {}, m7923s = {})
    /* renamed from: com.zykj.huiwei.launcher.ui.fragment.HomeFragment$initObserver$4$1 */
    public static final class C61381 extends SuspendLambda implements Function2<InterfaceC7516a, Continuation<? super Unit>, Object> {

        /* renamed from: a */
        public int f6680a;

        /* renamed from: b */
        public /* synthetic */ Object f6681b;

        /* renamed from: c */
        public final /* synthetic */ HomeFragment f6682c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C61381(HomeFragment homeFragment, Continuation continuation) {
            super(2, continuation);
            this.f6682c = homeFragment;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC7516a interfaceC7516a, Continuation continuation) {
            return ((C61381) create(interfaceC7516a, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            C61381 c61381 = new C61381(this.f6682c, continuation);
            c61381.f6681b = obj;
            return c61381;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            InterfaceC7516a interfaceC7516a = (InterfaceC7516a) this.f6681b;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f6680a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            if (interfaceC7516a != null) {
                AppUpdateViewModel appUpdateViewModelM5884G = this.f6682c.m5884G();
                String packageName = App.INSTANCE.m5206a().getPackageName();
                Intrinsics.checkNotNullExpressionValue(packageName, "getPackageName(...)");
                appUpdateViewModelM5884G.m6019b(interfaceC7516a, packageName);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HomeFragment$initObserver$4(HomeFragment homeFragment, Continuation continuation) {
        super(2, continuation);
        this.f6679b = homeFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new HomeFragment$initObserver$4(this.f6679b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return invoke2(coroutineScope, (Continuation) continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i6 = this.f6678a;
        if (i6 == 0) {
            ResultKt.throwOnFailure(obj);
            MutableStateFlow appStoreService = this.f6679b.m5884G().getAppStoreService();
            C61381 c61381 = new C61381(this.f6679b, null);
            this.f6678a = 1;
            if (FlowKt.collectLatest(appStoreService, c61381, this) == coroutine_suspended) {
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
        return ((HomeFragment$initObserver$4) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
