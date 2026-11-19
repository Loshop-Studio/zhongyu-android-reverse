package com.blankj.utilcode.util;

import android.os.Handler;
import android.os.Looper;
import java.util.HashMap;
import java.util.Timer;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.blankj.utilcode.util.p */
/* loaded from: classes2.dex */
public abstract class AbstractC3396p {

    /* renamed from: a */
    public static final Handler f2173a = new Handler(Looper.getMainLooper());

    /* renamed from: b */
    public static final HashMap f2174b = new HashMap();

    static {
        new ConcurrentHashMap();
        Runtime.getRuntime().availableProcessors();
        new Timer();
    }
}
