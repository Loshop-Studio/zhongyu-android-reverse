package p196o2;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.text.TextUtils;
import com.umeng.commonsdk.config.C6780a;
import com.umeng.commonsdk.framework.AbstractC6782a;
import com.umeng.commonsdk.framework.UMLogDataProtocol;
import java.io.File;
import java.lang.reflect.Method;
import org.json.JSONObject;
import p032c3.AbstractC5224a;
import p092e2.C7840b;
import p114g2.AbstractC8042t0;
import p114g2.C8021j;
import p114g2.C8023k;
import p154k2.AbstractC8264b;
import p154k2.AbstractC8267e;
import p176m2.AbstractC8959h;
import p186n2.AbstractC9089c;
import p230r2.InterfaceC9427a;
import p240s2.C9468a;
import p260u2.AbstractC9668c;
import p260u2.C9670e;
import p310z2.AbstractC9993d;
import p310z2.InterfaceC9994e;

/* renamed from: o2.c */
/* loaded from: classes4.dex */
public class C9161c implements UMLogDataProtocol {

    /* renamed from: b */
    public static int f15475b = 1;

    /* renamed from: c */
    public static Class f15476c = null;

    /* renamed from: d */
    public static Method f15477d = null;

    /* renamed from: e */
    public static Method f15478e = null;

    /* renamed from: f */
    public static Method f15479f = null;

    /* renamed from: g */
    public static boolean f15480g = false;

    /* renamed from: a */
    public Context f15481a;

    /* renamed from: o2.c$a */
    public static class a implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ Context f15482a;

        public a(Context context) {
            this.f15482a = context;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                SharedPreferences sharedPreferences = this.f15482a.getSharedPreferences("umeng_sp_oaid", 0);
                long jCurrentTimeMillis = System.currentTimeMillis();
                String strM12721a = AbstractC8042t0.m12721a(this.f15482a);
                long jCurrentTimeMillis2 = System.currentTimeMillis();
                if (!TextUtils.isEmpty(strM12721a) && sharedPreferences != null) {
                    SharedPreferences.Editor editorEdit = sharedPreferences.edit();
                    editorEdit.putString("key_umeng_sp_oaid_required_time", (jCurrentTimeMillis2 - jCurrentTimeMillis) + "");
                    editorEdit.commit();
                }
                if (sharedPreferences != null) {
                    SharedPreferences.Editor editorEdit2 = sharedPreferences.edit();
                    editorEdit2.putString("key_umeng_sp_oaid", strM12721a);
                    editorEdit2.commit();
                }
                if (Build.VERSION.SDK_INT > 28) {
                    AbstractC8264b.m13333p();
                }
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: o2.c$b */
    public static class b implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ Context f15483a;

        /* renamed from: b */
        public final /* synthetic */ InterfaceC9427a f15484b;

        public b(Context context, InterfaceC9427a interfaceC9427a) {
            this.f15483a = context;
            this.f15484b = interfaceC9427a;
        }

        @Override // java.lang.Runnable
        public void run() {
            String strM12721a = AbstractC8042t0.m12721a(this.f15483a);
            InterfaceC9427a interfaceC9427a = this.f15484b;
            if (interfaceC9427a != null) {
                interfaceC9427a.mo14755a(strM12721a);
            }
        }
    }

    /* renamed from: o2.c$c */
    public static class c implements InterfaceC9427a {

        /* renamed from: a */
        public final /* synthetic */ Context f15485a;

        public c(Context context) {
            this.f15485a = context;
        }

        @Override // p230r2.InterfaceC9427a
        /* renamed from: a */
        public void mo14755a(String str) {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            try {
                SharedPreferences sharedPreferences = this.f15485a.getSharedPreferences("umeng_sp_oaid", 0);
                if (sharedPreferences == null || sharedPreferences.getString("key_umeng_sp_oaid", "").equalsIgnoreCase(str)) {
                    return;
                }
                AbstractC8959h.m14292b("MobclickRT", "--->>> 更新本地缓存OAID");
                SharedPreferences.Editor editorEdit = sharedPreferences.edit();
                editorEdit.putString("key_umeng_sp_oaid", str);
                editorEdit.commit();
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: o2.c$d */
    public class d implements InterfaceC9427a {
        public d() {
        }

        @Override // p230r2.InterfaceC9427a
        /* renamed from: a */
        public void mo14755a(String str) {
            AbstractC8959h.m14292b("MobclickRT", "--->>> OAID云控参数更新(不采集->采集)：采集完成");
            if (TextUtils.isEmpty(str)) {
                AbstractC8959h.m14292b("MobclickRT", "--->>> oaid返回null或者空串，不需要 伪冷启动。");
                return;
            }
            try {
                SharedPreferences sharedPreferences = C9161c.this.f15481a.getSharedPreferences("umeng_sp_oaid", 0);
                if (sharedPreferences != null) {
                    SharedPreferences.Editor editorEdit = sharedPreferences.edit();
                    editorEdit.putString("key_umeng_sp_oaid", str);
                    editorEdit.commit();
                }
            } catch (Throwable unused) {
            }
            AbstractC9089c.m14596m(C9161c.this.f15481a, 32788, C9160b.m14737a(C9161c.this.f15481a).m14738b(), null);
        }
    }

    /* renamed from: o2.c$e */
    public class e implements InterfaceC9994e {
        public e() {
        }

        @Override // p310z2.InterfaceC9994e
        /* renamed from: a */
        public void mo14756a() {
            if (C9161c.this.f15481a != null) {
                AbstractC9089c.m14596m(C9161c.this.f15481a, 32790, C9160b.m14737a(C9161c.this.f15481a).m14738b(), null);
            }
            AbstractC8264b.m13334q(this);
        }
    }

    static {
        m14744k();
    }

    public C9161c(Context context) {
        if (context != null) {
            this.f15481a = context.getApplicationContext();
        }
    }

    /* renamed from: e */
    public static Class m14740e(String str) {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    /* renamed from: h */
    public static void m14741h(Context context, InterfaceC9427a interfaceC9427a) {
        if (context == null) {
            return;
        }
        new Thread(new b(context.getApplicationContext(), interfaceC9427a)).start();
    }

    /* renamed from: i */
    public static String m14742i() {
        Method method;
        Class cls = f15476c;
        if (cls == null || (method = f15477d) == null || f15479f == null) {
            return "";
        }
        try {
            Object objInvoke = method.invoke(cls, null);
            return objInvoke != null ? (String) f15479f.invoke(objInvoke, null) : "";
        } catch (Throwable unused) {
            return "";
        }
    }

    /* renamed from: j */
    public static void m14743j(Context context) {
        new Thread(new a(context)).start();
    }

    /* renamed from: k */
    public static void m14744k() {
        try {
            f15476c = AbstractC5224a.class;
            Method declaredMethod = AbstractC5224a.class.getDeclaredMethod("getInstance", null);
            if (declaredMethod != null) {
                f15477d = declaredMethod;
            }
            Method declaredMethod2 = f15476c.getDeclaredMethod("getZID", Context.class);
            if (declaredMethod2 != null) {
                f15478e = declaredMethod2;
            }
            Method declaredMethod3 = f15476c.getDeclaredMethod("getSDKVersion", null);
            if (declaredMethod3 != null) {
                f15479f = declaredMethod3;
            }
        } catch (Throwable unused) {
        }
    }

    /* renamed from: l */
    public static void m14745l(Context context) {
        if (!C6780a.m6260e("header_device_oaid") || Build.VERSION.SDK_INT <= 28) {
            return;
        }
        m14741h(context, new c(context));
    }

    /* renamed from: p */
    public static void m14746p(Context context) {
        File file = new File(context.getFilesDir().getAbsolutePath() + File.separator + "umeng_zcfg_flag");
        if (file.exists()) {
            return;
        }
        try {
            file.createNewFile();
        } catch (Throwable unused) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00cc  */
    @Override // com.umeng.commonsdk.framework.UMLogDataProtocol
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo6252c(java.lang.Object r10, int r11) throws org.json.JSONException, java.lang.IllegalAccessException, java.lang.NoSuchMethodException, java.lang.SecurityException, java.lang.IllegalArgumentException, java.lang.reflect.InvocationTargetException {
        /*
            Method dump skipped, instructions count: 680
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p196o2.C9161c.mo6252c(java.lang.Object, int):void");
    }

    @Override // com.umeng.commonsdk.framework.UMLogDataProtocol
    /* renamed from: d */
    public JSONObject mo6253d(long j9) {
        return null;
    }

    /* renamed from: f */
    public String m14747f() {
        Method method;
        Class cls = f15476c;
        if (cls == null || (method = f15477d) == null || f15478e == null) {
            return "";
        }
        try {
            Object objInvoke = method.invoke(cls, null);
            return objInvoke != null ? (String) f15478e.invoke(objInvoke, this.f15481a) : "";
        } catch (Throwable unused) {
            return "";
        }
    }

    /* renamed from: g */
    public final void m14748g(Context context) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("appkey", C9468a.m15648e(context).m15650d());
            jSONObject.put("app_version", C9468a.m15648e(context).m15649c());
            jSONObject.put("os", "Android");
            JSONObject jSONObjectM6270d = AbstractC6782a.m6270d(context, jSONObject, null, AbstractC9668c.f17074a);
            if (jSONObjectM6270d == null || !jSONObjectM6270d.has("exception")) {
                AbstractC8959h.m14292b("MobclickRT", "--->>> 构建零号报文 成功!!!");
            } else {
                AbstractC8959h.m14292b("MobclickRT", "--->>> 构建零号报文失败.");
            }
        } catch (Throwable unused) {
        }
    }

    /* renamed from: m */
    public final void m14749m() {
        C8021j c8021jM12608c = C8021j.m12608c(this.f15481a);
        C8023k c8023kM12610g = c8021jM12608c.m12610g("stf");
        if (c8023kM12610g != null) {
            AbstractC8959h.m14292b("MobclickRT", "--->>> [有状态]二级缓存记录构建成真正信封。");
            try {
                String str = c8023kM12610g.f13576a;
                String str2 = c8023kM12610g.f13577b;
                JSONObject jSONObjectM16123e = new C9670e().m16123e(this.f15481a.getApplicationContext(), new JSONObject(c8023kM12610g.f13578c), new JSONObject(c8023kM12610g.f13579d), c8023kM12610g.f13580e, str2, c8023kM12610g.f13581f);
                if (jSONObjectM16123e == null || !jSONObjectM16123e.has("exception")) {
                    AbstractC8959h.m14292b("MobclickRT", "--->>> [有状态]二级缓存记录构建真正信封 成功! 删除二级缓存记录。");
                } else {
                    AbstractC8959h.m14292b("MobclickRT", "--->>> [有状态]二级缓存记录构建真正信封 失败。删除二级缓存记录");
                }
                c8021jM12608c.m12613j("stf", str);
                c8021jM12608c.m12615l();
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: n */
    public final void m14750n(Context context) {
        Object objInvoke;
        Method declaredMethod;
        Context applicationContext = context.getApplicationContext();
        String strM17321f = AbstractC9993d.m17321f(context);
        try {
            Class clsM14740e = m14740e("com.umeng.umzid.ZIDManager");
            Method declaredMethod2 = clsM14740e.getDeclaredMethod("getInstance", null);
            if (declaredMethod2 == null || (objInvoke = declaredMethod2.invoke(clsM14740e, null)) == null || (declaredMethod = clsM14740e.getDeclaredMethod("init", Context.class, String.class, m14740e("com.umeng.umzid.IZIDCompletionCallback"))) == null) {
                return;
            }
            declaredMethod.invoke(objInvoke, applicationContext, strM17321f, null);
        } catch (Throwable unused) {
        }
    }

    /* renamed from: o */
    public final void m14751o() {
        if (f15480g) {
            if (C6780a.m6260e("header_device_oaid")) {
                return;
            }
            f15480g = false;
        } else {
            if (!C6780a.m6260e("header_device_oaid") || Build.VERSION.SDK_INT <= 28) {
                return;
            }
            f15480g = true;
            m14741h(this.f15481a, new d());
        }
    }

    /* renamed from: q */
    public final void m14752q() {
        if (!C6780a.m6260e("header_device_oaid") || Build.VERSION.SDK_INT <= 28) {
            return;
        }
        f15480g = true;
        AbstractC8264b.m13331n();
        AbstractC8264b.m13330m(this.f15481a);
        f15475b++;
        AbstractC8959h.m14292b("MobclickRT", "--->>> 要读取 oaid，需等待读取结果.");
        AbstractC8264b.m13332o(new e());
        m14743j(this.f15481a);
    }

    /* renamed from: r */
    public final void m14753r() {
        if (f15475b <= 0) {
            m14754s();
            m14750n(this.f15481a);
        }
    }

    /* renamed from: s */
    public final void m14754s() {
        AbstractC8959h.m14292b("MobclickRT", "--->>> 真实构建条件满足，开始构建业务信封。");
        if (AbstractC9993d.m17334s(this.f15481a)) {
            m14746p(this.f15481a);
            AbstractC8267e.m13337a(this.f15481a);
            Context context = this.f15481a;
            AbstractC9089c.m14596m(context, 8208, C7840b.m12281f(context), null);
            Context context2 = this.f15481a;
            AbstractC9089c.m14596m(context2, 32785, C9160b.m14737a(context2).m14738b(), null);
        }
    }

    @Override // com.umeng.commonsdk.framework.UMLogDataProtocol
    /* renamed from: a */
    public void mo6251a(Object obj) {
    }
}
