package com.tencent.bugly.proguard;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.os.Environment;
import android.text.TextUtils;
import android.util.Pair;
import androidx.compose.material3.internal.CalendarModelKt;
import com.efs.sdk.base.protocol.file.section.AbsSection;
import com.tencent.bugly.BuglyStrategy;
import com.tencent.bugly.crashreport.common.info.PlugInBean;
import com.tencent.bugly.crashreport.common.strategy.StrategyBean;
import com.tencent.bugly.crashreport.crash.CrashDetailBean;
import com.tencent.bugly.proguard.C6669ag;
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
public final class C6681as {

    /* renamed from: a */
    public static int f5914a;

    /* renamed from: h */
    private static final Map<Integer, Pair<String, String>> f5915h = new HashMap<Integer, Pair<String, String>>() { // from class: com.tencent.bugly.proguard.as.1
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
    private static final ArrayList<a> f5916i = new ArrayList<a>() { // from class: com.tencent.bugly.proguard.as.2
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
    private static final Map<Integer, Integer> f5917j = new HashMap<Integer, Integer>() { // from class: com.tencent.bugly.proguard.as.3
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
    private static final Map<Integer, String> f5918k = new HashMap<Integer, String>() { // from class: com.tencent.bugly.proguard.as.4
        {
            put(3, "BuglyAnrCrash");
            put(0, "BuglyJavaCrash");
            put(1, "BuglyNativeCrash");
        }
    };

    /* renamed from: l */
    private static final Map<Integer, String> f5919l = new HashMap<Integer, String>() { // from class: com.tencent.bugly.proguard.as.5
        {
            put(3, "BuglyAnrCrashReport");
            put(0, "BuglyJavaCrashReport");
            put(1, "BuglyNativeCrashReport");
        }
    };

    /* renamed from: b */
    protected final Context f5920b;

    /* renamed from: c */
    protected final C6671ai f5921c;

    /* renamed from: d */
    protected final C6732w f5922d;

    /* renamed from: e */
    protected final C6665ac f5923e;

    /* renamed from: f */
    protected InterfaceC6685aw f5924f;

    /* renamed from: g */
    protected BuglyStrategy.C6648a f5925g;

    /* renamed from: com.tencent.bugly.proguard.as$a */
    public static abstract class a {

        /* renamed from: a */
        final int f5930a;

        public /* synthetic */ a(int i9, byte b10) {
            this(i9);
        }

        /* renamed from: a */
        public abstract boolean mo5224a();

        private a(int i9) {
            this.f5930a = i9;
        }
    }

    /* renamed from: com.tencent.bugly.proguard.as$b */
    public static class b extends a {
        public /* synthetic */ b(byte b10) {
            this();
        }

        @Override // com.tencent.bugly.proguard.C6681as.a
        /* renamed from: a */
        public final boolean mo5224a() {
            return C6682at.m5225a().m5241k();
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

        @Override // com.tencent.bugly.proguard.C6681as.a
        /* renamed from: a */
        public final boolean mo5224a() {
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

        @Override // com.tencent.bugly.proguard.C6681as.a
        /* renamed from: a */
        public final boolean mo5224a() {
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

        @Override // com.tencent.bugly.proguard.C6681as.a
        /* renamed from: a */
        public final boolean mo5224a() {
            return C6682at.m5225a().m5240j();
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

        @Override // com.tencent.bugly.proguard.C6681as.a
        /* renamed from: a */
        public final boolean mo5224a() {
            return (C6682at.m5225a().f5950B & 2) > 0;
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

        @Override // com.tencent.bugly.proguard.C6681as.a
        /* renamed from: a */
        public final boolean mo5224a() {
            return (C6682at.m5225a().f5950B & 1) > 0;
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

        @Override // com.tencent.bugly.proguard.C6681as.a
        /* renamed from: a */
        public final boolean mo5224a() {
            return C6682at.m5225a().m5240j();
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

        @Override // com.tencent.bugly.proguard.C6681as.a
        /* renamed from: a */
        public final boolean mo5224a() {
            return (C6682at.m5225a().f5950B & 4) > 0;
        }

        private i() {
            super(4, (byte) 0);
        }
    }

    public C6681as(Context context, C6671ai c6671ai, C6732w c6732w, C6665ac c6665ac, BuglyStrategy.C6648a c6648a) {
        f5914a = 1004;
        this.f5920b = context;
        this.f5921c = c6671ai;
        this.f5922d = c6732w;
        this.f5923e = c6665ac;
        this.f5925g = c6648a;
        this.f5924f = null;
    }

    /* renamed from: a */
    private static List<C6680ar> m5188a(List<C6680ar> list) {
        if (list == null || list.size() == 0) {
            return null;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        ArrayList arrayList = new ArrayList();
        for (C6680ar c6680ar : list) {
            if (c6680ar.f5911d && c6680ar.f5909b <= jCurrentTimeMillis - CalendarModelKt.MillisecondsIn24Hours) {
                arrayList.add(c6680ar);
            }
        }
        return arrayList;
    }

    /* renamed from: b */
    private static void m5206b(CrashDetailBean crashDetailBean, List<C6680ar> list) {
        StringBuilder sb = new StringBuilder(64);
        for (C6680ar c6680ar : list) {
            if (!c6680ar.f5912e && !c6680ar.f5911d) {
                String str = crashDetailBean.f5680s;
                StringBuilder sb2 = new StringBuilder();
                sb2.append(c6680ar.f5909b);
                if (!str.contains(sb2.toString())) {
                    crashDetailBean.f5681t++;
                    sb.append(c6680ar.f5909b);
                    sb.append(AbsSection.SEP_ORIGIN_LINE_BREAK);
                }
            }
        }
        crashDetailBean.f5680s += sb.toString();
    }

    /* renamed from: c */
    private static ContentValues m5212c(CrashDetailBean crashDetailBean) {
        if (crashDetailBean == null) {
            return null;
        }
        try {
            ContentValues contentValues = new ContentValues();
            long j9 = crashDetailBean.f5661a;
            if (j9 > 0) {
                contentValues.put("_id", Long.valueOf(j9));
            }
            contentValues.put("_tm", Long.valueOf(crashDetailBean.f5679r));
            contentValues.put("_s1", crashDetailBean.f5682u);
            contentValues.put("_up", Integer.valueOf(crashDetailBean.f5665d ? 1 : 0));
            contentValues.put("_me", Integer.valueOf(crashDetailBean.f5671j ? 1 : 0));
            contentValues.put("_uc", Integer.valueOf(crashDetailBean.f5673l));
            contentValues.put("_dt", C6678ap.m5154a(crashDetailBean));
            return contentValues;
        } catch (Throwable th) {
            if (!C6674al.m5103a(th)) {
                th.printStackTrace();
            }
            return null;
        }
    }

    /* renamed from: d */
    private static void m5215d(List<C6680ar> list) {
        if (list == null || list.size() == 0) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("_id in (");
        Iterator<C6680ar> it = list.iterator();
        while (it.hasNext()) {
            sb.append(it.next().f5908a);
            sb.append(",");
        }
        StringBuilder sb2 = new StringBuilder(sb.substring(0, sb.lastIndexOf(",")));
        sb2.append(")");
        String string = sb2.toString();
        sb2.setLength(0);
        try {
            C6674al.m5106c("deleted %s data %d", "t_cr", Integer.valueOf(C6732w.m5475a().m5488a("t_cr", string)));
        } catch (Throwable th) {
            if (C6674al.m5103a(th)) {
                return;
            }
            th.printStackTrace();
        }
    }

    /* renamed from: e */
    private static void m5218e(List<CrashDetailBean> list) {
        try {
            if (list.size() == 0) {
                return;
            }
            StringBuilder sb = new StringBuilder();
            for (CrashDetailBean crashDetailBean : list) {
                sb.append(" or _id = ");
                sb.append(crashDetailBean.f5661a);
            }
            String string = sb.toString();
            if (string.length() > 0) {
                string = string.substring(4);
            }
            sb.setLength(0);
            C6674al.m5106c("deleted %s data %d", "t_cr", Integer.valueOf(C6732w.m5475a().m5488a("t_cr", string)));
        } catch (Throwable th) {
            if (C6674al.m5103a(th)) {
                return;
            }
            th.printStackTrace();
        }
    }

    /* renamed from: b */
    private static void m5210b(List<C6680ar> list) {
        List<CrashDetailBean> listM5213c = m5213c(list);
        if (listM5213c == null || listM5213c.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (CrashDetailBean crashDetailBean : listM5213c) {
            String str = f5919l.get(Integer.valueOf(crashDetailBean.f5663b));
            if (!TextUtils.isEmpty(str)) {
                C6674al.m5106c("find expired data,crashId:%s eventType:%s", crashDetailBean.f5664c, str);
                arrayList.add(new C6669ag.c(crashDetailBean.f5664c, str, crashDetailBean.f5679r, false, 0L, "expired", null));
            }
        }
        C6669ag.a.f5815a.m5063a(arrayList);
    }

    /* renamed from: a */
    private static CrashDetailBean m5183a(List<C6680ar> list, CrashDetailBean crashDetailBean) {
        CrashDetailBean crashDetailBean2;
        List<CrashDetailBean> listM5213c;
        if (list.isEmpty()) {
            return crashDetailBean;
        }
        ArrayList arrayList = new ArrayList(10);
        for (C6680ar c6680ar : list) {
            if (c6680ar.f5912e) {
                arrayList.add(c6680ar);
            }
        }
        if (arrayList.isEmpty() || (listM5213c = m5213c(arrayList)) == null || listM5213c.isEmpty()) {
            crashDetailBean2 = null;
        } else {
            Collections.sort(listM5213c);
            crashDetailBean2 = listM5213c.get(0);
            m5190a(crashDetailBean2, listM5213c);
        }
        if (crashDetailBean2 == null) {
            crashDetailBean.f5671j = true;
            crashDetailBean.f5681t = 0;
            crashDetailBean.f5680s = "";
            crashDetailBean2 = crashDetailBean;
        }
        m5206b(crashDetailBean2, list);
        if (crashDetailBean2.f5679r != crashDetailBean.f5679r) {
            String str = crashDetailBean2.f5680s;
            StringBuilder sb = new StringBuilder();
            sb.append(crashDetailBean.f5679r);
            if (!str.contains(sb.toString())) {
                crashDetailBean2.f5681t++;
                crashDetailBean2.f5680s += crashDetailBean.f5679r + AbsSection.SEP_ORIGIN_LINE_BREAK;
            }
        }
        return crashDetailBean2;
    }

    /* renamed from: c */
    private static List<CrashDetailBean> m5213c(List<C6680ar> list) {
        Cursor cursorM5490a;
        if (list == null || list.size() == 0) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("_id in (");
        Iterator<C6680ar> it = list.iterator();
        while (it.hasNext()) {
            sb.append(it.next().f5908a);
            sb.append(",");
        }
        if (sb.toString().contains(",")) {
            sb = new StringBuilder(sb.substring(0, sb.lastIndexOf(",")));
        }
        sb.append(")");
        String string = sb.toString();
        sb.setLength(0);
        try {
            cursorM5490a = C6732w.m5475a().m5490a("t_cr", (String[]) null, string);
            if (cursorM5490a == null) {
                return null;
            }
            try {
                ArrayList arrayList = new ArrayList();
                sb.append("_id in (");
                int i9 = 0;
                while (cursorM5490a.moveToNext()) {
                    CrashDetailBean crashDetailBeanM5182a = m5182a(cursorM5490a);
                    if (crashDetailBeanM5182a != null) {
                        arrayList.add(crashDetailBeanM5182a);
                    } else {
                        try {
                            sb.append(cursorM5490a.getLong(cursorM5490a.getColumnIndex("_id")));
                            sb.append(",");
                            i9++;
                        } catch (Throwable unused) {
                            C6674al.m5107d("unknown id!", new Object[0]);
                        }
                    }
                }
                if (sb.toString().contains(",")) {
                    sb = new StringBuilder(sb.substring(0, sb.lastIndexOf(",")));
                }
                sb.append(")");
                String string2 = sb.toString();
                if (i9 > 0) {
                    C6674al.m5107d("deleted %s illegal data %d", "t_cr", Integer.valueOf(C6732w.m5475a().m5488a("t_cr", string2)));
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

    /* renamed from: e */
    private static String m5217e(CrashDetailBean crashDetailBean) {
        try {
            Pair<String, String> pair = f5915h.get(Integer.valueOf(crashDetailBean.f5663b));
            if (pair == null) {
                C6674al.m5108e("crash type error! %d", Integer.valueOf(crashDetailBean.f5663b));
                return "";
            }
            if (crashDetailBean.f5671j) {
                return (String) pair.first;
            }
            return (String) pair.second;
        } catch (Exception e10) {
            C6674al.m5103a(e10);
            return "";
        }
    }

    /* renamed from: d */
    private boolean m5216d(CrashDetailBean crashDetailBean) {
        String absolutePath;
        try {
            C6674al.m5106c("save eup logs", new Object[0]);
            C6663aa c6663aaM4969b = C6663aa.m4969b();
            String str = "#--------\npackage:" + c6663aaM4969b.m4982e() + "\nversion:" + c6663aaM4969b.f5783o + "\nsdk:" + c6663aaM4969b.f5776h + "\nprocess:" + crashDetailBean.f5635A + "\ndate:" + C6678ap.m5144a(new Date(crashDetailBean.f5679r)) + "\ntype:" + crashDetailBean.f5675n + "\nmessage:" + crashDetailBean.f5676o + "\nstack:\n" + crashDetailBean.f5678q + "\neupID:" + crashDetailBean.f5664c + AbsSection.SEP_ORIGIN_LINE_BREAK;
            if (C6682at.f5943m == null) {
                if (Environment.getExternalStorageState().equals("mounted")) {
                    absolutePath = Environment.getExternalStorageDirectory().getAbsolutePath() + "/Tencent/" + this.f5920b.getPackageName();
                } else {
                    absolutePath = null;
                }
            } else {
                File file = new File(C6682at.f5943m);
                if (file.isFile()) {
                    file = file.getParentFile();
                }
                absolutePath = file.getAbsolutePath();
            }
            C6675am.m5114a(absolutePath + "/euplog.txt", str, C6682at.f5944n);
            return true;
        } catch (Throwable th) {
            C6674al.m5107d("rqdp{  save error} %s", th.toString());
            if (!C6674al.m5103a(th)) {
                th.printStackTrace();
            }
            return false;
        }
    }

    /* renamed from: b */
    public final void m5223b(CrashDetailBean crashDetailBean, boolean z9) {
        if (C6682at.f5945o) {
            C6674al.m5102a("try to upload right now", new Object[0]);
            ArrayList arrayList = new ArrayList();
            arrayList.add(crashDetailBean);
            m5220a(arrayList, 3000L, z9, crashDetailBean.f5663b == 7, z9);
            return;
        }
        C6674al.m5102a("do not upload spot crash right now, crash would be uploaded when app next start", new Object[0]);
    }

    /* renamed from: b */
    public final void m5222b(CrashDetailBean crashDetailBean) {
        if (crashDetailBean == null) {
            return;
        }
        ContentValues contentValuesM5212c = m5212c(crashDetailBean);
        if (contentValuesM5212c != null) {
            long jM5489a = C6732w.m5475a().m5489a("t_cr", contentValuesM5212c, (InterfaceC6731v) null);
            if (jM5489a >= 0) {
                C6674al.m5106c("insert %s success!", "t_cr");
                crashDetailBean.f5661a = jM5489a;
            }
        }
        if (C6682at.f5942l) {
            m5216d(crashDetailBean);
        }
    }

    /* renamed from: a */
    private static void m5190a(CrashDetailBean crashDetailBean, List<CrashDetailBean> list) {
        String[] strArrSplit;
        StringBuilder sb = new StringBuilder(128);
        for (int i9 = 1; i9 < list.size(); i9++) {
            String str = list.get(i9).f5680s;
            if (str != null && (strArrSplit = str.split(AbsSection.SEP_ORIGIN_LINE_BREAK)) != null) {
                for (String str2 : strArrSplit) {
                    if (!crashDetailBean.f5680s.contains(str2)) {
                        crashDetailBean.f5681t++;
                        sb.append(str2);
                        sb.append(AbsSection.SEP_ORIGIN_LINE_BREAK);
                    }
                }
            }
        }
        crashDetailBean.f5680s += sb.toString();
    }

    /* renamed from: b */
    private static C6680ar m5204b(Cursor cursor) {
        if (cursor == null) {
            return null;
        }
        try {
            C6680ar c6680ar = new C6680ar();
            c6680ar.f5908a = cursor.getLong(cursor.getColumnIndex("_id"));
            c6680ar.f5909b = cursor.getLong(cursor.getColumnIndex("_tm"));
            c6680ar.f5910c = cursor.getString(cursor.getColumnIndex("_s1"));
            c6680ar.f5911d = cursor.getInt(cursor.getColumnIndex("_up")) == 1;
            c6680ar.f5912e = cursor.getInt(cursor.getColumnIndex("_me")) == 1;
            c6680ar.f5913f = cursor.getInt(cursor.getColumnIndex("_uc"));
            return c6680ar;
        } catch (Throwable th) {
            if (!C6674al.m5103a(th)) {
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
    public final boolean m5221a(com.tencent.bugly.crashreport.crash.CrashDetailBean r19, boolean r20) {
        /*
            Method dump skipped, instructions count: 637
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.bugly.proguard.C6681as.m5221a(com.tencent.bugly.crashreport.crash.CrashDetailBean, boolean):boolean");
    }

    /* renamed from: b */
    private static List<C6680ar> m5205b() {
        ArrayList arrayList = new ArrayList();
        Cursor cursor = null;
        try {
            Cursor cursorM5490a = C6732w.m5475a().m5490a("t_cr", new String[]{"_id", "_tm", "_s1", "_up", "_me", "_uc"}, (String) null);
            if (cursorM5490a == null) {
                if (cursorM5490a != null) {
                    cursorM5490a.close();
                }
                return null;
            }
            try {
                if (cursorM5490a.getCount() <= 0) {
                    cursorM5490a.close();
                    return arrayList;
                }
                StringBuilder sb = new StringBuilder();
                sb.append("_id in (");
                int i9 = 0;
                while (cursorM5490a.moveToNext()) {
                    C6680ar c6680arM5204b = m5204b(cursorM5490a);
                    if (c6680arM5204b != null) {
                        arrayList.add(c6680arM5204b);
                    } else {
                        try {
                            sb.append(cursorM5490a.getLong(cursorM5490a.getColumnIndex("_id")));
                            sb.append(",");
                            i9++;
                        } catch (Throwable unused) {
                            C6674al.m5107d("unknown id!", new Object[0]);
                        }
                    }
                }
                if (sb.toString().contains(",")) {
                    sb = new StringBuilder(sb.substring(0, sb.lastIndexOf(",")));
                }
                sb.append(")");
                String string = sb.toString();
                sb.setLength(0);
                if (i9 > 0) {
                    C6674al.m5107d("deleted %s illegal data %d", "t_cr", Integer.valueOf(C6732w.m5475a().m5488a("t_cr", string)));
                }
                cursorM5490a.close();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                cursor = cursorM5490a;
                try {
                    if (!C6674al.m5103a(th)) {
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
    private static void m5214c(ArrayList<C6703bn> arrayList, String str) {
        if (C6678ap.m5165b(str)) {
            return;
        }
        try {
            C6703bn c6703bn = new C6703bn((byte) 1, "crashInfos.txt", str.getBytes("utf-8"));
            C6674al.m5106c("attach crash infos", new Object[0]);
            arrayList.add(c6703bn);
        } catch (Exception e10) {
            e10.printStackTrace();
            C6674al.m5103a(e10);
        }
    }

    /* renamed from: b */
    private static void m5208b(ArrayList<C6703bn> arrayList, String str) {
        if (str != null) {
            try {
                arrayList.add(new C6703bn((byte) 1, "jniLog.txt", str.getBytes("utf-8")));
            } catch (Exception e10) {
                e10.printStackTrace();
                C6674al.m5103a(e10);
            }
        }
    }

    /* renamed from: b */
    private static void m5207b(ArrayList<C6703bn> arrayList, CrashDetailBean crashDetailBean, Context context) {
        String str;
        if (crashDetailBean.f5663b == 1 && (str = crashDetailBean.f5683v) != null) {
            try {
                C6703bn c6703bnM5184a = m5184a("tomb.zip", context, str);
                if (c6703bnM5184a != null) {
                    C6674al.m5106c("attach tombs", new Object[0]);
                    arrayList.add(c6703bnM5184a);
                }
            } catch (Exception e10) {
                C6674al.m5103a(e10);
            }
        }
    }

    /* renamed from: b */
    private static void m5209b(ArrayList<C6703bn> arrayList, byte[] bArr) {
        if (bArr == null || bArr.length <= 0) {
            return;
        }
        try {
            arrayList.add(new C6703bn((byte) 1, "userExtraByteData", bArr));
            C6674al.m5106c("attach extraData", new Object[0]);
        } catch (Exception e10) {
            C6674al.m5103a(e10);
        }
    }

    /* renamed from: b */
    private boolean m5211b(CrashDetailBean crashDetailBean, List<C6680ar> list, List<C6680ar> list2) {
        boolean z9;
        int i9 = crashDetailBean.f5663b;
        boolean z10 = i9 == 0 || i9 == 1;
        boolean z11 = i9 == 3;
        if (C6725p.f6213c) {
            z9 = false;
        } else {
            z9 = (z11 || z10) ? C6682at.f5935e : true;
        }
        if (!z9) {
            return false;
        }
        ArrayList arrayList = new ArrayList(10);
        if (!m5202a(crashDetailBean, list, arrayList)) {
            try {
                if (arrayList.size() >= C6682at.f5934d) {
                }
            } catch (Exception e10) {
                C6674al.m5103a(e10);
                C6674al.m5107d("Failed to merge crash.", new Object[0]);
            }
            return false;
        }
        C6674al.m5102a("same crash occur too much do merged!", new Object[0]);
        CrashDetailBean crashDetailBeanM5183a = m5183a((List<C6680ar>) arrayList, crashDetailBean);
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            C6680ar c6680ar = (C6680ar) obj;
            if (c6680ar.f5908a != crashDetailBeanM5183a.f5661a) {
                list2.add(c6680ar);
            }
        }
        m5222b(crashDetailBeanM5183a);
        m5215d(list2);
        C6674al.m5104b("[crash] save crash success. For this device crash many times, it will not upload crashes immediately", new Object[0]);
        return true;
    }

    /* renamed from: a */
    private static boolean m5203a(String str) {
        String str2 = C6682at.f5948r;
        if (str2 != null && !str2.isEmpty()) {
            try {
                C6674al.m5106c("Crash regular filter for crash stack is: %s", C6682at.f5948r);
                if (Pattern.compile(C6682at.f5948r).matcher(str).find()) {
                    C6674al.m5107d("This crash matches the regular filter string set. It will not be record and upload.", new Object[0]);
                    return true;
                }
            } catch (Exception e10) {
                C6674al.m5103a(e10);
                C6674al.m5107d("Failed to compile " + C6682at.f5948r, new Object[0]);
            }
        }
        return false;
    }

    /* renamed from: a */
    private static boolean m5202a(CrashDetailBean crashDetailBean, List<C6680ar> list, List<C6680ar> list2) {
        boolean z9 = false;
        for (C6680ar c6680ar : list) {
            if (crashDetailBean.f5682u.equals(c6680ar.f5910c)) {
                if (c6680ar.f5912e) {
                    z9 = true;
                }
                list2.add(c6680ar);
            }
        }
        return z9;
    }

    /* renamed from: a */
    public static List<CrashDetailBean> m5187a() {
        StrategyBean strategyBeanM5040c = C6665ac.m5031a().m5040c();
        if (strategyBeanM5040c == null) {
            C6674al.m5107d("have not synced remote!", new Object[0]);
            return null;
        }
        if (!strategyBeanM5040c.f5617f) {
            C6674al.m5107d("Crashreport remote closed, please check your APP ID correct and Version available, then uninstall and reinstall your app.", new Object[0]);
            C6674al.m5104b("[init] WARNING! Crashreport closed by server, please check your APP ID correct and Version available, then uninstall and reinstall your app.", new Object[0]);
            return null;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        long jM5157b = C6678ap.m5157b();
        List<C6680ar> listM5205b = m5205b();
        C6674al.m5106c("Size of crash list loaded from DB: %s", Integer.valueOf(listM5205b.size()));
        if (listM5205b.size() <= 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        arrayList.addAll(m5188a(listM5205b));
        listM5205b.removeAll(arrayList);
        Iterator<C6680ar> it = listM5205b.iterator();
        while (it.hasNext()) {
            C6680ar next = it.next();
            long j9 = next.f5909b;
            if (j9 < jM5157b - C6682at.f5940j) {
                arrayList2.add(next);
                it.remove();
                arrayList.add(next);
            } else if (next.f5911d) {
                if (j9 >= jCurrentTimeMillis - CalendarModelKt.MillisecondsIn24Hours) {
                    it.remove();
                } else if (!next.f5912e) {
                    it.remove();
                    arrayList.add(next);
                }
            } else if (next.f5913f >= 3 && j9 < jCurrentTimeMillis - CalendarModelKt.MillisecondsIn24Hours) {
                it.remove();
                arrayList.add(next);
            }
        }
        m5210b(arrayList2);
        if (arrayList.size() > 0) {
            m5215d(arrayList);
        }
        ArrayList arrayList3 = new ArrayList();
        List<CrashDetailBean> listM5213c = m5213c(listM5205b);
        if (listM5213c != null && listM5213c.size() > 0) {
            String str = C6663aa.m4969b().f5783o;
            Iterator<CrashDetailBean> it2 = listM5213c.iterator();
            while (it2.hasNext()) {
                CrashDetailBean next2 = it2.next();
                if (!str.equals(next2.f5667f)) {
                    it2.remove();
                    arrayList3.add(next2);
                }
            }
        }
        if (arrayList3.size() > 0) {
            m5218e(arrayList3);
        }
        return listM5213c;
    }

    /* renamed from: a */
    public final void m5219a(CrashDetailBean crashDetailBean) {
        int i9 = crashDetailBean.f5663b;
        if (i9 != 0) {
            if (i9 != 1) {
                if (i9 == 3 && !C6682at.m5225a().m5241k()) {
                    return;
                }
            } else if (!C6682at.m5225a().m5240j()) {
                return;
            }
        } else if (!C6682at.m5225a().m5240j()) {
            return;
        }
        if (this.f5924f != null) {
            C6674al.m5106c("Calling 'onCrashHandleEnd' of RQD crash listener.", new Object[0]);
        }
    }

    /* renamed from: a */
    public final void m5220a(final List<CrashDetailBean> list, long j9, final boolean z9, boolean z10, boolean z11) {
        if (!C6663aa.m4967a(this.f5920b).f5774f) {
            C6674al.m5107d("warn: not upload process", new Object[0]);
            return;
        }
        C6671ai c6671ai = this.f5921c;
        if (c6671ai == null) {
            C6674al.m5107d("warn: upload manager is null", new Object[0]);
            return;
        }
        if (!z11 && !c6671ai.m5084b(C6682at.f5932a)) {
            C6674al.m5107d("warn: not crashHappen or not should upload", new Object[0]);
            return;
        }
        StrategyBean strategyBeanM5040c = this.f5923e.m5040c();
        if (!strategyBeanM5040c.f5617f) {
            C6674al.m5107d("remote report is disable!", new Object[0]);
            C6674al.m5104b("[crash] server closed bugly in this app. please check your appid if is correct, and re-install it", new Object[0]);
            return;
        }
        if (list != null && list.size() != 0) {
            try {
                String str = strategyBeanM5040c.f5629r;
                String str2 = StrategyBean.f5613b;
                C6705bp c6705bpM5186a = m5186a(this.f5920b, list, C6663aa.m4969b());
                if (c6705bpM5186a == null) {
                    C6674al.m5107d("create eupPkg fail!", new Object[0]);
                    return;
                }
                byte[] bArrM5049a = C6667ae.m5049a((AbstractC6722m) c6705bpM5186a);
                if (bArrM5049a == null) {
                    C6674al.m5107d("send encode fail!", new Object[0]);
                    return;
                }
                C6706bq c6706bqM5045a = C6667ae.m5045a(this.f5920b, 830, bArrM5049a);
                if (c6706bqM5045a == null) {
                    C6674al.m5107d("request package is null.", new Object[0]);
                    return;
                }
                final long jCurrentTimeMillis = System.currentTimeMillis();
                InterfaceC6670ah interfaceC6670ah = new InterfaceC6670ah() { // from class: com.tencent.bugly.proguard.as.6
                    @Override // com.tencent.bugly.proguard.InterfaceC6670ah
                    /* renamed from: a */
                    public final void mo5066a(boolean z12, String str3) {
                        C6681as.m5199a(list, z12, System.currentTimeMillis() - jCurrentTimeMillis, z9 ? "realtime" : "cache", str3);
                        C6681as.m5201a(z12, (List<CrashDetailBean>) list);
                    }
                };
                if (z9) {
                    this.f5921c.m5081a(f5914a, c6706bqM5045a, str, str2, interfaceC6670ah, j9, z10);
                    return;
                } else {
                    this.f5921c.m5082a(f5914a, c6706bqM5045a, str, str2, interfaceC6670ah, false);
                    return;
                }
            } catch (Throwable th) {
                C6674al.m5108e("req cr error %s", th.toString());
                if (C6674al.m5105b(th)) {
                    return;
                }
                th.printStackTrace();
                return;
            }
        }
        C6674al.m5107d("warn: crashList is null or crashList num is 0", new Object[0]);
    }

    /* renamed from: a */
    public static void m5201a(boolean z9, List<CrashDetailBean> list) {
        if (list != null && list.size() > 0) {
            C6674al.m5106c("up finish update state %b", Boolean.valueOf(z9));
            for (CrashDetailBean crashDetailBean : list) {
                C6674al.m5106c("pre uid:%s uc:%d re:%b me:%b", crashDetailBean.f5664c, Integer.valueOf(crashDetailBean.f5673l), Boolean.valueOf(crashDetailBean.f5665d), Boolean.valueOf(crashDetailBean.f5671j));
                int i9 = crashDetailBean.f5673l + 1;
                crashDetailBean.f5673l = i9;
                crashDetailBean.f5665d = z9;
                C6674al.m5106c("set uid:%s uc:%d re:%b me:%b", crashDetailBean.f5664c, Integer.valueOf(i9), Boolean.valueOf(crashDetailBean.f5665d), Boolean.valueOf(crashDetailBean.f5671j));
            }
            Iterator<CrashDetailBean> it = list.iterator();
            while (it.hasNext()) {
                C6682at.m5225a().m5230a(it.next());
            }
            C6674al.m5106c("update state size %d", Integer.valueOf(list.size()));
        }
        if (z9) {
            return;
        }
        C6674al.m5104b("[crash] upload fail.", new Object[0]);
    }

    /* renamed from: a */
    private static CrashDetailBean m5182a(Cursor cursor) {
        if (cursor == null) {
            return null;
        }
        try {
            byte[] blob = cursor.getBlob(cursor.getColumnIndex("_dt"));
            if (blob == null) {
                return null;
            }
            long j9 = cursor.getLong(cursor.getColumnIndex("_id"));
            CrashDetailBean crashDetailBean = (CrashDetailBean) C6678ap.m5136a(blob, CrashDetailBean.CREATOR);
            if (crashDetailBean == null) {
                return crashDetailBean;
            }
            crashDetailBean.f5661a = j9;
            return crashDetailBean;
        } catch (Throwable th) {
            if (!C6674al.m5103a(th)) {
                th.printStackTrace();
            }
            return null;
        }
    }

    /* renamed from: a */
    private static C6704bo m5185a(Context context, CrashDetailBean crashDetailBean, C6663aa c6663aa) {
        ArrayList<C6701bl> arrayList = null;
        if (context != null && crashDetailBean != null && c6663aa != null) {
            C6704bo c6704bo = new C6704bo();
            c6704bo.f6081a = m5217e(crashDetailBean);
            c6704bo.f6082b = crashDetailBean.f5679r;
            c6704bo.f6083c = crashDetailBean.f5675n;
            c6704bo.f6084d = crashDetailBean.f5676o;
            c6704bo.f6085e = crashDetailBean.f5677p;
            c6704bo.f6087g = crashDetailBean.f5678q;
            c6704bo.f6088h = crashDetailBean.f5687z;
            c6704bo.f6089i = crashDetailBean.f5664c;
            c6704bo.f6090j = null;
            c6704bo.f6092l = crashDetailBean.f5674m;
            c6704bo.f6093m = crashDetailBean.f5666e;
            c6704bo.f6086f = crashDetailBean.f5636B;
            c6704bo.f6094n = null;
            Map<String, PlugInBean> map = crashDetailBean.f5669h;
            if (map != null && !map.isEmpty()) {
                arrayList = new ArrayList<>(crashDetailBean.f5669h.size());
                for (Map.Entry<String, PlugInBean> entry : crashDetailBean.f5669h.entrySet()) {
                    C6701bl c6701bl = new C6701bl();
                    c6701bl.f6061a = entry.getValue().f5609a;
                    c6701bl.f6063c = entry.getValue().f5611c;
                    c6701bl.f6065e = entry.getValue().f5610b;
                    arrayList.add(c6701bl);
                }
            }
            c6704bo.f6096p = arrayList;
            C6674al.m5106c("libInfo %s", c6704bo.f6095o);
            ArrayList<C6703bn> arrayList2 = new ArrayList<>(20);
            m5193a(arrayList2, crashDetailBean);
            m5195a(arrayList2, crashDetailBean.f5684w);
            m5208b(arrayList2, crashDetailBean.f5685x);
            m5214c(arrayList2, crashDetailBean.f5660Z);
            m5196a(arrayList2, crashDetailBean.f5662aa, context);
            m5198a(arrayList2, crashDetailBean.f5686y);
            m5194a(arrayList2, crashDetailBean, context);
            m5207b(arrayList2, crashDetailBean, context);
            m5197a(arrayList2, c6663aa.f5731L);
            m5209b(arrayList2, crashDetailBean.f5659Y);
            c6704bo.f6097q = arrayList2;
            if (crashDetailBean.f5671j) {
                c6704bo.f6091k = crashDetailBean.f5681t;
            }
            c6704bo.f6098r = m5189a(crashDetailBean, c6663aa);
            c6704bo.f6099s = new HashMap();
            Map<String, String> map2 = crashDetailBean.f5653S;
            if (map2 != null && map2.size() > 0) {
                c6704bo.f6099s.putAll(crashDetailBean.f5653S);
                C6674al.m5102a("setted message size %d", Integer.valueOf(c6704bo.f6099s.size()));
            }
            Map<String, String> map3 = c6704bo.f6099s;
            C6674al.m5106c("pss:" + crashDetailBean.f5643I + " vss:" + crashDetailBean.f5644J + " javaHeap:" + crashDetailBean.f5645K, new Object[0]);
            StringBuilder sb = new StringBuilder();
            sb.append(crashDetailBean.f5643I);
            map3.put("SDK_UPLOAD_U1", sb.toString());
            StringBuilder sb2 = new StringBuilder();
            sb2.append(crashDetailBean.f5644J);
            map3.put("SDK_UPLOAD_U2", sb2.toString());
            StringBuilder sb3 = new StringBuilder();
            sb3.append(crashDetailBean.f5645K);
            map3.put("SDK_UPLOAD_U3", sb3.toString());
            C6674al.m5106c("%s rid:%s sess:%s ls:%ds isR:%b isF:%b isM:%b isN:%b mc:%d ,%s ,isUp:%b ,vm:%d", crashDetailBean.f5675n, crashDetailBean.f5664c, c6663aa.m4980d(), Long.valueOf((crashDetailBean.f5679r - crashDetailBean.f5651Q) / 1000), Boolean.valueOf(crashDetailBean.f5672k), Boolean.valueOf(crashDetailBean.f5652R), Boolean.valueOf(crashDetailBean.f5671j), Boolean.valueOf(crashDetailBean.f5663b == 1), Integer.valueOf(crashDetailBean.f5681t), crashDetailBean.f5680s, Boolean.valueOf(crashDetailBean.f5665d), Integer.valueOf(c6704bo.f6098r.size()));
            return c6704bo;
        }
        C6674al.m5107d("enExp args == null", new Object[0]);
        return null;
    }

    /* renamed from: a */
    private static C6705bp m5186a(Context context, List<CrashDetailBean> list, C6663aa c6663aa) {
        if (context != null && list != null && list.size() != 0 && c6663aa != null) {
            C6705bp c6705bp = new C6705bp();
            c6705bp.f6103a = new ArrayList<>();
            Iterator<CrashDetailBean> it = list.iterator();
            while (it.hasNext()) {
                c6705bp.f6103a.add(m5185a(context, it.next(), c6663aa));
            }
            return c6705bp;
        }
        C6674al.m5107d("enEXPPkg args == null!", new Object[0]);
        return null;
    }

    /* renamed from: a */
    private static C6703bn m5184a(String str, Context context, String str2) throws IOException {
        FileInputStream fileInputStream;
        if (str2 != null && context != null) {
            C6674al.m5106c("zip %s", str2);
            File file = new File(str2);
            File file2 = new File(context.getCacheDir(), str);
            if (!C6678ap.m5152a(file, file2)) {
                C6674al.m5107d("zip fail!", new Object[0]);
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
                    int i9 = fileInputStream.read(bArr);
                    if (i9 <= 0) {
                        break;
                    }
                    byteArrayOutputStream.write(bArr, 0, i9);
                    byteArrayOutputStream.flush();
                }
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                C6674al.m5106c("read bytes :%d", Integer.valueOf(byteArray.length));
                C6703bn c6703bn = new C6703bn((byte) 2, file2.getName(), byteArray);
                try {
                    fileInputStream.close();
                } catch (IOException e10) {
                    if (!C6674al.m5103a(e10)) {
                        e10.printStackTrace();
                    }
                }
                if (file2.exists()) {
                    C6674al.m5106c("del tmp", new Object[0]);
                    file2.delete();
                }
                return c6703bn;
            } catch (Throwable th2) {
                th = th2;
                try {
                    if (!C6674al.m5103a(th)) {
                        th.printStackTrace();
                    }
                    if (fileInputStream != null) {
                        try {
                            fileInputStream.close();
                        } catch (IOException e11) {
                            if (!C6674al.m5103a(e11)) {
                                e11.printStackTrace();
                            }
                        }
                    }
                    if (file2.exists()) {
                        C6674al.m5106c("del tmp", new Object[0]);
                        file2.delete();
                    }
                    return null;
                } catch (Throwable th3) {
                    if (fileInputStream != null) {
                        try {
                            fileInputStream.close();
                        } catch (IOException e12) {
                            if (!C6674al.m5103a(e12)) {
                                e12.printStackTrace();
                            }
                        }
                    }
                    if (file2.exists()) {
                        C6674al.m5106c("del tmp", new Object[0]);
                        file2.delete();
                    }
                    throw th3;
                }
            }
        }
        C6674al.m5107d("rqdp{  createZipAttachment sourcePath == null || context == null ,pls check}", new Object[0]);
        return null;
    }

    /* renamed from: a */
    public static void m5192a(String str, String str2, String str3, String str4, String str5, CrashDetailBean crashDetailBean) {
        String str6;
        C6663aa c6663aaM4969b = C6663aa.m4969b();
        if (c6663aaM4969b == null) {
            return;
        }
        C6674al.m5108e("#++++++++++Record By Bugly++++++++++#", new Object[0]);
        C6674al.m5108e("# You can use Bugly(http:\\\\bugly.qq.com) to get more Crash Detail!", new Object[0]);
        C6674al.m5108e("# PKG NAME: %s", c6663aaM4969b.f5771c);
        C6674al.m5108e("# APP VER: %s", c6663aaM4969b.f5783o);
        C6674al.m5108e("# SDK VER: %s", c6663aaM4969b.f5776h);
        C6674al.m5108e("# LAUNCH TIME: %s", C6678ap.m5144a(new Date(C6663aa.m4969b().f5745a)));
        C6674al.m5108e("# CRASH TYPE: %s", str);
        C6674al.m5108e("# CRASH TIME: %s", str2);
        C6674al.m5108e("# CRASH PROCESS: %s", str3);
        C6674al.m5108e("# CRASH FOREGROUND: %s", Boolean.valueOf(c6663aaM4969b.m4975a()));
        C6674al.m5108e("# CRASH THREAD: %s", str4);
        if (crashDetailBean != null) {
            C6674al.m5108e("# REPORT ID: %s", crashDetailBean.f5664c);
            C6674al.m5108e("# CRASH DEVICE: %s %s", c6663aaM4969b.m4988h(), c6663aaM4969b.m4997r().booleanValue() ? "ROOTED" : "UNROOT");
            C6674al.m5108e("# RUNTIME AVAIL RAM:%d ROM:%d SD:%d", Long.valueOf(crashDetailBean.f5637C), Long.valueOf(crashDetailBean.f5638D), Long.valueOf(crashDetailBean.f5639E));
            C6674al.m5108e("# RUNTIME TOTAL RAM:%d ROM:%d SD:%d", Long.valueOf(crashDetailBean.f5640F), Long.valueOf(crashDetailBean.f5641G), Long.valueOf(crashDetailBean.f5642H));
            if (!C6678ap.m5165b(crashDetailBean.f5649O)) {
                C6674al.m5108e("# EXCEPTION FIRED BY %s %s", crashDetailBean.f5649O, crashDetailBean.f5648N);
            } else if (crashDetailBean.f5663b == 3) {
                if (crashDetailBean.f5654T == null) {
                    str6 = "null";
                } else {
                    str6 = crashDetailBean.f5654T.get("BUGLY_CR_01");
                }
                C6674al.m5108e("# EXCEPTION ANR MESSAGE:\n %s", str6);
            }
        }
        if (!C6678ap.m5165b(str5)) {
            C6674al.m5108e("# CRASH STACK: ", new Object[0]);
            C6674al.m5108e(str5, new Object[0]);
        }
        C6674al.m5108e("#++++++++++++++++++++++++++++++++++++++++++#", new Object[0]);
    }

    /* renamed from: a */
    private static void m5191a(CrashDetailBean crashDetailBean, Map<String, String> map) {
        String value;
        if (map != null && !map.isEmpty()) {
            crashDetailBean.f5653S = new LinkedHashMap(map.size());
            for (Map.Entry<String, String> entry : map.entrySet()) {
                if (!C6678ap.m5165b(entry.getKey())) {
                    String key = entry.getKey();
                    if (key.length() > 100) {
                        key = key.substring(0, 100);
                        C6674al.m5107d("setted key length is over limit %d substring to %s", 100, key);
                    }
                    if (!C6678ap.m5165b(entry.getValue()) && entry.getValue().length() > 100000) {
                        value = entry.getValue().substring(entry.getValue().length() - 100000);
                        C6674al.m5107d("setted %s value length is over limit %d substring", key, 100000);
                    } else {
                        value = entry.getValue();
                    }
                    crashDetailBean.f5653S.put(key, value);
                    C6674al.m5102a("add setted key %s value size:%d", key, Integer.valueOf(value.length()));
                }
            }
            return;
        }
        C6674al.m5107d("extra map is empty. CrashBean won't have userDatas.", new Object[0]);
    }

    /* renamed from: a */
    private static void m5193a(ArrayList<C6703bn> arrayList, CrashDetailBean crashDetailBean) {
        String str;
        if (crashDetailBean.f5671j && (str = crashDetailBean.f5680s) != null && str.length() > 0) {
            try {
                arrayList.add(new C6703bn((byte) 1, "alltimes.txt", crashDetailBean.f5680s.getBytes("utf-8")));
            } catch (Exception e10) {
                e10.printStackTrace();
                C6674al.m5103a(e10);
            }
        }
    }

    /* renamed from: a */
    private static void m5195a(ArrayList<C6703bn> arrayList, String str) {
        if (str != null) {
            try {
                arrayList.add(new C6703bn((byte) 1, "log.txt", str.getBytes("utf-8")));
            } catch (Exception e10) {
                e10.printStackTrace();
                C6674al.m5103a(e10);
            }
        }
    }

    /* renamed from: a */
    private static void m5196a(ArrayList<C6703bn> arrayList, String str, Context context) {
        if (str != null) {
            try {
                C6703bn c6703bnM5184a = m5184a("backupRecord.zip", context, str);
                if (c6703bnM5184a != null) {
                    C6674al.m5106c("attach backup record", new Object[0]);
                    arrayList.add(c6703bnM5184a);
                }
            } catch (Exception e10) {
                C6674al.m5103a(e10);
            }
        }
    }

    /* renamed from: a */
    private static void m5198a(ArrayList<C6703bn> arrayList, byte[] bArr) {
        if (bArr == null || bArr.length <= 0) {
            return;
        }
        try {
            C6703bn c6703bn = new C6703bn((byte) 2, "buglylog.zip", bArr);
            C6674al.m5106c("attach user log", new Object[0]);
            arrayList.add(c6703bn);
        } catch (Exception e10) {
            C6674al.m5103a(e10);
        }
    }

    /* renamed from: a */
    private static void m5194a(ArrayList<C6703bn> arrayList, CrashDetailBean crashDetailBean, Context context) {
        C6703bn c6703bnM5184a;
        if (crashDetailBean.f5663b != 3) {
            return;
        }
        C6674al.m5106c("crashBean.anrMessages:%s", crashDetailBean.f5654T);
        try {
            Map<String, String> map = crashDetailBean.f5654T;
            if (map != null && map.containsKey("BUGLY_CR_01")) {
                if (!TextUtils.isEmpty(crashDetailBean.f5654T.get("BUGLY_CR_01"))) {
                    arrayList.add(new C6703bn((byte) 1, "anrMessage.txt", crashDetailBean.f5654T.get("BUGLY_CR_01").getBytes("utf-8")));
                    C6674al.m5106c("attach anr message", new Object[0]);
                }
                crashDetailBean.f5654T.remove("BUGLY_CR_01");
            }
            String str = crashDetailBean.f5683v;
            if (str == null || (c6703bnM5184a = m5184a("trace.zip", context, str)) == null) {
                return;
            }
            C6674al.m5106c("attach traces", new Object[0]);
            arrayList.add(c6703bnM5184a);
        } catch (Exception e10) {
            e10.printStackTrace();
            C6674al.m5103a(e10);
        }
    }

    /* renamed from: a */
    private static void m5197a(ArrayList<C6703bn> arrayList, List<String> list) {
        if (list == null || list.isEmpty()) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            sb.append(it.next());
        }
        try {
            arrayList.add(new C6703bn((byte) 1, "martianlog.txt", sb.toString().getBytes("utf-8")));
            C6674al.m5106c("attach pageTracingList", new Object[0]);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    /* renamed from: a */
    private static Map<String, String> m5189a(CrashDetailBean crashDetailBean, C6663aa c6663aa) {
        HashMap map = new HashMap(30);
        try {
            StringBuilder sb = new StringBuilder();
            sb.append(crashDetailBean.f5637C);
            map.put("A9", sb.toString());
            StringBuilder sb2 = new StringBuilder();
            sb2.append(crashDetailBean.f5638D);
            map.put("A11", sb2.toString());
            StringBuilder sb3 = new StringBuilder();
            sb3.append(crashDetailBean.f5639E);
            map.put("A10", sb3.toString());
            map.put("A23", crashDetailBean.f5667f);
            StringBuilder sb4 = new StringBuilder();
            c6663aa.getClass();
            map.put("A7", sb4.toString());
            map.put("A6", C6663aa.m4970n());
            map.put("A5", c6663aa.m4993m());
            map.put("A22", c6663aa.m4986g());
            StringBuilder sb5 = new StringBuilder();
            sb5.append(crashDetailBean.f5641G);
            map.put("A2", sb5.toString());
            StringBuilder sb6 = new StringBuilder();
            sb6.append(crashDetailBean.f5640F);
            map.put("A1", sb6.toString());
            map.put("A24", c6663aa.f5779k);
            StringBuilder sb7 = new StringBuilder();
            sb7.append(crashDetailBean.f5642H);
            map.put("A17", sb7.toString());
            map.put("A25", c6663aa.m4986g());
            map.put("A15", c6663aa.m4996q());
            StringBuilder sb8 = new StringBuilder();
            sb8.append(c6663aa.m4997r());
            map.put("A13", sb8.toString());
            map.put("A34", crashDetailBean.f5635A);
            if (c6663aa.f5726G != null) {
                map.put("productIdentify", c6663aa.f5726G);
            }
            map.put("A26", URLEncoder.encode(crashDetailBean.f5646L, "utf-8"));
            if (crashDetailBean.f5663b == 1) {
                map.put("A27", crashDetailBean.f5649O);
                map.put("A28", crashDetailBean.f5648N);
                StringBuilder sb9 = new StringBuilder();
                sb9.append(crashDetailBean.f5672k);
                map.put("A29", sb9.toString());
            }
            map.put("A30", crashDetailBean.f5650P);
            StringBuilder sb10 = new StringBuilder();
            sb10.append(crashDetailBean.f5651Q);
            map.put("A18", sb10.toString());
            StringBuilder sb11 = new StringBuilder();
            sb11.append(true ^ crashDetailBean.f5652R);
            map.put("A36", sb11.toString());
            StringBuilder sb12 = new StringBuilder();
            sb12.append(c6663aa.f5794z);
            map.put("F02", sb12.toString());
            StringBuilder sb13 = new StringBuilder();
            sb13.append(c6663aa.f5720A);
            map.put("F03", sb13.toString());
            map.put("F04", c6663aa.m4980d());
            StringBuilder sb14 = new StringBuilder();
            sb14.append(c6663aa.f5721B);
            map.put("F05", sb14.toString());
            map.put("F06", c6663aa.f5793y);
            map.put("F08", c6663aa.f5724E);
            map.put("F09", c6663aa.f5725F);
            StringBuilder sb15 = new StringBuilder();
            sb15.append(c6663aa.f5722C);
            map.put("F10", sb15.toString());
            m5200a(map, crashDetailBean);
            return map;
        } catch (Exception e10) {
            e10.printStackTrace();
            C6674al.m5103a(e10);
            return map;
        }
    }

    /* renamed from: a */
    private static void m5200a(Map<String, String> map, CrashDetailBean crashDetailBean) {
        if (crashDetailBean.f5655U >= 0) {
            StringBuilder sb = new StringBuilder();
            sb.append(crashDetailBean.f5655U);
            map.put("C01", sb.toString());
        }
        if (crashDetailBean.f5656V >= 0) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(crashDetailBean.f5656V);
            map.put("C02", sb2.toString());
        }
        Map<String, String> map2 = crashDetailBean.f5657W;
        if (map2 != null && map2.size() > 0) {
            for (Map.Entry<String, String> entry : crashDetailBean.f5657W.entrySet()) {
                map.put("C03_" + entry.getKey(), entry.getValue());
            }
        }
        Map<String, String> map3 = crashDetailBean.f5658X;
        if (map3 == null || map3.size() <= 0) {
            return;
        }
        for (Map.Entry<String, String> entry2 : crashDetailBean.f5658X.entrySet()) {
            map.put("C04_" + entry2.getKey(), entry2.getValue());
        }
    }

    /* renamed from: a */
    public static /* synthetic */ void m5199a(List list, boolean z9, long j9, String str, String str2) {
        if (list == null || list.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            CrashDetailBean crashDetailBean = (CrashDetailBean) it.next();
            String str3 = f5919l.get(Integer.valueOf(crashDetailBean.f5663b));
            if (!TextUtils.isEmpty(str3)) {
                arrayList.add(new C6669ag.c(crashDetailBean.f5664c, str3, crashDetailBean.f5679r, z9, j9, str, str2));
            }
        }
        C6669ag.a.f5815a.m5063a(arrayList);
    }
}
