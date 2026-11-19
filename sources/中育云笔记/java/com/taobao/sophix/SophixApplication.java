package com.taobao.sophix;

import android.app.Application;
import com.taobao.sophix.p089a.C7717e;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes5.dex */
public class SophixApplication extends Application {
    @Override // android.app.Application
    public void onCreate() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        super.onCreate();
        ((C7717e) SophixManager.getInstance()).m10260b();
    }
}
