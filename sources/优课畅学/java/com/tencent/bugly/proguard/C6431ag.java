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
public final class C6431ag {

    /* renamed from: a */
    private final SimpleDateFormat f4577a;

    /* renamed from: b */
    private final C6428ad f4578b;

    /* renamed from: com.tencent.bugly.proguard.ag$a */
    public static class a {

        /* renamed from: a */
        private static final C6431ag f4581a = new C6431ag(0);
    }

    /* renamed from: com.tencent.bugly.proguard.ag$b */
    public static class b {

        /* renamed from: a */
        String f4582a;

        /* renamed from: b */
        public long f4583b;

        /* renamed from: c */
        public String f4584c;

        public final String toString() {
            return "SLAData{uuid='" + this.f4582a + "', time=" + this.f4583b + ", data='" + this.f4584c + "'}";
        }
    }

    public /* synthetic */ C6431ag(byte b10) {
        this();
    }

    /* renamed from: c */
    public static void m4240c(List<b> list) {
        if (list == null || list.isEmpty()) {
            C6436al.m4287c("sla batch report data is empty", new Object[0]);
            return;
        }
        C6436al.m4287c("sla batch report list size:%s", Integer.valueOf(list.size()));
        if (list.size() > 30) {
            list = list.subList(0, 29);
        }
        ArrayList arrayList = new ArrayList();
        Iterator<b> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().f4584c);
        }
        Pair<Integer, String> pairM4223a = C6428ad.m4223a(arrayList);
        C6436al.m4287c("sla batch report result, rspCode:%s rspMsg:%s", pairM4223a.first, pairM4223a.second);
        if (((Integer) pairM4223a.first).intValue() == 200) {
            m4241d(list);
        }
    }

    /* renamed from: d */
    public static void m4241d(List<b> list) {
        if (list == null || list.isEmpty()) {
            C6436al.m4287c("sla batch delete list is null", new Object[0]);
            return;
        }
        C6436al.m4287c("sla batch delete list size:%s", Integer.valueOf(list.size()));
        try {
            String str = "_id in (" + m4237a(",", list) + ")";
            C6436al.m4287c("sla batch delete where:%s", str);
            C6494w.m4656a().m4669a("t_sla", str);
        } catch (Throwable th) {
            C6436al.m4286b(th);
        }
    }

    /* renamed from: e */
    private static void m4242e(List<b> list) {
        for (b bVar : list) {
            C6436al.m4287c("sla save id:%s time:%s msg:%s", bVar.f4582a, Long.valueOf(bVar.f4583b), bVar.f4584c);
            try {
                ContentValues contentValues = new ContentValues();
                contentValues.put("_id", bVar.f4582a);
                contentValues.put("_tm", Long.valueOf(bVar.f4583b));
                contentValues.put("_dt", bVar.f4584c);
                C6494w.m4656a().m4670a("t_sla", contentValues, (InterfaceC6493v) null);
            } catch (Throwable th) {
                C6436al.m4286b(th);
            }
        }
    }

    /* renamed from: a */
    public final void m4244a(List<c> list) {
        if (list == null || list.isEmpty()) {
            C6436al.m4288d("sla batch report event is null", new Object[0]);
            return;
        }
        C6436al.m4287c("sla batch report event size:%s", Integer.valueOf(list.size()));
        ArrayList arrayList = new ArrayList();
        Iterator<c> it = list.iterator();
        while (it.hasNext()) {
            b bVarM4239b = m4239b(it.next());
            if (bVarM4239b != null) {
                arrayList.add(bVarM4239b);
            }
        }
        m4242e(arrayList);
        m4245b(arrayList);
    }

    /* renamed from: b */
    public final void m4245b(final List<b> list) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            C6435ak.m4274a().m4276a(new Runnable() { // from class: com.tencent.bugly.proguard.ag.1
                @Override // java.lang.Runnable
                public final void run() {
                    C6431ag.m4240c(list);
                }
            });
        } else {
            m4240c(list);
        }
    }

    private C6431ag() {
        this.f4577a = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SSS", Locale.US);
        this.f4578b = new C6428ad();
    }

    /* renamed from: b */
    private b m4239b(c cVar) {
        if (cVar != null && !TextUtils.isEmpty(cVar.f4586b)) {
            C6425aa c6425aaM4150b = C6425aa.m4150b();
            if (c6425aaM4150b == null) {
                C6436al.m4288d("sla convert failed because ComInfoManager is null", new Object[0]);
                return null;
            }
            StringBuilder sb = new StringBuilder("&app_version=");
            sb.append(c6425aaM4150b.f4549o);
            sb.append("&app_name=");
            sb.append(c6425aaM4150b.f4551q);
            sb.append("&app_bundle_id=");
            sb.append(c6425aaM4150b.f4537c);
            sb.append("&client_type=android&user_id=");
            sb.append(c6425aaM4150b.m4165f());
            sb.append("&sdk_version=");
            sb.append(c6425aaM4150b.f4542h);
            sb.append("&event_code=");
            sb.append(cVar.f4586b);
            sb.append("&event_result=");
            sb.append(cVar.f4588d ? 1 : 0);
            sb.append("&event_time=");
            sb.append(this.f4577a.format(new Date(cVar.f4587c)));
            sb.append("&event_cost=");
            sb.append(cVar.f4589e);
            sb.append("&device_id=");
            sb.append(c6425aaM4150b.m4167g());
            sb.append("&debug=");
            sb.append(c6425aaM4150b.f4489D ? 1 : 0);
            sb.append("&param_0=");
            sb.append(cVar.f4590f);
            sb.append("&param_1=");
            sb.append(cVar.f4585a);
            sb.append("&param_2=");
            sb.append(c6425aaM4150b.f4498M ? "rqd" : "ext");
            sb.append("&param_4=");
            sb.append(c6425aaM4150b.m4163e());
            String string = sb.toString();
            if (!TextUtils.isEmpty(cVar.f4591g)) {
                string = string + "&param_3=" + cVar.f4591g;
            }
            C6436al.m4287c("sla convert eventId:%s eventType:%s, eventTime:%s success:%s cost:%s from:%s uploadMsg:", cVar.f4585a, cVar.f4586b, Long.valueOf(cVar.f4587c), Boolean.valueOf(cVar.f4588d), Long.valueOf(cVar.f4589e), cVar.f4590f, cVar.f4591g);
            String str = cVar.f4585a + "-" + cVar.f4586b;
            b bVar = new b();
            bVar.f4582a = str;
            bVar.f4583b = cVar.f4587c;
            bVar.f4584c = string;
            return bVar;
        }
        C6436al.m4288d("sla convert event is null", new Object[0]);
        return null;
    }

    /* renamed from: com.tencent.bugly.proguard.ag$c */
    public static class c {

        /* renamed from: a */
        String f4585a;

        /* renamed from: b */
        String f4586b;

        /* renamed from: c */
        long f4587c;

        /* renamed from: d */
        boolean f4588d;

        /* renamed from: e */
        long f4589e;

        /* renamed from: f */
        String f4590f;

        /* renamed from: g */
        String f4591g;

        public c(String str, String str2, long j10, boolean z10, long j11, String str3, String str4) {
            this.f4585a = str;
            this.f4586b = str2;
            this.f4587c = j10;
            this.f4588d = z10;
            this.f4589e = j11;
            this.f4590f = str3;
            this.f4591g = str4;
        }

        public c() {
        }
    }

    /* renamed from: a */
    private static String m4237a(String str, Iterable<b> iterable) {
        Iterator<b> it = iterable.iterator();
        if (!it.hasNext()) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("'");
        sb.append(it.next().f4582a);
        sb.append("'");
        while (it.hasNext()) {
            sb.append(str);
            sb.append("'");
            sb.append(it.next().f4582a);
            sb.append("'");
        }
        return sb.toString();
    }

    /* renamed from: a */
    public static List<b> m4238a() {
        Cursor cursorM4672a = C6494w.m4656a().m4672a("t_sla", new String[]{"_id", "_tm", "_dt"}, (String) null, "_tm", "30");
        if (cursorM4672a == null) {
            return null;
        }
        if (cursorM4672a.getCount() <= 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        while (cursorM4672a.moveToNext()) {
            try {
                b bVar = new b();
                bVar.f4582a = cursorM4672a.getString(cursorM4672a.getColumnIndex("_id"));
                bVar.f4583b = cursorM4672a.getLong(cursorM4672a.getColumnIndex("_tm"));
                bVar.f4584c = cursorM4672a.getString(cursorM4672a.getColumnIndex("_dt"));
                C6436al.m4287c(bVar.toString(), new Object[0]);
                arrayList.add(bVar);
            } catch (Throwable th) {
                try {
                    C6436al.m4286b(th);
                    return arrayList;
                } finally {
                    cursorM4672a.close();
                }
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public final void m4243a(c cVar) {
        if (TextUtils.isEmpty(cVar.f4586b)) {
            C6436al.m4288d("sla report event is null", new Object[0]);
        } else {
            C6436al.m4287c("sla report single event", new Object[0]);
            m4244a(Collections.singletonList(cVar));
        }
    }
}
