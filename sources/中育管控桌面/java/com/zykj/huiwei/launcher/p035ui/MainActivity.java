package com.zykj.huiwei.launcher.p035ui;

// RE note 本类字节码直接引用的读写或显示接口包括JSON。

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.ServiceConnection;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.view.Window;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.exifinterface.media.ExifInterface;
import androidx.fragment.app.FragmentContainerView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.Observer;
import androidx.lifecycle.RepeatOnLifecycleKt;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.navigation.NavController;
import androidx.navigation.NavDestination;
import androidx.navigation.ViewKt;
import com.google.gson.Gson;
import com.zykj.base.bean.toast.ToastMessage;
import com.zykj.huiwei.launcher.app.App;
import com.zykj.huiwei.launcher.bean.BaseAppInfo;
import com.zykj.huiwei.launcher.databinding.HwActivityMainBinding;
import com.zykj.huiwei.launcher.p035ui.MainActivity;
import com.zykj.huiwei.launcher.server.MyFloatingToolService;
import com.zykj.huiwei.launcher.server.MyService;
import com.zykj.huiwei.launcher.viewmodels.MainViewModel;
import com.zykj.huiwei.launcher.viewmodels.UnAuthorViewModel;
import com.zykj.lib.error.code.ErrorCode;
import com.zykj.manage.R;
import com.zykj.message.server.MessageManage;
import com.zykj.policy.ext.PolicyHelper;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import kotlin.Function;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
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
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.MutableStateFlow;
import p066h.C6428a;
import p066h.C6429b;
import p066h.InterfaceC6430c;
import p078i4.AbstractC6537g;
import p078i4.C6548r;
import p080j.InterfaceC6572a;
import p085j4.C6591e;
import p149s3.InterfaceC7697e;

@StabilityInferred(parameters = 0)
@Metadata(m7879d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\u0005\n\u0002\b\u0005\n\u0002\b\u0005\n\u0002\b\u0005\n\u0002\b\u0005\n\u0002\b\b*\u00066;@EJO\b\u0007\u0018\u0000 T2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001UB\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\u0005J\u000f\u0010\b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\b\u0010\u0005J\u000f\u0010\t\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\u0005J\u000f\u0010\n\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\n\u0010\u0005J\u000f\u0010\u000b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000b\u0010\u0005J\u000f\u0010\f\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\f\u0010\u0005J\u0019\u0010\u000f\u001a\u00020\u00062\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0014¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0011\u001a\u00020\u00062\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0094@¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u0013\u0010\u0005J\u000f\u0010\u0014\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u0014\u0010\u0005J\u000f\u0010\u0015\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u0015\u0010\u0005J\u000f\u0010\u0017\u001a\u00020\u0016H\u0014¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bR\u0016\u0010\u001e\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\tR\"\u0010&\u001a\u00020\u001f8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\u001b\u0010,\u001a\u00020'8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u001b\u00101\u001a\u00020-8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b.\u0010)\u001a\u0004\b/\u00100R\u0018\u00105\u001a\u0004\u0018\u0001028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00104R\u001b\u0010:\u001a\u0002068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b7\u0010)\u001a\u0004\b8\u00109R\u001b\u0010?\u001a\u00020;8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b<\u0010)\u001a\u0004\b=\u0010>R\u001b\u0010D\u001a\u00020@8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bA\u0010)\u001a\u0004\bB\u0010CR\u001b\u0010I\u001a\u00020E8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bF\u0010)\u001a\u0004\bG\u0010HR\u001b\u0010N\u001a\u00020J8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bK\u0010)\u001a\u0004\bL\u0010MR\u001b\u0010S\u001a\u00020O8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bP\u0010)\u001a\u0004\bQ\u0010R¨\u0006V"}, m7880d2 = {"Lcom/zykj/huiwei/launcher/ui/MainActivity;", "Lcom/zykj/huiwei/launcher/base/CommonActivity;", "Lcom/zykj/huiwei/launcher/databinding/HwActivityMainBinding;", "Ls3/e;", "<init>", "()V", "", "X", "H", "Z", "f0", ExifInterface.GPS_DIRECTION_TRUE, "g0", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "initView", "(Landroid/os/Bundle;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onResume", "onPause", "onDestroy", "", "layoutId", "()I", "Landroidx/navigation/NavController;", "getNavController", "()Landroidx/navigation/NavController;", "", "e", "isFloatingToolServiceBound", "Lj4/e;", "f", "Lj4/e;", "O", "()Lj4/e;", "d0", "(Lj4/e;)V", "floatingToolManager", "Lcom/zykj/huiwei/launcher/viewmodels/MainViewModel;", "g", "Lkotlin/Lazy;", ExifInterface.LATITUDE_SOUTH, "()Lcom/zykj/huiwei/launcher/viewmodels/MainViewModel;", "viewModel", "Lcom/zykj/huiwei/launcher/viewmodels/UnAuthorViewModel;", "h", "R", "()Lcom/zykj/huiwei/launcher/viewmodels/UnAuthorViewModel;", "unAuthorModel", "Lj/a;", "i", "Lj/a;", "iSystemInterface", "com/zykj/huiwei/launcher/ui/MainActivity$d", "j", "P", "()Lcom/zykj/huiwei/launcher/ui/MainActivity$d;", "lCLogoutReceiver", "com/zykj/huiwei/launcher/ui/MainActivity$f", "k", "Q", "()Lcom/zykj/huiwei/launcher/ui/MainActivity$f;", "snRv", "com/zykj/huiwei/launcher/ui/MainActivity$appStatusFilterReceiver$2$1", "l", "L", "()Lcom/zykj/huiwei/launcher/ui/MainActivity$appStatusFilterReceiver$2$1;", "appStatusFilterReceiver", "com/zykj/huiwei/launcher/ui/MainActivity$filterAppListReceiver$2$1", "m", "N", "()Lcom/zykj/huiwei/launcher/ui/MainActivity$filterAppListReceiver$2$1;", "filterAppListReceiver", "com/zykj/huiwei/launcher/ui/MainActivity$b", "n", "K", "()Lcom/zykj/huiwei/launcher/ui/MainActivity$b;", "appChanged", "com/zykj/huiwei/launcher/ui/MainActivity$c", "o", "M", "()Lcom/zykj/huiwei/launcher/ui/MainActivity$c;", "connection", "p", "a", "app_release"}, m7881k = 1, m7882mv = {2, 2, 0}, m7884xi = 48)
@SourceDebugExtension({"SMAP\nMainActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MainActivity.kt\ncom/zykj/huiwei/launcher/ui/MainActivity\n+ 2 ActivityViewModelLazy.kt\nandroidx/activity/ActivityViewModelLazyKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,456:1\n70#2,11:457\n70#2,11:468\n1563#3:479\n1634#3,3:480\n*S KotlinDebug\n*F\n+ 1 MainActivity.kt\ncom/zykj/huiwei/launcher/ui/MainActivity\n*L\n62#1:457,11\n63#1:468,11\n126#1:479\n126#1:480,3\n*E\n"})
/* loaded from: classes4.dex */
public final class MainActivity extends Hilt_MainActivity<HwActivityMainBinding> implements InterfaceC7697e {

    /* renamed from: q */
    public static final int f6290q = 8;

    /* renamed from: e, reason: from kotlin metadata */
    public boolean isFloatingToolServiceBound;

    /* renamed from: f, reason: from kotlin metadata */
    public C6591e floatingToolManager;

    /* renamed from: g, reason: from kotlin metadata */
    public final Lazy viewModel;

    /* renamed from: h, reason: from kotlin metadata */
    public final Lazy unAuthorModel;

    /* renamed from: i, reason: from kotlin metadata */
    public InterfaceC6572a iSystemInterface;

    /* renamed from: j, reason: from kotlin metadata */
    public final Lazy lCLogoutReceiver = LazyKt.lazy(new Function0() { // from class: y3.e
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return MainActivity.m5531c0();
        }
    });

    /* renamed from: k, reason: from kotlin metadata */
    public final Lazy snRv = LazyKt.lazy(new Function0() { // from class: y3.f
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return MainActivity.m5532e0(this.f10629a);
        }
    });

    /* renamed from: l, reason: from kotlin metadata */
    public final Lazy appStatusFilterReceiver = LazyKt.lazy(new Function0() { // from class: y3.g
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return MainActivity.m5522G(this.f10630a);
        }
    });

    /* renamed from: m, reason: from kotlin metadata */
    public final Lazy filterAppListReceiver = LazyKt.lazy(new Function0() { // from class: y3.h
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return MainActivity.m5524J(this.f10631a);
        }
    });

    /* renamed from: n, reason: from kotlin metadata */
    public final Lazy appChanged = LazyKt.lazy(new Function0() { // from class: y3.i
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return MainActivity.m5521F(this.f10632a);
        }
    });

    /* renamed from: o, reason: from kotlin metadata */
    public final Lazy connection = LazyKt.lazy(new Function0() { // from class: y3.j
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return MainActivity.m5523I(this.f10633a);
        }
    });

    /* renamed from: com.zykj.huiwei.launcher.ui.MainActivity$b */
    public static final class C6089b extends BroadcastReceiver {
        public C6089b() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            MainActivity.this.m5552S().m6159o();
        }
    }

    /* renamed from: com.zykj.huiwei.launcher.ui.MainActivity$c */
    public static final class ServiceConnectionC6090c implements ServiceConnection {
        public ServiceConnectionC6090c() {
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            String strMo7436j;
            Intrinsics.checkNotNullParameter(componentName, "componentName");
            Intrinsics.checkNotNullParameter(iBinder, "iBinder");
            MainActivity.this.iSystemInterface = InterfaceC6572a.a.m7437p(iBinder);
            InterfaceC6572a interfaceC6572a = MainActivity.this.iSystemInterface;
            if (interfaceC6572a == null || (strMo7436j = interfaceC6572a.mo7436j()) == null) {
                return;
            }
            MainActivity.this.m5552S().m6158n(strMo7436j);
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            Intrinsics.checkNotNullParameter(componentName, "componentName");
        }
    }

    /* renamed from: com.zykj.huiwei.launcher.ui.MainActivity$d */
    public static final class C6091d extends BroadcastReceiver {
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            AbstractC6537g.a.m7309i(AbstractC6537g.f8372a, false, 1, null);
        }
    }

    /* renamed from: com.zykj.huiwei.launcher.ui.MainActivity$e */
    public static final class C6092e implements Observer, FunctionAdapter {

        /* renamed from: a */
        public final /* synthetic */ Function1 f6322a;

        public C6092e(Function1 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f6322a = function;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof Observer) && (obj instanceof FunctionAdapter)) {
                return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        public final Function getFunctionDelegate() {
            return this.f6322a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f6322a.invoke(obj);
        }
    }

    /* renamed from: com.zykj.huiwei.launcher.ui.MainActivity$f */
    public static final class C6093f extends BroadcastReceiver {
        public C6093f() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            String stringExtra;
            if (intent != null) {
                intent.getStringExtra("device_sn");
            }
            if (intent == null || (stringExtra = intent.getStringExtra("device_sn")) == null) {
                return;
            }
            MainActivity.this.m5552S().m6158n(stringExtra);
        }
    }

    @Metadata(m7879d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m7880d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7881k = 3, m7882mv = {2, 2, 0}, m7884xi = 48)
    @DebugMetadata(m7917c = "com.zykj.huiwei.launcher.ui.MainActivity$initView$2", m7918f = "MainActivity.kt", m7919i = {}, m7920l = {}, m7921m = "invokeSuspend", m7922n = {}, m7923s = {})
    /* renamed from: com.zykj.huiwei.launcher.ui.MainActivity$initView$2 */
    public static final class C60952 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* renamed from: a */
        public int f6344a;

        public C60952(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return MainActivity.this.new C60952(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return invoke2(coroutineScope, (Continuation) continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f6344a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            MessageManage.f7396a.mo6206a(MainActivity.this, MyService.class);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(CoroutineScope coroutineScope, Continuation continuation) {
            return ((C60952) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @Metadata(m7879d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m7880d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7881k = 3, m7882mv = {2, 2, 0}, m7884xi = 48)
    @DebugMetadata(m7917c = "com.zykj.huiwei.launcher.ui.MainActivity$initView$3", m7918f = "MainActivity.kt", m7919i = {}, m7920l = {78}, m7921m = "invokeSuspend", m7922n = {}, m7923s = {})
    /* renamed from: com.zykj.huiwei.launcher.ui.MainActivity$initView$3 */
    public static final class C60963 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* renamed from: a */
        public int f6346a;

        @Metadata(m7879d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m7880d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7881k = 3, m7882mv = {2, 2, 0}, m7884xi = 48)
        @DebugMetadata(m7917c = "com.zykj.huiwei.launcher.ui.MainActivity$initView$3$1", m7918f = "MainActivity.kt", m7919i = {}, m7920l = {}, m7921m = "invokeSuspend", m7922n = {}, m7923s = {})
        /* renamed from: com.zykj.huiwei.launcher.ui.MainActivity$initView$3$1, reason: invalid class name */
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

            /* renamed from: a */
            public int f6348a;

            /* renamed from: b */
            public /* synthetic */ Object f6349b;

            /* renamed from: c */
            public final /* synthetic */ MainActivity f6350c;

            @Metadata(m7879d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m7880d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7881k = 3, m7882mv = {2, 2, 0}, m7884xi = 48)
            @DebugMetadata(m7917c = "com.zykj.huiwei.launcher.ui.MainActivity$initView$3$1$1", m7918f = "MainActivity.kt", m7919i = {}, m7920l = {80}, m7921m = "invokeSuspend", m7922n = {}, m7923s = {})
            /* renamed from: com.zykj.huiwei.launcher.ui.MainActivity$initView$3$1$1, reason: invalid class name and collision with other inner class name */
            public static final class C80241 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

                /* renamed from: a */
                public int f6351a;

                /* renamed from: b */
                public final /* synthetic */ MainActivity f6352b;

                @Metadata(m7879d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m7880d2 = {"<anonymous>", "", "it", "Lcom/zykj/lib/error/code/ErrorCode;"}, m7881k = 3, m7882mv = {2, 2, 0}, m7884xi = 48)
                @DebugMetadata(m7917c = "com.zykj.huiwei.launcher.ui.MainActivity$initView$3$1$1$1", m7918f = "MainActivity.kt", m7919i = {}, m7920l = {}, m7921m = "invokeSuspend", m7922n = {}, m7923s = {})
                /* renamed from: com.zykj.huiwei.launcher.ui.MainActivity$initView$3$1$1$1, reason: invalid class name and collision with other inner class name */
                public static final class C80251 extends SuspendLambda implements Function2<ErrorCode, Continuation<? super Unit>, Object> {

                    /* renamed from: a */
                    public int f6353a;

                    /* renamed from: b */
                    public /* synthetic */ Object f6354b;

                    /* renamed from: c */
                    public final /* synthetic */ MainActivity f6355c;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public C80251(MainActivity mainActivity, Continuation continuation) {
                        super(2, continuation);
                        this.f6355c = mainActivity;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    /* renamed from: a, reason: merged with bridge method [inline-methods] */
                    public final Object invoke(ErrorCode errorCode, Continuation continuation) {
                        return ((C80251) create(errorCode, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Continuation create(Object obj, Continuation continuation) {
                        C80251 c80251 = new C80251(this.f6355c, continuation);
                        c80251.f6354b = obj;
                        return c80251;
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        ErrorCode errorCode = (ErrorCode) this.f6354b;
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.f6353a != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        if (errorCode == ErrorCode.NET_TOKEN_ERROR) {
                            FragmentContainerView navHostFragmentContainer = ((HwActivityMainBinding) this.f6355c.getMBindView()).navHostFragmentContainer;
                            Intrinsics.checkNotNullExpressionValue(navHostFragmentContainer, "navHostFragmentContainer");
                            NavController navControllerFindNavController = ViewKt.findNavController(navHostFragmentContainer);
                            synchronized (navControllerFindNavController) {
                                try {
                                    NavDestination currentDestination = navControllerFindNavController.getCurrentDestination();
                                    if (currentDestination == null || currentDestination.getId() != R.id.unAuthorDialog) {
                                        navControllerFindNavController.navigate(R.id.unAuthorDialog);
                                    }
                                    Unit unit = Unit.INSTANCE;
                                } catch (Throwable th) {
                                    throw th;
                                }
                            }
                        }
                        return Unit.INSTANCE;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C80241(MainActivity mainActivity, Continuation continuation) {
                    super(2, continuation);
                    this.f6352b = mainActivity;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation create(Object obj, Continuation continuation) {
                    return new C80241(this.f6352b, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                    return invoke2(coroutineScope, (Continuation) continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i6 = this.f6351a;
                    if (i6 == 0) {
                        ResultKt.throwOnFailure(obj);
                        MutableSharedFlow mutableSharedFlowM6156l = this.f6352b.m5552S().getUnauthorizedFlow();
                        C80251 c80251 = new C80251(this.f6352b, null);
                        this.f6351a = 1;
                        if (FlowKt.collectLatest(mutableSharedFlowM6156l, c80251, this) == coroutine_suspended) {
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
                    return ((C80241) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(MainActivity mainActivity, Continuation continuation) {
                super(2, continuation);
                this.f6350c = mainActivity;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f6350c, continuation);
                anonymousClass1.f6349b = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return invoke2(coroutineScope, (Continuation) continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                CoroutineScope coroutineScope = (CoroutineScope) this.f6349b;
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.f6348a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new C80241(this.f6350c, null), 3, null);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(CoroutineScope coroutineScope, Continuation continuation) {
                return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        public C60963(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return MainActivity.this.new C60963(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return invoke2(coroutineScope, (Continuation) continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i6 = this.f6346a;
            if (i6 == 0) {
                ResultKt.throwOnFailure(obj);
                MainActivity mainActivity = MainActivity.this;
                Lifecycle.State state = Lifecycle.State.RESUMED;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(mainActivity, null);
                this.f6346a = 1;
                if (RepeatOnLifecycleKt.repeatOnLifecycle(mainActivity, state, anonymousClass1, this) == coroutine_suspended) {
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
            return ((C60963) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public MainActivity() {
        final Function0 function0 = null;
        this.viewModel = new ViewModelLazy(Reflection.getOrCreateKotlinClass(MainViewModel.class), new Function0<ViewModelStore>() { // from class: com.zykj.huiwei.launcher.ui.MainActivity$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStore invoke() {
                return this.getViewModelStore();
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.zykj.huiwei.launcher.ui.MainActivity$special$$inlined$viewModels$default$1
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelProvider.Factory invoke() {
                return this.getDefaultViewModelProviderFactory();
            }
        }, new Function0<CreationExtras>() { // from class: com.zykj.huiwei.launcher.ui.MainActivity$special$$inlined$viewModels$default$3
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
        this.unAuthorModel = new ViewModelLazy(Reflection.getOrCreateKotlinClass(UnAuthorViewModel.class), new Function0<ViewModelStore>() { // from class: com.zykj.huiwei.launcher.ui.MainActivity$special$$inlined$viewModels$default$5
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStore invoke() {
                return this.getViewModelStore();
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.zykj.huiwei.launcher.ui.MainActivity$special$$inlined$viewModels$default$4
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelProvider.Factory invoke() {
                return this.getDefaultViewModelProviderFactory();
            }
        }, new Function0<CreationExtras>() { // from class: com.zykj.huiwei.launcher.ui.MainActivity$special$$inlined$viewModels$default$6
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

    /* renamed from: F */
    public static final C6089b m5521F(MainActivity mainActivity) {
        return mainActivity.new C6089b();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.zykj.huiwei.launcher.ui.MainActivity$appStatusFilterReceiver$2$1] */
    /* renamed from: G */
    public static final MainActivity$appStatusFilterReceiver$2$1 m5522G(final MainActivity mainActivity) {
        return new BroadcastReceiver() { // from class: com.zykj.huiwei.launcher.ui.MainActivity$appStatusFilterReceiver$2$1
            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this.f6310a), null, null, new MainActivity$appStatusFilterReceiver$2$1$onReceive$1(intent, this.f6310a, null), 3, null);
            }
        };
    }

    /* renamed from: I */
    public static final ServiceConnectionC6090c m5523I(MainActivity mainActivity) {
        return mainActivity.new ServiceConnectionC6090c();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.zykj.huiwei.launcher.ui.MainActivity$filterAppListReceiver$2$1] */
    /* renamed from: J */
    public static final MainActivity$filterAppListReceiver$2$1 m5524J(final MainActivity mainActivity) {
        return new BroadcastReceiver() { // from class: com.zykj.huiwei.launcher.ui.MainActivity$filterAppListReceiver$2$1
            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this.f6324a), null, null, new MainActivity$filterAppListReceiver$2$1$onReceive$1(intent, this.f6324a, null), 3, null);
            }
        };
    }

    /* renamed from: U */
    public static final Unit m5525U(MainActivity mainActivity, MyFloatingToolService service) {
        Intrinsics.checkNotNullParameter(service, "service");
        mainActivity.isFloatingToolServiceBound = true;
        Objects.toString(service);
        return Unit.INSTANCE;
    }

    /* renamed from: V */
    public static final Unit m5526V(MainActivity mainActivity) {
        mainActivity.isFloatingToolServiceBound = false;
        return Unit.INSTANCE;
    }

    /* renamed from: W */
    public static final Unit m5527W(MainActivity mainActivity, Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        Objects.toString(uri);
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(mainActivity), null, null, new MainActivity$initFloatLaunchers$3$1(mainActivity, uri, null), 3, null);
        return Unit.INSTANCE;
    }

    /* renamed from: Y */
    public static final void m5528Y(MainActivity mainActivity, List list) {
        new Gson().toJson(list);
        MutableStateFlow mutableStateFlowM6151g = mainActivity.m5552S().getAppList();
        Intrinsics.checkNotNull(list);
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C6428a c6428a = (C6428a) it.next();
            String label = c6428a.f8102a;
            Intrinsics.checkNotNullExpressionValue(label, "label");
            String iconCachePath = c6428a.f8105d;
            Intrinsics.checkNotNullExpressionValue(iconCachePath, "iconCachePath");
            String packageName = c6428a.f8103b;
            Intrinsics.checkNotNullExpressionValue(packageName, "packageName");
            String className = c6428a.f8104c.getClassName();
            Intrinsics.checkNotNullExpressionValue(className, "getClassName(...)");
            arrayList.add(new BaseAppInfo(label, iconCachePath, packageName, className));
        }
        mutableStateFlowM6151g.setValue(arrayList);
    }

    /* renamed from: a0 */
    public static final Unit m5529a0(ToastMessage toastMessage) {
        C6548r c6548r = C6548r.f8382a;
        Intrinsics.checkNotNull(toastMessage);
        c6548r.m7409a(toastMessage);
        return Unit.INSTANCE;
    }

    /* renamed from: b0 */
    public static final Unit m5530b0(Integer num) {
        if (num != null && num.intValue() == 1) {
            AbstractC6537g.a.m7309i(AbstractC6537g.f8372a, false, 1, null);
        }
        return Unit.INSTANCE;
    }

    /* renamed from: c0 */
    public static final C6091d m5531c0() {
        return new C6091d();
    }

    /* renamed from: e0 */
    public static final C6093f m5532e0(MainActivity mainActivity) {
        return mainActivity.new C6093f();
    }

    /* renamed from: H */
    public final void m5543H() {
        Intent intent = new Intent();
        intent.setPackage("cn.com.techvision.settingserver");
        intent.setAction("cn.com.techvision.action.BIND_SYSTEM_SERVICE");
        bindService(intent, m5546M(), 1);
    }

    /* renamed from: K */
    public final C6089b m5544K() {
        return (C6089b) this.appChanged.getValue();
    }

    /* renamed from: L */
    public final MainActivity$appStatusFilterReceiver$2$1 m5545L() {
        return (MainActivity$appStatusFilterReceiver$2$1) this.appStatusFilterReceiver.getValue();
    }

    /* renamed from: M */
    public final ServiceConnectionC6090c m5546M() {
        return (ServiceConnectionC6090c) this.connection.getValue();
    }

    /* renamed from: N */
    public final MainActivity$filterAppListReceiver$2$1 m5547N() {
        return (MainActivity$filterAppListReceiver$2$1) this.filterAppListReceiver.getValue();
    }

    /* renamed from: O */
    public final C6591e m5548O() {
        C6591e c6591e = this.floatingToolManager;
        if (c6591e != null) {
            return c6591e;
        }
        Intrinsics.throwUninitializedPropertyAccessException("floatingToolManager");
        return null;
    }

    /* renamed from: P */
    public final C6091d m5549P() {
        return (C6091d) this.lCLogoutReceiver.getValue();
    }

    /* renamed from: Q */
    public final C6093f m5550Q() {
        return (C6093f) this.snRv.getValue();
    }

    /* renamed from: R */
    public final UnAuthorViewModel m5551R() {
        return (UnAuthorViewModel) this.unAuthorModel.getValue();
    }

    /* renamed from: S */
    public final MainViewModel m5552S() {
        return (MainViewModel) this.viewModel.getValue();
    }

    /* renamed from: T */
    public final void m5553T() {
        m5556d0(new C6591e(this, new Function1() { // from class: y3.l
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MainActivity.m5525U(this.f10635a, (MyFloatingToolService) obj);
            }
        }, new Function0() { // from class: y3.b
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return MainActivity.m5526V(this.f10627a);
            }
        }, new Function1() { // from class: y3.c
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MainActivity.m5527W(this.f10628a, (Uri) obj);
            }
        }));
    }

    /* renamed from: X */
    public final void m5554X() {
        C6429b.f8106a.m7036a(App.INSTANCE.m5206a(), new InterfaceC6430c() { // from class: y3.k
            @Override // p066h.InterfaceC6430c
            /* renamed from: a */
            public final void mo7038a(List list) {
                MainActivity.m5528Y(this.f10634a, list);
            }
        });
    }

    /* renamed from: Z */
    public final void m5555Z() {
        C6091d c6091dM5549P = m5549P();
        IntentFilter intentFilter = new IntentFilter("com.android.launcher3.mdm.LOGOUT");
        Unit unit = Unit.INSTANCE;
        registerReceiver(c6091dM5549P, intentFilter);
        registerReceiver(m5545L(), new IntentFilter("com.android.launcher3.mdm.control_default_apps"));
        registerReceiver(m5547N(), new IntentFilter("com.linspirer.edu.appstorelist"));
        registerReceiver(m5550Q(), new IntentFilter("com.android.laucher3.mdm.obtaindevicesn"));
        C6089b c6089bM5544K = m5544K();
        IntentFilter intentFilter2 = new IntentFilter();
        intentFilter2.addAction("android.intent.action.PACKAGE_REMOVED");
        intentFilter2.addAction("android.intent.action.PACKAGE_ADDED");
        intentFilter2.addDataScheme("package");
        registerReceiver(c6089bM5544K, intentFilter2);
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new MainActivity$initLC$6(this, null), 3, null);
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new MainActivity$initLC$7(this, null), 3, null);
        m5557f0();
    }

    /* renamed from: d0 */
    public final void m5556d0(C6591e c6591e) {
        Intrinsics.checkNotNullParameter(c6591e, "<set-?>");
        this.floatingToolManager = c6591e;
    }

    /* renamed from: f0 */
    public final void m5557f0() {
        LifecycleOwnerKt.getLifecycleScope(this).launchWhenResumed(new MainActivity$tryGetSn$1(this, null));
    }

    /* renamed from: g0 */
    public final void m5558g0() {
        if (this.isFloatingToolServiceBound) {
            m5548O().m7505s();
            this.isFloatingToolServiceBound = false;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p149s3.InterfaceC7697e
    public NavController getNavController() {
        FragmentContainerView navHostFragmentContainer = ((HwActivityMainBinding) getMBindView()).navHostFragmentContainer;
        Intrinsics.checkNotNullExpressionValue(navHostFragmentContainer, "navHostFragmentContainer");
        return ViewKt.findNavController(navHostFragmentContainer);
    }

    @Override // com.zykj.base.BaseActivity
    public Object initView(Bundle bundle, Continuation continuation) {
        LifecycleOwnerKt.getLifecycleScope(this).launchWhenResumed(new C60952(null));
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C60963(null), 3, null);
        m5552S().getToastLiveData().observe(this, new C6092e(new Function1() { // from class: y3.a
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MainActivity.m5529a0((ToastMessage) obj);
            }
        }));
        new PolicyHelper.Builder(this).m6240e("https://web.alicdn.zykj.org/privacypolicy/huiweiDesktop/userServiceAgreement.html").m6239d("https://web.alicdn.zykj.org/privacypolicy/huiweiDesktop/userPrivacyPolicy.html").m6242g();
        m5551R().getCallback().observe(this, new C6092e(new Function1() { // from class: y3.d
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MainActivity.m5530b0((Integer) obj);
            }
        }));
        if (AbstractC6537g.f8372a.m7316g()) {
            m5555Z();
            m5553T();
        } else {
            m5554X();
        }
        return Unit.INSTANCE;
    }

    @Override // com.zykj.base.BaseActivity
    public int layoutId() {
        return R.layout.hw_activity_main;
    }

    @Override // com.zykj.huiwei.launcher.p035ui.Hilt_MainActivity, com.zykj.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        Window window = getWindow();
        if (window != null) {
            window.setBackgroundDrawable(null);
        }
        super.onCreate(savedInstanceState);
    }

    @Override // com.zykj.huiwei.launcher.p035ui.Hilt_MainActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        try {
            Result.Companion companion = Result.INSTANCE;
            if (AbstractC6537g.f8372a.m7316g()) {
                unregisterReceiver(m5545L());
                unregisterReceiver(m5547N());
                unregisterReceiver(m5549P());
                unregisterReceiver(m5550Q());
                unregisterReceiver(m5544K());
                m5558g0();
            } else {
                unbindService(m5546M());
            }
            Result.m17183constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.m17183constructorimpl(ResultKt.createFailure(th));
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        if (AbstractC6537g.f8372a.m7316g()) {
            Intent intent = new Intent();
            intent.setAction("com.linspirer.edu.enablehome");
            intent.setPackage("com.android.launcher3");
            sendBroadcast(intent);
        }
    }

    @Override // com.zykj.huiwei.launcher.base.CommonActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        if (!AbstractC6537g.f8372a.m7316g()) {
            m5543H();
            return;
        }
        Intent intent = new Intent();
        intent.setAction("com.linspirer.edu.disablehome");
        intent.setPackage("com.android.launcher3");
        sendBroadcast(intent);
        Intent intent2 = new Intent();
        intent2.setAction("com.linspirer.edu.get_gesture_state");
        intent2.setPackage("com.android.launcher3");
        sendBroadcast(intent2);
    }
}
