package com.zykj.student.dialogue;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.hilt.work.HiltWorkerFactory;
import androidx.work.Configuration;
import com.blankj.utilcode.util.LogUtils;
import com.blankj.utilcode.util.ReflectUtils;
import com.blankj.utilcode.util.ScreenUtils;
import com.tencent.bugly.crashreport.CrashReport;
import com.zykj.message.client.MessageClient;
import com.zykj.student.dialogue.upload.OssTaskManger;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p118g6.AbstractApplicationC8066j;

@StabilityInferred(parameters = 0)
@Keep
@Metadata(m13412d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\b\u0010\u0015\u001a\u00020\u0016H\u0016J\b\u0010\u0017\u001a\u00020\u0016H\u0002J\b\u0010\u0018\u001a\u00020\u0016H\u0002J\b\u0010\u0019\u001a\u00020\u0016H\u0002J\b\u0010\u001a\u001a\u00020\u0016H\u0002R\u001e\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001e\u0010\u000b\u001a\u00020\f8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\u00128VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u001b"}, m13413d2 = {"Lcom/zykj/student/dialogue/App;", "Landroid/app/Application;", "Landroidx/work/Configuration$Provider;", "<init>", "()V", "ossTaskManger", "Lcom/zykj/student/dialogue/upload/OssTaskManger;", "getOssTaskManger", "()Lcom/zykj/student/dialogue/upload/OssTaskManger;", "setOssTaskManger", "(Lcom/zykj/student/dialogue/upload/OssTaskManger;)V", "workerFactory", "Landroidx/hilt/work/HiltWorkerFactory;", "getWorkerFactory", "()Landroidx/hilt/work/HiltWorkerFactory;", "setWorkerFactory", "(Landroidx/hilt/work/HiltWorkerFactory;)V", "workManagerConfiguration", "Landroidx/work/Configuration;", "getWorkManagerConfiguration", "()Landroidx/work/Configuration;", "onCreate", "", "initBugly", "initMessageClient", "reflectComposeValue", "initLogHelper", "app_release"}, m13414k = 1, m13415mv = {2, 2, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes5.dex */
public final class App extends AbstractApplicationC8066j implements Configuration.Provider {
    public static final int $stable = 8;
    public OssTaskManger ossTaskManger;
    public HiltWorkerFactory workerFactory;

    private final void initBugly() {
        CrashReport.initCrashReport(this, "7e6d1d7c64", false);
    }

    private final void initLogHelper() {
        LogUtils.getConfig().setGlobalTag("StudentDialogue");
        LogUtils.getConfig().setLog2FileSwitch(true);
        LogUtils.getConfig().setSaveDays(7);
    }

    private final void initMessageClient() {
        MessageClient.f10078a.mo9835g(this);
    }

    private final void reflectComposeValue() throws IllegalAccessException, IllegalArgumentException {
        ReflectUtils.reflect("androidx.compose.material3.tokens.NavigationDrawerTokens").field("ContainerWidth", Integer.valueOf(ScreenUtils.getScreenWidth()));
    }

    public final OssTaskManger getOssTaskManger() {
        OssTaskManger ossTaskManger = this.ossTaskManger;
        if (ossTaskManger != null) {
            return ossTaskManger;
        }
        Intrinsics.throwUninitializedPropertyAccessException("ossTaskManger");
        return null;
    }

    @Override // androidx.work.Configuration.Provider
    public Configuration getWorkManagerConfiguration() {
        return new Configuration.Builder().setWorkerFactory(getWorkerFactory()).setMinimumLoggingLevel(3).build();
    }

    public final HiltWorkerFactory getWorkerFactory() {
        HiltWorkerFactory hiltWorkerFactory = this.workerFactory;
        if (hiltWorkerFactory != null) {
            return hiltWorkerFactory;
        }
        Intrinsics.throwUninitializedPropertyAccessException("workerFactory");
        return null;
    }

    @Override // p118g6.AbstractApplicationC8066j, android.app.Application
    public void onCreate() throws IllegalAccessException, IllegalArgumentException {
        super.onCreate();
        reflectComposeValue();
        initMessageClient();
        initLogHelper();
        initBugly();
    }

    public final void setOssTaskManger(OssTaskManger ossTaskManger) {
        Intrinsics.checkNotNullParameter(ossTaskManger, "<set-?>");
        this.ossTaskManger = ossTaskManger;
    }

    public final void setWorkerFactory(HiltWorkerFactory hiltWorkerFactory) {
        Intrinsics.checkNotNullParameter(hiltWorkerFactory, "<set-?>");
        this.workerFactory = hiltWorkerFactory;
    }
}
