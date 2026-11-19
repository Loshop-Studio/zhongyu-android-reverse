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
import com.tencent.bugly.proguard.C6431ag;
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
public final class C6443as {

    /* renamed from: a */
    public static int f4680a;

    /* renamed from: h */
    private static final Map<Integer, Pair<String, String>> f4681h = new HashMap<Integer, Pair<String, String>>() { // from class: com.tencent.bugly.proguard.as.1
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
    private static final ArrayList<a> f4682i = new ArrayList<a>() { // from class: com.tencent.bugly.proguard.as.2
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
    private static final Map<Integer, Integer> f4683j = new HashMap<Integer, Integer>() { // from class: com.tencent.bugly.proguard.as.3
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
    private static final Map<Integer, String> f4684k = new HashMap<Integer, String>() { // from class: com.tencent.bugly.proguard.as.4
        {
            put(3, "BuglyAnrCrash");
            put(0, "BuglyJavaCrash");
            put(1, "BuglyNativeCrash");
        }
    };

    /* renamed from: l */
    private static final Map<Integer, String> f4685l = new HashMap<Integer, String>() { // from class: com.tencent.bugly.proguard.as.5
        {
            put(3, "BuglyAnrCrashReport");
            put(0, "BuglyJavaCrashReport");
            put(1, "BuglyNativeCrashReport");
        }
    };

    /* renamed from: b */
    protected final Context f4686b;

    /* renamed from: c */
    protected final C6433ai f4687c;

    /* renamed from: d */
    protected final C6494w f4688d;

    /* renamed from: e */
    protected final C6427ac f4689e;

    /* renamed from: f */
    protected InterfaceC6447aw f4690f;

    /* renamed from: g */
    protected BuglyStrategy.C6410a f4691g;

    /* renamed from: com.tencent.bugly.proguard.as$a */
    public static abstract class a {

        /* renamed from: a */
        final int f4696a;

        public /* synthetic */ a(int i10, byte b10) {
            this(i10);
        }

        /* renamed from: a */
        public abstract boolean mo4405a();

        private a(int i10) {
            this.f4696a = i10;
        }
    }

    /* renamed from: com.tencent.bugly.proguard.as$b */
    public static class b extends a {
        public /* synthetic */ b(byte b10) {
            this();
        }

        @Override // com.tencent.bugly.proguard.C6443as.a
        /* renamed from: a */
        public final boolean mo4405a() {
            return C6444at.m4406a().m4422k();
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

        @Override // com.tencent.bugly.proguard.C6443as.a
        /* renamed from: a */
        public final boolean mo4405a() {
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

        @Override // com.tencent.bugly.proguard.C6443as.a
        /* renamed from: a */
        public final boolean mo4405a() {
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

        @Override // com.tencent.bugly.proguard.C6443as.a
        /* renamed from: a */
        public final boolean mo4405a() {
            return C6444at.m4406a().m4421j();
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

        @Override // com.tencent.bugly.proguard.C6443as.a
        /* renamed from: a */
        public final boolean mo4405a() {
            return (C6444at.m4406a().f4716B & 2) > 0;
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

        @Override // com.tencent.bugly.proguard.C6443as.a
        /* renamed from: a */
        public final boolean mo4405a() {
            return (C6444at.m4406a().f4716B & 1) > 0;
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

        @Override // com.tencent.bugly.proguard.C6443as.a
        /* renamed from: a */
        public final boolean mo4405a() {
            return C6444at.m4406a().m4421j();
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

        @Override // com.tencent.bugly.proguard.C6443as.a
        /* renamed from: a */
        public final boolean mo4405a() {
            return (C6444at.m4406a().f4716B & 4) > 0;
        }

        private i() {
            super(4, (byte) 0);
        }
    }

    public C6443as(Context context, C6433ai c6433ai, C6494w c6494w, C6427ac c6427ac, BuglyStrategy.C6410a c6410a) {
        f4680a = 1004;
        this.f4686b = context;
        this.f4687c = c6433ai;
        this.f4688d = c6494w;
        this.f4689e = c6427ac;
        this.f4691g = c6410a;
        this.f4690f = null;
    }

    /* renamed from: a */
    private static List<C6442ar> m4369a(List<C6442ar> list) {
        if (list == null || list.size() == 0) {
            return null;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        ArrayList arrayList = new ArrayList();
        for (C6442ar c6442ar : list) {
            if (c6442ar.f4677d && c6442ar.f4675b <= jCurrentTimeMillis - CalendarModelKt.MillisecondsIn24Hours) {
                arrayList.add(c6442ar);
            }
        }
        return arrayList;
    }

    /* renamed from: b */
    private static void m4387b(CrashDetailBean crashDetailBean, List<C6442ar> list) {
        StringBuilder sb = new StringBuilder(64);
        for (C6442ar c6442ar : list) {
            if (!c6442ar.f4678e && !c6442ar.f4677d) {
                String str = crashDetailBean.f4446s;
                StringBuilder sb2 = new StringBuilder();
                sb2.append(c6442ar.f4675b);
                if (!str.contains(sb2.toString())) {
                    crashDetailBean.f4447t++;
                    sb.append(c6442ar.f4675b);
                    sb.append(SignParameters.NEW_LINE);
                }
            }
        }
        crashDetailBean.f4446s += sb.toString();
    }

    /* renamed from: c */
    private static ContentValues m4393c(CrashDetailBean crashDetailBean) {
        if (crashDetailBean == null) {
            return null;
        }
        try {
            ContentValues contentValues = new ContentValues();
            long j10 = crashDetailBean.f4427a;
            if (j10 > 0) {
                contentValues.put("_id", Long.valueOf(j10));
            }
            contentValues.put("_tm", Long.valueOf(crashDetailBean.f4445r));
            contentValues.put("_s1", crashDetailBean.f4448u);
            contentValues.put("_up", Integer.valueOf(crashDetailBean.f4431d ? 1 : 0));
            contentValues.put("_me", Integer.valueOf(crashDetailBean.f4437j ? 1 : 0));
            contentValues.put("_uc", Integer.valueOf(crashDetailBean.f4439l));
            contentValues.put("_dt", C6440ap.m4335a(crashDetailBean));
            return contentValues;
        } catch (Throwable th) {
            if (!C6436al.m4284a(th)) {
                th.printStackTrace();
            }
            return null;
        }
    }

    /* renamed from: d */
    private static void m4396d(List<C6442ar> list) {
        if (list == null || list.size() == 0) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("_id in (");
        Iterator<C6442ar> it = list.iterator();
        while (it.hasNext()) {
            sb.append(it.next().f4674a);
            sb.append(",");
        }
        StringBuilder sb2 = new StringBuilder(sb.substring(0, sb.lastIndexOf(",")));
        sb2.append(")");
        String string = sb2.toString();
        sb2.setLength(0);
        try {
            C6436al.m4287c("deleted %s data %d", "t_cr", Integer.valueOf(C6494w.m4656a().m4669a("t_cr", string)));
        } catch (Throwable th) {
            if (C6436al.m4284a(th)) {
                return;
            }
            th.printStackTrace();
        }
    }

    /* renamed from: e */
    private static void m4399e(List<CrashDetailBean> list) {
        try {
            if (list.size() == 0) {
                return;
            }
            StringBuilder sb = new StringBuilder();
            for (CrashDetailBean crashDetailBean : list) {
                sb.append(" or _id = ");
                sb.append(crashDetailBean.f4427a);
            }
            String string = sb.toString();
            if (string.length() > 0) {
                string = string.substring(4);
            }
            sb.setLength(0);
            C6436al.m4287c("deleted %s data %d", "t_cr", Integer.valueOf(C6494w.m4656a().m4669a("t_cr", string)));
        } catch (Throwable th) {
            if (C6436al.m4284a(th)) {
                return;
            }
            th.printStackTrace();
        }
    }

    /* renamed from: b */
    private static void m4391b(List<C6442ar> list) {
        List<CrashDetailBean> listM4394c = m4394c(list);
        if (listM4394c == null || listM4394c.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (CrashDetailBean crashDetailBean : listM4394c) {
            String str = f4685l.get(Integer.valueOf(crashDetailBean.f4429b));
            if (!TextUtils.isEmpty(str)) {
                C6436al.m4287c("find expired data,crashId:%s eventType:%s", crashDetailBean.f4430c, str);
                arrayList.add(new C6431ag.c(crashDetailBean.f4430c, str, crashDetailBean.f4445r, false, 0L, "expired", null));
            }
        }
        C6431ag.a.f4581a.m4244a(arrayList);
    }

    /* renamed from: a */
    private static CrashDetailBean m4364a(List<C6442ar> list, CrashDetailBean crashDetailBean) {
        CrashDetailBean crashDetailBean2;
        List<CrashDetailBean> listM4394c;
        if (list.isEmpty()) {
            return crashDetailBean;
        }
        ArrayList arrayList = new ArrayList(10);
        for (C6442ar c6442ar : list) {
            if (c6442ar.f4678e) {
                arrayList.add(c6442ar);
            }
        }
        if (arrayList.isEmpty() || (listM4394c = m4394c(arrayList)) == null || listM4394c.isEmpty()) {
            crashDetailBean2 = null;
        } else {
            Collections.sort(listM4394c);
            crashDetailBean2 = listM4394c.get(0);
            m4371a(crashDetailBean2, listM4394c);
        }
        if (crashDetailBean2 == null) {
            crashDetailBean.f4437j = true;
            crashDetailBean.f4447t = 0;
            crashDetailBean.f4446s = "";
            crashDetailBean2 = crashDetailBean;
        }
        m4387b(crashDetailBean2, list);
        if (crashDetailBean2.f4445r != crashDetailBean.f4445r) {
            String str = crashDetailBean2.f4446s;
            StringBuilder sb = new StringBuilder();
            sb.append(crashDetailBean.f4445r);
            if (!str.contains(sb.toString())) {
                crashDetailBean2.f4447t++;
                crashDetailBean2.f4446s += crashDetailBean.f4445r + SignParameters.NEW_LINE;
            }
        }
        return crashDetailBean2;
    }

    /* renamed from: c */
    private static List<CrashDetailBean> m4394c(List<C6442ar> list) {
        Cursor cursorM4671a;
        if (list == null || list.size() == 0) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("_id in (");
        Iterator<C6442ar> it = list.iterator();
        while (it.hasNext()) {
            sb.append(it.next().f4674a);
            sb.append(",");
        }
        if (sb.toString().contains(",")) {
            sb = new StringBuilder(sb.substring(0, sb.lastIndexOf(",")));
        }
        sb.append(")");
        String string = sb.toString();
        sb.setLength(0);
        try {
            cursorM4671a = C6494w.m4656a().m4671a("t_cr", (String[]) null, string);
            if (cursorM4671a == null) {
                return null;
            }
            try {
                ArrayList arrayList = new ArrayList();
                sb.append("_id in (");
                int i10 = 0;
                while (cursorM4671a.moveToNext()) {
                    CrashDetailBean crashDetailBeanM4363a = m4363a(cursorM4671a);
                    if (crashDetailBeanM4363a != null) {
                        arrayList.add(crashDetailBeanM4363a);
                    } else {
                        try {
                            sb.append(cursorM4671a.getLong(cursorM4671a.getColumnIndex("_id")));
                            sb.append(",");
                            i10++;
                        } catch (Throwable unused) {
                            C6436al.m4288d("unknown id!", new Object[0]);
                        }
                    }
                }
                if (sb.toString().contains(",")) {
                    sb = new StringBuilder(sb.substring(0, sb.lastIndexOf(",")));
                }
                sb.append(")");
                String string2 = sb.toString();
                if (i10 > 0) {
                    C6436al.m4288d("deleted %s illegal data %d", "t_cr", Integer.valueOf(C6494w.m4656a().m4669a("t_cr", string2)));
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

    /* renamed from: e */
    private static String m4398e(CrashDetailBean crashDetailBean) {
        try {
            Pair<String, String> pair = f4681h.get(Integer.valueOf(crashDetailBean.f4429b));
            if (pair == null) {
                C6436al.m4289e("crash type error! %d", Integer.valueOf(crashDetailBean.f4429b));
                return "";
            }
            if (crashDetailBean.f4437j) {
                return (String) pair.first;
            }
            return (String) pair.second;
        } catch (Exception e10) {
            C6436al.m4284a(e10);
            return "";
        }
    }

    /* renamed from: d */
    private boolean m4397d(CrashDetailBean crashDetailBean) {
        String absolutePath;
        try {
            C6436al.m4287c("save eup logs", new Object[0]);
            C6425aa c6425aaM4150b = C6425aa.m4150b();
            String str = "#--------\npackage:" + c6425aaM4150b.m4163e() + "\nversion:" + c6425aaM4150b.f4549o + "\nsdk:" + c6425aaM4150b.f4542h + "\nprocess:" + crashDetailBean.f4401A + "\ndate:" + C6440ap.m4325a(new Date(crashDetailBean.f4445r)) + "\ntype:" + crashDetailBean.f4441n + "\nmessage:" + crashDetailBean.f4442o + "\nstack:\n" + crashDetailBean.f4444q + "\neupID:" + crashDetailBean.f4430c + SignParameters.NEW_LINE;
            if (C6444at.f4709m == null) {
                if (Environment.getExternalStorageState().equals("mounted")) {
                    absolutePath = Environment.getExternalStorageDirectory().getAbsolutePath() + "/Tencent/" + this.f4686b.getPackageName();
                } else {
                    absolutePath = null;
                }
            } else {
                File file = new File(C6444at.f4709m);
                if (file.isFile()) {
                    file = file.getParentFile();
                }
                absolutePath = file.getAbsolutePath();
            }
            C6437am.m4295a(absolutePath + "/euplog.txt", str, C6444at.f4710n);
            return true;
        } catch (Throwable th) {
            C6436al.m4288d("rqdp{  save error} %s", th.toString());
            if (!C6436al.m4284a(th)) {
                th.printStackTrace();
            }
            return false;
        }
    }

    /* renamed from: b */
    public final void m4404b(CrashDetailBean crashDetailBean, boolean z10) {
        if (C6444at.f4711o) {
            C6436al.m4283a("try to upload right now", new Object[0]);
            ArrayList arrayList = new ArrayList();
            arrayList.add(crashDetailBean);
            m4401a(arrayList, 3000L, z10, crashDetailBean.f4429b == 7, z10);
            return;
        }
        C6436al.m4283a("do not upload spot crash right now, crash would be uploaded when app next start", new Object[0]);
    }

    /* renamed from: b */
    public final void m4403b(CrashDetailBean crashDetailBean) {
        if (crashDetailBean == null) {
            return;
        }
        ContentValues contentValuesM4393c = m4393c(crashDetailBean);
        if (contentValuesM4393c != null) {
            long jM4670a = C6494w.m4656a().m4670a("t_cr", contentValuesM4393c, (InterfaceC6493v) null);
            if (jM4670a >= 0) {
                C6436al.m4287c("insert %s success!", "t_cr");
                crashDetailBean.f4427a = jM4670a;
            }
        }
        if (C6444at.f4708l) {
            m4397d(crashDetailBean);
        }
    }

    /* renamed from: a */
    private static void m4371a(CrashDetailBean crashDetailBean, List<CrashDetailBean> list) {
        String[] strArrSplit;
        StringBuilder sb = new StringBuilder(128);
        for (int i10 = 1; i10 < list.size(); i10++) {
            String str = list.get(i10).f4446s;
            if (str != null && (strArrSplit = str.split(SignParameters.NEW_LINE)) != null) {
                for (String str2 : strArrSplit) {
                    if (!crashDetailBean.f4446s.contains(str2)) {
                        crashDetailBean.f4447t++;
                        sb.append(str2);
                        sb.append(SignParameters.NEW_LINE);
                    }
                }
            }
        }
        crashDetailBean.f4446s += sb.toString();
    }

    /* renamed from: b */
    private static C6442ar m4385b(Cursor cursor) {
        if (cursor == null) {
            return null;
        }
        try {
            C6442ar c6442ar = new C6442ar();
            c6442ar.f4674a = cursor.getLong(cursor.getColumnIndex("_id"));
            c6442ar.f4675b = cursor.getLong(cursor.getColumnIndex("_tm"));
            c6442ar.f4676c = cursor.getString(cursor.getColumnIndex("_s1"));
            c6442ar.f4677d = cursor.getInt(cursor.getColumnIndex("_up")) == 1;
            c6442ar.f4678e = cursor.getInt(cursor.getColumnIndex("_me")) == 1;
            c6442ar.f4679f = cursor.getInt(cursor.getColumnIndex("_uc"));
            return c6442ar;
        } catch (Throwable th) {
            if (!C6436al.m4284a(th)) {
                th.printStackTrace();
            }
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00cd A[Catch: all -> 0x006d, TryCatch #1 {all -> 0x006d, blocks: (B:21:0x0048, B:23:0x0056, B:26:0x0070, B:28:0x0085, B:30:0x009b, B:35:0x00bf, B:37:0x00cd, B:42:0x00f4, B:48:0x012b, B:50:0x012f, B:52:0x013e, B:43:0x00fc, B:45:0x0102, B:47:0x011d, B:46:0x0105, B:38:0x00db, B:40:0x00df, B:31:0x00a6, B:33:0x00aa), top: B:100:0x0048 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00db A[Catch: all -> 0x006d, TryCatch #1 {all -> 0x006d, blocks: (B:21:0x0048, B:23:0x0056, B:26:0x0070, B:28:0x0085, B:30:0x009b, B:35:0x00bf, B:37:0x00cd, B:42:0x00f4, B:48:0x012b, B:50:0x012f, B:52:0x013e, B:43:0x00fc, B:45:0x0102, B:47:0x011d, B:46:0x0105, B:38:0x00db, B:40:0x00df, B:31:0x00a6, B:33:0x00aa), top: B:100:0x0048 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00f4 A[Catch: all -> 0x006d, TryCatch #1 {all -> 0x006d, blocks: (B:21:0x0048, B:23:0x0056, B:26:0x0070, B:28:0x0085, B:30:0x009b, B:35:0x00bf, B:37:0x00cd, B:42:0x00f4, B:48:0x012b, B:50:0x012f, B:52:0x013e, B:43:0x00fc, B:45:0x0102, B:47:0x011d, B:46:0x0105, B:38:0x00db, B:40:0x00df, B:31:0x00a6, B:33:0x00aa), top: B:100:0x0048 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00fc A[Catch: all -> 0x006d, TryCatch #1 {all -> 0x006d, blocks: (B:21:0x0048, B:23:0x0056, B:26:0x0070, B:28:0x0085, B:30:0x009b, B:35:0x00bf, B:37:0x00cd, B:42:0x00f4, B:48:0x012b, B:50:0x012f, B:52:0x013e, B:43:0x00fc, B:45:0x0102, B:47:0x011d, B:46:0x0105, B:38:0x00db, B:40:0x00df, B:31:0x00a6, B:33:0x00aa), top: B:100:0x0048 }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x012f A[Catch: all -> 0x006d, TryCatch #1 {all -> 0x006d, blocks: (B:21:0x0048, B:23:0x0056, B:26:0x0070, B:28:0x0085, B:30:0x009b, B:35:0x00bf, B:37:0x00cd, B:42:0x00f4, B:48:0x012b, B:50:0x012f, B:52:0x013e, B:43:0x00fc, B:45:0x0102, B:47:0x011d, B:46:0x0105, B:38:0x00db, B:40:0x00df, B:31:0x00a6, B:33:0x00aa), top: B:100:0x0048 }] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0198  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean m4402a(com.tencent.bugly.crashreport.crash.CrashDetailBean r19, boolean r20) {
        /*
            Method dump skipped, instructions count: 638
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.bugly.proguard.C6443as.m4402a(com.tencent.bugly.crashreport.crash.CrashDetailBean, boolean):boolean");
    }

    /* renamed from: b */
    private static List<C6442ar> m4386b() {
        ArrayList arrayList = new ArrayList();
        Cursor cursor = null;
        try {
            Cursor cursorM4671a = C6494w.m4656a().m4671a("t_cr", new String[]{"_id", "_tm", "_s1", "_up", "_me", "_uc"}, (String) null);
            if (cursorM4671a == null) {
                if (cursorM4671a != null) {
                    cursorM4671a.close();
                }
                return null;
            }
            try {
                if (cursorM4671a.getCount() <= 0) {
                    cursorM4671a.close();
                    return arrayList;
                }
                StringBuilder sb = new StringBuilder();
                sb.append("_id in (");
                int i10 = 0;
                while (cursorM4671a.moveToNext()) {
                    C6442ar c6442arM4385b = m4385b(cursorM4671a);
                    if (c6442arM4385b != null) {
                        arrayList.add(c6442arM4385b);
                    } else {
                        try {
                            sb.append(cursorM4671a.getLong(cursorM4671a.getColumnIndex("_id")));
                            sb.append(",");
                            i10++;
                        } catch (Throwable unused) {
                            C6436al.m4288d("unknown id!", new Object[0]);
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
                    C6436al.m4288d("deleted %s illegal data %d", "t_cr", Integer.valueOf(C6494w.m4656a().m4669a("t_cr", string)));
                }
                cursorM4671a.close();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                cursor = cursorM4671a;
                try {
                    if (!C6436al.m4284a(th)) {
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
    private static void m4395c(ArrayList<C6465bn> arrayList, String str) {
        if (C6440ap.m4346b(str)) {
            return;
        }
        try {
            C6465bn c6465bn = new C6465bn((byte) 1, "crashInfos.txt", str.getBytes("utf-8"));
            C6436al.m4287c("attach crash infos", new Object[0]);
            arrayList.add(c6465bn);
        } catch (Exception e10) {
            e10.printStackTrace();
            C6436al.m4284a(e10);
        }
    }

    /* renamed from: b */
    private static void m4389b(ArrayList<C6465bn> arrayList, String str) {
        if (str != null) {
            try {
                arrayList.add(new C6465bn((byte) 1, "jniLog.txt", str.getBytes("utf-8")));
            } catch (Exception e10) {
                e10.printStackTrace();
                C6436al.m4284a(e10);
            }
        }
    }

    /* renamed from: b */
    private static void m4388b(ArrayList<C6465bn> arrayList, CrashDetailBean crashDetailBean, Context context) {
        String str;
        if (crashDetailBean.f4429b == 1 && (str = crashDetailBean.f4449v) != null) {
            try {
                C6465bn c6465bnM4365a = m4365a("tomb.zip", context, str);
                if (c6465bnM4365a != null) {
                    C6436al.m4287c("attach tombs", new Object[0]);
                    arrayList.add(c6465bnM4365a);
                }
            } catch (Exception e10) {
                C6436al.m4284a(e10);
            }
        }
    }

    /* renamed from: b */
    private static void m4390b(ArrayList<C6465bn> arrayList, byte[] bArr) {
        if (bArr == null || bArr.length <= 0) {
            return;
        }
        try {
            arrayList.add(new C6465bn((byte) 1, "userExtraByteData", bArr));
            C6436al.m4287c("attach extraData", new Object[0]);
        } catch (Exception e10) {
            C6436al.m4284a(e10);
        }
    }

    /* renamed from: b */
    private boolean m4392b(CrashDetailBean crashDetailBean, List<C6442ar> list, List<C6442ar> list2) {
        boolean z10;
        int i10 = crashDetailBean.f4429b;
        boolean z11 = i10 == 0 || i10 == 1;
        boolean z12 = i10 == 3;
        if (C6487p.f4979c) {
            z10 = false;
        } else {
            z10 = (z12 || z11) ? C6444at.f4701e : true;
        }
        if (!z10) {
            return false;
        }
        ArrayList<C6442ar> arrayList = new ArrayList(10);
        if (!m4383a(crashDetailBean, list, arrayList)) {
            try {
                if (arrayList.size() >= C6444at.f4700d) {
                }
            } catch (Exception e10) {
                C6436al.m4284a(e10);
                C6436al.m4288d("Failed to merge crash.", new Object[0]);
            }
            return false;
        }
        C6436al.m4283a("same crash occur too much do merged!", new Object[0]);
        CrashDetailBean crashDetailBeanM4364a = m4364a((List<C6442ar>) arrayList, crashDetailBean);
        for (C6442ar c6442ar : arrayList) {
            if (c6442ar.f4674a != crashDetailBeanM4364a.f4427a) {
                list2.add(c6442ar);
            }
        }
        m4403b(crashDetailBeanM4364a);
        m4396d(list2);
        C6436al.m4285b("[crash] save crash success. For this device crash many times, it will not upload crashes immediately", new Object[0]);
        return true;
    }

    /* renamed from: a */
    private static boolean m4384a(String str) {
        String str2 = C6444at.f4714r;
        if (str2 != null && !str2.isEmpty()) {
            try {
                C6436al.m4287c("Crash regular filter for crash stack is: %s", C6444at.f4714r);
                if (Pattern.compile(C6444at.f4714r).matcher(str).find()) {
                    C6436al.m4288d("This crash matches the regular filter string set. It will not be record and upload.", new Object[0]);
                    return true;
                }
            } catch (Exception e10) {
                C6436al.m4284a(e10);
                C6436al.m4288d("Failed to compile " + C6444at.f4714r, new Object[0]);
            }
        }
        return false;
    }

    /* renamed from: a */
    private static boolean m4383a(CrashDetailBean crashDetailBean, List<C6442ar> list, List<C6442ar> list2) {
        boolean z10 = false;
        for (C6442ar c6442ar : list) {
            if (crashDetailBean.f4448u.equals(c6442ar.f4676c)) {
                if (c6442ar.f4678e) {
                    z10 = true;
                }
                list2.add(c6442ar);
            }
        }
        return z10;
    }

    /* renamed from: a */
    public static List<CrashDetailBean> m4368a() {
        StrategyBean strategyBeanM4221c = C6427ac.m4212a().m4221c();
        if (strategyBeanM4221c == null) {
            C6436al.m4288d("have not synced remote!", new Object[0]);
            return null;
        }
        if (!strategyBeanM4221c.f4383f) {
            C6436al.m4288d("Crashreport remote closed, please check your APP ID correct and Version available, then uninstall and reinstall your app.", new Object[0]);
            C6436al.m4285b("[init] WARNING! Crashreport closed by server, please check your APP ID correct and Version available, then uninstall and reinstall your app.", new Object[0]);
            return null;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        long jM4338b = C6440ap.m4338b();
        List<C6442ar> listM4386b = m4386b();
        C6436al.m4287c("Size of crash list loaded from DB: %s", Integer.valueOf(listM4386b.size()));
        if (listM4386b.size() <= 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        arrayList.addAll(m4369a(listM4386b));
        listM4386b.removeAll(arrayList);
        Iterator<C6442ar> it = listM4386b.iterator();
        while (it.hasNext()) {
            C6442ar next = it.next();
            long j10 = next.f4675b;
            if (j10 < jM4338b - C6444at.f4706j) {
                arrayList2.add(next);
                it.remove();
                arrayList.add(next);
            } else if (next.f4677d) {
                if (j10 >= jCurrentTimeMillis - CalendarModelKt.MillisecondsIn24Hours) {
                    it.remove();
                } else if (!next.f4678e) {
                    it.remove();
                    arrayList.add(next);
                }
            } else if (next.f4679f >= 3 && j10 < jCurrentTimeMillis - CalendarModelKt.MillisecondsIn24Hours) {
                it.remove();
                arrayList.add(next);
            }
        }
        m4391b(arrayList2);
        if (arrayList.size() > 0) {
            m4396d(arrayList);
        }
        ArrayList arrayList3 = new ArrayList();
        List<CrashDetailBean> listM4394c = m4394c(listM4386b);
        if (listM4394c != null && listM4394c.size() > 0) {
            String str = C6425aa.m4150b().f4549o;
            Iterator<CrashDetailBean> it2 = listM4394c.iterator();
            while (it2.hasNext()) {
                CrashDetailBean next2 = it2.next();
                if (!str.equals(next2.f4433f)) {
                    it2.remove();
                    arrayList3.add(next2);
                }
            }
        }
        if (arrayList3.size() > 0) {
            m4399e(arrayList3);
        }
        return listM4394c;
    }

    /* renamed from: a */
    public final void m4400a(CrashDetailBean crashDetailBean) {
        int i10 = crashDetailBean.f4429b;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 == 3 && !C6444at.m4406a().m4422k()) {
                    return;
                }
            } else if (!C6444at.m4406a().m4421j()) {
                return;
            }
        } else if (!C6444at.m4406a().m4421j()) {
            return;
        }
        if (this.f4690f != null) {
            C6436al.m4287c("Calling 'onCrashHandleEnd' of RQD crash listener.", new Object[0]);
        }
    }

    /* renamed from: a */
    public final void m4401a(final List<CrashDetailBean> list, long j10, final boolean z10, boolean z11, boolean z12) {
        if (!C6425aa.m4148a(this.f4686b).f4540f) {
            C6436al.m4288d("warn: not upload process", new Object[0]);
            return;
        }
        C6433ai c6433ai = this.f4687c;
        if (c6433ai == null) {
            C6436al.m4288d("warn: upload manager is null", new Object[0]);
            return;
        }
        if (!z12 && !c6433ai.m4265b(C6444at.f4698a)) {
            C6436al.m4288d("warn: not crashHappen or not should upload", new Object[0]);
            return;
        }
        StrategyBean strategyBeanM4221c = this.f4689e.m4221c();
        if (!strategyBeanM4221c.f4383f) {
            C6436al.m4288d("remote report is disable!", new Object[0]);
            C6436al.m4285b("[crash] server closed bugly in this app. please check your appid if is correct, and re-install it", new Object[0]);
            return;
        }
        if (list != null && list.size() != 0) {
            try {
                String str = strategyBeanM4221c.f4395r;
                String str2 = StrategyBean.f4379b;
                C6467bp c6467bpM4367a = m4367a(this.f4686b, list, C6425aa.m4150b());
                if (c6467bpM4367a == null) {
                    C6436al.m4288d("create eupPkg fail!", new Object[0]);
                    return;
                }
                byte[] bArrM4230a = C6429ae.m4230a((AbstractC6484m) c6467bpM4367a);
                if (bArrM4230a == null) {
                    C6436al.m4288d("send encode fail!", new Object[0]);
                    return;
                }
                C6468bq c6468bqM4226a = C6429ae.m4226a(this.f4686b, 830, bArrM4230a);
                if (c6468bqM4226a == null) {
                    C6436al.m4288d("request package is null.", new Object[0]);
                    return;
                }
                final long jCurrentTimeMillis = System.currentTimeMillis();
                InterfaceC6432ah interfaceC6432ah = new InterfaceC6432ah() { // from class: com.tencent.bugly.proguard.as.6
                    @Override // com.tencent.bugly.proguard.InterfaceC6432ah
                    /* renamed from: a */
                    public final void mo4247a(boolean z13, String str3) {
                        C6443as.m4380a(list, z13, System.currentTimeMillis() - jCurrentTimeMillis, z10 ? "realtime" : "cache", str3);
                        C6443as.m4382a(z13, (List<CrashDetailBean>) list);
                    }
                };
                if (z10) {
                    this.f4687c.m4262a(f4680a, c6468bqM4226a, str, str2, interfaceC6432ah, j10, z11);
                    return;
                } else {
                    this.f4687c.m4263a(f4680a, c6468bqM4226a, str, str2, interfaceC6432ah, false);
                    return;
                }
            } catch (Throwable th) {
                C6436al.m4289e("req cr error %s", th.toString());
                if (C6436al.m4286b(th)) {
                    return;
                }
                th.printStackTrace();
                return;
            }
        }
        C6436al.m4288d("warn: crashList is null or crashList num is 0", new Object[0]);
    }

    /* renamed from: a */
    public static void m4382a(boolean z10, List<CrashDetailBean> list) {
        if (list != null && list.size() > 0) {
            C6436al.m4287c("up finish update state %b", Boolean.valueOf(z10));
            for (CrashDetailBean crashDetailBean : list) {
                C6436al.m4287c("pre uid:%s uc:%d re:%b me:%b", crashDetailBean.f4430c, Integer.valueOf(crashDetailBean.f4439l), Boolean.valueOf(crashDetailBean.f4431d), Boolean.valueOf(crashDetailBean.f4437j));
                int i10 = crashDetailBean.f4439l + 1;
                crashDetailBean.f4439l = i10;
                crashDetailBean.f4431d = z10;
                C6436al.m4287c("set uid:%s uc:%d re:%b me:%b", crashDetailBean.f4430c, Integer.valueOf(i10), Boolean.valueOf(crashDetailBean.f4431d), Boolean.valueOf(crashDetailBean.f4437j));
            }
            Iterator<CrashDetailBean> it = list.iterator();
            while (it.hasNext()) {
                C6444at.m4406a().m4411a(it.next());
            }
            C6436al.m4287c("update state size %d", Integer.valueOf(list.size()));
        }
        if (z10) {
            return;
        }
        C6436al.m4285b("[crash] upload fail.", new Object[0]);
    }

    /* renamed from: a */
    private static CrashDetailBean m4363a(Cursor cursor) {
        if (cursor == null) {
            return null;
        }
        try {
            byte[] blob = cursor.getBlob(cursor.getColumnIndex("_dt"));
            if (blob == null) {
                return null;
            }
            long j10 = cursor.getLong(cursor.getColumnIndex("_id"));
            CrashDetailBean crashDetailBean = (CrashDetailBean) C6440ap.m4317a(blob, CrashDetailBean.CREATOR);
            if (crashDetailBean == null) {
                return crashDetailBean;
            }
            crashDetailBean.f4427a = j10;
            return crashDetailBean;
        } catch (Throwable th) {
            if (!C6436al.m4284a(th)) {
                th.printStackTrace();
            }
            return null;
        }
    }

    /* renamed from: a */
    private static C6466bo m4366a(Context context, CrashDetailBean crashDetailBean, C6425aa c6425aa) {
        ArrayList<C6463bl> arrayList = null;
        if (context != null && crashDetailBean != null && c6425aa != null) {
            C6466bo c6466bo = new C6466bo();
            c6466bo.f4847a = m4398e(crashDetailBean);
            c6466bo.f4848b = crashDetailBean.f4445r;
            c6466bo.f4849c = crashDetailBean.f4441n;
            c6466bo.f4850d = crashDetailBean.f4442o;
            c6466bo.f4851e = crashDetailBean.f4443p;
            c6466bo.f4853g = crashDetailBean.f4444q;
            c6466bo.f4854h = crashDetailBean.f4453z;
            c6466bo.f4855i = crashDetailBean.f4430c;
            c6466bo.f4856j = null;
            c6466bo.f4858l = crashDetailBean.f4440m;
            c6466bo.f4859m = crashDetailBean.f4432e;
            c6466bo.f4852f = crashDetailBean.f4402B;
            c6466bo.f4860n = null;
            Map<String, PlugInBean> map = crashDetailBean.f4435h;
            if (map != null && !map.isEmpty()) {
                arrayList = new ArrayList<>(crashDetailBean.f4435h.size());
                for (Map.Entry<String, PlugInBean> entry : crashDetailBean.f4435h.entrySet()) {
                    C6463bl c6463bl = new C6463bl();
                    c6463bl.f4827a = entry.getValue().f4375a;
                    c6463bl.f4829c = entry.getValue().f4377c;
                    c6463bl.f4831e = entry.getValue().f4376b;
                    arrayList.add(c6463bl);
                }
            }
            c6466bo.f4862p = arrayList;
            C6436al.m4287c("libInfo %s", c6466bo.f4861o);
            ArrayList<C6465bn> arrayList2 = new ArrayList<>(20);
            m4374a(arrayList2, crashDetailBean);
            m4376a(arrayList2, crashDetailBean.f4450w);
            m4389b(arrayList2, crashDetailBean.f4451x);
            m4395c(arrayList2, crashDetailBean.f4426Z);
            m4377a(arrayList2, crashDetailBean.f4428aa, context);
            m4379a(arrayList2, crashDetailBean.f4452y);
            m4375a(arrayList2, crashDetailBean, context);
            m4388b(arrayList2, crashDetailBean, context);
            m4378a(arrayList2, c6425aa.f4497L);
            m4390b(arrayList2, crashDetailBean.f4425Y);
            c6466bo.f4863q = arrayList2;
            if (crashDetailBean.f4437j) {
                c6466bo.f4857k = crashDetailBean.f4447t;
            }
            c6466bo.f4864r = m4370a(crashDetailBean, c6425aa);
            c6466bo.f4865s = new HashMap();
            Map<String, String> map2 = crashDetailBean.f4419S;
            if (map2 != null && map2.size() > 0) {
                c6466bo.f4865s.putAll(crashDetailBean.f4419S);
                C6436al.m4283a("setted message size %d", Integer.valueOf(c6466bo.f4865s.size()));
            }
            Map<String, String> map3 = c6466bo.f4865s;
            C6436al.m4287c("pss:" + crashDetailBean.f4409I + " vss:" + crashDetailBean.f4410J + " javaHeap:" + crashDetailBean.f4411K, new Object[0]);
            StringBuilder sb = new StringBuilder();
            sb.append(crashDetailBean.f4409I);
            map3.put("SDK_UPLOAD_U1", sb.toString());
            StringBuilder sb2 = new StringBuilder();
            sb2.append(crashDetailBean.f4410J);
            map3.put("SDK_UPLOAD_U2", sb2.toString());
            StringBuilder sb3 = new StringBuilder();
            sb3.append(crashDetailBean.f4411K);
            map3.put("SDK_UPLOAD_U3", sb3.toString());
            C6436al.m4287c("%s rid:%s sess:%s ls:%ds isR:%b isF:%b isM:%b isN:%b mc:%d ,%s ,isUp:%b ,vm:%d", crashDetailBean.f4441n, crashDetailBean.f4430c, c6425aa.m4161d(), Long.valueOf((crashDetailBean.f4445r - crashDetailBean.f4417Q) / 1000), Boolean.valueOf(crashDetailBean.f4438k), Boolean.valueOf(crashDetailBean.f4418R), Boolean.valueOf(crashDetailBean.f4437j), Boolean.valueOf(crashDetailBean.f4429b == 1), Integer.valueOf(crashDetailBean.f4447t), crashDetailBean.f4446s, Boolean.valueOf(crashDetailBean.f4431d), Integer.valueOf(c6466bo.f4864r.size()));
            return c6466bo;
        }
        C6436al.m4288d("enExp args == null", new Object[0]);
        return null;
    }

    /* renamed from: a */
    private static C6467bp m4367a(Context context, List<CrashDetailBean> list, C6425aa c6425aa) {
        if (context != null && list != null && list.size() != 0 && c6425aa != null) {
            C6467bp c6467bp = new C6467bp();
            c6467bp.f4869a = new ArrayList<>();
            Iterator<CrashDetailBean> it = list.iterator();
            while (it.hasNext()) {
                c6467bp.f4869a.add(m4366a(context, it.next(), c6425aa));
            }
            return c6467bp;
        }
        C6436al.m4288d("enEXPPkg args == null!", new Object[0]);
        return null;
    }

    /* renamed from: a */
    private static C6465bn m4365a(String str, Context context, String str2) throws IOException {
        FileInputStream fileInputStream;
        if (str2 != null && context != null) {
            C6436al.m4287c("zip %s", str2);
            File file = new File(str2);
            File file2 = new File(context.getCacheDir(), str);
            if (!C6440ap.m4333a(file, file2)) {
                C6436al.m4288d("zip fail!", new Object[0]);
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
                C6436al.m4287c("read bytes :%d", Integer.valueOf(byteArray.length));
                C6465bn c6465bn = new C6465bn((byte) 2, file2.getName(), byteArray);
                try {
                    fileInputStream.close();
                } catch (IOException e10) {
                    if (!C6436al.m4284a(e10)) {
                        e10.printStackTrace();
                    }
                }
                if (file2.exists()) {
                    C6436al.m4287c("del tmp", new Object[0]);
                    file2.delete();
                }
                return c6465bn;
            } catch (Throwable th2) {
                th = th2;
                try {
                    if (!C6436al.m4284a(th)) {
                        th.printStackTrace();
                    }
                    if (fileInputStream != null) {
                        try {
                            fileInputStream.close();
                        } catch (IOException e11) {
                            if (!C6436al.m4284a(e11)) {
                                e11.printStackTrace();
                            }
                        }
                    }
                    if (file2.exists()) {
                        C6436al.m4287c("del tmp", new Object[0]);
                        file2.delete();
                    }
                    return null;
                } catch (Throwable th3) {
                    if (fileInputStream != null) {
                        try {
                            fileInputStream.close();
                        } catch (IOException e12) {
                            if (!C6436al.m4284a(e12)) {
                                e12.printStackTrace();
                            }
                        }
                    }
                    if (file2.exists()) {
                        C6436al.m4287c("del tmp", new Object[0]);
                        file2.delete();
                    }
                    throw th3;
                }
            }
        }
        C6436al.m4288d("rqdp{  createZipAttachment sourcePath == null || context == null ,pls check}", new Object[0]);
        return null;
    }

    /* renamed from: a */
    public static void m4373a(String str, String str2, String str3, String str4, String str5, CrashDetailBean crashDetailBean) {
        String str6;
        C6425aa c6425aaM4150b = C6425aa.m4150b();
        if (c6425aaM4150b == null) {
            return;
        }
        C6436al.m4289e("#++++++++++Record By Bugly++++++++++#", new Object[0]);
        C6436al.m4289e("# You can use Bugly(http:\\\\bugly.qq.com) to get more Crash Detail!", new Object[0]);
        C6436al.m4289e("# PKG NAME: %s", c6425aaM4150b.f4537c);
        C6436al.m4289e("# APP VER: %s", c6425aaM4150b.f4549o);
        C6436al.m4289e("# SDK VER: %s", c6425aaM4150b.f4542h);
        C6436al.m4289e("# LAUNCH TIME: %s", C6440ap.m4325a(new Date(C6425aa.m4150b().f4511a)));
        C6436al.m4289e("# CRASH TYPE: %s", str);
        C6436al.m4289e("# CRASH TIME: %s", str2);
        C6436al.m4289e("# CRASH PROCESS: %s", str3);
        C6436al.m4289e("# CRASH FOREGROUND: %s", Boolean.valueOf(c6425aaM4150b.m4156a()));
        C6436al.m4289e("# CRASH THREAD: %s", str4);
        if (crashDetailBean != null) {
            C6436al.m4289e("# REPORT ID: %s", crashDetailBean.f4430c);
            C6436al.m4289e("# CRASH DEVICE: %s %s", c6425aaM4150b.m4169h(), c6425aaM4150b.m4178r().booleanValue() ? "ROOTED" : "UNROOT");
            C6436al.m4289e("# RUNTIME AVAIL RAM:%d ROM:%d SD:%d", Long.valueOf(crashDetailBean.f4403C), Long.valueOf(crashDetailBean.f4404D), Long.valueOf(crashDetailBean.f4405E));
            C6436al.m4289e("# RUNTIME TOTAL RAM:%d ROM:%d SD:%d", Long.valueOf(crashDetailBean.f4406F), Long.valueOf(crashDetailBean.f4407G), Long.valueOf(crashDetailBean.f4408H));
            if (!C6440ap.m4346b(crashDetailBean.f4415O)) {
                C6436al.m4289e("# EXCEPTION FIRED BY %s %s", crashDetailBean.f4415O, crashDetailBean.f4414N);
            } else if (crashDetailBean.f4429b == 3) {
                if (crashDetailBean.f4420T == null) {
                    str6 = "null";
                } else {
                    str6 = crashDetailBean.f4420T.get("BUGLY_CR_01");
                }
                C6436al.m4289e("# EXCEPTION ANR MESSAGE:\n %s", str6);
            }
        }
        if (!C6440ap.m4346b(str5)) {
            C6436al.m4289e("# CRASH STACK: ", new Object[0]);
            C6436al.m4289e(str5, new Object[0]);
        }
        C6436al.m4289e("#++++++++++++++++++++++++++++++++++++++++++#", new Object[0]);
    }

    /* renamed from: a */
    private static void m4372a(CrashDetailBean crashDetailBean, Map<String, String> map) {
        String value;
        if (map != null && !map.isEmpty()) {
            crashDetailBean.f4419S = new LinkedHashMap(map.size());
            for (Map.Entry<String, String> entry : map.entrySet()) {
                if (!C6440ap.m4346b(entry.getKey())) {
                    String key = entry.getKey();
                    if (key.length() > 100) {
                        key = key.substring(0, 100);
                        C6436al.m4288d("setted key length is over limit %d substring to %s", 100, key);
                    }
                    if (!C6440ap.m4346b(entry.getValue()) && entry.getValue().length() > 100000) {
                        value = entry.getValue().substring(entry.getValue().length() - 100000);
                        C6436al.m4288d("setted %s value length is over limit %d substring", key, 100000);
                    } else {
                        value = entry.getValue();
                    }
                    crashDetailBean.f4419S.put(key, value);
                    C6436al.m4283a("add setted key %s value size:%d", key, Integer.valueOf(value.length()));
                }
            }
            return;
        }
        C6436al.m4288d("extra map is empty. CrashBean won't have userDatas.", new Object[0]);
    }

    /* renamed from: a */
    private static void m4374a(ArrayList<C6465bn> arrayList, CrashDetailBean crashDetailBean) {
        String str;
        if (crashDetailBean.f4437j && (str = crashDetailBean.f4446s) != null && str.length() > 0) {
            try {
                arrayList.add(new C6465bn((byte) 1, "alltimes.txt", crashDetailBean.f4446s.getBytes("utf-8")));
            } catch (Exception e10) {
                e10.printStackTrace();
                C6436al.m4284a(e10);
            }
        }
    }

    /* renamed from: a */
    private static void m4376a(ArrayList<C6465bn> arrayList, String str) {
        if (str != null) {
            try {
                arrayList.add(new C6465bn((byte) 1, "log.txt", str.getBytes("utf-8")));
            } catch (Exception e10) {
                e10.printStackTrace();
                C6436al.m4284a(e10);
            }
        }
    }

    /* renamed from: a */
    private static void m4377a(ArrayList<C6465bn> arrayList, String str, Context context) {
        if (str != null) {
            try {
                C6465bn c6465bnM4365a = m4365a("backupRecord.zip", context, str);
                if (c6465bnM4365a != null) {
                    C6436al.m4287c("attach backup record", new Object[0]);
                    arrayList.add(c6465bnM4365a);
                }
            } catch (Exception e10) {
                C6436al.m4284a(e10);
            }
        }
    }

    /* renamed from: a */
    private static void m4379a(ArrayList<C6465bn> arrayList, byte[] bArr) {
        if (bArr == null || bArr.length <= 0) {
            return;
        }
        try {
            C6465bn c6465bn = new C6465bn((byte) 2, "buglylog.zip", bArr);
            C6436al.m4287c("attach user log", new Object[0]);
            arrayList.add(c6465bn);
        } catch (Exception e10) {
            C6436al.m4284a(e10);
        }
    }

    /* renamed from: a */
    private static void m4375a(ArrayList<C6465bn> arrayList, CrashDetailBean crashDetailBean, Context context) {
        C6465bn c6465bnM4365a;
        if (crashDetailBean.f4429b != 3) {
            return;
        }
        C6436al.m4287c("crashBean.anrMessages:%s", crashDetailBean.f4420T);
        try {
            Map<String, String> map = crashDetailBean.f4420T;
            if (map != null && map.containsKey("BUGLY_CR_01")) {
                if (!TextUtils.isEmpty(crashDetailBean.f4420T.get("BUGLY_CR_01"))) {
                    arrayList.add(new C6465bn((byte) 1, "anrMessage.txt", crashDetailBean.f4420T.get("BUGLY_CR_01").getBytes("utf-8")));
                    C6436al.m4287c("attach anr message", new Object[0]);
                }
                crashDetailBean.f4420T.remove("BUGLY_CR_01");
            }
            String str = crashDetailBean.f4449v;
            if (str == null || (c6465bnM4365a = m4365a("trace.zip", context, str)) == null) {
                return;
            }
            C6436al.m4287c("attach traces", new Object[0]);
            arrayList.add(c6465bnM4365a);
        } catch (Exception e10) {
            e10.printStackTrace();
            C6436al.m4284a(e10);
        }
    }

    /* renamed from: a */
    private static void m4378a(ArrayList<C6465bn> arrayList, List<String> list) {
        if (list == null || list.isEmpty()) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            sb.append(it.next());
        }
        try {
            arrayList.add(new C6465bn((byte) 1, "martianlog.txt", sb.toString().getBytes("utf-8")));
            C6436al.m4287c("attach pageTracingList", new Object[0]);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    /* renamed from: a */
    private static Map<String, String> m4370a(CrashDetailBean crashDetailBean, C6425aa c6425aa) {
        HashMap map = new HashMap(30);
        try {
            StringBuilder sb = new StringBuilder();
            sb.append(crashDetailBean.f4403C);
            map.put("A9", sb.toString());
            StringBuilder sb2 = new StringBuilder();
            sb2.append(crashDetailBean.f4404D);
            map.put("A11", sb2.toString());
            StringBuilder sb3 = new StringBuilder();
            sb3.append(crashDetailBean.f4405E);
            map.put("A10", sb3.toString());
            map.put("A23", crashDetailBean.f4433f);
            StringBuilder sb4 = new StringBuilder();
            c6425aa.getClass();
            map.put("A7", sb4.toString());
            map.put("A6", C6425aa.m4151n());
            map.put("A5", c6425aa.m4174m());
            map.put("A22", c6425aa.m4167g());
            StringBuilder sb5 = new StringBuilder();
            sb5.append(crashDetailBean.f4407G);
            map.put("A2", sb5.toString());
            StringBuilder sb6 = new StringBuilder();
            sb6.append(crashDetailBean.f4406F);
            map.put("A1", sb6.toString());
            map.put("A24", c6425aa.f4545k);
            StringBuilder sb7 = new StringBuilder();
            sb7.append(crashDetailBean.f4408H);
            map.put("A17", sb7.toString());
            map.put("A25", c6425aa.m4167g());
            map.put("A15", c6425aa.m4177q());
            StringBuilder sb8 = new StringBuilder();
            sb8.append(c6425aa.m4178r());
            map.put("A13", sb8.toString());
            map.put("A34", crashDetailBean.f4401A);
            if (c6425aa.f4492G != null) {
                map.put("productIdentify", c6425aa.f4492G);
            }
            map.put("A26", URLEncoder.encode(crashDetailBean.f4412L, "utf-8"));
            if (crashDetailBean.f4429b == 1) {
                map.put("A27", crashDetailBean.f4415O);
                map.put("A28", crashDetailBean.f4414N);
                StringBuilder sb9 = new StringBuilder();
                sb9.append(crashDetailBean.f4438k);
                map.put("A29", sb9.toString());
            }
            map.put("A30", crashDetailBean.f4416P);
            StringBuilder sb10 = new StringBuilder();
            sb10.append(crashDetailBean.f4417Q);
            map.put("A18", sb10.toString());
            StringBuilder sb11 = new StringBuilder();
            sb11.append(true ^ crashDetailBean.f4418R);
            map.put("A36", sb11.toString());
            StringBuilder sb12 = new StringBuilder();
            sb12.append(c6425aa.f4560z);
            map.put("F02", sb12.toString());
            StringBuilder sb13 = new StringBuilder();
            sb13.append(c6425aa.f4486A);
            map.put("F03", sb13.toString());
            map.put("F04", c6425aa.m4161d());
            StringBuilder sb14 = new StringBuilder();
            sb14.append(c6425aa.f4487B);
            map.put("F05", sb14.toString());
            map.put("F06", c6425aa.f4559y);
            map.put("F08", c6425aa.f4490E);
            map.put("F09", c6425aa.f4491F);
            StringBuilder sb15 = new StringBuilder();
            sb15.append(c6425aa.f4488C);
            map.put("F10", sb15.toString());
            m4381a(map, crashDetailBean);
            return map;
        } catch (Exception e10) {
            e10.printStackTrace();
            C6436al.m4284a(e10);
            return map;
        }
    }

    /* renamed from: a */
    private static void m4381a(Map<String, String> map, CrashDetailBean crashDetailBean) {
        if (crashDetailBean.f4421U >= 0) {
            StringBuilder sb = new StringBuilder();
            sb.append(crashDetailBean.f4421U);
            map.put("C01", sb.toString());
        }
        if (crashDetailBean.f4422V >= 0) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(crashDetailBean.f4422V);
            map.put("C02", sb2.toString());
        }
        Map<String, String> map2 = crashDetailBean.f4423W;
        if (map2 != null && map2.size() > 0) {
            for (Map.Entry<String, String> entry : crashDetailBean.f4423W.entrySet()) {
                map.put("C03_" + entry.getKey(), entry.getValue());
            }
        }
        Map<String, String> map3 = crashDetailBean.f4424X;
        if (map3 == null || map3.size() <= 0) {
            return;
        }
        for (Map.Entry<String, String> entry2 : crashDetailBean.f4424X.entrySet()) {
            map.put("C04_" + entry2.getKey(), entry2.getValue());
        }
    }

    /* renamed from: a */
    public static /* synthetic */ void m4380a(List list, boolean z10, long j10, String str, String str2) {
        if (list == null || list.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            CrashDetailBean crashDetailBean = (CrashDetailBean) it.next();
            String str3 = f4685l.get(Integer.valueOf(crashDetailBean.f4429b));
            if (!TextUtils.isEmpty(str3)) {
                arrayList.add(new C6431ag.c(crashDetailBean.f4430c, str3, crashDetailBean.f4445r, z10, j10, str, str2));
            }
        }
        C6431ag.a.f4581a.m4244a(arrayList);
    }
}
