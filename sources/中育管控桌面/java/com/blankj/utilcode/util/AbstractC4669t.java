package com.blankj.utilcode.util;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.text.TextUtils;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: com.blankj.utilcode.util.t */
/* loaded from: classes3.dex */
public abstract class AbstractC4669t {

    /* renamed from: a */
    public static final Set f2144a = new CopyOnWriteArraySet();

    /* renamed from: a */
    public static NetworkInfo m2427a() {
        ConnectivityManager connectivityManager = (ConnectivityManager) AbstractC4657l0.m2250a().getSystemService("connectivity");
        if (connectivityManager == null) {
            return null;
        }
        return connectivityManager.getActiveNetworkInfo();
    }

    /* renamed from: b */
    public static boolean m2428b() {
        return m2429c() || m2431e(null);
    }

    /* renamed from: c */
    public static boolean m2429c() {
        return m2430d("");
    }

    /* renamed from: d */
    public static boolean m2430d(String str) {
        if (TextUtils.isEmpty(str)) {
            str = "www.baidu.com";
        }
        try {
            return InetAddress.getByName(str) != null;
        } catch (UnknownHostException e6) {
            e6.printStackTrace();
            return false;
        }
    }

    /* renamed from: e */
    public static boolean m2431e(String str) {
        if (TextUtils.isEmpty(str)) {
            str = "223.5.5.5";
        }
        return AbstractC4645f0.m2178a(String.format("ping -c 1 %s", str), false).f2076a == 0;
    }

    /* renamed from: f */
    public static boolean m2432f() {
        NetworkInfo networkInfoM2427a = m2427a();
        return networkInfoM2427a != null && networkInfoM2427a.isConnected();
    }
}
