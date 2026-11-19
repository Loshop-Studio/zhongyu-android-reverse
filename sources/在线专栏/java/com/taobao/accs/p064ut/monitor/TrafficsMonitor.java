package com.taobao.accs.p064ut.monitor;

import android.content.Context;
import android.text.TextUtils;
import anet.channel.appmonitor.AppMonitor;
import anet.channel.statist.Dimension;
import anet.channel.statist.Measure;
import anet.channel.statist.Monitor;
import com.taobao.accs.client.GlobalClientInfo;
import com.taobao.accs.p062a.C1705a;
import com.taobao.accs.utl.ALog;
import com.taobao.accs.utl.BaseMonitor;
import com.taobao.accs.utl.UtilityImpl;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.android.agoo.common.AgooConstants;

/* loaded from: classes.dex */
public class TrafficsMonitor {

    /* renamed from: d */
    private final Context f7810d;

    /* renamed from: a */
    private final Map<String, List<C1776a>> f7807a = new HashMap();

    /* renamed from: b */
    private final Map<String, String> f7808b = new HashMap<String, String>() { // from class: com.taobao.accs.ut.monitor.TrafficsMonitor.1
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
    private int f7809c = 0;

    /* renamed from: e */
    private String f7811e = "";

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
        this.f7810d = context;
    }

    /* renamed from: b */
    private void m6086b() {
        String str;
        boolean z3;
        synchronized (this.f7807a) {
            String strM6101a = UtilityImpl.m6101a(System.currentTimeMillis());
            if (TextUtils.isEmpty(this.f7811e) || this.f7811e.equals(strM6101a)) {
                str = strM6101a;
                z3 = false;
            } else {
                str = this.f7811e;
                z3 = true;
            }
            Iterator<String> it = this.f7807a.keySet().iterator();
            while (it.hasNext()) {
                for (C1776a c1776a : this.f7807a.get(it.next())) {
                    if (c1776a != null) {
                        C1705a c1705aM5829a = C1705a.m5829a(this.f7810d);
                        String str2 = c1776a.f7817e;
                        String str3 = c1776a.f7815c;
                        c1705aM5829a.m5834a(str2, str3, this.f7808b.get(str3), c1776a.f7816d, c1776a.f7818f, str);
                    }
                }
            }
            ALog.Level level = ALog.Level.D;
            if (ALog.isPrintLog(level)) {
                ALog.m6090d("TrafficsMonitor", "savetoDay:" + str + " saveTraffics" + this.f7807a.toString(), new Object[0]);
            }
            if (z3) {
                this.f7807a.clear();
                m6087c();
            } else if (ALog.isPrintLog(level)) {
                ALog.m6090d("TrafficsMonitor", "no need commit lastsaveDay:" + this.f7811e + " currday:" + strM6101a, new Object[0]);
            }
            this.f7811e = strM6101a;
            this.f7809c = 0;
        }
    }

    /* renamed from: c */
    private void m6087c() {
        List<C1776a> listM5832a = C1705a.m5829a(this.f7810d).m5832a(false);
        if (listM5832a == null) {
            return;
        }
        try {
            for (C1776a c1776a : listM5832a) {
                if (c1776a != null) {
                    StatTrafficMonitor statTrafficMonitor = new StatTrafficMonitor();
                    statTrafficMonitor.bizId = c1776a.f7814b;
                    statTrafficMonitor.date = c1776a.f7813a;
                    statTrafficMonitor.host = c1776a.f7817e;
                    statTrafficMonitor.isBackground = c1776a.f7816d;
                    statTrafficMonitor.size = c1776a.f7818f;
                    AppMonitor.getInstance().commitStat(statTrafficMonitor);
                }
            }
            C1705a.m5829a(this.f7810d).m5833a();
        } catch (Throwable th) {
            ALog.m6092e("", th.toString(), new Object[0]);
            th.printStackTrace();
        }
    }

    /* renamed from: a */
    public void m6089a(C1776a c1776a) {
        boolean z3;
        String str;
        if (c1776a == null || c1776a.f7817e == null || c1776a.f7818f <= 0) {
            return;
        }
        c1776a.f7815c = TextUtils.isEmpty(c1776a.f7815c) ? "accsSelf" : c1776a.f7815c;
        synchronized (this.f7807a) {
            String str2 = this.f7808b.get(c1776a.f7815c);
            if (TextUtils.isEmpty(str2)) {
                return;
            }
            c1776a.f7814b = str2;
            List<C1776a> arrayList = this.f7807a.get(str2);
            if (arrayList != null) {
                Iterator<C1776a> it = arrayList.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        z3 = true;
                        break;
                    }
                    C1776a next = it.next();
                    if (next.f7816d == c1776a.f7816d && (str = next.f7817e) != null && str.equals(c1776a.f7817e)) {
                        next.f7818f += c1776a.f7818f;
                        z3 = false;
                        break;
                    }
                }
                if (z3) {
                    arrayList.add(c1776a);
                }
            } else {
                arrayList = new ArrayList<>();
                arrayList.add(c1776a);
            }
            this.f7807a.put(str2, arrayList);
            int i4 = this.f7809c + 1;
            this.f7809c = i4;
            if (i4 >= 10) {
                m6086b();
            }
        }
    }

    /* renamed from: com.taobao.accs.ut.monitor.TrafficsMonitor$a */
    public static class C1776a {

        /* renamed from: a */
        String f7813a;

        /* renamed from: b */
        String f7814b;

        /* renamed from: c */
        String f7815c;

        /* renamed from: d */
        boolean f7816d;

        /* renamed from: e */
        String f7817e;

        /* renamed from: f */
        long f7818f;

        public C1776a(String str, boolean z3, String str2, long j4) {
            this.f7815c = str;
            this.f7816d = z3;
            this.f7817e = str2;
            this.f7818f = j4;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("date:" + this.f7813a);
            sb.append(" ");
            sb.append("bizId:" + this.f7814b);
            sb.append(" ");
            sb.append("serviceId:" + this.f7815c);
            sb.append(" ");
            sb.append("host:" + this.f7817e);
            sb.append(" ");
            sb.append("isBackground:" + this.f7816d);
            sb.append(" ");
            sb.append("size:" + this.f7818f);
            return sb.toString();
        }

        public C1776a(String str, String str2, String str3, boolean z3, String str4, long j4) {
            this.f7813a = str;
            this.f7814b = str2;
            this.f7815c = str3;
            this.f7816d = z3;
            this.f7817e = str4;
            this.f7818f = j4;
        }
    }

    /* renamed from: a */
    public void m6088a() {
        try {
            synchronized (this.f7807a) {
                this.f7807a.clear();
            }
            List<C1776a> listM5832a = C1705a.m5829a(this.f7810d).m5832a(true);
            if (listM5832a == null) {
                return;
            }
            Iterator<C1776a> it = listM5832a.iterator();
            while (it.hasNext()) {
                m6089a(it.next());
            }
        } catch (Exception e4) {
            ALog.m6096w("TrafficsMonitor", e4.toString(), new Object[0]);
        }
    }
}
