package androidx.appcompat.app;

import android.annotation.SuppressLint;
import android.content.Context;
import android.location.Location;
import android.location.LocationManager;
import android.util.Log;
import androidx.core.content.C0334c;
import com.alibaba.sdk.android.oss.common.RequestParameters;
import java.util.Calendar;

/* renamed from: androidx.appcompat.app.l */
/* loaded from: classes.dex */
class C0111l {

    /* renamed from: d */
    private static C0111l f374d;

    /* renamed from: a */
    private final Context f375a;

    /* renamed from: b */
    private final LocationManager f376b;

    /* renamed from: c */
    private final a f377c = new a();

    /* renamed from: androidx.appcompat.app.l$a */
    private static class a {

        /* renamed from: a */
        boolean f378a;

        /* renamed from: b */
        long f379b;

        /* renamed from: c */
        long f380c;

        /* renamed from: d */
        long f381d;

        /* renamed from: e */
        long f382e;

        /* renamed from: f */
        long f383f;

        a() {
        }
    }

    C0111l(Context context, LocationManager locationManager) {
        this.f375a = context;
        this.f376b = locationManager;
    }

    /* renamed from: a */
    static C0111l m296a(Context context) {
        if (f374d == null) {
            Context applicationContext = context.getApplicationContext();
            f374d = new C0111l(applicationContext, (LocationManager) applicationContext.getSystemService(RequestParameters.SUBRESOURCE_LOCATION));
        }
        return f374d;
    }

    @SuppressLint({"MissingPermission"})
    /* renamed from: b */
    private Location m297b() {
        Location locationM298c = C0334c.m1830b(this.f375a, "android.permission.ACCESS_COARSE_LOCATION") == 0 ? m298c("network") : null;
        Location locationM298c2 = C0334c.m1830b(this.f375a, "android.permission.ACCESS_FINE_LOCATION") == 0 ? m298c("gps") : null;
        return (locationM298c2 == null || locationM298c == null) ? locationM298c2 != null ? locationM298c2 : locationM298c : locationM298c2.getTime() > locationM298c.getTime() ? locationM298c2 : locationM298c;
    }

    /* renamed from: c */
    private Location m298c(String str) {
        try {
            if (this.f376b.isProviderEnabled(str)) {
                return this.f376b.getLastKnownLocation(str);
            }
            return null;
        } catch (Exception e4) {
            Log.d("TwilightManager", "Failed to get last known location", e4);
            return null;
        }
    }

    /* renamed from: e */
    private boolean m299e() {
        return this.f377c.f383f > System.currentTimeMillis();
    }

    /* renamed from: f */
    private void m300f(Location location) {
        long j4;
        a aVar = this.f377c;
        long jCurrentTimeMillis = System.currentTimeMillis();
        C0110k c0110kM294b = C0110k.m294b();
        c0110kM294b.m295a(jCurrentTimeMillis - 86400000, location.getLatitude(), location.getLongitude());
        long j5 = c0110kM294b.f371a;
        c0110kM294b.m295a(jCurrentTimeMillis, location.getLatitude(), location.getLongitude());
        boolean z3 = c0110kM294b.f373c == 1;
        long j6 = c0110kM294b.f372b;
        long j7 = c0110kM294b.f371a;
        boolean z4 = z3;
        c0110kM294b.m295a(86400000 + jCurrentTimeMillis, location.getLatitude(), location.getLongitude());
        long j8 = c0110kM294b.f372b;
        if (j6 == -1 || j7 == -1) {
            j4 = 43200000 + jCurrentTimeMillis;
        } else {
            j4 = (jCurrentTimeMillis > j7 ? 0 + j8 : jCurrentTimeMillis > j6 ? 0 + j7 : 0 + j6) + 60000;
        }
        aVar.f378a = z4;
        aVar.f379b = j5;
        aVar.f380c = j6;
        aVar.f381d = j7;
        aVar.f382e = j8;
        aVar.f383f = j4;
    }

    /* renamed from: d */
    boolean m301d() {
        a aVar = this.f377c;
        if (m299e()) {
            return aVar.f378a;
        }
        Location locationM297b = m297b();
        if (locationM297b != null) {
            m300f(locationM297b);
            return aVar.f378a;
        }
        Log.i("TwilightManager", "Could not get last known location. This is probably because the app does not have any location permissions. Falling back to hardcoded sunrise/sunset values.");
        int i4 = Calendar.getInstance().get(11);
        return i4 < 6 || i4 >= 22;
    }
}
