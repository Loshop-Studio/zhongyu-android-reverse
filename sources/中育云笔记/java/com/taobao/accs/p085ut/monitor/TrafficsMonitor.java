package com.taobao.accs.p085ut.monitor;

import android.content.Context;
import android.text.TextUtils;
import anet.channel.appmonitor.AppMonitor;
import anet.channel.statist.Dimension;
import anet.channel.statist.Measure;
import anet.channel.statist.Monitor;
import com.taobao.accs.client.GlobalClientInfo;
import com.taobao.accs.p083a.C7602a;
import com.taobao.accs.utl.ALog;
import com.taobao.accs.utl.BaseMonitor;
import com.taobao.accs.utl.UtilityImpl;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.android.agoo.common.AgooConstants;

/* loaded from: classes5.dex */
public class TrafficsMonitor {

    /* renamed from: d */
    private final Context f13208d;

    /* renamed from: a */
    private final Map<String, List<C7673a>> f13205a = new HashMap();

    /* renamed from: b */
    private final Map<String, String> f13206b = new HashMap<String, String>() { // from class: com.taobao.accs.ut.monitor.TrafficsMonitor.1
        {
            put("im", "512");
            put("motu", "513");
            put("acds", "514");
            put(GlobalClientInfo.AGOO_SERVICE_ID, "515");
            put(AgooConstants.AGOO_SERVICE_AGOOACK, "515");
            put("agooTokenReport", "515");
            put("accsSelf", "1000");
        }
    };

    /* renamed from: c */
    private int f13207c = 0;

    /* renamed from: e */
    private String f13209e = "";

    @Monitor(module = "NetworkSDK", monitorPoint = "TrafficStats")
    public static class StatTrafficMonitor extends BaseMonitor {

        @Dimension
        public String bizId;

        @Dimension
        public String date;

        @Dimension
        public String host;

        @Dimension
        public boolean isBackground;

        @Dimension
        public String serviceId;

        @Measure
        public long size;
    }

    public TrafficsMonitor(Context context) {
        this.f13208d = context;
    }

    /* renamed from: b */
    private void m10112b() {
        String str;
        boolean z10;
        synchronized (this.f13205a) {
            try {
                String strM10127a = UtilityImpl.m10127a(System.currentTimeMillis());
                if (TextUtils.isEmpty(this.f13209e) || this.f13209e.equals(strM10127a)) {
                    str = strM10127a;
                    z10 = false;
                } else {
                    str = this.f13209e;
                    z10 = true;
                }
                Iterator<String> it = this.f13205a.keySet().iterator();
                while (it.hasNext()) {
                    for (C7673a c7673a : this.f13205a.get(it.next())) {
                        if (c7673a != null) {
                            C7602a c7602aM9855a = C7602a.m9855a(this.f13208d);
                            String str2 = c7673a.f13215e;
                            String str3 = c7673a.f13213c;
                            c7602aM9855a.m9860a(str2, str3, this.f13206b.get(str3), c7673a.f13214d, c7673a.f13216f, str);
                        }
                    }
                }
                ALog.Level level = ALog.Level.D;
                if (ALog.isPrintLog(level)) {
                    ALog.m10116d("TrafficsMonitor", "savetoDay:" + str + " saveTraffics" + this.f13205a.toString(), new Object[0]);
                }
                if (z10) {
                    this.f13205a.clear();
                    m10113c();
                } else if (ALog.isPrintLog(level)) {
                    ALog.m10116d("TrafficsMonitor", "no need commit lastsaveDay:" + this.f13209e + " currday:" + strM10127a, new Object[0]);
                }
                this.f13209e = strM10127a;
                this.f13207c = 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: c */
    private void m10113c() {
        List<C7673a> listM9858a = C7602a.m9855a(this.f13208d).m9858a(false);
        if (listM9858a == null) {
            return;
        }
        try {
            for (C7673a c7673a : listM9858a) {
                if (c7673a != null) {
                    StatTrafficMonitor statTrafficMonitor = new StatTrafficMonitor();
                    statTrafficMonitor.bizId = c7673a.f13212b;
                    statTrafficMonitor.date = c7673a.f13211a;
                    statTrafficMonitor.host = c7673a.f13215e;
                    statTrafficMonitor.isBackground = c7673a.f13214d;
                    statTrafficMonitor.size = c7673a.f13216f;
                    AppMonitor.getInstance().commitStat(statTrafficMonitor);
                }
            }
            C7602a.m9855a(this.f13208d).m9859a();
        } catch (Throwable th) {
            ALog.m10118e("", th.toString(), new Object[0]);
            th.printStackTrace();
        }
    }

    /* renamed from: a */
    public void m10115a(C7673a c7673a) {
        String str;
        if (c7673a == null || c7673a.f13215e == null || c7673a.f13216f <= 0) {
            return;
        }
        c7673a.f13213c = TextUtils.isEmpty(c7673a.f13213c) ? "accsSelf" : c7673a.f13213c;
        synchronized (this.f13205a) {
            try {
                String str2 = this.f13206b.get(c7673a.f13213c);
                if (TextUtils.isEmpty(str2)) {
                    return;
                }
                c7673a.f13212b = str2;
                List<C7673a> arrayList = this.f13205a.get(str2);
                if (arrayList != null) {
                    Iterator<C7673a> it = arrayList.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            arrayList.add(c7673a);
                            break;
                        }
                        C7673a next = it.next();
                        if (next.f13214d == c7673a.f13214d && (str = next.f13215e) != null && str.equals(c7673a.f13215e)) {
                            next.f13216f += c7673a.f13216f;
                            break;
                        }
                    }
                } else {
                    arrayList = new ArrayList<>();
                    arrayList.add(c7673a);
                }
                this.f13205a.put(str2, arrayList);
                int i10 = this.f13207c + 1;
                this.f13207c = i10;
                if (i10 >= 10) {
                    m10112b();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: com.taobao.accs.ut.monitor.TrafficsMonitor$a */
    public static class C7673a {

        /* renamed from: a */
        String f13211a;

        /* renamed from: b */
        String f13212b;

        /* renamed from: c */
        String f13213c;

        /* renamed from: d */
        boolean f13214d;

        /* renamed from: e */
        String f13215e;

        /* renamed from: f */
        long f13216f;

        public C7673a(String str, boolean z10, String str2, long j10) {
            this.f13213c = str;
            this.f13214d = z10;
            this.f13215e = str2;
            this.f13216f = j10;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("date:" + this.f13211a);
            sb2.append(" ");
            sb2.append("bizId:" + this.f13212b);
            sb2.append(" ");
            sb2.append("serviceId:" + this.f13213c);
            sb2.append(" ");
            sb2.append("host:" + this.f13215e);
            sb2.append(" ");
            sb2.append("isBackground:" + this.f13214d);
            sb2.append(" ");
            sb2.append("size:" + this.f13216f);
            return sb2.toString();
        }

        public C7673a(String str, String str2, String str3, boolean z10, String str4, long j10) {
            this.f13211a = str;
            this.f13212b = str2;
            this.f13213c = str3;
            this.f13214d = z10;
            this.f13215e = str4;
            this.f13216f = j10;
        }
    }

    /* renamed from: a */
    public void m10114a() {
        try {
            synchronized (this.f13205a) {
                this.f13205a.clear();
            }
            List<C7673a> listM9858a = C7602a.m9855a(this.f13208d).m9858a(true);
            if (listM9858a == null) {
                return;
            }
            Iterator<C7673a> it = listM9858a.iterator();
            while (it.hasNext()) {
                m10115a(it.next());
            }
        } catch (Exception e10) {
            ALog.m10122w("TrafficsMonitor", e10.toString(), new Object[0]);
        }
    }
}
