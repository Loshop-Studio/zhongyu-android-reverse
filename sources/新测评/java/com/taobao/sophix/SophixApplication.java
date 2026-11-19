package com.taobao.sophix;

import android.app.Application;
import com.taobao.sophix.p042a.C6351e;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes4.dex */
public class SophixApplication extends Application {
    @Override // android.app.Application
    public void onCreate() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        super.onCreate();
        ((C6351e) SophixManager.getInstance()).m4569b();
    }
}
