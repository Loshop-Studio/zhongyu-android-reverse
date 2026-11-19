package p154k2;

import android.app.Application;
import android.content.Context;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import android.widget.Toast;
import com.umeng.analytics.MobclickAgent;
import com.umeng.analytics.pro.C6769d;
import com.umeng.commonsdk.config.C6780a;
import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import p021b3.AbstractC5107a;
import p176m2.AbstractC8959h;
import p176m2.C8957f;
import p186n2.AbstractC9089c;
import p196o2.C9160b;
import p240s2.C9468a;
import p260u2.AbstractC9666a;
import p260u2.AbstractC9667b;
import p260u2.C9670e;
import p310z2.AbstractC9993d;

/* renamed from: k2.a */
/* loaded from: classes4.dex */
public abstract class AbstractC8263a {

    /* renamed from: a */
    public static boolean f14355a = false;

    /* renamed from: b */
    public static C8957f f14356b = new C8957f();

    /* renamed from: c */
    public static boolean f14357c = false;

    /* renamed from: d */
    public static Object f14358d = new Object();

    /* renamed from: e */
    public static String f14359e = "";

    /* renamed from: f */
    public static String f14360f = "";

    /* renamed from: g */
    public static boolean f14361g = false;

    /* renamed from: h */
    public static boolean f14362h = false;

    /* renamed from: i */
    public static Object f14363i = new Object();

    /* renamed from: k2.a$a */
    public static class a extends Thread {

        /* renamed from: a */
        public final /* synthetic */ Context f14364a;

        public a(Context context) {
            this.f14364a = context;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            try {
                Looper.prepare();
                Toast.makeText(this.f14364a, "SDK 初始化失败，请检查是否集成umeng-asms-1.2.X.aar库。", 1).show();
                Looper.loop();
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: k2.a$b */
    public static class b extends Thread {

        /* renamed from: a */
        public final /* synthetic */ Context f14365a;

        public b(Context context) {
            this.f14365a = context;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            try {
                Looper.prepare();
                Toast.makeText(this.f14365a, "基础组件库9.3.6版本仅支持6.2.0及更高版本推送SDK、7.1.0及更高版本分享SDK。", 1).show();
                Looper.loop();
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: k2.a$c */
    public static class c extends Thread {

        /* renamed from: a */
        public final /* synthetic */ Context f14366a;

        public c(Context context) {
            this.f14366a = context;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            try {
                Looper.prepare();
                Toast.makeText(this.f14366a, "基础组件库9.3.6版本仅支持6.2.0及更高版本推送SDK、7.1.0及更高版本分享SDK。", 1).show();
                Looper.loop();
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: a */
    public static boolean m13308a(Class cls) {
        try {
            return cls.getDeclaredField("isZyb") != null;
        } catch (Throwable unused) {
            return false;
        }
    }

    /* renamed from: b */
    public static Class m13309b(String str) {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    /* renamed from: c */
    public static boolean m13310c() {
        boolean z9;
        synchronized (f14363i) {
            z9 = f14362h;
        }
        return z9;
    }

    /* renamed from: d */
    public static void m13311d(Context context, String str, String str2, int i9, String str3) throws IllegalAccessException, NoSuchMethodException, ClassNotFoundException, SecurityException, IllegalArgumentException, InvocationTargetException {
        Object objInvoke;
        Method declaredMethod;
        Method declaredMethod2;
        Method declaredMethod3;
        Object objInvoke2;
        Method declaredMethod4;
        try {
            try {
                if (f14355a) {
                    Log.i("UMConfigure", "common version is 9.3.7");
                    Log.i("UMConfigure", "common type is " + AbstractC9667b.f17073a);
                }
            } catch (Throwable th) {
                if (f14355a) {
                    Log.e("UMConfigure", "init e is " + th);
                }
            }
        } catch (Exception e10) {
            if (f14355a) {
                Log.e("UMConfigure", "init e is " + e10);
            }
        }
        if (context == null) {
            if (f14355a) {
                Log.e("UMConfigure", "context is null !!!");
                return;
            }
            return;
        }
        if (f14361g) {
            if (f14355a) {
                Log.e("UMConfigure", "has inited !!!");
                return;
            }
            return;
        }
        Context applicationContext = context.getApplicationContext();
        try {
            if (m13309b("com.umeng.umzid.ZIDManager") == null) {
                Log.e("UMConfigure", "--->>> SDK 初始化失败，请检查是否集成umeng-asms-1.2.x.aar库。<<<--- ");
                new a(applicationContext).start();
                return;
            }
        } catch (Throwable unused) {
        }
        try {
            Class clsM13309b = m13309b("com.umeng.message.PushAgent");
            if (clsM13309b != null && !m13308a(clsM13309b)) {
                Log.e("UMLog", "基础组件库9.3.6版本仅支持6.2.0及更高版本推送SDK、7.1.0及更高版本分享SDK。");
                new b(applicationContext).start();
            }
        } catch (Throwable unused2) {
        }
        try {
            Class clsM13309b2 = m13309b("com.umeng.socialize.UMShareAPI");
            if (clsM13309b2 != null && !m13308a(clsM13309b2)) {
                Log.e("UMLog", "基础组件库9.3.6版本仅支持6.2.0及更高版本推送SDK、7.1.0及更高版本分享SDK。");
                new c(applicationContext).start();
            }
        } catch (Throwable unused3) {
        }
        if (!m13313f()) {
            m13315h(applicationContext, str, str2);
            if (!m13313f()) {
                return;
            }
        }
        AbstractC9993d.m17336u(applicationContext, f14359e);
        String strM17327l = AbstractC9993d.m17327l(applicationContext);
        if (!TextUtils.isEmpty(f14359e) && !f14359e.equals(strM17327l)) {
            if (!TextUtils.isEmpty(strM17327l) && f14355a) {
                C8957f.m14286g("AppKey改变!!!", 2, "");
            }
            AbstractC9993d.m17338w(applicationContext, f14359e);
        }
        if (f14355a) {
            Log.i("UMConfigure", "current appkey is " + f14359e + ", last appkey is " + strM17327l);
        }
        if (f14355a) {
            String strM17322g = AbstractC9993d.m17322g(applicationContext);
            if (!TextUtils.isEmpty(f14359e) && !TextUtils.isEmpty(strM17322g) && !f14359e.equals(strM17322g)) {
                C8957f.m14287h("请注意：您init接口中设置的AppKey是@，manifest中设置的AppKey是#，init接口设置的AppKey会覆盖manifest中设置的AppKey", 3, "", new String[]{"@", "#"}, new String[]{f14359e, strM17322g});
            }
        }
        AbstractC9993d.m17337v(applicationContext, f14360f);
        if (f14355a) {
            Log.i("UMConfigure", "channel is " + f14360f);
        }
        try {
            Method declaredMethod5 = MobclickAgent.class.getDeclaredMethod("init", Context.class);
            if (declaredMethod5 != null) {
                declaredMethod5.setAccessible(true);
                declaredMethod5.invoke(MobclickAgent.class, applicationContext);
                if (C6780a.m6260e("header_first_resume")) {
                    AbstractC8959h.m14293c("MobclickRT", "--->>> FirstResumeTrigger enabled.");
                    C6769d.m6132b(applicationContext).m6149k(applicationContext);
                } else {
                    AbstractC8959h.m14293c("MobclickRT", "--->>> FirstResumeTrigger disabled.");
                }
                if (f14355a) {
                    C8957f.m14286g("统计SDK初始化成功", 2, "");
                }
            }
            Class.forName("com.umeng.analytics.game.UMGameAgent");
            Method declaredMethod6 = MobclickAgent.class.getDeclaredMethod("setGameScenarioType", Context.class);
            if (declaredMethod6 != null) {
                declaredMethod6.setAccessible(true);
                declaredMethod6.invoke(MobclickAgent.class, applicationContext);
            }
            if (C9670e.f17090e.indexOf("e") >= 0 && (declaredMethod4 = MobclickAgent.class.getDeclaredMethod("disableExceptionCatch", null)) != null) {
                declaredMethod4.setAccessible(true);
                declaredMethod4.invoke(MobclickAgent.class, null);
            }
        } catch (Throwable unused4) {
        }
        try {
            Class<?> cls = Class.forName("com.umeng.message.MessageSharedPrefs");
            Method declaredMethod7 = cls.getDeclaredMethod("getInstance", Context.class);
            if (declaredMethod7 != null && (objInvoke2 = declaredMethod7.invoke(cls, applicationContext)) != null) {
                Method declaredMethod8 = cls.getDeclaredMethod("setMessageAppKey", String.class);
                if (declaredMethod8 != null) {
                    declaredMethod8.setAccessible(true);
                    declaredMethod8.invoke(objInvoke2, f14359e);
                    if (f14355a) {
                        C8957f.m14286g("PUSH AppKey设置成功", 2, "");
                    }
                }
                Method declaredMethod9 = cls.getDeclaredMethod("setMessageChannel", String.class);
                if (declaredMethod9 != null) {
                    declaredMethod9.setAccessible(true);
                    declaredMethod9.invoke(objInvoke2, f14360f);
                    if (f14355a) {
                        C8957f.m14286g("PUSH Channel设置成功", 2, "");
                    }
                }
                if (!TextUtils.isEmpty(str3)) {
                    if (f14355a) {
                        Log.i("UMConfigure", "push secret is " + str3);
                    }
                    Method declaredMethod10 = cls.getDeclaredMethod("setMessageAppSecret", String.class);
                    if (declaredMethod10 != null) {
                        declaredMethod10.setAccessible(true);
                        declaredMethod10.invoke(objInvoke2, str3);
                        if (f14355a) {
                            C8957f.m14286g("PUSH Secret设置成功", 2, "");
                        }
                    }
                }
            }
        } catch (Exception unused5) {
        }
        try {
            Class clsM13309b3 = m13309b("com.umeng.socialize.UMShareAPI");
            m13316i(clsM13309b3, "APPKEY", f14359e);
            if (clsM13309b3 != null && (declaredMethod3 = clsM13309b3.getDeclaredMethod("init", Context.class, String.class)) != null) {
                declaredMethod3.setAccessible(true);
                declaredMethod3.invoke(clsM13309b3, applicationContext, f14359e);
                if (f14355a) {
                    C8957f.m14286g("Share AppKey设置成功", 2, "");
                }
            }
        } catch (Throwable unused6) {
        }
        AbstractC9666a.m16115b(i9);
        try {
            Class<?> cls2 = Class.forName("com.umeng.error.UMError");
            Method declaredMethod11 = cls2.getDeclaredMethod("init", Context.class);
            if (declaredMethod11 != null) {
                declaredMethod11.setAccessible(true);
                declaredMethod11.invoke(cls2, applicationContext);
                if (f14355a) {
                    C8957f.m14286g("错误分析SDK初始化成功", 2, "");
                }
            }
        } catch (Throwable unused7) {
        }
        try {
            String str4 = AbstractC5107a.f2214a;
            if (AbstractC9667b.f17073a == 1 && (declaredMethod2 = AbstractC5107a.class.getDeclaredMethod("useIntlServices", Boolean.TYPE)) != null) {
                declaredMethod2.setAccessible(true);
                declaredMethod2.invoke(AbstractC5107a.class, Boolean.TRUE);
            }
            Method declaredMethod12 = AbstractC5107a.class.getDeclaredMethod("init", Context.class, String.class, String.class);
            if (declaredMethod12 != null) {
                declaredMethod12.setAccessible(true);
                declaredMethod12.invoke(AbstractC5107a.class, applicationContext, f14359e, f14360f);
                if (f14355a) {
                    C8957f.m14286g("APM SDK初始化成功", 2, "");
                }
            }
        } catch (Throwable unused8) {
        }
        try {
            Method declaredMethod13 = Class.forName("com.umeng.vt.facade.EventFacade").getDeclaredMethod("init", Application.class, String.class, String.class, Integer.TYPE, String.class);
            if (declaredMethod13 != null) {
                declaredMethod13.invoke(null, applicationContext, f14359e, f14360f, Integer.valueOf(i9), str3);
                AbstractC8959h.m14293c("MobclickRT", "--->>>初始化 EventFacade 成功.");
            }
        } catch (Throwable unused9) {
        }
        try {
            Method declaredMethod14 = Class.forName("com.umeng.vt.common.VTTracker").getDeclaredMethod("init", Application.class, String.class);
            if (declaredMethod14 != null) {
                declaredMethod14.invoke(null, applicationContext, f14359e);
                AbstractC8959h.m14293c("MobclickRT", "--->>>初始化 VTTracker 成功.");
            }
        } catch (Throwable unused10) {
        }
        synchronized (f14363i) {
            f14362h = true;
        }
        if (m13314g(applicationContext)) {
            AbstractC8959h.m14292b("MobclickRT", "--->>> 走零号报文发送逻辑");
            AbstractC9089c.m14596m(applicationContext, 32781, C9160b.m14737a(applicationContext).m14738b(), null);
        } else {
            AbstractC8959h.m14292b("MobclickRT", "--->>> 走正常逻辑.");
            if (C6780a.m6261f()) {
                AbstractC9089c.m14596m(applicationContext, 32791, C9160b.m14737a(applicationContext).m14738b(), null);
            }
        }
        if (m13312e()) {
            AbstractC8265c.m13335a(applicationContext);
        }
        try {
            Context applicationContext2 = context.getApplicationContext();
            Class<?> cls3 = Class.forName("com.umeng.cconfig.UMRemoteConfig");
            Method declaredMethod15 = cls3.getDeclaredMethod("getInstance", null);
            if (declaredMethod15 != null && (objInvoke = declaredMethod15.invoke(cls3, null)) != null && (declaredMethod = cls3.getDeclaredMethod("init", Context.class)) != null) {
                declaredMethod.setAccessible(true);
                declaredMethod.invoke(objInvoke, applicationContext2);
            }
        } catch (Exception unused11) {
        }
        if (f14361g) {
            return;
        }
        f14361g = true;
    }

    /* renamed from: e */
    public static boolean m13312e() {
        return f14355a;
    }

    /* renamed from: f */
    public static boolean m13313f() {
        boolean z9;
        synchronized (f14358d) {
            z9 = f14357c;
        }
        return z9;
    }

    /* renamed from: g */
    public static boolean m13314g(Context context) {
        File filesDir = context.getFilesDir();
        StringBuilder sb = new StringBuilder();
        sb.append(filesDir.getAbsolutePath());
        sb.append(File.separator);
        sb.append("umeng_zcfg_flag");
        return !new File(sb.toString()).exists();
    }

    /* renamed from: h */
    public static void m13315h(Context context, String str, String str2) {
        if (context == null) {
            if (f14355a) {
                Log.e("UMConfigure", "preInit: context is null, pls check!");
                return;
            }
            return;
        }
        Context applicationContext = context.getApplicationContext();
        if (TextUtils.isEmpty(str)) {
            str = AbstractC9993d.m17322g(applicationContext);
        }
        if (TextUtils.isEmpty(str2)) {
            str2 = AbstractC9993d.m17324i(applicationContext);
        }
        if (TextUtils.isEmpty(str2)) {
            str2 = "Unknown";
        }
        if (TextUtils.isEmpty(str)) {
            return;
        }
        f14359e = str;
        f14360f = str2;
        C9468a.m15648e(applicationContext);
        C6769d.m6132b(applicationContext);
        if (!m13314g(applicationContext)) {
            C6780a.m6259b().m6262c(applicationContext);
        }
        synchronized (f14358d) {
            f14357c = true;
        }
    }

    /* renamed from: i */
    public static void m13316i(Class cls, String str, String str2) throws IllegalAccessException, IllegalArgumentException {
        if (cls != null) {
            try {
                cls.getField(str).set(str, str2);
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: j */
    public static void m13317j(boolean z9) {
        AbstractC9666a.f17069a = z9;
    }
}
