package com.tendcloud.tenddata;

import android.app.ActivityManager;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.util.Pair;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import org.android.agoo.common.AgooConstants;
import org.json.JSONArray;

/* renamed from: com.tendcloud.tenddata.dt */
/* loaded from: classes5.dex */
public final class C7942dt {

    /* renamed from: a */
    private static volatile C7942dt f14770a = null;

    /* renamed from: b */
    private static Map<String, Object> f14771b = new TreeMap();

    /* renamed from: c */
    private static final int f14772c = 10800000;

    private C7942dt() {
        try {
            if (m11783c()) {
                m11782b();
                m11784d();
                m11785e();
            }
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    public static C7942dt m11780a() {
        if (f14770a == null) {
            synchronized (C7942dt.class) {
                try {
                    if (f14770a == null) {
                        f14770a = new C7942dt();
                    }
                } finally {
                }
            }
        }
        return f14770a;
    }

    /* renamed from: b */
    private void m11782b() {
        List<PackageInfo> listM11442d;
        try {
            ArrayList arrayList = new ArrayList();
            if (C7912cq.m11595a(21) && C7912cq.m11605b(24)) {
                for (C7893by c7893by : C7907cl.m11571a()) {
                    if (!c7893by.f14473c.startsWith("android.") && !c7893by.f14473c.equals("system")) {
                        arrayList.add(c7893by.f14473c);
                    }
                }
            } else if (C7912cq.m11605b(21)) {
                ActivityManager activityManager = (ActivityManager) C7843ab.f14307g.getSystemService(AgooConstants.OPEN_ACTIIVTY_NAME);
                if (activityManager != null) {
                    PackageManager packageManager = C7843ab.f14307g.getPackageManager();
                    List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = activityManager.getRunningAppProcesses();
                    if (runningAppProcesses != null) {
                        Iterator<ActivityManager.RunningAppProcessInfo> it = runningAppProcesses.iterator();
                        while (it.hasNext()) {
                            String str = it.next().processName;
                            try {
                                if (packageManager.getLaunchIntentForPackage(str) != null) {
                                    arrayList.add(str);
                                }
                            } catch (Throwable unused) {
                            }
                        }
                    }
                }
            } else if (C7912cq.m11605b(30) && (listM11442d = C7899cd.m11442d(C7843ab.f14307g)) != null) {
                for (PackageInfo packageInfo : listM11442d) {
                    int i10 = packageInfo.applicationInfo.flags;
                    if ((i10 & 1) == 0 && (i10 & 128) == 0 && (i10 & 2097152) == 0) {
                        arrayList.add(packageInfo.packageName);
                    }
                }
            }
            f14771b.put("ras", arrayList.toString());
            C7897cb.setCollectRunningTime(System.currentTimeMillis());
        } catch (Throwable unused2) {
        }
    }

    /* renamed from: c */
    private boolean m11783c() {
        try {
            if (C7843ab.f14285T) {
                return false;
            }
            return System.currentTimeMillis() - C7897cb.m11396g() > 10800000;
        } catch (Throwable unused) {
            return false;
        }
    }

    /* renamed from: d */
    private void m11784d() {
        try {
            f14771b.put("aas", m11781a(C7843ab.f14307g).toString());
        } catch (Throwable unused) {
        }
    }

    /* renamed from: e */
    private void m11785e() {
        JSONArray jSONArrayM11805a;
        C7961el c7961el = new C7961el();
        try {
            C7902cg.getFileLock(C7943du.m11787a().m11808b());
            jSONArrayM11805a = C7943du.m11787a().m11805a("AppList");
            C7902cg.releaseFileLock(C7943du.m11787a().m11808b());
        } catch (Throwable unused) {
            C7902cg.releaseFileLock(C7943du.m11787a().m11808b());
            jSONArrayM11805a = null;
        }
        if (jSONArrayM11805a != null) {
            if (jSONArrayM11805a.length() > 0) {
                c7961el.f14872e = new Pair<>("AppList", jSONArrayM11805a);
            }
            c7961el.f14869b = "env";
            c7961el.f14870c = "apps";
            c7961el.f14871d = f14771b;
            c7961el.f14868a = AbstractC7841a.ENV;
            C7913cr.m11625a().post(c7961el);
        }
    }

    /* renamed from: a */
    private List<String> m11781a(Context context) {
        ArrayList arrayList = new ArrayList();
        try {
            if (!C7912cq.m11595a(30) || !C7912cq.m11597a(context, 30) || C7912cq.m11614c(context, "android.permission.QUERY_ALL_PACKAGES")) {
                PackageManager packageManager = context.getPackageManager();
                List<PackageInfo> listM11442d = C7899cd.m11442d(context);
                if (listM11442d != null) {
                    for (PackageInfo packageInfo : listM11442d) {
                        arrayList.add(packageInfo.packageName);
                        try {
                            arrayList.add(C7912cq.m11602b(packageManager.getApplicationLabel(packageInfo.applicationInfo).toString().getBytes()));
                        } catch (Throwable unused) {
                            arrayList.add("");
                        }
                        if ((packageInfo.applicationInfo.flags & 1) > 0) {
                            arrayList.add("1");
                        } else {
                            arrayList.add("0");
                        }
                    }
                }
            }
        } catch (Throwable unused2) {
        }
        return arrayList;
    }
}
