package com.zykj.base;

import android.app.Application;
import android.content.Context;
import androidx.annotation.Keep;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.umeng.analytics.MobclickAgent;
import com.umeng.commonsdk.UMConfigure;
import com.zykj.base.utils.ActivityCollectionHelper;
import java.lang.reflect.InvocationTargetException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p077j0.AbstractC3799b;

@Keep
@Metadata(m5174d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b'\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0014J\n\u0010\u0007\u001a\u0004\u0018\u00010\bH&J\b\u0010\t\u001a\u00020\u0004H\u0016J\b\u0010\n\u001a\u00020\u0004H\u0016¨\u0006\u000b"}, m5175d2 = {"Lcom/zykj/base/BaseApplication;", "Landroid/app/Application;", "()V", "attachBaseContext", "", "base", "Landroid/content/Context;", "initAppKey", "", "onCreate", "onTerminate", "base_release"}, m5176k = 1, m5177mv = {1, 5, 1}, m5179xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes2.dex */
public abstract class BaseApplication extends Application {
    @Override // android.content.ContextWrapper
    public void attachBaseContext(Context base) {
        Intrinsics.checkNotNullParameter(base, "base");
        super.attachBaseContext(base);
        AbstractC3799b.m4961d(this);
    }

    public abstract String initAppKey();

    @Override // android.app.Application
    public void onCreate() throws IllegalAccessException, NoSuchMethodException, ClassNotFoundException, SecurityException, IllegalArgumentException, InvocationTargetException {
        super.onCreate();
        ActivityCollectionHelper.INSTANCE.register(this);
        String strInitAppKey = initAppKey();
        if (strInitAppKey == null) {
            return;
        }
        UMConfigure.init(this, strInitAppKey, null, 1, null);
        MobclickAgent.setPageCollectionMode(MobclickAgent.PageMode.AUTO);
        UMConfigure.setProcessEvent(true);
    }

    @Override // android.app.Application
    public void onTerminate() {
        super.onTerminate();
        MobclickAgent.onKillProcess(this);
        ActivityCollectionHelper.INSTANCE.unRegister(this);
    }
}
