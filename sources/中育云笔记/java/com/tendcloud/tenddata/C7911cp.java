package com.tendcloud.tenddata;

import android.content.Context;
import android.location.Location;
import android.location.LocationManager;
import anet.channel.strategy.dispatch.DispatchConstants;
import com.alibaba.sdk.android.oss.common.RequestParameters;
import com.zykj.download.OssUtils;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.tendcloud.tenddata.cp */
/* loaded from: classes5.dex */
public class C7911cp {

    /* renamed from: a */
    private static Location f14606a = null;

    /* renamed from: b */
    private static boolean f14607b = false;

    /* renamed from: a */
    public static List<Location> m11579a(Context context) {
        ArrayList arrayList = new ArrayList();
        if (!C7843ab.f14282Q) {
            try {
                arrayList.add(m11584f(context));
            } catch (Throwable unused) {
            }
        }
        return arrayList;
    }

    /* renamed from: b */
    public static String m11580b(Context context) {
        try {
            List<Location> listM11579a = m11579a(context);
            StringBuilder sb2 = new StringBuilder();
            for (Location location : listM11579a) {
                if (location != null) {
                    sb2.append(location.getLatitude());
                    sb2.append(',');
                    sb2.append(location.getLongitude());
                    sb2.append(',');
                    sb2.append(location.hasAltitude() ? Double.valueOf(location.getAltitude()) : "");
                    sb2.append(',');
                    sb2.append(location.getTime());
                    sb2.append(',');
                    sb2.append(location.hasAccuracy() ? Float.valueOf(location.getAccuracy()) : "");
                    sb2.append(',');
                    sb2.append(location.hasBearing() ? Float.valueOf(location.getBearing()) : "");
                    sb2.append(',');
                    sb2.append(location.hasSpeed() ? Float.valueOf(location.getSpeed()) : "");
                    sb2.append(',');
                    sb2.append(location.getProvider());
                    sb2.append(':');
                }
            }
            return sb2.toString();
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: c */
    public static JSONArray m11581c(Context context) {
        JSONArray jSONArray = new JSONArray();
        if (!C7843ab.f14282Q) {
            try {
                Location locationM11584f = m11584f(context);
                if (locationM11584f != null) {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put(DispatchConstants.LATITUDE, locationM11584f.getLatitude());
                    jSONObject.put(DispatchConstants.LONGTITUDE, locationM11584f.getLongitude());
                    jSONObject.put("ts", locationM11584f.getTime());
                    if (C7912cq.m11595a(17)) {
                        jSONObject.put("elapsed", locationM11584f.getElapsedRealtimeNanos());
                    }
                    if (locationM11584f.hasAltitude()) {
                        jSONObject.put("altitude", locationM11584f.getAltitude());
                    }
                    if (locationM11584f.hasAccuracy()) {
                        jSONObject.put("hAccuracy", locationM11584f.getAccuracy());
                    }
                    if (locationM11584f.hasBearing()) {
                        jSONObject.put("bearing", locationM11584f.getBearing());
                    }
                    if (locationM11584f.hasSpeed()) {
                        jSONObject.put(OssUtils.SPEED, locationM11584f.getSpeed());
                    }
                    jSONObject.put("provider", locationM11584f.getProvider());
                    jSONArray.put(jSONObject);
                }
            } catch (Throwable unused) {
            }
        }
        return jSONArray;
    }

    /* renamed from: d */
    public static JSONArray m11582d(Context context) {
        try {
            JSONArray jSONArray = new JSONArray();
            JSONArray jSONArrayM11503A = C7903ch.m11503A(context);
            if (jSONArrayM11503A.length() > 0) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("type", "sim");
                jSONObject.put("extra", jSONArrayM11503A);
                jSONArray.put(jSONObject);
            }
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("type", "account");
            String str = C7843ab.f14319s;
            if (str != null) {
                jSONObject2.put("accountId", str);
            }
            String strM11401l = C7897cb.m11401l();
            if (!C7912cq.m11608b(strM11401l)) {
                C7896ca.dForInternal(strM11401l);
                JSONObject jSONObject3 = new JSONObject(strM11401l);
                if (jSONObject3.length() > 0) {
                    jSONObject2.put("accountProp", jSONObject3);
                }
            }
            if (jSONObject2.length() > 1) {
                jSONArray.put(jSONObject2);
            }
            if (jSONArray.length() > 0) {
                return jSONArray;
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: e */
    public static Long[][] m11583e(Context context) {
        return new Long[3][];
    }

    /* renamed from: f */
    private static Location m11584f(Context context) {
        boolean zIsProviderEnabled;
        boolean zIsProviderEnabled2;
        if (f14607b) {
            return f14606a;
        }
        Location lastKnownLocation = null;
        if (!C7912cq.m11607b(context, "android.permission.ACCESS_COARSE_LOCATION")) {
            f14607b = true;
            return null;
        }
        try {
            LocationManager locationManager = (LocationManager) C7843ab.f14307g.getSystemService(RequestParameters.SUBRESOURCE_LOCATION);
            if (locationManager != null) {
                zIsProviderEnabled = locationManager.isProviderEnabled("gps");
                zIsProviderEnabled2 = locationManager.isProviderEnabled("network");
            } else {
                zIsProviderEnabled = false;
                zIsProviderEnabled2 = false;
            }
            if (zIsProviderEnabled || zIsProviderEnabled2) {
                lastKnownLocation = locationManager.getLastKnownLocation("passive");
            }
        } catch (Throwable unused) {
        }
        f14606a = lastKnownLocation;
        f14607b = true;
        return lastKnownLocation;
    }
}
