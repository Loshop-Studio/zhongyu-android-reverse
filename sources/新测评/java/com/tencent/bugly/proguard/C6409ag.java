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
public final class C6409ag {

    /* renamed from: a */
    private final SimpleDateFormat f5234a;

    /* renamed from: b */
    private final C6406ad f5235b;

    /* renamed from: com.tencent.bugly.proguard.ag$a */
    public static class a {

        /* renamed from: a */
        private static final C6409ag f5238a = new C6409ag(0);
    }

    /* renamed from: com.tencent.bugly.proguard.ag$b */
    public static class b {

        /* renamed from: a */
        String f5239a;

        /* renamed from: b */
        public long f5240b;

        /* renamed from: c */
        public String f5241c;

        public final String toString() {
            return "SLAData{uuid='" + this.f5239a + "', time=" + this.f5240b + ", data='" + this.f5241c + "'}";
        }
    }

    public /* synthetic */ C6409ag(byte b10) {
        this();
    }

    /* renamed from: c */
    public static void m4880c(List<b> list) {
        if (list == null || list.isEmpty()) {
            C6414al.m4927c("sla batch report data is empty", new Object[0]);
            return;
        }
        C6414al.m4927c("sla batch report list size:%s", Integer.valueOf(list.size()));
        if (list.size() > 30) {
            list = list.subList(0, 29);
        }
        ArrayList arrayList = new ArrayList();
        Iterator<b> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().f5241c);
        }
        Pair<Integer, String> pairM4863a = C6406ad.m4863a(arrayList);
        C6414al.m4927c("sla batch report result, rspCode:%s rspMsg:%s", pairM4863a.first, pairM4863a.second);
        if (((Integer) pairM4863a.first).intValue() == 200) {
            m4881d(list);
        }
    }

    /* renamed from: d */
    public static void m4881d(List<b> list) {
        if (list == null || list.isEmpty()) {
            C6414al.m4927c("sla batch delete list is null", new Object[0]);
            return;
        }
        C6414al.m4927c("sla batch delete list size:%s", Integer.valueOf(list.size()));
        try {
            String str = "_id in (" + m4877a(",", list) + ")";
            C6414al.m4927c("sla batch delete where:%s", str);
            C6472w.m5296a().m5309a("t_sla", str);
        } catch (Throwable th) {
            C6414al.m4926b(th);
        }
    }

    /* renamed from: e */
    private static void m4882e(List<b> list) {
        for (b bVar : list) {
            C6414al.m4927c("sla save id:%s time:%s msg:%s", bVar.f5239a, Long.valueOf(bVar.f5240b), bVar.f5241c);
            try {
                ContentValues contentValues = new ContentValues();
                contentValues.put("_id", bVar.f5239a);
                contentValues.put("_tm", Long.valueOf(bVar.f5240b));
                contentValues.put("_dt", bVar.f5241c);
                C6472w.m5296a().m5310a("t_sla", contentValues, (InterfaceC6471v) null);
            } catch (Throwable th) {
                C6414al.m4926b(th);
            }
        }
    }

    /* renamed from: a */
    public final void m4884a(List<c> list) {
        if (list == null || list.isEmpty()) {
            C6414al.m4928d("sla batch report event is null", new Object[0]);
            return;
        }
        C6414al.m4927c("sla batch report event size:%s", Integer.valueOf(list.size()));
        ArrayList arrayList = new ArrayList();
        Iterator<c> it = list.iterator();
        while (it.hasNext()) {
            b bVarM4879b = m4879b(it.next());
            if (bVarM4879b != null) {
                arrayList.add(bVarM4879b);
            }
        }
        m4882e(arrayList);
        m4885b(arrayList);
    }

    /* renamed from: b */
    public final void m4885b(final List<b> list) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            C6413ak.m4914a().m4916a(new Runnable() { // from class: com.tencent.bugly.proguard.ag.1
                @Override // java.lang.Runnable
                public final void run() {
                    C6409ag.m4880c(list);
                }
            });
        } else {
            m4880c(list);
        }
    }

    private C6409ag() {
        this.f5234a = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SSS", Locale.US);
        this.f5235b = new C6406ad();
    }

    /* renamed from: b */
    private b m4879b(c cVar) {
        if (cVar != null && !TextUtils.isEmpty(cVar.f5243b)) {
            C6403aa c6403aaM4790b = C6403aa.m4790b();
            if (c6403aaM4790b == null) {
                C6414al.m4928d("sla convert failed because ComInfoManager is null", new Object[0]);
                return null;
            }
            StringBuilder sb = new StringBuilder("&app_version=");
            sb.append(c6403aaM4790b.f5206o);
            sb.append("&app_name=");
            sb.append(c6403aaM4790b.f5208q);
            sb.append("&app_bundle_id=");
            sb.append(c6403aaM4790b.f5194c);
            sb.append("&client_type=android&user_id=");
            sb.append(c6403aaM4790b.m4805f());
            sb.append("&sdk_version=");
            sb.append(c6403aaM4790b.f5199h);
            sb.append("&event_code=");
            sb.append(cVar.f5243b);
            sb.append("&event_result=");
            sb.append(cVar.f5245d ? 1 : 0);
            sb.append("&event_time=");
            sb.append(this.f5234a.format(new Date(cVar.f5244c)));
            sb.append("&event_cost=");
            sb.append(cVar.f5246e);
            sb.append("&device_id=");
            sb.append(c6403aaM4790b.m4807g());
            sb.append("&debug=");
            sb.append(c6403aaM4790b.f5146D ? 1 : 0);
            sb.append("&param_0=");
            sb.append(cVar.f5247f);
            sb.append("&param_1=");
            sb.append(cVar.f5242a);
            sb.append("&param_2=");
            sb.append(c6403aaM4790b.f5155M ? "rqd" : "ext");
            sb.append("&param_4=");
            sb.append(c6403aaM4790b.m4803e());
            String string = sb.toString();
            if (!TextUtils.isEmpty(cVar.f5248g)) {
                string = string + "&param_3=" + cVar.f5248g;
            }
            C6414al.m4927c("sla convert eventId:%s eventType:%s, eventTime:%s success:%s cost:%s from:%s uploadMsg:", cVar.f5242a, cVar.f5243b, Long.valueOf(cVar.f5244c), Boolean.valueOf(cVar.f5245d), Long.valueOf(cVar.f5246e), cVar.f5247f, cVar.f5248g);
            String str = cVar.f5242a + "-" + cVar.f5243b;
            b bVar = new b();
            bVar.f5239a = str;
            bVar.f5240b = cVar.f5244c;
            bVar.f5241c = string;
            return bVar;
        }
        C6414al.m4928d("sla convert event is null", new Object[0]);
        return null;
    }

    /* renamed from: com.tencent.bugly.proguard.ag$c */
    public static class c {

        /* renamed from: a */
        String f5242a;

        /* renamed from: b */
        String f5243b;

        /* renamed from: c */
        long f5244c;

        /* renamed from: d */
        boolean f5245d;

        /* renamed from: e */
        long f5246e;

        /* renamed from: f */
        String f5247f;

        /* renamed from: g */
        String f5248g;

        public c(String str, String str2, long j10, boolean z9, long j11, String str3, String str4) {
            this.f5242a = str;
            this.f5243b = str2;
            this.f5244c = j10;
            this.f5245d = z9;
            this.f5246e = j11;
            this.f5247f = str3;
            this.f5248g = str4;
        }

        public c() {
        }
    }

    /* renamed from: a */
    private static String m4877a(String str, Iterable<b> iterable) {
        Iterator<b> it = iterable.iterator();
        if (!it.hasNext()) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("'");
        sb.append(it.next().f5239a);
        sb.append("'");
        while (it.hasNext()) {
            sb.append(str);
            sb.append("'");
            sb.append(it.next().f5239a);
            sb.append("'");
        }
        return sb.toString();
    }

    /* renamed from: a */
    public static List<b> m4878a() {
        Cursor cursorM5312a = C6472w.m5296a().m5312a("t_sla", new String[]{"_id", "_tm", "_dt"}, (String) null, "_tm", "30");
        if (cursorM5312a == null) {
            return null;
        }
        if (cursorM5312a.getCount() <= 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        while (cursorM5312a.moveToNext()) {
            try {
                b bVar = new b();
                bVar.f5239a = cursorM5312a.getString(cursorM5312a.getColumnIndex("_id"));
                bVar.f5240b = cursorM5312a.getLong(cursorM5312a.getColumnIndex("_tm"));
                bVar.f5241c = cursorM5312a.getString(cursorM5312a.getColumnIndex("_dt"));
                C6414al.m4927c(bVar.toString(), new Object[0]);
                arrayList.add(bVar);
            } catch (Throwable th) {
                try {
                    C6414al.m4926b(th);
                    return arrayList;
                } finally {
                    cursorM5312a.close();
                }
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public final void m4883a(c cVar) {
        if (TextUtils.isEmpty(cVar.f5243b)) {
            C6414al.m4928d("sla report event is null", new Object[0]);
        } else {
            C6414al.m4927c("sla report single event", new Object[0]);
            m4884a(Collections.singletonList(cVar));
        }
    }
}
