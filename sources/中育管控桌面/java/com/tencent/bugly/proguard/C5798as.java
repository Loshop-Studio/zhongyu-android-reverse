package com.tencent.bugly.proguard;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.os.Environment;
import android.text.TextUtils;
import android.util.Pair;
import androidx.compose.material3.internal.CalendarModelKt;
import com.alibaba.sdk.android.oss.signer.SignParameters;
import com.tencent.bugly.BuglyStrategy;
import com.tencent.bugly.crashreport.common.info.PlugInBean;
import com.tencent.bugly.crashreport.common.strategy.StrategyBean;
import com.tencent.bugly.crashreport.crash.CrashDetailBean;
import com.tencent.bugly.proguard.C5786ag;
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
public final class C5798as {

    /* renamed from: a */
    public static int f4058a;

    /* renamed from: h */
    private static final Map<Integer, Pair<String, String>> f4059h = new HashMap<Integer, Pair<String, String>>() { // from class: com.tencent.bugly.proguard.as.1
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
    private static final ArrayList<a> f4060i = new ArrayList<a>() { // from class: com.tencent.bugly.proguard.as.2
        {
            byte b7 = 0;
            add(new b(b7));
            add(new c(b7));
            add(new d(b7));
            add(new e(b7));
            add(new h(b7));
            add(new i(b7));
            add(new f(b7));
            add(new g(b7));
        }
    };

    /* renamed from: j */
    private static final Map<Integer, Integer> f4061j = new HashMap<Integer, Integer>() { // from class: com.tencent.bugly.proguard.as.3
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
    private static final Map<Integer, String> f4062k = new HashMap<Integer, String>() { // from class: com.tencent.bugly.proguard.as.4
        {
            put(3, "BuglyAnrCrash");
            put(0, "BuglyJavaCrash");
            put(1, "BuglyNativeCrash");
        }
    };

    /* renamed from: l */
    private static final Map<Integer, String> f4063l = new HashMap<Integer, String>() { // from class: com.tencent.bugly.proguard.as.5
        {
            put(3, "BuglyAnrCrashReport");
            put(0, "BuglyJavaCrashReport");
            put(1, "BuglyNativeCrashReport");
        }
    };

    /* renamed from: b */
    protected final Context f4064b;

    /* renamed from: c */
    protected final C5788ai f4065c;

    /* renamed from: d */
    protected final C5849w f4066d;

    /* renamed from: e */
    protected final C5782ac f4067e;

    /* renamed from: f */
    protected InterfaceC5802aw f4068f;

    /* renamed from: g */
    protected BuglyStrategy.C5765a f4069g;

    /* renamed from: com.tencent.bugly.proguard.as$a */
    public static abstract class a {

        /* renamed from: a */
        final int f4074a;

        public /* synthetic */ a(int i6, byte b7) {
            this(i6);
        }

        /* renamed from: a */
        public abstract boolean mo4050a();

        private a(int i6) {
            this.f4074a = i6;
        }
    }

    /* renamed from: com.tencent.bugly.proguard.as$b */
    public static class b extends a {
        public /* synthetic */ b(byte b7) {
            this();
        }

        @Override // com.tencent.bugly.proguard.C5798as.a
        /* renamed from: a */
        public final boolean mo4050a() {
            return C5799at.m4051a().m4067k();
        }

        private b() {
            super(3, (byte) 0);
        }
    }

    /* renamed from: com.tencent.bugly.proguard.as$c */
    public static class c extends a {
        public /* synthetic */ c(byte b7) {
            this();
        }

        @Override // com.tencent.bugly.proguard.C5798as.a
        /* renamed from: a */
        public final boolean mo4050a() {
            return true;
        }

        private c() {
            super(7, (byte) 0);
        }
    }

    /* renamed from: com.tencent.bugly.proguard.as$d */
    public static class d extends a {
        public /* synthetic */ d(byte b7) {
            this();
        }

        @Override // com.tencent.bugly.proguard.C5798as.a
        /* renamed from: a */
        public final boolean mo4050a() {
            return true;
        }

        private d() {
            super(2, (byte) 0);
        }
    }

    /* renamed from: com.tencent.bugly.proguard.as$e */
    public static class e extends a {
        public /* synthetic */ e(byte b7) {
            this();
        }

        @Override // com.tencent.bugly.proguard.C5798as.a
        /* renamed from: a */
        public final boolean mo4050a() {
            return C5799at.m4051a().m4066j();
        }

        /* JADX WARN: Illegal instructions before constructor call */
        private e() {
            byte b7 = 0;
            super(b7, b7);
        }
    }

    /* renamed from: com.tencent.bugly.proguard.as$f */
    public static class f extends a {
        public /* synthetic */ f(byte b7) {
            this();
        }

        @Override // com.tencent.bugly.proguard.C5798as.a
        /* renamed from: a */
        public final boolean mo4050a() {
            return (C5799at.m4051a().f4094B & 2) > 0;
        }

        private f() {
            super(5, (byte) 0);
        }
    }

    /* renamed from: com.tencent.bugly.proguard.as$g */
    public static class g extends a {
        public /* synthetic */ g(byte b7) {
            this();
        }

        @Override // com.tencent.bugly.proguard.C5798as.a
        /* renamed from: a */
        public final boolean mo4050a() {
            return (C5799at.m4051a().f4094B & 1) > 0;
        }

        private g() {
            super(6, (byte) 0);
        }
    }

    /* renamed from: com.tencent.bugly.proguard.as$h */
    public static class h extends a {
        public /* synthetic */ h(byte b7) {
            this();
        }

        @Override // com.tencent.bugly.proguard.C5798as.a
        /* renamed from: a */
        public final boolean mo4050a() {
            return C5799at.m4051a().m4066j();
        }

        private h() {
            super(1, (byte) 0);
        }
    }

    /* renamed from: com.tencent.bugly.proguard.as$i */
    public static class i extends a {
        public /* synthetic */ i(byte b7) {
            this();
        }

        @Override // com.tencent.bugly.proguard.C5798as.a
        /* renamed from: a */
        public final boolean mo4050a() {
            return (C5799at.m4051a().f4094B & 4) > 0;
        }

        private i() {
            super(4, (byte) 0);
        }
    }

    public C5798as(Context context, C5788ai c5788ai, C5849w c5849w, C5782ac c5782ac, BuglyStrategy.C5765a c5765a) {
        f4058a = 1004;
        this.f4064b = context;
        this.f4065c = c5788ai;
        this.f4066d = c5849w;
        this.f4067e = c5782ac;
        this.f4069g = c5765a;
        this.f4068f = null;
    }

    /* renamed from: a */
    private static List<C5797ar> m4014a(List<C5797ar> list) {
        if (list == null || list.size() == 0) {
            return null;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        ArrayList arrayList = new ArrayList();
        for (C5797ar c5797ar : list) {
            if (c5797ar.f4055d && c5797ar.f4053b <= jCurrentTimeMillis - CalendarModelKt.MillisecondsIn24Hours) {
                arrayList.add(c5797ar);
            }
        }
        return arrayList;
    }

    /* renamed from: b */
    private static void m4032b(CrashDetailBean crashDetailBean, List<C5797ar> list) {
        StringBuilder sb = new StringBuilder(64);
        for (C5797ar c5797ar : list) {
            if (!c5797ar.f4056e && !c5797ar.f4055d) {
                String str = crashDetailBean.f3824s;
                StringBuilder sb2 = new StringBuilder();
                sb2.append(c5797ar.f4053b);
                if (!str.contains(sb2.toString())) {
                    crashDetailBean.f3825t++;
                    sb.append(c5797ar.f4053b);
                    sb.append(SignParameters.NEW_LINE);
                }
            }
        }
        crashDetailBean.f3824s += sb.toString();
    }

    /* renamed from: c */
    private static ContentValues m4038c(CrashDetailBean crashDetailBean) {
        if (crashDetailBean == null) {
            return null;
        }
        try {
            ContentValues contentValues = new ContentValues();
            long j6 = crashDetailBean.f3805a;
            if (j6 > 0) {
                contentValues.put("_id", Long.valueOf(j6));
            }
            contentValues.put("_tm", Long.valueOf(crashDetailBean.f3823r));
            contentValues.put("_s1", crashDetailBean.f3826u);
            contentValues.put("_up", Integer.valueOf(crashDetailBean.f3809d ? 1 : 0));
            contentValues.put("_me", Integer.valueOf(crashDetailBean.f3815j ? 1 : 0));
            contentValues.put("_uc", Integer.valueOf(crashDetailBean.f3817l));
            contentValues.put("_dt", C5795ap.m3980a(crashDetailBean));
            return contentValues;
        } catch (Throwable th) {
            if (!C5791al.m3929a(th)) {
                th.printStackTrace();
            }
            return null;
        }
    }

    /* renamed from: d */
    private static void m4041d(List<C5797ar> list) {
        if (list == null || list.size() == 0) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("_id in (");
        Iterator<C5797ar> it = list.iterator();
        while (it.hasNext()) {
            sb.append(it.next().f4052a);
            sb.append(",");
        }
        StringBuilder sb2 = new StringBuilder(sb.substring(0, sb.lastIndexOf(",")));
        sb2.append(")");
        String string = sb2.toString();
        sb2.setLength(0);
        try {
            C5791al.m3932c("deleted %s data %d", "t_cr", Integer.valueOf(C5849w.m4301a().m4314a("t_cr", string)));
        } catch (Throwable th) {
            if (C5791al.m3929a(th)) {
                return;
            }
            th.printStackTrace();
        }
    }

    /* renamed from: e */
    private static void m4044e(List<CrashDetailBean> list) {
        try {
            if (list.size() == 0) {
                return;
            }
            StringBuilder sb = new StringBuilder();
            for (CrashDetailBean crashDetailBean : list) {
                sb.append(" or _id = ");
                sb.append(crashDetailBean.f3805a);
            }
            String string = sb.toString();
            if (string.length() > 0) {
                string = string.substring(4);
            }
            sb.setLength(0);
            C5791al.m3932c("deleted %s data %d", "t_cr", Integer.valueOf(C5849w.m4301a().m4314a("t_cr", string)));
        } catch (Throwable th) {
            if (C5791al.m3929a(th)) {
                return;
            }
            th.printStackTrace();
        }
    }

    /* renamed from: b */
    private static void m4036b(List<C5797ar> list) {
        List<CrashDetailBean> listM4039c = m4039c(list);
        if (listM4039c == null || listM4039c.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (CrashDetailBean crashDetailBean : listM4039c) {
            String str = f4063l.get(Integer.valueOf(crashDetailBean.f3807b));
            if (!TextUtils.isEmpty(str)) {
                C5791al.m3932c("find expired data,crashId:%s eventType:%s", crashDetailBean.f3808c, str);
                arrayList.add(new C5786ag.c(crashDetailBean.f3808c, str, crashDetailBean.f3823r, false, 0L, "expired", null));
            }
        }
        C5786ag.a.f3959a.m3889a(arrayList);
    }

    /* renamed from: a */
    private static CrashDetailBean m4009a(List<C5797ar> list, CrashDetailBean crashDetailBean) {
        CrashDetailBean crashDetailBean2;
        List<CrashDetailBean> listM4039c;
        if (list.isEmpty()) {
            return crashDetailBean;
        }
        ArrayList arrayList = new ArrayList(10);
        for (C5797ar c5797ar : list) {
            if (c5797ar.f4056e) {
                arrayList.add(c5797ar);
            }
        }
        if (arrayList.isEmpty() || (listM4039c = m4039c(arrayList)) == null || listM4039c.isEmpty()) {
            crashDetailBean2 = null;
        } else {
            Collections.sort(listM4039c);
            crashDetailBean2 = listM4039c.get(0);
            m4016a(crashDetailBean2, listM4039c);
        }
        if (crashDetailBean2 == null) {
            crashDetailBean.f3815j = true;
            crashDetailBean.f3825t = 0;
            crashDetailBean.f3824s = "";
            crashDetailBean2 = crashDetailBean;
        }
        m4032b(crashDetailBean2, list);
        if (crashDetailBean2.f3823r != crashDetailBean.f3823r) {
            String str = crashDetailBean2.f3824s;
            StringBuilder sb = new StringBuilder();
            sb.append(crashDetailBean.f3823r);
            if (!str.contains(sb.toString())) {
                crashDetailBean2.f3825t++;
                crashDetailBean2.f3824s += crashDetailBean.f3823r + SignParameters.NEW_LINE;
            }
        }
        return crashDetailBean2;
    }

    /* renamed from: c */
    private static List<CrashDetailBean> m4039c(List<C5797ar> list) {
        Cursor cursorM4316a;
        if (list == null || list.size() == 0) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("_id in (");
        Iterator<C5797ar> it = list.iterator();
        while (it.hasNext()) {
            sb.append(it.next().f4052a);
            sb.append(",");
        }
        if (sb.toString().contains(",")) {
            sb = new StringBuilder(sb.substring(0, sb.lastIndexOf(",")));
        }
        sb.append(")");
        String string = sb.toString();
        sb.setLength(0);
        try {
            cursorM4316a = C5849w.m4301a().m4316a("t_cr", (String[]) null, string);
            if (cursorM4316a == null) {
                return null;
            }
            try {
                ArrayList arrayList = new ArrayList();
                sb.append("_id in (");
                int i6 = 0;
                while (cursorM4316a.moveToNext()) {
                    CrashDetailBean crashDetailBeanM4008a = m4008a(cursorM4316a);
                    if (crashDetailBeanM4008a != null) {
                        arrayList.add(crashDetailBeanM4008a);
                    } else {
                        try {
                            sb.append(cursorM4316a.getLong(cursorM4316a.getColumnIndex("_id")));
                            sb.append(",");
                            i6++;
                        } catch (Throwable unused) {
                            C5791al.m3933d("unknown id!", new Object[0]);
                        }
                    }
                }
                if (sb.toString().contains(",")) {
                    sb = new StringBuilder(sb.substring(0, sb.lastIndexOf(",")));
                }
                sb.append(")");
                String string2 = sb.toString();
                if (i6 > 0) {
                    C5791al.m3933d("deleted %s illegal data %d", "t_cr", Integer.valueOf(C5849w.m4301a().m4314a("t_cr", string2)));
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

    /* renamed from: e */
    private static String m4043e(CrashDetailBean crashDetailBean) {
        try {
            Pair<String, String> pair = f4059h.get(Integer.valueOf(crashDetailBean.f3807b));
            if (pair == null) {
                C5791al.m3934e("crash type error! %d", Integer.valueOf(crashDetailBean.f3807b));
                return "";
            }
            if (crashDetailBean.f3815j) {
                return (String) pair.first;
            }
            return (String) pair.second;
        } catch (Exception e6) {
            C5791al.m3929a(e6);
            return "";
        }
    }

    /* renamed from: d */
    private boolean m4042d(CrashDetailBean crashDetailBean) {
        String absolutePath;
        try {
            C5791al.m3932c("save eup logs", new Object[0]);
            C5780aa c5780aaM3795b = C5780aa.m3795b();
            String str = "#--------\npackage:" + c5780aaM3795b.m3808e() + "\nversion:" + c5780aaM3795b.f3927o + "\nsdk:" + c5780aaM3795b.f3920h + "\nprocess:" + crashDetailBean.f3779A + "\ndate:" + C5795ap.m3970a(new Date(crashDetailBean.f3823r)) + "\ntype:" + crashDetailBean.f3819n + "\nmessage:" + crashDetailBean.f3820o + "\nstack:\n" + crashDetailBean.f3822q + "\neupID:" + crashDetailBean.f3808c + SignParameters.NEW_LINE;
            if (C5799at.f4087m == null) {
                if (Environment.getExternalStorageState().equals("mounted")) {
                    absolutePath = Environment.getExternalStorageDirectory().getAbsolutePath() + "/Tencent/" + this.f4064b.getPackageName();
                } else {
                    absolutePath = null;
                }
            } else {
                File file = new File(C5799at.f4087m);
                if (file.isFile()) {
                    file = file.getParentFile();
                }
                absolutePath = file.getAbsolutePath();
            }
            C5792am.m3940a(absolutePath + "/euplog.txt", str, C5799at.f4088n);
            return true;
        } catch (Throwable th) {
            C5791al.m3933d("rqdp{  save error} %s", th.toString());
            if (!C5791al.m3929a(th)) {
                th.printStackTrace();
            }
            return false;
        }
    }

    /* renamed from: b */
    public final void m4049b(CrashDetailBean crashDetailBean, boolean z6) {
        if (C5799at.f4089o) {
            C5791al.m3928a("try to upload right now", new Object[0]);
            ArrayList arrayList = new ArrayList();
            arrayList.add(crashDetailBean);
            m4046a(arrayList, 3000L, z6, crashDetailBean.f3807b == 7, z6);
            return;
        }
        C5791al.m3928a("do not upload spot crash right now, crash would be uploaded when app next start", new Object[0]);
    }

    /* renamed from: b */
    public final void m4048b(CrashDetailBean crashDetailBean) {
        if (crashDetailBean == null) {
            return;
        }
        ContentValues contentValuesM4038c = m4038c(crashDetailBean);
        if (contentValuesM4038c != null) {
            long jM4315a = C5849w.m4301a().m4315a("t_cr", contentValuesM4038c, (InterfaceC5848v) null);
            if (jM4315a >= 0) {
                C5791al.m3932c("insert %s success!", "t_cr");
                crashDetailBean.f3805a = jM4315a;
            }
        }
        if (C5799at.f4086l) {
            m4042d(crashDetailBean);
        }
    }

    /* renamed from: a */
    private static void m4016a(CrashDetailBean crashDetailBean, List<CrashDetailBean> list) {
        String[] strArrSplit;
        StringBuilder sb = new StringBuilder(128);
        for (int i6 = 1; i6 < list.size(); i6++) {
            String str = list.get(i6).f3824s;
            if (str != null && (strArrSplit = str.split(SignParameters.NEW_LINE)) != null) {
                for (String str2 : strArrSplit) {
                    if (!crashDetailBean.f3824s.contains(str2)) {
                        crashDetailBean.f3825t++;
                        sb.append(str2);
                        sb.append(SignParameters.NEW_LINE);
                    }
                }
            }
        }
        crashDetailBean.f3824s += sb.toString();
    }

    /* renamed from: b */
    private static C5797ar m4030b(Cursor cursor) {
        if (cursor == null) {
            return null;
        }
        try {
            C5797ar c5797ar = new C5797ar();
            c5797ar.f4052a = cursor.getLong(cursor.getColumnIndex("_id"));
            c5797ar.f4053b = cursor.getLong(cursor.getColumnIndex("_tm"));
            c5797ar.f4054c = cursor.getString(cursor.getColumnIndex("_s1"));
            c5797ar.f4055d = cursor.getInt(cursor.getColumnIndex("_up")) == 1;
            c5797ar.f4056e = cursor.getInt(cursor.getColumnIndex("_me")) == 1;
            c5797ar.f4057f = cursor.getInt(cursor.getColumnIndex("_uc"));
            return c5797ar;
        } catch (Throwable th) {
            if (!C5791al.m3929a(th)) {
                th.printStackTrace();
            }
            return null;
        }
    }

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
    public final boolean m4047a(com.tencent.bugly.crashreport.crash.CrashDetailBean r19, boolean r20) {
        /*
            Method dump skipped, instructions count: 637
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.bugly.proguard.C5798as.m4047a(com.tencent.bugly.crashreport.crash.CrashDetailBean, boolean):boolean");
    }

    /* renamed from: b */
    private static List<C5797ar> m4031b() {
        ArrayList arrayList = new ArrayList();
        Cursor cursor = null;
        try {
            Cursor cursorM4316a = C5849w.m4301a().m4316a("t_cr", new String[]{"_id", "_tm", "_s1", "_up", "_me", "_uc"}, (String) null);
            if (cursorM4316a == null) {
                if (cursorM4316a != null) {
                    cursorM4316a.close();
                }
                return null;
            }
            try {
                if (cursorM4316a.getCount() <= 0) {
                    cursorM4316a.close();
                    return arrayList;
                }
                StringBuilder sb = new StringBuilder();
                sb.append("_id in (");
                int i6 = 0;
                while (cursorM4316a.moveToNext()) {
                    C5797ar c5797arM4030b = m4030b(cursorM4316a);
                    if (c5797arM4030b != null) {
                        arrayList.add(c5797arM4030b);
                    } else {
                        try {
                            sb.append(cursorM4316a.getLong(cursorM4316a.getColumnIndex("_id")));
                            sb.append(",");
                            i6++;
                        } catch (Throwable unused) {
                            C5791al.m3933d("unknown id!", new Object[0]);
                        }
                    }
                }
                if (sb.toString().contains(",")) {
                    sb = new StringBuilder(sb.substring(0, sb.lastIndexOf(",")));
                }
                sb.append(")");
                String string = sb.toString();
                sb.setLength(0);
                if (i6 > 0) {
                    C5791al.m3933d("deleted %s illegal data %d", "t_cr", Integer.valueOf(C5849w.m4301a().m4314a("t_cr", string)));
                }
                cursorM4316a.close();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                cursor = cursorM4316a;
                try {
                    if (!C5791al.m3929a(th)) {
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

    /* renamed from: c */
    private static void m4040c(ArrayList<C5820bn> arrayList, String str) {
        if (C5795ap.m3991b(str)) {
            return;
        }
        try {
            C5820bn c5820bn = new C5820bn((byte) 1, "crashInfos.txt", str.getBytes("utf-8"));
            C5791al.m3932c("attach crash infos", new Object[0]);
            arrayList.add(c5820bn);
        } catch (Exception e6) {
            e6.printStackTrace();
            C5791al.m3929a(e6);
        }
    }

    /* renamed from: b */
    private static void m4034b(ArrayList<C5820bn> arrayList, String str) {
        if (str != null) {
            try {
                arrayList.add(new C5820bn((byte) 1, "jniLog.txt", str.getBytes("utf-8")));
            } catch (Exception e6) {
                e6.printStackTrace();
                C5791al.m3929a(e6);
            }
        }
    }

    /* renamed from: b */
    private static void m4033b(ArrayList<C5820bn> arrayList, CrashDetailBean crashDetailBean, Context context) {
        String str;
        if (crashDetailBean.f3807b == 1 && (str = crashDetailBean.f3827v) != null) {
            try {
                C5820bn c5820bnM4010a = m4010a("tomb.zip", context, str);
                if (c5820bnM4010a != null) {
                    C5791al.m3932c("attach tombs", new Object[0]);
                    arrayList.add(c5820bnM4010a);
                }
            } catch (Exception e6) {
                C5791al.m3929a(e6);
            }
        }
    }

    /* renamed from: b */
    private static void m4035b(ArrayList<C5820bn> arrayList, byte[] bArr) {
        if (bArr == null || bArr.length <= 0) {
            return;
        }
        try {
            arrayList.add(new C5820bn((byte) 1, "userExtraByteData", bArr));
            C5791al.m3932c("attach extraData", new Object[0]);
        } catch (Exception e6) {
            C5791al.m3929a(e6);
        }
    }

    /* renamed from: b */
    private boolean m4037b(CrashDetailBean crashDetailBean, List<C5797ar> list, List<C5797ar> list2) {
        boolean z6;
        int i6 = crashDetailBean.f3807b;
        boolean z7 = i6 == 0 || i6 == 1;
        boolean z8 = i6 == 3;
        if (C5842p.f4357c) {
            z6 = false;
        } else {
            z6 = (z8 || z7) ? C5799at.f4079e : true;
        }
        if (!z6) {
            return false;
        }
        ArrayList arrayList = new ArrayList(10);
        if (!m4028a(crashDetailBean, list, arrayList)) {
            try {
                if (arrayList.size() >= C5799at.f4078d) {
                }
            } catch (Exception e6) {
                C5791al.m3929a(e6);
                C5791al.m3933d("Failed to merge crash.", new Object[0]);
            }
            return false;
        }
        C5791al.m3928a("same crash occur too much do merged!", new Object[0]);
        CrashDetailBean crashDetailBeanM4009a = m4009a((List<C5797ar>) arrayList, crashDetailBean);
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            C5797ar c5797ar = (C5797ar) obj;
            if (c5797ar.f4052a != crashDetailBeanM4009a.f3805a) {
                list2.add(c5797ar);
            }
        }
        m4048b(crashDetailBeanM4009a);
        m4041d(list2);
        C5791al.m3930b("[crash] save crash success. For this device crash many times, it will not upload crashes immediately", new Object[0]);
        return true;
    }

    /* renamed from: a */
    private static boolean m4029a(String str) {
        String str2 = C5799at.f4092r;
        if (str2 != null && !str2.isEmpty()) {
            try {
                C5791al.m3932c("Crash regular filter for crash stack is: %s", C5799at.f4092r);
                if (Pattern.compile(C5799at.f4092r).matcher(str).find()) {
                    C5791al.m3933d("This crash matches the regular filter string set. It will not be record and upload.", new Object[0]);
                    return true;
                }
            } catch (Exception e6) {
                C5791al.m3929a(e6);
                C5791al.m3933d("Failed to compile " + C5799at.f4092r, new Object[0]);
            }
        }
        return false;
    }

    /* renamed from: a */
    private static boolean m4028a(CrashDetailBean crashDetailBean, List<C5797ar> list, List<C5797ar> list2) {
        boolean z6 = false;
        for (C5797ar c5797ar : list) {
            if (crashDetailBean.f3826u.equals(c5797ar.f4054c)) {
                if (c5797ar.f4056e) {
                    z6 = true;
                }
                list2.add(c5797ar);
            }
        }
        return z6;
    }

    /* renamed from: a */
    public static List<CrashDetailBean> m4013a() {
        StrategyBean strategyBeanM3866c = C5782ac.m3857a().m3866c();
        if (strategyBeanM3866c == null) {
            C5791al.m3933d("have not synced remote!", new Object[0]);
            return null;
        }
        if (!strategyBeanM3866c.f3761f) {
            C5791al.m3933d("Crashreport remote closed, please check your APP ID correct and Version available, then uninstall and reinstall your app.", new Object[0]);
            C5791al.m3930b("[init] WARNING! Crashreport closed by server, please check your APP ID correct and Version available, then uninstall and reinstall your app.", new Object[0]);
            return null;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        long jM3983b = C5795ap.m3983b();
        List<C5797ar> listM4031b = m4031b();
        C5791al.m3932c("Size of crash list loaded from DB: %s", Integer.valueOf(listM4031b.size()));
        if (listM4031b.size() <= 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        arrayList.addAll(m4014a(listM4031b));
        listM4031b.removeAll(arrayList);
        Iterator<C5797ar> it = listM4031b.iterator();
        while (it.hasNext()) {
            C5797ar next = it.next();
            long j6 = next.f4053b;
            if (j6 < jM3983b - C5799at.f4084j) {
                arrayList2.add(next);
                it.remove();
                arrayList.add(next);
            } else if (next.f4055d) {
                if (j6 >= jCurrentTimeMillis - CalendarModelKt.MillisecondsIn24Hours) {
                    it.remove();
                } else if (!next.f4056e) {
                    it.remove();
                    arrayList.add(next);
                }
            } else if (next.f4057f >= 3 && j6 < jCurrentTimeMillis - CalendarModelKt.MillisecondsIn24Hours) {
                it.remove();
                arrayList.add(next);
            }
        }
        m4036b(arrayList2);
        if (arrayList.size() > 0) {
            m4041d(arrayList);
        }
        ArrayList arrayList3 = new ArrayList();
        List<CrashDetailBean> listM4039c = m4039c(listM4031b);
        if (listM4039c != null && listM4039c.size() > 0) {
            String str = C5780aa.m3795b().f3927o;
            Iterator<CrashDetailBean> it2 = listM4039c.iterator();
            while (it2.hasNext()) {
                CrashDetailBean next2 = it2.next();
                if (!str.equals(next2.f3811f)) {
                    it2.remove();
                    arrayList3.add(next2);
                }
            }
        }
        if (arrayList3.size() > 0) {
            m4044e(arrayList3);
        }
        return listM4039c;
    }

    /* renamed from: a */
    public final void m4045a(CrashDetailBean crashDetailBean) {
        int i6 = crashDetailBean.f3807b;
        if (i6 != 0) {
            if (i6 != 1) {
                if (i6 == 3 && !C5799at.m4051a().m4067k()) {
                    return;
                }
            } else if (!C5799at.m4051a().m4066j()) {
                return;
            }
        } else if (!C5799at.m4051a().m4066j()) {
            return;
        }
        if (this.f4068f != null) {
            C5791al.m3932c("Calling 'onCrashHandleEnd' of RQD crash listener.", new Object[0]);
        }
    }

    /* renamed from: a */
    public final void m4046a(final List<CrashDetailBean> list, long j6, final boolean z6, boolean z7, boolean z8) {
        if (!C5780aa.m3793a(this.f4064b).f3918f) {
            C5791al.m3933d("warn: not upload process", new Object[0]);
            return;
        }
        C5788ai c5788ai = this.f4065c;
        if (c5788ai == null) {
            C5791al.m3933d("warn: upload manager is null", new Object[0]);
            return;
        }
        if (!z8 && !c5788ai.m3910b(C5799at.f4076a)) {
            C5791al.m3933d("warn: not crashHappen or not should upload", new Object[0]);
            return;
        }
        StrategyBean strategyBeanM3866c = this.f4067e.m3866c();
        if (!strategyBeanM3866c.f3761f) {
            C5791al.m3933d("remote report is disable!", new Object[0]);
            C5791al.m3930b("[crash] server closed bugly in this app. please check your appid if is correct, and re-install it", new Object[0]);
            return;
        }
        if (list != null && list.size() != 0) {
            try {
                String str = strategyBeanM3866c.f3773r;
                String str2 = StrategyBean.f3757b;
                C5822bp c5822bpM4012a = m4012a(this.f4064b, list, C5780aa.m3795b());
                if (c5822bpM4012a == null) {
                    C5791al.m3933d("create eupPkg fail!", new Object[0]);
                    return;
                }
                byte[] bArrM3875a = C5784ae.m3875a((AbstractC5839m) c5822bpM4012a);
                if (bArrM3875a == null) {
                    C5791al.m3933d("send encode fail!", new Object[0]);
                    return;
                }
                C5823bq c5823bqM3871a = C5784ae.m3871a(this.f4064b, 830, bArrM3875a);
                if (c5823bqM3871a == null) {
                    C5791al.m3933d("request package is null.", new Object[0]);
                    return;
                }
                final long jCurrentTimeMillis = System.currentTimeMillis();
                InterfaceC5787ah interfaceC5787ah = new InterfaceC5787ah() { // from class: com.tencent.bugly.proguard.as.6
                    @Override // com.tencent.bugly.proguard.InterfaceC5787ah
                    /* renamed from: a */
                    public final void mo3892a(boolean z9, String str3) {
                        C5798as.m4025a(list, z9, System.currentTimeMillis() - jCurrentTimeMillis, z6 ? "realtime" : "cache", str3);
                        C5798as.m4027a(z9, (List<CrashDetailBean>) list);
                    }
                };
                if (z6) {
                    this.f4065c.m3907a(f4058a, c5823bqM3871a, str, str2, interfaceC5787ah, j6, z7);
                    return;
                } else {
                    this.f4065c.m3908a(f4058a, c5823bqM3871a, str, str2, interfaceC5787ah, false);
                    return;
                }
            } catch (Throwable th) {
                C5791al.m3934e("req cr error %s", th.toString());
                if (C5791al.m3931b(th)) {
                    return;
                }
                th.printStackTrace();
                return;
            }
        }
        C5791al.m3933d("warn: crashList is null or crashList num is 0", new Object[0]);
    }

    /* renamed from: a */
    public static void m4027a(boolean z6, List<CrashDetailBean> list) {
        if (list != null && list.size() > 0) {
            C5791al.m3932c("up finish update state %b", Boolean.valueOf(z6));
            for (CrashDetailBean crashDetailBean : list) {
                C5791al.m3932c("pre uid:%s uc:%d re:%b me:%b", crashDetailBean.f3808c, Integer.valueOf(crashDetailBean.f3817l), Boolean.valueOf(crashDetailBean.f3809d), Boolean.valueOf(crashDetailBean.f3815j));
                int i6 = crashDetailBean.f3817l + 1;
                crashDetailBean.f3817l = i6;
                crashDetailBean.f3809d = z6;
                C5791al.m3932c("set uid:%s uc:%d re:%b me:%b", crashDetailBean.f3808c, Integer.valueOf(i6), Boolean.valueOf(crashDetailBean.f3809d), Boolean.valueOf(crashDetailBean.f3815j));
            }
            Iterator<CrashDetailBean> it = list.iterator();
            while (it.hasNext()) {
                C5799at.m4051a().m4056a(it.next());
            }
            C5791al.m3932c("update state size %d", Integer.valueOf(list.size()));
        }
        if (z6) {
            return;
        }
        C5791al.m3930b("[crash] upload fail.", new Object[0]);
    }

    /* renamed from: a */
    private static CrashDetailBean m4008a(Cursor cursor) {
        if (cursor == null) {
            return null;
        }
        try {
            byte[] blob = cursor.getBlob(cursor.getColumnIndex("_dt"));
            if (blob == null) {
                return null;
            }
            long j6 = cursor.getLong(cursor.getColumnIndex("_id"));
            CrashDetailBean crashDetailBean = (CrashDetailBean) C5795ap.m3962a(blob, CrashDetailBean.CREATOR);
            if (crashDetailBean == null) {
                return crashDetailBean;
            }
            crashDetailBean.f3805a = j6;
            return crashDetailBean;
        } catch (Throwable th) {
            if (!C5791al.m3929a(th)) {
                th.printStackTrace();
            }
            return null;
        }
    }

    /* renamed from: a */
    private static C5821bo m4011a(Context context, CrashDetailBean crashDetailBean, C5780aa c5780aa) {
        ArrayList<C5818bl> arrayList = null;
        if (context != null && crashDetailBean != null && c5780aa != null) {
            C5821bo c5821bo = new C5821bo();
            c5821bo.f4225a = m4043e(crashDetailBean);
            c5821bo.f4226b = crashDetailBean.f3823r;
            c5821bo.f4227c = crashDetailBean.f3819n;
            c5821bo.f4228d = crashDetailBean.f3820o;
            c5821bo.f4229e = crashDetailBean.f3821p;
            c5821bo.f4231g = crashDetailBean.f3822q;
            c5821bo.f4232h = crashDetailBean.f3831z;
            c5821bo.f4233i = crashDetailBean.f3808c;
            c5821bo.f4234j = null;
            c5821bo.f4236l = crashDetailBean.f3818m;
            c5821bo.f4237m = crashDetailBean.f3810e;
            c5821bo.f4230f = crashDetailBean.f3780B;
            c5821bo.f4238n = null;
            Map<String, PlugInBean> map = crashDetailBean.f3813h;
            if (map != null && !map.isEmpty()) {
                arrayList = new ArrayList<>(crashDetailBean.f3813h.size());
                for (Map.Entry<String, PlugInBean> entry : crashDetailBean.f3813h.entrySet()) {
                    C5818bl c5818bl = new C5818bl();
                    c5818bl.f4205a = entry.getValue().f3753a;
                    c5818bl.f4207c = entry.getValue().f3755c;
                    c5818bl.f4209e = entry.getValue().f3754b;
                    arrayList.add(c5818bl);
                }
            }
            c5821bo.f4240p = arrayList;
            C5791al.m3932c("libInfo %s", c5821bo.f4239o);
            ArrayList<C5820bn> arrayList2 = new ArrayList<>(20);
            m4019a(arrayList2, crashDetailBean);
            m4021a(arrayList2, crashDetailBean.f3828w);
            m4034b(arrayList2, crashDetailBean.f3829x);
            m4040c(arrayList2, crashDetailBean.f3804Z);
            m4022a(arrayList2, crashDetailBean.f3806aa, context);
            m4024a(arrayList2, crashDetailBean.f3830y);
            m4020a(arrayList2, crashDetailBean, context);
            m4033b(arrayList2, crashDetailBean, context);
            m4023a(arrayList2, c5780aa.f3875L);
            m4035b(arrayList2, crashDetailBean.f3803Y);
            c5821bo.f4241q = arrayList2;
            if (crashDetailBean.f3815j) {
                c5821bo.f4235k = crashDetailBean.f3825t;
            }
            c5821bo.f4242r = m4015a(crashDetailBean, c5780aa);
            c5821bo.f4243s = new HashMap();
            Map<String, String> map2 = crashDetailBean.f3797S;
            if (map2 != null && map2.size() > 0) {
                c5821bo.f4243s.putAll(crashDetailBean.f3797S);
                C5791al.m3928a("setted message size %d", Integer.valueOf(c5821bo.f4243s.size()));
            }
            Map<String, String> map3 = c5821bo.f4243s;
            C5791al.m3932c("pss:" + crashDetailBean.f3787I + " vss:" + crashDetailBean.f3788J + " javaHeap:" + crashDetailBean.f3789K, new Object[0]);
            StringBuilder sb = new StringBuilder();
            sb.append(crashDetailBean.f3787I);
            map3.put("SDK_UPLOAD_U1", sb.toString());
            StringBuilder sb2 = new StringBuilder();
            sb2.append(crashDetailBean.f3788J);
            map3.put("SDK_UPLOAD_U2", sb2.toString());
            StringBuilder sb3 = new StringBuilder();
            sb3.append(crashDetailBean.f3789K);
            map3.put("SDK_UPLOAD_U3", sb3.toString());
            C5791al.m3932c("%s rid:%s sess:%s ls:%ds isR:%b isF:%b isM:%b isN:%b mc:%d ,%s ,isUp:%b ,vm:%d", crashDetailBean.f3819n, crashDetailBean.f3808c, c5780aa.m3806d(), Long.valueOf((crashDetailBean.f3823r - crashDetailBean.f3795Q) / 1000), Boolean.valueOf(crashDetailBean.f3816k), Boolean.valueOf(crashDetailBean.f3796R), Boolean.valueOf(crashDetailBean.f3815j), Boolean.valueOf(crashDetailBean.f3807b == 1), Integer.valueOf(crashDetailBean.f3825t), crashDetailBean.f3824s, Boolean.valueOf(crashDetailBean.f3809d), Integer.valueOf(c5821bo.f4242r.size()));
            return c5821bo;
        }
        C5791al.m3933d("enExp args == null", new Object[0]);
        return null;
    }

    /* renamed from: a */
    private static C5822bp m4012a(Context context, List<CrashDetailBean> list, C5780aa c5780aa) {
        if (context != null && list != null && list.size() != 0 && c5780aa != null) {
            C5822bp c5822bp = new C5822bp();
            c5822bp.f4247a = new ArrayList<>();
            Iterator<CrashDetailBean> it = list.iterator();
            while (it.hasNext()) {
                c5822bp.f4247a.add(m4011a(context, it.next(), c5780aa));
            }
            return c5822bp;
        }
        C5791al.m3933d("enEXPPkg args == null!", new Object[0]);
        return null;
    }

    /* renamed from: a */
    private static C5820bn m4010a(String str, Context context, String str2) throws IOException {
        FileInputStream fileInputStream;
        if (str2 != null && context != null) {
            C5791al.m3932c("zip %s", str2);
            File file = new File(str2);
            File file2 = new File(context.getCacheDir(), str);
            if (!C5795ap.m3978a(file, file2)) {
                C5791al.m3933d("zip fail!", new Object[0]);
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
                    int i6 = fileInputStream.read(bArr);
                    if (i6 <= 0) {
                        break;
                    }
                    byteArrayOutputStream.write(bArr, 0, i6);
                    byteArrayOutputStream.flush();
                }
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                C5791al.m3932c("read bytes :%d", Integer.valueOf(byteArray.length));
                C5820bn c5820bn = new C5820bn((byte) 2, file2.getName(), byteArray);
                try {
                    fileInputStream.close();
                } catch (IOException e6) {
                    if (!C5791al.m3929a(e6)) {
                        e6.printStackTrace();
                    }
                }
                if (file2.exists()) {
                    C5791al.m3932c("del tmp", new Object[0]);
                    file2.delete();
                }
                return c5820bn;
            } catch (Throwable th2) {
                th = th2;
                try {
                    if (!C5791al.m3929a(th)) {
                        th.printStackTrace();
                    }
                    if (fileInputStream != null) {
                        try {
                            fileInputStream.close();
                        } catch (IOException e7) {
                            if (!C5791al.m3929a(e7)) {
                                e7.printStackTrace();
                            }
                        }
                    }
                    if (file2.exists()) {
                        C5791al.m3932c("del tmp", new Object[0]);
                        file2.delete();
                    }
                    return null;
                } catch (Throwable th3) {
                    if (fileInputStream != null) {
                        try {
                            fileInputStream.close();
                        } catch (IOException e8) {
                            if (!C5791al.m3929a(e8)) {
                                e8.printStackTrace();
                            }
                        }
                    }
                    if (file2.exists()) {
                        C5791al.m3932c("del tmp", new Object[0]);
                        file2.delete();
                    }
                    throw th3;
                }
            }
        }
        C5791al.m3933d("rqdp{  createZipAttachment sourcePath == null || context == null ,pls check}", new Object[0]);
        return null;
    }

    /* renamed from: a */
    public static void m4018a(String str, String str2, String str3, String str4, String str5, CrashDetailBean crashDetailBean) {
        String str6;
        C5780aa c5780aaM3795b = C5780aa.m3795b();
        if (c5780aaM3795b == null) {
            return;
        }
        C5791al.m3934e("#++++++++++Record By Bugly++++++++++#", new Object[0]);
        C5791al.m3934e("# You can use Bugly(http:\\\\bugly.qq.com) to get more Crash Detail!", new Object[0]);
        C5791al.m3934e("# PKG NAME: %s", c5780aaM3795b.f3915c);
        C5791al.m3934e("# APP VER: %s", c5780aaM3795b.f3927o);
        C5791al.m3934e("# SDK VER: %s", c5780aaM3795b.f3920h);
        C5791al.m3934e("# LAUNCH TIME: %s", C5795ap.m3970a(new Date(C5780aa.m3795b().f3889a)));
        C5791al.m3934e("# CRASH TYPE: %s", str);
        C5791al.m3934e("# CRASH TIME: %s", str2);
        C5791al.m3934e("# CRASH PROCESS: %s", str3);
        C5791al.m3934e("# CRASH FOREGROUND: %s", Boolean.valueOf(c5780aaM3795b.m3801a()));
        C5791al.m3934e("# CRASH THREAD: %s", str4);
        if (crashDetailBean != null) {
            C5791al.m3934e("# REPORT ID: %s", crashDetailBean.f3808c);
            C5791al.m3934e("# CRASH DEVICE: %s %s", c5780aaM3795b.m3814h(), c5780aaM3795b.m3823r().booleanValue() ? "ROOTED" : "UNROOT");
            C5791al.m3934e("# RUNTIME AVAIL RAM:%d ROM:%d SD:%d", Long.valueOf(crashDetailBean.f3781C), Long.valueOf(crashDetailBean.f3782D), Long.valueOf(crashDetailBean.f3783E));
            C5791al.m3934e("# RUNTIME TOTAL RAM:%d ROM:%d SD:%d", Long.valueOf(crashDetailBean.f3784F), Long.valueOf(crashDetailBean.f3785G), Long.valueOf(crashDetailBean.f3786H));
            if (!C5795ap.m3991b(crashDetailBean.f3793O)) {
                C5791al.m3934e("# EXCEPTION FIRED BY %s %s", crashDetailBean.f3793O, crashDetailBean.f3792N);
            } else if (crashDetailBean.f3807b == 3) {
                if (crashDetailBean.f3798T == null) {
                    str6 = "null";
                } else {
                    str6 = crashDetailBean.f3798T.get("BUGLY_CR_01");
                }
                C5791al.m3934e("# EXCEPTION ANR MESSAGE:\n %s", str6);
            }
        }
        if (!C5795ap.m3991b(str5)) {
            C5791al.m3934e("# CRASH STACK: ", new Object[0]);
            C5791al.m3934e(str5, new Object[0]);
        }
        C5791al.m3934e("#++++++++++++++++++++++++++++++++++++++++++#", new Object[0]);
    }

    /* renamed from: a */
    private static void m4017a(CrashDetailBean crashDetailBean, Map<String, String> map) {
        String value;
        if (map != null && !map.isEmpty()) {
            crashDetailBean.f3797S = new LinkedHashMap(map.size());
            for (Map.Entry<String, String> entry : map.entrySet()) {
                if (!C5795ap.m3991b(entry.getKey())) {
                    String key = entry.getKey();
                    if (key.length() > 100) {
                        key = key.substring(0, 100);
                        C5791al.m3933d("setted key length is over limit %d substring to %s", 100, key);
                    }
                    if (!C5795ap.m3991b(entry.getValue()) && entry.getValue().length() > 100000) {
                        value = entry.getValue().substring(entry.getValue().length() - 100000);
                        C5791al.m3933d("setted %s value length is over limit %d substring", key, 100000);
                    } else {
                        value = entry.getValue();
                    }
                    crashDetailBean.f3797S.put(key, value);
                    C5791al.m3928a("add setted key %s value size:%d", key, Integer.valueOf(value.length()));
                }
            }
            return;
        }
        C5791al.m3933d("extra map is empty. CrashBean won't have userDatas.", new Object[0]);
    }

    /* renamed from: a */
    private static void m4019a(ArrayList<C5820bn> arrayList, CrashDetailBean crashDetailBean) {
        String str;
        if (crashDetailBean.f3815j && (str = crashDetailBean.f3824s) != null && str.length() > 0) {
            try {
                arrayList.add(new C5820bn((byte) 1, "alltimes.txt", crashDetailBean.f3824s.getBytes("utf-8")));
            } catch (Exception e6) {
                e6.printStackTrace();
                C5791al.m3929a(e6);
            }
        }
    }

    /* renamed from: a */
    private static void m4021a(ArrayList<C5820bn> arrayList, String str) {
        if (str != null) {
            try {
                arrayList.add(new C5820bn((byte) 1, "log.txt", str.getBytes("utf-8")));
            } catch (Exception e6) {
                e6.printStackTrace();
                C5791al.m3929a(e6);
            }
        }
    }

    /* renamed from: a */
    private static void m4022a(ArrayList<C5820bn> arrayList, String str, Context context) {
        if (str != null) {
            try {
                C5820bn c5820bnM4010a = m4010a("backupRecord.zip", context, str);
                if (c5820bnM4010a != null) {
                    C5791al.m3932c("attach backup record", new Object[0]);
                    arrayList.add(c5820bnM4010a);
                }
            } catch (Exception e6) {
                C5791al.m3929a(e6);
            }
        }
    }

    /* renamed from: a */
    private static void m4024a(ArrayList<C5820bn> arrayList, byte[] bArr) {
        if (bArr == null || bArr.length <= 0) {
            return;
        }
        try {
            C5820bn c5820bn = new C5820bn((byte) 2, "buglylog.zip", bArr);
            C5791al.m3932c("attach user log", new Object[0]);
            arrayList.add(c5820bn);
        } catch (Exception e6) {
            C5791al.m3929a(e6);
        }
    }

    /* renamed from: a */
    private static void m4020a(ArrayList<C5820bn> arrayList, CrashDetailBean crashDetailBean, Context context) {
        C5820bn c5820bnM4010a;
        if (crashDetailBean.f3807b != 3) {
            return;
        }
        C5791al.m3932c("crashBean.anrMessages:%s", crashDetailBean.f3798T);
        try {
            Map<String, String> map = crashDetailBean.f3798T;
            if (map != null && map.containsKey("BUGLY_CR_01")) {
                if (!TextUtils.isEmpty(crashDetailBean.f3798T.get("BUGLY_CR_01"))) {
                    arrayList.add(new C5820bn((byte) 1, "anrMessage.txt", crashDetailBean.f3798T.get("BUGLY_CR_01").getBytes("utf-8")));
                    C5791al.m3932c("attach anr message", new Object[0]);
                }
                crashDetailBean.f3798T.remove("BUGLY_CR_01");
            }
            String str = crashDetailBean.f3827v;
            if (str == null || (c5820bnM4010a = m4010a("trace.zip", context, str)) == null) {
                return;
            }
            C5791al.m3932c("attach traces", new Object[0]);
            arrayList.add(c5820bnM4010a);
        } catch (Exception e6) {
            e6.printStackTrace();
            C5791al.m3929a(e6);
        }
    }

    /* renamed from: a */
    private static void m4023a(ArrayList<C5820bn> arrayList, List<String> list) {
        if (list == null || list.isEmpty()) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            sb.append(it.next());
        }
        try {
            arrayList.add(new C5820bn((byte) 1, "martianlog.txt", sb.toString().getBytes("utf-8")));
            C5791al.m3932c("attach pageTracingList", new Object[0]);
        } catch (Exception e6) {
            e6.printStackTrace();
        }
    }

    /* renamed from: a */
    private static Map<String, String> m4015a(CrashDetailBean crashDetailBean, C5780aa c5780aa) {
        HashMap map = new HashMap(30);
        try {
            StringBuilder sb = new StringBuilder();
            sb.append(crashDetailBean.f3781C);
            map.put("A9", sb.toString());
            StringBuilder sb2 = new StringBuilder();
            sb2.append(crashDetailBean.f3782D);
            map.put("A11", sb2.toString());
            StringBuilder sb3 = new StringBuilder();
            sb3.append(crashDetailBean.f3783E);
            map.put("A10", sb3.toString());
            map.put("A23", crashDetailBean.f3811f);
            StringBuilder sb4 = new StringBuilder();
            c5780aa.getClass();
            map.put("A7", sb4.toString());
            map.put("A6", C5780aa.m3796n());
            map.put("A5", c5780aa.m3819m());
            map.put("A22", c5780aa.m3812g());
            StringBuilder sb5 = new StringBuilder();
            sb5.append(crashDetailBean.f3785G);
            map.put("A2", sb5.toString());
            StringBuilder sb6 = new StringBuilder();
            sb6.append(crashDetailBean.f3784F);
            map.put("A1", sb6.toString());
            map.put("A24", c5780aa.f3923k);
            StringBuilder sb7 = new StringBuilder();
            sb7.append(crashDetailBean.f3786H);
            map.put("A17", sb7.toString());
            map.put("A25", c5780aa.m3812g());
            map.put("A15", c5780aa.m3822q());
            StringBuilder sb8 = new StringBuilder();
            sb8.append(c5780aa.m3823r());
            map.put("A13", sb8.toString());
            map.put("A34", crashDetailBean.f3779A);
            if (c5780aa.f3870G != null) {
                map.put("productIdentify", c5780aa.f3870G);
            }
            map.put("A26", URLEncoder.encode(crashDetailBean.f3790L, "utf-8"));
            if (crashDetailBean.f3807b == 1) {
                map.put("A27", crashDetailBean.f3793O);
                map.put("A28", crashDetailBean.f3792N);
                StringBuilder sb9 = new StringBuilder();
                sb9.append(crashDetailBean.f3816k);
                map.put("A29", sb9.toString());
            }
            map.put("A30", crashDetailBean.f3794P);
            StringBuilder sb10 = new StringBuilder();
            sb10.append(crashDetailBean.f3795Q);
            map.put("A18", sb10.toString());
            StringBuilder sb11 = new StringBuilder();
            sb11.append(true ^ crashDetailBean.f3796R);
            map.put("A36", sb11.toString());
            StringBuilder sb12 = new StringBuilder();
            sb12.append(c5780aa.f3938z);
            map.put("F02", sb12.toString());
            StringBuilder sb13 = new StringBuilder();
            sb13.append(c5780aa.f3864A);
            map.put("F03", sb13.toString());
            map.put("F04", c5780aa.m3806d());
            StringBuilder sb14 = new StringBuilder();
            sb14.append(c5780aa.f3865B);
            map.put("F05", sb14.toString());
            map.put("F06", c5780aa.f3937y);
            map.put("F08", c5780aa.f3868E);
            map.put("F09", c5780aa.f3869F);
            StringBuilder sb15 = new StringBuilder();
            sb15.append(c5780aa.f3866C);
            map.put("F10", sb15.toString());
            m4026a(map, crashDetailBean);
            return map;
        } catch (Exception e6) {
            e6.printStackTrace();
            C5791al.m3929a(e6);
            return map;
        }
    }

    /* renamed from: a */
    private static void m4026a(Map<String, String> map, CrashDetailBean crashDetailBean) {
        if (crashDetailBean.f3799U >= 0) {
            StringBuilder sb = new StringBuilder();
            sb.append(crashDetailBean.f3799U);
            map.put("C01", sb.toString());
        }
        if (crashDetailBean.f3800V >= 0) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(crashDetailBean.f3800V);
            map.put("C02", sb2.toString());
        }
        Map<String, String> map2 = crashDetailBean.f3801W;
        if (map2 != null && map2.size() > 0) {
            for (Map.Entry<String, String> entry : crashDetailBean.f3801W.entrySet()) {
                map.put("C03_" + entry.getKey(), entry.getValue());
            }
        }
        Map<String, String> map3 = crashDetailBean.f3802X;
        if (map3 == null || map3.size() <= 0) {
            return;
        }
        for (Map.Entry<String, String> entry2 : crashDetailBean.f3802X.entrySet()) {
            map.put("C04_" + entry2.getKey(), entry2.getValue());
        }
    }

    /* renamed from: a */
    public static /* synthetic */ void m4025a(List list, boolean z6, long j6, String str, String str2) {
        if (list == null || list.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            CrashDetailBean crashDetailBean = (CrashDetailBean) it.next();
            String str3 = f4063l.get(Integer.valueOf(crashDetailBean.f3807b));
            if (!TextUtils.isEmpty(str3)) {
                arrayList.add(new C5786ag.c(crashDetailBean.f3808c, str3, crashDetailBean.f3823r, z6, j6, str, str2));
            }
        }
        C5786ag.a.f3959a.m3889a(arrayList);
    }
}
