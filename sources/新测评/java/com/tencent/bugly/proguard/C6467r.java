package com.tencent.bugly.proguard;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import androidx.compose.material3.internal.CalendarModelKt;
import androidx.core.view.PointerIconCompat;
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
public final class C6467r {

    /* renamed from: e */
    private static boolean f5639e = true;

    /* renamed from: a */
    private Context f5640a;

    /* renamed from: b */
    private long f5641b;

    /* renamed from: c */
    private int f5642c;

    /* renamed from: d */
    private boolean f5643d;

    /* renamed from: com.tencent.bugly.proguard.r$a */
    public class a implements Runnable {

        /* renamed from: b */
        private boolean f5649b;

        /* renamed from: c */
        private UserInfoBean f5650c;

        public a(UserInfoBean userInfoBean, boolean z9) {
            this.f5650c = userInfoBean;
            this.f5649b = z9;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (C6467r.this.f5643d) {
                try {
                    UserInfoBean userInfoBean = this.f5650c;
                    if (userInfoBean != null) {
                        C6467r.m5238a(userInfoBean);
                        C6414al.m4927c("[UserInfo] Record user info.", new Object[0]);
                        C6467r.this.m5239a(this.f5650c, false);
                    }
                    if (this.f5649b) {
                        C6467r.this.m5254b();
                    }
                } catch (Throwable th) {
                    if (C6414al.m4924a(th)) {
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
            if (jCurrentTimeMillis < C6467r.this.f5641b) {
                C6413ak.m4914a().m4917a(C6467r.this.new b(), (C6467r.this.f5641b - jCurrentTimeMillis) + CoroutineLiveDataKt.DEFAULT_TIMEOUT);
            } else {
                C6467r.this.m5252a(3, false);
                C6467r.this.m5251a();
            }
        }
    }

    /* renamed from: com.tencent.bugly.proguard.r$c */
    public class c implements Runnable {

        /* renamed from: b */
        private long f5653b;

        public c(long j10) {
            this.f5653b = j10;
        }

        @Override // java.lang.Runnable
        public final void run() {
            C6467r.this.m5254b();
            C6467r.this.m5253a(this.f5653b);
        }
    }

    public C6467r(Context context, boolean z9) {
        this.f5640a = context;
        this.f5643d = z9;
    }

    /* renamed from: b */
    private static void m5249b(List<UserInfoBean> list, List<UserInfoBean> list2) {
        Iterator<UserInfoBean> it = list.iterator();
        while (it.hasNext()) {
            UserInfoBean next = it.next();
            if (next.f5018f != -1) {
                it.remove();
                if (next.f5017e < C6418ap.m4978b()) {
                    list2.add(next);
                }
            }
        }
    }

    /* renamed from: a */
    public final void m5252a(int i10, boolean z9) {
        C6405ac c6405acM4852a = C6405ac.m4852a();
        if (c6405acM4852a != null && !c6405acM4852a.m4861c().f5041g && i10 != 1 && i10 != 3) {
            C6414al.m4929e("UserInfo is disable", new Object[0]);
            return;
        }
        if (i10 == 1 || i10 == 3) {
            this.f5642c++;
        }
        C6403aa c6403aaM4788a = C6403aa.m4788a(this.f5640a);
        UserInfoBean userInfoBean = new UserInfoBean();
        userInfoBean.f5014b = i10;
        userInfoBean.f5015c = c6403aaM4788a.f5195d;
        userInfoBean.f5016d = c6403aaM4788a.m4805f();
        userInfoBean.f5017e = System.currentTimeMillis();
        userInfoBean.f5018f = -1L;
        userInfoBean.f5026n = c6403aaM4788a.f5206o;
        userInfoBean.f5027o = i10 == 1 ? 1 : 0;
        userInfoBean.f5024l = c6403aaM4788a.m4796a();
        userInfoBean.f5025m = c6403aaM4788a.f5216y;
        userInfoBean.f5019g = c6403aaM4788a.f5217z;
        userInfoBean.f5020h = c6403aaM4788a.f5143A;
        userInfoBean.f5021i = c6403aaM4788a.f5144B;
        userInfoBean.f5023k = c6403aaM4788a.f5145C;
        userInfoBean.f5030r = c6403aaM4788a.m4820t();
        userInfoBean.f5031s = c6403aaM4788a.m4825y();
        userInfoBean.f5028p = c6403aaM4788a.m4826z();
        userInfoBean.f5029q = c6403aaM4788a.f5215x;
        C6413ak.m4914a().m4917a(new a(userInfoBean, z9), 0L);
    }

    /* renamed from: b */
    public final void m5254b() {
        C6413ak c6413akM4914a = C6413ak.m4914a();
        if (c6413akM4914a != null) {
            c6413akM4914a.m4916a(new Runnable() { // from class: com.tencent.bugly.proguard.r.2

                /* renamed from: a */
                final /* synthetic */ boolean f5646a = false;

                @Override // java.lang.Runnable
                public final void run() {
                    try {
                        C6467r.this.m5244a(this.f5646a);
                    } catch (Throwable th) {
                        C6414al.m4924a(th);
                    }
                }
            });
        }
    }

    /* renamed from: b */
    private static void m5248b(List<UserInfoBean> list) {
        if (list.size() == 0) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        for (int i10 = 0; i10 < list.size() && i10 < 50; i10++) {
            UserInfoBean userInfoBean = list.get(i10);
            sb.append(" or _id = ");
            sb.append(userInfoBean.f5013a);
        }
        String string = sb.toString();
        if (string.length() > 0) {
            string = string.substring(4);
        }
        sb.setLength(0);
        try {
            C6414al.m4927c("[Database] deleted %s data %d", "t_ui", Integer.valueOf(C6472w.m5296a().m5309a("t_ui", string)));
        } catch (Throwable th) {
            if (C6414al.m4924a(th)) {
                return;
            }
            th.printStackTrace();
        }
    }

    /* renamed from: b */
    private static ContentValues m5247b(UserInfoBean userInfoBean) {
        if (userInfoBean == null) {
            return null;
        }
        try {
            ContentValues contentValues = new ContentValues();
            long j10 = userInfoBean.f5013a;
            if (j10 > 0) {
                contentValues.put("_id", Long.valueOf(j10));
            }
            contentValues.put("_tm", Long.valueOf(userInfoBean.f5017e));
            contentValues.put("_ut", Long.valueOf(userInfoBean.f5018f));
            contentValues.put("_tp", Integer.valueOf(userInfoBean.f5014b));
            contentValues.put("_pc", userInfoBean.f5015c);
            contentValues.put("_dt", C6418ap.m4975a(userInfoBean));
            return contentValues;
        } catch (Throwable th) {
            if (!C6414al.m4924a(th)) {
                th.printStackTrace();
            }
            return null;
        }
    }

    /* renamed from: a */
    public final void m5253a(long j10) {
        C6413ak.m4914a().m4917a(new c(j10), j10);
    }

    /* renamed from: a */
    public final void m5251a() {
        this.f5641b = C6418ap.m4978b() + CalendarModelKt.MillisecondsIn24Hours;
        C6413ak.m4914a().m4917a(new b(), (this.f5641b - System.currentTimeMillis()) + CoroutineLiveDataKt.DEFAULT_TIMEOUT);
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0074 A[EXC_TOP_SPLITTER, PHI: r1
      0x0074: PHI (r1v2 boolean) = (r1v0 boolean), (r1v3 boolean) binds: [B:25:0x006a, B:36:0x0087] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean m5250b(boolean r14) throws java.io.IOException {
        /*
            r13 = this;
            boolean r0 = com.tencent.bugly.proguard.C6467r.f5639e
            r1 = 1
            if (r0 != 0) goto L6
            return r1
        L6:
            java.io.File r0 = new java.io.File
            android.content.Context r2 = r13.f5640a
            java.io.File r2 = r2.getFilesDir()
            java.lang.String r3 = "bugly_last_us_up_tm"
            r0.<init>(r2, r3)
            long r2 = java.lang.System.currentTimeMillis()
            r4 = 1024(0x400, double:5.06E-321)
            r6 = 0
            if (r14 == 0) goto L24
            java.lang.String r14 = java.lang.String.valueOf(r2)
            com.tencent.bugly.proguard.C6415am.m4933a(r0, r14, r4, r6)
            return r1
        L24:
            boolean r14 = r0.exists()
            if (r14 != 0) goto L32
            java.lang.String r14 = java.lang.String.valueOf(r2)
            com.tencent.bugly.proguard.C6415am.m4933a(r0, r14, r4, r6)
            goto L8a
        L32:
            java.io.BufferedReader r14 = com.tencent.bugly.proguard.C6418ap.m4955a(r0)
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
            com.tencent.bugly.proguard.C6415am.m4933a(r0, r7, r4, r6)     // Catch: java.lang.Throwable -> L69
            goto L87
        L69:
            r7 = move-exception
            com.tencent.bugly.proguard.C6414al.m4926b(r7)     // Catch: java.lang.Throwable -> L7d
            java.lang.String r2 = java.lang.String.valueOf(r2)     // Catch: java.lang.Throwable -> L7d
            com.tencent.bugly.proguard.C6415am.m4933a(r0, r2, r4, r6)     // Catch: java.lang.Throwable -> L7d
        L74:
            r14.close()     // Catch: java.lang.Exception -> L78
            goto L8a
        L78:
            r14 = move-exception
            com.tencent.bugly.proguard.C6414al.m4924a(r14)
            goto L8a
        L7d:
            r0 = move-exception
            r14.close()     // Catch: java.lang.Exception -> L82
            goto L86
        L82:
            r14 = move-exception
            com.tencent.bugly.proguard.C6414al.m4924a(r14)
        L86:
            throw r0
        L87:
            if (r14 == 0) goto L8a
            goto L74
        L8a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.bugly.proguard.C6467r.m5250b(boolean):boolean");
    }

    /* renamed from: a */
    private static void m5242a(List<UserInfoBean> list, List<UserInfoBean> list2) {
        int size = list.size() - 20;
        if (size > 0) {
            int i10 = 0;
            while (i10 < list.size() - 1) {
                int i11 = i10 + 1;
                for (int i12 = i11; i12 < list.size(); i12++) {
                    if (list.get(i10).f5017e > list.get(i12).f5017e) {
                        UserInfoBean userInfoBean = list.get(i10);
                        list.set(i10, list.get(i12));
                        list.set(i12, userInfoBean);
                    }
                }
                i10 = i11;
            }
            for (int i13 = 0; i13 < size; i13++) {
                list2.add(list.get(i13));
            }
        }
    }

    /* renamed from: a */
    private static int m5235a(List<UserInfoBean> list) {
        int i10;
        long jCurrentTimeMillis = System.currentTimeMillis();
        int i11 = 0;
        for (UserInfoBean userInfoBean : list) {
            if (userInfoBean.f5017e > jCurrentTimeMillis - 600000 && ((i10 = userInfoBean.f5014b) == 1 || i10 == 4 || i10 == 3)) {
                i11++;
            }
        }
        return i11;
    }

    /* renamed from: a */
    private void m5243a(final List<UserInfoBean> list, boolean z9) {
        C6403aa c6403aaM4790b;
        if (!m5250b(z9)) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            for (UserInfoBean userInfoBean : list) {
                userInfoBean.f5018f = jCurrentTimeMillis;
                m5239a(userInfoBean, true);
            }
            C6414al.m4928d("uploadCheck failed", new Object[0]);
            return;
        }
        int i10 = this.f5642c == 1 ? 1 : 2;
        C6451bv c6451bv = null;
        if (list != null && list.size() != 0 && (c6403aaM4790b = C6403aa.m4790b()) != null) {
            c6403aaM4790b.m4815o();
            C6451bv c6451bv2 = new C6451bv();
            c6451bv2.f5592b = c6403aaM4790b.f5195d;
            c6451bv2.f5593c = c6403aaM4790b.m4807g();
            ArrayList<C6450bu> arrayList = new ArrayList<>();
            Iterator<UserInfoBean> it = list.iterator();
            while (it.hasNext()) {
                C6450bu c6450buM4868a = C6407ae.m4868a(it.next());
                if (c6450buM4868a != null) {
                    arrayList.add(c6450buM4868a);
                }
            }
            c6451bv2.f5594d = arrayList;
            HashMap map = new HashMap();
            c6451bv2.f5595e = map;
            map.put("A7", new StringBuilder().toString());
            c6451bv2.f5595e.put("A6", C6403aa.m4791n());
            c6451bv2.f5595e.put("A5", c6403aaM4790b.m4814m());
            Map<String, String> map2 = c6451bv2.f5595e;
            StringBuilder sb = new StringBuilder();
            sb.append(c6403aaM4790b.m4812k());
            map2.put("A2", sb.toString());
            Map<String, String> map3 = c6451bv2.f5595e;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(c6403aaM4790b.m4812k());
            map3.put("A1", sb2.toString());
            c6451bv2.f5595e.put("A24", c6403aaM4790b.f5202k);
            Map<String, String> map4 = c6451bv2.f5595e;
            StringBuilder sb3 = new StringBuilder();
            sb3.append(c6403aaM4790b.m4813l());
            map4.put("A17", sb3.toString());
            c6451bv2.f5595e.put("A15", c6403aaM4790b.m4817q());
            Map<String, String> map5 = c6451bv2.f5595e;
            StringBuilder sb4 = new StringBuilder();
            sb4.append(c6403aaM4790b.m4818r());
            map5.put("A13", sb4.toString());
            c6451bv2.f5595e.put("F08", c6403aaM4790b.f5147E);
            c6451bv2.f5595e.put("F09", c6403aaM4790b.f5148F);
            Map<String, String> mapM4825y = c6403aaM4790b.m4825y();
            if (mapM4825y != null && mapM4825y.size() > 0) {
                for (Map.Entry<String, String> entry : mapM4825y.entrySet()) {
                    c6451bv2.f5595e.put("C04_" + entry.getKey(), entry.getValue());
                }
            }
            if (i10 == 1) {
                c6451bv2.f5591a = (byte) 1;
            } else if (i10 != 2) {
                C6414al.m4929e("unknown up type %d ", Integer.valueOf(i10));
            } else {
                c6451bv2.f5591a = (byte) 2;
            }
            c6451bv = c6451bv2;
        }
        if (c6451bv == null) {
            C6414al.m4928d("[UserInfo] Failed to create UserInfoPackage.", new Object[0]);
            return;
        }
        byte[] bArrM4870a = C6407ae.m4870a((AbstractC6462m) c6451bv);
        if (bArrM4870a == null) {
            C6414al.m4928d("[UserInfo] Failed to encode data.", new Object[0]);
            return;
        }
        C6446bq c6446bqM4866a = C6407ae.m4866a(this.f5640a, 840, bArrM4870a);
        if (c6446bqM4866a == null) {
            C6414al.m4928d("[UserInfo] Request package is null.", new Object[0]);
            return;
        }
        C6411ai.m4888a().m4903a(PointerIconCompat.TYPE_CONTEXT_MENU, c6446bqM4866a, C6405ac.m4852a().m4861c().f5051q, StrategyBean.f5035a, new InterfaceC6410ah() { // from class: com.tencent.bugly.proguard.r.1
            @Override // com.tencent.bugly.proguard.InterfaceC6410ah
            /* renamed from: a */
            public final void mo4887a(boolean z10, String str) {
                if (z10) {
                    C6414al.m4927c("[UserInfo] Successfully uploaded user info.", new Object[0]);
                    long jCurrentTimeMillis2 = System.currentTimeMillis();
                    for (UserInfoBean userInfoBean2 : list) {
                        userInfoBean2.f5018f = jCurrentTimeMillis2;
                        C6467r.this.m5239a(userInfoBean2, true);
                    }
                }
            }
        }, this.f5642c == 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m5239a(UserInfoBean userInfoBean, boolean z9) {
        List<UserInfoBean> listM5237a;
        if (userInfoBean == null) {
            return;
        }
        if (!z9 && userInfoBean.f5014b != 1 && (listM5237a = m5237a(C6403aa.m4788a(this.f5640a).f5195d)) != null && listM5237a.size() >= 20) {
            C6414al.m4923a("[UserInfo] There are too many user info in local: %d", Integer.valueOf(listM5237a.size()));
            return;
        }
        long jM5310a = C6472w.m5296a().m5310a("t_ui", m5247b(userInfoBean), (InterfaceC6471v) null);
        if (jM5310a >= 0) {
            C6414al.m4927c("[Database] insert %s success with ID: %d", "t_ui", Long.valueOf(jM5310a));
            userInfoBean.f5013a = jM5310a;
        }
    }

    /* renamed from: a */
    public static List<UserInfoBean> m5237a(String str) {
        Cursor cursorM5311a;
        String str2;
        try {
            if (C6418ap.m4986b(str)) {
                str2 = null;
            } else {
                str2 = "_pc = '" + str + "'";
            }
            cursorM5311a = C6472w.m5296a().m5311a("t_ui", (String[]) null, str2);
            if (cursorM5311a == null) {
                return null;
            }
            try {
                StringBuilder sb = new StringBuilder();
                ArrayList arrayList = new ArrayList();
                while (cursorM5311a.moveToNext()) {
                    UserInfoBean userInfoBeanM5236a = m5236a(cursorM5311a);
                    if (userInfoBeanM5236a != null) {
                        arrayList.add(userInfoBeanM5236a);
                    } else {
                        try {
                            long j10 = cursorM5311a.getLong(cursorM5311a.getColumnIndex("_id"));
                            sb.append(" or _id = ");
                            sb.append(j10);
                        } catch (Throwable unused) {
                            C6414al.m4928d("[Database] unknown id.", new Object[0]);
                        }
                    }
                }
                String string = sb.toString();
                if (string.length() > 0) {
                    C6414al.m4928d("[Database] deleted %s error data %d", "t_ui", Integer.valueOf(C6472w.m5296a().m5309a("t_ui", string.substring(4))));
                }
                cursorM5311a.close();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                try {
                    if (!C6414al.m4924a(th)) {
                        th.printStackTrace();
                    }
                    if (cursorM5311a != null) {
                        cursorM5311a.close();
                    }
                    return null;
                } finally {
                    if (cursorM5311a != null) {
                        cursorM5311a.close();
                    }
                }
            }
        } catch (Throwable th2) {
            th = th2;
            cursorM5311a = null;
        }
    }

    /* renamed from: a */
    private static UserInfoBean m5236a(Cursor cursor) {
        if (cursor == null) {
            return null;
        }
        try {
            byte[] blob = cursor.getBlob(cursor.getColumnIndex("_dt"));
            if (blob == null) {
                return null;
            }
            long j10 = cursor.getLong(cursor.getColumnIndex("_id"));
            UserInfoBean userInfoBean = (UserInfoBean) C6418ap.m4957a(blob, UserInfoBean.CREATOR);
            if (userInfoBean == null) {
                return userInfoBean;
            }
            userInfoBean.f5013a = j10;
            return userInfoBean;
        } catch (Throwable th) {
            if (!C6414al.m4924a(th)) {
                th.printStackTrace();
            }
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public synchronized void m5244a(boolean z9) {
        C6411ai c6411aiM4888a;
        C6405ac c6405acM4852a;
        if (this.f5643d && (c6411aiM4888a = C6411ai.m4888a()) != null && (c6405acM4852a = C6405ac.m4852a()) != null && (!c6405acM4852a.m4860b() || c6411aiM4888a.m4905b(PointerIconCompat.TYPE_CONTEXT_MENU))) {
            String str = C6403aa.m4788a(this.f5640a).f5195d;
            ArrayList arrayList = new ArrayList();
            List<UserInfoBean> listM5237a = m5237a(str);
            boolean z10 = true;
            if (listM5237a != null) {
                m5242a(listM5237a, arrayList);
                m5249b(listM5237a, arrayList);
                int iM5235a = m5235a(listM5237a);
                if (iM5235a > 15) {
                    C6414al.m4928d("[UserInfo] Upload user info too many times in 10 min: %d", Integer.valueOf(iM5235a));
                    z10 = false;
                }
            } else {
                listM5237a = new ArrayList<>();
            }
            if (arrayList.size() > 0) {
                m5248b(arrayList);
            }
            if (z10 && listM5237a.size() != 0) {
                C6414al.m4927c("[UserInfo] Upload user info(size: %d)", Integer.valueOf(listM5237a.size()));
                m5243a(listM5237a, z9);
                return;
            }
            C6414al.m4927c("[UserInfo] There is no user info in local database.", new Object[0]);
        }
    }

    /* renamed from: a */
    public static /* synthetic */ void m5238a(UserInfoBean userInfoBean) {
        C6403aa c6403aaM4790b;
        if (userInfoBean == null || (c6403aaM4790b = C6403aa.m4790b()) == null) {
            return;
        }
        userInfoBean.f5022j = c6403aaM4790b.m4801d();
    }
}
