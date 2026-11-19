package com.tencent.bugly.proguard;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import androidx.compose.material3.internal.CalendarModelKt;
import androidx.lifecycle.CoroutineLiveDataKt;
import com.tencent.bugly.crashreport.biz.UserInfoBean;
import com.tencent.bugly.crashreport.common.strategy.StrategyBean;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: com.tencent.bugly.proguard.r */
/* loaded from: classes4.dex */
public final class C6727r {

    /* renamed from: e */
    private static boolean f6216e = true;

    /* renamed from: a */
    private Context f6217a;

    /* renamed from: b */
    private long f6218b;

    /* renamed from: c */
    private int f6219c;

    /* renamed from: d */
    private boolean f6220d;

    /* renamed from: com.tencent.bugly.proguard.r$a */
    public class a implements Runnable {

        /* renamed from: b */
        private boolean f6226b;

        /* renamed from: c */
        private UserInfoBean f6227c;

        public a(UserInfoBean userInfoBean, boolean z9) {
            this.f6227c = userInfoBean;
            this.f6226b = z9;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (C6727r.this.f6220d) {
                try {
                    UserInfoBean userInfoBean = this.f6227c;
                    if (userInfoBean != null) {
                        C6727r.m5417a(userInfoBean);
                        C6674al.m5106c("[UserInfo] Record user info.", new Object[0]);
                        C6727r.this.m5418a(this.f6227c, false);
                    }
                    if (this.f6226b) {
                        C6727r.this.m5433b();
                    }
                } catch (Throwable th) {
                    if (C6674al.m5103a(th)) {
                        return;
                    }
                    th.printStackTrace();
                }
            }
        }
    }

    /* renamed from: com.tencent.bugly.proguard.r$b */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (jCurrentTimeMillis < C6727r.this.f6218b) {
                C6673ak.m5093a().m5096a(C6727r.this.new b(), (C6727r.this.f6218b - jCurrentTimeMillis) + CoroutineLiveDataKt.DEFAULT_TIMEOUT);
            } else {
                C6727r.this.m5431a(3, false);
                C6727r.this.m5430a();
            }
        }
    }

    /* renamed from: com.tencent.bugly.proguard.r$c */
    public class c implements Runnable {

        /* renamed from: b */
        private long f6230b;

        public c(long j9) {
            this.f6230b = j9;
        }

        @Override // java.lang.Runnable
        public final void run() {
            C6727r.this.m5433b();
            C6727r.this.m5432a(this.f6230b);
        }
    }

    public C6727r(Context context, boolean z9) {
        this.f6217a = context;
        this.f6220d = z9;
    }

    /* renamed from: b */
    private static void m5428b(List<UserInfoBean> list, List<UserInfoBean> list2) {
        Iterator<UserInfoBean> it = list.iterator();
        while (it.hasNext()) {
            UserInfoBean next = it.next();
            if (next.f5595f != -1) {
                it.remove();
                if (next.f5594e < C6678ap.m5157b()) {
                    list2.add(next);
                }
            }
        }
    }

    /* renamed from: a */
    public final void m5431a(int i9, boolean z9) {
        C6665ac c6665acM5031a = C6665ac.m5031a();
        if (c6665acM5031a != null && !c6665acM5031a.m5040c().f5618g && i9 != 1 && i9 != 3) {
            C6674al.m5108e("UserInfo is disable", new Object[0]);
            return;
        }
        if (i9 == 1 || i9 == 3) {
            this.f6219c++;
        }
        C6663aa c6663aaM4967a = C6663aa.m4967a(this.f6217a);
        UserInfoBean userInfoBean = new UserInfoBean();
        userInfoBean.f5591b = i9;
        userInfoBean.f5592c = c6663aaM4967a.f5772d;
        userInfoBean.f5593d = c6663aaM4967a.m4984f();
        userInfoBean.f5594e = System.currentTimeMillis();
        userInfoBean.f5595f = -1L;
        userInfoBean.f5603n = c6663aaM4967a.f5783o;
        userInfoBean.f5604o = i9 == 1 ? 1 : 0;
        userInfoBean.f5601l = c6663aaM4967a.m4975a();
        userInfoBean.f5602m = c6663aaM4967a.f5793y;
        userInfoBean.f5596g = c6663aaM4967a.f5794z;
        userInfoBean.f5597h = c6663aaM4967a.f5720A;
        userInfoBean.f5598i = c6663aaM4967a.f5721B;
        userInfoBean.f5600k = c6663aaM4967a.f5722C;
        userInfoBean.f5607r = c6663aaM4967a.m4999t();
        userInfoBean.f5608s = c6663aaM4967a.m5004y();
        userInfoBean.f5605p = c6663aaM4967a.m5005z();
        userInfoBean.f5606q = c6663aaM4967a.f5792x;
        C6673ak.m5093a().m5096a(new a(userInfoBean, z9), 0L);
    }

    /* renamed from: b */
    public final void m5433b() {
        C6673ak c6673akM5093a = C6673ak.m5093a();
        if (c6673akM5093a != null) {
            c6673akM5093a.m5095a(new Runnable() { // from class: com.tencent.bugly.proguard.r.2

                /* renamed from: a */
                final /* synthetic */ boolean f6223a = false;

                @Override // java.lang.Runnable
                public final void run() {
                    try {
                        C6727r.this.m5423a(this.f6223a);
                    } catch (Throwable th) {
                        C6674al.m5103a(th);
                    }
                }
            });
        }
    }

    /* renamed from: b */
    private static void m5427b(List<UserInfoBean> list) {
        if (list.size() == 0) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        for (int i9 = 0; i9 < list.size() && i9 < 50; i9++) {
            UserInfoBean userInfoBean = list.get(i9);
            sb.append(" or _id = ");
            sb.append(userInfoBean.f5590a);
        }
        String string = sb.toString();
        if (string.length() > 0) {
            string = string.substring(4);
        }
        sb.setLength(0);
        try {
            C6674al.m5106c("[Database] deleted %s data %d", "t_ui", Integer.valueOf(C6732w.m5475a().m5488a("t_ui", string)));
        } catch (Throwable th) {
            if (C6674al.m5103a(th)) {
                return;
            }
            th.printStackTrace();
        }
    }

    /* renamed from: b */
    private static ContentValues m5426b(UserInfoBean userInfoBean) {
        if (userInfoBean == null) {
            return null;
        }
        try {
            ContentValues contentValues = new ContentValues();
            long j9 = userInfoBean.f5590a;
            if (j9 > 0) {
                contentValues.put("_id", Long.valueOf(j9));
            }
            contentValues.put("_tm", Long.valueOf(userInfoBean.f5594e));
            contentValues.put("_ut", Long.valueOf(userInfoBean.f5595f));
            contentValues.put("_tp", Integer.valueOf(userInfoBean.f5591b));
            contentValues.put("_pc", userInfoBean.f5592c);
            contentValues.put("_dt", C6678ap.m5154a(userInfoBean));
            return contentValues;
        } catch (Throwable th) {
            if (!C6674al.m5103a(th)) {
                th.printStackTrace();
            }
            return null;
        }
    }

    /* renamed from: a */
    public final void m5432a(long j9) {
        C6673ak.m5093a().m5096a(new c(j9), j9);
    }

    /* renamed from: a */
    public final void m5430a() {
        this.f6218b = C6678ap.m5157b() + CalendarModelKt.MillisecondsIn24Hours;
        C6673ak.m5093a().m5096a(new b(), (this.f6218b - System.currentTimeMillis()) + CoroutineLiveDataKt.DEFAULT_TIMEOUT);
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0074 A[EXC_TOP_SPLITTER, PHI: r1
      0x0074: PHI (r1v2 boolean) = (r1v0 boolean), (r1v3 boolean) binds: [B:25:0x006a, B:36:0x0087] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean m5429b(boolean r14) throws java.io.IOException {
        /*
            r13 = this;
            boolean r0 = com.tencent.bugly.proguard.C6727r.f6216e
            r1 = 1
            if (r0 != 0) goto L6
            return r1
        L6:
            java.io.File r0 = new java.io.File
            android.content.Context r2 = r13.f6217a
            java.io.File r2 = r2.getFilesDir()
            java.lang.String r3 = "bugly_last_us_up_tm"
            r0.<init>(r2, r3)
            long r2 = java.lang.System.currentTimeMillis()
            r4 = 1024(0x400, double:5.06E-321)
            r6 = 0
            if (r14 == 0) goto L24
            java.lang.String r14 = java.lang.String.valueOf(r2)
            com.tencent.bugly.proguard.C6675am.m5112a(r0, r14, r4, r6)
            return r1
        L24:
            boolean r14 = r0.exists()
            if (r14 != 0) goto L32
            java.lang.String r14 = java.lang.String.valueOf(r2)
            com.tencent.bugly.proguard.C6675am.m5112a(r0, r14, r4, r6)
            goto L8a
        L32:
            java.io.BufferedReader r14 = com.tencent.bugly.proguard.C6678ap.m5134a(r0)
            if (r14 == 0) goto L87
            java.lang.String r7 = r14.readLine()     // Catch: java.lang.Throwable -> L69
            java.lang.String r7 = r7.trim()     // Catch: java.lang.Throwable -> L69
            java.lang.Long r7 = java.lang.Long.valueOf(r7)     // Catch: java.lang.Throwable -> L69
            long r7 = r7.longValue()     // Catch: java.lang.Throwable -> L69
            int r9 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r9 < 0) goto L61
            long r9 = r2 - r7
            r11 = 86400000(0x5265c00, double:4.2687272E-316)
            int r9 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r9 <= 0) goto L56
            goto L61
        L56:
            long r7 = r2 - r7
            r9 = 300000(0x493e0, double:1.482197E-318)
            int r7 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r7 >= 0) goto L61
            r1 = r6
            goto L87
        L61:
            java.lang.String r7 = java.lang.String.valueOf(r2)     // Catch: java.lang.Throwable -> L69
            com.tencent.bugly.proguard.C6675am.m5112a(r0, r7, r4, r6)     // Catch: java.lang.Throwable -> L69
            goto L87
        L69:
            r7 = move-exception
            com.tencent.bugly.proguard.C6674al.m5105b(r7)     // Catch: java.lang.Throwable -> L7d
            java.lang.String r2 = java.lang.String.valueOf(r2)     // Catch: java.lang.Throwable -> L7d
            com.tencent.bugly.proguard.C6675am.m5112a(r0, r2, r4, r6)     // Catch: java.lang.Throwable -> L7d
        L74:
            r14.close()     // Catch: java.lang.Exception -> L78
            goto L8a
        L78:
            r14 = move-exception
            com.tencent.bugly.proguard.C6674al.m5103a(r14)
            goto L8a
        L7d:
            r0 = move-exception
            r14.close()     // Catch: java.lang.Exception -> L82
            goto L86
        L82:
            r14 = move-exception
            com.tencent.bugly.proguard.C6674al.m5103a(r14)
        L86:
            throw r0
        L87:
            if (r14 == 0) goto L8a
            goto L74
        L8a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.bugly.proguard.C6727r.m5429b(boolean):boolean");
    }

    /* renamed from: a */
    private static void m5421a(List<UserInfoBean> list, List<UserInfoBean> list2) {
        int size = list.size() - 20;
        if (size > 0) {
            int i9 = 0;
            while (i9 < list.size() - 1) {
                int i10 = i9 + 1;
                for (int i11 = i10; i11 < list.size(); i11++) {
                    if (list.get(i9).f5594e > list.get(i11).f5594e) {
                        UserInfoBean userInfoBean = list.get(i9);
                        list.set(i9, list.get(i11));
                        list.set(i11, userInfoBean);
                    }
                }
                i9 = i10;
            }
            for (int i12 = 0; i12 < size; i12++) {
                list2.add(list.get(i12));
            }
        }
    }

    /* renamed from: a */
    private static int m5414a(List<UserInfoBean> list) {
        int i9;
        long jCurrentTimeMillis = System.currentTimeMillis();
        int i10 = 0;
        for (UserInfoBean userInfoBean : list) {
            if (userInfoBean.f5594e > jCurrentTimeMillis - 600000 && ((i9 = userInfoBean.f5591b) == 1 || i9 == 4 || i9 == 3)) {
                i10++;
            }
        }
        return i10;
    }

    /* renamed from: a */
    private void m5422a(final List<UserInfoBean> list, boolean z9) {
        C6663aa c6663aaM4969b;
        if (!m5429b(z9)) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            for (UserInfoBean userInfoBean : list) {
                userInfoBean.f5595f = jCurrentTimeMillis;
                m5418a(userInfoBean, true);
            }
            C6674al.m5107d("uploadCheck failed", new Object[0]);
            return;
        }
        int i9 = this.f6219c == 1 ? 1 : 2;
        C6711bv c6711bv = null;
        if (list != null && list.size() != 0 && (c6663aaM4969b = C6663aa.m4969b()) != null) {
            c6663aaM4969b.m4994o();
            C6711bv c6711bv2 = new C6711bv();
            c6711bv2.f6169b = c6663aaM4969b.f5772d;
            c6711bv2.f6170c = c6663aaM4969b.m4986g();
            ArrayList<C6710bu> arrayList = new ArrayList<>();
            Iterator<UserInfoBean> it = list.iterator();
            while (it.hasNext()) {
                C6710bu c6710buM5047a = C6667ae.m5047a(it.next());
                if (c6710buM5047a != null) {
                    arrayList.add(c6710buM5047a);
                }
            }
            c6711bv2.f6171d = arrayList;
            HashMap map = new HashMap();
            c6711bv2.f6172e = map;
            map.put("A7", new StringBuilder().toString());
            c6711bv2.f6172e.put("A6", C6663aa.m4970n());
            c6711bv2.f6172e.put("A5", c6663aaM4969b.m4993m());
            Map<String, String> map2 = c6711bv2.f6172e;
            StringBuilder sb = new StringBuilder();
            sb.append(c6663aaM4969b.m4991k());
            map2.put("A2", sb.toString());
            Map<String, String> map3 = c6711bv2.f6172e;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(c6663aaM4969b.m4991k());
            map3.put("A1", sb2.toString());
            c6711bv2.f6172e.put("A24", c6663aaM4969b.f5779k);
            Map<String, String> map4 = c6711bv2.f6172e;
            StringBuilder sb3 = new StringBuilder();
            sb3.append(c6663aaM4969b.m4992l());
            map4.put("A17", sb3.toString());
            c6711bv2.f6172e.put("A15", c6663aaM4969b.m4996q());
            Map<String, String> map5 = c6711bv2.f6172e;
            StringBuilder sb4 = new StringBuilder();
            sb4.append(c6663aaM4969b.m4997r());
            map5.put("A13", sb4.toString());
            c6711bv2.f6172e.put("F08", c6663aaM4969b.f5724E);
            c6711bv2.f6172e.put("F09", c6663aaM4969b.f5725F);
            Map<String, String> mapM5004y = c6663aaM4969b.m5004y();
            if (mapM5004y != null && mapM5004y.size() > 0) {
                for (Map.Entry<String, String> entry : mapM5004y.entrySet()) {
                    c6711bv2.f6172e.put("C04_" + entry.getKey(), entry.getValue());
                }
            }
            if (i9 == 1) {
                c6711bv2.f6168a = (byte) 1;
            } else if (i9 != 2) {
                C6674al.m5108e("unknown up type %d ", Integer.valueOf(i9));
            } else {
                c6711bv2.f6168a = (byte) 2;
            }
            c6711bv = c6711bv2;
        }
        if (c6711bv == null) {
            C6674al.m5107d("[UserInfo] Failed to create UserInfoPackage.", new Object[0]);
            return;
        }
        byte[] bArrM5049a = C6667ae.m5049a((AbstractC6722m) c6711bv);
        if (bArrM5049a == null) {
            C6674al.m5107d("[UserInfo] Failed to encode data.", new Object[0]);
            return;
        }
        C6706bq c6706bqM5045a = C6667ae.m5045a(this.f6217a, 840, bArrM5049a);
        if (c6706bqM5045a == null) {
            C6674al.m5107d("[UserInfo] Request package is null.", new Object[0]);
            return;
        }
        C6671ai.m5067a().m5082a(1001, c6706bqM5045a, C6665ac.m5031a().m5040c().f5628q, StrategyBean.f5612a, new InterfaceC6670ah() { // from class: com.tencent.bugly.proguard.r.1
            @Override // com.tencent.bugly.proguard.InterfaceC6670ah
            /* renamed from: a */
            public final void mo5066a(boolean z10, String str) {
                if (z10) {
                    C6674al.m5106c("[UserInfo] Successfully uploaded user info.", new Object[0]);
                    long jCurrentTimeMillis2 = System.currentTimeMillis();
                    for (UserInfoBean userInfoBean2 : list) {
                        userInfoBean2.f5595f = jCurrentTimeMillis2;
                        C6727r.this.m5418a(userInfoBean2, true);
                    }
                }
            }
        }, this.f6219c == 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m5418a(UserInfoBean userInfoBean, boolean z9) {
        List<UserInfoBean> listM5416a;
        if (userInfoBean == null) {
            return;
        }
        if (!z9 && userInfoBean.f5591b != 1 && (listM5416a = m5416a(C6663aa.m4967a(this.f6217a).f5772d)) != null && listM5416a.size() >= 20) {
            C6674al.m5102a("[UserInfo] There are too many user info in local: %d", Integer.valueOf(listM5416a.size()));
            return;
        }
        long jM5489a = C6732w.m5475a().m5489a("t_ui", m5426b(userInfoBean), (InterfaceC6731v) null);
        if (jM5489a >= 0) {
            C6674al.m5106c("[Database] insert %s success with ID: %d", "t_ui", Long.valueOf(jM5489a));
            userInfoBean.f5590a = jM5489a;
        }
    }

    /* renamed from: a */
    public static List<UserInfoBean> m5416a(String str) {
        Cursor cursorM5490a;
        String str2;
        try {
            if (C6678ap.m5165b(str)) {
                str2 = null;
            } else {
                str2 = "_pc = '" + str + "'";
            }
            cursorM5490a = C6732w.m5475a().m5490a("t_ui", (String[]) null, str2);
            if (cursorM5490a == null) {
                return null;
            }
            try {
                StringBuilder sb = new StringBuilder();
                ArrayList arrayList = new ArrayList();
                while (cursorM5490a.moveToNext()) {
                    UserInfoBean userInfoBeanM5415a = m5415a(cursorM5490a);
                    if (userInfoBeanM5415a != null) {
                        arrayList.add(userInfoBeanM5415a);
                    } else {
                        try {
                            long j9 = cursorM5490a.getLong(cursorM5490a.getColumnIndex("_id"));
                            sb.append(" or _id = ");
                            sb.append(j9);
                        } catch (Throwable unused) {
                            C6674al.m5107d("[Database] unknown id.", new Object[0]);
                        }
                    }
                }
                String string = sb.toString();
                if (string.length() > 0) {
                    C6674al.m5107d("[Database] deleted %s error data %d", "t_ui", Integer.valueOf(C6732w.m5475a().m5488a("t_ui", string.substring(4))));
                }
                cursorM5490a.close();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                try {
                    if (!C6674al.m5103a(th)) {
                        th.printStackTrace();
                    }
                    if (cursorM5490a != null) {
                        cursorM5490a.close();
                    }
                    return null;
                } finally {
                    if (cursorM5490a != null) {
                        cursorM5490a.close();
                    }
                }
            }
        } catch (Throwable th2) {
            th = th2;
            cursorM5490a = null;
        }
    }

    /* renamed from: a */
    private static UserInfoBean m5415a(Cursor cursor) {
        if (cursor == null) {
            return null;
        }
        try {
            byte[] blob = cursor.getBlob(cursor.getColumnIndex("_dt"));
            if (blob == null) {
                return null;
            }
            long j9 = cursor.getLong(cursor.getColumnIndex("_id"));
            UserInfoBean userInfoBean = (UserInfoBean) C6678ap.m5136a(blob, UserInfoBean.CREATOR);
            if (userInfoBean == null) {
                return userInfoBean;
            }
            userInfoBean.f5590a = j9;
            return userInfoBean;
        } catch (Throwable th) {
            if (!C6674al.m5103a(th)) {
                th.printStackTrace();
            }
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public synchronized void m5423a(boolean z9) {
        C6671ai c6671aiM5067a;
        C6665ac c6665acM5031a;
        if (this.f6220d && (c6671aiM5067a = C6671ai.m5067a()) != null && (c6665acM5031a = C6665ac.m5031a()) != null && (!c6665acM5031a.m5039b() || c6671aiM5067a.m5084b(1001))) {
            String str = C6663aa.m4967a(this.f6217a).f5772d;
            ArrayList arrayList = new ArrayList();
            List<UserInfoBean> listM5416a = m5416a(str);
            boolean z10 = true;
            if (listM5416a != null) {
                m5421a(listM5416a, arrayList);
                m5428b(listM5416a, arrayList);
                int iM5414a = m5414a(listM5416a);
                if (iM5414a > 15) {
                    C6674al.m5107d("[UserInfo] Upload user info too many times in 10 min: %d", Integer.valueOf(iM5414a));
                    z10 = false;
                }
            } else {
                listM5416a = new ArrayList<>();
            }
            if (arrayList.size() > 0) {
                m5427b(arrayList);
            }
            if (z10 && listM5416a.size() != 0) {
                C6674al.m5106c("[UserInfo] Upload user info(size: %d)", Integer.valueOf(listM5416a.size()));
                m5422a(listM5416a, z9);
                return;
            }
            C6674al.m5106c("[UserInfo] There is no user info in local database.", new Object[0]);
        }
    }

    /* renamed from: a */
    public static /* synthetic */ void m5417a(UserInfoBean userInfoBean) {
        C6663aa c6663aaM4969b;
        if (userInfoBean == null || (c6663aaM4969b = C6663aa.m4969b()) == null) {
            return;
        }
        userInfoBean.f5599j = c6663aaM4969b.m4980d();
    }
}
