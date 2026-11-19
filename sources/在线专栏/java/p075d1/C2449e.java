package p075d1;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.os.Build;
import p012b1.C1027b;
import p095h1.InterfaceC2654a;
import p168x.C3430a;
import p169x0.AbstractC3445n;

/* renamed from: d1.e */
/* loaded from: classes.dex */
public class C2449e extends AbstractC2448d<C1027b> {

    /* renamed from: j */
    static final String f10018j = AbstractC3445n.m10503f("NetworkStateTracker");

    /* renamed from: g */
    private final ConnectivityManager f10019g;

    /* renamed from: h */
    private b f10020h;

    /* renamed from: i */
    private a f10021i;

    /* renamed from: d1.e$a */
    private class a extends BroadcastReceiver {
        a() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent == null || intent.getAction() == null || !intent.getAction().equals("android.net.conn.CONNECTIVITY_CHANGE")) {
                return;
            }
            AbstractC3445n.m10501c().mo10504a(C2449e.f10018j, "Network broadcast received", new Throwable[0]);
            C2449e c2449e = C2449e.this;
            c2449e.m8184d(c2449e.m8186g());
        }
    }

    /* renamed from: d1.e$b */
    private class b extends ConnectivityManager.NetworkCallback {
        b() {
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
            AbstractC3445n.m10501c().mo10504a(C2449e.f10018j, String.format("Network capabilities changed: %s", networkCapabilities), new Throwable[0]);
            C2449e c2449e = C2449e.this;
            c2449e.m8184d(c2449e.m8186g());
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onLost(Network network) {
            AbstractC3445n.m10501c().mo10504a(C2449e.f10018j, "Network connection lost", new Throwable[0]);
            C2449e c2449e = C2449e.this;
            c2449e.m8184d(c2449e.m8186g());
        }
    }

    public C2449e(Context context, InterfaceC2654a interfaceC2654a) {
        super(context, interfaceC2654a);
        this.f10019g = (ConnectivityManager) this.f10012b.getSystemService("connectivity");
        if (m8185j()) {
            this.f10020h = new b();
        } else {
            this.f10021i = new a();
        }
    }

    /* renamed from: j */
    private static boolean m8185j() {
        return Build.VERSION.SDK_INT >= 24;
    }

    @Override // p075d1.AbstractC2448d
    /* renamed from: e */
    public void mo8180e() {
        if (!m8185j()) {
            AbstractC3445n.m10501c().mo10504a(f10018j, "Registering broadcast receiver", new Throwable[0]);
            this.f10012b.registerReceiver(this.f10021i, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
            return;
        }
        try {
            AbstractC3445n.m10501c().mo10504a(f10018j, "Registering network callback", new Throwable[0]);
            this.f10019g.registerDefaultNetworkCallback(this.f10020h);
        } catch (IllegalArgumentException | SecurityException e4) {
            AbstractC3445n.m10501c().mo10505b(f10018j, "Received exception while registering network callback", e4);
        }
    }

    @Override // p075d1.AbstractC2448d
    /* renamed from: f */
    public void mo8181f() {
        if (!m8185j()) {
            AbstractC3445n.m10501c().mo10504a(f10018j, "Unregistering broadcast receiver", new Throwable[0]);
            this.f10012b.unregisterReceiver(this.f10021i);
            return;
        }
        try {
            AbstractC3445n.m10501c().mo10504a(f10018j, "Unregistering network callback", new Throwable[0]);
            this.f10019g.unregisterNetworkCallback(this.f10020h);
        } catch (IllegalArgumentException | SecurityException e4) {
            AbstractC3445n.m10501c().mo10505b(f10018j, "Received exception while unregistering network callback", e4);
        }
    }

    /* renamed from: g */
    C1027b m8186g() {
        NetworkInfo activeNetworkInfo = this.f10019g.getActiveNetworkInfo();
        return new C1027b(activeNetworkInfo != null && activeNetworkInfo.isConnected(), m8188i(), C3430a.m10446a(this.f10019g), (activeNetworkInfo == null || activeNetworkInfo.isRoaming()) ? false : true);
    }

    @Override // p075d1.AbstractC2448d
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public C1027b mo8175b() {
        return m8186g();
    }

    /* renamed from: i */
    boolean m8188i() {
        if (Build.VERSION.SDK_INT < 23) {
            return false;
        }
        try {
            NetworkCapabilities networkCapabilities = this.f10019g.getNetworkCapabilities(this.f10019g.getActiveNetwork());
            if (networkCapabilities != null) {
                return networkCapabilities.hasCapability(16);
            }
            return false;
        } catch (SecurityException e4) {
            AbstractC3445n.m10501c().mo10505b(f10018j, "Unable to validate active network", e4);
            return false;
        }
    }
}
