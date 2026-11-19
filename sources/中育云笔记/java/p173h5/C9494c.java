package p173h5;

import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import com.alibaba.sdk.android.oss.common.utils.HttpHeaders;
import com.huawei.hms.framework.common.BundleUtil;
import com.huawei.hms.framework.common.ExecutorsUtils;
import com.huawei.hms.framework.common.Logger;
import com.huawei.hms.framework.common.StringUtils;
import com.huawei.hms.framework.network.grs.GrsApp;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import com.huawei.hms.framework.network.grs.IQueryUrlCallBack;
import com.huawei.hms.framework.network.grs.IQueryUrlsCallBack;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import p189i5.C9607a;
import p189i5.C9609c;
import p203j5.C9681b;
import p218k5.AbstractC9818h;
import p218k5.C9817g;
import p247m5.C10202c;
import p259n5.AbstractC10317a;

/* renamed from: h5.c */
/* loaded from: classes5.dex */
public class C9494c {

    /* renamed from: i */
    public static final String f21934i = "c";

    /* renamed from: j */
    public static final ExecutorService f21935j = ExecutorsUtils.newSingleThreadExecutor("GrsInit");

    /* renamed from: k */
    public static long f21936k = 0;

    /* renamed from: a */
    public GrsBaseInfo f21937a;

    /* renamed from: b */
    public Context f21938b;

    /* renamed from: c */
    public C9817g f21939c;

    /* renamed from: d */
    public C9607a f21940d;

    /* renamed from: e */
    public C9609c f21941e;

    /* renamed from: f */
    public C9609c f21942f;

    /* renamed from: g */
    public C9492a f21943g;

    /* renamed from: h */
    public FutureTask f21944h;

    /* renamed from: h5.c$a */
    public class a implements Callable {

        /* renamed from: a */
        public final /* synthetic */ Context f21945a;

        /* renamed from: b */
        public final /* synthetic */ GrsBaseInfo f21946b;

        /* renamed from: h5.c$a$a, reason: collision with other inner class name */
        public class RunnableC12137a implements Runnable {

            /* renamed from: c */
            public final /* synthetic */ C9681b f21948c;

            /* renamed from: d */
            public final /* synthetic */ C9609c f21949d;

            public RunnableC12137a(C9681b c9681b, C9609c c9609c) {
                this.f21948c = c9681b;
                this.f21949d = c9609c;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f21948c.m19165f(a.this.f21945a.getPackageName(), this.f21949d);
            }
        }

        public a(Context context, GrsBaseInfo grsBaseInfo) {
            this.f21945a = context;
            this.f21946b = grsBaseInfo;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean call() throws NumberFormatException {
            C9494c.this.f21939c = new C9817g();
            C9494c.this.f21941e = new C9609c(this.f21945a, GrsApp.getInstance().getBrand(BundleUtil.UNDERLINE_TAG) + "share_pre_grs_conf_");
            C9494c.this.f21942f = new C9609c(this.f21945a, GrsApp.getInstance().getBrand(BundleUtil.UNDERLINE_TAG) + "share_pre_grs_services_");
            C9494c c9494c = C9494c.this;
            c9494c.f21940d = new C9607a(c9494c.f21941e, C9494c.this.f21942f, C9494c.this.f21939c);
            C9494c c9494c2 = C9494c.this;
            c9494c2.f21943g = new C9492a(c9494c2.f21937a, C9494c.this.f21940d, C9494c.this.f21939c, C9494c.this.f21942f);
            if (C9681b.m19160a(this.f21945a.getPackageName()) == null) {
                C9609c c9609c = new C9609c(this.f21945a, GrsApp.getInstance().getBrand(BundleUtil.UNDERLINE_TAG) + "share_pre_grs_local_conf_");
                String strM18837a = c9609c.m18837a(this.f21945a.getPackageName() + "#localConfig", "");
                if (TextUtils.isEmpty(strM18837a) || !new C9681b().m19166g(this.f21945a, strM18837a)) {
                    C9494c.f21935j.execute(new RunnableC12137a(new C9681b(this.f21945a, true), c9609c));
                }
            }
            String strM21310d = new C10202c(this.f21946b, this.f21945a).m21310d();
            Logger.m8586v(C9494c.f21934i, "scan serviceSet is: " + strM21310d);
            String strM18837a2 = C9494c.this.f21942f.m18837a("services", "");
            String strM19888a = AbstractC9818h.m19888a(strM18837a2, strM21310d);
            if (!TextUtils.isEmpty(strM19888a)) {
                C9494c.this.f21942f.m18842f("services", strM19888a);
                Logger.m8580i(C9494c.f21934i, "postList is:" + StringUtils.anonymizeMessage(strM19888a));
                Logger.m8571d(C9494c.f21934i, "currentServices:" + StringUtils.anonymizeMessage(strM18837a2));
                if (!strM19888a.equals(strM18837a2)) {
                    C9494c.this.f21939c.m19884e(C9494c.this.f21937a.getGrsParasKey(true, true, this.f21945a));
                    C9494c.this.f21939c.m19886h(new C10202c(this.f21946b, this.f21945a), null, null, C9494c.this.f21942f, C9494c.this.f21937a.getQueryTimeout());
                }
            }
            long jElapsedRealtime = SystemClock.elapsedRealtime() - C9494c.f21936k;
            if (C9494c.f21936k == 0 || TimeUnit.MILLISECONDS.toHours(jElapsedRealtime) > 24) {
                Logger.m8580i(C9494c.f21934i, "Try to clear unUsed sp data.");
                long unused = C9494c.f21936k = SystemClock.elapsedRealtime();
                C9494c c9494c3 = C9494c.this;
                c9494c3.m18691n(c9494c3.f21941e.m18838b());
            }
            C9494c.this.f21940d.m18833h(this.f21946b, this.f21945a);
            return Boolean.TRUE;
        }
    }

    public C9494c(Context context, GrsBaseInfo grsBaseInfo) {
        this.f21944h = null;
        this.f21938b = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        m18688j(grsBaseInfo);
        GrsBaseInfo grsBaseInfo2 = this.f21937a;
        FutureTask futureTask = new FutureTask(new a(this.f21938b, grsBaseInfo2));
        this.f21944h = futureTask;
        f21935j.execute(futureTask);
        Logger.m8581i(f21934i, "GrsClient Instance is init, GRS SDK version: %s, GrsBaseInfoParam: app_name=%s, reg_country=%s, ser_country=%s, issue_country=%s ,queryTimeout=%d", AbstractC10317a.m21521a(), grsBaseInfo2.getAppName(), grsBaseInfo.getRegCountry(), grsBaseInfo.getSerCountry(), grsBaseInfo.getIssueCountry(), Integer.valueOf(grsBaseInfo.getQueryTimeout()));
    }

    /* renamed from: e */
    public String m18685e(String str, String str2, int i10) {
        if (this.f21937a == null || str == null || str2 == null) {
            Logger.m8588w(f21934i, "invalid para!");
            return null;
        }
        if (m18695z()) {
            return this.f21943g.m18663d(str, str2, this.f21938b, i10);
        }
        return null;
    }

    /* renamed from: f */
    public Map m18686f(String str, int i10) {
        if (this.f21937a != null && str != null) {
            return m18695z() ? this.f21943g.m18664f(str, this.f21938b, i10) : new HashMap();
        }
        Logger.m8588w(f21934i, "invalid para!");
        return new HashMap();
    }

    /* renamed from: i */
    public void m18687i() {
        if (m18695z()) {
            String grsParasKey = this.f21937a.getGrsParasKey(true, true, this.f21938b);
            this.f21941e.m18840d(grsParasKey);
            this.f21941e.m18840d(grsParasKey + "time");
            this.f21941e.m18840d(grsParasKey + HttpHeaders.ETAG);
            this.f21939c.m19884e(grsParasKey);
        }
    }

    /* renamed from: j */
    public final void m18688j(GrsBaseInfo grsBaseInfo) {
        try {
            this.f21937a = grsBaseInfo.m33984clone();
        } catch (CloneNotSupportedException e10) {
            Logger.m8589w(f21934i, "GrsClient catch CloneNotSupportedException", e10);
            this.f21937a = grsBaseInfo.copy();
        }
    }

    /* renamed from: l */
    public void m18689l(String str, IQueryUrlsCallBack iQueryUrlsCallBack, int i10) {
        if (iQueryUrlsCallBack == null) {
            Logger.m8588w(f21934i, "IQueryUrlsCallBack is must not null for process continue.");
            return;
        }
        if (this.f21937a == null || str == null) {
            iQueryUrlsCallBack.onCallBackFail(-6);
        } else if (m18695z()) {
            this.f21943g.m18666j(str, iQueryUrlsCallBack, this.f21938b, i10);
        } else {
            Logger.m8580i(f21934i, "grs init task has not completed.");
            iQueryUrlsCallBack.onCallBackFail(-7);
        }
    }

    /* renamed from: m */
    public void m18690m(String str, String str2, IQueryUrlCallBack iQueryUrlCallBack, int i10) {
        if (iQueryUrlCallBack == null) {
            Logger.m8588w(f21934i, "IQueryUrlCallBack is must not null for process continue.");
            return;
        }
        if (this.f21937a == null || str == null || str2 == null) {
            iQueryUrlCallBack.onCallBackFail(-6);
        } else if (m18695z()) {
            this.f21943g.m18667k(str, str2, iQueryUrlCallBack, this.f21938b, i10);
        } else {
            Logger.m8580i(f21934i, "grs init task has not completed.");
            iQueryUrlCallBack.onCallBackFail(-7);
        }
    }

    /* renamed from: n */
    public final void m18691n(Map map) throws NumberFormatException {
        if (map == null || map.isEmpty()) {
            Logger.m8586v(f21934i, "sp's content is empty.");
            return;
        }
        Set<String> setKeySet = map.keySet();
        for (String str : setKeySet) {
            if (str.endsWith(this.f21938b.getPackageName() + "time")) {
                String strM18837a = this.f21941e.m18837a(str, "");
                long j10 = 0;
                if (!TextUtils.isEmpty(strM18837a) && strM18837a.matches("\\d+")) {
                    try {
                        j10 = Long.parseLong(strM18837a);
                    } catch (NumberFormatException e10) {
                        Logger.m8589w(f21934i, "convert expire time from String to Long catch NumberFormatException.", e10);
                    }
                }
                String strSubstring = str.substring(0, str.length() - 4);
                String str2 = strSubstring + HttpHeaders.ETAG;
                if (!m18694s(j10) || !setKeySet.contains(strSubstring) || !setKeySet.contains(str2)) {
                    Logger.m8580i(f21934i, "init interface auto clear some invalid sp's data: " + str);
                    this.f21941e.m18840d(strSubstring);
                    this.f21941e.m18840d(str);
                    this.f21941e.m18840d(str2);
                }
            }
        }
    }

    /* renamed from: o */
    public boolean m18692o(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C9494c.class == obj.getClass() && (obj instanceof C9494c)) {
            return this.f21937a.compare(((C9494c) obj).f21937a);
        }
        return false;
    }

    /* renamed from: r */
    public boolean m18693r() {
        GrsBaseInfo grsBaseInfo;
        Context context;
        if (!m18695z() || (grsBaseInfo = this.f21937a) == null || (context = this.f21938b) == null) {
            return false;
        }
        this.f21940d.m18828c(grsBaseInfo, context);
        return true;
    }

    /* renamed from: s */
    public final boolean m18694s(long j10) {
        return System.currentTimeMillis() - j10 <= 604800000;
    }

    /* renamed from: z */
    public final boolean m18695z() {
        String str;
        String str2;
        FutureTask futureTask = this.f21944h;
        if (futureTask == null) {
            return false;
        }
        try {
            return ((Boolean) futureTask.get(8L, TimeUnit.SECONDS)).booleanValue();
        } catch (InterruptedException e10) {
            e = e10;
            str = f21934i;
            str2 = "init compute task interrupted.";
            Logger.m8589w(str, str2, e);
            return false;
        } catch (CancellationException unused) {
            Logger.m8580i(f21934i, "init compute task canceled.");
            return false;
        } catch (ExecutionException e11) {
            e = e11;
            str = f21934i;
            str2 = "init compute task failed.";
            Logger.m8589w(str, str2, e);
            return false;
        } catch (TimeoutException unused2) {
            Logger.m8588w(f21934i, "init compute task timed out");
            return false;
        } catch (Exception e12) {
            e = e12;
            str = f21934i;
            str2 = "init compute task occur unknown Exception";
            Logger.m8589w(str, str2, e);
            return false;
        }
    }

    public C9494c(GrsBaseInfo grsBaseInfo) {
        this.f21944h = null;
        m18688j(grsBaseInfo);
    }
}
