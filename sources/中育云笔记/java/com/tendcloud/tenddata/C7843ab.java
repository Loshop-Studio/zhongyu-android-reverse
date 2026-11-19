package com.tendcloud.tenddata;

import android.content.Context;
import android.os.Handler;
import androidx.lifecycle.CoroutineLiveDataKt;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import java.io.File;
import java.nio.channels.FileChannel;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.tendcloud.tenddata.ab */
/* loaded from: classes5.dex */
public class C7843ab {

    /* renamed from: A */
    public static final String f14266A = "TD_init_custom";

    /* renamed from: B */
    public static final String f14267B = "TD_sdk_last_send_time_wifi";

    /* renamed from: C */
    public static final String f14268C = "TD_sdk_last_send_time_mobile_data";

    /* renamed from: D */
    public static final String f14269D = "TD_sdk_last_send_url";

    /* renamed from: E */
    public static final String f14270E = "TD_sdk_last_send_host";

    /* renamed from: F */
    public static final String f14271F = "isDeveloper";

    /* renamed from: L */
    public static final int f14277L = 104857600;

    /* renamed from: N */
    static final String f14279N = "All";

    /* renamed from: P */
    public static final String f14281P = "v1.0.0";

    /* renamed from: U */
    public static final String f14286U = "Android+TD+V5.0.17 gp";

    /* renamed from: V */
    static long f14287V = 0;

    /* renamed from: Y */
    public static final int f14290Y = 1800000;

    /* renamed from: a */
    public static final boolean f14292a = false;

    /* renamed from: aa */
    public static final long f14293aa = 30000;

    /* renamed from: ab */
    public static final int f14294ab = 100;

    /* renamed from: ac */
    public static final String f14295ac = "TD_APP_ID";

    /* renamed from: ad */
    public static final String f14296ad = "TD_CHANNEL_ID";

    /* renamed from: af */
    private static final String f14298af = "+V";

    /* renamed from: ag */
    private static final int f14299ag = 120;

    /* renamed from: ah */
    private static final int f14300ah = 30;

    /* renamed from: ai */
    private static final int f14301ai = 1000;

    /* renamed from: b */
    public static boolean f14302b = false;

    /* renamed from: i */
    public static final int f14309i = 1;

    /* renamed from: j */
    public static final String f14310j = "Android+";

    /* renamed from: k */
    public static FileChannel f14311k = null;

    /* renamed from: s */
    public static String f14319s = null;

    /* renamed from: t */
    public static final String f14320t = "TD";

    /* renamed from: u */
    public static final String f14321u = "TDLog";

    /* renamed from: w */
    public static final String f14323w = "2408";

    /* renamed from: x */
    public static final String f14324x = "TD_app_pefercen_profile";

    /* renamed from: y */
    public static final String f14325y = "TD_appId_";

    /* renamed from: z */
    public static final String f14326z = "TD_channelId";

    /* renamed from: c */
    public static final AtomicBoolean f14303c = new AtomicBoolean(false);

    /* renamed from: d */
    public static final Map<String, Object> f14304d = new TreeMap();

    /* renamed from: e */
    public static boolean f14305e = false;

    /* renamed from: f */
    public static long f14306f = 0;

    /* renamed from: g */
    public static Context f14307g = null;

    /* renamed from: h */
    public static Handler f14308h = null;

    /* renamed from: l */
    public static long f14312l = 0;

    /* renamed from: m */
    public static boolean f14313m = false;

    /* renamed from: n */
    public static int f14314n = -1;

    /* renamed from: o */
    public static boolean f14315o = true;

    /* renamed from: p */
    public static boolean f14316p = true;

    /* renamed from: q */
    public static boolean f14317q = false;

    /* renamed from: r */
    public static long f14318r = CoroutineLiveDataKt.DEFAULT_TIMEOUT;

    /* renamed from: v */
    public static TalkingDataSharingFilter f14322v = TalkingDataSharingFilter.SHARE;

    /* renamed from: ae */
    private static HashMap<String, Object> f14297ae = new HashMap<>();

    /* renamed from: G */
    public static String f14272G = "Default";

    /* renamed from: H */
    public static String f14273H = "";

    /* renamed from: I */
    public static boolean f14274I = false;

    /* renamed from: J */
    public static String f14275J = null;

    /* renamed from: K */
    public static boolean f14276K = false;

    /* renamed from: M */
    static final String f14278M = "WiFi";

    /* renamed from: O */
    static String f14280O = f14278M;

    /* renamed from: Q */
    public static boolean f14282Q = false;

    /* renamed from: R */
    public static boolean f14283R = false;

    /* renamed from: S */
    public static boolean f14284S = false;

    /* renamed from: T */
    public static boolean f14285T = false;

    /* renamed from: W */
    public static int f14288W = 2;

    /* renamed from: X */
    public static AtomicInteger f14289X = new AtomicInteger(0);

    /* renamed from: Z */
    public static final AtomicBoolean f14291Z = new AtomicBoolean(false);

    /* renamed from: com.tendcloud.tenddata.ab$a */
    public class a {
        public static final int DST_FILE = 2;
        public static final int DST_SQLITE = 1;

        public a() {
        }
    }

    /* renamed from: com.tendcloud.tenddata.ab$b */
    public static class b {
        public static final int API_MYNA_INIT = 90;
        public static final int API_MYNA_START = 91;
        public static final int API_MYNA_STOP = 92;
        public static final int API_ON_ERROR = 3;
        public static final int API_ON_EVENT = 2;
        public static final int API_ON_INIT = 1;
        public static final int API_ON_PAGE_END = 5;
        public static final int API_ON_PAGE_START = 4;
        public static final int API_TYPE_ACCOUNT = 9;
        public static final int API_TYPE_BRAND_GROWTH = 16;
        public static final int API_TYPE_CUST_LOCATION = 14;
        public static final int API_TYPE_GAME = 6;
        public static final int API_TYPE_GAME_SESSION_END = 15;
        public static final int API_TYPE_GAME_SESSION_START = 12;
        public static final int API_TYPE_IAP = 8;
        public static final int API_TYPE_INDUSTRY = 17;
        public static final int API_TYPE_SESSION_END = 11;
        public static final int API_TYPE_SESSION_PAUSE = 13;
        public static final int API_TYPE_SESSION_START = 10;
        public static final int API_TYPE_TRACKING = 7;
    }

    /* renamed from: com.tendcloud.tenddata.ab$c */
    public class c {
        public static final int SDT_JSON = 2;
        public static final int SDT_MP = 1;
        public static final int SDT_PB = 3;
        public static final int SDT_UNKNOWN = -1;

        public c() {
        }
    }

    /* renamed from: a */
    public static String m11027a(Context context, AbstractC7841a abstractC7841a) {
        if (context == null || abstractC7841a == null) {
            C7896ca.dForInternal("Context or Service is null");
            return "";
        }
        String str = (String) f14297ae.get(abstractC7841a.name());
        if (!C7912cq.m11608b(str)) {
            return str;
        }
        return C7906ck.m11569b(context, f14324x, f14325y + abstractC7841a.name(), "");
    }

    /* renamed from: b */
    public static String m11034b(Context context, AbstractC7841a abstractC7841a) {
        if (C7912cq.m11608b(f14272G) || f14272G.equals("Default")) {
            f14272G = C7906ck.m11569b(context, f14324x, f14326z + abstractC7841a.name(), "Default");
        }
        return f14272G;
    }

    /* renamed from: c */
    public static String m11039c(Context context, AbstractC7841a abstractC7841a) {
        try {
            if (C7912cq.m11608b(f14273H)) {
                f14273H = C7906ck.m11569b(context, f14324x, f14266A + abstractC7841a.name(), "");
            }
        } catch (Throwable unused) {
        }
        return f14273H;
    }

    /* renamed from: d */
    private static boolean m11043d(AbstractC7841a abstractC7841a) {
        if (f14307g == null || !abstractC7841a.name().equals(GrsBaseInfo.CountryCodeSource.APP)) {
            return false;
        }
        File filesDir = f14307g.getFilesDir();
        try {
            File file = new File(filesDir, "td_database3SaaS");
            File file2 = new File(filesDir, "td_database1SaaS");
            File file3 = new File(filesDir, C7842aa.f14236T);
            File file4 = new File(file3, "td_database3SaaS");
            File file5 = new File(file3, "td_database1SaaS");
            if (file.exists() || file2.exists() || file4.exists()) {
                return true;
            }
            return file5.exists();
        } catch (Throwable unused) {
            return false;
        }
    }

    /* renamed from: e */
    private static boolean m11044e(AbstractC7841a abstractC7841a) {
        if (f14307g == null || !abstractC7841a.name().equals("GAME")) {
            return false;
        }
        File filesDir = f14307g.getFilesDir();
        try {
            File file = new File(filesDir, "td_database0SaaS");
            File file2 = new File(filesDir, "td_database1SaaS");
            File file3 = new File(filesDir, C7842aa.f14236T);
            File file4 = new File(file3, "td_database0SaaS");
            File file5 = new File(file3, "td_database1SaaS");
            if (file2.exists() || file.exists() || file5.exists()) {
                return true;
            }
            return file4.exists();
        } catch (Throwable unused) {
            return false;
        }
    }

    public static void setConfigurationDisable(int i10) {
        try {
            f14282Q = (i10 & 1) != 0;
            f14283R = (i10 & 2) != 0;
            f14284S = (i10 & 4) != 0;
            f14285T = (i10 & 8) != 0;
        } catch (Throwable unused) {
        }
    }

    public static void setDeveloperMode(boolean z10) {
        try {
            C7906ck.m11566a(f14307g, f14324x, f14271F, z10 ? 1L : 0L);
        } catch (Throwable unused) {
        }
    }

    /* renamed from: b */
    public static void m11035b(String str, AbstractC7841a abstractC7841a) {
        C7906ck.m11567a(f14307g, f14324x, f14326z + abstractC7841a.name(), str);
    }

    /* renamed from: c */
    public static void m11040c(String str, AbstractC7841a abstractC7841a) {
        try {
            C7906ck.m11567a(f14307g, f14324x, f14266A + abstractC7841a.name(), str);
        } catch (Throwable unused) {
        }
    }

    /* renamed from: b */
    public static boolean m11036b() {
        try {
            return C7906ck.m11568b(f14307g, f14324x, f14271F, 0L) != 0;
        } catch (Throwable unused) {
            return false;
        }
    }

    /* renamed from: c */
    public static String m11038c() {
        try {
            return new C7988fl().m11982a();
        } catch (Throwable unused) {
            return "Native";
        }
    }

    /* renamed from: a */
    public static void m11029a(String str, AbstractC7841a abstractC7841a) {
        if (abstractC7841a != null) {
            f14297ae.put(abstractC7841a.name(), str);
            C7906ck.m11567a(f14307g, f14324x, f14325y + abstractC7841a.name(), str);
        }
    }

    /* renamed from: b */
    private static boolean m11037b(AbstractC7841a abstractC7841a) {
        if (f14307g != null && abstractC7841a.name().equals("SDK")) {
            File filesDir = f14307g.getFilesDir();
            try {
                File file = new File(filesDir, "td_database0SaaS");
                File file2 = new File(filesDir, "td_database1SaaS");
                File file3 = new File(filesDir, "td_database3SaaS");
                File file4 = new File(filesDir, C7842aa.f14236T);
                File file5 = new File(file4, "td_database0SaaS");
                File file6 = new File(file4, "td_database1SaaS");
                File file7 = new File(file4, "td_database3SaaS");
                if ((file3.exists() || file7.exists()) && !file2.exists() && !file6.exists() && !file.exists()) {
                    if (!file5.exists()) {
                        return true;
                    }
                }
            } catch (Throwable unused) {
            }
        }
        return false;
    }

    /* renamed from: c */
    private static boolean m11041c(AbstractC7841a abstractC7841a) {
        if (f14307g == null || !abstractC7841a.name().equals("TRACKING")) {
            return false;
        }
        File filesDir = f14307g.getFilesDir();
        try {
            File file = new File(filesDir, "td_database3SaaS");
            File file2 = new File(filesDir, "td_database0SaaS");
            File file3 = new File(filesDir, C7842aa.f14236T);
            File file4 = new File(file3, "td_database3SaaS");
            File file5 = new File(file3, "td_database0SaaS");
            if (file.exists() || file2.exists() || file4.exists()) {
                return true;
            }
            return file5.exists();
        } catch (Throwable unused) {
            return false;
        }
    }

    /* renamed from: a */
    public static int[] m11033a() {
        int[] iArr = new int[2];
        try {
            iArr[0] = 120000;
            iArr[1] = 30000;
        } catch (Throwable unused) {
        }
        return iArr;
    }

    /* renamed from: d */
    private static boolean m11042d(Context context, AbstractC7841a abstractC7841a) {
        try {
            if (f14307g == null) {
                return true;
            }
            if ((!abstractC7841a.name().equals("TRACKING") && !abstractC7841a.name().equals("SDK")) || !context.getSharedPreferences("talkingdata_file_prefence", 0).getBoolean("actived", false)) {
                return true;
            }
            C7897cb.m11378a(false, abstractC7841a);
            return false;
        } catch (Throwable unused) {
            return true;
        }
    }

    /* renamed from: a */
    public static void m11030a(String str, String str2, AbstractC7841a abstractC7841a) {
        if (f14307g != null) {
            f14308h = new Handler(f14307g.getMainLooper());
        }
        f14306f = System.currentTimeMillis();
        if (str != null && !str.trim().isEmpty() && str.contains("-")) {
            try {
                str = str.split("-")[1];
            } catch (Throwable unused) {
                str = null;
            }
        }
        if (str2 != null && !str2.trim().isEmpty()) {
            f14272G = str2;
        }
        m11029a(str, abstractC7841a);
        m11035b(f14272G, abstractC7841a);
        C7985fi.m11974a().m11977a((Object) str, abstractC7841a);
        C7985fi.m11974a().m11978b(f14272G, abstractC7841a);
        m11028a(C7948dz.f14804a);
    }

    /* renamed from: a */
    private static void m11028a(int i10) {
        try {
            C7988fl c7988fl = new C7988fl();
            switch (i10) {
                case 1:
                    c7988fl.setFrameWork("Cocos2d");
                    break;
                case 2:
                    c7988fl.setFrameWork("Unity");
                    break;
                case 3:
                    c7988fl.setFrameWork("AIR");
                    break;
                case 4:
                    c7988fl.setFrameWork("PhoneGap");
                    break;
                case 5:
                    c7988fl.setFrameWork("APICloud");
                    break;
                case 6:
                    c7988fl.setFrameWork("Hybrid");
                    break;
                case 7:
                    c7988fl.setFrameWork("ReactNative");
                    break;
                case 8:
                    c7988fl.setFrameWork("Flutter");
                    break;
                default:
                    c7988fl.setFrameWork("Native");
                    break;
            }
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    public static boolean m11032a(AbstractC7841a abstractC7841a) {
        Context context;
        try {
            context = f14307g;
        } catch (Throwable unused) {
        }
        if (context == null || abstractC7841a == null) {
            return false;
        }
        if (m11031a(context)) {
            return C7897cb.m11393e(abstractC7841a) == 1;
        }
        if (C7897cb.m11393e(abstractC7841a) == 1) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (jCurrentTimeMillis - C7897cb.m11390d(abstractC7841a) > f14318r * 4) {
                C7897cb.m11378a(false, abstractC7841a);
            } else {
                if (jCurrentTimeMillis - C7897cb.m11392e() <= f14318r * 4) {
                    return m11042d(f14307g, abstractC7841a);
                }
                if (m11041c(abstractC7841a) || m11044e(abstractC7841a) || m11043d(abstractC7841a) || m11037b(abstractC7841a)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: a */
    private static boolean m11031a(Context context) {
        try {
            return C7894bz.m11353a().m11358d(context) == C7894bz.m11353a().m11359e(context);
        } catch (Throwable unused) {
            return false;
        }
    }
}
