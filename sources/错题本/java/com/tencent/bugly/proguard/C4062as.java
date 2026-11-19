package com.tencent.bugly.proguard;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.os.Environment;
import android.support.v4.media.AbstractC0037f;
import android.text.TextUtils;
import android.util.Pair;
import androidx.compose.material3.internal.CalendarModelKt;
import com.alibaba.sdk.android.oss.signer.SignParameters;
import com.tencent.bugly.BuglyStrategy;
import com.tencent.bugly.crashreport.common.info.PlugInBean;
import com.tencent.bugly.crashreport.common.strategy.StrategyBean;
import com.tencent.bugly.crashreport.crash.CrashDetailBean;
import com.tencent.bugly.proguard.C4050ag;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

/* renamed from: com.tencent.bugly.proguard.as */
/* loaded from: classes3.dex */
public final class C4062as {

    /* renamed from: a */
    public static int f3558a;

    /* renamed from: h */
    private static final Map<Integer, Pair<String, String>> f3559h = new HashMap<Integer, Pair<String, String>>() { // from class: com.tencent.bugly.proguard.as.1
        {
            put(3, new Pair("203", "103"));
            put(7, new Pair("208", "108"));
            put(0, new Pair("200", "100"));
            put(1, new Pair("201", "101"));
            put(2, new Pair("202", "102"));
            put(4, new Pair("204", "104"));
            put(6, new Pair("206", "106"));
            put(5, new Pair("207", "107"));
        }
    };

    /* renamed from: i */
    private static final ArrayList<AbstractC4132q0> f3560i = new ArrayList<AbstractC4132q0>() { // from class: com.tencent.bugly.proguard.as.2
        {
            add(new C4134r0(3));
            add(new C4136s0(7));
            add(new C4138t0(2));
            add(new C4140u0(0));
            add(new C4146x0(1));
            add(new C4148y0(4));
            add(new C4142v0(5));
            add(new C4144w0(6));
        }
    };

    /* renamed from: j */
    private static final Map<Integer, Integer> f3561j = new HashMap<Integer, Integer>() { // from class: com.tencent.bugly.proguard.as.3
        {
            put(3, 4);
            put(7, 7);
            put(2, 1);
            put(0, 0);
            put(1, 2);
            put(4, 3);
            put(5, 5);
            put(6, 6);
        }
    };

    /* renamed from: k */
    private static final Map<Integer, String> f3562k = new HashMap<Integer, String>() { // from class: com.tencent.bugly.proguard.as.4
        {
            put(3, "BuglyAnrCrash");
            put(0, "BuglyJavaCrash");
            put(1, "BuglyNativeCrash");
        }
    };

    /* renamed from: l */
    private static final Map<Integer, String> f3563l = new HashMap<Integer, String>() { // from class: com.tencent.bugly.proguard.as.5
        {
            put(3, "BuglyAnrCrashReport");
            put(0, "BuglyJavaCrashReport");
            put(1, "BuglyNativeCrashReport");
        }
    };

    /* renamed from: b */
    protected final Context f3564b;

    /* renamed from: c */
    protected final C4052ai f3565c;

    /* renamed from: d */
    protected final C4143w f3566d;

    /* renamed from: e */
    protected final C4046ac f3567e;

    /* renamed from: f */
    protected InterfaceC4066aw f3568f;

    /* renamed from: g */
    protected BuglyStrategy.C4032a f3569g;

    public C4062as(Context context, C4052ai c4052ai, C4143w c4143w, C4046ac c4046ac, BuglyStrategy.C4032a c4032a) {
        f3558a = 1004;
        this.f3564b = context;
        this.f3565c = c4052ai;
        this.f3566d = c4143w;
        this.f3567e = c4046ac;
        this.f3569g = c4032a;
        this.f3568f = null;
    }

    /* renamed from: a */
    private static List<C4061ar> m3107a(List<C4061ar> list) {
        if (list == null || list.size() == 0) {
            return null;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        ArrayList arrayList = new ArrayList();
        for (C4061ar c4061ar : list) {
            if (c4061ar.f3555d && c4061ar.f3553b <= jCurrentTimeMillis - CalendarModelKt.MillisecondsIn24Hours) {
                arrayList.add(c4061ar);
            }
        }
        return arrayList;
    }

    /* renamed from: b */
    private static void m3125b(CrashDetailBean crashDetailBean, List<C4061ar> list) {
        StringBuilder sb = new StringBuilder(64);
        for (C4061ar c4061ar : list) {
            if (!c4061ar.f3556e && !c4061ar.f3555d) {
                String str = crashDetailBean.f3337s;
                StringBuilder sb2 = new StringBuilder();
                sb2.append(c4061ar.f3553b);
                if (!str.contains(sb2.toString())) {
                    crashDetailBean.f3338t++;
                    sb.append(c4061ar.f3553b);
                    sb.append(SignParameters.NEW_LINE);
                }
            }
        }
        crashDetailBean.f3337s += sb.toString();
    }

    /* renamed from: c */
    private static ContentValues m3131c(CrashDetailBean crashDetailBean) {
        if (crashDetailBean == null) {
            return null;
        }
        try {
            ContentValues contentValues = new ContentValues();
            long j7 = crashDetailBean.f3318a;
            if (j7 > 0) {
                contentValues.put("_id", Long.valueOf(j7));
            }
            contentValues.put("_tm", Long.valueOf(crashDetailBean.f3336r));
            contentValues.put("_s1", crashDetailBean.f3339u);
            contentValues.put("_up", Integer.valueOf(crashDetailBean.f3322d ? 1 : 0));
            contentValues.put("_me", Integer.valueOf(crashDetailBean.f3328j ? 1 : 0));
            contentValues.put("_uc", Integer.valueOf(crashDetailBean.f3330l));
            contentValues.put("_dt", C4059ap.m3073a(crashDetailBean));
            return contentValues;
        } catch (Throwable th) {
            if (!C4055al.m3022a(th)) {
                th.printStackTrace();
            }
            return null;
        }
    }

    /* renamed from: d */
    private static void m3134d(List<C4061ar> list) {
        if (list == null || list.size() == 0) {
            return;
        }
        StringBuilder sbM97v = AbstractC0037f.m97v("_id in (");
        Iterator<C4061ar> it = list.iterator();
        while (it.hasNext()) {
            sbM97v.append(it.next().f3552a);
            sbM97v.append(",");
        }
        StringBuilder sb = new StringBuilder(sbM97v.substring(0, sbM97v.lastIndexOf(",")));
        sb.append(")");
        String string = sb.toString();
        sb.setLength(0);
        try {
            C4055al.m3025c("deleted %s data %d", "t_cr", Integer.valueOf(C4143w.m3393a().m3406a("t_cr", string)));
        } catch (Throwable th) {
            if (C4055al.m3022a(th)) {
                return;
            }
            th.printStackTrace();
        }
    }

    /* renamed from: e */
    private static void m3137e(List<CrashDetailBean> list) {
        try {
            if (list.size() == 0) {
                return;
            }
            StringBuilder sb = new StringBuilder();
            for (CrashDetailBean crashDetailBean : list) {
                sb.append(" or _id = ");
                sb.append(crashDetailBean.f3318a);
            }
            String string = sb.toString();
            if (string.length() > 0) {
                string = string.substring(4);
            }
            sb.setLength(0);
            C4055al.m3025c("deleted %s data %d", "t_cr", Integer.valueOf(C4143w.m3393a().m3406a("t_cr", string)));
        } catch (Throwable th) {
            if (C4055al.m3022a(th)) {
                return;
            }
            th.printStackTrace();
        }
    }

    /* renamed from: b */
    private static void m3129b(List<C4061ar> list) {
        List<CrashDetailBean> listM3132c = m3132c(list);
        if (listM3132c == null || listM3132c.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (CrashDetailBean crashDetailBean : listM3132c) {
            String str = f3563l.get(Integer.valueOf(crashDetailBean.f3320b));
            if (!TextUtils.isEmpty(str)) {
                C4055al.m3025c("find expired data,crashId:%s eventType:%s", crashDetailBean.f3321c, str);
                arrayList.add(new C4050ag.c(crashDetailBean.f3321c, str, crashDetailBean.f3336r, false, 0L, "expired", null));
            }
        }
        C4050ag.a.f3475a.m2983a(arrayList);
    }

    /* renamed from: a */
    private static CrashDetailBean m3102a(List<C4061ar> list, CrashDetailBean crashDetailBean) {
        CrashDetailBean crashDetailBean2;
        List<CrashDetailBean> listM3132c;
        if (list.isEmpty()) {
            return crashDetailBean;
        }
        ArrayList arrayList = new ArrayList(10);
        for (C4061ar c4061ar : list) {
            if (c4061ar.f3556e) {
                arrayList.add(c4061ar);
            }
        }
        if (arrayList.isEmpty() || (listM3132c = m3132c(arrayList)) == null || listM3132c.isEmpty()) {
            crashDetailBean2 = null;
        } else {
            Collections.sort(listM3132c);
            crashDetailBean2 = listM3132c.get(0);
            m3109a(crashDetailBean2, listM3132c);
        }
        if (crashDetailBean2 == null) {
            crashDetailBean.f3328j = true;
            crashDetailBean.f3338t = 0;
            crashDetailBean.f3337s = "";
            crashDetailBean2 = crashDetailBean;
        }
        m3125b(crashDetailBean2, list);
        if (crashDetailBean2.f3336r != crashDetailBean.f3336r) {
            String str = crashDetailBean2.f3337s;
            StringBuilder sb = new StringBuilder();
            sb.append(crashDetailBean.f3336r);
            if (!str.contains(sb.toString())) {
                crashDetailBean2.f3338t++;
                StringBuilder sb2 = new StringBuilder();
                sb2.append(crashDetailBean2.f3337s);
                crashDetailBean2.f3337s = AbstractC0037f.m83h(crashDetailBean.f3336r, SignParameters.NEW_LINE, sb2);
            }
        }
        return crashDetailBean2;
    }

    /* renamed from: c */
    private static List<CrashDetailBean> m3132c(List<C4061ar> list) {
        Cursor cursorM3408a;
        if (list == null || list.size() == 0) {
            return null;
        }
        StringBuilder sbM97v = AbstractC0037f.m97v("_id in (");
        Iterator<C4061ar> it = list.iterator();
        while (it.hasNext()) {
            sbM97v.append(it.next().f3552a);
            sbM97v.append(",");
        }
        if (sbM97v.toString().contains(",")) {
            sbM97v = new StringBuilder(sbM97v.substring(0, sbM97v.lastIndexOf(",")));
        }
        sbM97v.append(")");
        String string = sbM97v.toString();
        sbM97v.setLength(0);
        try {
            cursorM3408a = C4143w.m3393a().m3408a("t_cr", (String[]) null, string);
            if (cursorM3408a == null) {
                return null;
            }
            try {
                ArrayList arrayList = new ArrayList();
                sbM97v.append("_id in (");
                int i = 0;
                while (cursorM3408a.moveToNext()) {
                    CrashDetailBean crashDetailBeanM3101a = m3101a(cursorM3408a);
                    if (crashDetailBeanM3101a != null) {
                        arrayList.add(crashDetailBeanM3101a);
                    } else {
                        try {
                            sbM97v.append(cursorM3408a.getLong(cursorM3408a.getColumnIndex("_id")));
                            sbM97v.append(",");
                            i++;
                        } catch (Throwable unused) {
                            C4055al.m3026d("unknown id!", new Object[0]);
                        }
                    }
                }
                if (sbM97v.toString().contains(",")) {
                    sbM97v = new StringBuilder(sbM97v.substring(0, sbM97v.lastIndexOf(",")));
                }
                sbM97v.append(")");
                String string2 = sbM97v.toString();
                if (i > 0) {
                    C4055al.m3026d("deleted %s illegal data %d", "t_cr", Integer.valueOf(C4143w.m3393a().m3406a("t_cr", string2)));
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

    /* renamed from: e */
    private static String m3136e(CrashDetailBean crashDetailBean) {
        try {
            Pair<String, String> pair = f3559h.get(Integer.valueOf(crashDetailBean.f3320b));
            if (pair == null) {
                C4055al.m3027e("crash type error! %d", Integer.valueOf(crashDetailBean.f3320b));
                return "";
            }
            if (crashDetailBean.f3328j) {
                return (String) pair.first;
            }
            return (String) pair.second;
        } catch (Exception e) {
            C4055al.m3022a(e);
            return "";
        }
    }

    /* renamed from: d */
    private boolean m3135d(CrashDetailBean crashDetailBean) {
        String absolutePath;
        try {
            C4055al.m3025c("save eup logs", new Object[0]);
            C4044aa c4044aaM2890b = C4044aa.m2890b();
            String str = "#--------\npackage:" + c4044aaM2890b.m2903e() + "\nversion:" + c4044aaM2890b.f3445o + "\nsdk:" + c4044aaM2890b.f3438h + "\nprocess:" + crashDetailBean.f3292A + "\ndate:" + C4059ap.m3063a(new Date(crashDetailBean.f3336r)) + "\ntype:" + crashDetailBean.f3332n + "\nmessage:" + crashDetailBean.f3333o + "\nstack:\n" + crashDetailBean.f3335q + "\neupID:" + crashDetailBean.f3321c + SignParameters.NEW_LINE;
            if (C4063at.f3582m == null) {
                if (Environment.getExternalStorageState().equals("mounted")) {
                    absolutePath = Environment.getExternalStorageDirectory().getAbsolutePath() + "/Tencent/" + this.f3564b.getPackageName();
                } else {
                    absolutePath = null;
                }
            } else {
                File file = new File(C4063at.f3582m);
                if (file.isFile()) {
                    file = file.getParentFile();
                }
                absolutePath = file.getAbsolutePath();
            }
            C4056am.m3033a(absolutePath + "/euplog.txt", str, C4063at.f3583n);
            return true;
        } catch (Throwable th) {
            C4055al.m3026d("rqdp{  save error} %s", th.toString());
            if (!C4055al.m3022a(th)) {
                th.printStackTrace();
            }
            return false;
        }
    }

    /* renamed from: b */
    public final void m3142b(CrashDetailBean crashDetailBean, boolean z8) {
        if (C4063at.f3584o) {
            C4055al.m3021a("try to upload right now", new Object[0]);
            ArrayList arrayList = new ArrayList();
            arrayList.add(crashDetailBean);
            m3139a(arrayList, 3000L, z8, crashDetailBean.f3320b == 7, z8);
            return;
        }
        C4055al.m3021a("do not upload spot crash right now, crash would be uploaded when app next start", new Object[0]);
    }

    /* renamed from: b */
    public final void m3141b(CrashDetailBean crashDetailBean) {
        if (crashDetailBean == null) {
            return;
        }
        ContentValues contentValuesM3131c = m3131c(crashDetailBean);
        if (contentValuesM3131c != null) {
            long jM3407a = C4143w.m3393a().m3407a("t_cr", contentValuesM3131c, (InterfaceC4141v) null);
            if (jM3407a >= 0) {
                C4055al.m3025c("insert %s success!", "t_cr");
                crashDetailBean.f3318a = jM3407a;
            }
        }
        if (C4063at.f3581l) {
            m3135d(crashDetailBean);
        }
    }

    /* renamed from: b */
    private static C4061ar m3123b(Cursor cursor) {
        if (cursor == null) {
            return null;
        }
        try {
            C4061ar c4061ar = new C4061ar();
            c4061ar.f3552a = cursor.getLong(cursor.getColumnIndex("_id"));
            c4061ar.f3553b = cursor.getLong(cursor.getColumnIndex("_tm"));
            c4061ar.f3554c = cursor.getString(cursor.getColumnIndex("_s1"));
            c4061ar.f3555d = cursor.getInt(cursor.getColumnIndex("_up")) == 1;
            c4061ar.f3556e = cursor.getInt(cursor.getColumnIndex("_me")) == 1;
            c4061ar.f3557f = cursor.getInt(cursor.getColumnIndex("_uc"));
            return c4061ar;
        } catch (Throwable th) {
            if (!C4055al.m3022a(th)) {
                th.printStackTrace();
            }
            return null;
        }
    }

    /* renamed from: a */
    private static void m3109a(CrashDetailBean crashDetailBean, List<CrashDetailBean> list) {
        String[] strArrSplit;
        StringBuilder sb = new StringBuilder(128);
        for (int i = 1; i < list.size(); i++) {
            String str = list.get(i).f3337s;
            if (str != null && (strArrSplit = str.split(SignParameters.NEW_LINE)) != null) {
                for (String str2 : strArrSplit) {
                    if (!crashDetailBean.f3337s.contains(str2)) {
                        crashDetailBean.f3338t++;
                        sb.append(str2);
                        sb.append(SignParameters.NEW_LINE);
                    }
                }
            }
        }
        crashDetailBean.f3337s += sb.toString();
    }

    /* renamed from: b */
    private static List<C4061ar> m3124b() {
        ArrayList arrayList = new ArrayList();
        Cursor cursor = null;
        try {
            Cursor cursorM3408a = C4143w.m3393a().m3408a("t_cr", new String[]{"_id", "_tm", "_s1", "_up", "_me", "_uc"}, (String) null);
            if (cursorM3408a == null) {
                if (cursorM3408a != null) {
                    cursorM3408a.close();
                }
                return null;
            }
            try {
                if (cursorM3408a.getCount() <= 0) {
                    cursorM3408a.close();
                    return arrayList;
                }
                StringBuilder sb = new StringBuilder();
                sb.append("_id in (");
                int i = 0;
                while (cursorM3408a.moveToNext()) {
                    C4061ar c4061arM3123b = m3123b(cursorM3408a);
                    if (c4061arM3123b != null) {
                        arrayList.add(c4061arM3123b);
                    } else {
                        try {
                            sb.append(cursorM3408a.getLong(cursorM3408a.getColumnIndex("_id")));
                            sb.append(",");
                            i++;
                        } catch (Throwable unused) {
                            C4055al.m3026d("unknown id!", new Object[0]);
                        }
                    }
                }
                if (sb.toString().contains(",")) {
                    sb = new StringBuilder(sb.substring(0, sb.lastIndexOf(",")));
                }
                sb.append(")");
                String string = sb.toString();
                sb.setLength(0);
                if (i > 0) {
                    C4055al.m3026d("deleted %s illegal data %d", "t_cr", Integer.valueOf(C4143w.m3393a().m3406a("t_cr", string)));
                }
                cursorM3408a.close();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                cursor = cursorM3408a;
                try {
                    if (!C4055al.m3022a(th)) {
                        th.printStackTrace();
                    }
                    return arrayList;
                } finally {
                    if (cursor != null) {
                        cursor.close();
                    }
                }
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:90:0x0234, code lost:
    
        if (m3130b(r19, r6, r7) != false) goto L91;
     */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00cc A[Catch: all -> 0x006c, TryCatch #1 {all -> 0x006c, blocks: (B:20:0x0047, B:22:0x0055, B:25:0x006f, B:27:0x0084, B:29:0x009a, B:34:0x00be, B:36:0x00cc, B:41:0x00f3, B:47:0x012a, B:49:0x012e, B:51:0x013d, B:42:0x00fb, B:44:0x0101, B:46:0x011c, B:45:0x0104, B:37:0x00da, B:39:0x00de, B:30:0x00a5, B:32:0x00a9), top: B:99:0x0047 }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00da A[Catch: all -> 0x006c, TryCatch #1 {all -> 0x006c, blocks: (B:20:0x0047, B:22:0x0055, B:25:0x006f, B:27:0x0084, B:29:0x009a, B:34:0x00be, B:36:0x00cc, B:41:0x00f3, B:47:0x012a, B:49:0x012e, B:51:0x013d, B:42:0x00fb, B:44:0x0101, B:46:0x011c, B:45:0x0104, B:37:0x00da, B:39:0x00de, B:30:0x00a5, B:32:0x00a9), top: B:99:0x0047 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00f3 A[Catch: all -> 0x006c, TryCatch #1 {all -> 0x006c, blocks: (B:20:0x0047, B:22:0x0055, B:25:0x006f, B:27:0x0084, B:29:0x009a, B:34:0x00be, B:36:0x00cc, B:41:0x00f3, B:47:0x012a, B:49:0x012e, B:51:0x013d, B:42:0x00fb, B:44:0x0101, B:46:0x011c, B:45:0x0104, B:37:0x00da, B:39:0x00de, B:30:0x00a5, B:32:0x00a9), top: B:99:0x0047 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00fb A[Catch: all -> 0x006c, TryCatch #1 {all -> 0x006c, blocks: (B:20:0x0047, B:22:0x0055, B:25:0x006f, B:27:0x0084, B:29:0x009a, B:34:0x00be, B:36:0x00cc, B:41:0x00f3, B:47:0x012a, B:49:0x012e, B:51:0x013d, B:42:0x00fb, B:44:0x0101, B:46:0x011c, B:45:0x0104, B:37:0x00da, B:39:0x00de, B:30:0x00a5, B:32:0x00a9), top: B:99:0x0047 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x012e A[Catch: all -> 0x006c, TryCatch #1 {all -> 0x006c, blocks: (B:20:0x0047, B:22:0x0055, B:25:0x006f, B:27:0x0084, B:29:0x009a, B:34:0x00be, B:36:0x00cc, B:41:0x00f3, B:47:0x012a, B:49:0x012e, B:51:0x013d, B:42:0x00fb, B:44:0x0101, B:46:0x011c, B:45:0x0104, B:37:0x00da, B:39:0x00de, B:30:0x00a5, B:32:0x00a9), top: B:99:0x0047 }] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0197  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean m3140a(com.tencent.bugly.crashreport.crash.CrashDetailBean r19, boolean r20) {
        /*
            Method dump skipped, instructions count: 625
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.bugly.proguard.C4062as.m3140a(com.tencent.bugly.crashreport.crash.CrashDetailBean, boolean):boolean");
    }

    /* renamed from: c */
    private static void m3133c(ArrayList<C4086bn> arrayList, String str) {
        if (C4059ap.m3084b(str)) {
            return;
        }
        try {
            C4086bn c4086bn = new C4086bn((byte) 1, "crashInfos.txt", str.getBytes("utf-8"));
            C4055al.m3025c("attach crash infos", new Object[0]);
            arrayList.add(c4086bn);
        } catch (Exception e) {
            e.printStackTrace();
            C4055al.m3022a(e);
        }
    }

    /* renamed from: b */
    private static void m3127b(ArrayList<C4086bn> arrayList, String str) {
        if (str != null) {
            try {
                arrayList.add(new C4086bn((byte) 1, "jniLog.txt", str.getBytes("utf-8")));
            } catch (Exception e) {
                e.printStackTrace();
                C4055al.m3022a(e);
            }
        }
    }

    /* renamed from: b */
    private static void m3126b(ArrayList<C4086bn> arrayList, CrashDetailBean crashDetailBean, Context context) {
        String str;
        if (crashDetailBean.f3320b == 1 && (str = crashDetailBean.f3340v) != null) {
            try {
                C4086bn c4086bnM3103a = m3103a("tomb.zip", context, str);
                if (c4086bnM3103a != null) {
                    C4055al.m3025c("attach tombs", new Object[0]);
                    arrayList.add(c4086bnM3103a);
                }
            } catch (Exception e) {
                C4055al.m3022a(e);
            }
        }
    }

    /* renamed from: b */
    private static void m3128b(ArrayList<C4086bn> arrayList, byte[] bArr) {
        if (bArr == null || bArr.length <= 0) {
            return;
        }
        try {
            arrayList.add(new C4086bn((byte) 1, "userExtraByteData", bArr));
            C4055al.m3025c("attach extraData", new Object[0]);
        } catch (Exception e) {
            C4055al.m3022a(e);
        }
    }

    /* renamed from: b */
    private boolean m3130b(CrashDetailBean crashDetailBean, List<C4061ar> list, List<C4061ar> list2) {
        boolean z8;
        int i = crashDetailBean.f3320b;
        boolean z9 = i == 0 || i == 1;
        boolean z10 = i == 3;
        if (C4129p.f3864c) {
            z8 = false;
        } else {
            z8 = (z10 || z9) ? C4063at.f3574e : true;
        }
        if (!z8) {
            return false;
        }
        ArrayList arrayList = new ArrayList(10);
        if (!m3121a(crashDetailBean, list, arrayList)) {
            try {
                if (arrayList.size() >= C4063at.f3573d) {
                }
            } catch (Exception e) {
                C4055al.m3022a(e);
                C4055al.m3026d("Failed to merge crash.", new Object[0]);
            }
            return false;
        }
        C4055al.m3021a("same crash occur too much do merged!", new Object[0]);
        CrashDetailBean crashDetailBeanM3102a = m3102a((List<C4061ar>) arrayList, crashDetailBean);
        int size = arrayList.size();
        int i8 = 0;
        while (i8 < size) {
            Object obj = arrayList.get(i8);
            i8++;
            C4061ar c4061ar = (C4061ar) obj;
            if (c4061ar.f3552a != crashDetailBeanM3102a.f3318a) {
                list2.add(c4061ar);
            }
        }
        m3141b(crashDetailBeanM3102a);
        m3134d(list2);
        C4055al.m3023b("[crash] save crash success. For this device crash many times, it will not upload crashes immediately", new Object[0]);
        return true;
    }

    /* renamed from: a */
    private static boolean m3122a(String str) {
        String str2 = C4063at.f3587r;
        if (str2 != null && !str2.isEmpty()) {
            try {
                C4055al.m3025c("Crash regular filter for crash stack is: %s", C4063at.f3587r);
                if (Pattern.compile(C4063at.f3587r).matcher(str).find()) {
                    C4055al.m3026d("This crash matches the regular filter string set. It will not be record and upload.", new Object[0]);
                    return true;
                }
            } catch (Exception e) {
                C4055al.m3022a(e);
                C4055al.m3026d("Failed to compile " + C4063at.f3587r, new Object[0]);
            }
        }
        return false;
    }

    /* renamed from: a */
    private static boolean m3121a(CrashDetailBean crashDetailBean, List<C4061ar> list, List<C4061ar> list2) {
        boolean z8 = false;
        for (C4061ar c4061ar : list) {
            if (crashDetailBean.f3339u.equals(c4061ar.f3554c)) {
                if (c4061ar.f3556e) {
                    z8 = true;
                }
                list2.add(c4061ar);
            }
        }
        return z8;
    }

    /* renamed from: a */
    public static List<CrashDetailBean> m3106a() {
        StrategyBean strategyBeanM2960c = C4046ac.m2951a().m2960c();
        if (strategyBeanM2960c == null) {
            C4055al.m3026d("have not synced remote!", new Object[0]);
            return null;
        }
        if (!strategyBeanM2960c.f3274f) {
            C4055al.m3026d("Crashreport remote closed, please check your APP ID correct and Version available, then uninstall and reinstall your app.", new Object[0]);
            C4055al.m3023b("[init] WARNING! Crashreport closed by server, please check your APP ID correct and Version available, then uninstall and reinstall your app.", new Object[0]);
            return null;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        long jM3076b = C4059ap.m3076b();
        List<C4061ar> listM3124b = m3124b();
        C4055al.m3025c("Size of crash list loaded from DB: %s", Integer.valueOf(listM3124b.size()));
        if (listM3124b.size() <= 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        arrayList.addAll(m3107a(listM3124b));
        listM3124b.removeAll(arrayList);
        Iterator<C4061ar> it = listM3124b.iterator();
        while (it.hasNext()) {
            C4061ar next = it.next();
            long j7 = next.f3553b;
            if (j7 < jM3076b - C4063at.f3579j) {
                arrayList2.add(next);
                it.remove();
                arrayList.add(next);
            } else if (next.f3555d) {
                if (j7 >= jCurrentTimeMillis - CalendarModelKt.MillisecondsIn24Hours) {
                    it.remove();
                } else if (!next.f3556e) {
                    it.remove();
                    arrayList.add(next);
                }
            } else if (next.f3557f >= 3 && j7 < jCurrentTimeMillis - CalendarModelKt.MillisecondsIn24Hours) {
                it.remove();
                arrayList.add(next);
            }
        }
        m3129b(arrayList2);
        if (arrayList.size() > 0) {
            m3134d(arrayList);
        }
        ArrayList arrayList3 = new ArrayList();
        List<CrashDetailBean> listM3132c = m3132c(listM3124b);
        if (listM3132c != null && listM3132c.size() > 0) {
            String str = C4044aa.m2890b().f3445o;
            Iterator<CrashDetailBean> it2 = listM3132c.iterator();
            while (it2.hasNext()) {
                CrashDetailBean next2 = it2.next();
                if (!str.equals(next2.f3324f)) {
                    it2.remove();
                    arrayList3.add(next2);
                }
            }
        }
        if (arrayList3.size() > 0) {
            m3137e(arrayList3);
        }
        return listM3132c;
    }

    /* renamed from: a */
    public final void m3138a(CrashDetailBean crashDetailBean) {
        int i = crashDetailBean.f3320b;
        if (i != 0) {
            if (i != 1) {
                if (i == 3 && !C4063at.m3143a().m3159k()) {
                    return;
                }
            } else if (!C4063at.m3143a().m3158j()) {
                return;
            }
        } else if (!C4063at.m3143a().m3158j()) {
            return;
        }
        if (this.f3568f != null) {
            C4055al.m3025c("Calling 'onCrashHandleEnd' of RQD crash listener.", new Object[0]);
        }
    }

    /* renamed from: a */
    public final void m3139a(List<CrashDetailBean> list, long j7, boolean z8, boolean z9, boolean z10) {
        if (!C4044aa.m2888a(this.f3564b).f3436f) {
            C4055al.m3026d("warn: not upload process", new Object[0]);
            return;
        }
        C4052ai c4052ai = this.f3565c;
        if (c4052ai == null) {
            C4055al.m3026d("warn: upload manager is null", new Object[0]);
            return;
        }
        if (!z10 && !c4052ai.m3003b(C4063at.f3571a)) {
            C4055al.m3026d("warn: not crashHappen or not should upload", new Object[0]);
            return;
        }
        StrategyBean strategyBeanM2960c = this.f3567e.m2960c();
        if (!strategyBeanM2960c.f3274f) {
            C4055al.m3026d("remote report is disable!", new Object[0]);
            C4055al.m3023b("[crash] server closed bugly in this app. please check your appid if is correct, and re-install it", new Object[0]);
            return;
        }
        if (list != null && list.size() != 0) {
            try {
                String str = strategyBeanM2960c.f3286r;
                String str2 = StrategyBean.f3270b;
                C4088bp c4088bpM3105a = m3105a(this.f3564b, list, C4044aa.m2890b());
                if (c4088bpM3105a == null) {
                    C4055al.m3026d("create eupPkg fail!", new Object[0]);
                    return;
                }
                byte[] bArrM2969a = C4048ae.m2969a((AbstractC4123m) c4088bpM3105a);
                if (bArrM2969a == null) {
                    C4055al.m3026d("send encode fail!", new Object[0]);
                    return;
                }
                C4089bq c4089bqM2965a = C4048ae.m2965a(this.f3564b, 830, bArrM2969a);
                if (c4089bqM2965a == null) {
                    C4055al.m3026d("request package is null.", new Object[0]);
                    return;
                }
                C4130p0 c4130p0 = new C4130p0(System.currentTimeMillis(), list, z8);
                if (z8) {
                    this.f3565c.m3000a(f3558a, c4089bqM2965a, str, str2, c4130p0, j7, z9);
                    return;
                } else {
                    this.f3565c.m3001a(f3558a, c4089bqM2965a, str, str2, c4130p0, false);
                    return;
                }
            } catch (Throwable th) {
                C4055al.m3027e("req cr error %s", th.toString());
                if (C4055al.m3024b(th)) {
                    return;
                }
                th.printStackTrace();
                return;
            }
        }
        C4055al.m3026d("warn: crashList is null or crashList num is 0", new Object[0]);
    }

    /* renamed from: a */
    public static void m3120a(boolean z8, List<CrashDetailBean> list) {
        if (list != null && list.size() > 0) {
            C4055al.m3025c("up finish update state %b", Boolean.valueOf(z8));
            for (CrashDetailBean crashDetailBean : list) {
                C4055al.m3025c("pre uid:%s uc:%d re:%b me:%b", crashDetailBean.f3321c, Integer.valueOf(crashDetailBean.f3330l), Boolean.valueOf(crashDetailBean.f3322d), Boolean.valueOf(crashDetailBean.f3328j));
                int i = crashDetailBean.f3330l + 1;
                crashDetailBean.f3330l = i;
                crashDetailBean.f3322d = z8;
                C4055al.m3025c("set uid:%s uc:%d re:%b me:%b", crashDetailBean.f3321c, Integer.valueOf(i), Boolean.valueOf(crashDetailBean.f3322d), Boolean.valueOf(crashDetailBean.f3328j));
            }
            Iterator<CrashDetailBean> it = list.iterator();
            while (it.hasNext()) {
                C4063at.m3143a().m3148a(it.next());
            }
            C4055al.m3025c("update state size %d", Integer.valueOf(list.size()));
        }
        if (z8) {
            return;
        }
        C4055al.m3023b("[crash] upload fail.", new Object[0]);
    }

    /* renamed from: a */
    private static CrashDetailBean m3101a(Cursor cursor) {
        if (cursor == null) {
            return null;
        }
        try {
            byte[] blob = cursor.getBlob(cursor.getColumnIndex("_dt"));
            if (blob == null) {
                return null;
            }
            long j7 = cursor.getLong(cursor.getColumnIndex("_id"));
            CrashDetailBean crashDetailBean = (CrashDetailBean) C4059ap.m3055a(blob, CrashDetailBean.CREATOR);
            if (crashDetailBean == null) {
                return crashDetailBean;
            }
            crashDetailBean.f3318a = j7;
            return crashDetailBean;
        } catch (Throwable th) {
            if (!C4055al.m3022a(th)) {
                th.printStackTrace();
            }
            return null;
        }
    }

    /* renamed from: a */
    private static C4087bo m3104a(Context context, CrashDetailBean crashDetailBean, C4044aa c4044aa) {
        ArrayList<C4084bl> arrayList = null;
        if (context != null && crashDetailBean != null && c4044aa != null) {
            C4087bo c4087bo = new C4087bo();
            c4087bo.f3706a = m3136e(crashDetailBean);
            c4087bo.f3707b = crashDetailBean.f3336r;
            c4087bo.f3708c = crashDetailBean.f3332n;
            c4087bo.f3709d = crashDetailBean.f3333o;
            c4087bo.f3710e = crashDetailBean.f3334p;
            c4087bo.f3712g = crashDetailBean.f3335q;
            c4087bo.f3713h = crashDetailBean.f3344z;
            c4087bo.f3714i = crashDetailBean.f3321c;
            c4087bo.f3715j = null;
            c4087bo.f3717l = crashDetailBean.f3331m;
            c4087bo.f3718m = crashDetailBean.f3323e;
            c4087bo.f3711f = crashDetailBean.f3293B;
            c4087bo.f3719n = null;
            Map<String, PlugInBean> map = crashDetailBean.f3326h;
            if (map != null && !map.isEmpty()) {
                arrayList = new ArrayList<>(crashDetailBean.f3326h.size());
                for (Map.Entry<String, PlugInBean> entry : crashDetailBean.f3326h.entrySet()) {
                    C4084bl c4084bl = new C4084bl();
                    c4084bl.f3686a = entry.getValue().f3266a;
                    c4084bl.f3688c = entry.getValue().f3268c;
                    c4084bl.f3690e = entry.getValue().f3267b;
                    arrayList.add(c4084bl);
                }
            }
            c4087bo.f3721p = arrayList;
            C4055al.m3025c("libInfo %s", c4087bo.f3720o);
            ArrayList<C4086bn> arrayList2 = new ArrayList<>(20);
            m3112a(arrayList2, crashDetailBean);
            m3114a(arrayList2, crashDetailBean.f3341w);
            m3127b(arrayList2, crashDetailBean.f3342x);
            m3133c(arrayList2, crashDetailBean.f3317Z);
            m3115a(arrayList2, crashDetailBean.f3319aa, context);
            m3117a(arrayList2, crashDetailBean.f3343y);
            m3113a(arrayList2, crashDetailBean, context);
            m3126b(arrayList2, crashDetailBean, context);
            m3116a(arrayList2, c4044aa.f3393L);
            m3128b(arrayList2, crashDetailBean.f3316Y);
            c4087bo.f3722q = arrayList2;
            if (crashDetailBean.f3328j) {
                c4087bo.f3716k = crashDetailBean.f3338t;
            }
            c4087bo.f3723r = m3108a(crashDetailBean, c4044aa);
            c4087bo.f3724s = new HashMap();
            Map<String, String> map2 = crashDetailBean.f3310S;
            if (map2 != null && map2.size() > 0) {
                c4087bo.f3724s.putAll(crashDetailBean.f3310S);
                C4055al.m3021a("setted message size %d", Integer.valueOf(c4087bo.f3724s.size()));
            }
            Map<String, String> map3 = c4087bo.f3724s;
            C4055al.m3025c("pss:" + crashDetailBean.f3300I + " vss:" + crashDetailBean.f3301J + " javaHeap:" + crashDetailBean.f3302K, new Object[0]);
            StringBuilder sb = new StringBuilder();
            sb.append(crashDetailBean.f3300I);
            map3.put("SDK_UPLOAD_U1", sb.toString());
            StringBuilder sb2 = new StringBuilder();
            sb2.append(crashDetailBean.f3301J);
            map3.put("SDK_UPLOAD_U2", sb2.toString());
            StringBuilder sb3 = new StringBuilder();
            sb3.append(crashDetailBean.f3302K);
            map3.put("SDK_UPLOAD_U3", sb3.toString());
            C4055al.m3025c("%s rid:%s sess:%s ls:%ds isR:%b isF:%b isM:%b isN:%b mc:%d ,%s ,isUp:%b ,vm:%d", crashDetailBean.f3332n, crashDetailBean.f3321c, c4044aa.m2901d(), Long.valueOf((crashDetailBean.f3336r - crashDetailBean.f3308Q) / 1000), Boolean.valueOf(crashDetailBean.f3329k), Boolean.valueOf(crashDetailBean.f3309R), Boolean.valueOf(crashDetailBean.f3328j), Boolean.valueOf(crashDetailBean.f3320b == 1), Integer.valueOf(crashDetailBean.f3338t), crashDetailBean.f3337s, Boolean.valueOf(crashDetailBean.f3322d), Integer.valueOf(c4087bo.f3723r.size()));
            return c4087bo;
        }
        C4055al.m3026d("enExp args == null", new Object[0]);
        return null;
    }

    /* renamed from: a */
    private static C4088bp m3105a(Context context, List<CrashDetailBean> list, C4044aa c4044aa) {
        if (context != null && list != null && list.size() != 0 && c4044aa != null) {
            C4088bp c4088bp = new C4088bp();
            c4088bp.f3728a = new ArrayList<>();
            Iterator<CrashDetailBean> it = list.iterator();
            while (it.hasNext()) {
                c4088bp.f3728a.add(m3104a(context, it.next(), c4044aa));
            }
            return c4088bp;
        }
        C4055al.m3026d("enEXPPkg args == null!", new Object[0]);
        return null;
    }

    /* renamed from: a */
    private static C4086bn m3103a(String str, Context context, String str2) throws IOException {
        FileInputStream fileInputStream;
        if (str2 != null && context != null) {
            C4055al.m3025c("zip %s", str2);
            File file = new File(str2);
            File file2 = new File(context.getCacheDir(), str);
            if (!C4059ap.m3071a(file, file2)) {
                C4055al.m3026d("zip fail!", new Object[0]);
                return null;
            }
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                fileInputStream = new FileInputStream(file2);
            } catch (Throwable th) {
                th = th;
                fileInputStream = null;
            }
            try {
                byte[] bArr = new byte[4096];
                while (true) {
                    int i = fileInputStream.read(bArr);
                    if (i <= 0) {
                        break;
                    }
                    byteArrayOutputStream.write(bArr, 0, i);
                    byteArrayOutputStream.flush();
                }
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                C4055al.m3025c("read bytes :%d", Integer.valueOf(byteArray.length));
                C4086bn c4086bn = new C4086bn((byte) 2, file2.getName(), byteArray);
                try {
                    fileInputStream.close();
                } catch (IOException e) {
                    if (!C4055al.m3022a(e)) {
                        e.printStackTrace();
                    }
                }
                if (file2.exists()) {
                    C4055al.m3025c("del tmp", new Object[0]);
                    file2.delete();
                }
                return c4086bn;
            } catch (Throwable th2) {
                th = th2;
                try {
                    if (!C4055al.m3022a(th)) {
                        th.printStackTrace();
                    }
                    if (fileInputStream != null) {
                        try {
                            fileInputStream.close();
                        } catch (IOException e4) {
                            if (!C4055al.m3022a(e4)) {
                                e4.printStackTrace();
                            }
                        }
                    }
                    if (file2.exists()) {
                        C4055al.m3025c("del tmp", new Object[0]);
                        file2.delete();
                    }
                    return null;
                } catch (Throwable th3) {
                    if (fileInputStream != null) {
                        try {
                            fileInputStream.close();
                        } catch (IOException e8) {
                            if (!C4055al.m3022a(e8)) {
                                e8.printStackTrace();
                            }
                        }
                    }
                    if (file2.exists()) {
                        C4055al.m3025c("del tmp", new Object[0]);
                        file2.delete();
                    }
                    throw th3;
                }
            }
        }
        C4055al.m3026d("rqdp{  createZipAttachment sourcePath == null || context == null ,pls check}", new Object[0]);
        return null;
    }

    /* renamed from: a */
    public static void m3111a(String str, String str2, String str3, String str4, String str5, CrashDetailBean crashDetailBean) {
        String str6;
        C4044aa c4044aaM2890b = C4044aa.m2890b();
        if (c4044aaM2890b == null) {
            return;
        }
        C4055al.m3027e("#++++++++++Record By Bugly++++++++++#", new Object[0]);
        C4055al.m3027e("# You can use Bugly(http:\\\\bugly.qq.com) to get more Crash Detail!", new Object[0]);
        C4055al.m3027e("# PKG NAME: %s", c4044aaM2890b.f3433c);
        C4055al.m3027e("# APP VER: %s", c4044aaM2890b.f3445o);
        C4055al.m3027e("# SDK VER: %s", c4044aaM2890b.f3438h);
        C4055al.m3027e("# LAUNCH TIME: %s", C4059ap.m3063a(new Date(C4044aa.m2890b().f3407a)));
        C4055al.m3027e("# CRASH TYPE: %s", str);
        C4055al.m3027e("# CRASH TIME: %s", str2);
        C4055al.m3027e("# CRASH PROCESS: %s", str3);
        C4055al.m3027e("# CRASH FOREGROUND: %s", Boolean.valueOf(c4044aaM2890b.m2896a()));
        C4055al.m3027e("# CRASH THREAD: %s", str4);
        if (crashDetailBean != null) {
            C4055al.m3027e("# REPORT ID: %s", crashDetailBean.f3321c);
            C4055al.m3027e("# CRASH DEVICE: %s %s", c4044aaM2890b.m2909h(), c4044aaM2890b.m2918r().booleanValue() ? "ROOTED" : "UNROOT");
            C4055al.m3027e("# RUNTIME AVAIL RAM:%d ROM:%d SD:%d", Long.valueOf(crashDetailBean.f3294C), Long.valueOf(crashDetailBean.f3295D), Long.valueOf(crashDetailBean.f3296E));
            C4055al.m3027e("# RUNTIME TOTAL RAM:%d ROM:%d SD:%d", Long.valueOf(crashDetailBean.f3297F), Long.valueOf(crashDetailBean.f3298G), Long.valueOf(crashDetailBean.f3299H));
            if (!C4059ap.m3084b(crashDetailBean.f3306O)) {
                C4055al.m3027e("# EXCEPTION FIRED BY %s %s", crashDetailBean.f3306O, crashDetailBean.f3305N);
            } else if (crashDetailBean.f3320b == 3) {
                if (crashDetailBean.f3311T == null) {
                    str6 = "null";
                } else {
                    str6 = crashDetailBean.f3311T.get("BUGLY_CR_01");
                }
                C4055al.m3027e("# EXCEPTION ANR MESSAGE:\n %s", str6);
            }
        }
        if (!C4059ap.m3084b(str5)) {
            C4055al.m3027e("# CRASH STACK: ", new Object[0]);
            C4055al.m3027e(str5, new Object[0]);
        }
        C4055al.m3027e("#++++++++++++++++++++++++++++++++++++++++++#", new Object[0]);
    }

    /* renamed from: a */
    private static void m3110a(CrashDetailBean crashDetailBean, Map<String, String> map) {
        String value;
        if (map != null && !map.isEmpty()) {
            crashDetailBean.f3310S = new LinkedHashMap(map.size());
            for (Map.Entry<String, String> entry : map.entrySet()) {
                if (!C4059ap.m3084b(entry.getKey())) {
                    String key = entry.getKey();
                    if (key.length() > 100) {
                        key = key.substring(0, 100);
                        C4055al.m3026d("setted key length is over limit %d substring to %s", 100, key);
                    }
                    if (!C4059ap.m3084b(entry.getValue()) && entry.getValue().length() > 100000) {
                        value = entry.getValue().substring(entry.getValue().length() - 100000);
                        C4055al.m3026d("setted %s value length is over limit %d substring", key, 100000);
                    } else {
                        value = entry.getValue();
                    }
                    crashDetailBean.f3310S.put(key, value);
                    C4055al.m3021a("add setted key %s value size:%d", key, Integer.valueOf(value.length()));
                }
            }
            return;
        }
        C4055al.m3026d("extra map is empty. CrashBean won't have userDatas.", new Object[0]);
    }

    /* renamed from: a */
    private static void m3112a(ArrayList<C4086bn> arrayList, CrashDetailBean crashDetailBean) {
        String str;
        if (crashDetailBean.f3328j && (str = crashDetailBean.f3337s) != null && str.length() > 0) {
            try {
                arrayList.add(new C4086bn((byte) 1, "alltimes.txt", crashDetailBean.f3337s.getBytes("utf-8")));
            } catch (Exception e) {
                e.printStackTrace();
                C4055al.m3022a(e);
            }
        }
    }

    /* renamed from: a */
    private static void m3114a(ArrayList<C4086bn> arrayList, String str) {
        if (str != null) {
            try {
                arrayList.add(new C4086bn((byte) 1, "log.txt", str.getBytes("utf-8")));
            } catch (Exception e) {
                e.printStackTrace();
                C4055al.m3022a(e);
            }
        }
    }

    /* renamed from: a */
    private static void m3115a(ArrayList<C4086bn> arrayList, String str, Context context) {
        if (str != null) {
            try {
                C4086bn c4086bnM3103a = m3103a("backupRecord.zip", context, str);
                if (c4086bnM3103a != null) {
                    C4055al.m3025c("attach backup record", new Object[0]);
                    arrayList.add(c4086bnM3103a);
                }
            } catch (Exception e) {
                C4055al.m3022a(e);
            }
        }
    }

    /* renamed from: a */
    private static void m3117a(ArrayList<C4086bn> arrayList, byte[] bArr) {
        if (bArr == null || bArr.length <= 0) {
            return;
        }
        try {
            C4086bn c4086bn = new C4086bn((byte) 2, "buglylog.zip", bArr);
            C4055al.m3025c("attach user log", new Object[0]);
            arrayList.add(c4086bn);
        } catch (Exception e) {
            C4055al.m3022a(e);
        }
    }

    /* renamed from: a */
    private static void m3113a(ArrayList<C4086bn> arrayList, CrashDetailBean crashDetailBean, Context context) {
        C4086bn c4086bnM3103a;
        if (crashDetailBean.f3320b != 3) {
            return;
        }
        C4055al.m3025c("crashBean.anrMessages:%s", crashDetailBean.f3311T);
        try {
            Map<String, String> map = crashDetailBean.f3311T;
            if (map != null && map.containsKey("BUGLY_CR_01")) {
                if (!TextUtils.isEmpty(crashDetailBean.f3311T.get("BUGLY_CR_01"))) {
                    arrayList.add(new C4086bn((byte) 1, "anrMessage.txt", crashDetailBean.f3311T.get("BUGLY_CR_01").getBytes("utf-8")));
                    C4055al.m3025c("attach anr message", new Object[0]);
                }
                crashDetailBean.f3311T.remove("BUGLY_CR_01");
            }
            String str = crashDetailBean.f3340v;
            if (str == null || (c4086bnM3103a = m3103a("trace.zip", context, str)) == null) {
                return;
            }
            C4055al.m3025c("attach traces", new Object[0]);
            arrayList.add(c4086bnM3103a);
        } catch (Exception e) {
            e.printStackTrace();
            C4055al.m3022a(e);
        }
    }

    /* renamed from: a */
    private static void m3116a(ArrayList<C4086bn> arrayList, List<String> list) {
        if (list == null || list.isEmpty()) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            sb.append(it.next());
        }
        try {
            arrayList.add(new C4086bn((byte) 1, "martianlog.txt", sb.toString().getBytes("utf-8")));
            C4055al.m3025c("attach pageTracingList", new Object[0]);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    private static Map<String, String> m3108a(CrashDetailBean crashDetailBean, C4044aa c4044aa) {
        HashMap map = new HashMap(30);
        try {
            StringBuilder sb = new StringBuilder();
            sb.append(crashDetailBean.f3294C);
            map.put("A9", sb.toString());
            StringBuilder sb2 = new StringBuilder();
            sb2.append(crashDetailBean.f3295D);
            map.put("A11", sb2.toString());
            StringBuilder sb3 = new StringBuilder();
            sb3.append(crashDetailBean.f3296E);
            map.put("A10", sb3.toString());
            map.put("A23", crashDetailBean.f3324f);
            c4044aa.getClass();
            map.put("A7", "");
            map.put("A6", C4044aa.m2891n());
            map.put("A5", c4044aa.m2914m());
            map.put("A22", c4044aa.m2907g());
            StringBuilder sb4 = new StringBuilder();
            sb4.append(crashDetailBean.f3298G);
            map.put("A2", sb4.toString());
            StringBuilder sb5 = new StringBuilder();
            sb5.append(crashDetailBean.f3297F);
            map.put("A1", sb5.toString());
            map.put("A24", c4044aa.f3441k);
            StringBuilder sb6 = new StringBuilder();
            sb6.append(crashDetailBean.f3299H);
            map.put("A17", sb6.toString());
            map.put("A25", c4044aa.m2907g());
            map.put("A15", c4044aa.m2917q());
            StringBuilder sb7 = new StringBuilder();
            sb7.append(c4044aa.m2918r());
            map.put("A13", sb7.toString());
            map.put("A34", crashDetailBean.f3292A);
            if (c4044aa.f3388G != null) {
                map.put("productIdentify", c4044aa.f3388G);
            }
            map.put("A26", URLEncoder.encode(crashDetailBean.f3303L, "utf-8"));
            if (crashDetailBean.f3320b == 1) {
                map.put("A27", crashDetailBean.f3306O);
                map.put("A28", crashDetailBean.f3305N);
                StringBuilder sb8 = new StringBuilder();
                sb8.append(crashDetailBean.f3329k);
                map.put("A29", sb8.toString());
            }
            map.put("A30", crashDetailBean.f3307P);
            StringBuilder sb9 = new StringBuilder();
            sb9.append(crashDetailBean.f3308Q);
            map.put("A18", sb9.toString());
            StringBuilder sb10 = new StringBuilder();
            sb10.append(true ^ crashDetailBean.f3309R);
            map.put("A36", sb10.toString());
            StringBuilder sb11 = new StringBuilder();
            sb11.append(c4044aa.f3456z);
            map.put("F02", sb11.toString());
            StringBuilder sb12 = new StringBuilder();
            sb12.append(c4044aa.f3382A);
            map.put("F03", sb12.toString());
            map.put("F04", c4044aa.m2901d());
            StringBuilder sb13 = new StringBuilder();
            sb13.append(c4044aa.f3383B);
            map.put("F05", sb13.toString());
            map.put("F06", c4044aa.f3455y);
            map.put("F08", c4044aa.f3386E);
            map.put("F09", c4044aa.f3387F);
            StringBuilder sb14 = new StringBuilder();
            sb14.append(c4044aa.f3384C);
            map.put("F10", sb14.toString());
            m3119a(map, crashDetailBean);
            return map;
        } catch (Exception e) {
            e.printStackTrace();
            C4055al.m3022a(e);
            return map;
        }
    }

    /* renamed from: a */
    private static void m3119a(Map<String, String> map, CrashDetailBean crashDetailBean) {
        if (crashDetailBean.f3312U >= 0) {
            StringBuilder sb = new StringBuilder();
            sb.append(crashDetailBean.f3312U);
            map.put("C01", sb.toString());
        }
        if (crashDetailBean.f3313V >= 0) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(crashDetailBean.f3313V);
            map.put("C02", sb2.toString());
        }
        Map<String, String> map2 = crashDetailBean.f3314W;
        if (map2 != null && map2.size() > 0) {
            for (Map.Entry<String, String> entry : crashDetailBean.f3314W.entrySet()) {
                map.put("C03_" + entry.getKey(), entry.getValue());
            }
        }
        Map<String, String> map3 = crashDetailBean.f3315X;
        if (map3 == null || map3.size() <= 0) {
            return;
        }
        for (Map.Entry<String, String> entry2 : crashDetailBean.f3315X.entrySet()) {
            map.put("C04_" + entry2.getKey(), entry2.getValue());
        }
    }

    /* renamed from: a */
    public static /* synthetic */ void m3118a(List list, boolean z8, long j7, String str, String str2) {
        if (list == null || list.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            CrashDetailBean crashDetailBean = (CrashDetailBean) it.next();
            String str3 = f3563l.get(Integer.valueOf(crashDetailBean.f3320b));
            if (!TextUtils.isEmpty(str3)) {
                arrayList.add(new C4050ag.c(crashDetailBean.f3321c, str3, crashDetailBean.f3336r, z8, j7, str, str2));
            }
        }
        C4050ag.a.f3475a.m2983a(arrayList);
    }
}
