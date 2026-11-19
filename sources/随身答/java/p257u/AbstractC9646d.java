package p257u;

import android.content.Context;
import android.net.ConnectivityManager;
import androidx.core.content.ContextCompat;
import p267v.AbstractC9739e;

/* renamed from: u.d */
/* loaded from: classes3.dex */
public abstract class AbstractC9646d {
    /* renamed from: a */
    public static final InterfaceC9644b m15983a(Context context) {
        Context applicationContext = context.getApplicationContext();
        ConnectivityManager connectivityManager = (ConnectivityManager) ContextCompat.getSystemService(applicationContext, ConnectivityManager.class);
        if (connectivityManager == null || !AbstractC9739e.m16279b(applicationContext, "android.permission.ACCESS_NETWORK_STATE")) {
            return InterfaceC9644b.f16985b;
        }
        try {
            return new C9645c(connectivityManager);
        } catch (Exception unused) {
            return InterfaceC9644b.f16985b;
        }
    }
}
