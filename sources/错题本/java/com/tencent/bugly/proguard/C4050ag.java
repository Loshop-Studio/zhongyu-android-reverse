package com.tencent.bugly.proguard;

import android.content.ContentValues;
import android.database.Cursor;
import android.os.Looper;
import android.support.v4.media.AbstractC0037f;
import android.text.TextUtils;
import android.util.Pair;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import p016b0.RunnableC3059a;

/* renamed from: com.tencent.bugly.proguard.ag */
/* loaded from: classes3.dex */
public final class C4050ag {

    /* renamed from: a */
    private final SimpleDateFormat f3473a;

    /* renamed from: b */
    private final C4047ad f3474b;

    /* renamed from: com.tencent.bugly.proguard.ag$a */
    public static class a {

        /* renamed from: a */
        private static final C4050ag f3475a = new C4050ag(0);
    }

    /* renamed from: com.tencent.bugly.proguard.ag$b */
    public static class b {

        /* renamed from: a */
        String f3476a;

        /* renamed from: b */
        public long f3477b;

        /* renamed from: c */
        public String f3478c;

        public final String toString() {
            StringBuilder sb = new StringBuilder("SLAData{uuid='");
            sb.append(this.f3476a);
            sb.append("', time=");
            sb.append(this.f3477b);
            sb.append(", data='");
            return AbstractC0037f.m91p(sb, this.f3478c, "'}");
        }
    }

    public /* synthetic */ C4050ag(byte b6) {
        this();
    }

    /* renamed from: c */
    public static void m2979c(List<b> list) {
        if (list == null || list.isEmpty()) {
            C4055al.m3025c("sla batch report data is empty", new Object[0]);
            return;
        }
        C4055al.m3025c("sla batch report list size:%s", Integer.valueOf(list.size()));
        if (list.size() > 30) {
            list = list.subList(0, 29);
        }
        ArrayList arrayList = new ArrayList();
        Iterator<b> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().f3478c);
        }
        Pair<Integer, String> pairM2962a = C4047ad.m2962a(arrayList);
        C4055al.m3025c("sla batch report result, rspCode:%s rspMsg:%s", pairM2962a.first, pairM2962a.second);
        if (((Integer) pairM2962a.first).intValue() == 200) {
            m2980d(list);
        }
    }

    /* renamed from: d */
    public static void m2980d(List<b> list) {
        if (list == null || list.isEmpty()) {
            C4055al.m3025c("sla batch delete list is null", new Object[0]);
            return;
        }
        C4055al.m3025c("sla batch delete list size:%s", Integer.valueOf(list.size()));
        try {
            String str = "_id in (" + m2976a(",", list) + ")";
            C4055al.m3025c("sla batch delete where:%s", str);
            C4143w.m3393a().m3406a("t_sla", str);
        } catch (Throwable th) {
            C4055al.m3024b(th);
        }
    }

    /* renamed from: e */
    private static void m2981e(List<b> list) {
        for (b bVar : list) {
            C4055al.m3025c("sla save id:%s time:%s msg:%s", bVar.f3476a, Long.valueOf(bVar.f3477b), bVar.f3478c);
            try {
                ContentValues contentValues = new ContentValues();
                contentValues.put("_id", bVar.f3476a);
                contentValues.put("_tm", Long.valueOf(bVar.f3477b));
                contentValues.put("_dt", bVar.f3478c);
                C4143w.m3393a().m3407a("t_sla", contentValues, (InterfaceC4141v) null);
            } catch (Throwable th) {
                C4055al.m3024b(th);
            }
        }
    }

    /* renamed from: a */
    public final void m2983a(List<c> list) {
        if (list == null || list.isEmpty()) {
            C4055al.m3026d("sla batch report event is null", new Object[0]);
            return;
        }
        C4055al.m3025c("sla batch report event size:%s", Integer.valueOf(list.size()));
        ArrayList arrayList = new ArrayList();
        Iterator<c> it = list.iterator();
        while (it.hasNext()) {
            b bVarM2978b = m2978b(it.next());
            if (bVarM2978b != null) {
                arrayList.add(bVarM2978b);
            }
        }
        m2981e(arrayList);
        m2984b(arrayList);
    }

    /* renamed from: b */
    public final void m2984b(List<b> list) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            C4054ak.m3012a().m3014a(new RunnableC3059a(list, 8));
        } else {
            m2979c(list);
        }
    }

    private C4050ag() {
        this.f3473a = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SSS", Locale.US);
        this.f3474b = new C4047ad();
    }

    /* renamed from: b */
    private b m2978b(c cVar) {
        if (cVar != null && !TextUtils.isEmpty(cVar.f3480b)) {
            C4044aa c4044aaM2890b = C4044aa.m2890b();
            if (c4044aaM2890b == null) {
                C4055al.m3026d("sla convert failed because ComInfoManager is null", new Object[0]);
                return null;
            }
            StringBuilder sb = new StringBuilder("&app_version=");
            sb.append(c4044aaM2890b.f3445o);
            sb.append("&app_name=");
            sb.append(c4044aaM2890b.f3447q);
            sb.append("&app_bundle_id=");
            sb.append(c4044aaM2890b.f3433c);
            sb.append("&client_type=android&user_id=");
            sb.append(c4044aaM2890b.m2905f());
            sb.append("&sdk_version=");
            sb.append(c4044aaM2890b.f3438h);
            sb.append("&event_code=");
            sb.append(cVar.f3480b);
            sb.append("&event_result=");
            sb.append(cVar.f3482d ? 1 : 0);
            sb.append("&event_time=");
            sb.append(this.f3473a.format(new Date(cVar.f3481c)));
            sb.append("&event_cost=");
            sb.append(cVar.f3483e);
            sb.append("&device_id=");
            sb.append(c4044aaM2890b.m2907g());
            sb.append("&debug=");
            sb.append(c4044aaM2890b.f3385D ? 1 : 0);
            sb.append("&param_0=");
            sb.append(cVar.f3484f);
            sb.append("&param_1=");
            sb.append(cVar.f3479a);
            sb.append("&param_2=");
            sb.append(c4044aaM2890b.f3394M ? "rqd" : "ext");
            sb.append("&param_4=");
            sb.append(c4044aaM2890b.m2903e());
            String string = sb.toString();
            if (!TextUtils.isEmpty(cVar.f3485g)) {
                StringBuilder sbM98w = AbstractC0037f.m98w(string, "&param_3=");
                sbM98w.append(cVar.f3485g);
                string = sbM98w.toString();
            }
            C4055al.m3025c("sla convert eventId:%s eventType:%s, eventTime:%s success:%s cost:%s from:%s uploadMsg:", cVar.f3479a, cVar.f3480b, Long.valueOf(cVar.f3481c), Boolean.valueOf(cVar.f3482d), Long.valueOf(cVar.f3483e), cVar.f3484f, cVar.f3485g);
            String str = cVar.f3479a + "-" + cVar.f3480b;
            b bVar = new b();
            bVar.f3476a = str;
            bVar.f3477b = cVar.f3481c;
            bVar.f3478c = string;
            return bVar;
        }
        C4055al.m3026d("sla convert event is null", new Object[0]);
        return null;
    }

    /* renamed from: com.tencent.bugly.proguard.ag$c */
    public static class c {

        /* renamed from: a */
        String f3479a;

        /* renamed from: b */
        String f3480b;

        /* renamed from: c */
        long f3481c;

        /* renamed from: d */
        boolean f3482d;

        /* renamed from: e */
        long f3483e;

        /* renamed from: f */
        String f3484f;

        /* renamed from: g */
        String f3485g;

        public c(String str, String str2, long j7, boolean z8, long j8, String str3, String str4) {
            this.f3479a = str;
            this.f3480b = str2;
            this.f3481c = j7;
            this.f3482d = z8;
            this.f3483e = j8;
            this.f3484f = str3;
            this.f3485g = str4;
        }

        public c() {
        }
    }

    /* renamed from: a */
    private static String m2976a(String str, Iterable<b> iterable) {
        Iterator<b> it = iterable.iterator();
        if (!it.hasNext()) {
            return "";
        }
        StringBuilder sb = new StringBuilder("'");
        sb.append(it.next().f3476a);
        sb.append("'");
        while (it.hasNext()) {
            sb.append(str);
            sb.append("'");
            sb.append(it.next().f3476a);
            sb.append("'");
        }
        return sb.toString();
    }

    /* renamed from: a */
    public static List<b> m2977a() {
        Cursor cursorM3409a = C4143w.m3393a().m3409a("t_sla", new String[]{"_id", "_tm", "_dt"}, (String) null, "_tm", "30");
        if (cursorM3409a == null) {
            return null;
        }
        if (cursorM3409a.getCount() <= 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        while (cursorM3409a.moveToNext()) {
            try {
                b bVar = new b();
                bVar.f3476a = cursorM3409a.getString(cursorM3409a.getColumnIndex("_id"));
                bVar.f3477b = cursorM3409a.getLong(cursorM3409a.getColumnIndex("_tm"));
                bVar.f3478c = cursorM3409a.getString(cursorM3409a.getColumnIndex("_dt"));
                C4055al.m3025c(bVar.toString(), new Object[0]);
                arrayList.add(bVar);
            } catch (Throwable th) {
                try {
                    C4055al.m3024b(th);
                    return arrayList;
                } finally {
                    cursorM3409a.close();
                }
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public final void m2982a(c cVar) {
        if (TextUtils.isEmpty(cVar.f3480b)) {
            C4055al.m3026d("sla report event is null", new Object[0]);
        } else {
            C4055al.m3025c("sla report single event", new Object[0]);
            m2983a(Collections.singletonList(cVar));
        }
    }
}
