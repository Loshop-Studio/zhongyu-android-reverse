package p288x0;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.util.Log;
import p091e1.AbstractC7837i;
import p288x0.InterfaceC9850c;

/* renamed from: x0.e */
/* loaded from: classes3.dex */
public final class C9852e implements InterfaceC9850c {

    /* renamed from: a */
    public final Context f17581a;

    /* renamed from: b */
    public final InterfaceC9850c.a f17582b;

    /* renamed from: c */
    public boolean f17583c;

    /* renamed from: d */
    public boolean f17584d;

    /* renamed from: e */
    public final BroadcastReceiver f17585e = new a();

    /* renamed from: x0.e$a */
    public class a extends BroadcastReceiver {
        public a() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            C9852e c9852e = C9852e.this;
            boolean z9 = c9852e.f17583c;
            c9852e.f17583c = c9852e.m16792i(context);
            if (z9 != C9852e.this.f17583c) {
                if (Log.isLoggable("ConnectivityMonitor", 3)) {
                    boolean z10 = C9852e.this.f17583c;
                }
                C9852e c9852e2 = C9852e.this;
                c9852e2.f17582b.mo3075a(c9852e2.f17583c);
            }
        }
    }

    public C9852e(Context context, InterfaceC9850c.a aVar) {
        this.f17581a = context.getApplicationContext();
        this.f17582b = aVar;
    }

    /* renamed from: i */
    public boolean m16792i(Context context) {
        try {
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) AbstractC7837i.m12256d((ConnectivityManager) context.getSystemService("connectivity"))).getActiveNetworkInfo();
            return activeNetworkInfo != null && activeNetworkInfo.isConnected();
        } catch (RuntimeException e10) {
            if (Log.isLoggable("ConnectivityMonitor", 5)) {
                Log.w("ConnectivityMonitor", "Failed to determine connectivity status when connectivity changed", e10);
            }
            return true;
        }
    }

    /* renamed from: j */
    public final void m16793j() {
        if (this.f17584d) {
            return;
        }
        this.f17583c = m16792i(this.f17581a);
        try {
            this.f17581a.registerReceiver(this.f17585e, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
            this.f17584d = true;
        } catch (SecurityException e10) {
            if (Log.isLoggable("ConnectivityMonitor", 5)) {
                Log.w("ConnectivityMonitor", "Failed to register", e10);
            }
        }
    }

    /* renamed from: k */
    public final void m16794k() {
        if (this.f17584d) {
            this.f17581a.unregisterReceiver(this.f17585e);
            this.f17584d = false;
        }
    }

    @Override // p288x0.InterfaceC9856i
    public void onStart() {
        m16793j();
    }

    @Override // p288x0.InterfaceC9856i
    public void onStop() {
        m16794k();
    }

    @Override // p288x0.InterfaceC9856i
    public void onDestroy() {
    }
}
