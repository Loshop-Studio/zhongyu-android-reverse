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
/* loaded from: classes5.dex */
public final class C7774ag {

    /* renamed from: a */
    private final SimpleDateFormat f13676a;

    /* renamed from: b */
    private final C7771ad f13677b;

    /* renamed from: com.tencent.bugly.proguard.ag$a */
    public static class a {

        /* renamed from: a */
        private static final C7774ag f13678a = new C7774ag(0);
    }

    /* renamed from: com.tencent.bugly.proguard.ag$b */
    public static class b {

        /* renamed from: a */
        String f13679a;

        /* renamed from: b */
        public long f13680b;

        /* renamed from: c */
        public String f13681c;

        public final String toString() {
            return "SLAData{uuid='" + this.f13679a + "', time=" + this.f13680b + ", data='" + this.f13681c + "'}";
        }
    }

    /* renamed from: com.tencent.bugly.proguard.ag$d */
    public class d implements Runnable {

        /* renamed from: c */
        public final /* synthetic */ List f13689c;

        public d(List list) {
            this.f13689c = list;
        }

        @Override // java.lang.Runnable
        public final void run() {
            C7774ag.m10570c(this.f13689c);
        }
    }

    public /* synthetic */ C7774ag(byte b10) {
        this();
    }

    /* renamed from: c */
    public static void m10570c(List<b> list) {
        if (list == null || list.isEmpty()) {
            C7779al.m10617c("sla batch report data is empty", new Object[0]);
            return;
        }
        C7779al.m10617c("sla batch report list size:%s", Integer.valueOf(list.size()));
        if (list.size() > 30) {
            list = list.subList(0, 29);
        }
        ArrayList arrayList = new ArrayList();
        Iterator<b> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().f13681c);
        }
        Pair<Integer, String> pairM10553a = C7771ad.m10553a(arrayList);
        C7779al.m10617c("sla batch report result, rspCode:%s rspMsg:%s", pairM10553a.first, pairM10553a.second);
        if (((Integer) pairM10553a.first).intValue() == 200) {
            m10571d(list);
        }
    }

    /* renamed from: d */
    public static void m10571d(List<b> list) {
        if (list == null || list.isEmpty()) {
            C7779al.m10617c("sla batch delete list is null", new Object[0]);
            return;
        }
        C7779al.m10617c("sla batch delete list size:%s", Integer.valueOf(list.size()));
        try {
            String str = "_id in (" + m10567a(",", list) + ")";
            C7779al.m10617c("sla batch delete where:%s", str);
            C7837w.m10986a().m10999a("t_sla", str);
        } catch (Throwable th) {
            C7779al.m10616b(th);
        }
    }

    /* renamed from: e */
    private static void m10572e(List<b> list) {
        for (b bVar : list) {
            C7779al.m10617c("sla save id:%s time:%s msg:%s", bVar.f13679a, Long.valueOf(bVar.f13680b), bVar.f13681c);
            try {
                ContentValues contentValues = new ContentValues();
                contentValues.put("_id", bVar.f13679a);
                contentValues.put("_tm", Long.valueOf(bVar.f13680b));
                contentValues.put("_dt", bVar.f13681c);
                C7837w.m10986a().m11000a("t_sla", contentValues, (InterfaceC7836v) null);
            } catch (Throwable th) {
                C7779al.m10616b(th);
            }
        }
    }

    /* renamed from: a */
    public final void m10574a(List<c> list) {
        if (list == null || list.isEmpty()) {
            C7779al.m10618d("sla batch report event is null", new Object[0]);
            return;
        }
        C7779al.m10617c("sla batch report event size:%s", Integer.valueOf(list.size()));
        ArrayList arrayList = new ArrayList();
        Iterator<c> it = list.iterator();
        while (it.hasNext()) {
            b bVarM10569b = m10569b(it.next());
            if (bVarM10569b != null) {
                arrayList.add(bVarM10569b);
            }
        }
        m10572e(arrayList);
        m10575b(arrayList);
    }

    /* renamed from: b */
    public final void m10575b(List<b> list) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            C7778ak.m10604a().m10606a(new d(list));
        } else {
            m10570c(list);
        }
    }

    private C7774ag() {
        this.f13676a = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SSS", Locale.US);
        this.f13677b = new C7771ad();
    }

    /* renamed from: b */
    private b m10569b(c cVar) {
        if (cVar != null && !TextUtils.isEmpty(cVar.f13683b)) {
            C7768aa c7768aaM10480b = C7768aa.m10480b();
            if (c7768aaM10480b == null) {
                C7779al.m10618d("sla convert failed because ComInfoManager is null", new Object[0]);
                return null;
            }
            StringBuilder sb2 = new StringBuilder("&app_version=");
            sb2.append(c7768aaM10480b.f13648o);
            sb2.append("&app_name=");
            sb2.append(c7768aaM10480b.f13650q);
            sb2.append("&app_bundle_id=");
            sb2.append(c7768aaM10480b.f13636c);
            sb2.append("&client_type=android&user_id=");
            sb2.append(c7768aaM10480b.m10495f());
            sb2.append("&sdk_version=");
            sb2.append(c7768aaM10480b.f13641h);
            sb2.append("&event_code=");
            sb2.append(cVar.f13683b);
            sb2.append("&event_result=");
            sb2.append(cVar.f13685d ? 1 : 0);
            sb2.append("&event_time=");
            sb2.append(this.f13676a.format(new Date(cVar.f13684c)));
            sb2.append("&event_cost=");
            sb2.append(cVar.f13686e);
            sb2.append("&device_id=");
            sb2.append(c7768aaM10480b.m10497g());
            sb2.append("&debug=");
            sb2.append(c7768aaM10480b.f13588D ? 1 : 0);
            sb2.append("&param_0=");
            sb2.append(cVar.f13687f);
            sb2.append("&param_1=");
            sb2.append(cVar.f13682a);
            sb2.append("&param_2=");
            sb2.append(c7768aaM10480b.f13597M ? "rqd" : "ext");
            sb2.append("&param_4=");
            sb2.append(c7768aaM10480b.m10493e());
            String string = sb2.toString();
            if (!TextUtils.isEmpty(cVar.f13688g)) {
                string = string + "&param_3=" + cVar.f13688g;
            }
            C7779al.m10617c("sla convert eventId:%s eventType:%s, eventTime:%s success:%s cost:%s from:%s uploadMsg:", cVar.f13682a, cVar.f13683b, Long.valueOf(cVar.f13684c), Boolean.valueOf(cVar.f13685d), Long.valueOf(cVar.f13686e), cVar.f13687f, cVar.f13688g);
            String str = cVar.f13682a + "-" + cVar.f13683b;
            b bVar = new b();
            bVar.f13679a = str;
            bVar.f13680b = cVar.f13684c;
            bVar.f13681c = string;
            return bVar;
        }
        C7779al.m10618d("sla convert event is null", new Object[0]);
        return null;
    }

    /* renamed from: com.tencent.bugly.proguard.ag$c */
    public static class c {

        /* renamed from: a */
        String f13682a;

        /* renamed from: b */
        String f13683b;

        /* renamed from: c */
        long f13684c;

        /* renamed from: d */
        boolean f13685d;

        /* renamed from: e */
        long f13686e;

        /* renamed from: f */
        String f13687f;

        /* renamed from: g */
        String f13688g;

        public c(String str, String str2, long j10, boolean z10, long j11, String str3, String str4) {
            this.f13682a = str;
            this.f13683b = str2;
            this.f13684c = j10;
            this.f13685d = z10;
            this.f13686e = j11;
            this.f13687f = str3;
            this.f13688g = str4;
        }

        public c() {
        }
    }

    /* renamed from: a */
    private static String m10567a(String str, Iterable<b> iterable) {
        Iterator<b> it = iterable.iterator();
        if (!it.hasNext()) {
            return "";
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("'");
        sb2.append(it.next().f13679a);
        sb2.append("'");
        while (it.hasNext()) {
            sb2.append(str);
            sb2.append("'");
            sb2.append(it.next().f13679a);
            sb2.append("'");
        }
        return sb2.toString();
    }

    /* renamed from: a */
    public static List<b> m10568a() {
        Cursor cursorM11002a = C7837w.m10986a().m11002a("t_sla", new String[]{"_id", "_tm", "_dt"}, (String) null, "_tm", "30");
        if (cursorM11002a == null) {
            return null;
        }
        if (cursorM11002a.getCount() <= 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        while (cursorM11002a.moveToNext()) {
            try {
                b bVar = new b();
                bVar.f13679a = cursorM11002a.getString(cursorM11002a.getColumnIndex("_id"));
                bVar.f13680b = cursorM11002a.getLong(cursorM11002a.getColumnIndex("_tm"));
                bVar.f13681c = cursorM11002a.getString(cursorM11002a.getColumnIndex("_dt"));
                C7779al.m10617c(bVar.toString(), new Object[0]);
                arrayList.add(bVar);
            } catch (Throwable th) {
                try {
                    C7779al.m10616b(th);
                    return arrayList;
                } finally {
                    cursorM11002a.close();
                }
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public final void m10573a(c cVar) {
        if (TextUtils.isEmpty(cVar.f13683b)) {
            C7779al.m10618d("sla report event is null", new Object[0]);
        } else {
            C7779al.m10617c("sla report single event", new Object[0]);
            m10574a(Collections.singletonList(cVar));
        }
    }
}
