package com.zykj.huiwei.launcher.p035ui.fragment;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import android.widget.TextView;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.datastore.preferences.core.Preferences;
import androidx.datastore.preferences.core.PreferencesKeys;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.Observer;
import androidx.lifecycle.RepeatOnLifecycleKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.navigation.fragment.FragmentKt;
import com.zykj.base.utils.XToastUtils;
import com.zykj.huiwei.launcher.databinding.HwFragmentLoginBinding;
import com.zykj.huiwei.launcher.ext.CommonExtKt;
import com.zykj.huiwei.launcher.p035ui.dialog.Login.ResetPwdDialogFragment;
import com.zykj.huiwei.launcher.p035ui.fragment.LoginFragment;
import com.zykj.huiwei.launcher.viewmodels.LoginViewModel;
import com.zykj.manage.R;
import com.zykj.policy.ext.PolicyHelper;
import com.zykj.policy.p037ui.PolicyCheckView;
import java.util.Map;
import kotlin.Function;
import kotlin.KotlinNothingValueException;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlow;
import p078i4.AbstractC6537g;
import p122o4.AbstractC7521b;

@StabilityInferred(parameters = 0)
@Metadata(m7879d1 = {"\u0000E\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\b\b*\u0001\"\b\u0007\u0018\u0000 '2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001(B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0095@¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u0004J\u000f\u0010\f\u001a\u00020\u000bH\u0014¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u000e\u0010\u0004J\u000f\u0010\u000f\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u000f\u0010\u0004J\u0017\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0011\u0010\u0012R\u001b\u0010\u0018\u001a\u00020\u00138BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R.\u0010\u001f\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u001b \u001c*\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u001a0\u001a0\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\"\u0010!\u001a\u0010\u0012\f\u0012\n \u001c*\u0004\u0018\u00010\u001b0\u001b0\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u001eR\u001b\u0010&\u001a\u00020\"8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b#\u0010\u0015\u001a\u0004\b$\u0010%¨\u0006)"}, m7880d2 = {"Lcom/zykj/huiwei/launcher/ui/fragment/LoginFragment;", "Lcom/zykj/base/BaseFragment;", "Lcom/zykj/huiwei/launcher/databinding/HwFragmentLoginBinding;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "", "initView", "(Landroid/os/Bundle;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onDestroy", "", "layoutId", "()I", "C", "F", "level", "G", "(I)V", "Lcom/zykj/huiwei/launcher/viewmodels/LoginViewModel;", "f", "Lkotlin/Lazy;", "v", "()Lcom/zykj/huiwei/launcher/viewmodels/LoginViewModel;", "loginViewModel", "Landroidx/activity/result/ActivityResultLauncher;", "", "", "kotlin.jvm.PlatformType", "g", "Landroidx/activity/result/ActivityResultLauncher;", "requestPermissionLauncher", "h", "requestPhoneStateLauncher", "com/zykj/huiwei/launcher/ui/fragment/LoginFragment$b", "i", "u", "()Lcom/zykj/huiwei/launcher/ui/fragment/LoginFragment$b;", "loginBc", "j", "a", "app_release"}, m7881k = 1, m7882mv = {2, 2, 0}, m7884xi = 48)
@SourceDebugExtension({"SMAP\nLoginFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LoginFragment.kt\ncom/zykj/huiwei/launcher/ui/fragment/LoginFragment\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n+ 3 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,299:1\n106#2,15:300\n257#3,2:315\n*S KotlinDebug\n*F\n+ 1 LoginFragment.kt\ncom/zykj/huiwei/launcher/ui/fragment/LoginFragment\n*L\n55#1:300,15\n213#1:315,2\n*E\n"})
/* loaded from: classes4.dex */
public final class LoginFragment extends Hilt_LoginFragment<HwFragmentLoginBinding> {

    /* renamed from: k */
    public static final int f6697k = 8;

    /* renamed from: l */
    public static long[] f6698l = new long[7];

    /* renamed from: f, reason: from kotlin metadata */
    public final Lazy loginViewModel;

    /* renamed from: g, reason: from kotlin metadata */
    public final ActivityResultLauncher requestPermissionLauncher;

    /* renamed from: h, reason: from kotlin metadata */
    public final ActivityResultLauncher requestPhoneStateLauncher;

    /* renamed from: i, reason: from kotlin metadata */
    public final Lazy loginBc;

    /* renamed from: com.zykj.huiwei.launcher.ui.fragment.LoginFragment$b */
    public static final class C6143b extends BroadcastReceiver {
        public C6143b() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            Bundle extras;
            if (intent != null && (extras = intent.getExtras()) != null && extras.getBoolean("isOK")) {
                FragmentKt.findNavController(LoginFragment.this).navigate(AbstractC6160a.f6806a.m5983a());
                return;
            }
            LoginFragment.this.m5930v().isDialogVisible().setValue(Boolean.FALSE);
            AbstractC6537g.f8372a.m7317h(false);
            XToastUtils.INSTANCE.error("领创登陆失败");
        }
    }

    /* renamed from: com.zykj.huiwei.launcher.ui.fragment.LoginFragment$c */
    public static final class C6144c implements Observer, FunctionAdapter {

        /* renamed from: a */
        public final /* synthetic */ Function1 f6711a;

        public C6144c(Function1 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f6711a = function;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof Observer) && (obj instanceof FunctionAdapter)) {
                return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        public final Function getFunctionDelegate() {
            return this.f6711a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f6711a.invoke(obj);
        }
    }

    @Metadata(m7879d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m7880d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7881k = 3, m7882mv = {2, 2, 0}, m7884xi = 48)
    @DebugMetadata(m7917c = "com.zykj.huiwei.launcher.ui.fragment.LoginFragment$initView$10", m7918f = "LoginFragment.kt", m7919i = {}, m7920l = {225}, m7921m = "invokeSuspend", m7922n = {}, m7923s = {})
    /* renamed from: com.zykj.huiwei.launcher.ui.fragment.LoginFragment$initView$10 */
    public static final class C614510 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* renamed from: a */
        public int f6712a;

        @Metadata(m7879d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m7880d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7881k = 3, m7882mv = {2, 2, 0}, m7884xi = 48)
        @DebugMetadata(m7917c = "com.zykj.huiwei.launcher.ui.fragment.LoginFragment$initView$10$1", m7918f = "LoginFragment.kt", m7919i = {}, m7920l = {226}, m7921m = "invokeSuspend", m7922n = {}, m7923s = {})
        /* renamed from: com.zykj.huiwei.launcher.ui.fragment.LoginFragment$initView$10$1, reason: invalid class name */
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

            /* renamed from: a */
            public int f6714a;

            /* renamed from: b */
            public final /* synthetic */ LoginFragment f6715b;

            /* renamed from: com.zykj.huiwei.launcher.ui.fragment.LoginFragment$initView$10$1$a */
            public static final class a implements FlowCollector {

                /* renamed from: a */
                public final /* synthetic */ LoginFragment f6716a;

                public a(LoginFragment loginFragment) {
                    this.f6716a = loginFragment;
                }

                /* renamed from: a */
                public final Object m5931a(int i6, Continuation continuation) {
                    this.f6716a.m5928G(i6);
                    return Unit.INSTANCE;
                }

                @Override // kotlinx.coroutines.flow.FlowCollector
                public /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation) {
                    return m5931a(((Number) obj).intValue(), continuation);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(LoginFragment loginFragment, Continuation continuation) {
                super(2, continuation);
                this.f6715b = loginFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                return new AnonymousClass1(this.f6715b, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return invoke2(coroutineScope, (Continuation) continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i6 = this.f6714a;
                if (i6 == 0) {
                    ResultKt.throwOnFailure(obj);
                    SharedFlow sharedFlowM6129o = this.f6715b.m5930v().getSimplePsdShareFlow();
                    a aVar = new a(this.f6715b);
                    this.f6714a = 1;
                    if (sharedFlowM6129o.collect(aVar, this) == coroutine_suspended) {
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
                return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        public C614510(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return LoginFragment.this.new C614510(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return invoke2(coroutineScope, (Continuation) continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i6 = this.f6712a;
            if (i6 == 0) {
                ResultKt.throwOnFailure(obj);
                Lifecycle lifecycle = LoginFragment.this.getViewLifecycleOwner().getLifecycle();
                Lifecycle.State state = Lifecycle.State.STARTED;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(LoginFragment.this, null);
                this.f6712a = 1;
                if (RepeatOnLifecycleKt.repeatOnLifecycle(lifecycle, state, anonymousClass1, this) == coroutine_suspended) {
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
            return ((C614510) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @Metadata(m7879d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m7880d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7881k = 3, m7882mv = {2, 2, 0}, m7884xi = 48)
    @DebugMetadata(m7917c = "com.zykj.huiwei.launcher.ui.fragment.LoginFragment$initView$2", m7918f = "LoginFragment.kt", m7919i = {}, m7920l = {95}, m7921m = "invokeSuspend", m7922n = {}, m7923s = {})
    /* renamed from: com.zykj.huiwei.launcher.ui.fragment.LoginFragment$initView$2 */
    public static final class C61462 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* renamed from: a */
        public int f6717a;

        @Metadata(m7879d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m7880d2 = {"<anonymous>", "", "it", "Landroidx/datastore/preferences/core/Preferences;"}, m7881k = 3, m7882mv = {2, 2, 0}, m7884xi = 48)
        @DebugMetadata(m7917c = "com.zykj.huiwei.launcher.ui.fragment.LoginFragment$initView$2$1", m7918f = "LoginFragment.kt", m7919i = {}, m7920l = {}, m7921m = "invokeSuspend", m7922n = {}, m7923s = {})
        /* renamed from: com.zykj.huiwei.launcher.ui.fragment.LoginFragment$initView$2$1, reason: invalid class name */
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<Preferences, Continuation<? super Unit>, Object> {

            /* renamed from: a */
            public int f6719a;

            /* renamed from: b */
            public /* synthetic */ Object f6720b;

            /* renamed from: c */
            public final /* synthetic */ LoginFragment f6721c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(LoginFragment loginFragment, Continuation continuation) {
                super(2, continuation);
                this.f6721c = loginFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f6721c, continuation);
                anonymousClass1.f6720b = obj;
                return anonymousClass1;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(Preferences preferences, Continuation continuation) {
                return ((AnonymousClass1) create(preferences, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Preferences preferences = (Preferences) this.f6720b;
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.f6719a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                String str = (String) preferences.get(PreferencesKeys.stringKey("deviceId"));
                if (str != null) {
                    LoginFragment loginFragment = this.f6721c;
                    ((HwFragmentLoginBinding) loginFragment.getMBindView()).tvVersion.setText(loginFragment.getString(R.string.hw_sn_replace, str));
                }
                return Unit.INSTANCE;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Preferences preferences, Continuation<? super Unit> continuation) {
                return invoke2(preferences, (Continuation) continuation);
            }
        }

        public C61462(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return LoginFragment.this.new C61462(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return invoke2(coroutineScope, (Continuation) continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i6 = this.f6717a;
            if (i6 == 0) {
                ResultKt.throwOnFailure(obj);
                Context contextRequireContext = LoginFragment.this.requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
                Flow data = CommonExtKt.m5311d(contextRequireContext).getData();
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(LoginFragment.this, null);
                this.f6717a = 1;
                if (FlowKt.collectLatest(data, anonymousClass1, this) == coroutine_suspended) {
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
            return ((C61462) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @Metadata(m7879d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m7880d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7881k = 3, m7882mv = {2, 2, 0}, m7884xi = 48)
    @DebugMetadata(m7917c = "com.zykj.huiwei.launcher.ui.fragment.LoginFragment$initView$4", m7918f = "LoginFragment.kt", m7919i = {}, m7920l = {129}, m7921m = "invokeSuspend", m7922n = {}, m7923s = {})
    /* renamed from: com.zykj.huiwei.launcher.ui.fragment.LoginFragment$initView$4 */
    public static final class C61474 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* renamed from: a */
        public int f6722a;

        public C61474(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return LoginFragment.this.new C61474(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return invoke2(coroutineScope, (Continuation) continuation);
        }

        /* JADX WARN: Removed duplicated region for block: B:18:0x0072  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r5) {
            /*
                r4 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r4.f6722a
                r2 = 1
                if (r1 == 0) goto L17
                if (r1 != r2) goto Lf
                kotlin.ResultKt.throwOnFailure(r5)
                goto L31
            Lf:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r0)
                throw r5
            L17:
                kotlin.ResultKt.throwOnFailure(r5)
                com.zykj.huiwei.launcher.ui.fragment.LoginFragment r5 = com.zykj.huiwei.launcher.p035ui.fragment.LoginFragment.this
                com.zykj.huiwei.launcher.viewmodels.LoginViewModel r5 = com.zykj.huiwei.launcher.p035ui.fragment.LoginFragment.m5920s(r5)
                androidx.datastore.core.DataStore r5 = r5.getServerDataStore()
                kotlinx.coroutines.flow.Flow r5 = r5.getData()
                r4.f6722a = r2
                java.lang.Object r5 = kotlinx.coroutines.flow.FlowKt.firstOrNull(r5, r4)
                if (r5 != r0) goto L31
                return r0
            L31:
                com.zykj.huiwei.launcher.proto.a r5 = (com.zykj.huiwei.launcher.proto.C6063a) r5
                if (r5 == 0) goto L81
                com.zykj.huiwei.launcher.ui.fragment.LoginFragment r0 = com.zykj.huiwei.launcher.p035ui.fragment.LoginFragment.this
                java.lang.String r1 = r5.getAccessToken()
                java.lang.String r3 = "getAccessToken(...)"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r3)
                int r1 = r1.length()
                if (r1 <= 0) goto L72
                java.lang.String r1 = r5.getServerUrl()
                java.lang.String r3 = "getServerUrl(...)"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r3)
                int r1 = r1.length()
                if (r1 <= 0) goto L72
                com.zykj.huiwei.launcher.viewmodels.LoginViewModel r1 = com.zykj.huiwei.launcher.p035ui.fragment.LoginFragment.m5920s(r0)
                java.lang.String r2 = r5.getServerUrl()
                java.lang.String r5 = r5.getAccessToken()
                r1.m6139y(r2, r5)
                com.zykj.huiwei.launcher.ui.fragment.a$a r5 = com.zykj.huiwei.launcher.p035ui.fragment.AbstractC6160a.f6806a
                androidx.navigation.NavDirections r5 = r5.m5983a()
                androidx.navigation.NavController r0 = androidx.navigation.fragment.FragmentKt.findNavController(r0)
                r0.navigate(r5)
                goto L81
            L72:
                com.zykj.huiwei.launcher.viewmodels.LoginViewModel r5 = com.zykj.huiwei.launcher.p035ui.fragment.LoginFragment.m5920s(r0)
                androidx.lifecycle.MutableLiveData r5 = r5.getShowLogin()
                java.lang.Boolean r0 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r2)
                r5.setValue(r0)
            L81:
                kotlin.Unit r5 = kotlin.Unit.INSTANCE
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: com.zykj.huiwei.launcher.p035ui.fragment.LoginFragment.C61474.invokeSuspend(java.lang.Object):java.lang.Object"); // DEX body: android/中育管控桌面/smali_classes4/com/zykj/huiwei/launcher/ui/fragment/LoginFragment$initView$4.smali:132
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(CoroutineScope coroutineScope, Continuation continuation) {
            return ((C61474) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public LoginFragment() {
        final Function0<Fragment> function0 = new Function0<Fragment>() { // from class: com.zykj.huiwei.launcher.ui.fragment.LoginFragment$special$$inlined$viewModels$default$1
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final Fragment invoke() {
                return this;
            }
        };
        final Lazy lazy = LazyKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new Function0<ViewModelStoreOwner>() { // from class: com.zykj.huiwei.launcher.ui.fragment.LoginFragment$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStoreOwner invoke() {
                return (ViewModelStoreOwner) function0.invoke();
            }
        });
        final Function0 function02 = null;
        this.loginViewModel = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(LoginViewModel.class), new Function0<ViewModelStore>() { // from class: com.zykj.huiwei.launcher.ui.fragment.LoginFragment$special$$inlined$viewModels$default$3
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStore invoke() {
                return FragmentViewModelLazyKt.m16978viewModels$lambda1(lazy).getViewModelStore();
            }
        }, new Function0<CreationExtras>() { // from class: com.zykj.huiwei.launcher.ui.fragment.LoginFragment$special$$inlined$viewModels$default$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final CreationExtras invoke() {
                CreationExtras creationExtras;
                Function0 function03 = function02;
                if (function03 != null && (creationExtras = (CreationExtras) function03.invoke()) != null) {
                    return creationExtras;
                }
                ViewModelStoreOwner viewModelStoreOwnerM16978viewModels$lambda1 = FragmentViewModelLazyKt.m16978viewModels$lambda1(lazy);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerM16978viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerM16978viewModels$lambda1 : null;
                return hasDefaultViewModelProviderFactory != null ? hasDefaultViewModelProviderFactory.getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.zykj.huiwei.launcher.ui.fragment.LoginFragment$special$$inlined$viewModels$default$5
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelProvider.Factory invoke() {
                ViewModelProvider.Factory defaultViewModelProviderFactory;
                ViewModelStoreOwner viewModelStoreOwnerM16978viewModels$lambda1 = FragmentViewModelLazyKt.m16978viewModels$lambda1(lazy);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerM16978viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerM16978viewModels$lambda1 : null;
                return (hasDefaultViewModelProviderFactory == null || (defaultViewModelProviderFactory = hasDefaultViewModelProviderFactory.getDefaultViewModelProviderFactory()) == null) ? this.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
            }
        });
        ActivityResultLauncher activityResultLauncherRegisterForActivityResult = registerForActivityResult(new ActivityResultContracts.RequestMultiplePermissions(), new ActivityResultCallback() { // from class: f4.n
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(Object obj) {
                LoginFragment.m5908D(this.f7716a, (Map) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(activityResultLauncherRegisterForActivityResult, "registerForActivityResult(...)");
        this.requestPermissionLauncher = activityResultLauncherRegisterForActivityResult;
        ActivityResultLauncher activityResultLauncherRegisterForActivityResult2 = registerForActivityResult(new ActivityResultContracts.RequestPermission(), new ActivityResultCallback() { // from class: f4.o
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(Object obj) {
                LoginFragment.m5909E((Boolean) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(activityResultLauncherRegisterForActivityResult2, "registerForActivityResult(...)");
        this.requestPhoneStateLauncher = activityResultLauncherRegisterForActivityResult2;
        this.loginBc = LazyKt.lazy(new Function0() { // from class: f4.p
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return LoginFragment.m5907B(this.f7717a);
            }
        });
    }

    /* renamed from: A */
    public static final Unit m5906A(LoginFragment loginFragment, View it) {
        Intrinsics.checkNotNullParameter(it, "it");
        Intent intent = new Intent();
        intent.setAction("com.linspirer.edu.synctime");
        intent.setPackage("com.android.launcher3");
        loginFragment.requireContext().sendBroadcast(intent);
        return Unit.INSTANCE;
    }

    /* renamed from: B */
    public static final C6143b m5907B(LoginFragment loginFragment) {
        return loginFragment.new C6143b();
    }

    /* renamed from: D */
    public static final void m5908D(LoginFragment loginFragment, Map it) {
        Intrinsics.checkNotNullParameter(it, "it");
        Object obj = it.get("android.permission.WRITE_EXTERNAL_STORAGE");
        Boolean bool = Boolean.TRUE;
        if (Intrinsics.areEqual(obj, bool) && Intrinsics.areEqual(it.get("android.permission.ACCESS_COARSE_LOCATION"), bool)) {
            loginFragment.m5930v().m6136v();
        } else {
            XToastUtils.INSTANCE.warning(R.string.permission_rejected);
        }
    }

    /* renamed from: E */
    public static final void m5909E(Boolean it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (it.booleanValue()) {
            return;
        }
        XToastUtils.INSTANCE.warning(R.string.permission_rejected);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: H */
    public static final Unit m5910H(LoginFragment loginFragment) {
        HwFragmentLoginBinding hwFragmentLoginBinding = (HwFragmentLoginBinding) loginFragment.getMBindView();
        hwFragmentLoginBinding.etSchoolCode.setText("");
        hwFragmentLoginBinding.etUsername.setText("");
        hwFragmentLoginBinding.etPassword.setText("");
        hwFragmentLoginBinding.etSchoolCode.clearFocus();
        hwFragmentLoginBinding.etUsername.clearFocus();
        hwFragmentLoginBinding.etPassword.clearFocus();
        hwFragmentLoginBinding.etSchoolCode.requestFocus();
        return Unit.INSTANCE;
    }

    /* renamed from: w */
    public static final void m5922w(LoginFragment loginFragment, View view) {
        long[] jArr = f6698l;
        System.arraycopy(jArr, 1, jArr, 0, jArr.length - 1);
        long[] jArr2 = f6698l;
        jArr2[jArr2.length - 1] = SystemClock.uptimeMillis();
        if (f6698l[0] >= SystemClock.uptimeMillis() - 3000) {
            f6698l = new long[7];
            FragmentActivity fragmentActivityRequireActivity = loginFragment.requireActivity();
            Intent intent = new Intent();
            intent.setAction("com.android.launcher3.mdm.OPEN_ADMIN");
            intent.setPackage("com.android.launcher3");
            fragmentActivityRequireActivity.sendBroadcast(intent);
        }
    }

    /* renamed from: x */
    public static final Unit m5923x(LoginFragment loginFragment, Boolean bool) {
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(loginFragment), null, null, new LoginFragment$initView$5$1(bool, loginFragment, null), 3, null);
        return Unit.INSTANCE;
    }

    /* renamed from: y */
    public static final Unit m5924y(LoginFragment loginFragment, View it) {
        Intrinsics.checkNotNullParameter(it, "it");
        loginFragment.m5926C();
        return Unit.INSTANCE;
    }

    /* renamed from: z */
    public static final Unit m5925z(LoginFragment loginFragment, View it) {
        Intrinsics.checkNotNullParameter(it, "it");
        try {
            if (AbstractC6537g.f8372a.m7316g()) {
                loginFragment.startActivity(new Intent("android.settings.WIFI_SETTINGS"));
            } else {
                Intent intent = new Intent();
                intent.setComponent(new ComponentName("com.zykj.huiwei.setting", "com.zykj.huiwei.setting.wifi.ui.activity.WifiSettingActivity"));
                loginFragment.startActivity(intent);
            }
        } catch (Exception unused) {
            XToastUtils.INSTANCE.toast("跳转异常，请检查是否已安装设置应用");
        }
        return Unit.INSTANCE;
    }

    /* renamed from: C */
    public final void m5926C() {
        this.requestPermissionLauncher.launch(new String[]{"android.permission.READ_PHONE_STATE", "android.permission.WRITE_EXTERNAL_STORAGE", "android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"});
    }

    /* renamed from: F */
    public final void m5927F() {
        this.requestPhoneStateLauncher.launch("android.permission.READ_PHONE_STATE");
    }

    /* renamed from: G */
    public final void m5928G(int level) {
        ResetPwdDialogFragment resetPwdDialogFragmentM5734a = ResetPwdDialogFragment.INSTANCE.m5734a(level);
        resetPwdDialogFragmentM5734a.m5733q(new Function0() { // from class: f4.v
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return LoginFragment.m5910H(this.f7723a);
            }
        });
        resetPwdDialogFragmentM5734a.show(getChildFragmentManager(), "ResetPasswordTag");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.zykj.base.BaseFragment
    public Object initView(Bundle bundle, Continuation continuation) {
        ((HwFragmentLoginBinding) getMBindView()).policyCheckView.setTextColor(-1);
        PolicyCheckView policyCheckView = ((HwFragmentLoginBinding) getMBindView()).policyCheckView;
        Intrinsics.checkNotNullExpressionValue(policyCheckView, "policyCheckView");
        AbstractC7521b.m8679c(policyCheckView, R.drawable.hw_selector_check_bg, getResources().getDimension(R.dimen.pt8));
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        PolicyHelper.Builder builderM6239d = new PolicyHelper.Builder(contextRequireContext).m6240e("https://web.alicdn.zykj.org/privacypolicy/huiweiDesktop/userServiceAgreement.html").m6239d("https://web.alicdn.zykj.org/privacypolicy/huiweiDesktop/userPrivacyPolicy.html");
        PolicyCheckView policyCheckView2 = ((HwFragmentLoginBinding) getMBindView()).policyCheckView;
        Intrinsics.checkNotNullExpressionValue(policyCheckView2, "policyCheckView");
        builderM6239d.m6241f(policyCheckView2);
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), null, null, new C61462(null), 3, null);
        ((HwFragmentLoginBinding) getMBindView()).tvVersion.setOnClickListener(new View.OnClickListener() { // from class: f4.q
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LoginFragment.m5922w(this.f7718a, view);
            }
        });
        ((HwFragmentLoginBinding) getMBindView()).setVm(m5930v());
        m5927F();
        AbstractC6537g.a aVar = AbstractC6537g.f8372a;
        if (aVar.m7316g()) {
            requireContext().registerReceiver(m5929u(), new IntentFilter("com.android.launcher3.mdm.INIT_USER_OK"));
        }
        LifecycleOwnerKt.getLifecycleScope(this).launchWhenResumed(new C61474(null));
        m5930v().getIsLoginSuccess().observe(this, new C6144c(new Function1() { // from class: f4.r
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return LoginFragment.m5923x(this.f7719a, (Boolean) obj);
            }
        }));
        AppCompatTextView tvLogin = ((HwFragmentLoginBinding) getMBindView()).tvLogin;
        Intrinsics.checkNotNullExpressionValue(tvLogin, "tvLogin");
        AbstractC7521b.m8681e(tvLogin, new Function1() { // from class: f4.s
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return LoginFragment.m5924y(this.f7720a, (View) obj);
            }
        });
        TextView tvNet = ((HwFragmentLoginBinding) getMBindView()).tvNet;
        Intrinsics.checkNotNullExpressionValue(tvNet, "tvNet");
        AbstractC7521b.m8681e(tvNet, new Function1() { // from class: f4.t
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return LoginFragment.m5925z(this.f7721a, (View) obj);
            }
        });
        Intent intent = new Intent();
        intent.setAction("com.android.laucher3.mdm.CHECK_UPDATE");
        intent.setPackage("com.android.launcher3");
        requireContext().sendBroadcast(intent);
        if (aVar.m7316g()) {
            TextView tvUpdateTime = ((HwFragmentLoginBinding) getMBindView()).tvUpdateTime;
            Intrinsics.checkNotNullExpressionValue(tvUpdateTime, "tvUpdateTime");
            tvUpdateTime.setVisibility(0);
            TextView tvUpdateTime2 = ((HwFragmentLoginBinding) getMBindView()).tvUpdateTime;
            Intrinsics.checkNotNullExpressionValue(tvUpdateTime2, "tvUpdateTime");
            AbstractC7521b.m8681e(tvUpdateTime2, new Function1() { // from class: f4.u
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return LoginFragment.m5906A(this.f7722a, (View) obj);
                }
            });
        }
        LifecycleOwner viewLifecycleOwner2 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner2, "getViewLifecycleOwner(...)");
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner2), null, null, new C614510(null), 3, null);
        return Unit.INSTANCE;
    }

    @Override // com.zykj.base.BaseFragment
    public int layoutId() {
        return R.layout.hw_fragment_login;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        try {
            Result.Companion companion = Result.INSTANCE;
            if (AbstractC6537g.f8372a.m7316g()) {
                requireContext().unregisterReceiver(m5929u());
            }
            Result.m17183constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.m17183constructorimpl(ResultKt.createFailure(th));
        }
    }

    /* renamed from: u */
    public final C6143b m5929u() {
        return (C6143b) this.loginBc.getValue();
    }

    /* renamed from: v */
    public final LoginViewModel m5930v() {
        return (LoginViewModel) this.loginViewModel.getValue();
    }
}
