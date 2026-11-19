package p000a.p005b.p006c;

import android.content.Context;
import android.location.Location;
import android.location.LocationManager;
import android.util.Log;

/* renamed from: a.b.c.r */
/* loaded from: classes.dex */
public class C0032r {

    /* renamed from: d */
    public static C0032r f170d;

    /* renamed from: a */
    public final Context f171a;

    /* renamed from: b */
    public final LocationManager f172b;

    /* renamed from: c */
    public final a f173c = new a();

    /* renamed from: a.b.c.r$a */
    public static class a {

        /* renamed from: a */
        public boolean f174a;

        /* renamed from: b */
        public long f175b;
    }

    public C0032r(Context context, LocationManager locationManager) {
        this.f171a = context;
        this.f172b = locationManager;
    }

    /* renamed from: a */
    public final Location m110a(String str) {
        try {
            if (this.f172b.isProviderEnabled(str)) {
                return this.f172b.getLastKnownLocation(str);
            }
            return null;
        } catch (Exception e2) {
            Log.d("TwilightManager", "Failed to get last known location", e2);
            return null;
        }
    }
}
