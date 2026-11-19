package androidx.multidex;

import android.app.Application;
import android.content.Context;
import p122n0.C2878a;

/* loaded from: classes.dex */
public class MultiDexApplication extends Application {
    @Override // android.content.ContextWrapper
    protected void attachBaseContext(Context context) {
        super.attachBaseContext(context);
        C2878a.m9899l(this);
    }
}
