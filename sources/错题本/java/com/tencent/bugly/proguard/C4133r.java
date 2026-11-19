package com.tencent.bugly.proguard;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.support.v4.media.C0039h;
import android.view.CoroutineLiveDataKt;
import androidx.compose.material3.internal.CalendarModelKt;
import androidx.core.view.PointerIconCompat;
import com.tencent.bugly.crashreport.biz.UserInfoBean;
import com.tencent.bugly.crashreport.common.strategy.StrategyBean;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: com.tencent.bugly.proguard.r */
/* loaded from: classes3.dex */
public final class C4133r {

    /* renamed from: e */
    private static boolean f3871e = true;

    /* renamed from: a */
    private Context f3872a;

    /* renamed from: b */
    private long f3873b;

    /* renamed from: c */
    private int f3874c;

    /* renamed from: d */
    private boolean f3875d;

    public C4133r(Context context, boolean z8) {
        this.f3872a = context;
        this.f3875d = z8;
    }

    /* renamed from: b */
    private static void m3346b(List<UserInfoBean> list, List<UserInfoBean> list2) {
        Iterator<UserInfoBean> it = list.iterator();
        while (it.hasNext()) {
            UserInfoBean next = it.next();
            if (next.f3252f != -1) {
                it.remove();
                if (next.f3251e < C4059ap.m3076b()) {
                    list2.add(next);
                }
            }
        }
    }

    /* renamed from: a */
    public final void m3349a(int i, boolean z8) {
        C4046ac c4046acM2951a = C4046ac.m2951a();
        if (c4046acM2951a != null && !c4046acM2951a.m2960c().f3275g && i != 1 && i != 3) {
            C4055al.m3027e("UserInfo is disable", new Object[0]);
            return;
        }
        if (i == 1 || i == 3) {
            this.f3874c++;
        }
        C4044aa c4044aaM2888a = C4044aa.m2888a(this.f3872a);
        UserInfoBean userInfoBean = new UserInfoBean();
        userInfoBean.f3248b = i;
        userInfoBean.f3249c = c4044aaM2888a.f3434d;
        userInfoBean.f3250d = c4044aaM2888a.m2905f();
        userInfoBean.f3251e = System.currentTimeMillis();
        userInfoBean.f3252f = -1L;
        userInfoBean.f3260n = c4044aaM2888a.f3445o;
        userInfoBean.f3261o = i == 1 ? 1 : 0;
        userInfoBean.f3258l = c4044aaM2888a.m2896a();
        userInfoBean.f3259m = c4044aaM2888a.f3455y;
        userInfoBean.f3253g = c4044aaM2888a.f3456z;
        userInfoBean.f3254h = c4044aaM2888a.f3382A;
        userInfoBean.f3255i = c4044aaM2888a.f3383B;
        userInfoBean.f3257k = c4044aaM2888a.f3384C;
        userInfoBean.f3264r = c4044aaM2888a.m2920t();
        userInfoBean.f3265s = c4044aaM2888a.m2925y();
        userInfoBean.f3262p = c4044aaM2888a.m2926z();
        userInfoBean.f3263q = c4044aaM2888a.f3454x;
        C4054ak.m3012a().m3015a(new RunnableC4106f1(this, userInfoBean, z8), 0L);
    }

    /* renamed from: b */
    public final void m3351b() {
        C4054ak c4054akM3012a = C4054ak.m3012a();
        if (c4054akM3012a != null) {
            c4054akM3012a.m3014a(new RunnableC4103e1(this, 0));
        }
    }

    /* renamed from: b */
    private static void m3345b(List<UserInfoBean> list) {
        if (list.size() == 0) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < list.size() && i < 50; i++) {
            UserInfoBean userInfoBean = list.get(i);
            sb.append(" or _id = ");
            sb.append(userInfoBean.f3247a);
        }
        String string = sb.toString();
        if (string.length() > 0) {
            string = string.substring(4);
        }
        sb.setLength(0);
        try {
            C4055al.m3025c("[Database] deleted %s data %d", "t_ui", Integer.valueOf(C4143w.m3393a().m3406a("t_ui", string)));
        } catch (Throwable th) {
            if (C4055al.m3022a(th)) {
                return;
            }
            th.printStackTrace();
        }
    }

    /* renamed from: b */
    private static ContentValues m3344b(UserInfoBean userInfoBean) {
        if (userInfoBean == null) {
            return null;
        }
        try {
            ContentValues contentValues = new ContentValues();
            long j7 = userInfoBean.f3247a;
            if (j7 > 0) {
                contentValues.put("_id", Long.valueOf(j7));
            }
            contentValues.put("_tm", Long.valueOf(userInfoBean.f3251e));
            contentValues.put("_ut", Long.valueOf(userInfoBean.f3252f));
            contentValues.put("_tp", Integer.valueOf(userInfoBean.f3248b));
            contentValues.put("_pc", userInfoBean.f3249c);
            contentValues.put("_dt", C4059ap.m3073a(userInfoBean));
            return contentValues;
        } catch (Throwable th) {
            if (!C4055al.m3022a(th)) {
                th.printStackTrace();
            }
            return null;
        }
    }

    /* renamed from: a */
    public final void m3350a(long j7) {
        C4054ak.m3012a().m3015a(new RunnableC4109g1(this, j7), j7);
    }

    /* renamed from: a */
    public final void m3348a() {
        this.f3873b = C4059ap.m3076b() + CalendarModelKt.MillisecondsIn24Hours;
        C4054ak.m3012a().m3015a(new RunnableC4103e1(this, 1), (this.f3873b - System.currentTimeMillis()) + CoroutineLiveDataKt.DEFAULT_TIMEOUT);
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0074 A[EXC_TOP_SPLITTER, PHI: r1
      0x0074: PHI (r1v2 boolean) = (r1v0 boolean), (r1v3 boolean) binds: [B:25:0x006a, B:36:0x0087] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean m3347b(boolean r14) throws java.io.IOException {
        /*
            r13 = this;
            boolean r0 = com.tencent.bugly.proguard.C4133r.f3871e
            r1 = 1
            if (r0 != 0) goto L6
            return r1
        L6:
            java.io.File r0 = new java.io.File
            android.content.Context r2 = r13.f3872a
            java.io.File r2 = r2.getFilesDir()
            java.lang.String r3 = "bugly_last_us_up_tm"
            r0.<init>(r2, r3)
            long r2 = java.lang.System.currentTimeMillis()
            r4 = 1024(0x400, double:5.06E-321)
            r6 = 0
            if (r14 == 0) goto L24
            java.lang.String r14 = java.lang.String.valueOf(r2)
            com.tencent.bugly.proguard.C4056am.m3031a(r0, r14, r4, r6)
            return r1
        L24:
            boolean r14 = r0.exists()
            if (r14 != 0) goto L32
            java.lang.String r14 = java.lang.String.valueOf(r2)
            com.tencent.bugly.proguard.C4056am.m3031a(r0, r14, r4, r6)
            goto L8a
        L32:
            java.io.BufferedReader r14 = com.tencent.bugly.proguard.C4059ap.m3053a(r0)
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
            com.tencent.bugly.proguard.C4056am.m3031a(r0, r7, r4, r6)     // Catch: java.lang.Throwable -> L69
            goto L87
        L69:
            r7 = move-exception
            com.tencent.bugly.proguard.C4055al.m3024b(r7)     // Catch: java.lang.Throwable -> L7d
            java.lang.String r2 = java.lang.String.valueOf(r2)     // Catch: java.lang.Throwable -> L7d
            com.tencent.bugly.proguard.C4056am.m3031a(r0, r2, r4, r6)     // Catch: java.lang.Throwable -> L7d
        L74:
            r14.close()     // Catch: java.lang.Exception -> L78
            goto L8a
        L78:
            r14 = move-exception
            com.tencent.bugly.proguard.C4055al.m3022a(r14)
            goto L8a
        L7d:
            r0 = move-exception
            r14.close()     // Catch: java.lang.Exception -> L82
            goto L86
        L82:
            r14 = move-exception
            com.tencent.bugly.proguard.C4055al.m3022a(r14)
        L86:
            throw r0
        L87:
            if (r14 == 0) goto L8a
            goto L74
        L8a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.bugly.proguard.C4133r.m3347b(boolean):boolean");
    }

    /* renamed from: a */
    private static void m3339a(List<UserInfoBean> list, List<UserInfoBean> list2) {
        int size = list.size() - 20;
        if (size > 0) {
            int i = 0;
            while (i < list.size() - 1) {
                int i8 = i + 1;
                for (int i9 = i8; i9 < list.size(); i9++) {
                    if (list.get(i).f3251e > list.get(i9).f3251e) {
                        UserInfoBean userInfoBean = list.get(i);
                        list.set(i, list.get(i9));
                        list.set(i9, userInfoBean);
                    }
                }
                i = i8;
            }
            for (int i10 = 0; i10 < size; i10++) {
                list2.add(list.get(i10));
            }
        }
    }

    /* renamed from: a */
    private static int m3332a(List<UserInfoBean> list) {
        int i;
        long jCurrentTimeMillis = System.currentTimeMillis();
        int i8 = 0;
        for (UserInfoBean userInfoBean : list) {
            if (userInfoBean.f3251e > jCurrentTimeMillis - 600000 && ((i = userInfoBean.f3248b) == 1 || i == 4 || i == 3)) {
                i8++;
            }
        }
        return i8;
    }

    /* renamed from: a */
    private void m3340a(List<UserInfoBean> list, boolean z8) {
        C4044aa c4044aaM2890b;
        if (!m3347b(z8)) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            for (UserInfoBean userInfoBean : list) {
                userInfoBean.f3252f = jCurrentTimeMillis;
                m3336a(userInfoBean, true);
            }
            C4055al.m3026d("uploadCheck failed", new Object[0]);
            return;
        }
        int i = this.f3874c == 1 ? 1 : 2;
        C4094bv c4094bv = null;
        if (list != null && list.size() != 0 && (c4044aaM2890b = C4044aa.m2890b()) != null) {
            c4044aaM2890b.m2915o();
            C4094bv c4094bv2 = new C4094bv();
            c4094bv2.f3794b = c4044aaM2890b.f3434d;
            c4094bv2.f3795c = c4044aaM2890b.m2907g();
            ArrayList<C4093bu> arrayList = new ArrayList<>();
            Iterator<UserInfoBean> it = list.iterator();
            while (it.hasNext()) {
                C4093bu c4093buM2967a = C4048ae.m2967a(it.next());
                if (c4093buM2967a != null) {
                    arrayList.add(c4093buM2967a);
                }
            }
            c4094bv2.f3796d = arrayList;
            HashMap map = new HashMap();
            c4094bv2.f3797e = map;
            map.put("A7", "");
            c4094bv2.f3797e.put("A6", C4044aa.m2891n());
            c4094bv2.f3797e.put("A5", c4044aaM2890b.m2914m());
            Map<String, String> map2 = c4094bv2.f3797e;
            StringBuilder sb = new StringBuilder();
            sb.append(c4044aaM2890b.m2912k());
            map2.put("A2", sb.toString());
            Map<String, String> map3 = c4094bv2.f3797e;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(c4044aaM2890b.m2912k());
            map3.put("A1", sb2.toString());
            c4094bv2.f3797e.put("A24", c4044aaM2890b.f3441k);
            Map<String, String> map4 = c4094bv2.f3797e;
            StringBuilder sb3 = new StringBuilder();
            sb3.append(c4044aaM2890b.m2913l());
            map4.put("A17", sb3.toString());
            c4094bv2.f3797e.put("A15", c4044aaM2890b.m2917q());
            Map<String, String> map5 = c4094bv2.f3797e;
            StringBuilder sb4 = new StringBuilder();
            sb4.append(c4044aaM2890b.m2918r());
            map5.put("A13", sb4.toString());
            c4094bv2.f3797e.put("F08", c4044aaM2890b.f3386E);
            c4094bv2.f3797e.put("F09", c4044aaM2890b.f3387F);
            Map<String, String> mapM2925y = c4044aaM2890b.m2925y();
            if (mapM2925y != null && mapM2925y.size() > 0) {
                for (Map.Entry<String, String> entry : mapM2925y.entrySet()) {
                    c4094bv2.f3797e.put("C04_" + entry.getKey(), entry.getValue());
                }
            }
            if (i == 1) {
                c4094bv2.f3793a = (byte) 1;
            } else if (i != 2) {
                C4055al.m3027e("unknown up type %d ", Integer.valueOf(i));
            } else {
                c4094bv2.f3793a = (byte) 2;
            }
            c4094bv = c4094bv2;
        }
        if (c4094bv == null) {
            C4055al.m3026d("[UserInfo] Failed to create UserInfoPackage.", new Object[0]);
            return;
        }
        byte[] bArrM2969a = C4048ae.m2969a((AbstractC4123m) c4094bv);
        if (bArrM2969a == null) {
            C4055al.m3026d("[UserInfo] Failed to encode data.", new Object[0]);
            return;
        }
        C4089bq c4089bqM2965a = C4048ae.m2965a(this.f3872a, 840, bArrM2969a);
        if (c4089bqM2965a == null) {
            C4055al.m3026d("[UserInfo] Request package is null.", new Object[0]);
            return;
        }
        C4052ai.m2986a().m3001a(PointerIconCompat.TYPE_CONTEXT_MENU, c4089bqM2965a, C4046ac.m2951a().m2960c().f3285q, StrategyBean.f3269a, new C0039h(9, this, list), this.f3874c == 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m3336a(UserInfoBean userInfoBean, boolean z8) {
        List<UserInfoBean> listM3334a;
        if (userInfoBean == null) {
            return;
        }
        if (!z8 && userInfoBean.f3248b != 1 && (listM3334a = m3334a(C4044aa.m2888a(this.f3872a).f3434d)) != null && listM3334a.size() >= 20) {
            C4055al.m3021a("[UserInfo] There are too many user info in local: %d", Integer.valueOf(listM3334a.size()));
            return;
        }
        long jM3407a = C4143w.m3393a().m3407a("t_ui", m3344b(userInfoBean), (InterfaceC4141v) null);
        if (jM3407a >= 0) {
            C4055al.m3025c("[Database] insert %s success with ID: %d", "t_ui", Long.valueOf(jM3407a));
            userInfoBean.f3247a = jM3407a;
        }
    }

    /* renamed from: a */
    public static List<UserInfoBean> m3334a(String str) {
        Cursor cursorM3408a;
        String str2;
        try {
            if (C4059ap.m3084b(str)) {
                str2 = null;
            } else {
                str2 = "_pc = '" + str + "'";
            }
            cursorM3408a = C4143w.m3393a().m3408a("t_ui", (String[]) null, str2);
            if (cursorM3408a == null) {
                return null;
            }
            try {
                StringBuilder sb = new StringBuilder();
                ArrayList arrayList = new ArrayList();
                while (cursorM3408a.moveToNext()) {
                    UserInfoBean userInfoBeanM3333a = m3333a(cursorM3408a);
                    if (userInfoBeanM3333a != null) {
                        arrayList.add(userInfoBeanM3333a);
                    } else {
                        try {
                            long j7 = cursorM3408a.getLong(cursorM3408a.getColumnIndex("_id"));
                            sb.append(" or _id = ");
                            sb.append(j7);
                        } catch (Throwable unused) {
                            C4055al.m3026d("[Database] unknown id.", new Object[0]);
                        }
                    }
                }
                String string = sb.toString();
                if (string.length() > 0) {
                    C4055al.m3026d("[Database] deleted %s error data %d", "t_ui", Integer.valueOf(C4143w.m3393a().m3406a("t_ui", string.substring(4))));
                }
                cursorM3408a.close();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                try {
                    if (!C4055al.m3022a(th)) {
                        th.printStackTrace();
                    }
                    if (cursorM3408a != null) {
                        cursorM3408a.close();
                    }
                    return null;
                } finally {
                    if (cursorM3408a != null) {
                        cursorM3408a.close();
                    }
                }
            }
        } catch (Throwable th2) {
            th = th2;
            cursorM3408a = null;
        }
    }

    /* renamed from: a */
    private static UserInfoBean m3333a(Cursor cursor) {
        if (cursor == null) {
            return null;
        }
        try {
            byte[] blob = cursor.getBlob(cursor.getColumnIndex("_dt"));
            if (blob == null) {
                return null;
            }
            long j7 = cursor.getLong(cursor.getColumnIndex("_id"));
            UserInfoBean userInfoBean = (UserInfoBean) C4059ap.m3055a(blob, UserInfoBean.CREATOR);
            if (userInfoBean == null) {
                return userInfoBean;
            }
            userInfoBean.f3247a = j7;
            return userInfoBean;
        } catch (Throwable th) {
            if (!C4055al.m3022a(th)) {
                th.printStackTrace();
            }
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public synchronized void m3341a(boolean z8) {
        C4052ai c4052aiM2986a;
        C4046ac c4046acM2951a;
        if (this.f3875d && (c4052aiM2986a = C4052ai.m2986a()) != null && (c4046acM2951a = C4046ac.m2951a()) != null && (!c4046acM2951a.m2959b() || c4052aiM2986a.m3003b(PointerIconCompat.TYPE_CONTEXT_MENU))) {
            String str = C4044aa.m2888a(this.f3872a).f3434d;
            ArrayList arrayList = new ArrayList();
            List<UserInfoBean> listM3334a = m3334a(str);
            boolean z9 = true;
            if (listM3334a != null) {
                m3339a(listM3334a, arrayList);
                m3346b(listM3334a, arrayList);
                int iM3332a = m3332a(listM3334a);
                if (iM3332a > 15) {
                    C4055al.m3026d("[UserInfo] Upload user info too many times in 10 min: %d", Integer.valueOf(iM3332a));
                    z9 = false;
                }
            } else {
                listM3334a = new ArrayList<>();
            }
            if (arrayList.size() > 0) {
                m3345b(arrayList);
            }
            if (z9 && listM3334a.size() != 0) {
                C4055al.m3025c("[UserInfo] Upload user info(size: %d)", Integer.valueOf(listM3334a.size()));
                m3340a(listM3334a, z8);
                return;
            }
            C4055al.m3025c("[UserInfo] There is no user info in local database.", new Object[0]);
        }
    }

    /* renamed from: a */
    public static /* synthetic */ void m3335a(UserInfoBean userInfoBean) {
        C4044aa c4044aaM2890b;
        if (userInfoBean == null || (c4044aaM2890b = C4044aa.m2890b()) == null) {
            return;
        }
        userInfoBean.f3256j = c4044aaM2890b.m2901d();
    }
}
