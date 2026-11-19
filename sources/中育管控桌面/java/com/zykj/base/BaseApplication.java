package com.zykj.base;

import android.app.Application;
import androidx.annotation.Keep;
import kotlin.Metadata;
import p126p1.AbstractC7591b;

@Keep
@Metadata(m7879d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, m7880d2 = {"Lcom/zykj/base/BaseApplication;", "Landroid/app/Application;", "<init>", "()V", "onCreate", "", "base_release"}, m7881k = 1, m7882mv = {2, 2, 0}, m7884xi = 48)
/* loaded from: classes3.dex */
public abstract class BaseApplication extends Application {
    @Override // android.app.Application
    public void onCreate() {
        super.onCreate();
        AbstractC7591b.m9002e(this);
    }
}
