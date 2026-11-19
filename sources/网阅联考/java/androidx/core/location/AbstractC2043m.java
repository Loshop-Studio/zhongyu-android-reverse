package androidx.core.location;

import android.location.Location;
import android.os.Bundle;
import java.util.List;

/* renamed from: androidx.core.location.m */
/* loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC2043m {
    /* renamed from: a */
    public static void m1199a(LocationListenerCompat locationListenerCompat, int i4) {
    }

    /* renamed from: b */
    public static void m1200b(LocationListenerCompat locationListenerCompat, List list) {
        int size = list.size();
        for (int i4 = 0; i4 < size; i4++) {
            locationListenerCompat.onLocationChanged((Location) list.get(i4));
        }
    }

    /* renamed from: c */
    public static void m1201c(LocationListenerCompat locationListenerCompat, String str) {
    }

    /* renamed from: d */
    public static void m1202d(LocationListenerCompat locationListenerCompat, String str) {
    }

    /* renamed from: e */
    public static void m1203e(LocationListenerCompat locationListenerCompat, String str, int i4, Bundle bundle) {
    }
}
