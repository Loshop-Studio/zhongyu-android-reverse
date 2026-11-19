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
import com.tencent.bugly.proguard.C6409ag;
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
/* loaded from: classes4.dex */
public final class C6421as {

    /* renamed from: a */
    public static int f5337a;

    /* renamed from: h */
    private static final Map<Integer, Pair<String, String>> f5338h = new HashMap<Integer, Pair<String, String>>() { // from class: com.tencent.bugly.proguard.as.1
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
    private static final ArrayList<a> f5339i = new ArrayList<a>() { // from class: com.tencent.bugly.proguard.as.2
        {
            byte b10 = 0;
            add(new b(b10));
            add(new c(b10));
            add(new d(b10));
            add(new e(b10));
            add(new h(b10));
            add(new i(b10));
            add(new f(b10));
            add(new g(b10));
        }
    };

    /* renamed from: j */
    private static final Map<Integer, Integer> f5340j = new HashMap<Integer, Integer>() { // from class: com.tencent.bugly.proguard.as.3
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
    private static final Map<Integer, String> f5341k = new HashMap<Integer, String>() { // from class: com.tencent.bugly.proguard.as.4
        {
            put(3, "BuglyAnrCrash");
            put(0, "BuglyJavaCrash");
            put(1, "BuglyNativeCrash");
        }
    };

    /* renamed from: l */
    private static final Map<Integer, String> f5342l = new HashMap<Integer, String>() { // from class: com.tencent.bugly.proguard.as.5
        {
            put(3, "BuglyAnrCrashReport");
            put(0, "BuglyJavaCrashReport");
            put(1, "BuglyNativeCrashReport");
        }
    };

    /* renamed from: b */
    protected final Context f5343b;

    /* renamed from: c */
    protected final C6411ai f5344c;

    /* renamed from: d */
    protected final C6472w f5345d;

    /* renamed from: e */
    protected final C6405ac f5346e;

    /* renamed from: f */
    protected InterfaceC6425aw f5347f;

    /* renamed from: g */
    protected BuglyStrategy.C6388a f5348g;

    /* renamed from: com.tencent.bugly.proguard.as$a */
    public static abstract class a {

        /* renamed from: a */
        final int f5353a;

        public /* synthetic */ a(int i10, byte b10) {
            this(i10);
        }

        /* renamed from: a */
        public abstract boolean mo5045a();

        private a(int i10) {
            this.f5353a = i10;
        }
    }

    /* renamed from: com.tencent.bugly.proguard.as$b */
    public static class b extends a {
        public /* synthetic */ b(byte b10) {
            this();
        }

        @Override // com.tencent.bugly.proguard.C6421as.a
        /* renamed from: a */
        public final boolean mo5045a() {
            return C6422at.m5046a().m5062k();
        }

        private b() {
            super(3, (byte) 0);
        }
    }

    /* renamed from: com.tencent.bugly.proguard.as$c */
    public static class c extends a {
        public /* synthetic */ c(byte b10) {
            this();
        }

        @Override // com.tencent.bugly.proguard.C6421as.a
        /* renamed from: a */
        public final boolean mo5045a() {
            return true;
        }

        private c() {
            super(7, (byte) 0);
        }
    }

    /* renamed from: com.tencent.bugly.proguard.as$d */
    public static class d extends a {
        public /* synthetic */ d(byte b10) {
            this();
        }

        @Override // com.tencent.bugly.proguard.C6421as.a
        /* renamed from: a */
        public final boolean mo5045a() {
            return true;
        }

        private d() {
            super(2, (byte) 0);
        }
    }

    /* renamed from: com.tencent.bugly.proguard.as$e */
    public static class e extends a {
        public /* synthetic */ e(byte b10) {
            this();
        }

        @Override // com.tencent.bugly.proguard.C6421as.a
        /* renamed from: a */
        public final boolean mo5045a() {
            return C6422at.m5046a().m5061j();
        }

        /* JADX WARN: Illegal instructions before constructor call */
        private e() {
            byte b10 = 0;
            super(b10, b10);
        }
    }

    /* renamed from: com.tencent.bugly.proguard.as$f */
    public static class f extends a {
        public /* synthetic */ f(byte b10) {
            this();
        }

        @Override // com.tencent.bugly.proguard.C6421as.a
        /* renamed from: a */
        public final boolean mo5045a() {
            return (C6422at.m5046a().f5373B & 2) > 0;
        }

        private f() {
            super(5, (byte) 0);
        }
    }

    /* renamed from: com.tencent.bugly.proguard.as$g */
    public static class g extends a {
        public /* synthetic */ g(byte b10) {
            this();
        }

        @Override // com.tencent.bugly.proguard.C6421as.a
        /* renamed from: a */
        public final boolean mo5045a() {
            return (C6422at.m5046a().f5373B & 1) > 0;
        }

        private g() {
            super(6, (byte) 0);
        }
    }

    /* renamed from: com.tencent.bugly.proguard.as$h */
    public static class h extends a {
        public /* synthetic */ h(byte b10) {
            this();
        }

        @Override // com.tencent.bugly.proguard.C6421as.a
        /* renamed from: a */
        public final boolean mo5045a() {
            return C6422at.m5046a().m5061j();
        }

        private h() {
            super(1, (byte) 0);
        }
    }

    /* renamed from: com.tencent.bugly.proguard.as$i */
    public static class i extends a {
        public /* synthetic */ i(byte b10) {
            this();
        }

        @Override // com.tencent.bugly.proguard.C6421as.a
        /* renamed from: a */
        public final boolean mo5045a() {
            return (C6422at.m5046a().f5373B & 4) > 0;
        }

        private i() {
            super(4, (byte) 0);
        }
    }

    public C6421as(Context context, C6411ai c6411ai, C6472w c6472w, C6405ac c6405ac, BuglyStrategy.C6388a c6388a) {
        f5337a = 1004;
        this.f5343b = context;
        this.f5344c = c6411ai;
        this.f5345d = c6472w;
        this.f5346e = c6405ac;
        this.f5348g = c6388a;
        this.f5347f = null;
    }

    /* renamed from: a */
    private static List<C6420ar> m5009a(List<C6420ar> list) {
        if (list == null || list.size() == 0) {
            return null;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        ArrayList arrayList = new ArrayList();
        for (C6420ar c6420ar : list) {
            if (c6420ar.f5334d && c6420ar.f5332b <= jCurrentTimeMillis - CalendarModelKt.MillisecondsIn24Hours) {
                arrayList.add(c6420ar);
            }
        }
        return arrayList;
    }

    /* renamed from: b */
    private static void m5027b(CrashDetailBean crashDetailBean, List<C6420ar> list) {
        StringBuilder sb = new StringBuilder(64);
        for (C6420ar c6420ar : list) {
            if (!c6420ar.f5335e && !c6420ar.f5334d) {
                String str = crashDetailBean.f5103s;
                StringBuilder sb2 = new StringBuilder();
                sb2.append(c6420ar.f5332b);
                if (!str.contains(sb2.toString())) {
                    crashDetailBean.f5104t++;
                    sb.append(c6420ar.f5332b);
                    sb.append(SignParameters.NEW_LINE);
                }
            }
        }
        crashDetailBean.f5103s += sb.toString();
    }

    /* renamed from: c */
    private static ContentValues m5033c(CrashDetailBean crashDetailBean) {
        if (crashDetailBean == null) {
            return null;
        }
        try {
            ContentValues contentValues = new ContentValues();
            long j10 = crashDetailBean.f5084a;
            if (j10 > 0) {
                contentValues.put("_id", Long.valueOf(j10));
            }
            contentValues.put("_tm", Long.valueOf(crashDetailBean.f5102r));
            contentValues.put("_s1", crashDetailBean.f5105u);
            contentValues.put("_up", Integer.valueOf(crashDetailBean.f5088d ? 1 : 0));
            contentValues.put("_me", Integer.valueOf(crashDetailBean.f5094j ? 1 : 0));
            contentValues.put("_uc", Integer.valueOf(crashDetailBean.f5096l));
            contentValues.put("_dt", C6418ap.m4975a(crashDetailBean));
            return contentValues;
        } catch (Throwable th) {
            if (!C6414al.m4924a(th)) {
                th.printStackTrace();
            }
            return null;
        }
    }

    /* renamed from: d */
    private static void m5036d(List<C6420ar> list) {
        if (list == null || list.size() == 0) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("_id in (");
        Iterator<C6420ar> it = list.iterator();
        while (it.hasNext()) {
            sb.append(it.next().f5331a);
            sb.append(",");
        }
        StringBuilder sb2 = new StringBuilder(sb.substring(0, sb.lastIndexOf(",")));
        sb2.append(")");
        String string = sb2.toString();
        sb2.setLength(0);
        try {
            C6414al.m4927c("deleted %s data %d", "t_cr", Integer.valueOf(C6472w.m5296a().m5309a("t_cr", string)));
        } catch (Throwable th) {
            if (C6414al.m4924a(th)) {
                return;
            }
            th.printStackTrace();
        }
    }

    /* renamed from: e */
    private static void m5039e(List<CrashDetailBean> list) {
        try {
            if (list.size() == 0) {
                return;
            }
            StringBuilder sb = new StringBuilder();
            for (CrashDetailBean crashDetailBean : list) {
                sb.append(" or _id = ");
                sb.append(crashDetailBean.f5084a);
            }
            String string = sb.toString();
            if (string.length() > 0) {
                string = string.substring(4);
            }
            sb.setLength(0);
            C6414al.m4927c("deleted %s data %d", "t_cr", Integer.valueOf(C6472w.m5296a().m5309a("t_cr", string)));
        } catch (Throwable th) {
            if (C6414al.m4924a(th)) {
                return;
            }
            th.printStackTrace();
        }
    }

    /* renamed from: b */
    private static void m5031b(List<C6420ar> list) {
        List<CrashDetailBean> listM5034c = m5034c(list);
        if (listM5034c == null || listM5034c.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (CrashDetailBean crashDetailBean : listM5034c) {
            String str = f5342l.get(Integer.valueOf(crashDetailBean.f5086b));
            if (!TextUtils.isEmpty(str)) {
                C6414al.m4927c("find expired data,crashId:%s eventType:%s", crashDetailBean.f5087c, str);
                arrayList.add(new C6409ag.c(crashDetailBean.f5087c, str, crashDetailBean.f5102r, false, 0L, "expired", null));
            }
        }
        C6409ag.a.f5238a.m4884a(arrayList);
    }

    /* renamed from: a */
    private static CrashDetailBean m5004a(List<C6420ar> list, CrashDetailBean crashDetailBean) {
        CrashDetailBean crashDetailBean2;
        List<CrashDetailBean> listM5034c;
        if (list.isEmpty()) {
            return crashDetailBean;
        }
        ArrayList arrayList = new ArrayList(10);
        for (C6420ar c6420ar : list) {
            if (c6420ar.f5335e) {
                arrayList.add(c6420ar);
            }
        }
        if (arrayList.isEmpty() || (listM5034c = m5034c(arrayList)) == null || listM5034c.isEmpty()) {
            crashDetailBean2 = null;
        } else {
            Collections.sort(listM5034c);
            crashDetailBean2 = listM5034c.get(0);
            m5011a(crashDetailBean2, listM5034c);
        }
        if (crashDetailBean2 == null) {
            crashDetailBean.f5094j = true;
            crashDetailBean.f5104t = 0;
            crashDetailBean.f5103s = "";
            crashDetailBean2 = crashDetailBean;
        }
        m5027b(crashDetailBean2, list);
        if (crashDetailBean2.f5102r != crashDetailBean.f5102r) {
            String str = crashDetailBean2.f5103s;
            StringBuilder sb = new StringBuilder();
            sb.append(crashDetailBean.f5102r);
            if (!str.contains(sb.toString())) {
                crashDetailBean2.f5104t++;
                crashDetailBean2.f5103s += crashDetailBean.f5102r + SignParameters.NEW_LINE;
            }
        }
        return crashDetailBean2;
    }

    /* renamed from: c */
    private static List<CrashDetailBean> m5034c(List<C6420ar> list) {
        Cursor cursorM5311a;
        if (list == null || list.size() == 0) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("_id in (");
        Iterator<C6420ar> it = list.iterator();
        while (it.hasNext()) {
            sb.append(it.next().f5331a);
            sb.append(",");
        }
        if (sb.toString().contains(",")) {
            sb = new StringBuilder(sb.substring(0, sb.lastIndexOf(",")));
        }
        sb.append(")");
        String string = sb.toString();
        sb.setLength(0);
        try {
            cursorM5311a = C6472w.m5296a().m5311a("t_cr", (String[]) null, string);
            if (cursorM5311a == null) {
                return null;
            }
            try {
                ArrayList arrayList = new ArrayList();
                sb.append("_id in (");
                int i10 = 0;
                while (cursorM5311a.moveToNext()) {
                    CrashDetailBean crashDetailBeanM5003a = m5003a(cursorM5311a);
                    if (crashDetailBeanM5003a != null) {
                        arrayList.add(crashDetailBeanM5003a);
                    } else {
                        try {
                            sb.append(cursorM5311a.getLong(cursorM5311a.getColumnIndex("_id")));
                            sb.append(",");
                            i10++;
                        } catch (Throwable unused) {
                            C6414al.m4928d("unknown id!", new Object[0]);
                        }
                    }
                }
                if (sb.toString().contains(",")) {
                    sb = new StringBuilder(sb.substring(0, sb.lastIndexOf(",")));
                }
                sb.append(")");
                String string2 = sb.toString();
                if (i10 > 0) {
                    C6414al.m4928d("deleted %s illegal data %d", "t_cr", Integer.valueOf(C6472w.m5296a().m5309a("t_cr", string2)));
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

    /* renamed from: e */
    private static String m5038e(CrashDetailBean crashDetailBean) {
        try {
            Pair<String, String> pair = f5338h.get(Integer.valueOf(crashDetailBean.f5086b));
            if (pair == null) {
                C6414al.m4929e("crash type error! %d", Integer.valueOf(crashDetailBean.f5086b));
                return "";
            }
            if (crashDetailBean.f5094j) {
                return (String) pair.first;
            }
            return (String) pair.second;
        } catch (Exception e10) {
            C6414al.m4924a(e10);
            return "";
        }
    }

    /* renamed from: d */
    private boolean m5037d(CrashDetailBean crashDetailBean) {
        String absolutePath;
        try {
            C6414al.m4927c("save eup logs", new Object[0]);
            C6403aa c6403aaM4790b = C6403aa.m4790b();
            String str = "#--------\npackage:" + c6403aaM4790b.m4803e() + "\nversion:" + c6403aaM4790b.f5206o + "\nsdk:" + c6403aaM4790b.f5199h + "\nprocess:" + crashDetailBean.f5058A + "\ndate:" + C6418ap.m4965a(new Date(crashDetailBean.f5102r)) + "\ntype:" + crashDetailBean.f5098n + "\nmessage:" + crashDetailBean.f5099o + "\nstack:\n" + crashDetailBean.f5101q + "\neupID:" + crashDetailBean.f5087c + SignParameters.NEW_LINE;
            if (C6422at.f5366m == null) {
                if (Environment.getExternalStorageState().equals("mounted")) {
                    absolutePath = Environment.getExternalStorageDirectory().getAbsolutePath() + "/Tencent/" + this.f5343b.getPackageName();
                } else {
                    absolutePath = null;
                }
            } else {
                File file = new File(C6422at.f5366m);
                if (file.isFile()) {
                    file = file.getParentFile();
                }
                absolutePath = file.getAbsolutePath();
            }
            C6415am.m4935a(absolutePath + "/euplog.txt", str, C6422at.f5367n);
            return true;
        } catch (Throwable th) {
            C6414al.m4928d("rqdp{  save error} %s", th.toString());
            if (!C6414al.m4924a(th)) {
                th.printStackTrace();
            }
            return false;
        }
    }

    /* renamed from: b */
    public final void m5044b(CrashDetailBean crashDetailBean, boolean z9) {
        if (C6422at.f5368o) {
            C6414al.m4923a("try to upload right now", new Object[0]);
            ArrayList arrayList = new ArrayList();
            arrayList.add(crashDetailBean);
            m5041a(arrayList, 3000L, z9, crashDetailBean.f5086b == 7, z9);
            return;
        }
        C6414al.m4923a("do not upload spot crash right now, crash would be uploaded when app next start", new Object[0]);
    }

    /* renamed from: b */
    public final void m5043b(CrashDetailBean crashDetailBean) {
        if (crashDetailBean == null) {
            return;
        }
        ContentValues contentValuesM5033c = m5033c(crashDetailBean);
        if (contentValuesM5033c != null) {
            long jM5310a = C6472w.m5296a().m5310a("t_cr", contentValuesM5033c, (InterfaceC6471v) null);
            if (jM5310a >= 0) {
                C6414al.m4927c("insert %s success!", "t_cr");
                crashDetailBean.f5084a = jM5310a;
            }
        }
        if (C6422at.f5365l) {
            m5037d(crashDetailBean);
        }
    }

    /* renamed from: a */
    private static void m5011a(CrashDetailBean crashDetailBean, List<CrashDetailBean> list) {
        String[] strArrSplit;
        StringBuilder sb = new StringBuilder(128);
        for (int i10 = 1; i10 < list.size(); i10++) {
            String str = list.get(i10).f5103s;
            if (str != null && (strArrSplit = str.split(SignParameters.NEW_LINE)) != null) {
                for (String str2 : strArrSplit) {
                    if (!crashDetailBean.f5103s.contains(str2)) {
                        crashDetailBean.f5104t++;
                        sb.append(str2);
                        sb.append(SignParameters.NEW_LINE);
                    }
                }
            }
        }
        crashDetailBean.f5103s += sb.toString();
    }

    /* renamed from: b */
    private static C6420ar m5025b(Cursor cursor) {
        if (cursor == null) {
            return null;
        }
        try {
            C6420ar c6420ar = new C6420ar();
            c6420ar.f5331a = cursor.getLong(cursor.getColumnIndex("_id"));
            c6420ar.f5332b = cursor.getLong(cursor.getColumnIndex("_tm"));
            c6420ar.f5333c = cursor.getString(cursor.getColumnIndex("_s1"));
            c6420ar.f5334d = cursor.getInt(cursor.getColumnIndex("_up")) == 1;
            c6420ar.f5335e = cursor.getInt(cursor.getColumnIndex("_me")) == 1;
            c6420ar.f5336f = cursor.getInt(cursor.getColumnIndex("_uc"));
            return c6420ar;
        } catch (Throwable th) {
            if (!C6414al.m4924a(th)) {
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
    public final boolean m5042a(com.tencent.bugly.crashreport.crash.CrashDetailBean r19, boolean r20) {
        /*
            Method dump skipped, instructions count: 637
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.bugly.proguard.C6421as.m5042a(com.tencent.bugly.crashreport.crash.CrashDetailBean, boolean):boolean");
    }

    /* renamed from: b */
    private static List<C6420ar> m5026b() {
        ArrayList arrayList = new ArrayList();
        Cursor cursor = null;
        try {
            Cursor cursorM5311a = C6472w.m5296a().m5311a("t_cr", new String[]{"_id", "_tm", "_s1", "_up", "_me", "_uc"}, (String) null);
            if (cursorM5311a == null) {
                if (cursorM5311a != null) {
                    cursorM5311a.close();
                }
                return null;
            }
            try {
                if (cursorM5311a.getCount() <= 0) {
                    cursorM5311a.close();
                    return arrayList;
                }
                StringBuilder sb = new StringBuilder();
                sb.append("_id in (");
                int i10 = 0;
                while (cursorM5311a.moveToNext()) {
                    C6420ar c6420arM5025b = m5025b(cursorM5311a);
                    if (c6420arM5025b != null) {
                        arrayList.add(c6420arM5025b);
                    } else {
                        try {
                            sb.append(cursorM5311a.getLong(cursorM5311a.getColumnIndex("_id")));
                            sb.append(",");
                            i10++;
                        } catch (Throwable unused) {
                            C6414al.m4928d("unknown id!", new Object[0]);
                        }
                    }
                }
                if (sb.toString().contains(",")) {
                    sb = new StringBuilder(sb.substring(0, sb.lastIndexOf(",")));
                }
                sb.append(")");
                String string = sb.toString();
                sb.setLength(0);
                if (i10 > 0) {
                    C6414al.m4928d("deleted %s illegal data %d", "t_cr", Integer.valueOf(C6472w.m5296a().m5309a("t_cr", string)));
                }
                cursorM5311a.close();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                cursor = cursorM5311a;
                try {
                    if (!C6414al.m4924a(th)) {
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
    private static void m5035c(ArrayList<C6443bn> arrayList, String str) {
        if (C6418ap.m4986b(str)) {
            return;
        }
        try {
            C6443bn c6443bn = new C6443bn((byte) 1, "crashInfos.txt", str.getBytes("utf-8"));
            C6414al.m4927c("attach crash infos", new Object[0]);
            arrayList.add(c6443bn);
        } catch (Exception e10) {
            e10.printStackTrace();
            C6414al.m4924a(e10);
        }
    }

    /* renamed from: b */
    private static void m5029b(ArrayList<C6443bn> arrayList, String str) {
        if (str != null) {
            try {
                arrayList.add(new C6443bn((byte) 1, "jniLog.txt", str.getBytes("utf-8")));
            } catch (Exception e10) {
                e10.printStackTrace();
                C6414al.m4924a(e10);
            }
        }
    }

    /* renamed from: b */
    private static void m5028b(ArrayList<C6443bn> arrayList, CrashDetailBean crashDetailBean, Context context) {
        String str;
        if (crashDetailBean.f5086b == 1 && (str = crashDetailBean.f5106v) != null) {
            try {
                C6443bn c6443bnM5005a = m5005a("tomb.zip", context, str);
                if (c6443bnM5005a != null) {
                    C6414al.m4927c("attach tombs", new Object[0]);
                    arrayList.add(c6443bnM5005a);
                }
            } catch (Exception e10) {
                C6414al.m4924a(e10);
            }
        }
    }

    /* renamed from: b */
    private static void m5030b(ArrayList<C6443bn> arrayList, byte[] bArr) {
        if (bArr == null || bArr.length <= 0) {
            return;
        }
        try {
            arrayList.add(new C6443bn((byte) 1, "userExtraByteData", bArr));
            C6414al.m4927c("attach extraData", new Object[0]);
        } catch (Exception e10) {
            C6414al.m4924a(e10);
        }
    }

    /* renamed from: b */
    private boolean m5032b(CrashDetailBean crashDetailBean, List<C6420ar> list, List<C6420ar> list2) {
        boolean z9;
        int i10 = crashDetailBean.f5086b;
        boolean z10 = i10 == 0 || i10 == 1;
        boolean z11 = i10 == 3;
        if (C6465p.f5636c) {
            z9 = false;
        } else {
            z9 = (z11 || z10) ? C6422at.f5358e : true;
        }
        if (!z9) {
            return false;
        }
        ArrayList arrayList = new ArrayList(10);
        if (!m5023a(crashDetailBean, list, arrayList)) {
            try {
                if (arrayList.size() >= C6422at.f5357d) {
                }
            } catch (Exception e10) {
                C6414al.m4924a(e10);
                C6414al.m4928d("Failed to merge crash.", new Object[0]);
            }
            return false;
        }
        C6414al.m4923a("same crash occur too much do merged!", new Object[0]);
        CrashDetailBean crashDetailBeanM5004a = m5004a((List<C6420ar>) arrayList, crashDetailBean);
        int size = arrayList.size();
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            C6420ar c6420ar = (C6420ar) obj;
            if (c6420ar.f5331a != crashDetailBeanM5004a.f5084a) {
                list2.add(c6420ar);
            }
        }
        m5043b(crashDetailBeanM5004a);
        m5036d(list2);
        C6414al.m4925b("[crash] save crash success. For this device crash many times, it will not upload crashes immediately", new Object[0]);
        return true;
    }

    /* renamed from: a */
    private static boolean m5024a(String str) {
        String str2 = C6422at.f5371r;
        if (str2 != null && !str2.isEmpty()) {
            try {
                C6414al.m4927c("Crash regular filter for crash stack is: %s", C6422at.f5371r);
                if (Pattern.compile(C6422at.f5371r).matcher(str).find()) {
                    C6414al.m4928d("This crash matches the regular filter string set. It will not be record and upload.", new Object[0]);
                    return true;
                }
            } catch (Exception e10) {
                C6414al.m4924a(e10);
                C6414al.m4928d("Failed to compile " + C6422at.f5371r, new Object[0]);
            }
        }
        return false;
    }

    /* renamed from: a */
    private static boolean m5023a(CrashDetailBean crashDetailBean, List<C6420ar> list, List<C6420ar> list2) {
        boolean z9 = false;
        for (C6420ar c6420ar : list) {
            if (crashDetailBean.f5105u.equals(c6420ar.f5333c)) {
                if (c6420ar.f5335e) {
                    z9 = true;
                }
                list2.add(c6420ar);
            }
        }
        return z9;
    }

    /* renamed from: a */
    public static List<CrashDetailBean> m5008a() {
        StrategyBean strategyBeanM4861c = C6405ac.m4852a().m4861c();
        if (strategyBeanM4861c == null) {
            C6414al.m4928d("have not synced remote!", new Object[0]);
            return null;
        }
        if (!strategyBeanM4861c.f5040f) {
            C6414al.m4928d("Crashreport remote closed, please check your APP ID correct and Version available, then uninstall and reinstall your app.", new Object[0]);
            C6414al.m4925b("[init] WARNING! Crashreport closed by server, please check your APP ID correct and Version available, then uninstall and reinstall your app.", new Object[0]);
            return null;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        long jM4978b = C6418ap.m4978b();
        List<C6420ar> listM5026b = m5026b();
        C6414al.m4927c("Size of crash list loaded from DB: %s", Integer.valueOf(listM5026b.size()));
        if (listM5026b.size() <= 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        arrayList.addAll(m5009a(listM5026b));
        listM5026b.removeAll(arrayList);
        Iterator<C6420ar> it = listM5026b.iterator();
        while (it.hasNext()) {
            C6420ar next = it.next();
            long j10 = next.f5332b;
            if (j10 < jM4978b - C6422at.f5363j) {
                arrayList2.add(next);
                it.remove();
                arrayList.add(next);
            } else if (next.f5334d) {
                if (j10 >= jCurrentTimeMillis - CalendarModelKt.MillisecondsIn24Hours) {
                    it.remove();
                } else if (!next.f5335e) {
                    it.remove();
                    arrayList.add(next);
                }
            } else if (next.f5336f >= 3 && j10 < jCurrentTimeMillis - CalendarModelKt.MillisecondsIn24Hours) {
                it.remove();
                arrayList.add(next);
            }
        }
        m5031b(arrayList2);
        if (arrayList.size() > 0) {
            m5036d(arrayList);
        }
        ArrayList arrayList3 = new ArrayList();
        List<CrashDetailBean> listM5034c = m5034c(listM5026b);
        if (listM5034c != null && listM5034c.size() > 0) {
            String str = C6403aa.m4790b().f5206o;
            Iterator<CrashDetailBean> it2 = listM5034c.iterator();
            while (it2.hasNext()) {
                CrashDetailBean next2 = it2.next();
                if (!str.equals(next2.f5090f)) {
                    it2.remove();
                    arrayList3.add(next2);
                }
            }
        }
        if (arrayList3.size() > 0) {
            m5039e(arrayList3);
        }
        return listM5034c;
    }

    /* renamed from: a */
    public final void m5040a(CrashDetailBean crashDetailBean) {
        int i10 = crashDetailBean.f5086b;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 == 3 && !C6422at.m5046a().m5062k()) {
                    return;
                }
            } else if (!C6422at.m5046a().m5061j()) {
                return;
            }
        } else if (!C6422at.m5046a().m5061j()) {
            return;
        }
        if (this.f5347f != null) {
            C6414al.m4927c("Calling 'onCrashHandleEnd' of RQD crash listener.", new Object[0]);
        }
    }

    /* renamed from: a */
    public final void m5041a(final List<CrashDetailBean> list, long j10, final boolean z9, boolean z10, boolean z11) {
        if (!C6403aa.m4788a(this.f5343b).f5197f) {
            C6414al.m4928d("warn: not upload process", new Object[0]);
            return;
        }
        C6411ai c6411ai = this.f5344c;
        if (c6411ai == null) {
            C6414al.m4928d("warn: upload manager is null", new Object[0]);
            return;
        }
        if (!z11 && !c6411ai.m4905b(C6422at.f5355a)) {
            C6414al.m4928d("warn: not crashHappen or not should upload", new Object[0]);
            return;
        }
        StrategyBean strategyBeanM4861c = this.f5346e.m4861c();
        if (!strategyBeanM4861c.f5040f) {
            C6414al.m4928d("remote report is disable!", new Object[0]);
            C6414al.m4925b("[crash] server closed bugly in this app. please check your appid if is correct, and re-install it", new Object[0]);
            return;
        }
        if (list != null && list.size() != 0) {
            try {
                String str = strategyBeanM4861c.f5052r;
                String str2 = StrategyBean.f5036b;
                C6445bp c6445bpM5007a = m5007a(this.f5343b, list, C6403aa.m4790b());
                if (c6445bpM5007a == null) {
                    C6414al.m4928d("create eupPkg fail!", new Object[0]);
                    return;
                }
                byte[] bArrM4870a = C6407ae.m4870a((AbstractC6462m) c6445bpM5007a);
                if (bArrM4870a == null) {
                    C6414al.m4928d("send encode fail!", new Object[0]);
                    return;
                }
                C6446bq c6446bqM4866a = C6407ae.m4866a(this.f5343b, 830, bArrM4870a);
                if (c6446bqM4866a == null) {
                    C6414al.m4928d("request package is null.", new Object[0]);
                    return;
                }
                final long jCurrentTimeMillis = System.currentTimeMillis();
                InterfaceC6410ah interfaceC6410ah = new InterfaceC6410ah() { // from class: com.tencent.bugly.proguard.as.6
                    @Override // com.tencent.bugly.proguard.InterfaceC6410ah
                    /* renamed from: a */
                    public final void mo4887a(boolean z12, String str3) {
                        C6421as.m5020a(list, z12, System.currentTimeMillis() - jCurrentTimeMillis, z9 ? "realtime" : "cache", str3);
                        C6421as.m5022a(z12, (List<CrashDetailBean>) list);
                    }
                };
                if (z9) {
                    this.f5344c.m4902a(f5337a, c6446bqM4866a, str, str2, interfaceC6410ah, j10, z10);
                    return;
                } else {
                    this.f5344c.m4903a(f5337a, c6446bqM4866a, str, str2, interfaceC6410ah, false);
                    return;
                }
            } catch (Throwable th) {
                C6414al.m4929e("req cr error %s", th.toString());
                if (C6414al.m4926b(th)) {
                    return;
                }
                th.printStackTrace();
                return;
            }
        }
        C6414al.m4928d("warn: crashList is null or crashList num is 0", new Object[0]);
    }

    /* renamed from: a */
    public static void m5022a(boolean z9, List<CrashDetailBean> list) {
        if (list != null && list.size() > 0) {
            C6414al.m4927c("up finish update state %b", Boolean.valueOf(z9));
            for (CrashDetailBean crashDetailBean : list) {
                C6414al.m4927c("pre uid:%s uc:%d re:%b me:%b", crashDetailBean.f5087c, Integer.valueOf(crashDetailBean.f5096l), Boolean.valueOf(crashDetailBean.f5088d), Boolean.valueOf(crashDetailBean.f5094j));
                int i10 = crashDetailBean.f5096l + 1;
                crashDetailBean.f5096l = i10;
                crashDetailBean.f5088d = z9;
                C6414al.m4927c("set uid:%s uc:%d re:%b me:%b", crashDetailBean.f5087c, Integer.valueOf(i10), Boolean.valueOf(crashDetailBean.f5088d), Boolean.valueOf(crashDetailBean.f5094j));
            }
            Iterator<CrashDetailBean> it = list.iterator();
            while (it.hasNext()) {
                C6422at.m5046a().m5051a(it.next());
            }
            C6414al.m4927c("update state size %d", Integer.valueOf(list.size()));
        }
        if (z9) {
            return;
        }
        C6414al.m4925b("[crash] upload fail.", new Object[0]);
    }

    /* renamed from: a */
    private static CrashDetailBean m5003a(Cursor cursor) {
        if (cursor == null) {
            return null;
        }
        try {
            byte[] blob = cursor.getBlob(cursor.getColumnIndex("_dt"));
            if (blob == null) {
                return null;
            }
            long j10 = cursor.getLong(cursor.getColumnIndex("_id"));
            CrashDetailBean crashDetailBean = (CrashDetailBean) C6418ap.m4957a(blob, CrashDetailBean.CREATOR);
            if (crashDetailBean == null) {
                return crashDetailBean;
            }
            crashDetailBean.f5084a = j10;
            return crashDetailBean;
        } catch (Throwable th) {
            if (!C6414al.m4924a(th)) {
                th.printStackTrace();
            }
            return null;
        }
    }

    /* renamed from: a */
    private static C6444bo m5006a(Context context, CrashDetailBean crashDetailBean, C6403aa c6403aa) {
        ArrayList<C6441bl> arrayList = null;
        if (context != null && crashDetailBean != null && c6403aa != null) {
            C6444bo c6444bo = new C6444bo();
            c6444bo.f5504a = m5038e(crashDetailBean);
            c6444bo.f5505b = crashDetailBean.f5102r;
            c6444bo.f5506c = crashDetailBean.f5098n;
            c6444bo.f5507d = crashDetailBean.f5099o;
            c6444bo.f5508e = crashDetailBean.f5100p;
            c6444bo.f5510g = crashDetailBean.f5101q;
            c6444bo.f5511h = crashDetailBean.f5110z;
            c6444bo.f5512i = crashDetailBean.f5087c;
            c6444bo.f5513j = null;
            c6444bo.f5515l = crashDetailBean.f5097m;
            c6444bo.f5516m = crashDetailBean.f5089e;
            c6444bo.f5509f = crashDetailBean.f5059B;
            c6444bo.f5517n = null;
            Map<String, PlugInBean> map = crashDetailBean.f5092h;
            if (map != null && !map.isEmpty()) {
                arrayList = new ArrayList<>(crashDetailBean.f5092h.size());
                for (Map.Entry<String, PlugInBean> entry : crashDetailBean.f5092h.entrySet()) {
                    C6441bl c6441bl = new C6441bl();
                    c6441bl.f5484a = entry.getValue().f5032a;
                    c6441bl.f5486c = entry.getValue().f5034c;
                    c6441bl.f5488e = entry.getValue().f5033b;
                    arrayList.add(c6441bl);
                }
            }
            c6444bo.f5519p = arrayList;
            C6414al.m4927c("libInfo %s", c6444bo.f5518o);
            ArrayList<C6443bn> arrayList2 = new ArrayList<>(20);
            m5014a(arrayList2, crashDetailBean);
            m5016a(arrayList2, crashDetailBean.f5107w);
            m5029b(arrayList2, crashDetailBean.f5108x);
            m5035c(arrayList2, crashDetailBean.f5083Z);
            m5017a(arrayList2, crashDetailBean.f5085aa, context);
            m5019a(arrayList2, crashDetailBean.f5109y);
            m5015a(arrayList2, crashDetailBean, context);
            m5028b(arrayList2, crashDetailBean, context);
            m5018a(arrayList2, c6403aa.f5154L);
            m5030b(arrayList2, crashDetailBean.f5082Y);
            c6444bo.f5520q = arrayList2;
            if (crashDetailBean.f5094j) {
                c6444bo.f5514k = crashDetailBean.f5104t;
            }
            c6444bo.f5521r = m5010a(crashDetailBean, c6403aa);
            c6444bo.f5522s = new HashMap();
            Map<String, String> map2 = crashDetailBean.f5076S;
            if (map2 != null && map2.size() > 0) {
                c6444bo.f5522s.putAll(crashDetailBean.f5076S);
                C6414al.m4923a("setted message size %d", Integer.valueOf(c6444bo.f5522s.size()));
            }
            Map<String, String> map3 = c6444bo.f5522s;
            C6414al.m4927c("pss:" + crashDetailBean.f5066I + " vss:" + crashDetailBean.f5067J + " javaHeap:" + crashDetailBean.f5068K, new Object[0]);
            StringBuilder sb = new StringBuilder();
            sb.append(crashDetailBean.f5066I);
            map3.put("SDK_UPLOAD_U1", sb.toString());
            StringBuilder sb2 = new StringBuilder();
            sb2.append(crashDetailBean.f5067J);
            map3.put("SDK_UPLOAD_U2", sb2.toString());
            StringBuilder sb3 = new StringBuilder();
            sb3.append(crashDetailBean.f5068K);
            map3.put("SDK_UPLOAD_U3", sb3.toString());
            C6414al.m4927c("%s rid:%s sess:%s ls:%ds isR:%b isF:%b isM:%b isN:%b mc:%d ,%s ,isUp:%b ,vm:%d", crashDetailBean.f5098n, crashDetailBean.f5087c, c6403aa.m4801d(), Long.valueOf((crashDetailBean.f5102r - crashDetailBean.f5074Q) / 1000), Boolean.valueOf(crashDetailBean.f5095k), Boolean.valueOf(crashDetailBean.f5075R), Boolean.valueOf(crashDetailBean.f5094j), Boolean.valueOf(crashDetailBean.f5086b == 1), Integer.valueOf(crashDetailBean.f5104t), crashDetailBean.f5103s, Boolean.valueOf(crashDetailBean.f5088d), Integer.valueOf(c6444bo.f5521r.size()));
            return c6444bo;
        }
        C6414al.m4928d("enExp args == null", new Object[0]);
        return null;
    }

    /* renamed from: a */
    private static C6445bp m5007a(Context context, List<CrashDetailBean> list, C6403aa c6403aa) {
        if (context != null && list != null && list.size() != 0 && c6403aa != null) {
            C6445bp c6445bp = new C6445bp();
            c6445bp.f5526a = new ArrayList<>();
            Iterator<CrashDetailBean> it = list.iterator();
            while (it.hasNext()) {
                c6445bp.f5526a.add(m5006a(context, it.next(), c6403aa));
            }
            return c6445bp;
        }
        C6414al.m4928d("enEXPPkg args == null!", new Object[0]);
        return null;
    }

    /* renamed from: a */
    private static C6443bn m5005a(String str, Context context, String str2) throws IOException {
        FileInputStream fileInputStream;
        if (str2 != null && context != null) {
            C6414al.m4927c("zip %s", str2);
            File file = new File(str2);
            File file2 = new File(context.getCacheDir(), str);
            if (!C6418ap.m4973a(file, file2)) {
                C6414al.m4928d("zip fail!", new Object[0]);
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
                    int i10 = fileInputStream.read(bArr);
                    if (i10 <= 0) {
                        break;
                    }
                    byteArrayOutputStream.write(bArr, 0, i10);
                    byteArrayOutputStream.flush();
                }
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                C6414al.m4927c("read bytes :%d", Integer.valueOf(byteArray.length));
                C6443bn c6443bn = new C6443bn((byte) 2, file2.getName(), byteArray);
                try {
                    fileInputStream.close();
                } catch (IOException e10) {
                    if (!C6414al.m4924a(e10)) {
                        e10.printStackTrace();
                    }
                }
                if (file2.exists()) {
                    C6414al.m4927c("del tmp", new Object[0]);
                    file2.delete();
                }
                return c6443bn;
            } catch (Throwable th2) {
                th = th2;
                try {
                    if (!C6414al.m4924a(th)) {
                        th.printStackTrace();
                    }
                    if (fileInputStream != null) {
                        try {
                            fileInputStream.close();
                        } catch (IOException e11) {
                            if (!C6414al.m4924a(e11)) {
                                e11.printStackTrace();
                            }
                        }
                    }
                    if (file2.exists()) {
                        C6414al.m4927c("del tmp", new Object[0]);
                        file2.delete();
                    }
                    return null;
                } catch (Throwable th3) {
                    if (fileInputStream != null) {
                        try {
                            fileInputStream.close();
                        } catch (IOException e12) {
                            if (!C6414al.m4924a(e12)) {
                                e12.printStackTrace();
                            }
                        }
                    }
                    if (file2.exists()) {
                        C6414al.m4927c("del tmp", new Object[0]);
                        file2.delete();
                    }
                    throw th3;
                }
            }
        }
        C6414al.m4928d("rqdp{  createZipAttachment sourcePath == null || context == null ,pls check}", new Object[0]);
        return null;
    }

    /* renamed from: a */
    public static void m5013a(String str, String str2, String str3, String str4, String str5, CrashDetailBean crashDetailBean) {
        String str6;
        C6403aa c6403aaM4790b = C6403aa.m4790b();
        if (c6403aaM4790b == null) {
            return;
        }
        C6414al.m4929e("#++++++++++Record By Bugly++++++++++#", new Object[0]);
        C6414al.m4929e("# You can use Bugly(http:\\\\bugly.qq.com) to get more Crash Detail!", new Object[0]);
        C6414al.m4929e("# PKG NAME: %s", c6403aaM4790b.f5194c);
        C6414al.m4929e("# APP VER: %s", c6403aaM4790b.f5206o);
        C6414al.m4929e("# SDK VER: %s", c6403aaM4790b.f5199h);
        C6414al.m4929e("# LAUNCH TIME: %s", C6418ap.m4965a(new Date(C6403aa.m4790b().f5168a)));
        C6414al.m4929e("# CRASH TYPE: %s", str);
        C6414al.m4929e("# CRASH TIME: %s", str2);
        C6414al.m4929e("# CRASH PROCESS: %s", str3);
        C6414al.m4929e("# CRASH FOREGROUND: %s", Boolean.valueOf(c6403aaM4790b.m4796a()));
        C6414al.m4929e("# CRASH THREAD: %s", str4);
        if (crashDetailBean != null) {
            C6414al.m4929e("# REPORT ID: %s", crashDetailBean.f5087c);
            C6414al.m4929e("# CRASH DEVICE: %s %s", c6403aaM4790b.m4809h(), c6403aaM4790b.m4818r().booleanValue() ? "ROOTED" : "UNROOT");
            C6414al.m4929e("# RUNTIME AVAIL RAM:%d ROM:%d SD:%d", Long.valueOf(crashDetailBean.f5060C), Long.valueOf(crashDetailBean.f5061D), Long.valueOf(crashDetailBean.f5062E));
            C6414al.m4929e("# RUNTIME TOTAL RAM:%d ROM:%d SD:%d", Long.valueOf(crashDetailBean.f5063F), Long.valueOf(crashDetailBean.f5064G), Long.valueOf(crashDetailBean.f5065H));
            if (!C6418ap.m4986b(crashDetailBean.f5072O)) {
                C6414al.m4929e("# EXCEPTION FIRED BY %s %s", crashDetailBean.f5072O, crashDetailBean.f5071N);
            } else if (crashDetailBean.f5086b == 3) {
                if (crashDetailBean.f5077T == null) {
                    str6 = "null";
                } else {
                    str6 = crashDetailBean.f5077T.get("BUGLY_CR_01");
                }
                C6414al.m4929e("# EXCEPTION ANR MESSAGE:\n %s", str6);
            }
        }
        if (!C6418ap.m4986b(str5)) {
            C6414al.m4929e("# CRASH STACK: ", new Object[0]);
            C6414al.m4929e(str5, new Object[0]);
        }
        C6414al.m4929e("#++++++++++++++++++++++++++++++++++++++++++#", new Object[0]);
    }

    /* renamed from: a */
    private static void m5012a(CrashDetailBean crashDetailBean, Map<String, String> map) {
        String value;
        if (map != null && !map.isEmpty()) {
            crashDetailBean.f5076S = new LinkedHashMap(map.size());
            for (Map.Entry<String, String> entry : map.entrySet()) {
                if (!C6418ap.m4986b(entry.getKey())) {
                    String key = entry.getKey();
                    if (key.length() > 100) {
                        key = key.substring(0, 100);
                        C6414al.m4928d("setted key length is over limit %d substring to %s", 100, key);
                    }
                    if (!C6418ap.m4986b(entry.getValue()) && entry.getValue().length() > 100000) {
                        value = entry.getValue().substring(entry.getValue().length() - 100000);
                        C6414al.m4928d("setted %s value length is over limit %d substring", key, 100000);
                    } else {
                        value = entry.getValue();
                    }
                    crashDetailBean.f5076S.put(key, value);
                    C6414al.m4923a("add setted key %s value size:%d", key, Integer.valueOf(value.length()));
                }
            }
            return;
        }
        C6414al.m4928d("extra map is empty. CrashBean won't have userDatas.", new Object[0]);
    }

    /* renamed from: a */
    private static void m5014a(ArrayList<C6443bn> arrayList, CrashDetailBean crashDetailBean) {
        String str;
        if (crashDetailBean.f5094j && (str = crashDetailBean.f5103s) != null && str.length() > 0) {
            try {
                arrayList.add(new C6443bn((byte) 1, "alltimes.txt", crashDetailBean.f5103s.getBytes("utf-8")));
            } catch (Exception e10) {
                e10.printStackTrace();
                C6414al.m4924a(e10);
            }
        }
    }

    /* renamed from: a */
    private static void m5016a(ArrayList<C6443bn> arrayList, String str) {
        if (str != null) {
            try {
                arrayList.add(new C6443bn((byte) 1, "log.txt", str.getBytes("utf-8")));
            } catch (Exception e10) {
                e10.printStackTrace();
                C6414al.m4924a(e10);
            }
        }
    }

    /* renamed from: a */
    private static void m5017a(ArrayList<C6443bn> arrayList, String str, Context context) {
        if (str != null) {
            try {
                C6443bn c6443bnM5005a = m5005a("backupRecord.zip", context, str);
                if (c6443bnM5005a != null) {
                    C6414al.m4927c("attach backup record", new Object[0]);
                    arrayList.add(c6443bnM5005a);
                }
            } catch (Exception e10) {
                C6414al.m4924a(e10);
            }
        }
    }

    /* renamed from: a */
    private static void m5019a(ArrayList<C6443bn> arrayList, byte[] bArr) {
        if (bArr == null || bArr.length <= 0) {
            return;
        }
        try {
            C6443bn c6443bn = new C6443bn((byte) 2, "buglylog.zip", bArr);
            C6414al.m4927c("attach user log", new Object[0]);
            arrayList.add(c6443bn);
        } catch (Exception e10) {
            C6414al.m4924a(e10);
        }
    }

    /* renamed from: a */
    private static void m5015a(ArrayList<C6443bn> arrayList, CrashDetailBean crashDetailBean, Context context) {
        C6443bn c6443bnM5005a;
        if (crashDetailBean.f5086b != 3) {
            return;
        }
        C6414al.m4927c("crashBean.anrMessages:%s", crashDetailBean.f5077T);
        try {
            Map<String, String> map = crashDetailBean.f5077T;
            if (map != null && map.containsKey("BUGLY_CR_01")) {
                if (!TextUtils.isEmpty(crashDetailBean.f5077T.get("BUGLY_CR_01"))) {
                    arrayList.add(new C6443bn((byte) 1, "anrMessage.txt", crashDetailBean.f5077T.get("BUGLY_CR_01").getBytes("utf-8")));
                    C6414al.m4927c("attach anr message", new Object[0]);
                }
                crashDetailBean.f5077T.remove("BUGLY_CR_01");
            }
            String str = crashDetailBean.f5106v;
            if (str == null || (c6443bnM5005a = m5005a("trace.zip", context, str)) == null) {
                return;
            }
            C6414al.m4927c("attach traces", new Object[0]);
            arrayList.add(c6443bnM5005a);
        } catch (Exception e10) {
            e10.printStackTrace();
            C6414al.m4924a(e10);
        }
    }

    /* renamed from: a */
    private static void m5018a(ArrayList<C6443bn> arrayList, List<String> list) {
        if (list == null || list.isEmpty()) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            sb.append(it.next());
        }
        try {
            arrayList.add(new C6443bn((byte) 1, "martianlog.txt", sb.toString().getBytes("utf-8")));
            C6414al.m4927c("attach pageTracingList", new Object[0]);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    /* renamed from: a */
    private static Map<String, String> m5010a(CrashDetailBean crashDetailBean, C6403aa c6403aa) {
        HashMap map = new HashMap(30);
        try {
            StringBuilder sb = new StringBuilder();
            sb.append(crashDetailBean.f5060C);
            map.put("A9", sb.toString());
            StringBuilder sb2 = new StringBuilder();
            sb2.append(crashDetailBean.f5061D);
            map.put("A11", sb2.toString());
            StringBuilder sb3 = new StringBuilder();
            sb3.append(crashDetailBean.f5062E);
            map.put("A10", sb3.toString());
            map.put("A23", crashDetailBean.f5090f);
            StringBuilder sb4 = new StringBuilder();
            c6403aa.getClass();
            map.put("A7", sb4.toString());
            map.put("A6", C6403aa.m4791n());
            map.put("A5", c6403aa.m4814m());
            map.put("A22", c6403aa.m4807g());
            StringBuilder sb5 = new StringBuilder();
            sb5.append(crashDetailBean.f5064G);
            map.put("A2", sb5.toString());
            StringBuilder sb6 = new StringBuilder();
            sb6.append(crashDetailBean.f5063F);
            map.put("A1", sb6.toString());
            map.put("A24", c6403aa.f5202k);
            StringBuilder sb7 = new StringBuilder();
            sb7.append(crashDetailBean.f5065H);
            map.put("A17", sb7.toString());
            map.put("A25", c6403aa.m4807g());
            map.put("A15", c6403aa.m4817q());
            StringBuilder sb8 = new StringBuilder();
            sb8.append(c6403aa.m4818r());
            map.put("A13", sb8.toString());
            map.put("A34", crashDetailBean.f5058A);
            if (c6403aa.f5149G != null) {
                map.put("productIdentify", c6403aa.f5149G);
            }
            map.put("A26", URLEncoder.encode(crashDetailBean.f5069L, "utf-8"));
            if (crashDetailBean.f5086b == 1) {
                map.put("A27", crashDetailBean.f5072O);
                map.put("A28", crashDetailBean.f5071N);
                StringBuilder sb9 = new StringBuilder();
                sb9.append(crashDetailBean.f5095k);
                map.put("A29", sb9.toString());
            }
            map.put("A30", crashDetailBean.f5073P);
            StringBuilder sb10 = new StringBuilder();
            sb10.append(crashDetailBean.f5074Q);
            map.put("A18", sb10.toString());
            StringBuilder sb11 = new StringBuilder();
            sb11.append(true ^ crashDetailBean.f5075R);
            map.put("A36", sb11.toString());
            StringBuilder sb12 = new StringBuilder();
            sb12.append(c6403aa.f5217z);
            map.put("F02", sb12.toString());
            StringBuilder sb13 = new StringBuilder();
            sb13.append(c6403aa.f5143A);
            map.put("F03", sb13.toString());
            map.put("F04", c6403aa.m4801d());
            StringBuilder sb14 = new StringBuilder();
            sb14.append(c6403aa.f5144B);
            map.put("F05", sb14.toString());
            map.put("F06", c6403aa.f5216y);
            map.put("F08", c6403aa.f5147E);
            map.put("F09", c6403aa.f5148F);
            StringBuilder sb15 = new StringBuilder();
            sb15.append(c6403aa.f5145C);
            map.put("F10", sb15.toString());
            m5021a(map, crashDetailBean);
            return map;
        } catch (Exception e10) {
            e10.printStackTrace();
            C6414al.m4924a(e10);
            return map;
        }
    }

    /* renamed from: a */
    private static void m5021a(Map<String, String> map, CrashDetailBean crashDetailBean) {
        if (crashDetailBean.f5078U >= 0) {
            StringBuilder sb = new StringBuilder();
            sb.append(crashDetailBean.f5078U);
            map.put("C01", sb.toString());
        }
        if (crashDetailBean.f5079V >= 0) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(crashDetailBean.f5079V);
            map.put("C02", sb2.toString());
        }
        Map<String, String> map2 = crashDetailBean.f5080W;
        if (map2 != null && map2.size() > 0) {
            for (Map.Entry<String, String> entry : crashDetailBean.f5080W.entrySet()) {
                map.put("C03_" + entry.getKey(), entry.getValue());
            }
        }
        Map<String, String> map3 = crashDetailBean.f5081X;
        if (map3 == null || map3.size() <= 0) {
            return;
        }
        for (Map.Entry<String, String> entry2 : crashDetailBean.f5081X.entrySet()) {
            map.put("C04_" + entry2.getKey(), entry2.getValue());
        }
    }

    /* renamed from: a */
    public static /* synthetic */ void m5020a(List list, boolean z9, long j10, String str, String str2) {
        if (list == null || list.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            CrashDetailBean crashDetailBean = (CrashDetailBean) it.next();
            String str3 = f5342l.get(Integer.valueOf(crashDetailBean.f5086b));
            if (!TextUtils.isEmpty(str3)) {
                arrayList.add(new C6409ag.c(crashDetailBean.f5087c, str3, crashDetailBean.f5102r, z9, j10, str, str2));
            }
        }
        C6409ag.a.f5238a.m4884a(arrayList);
    }
}
