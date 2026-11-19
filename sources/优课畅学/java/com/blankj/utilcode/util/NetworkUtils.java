package com.blankj.utilcode.util;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.text.TextUtils;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/* loaded from: classes3.dex */
public abstract class NetworkUtils {

    /* renamed from: a */
    public static final Set f2623a = new CopyOnWriteArraySet();

    public enum NetworkType {
        NETWORK_ETHERNET,
        NETWORK_WIFI,
        NETWORK_5G,
        NETWORK_4G,
        NETWORK_3G,
        NETWORK_2G,
        NETWORK_UNKNOWN,
        NETWORK_NO
    }

    /* renamed from: com.blankj.utilcode.util.NetworkUtils$a */
    public static final class C5339a extends BroadcastReceiver {

        /* renamed from: a */
        public NetworkType f2633a;

        /* renamed from: b */
        public Set f2634b = new HashSet();

        /* renamed from: com.blankj.utilcode.util.NetworkUtils$a$a */
        public class a implements Runnable {

            /* renamed from: a */
            public final /* synthetic */ InterfaceC5340b f2635a;

            public a(InterfaceC5340b interfaceC5340b) {
                this.f2635a = interfaceC5340b;
            }

            @Override // java.lang.Runnable
            public void run() {
                int size = C5339a.this.f2634b.size();
                C5339a.this.f2634b.add(this.f2635a);
                if (size == 0 && C5339a.this.f2634b.size() == 1) {
                    C5339a.this.f2633a = NetworkUtils.m2355b();
                    AbstractC5366h0.m2478a().registerReceiver(C5339a.m2368e(), new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
                }
            }
        }

        /* renamed from: com.blankj.utilcode.util.NetworkUtils$a$b */
        public class b implements Runnable {

            /* renamed from: a */
            public final /* synthetic */ InterfaceC5340b f2637a;

            public b(InterfaceC5340b interfaceC5340b) {
                this.f2637a = interfaceC5340b;
            }

            @Override // java.lang.Runnable
            public void run() {
                int size = C5339a.this.f2634b.size();
                C5339a.this.f2634b.remove(this.f2637a);
                if (size == 1 && C5339a.this.f2634b.size() == 0) {
                    AbstractC5366h0.m2478a().unregisterReceiver(C5339a.m2368e());
                }
            }
        }

        /* renamed from: com.blankj.utilcode.util.NetworkUtils$a$c */
        public class c implements Runnable {
            public c() {
            }

            @Override // java.lang.Runnable
            public void run() {
                NetworkType networkTypeM2355b = NetworkUtils.m2355b();
                if (C5339a.this.f2633a == networkTypeM2355b) {
                    return;
                }
                C5339a.this.f2633a = networkTypeM2355b;
                if (networkTypeM2355b == NetworkType.NETWORK_NO) {
                    Iterator it = C5339a.this.f2634b.iterator();
                    while (it.hasNext()) {
                        ((InterfaceC5340b) it.next()).mo2373b();
                    }
                } else {
                    Iterator it2 = C5339a.this.f2634b.iterator();
                    while (it2.hasNext()) {
                        ((InterfaceC5340b) it2.next()).mo2372a(networkTypeM2355b);
                    }
                }
            }
        }

        /* renamed from: com.blankj.utilcode.util.NetworkUtils$a$d */
        public static class d {

            /* renamed from: a */
            public static final C5339a f2640a = new C5339a();
        }

        /* renamed from: e */
        public static C5339a m2368e() {
            return d.f2640a;
        }

        /* renamed from: f */
        public void m2369f(InterfaceC5340b interfaceC5340b) {
            if (interfaceC5340b == null) {
                return;
            }
            AbstractC5372k0.m2539J(new a(interfaceC5340b));
        }

        /* renamed from: g */
        public void m2370g(InterfaceC5340b interfaceC5340b) {
            if (interfaceC5340b == null) {
                return;
            }
            AbstractC5372k0.m2539J(new b(interfaceC5340b));
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if ("android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
                AbstractC5372k0.m2540K(new c(), 1000L);
            }
        }
    }

    /* renamed from: com.blankj.utilcode.util.NetworkUtils$b */
    public interface InterfaceC5340b {
        /* renamed from: a */
        void mo2372a(NetworkType networkType);

        /* renamed from: b */
        void mo2373b();
    }

    /* renamed from: a */
    public static NetworkInfo m2354a() {
        ConnectivityManager connectivityManager = (ConnectivityManager) AbstractC5366h0.m2478a().getSystemService("connectivity");
        if (connectivityManager == null) {
            return null;
        }
        return connectivityManager.getActiveNetworkInfo();
    }

    /* renamed from: b */
    public static NetworkType m2355b() {
        if (m2361h()) {
            return NetworkType.NETWORK_ETHERNET;
        }
        NetworkInfo networkInfoM2354a = m2354a();
        if (networkInfoM2354a == null || !networkInfoM2354a.isAvailable()) {
            return NetworkType.NETWORK_NO;
        }
        if (networkInfoM2354a.getType() == 1) {
            return NetworkType.NETWORK_WIFI;
        }
        if (networkInfoM2354a.getType() != 0) {
            return NetworkType.NETWORK_UNKNOWN;
        }
        switch (networkInfoM2354a.getSubtype()) {
            case 1:
            case 2:
            case 4:
            case 7:
            case 11:
            case 16:
                return NetworkType.NETWORK_2G;
            case 3:
            case 5:
            case 6:
            case 8:
            case 9:
            case 10:
            case 12:
            case 14:
            case 15:
            case 17:
                return NetworkType.NETWORK_3G;
            case 13:
            case 18:
                return NetworkType.NETWORK_4G;
            case 19:
            default:
                String subtypeName = networkInfoM2354a.getSubtypeName();
                return (subtypeName.equalsIgnoreCase("TD-SCDMA") || subtypeName.equalsIgnoreCase("WCDMA") || subtypeName.equalsIgnoreCase("CDMA2000")) ? NetworkType.NETWORK_3G : NetworkType.NETWORK_UNKNOWN;
            case 20:
                return NetworkType.NETWORK_5G;
        }
    }

    /* renamed from: c */
    public static boolean m2356c() {
        return m2357d() || m2359f(null);
    }

    /* renamed from: d */
    public static boolean m2357d() {
        return m2358e("");
    }

    /* renamed from: e */
    public static boolean m2358e(String str) {
        if (TextUtils.isEmpty(str)) {
            str = "www.baidu.com";
        }
        try {
            return InetAddress.getByName(str) != null;
        } catch (UnknownHostException e10) {
            e10.printStackTrace();
            return false;
        }
    }

    /* renamed from: f */
    public static boolean m2359f(String str) {
        if (TextUtils.isEmpty(str)) {
            str = "223.5.5.5";
        }
        return AbstractC5354b0.m2431a(String.format("ping -c 1 %s", str), false).f2691a == 0;
    }

    /* renamed from: g */
    public static boolean m2360g() {
        NetworkInfo networkInfoM2354a = m2354a();
        return networkInfoM2354a != null && networkInfoM2354a.isConnected();
    }

    /* renamed from: h */
    public static boolean m2361h() {
        NetworkInfo networkInfo;
        NetworkInfo.State state;
        ConnectivityManager connectivityManager = (ConnectivityManager) AbstractC5366h0.m2478a().getSystemService("connectivity");
        if (connectivityManager == null || (networkInfo = connectivityManager.getNetworkInfo(9)) == null || (state = networkInfo.getState()) == null) {
            return false;
        }
        return state == NetworkInfo.State.CONNECTED || state == NetworkInfo.State.CONNECTING;
    }

    /* renamed from: i */
    public static void m2362i(InterfaceC5340b interfaceC5340b) {
        C5339a.m2368e().m2369f(interfaceC5340b);
    }

    /* renamed from: j */
    public static void m2363j(InterfaceC5340b interfaceC5340b) {
        C5339a.m2368e().m2370g(interfaceC5340b);
    }
}
