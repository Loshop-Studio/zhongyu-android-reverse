package com.huawei.agconnect.core.p068a;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.util.Log;
import com.huawei.agconnect.core.ServiceDiscovery;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p212k.AbstractC9764r;
import p357u4.InterfaceC11366a;

/* renamed from: com.huawei.agconnect.core.a.c */
/* loaded from: classes5.dex */
public class C7219c {

    /* renamed from: a */
    public final Context f11164a;

    /* renamed from: com.huawei.agconnect.core.a.c$a */
    public static class a implements Serializable, Comparator<Map.Entry<String, Integer>> {
        private a() {
        }

        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(Map.Entry entry, Map.Entry entry2) {
            return ((Integer) entry.getValue()).intValue() - ((Integer) entry2.getValue()).intValue();
        }
    }

    public C7219c(Context context) {
        this.f11164a = context;
    }

    /* renamed from: a */
    public List m8219a() throws PackageManager.NameNotFoundException, ClassNotFoundException {
        Log.i("AGC_Registrar", "getServices");
        List listM8221c = m8221c();
        ArrayList arrayList = new ArrayList();
        Iterator it = listM8221c.iterator();
        while (it.hasNext()) {
            m8220b((String) it.next());
        }
        Log.i("AGC_Registrar", "services:" + arrayList.size());
        return arrayList;
    }

    /* renamed from: b */
    public final InterfaceC11366a m8220b(String str) throws ClassNotFoundException {
        StringBuilder sb2;
        String string;
        try {
            Class<?> cls = Class.forName(str);
            if (InterfaceC11366a.class.isAssignableFrom(cls)) {
                AbstractC9764r.m19682a(Class.forName(str).newInstance());
                return null;
            }
            Log.e("AGC_Registrar", cls + " must extends from ServiceRegistrar.");
            return null;
        } catch (ClassNotFoundException e10) {
            string = "Can not found service class, " + e10.getMessage();
            Log.e("AGC_Registrar", string);
            return null;
        } catch (IllegalAccessException e11) {
            e = e11;
            sb2 = new StringBuilder();
            sb2.append("instantiate service class exception ");
            sb2.append(e.getLocalizedMessage());
            string = sb2.toString();
            Log.e("AGC_Registrar", string);
            return null;
        } catch (InstantiationException e12) {
            e = e12;
            sb2 = new StringBuilder();
            sb2.append("instantiate service class exception ");
            sb2.append(e.getLocalizedMessage());
            string = sb2.toString();
            Log.e("AGC_Registrar", string);
            return null;
        }
    }

    /* renamed from: c */
    public final List m8221c() throws PackageManager.NameNotFoundException {
        int i10;
        StringBuilder sb2;
        ArrayList arrayList = new ArrayList();
        Bundle bundleM8222d = m8222d();
        if (bundleM8222d != null) {
            HashMap map = new HashMap(10);
            Iterator<String> it = bundleM8222d.keySet().iterator();
            while (true) {
                i10 = 0;
                if (!it.hasNext()) {
                    break;
                }
                String next = it.next();
                if ("com.huawei.agconnect.core.ServiceRegistrar".equals(bundleM8222d.getString(next))) {
                    String[] strArrSplit = next.split(":");
                    if (strArrSplit.length == 2) {
                        try {
                            map.put(strArrSplit[0], Integer.valueOf(strArrSplit[1]));
                        } catch (NumberFormatException e10) {
                            sb2 = new StringBuilder();
                            sb2.append("registrar configuration format error:");
                            next = e10.getMessage();
                        }
                    } else if (strArrSplit.length == 1) {
                        map.put(strArrSplit[0], 1000);
                    } else {
                        sb2 = new StringBuilder();
                        sb2.append("registrar configuration error, ");
                        sb2.append(next);
                        Log.e("AGC_Registrar", sb2.toString());
                    }
                }
            }
            ArrayList arrayList2 = new ArrayList(map.entrySet());
            Collections.sort(arrayList2, new a());
            int size = arrayList2.size();
            while (i10 < size) {
                Object obj = arrayList2.get(i10);
                i10++;
                arrayList.add(((Map.Entry) obj).getKey());
            }
        }
        return arrayList;
    }

    /* renamed from: d */
    public final Bundle m8222d() throws PackageManager.NameNotFoundException {
        ServiceInfo serviceInfo;
        PackageManager packageManager = this.f11164a.getPackageManager();
        if (packageManager == null) {
            return null;
        }
        try {
            serviceInfo = packageManager.getServiceInfo(new ComponentName(this.f11164a, (Class<?>) ServiceDiscovery.class), 128);
        } catch (PackageManager.NameNotFoundException e10) {
            Log.e("AGC_Registrar", "get ServiceDiscovery exception." + e10.getLocalizedMessage());
        }
        if (serviceInfo != null) {
            return serviceInfo.metaData;
        }
        Log.e("AGC_Registrar", "Can not found ServiceDiscovery service.");
        return null;
    }
}
