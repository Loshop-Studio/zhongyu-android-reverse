package p146z;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.util.Log;
import p062g0.AbstractC3749i;
import p146z.InterfaceC4691c;

/* renamed from: z.e */
/* loaded from: classes2.dex */
public final class C4693e implements InterfaceC4691c {

    /* renamed from: a */
    public final Context f6038a;

    /* renamed from: b */
    public final InterfaceC4691c.a f6039b;

    /* renamed from: c */
    public boolean f6040c;

    /* renamed from: d */
    public boolean f6041d;

    /* renamed from: e */
    public final BroadcastReceiver f6042e = new a();

    /* renamed from: z.e$a */
    public class a extends BroadcastReceiver {
        public a() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            C4693e c4693e = C4693e.this;
            boolean z3 = c4693e.f6040c;
            c4693e.f6040c = c4693e.m6659j(context);
            if (z3 != C4693e.this.f6040c) {
                if (Log.isLoggable("ConnectivityMonitor", 3)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("connectivity changed, isConnected: ");
                    sb.append(C4693e.this.f6040c);
                }
                C4693e c4693e2 = C4693e.this;
                c4693e2.f6039b.mo1750a(c4693e2.f6040c);
            }
        }
    }

    public C4693e(Context context, InterfaceC4691c.a aVar) {
        this.f6038a = context.getApplicationContext();
        this.f6039b = aVar;
    }

    @Override // p146z.InterfaceC4697i
    /* renamed from: c */
    public void mo1732c() {
    }

    /* renamed from: j */
    public boolean m6659j(Context context) {
        try {
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) AbstractC3749i.m4768d((ConnectivityManager) context.getSystemService("connectivity"))).getActiveNetworkInfo();
            return activeNetworkInfo != null && activeNetworkInfo.isConnected();
        } catch (RuntimeException e4) {
            if (Log.isLoggable("ConnectivityMonitor", 5)) {
                Log.w("ConnectivityMonitor", "Failed to determine connectivity status when connectivity changed", e4);
            }
            return true;
        }
    }

    /* renamed from: k */
    public final void m6660k() {
        if (this.f6041d) {
            return;
        }
        this.f6040c = m6659j(this.f6038a);
        try {
            this.f6038a.registerReceiver(this.f6042e, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
            this.f6041d = true;
        } catch (SecurityException e4) {
            if (Log.isLoggable("ConnectivityMonitor", 5)) {
                Log.w("ConnectivityMonitor", "Failed to register", e4);
            }
        }
    }

    /* renamed from: l */
    public final void m6661l() {
        if (this.f6041d) {
            this.f6038a.unregisterReceiver(this.f6042e);
            this.f6041d = false;
        }
    }

    @Override // p146z.InterfaceC4697i
    public void onStart() {
        m6660k();
    }

    @Override // p146z.InterfaceC4697i
    public void onStop() {
        m6661l();
    }
}
