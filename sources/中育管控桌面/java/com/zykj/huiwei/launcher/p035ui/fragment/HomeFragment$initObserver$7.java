package com.zykj.huiwei.launcher.p035ui.fragment;

import androidx.core.os.BundleKt;
import androidx.navigation.fragment.FragmentKt;
import com.zykj.manage.R;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.SharedFlow;

@Metadata(m7879d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m7880d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7881k = 3, m7882mv = {2, 2, 0}, m7884xi = 48)
@DebugMetadata(m7917c = "com.zykj.huiwei.launcher.ui.fragment.HomeFragment$initObserver$7", m7918f = "HomeFragment.kt", m7919i = {}, m7920l = {205}, m7921m = "invokeSuspend", m7922n = {}, m7923s = {})
/* loaded from: classes4.dex */
public final class HomeFragment$initObserver$7 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* renamed from: a */
    public int f6692a;

    /* renamed from: b */
    public final /* synthetic */ HomeFragment f6693b;

    /* renamed from: com.zykj.huiwei.launcher.ui.fragment.HomeFragment$initObserver$7$a */
    public static final class C6141a implements FlowCollector {

        /* renamed from: a */
        public final /* synthetic */ HomeFragment f6694a;

        public C6141a(HomeFragment homeFragment) {
            this.f6694a = homeFragment;
        }

        /* renamed from: a */
        public final Object m5905a(int i6, Continuation continuation) {
            FragmentKt.findNavController(this.f6694a).navigate(R.id.composeModifyPasswordDialog, BundleKt.bundleOf(TuplesKt.m7887to("arg_pwd_level", Boxing.boxInt(i6))));
            return Unit.INSTANCE;
        }

        @Override // kotlinx.coroutines.flow.FlowCollector
        public /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation) {
            return m5905a(((Number) obj).intValue(), continuation);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HomeFragment$initObserver$7(HomeFragment homeFragment, Continuation continuation) {
        super(2, continuation);
        this.f6693b = homeFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new HomeFragment$initObserver$7(this.f6693b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return invoke2(coroutineScope, (Continuation) continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i6 = this.f6692a;
        if (i6 == 0) {
            ResultKt.throwOnFailure(obj);
            SharedFlow navigateToResetPwd = this.f6693b.m5893Q().getNavigateToResetPwd();
            C6141a c6141a = new C6141a(this.f6693b);
            this.f6692a = 1;
            if (navigateToResetPwd.collect(c6141a, this) == coroutine_suspended) {
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
        return ((HomeFragment$initObserver$7) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
