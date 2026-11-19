package p218k5;

import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import com.alibaba.sdk.android.oss.common.utils.HttpHeaders;
import com.huawei.hms.framework.common.Logger;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.json.JSONArray;
import p189i5.C9607a;
import p189i5.C9609c;
import p203j5.C9681b;
import p234l5.AbstractC10146a;
import p247m5.C10202c;
import p247m5.C10203d;
import p259n5.AbstractC10320d;
import p303q5.C10737a;

/* renamed from: k5.c */
/* loaded from: classes5.dex */
public class C9813c {

    /* renamed from: l */
    public static final String f23018l = "c";

    /* renamed from: a */
    public final GrsBaseInfo f23019a;

    /* renamed from: b */
    public final Context f23020b;

    /* renamed from: c */
    public final C9607a f23021c;

    /* renamed from: d */
    public C9814d f23022d;

    /* renamed from: i */
    public final C10202c f23027i;

    /* renamed from: e */
    public final Map f23023e = new ConcurrentHashMap(16);

    /* renamed from: f */
    public final List f23024f = new CopyOnWriteArrayList();

    /* renamed from: g */
    public final JSONArray f23025g = new JSONArray();

    /* renamed from: h */
    public final List f23026h = new CopyOnWriteArrayList();

    /* renamed from: j */
    public String f23028j = "";

    /* renamed from: k */
    public long f23029k = 1;

    public C9813c(C10202c c10202c, C9607a c9607a) {
        this.f23027i = c10202c;
        this.f23019a = c10202c.m21309c();
        this.f23020b = c10202c.m21307a();
        this.f23021c = c9607a;
        m19838h();
        m19839i();
    }

    /* renamed from: a */
    public String m19831a() {
        return this.f23028j;
    }

    /* renamed from: b */
    public C9814d m19832b(ExecutorService executorService, String str, C9609c c9609c) {
        if (this.f23026h.isEmpty()) {
            return null;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        C9814d c9814dM19833c = m19833c(executorService, this.f23026h, str, c9609c);
        Logger.m8581i(f23018l, "use 2.0 interface return http's code is：{%d}", Integer.valueOf(c9814dM19833c == null ? 0 : c9814dM19833c.m19854f()));
        AbstractC9815e.m19876b(new ArrayList(this.f23024f), SystemClock.elapsedRealtime() - jElapsedRealtime, this.f23025g, this.f23020b);
        this.f23024f.clear();
        return c9814dM19833c;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0094 A[LOOP:0: B:3:0x0004->B:36:0x0094, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x008c A[SYNTHETIC] */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final p218k5.C9814d m19833c(java.util.concurrent.ExecutorService r12, java.util.List r13, java.lang.String r14, p189i5.C9609c r15) {
        /*
            r11 = this;
            r0 = 0
            r1 = 0
            r2 = r0
            r5 = r1
        L4:
            int r0 = r13.size()
            if (r5 >= r0) goto L9a
            java.lang.Object r0 = r13.get(r5)
            r4 = r0
            java.lang.String r4 = (java.lang.String) r4
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            if (r0 != 0) goto L86
            k5.a r3 = new k5.a
            android.content.Context r7 = r11.f23020b
            com.huawei.hms.framework.network.grs.GrsBaseInfo r9 = r11.f23019a
            r6 = r11
            r8 = r14
            r10 = r15
            r3.<init>(r4, r5, r6, r7, r8, r9, r10)
            java.util.concurrent.Callable r14 = r3.m19829g()
            java.util.concurrent.Future r14 = r12.submit(r14)
            java.util.Map r15 = r6.f23023e
            r15.put(r4, r14)
            r15 = 1
            long r3 = r6.f23029k     // Catch: java.lang.InterruptedException -> L61 java.util.concurrent.ExecutionException -> L63 java.util.concurrent.TimeoutException -> L66 java.util.concurrent.CancellationException -> L7e
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.SECONDS     // Catch: java.lang.InterruptedException -> L61 java.util.concurrent.ExecutionException -> L63 java.util.concurrent.TimeoutException -> L66 java.util.concurrent.CancellationException -> L7e
            java.lang.Object r14 = r14.get(r3, r0)     // Catch: java.lang.InterruptedException -> L61 java.util.concurrent.ExecutionException -> L63 java.util.concurrent.TimeoutException -> L66 java.util.concurrent.CancellationException -> L7e
            k5.d r14 = (p218k5.C9814d) r14     // Catch: java.lang.InterruptedException -> L61 java.util.concurrent.ExecutionException -> L63 java.util.concurrent.TimeoutException -> L66 java.util.concurrent.CancellationException -> L7e
            if (r14 == 0) goto L5e
            boolean r0 = r14.m19844D()     // Catch: java.lang.InterruptedException -> L4a java.util.concurrent.ExecutionException -> L4d java.util.concurrent.TimeoutException -> L5a java.util.concurrent.CancellationException -> L5c
            if (r0 != 0) goto L51
            boolean r0 = r14.m19842B()     // Catch: java.lang.InterruptedException -> L4a java.util.concurrent.ExecutionException -> L4d java.util.concurrent.TimeoutException -> L5a java.util.concurrent.CancellationException -> L5c
            if (r0 == 0) goto L5e
            goto L51
        L4a:
            r0 = move-exception
            r2 = r14
            goto L6e
        L4d:
            r0 = move-exception
            r15 = r0
            r2 = r14
            goto L76
        L51:
            java.lang.String r0 = p218k5.C9813c.f23018l     // Catch: java.lang.InterruptedException -> L4a java.util.concurrent.ExecutionException -> L4d java.util.concurrent.TimeoutException -> L5a java.util.concurrent.CancellationException -> L5c
            java.lang.String r2 = "grs request return body is not null and is OK."
            com.huawei.hms.framework.common.Logger.m8580i(r0, r2)     // Catch: java.lang.InterruptedException -> L4a java.util.concurrent.ExecutionException -> L4d java.util.concurrent.TimeoutException -> L5a java.util.concurrent.CancellationException -> L5c
            r2 = r14
            goto L8a
        L5a:
            r2 = r14
            goto L66
        L5c:
            r2 = r14
            goto L7e
        L5e:
            r2 = r14
        L5f:
            r15 = r1
            goto L8a
        L61:
            r0 = move-exception
            goto L6e
        L63:
            r0 = move-exception
            r15 = r0
            goto L76
        L66:
            java.lang.String r14 = p218k5.C9813c.f23018l
            java.lang.String r15 = "the wait timed out"
            com.huawei.hms.framework.common.Logger.m8588w(r14, r15)
            goto L5f
        L6e:
            java.lang.String r14 = p218k5.C9813c.f23018l
            java.lang.String r3 = "the current thread was interrupted while waiting"
            com.huawei.hms.framework.common.Logger.m8589w(r14, r3, r0)
            goto L8a
        L76:
            java.lang.String r14 = p218k5.C9813c.f23018l
            java.lang.String r0 = "the computation threw an ExecutionException"
            com.huawei.hms.framework.common.Logger.m8589w(r14, r0, r15)
            goto L5f
        L7e:
            java.lang.String r14 = p218k5.C9813c.f23018l
            java.lang.String r0 = "{requestServer} the computation was cancelled"
            com.huawei.hms.framework.common.Logger.m8580i(r14, r0)
            goto L8a
        L86:
            r6 = r11
            r8 = r14
            r10 = r15
            goto L5f
        L8a:
            if (r15 == 0) goto L94
            java.lang.String r12 = p218k5.C9813c.f23018l
            java.lang.String r13 = "needBreak is true so need break current circulation"
            com.huawei.hms.framework.common.Logger.m8586v(r12, r13)
            goto L9b
        L94:
            int r5 = r5 + 1
            r14 = r8
            r15 = r10
            goto L4
        L9a:
            r6 = r11
        L9b:
            k5.d r12 = r11.m19837g(r2)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: p218k5.C9813c.m19833c(java.util.concurrent.ExecutorService, java.util.List, java.lang.String, i5.c):k5.d");
    }

    /* renamed from: d */
    public final void m19834d(String str, String str2) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str2);
        sb2.append(str);
        String grsReqParamJoint = this.f23019a.getGrsReqParamJoint(false, false, m19840j(), this.f23020b);
        if (!TextUtils.isEmpty(grsReqParamJoint)) {
            sb2.append("?");
            sb2.append(grsReqParamJoint);
        }
        this.f23026h.add(sb2.toString());
    }

    /* renamed from: e */
    public synchronized void m19835e(C9814d c9814d) {
        try {
            this.f23024f.add(c9814d);
            C9814d c9814d2 = this.f23022d;
            if (c9814d2 == null || (!c9814d2.m19844D() && !this.f23022d.m19842B())) {
                if (c9814d.m19843C()) {
                    Logger.m8580i(f23018l, "GRS server open 503 limiting strategy.");
                    AbstractC10320d.m21531b(this.f23019a.getGrsParasKey(true, true, this.f23020b), new AbstractC10320d.a(c9814d.m19874z(), SystemClock.elapsedRealtime()));
                    return;
                }
                if (c9814d.m19842B()) {
                    Logger.m8580i(f23018l, "GRS server open 304 Not Modified.");
                }
                if (!c9814d.m19844D() && !c9814d.m19842B()) {
                    Logger.m8586v(f23018l, "grsResponseResult has exception so need return");
                    return;
                }
                this.f23022d = c9814d;
                this.f23021c.m18831f(this.f23019a, c9814d, this.f23020b, this.f23027i);
                for (Map.Entry entry : this.f23023e.entrySet()) {
                    if (!((String) entry.getKey()).equals(c9814d.m19841A()) && !((Future) entry.getValue()).isCancelled()) {
                        Logger.m8580i(f23018l, "future cancel");
                        ((Future) entry.getValue()).cancel(true);
                    }
                }
                return;
            }
            Logger.m8586v(f23018l, "grsResponseResult is ok");
        } catch (Throwable th) {
            throw th;
        }
    }

    /* renamed from: g */
    public final C9814d m19837g(C9814d c9814d) {
        String str;
        String str2;
        for (Map.Entry entry : this.f23023e.entrySet()) {
            if (c9814d != null && (c9814d.m19844D() || c9814d.m19842B())) {
                break;
            }
            try {
                c9814d = (C9814d) ((Future) entry.getValue()).get(40000L, TimeUnit.MILLISECONDS);
            } catch (InterruptedException e10) {
                e = e10;
                str = f23018l;
                str2 = "{checkResponse} when check result, find InterruptedException, check others";
                Logger.m8589w(str, str2, e);
            } catch (CancellationException unused) {
                Logger.m8580i(f23018l, "{checkResponse} when check result, find CancellationException, check others");
            } catch (ExecutionException e11) {
                e = e11;
                str = f23018l;
                str2 = "{checkResponse} when check result, find ExecutionException, check others";
                Logger.m8589w(str, str2, e);
            } catch (TimeoutException unused2) {
                Logger.m8588w(f23018l, "{checkResponse} when check result, find TimeoutException, cancel current request task");
                if (!((Future) entry.getValue()).isCancelled()) {
                    ((Future) entry.getValue()).cancel(true);
                }
            }
        }
        return c9814d;
    }

    /* renamed from: h */
    public final void m19838h() {
        C10203d c10203dM21162a = AbstractC10146a.m21162a(this.f23020b);
        if (c10203dM21162a == null) {
            Logger.m8588w(f23018l, "g*s***_se****er_conf*** maybe has a big error");
            return;
        }
        m19836f(c10203dM21162a);
        List<String> listM21314a = c10203dM21162a.m21314a();
        if (listM21314a == null || listM21314a.size() <= 0) {
            Logger.m8586v(f23018l, "maybe grs_base_url config with [],please check.");
            return;
        }
        if (listM21314a.size() > 10) {
            throw new IllegalArgumentException("grs_base_url's count is larger than MAX value 10");
        }
        String strM21318e = c10203dM21162a.m21318e();
        if (listM21314a.size() > 0) {
            for (String str : listM21314a) {
                if (str.startsWith("https://")) {
                    m19834d(strM21318e, str);
                } else {
                    Logger.m8588w(f23018l, "grs server just support https scheme url,please check.");
                }
            }
        }
        Logger.m8587v(f23018l, "request to GRS server url is {%s}", this.f23026h);
    }

    /* renamed from: i */
    public final void m19839i() {
        String grsParasKey = this.f23019a.getGrsParasKey(true, true, this.f23020b);
        this.f23028j = this.f23021c.m18826a().m18837a(grsParasKey + HttpHeaders.ETAG, "");
    }

    /* renamed from: j */
    public final String m19840j() {
        C9681b c9681bM19160a = C9681b.m19160a(this.f23020b.getPackageName());
        C10737a c10737aM19163d = c9681bM19160a != null ? c9681bM19160a.m19163d() : null;
        if (c10737aM19163d == null) {
            return "";
        }
        String strM22798a = c10737aM19163d.m22798a();
        Logger.m8587v(f23018l, "get appName from local assets is{%s}", strM22798a);
        return strM22798a;
    }

    /* renamed from: f */
    public void m19836f(C10203d c10203d) {
    }
}
