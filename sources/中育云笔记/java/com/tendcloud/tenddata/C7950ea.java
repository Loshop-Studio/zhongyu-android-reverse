package com.tendcloud.tenddata;

import android.content.Context;
import android.util.Log;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import anet.channel.strategy.dispatch.DispatchConstants;
import com.tendcloud.tenddata.C7960ek;
import com.tendcloud.tenddata.C8022zz;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;
import java.util.TreeMap;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;

/* renamed from: com.tendcloud.tenddata.ea */
/* loaded from: classes5.dex */
public class C7950ea {

    /* renamed from: a */
    private static ScheduledThreadPoolExecutor f14805a = null;

    /* renamed from: b */
    private static final long f14806b = 30000;

    /* renamed from: c */
    private static long f14807c = 0;

    /* renamed from: d */
    private static Map<String, Object> f14808d = null;

    /* renamed from: e */
    private static final long f14809e = 2;

    /* renamed from: f */
    private static volatile C7950ea f14810f;

    /* renamed from: g */
    private static boolean f14811g;

    /* renamed from: h */
    private static boolean f14812h;

    /* renamed from: com.tendcloud.tenddata.ea$a */
    public static class a implements Runnable {
        private a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                AbstractC7841a abstractC7841a = AbstractC7841a.UNIVERSAL;
                if (C7912cq.m11607b(C7843ab.f14307g, "android.permission.READ_PHONE_STATE")) {
                    C7950ea.f14808d.put("isGetIMEI", Boolean.TRUE);
                    C7950ea.f14808d.put(TypedValues.TransitionType.S_DURATION, Long.valueOf(System.currentTimeMillis() - C7950ea.f14807c));
                    C7950ea.m11844h(abstractC7841a);
                } else if (System.currentTimeMillis() - C7897cb.m11390d(abstractC7841a) >= 30000) {
                    C7950ea.f14808d.put("isGetIMEI", Boolean.FALSE);
                    C7950ea.f14808d.put(TypedValues.TransitionType.S_DURATION, Long.valueOf(System.currentTimeMillis() - C7950ea.f14807c));
                    C7950ea.m11844h(abstractC7841a);
                }
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: com.tendcloud.tenddata.ea$b */
    public static class b implements ThreadFactory {
        private b() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new Thread(runnable, "Check_Thread #");
        }
    }

    static {
        try {
            C7913cr.m11625a().register(m11828a());
        } catch (Throwable unused) {
        }
        f14810f = null;
        f14811g = false;
        f14812h = false;
    }

    private C7950ea() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e */
    public static void m11838e() {
        try {
            if (C7897cb.m11392e() == 0) {
                C7897cb.setInitTime(System.currentTimeMillis());
            }
        } catch (Throwable unused) {
        }
    }

    /* renamed from: f */
    private static void m11841f(final AbstractC7841a abstractC7841a) {
        try {
            new Timer().schedule(new TimerTask() { // from class: com.tendcloud.tenddata.ea.1
                @Override // java.util.TimerTask, java.lang.Runnable
                public void run() {
                    C7900ce.m11482a();
                    C7950ea.m11837d(abstractC7841a);
                    C7950ea.m11838e();
                    C7950ea.m11843g(abstractC7841a);
                }
            }, C7843ab.f14318r);
        } catch (Throwable th) {
            C7896ca.eForInternal(th);
            m11843g(abstractC7841a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g */
    public static void m11843g(final AbstractC7841a abstractC7841a) {
        try {
            if (abstractC7841a == null) {
                C7896ca.eForInternal("TDFeatures is null...");
                return;
            }
            TreeMap treeMap = new TreeMap();
            boolean zM11032a = C7843ab.m11032a(abstractC7841a);
            treeMap.put("first", Boolean.valueOf(zM11032a));
            if (!C7912cq.m11608b(C8022zz.f15140a)) {
                treeMap.put("custom", C7912cq.m11588a(C8022zz.f15140a));
            }
            try {
                int iM11611c = C7912cq.m11611c(C7843ab.f14307g);
                treeMap.put("targetAPI", Integer.valueOf(iM11611c));
                if ((abstractC7841a.name().equals("TRACKING") || abstractC7841a.name().equals("SDK")) && zM11032a) {
                    boolean zM11831a = m11831a(C7843ab.f14307g);
                    boolean zM11607b = C7912cq.m11607b(C7843ab.f14307g, "android.permission.READ_PHONE_STATE");
                    treeMap.put("isDeclareIMEI", Boolean.valueOf(zM11831a));
                    treeMap.put("isGetIMEI", Boolean.valueOf(zM11607b));
                    if (zM11831a && !zM11607b && iM11611c >= 23) {
                        TreeMap treeMap2 = new TreeMap();
                        f14808d = treeMap2;
                        treeMap2.put("targetAPI", Integer.valueOf(iM11611c));
                        f14808d.put("isDeclareIMEI", Boolean.valueOf(zM11831a));
                        m11840f();
                    }
                }
            } catch (Throwable unused) {
            }
            C7961el c7961el = new C7961el();
            try {
                c7961el.f14869b = "app";
                c7961el.f14870c = "init";
                c7961el.f14871d = treeMap;
                c7961el.f14868a = abstractC7841a;
                if (zM11032a) {
                    c7961el.f14873f = new InterfaceC7981fe() { // from class: com.tendcloud.tenddata.ea.2
                        @Override // com.tendcloud.tenddata.InterfaceC7981fe
                        public void onStoreFailed() {
                        }

                        @Override // com.tendcloud.tenddata.InterfaceC7981fe
                        public void onStoreSuccess() {
                            try {
                                C7897cb.m11378a(false, abstractC7841a);
                            } catch (Throwable unused2) {
                            }
                        }
                    };
                }
                C7913cr.m11625a().post(c7961el);
            } catch (Throwable unused2) {
            }
            C7960ek c7960ek = new C7960ek();
            c7960ek.f14866a = abstractC7841a;
            c7960ek.f14867b = C7960ek.a.IMMEDIATELY;
            C7913cr.m11625a().post(c7960ek);
            if (zM11032a) {
                m11842g();
            }
        } catch (Throwable unused3) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h */
    public static void m11844h(AbstractC7841a abstractC7841a) {
        try {
            C7961el c7961el = new C7961el();
            c7961el.f14869b = "app";
            c7961el.f14870c = "getIMEI";
            c7961el.f14871d = f14808d;
            c7961el.f14868a = abstractC7841a;
            C7913cr.m11625a().post(c7961el);
            C7960ek c7960ek = new C7960ek();
            c7960ek.f14866a = abstractC7841a;
            c7960ek.f14867b = C7960ek.a.IMMEDIATELY;
            C7913cr.m11625a().post(c7960ek);
            f14805a.shutdown();
        } catch (Throwable unused) {
        }
    }

    public final void onTDEBEventInitEvent(C8022zz.a aVar) {
        try {
            if (Integer.parseInt(String.valueOf(aVar.paraMap.get("apiType"))) != 1) {
                return;
            }
            String strValueOf = String.valueOf(aVar.paraMap.get("action"));
            AbstractC7841a abstractC7841a = (AbstractC7841a) aVar.paraMap.get("service");
            if ((!strValueOf.equals("install") && !strValueOf.equals("deeplink")) || (!abstractC7841a.name().equals("TRACKING") && !abstractC7841a.name().equals("SDK"))) {
                if (strValueOf.equals("init")) {
                    Context context = C7843ab.f14307g;
                    C7955ef.m11868a();
                    C7940dr.m11756a();
                    C7946dx.m11818a();
                    C7941ds.m11778a();
                    C7952ec.m11852a();
                    C7942dt.m11780a();
                    C7947dy.m11819a();
                    if (!C7912cq.m11596a(context)) {
                        C7954ee.m11865b().m11867a();
                        C7939dq.m11754a().m11755b();
                    }
                    C7843ab.f14302b = true;
                    if (abstractC7841a.name().equals("SDK")) {
                        m11829a(context, abstractC7841a);
                    }
                    m11839e(abstractC7841a);
                    m11841f(abstractC7841a);
                    return;
                }
                return;
            }
            C7961el c7961el = new C7961el();
            Object obj = aVar.paraMap.get("data");
            c7961el.f14869b = String.valueOf(aVar.paraMap.get(DispatchConstants.DOMAIN));
            c7961el.f14870c = strValueOf;
            if (obj != null && (obj instanceof Map)) {
                c7961el.f14871d = (Map) obj;
            }
            c7961el.f14868a = abstractC7841a;
            C7913cr.m11625a().post(c7961el);
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    private void m11829a(Context context, AbstractC7841a abstractC7841a) {
        if (f14812h) {
            return;
        }
        try {
            String str = "TalkingData SDK init...\n\tSDK_VERSION is: Android+TD+V5.0.17 gp Type:" + C7843ab.m11038c() + "  Build_Num:" + C7843ab.f14323w + "\n\tApp ID is: " + C7843ab.m11027a(context, abstractC7841a) + "\n\tApp Channel is: " + C7843ab.m11034b(context, abstractC7841a) + "\n\tApp Custom is: " + C7843ab.m11039c(context, abstractC7841a) + "\n\tSDK_OVC is: " + C7922d.f14664e;
            if (C7843ab.f14302b || C7896ca.f14478a) {
                Log.i(C7843ab.f14321u, str);
            }
            f14812h = true;
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public static void m11837d(AbstractC7841a abstractC7841a) {
        try {
            if (abstractC7841a == null) {
                C7896ca.eForInternal("TDFeatures is null...");
            } else if (C7897cb.m11390d(abstractC7841a) == 0) {
                C7897cb.m11382b(System.currentTimeMillis(), abstractC7841a);
            }
        } catch (Throwable unused) {
        }
    }

    /* renamed from: e */
    private static void m11839e(AbstractC7841a abstractC7841a) {
        try {
            if (C7897cb.m11390d(abstractC7841a) != 0 && System.currentTimeMillis() - C7897cb.m11390d(abstractC7841a) > 86400000) {
                C7912cq.f14610c = true;
            }
        } catch (Throwable unused) {
        }
    }

    /* renamed from: f */
    private static void m11840f() {
        try {
            f14807c = System.currentTimeMillis();
            ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1, new b());
            f14805a = scheduledThreadPoolExecutor;
            scheduledThreadPoolExecutor.scheduleAtFixedRate(new a(), 0L, 2L, TimeUnit.SECONDS);
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    private static boolean m11831a(Context context) {
        if (context == null) {
            C7896ca.eForInternal("[ModuleInit] current context is null...");
            return false;
        }
        for (String str : context.getPackageManager().getPackageInfo(context.getPackageName(), 4096).requestedPermissions) {
            if (str.equalsIgnoreCase("android.permission.READ_PHONE_STATE")) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public static C7950ea m11828a() {
        if (f14810f == null) {
            synchronized (C7950ea.class) {
                try {
                    if (f14810f == null) {
                        f14810f = new C7950ea();
                    }
                } finally {
                }
            }
        }
        return f14810f;
    }

    /* renamed from: g */
    private static void m11842g() {
        try {
            C7961el c7961el = new C7961el();
            c7961el.f14869b = "env";
            c7961el.f14870c = "getProp";
            TreeMap treeMap = new TreeMap();
            treeMap.put("sysproperty", C7912cq.m11585a());
            c7961el.f14871d = treeMap;
            c7961el.f14868a = AbstractC7841a.ENV;
            C7913cr.m11625a().post(c7961el);
        } catch (Throwable unused) {
        }
    }
}
