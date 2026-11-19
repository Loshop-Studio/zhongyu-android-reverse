package p159u;

import android.content.Context;
import android.net.ConnectivityManager;
import androidx.core.content.ContextCompat;
import p166v.AbstractC7784e;

/* renamed from: u.d */
/* loaded from: classes3.dex */
public abstract class AbstractC7737d {
    /* renamed from: a */
    public static final InterfaceC7735b m9230a(Context context) {
        Context applicationContext = context.getApplicationContext();
        ConnectivityManager connectivityManager = (ConnectivityManager) ContextCompat.getSystemService(applicationContext, ConnectivityManager.class);
        if (connectivityManager == null || !AbstractC7784e.m9320b(applicationContext, "android.permission.ACCESS_NETWORK_STATE")) {
            return InterfaceC7735b.f10225b;
        }
        try {
            return new C7736c(connectivityManager);
        } catch (Exception unused) {
            return InterfaceC7735b.f10225b;
        }
    }
}
