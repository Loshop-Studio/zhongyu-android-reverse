package p127o0;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.support.v4.media.C0039h;
import android.util.Log;
import com.bumptech.glide.ComponentCallbacks2C3414h;
import com.bumptech.glide.request.C3420a;
import com.google.gson.internal.C3845b;
import java.util.ArrayList;
import java.util.Set;
import p147r0.InterfaceC6444b;
import p180v0.AbstractC6664k;

/* renamed from: o0.c */
/* loaded from: classes2.dex */
public final class C6257c extends BroadcastReceiver {

    /* renamed from: a */
    public final /* synthetic */ C6258d f10005a;

    public C6257c(C6258d c6258d) {
        this.f10005a = c6258d;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        C6258d c6258d = this.f10005a;
        boolean z8 = c6258d.f10008c;
        c6258d.f10008c = C6258d.m5859i(context);
        if (z8 != this.f10005a.f10008c) {
            if (Log.isLoggable("ConnectivityMonitor", 3)) {
                Log.d("ConnectivityMonitor", "connectivity changed, isConnected: " + this.f10005a.f10008c);
            }
            C6258d c6258d2 = this.f10005a;
            C0039h c0039h = c6258d2.f10007b;
            if (!c6258d2.f10008c) {
                c0039h.getClass();
                return;
            }
            synchronized (((ComponentCallbacks2C3414h) c0039h.f97c)) {
                C3845b c3845b = (C3845b) c0039h.f96b;
                ArrayList arrayListM6324d = AbstractC6664k.m6324d((Set) c3845b.f3019c);
                int size = arrayListM6324d.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayListM6324d.get(i);
                    i++;
                    C3420a c3420a = (C3420a) ((InterfaceC6444b) obj);
                    if (!c3420a.m2424f() && !c3420a.m2423e()) {
                        c3420a.m2421c();
                        if (c3845b.f3018b) {
                            ((ArrayList) c3845b.f3020d).add(c3420a);
                        } else {
                            c3420a.m2419a();
                        }
                    }
                }
            }
        }
    }
}
