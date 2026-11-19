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
public final class C6489r {

    /* renamed from: e */
    private static boolean f4982e = true;

    /* renamed from: a */
    private Context f4983a;

    /* renamed from: b */
    private long f4984b;

    /* renamed from: c */
    private int f4985c;

    /* renamed from: d */
    private boolean f4986d;

    /* renamed from: com.tencent.bugly.proguard.r$a */
    public class a implements Runnable {

        /* renamed from: b */
        private boolean f4992b;

        /* renamed from: c */
        private UserInfoBean f4993c;

        public a(UserInfoBean userInfoBean, boolean z10) {
            this.f4993c = userInfoBean;
            this.f4992b = z10;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (C6489r.this.f4986d) {
                try {
                    UserInfoBean userInfoBean = this.f4993c;
                    if (userInfoBean != null) {
                        C6489r.m4598a(userInfoBean);
                        C6436al.m4287c("[UserInfo] Record user info.", new Object[0]);
                        C6489r.this.m4599a(this.f4993c, false);
                    }
                    if (this.f4992b) {
                        C6489r.this.m4614b();
                    }
                } catch (Throwable th) {
                    if (C6436al.m4284a(th)) {
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
            if (jCurrentTimeMillis < C6489r.this.f4984b) {
                C6435ak.m4274a().m4277a(C6489r.this.new b(), (C6489r.this.f4984b - jCurrentTimeMillis) + CoroutineLiveDataKt.DEFAULT_TIMEOUT);
            } else {
                C6489r.this.m4612a(3, false);
                C6489r.this.m4611a();
            }
        }
    }

    /* renamed from: com.tencent.bugly.proguard.r$c */
    public class c implements Runnable {

        /* renamed from: b */
        private long f4996b;

        public c(long j10) {
            this.f4996b = j10;
        }

        @Override // java.lang.Runnable
        public final void run() {
            C6489r.this.m4614b();
            C6489r.this.m4613a(this.f4996b);
        }
    }

    public C6489r(Context context, boolean z10) {
        this.f4983a = context;
        this.f4986d = z10;
    }

    /* renamed from: b */
    private static void m4609b(List<UserInfoBean> list, List<UserInfoBean> list2) {
        Iterator<UserInfoBean> it = list.iterator();
        while (it.hasNext()) {
            UserInfoBean next = it.next();
            if (next.f4361f != -1) {
                it.remove();
                if (next.f4360e < C6440ap.m4338b()) {
                    list2.add(next);
                }
            }
        }
    }

    /* renamed from: a */
    public final void m4612a(int i10, boolean z10) {
        C6427ac c6427acM4212a = C6427ac.m4212a();
        if (c6427acM4212a != null && !c6427acM4212a.m4221c().f4384g && i10 != 1 && i10 != 3) {
            C6436al.m4289e("UserInfo is disable", new Object[0]);
            return;
        }
        if (i10 == 1 || i10 == 3) {
            this.f4985c++;
        }
        C6425aa c6425aaM4148a = C6425aa.m4148a(this.f4983a);
        UserInfoBean userInfoBean = new UserInfoBean();
        userInfoBean.f4357b = i10;
        userInfoBean.f4358c = c6425aaM4148a.f4538d;
        userInfoBean.f4359d = c6425aaM4148a.m4165f();
        userInfoBean.f4360e = System.currentTimeMillis();
        userInfoBean.f4361f = -1L;
        userInfoBean.f4369n = c6425aaM4148a.f4549o;
        userInfoBean.f4370o = i10 == 1 ? 1 : 0;
        userInfoBean.f4367l = c6425aaM4148a.m4156a();
        userInfoBean.f4368m = c6425aaM4148a.f4559y;
        userInfoBean.f4362g = c6425aaM4148a.f4560z;
        userInfoBean.f4363h = c6425aaM4148a.f4486A;
        userInfoBean.f4364i = c6425aaM4148a.f4487B;
        userInfoBean.f4366k = c6425aaM4148a.f4488C;
        userInfoBean.f4373r = c6425aaM4148a.m4180t();
        userInfoBean.f4374s = c6425aaM4148a.m4185y();
        userInfoBean.f4371p = c6425aaM4148a.m4186z();
        userInfoBean.f4372q = c6425aaM4148a.f4558x;
        C6435ak.m4274a().m4277a(new a(userInfoBean, z10), 0L);
    }

    /* renamed from: b */
    public final void m4614b() {
        C6435ak c6435akM4274a = C6435ak.m4274a();
        if (c6435akM4274a != null) {
            c6435akM4274a.m4276a(new Runnable() { // from class: com.tencent.bugly.proguard.r.2

                /* renamed from: a */
                final /* synthetic */ boolean f4989a = false;

                @Override // java.lang.Runnable
                public final void run() {
                    try {
                        C6489r.this.m4604a(this.f4989a);
                    } catch (Throwable th) {
                        C6436al.m4284a(th);
                    }
                }
            });
        }
    }

    /* renamed from: b */
    private static void m4608b(List<UserInfoBean> list) {
        if (list.size() == 0) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        for (int i10 = 0; i10 < list.size() && i10 < 50; i10++) {
            UserInfoBean userInfoBean = list.get(i10);
            sb.append(" or _id = ");
            sb.append(userInfoBean.f4356a);
        }
        String string = sb.toString();
        if (string.length() > 0) {
            string = string.substring(4);
        }
        sb.setLength(0);
        try {
            C6436al.m4287c("[Database] deleted %s data %d", "t_ui", Integer.valueOf(C6494w.m4656a().m4669a("t_ui", string)));
        } catch (Throwable th) {
            if (C6436al.m4284a(th)) {
                return;
            }
            th.printStackTrace();
        }
    }

    /* renamed from: b */
    private static ContentValues m4607b(UserInfoBean userInfoBean) {
        if (userInfoBean == null) {
            return null;
        }
        try {
            ContentValues contentValues = new ContentValues();
            long j10 = userInfoBean.f4356a;
            if (j10 > 0) {
                contentValues.put("_id", Long.valueOf(j10));
            }
            contentValues.put("_tm", Long.valueOf(userInfoBean.f4360e));
            contentValues.put("_ut", Long.valueOf(userInfoBean.f4361f));
            contentValues.put("_tp", Integer.valueOf(userInfoBean.f4357b));
            contentValues.put("_pc", userInfoBean.f4358c);
            contentValues.put("_dt", C6440ap.m4335a(userInfoBean));
            return contentValues;
        } catch (Throwable th) {
            if (!C6436al.m4284a(th)) {
                th.printStackTrace();
            }
            return null;
        }
    }

    /* renamed from: a */
    public final void m4613a(long j10) {
        C6435ak.m4274a().m4277a(new c(j10), j10);
    }

    /* renamed from: a */
    public final void m4611a() {
        this.f4984b = C6440ap.m4338b() + CalendarModelKt.MillisecondsIn24Hours;
        C6435ak.m4274a().m4277a(new b(), (this.f4984b - System.currentTimeMillis()) + CoroutineLiveDataKt.DEFAULT_TIMEOUT);
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0074 A[EXC_TOP_SPLITTER, PHI: r1
      0x0074: PHI (r1v2 boolean) = (r1v0 boolean), (r1v3 boolean) binds: [B:25:0x006a, B:36:0x0087] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean m4610b(boolean r14) throws java.io.IOException {
        /*
            r13 = this;
            boolean r0 = com.tencent.bugly.proguard.C6489r.f4982e
            r1 = 1
            if (r0 != 0) goto L6
            return r1
        L6:
            java.io.File r0 = new java.io.File
            android.content.Context r2 = r13.f4983a
            java.io.File r2 = r2.getFilesDir()
            java.lang.String r3 = "bugly_last_us_up_tm"
            r0.<init>(r2, r3)
            long r2 = java.lang.System.currentTimeMillis()
            r4 = 1024(0x400, double:5.06E-321)
            r6 = 0
            if (r14 == 0) goto L24
            java.lang.String r14 = java.lang.String.valueOf(r2)
            com.tencent.bugly.proguard.C6437am.m4293a(r0, r14, r4, r6)
            return r1
        L24:
            boolean r14 = r0.exists()
            if (r14 != 0) goto L32
            java.lang.String r14 = java.lang.String.valueOf(r2)
            com.tencent.bugly.proguard.C6437am.m4293a(r0, r14, r4, r6)
            goto L8a
        L32:
            java.io.BufferedReader r14 = com.tencent.bugly.proguard.C6440ap.m4315a(r0)
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
            com.tencent.bugly.proguard.C6437am.m4293a(r0, r7, r4, r6)     // Catch: java.lang.Throwable -> L69
            goto L87
        L69:
            r7 = move-exception
            com.tencent.bugly.proguard.C6436al.m4286b(r7)     // Catch: java.lang.Throwable -> L7d
            java.lang.String r2 = java.lang.String.valueOf(r2)     // Catch: java.lang.Throwable -> L7d
            com.tencent.bugly.proguard.C6437am.m4293a(r0, r2, r4, r6)     // Catch: java.lang.Throwable -> L7d
        L74:
            r14.close()     // Catch: java.lang.Exception -> L78
            goto L8a
        L78:
            r14 = move-exception
            com.tencent.bugly.proguard.C6436al.m4284a(r14)
            goto L8a
        L7d:
            r0 = move-exception
            r14.close()     // Catch: java.lang.Exception -> L82
            goto L86
        L82:
            r14 = move-exception
            com.tencent.bugly.proguard.C6436al.m4284a(r14)
        L86:
            throw r0
        L87:
            if (r14 == 0) goto L8a
            goto L74
        L8a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.bugly.proguard.C6489r.m4610b(boolean):boolean");
    }

    /* renamed from: a */
    private static void m4602a(List<UserInfoBean> list, List<UserInfoBean> list2) {
        int size = list.size() - 20;
        if (size > 0) {
            int i10 = 0;
            while (i10 < list.size() - 1) {
                int i11 = i10 + 1;
                for (int i12 = i11; i12 < list.size(); i12++) {
                    if (list.get(i10).f4360e > list.get(i12).f4360e) {
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
    private static int m4595a(List<UserInfoBean> list) {
        int i10;
        long jCurrentTimeMillis = System.currentTimeMillis();
        int i11 = 0;
        for (UserInfoBean userInfoBean : list) {
            if (userInfoBean.f4360e > jCurrentTimeMillis - 600000 && ((i10 = userInfoBean.f4357b) == 1 || i10 == 4 || i10 == 3)) {
                i11++;
            }
        }
        return i11;
    }

    /* renamed from: a */
    private void m4603a(final List<UserInfoBean> list, boolean z10) {
        C6425aa c6425aaM4150b;
        if (!m4610b(z10)) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            for (UserInfoBean userInfoBean : list) {
                userInfoBean.f4361f = jCurrentTimeMillis;
                m4599a(userInfoBean, true);
            }
            C6436al.m4288d("uploadCheck failed", new Object[0]);
            return;
        }
        int i10 = this.f4985c == 1 ? 1 : 2;
        C6473bv c6473bv = null;
        if (list != null && list.size() != 0 && (c6425aaM4150b = C6425aa.m4150b()) != null) {
            c6425aaM4150b.m4175o();
            C6473bv c6473bv2 = new C6473bv();
            c6473bv2.f4935b = c6425aaM4150b.f4538d;
            c6473bv2.f4936c = c6425aaM4150b.m4167g();
            ArrayList<C6472bu> arrayList = new ArrayList<>();
            Iterator<UserInfoBean> it = list.iterator();
            while (it.hasNext()) {
                C6472bu c6472buM4228a = C6429ae.m4228a(it.next());
                if (c6472buM4228a != null) {
                    arrayList.add(c6472buM4228a);
                }
            }
            c6473bv2.f4937d = arrayList;
            HashMap map = new HashMap();
            c6473bv2.f4938e = map;
            map.put("A7", new StringBuilder().toString());
            c6473bv2.f4938e.put("A6", C6425aa.m4151n());
            c6473bv2.f4938e.put("A5", c6425aaM4150b.m4174m());
            Map<String, String> map2 = c6473bv2.f4938e;
            StringBuilder sb = new StringBuilder();
            sb.append(c6425aaM4150b.m4172k());
            map2.put("A2", sb.toString());
            Map<String, String> map3 = c6473bv2.f4938e;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(c6425aaM4150b.m4172k());
            map3.put("A1", sb2.toString());
            c6473bv2.f4938e.put("A24", c6425aaM4150b.f4545k);
            Map<String, String> map4 = c6473bv2.f4938e;
            StringBuilder sb3 = new StringBuilder();
            sb3.append(c6425aaM4150b.m4173l());
            map4.put("A17", sb3.toString());
            c6473bv2.f4938e.put("A15", c6425aaM4150b.m4177q());
            Map<String, String> map5 = c6473bv2.f4938e;
            StringBuilder sb4 = new StringBuilder();
            sb4.append(c6425aaM4150b.m4178r());
            map5.put("A13", sb4.toString());
            c6473bv2.f4938e.put("F08", c6425aaM4150b.f4490E);
            c6473bv2.f4938e.put("F09", c6425aaM4150b.f4491F);
            Map<String, String> mapM4185y = c6425aaM4150b.m4185y();
            if (mapM4185y != null && mapM4185y.size() > 0) {
                for (Map.Entry<String, String> entry : mapM4185y.entrySet()) {
                    c6473bv2.f4938e.put("C04_" + entry.getKey(), entry.getValue());
                }
            }
            if (i10 == 1) {
                c6473bv2.f4934a = (byte) 1;
            } else if (i10 != 2) {
                C6436al.m4289e("unknown up type %d ", Integer.valueOf(i10));
            } else {
                c6473bv2.f4934a = (byte) 2;
            }
            c6473bv = c6473bv2;
        }
        if (c6473bv == null) {
            C6436al.m4288d("[UserInfo] Failed to create UserInfoPackage.", new Object[0]);
            return;
        }
        byte[] bArrM4230a = C6429ae.m4230a((AbstractC6484m) c6473bv);
        if (bArrM4230a == null) {
            C6436al.m4288d("[UserInfo] Failed to encode data.", new Object[0]);
            return;
        }
        C6468bq c6468bqM4226a = C6429ae.m4226a(this.f4983a, 840, bArrM4230a);
        if (c6468bqM4226a == null) {
            C6436al.m4288d("[UserInfo] Request package is null.", new Object[0]);
            return;
        }
        C6433ai.m4248a().m4263a(1001, c6468bqM4226a, C6427ac.m4212a().m4221c().f4394q, StrategyBean.f4378a, new InterfaceC6432ah() { // from class: com.tencent.bugly.proguard.r.1
            @Override // com.tencent.bugly.proguard.InterfaceC6432ah
            /* renamed from: a */
            public final void mo4247a(boolean z11, String str) {
                if (z11) {
                    C6436al.m4287c("[UserInfo] Successfully uploaded user info.", new Object[0]);
                    long jCurrentTimeMillis2 = System.currentTimeMillis();
                    for (UserInfoBean userInfoBean2 : list) {
                        userInfoBean2.f4361f = jCurrentTimeMillis2;
                        C6489r.this.m4599a(userInfoBean2, true);
                    }
                }
            }
        }, this.f4985c == 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m4599a(UserInfoBean userInfoBean, boolean z10) {
        List<UserInfoBean> listM4597a;
        if (userInfoBean == null) {
            return;
        }
        if (!z10 && userInfoBean.f4357b != 1 && (listM4597a = m4597a(C6425aa.m4148a(this.f4983a).f4538d)) != null && listM4597a.size() >= 20) {
            C6436al.m4283a("[UserInfo] There are too many user info in local: %d", Integer.valueOf(listM4597a.size()));
            return;
        }
        long jM4670a = C6494w.m4656a().m4670a("t_ui", m4607b(userInfoBean), (InterfaceC6493v) null);
        if (jM4670a >= 0) {
            C6436al.m4287c("[Database] insert %s success with ID: %d", "t_ui", Long.valueOf(jM4670a));
            userInfoBean.f4356a = jM4670a;
        }
    }

    /* renamed from: a */
    public static List<UserInfoBean> m4597a(String str) {
        Cursor cursorM4671a;
        String str2;
        try {
            if (C6440ap.m4346b(str)) {
                str2 = null;
            } else {
                str2 = "_pc = '" + str + "'";
            }
            cursorM4671a = C6494w.m4656a().m4671a("t_ui", (String[]) null, str2);
            if (cursorM4671a == null) {
                return null;
            }
            try {
                StringBuilder sb = new StringBuilder();
                ArrayList arrayList = new ArrayList();
                while (cursorM4671a.moveToNext()) {
                    UserInfoBean userInfoBeanM4596a = m4596a(cursorM4671a);
                    if (userInfoBeanM4596a != null) {
                        arrayList.add(userInfoBeanM4596a);
                    } else {
                        try {
                            long j10 = cursorM4671a.getLong(cursorM4671a.getColumnIndex("_id"));
                            sb.append(" or _id = ");
                            sb.append(j10);
                        } catch (Throwable unused) {
                            C6436al.m4288d("[Database] unknown id.", new Object[0]);
                        }
                    }
                }
                String string = sb.toString();
                if (string.length() > 0) {
                    C6436al.m4288d("[Database] deleted %s error data %d", "t_ui", Integer.valueOf(C6494w.m4656a().m4669a("t_ui", string.substring(4))));
                }
                cursorM4671a.close();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                try {
                    if (!C6436al.m4284a(th)) {
                        th.printStackTrace();
                    }
                    if (cursorM4671a != null) {
                        cursorM4671a.close();
                    }
                    return null;
                } finally {
                    if (cursorM4671a != null) {
                        cursorM4671a.close();
                    }
                }
            }
        } catch (Throwable th2) {
            th = th2;
            cursorM4671a = null;
        }
    }

    /* renamed from: a */
    private static UserInfoBean m4596a(Cursor cursor) {
        if (cursor == null) {
            return null;
        }
        try {
            byte[] blob = cursor.getBlob(cursor.getColumnIndex("_dt"));
            if (blob == null) {
                return null;
            }
            long j10 = cursor.getLong(cursor.getColumnIndex("_id"));
            UserInfoBean userInfoBean = (UserInfoBean) C6440ap.m4317a(blob, UserInfoBean.CREATOR);
            if (userInfoBean == null) {
                return userInfoBean;
            }
            userInfoBean.f4356a = j10;
            return userInfoBean;
        } catch (Throwable th) {
            if (!C6436al.m4284a(th)) {
                th.printStackTrace();
            }
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public synchronized void m4604a(boolean z10) {
        C6433ai c6433aiM4248a;
        C6427ac c6427acM4212a;
        if (this.f4986d && (c6433aiM4248a = C6433ai.m4248a()) != null && (c6427acM4212a = C6427ac.m4212a()) != null && (!c6427acM4212a.m4220b() || c6433aiM4248a.m4265b(1001))) {
            String str = C6425aa.m4148a(this.f4983a).f4538d;
            ArrayList arrayList = new ArrayList();
            List<UserInfoBean> listM4597a = m4597a(str);
            boolean z11 = true;
            if (listM4597a != null) {
                m4602a(listM4597a, arrayList);
                m4609b(listM4597a, arrayList);
                int iM4595a = m4595a(listM4597a);
                if (iM4595a > 15) {
                    C6436al.m4288d("[UserInfo] Upload user info too many times in 10 min: %d", Integer.valueOf(iM4595a));
                    z11 = false;
                }
            } else {
                listM4597a = new ArrayList<>();
            }
            if (arrayList.size() > 0) {
                m4608b(arrayList);
            }
            if (z11 && listM4597a.size() != 0) {
                C6436al.m4287c("[UserInfo] Upload user info(size: %d)", Integer.valueOf(listM4597a.size()));
                m4603a(listM4597a, z10);
                return;
            }
            C6436al.m4287c("[UserInfo] There is no user info in local database.", new Object[0]);
        }
    }

    /* renamed from: a */
    public static /* synthetic */ void m4598a(UserInfoBean userInfoBean) {
        C6425aa c6425aaM4150b;
        if (userInfoBean == null || (c6425aaM4150b = C6425aa.m4150b()) == null) {
            return;
        }
        userInfoBean.f4365j = c6425aaM4150b.m4161d();
    }
}
