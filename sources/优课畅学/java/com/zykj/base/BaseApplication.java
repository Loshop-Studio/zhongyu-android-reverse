package com.zykj.base;

import android.app.Application;
import androidx.annotation.Keep;
import p150k1.AbstractC9051b;

@Keep
/* loaded from: classes4.dex */
public abstract class BaseApplication extends Application {
    @Override // android.app.Application
    public void onCreate() {
        super.onCreate();
        AbstractC9051b.m15852g(this);
    }
}
