package com.tencent.bugly.proguard;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import androidx.lifecycle.CoroutineLiveDataKt;
import com.tencent.bugly.crashreport.biz.UserInfoBean;
import com.tencent.bugly.crashreport.common.strategy.StrategyBean;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: com.tencent.bugly.proguard.r */
/* loaded from: classes5.dex */
public final class C7832r {

    /* renamed from: e */
    private static boolean f14081e = true;

    /* renamed from: a */
    private Context f14082a;

    /* renamed from: b */
    private long f14083b;

    /* renamed from: c */
    private int f14084c;

    /* renamed from: d */
    private boolean f14085d;

    /* renamed from: com.tencent.bugly.proguard.r$a */
    public class a implements InterfaceC7775ah {

        /* renamed from: a */
        public final /* synthetic */ List f14086a;

        public a(List list) {
            this.f14086a = list;
        }

        @Override // com.tencent.bugly.proguard.InterfaceC7775ah
        /* renamed from: a */
        public final void mo10577a(boolean z10, String str) {
            if (z10) {
                C7779al.m10617c("[UserInfo] Successfully uploaded user info.", new Object[0]);
                long jCurrentTimeMillis = System.currentTimeMillis();
                for (UserInfoBean userInfoBean : this.f14086a) {
                    userInfoBean.f13460f = jCurrentTimeMillis;
                    C7832r.this.m10929a(userInfoBean, true);
                }
            }
        }
    }

    /* renamed from: com.tencent.bugly.proguard.r$b */
    public class b implements Runnable {

        /* renamed from: c */
        public final /* synthetic */ boolean f14088c = false;

        public b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                C7832r.this.m10934a(this.f14088c);
            } catch (Throwable th) {
                C7779al.m10614a(th);
            }
        }
    }

    /* renamed from: com.tencent.bugly.proguard.r$c */
    public class c implements Runnable {

        /* renamed from: c */
        public boolean f14090c;

        /* renamed from: d */
        public UserInfoBean f14091d;

        public c(UserInfoBean userInfoBean, boolean z10) {
            this.f14091d = userInfoBean;
            this.f14090c = z10;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (C7832r.this.f14085d) {
                try {
                    UserInfoBean userInfoBean = this.f14091d;
                    if (userInfoBean != null) {
                        C7832r.m10928a(userInfoBean);
                        C7779al.m10617c("[UserInfo] Record user info.", new Object[0]);
                        C7832r.this.m10929a(this.f14091d, false);
                    }
                    if (this.f14090c) {
                        C7832r.this.m10944b();
                    }
                } catch (Throwable th) {
                    if (C7779al.m10614a(th)) {
                        return;
                    }
                    th.printStackTrace();
                }
            }
        }
    }

    /* renamed from: com.tencent.bugly.proguard.r$d */
    public class d implements Runnable {
        public d() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (jCurrentTimeMillis < C7832r.this.f14083b) {
                C7778ak.m10604a().m10607a(C7832r.this.new d(), (C7832r.this.f14083b - jCurrentTimeMillis) + CoroutineLiveDataKt.DEFAULT_TIMEOUT);
            } else {
                C7832r.this.m10942a(3, false);
                C7832r.this.m10941a();
            }
        }
    }

    /* renamed from: com.tencent.bugly.proguard.r$e */
    public class e implements Runnable {

        /* renamed from: c */
        public long f14094c;

        public e(long j10) {
            this.f14094c = j10;
        }

        @Override // java.lang.Runnable
        public final void run() {
            C7832r.this.m10944b();
            C7832r.this.m10943a(this.f14094c);
        }
    }

    public C7832r(Context context, boolean z10) {
        this.f14082a = context;
        this.f14085d = z10;
    }

    /* renamed from: b */
    private static void m10939b(List<UserInfoBean> list, List<UserInfoBean> list2) {
        Iterator<UserInfoBean> it = list.iterator();
        while (it.hasNext()) {
            UserInfoBean next = it.next();
            if (next.f13460f != -1) {
                it.remove();
                if (next.f13459e < C7783ap.m10668b()) {
                    list2.add(next);
                }
            }
        }
    }

    /* renamed from: a */
    public final void m10942a(int i10, boolean z10) {
        C7770ac c7770acM10542a = C7770ac.m10542a();
        if (c7770acM10542a != null && !c7770acM10542a.m10551c().f13483g && i10 != 1 && i10 != 3) {
            C7779al.m10619e("UserInfo is disable", new Object[0]);
            return;
        }
        if (i10 == 1 || i10 == 3) {
            this.f14084c++;
        }
        C7768aa c7768aaM10478a = C7768aa.m10478a(this.f14082a);
        UserInfoBean userInfoBean = new UserInfoBean();
        userInfoBean.f13456b = i10;
        userInfoBean.f13457c = c7768aaM10478a.f13637d;
        userInfoBean.f13458d = c7768aaM10478a.m10495f();
        userInfoBean.f13459e = System.currentTimeMillis();
        userInfoBean.f13460f = -1L;
        userInfoBean.f13468n = c7768aaM10478a.f13648o;
        userInfoBean.f13469o = i10 == 1 ? 1 : 0;
        userInfoBean.f13466l = c7768aaM10478a.m10486a();
        userInfoBean.f13467m = c7768aaM10478a.f13658y;
        userInfoBean.f13461g = c7768aaM10478a.f13659z;
        userInfoBean.f13462h = c7768aaM10478a.f13585A;
        userInfoBean.f13463i = c7768aaM10478a.f13586B;
        userInfoBean.f13465k = c7768aaM10478a.f13587C;
        userInfoBean.f13472r = c7768aaM10478a.m10510t();
        userInfoBean.f13473s = c7768aaM10478a.m10515y();
        userInfoBean.f13470p = c7768aaM10478a.m10516z();
        userInfoBean.f13471q = c7768aaM10478a.f13657x;
        C7778ak.m10604a().m10607a(new c(userInfoBean, z10), 0L);
    }

    /* renamed from: b */
    public final void m10944b() {
        C7778ak c7778akM10604a = C7778ak.m10604a();
        if (c7778akM10604a != null) {
            c7778akM10604a.m10606a(new b());
        }
    }

    /* renamed from: b */
    private static void m10938b(List<UserInfoBean> list) {
        if (list.size() == 0) {
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        for (int i10 = 0; i10 < list.size() && i10 < 50; i10++) {
            UserInfoBean userInfoBean = list.get(i10);
            sb2.append(" or _id = ");
            sb2.append(userInfoBean.f13455a);
        }
        String string = sb2.toString();
        if (string.length() > 0) {
            string = string.substring(4);
        }
        sb2.setLength(0);
        try {
            C7779al.m10617c("[Database] deleted %s data %d", "t_ui", Integer.valueOf(C7837w.m10986a().m10999a("t_ui", string)));
        } catch (Throwable th) {
            if (C7779al.m10614a(th)) {
                return;
            }
            th.printStackTrace();
        }
    }

    /* renamed from: b */
    private static ContentValues m10937b(UserInfoBean userInfoBean) {
        if (userInfoBean == null) {
            return null;
        }
        try {
            ContentValues contentValues = new ContentValues();
            long j10 = userInfoBean.f13455a;
            if (j10 > 0) {
                contentValues.put("_id", Long.valueOf(j10));
            }
            contentValues.put("_tm", Long.valueOf(userInfoBean.f13459e));
            contentValues.put("_ut", Long.valueOf(userInfoBean.f13460f));
            contentValues.put("_tp", Integer.valueOf(userInfoBean.f13456b));
            contentValues.put("_pc", userInfoBean.f13457c);
            contentValues.put("_dt", C7783ap.m10665a(userInfoBean));
            return contentValues;
        } catch (Throwable th) {
            if (!C7779al.m10614a(th)) {
                th.printStackTrace();
            }
            return null;
        }
    }

    /* renamed from: a */
    public final void m10943a(long j10) {
        C7778ak.m10604a().m10607a(new e(j10), j10);
    }

    /* renamed from: a */
    public final void m10941a() {
        this.f14083b = C7783ap.m10668b() + 86400000;
        C7778ak.m10604a().m10607a(new d(), (this.f14083b - System.currentTimeMillis()) + CoroutineLiveDataKt.DEFAULT_TIMEOUT);
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0074 A[EXC_TOP_SPLITTER, PHI: r1
      0x0074: PHI (r1v2 boolean) = (r1v0 boolean), (r1v3 boolean) binds: [B:25:0x006a, B:36:0x0087] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean m10940b(boolean r14) throws java.io.IOException {
        /*
            r13 = this;
            boolean r0 = com.tencent.bugly.proguard.C7832r.f14081e
            r1 = 1
            if (r0 != 0) goto L6
            return r1
        L6:
            java.io.File r0 = new java.io.File
            android.content.Context r2 = r13.f14082a
            java.io.File r2 = r2.getFilesDir()
            java.lang.String r3 = "bugly_last_us_up_tm"
            r0.<init>(r2, r3)
            long r2 = java.lang.System.currentTimeMillis()
            r4 = 1024(0x400, double:5.06E-321)
            r6 = 0
            if (r14 == 0) goto L24
            java.lang.String r14 = java.lang.String.valueOf(r2)
            com.tencent.bugly.proguard.C7780am.m10623a(r0, r14, r4, r6)
            return r1
        L24:
            boolean r14 = r0.exists()
            if (r14 != 0) goto L32
            java.lang.String r14 = java.lang.String.valueOf(r2)
            com.tencent.bugly.proguard.C7780am.m10623a(r0, r14, r4, r6)
            goto L8a
        L32:
            java.io.BufferedReader r14 = com.tencent.bugly.proguard.C7783ap.m10645a(r0)
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
            com.tencent.bugly.proguard.C7780am.m10623a(r0, r7, r4, r6)     // Catch: java.lang.Throwable -> L69
            goto L87
        L69:
            r7 = move-exception
            com.tencent.bugly.proguard.C7779al.m10616b(r7)     // Catch: java.lang.Throwable -> L7d
            java.lang.String r2 = java.lang.String.valueOf(r2)     // Catch: java.lang.Throwable -> L7d
            com.tencent.bugly.proguard.C7780am.m10623a(r0, r2, r4, r6)     // Catch: java.lang.Throwable -> L7d
        L74:
            r14.close()     // Catch: java.lang.Exception -> L78
            goto L8a
        L78:
            r14 = move-exception
            com.tencent.bugly.proguard.C7779al.m10614a(r14)
            goto L8a
        L7d:
            r0 = move-exception
            r14.close()     // Catch: java.lang.Exception -> L82
            goto L86
        L82:
            r14 = move-exception
            com.tencent.bugly.proguard.C7779al.m10614a(r14)
        L86:
            throw r0
        L87:
            if (r14 == 0) goto L8a
            goto L74
        L8a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.bugly.proguard.C7832r.m10940b(boolean):boolean");
    }

    /* renamed from: a */
    private static void m10932a(List<UserInfoBean> list, List<UserInfoBean> list2) {
        int size = list.size() - 20;
        if (size > 0) {
            int i10 = 0;
            while (i10 < list.size() - 1) {
                int i11 = i10 + 1;
                for (int i12 = i11; i12 < list.size(); i12++) {
                    if (list.get(i10).f13459e > list.get(i12).f13459e) {
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
    private static int m10925a(List<UserInfoBean> list) {
        int i10;
        long jCurrentTimeMillis = System.currentTimeMillis();
        int i11 = 0;
        for (UserInfoBean userInfoBean : list) {
            if (userInfoBean.f13459e > jCurrentTimeMillis - 600000 && ((i10 = userInfoBean.f13456b) == 1 || i10 == 4 || i10 == 3)) {
                i11++;
            }
        }
        return i11;
    }

    /* renamed from: a */
    private void m10933a(List<UserInfoBean> list, boolean z10) {
        C7768aa c7768aaM10480b;
        if (!m10940b(z10)) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            for (UserInfoBean userInfoBean : list) {
                userInfoBean.f13460f = jCurrentTimeMillis;
                m10929a(userInfoBean, true);
            }
            C7779al.m10618d("uploadCheck failed", new Object[0]);
            return;
        }
        int i10 = this.f14084c == 1 ? 1 : 2;
        C7816bv c7816bv = null;
        if (list != null && list.size() != 0 && (c7768aaM10480b = C7768aa.m10480b()) != null) {
            c7768aaM10480b.m10505o();
            C7816bv c7816bv2 = new C7816bv();
            c7816bv2.f14034b = c7768aaM10480b.f13637d;
            c7816bv2.f14035c = c7768aaM10480b.m10497g();
            ArrayList<C7815bu> arrayList = new ArrayList<>();
            Iterator<UserInfoBean> it = list.iterator();
            while (it.hasNext()) {
                C7815bu c7815buM10558a = C7772ae.m10558a(it.next());
                if (c7815buM10558a != null) {
                    arrayList.add(c7815buM10558a);
                }
            }
            c7816bv2.f14036d = arrayList;
            HashMap map = new HashMap();
            c7816bv2.f14037e = map;
            map.put("A7", new StringBuilder().toString());
            c7816bv2.f14037e.put("A6", C7768aa.m10481n());
            c7816bv2.f14037e.put("A5", c7768aaM10480b.m10504m());
            Map<String, String> map2 = c7816bv2.f14037e;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(c7768aaM10480b.m10502k());
            map2.put("A2", sb2.toString());
            Map<String, String> map3 = c7816bv2.f14037e;
            StringBuilder sb3 = new StringBuilder();
            sb3.append(c7768aaM10480b.m10502k());
            map3.put("A1", sb3.toString());
            c7816bv2.f14037e.put("A24", c7768aaM10480b.f13644k);
            Map<String, String> map4 = c7816bv2.f14037e;
            StringBuilder sb4 = new StringBuilder();
            sb4.append(c7768aaM10480b.m10503l());
            map4.put("A17", sb4.toString());
            c7816bv2.f14037e.put("A15", c7768aaM10480b.m10507q());
            Map<String, String> map5 = c7816bv2.f14037e;
            StringBuilder sb5 = new StringBuilder();
            sb5.append(c7768aaM10480b.m10508r());
            map5.put("A13", sb5.toString());
            c7816bv2.f14037e.put("F08", c7768aaM10480b.f13589E);
            c7816bv2.f14037e.put("F09", c7768aaM10480b.f13590F);
            Map<String, String> mapM10515y = c7768aaM10480b.m10515y();
            if (mapM10515y != null && mapM10515y.size() > 0) {
                for (Map.Entry<String, String> entry : mapM10515y.entrySet()) {
                    c7816bv2.f14037e.put("C04_" + entry.getKey(), entry.getValue());
                }
            }
            if (i10 == 1) {
                c7816bv2.f14033a = (byte) 1;
            } else if (i10 != 2) {
                C7779al.m10619e("unknown up type %d ", Integer.valueOf(i10));
            } else {
                c7816bv2.f14033a = (byte) 2;
            }
            c7816bv = c7816bv2;
        }
        if (c7816bv == null) {
            C7779al.m10618d("[UserInfo] Failed to create UserInfoPackage.", new Object[0]);
            return;
        }
        byte[] bArrM10560a = C7772ae.m10560a((AbstractC7827m) c7816bv);
        if (bArrM10560a == null) {
            C7779al.m10618d("[UserInfo] Failed to encode data.", new Object[0]);
            return;
        }
        C7811bq c7811bqM10556a = C7772ae.m10556a(this.f14082a, 840, bArrM10560a);
        if (c7811bqM10556a == null) {
            C7779al.m10618d("[UserInfo] Request package is null.", new Object[0]);
            return;
        }
        C7776ai.m10578a().m10593a(1001, c7811bqM10556a, C7770ac.m10542a().m10551c().f13493q, StrategyBean.f13477a, new a(list), this.f14084c == 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m10929a(UserInfoBean userInfoBean, boolean z10) {
        List<UserInfoBean> listM10927a;
        if (userInfoBean == null) {
            return;
        }
        if (!z10 && userInfoBean.f13456b != 1 && (listM10927a = m10927a(C7768aa.m10478a(this.f14082a).f13637d)) != null && listM10927a.size() >= 20) {
            C7779al.m10613a("[UserInfo] There are too many user info in local: %d", Integer.valueOf(listM10927a.size()));
            return;
        }
        long jM11000a = C7837w.m10986a().m11000a("t_ui", m10937b(userInfoBean), (InterfaceC7836v) null);
        if (jM11000a >= 0) {
            C7779al.m10617c("[Database] insert %s success with ID: %d", "t_ui", Long.valueOf(jM11000a));
            userInfoBean.f13455a = jM11000a;
        }
    }

    /* renamed from: a */
    public static List<UserInfoBean> m10927a(String str) {
        Cursor cursorM11001a;
        String str2;
        try {
            if (C7783ap.m10676b(str)) {
                str2 = null;
            } else {
                str2 = "_pc = '" + str + "'";
            }
            cursorM11001a = C7837w.m10986a().m11001a("t_ui", (String[]) null, str2);
            if (cursorM11001a == null) {
                return null;
            }
            try {
                StringBuilder sb2 = new StringBuilder();
                ArrayList arrayList = new ArrayList();
                while (cursorM11001a.moveToNext()) {
                    UserInfoBean userInfoBeanM10926a = m10926a(cursorM11001a);
                    if (userInfoBeanM10926a != null) {
                        arrayList.add(userInfoBeanM10926a);
                    } else {
                        try {
                            long j10 = cursorM11001a.getLong(cursorM11001a.getColumnIndex("_id"));
                            sb2.append(" or _id = ");
                            sb2.append(j10);
                        } catch (Throwable unused) {
                            C7779al.m10618d("[Database] unknown id.", new Object[0]);
                        }
                    }
                }
                String string = sb2.toString();
                if (string.length() > 0) {
                    C7779al.m10618d("[Database] deleted %s error data %d", "t_ui", Integer.valueOf(C7837w.m10986a().m10999a("t_ui", string.substring(4))));
                }
                cursorM11001a.close();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                try {
                    if (!C7779al.m10614a(th)) {
                        th.printStackTrace();
                    }
                    if (cursorM11001a != null) {
                        cursorM11001a.close();
                    }
                    return null;
                } finally {
                    if (cursorM11001a != null) {
                        cursorM11001a.close();
                    }
                }
            }
        } catch (Throwable th2) {
            th = th2;
            cursorM11001a = null;
        }
    }

    /* renamed from: a */
    private static UserInfoBean m10926a(Cursor cursor) {
        if (cursor == null) {
            return null;
        }
        try {
            byte[] blob = cursor.getBlob(cursor.getColumnIndex("_dt"));
            if (blob == null) {
                return null;
            }
            long j10 = cursor.getLong(cursor.getColumnIndex("_id"));
            UserInfoBean userInfoBean = (UserInfoBean) C7783ap.m10647a(blob, UserInfoBean.CREATOR);
            if (userInfoBean == null) {
                return userInfoBean;
            }
            userInfoBean.f13455a = j10;
            return userInfoBean;
        } catch (Throwable th) {
            if (!C7779al.m10614a(th)) {
                th.printStackTrace();
            }
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public synchronized void m10934a(boolean z10) {
        C7776ai c7776aiM10578a;
        C7770ac c7770acM10542a;
        if (this.f14085d && (c7776aiM10578a = C7776ai.m10578a()) != null && (c7770acM10542a = C7770ac.m10542a()) != null && (!c7770acM10542a.m10550b() || c7776aiM10578a.m10595b(1001))) {
            String str = C7768aa.m10478a(this.f14082a).f13637d;
            ArrayList arrayList = new ArrayList();
            List<UserInfoBean> listM10927a = m10927a(str);
            boolean z11 = true;
            if (listM10927a != null) {
                m10932a(listM10927a, arrayList);
                m10939b(listM10927a, arrayList);
                int iM10925a = m10925a(listM10927a);
                if (iM10925a > 15) {
                    C7779al.m10618d("[UserInfo] Upload user info too many times in 10 min: %d", Integer.valueOf(iM10925a));
                    z11 = false;
                }
            } else {
                listM10927a = new ArrayList<>();
            }
            if (arrayList.size() > 0) {
                m10938b(arrayList);
            }
            if (z11 && listM10927a.size() != 0) {
                C7779al.m10617c("[UserInfo] Upload user info(size: %d)", Integer.valueOf(listM10927a.size()));
                m10933a(listM10927a, z10);
                return;
            }
            C7779al.m10617c("[UserInfo] There is no user info in local database.", new Object[0]);
        }
    }

    /* renamed from: a */
    public static /* synthetic */ void m10928a(UserInfoBean userInfoBean) {
        C7768aa c7768aaM10480b;
        if (userInfoBean == null || (c7768aaM10480b = C7768aa.m10480b()) == null) {
            return;
        }
        userInfoBean.f13464j = c7768aaM10480b.m10491d();
    }
}
