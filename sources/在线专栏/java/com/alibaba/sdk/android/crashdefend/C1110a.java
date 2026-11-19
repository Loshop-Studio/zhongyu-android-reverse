package com.alibaba.sdk.android.crashdefend;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.alibaba.sdk.android.crashdefend.p023a.C1111a;
import com.alibaba.sdk.android.crashdefend.p023a.C1112b;
import com.alibaba.sdk.android.crashdefend.p024b.C1113a;
import com.alibaba.sdk.android.crashdefend.p025c.C1114a;
import com.alibaba.sdk.android.crashdefend.p025c.C1115b;
import com.taobao.accs.common.Constants;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;

/* renamed from: com.alibaba.sdk.android.crashdefend.a */
/* loaded from: classes.dex */
public class C1110a {

    /* renamed from: a */
    private static volatile C1110a f6526a;

    /* renamed from: b */
    private final Context f6527b;

    /* renamed from: d */
    private C1112b f6529d;

    /* renamed from: c */
    private final C1111a f6528c = new C1111a();

    /* renamed from: f */
    private final Map<String, String> f6531f = new HashMap();

    /* renamed from: g */
    private final int[] f6532g = new int[5];

    /* renamed from: h */
    private final List<C1112b> f6533h = new ArrayList();

    /* renamed from: e */
    private final ExecutorService f6530e = new C1113a().m5072a();

    /* renamed from: com.alibaba.sdk.android.crashdefend.a$a */
    private class a implements Runnable {

        /* renamed from: b */
        private C1112b f6536b;

        /* renamed from: c */
        private int f6537c;

        a(C1112b c1112b, int i4) {
            this.f6536b = c1112b;
            this.f6537c = i4;
        }

        @Override // java.lang.Runnable
        public void run() {
            int i4;
            do {
                try {
                    Thread.sleep(1000L);
                    i4 = this.f6537c - 1;
                    this.f6537c = i4;
                } catch (InterruptedException unused) {
                    return;
                } catch (Exception e4) {
                    Log.d("CrashDefend", e4.getMessage(), e4);
                }
            } while (i4 > 0);
            if (i4 <= 0) {
                C1110a.this.m5069c(this.f6536b);
                C1114a.m5074a(C1110a.this.f6527b, C1110a.this.f6528c, C1110a.this.f6533h);
                return;
            }
            return;
        }
    }

    private C1110a(Context context) {
        this.f6527b = context.getApplicationContext();
        for (int i4 = 0; i4 < 5; i4++) {
            this.f6532g[i4] = (i4 * 5) + 5;
        }
        this.f6531f.put("sdkId", "crashdefend");
        this.f6531f.put(Constants.KEY_SDK_VERSION, "0.0.6");
        try {
            m5060a();
            m5066b();
        } catch (Exception e4) {
            Log.d("CrashDefend", e4.getMessage(), e4);
        }
    }

    /* renamed from: a */
    public static C1110a m5059a(Context context) {
        if (f6526a == null) {
            synchronized (C1110a.class) {
                if (f6526a == null) {
                    f6526a = new C1110a(context);
                }
            }
        }
        return f6526a;
    }

    /* renamed from: a */
    private void m5060a() {
        if (!C1114a.m5077b(this.f6527b, this.f6528c, this.f6533h)) {
            this.f6528c.f6534a = 1L;
        } else {
            this.f6528c.f6534a++;
        }
    }

    /* renamed from: a */
    private boolean m5062a(C1112b c1112b) {
        if (c1112b.f6541d >= c1112b.f6540c) {
            C1112b c1112b2 = this.f6529d;
            if (c1112b2 == null || !c1112b2.f6538a.equals(c1112b.f6538a)) {
                return false;
            }
            c1112b.f6541d = c1112b.f6540c - 1;
        }
        c1112b.f6544g = c1112b.f6543f;
        return true;
    }

    /* renamed from: a */
    private boolean m5063a(C1112b c1112b, CrashDefendCallback crashDefendCallback) {
        C1112b c1112bM5065b;
        String str;
        if (c1112b != null && crashDefendCallback != null) {
            try {
                if (TextUtils.isEmpty(c1112b.f6539b) || TextUtils.isEmpty(c1112b.f6538a) || (c1112bM5065b = m5065b(c1112b, crashDefendCallback)) == null) {
                    return false;
                }
                boolean zM5062a = m5062a(c1112bM5065b);
                c1112bM5065b.f6541d++;
                C1114a.m5074a(this.f6527b, this.f6528c, this.f6533h);
                if (zM5062a) {
                    m5067b(c1112bM5065b);
                    str = "START:" + c1112bM5065b.f6538a + " --- limit:" + c1112bM5065b.f6540c + "  count:" + (c1112bM5065b.f6541d - 1) + "  restore:" + c1112bM5065b.f6545h + "  startSerialNumber:" + c1112bM5065b.f6544g + "  registerSerialNumber:" + c1112bM5065b.f6543f;
                } else {
                    int i4 = c1112bM5065b.f6545h;
                    if (i4 >= 5) {
                        crashDefendCallback.onSdkClosed(i4);
                        str = "CLOSED: " + c1112bM5065b.f6538a + " --- restored " + c1112bM5065b.f6545h + ", has more than retry limit, so closed it";
                    } else {
                        crashDefendCallback.onSdkStop(c1112bM5065b.f6540c, c1112bM5065b.f6541d - 1, i4, c1112bM5065b.f6546i);
                        str = "STOP:" + c1112bM5065b.f6538a + " --- limit:" + c1112bM5065b.f6540c + "  count:" + (c1112bM5065b.f6541d - 1) + "  restore:" + c1112bM5065b.f6545h + "  startSerialNumber:" + c1112bM5065b.f6544g + "  registerSerialNumber:" + c1112bM5065b.f6543f;
                    }
                }
                C1115b.m5082b("CrashDefend", str);
                return true;
            } catch (Exception e4) {
                Log.d("CrashDefend", e4.getMessage(), e4);
            }
        }
        return false;
    }

    /* renamed from: b */
    private synchronized C1112b m5065b(C1112b c1112b, CrashDefendCallback crashDefendCallback) {
        C1112b c1112b2 = null;
        if (this.f6533h.size() > 0) {
            Iterator<C1112b> it = this.f6533h.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                C1112b next = it.next();
                if (next != null && next.f6538a.equals(c1112b.f6538a)) {
                    if (!next.f6539b.equals(c1112b.f6539b)) {
                        next.f6539b = c1112b.f6539b;
                        next.f6540c = c1112b.f6540c;
                        next.f6542e = c1112b.f6542e;
                        next.f6541d = 0;
                        next.f6545h = 0;
                        next.f6546i = 0L;
                    }
                    if (next.f6547j) {
                        C1115b.m5082b("CrashDefend", "SDK " + c1112b.f6538a + " has been registered");
                        return null;
                    }
                    next.f6547j = true;
                    next.f6548k = crashDefendCallback;
                    next.f6543f = this.f6528c.f6534a;
                    c1112b2 = next;
                }
            }
        }
        if (c1112b2 == null) {
            c1112b2 = (C1112b) c1112b.clone();
            c1112b2.f6547j = true;
            c1112b2.f6548k = crashDefendCallback;
            c1112b2.f6541d = 0;
            c1112b2.f6543f = this.f6528c.f6534a;
            this.f6533h.add(c1112b2);
        }
        return c1112b2;
    }

    /* renamed from: b */
    private void m5066b() {
        String str;
        String str2;
        this.f6529d = null;
        ArrayList arrayList = new ArrayList();
        synchronized (this.f6533h) {
            for (C1112b c1112b : this.f6533h) {
                if (c1112b.f6541d >= c1112b.f6540c) {
                    arrayList.add(c1112b);
                }
            }
            Iterator it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                C1112b c1112b2 = (C1112b) it.next();
                if (c1112b2.f6545h < 5) {
                    long j4 = this.f6528c.f6534a - this.f6532g[r3];
                    long j5 = (c1112b2.f6544g - j4) + 1;
                    C1115b.m5080a("CrashDefend", "after restart " + j5 + " times, sdk will be restore");
                    c1112b2.f6546i = j5;
                    if (c1112b2.f6544g < j4) {
                        this.f6529d = c1112b2;
                        break;
                    }
                } else {
                    C1115b.m5082b("CrashDefend", "SDK " + c1112b2.f6538a + " has been closed");
                }
            }
            C1112b c1112b3 = this.f6529d;
            if (c1112b3 == null) {
                str = "CrashDefend";
                str2 = "NO SDK restore";
            } else {
                c1112b3.f6545h++;
                str = "CrashDefend";
                str2 = this.f6529d.f6538a + " will restore --- startSerialNumber:" + this.f6529d.f6544g + "   crashCount:" + this.f6529d.f6541d;
            }
            C1115b.m5082b(str, str2);
        }
    }

    /* renamed from: b */
    private void m5067b(C1112b c1112b) {
        if (c1112b == null) {
            return;
        }
        m5070d(c1112b);
        CrashDefendCallback crashDefendCallback = c1112b.f6548k;
        if (crashDefendCallback != null) {
            crashDefendCallback.onSdkStart(c1112b.f6540c, c1112b.f6541d - 1, c1112b.f6545h);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public void m5069c(C1112b c1112b) {
        if (c1112b == null) {
            return;
        }
        c1112b.f6541d = 0;
        c1112b.f6545h = 0;
    }

    /* renamed from: d */
    private void m5070d(C1112b c1112b) {
        if (c1112b == null) {
            return;
        }
        this.f6530e.execute(new a(c1112b, c1112b.f6542e));
    }

    /* renamed from: a */
    public boolean m5071a(String str, String str2, int i4, int i5, CrashDefendCallback crashDefendCallback) {
        C1112b c1112b = new C1112b();
        c1112b.f6538a = str;
        c1112b.f6539b = str2;
        c1112b.f6540c = i4;
        c1112b.f6542e = i5;
        return m5063a(c1112b, crashDefendCallback);
    }
}
