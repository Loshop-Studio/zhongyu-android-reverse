package com.tencent.bugly.proguard;

import android.content.ContentValues;
import android.database.Cursor;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Pair;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* renamed from: com.tencent.bugly.proguard.ag */
/* loaded from: classes4.dex */
public final class C6669ag {

    /* renamed from: a */
    private final SimpleDateFormat f5811a;

    /* renamed from: b */
    private final C6666ad f5812b;

    /* renamed from: com.tencent.bugly.proguard.ag$a */
    public static class a {

        /* renamed from: a */
        private static final C6669ag f5815a = new C6669ag(0);
    }

    /* renamed from: com.tencent.bugly.proguard.ag$b */
    public static class b {

        /* renamed from: a */
        String f5816a;

        /* renamed from: b */
        public long f5817b;

        /* renamed from: c */
        public String f5818c;

        public final String toString() {
            return "SLAData{uuid='" + this.f5816a + "', time=" + this.f5817b + ", data='" + this.f5818c + "'}";
        }
    }

    public /* synthetic */ C6669ag(byte b10) {
        this();
    }

    /* renamed from: c */
    public static void m5059c(List<b> list) {
        if (list == null || list.isEmpty()) {
            C6674al.m5106c("sla batch report data is empty", new Object[0]);
            return;
        }
        C6674al.m5106c("sla batch report list size:%s", Integer.valueOf(list.size()));
        if (list.size() > 30) {
            list = list.subList(0, 29);
        }
        ArrayList arrayList = new ArrayList();
        Iterator<b> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().f5818c);
        }
        Pair<Integer, String> pairM5042a = C6666ad.m5042a(arrayList);
        C6674al.m5106c("sla batch report result, rspCode:%s rspMsg:%s", pairM5042a.first, pairM5042a.second);
        if (((Integer) pairM5042a.first).intValue() == 200) {
            m5060d(list);
        }
    }

    /* renamed from: d */
    public static void m5060d(List<b> list) {
        if (list == null || list.isEmpty()) {
            C6674al.m5106c("sla batch delete list is null", new Object[0]);
            return;
        }
        C6674al.m5106c("sla batch delete list size:%s", Integer.valueOf(list.size()));
        try {
            String str = "_id in (" + m5056a(",", list) + ")";
            C6674al.m5106c("sla batch delete where:%s", str);
            C6732w.m5475a().m5488a("t_sla", str);
        } catch (Throwable th) {
            C6674al.m5105b(th);
        }
    }

    /* renamed from: e */
    private static void m5061e(List<b> list) {
        for (b bVar : list) {
            C6674al.m5106c("sla save id:%s time:%s msg:%s", bVar.f5816a, Long.valueOf(bVar.f5817b), bVar.f5818c);
            try {
                ContentValues contentValues = new ContentValues();
                contentValues.put("_id", bVar.f5816a);
                contentValues.put("_tm", Long.valueOf(bVar.f5817b));
                contentValues.put("_dt", bVar.f5818c);
                C6732w.m5475a().m5489a("t_sla", contentValues, (InterfaceC6731v) null);
            } catch (Throwable th) {
                C6674al.m5105b(th);
            }
        }
    }

    /* renamed from: a */
    public final void m5063a(List<c> list) {
        if (list == null || list.isEmpty()) {
            C6674al.m5107d("sla batch report event is null", new Object[0]);
            return;
        }
        C6674al.m5106c("sla batch report event size:%s", Integer.valueOf(list.size()));
        ArrayList arrayList = new ArrayList();
        Iterator<c> it = list.iterator();
        while (it.hasNext()) {
            b bVarM5058b = m5058b(it.next());
            if (bVarM5058b != null) {
                arrayList.add(bVarM5058b);
            }
        }
        m5061e(arrayList);
        m5064b(arrayList);
    }

    /* renamed from: b */
    public final void m5064b(final List<b> list) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            C6673ak.m5093a().m5095a(new Runnable() { // from class: com.tencent.bugly.proguard.ag.1
                @Override // java.lang.Runnable
                public final void run() {
                    C6669ag.m5059c(list);
                }
            });
        } else {
            m5059c(list);
        }
    }

    private C6669ag() {
        this.f5811a = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SSS", Locale.US);
        this.f5812b = new C6666ad();
    }

    /* renamed from: b */
    private b m5058b(c cVar) {
        if (cVar != null && !TextUtils.isEmpty(cVar.f5820b)) {
            C6663aa c6663aaM4969b = C6663aa.m4969b();
            if (c6663aaM4969b == null) {
                C6674al.m5107d("sla convert failed because ComInfoManager is null", new Object[0]);
                return null;
            }
            StringBuilder sb = new StringBuilder("&app_version=");
            sb.append(c6663aaM4969b.f5783o);
            sb.append("&app_name=");
            sb.append(c6663aaM4969b.f5785q);
            sb.append("&app_bundle_id=");
            sb.append(c6663aaM4969b.f5771c);
            sb.append("&client_type=android&user_id=");
            sb.append(c6663aaM4969b.m4984f());
            sb.append("&sdk_version=");
            sb.append(c6663aaM4969b.f5776h);
            sb.append("&event_code=");
            sb.append(cVar.f5820b);
            sb.append("&event_result=");
            sb.append(cVar.f5822d ? 1 : 0);
            sb.append("&event_time=");
            sb.append(this.f5811a.format(new Date(cVar.f5821c)));
            sb.append("&event_cost=");
            sb.append(cVar.f5823e);
            sb.append("&device_id=");
            sb.append(c6663aaM4969b.m4986g());
            sb.append("&debug=");
            sb.append(c6663aaM4969b.f5723D ? 1 : 0);
            sb.append("&param_0=");
            sb.append(cVar.f5824f);
            sb.append("&param_1=");
            sb.append(cVar.f5819a);
            sb.append("&param_2=");
            sb.append(c6663aaM4969b.f5732M ? "rqd" : "ext");
            sb.append("&param_4=");
            sb.append(c6663aaM4969b.m4982e());
            String string = sb.toString();
            if (!TextUtils.isEmpty(cVar.f5825g)) {
                string = string + "&param_3=" + cVar.f5825g;
            }
            C6674al.m5106c("sla convert eventId:%s eventType:%s, eventTime:%s success:%s cost:%s from:%s uploadMsg:", cVar.f5819a, cVar.f5820b, Long.valueOf(cVar.f5821c), Boolean.valueOf(cVar.f5822d), Long.valueOf(cVar.f5823e), cVar.f5824f, cVar.f5825g);
            String str = cVar.f5819a + "-" + cVar.f5820b;
            b bVar = new b();
            bVar.f5816a = str;
            bVar.f5817b = cVar.f5821c;
            bVar.f5818c = string;
            return bVar;
        }
        C6674al.m5107d("sla convert event is null", new Object[0]);
        return null;
    }

    /* renamed from: com.tencent.bugly.proguard.ag$c */
    public static class c {

        /* renamed from: a */
        String f5819a;

        /* renamed from: b */
        String f5820b;

        /* renamed from: c */
        long f5821c;

        /* renamed from: d */
        boolean f5822d;

        /* renamed from: e */
        long f5823e;

        /* renamed from: f */
        String f5824f;

        /* renamed from: g */
        String f5825g;

        public c(String str, String str2, long j9, boolean z9, long j10, String str3, String str4) {
            this.f5819a = str;
            this.f5820b = str2;
            this.f5821c = j9;
            this.f5822d = z9;
            this.f5823e = j10;
            this.f5824f = str3;
            this.f5825g = str4;
        }

        public c() {
        }
    }

    /* renamed from: a */
    private static String m5056a(String str, Iterable<b> iterable) {
        Iterator<b> it = iterable.iterator();
        if (!it.hasNext()) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("'");
        sb.append(it.next().f5816a);
        sb.append("'");
        while (it.hasNext()) {
            sb.append(str);
            sb.append("'");
            sb.append(it.next().f5816a);
            sb.append("'");
        }
        return sb.toString();
    }

    /* renamed from: a */
    public static List<b> m5057a() {
        Cursor cursorM5491a = C6732w.m5475a().m5491a("t_sla", new String[]{"_id", "_tm", "_dt"}, (String) null, "_tm", "30");
        if (cursorM5491a == null) {
            return null;
        }
        if (cursorM5491a.getCount() <= 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        while (cursorM5491a.moveToNext()) {
            try {
                b bVar = new b();
                bVar.f5816a = cursorM5491a.getString(cursorM5491a.getColumnIndex("_id"));
                bVar.f5817b = cursorM5491a.getLong(cursorM5491a.getColumnIndex("_tm"));
                bVar.f5818c = cursorM5491a.getString(cursorM5491a.getColumnIndex("_dt"));
                C6674al.m5106c(bVar.toString(), new Object[0]);
                arrayList.add(bVar);
            } catch (Throwable th) {
                try {
                    C6674al.m5105b(th);
                    return arrayList;
                } finally {
                    cursorM5491a.close();
                }
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public final void m5062a(c cVar) {
        if (TextUtils.isEmpty(cVar.f5820b)) {
            C6674al.m5107d("sla report event is null", new Object[0]);
        } else {
            C6674al.m5106c("sla report single event", new Object[0]);
            m5063a(Collections.singletonList(cVar));
        }
    }
}
