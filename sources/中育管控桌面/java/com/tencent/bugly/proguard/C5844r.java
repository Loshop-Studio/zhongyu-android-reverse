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
/* loaded from: classes3.dex */
public final class C5844r {

    /* renamed from: e */
    private static boolean f4360e = true;

    /* renamed from: a */
    private Context f4361a;

    /* renamed from: b */
    private long f4362b;

    /* renamed from: c */
    private int f4363c;

    /* renamed from: d */
    private boolean f4364d;

    /* renamed from: com.tencent.bugly.proguard.r$a */
    public class a implements Runnable {

        /* renamed from: b */
        private boolean f4370b;

        /* renamed from: c */
        private UserInfoBean f4371c;

        public a(UserInfoBean userInfoBean, boolean z6) {
            this.f4371c = userInfoBean;
            this.f4370b = z6;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (C5844r.this.f4364d) {
                try {
                    UserInfoBean userInfoBean = this.f4371c;
                    if (userInfoBean != null) {
                        C5844r.m4243a(userInfoBean);
                        C5791al.m3932c("[UserInfo] Record user info.", new Object[0]);
                        C5844r.this.m4244a(this.f4371c, false);
                    }
                    if (this.f4370b) {
                        C5844r.this.m4259b();
                    }
                } catch (Throwable th) {
                    if (C5791al.m3929a(th)) {
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
            if (jCurrentTimeMillis < C5844r.this.f4362b) {
                C5790ak.m3919a().m3922a(C5844r.this.new b(), (C5844r.this.f4362b - jCurrentTimeMillis) + CoroutineLiveDataKt.DEFAULT_TIMEOUT);
            } else {
                C5844r.this.m4257a(3, false);
                C5844r.this.m4256a();
            }
        }
    }

    /* renamed from: com.tencent.bugly.proguard.r$c */
    public class c implements Runnable {

        /* renamed from: b */
        private long f4374b;

        public c(long j6) {
            this.f4374b = j6;
        }

        @Override // java.lang.Runnable
        public final void run() {
            C5844r.this.m4259b();
            C5844r.this.m4258a(this.f4374b);
        }
    }

    public C5844r(Context context, boolean z6) {
        this.f4361a = context;
        this.f4364d = z6;
    }

    /* renamed from: b */
    private static void m4254b(List<UserInfoBean> list, List<UserInfoBean> list2) {
        Iterator<UserInfoBean> it = list.iterator();
        while (it.hasNext()) {
            UserInfoBean next = it.next();
            if (next.f3739f != -1) {
                it.remove();
                if (next.f3738e < C5795ap.m3983b()) {
                    list2.add(next);
                }
            }
        }
    }

    /* renamed from: a */
    public final void m4257a(int i6, boolean z6) {
        C5782ac c5782acM3857a = C5782ac.m3857a();
        if (c5782acM3857a != null && !c5782acM3857a.m3866c().f3762g && i6 != 1 && i6 != 3) {
            C5791al.m3934e("UserInfo is disable", new Object[0]);
            return;
        }
        if (i6 == 1 || i6 == 3) {
            this.f4363c++;
        }
        C5780aa c5780aaM3793a = C5780aa.m3793a(this.f4361a);
        UserInfoBean userInfoBean = new UserInfoBean();
        userInfoBean.f3735b = i6;
        userInfoBean.f3736c = c5780aaM3793a.f3916d;
        userInfoBean.f3737d = c5780aaM3793a.m3810f();
        userInfoBean.f3738e = System.currentTimeMillis();
        userInfoBean.f3739f = -1L;
        userInfoBean.f3747n = c5780aaM3793a.f3927o;
        userInfoBean.f3748o = i6 == 1 ? 1 : 0;
        userInfoBean.f3745l = c5780aaM3793a.m3801a();
        userInfoBean.f3746m = c5780aaM3793a.f3937y;
        userInfoBean.f3740g = c5780aaM3793a.f3938z;
        userInfoBean.f3741h = c5780aaM3793a.f3864A;
        userInfoBean.f3742i = c5780aaM3793a.f3865B;
        userInfoBean.f3744k = c5780aaM3793a.f3866C;
        userInfoBean.f3751r = c5780aaM3793a.m3825t();
        userInfoBean.f3752s = c5780aaM3793a.m3830y();
        userInfoBean.f3749p = c5780aaM3793a.m3831z();
        userInfoBean.f3750q = c5780aaM3793a.f3936x;
        C5790ak.m3919a().m3922a(new a(userInfoBean, z6), 0L);
    }

    /* renamed from: b */
    public final void m4259b() {
        C5790ak c5790akM3919a = C5790ak.m3919a();
        if (c5790akM3919a != null) {
            c5790akM3919a.m3921a(new Runnable() { // from class: com.tencent.bugly.proguard.r.2

                /* renamed from: a */
                final /* synthetic */ boolean f4367a = false;

                @Override // java.lang.Runnable
                public final void run() {
                    try {
                        C5844r.this.m4249a(this.f4367a);
                    } catch (Throwable th) {
                        C5791al.m3929a(th);
                    }
                }
            });
        }
    }

    /* renamed from: b */
    private static void m4253b(List<UserInfoBean> list) {
        if (list.size() == 0) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        for (int i6 = 0; i6 < list.size() && i6 < 50; i6++) {
            UserInfoBean userInfoBean = list.get(i6);
            sb.append(" or _id = ");
            sb.append(userInfoBean.f3734a);
        }
        String string = sb.toString();
        if (string.length() > 0) {
            string = string.substring(4);
        }
        sb.setLength(0);
        try {
            C5791al.m3932c("[Database] deleted %s data %d", "t_ui", Integer.valueOf(C5849w.m4301a().m4314a("t_ui", string)));
        } catch (Throwable th) {
            if (C5791al.m3929a(th)) {
                return;
            }
            th.printStackTrace();
        }
    }

    /* renamed from: b */
    private static ContentValues m4252b(UserInfoBean userInfoBean) {
        if (userInfoBean == null) {
            return null;
        }
        try {
            ContentValues contentValues = new ContentValues();
            long j6 = userInfoBean.f3734a;
            if (j6 > 0) {
                contentValues.put("_id", Long.valueOf(j6));
            }
            contentValues.put("_tm", Long.valueOf(userInfoBean.f3738e));
            contentValues.put("_ut", Long.valueOf(userInfoBean.f3739f));
            contentValues.put("_tp", Integer.valueOf(userInfoBean.f3735b));
            contentValues.put("_pc", userInfoBean.f3736c);
            contentValues.put("_dt", C5795ap.m3980a(userInfoBean));
            return contentValues;
        } catch (Throwable th) {
            if (!C5791al.m3929a(th)) {
                th.printStackTrace();
            }
            return null;
        }
    }

    /* renamed from: a */
    public final void m4258a(long j6) {
        C5790ak.m3919a().m3922a(new c(j6), j6);
    }

    /* renamed from: a */
    public final void m4256a() {
        this.f4362b = C5795ap.m3983b() + CalendarModelKt.MillisecondsIn24Hours;
        C5790ak.m3919a().m3922a(new b(), (this.f4362b - System.currentTimeMillis()) + CoroutineLiveDataKt.DEFAULT_TIMEOUT);
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0074 A[EXC_TOP_SPLITTER, PHI: r1
      0x0074: PHI (r1v2 boolean) = (r1v0 boolean), (r1v3 boolean) binds: [B:25:0x006a, B:36:0x0087] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean m4255b(boolean r14) throws java.io.IOException {
        /*
            r13 = this;
            boolean r0 = com.tencent.bugly.proguard.C5844r.f4360e
            r1 = 1
            if (r0 != 0) goto L6
            return r1
        L6:
            java.io.File r0 = new java.io.File
            android.content.Context r2 = r13.f4361a
            java.io.File r2 = r2.getFilesDir()
            java.lang.String r3 = "bugly_last_us_up_tm"
            r0.<init>(r2, r3)
            long r2 = java.lang.System.currentTimeMillis()
            r4 = 1024(0x400, double:5.06E-321)
            r6 = 0
            if (r14 == 0) goto L24
            java.lang.String r14 = java.lang.String.valueOf(r2)
            com.tencent.bugly.proguard.C5792am.m3938a(r0, r14, r4, r6)
            return r1
        L24:
            boolean r14 = r0.exists()
            if (r14 != 0) goto L32
            java.lang.String r14 = java.lang.String.valueOf(r2)
            com.tencent.bugly.proguard.C5792am.m3938a(r0, r14, r4, r6)
            goto L8a
        L32:
            java.io.BufferedReader r14 = com.tencent.bugly.proguard.C5795ap.m3960a(r0)
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
            com.tencent.bugly.proguard.C5792am.m3938a(r0, r7, r4, r6)     // Catch: java.lang.Throwable -> L69
            goto L87
        L69:
            r7 = move-exception
            com.tencent.bugly.proguard.C5791al.m3931b(r7)     // Catch: java.lang.Throwable -> L7d
            java.lang.String r2 = java.lang.String.valueOf(r2)     // Catch: java.lang.Throwable -> L7d
            com.tencent.bugly.proguard.C5792am.m3938a(r0, r2, r4, r6)     // Catch: java.lang.Throwable -> L7d
        L74:
            r14.close()     // Catch: java.lang.Exception -> L78
            goto L8a
        L78:
            r14 = move-exception
            com.tencent.bugly.proguard.C5791al.m3929a(r14)
            goto L8a
        L7d:
            r0 = move-exception
            r14.close()     // Catch: java.lang.Exception -> L82
            goto L86
        L82:
            r14 = move-exception
            com.tencent.bugly.proguard.C5791al.m3929a(r14)
        L86:
            throw r0
        L87:
            if (r14 == 0) goto L8a
            goto L74
        L8a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.bugly.proguard.C5844r.m4255b(boolean):boolean");
    }

    /* renamed from: a */
    private static void m4247a(List<UserInfoBean> list, List<UserInfoBean> list2) {
        int size = list.size() - 20;
        if (size > 0) {
            int i6 = 0;
            while (i6 < list.size() - 1) {
                int i7 = i6 + 1;
                for (int i8 = i7; i8 < list.size(); i8++) {
                    if (list.get(i6).f3738e > list.get(i8).f3738e) {
                        UserInfoBean userInfoBean = list.get(i6);
                        list.set(i6, list.get(i8));
                        list.set(i8, userInfoBean);
                    }
                }
                i6 = i7;
            }
            for (int i9 = 0; i9 < size; i9++) {
                list2.add(list.get(i9));
            }
        }
    }

    /* renamed from: a */
    private static int m4240a(List<UserInfoBean> list) {
        int i6;
        long jCurrentTimeMillis = System.currentTimeMillis();
        int i7 = 0;
        for (UserInfoBean userInfoBean : list) {
            if (userInfoBean.f3738e > jCurrentTimeMillis - 600000 && ((i6 = userInfoBean.f3735b) == 1 || i6 == 4 || i6 == 3)) {
                i7++;
            }
        }
        return i7;
    }

    /* renamed from: a */
    private void m4248a(final List<UserInfoBean> list, boolean z6) {
        C5780aa c5780aaM3795b;
        if (!m4255b(z6)) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            for (UserInfoBean userInfoBean : list) {
                userInfoBean.f3739f = jCurrentTimeMillis;
                m4244a(userInfoBean, true);
            }
            C5791al.m3933d("uploadCheck failed", new Object[0]);
            return;
        }
        int i6 = this.f4363c == 1 ? 1 : 2;
        C5828bv c5828bv = null;
        if (list != null && list.size() != 0 && (c5780aaM3795b = C5780aa.m3795b()) != null) {
            c5780aaM3795b.m3820o();
            C5828bv c5828bv2 = new C5828bv();
            c5828bv2.f4313b = c5780aaM3795b.f3916d;
            c5828bv2.f4314c = c5780aaM3795b.m3812g();
            ArrayList<C5827bu> arrayList = new ArrayList<>();
            Iterator<UserInfoBean> it = list.iterator();
            while (it.hasNext()) {
                C5827bu c5827buM3873a = C5784ae.m3873a(it.next());
                if (c5827buM3873a != null) {
                    arrayList.add(c5827buM3873a);
                }
            }
            c5828bv2.f4315d = arrayList;
            HashMap map = new HashMap();
            c5828bv2.f4316e = map;
            map.put("A7", new StringBuilder().toString());
            c5828bv2.f4316e.put("A6", C5780aa.m3796n());
            c5828bv2.f4316e.put("A5", c5780aaM3795b.m3819m());
            Map<String, String> map2 = c5828bv2.f4316e;
            StringBuilder sb = new StringBuilder();
            sb.append(c5780aaM3795b.m3817k());
            map2.put("A2", sb.toString());
            Map<String, String> map3 = c5828bv2.f4316e;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(c5780aaM3795b.m3817k());
            map3.put("A1", sb2.toString());
            c5828bv2.f4316e.put("A24", c5780aaM3795b.f3923k);
            Map<String, String> map4 = c5828bv2.f4316e;
            StringBuilder sb3 = new StringBuilder();
            sb3.append(c5780aaM3795b.m3818l());
            map4.put("A17", sb3.toString());
            c5828bv2.f4316e.put("A15", c5780aaM3795b.m3822q());
            Map<String, String> map5 = c5828bv2.f4316e;
            StringBuilder sb4 = new StringBuilder();
            sb4.append(c5780aaM3795b.m3823r());
            map5.put("A13", sb4.toString());
            c5828bv2.f4316e.put("F08", c5780aaM3795b.f3868E);
            c5828bv2.f4316e.put("F09", c5780aaM3795b.f3869F);
            Map<String, String> mapM3830y = c5780aaM3795b.m3830y();
            if (mapM3830y != null && mapM3830y.size() > 0) {
                for (Map.Entry<String, String> entry : mapM3830y.entrySet()) {
                    c5828bv2.f4316e.put("C04_" + entry.getKey(), entry.getValue());
                }
            }
            if (i6 == 1) {
                c5828bv2.f4312a = (byte) 1;
            } else if (i6 != 2) {
                C5791al.m3934e("unknown up type %d ", Integer.valueOf(i6));
            } else {
                c5828bv2.f4312a = (byte) 2;
            }
            c5828bv = c5828bv2;
        }
        if (c5828bv == null) {
            C5791al.m3933d("[UserInfo] Failed to create UserInfoPackage.", new Object[0]);
            return;
        }
        byte[] bArrM3875a = C5784ae.m3875a((AbstractC5839m) c5828bv);
        if (bArrM3875a == null) {
            C5791al.m3933d("[UserInfo] Failed to encode data.", new Object[0]);
            return;
        }
        C5823bq c5823bqM3871a = C5784ae.m3871a(this.f4361a, 840, bArrM3875a);
        if (c5823bqM3871a == null) {
            C5791al.m3933d("[UserInfo] Request package is null.", new Object[0]);
            return;
        }
        C5788ai.m3893a().m3908a(1001, c5823bqM3871a, C5782ac.m3857a().m3866c().f3772q, StrategyBean.f3756a, new InterfaceC5787ah() { // from class: com.tencent.bugly.proguard.r.1
            @Override // com.tencent.bugly.proguard.InterfaceC5787ah
            /* renamed from: a */
            public final void mo3892a(boolean z7, String str) {
                if (z7) {
                    C5791al.m3932c("[UserInfo] Successfully uploaded user info.", new Object[0]);
                    long jCurrentTimeMillis2 = System.currentTimeMillis();
                    for (UserInfoBean userInfoBean2 : list) {
                        userInfoBean2.f3739f = jCurrentTimeMillis2;
                        C5844r.this.m4244a(userInfoBean2, true);
                    }
                }
            }
        }, this.f4363c == 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m4244a(UserInfoBean userInfoBean, boolean z6) {
        List<UserInfoBean> listM4242a;
        if (userInfoBean == null) {
            return;
        }
        if (!z6 && userInfoBean.f3735b != 1 && (listM4242a = m4242a(C5780aa.m3793a(this.f4361a).f3916d)) != null && listM4242a.size() >= 20) {
            C5791al.m3928a("[UserInfo] There are too many user info in local: %d", Integer.valueOf(listM4242a.size()));
            return;
        }
        long jM4315a = C5849w.m4301a().m4315a("t_ui", m4252b(userInfoBean), (InterfaceC5848v) null);
        if (jM4315a >= 0) {
            C5791al.m3932c("[Database] insert %s success with ID: %d", "t_ui", Long.valueOf(jM4315a));
            userInfoBean.f3734a = jM4315a;
        }
    }

    /* renamed from: a */
    public static List<UserInfoBean> m4242a(String str) {
        Cursor cursorM4316a;
        String str2;
        try {
            if (C5795ap.m3991b(str)) {
                str2 = null;
            } else {
                str2 = "_pc = '" + str + "'";
            }
            cursorM4316a = C5849w.m4301a().m4316a("t_ui", (String[]) null, str2);
            if (cursorM4316a == null) {
                return null;
            }
            try {
                StringBuilder sb = new StringBuilder();
                ArrayList arrayList = new ArrayList();
                while (cursorM4316a.moveToNext()) {
                    UserInfoBean userInfoBeanM4241a = m4241a(cursorM4316a);
                    if (userInfoBeanM4241a != null) {
                        arrayList.add(userInfoBeanM4241a);
                    } else {
                        try {
                            long j6 = cursorM4316a.getLong(cursorM4316a.getColumnIndex("_id"));
                            sb.append(" or _id = ");
                            sb.append(j6);
                        } catch (Throwable unused) {
                            C5791al.m3933d("[Database] unknown id.", new Object[0]);
                        }
                    }
                }
                String string = sb.toString();
                if (string.length() > 0) {
                    C5791al.m3933d("[Database] deleted %s error data %d", "t_ui", Integer.valueOf(C5849w.m4301a().m4314a("t_ui", string.substring(4))));
                }
                cursorM4316a.close();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                try {
                    if (!C5791al.m3929a(th)) {
                        th.printStackTrace();
                    }
                    if (cursorM4316a != null) {
                        cursorM4316a.close();
                    }
                    return null;
                } finally {
                    if (cursorM4316a != null) {
                        cursorM4316a.close();
                    }
                }
            }
        } catch (Throwable th2) {
            th = th2;
            cursorM4316a = null;
        }
    }

    /* renamed from: a */
    private static UserInfoBean m4241a(Cursor cursor) {
        if (cursor == null) {
            return null;
        }
        try {
            byte[] blob = cursor.getBlob(cursor.getColumnIndex("_dt"));
            if (blob == null) {
                return null;
            }
            long j6 = cursor.getLong(cursor.getColumnIndex("_id"));
            UserInfoBean userInfoBean = (UserInfoBean) C5795ap.m3962a(blob, UserInfoBean.CREATOR);
            if (userInfoBean == null) {
                return userInfoBean;
            }
            userInfoBean.f3734a = j6;
            return userInfoBean;
        } catch (Throwable th) {
            if (!C5791al.m3929a(th)) {
                th.printStackTrace();
            }
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public synchronized void m4249a(boolean z6) {
        C5788ai c5788aiM3893a;
        C5782ac c5782acM3857a;
        if (this.f4364d && (c5788aiM3893a = C5788ai.m3893a()) != null && (c5782acM3857a = C5782ac.m3857a()) != null && (!c5782acM3857a.m3865b() || c5788aiM3893a.m3910b(1001))) {
            String str = C5780aa.m3793a(this.f4361a).f3916d;
            ArrayList arrayList = new ArrayList();
            List<UserInfoBean> listM4242a = m4242a(str);
            boolean z7 = true;
            if (listM4242a != null) {
                m4247a(listM4242a, arrayList);
                m4254b(listM4242a, arrayList);
                int iM4240a = m4240a(listM4242a);
                if (iM4240a > 15) {
                    C5791al.m3933d("[UserInfo] Upload user info too many times in 10 min: %d", Integer.valueOf(iM4240a));
                    z7 = false;
                }
            } else {
                listM4242a = new ArrayList<>();
            }
            if (arrayList.size() > 0) {
                m4253b(arrayList);
            }
            if (z7 && listM4242a.size() != 0) {
                C5791al.m3932c("[UserInfo] Upload user info(size: %d)", Integer.valueOf(listM4242a.size()));
                m4248a(listM4242a, z6);
                return;
            }
            C5791al.m3932c("[UserInfo] There is no user info in local database.", new Object[0]);
        }
    }

    /* renamed from: a */
    public static /* synthetic */ void m4243a(UserInfoBean userInfoBean) {
        C5780aa c5780aaM3795b;
        if (userInfoBean == null || (c5780aaM3795b = C5780aa.m3795b()) == null) {
            return;
        }
        userInfoBean.f3743j = c5780aaM3795b.m3806d();
    }
}
