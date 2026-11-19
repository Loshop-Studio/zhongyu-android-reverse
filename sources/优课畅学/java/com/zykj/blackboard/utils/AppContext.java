package com.zykj.blackboard.utils;

import android.annotation.SuppressLint;
import android.content.Context;
import kotlin.jvm.internal.AbstractC9133u;

@SuppressLint({"StaticFieldLeak"})
/* loaded from: classes4.dex */
public final class AppContext {
    public static final AppContext INSTANCE = new AppContext();
    private static Context context;

    private AppContext() {
    }

    public final Context getContext() {
        return context;
    }

    public final void init(Context context2) {
        AbstractC9133u.m16133g(context2, "context");
        context = context2.getApplicationContext();
    }
}
