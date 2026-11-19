package com.alibaba.sdk.android.crashdefend;

import android.content.Context;
import android.text.TextUtils;
import com.alibaba.sdk.android.crashdefend.p053a.C5586a;
import com.alibaba.sdk.android.crashdefend.p053a.C5587b;
import com.alibaba.sdk.android.crashdefend.p054b.C5588a;
import com.alibaba.sdk.android.crashdefend.p055c.C5589a;
import com.alibaba.sdk.android.crashdefend.p055c.C5590b;
import com.taobao.accs.common.Constants;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;

/* renamed from: com.alibaba.sdk.android.crashdefend.a */
/* loaded from: classes3.dex */
public class C5585a {

    /* renamed from: a */
    private static volatile C5585a f4011a;

    /* renamed from: b */
    private final Context f4012b;

    /* renamed from: d */
    private C5587b f4014d;

    /* renamed from: c */
    private final C5586a f4013c = new C5586a();

    /* renamed from: f */
    private final Map<String, String> f4016f = new HashMap();

    /* renamed from: g */
    private final int[] f4017g = new int[5];

    /* renamed from: h */
    private final List<C5587b> f4018h = new ArrayList();

    /* renamed from: e */
    private final ExecutorService f4015e = new C5588a().m3473a();

    /* renamed from: com.alibaba.sdk.android.crashdefend.a$a */
    public class a implements Runnable {

        /* renamed from: b */
        private C5587b f4021b;

        /* renamed from: c */
        private int f4022c;

        public a(C5587b c5587b, int i10) {
            this.f4021b = c5587b;
            this.f4022c = i10;
        }

        @Override // java.lang.Runnable
        public void run() {
            int i10;
            do {
                try {
                    Thread.sleep(1000L);
                    i10 = this.f4022c - 1;
                    this.f4022c = i10;
                } catch (InterruptedException unused) {
                    return;
                } catch (Exception e10) {
                    e10.getMessage();
                    return;
                }
            } while (i10 > 0);
            if (i10 <= 0) {
                C5585a.this.m3470c(this.f4021b);
                C5589a.m3475a(C5585a.this.f4012b, C5585a.this.f4013c, C5585a.this.f4018h);
            }
        }
    }

    private C5585a(Context context) {
        this.f4012b = context.getApplicationContext();
        for (int i10 = 0; i10 < 5; i10++) {
            this.f4017g[i10] = (i10 * 5) + 5;
        }
        this.f4016f.put("sdkId", "crashdefend");
        this.f4016f.put(Constants.KEY_SDK_VERSION, "0.0.6");
        try {
            m3461a();
            m3467b();
        } catch (Exception e10) {
            e10.getMessage();
        }
    }

    /* renamed from: d */
    private void m3471d(C5587b c5587b) {
        if (c5587b == null) {
            return;
        }
        this.f4015e.execute(new a(c5587b, c5587b.f4027e));
    }

    /* renamed from: a */
    public static C5585a m3460a(Context context) {
        if (f4011a == null) {
            synchronized (C5585a.class) {
                try {
                    if (f4011a == null) {
                        f4011a = new C5585a(context);
                    }
                } finally {
                }
            }
        }
        return f4011a;
    }

    /* renamed from: b */
    private synchronized C5587b m3466b(C5587b c5587b, CrashDefendCallback crashDefendCallback) {
        try {
            C5587b c5587b2 = null;
            if (this.f4018h.size() > 0) {
                Iterator<C5587b> it = this.f4018h.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    C5587b next = it.next();
                    if (next != null && next.f4023a.equals(c5587b.f4023a)) {
                        if (!next.f4024b.equals(c5587b.f4024b)) {
                            next.f4024b = c5587b.f4024b;
                            next.f4025c = c5587b.f4025c;
                            next.f4027e = c5587b.f4027e;
                            next.f4026d = 0;
                            next.f4030h = 0;
                            next.f4031i = 0L;
                        }
                        if (next.f4032j) {
                            C5590b.m3483b("CrashDefend", "SDK " + c5587b.f4023a + " has been registered");
                            return null;
                        }
                        next.f4032j = true;
                        next.f4033k = crashDefendCallback;
                        next.f4028f = this.f4013c.f4019a;
                        c5587b2 = next;
                    }
                }
            }
            if (c5587b2 == null) {
                c5587b2 = (C5587b) c5587b.clone();
                c5587b2.f4032j = true;
                c5587b2.f4033k = crashDefendCallback;
                c5587b2.f4026d = 0;
                c5587b2.f4028f = this.f4013c.f4019a;
                this.f4018h.add(c5587b2);
            }
            return c5587b2;
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public void m3470c(C5587b c5587b) {
        if (c5587b == null) {
            return;
        }
        c5587b.f4026d = 0;
        c5587b.f4030h = 0;
    }

    /* renamed from: a */
    private void m3461a() {
        if (!C5589a.m3478b(this.f4012b, this.f4013c, this.f4018h)) {
            this.f4013c.f4019a = 1L;
        } else {
            this.f4013c.f4019a++;
        }
    }

    /* renamed from: b */
    private void m3467b() {
        String str;
        String str2;
        this.f4014d = null;
        ArrayList arrayList = new ArrayList();
        synchronized (this.f4018h) {
            try {
                for (C5587b c5587b : this.f4018h) {
                    if (c5587b.f4026d >= c5587b.f4025c) {
                        arrayList.add(c5587b);
                    }
                }
                int size = arrayList.size();
                int i10 = 0;
                while (true) {
                    if (i10 >= size) {
                        break;
                    }
                    Object obj = arrayList.get(i10);
                    i10++;
                    C5587b c5587b2 = (C5587b) obj;
                    if (c5587b2.f4030h < 5) {
                        long j10 = this.f4013c.f4019a - this.f4017g[r5];
                        long j11 = (c5587b2.f4029g - j10) + 1;
                        C5590b.m3481a("CrashDefend", "after restart " + j11 + " times, sdk will be restore");
                        c5587b2.f4031i = j11;
                        if (c5587b2.f4029g < j10) {
                            this.f4014d = c5587b2;
                            break;
                        }
                    } else {
                        C5590b.m3483b("CrashDefend", "SDK " + c5587b2.f4023a + " has been closed");
                    }
                }
                C5587b c5587b3 = this.f4014d;
                if (c5587b3 == null) {
                    str = "CrashDefend";
                    str2 = "NO SDK restore";
                } else {
                    c5587b3.f4030h++;
                    str = "CrashDefend";
                    str2 = this.f4014d.f4023a + " will restore --- startSerialNumber:" + this.f4014d.f4029g + "   crashCount:" + this.f4014d.f4026d;
                }
                C5590b.m3483b(str, str2);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: b */
    private void m3468b(C5587b c5587b) {
        if (c5587b == null) {
            return;
        }
        m3471d(c5587b);
        CrashDefendCallback crashDefendCallback = c5587b.f4033k;
        if (crashDefendCallback != null) {
            crashDefendCallback.onSdkStart(c5587b.f4025c, c5587b.f4026d - 1, c5587b.f4030h);
        }
    }

    /* renamed from: a */
    private boolean m3463a(C5587b c5587b) {
        if (c5587b.f4026d >= c5587b.f4025c) {
            C5587b c5587b2 = this.f4014d;
            if (c5587b2 == null || !c5587b2.f4023a.equals(c5587b.f4023a)) {
                return false;
            }
            c5587b.f4026d = c5587b.f4025c - 1;
        }
        c5587b.f4029g = c5587b.f4028f;
        return true;
    }

    /* renamed from: a */
    private boolean m3464a(C5587b c5587b, CrashDefendCallback crashDefendCallback) {
        C5587b c5587bM3466b;
        String str;
        if (c5587b != null && crashDefendCallback != null) {
            try {
                if (TextUtils.isEmpty(c5587b.f4024b) || TextUtils.isEmpty(c5587b.f4023a) || (c5587bM3466b = m3466b(c5587b, crashDefendCallback)) == null) {
                    return false;
                }
                boolean zM3463a = m3463a(c5587bM3466b);
                c5587bM3466b.f4026d++;
                C5589a.m3475a(this.f4012b, this.f4013c, this.f4018h);
                if (zM3463a) {
                    m3468b(c5587bM3466b);
                    str = "START:" + c5587bM3466b.f4023a + " --- limit:" + c5587bM3466b.f4025c + "  count:" + (c5587bM3466b.f4026d - 1) + "  restore:" + c5587bM3466b.f4030h + "  startSerialNumber:" + c5587bM3466b.f4029g + "  registerSerialNumber:" + c5587bM3466b.f4028f;
                } else {
                    int i10 = c5587bM3466b.f4030h;
                    if (i10 >= 5) {
                        crashDefendCallback.onSdkClosed(i10);
                        str = "CLOSED: " + c5587bM3466b.f4023a + " --- restored " + c5587bM3466b.f4030h + ", has more than retry limit, so closed it";
                    } else {
                        crashDefendCallback.onSdkStop(c5587bM3466b.f4025c, c5587bM3466b.f4026d - 1, i10, c5587bM3466b.f4031i);
                        str = "STOP:" + c5587bM3466b.f4023a + " --- limit:" + c5587bM3466b.f4025c + "  count:" + (c5587bM3466b.f4026d - 1) + "  restore:" + c5587bM3466b.f4030h + "  startSerialNumber:" + c5587bM3466b.f4029g + "  registerSerialNumber:" + c5587bM3466b.f4028f;
                    }
                }
                C5590b.m3483b("CrashDefend", str);
                return true;
            } catch (Exception e10) {
                e10.getMessage();
            }
        }
        return false;
    }

    /* renamed from: a */
    public boolean m3472a(String str, String str2, int i10, int i11, CrashDefendCallback crashDefendCallback) {
        C5587b c5587b = new C5587b();
        c5587b.f4023a = str;
        c5587b.f4024b = str2;
        c5587b.f4025c = i10;
        c5587b.f4027e = i11;
        return m3464a(c5587b, crashDefendCallback);
    }
}
