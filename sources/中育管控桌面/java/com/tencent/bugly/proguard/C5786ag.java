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
/* loaded from: classes3.dex */
public final class C5786ag {

    /* renamed from: a */
    private final SimpleDateFormat f3955a;

    /* renamed from: b */
    private final C5783ad f3956b;

    /* renamed from: com.tencent.bugly.proguard.ag$a */
    public static class a {

        /* renamed from: a */
        private static final C5786ag f3959a = new C5786ag(0);
    }

    /* renamed from: com.tencent.bugly.proguard.ag$b */
    public static class b {

        /* renamed from: a */
        String f3960a;

        /* renamed from: b */
        public long f3961b;

        /* renamed from: c */
        public String f3962c;

        public final String toString() {
            return "SLAData{uuid='" + this.f3960a + "', time=" + this.f3961b + ", data='" + this.f3962c + "'}";
        }
    }

    public /* synthetic */ C5786ag(byte b7) {
        this();
    }

    /* renamed from: c */
    public static void m3885c(List<b> list) {
        if (list == null || list.isEmpty()) {
            C5791al.m3932c("sla batch report data is empty", new Object[0]);
            return;
        }
        C5791al.m3932c("sla batch report list size:%s", Integer.valueOf(list.size()));
        if (list.size() > 30) {
            list = list.subList(0, 29);
        }
        ArrayList arrayList = new ArrayList();
        Iterator<b> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().f3962c);
        }
        Pair<Integer, String> pairM3868a = C5783ad.m3868a(arrayList);
        C5791al.m3932c("sla batch report result, rspCode:%s rspMsg:%s", pairM3868a.first, pairM3868a.second);
        if (((Integer) pairM3868a.first).intValue() == 200) {
            m3886d(list);
        }
    }

    /* renamed from: d */
    public static void m3886d(List<b> list) {
        if (list == null || list.isEmpty()) {
            C5791al.m3932c("sla batch delete list is null", new Object[0]);
            return;
        }
        C5791al.m3932c("sla batch delete list size:%s", Integer.valueOf(list.size()));
        try {
            String str = "_id in (" + m3882a(",", list) + ")";
            C5791al.m3932c("sla batch delete where:%s", str);
            C5849w.m4301a().m4314a("t_sla", str);
        } catch (Throwable th) {
            C5791al.m3931b(th);
        }
    }

    /* renamed from: e */
    private static void m3887e(List<b> list) {
        for (b bVar : list) {
            C5791al.m3932c("sla save id:%s time:%s msg:%s", bVar.f3960a, Long.valueOf(bVar.f3961b), bVar.f3962c);
            try {
                ContentValues contentValues = new ContentValues();
                contentValues.put("_id", bVar.f3960a);
                contentValues.put("_tm", Long.valueOf(bVar.f3961b));
                contentValues.put("_dt", bVar.f3962c);
                C5849w.m4301a().m4315a("t_sla", contentValues, (InterfaceC5848v) null);
            } catch (Throwable th) {
                C5791al.m3931b(th);
            }
        }
    }

    /* renamed from: a */
    public final void m3889a(List<c> list) {
        if (list == null || list.isEmpty()) {
            C5791al.m3933d("sla batch report event is null", new Object[0]);
            return;
        }
        C5791al.m3932c("sla batch report event size:%s", Integer.valueOf(list.size()));
        ArrayList arrayList = new ArrayList();
        Iterator<c> it = list.iterator();
        while (it.hasNext()) {
            b bVarM3884b = m3884b(it.next());
            if (bVarM3884b != null) {
                arrayList.add(bVarM3884b);
            }
        }
        m3887e(arrayList);
        m3890b(arrayList);
    }

    /* renamed from: b */
    public final void m3890b(final List<b> list) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            C5790ak.m3919a().m3921a(new Runnable() { // from class: com.tencent.bugly.proguard.ag.1
                @Override // java.lang.Runnable
                public final void run() {
                    C5786ag.m3885c(list);
                }
            });
        } else {
            m3885c(list);
        }
    }

    private C5786ag() {
        this.f3955a = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SSS", Locale.US);
        this.f3956b = new C5783ad();
    }

    /* renamed from: b */
    private b m3884b(c cVar) {
        if (cVar != null && !TextUtils.isEmpty(cVar.f3964b)) {
            C5780aa c5780aaM3795b = C5780aa.m3795b();
            if (c5780aaM3795b == null) {
                C5791al.m3933d("sla convert failed because ComInfoManager is null", new Object[0]);
                return null;
            }
            StringBuilder sb = new StringBuilder("&app_version=");
            sb.append(c5780aaM3795b.f3927o);
            sb.append("&app_name=");
            sb.append(c5780aaM3795b.f3929q);
            sb.append("&app_bundle_id=");
            sb.append(c5780aaM3795b.f3915c);
            sb.append("&client_type=android&user_id=");
            sb.append(c5780aaM3795b.m3810f());
            sb.append("&sdk_version=");
            sb.append(c5780aaM3795b.f3920h);
            sb.append("&event_code=");
            sb.append(cVar.f3964b);
            sb.append("&event_result=");
            sb.append(cVar.f3966d ? 1 : 0);
            sb.append("&event_time=");
            sb.append(this.f3955a.format(new Date(cVar.f3965c)));
            sb.append("&event_cost=");
            sb.append(cVar.f3967e);
            sb.append("&device_id=");
            sb.append(c5780aaM3795b.m3812g());
            sb.append("&debug=");
            sb.append(c5780aaM3795b.f3867D ? 1 : 0);
            sb.append("&param_0=");
            sb.append(cVar.f3968f);
            sb.append("&param_1=");
            sb.append(cVar.f3963a);
            sb.append("&param_2=");
            sb.append(c5780aaM3795b.f3876M ? "rqd" : "ext");
            sb.append("&param_4=");
            sb.append(c5780aaM3795b.m3808e());
            String string = sb.toString();
            if (!TextUtils.isEmpty(cVar.f3969g)) {
                string = string + "&param_3=" + cVar.f3969g;
            }
            C5791al.m3932c("sla convert eventId:%s eventType:%s, eventTime:%s success:%s cost:%s from:%s uploadMsg:", cVar.f3963a, cVar.f3964b, Long.valueOf(cVar.f3965c), Boolean.valueOf(cVar.f3966d), Long.valueOf(cVar.f3967e), cVar.f3968f, cVar.f3969g);
            String str = cVar.f3963a + "-" + cVar.f3964b;
            b bVar = new b();
            bVar.f3960a = str;
            bVar.f3961b = cVar.f3965c;
            bVar.f3962c = string;
            return bVar;
        }
        C5791al.m3933d("sla convert event is null", new Object[0]);
        return null;
    }

    /* renamed from: com.tencent.bugly.proguard.ag$c */
    public static class c {

        /* renamed from: a */
        String f3963a;

        /* renamed from: b */
        String f3964b;

        /* renamed from: c */
        long f3965c;

        /* renamed from: d */
        boolean f3966d;

        /* renamed from: e */
        long f3967e;

        /* renamed from: f */
        String f3968f;

        /* renamed from: g */
        String f3969g;

        public c(String str, String str2, long j6, boolean z6, long j7, String str3, String str4) {
            this.f3963a = str;
            this.f3964b = str2;
            this.f3965c = j6;
            this.f3966d = z6;
            this.f3967e = j7;
            this.f3968f = str3;
            this.f3969g = str4;
        }

        public c() {
        }
    }

    /* renamed from: a */
    private static String m3882a(String str, Iterable<b> iterable) {
        Iterator<b> it = iterable.iterator();
        if (!it.hasNext()) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("'");
        sb.append(it.next().f3960a);
        sb.append("'");
        while (it.hasNext()) {
            sb.append(str);
            sb.append("'");
            sb.append(it.next().f3960a);
            sb.append("'");
        }
        return sb.toString();
    }

    /* renamed from: a */
    public static List<b> m3883a() {
        Cursor cursorM4317a = C5849w.m4301a().m4317a("t_sla", new String[]{"_id", "_tm", "_dt"}, (String) null, "_tm", "30");
        if (cursorM4317a == null) {
            return null;
        }
        if (cursorM4317a.getCount() <= 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        while (cursorM4317a.moveToNext()) {
            try {
                b bVar = new b();
                bVar.f3960a = cursorM4317a.getString(cursorM4317a.getColumnIndex("_id"));
                bVar.f3961b = cursorM4317a.getLong(cursorM4317a.getColumnIndex("_tm"));
                bVar.f3962c = cursorM4317a.getString(cursorM4317a.getColumnIndex("_dt"));
                C5791al.m3932c(bVar.toString(), new Object[0]);
                arrayList.add(bVar);
            } catch (Throwable th) {
                try {
                    C5791al.m3931b(th);
                    return arrayList;
                } finally {
                    cursorM4317a.close();
                }
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public final void m3888a(c cVar) {
        if (TextUtils.isEmpty(cVar.f3964b)) {
            C5791al.m3933d("sla report event is null", new Object[0]);
        } else {
            C5791al.m3932c("sla report single event", new Object[0]);
            m3889a(Collections.singletonList(cVar));
        }
    }
}
