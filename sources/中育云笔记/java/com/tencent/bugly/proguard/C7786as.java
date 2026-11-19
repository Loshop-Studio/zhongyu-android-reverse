package com.tencent.bugly.proguard;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.os.Environment;
import android.text.TextUtils;
import android.util.Pair;
import com.alibaba.sdk.android.oss.signer.SignParameters;
import com.tencent.bugly.BuglyStrategy;
import com.tencent.bugly.crashreport.common.info.PlugInBean;
import com.tencent.bugly.crashreport.common.strategy.StrategyBean;
import com.tencent.bugly.crashreport.crash.CrashDetailBean;
import com.tencent.bugly.proguard.C7774ag;
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
import org.android.agoo.message.MessageService;

/* renamed from: com.tencent.bugly.proguard.as */
/* loaded from: classes5.dex */
public final class C7786as {

    /* renamed from: a */
    public static int f13779a;

    /* renamed from: h */
    private static final Map<Integer, Pair<String, String>> f13780h = new HashMap<Integer, Pair<String, String>>() { // from class: com.tencent.bugly.proguard.as.1
        {
            put(3, new Pair("203", "103"));
            put(7, new Pair("208", "108"));
            put(0, new Pair("200", MessageService.MSG_DB_COMPLETE));
            put(1, new Pair("201", "101"));
            put(2, new Pair("202", "102"));
            put(4, new Pair("204", "104"));
            put(6, new Pair("206", "106"));
            put(5, new Pair("207", "107"));
        }
    };

    /* renamed from: i */
    private static final ArrayList<b> f13781i = new ArrayList<b>() { // from class: com.tencent.bugly.proguard.as.2
        {
            byte b10 = 0;
            add(new c(b10));
            add(new d(b10));
            add(new e(b10));
            add(new f(b10));
            add(new i(b10));
            add(new j(b10));
            add(new g(b10));
            add(new h(b10));
        }
    };

    /* renamed from: j */
    private static final Map<Integer, Integer> f13782j = new HashMap<Integer, Integer>() { // from class: com.tencent.bugly.proguard.as.3
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
    private static final Map<Integer, String> f13783k = new HashMap<Integer, String>() { // from class: com.tencent.bugly.proguard.as.4
        {
            put(3, "BuglyAnrCrash");
            put(0, "BuglyJavaCrash");
            put(1, "BuglyNativeCrash");
        }
    };

    /* renamed from: l */
    private static final Map<Integer, String> f13784l = new HashMap<Integer, String>() { // from class: com.tencent.bugly.proguard.as.5
        {
            put(3, "BuglyAnrCrashReport");
            put(0, "BuglyJavaCrashReport");
            put(1, "BuglyNativeCrashReport");
        }
    };

    /* renamed from: b */
    protected final Context f13785b;

    /* renamed from: c */
    protected final C7776ai f13786c;

    /* renamed from: d */
    protected final C7837w f13787d;

    /* renamed from: e */
    protected final C7770ac f13788e;

    /* renamed from: f */
    protected InterfaceC7790aw f13789f;

    /* renamed from: g */
    protected BuglyStrategy.C7753a f13790g;

    /* renamed from: com.tencent.bugly.proguard.as$a */
    public class a implements InterfaceC7775ah {

        /* renamed from: a */
        public final /* synthetic */ long f13791a;

        /* renamed from: b */
        public final /* synthetic */ List f13792b;

        /* renamed from: c */
        public final /* synthetic */ boolean f13793c;

        public a(long j10, List list, boolean z10) {
            this.f13791a = j10;
            this.f13792b = list;
            this.f13793c = z10;
        }

        @Override // com.tencent.bugly.proguard.InterfaceC7775ah
        /* renamed from: a */
        public final void mo10577a(boolean z10, String str) {
            C7786as.m10710a(this.f13792b, z10, System.currentTimeMillis() - this.f13791a, this.f13793c ? "realtime" : "cache", str);
            C7786as.m10712a(z10, (List<CrashDetailBean>) this.f13792b);
        }
    }

    /* renamed from: com.tencent.bugly.proguard.as$b */
    public static abstract class b {

        /* renamed from: a */
        public final int f13795a;

        public /* synthetic */ b(int i10, byte b10) {
            this(i10);
        }

        /* renamed from: a */
        public abstract boolean mo10735a();

        public b(int i10) {
            this.f13795a = i10;
        }
    }

    /* renamed from: com.tencent.bugly.proguard.as$c */
    public static class c extends b {
        public /* synthetic */ c(byte b10) {
            this();
        }

        @Override // com.tencent.bugly.proguard.C7786as.b
        /* renamed from: a */
        public final boolean mo10735a() {
            return C7787at.m10736a().m10752k();
        }

        public c() {
            super(3, (byte) 0);
        }
    }

    /* renamed from: com.tencent.bugly.proguard.as$d */
    public static class d extends b {
        public /* synthetic */ d(byte b10) {
            this();
        }

        @Override // com.tencent.bugly.proguard.C7786as.b
        /* renamed from: a */
        public final boolean mo10735a() {
            return true;
        }

        public d() {
            super(7, (byte) 0);
        }
    }

    /* renamed from: com.tencent.bugly.proguard.as$e */
    public static class e extends b {
        public /* synthetic */ e(byte b10) {
            this();
        }

        @Override // com.tencent.bugly.proguard.C7786as.b
        /* renamed from: a */
        public final boolean mo10735a() {
            return true;
        }

        public e() {
            super(2, (byte) 0);
        }
    }

    /* renamed from: com.tencent.bugly.proguard.as$f */
    public static class f extends b {
        public /* synthetic */ f(byte b10) {
            this();
        }

        @Override // com.tencent.bugly.proguard.C7786as.b
        /* renamed from: a */
        public final boolean mo10735a() {
            return C7787at.m10736a().m10751j();
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public f() {
            byte b10 = 0;
            super(b10, b10);
        }
    }

    /* renamed from: com.tencent.bugly.proguard.as$g */
    public static class g extends b {
        public /* synthetic */ g(byte b10) {
            this();
        }

        @Override // com.tencent.bugly.proguard.C7786as.b
        /* renamed from: a */
        public final boolean mo10735a() {
            return (C7787at.m10736a().f13815B & 2) > 0;
        }

        public g() {
            super(5, (byte) 0);
        }
    }

    /* renamed from: com.tencent.bugly.proguard.as$h */
    public static class h extends b {
        public /* synthetic */ h(byte b10) {
            this();
        }

        @Override // com.tencent.bugly.proguard.C7786as.b
        /* renamed from: a */
        public final boolean mo10735a() {
            return (C7787at.m10736a().f13815B & 1) > 0;
        }

        public h() {
            super(6, (byte) 0);
        }
    }

    /* renamed from: com.tencent.bugly.proguard.as$i */
    public static class i extends b {
        public /* synthetic */ i(byte b10) {
            this();
        }

        @Override // com.tencent.bugly.proguard.C7786as.b
        /* renamed from: a */
        public final boolean mo10735a() {
            return C7787at.m10736a().m10751j();
        }

        public i() {
            super(1, (byte) 0);
        }
    }

    /* renamed from: com.tencent.bugly.proguard.as$j */
    public static class j extends b {
        public /* synthetic */ j(byte b10) {
            this();
        }

        @Override // com.tencent.bugly.proguard.C7786as.b
        /* renamed from: a */
        public final boolean mo10735a() {
            return (C7787at.m10736a().f13815B & 4) > 0;
        }

        public j() {
            super(4, (byte) 0);
        }
    }

    public C7786as(Context context, C7776ai c7776ai, C7837w c7837w, C7770ac c7770ac, BuglyStrategy.C7753a c7753a) {
        f13779a = 1004;
        this.f13785b = context;
        this.f13786c = c7776ai;
        this.f13787d = c7837w;
        this.f13788e = c7770ac;
        this.f13790g = c7753a;
        this.f13789f = null;
    }

    /* renamed from: a */
    private static List<C7785ar> m10699a(List<C7785ar> list) {
        if (list == null || list.size() == 0) {
            return null;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        ArrayList arrayList = new ArrayList();
        for (C7785ar c7785ar : list) {
            if (c7785ar.f13776d && c7785ar.f13774b <= jCurrentTimeMillis - 86400000) {
                arrayList.add(c7785ar);
            }
        }
        return arrayList;
    }

    /* renamed from: b */
    private static void m10717b(CrashDetailBean crashDetailBean, List<C7785ar> list) {
        StringBuilder sb2 = new StringBuilder(64);
        for (C7785ar c7785ar : list) {
            if (!c7785ar.f13777e && !c7785ar.f13776d) {
                String str = crashDetailBean.f13545s;
                StringBuilder sb3 = new StringBuilder();
                sb3.append(c7785ar.f13774b);
                if (!str.contains(sb3.toString())) {
                    crashDetailBean.f13546t++;
                    sb2.append(c7785ar.f13774b);
                    sb2.append(SignParameters.NEW_LINE);
                }
            }
        }
        crashDetailBean.f13545s += sb2.toString();
    }

    /* renamed from: c */
    private static ContentValues m10723c(CrashDetailBean crashDetailBean) {
        if (crashDetailBean == null) {
            return null;
        }
        try {
            ContentValues contentValues = new ContentValues();
            long j10 = crashDetailBean.f13526a;
            if (j10 > 0) {
                contentValues.put("_id", Long.valueOf(j10));
            }
            contentValues.put("_tm", Long.valueOf(crashDetailBean.f13544r));
            contentValues.put("_s1", crashDetailBean.f13547u);
            contentValues.put("_up", Integer.valueOf(crashDetailBean.f13530d ? 1 : 0));
            contentValues.put("_me", Integer.valueOf(crashDetailBean.f13536j ? 1 : 0));
            contentValues.put("_uc", Integer.valueOf(crashDetailBean.f13538l));
            contentValues.put("_dt", C7783ap.m10665a(crashDetailBean));
            return contentValues;
        } catch (Throwable th) {
            if (!C7779al.m10614a(th)) {
                th.printStackTrace();
            }
            return null;
        }
    }

    /* renamed from: d */
    private static void m10726d(List<C7785ar> list) {
        if (list == null || list.size() == 0) {
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("_id in (");
        Iterator<C7785ar> it = list.iterator();
        while (it.hasNext()) {
            sb2.append(it.next().f13773a);
            sb2.append(",");
        }
        StringBuilder sb3 = new StringBuilder(sb2.substring(0, sb2.lastIndexOf(",")));
        sb3.append(")");
        String string = sb3.toString();
        sb3.setLength(0);
        try {
            C7779al.m10617c("deleted %s data %d", "t_cr", Integer.valueOf(C7837w.m10986a().m10999a("t_cr", string)));
        } catch (Throwable th) {
            if (C7779al.m10614a(th)) {
                return;
            }
            th.printStackTrace();
        }
    }

    /* renamed from: e */
    private static void m10729e(List<CrashDetailBean> list) {
        try {
            if (list.size() == 0) {
                return;
            }
            StringBuilder sb2 = new StringBuilder();
            for (CrashDetailBean crashDetailBean : list) {
                sb2.append(" or _id = ");
                sb2.append(crashDetailBean.f13526a);
            }
            String string = sb2.toString();
            if (string.length() > 0) {
                string = string.substring(4);
            }
            sb2.setLength(0);
            C7779al.m10617c("deleted %s data %d", "t_cr", Integer.valueOf(C7837w.m10986a().m10999a("t_cr", string)));
        } catch (Throwable th) {
            if (C7779al.m10614a(th)) {
                return;
            }
            th.printStackTrace();
        }
    }

    /* renamed from: b */
    private static void m10721b(List<C7785ar> list) {
        List<CrashDetailBean> listM10724c = m10724c(list);
        if (listM10724c == null || listM10724c.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (CrashDetailBean crashDetailBean : listM10724c) {
            String str = f13784l.get(Integer.valueOf(crashDetailBean.f13528b));
            if (!TextUtils.isEmpty(str)) {
                C7779al.m10617c("find expired data,crashId:%s eventType:%s", crashDetailBean.f13529c, str);
                arrayList.add(new C7774ag.c(crashDetailBean.f13529c, str, crashDetailBean.f13544r, false, 0L, "expired", null));
            }
        }
        C7774ag.a.f13678a.m10574a(arrayList);
    }

    /* renamed from: a */
    private static CrashDetailBean m10694a(List<C7785ar> list, CrashDetailBean crashDetailBean) {
        CrashDetailBean crashDetailBean2;
        List<CrashDetailBean> listM10724c;
        if (list.isEmpty()) {
            return crashDetailBean;
        }
        ArrayList arrayList = new ArrayList(10);
        for (C7785ar c7785ar : list) {
            if (c7785ar.f13777e) {
                arrayList.add(c7785ar);
            }
        }
        if (arrayList.isEmpty() || (listM10724c = m10724c(arrayList)) == null || listM10724c.isEmpty()) {
            crashDetailBean2 = null;
        } else {
            Collections.sort(listM10724c);
            crashDetailBean2 = listM10724c.get(0);
            m10701a(crashDetailBean2, listM10724c);
        }
        if (crashDetailBean2 == null) {
            crashDetailBean.f13536j = true;
            crashDetailBean.f13546t = 0;
            crashDetailBean.f13545s = "";
            crashDetailBean2 = crashDetailBean;
        }
        m10717b(crashDetailBean2, list);
        if (crashDetailBean2.f13544r != crashDetailBean.f13544r) {
            String str = crashDetailBean2.f13545s;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(crashDetailBean.f13544r);
            if (!str.contains(sb2.toString())) {
                crashDetailBean2.f13546t++;
                crashDetailBean2.f13545s += crashDetailBean.f13544r + SignParameters.NEW_LINE;
            }
        }
        return crashDetailBean2;
    }

    /* renamed from: c */
    private static List<CrashDetailBean> m10724c(List<C7785ar> list) {
        Cursor cursorM11001a;
        if (list == null || list.size() == 0) {
            return null;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("_id in (");
        Iterator<C7785ar> it = list.iterator();
        while (it.hasNext()) {
            sb2.append(it.next().f13773a);
            sb2.append(",");
        }
        if (sb2.toString().contains(",")) {
            sb2 = new StringBuilder(sb2.substring(0, sb2.lastIndexOf(",")));
        }
        sb2.append(")");
        String string = sb2.toString();
        sb2.setLength(0);
        try {
            cursorM11001a = C7837w.m10986a().m11001a("t_cr", (String[]) null, string);
            if (cursorM11001a == null) {
                return null;
            }
            try {
                ArrayList arrayList = new ArrayList();
                sb2.append("_id in (");
                int i10 = 0;
                while (cursorM11001a.moveToNext()) {
                    CrashDetailBean crashDetailBeanM10693a = m10693a(cursorM11001a);
                    if (crashDetailBeanM10693a != null) {
                        arrayList.add(crashDetailBeanM10693a);
                    } else {
                        try {
                            sb2.append(cursorM11001a.getLong(cursorM11001a.getColumnIndex("_id")));
                            sb2.append(",");
                            i10++;
                        } catch (Throwable unused) {
                            C7779al.m10618d("unknown id!", new Object[0]);
                        }
                    }
                }
                if (sb2.toString().contains(",")) {
                    sb2 = new StringBuilder(sb2.substring(0, sb2.lastIndexOf(",")));
                }
                sb2.append(")");
                String string2 = sb2.toString();
                if (i10 > 0) {
                    C7779al.m10618d("deleted %s illegal data %d", "t_cr", Integer.valueOf(C7837w.m10986a().m10999a("t_cr", string2)));
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

    /* renamed from: e */
    private static String m10728e(CrashDetailBean crashDetailBean) {
        try {
            Pair<String, String> pair = f13780h.get(Integer.valueOf(crashDetailBean.f13528b));
            if (pair == null) {
                C7779al.m10619e("crash type error! %d", Integer.valueOf(crashDetailBean.f13528b));
                return "";
            }
            if (crashDetailBean.f13536j) {
                return (String) pair.first;
            }
            return (String) pair.second;
        } catch (Exception e10) {
            C7779al.m10614a(e10);
            return "";
        }
    }

    /* renamed from: d */
    private boolean m10727d(CrashDetailBean crashDetailBean) {
        String absolutePath;
        try {
            C7779al.m10617c("save eup logs", new Object[0]);
            C7768aa c7768aaM10480b = C7768aa.m10480b();
            String str = "#--------\npackage:" + c7768aaM10480b.m10493e() + "\nversion:" + c7768aaM10480b.f13648o + "\nsdk:" + c7768aaM10480b.f13641h + "\nprocess:" + crashDetailBean.f13500A + "\ndate:" + C7783ap.m10655a(new Date(crashDetailBean.f13544r)) + "\ntype:" + crashDetailBean.f13540n + "\nmessage:" + crashDetailBean.f13541o + "\nstack:\n" + crashDetailBean.f13543q + "\neupID:" + crashDetailBean.f13529c + SignParameters.NEW_LINE;
            if (C7787at.f13808m == null) {
                if (Environment.getExternalStorageState().equals("mounted")) {
                    absolutePath = Environment.getExternalStorageDirectory().getAbsolutePath() + "/Tencent/" + this.f13785b.getPackageName();
                } else {
                    absolutePath = null;
                }
            } else {
                File file = new File(C7787at.f13808m);
                if (file.isFile()) {
                    file = file.getParentFile();
                }
                absolutePath = file.getAbsolutePath();
            }
            C7780am.m10625a(absolutePath + "/euplog.txt", str, C7787at.f13809n);
            return true;
        } catch (Throwable th) {
            C7779al.m10618d("rqdp{  save error} %s", th.toString());
            if (!C7779al.m10614a(th)) {
                th.printStackTrace();
            }
            return false;
        }
    }

    /* renamed from: b */
    public final void m10734b(CrashDetailBean crashDetailBean, boolean z10) {
        if (C7787at.f13810o) {
            C7779al.m10613a("try to upload right now", new Object[0]);
            ArrayList arrayList = new ArrayList();
            arrayList.add(crashDetailBean);
            m10731a(arrayList, 3000L, z10, crashDetailBean.f13528b == 7, z10);
            return;
        }
        C7779al.m10613a("do not upload spot crash right now, crash would be uploaded when app next start", new Object[0]);
    }

    /* renamed from: b */
    public final void m10733b(CrashDetailBean crashDetailBean) {
        if (crashDetailBean == null) {
            return;
        }
        ContentValues contentValuesM10723c = m10723c(crashDetailBean);
        if (contentValuesM10723c != null) {
            long jM11000a = C7837w.m10986a().m11000a("t_cr", contentValuesM10723c, (InterfaceC7836v) null);
            if (jM11000a >= 0) {
                C7779al.m10617c("insert %s success!", "t_cr");
                crashDetailBean.f13526a = jM11000a;
            }
        }
        if (C7787at.f13807l) {
            m10727d(crashDetailBean);
        }
    }

    /* renamed from: a */
    private static void m10701a(CrashDetailBean crashDetailBean, List<CrashDetailBean> list) {
        String[] strArrSplit;
        StringBuilder sb2 = new StringBuilder(128);
        for (int i10 = 1; i10 < list.size(); i10++) {
            String str = list.get(i10).f13545s;
            if (str != null && (strArrSplit = str.split(SignParameters.NEW_LINE)) != null) {
                for (String str2 : strArrSplit) {
                    if (!crashDetailBean.f13545s.contains(str2)) {
                        crashDetailBean.f13546t++;
                        sb2.append(str2);
                        sb2.append(SignParameters.NEW_LINE);
                    }
                }
            }
        }
        crashDetailBean.f13545s += sb2.toString();
    }

    /* renamed from: b */
    private static C7785ar m10715b(Cursor cursor) {
        if (cursor == null) {
            return null;
        }
        try {
            C7785ar c7785ar = new C7785ar();
            c7785ar.f13773a = cursor.getLong(cursor.getColumnIndex("_id"));
            c7785ar.f13774b = cursor.getLong(cursor.getColumnIndex("_tm"));
            c7785ar.f13775c = cursor.getString(cursor.getColumnIndex("_s1"));
            c7785ar.f13776d = cursor.getInt(cursor.getColumnIndex("_up")) == 1;
            c7785ar.f13777e = cursor.getInt(cursor.getColumnIndex("_me")) == 1;
            c7785ar.f13778f = cursor.getInt(cursor.getColumnIndex("_uc"));
            return c7785ar;
        } catch (Throwable th) {
            if (!C7779al.m10614a(th)) {
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
    public final boolean m10732a(com.tencent.bugly.crashreport.crash.CrashDetailBean r19, boolean r20) {
        /*
            Method dump skipped, instructions count: 637
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.bugly.proguard.C7786as.m10732a(com.tencent.bugly.crashreport.crash.CrashDetailBean, boolean):boolean");
    }

    /* renamed from: b */
    private static List<C7785ar> m10716b() {
        ArrayList arrayList = new ArrayList();
        Cursor cursor = null;
        try {
            Cursor cursorM11001a = C7837w.m10986a().m11001a("t_cr", new String[]{"_id", "_tm", "_s1", "_up", "_me", "_uc"}, (String) null);
            if (cursorM11001a == null) {
                if (cursorM11001a != null) {
                    cursorM11001a.close();
                }
                return null;
            }
            try {
                if (cursorM11001a.getCount() <= 0) {
                    cursorM11001a.close();
                    return arrayList;
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append("_id in (");
                int i10 = 0;
                while (cursorM11001a.moveToNext()) {
                    C7785ar c7785arM10715b = m10715b(cursorM11001a);
                    if (c7785arM10715b != null) {
                        arrayList.add(c7785arM10715b);
                    } else {
                        try {
                            sb2.append(cursorM11001a.getLong(cursorM11001a.getColumnIndex("_id")));
                            sb2.append(",");
                            i10++;
                        } catch (Throwable unused) {
                            C7779al.m10618d("unknown id!", new Object[0]);
                        }
                    }
                }
                if (sb2.toString().contains(",")) {
                    sb2 = new StringBuilder(sb2.substring(0, sb2.lastIndexOf(",")));
                }
                sb2.append(")");
                String string = sb2.toString();
                sb2.setLength(0);
                if (i10 > 0) {
                    C7779al.m10618d("deleted %s illegal data %d", "t_cr", Integer.valueOf(C7837w.m10986a().m10999a("t_cr", string)));
                }
                cursorM11001a.close();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                cursor = cursorM11001a;
                try {
                    if (!C7779al.m10614a(th)) {
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
    private static void m10725c(ArrayList<C7808bn> arrayList, String str) {
        if (C7783ap.m10676b(str)) {
            return;
        }
        try {
            C7808bn c7808bn = new C7808bn((byte) 1, "crashInfos.txt", str.getBytes("utf-8"));
            C7779al.m10617c("attach crash infos", new Object[0]);
            arrayList.add(c7808bn);
        } catch (Exception e10) {
            e10.printStackTrace();
            C7779al.m10614a(e10);
        }
    }

    /* renamed from: b */
    private static void m10719b(ArrayList<C7808bn> arrayList, String str) {
        if (str != null) {
            try {
                arrayList.add(new C7808bn((byte) 1, "jniLog.txt", str.getBytes("utf-8")));
            } catch (Exception e10) {
                e10.printStackTrace();
                C7779al.m10614a(e10);
            }
        }
    }

    /* renamed from: b */
    private static void m10718b(ArrayList<C7808bn> arrayList, CrashDetailBean crashDetailBean, Context context) {
        String str;
        if (crashDetailBean.f13528b == 1 && (str = crashDetailBean.f13548v) != null) {
            try {
                C7808bn c7808bnM10695a = m10695a("tomb.zip", context, str);
                if (c7808bnM10695a != null) {
                    C7779al.m10617c("attach tombs", new Object[0]);
                    arrayList.add(c7808bnM10695a);
                }
            } catch (Exception e10) {
                C7779al.m10614a(e10);
            }
        }
    }

    /* renamed from: b */
    private static void m10720b(ArrayList<C7808bn> arrayList, byte[] bArr) {
        if (bArr == null || bArr.length <= 0) {
            return;
        }
        try {
            arrayList.add(new C7808bn((byte) 1, "userExtraByteData", bArr));
            C7779al.m10617c("attach extraData", new Object[0]);
        } catch (Exception e10) {
            C7779al.m10614a(e10);
        }
    }

    /* renamed from: b */
    private boolean m10722b(CrashDetailBean crashDetailBean, List<C7785ar> list, List<C7785ar> list2) {
        boolean z10;
        int i10 = crashDetailBean.f13528b;
        boolean z11 = i10 == 0 || i10 == 1;
        boolean z12 = i10 == 3;
        if (C7830p.f14078c) {
            z10 = false;
        } else {
            z10 = (z12 || z11) ? C7787at.f13800e : true;
        }
        if (!z10) {
            return false;
        }
        ArrayList arrayList = new ArrayList(10);
        if (!m10713a(crashDetailBean, list, arrayList)) {
            try {
                if (arrayList.size() >= C7787at.f13799d) {
                }
            } catch (Exception e10) {
                C7779al.m10614a(e10);
                C7779al.m10618d("Failed to merge crash.", new Object[0]);
            }
            return false;
        }
        C7779al.m10613a("same crash occur too much do merged!", new Object[0]);
        CrashDetailBean crashDetailBeanM10694a = m10694a((List<C7785ar>) arrayList, crashDetailBean);
        int size = arrayList.size();
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            C7785ar c7785ar = (C7785ar) obj;
            if (c7785ar.f13773a != crashDetailBeanM10694a.f13526a) {
                list2.add(c7785ar);
            }
        }
        m10733b(crashDetailBeanM10694a);
        m10726d(list2);
        C7779al.m10615b("[crash] save crash success. For this device crash many times, it will not upload crashes immediately", new Object[0]);
        return true;
    }

    /* renamed from: a */
    private static boolean m10714a(String str) {
        String str2 = C7787at.f13813r;
        if (str2 != null && !str2.isEmpty()) {
            try {
                C7779al.m10617c("Crash regular filter for crash stack is: %s", C7787at.f13813r);
                if (Pattern.compile(C7787at.f13813r).matcher(str).find()) {
                    C7779al.m10618d("This crash matches the regular filter string set. It will not be record and upload.", new Object[0]);
                    return true;
                }
            } catch (Exception e10) {
                C7779al.m10614a(e10);
                C7779al.m10618d("Failed to compile " + C7787at.f13813r, new Object[0]);
            }
        }
        return false;
    }

    /* renamed from: a */
    private static boolean m10713a(CrashDetailBean crashDetailBean, List<C7785ar> list, List<C7785ar> list2) {
        boolean z10 = false;
        for (C7785ar c7785ar : list) {
            if (crashDetailBean.f13547u.equals(c7785ar.f13775c)) {
                if (c7785ar.f13777e) {
                    z10 = true;
                }
                list2.add(c7785ar);
            }
        }
        return z10;
    }

    /* renamed from: a */
    public static List<CrashDetailBean> m10698a() {
        StrategyBean strategyBeanM10551c = C7770ac.m10542a().m10551c();
        if (strategyBeanM10551c == null) {
            C7779al.m10618d("have not synced remote!", new Object[0]);
            return null;
        }
        if (!strategyBeanM10551c.f13482f) {
            C7779al.m10618d("Crashreport remote closed, please check your APP ID correct and Version available, then uninstall and reinstall your app.", new Object[0]);
            C7779al.m10615b("[init] WARNING! Crashreport closed by server, please check your APP ID correct and Version available, then uninstall and reinstall your app.", new Object[0]);
            return null;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        long jM10668b = C7783ap.m10668b();
        List<C7785ar> listM10716b = m10716b();
        C7779al.m10617c("Size of crash list loaded from DB: %s", Integer.valueOf(listM10716b.size()));
        if (listM10716b.size() <= 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        arrayList.addAll(m10699a(listM10716b));
        listM10716b.removeAll(arrayList);
        Iterator<C7785ar> it = listM10716b.iterator();
        while (it.hasNext()) {
            C7785ar next = it.next();
            long j10 = next.f13774b;
            if (j10 < jM10668b - C7787at.f13805j) {
                arrayList2.add(next);
                it.remove();
                arrayList.add(next);
            } else if (next.f13776d) {
                if (j10 >= jCurrentTimeMillis - 86400000) {
                    it.remove();
                } else if (!next.f13777e) {
                    it.remove();
                    arrayList.add(next);
                }
            } else if (next.f13778f >= 3 && j10 < jCurrentTimeMillis - 86400000) {
                it.remove();
                arrayList.add(next);
            }
        }
        m10721b(arrayList2);
        if (arrayList.size() > 0) {
            m10726d(arrayList);
        }
        ArrayList arrayList3 = new ArrayList();
        List<CrashDetailBean> listM10724c = m10724c(listM10716b);
        if (listM10724c != null && listM10724c.size() > 0) {
            String str = C7768aa.m10480b().f13648o;
            Iterator<CrashDetailBean> it2 = listM10724c.iterator();
            while (it2.hasNext()) {
                CrashDetailBean next2 = it2.next();
                if (!str.equals(next2.f13532f)) {
                    it2.remove();
                    arrayList3.add(next2);
                }
            }
        }
        if (arrayList3.size() > 0) {
            m10729e(arrayList3);
        }
        return listM10724c;
    }

    /* renamed from: a */
    public final void m10730a(CrashDetailBean crashDetailBean) {
        int i10 = crashDetailBean.f13528b;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 == 3 && !C7787at.m10736a().m10752k()) {
                    return;
                }
            } else if (!C7787at.m10736a().m10751j()) {
                return;
            }
        } else if (!C7787at.m10736a().m10751j()) {
            return;
        }
        if (this.f13789f != null) {
            C7779al.m10617c("Calling 'onCrashHandleEnd' of RQD crash listener.", new Object[0]);
        }
    }

    /* renamed from: a */
    public final void m10731a(List<CrashDetailBean> list, long j10, boolean z10, boolean z11, boolean z12) {
        if (!C7768aa.m10478a(this.f13785b).f13639f) {
            C7779al.m10618d("warn: not upload process", new Object[0]);
            return;
        }
        C7776ai c7776ai = this.f13786c;
        if (c7776ai == null) {
            C7779al.m10618d("warn: upload manager is null", new Object[0]);
            return;
        }
        if (!z12 && !c7776ai.m10595b(C7787at.f13797a)) {
            C7779al.m10618d("warn: not crashHappen or not should upload", new Object[0]);
            return;
        }
        StrategyBean strategyBeanM10551c = this.f13788e.m10551c();
        if (!strategyBeanM10551c.f13482f) {
            C7779al.m10618d("remote report is disable!", new Object[0]);
            C7779al.m10615b("[crash] server closed bugly in this app. please check your appid if is correct, and re-install it", new Object[0]);
            return;
        }
        if (list != null && list.size() != 0) {
            try {
                String str = strategyBeanM10551c.f13494r;
                String str2 = StrategyBean.f13478b;
                C7810bp c7810bpM10697a = m10697a(this.f13785b, list, C7768aa.m10480b());
                if (c7810bpM10697a == null) {
                    C7779al.m10618d("create eupPkg fail!", new Object[0]);
                    return;
                }
                byte[] bArrM10560a = C7772ae.m10560a((AbstractC7827m) c7810bpM10697a);
                if (bArrM10560a == null) {
                    C7779al.m10618d("send encode fail!", new Object[0]);
                    return;
                }
                C7811bq c7811bqM10556a = C7772ae.m10556a(this.f13785b, 830, bArrM10560a);
                if (c7811bqM10556a == null) {
                    C7779al.m10618d("request package is null.", new Object[0]);
                    return;
                }
                a aVar = new a(System.currentTimeMillis(), list, z10);
                if (z10) {
                    this.f13786c.m10592a(f13779a, c7811bqM10556a, str, str2, aVar, j10, z11);
                    return;
                } else {
                    this.f13786c.m10593a(f13779a, c7811bqM10556a, str, str2, aVar, false);
                    return;
                }
            } catch (Throwable th) {
                C7779al.m10619e("req cr error %s", th.toString());
                if (C7779al.m10616b(th)) {
                    return;
                }
                th.printStackTrace();
                return;
            }
        }
        C7779al.m10618d("warn: crashList is null or crashList num is 0", new Object[0]);
    }

    /* renamed from: a */
    public static void m10712a(boolean z10, List<CrashDetailBean> list) {
        if (list != null && list.size() > 0) {
            C7779al.m10617c("up finish update state %b", Boolean.valueOf(z10));
            for (CrashDetailBean crashDetailBean : list) {
                C7779al.m10617c("pre uid:%s uc:%d re:%b me:%b", crashDetailBean.f13529c, Integer.valueOf(crashDetailBean.f13538l), Boolean.valueOf(crashDetailBean.f13530d), Boolean.valueOf(crashDetailBean.f13536j));
                int i10 = crashDetailBean.f13538l + 1;
                crashDetailBean.f13538l = i10;
                crashDetailBean.f13530d = z10;
                C7779al.m10617c("set uid:%s uc:%d re:%b me:%b", crashDetailBean.f13529c, Integer.valueOf(i10), Boolean.valueOf(crashDetailBean.f13530d), Boolean.valueOf(crashDetailBean.f13536j));
            }
            Iterator<CrashDetailBean> it = list.iterator();
            while (it.hasNext()) {
                C7787at.m10736a().m10741a(it.next());
            }
            C7779al.m10617c("update state size %d", Integer.valueOf(list.size()));
        }
        if (z10) {
            return;
        }
        C7779al.m10615b("[crash] upload fail.", new Object[0]);
    }

    /* renamed from: a */
    private static CrashDetailBean m10693a(Cursor cursor) {
        if (cursor == null) {
            return null;
        }
        try {
            byte[] blob = cursor.getBlob(cursor.getColumnIndex("_dt"));
            if (blob == null) {
                return null;
            }
            long j10 = cursor.getLong(cursor.getColumnIndex("_id"));
            CrashDetailBean crashDetailBean = (CrashDetailBean) C7783ap.m10647a(blob, CrashDetailBean.CREATOR);
            if (crashDetailBean == null) {
                return crashDetailBean;
            }
            crashDetailBean.f13526a = j10;
            return crashDetailBean;
        } catch (Throwable th) {
            if (!C7779al.m10614a(th)) {
                th.printStackTrace();
            }
            return null;
        }
    }

    /* renamed from: a */
    private static C7809bo m10696a(Context context, CrashDetailBean crashDetailBean, C7768aa c7768aa) {
        ArrayList<C7806bl> arrayList = null;
        if (context != null && crashDetailBean != null && c7768aa != null) {
            C7809bo c7809bo = new C7809bo();
            c7809bo.f13946a = m10728e(crashDetailBean);
            c7809bo.f13947b = crashDetailBean.f13544r;
            c7809bo.f13948c = crashDetailBean.f13540n;
            c7809bo.f13949d = crashDetailBean.f13541o;
            c7809bo.f13950e = crashDetailBean.f13542p;
            c7809bo.f13952g = crashDetailBean.f13543q;
            c7809bo.f13953h = crashDetailBean.f13552z;
            c7809bo.f13954i = crashDetailBean.f13529c;
            c7809bo.f13955j = null;
            c7809bo.f13957l = crashDetailBean.f13539m;
            c7809bo.f13958m = crashDetailBean.f13531e;
            c7809bo.f13951f = crashDetailBean.f13501B;
            c7809bo.f13959n = null;
            Map<String, PlugInBean> map = crashDetailBean.f13534h;
            if (map != null && !map.isEmpty()) {
                arrayList = new ArrayList<>(crashDetailBean.f13534h.size());
                for (Map.Entry<String, PlugInBean> entry : crashDetailBean.f13534h.entrySet()) {
                    C7806bl c7806bl = new C7806bl();
                    c7806bl.f13926a = entry.getValue().f13474a;
                    c7806bl.f13928c = entry.getValue().f13476c;
                    c7806bl.f13930e = entry.getValue().f13475b;
                    arrayList.add(c7806bl);
                }
            }
            c7809bo.f13961p = arrayList;
            C7779al.m10617c("libInfo %s", c7809bo.f13960o);
            ArrayList<C7808bn> arrayList2 = new ArrayList<>(20);
            m10704a(arrayList2, crashDetailBean);
            m10706a(arrayList2, crashDetailBean.f13549w);
            m10719b(arrayList2, crashDetailBean.f13550x);
            m10725c(arrayList2, crashDetailBean.f13525Z);
            m10707a(arrayList2, crashDetailBean.f13527aa, context);
            m10709a(arrayList2, crashDetailBean.f13551y);
            m10705a(arrayList2, crashDetailBean, context);
            m10718b(arrayList2, crashDetailBean, context);
            m10708a(arrayList2, c7768aa.f13596L);
            m10720b(arrayList2, crashDetailBean.f13524Y);
            c7809bo.f13962q = arrayList2;
            if (crashDetailBean.f13536j) {
                c7809bo.f13956k = crashDetailBean.f13546t;
            }
            c7809bo.f13963r = m10700a(crashDetailBean, c7768aa);
            c7809bo.f13964s = new HashMap();
            Map<String, String> map2 = crashDetailBean.f13518S;
            if (map2 != null && map2.size() > 0) {
                c7809bo.f13964s.putAll(crashDetailBean.f13518S);
                C7779al.m10613a("setted message size %d", Integer.valueOf(c7809bo.f13964s.size()));
            }
            Map<String, String> map3 = c7809bo.f13964s;
            C7779al.m10617c("pss:" + crashDetailBean.f13508I + " vss:" + crashDetailBean.f13509J + " javaHeap:" + crashDetailBean.f13510K, new Object[0]);
            StringBuilder sb2 = new StringBuilder();
            sb2.append(crashDetailBean.f13508I);
            map3.put("SDK_UPLOAD_U1", sb2.toString());
            StringBuilder sb3 = new StringBuilder();
            sb3.append(crashDetailBean.f13509J);
            map3.put("SDK_UPLOAD_U2", sb3.toString());
            StringBuilder sb4 = new StringBuilder();
            sb4.append(crashDetailBean.f13510K);
            map3.put("SDK_UPLOAD_U3", sb4.toString());
            C7779al.m10617c("%s rid:%s sess:%s ls:%ds isR:%b isF:%b isM:%b isN:%b mc:%d ,%s ,isUp:%b ,vm:%d", crashDetailBean.f13540n, crashDetailBean.f13529c, c7768aa.m10491d(), Long.valueOf((crashDetailBean.f13544r - crashDetailBean.f13516Q) / 1000), Boolean.valueOf(crashDetailBean.f13537k), Boolean.valueOf(crashDetailBean.f13517R), Boolean.valueOf(crashDetailBean.f13536j), Boolean.valueOf(crashDetailBean.f13528b == 1), Integer.valueOf(crashDetailBean.f13546t), crashDetailBean.f13545s, Boolean.valueOf(crashDetailBean.f13530d), Integer.valueOf(c7809bo.f13963r.size()));
            return c7809bo;
        }
        C7779al.m10618d("enExp args == null", new Object[0]);
        return null;
    }

    /* renamed from: a */
    private static C7810bp m10697a(Context context, List<CrashDetailBean> list, C7768aa c7768aa) {
        if (context != null && list != null && list.size() != 0 && c7768aa != null) {
            C7810bp c7810bp = new C7810bp();
            c7810bp.f13968a = new ArrayList<>();
            Iterator<CrashDetailBean> it = list.iterator();
            while (it.hasNext()) {
                c7810bp.f13968a.add(m10696a(context, it.next(), c7768aa));
            }
            return c7810bp;
        }
        C7779al.m10618d("enEXPPkg args == null!", new Object[0]);
        return null;
    }

    /* renamed from: a */
    private static C7808bn m10695a(String str, Context context, String str2) throws IOException {
        FileInputStream fileInputStream;
        if (str2 != null && context != null) {
            C7779al.m10617c("zip %s", str2);
            File file = new File(str2);
            File file2 = new File(context.getCacheDir(), str);
            if (!C7783ap.m10663a(file, file2)) {
                C7779al.m10618d("zip fail!", new Object[0]);
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
                C7779al.m10617c("read bytes :%d", Integer.valueOf(byteArray.length));
                C7808bn c7808bn = new C7808bn((byte) 2, file2.getName(), byteArray);
                try {
                    fileInputStream.close();
                } catch (IOException e10) {
                    if (!C7779al.m10614a(e10)) {
                        e10.printStackTrace();
                    }
                }
                if (file2.exists()) {
                    C7779al.m10617c("del tmp", new Object[0]);
                    file2.delete();
                }
                return c7808bn;
            } catch (Throwable th2) {
                th = th2;
                try {
                    if (!C7779al.m10614a(th)) {
                        th.printStackTrace();
                    }
                    if (fileInputStream != null) {
                        try {
                            fileInputStream.close();
                        } catch (IOException e11) {
                            if (!C7779al.m10614a(e11)) {
                                e11.printStackTrace();
                            }
                        }
                    }
                    if (file2.exists()) {
                        C7779al.m10617c("del tmp", new Object[0]);
                        file2.delete();
                    }
                    return null;
                } catch (Throwable th3) {
                    if (fileInputStream != null) {
                        try {
                            fileInputStream.close();
                        } catch (IOException e12) {
                            if (!C7779al.m10614a(e12)) {
                                e12.printStackTrace();
                            }
                        }
                    }
                    if (file2.exists()) {
                        C7779al.m10617c("del tmp", new Object[0]);
                        file2.delete();
                    }
                    throw th3;
                }
            }
        }
        C7779al.m10618d("rqdp{  createZipAttachment sourcePath == null || context == null ,pls check}", new Object[0]);
        return null;
    }

    /* renamed from: a */
    public static void m10703a(String str, String str2, String str3, String str4, String str5, CrashDetailBean crashDetailBean) {
        String str6;
        C7768aa c7768aaM10480b = C7768aa.m10480b();
        if (c7768aaM10480b == null) {
            return;
        }
        C7779al.m10619e("#++++++++++Record By Bugly++++++++++#", new Object[0]);
        C7779al.m10619e("# You can use Bugly(http:\\\\bugly.qq.com) to get more Crash Detail!", new Object[0]);
        C7779al.m10619e("# PKG NAME: %s", c7768aaM10480b.f13636c);
        C7779al.m10619e("# APP VER: %s", c7768aaM10480b.f13648o);
        C7779al.m10619e("# SDK VER: %s", c7768aaM10480b.f13641h);
        C7779al.m10619e("# LAUNCH TIME: %s", C7783ap.m10655a(new Date(C7768aa.m10480b().f13610a)));
        C7779al.m10619e("# CRASH TYPE: %s", str);
        C7779al.m10619e("# CRASH TIME: %s", str2);
        C7779al.m10619e("# CRASH PROCESS: %s", str3);
        C7779al.m10619e("# CRASH FOREGROUND: %s", Boolean.valueOf(c7768aaM10480b.m10486a()));
        C7779al.m10619e("# CRASH THREAD: %s", str4);
        if (crashDetailBean != null) {
            C7779al.m10619e("# REPORT ID: %s", crashDetailBean.f13529c);
            C7779al.m10619e("# CRASH DEVICE: %s %s", c7768aaM10480b.m10499h(), c7768aaM10480b.m10508r().booleanValue() ? "ROOTED" : "UNROOT");
            C7779al.m10619e("# RUNTIME AVAIL RAM:%d ROM:%d SD:%d", Long.valueOf(crashDetailBean.f13502C), Long.valueOf(crashDetailBean.f13503D), Long.valueOf(crashDetailBean.f13504E));
            C7779al.m10619e("# RUNTIME TOTAL RAM:%d ROM:%d SD:%d", Long.valueOf(crashDetailBean.f13505F), Long.valueOf(crashDetailBean.f13506G), Long.valueOf(crashDetailBean.f13507H));
            if (!C7783ap.m10676b(crashDetailBean.f13514O)) {
                C7779al.m10619e("# EXCEPTION FIRED BY %s %s", crashDetailBean.f13514O, crashDetailBean.f13513N);
            } else if (crashDetailBean.f13528b == 3) {
                if (crashDetailBean.f13519T == null) {
                    str6 = "null";
                } else {
                    str6 = crashDetailBean.f13519T.get("BUGLY_CR_01");
                }
                C7779al.m10619e("# EXCEPTION ANR MESSAGE:\n %s", str6);
            }
        }
        if (!C7783ap.m10676b(str5)) {
            C7779al.m10619e("# CRASH STACK: ", new Object[0]);
            C7779al.m10619e(str5, new Object[0]);
        }
        C7779al.m10619e("#++++++++++++++++++++++++++++++++++++++++++#", new Object[0]);
    }

    /* renamed from: a */
    private static void m10702a(CrashDetailBean crashDetailBean, Map<String, String> map) {
        String value;
        if (map != null && !map.isEmpty()) {
            crashDetailBean.f13518S = new LinkedHashMap(map.size());
            for (Map.Entry<String, String> entry : map.entrySet()) {
                if (!C7783ap.m10676b(entry.getKey())) {
                    String key = entry.getKey();
                    if (key.length() > 100) {
                        key = key.substring(0, 100);
                        C7779al.m10618d("setted key length is over limit %d substring to %s", 100, key);
                    }
                    if (!C7783ap.m10676b(entry.getValue()) && entry.getValue().length() > 100000) {
                        value = entry.getValue().substring(entry.getValue().length() - 100000);
                        C7779al.m10618d("setted %s value length is over limit %d substring", key, 100000);
                    } else {
                        value = entry.getValue();
                    }
                    crashDetailBean.f13518S.put(key, value);
                    C7779al.m10613a("add setted key %s value size:%d", key, Integer.valueOf(value.length()));
                }
            }
            return;
        }
        C7779al.m10618d("extra map is empty. CrashBean won't have userDatas.", new Object[0]);
    }

    /* renamed from: a */
    private static void m10704a(ArrayList<C7808bn> arrayList, CrashDetailBean crashDetailBean) {
        String str;
        if (crashDetailBean.f13536j && (str = crashDetailBean.f13545s) != null && str.length() > 0) {
            try {
                arrayList.add(new C7808bn((byte) 1, "alltimes.txt", crashDetailBean.f13545s.getBytes("utf-8")));
            } catch (Exception e10) {
                e10.printStackTrace();
                C7779al.m10614a(e10);
            }
        }
    }

    /* renamed from: a */
    private static void m10706a(ArrayList<C7808bn> arrayList, String str) {
        if (str != null) {
            try {
                arrayList.add(new C7808bn((byte) 1, "log.txt", str.getBytes("utf-8")));
            } catch (Exception e10) {
                e10.printStackTrace();
                C7779al.m10614a(e10);
            }
        }
    }

    /* renamed from: a */
    private static void m10707a(ArrayList<C7808bn> arrayList, String str, Context context) {
        if (str != null) {
            try {
                C7808bn c7808bnM10695a = m10695a("backupRecord.zip", context, str);
                if (c7808bnM10695a != null) {
                    C7779al.m10617c("attach backup record", new Object[0]);
                    arrayList.add(c7808bnM10695a);
                }
            } catch (Exception e10) {
                C7779al.m10614a(e10);
            }
        }
    }

    /* renamed from: a */
    private static void m10709a(ArrayList<C7808bn> arrayList, byte[] bArr) {
        if (bArr == null || bArr.length <= 0) {
            return;
        }
        try {
            C7808bn c7808bn = new C7808bn((byte) 2, "buglylog.zip", bArr);
            C7779al.m10617c("attach user log", new Object[0]);
            arrayList.add(c7808bn);
        } catch (Exception e10) {
            C7779al.m10614a(e10);
        }
    }

    /* renamed from: a */
    private static void m10705a(ArrayList<C7808bn> arrayList, CrashDetailBean crashDetailBean, Context context) {
        C7808bn c7808bnM10695a;
        if (crashDetailBean.f13528b != 3) {
            return;
        }
        C7779al.m10617c("crashBean.anrMessages:%s", crashDetailBean.f13519T);
        try {
            Map<String, String> map = crashDetailBean.f13519T;
            if (map != null && map.containsKey("BUGLY_CR_01")) {
                if (!TextUtils.isEmpty(crashDetailBean.f13519T.get("BUGLY_CR_01"))) {
                    arrayList.add(new C7808bn((byte) 1, "anrMessage.txt", crashDetailBean.f13519T.get("BUGLY_CR_01").getBytes("utf-8")));
                    C7779al.m10617c("attach anr message", new Object[0]);
                }
                crashDetailBean.f13519T.remove("BUGLY_CR_01");
            }
            String str = crashDetailBean.f13548v;
            if (str == null || (c7808bnM10695a = m10695a("trace.zip", context, str)) == null) {
                return;
            }
            C7779al.m10617c("attach traces", new Object[0]);
            arrayList.add(c7808bnM10695a);
        } catch (Exception e10) {
            e10.printStackTrace();
            C7779al.m10614a(e10);
        }
    }

    /* renamed from: a */
    private static void m10708a(ArrayList<C7808bn> arrayList, List<String> list) {
        if (list == null || list.isEmpty()) {
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            sb2.append(it.next());
        }
        try {
            arrayList.add(new C7808bn((byte) 1, "martianlog.txt", sb2.toString().getBytes("utf-8")));
            C7779al.m10617c("attach pageTracingList", new Object[0]);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    /* renamed from: a */
    private static Map<String, String> m10700a(CrashDetailBean crashDetailBean, C7768aa c7768aa) {
        HashMap map = new HashMap(30);
        try {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(crashDetailBean.f13502C);
            map.put("A9", sb2.toString());
            StringBuilder sb3 = new StringBuilder();
            sb3.append(crashDetailBean.f13503D);
            map.put("A11", sb3.toString());
            StringBuilder sb4 = new StringBuilder();
            sb4.append(crashDetailBean.f13504E);
            map.put("A10", sb4.toString());
            map.put("A23", crashDetailBean.f13532f);
            StringBuilder sb5 = new StringBuilder();
            c7768aa.getClass();
            map.put("A7", sb5.toString());
            map.put("A6", C7768aa.m10481n());
            map.put("A5", c7768aa.m10504m());
            map.put("A22", c7768aa.m10497g());
            StringBuilder sb6 = new StringBuilder();
            sb6.append(crashDetailBean.f13506G);
            map.put("A2", sb6.toString());
            StringBuilder sb7 = new StringBuilder();
            sb7.append(crashDetailBean.f13505F);
            map.put("A1", sb7.toString());
            map.put("A24", c7768aa.f13644k);
            StringBuilder sb8 = new StringBuilder();
            sb8.append(crashDetailBean.f13507H);
            map.put("A17", sb8.toString());
            map.put("A25", c7768aa.m10497g());
            map.put("A15", c7768aa.m10507q());
            StringBuilder sb9 = new StringBuilder();
            sb9.append(c7768aa.m10508r());
            map.put("A13", sb9.toString());
            map.put("A34", crashDetailBean.f13500A);
            if (c7768aa.f13591G != null) {
                map.put("productIdentify", c7768aa.f13591G);
            }
            map.put("A26", URLEncoder.encode(crashDetailBean.f13511L, "utf-8"));
            if (crashDetailBean.f13528b == 1) {
                map.put("A27", crashDetailBean.f13514O);
                map.put("A28", crashDetailBean.f13513N);
                StringBuilder sb10 = new StringBuilder();
                sb10.append(crashDetailBean.f13537k);
                map.put("A29", sb10.toString());
            }
            map.put("A30", crashDetailBean.f13515P);
            StringBuilder sb11 = new StringBuilder();
            sb11.append(crashDetailBean.f13516Q);
            map.put("A18", sb11.toString());
            StringBuilder sb12 = new StringBuilder();
            sb12.append(true ^ crashDetailBean.f13517R);
            map.put("A36", sb12.toString());
            StringBuilder sb13 = new StringBuilder();
            sb13.append(c7768aa.f13659z);
            map.put("F02", sb13.toString());
            StringBuilder sb14 = new StringBuilder();
            sb14.append(c7768aa.f13585A);
            map.put("F03", sb14.toString());
            map.put("F04", c7768aa.m10491d());
            StringBuilder sb15 = new StringBuilder();
            sb15.append(c7768aa.f13586B);
            map.put("F05", sb15.toString());
            map.put("F06", c7768aa.f13658y);
            map.put("F08", c7768aa.f13589E);
            map.put("F09", c7768aa.f13590F);
            StringBuilder sb16 = new StringBuilder();
            sb16.append(c7768aa.f13587C);
            map.put("F10", sb16.toString());
            m10711a(map, crashDetailBean);
            return map;
        } catch (Exception e10) {
            e10.printStackTrace();
            C7779al.m10614a(e10);
            return map;
        }
    }

    /* renamed from: a */
    private static void m10711a(Map<String, String> map, CrashDetailBean crashDetailBean) {
        if (crashDetailBean.f13520U >= 0) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(crashDetailBean.f13520U);
            map.put("C01", sb2.toString());
        }
        if (crashDetailBean.f13521V >= 0) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(crashDetailBean.f13521V);
            map.put("C02", sb3.toString());
        }
        Map<String, String> map2 = crashDetailBean.f13522W;
        if (map2 != null && map2.size() > 0) {
            for (Map.Entry<String, String> entry : crashDetailBean.f13522W.entrySet()) {
                map.put("C03_" + entry.getKey(), entry.getValue());
            }
        }
        Map<String, String> map3 = crashDetailBean.f13523X;
        if (map3 == null || map3.size() <= 0) {
            return;
        }
        for (Map.Entry<String, String> entry2 : crashDetailBean.f13523X.entrySet()) {
            map.put("C04_" + entry2.getKey(), entry2.getValue());
        }
    }

    /* renamed from: a */
    public static /* synthetic */ void m10710a(List list, boolean z10, long j10, String str, String str2) {
        if (list == null || list.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            CrashDetailBean crashDetailBean = (CrashDetailBean) it.next();
            String str3 = f13784l.get(Integer.valueOf(crashDetailBean.f13528b));
            if (!TextUtils.isEmpty(str3)) {
                arrayList.add(new C7774ag.c(crashDetailBean.f13529c, str3, crashDetailBean.f13544r, z10, j10, str, str2));
            }
        }
        C7774ag.a.f13678a.m10574a(arrayList);
    }
}
