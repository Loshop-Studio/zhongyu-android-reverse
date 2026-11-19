package com.zykj.student.dialogue.p076ui;

import android.os.Bundle;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.Observer;
import androidx.lifecycle.RepeatOnLifecycleKt;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.navigation.fragment.NavHostFragment;
import com.blankj.utilcode.util.AppUtils;
import com.blankj.utilcode.util.LogUtils;
import com.blankj.utilcode.util.PathUtils;
import com.zykj.base.bean.toast.ToastErrorMessage;
import com.zykj.base.utils.XToastUtils;
import com.zykj.lib.error.code.ErrorCode;
import com.zykj.message.client.MessageClient;
import com.zykj.message.server.bean.ServerInfo;
import com.zykj.message.server.bean.Status;
import com.zykj.message.server.bean.UserInfo;
import com.zykj.student.dialogue.R;
import com.zykj.student.dialogue.p076ui.MainActivity;
import java.io.File;
import kotlin.Function;
import kotlin.Lazy;
import kotlin.Metadata;
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
import p138i6.AbstractC8139e;

@StabilityInferred(parameters = 0)
@Metadata(m13412d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 \u00102\u00020\u0001:\u0001\u0011B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0014¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\u0003R\u001b\u0010\u000f\u001a\u00020\n8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u0012"}, m13413d2 = {"Lcom/zykj/student/dialogue/ui/MainActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "(Landroid/os/Bundle;)V", "u", "Lcom/zykj/student/dialogue/ui/MainViewModel;", "e", "Lkotlin/Lazy;", "t", "()Lcom/zykj/student/dialogue/ui/MainViewModel;", "mainViewModel", "f", "a", "app_release"}, m13414k = 1, m13415mv = {2, 2, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nMainActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MainActivity.kt\ncom/zykj/student/dialogue/ui/MainActivity\n+ 2 ActivityViewModelLazy.kt\nandroidx/activity/ActivityViewModelLazyKt\n*L\n1#1,122:1\n70#2,11:123\n*S KotlinDebug\n*F\n+ 1 MainActivity.kt\ncom/zykj/student/dialogue/ui/MainActivity\n*L\n35#1:123,11\n*E\n"})
/* loaded from: classes5.dex */
public final class MainActivity extends Hilt_MainActivity {

    /* renamed from: g */
    public static final int f10567g = 8;

    /* renamed from: e, reason: from kotlin metadata */
    public final Lazy mainViewModel;

    /* renamed from: com.zykj.student.dialogue.ui.MainActivity$b */
    public static final class ViewTreeObserverOnPreDrawListenerC7451b implements ViewTreeObserver.OnPreDrawListener {

        /* renamed from: a */
        public final /* synthetic */ long f10573a;

        /* renamed from: b */
        public final /* synthetic */ MainActivity f10574b;

        /* renamed from: c */
        public final /* synthetic */ View f10575c;

        public ViewTreeObserverOnPreDrawListenerC7451b(long j9, MainActivity mainActivity, View view) {
            this.f10573a = j9;
            this.f10574b = mainActivity;
            this.f10575c = view;
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            if (System.currentTimeMillis() - this.f10573a <= 1000) {
                return false;
            }
            this.f10574b.getWindow().getDecorView().setBackgroundColor(-1);
            this.f10575c.getViewTreeObserver().removeOnPreDrawListener(this);
            return true;
        }
    }

    /* renamed from: com.zykj.student.dialogue.ui.MainActivity$c */
    public static final class C7452c implements Observer, FunctionAdapter {

        /* renamed from: a */
        public final /* synthetic */ Function1 f10576a;

        public C7452c(Function1 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f10576a = function;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof Observer) && (obj instanceof FunctionAdapter)) {
                return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        public final Function getFunctionDelegate() {
            return this.f10576a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f10576a.invoke(obj);
        }
    }

    @Metadata(m13412d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m13413d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m13414k = 3, m13415mv = {2, 2, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    @DebugMetadata(m13450c = "com.zykj.student.dialogue.ui.MainActivity$onCreate$3", m13451f = "MainActivity.kt", m13452i = {}, m13453l = {}, m13454m = "invokeSuspend", m13455n = {}, m13456s = {})
    /* renamed from: com.zykj.student.dialogue.ui.MainActivity$onCreate$3 */
    public static final class C74533 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* renamed from: a */
        public int f10577a;

        public C74533(Continuation continuation) {
            super(2, continuation);
        }

        /* renamed from: g */
        public static final Unit m9989g(MainActivity mainActivity, ServerInfo serverInfo) {
            if (serverInfo != null) {
                if (serverInfo.m9860b() == Status.LOGOUT) {
                    mainActivity.finish();
                    System.exit(0);
                    throw new RuntimeException("System.exit returned normally, while it was supposed to halt JVM.");
                }
                mainActivity.m9985t().m9998d(serverInfo);
                mainActivity.m9986u();
            }
            return Unit.INSTANCE;
        }

        /* renamed from: k */
        public static final Unit m9990k(MainActivity mainActivity, UserInfo userInfo) {
            if (userInfo != null) {
                mainActivity.m9985t().m9999e(userInfo);
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return MainActivity.this.new C74533(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return invoke2(coroutineScope, (Continuation) continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f10577a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            MessageClient messageClient = MessageClient.f10078a;
            final MainActivity mainActivity = MainActivity.this;
            Function1 function1 = new Function1() { // from class: com.zykj.student.dialogue.ui.a
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return MainActivity.C74533.m9989g(mainActivity, (ServerInfo) obj2);
                }
            };
            final MainActivity mainActivity2 = MainActivity.this;
            messageClient.mo9838q(function1, new Function1() { // from class: com.zykj.student.dialogue.ui.b
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return MainActivity.C74533.m9990k(mainActivity2, (UserInfo) obj2);
                }
            });
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(CoroutineScope coroutineScope, Continuation continuation) {
            return ((C74533) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @Metadata(m13412d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m13413d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m13414k = 3, m13415mv = {2, 2, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    @DebugMetadata(m13450c = "com.zykj.student.dialogue.ui.MainActivity$onCreate$4", m13451f = "MainActivity.kt", m13452i = {}, m13453l = {90}, m13454m = "invokeSuspend", m13455n = {}, m13456s = {})
    /* renamed from: com.zykj.student.dialogue.ui.MainActivity$onCreate$4 */
    public static final class C74544 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* renamed from: a */
        public int f10579a;

        @Metadata(m13412d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m13413d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m13414k = 3, m13415mv = {2, 2, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
        @DebugMetadata(m13450c = "com.zykj.student.dialogue.ui.MainActivity$onCreate$4$1", m13451f = "MainActivity.kt", m13452i = {}, m13453l = {}, m13454m = "invokeSuspend", m13455n = {}, m13456s = {})
        /* renamed from: com.zykj.student.dialogue.ui.MainActivity$onCreate$4$1, reason: invalid class name */
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

            /* renamed from: a */
            public int f10581a;

            /* renamed from: b */
            public final /* synthetic */ MainActivity f10582b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(MainActivity mainActivity, Continuation continuation) {
                super(2, continuation);
                this.f10582b = mainActivity;
            }

            /* JADX INFO: Access modifiers changed from: private */
            /* renamed from: g */
            public static final Unit m9993g(MainActivity mainActivity, ServerInfo serverInfo) {
                mainActivity.m9985t().m9998d(serverInfo);
                mainActivity.m9986u();
                return Unit.INSTANCE;
            }

            /* JADX INFO: Access modifiers changed from: private */
            /* renamed from: k */
            public static final Unit m9994k(MainActivity mainActivity, UserInfo userInfo) {
                mainActivity.m9985t().m9999e(userInfo);
                LogUtils.Config config = LogUtils.getConfig();
                String externalAppFilesPath = PathUtils.getExternalAppFilesPath();
                String str = File.separator;
                config.setDir(externalAppFilesPath + str + "log" + str + userInfo.m9866a() + str);
                mainActivity.m9985t().m10000f();
                return Unit.INSTANCE;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                return new AnonymousClass1(this.f10582b, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return invoke2(coroutineScope, (Continuation) continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.f10581a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                MessageClient messageClient = MessageClient.f10078a;
                final MainActivity mainActivity = this.f10582b;
                messageClient.mo9833a(new Function1() { // from class: com.zykj.student.dialogue.ui.c
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return MainActivity.C74544.AnonymousClass1.m9993g(mainActivity, (ServerInfo) obj2);
                    }
                });
                final MainActivity mainActivity2 = this.f10582b;
                messageClient.mo9834c(new Function1() { // from class: com.zykj.student.dialogue.ui.d
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return MainActivity.C74544.AnonymousClass1.m9994k(mainActivity2, (UserInfo) obj2);
                    }
                });
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(CoroutineScope coroutineScope, Continuation continuation) {
                return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        public C74544(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return MainActivity.this.new C74544(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return invoke2(coroutineScope, (Continuation) continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i9 = this.f10579a;
            if (i9 == 0) {
                ResultKt.throwOnFailure(obj);
                MainActivity mainActivity = MainActivity.this;
                Lifecycle.State state = Lifecycle.State.RESUMED;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(mainActivity, null);
                this.f10579a = 1;
                if (RepeatOnLifecycleKt.repeatOnLifecycle(mainActivity, state, anonymousClass1, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i9 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(CoroutineScope coroutineScope, Continuation continuation) {
            return ((C74544) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public MainActivity() {
        final Function0 function0 = null;
        this.mainViewModel = new ViewModelLazy(Reflection.getOrCreateKotlinClass(MainViewModel.class), new Function0<ViewModelStore>() { // from class: com.zykj.student.dialogue.ui.MainActivity$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStore invoke() {
                return this.getViewModelStore();
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.zykj.student.dialogue.ui.MainActivity$special$$inlined$viewModels$default$1
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelProvider.Factory invoke() {
                return this.getDefaultViewModelProviderFactory();
            }
        }, new Function0<CreationExtras>() { // from class: com.zykj.student.dialogue.ui.MainActivity$special$$inlined$viewModels$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final CreationExtras invoke() {
                CreationExtras creationExtras;
                Function0 function02 = function0;
                return (function02 == null || (creationExtras = (CreationExtras) function02.invoke()) == null) ? this.getDefaultViewModelCreationExtras() : creationExtras;
            }
        });
    }

    /* renamed from: v */
    public static final Unit m9984v(MainActivity mainActivity, ErrorCode errorCode) {
        if (errorCode != ErrorCode.NET_TOKEN_ERROR) {
            return Unit.INSTANCE;
        }
        AbstractC8139e.m13046b(new ToastErrorMessage(Integer.valueOf(TypedValues.CycleType.TYPE_CURVE_FIT), "登录已过期,请重新登录", null, 4, null), null, 2, null);
        if (AppUtils.isAppInstalled("com.zykj.manage")) {
            mainActivity.startActivity(mainActivity.getPackageManager().getLaunchIntentForPackage("com.zykj.manage"));
        } else {
            XToastUtils.INSTANCE.toast("用户中心未安装");
        }
        System.exit(0);
        throw new RuntimeException("System.exit returned normally, while it was supposed to halt JVM.");
    }

    @Override // com.zykj.student.dialogue.p076ui.Hilt_MainActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        View viewFindViewById = findViewById(android.R.id.content);
        viewFindViewById.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserverOnPreDrawListenerC7451b(jCurrentTimeMillis, this, viewFindViewById));
        m9985t().getHeaderLiveData().getUnauthorized().observe(this, new C7452c(new Function1() { // from class: l6.a
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MainActivity.m9984v(this.f14702a, (ErrorCode) obj);
            }
        }));
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C74533(null), 3, null);
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C74544(null), 3, null);
    }

    /* renamed from: t */
    public final MainViewModel m9985t() {
        return (MainViewModel) this.mainViewModel.getValue();
    }

    /* renamed from: u */
    public final void m9986u() {
        synchronized ("MainHostFragmentTag") {
            try {
                if (getSupportFragmentManager().findFragmentByTag("MainHostFragmentTag") == null) {
                    getSupportFragmentManager().beginTransaction().replace(R.id.nav_host_fragment_container, NavHostFragment.Companion.create$default(NavHostFragment.INSTANCE, R.navigation.nav_graph, null, 2, null), "MainHostFragmentTag").commitAllowingStateLoss();
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
