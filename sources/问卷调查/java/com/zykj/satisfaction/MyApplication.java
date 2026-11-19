package com.zykj.satisfaction;

import android.app.Application;
import p070b.p146d.p147a.p148b.EnumC0881b;

/* loaded from: classes.dex */
public final class MyApplication extends Application {
    @Override // android.app.Application
    public void onCreate() {
        super.onCreate();
        EnumC0881b.f4691b.mo2580e(this);
    }

    @Override // android.app.Application
    public void onTerminate() {
        super.onTerminate();
        EnumC0881b.f4691b.mo2581f();
    }
}
