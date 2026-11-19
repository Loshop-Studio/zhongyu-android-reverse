package p127o0;

import android.content.Context;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.support.v4.media.C0039h;
import android.util.Log;
import p185v7.AbstractC6675d;

/* renamed from: o0.d */
/* loaded from: classes2.dex */
public final class C6258d implements InterfaceC6256b {

    /* renamed from: a */
    public final Context f10006a;

    /* renamed from: b */
    public final C0039h f10007b;

    /* renamed from: c */
    public boolean f10008c;

    /* renamed from: d */
    public boolean f10009d;

    /* renamed from: e */
    public final C6257c f10010e = new C6257c(this);

    public C6258d(Context context, C0039h c0039h) {
        this.f10006a = context.getApplicationContext();
        this.f10007b = c0039h;
    }

    /* renamed from: i */
    public static boolean m5859i(Context context) {
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        AbstractC6675d.m6344f(connectivityManager, "Argument must not be null");
        try {
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            return activeNetworkInfo != null && activeNetworkInfo.isConnected();
        } catch (RuntimeException e) {
            if (!Log.isLoggable("ConnectivityMonitor", 5)) {
                return true;
            }
            Log.w("ConnectivityMonitor", "Failed to determine connectivity status when connectivity changed", e);
            return true;
        }
    }

    @Override // p127o0.InterfaceC6260f
    public final void onStart() {
        if (this.f10009d) {
            return;
        }
        Context context = this.f10006a;
        this.f10008c = m5859i(context);
        try {
            context.registerReceiver(this.f10010e, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
            this.f10009d = true;
        } catch (SecurityException e) {
            if (Log.isLoggable("ConnectivityMonitor", 5)) {
                Log.w("ConnectivityMonitor", "Failed to register", e);
            }
        }
    }

    @Override // p127o0.InterfaceC6260f
    public final void onStop() {
        if (this.f10009d) {
            this.f10006a.unregisterReceiver(this.f10010e);
            this.f10009d = false;
        }
    }

    @Override // p127o0.InterfaceC6260f
    public final void onDestroy() {
    }
}
