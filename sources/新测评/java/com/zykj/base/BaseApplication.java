package com.zykj.base;

import android.app.Application;
import androidx.annotation.Keep;
import kotlin.Metadata;
import p186o2.AbstractC8697b;

@Keep
@Metadata(m13557d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, m13558d2 = {"Lcom/zykj/base/BaseApplication;", "Landroid/app/Application;", "<init>", "()V", "onCreate", "", "base_release"}, m13559k = 1, m13560mv = {2, 2, 0}, m13562xi = 48)
/* loaded from: classes4.dex */
public abstract class BaseApplication extends Application {
    @Override // android.app.Application
    public void onCreate() {
        super.onCreate();
        AbstractC8697b.m14303e(this);
    }
}
