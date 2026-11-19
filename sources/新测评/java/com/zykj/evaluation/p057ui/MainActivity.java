package com.zykj.evaluation.p057ui;

import android.os.Bundle;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.exifinterface.media.ExifInterface;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.blankj.utilcode.util.LogUtils;
import com.blankj.utilcode.util.PathUtils;
import com.blankj.utilcode.util.PermissionUtils;
import com.tencent.bugly.crashreport.CrashReport;
import com.zykj.evaluation.R;
import com.zykj.evaluation.p057ui.MainActivity;
import com.zykj.message.client.MessageClient;
import com.zykj.message.server.bean.ServerInfo;
import com.zykj.message.server.bean.Status;
import com.zykj.message.server.bean.UserInfo;
import java.io.File;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import p158l7.C8514a;

@StabilityInferred(parameters = 0)
@Metadata(m13557d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0014¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\t\u0010\u0003J\u000f\u0010\n\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\n\u0010\u0003J\u000f\u0010\u000b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000b\u0010\u0003R\u001b\u0010\u0011\u001a\u00020\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, m13558d2 = {"Lcom/zykj/evaluation/ui/MainActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "(Landroid/os/Bundle;)V", "onResume", "w", ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "Lcom/zykj/evaluation/ui/MainViewModel;", "e", "Lkotlin/Lazy;", "v", "()Lcom/zykj/evaluation/ui/MainViewModel;", "mainViewModel", "app_release"}, m13559k = 1, m13560mv = {2, 2, 0}, m13562xi = 48)
@SourceDebugExtension({"SMAP\nMainActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MainActivity.kt\ncom/zykj/evaluation/ui/MainActivity\n+ 2 ActivityViewModelLazy.kt\nandroidx/activity/ActivityViewModelLazyKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,134:1\n70#2,11:135\n1#3:146\n*S KotlinDebug\n*F\n+ 1 MainActivity.kt\ncom/zykj/evaluation/ui/MainActivity\n*L\n32#1:135,11\n*E\n"})
/* loaded from: classes4.dex */
public final class MainActivity extends Hilt_MainActivity {

    /* renamed from: e, reason: from kotlin metadata */
    public final Lazy mainViewModel;

    public MainActivity() {
        final Function0 function0 = null;
        this.mainViewModel = new ViewModelLazy(Reflection.getOrCreateKotlinClass(MainViewModel.class), new Function0<ViewModelStore>() { // from class: com.zykj.evaluation.ui.MainActivity$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStore invoke() {
                return this.getViewModelStore();
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.zykj.evaluation.ui.MainActivity$special$$inlined$viewModels$default$1
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelProvider.Factory invoke() {
                return this.getDefaultViewModelProviderFactory();
            }
        }, new Function0<CreationExtras>() { // from class: com.zykj.evaluation.ui.MainActivity$special$$inlined$viewModels$default$3
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

    /* renamed from: x */
    public static final Unit m8840x(MainActivity mainActivity, ServerInfo serverInfo) {
        if ((serverInfo != null ? serverInfo.m10596b() : null) == Status.LOGIN) {
            mainActivity.m8844v().m9087g(serverInfo);
            UserInfo userInfoMo10566j = MessageClient.f10635a.mo10566j();
            if (userInfoMo10566j != null) {
                mainActivity.m8844v().m9088h(userInfoMo10566j);
            }
        } else {
            C8514a.m13989h().m13990c();
        }
        return Unit.INSTANCE;
    }

    /* renamed from: y */
    public static final Unit m8841y(MainActivity mainActivity, ServerInfo it) {
        Intrinsics.checkNotNullParameter(it, "it");
        mainActivity.m8844v().m9087g(it);
        mainActivity.m8843A();
        return Unit.INSTANCE;
    }

    /* renamed from: z */
    public static final Unit m8842z(MainActivity mainActivity, UserInfo it) {
        Intrinsics.checkNotNullParameter(it, "it");
        mainActivity.m8844v().m9088h(it);
        CrashReport.setUserId(it.m10605d() + "_" + it.m10604c());
        LogUtils.Config config = LogUtils.getConfig();
        String externalAppFilesPath = PathUtils.getExternalAppFilesPath();
        String str = File.separator;
        config.setDir(externalAppFilesPath + str + "log" + str + it.m10602a() + str);
        mainActivity.m8844v().m9089i();
        return Unit.INSTANCE;
    }

    /* renamed from: A */
    public final void m8843A() {
        MessageClient messageClient = MessageClient.f10635a;
        if (messageClient.mo10569o()) {
            try {
                String strMo10564a = messageClient.mo10564a();
                if (strMo10564a != null) {
                    if (strMo10564a.length() <= 0) {
                        strMo10564a = null;
                    }
                    if (strMo10564a != null) {
                        CrashReport.setDeviceId(this, strMo10564a);
                    }
                }
            } catch (SecurityException e10) {
                LogUtils.m3238e("getSNInfo 无权限读取设备序列号: " + e10.getMessage());
            } catch (Exception e11) {
                LogUtils.m3238e("getSNInfo 失败: " + e11.getMessage());
            }
        }
    }

    @Override // com.zykj.evaluation.p057ui.Hilt_MainActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        m8845w();
        PermissionUtils.permission("com.zykj.message.USER_INFO").request();
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        MessageClient messageClient = MessageClient.f10635a;
        messageClient.mo10565f(new Function1() { // from class: s5.f
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MainActivity.m8841y(this.f15892a, (ServerInfo) obj);
            }
        });
        messageClient.mo10567k(new Function1() { // from class: s5.g
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MainActivity.m8842z(this.f15898a, (UserInfo) obj);
            }
        });
    }

    /* renamed from: v */
    public final MainViewModel m8844v() {
        return (MainViewModel) this.mainViewModel.getValue();
    }

    /* renamed from: w */
    public final void m8845w() {
        MessageClient.f10635a.mo10572s(new Function1() { // from class: s5.e
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MainActivity.m8840x(this.f15888a, (ServerInfo) obj);
            }
        });
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new MainActivity$initData$2(this, null), 3, null);
    }
}
