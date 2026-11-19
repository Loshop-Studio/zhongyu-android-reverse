package com.taobao.sophix;

import android.app.Application;
import com.taobao.sophix.p059a.C6611e;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes4.dex */
public class SophixApplication extends Application {
    @Override // android.app.Application
    public void onCreate() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        super.onCreate();
        ((C6611e) SophixManager.getInstance()).m4748b();
    }
}
