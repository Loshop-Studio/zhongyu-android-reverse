package com.zykj.evaluation;

import android.content.Context;
import android.webkit.WebView;
import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.hilt.work.HiltWorkerFactory;
import androidx.work.Configuration;
import coil3.C5167a;
import coil3.C5203l;
import coil3.InterfaceC5193e;
import coil3.intercept.InterfaceC5200a;
import com.blankj.utilcode.util.LogUtils;
import com.blankj.utilcode.util.ReflectUtils;
import com.blankj.utilcode.util.ScreenUtils;
import com.tencent.bugly.crashreport.CrashReport;
import com.zykj.evaluation.bean.constant.Bugly;
import com.zykj.evaluation.upload.OssTaskManger;
import com.zykj.message.client.MessageClient;
import java.io.File;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import p143k5.AbstractApplicationC7890j;
import p290y.C9886e;

@StabilityInferred(parameters = 0)
@Keep
@Metadata(m13557d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\u0005J\u000f\u0010\b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\b\u0010\u0005J\u000f\u0010\t\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\u0005J\u000f\u0010\n\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\n\u0010\u0005J\u001b\u0010\u000f\u001a\u00020\u000e2\n\u0010\r\u001a\u00060\u000bj\u0002`\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\"\u0010\u0012\u001a\u00020\u00118\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\"\u0010\u0019\u001a\u00020\u00188\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u0014\u0010\"\u001a\u00020\u001f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b \u0010!¨\u0006#"}, m13558d2 = {"Lcom/zykj/evaluation/App;", "Landroid/app/Application;", "Landroidx/work/Configuration$Provider;", "Lcoil3/l$a;", "<init>", "()V", "", "initMessageClient", "reflectComposeValue", "initLogHelper", "onCreate", "Landroid/content/Context;", "Lcoil3/PlatformContext;", "context", "Lcoil3/e;", "newImageLoader", "(Landroid/content/Context;)Lcoil3/e;", "Lcom/zykj/evaluation/upload/OssTaskManger;", "ossTaskManger", "Lcom/zykj/evaluation/upload/OssTaskManger;", "getOssTaskManger", "()Lcom/zykj/evaluation/upload/OssTaskManger;", "setOssTaskManger", "(Lcom/zykj/evaluation/upload/OssTaskManger;)V", "Landroidx/hilt/work/HiltWorkerFactory;", "workerFactory", "Landroidx/hilt/work/HiltWorkerFactory;", "getWorkerFactory", "()Landroidx/hilt/work/HiltWorkerFactory;", "setWorkerFactory", "(Landroidx/hilt/work/HiltWorkerFactory;)V", "Landroidx/work/Configuration;", "getWorkManagerConfiguration", "()Landroidx/work/Configuration;", "workManagerConfiguration", "app_release"}, m13559k = 1, m13560mv = {2, 2, 0}, m13562xi = 48)
@SourceDebugExtension({"SMAP\nApp.kt\nKotlin\n*S Kotlin\n*F\n+ 1 App.kt\ncom/zykj/evaluation/App\n+ 2 ImageLoader.kt\ncoil3/ImageLoader$Builder\n*L\n1#1,109:1\n124#2:110\n*S KotlinDebug\n*F\n+ 1 App.kt\ncom/zykj/evaluation/App\n*L\n86#1:110\n*E\n"})
/* loaded from: classes4.dex */
public final class App extends AbstractApplicationC7890j implements Configuration.Provider, C5203l.a {
    public static final int $stable = 8;
    public OssTaskManger ossTaskManger;
    public HiltWorkerFactory workerFactory;

    /* renamed from: com.zykj.evaluation.App$a */
    public static final class C6850a implements InterfaceC5200a {

        /* renamed from: a */
        public static final C6850a f8617a = new C6850a();

        @Override // coil3.intercept.InterfaceC5200a
        /* renamed from: a */
        public final Object mo3083a(InterfaceC5200a.a aVar, Continuation continuation) {
            C9886e c9886eMo3095a = aVar.mo3095a();
            Object objM16618d = c9886eMo3095a.m16618d();
            if (objM16618d instanceof String) {
                String str = (String) objM16618d;
                if (!StringsKt.startsWith$default(str, "http", false, 2, (Object) null)) {
                    String strReplace$default = StringsKt.replace$default(str, "\\", "/", false, 4, (Object) null);
                    File file = new File(strReplace$default);
                    if (file.exists()) {
                        return aVar.mo3097c(C9886e.m16613A(c9886eMo3095a, null, 1, null).m16643c(strReplace$default).m16646f(strReplace$default + "_" + file.lastModified()).m16645e(strReplace$default + "_" + file.lastModified()).m16641a()).mo3096b(continuation);
                    }
                }
            }
            return aVar.mo3096b(continuation);
        }
    }

    private final void initLogHelper() {
        LogUtils.getConfig().setGlobalTag("NewEvaluation");
        LogUtils.getConfig().setLog2FileSwitch(true);
        LogUtils.getConfig().setSaveDays(7);
    }

    private final void initMessageClient() {
        MessageClient.f10635a.mo10568m(this);
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

    @Override // coil3.C5203l.a
    public InterfaceC5193e newImageLoader(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        InterfaceC5193e.a aVar = new InterfaceC5193e.a(context);
        C5167a.a aVar2 = new C5167a.a();
        aVar2.m2857h(C6850a.f8617a);
        return aVar.m3058h(aVar2.m2863p()).m3057d();
    }

    @Override // p143k5.AbstractApplicationC7890j, android.app.Application
    public void onCreate() throws IllegalAccessException, IllegalArgumentException {
        super.onCreate();
        reflectComposeValue();
        initMessageClient();
        WebView.setWebContentsDebuggingEnabled(false);
        WebView.enableSlowWholeDocumentDraw();
        CrashReport.initCrashReport(this, Bugly.APP_ID, false);
        initLogHelper();
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
