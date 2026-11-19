package com.tencent.bugly.proguard;

import android.content.Context;
import android.os.Process;
import androidx.compose.material3.AbstractC1923c;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* renamed from: com.tencent.bugly.proguard.ao */
/* loaded from: classes3.dex */
public final class C4058ao {

    /* renamed from: a */
    public static boolean f3524a = true;

    /* renamed from: b */
    public static boolean f3525b = true;

    /* renamed from: c */
    private static SimpleDateFormat f3526c = null;

    /* renamed from: d */
    private static int f3527d = 30720;

    /* renamed from: e */
    private static StringBuilder f3528e = null;

    /* renamed from: f */
    private static StringBuilder f3529f = null;

    /* renamed from: g */
    private static boolean f3530g = false;

    /* renamed from: h */
    private static a f3531h = null;

    /* renamed from: i */
    private static String f3532i = null;

    /* renamed from: j */
    private static String f3533j = null;

    /* renamed from: k */
    private static Context f3534k = null;

    /* renamed from: l */
    private static String f3535l = null;

    /* renamed from: m */
    private static boolean f3536m = false;

    /* renamed from: n */
    private static boolean f3537n = false;

    /* renamed from: o */
    private static ExecutorService f3538o;

    /* renamed from: p */
    private static int f3539p;

    /* renamed from: q */
    private static final Object f3540q = new Object();

    static {
        try {
            f3526c = new SimpleDateFormat("MM-dd HH:mm:ss");
        } catch (Throwable th) {
            C4055al.m3024b(th.getCause());
        }
    }

    /* renamed from: a */
    public static synchronized void m3037a(Context context) {
        if (f3536m || context == null || !f3525b) {
            return;
        }
        try {
            f3538o = Executors.newSingleThreadExecutor();
            f3529f = new StringBuilder(0);
            f3528e = new StringBuilder(0);
            f3534k = context;
            f3532i = C4044aa.m2888a(context).f3434d;
            f3533j = "";
            f3535l = f3534k.getFilesDir().getPath() + "/buglylog_" + f3532i + "_" + f3533j + ".txt";
            f3539p = Process.myPid();
        } catch (Throwable unused) {
        }
        f3536m = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public static boolean m3045d(String str, String str2, String str3) {
        InterfaceC4131q interfaceC4131q;
        try {
            C4044aa c4044aaM2890b = C4044aa.m2890b();
            if (c4044aaM2890b == null || (interfaceC4131q = c4044aaM2890b.f3395N) == null) {
                return false;
            }
            return interfaceC4131q.appendLogToNative(str, str2, str3);
        } catch (Throwable th) {
            if (C4055al.m3022a(th)) {
                return false;
            }
            th.printStackTrace();
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e */
    public static synchronized void m3046e(String str, String str2, String str3) {
        if (f3524a) {
            m3047f(str, str2, str3);
        } else {
            m3048g(str, str2, str3);
        }
    }

    /* renamed from: f */
    private static synchronized void m3047f(String str, String str2, String str3) {
        String strM3035a = m3035a(str, str2, str3, Process.myTid());
        synchronized (f3540q) {
            try {
                f3529f.append(strM3035a);
            } finally {
                try {
                } catch (Throwable th) {
                }
            }
            if (f3529f.length() >= f3527d) {
                StringBuilder sb = f3529f;
                f3529f = sb.delete(0, sb.indexOf("\u0001\r\n") + 1);
            }
        }
    }

    /* renamed from: g */
    private static synchronized void m3048g(String str, String str2, String str3) {
        String strM3035a = m3035a(str, str2, str3, Process.myTid());
        synchronized (f3540q) {
            try {
                f3529f.append(strM3035a);
            } catch (Throwable unused) {
            }
            if (f3529f.length() <= f3527d) {
                return;
            }
            if (f3530g) {
                return;
            }
            f3530g = true;
            a aVar = f3531h;
            if (aVar == null) {
                f3531h = new a(f3535l);
            } else {
                File file = aVar.f3542b;
                if (file == null || file.length() + f3529f.length() > f3531h.f3543c) {
                    f3531h.m3049a();
                }
            }
            if (f3531h.m3050a(f3529f.toString())) {
                f3529f.setLength(0);
                f3530g = false;
            }
        }
    }

    /* renamed from: b */
    private static String m3041b() {
        InterfaceC4131q interfaceC4131q;
        try {
            C4044aa c4044aaM2890b = C4044aa.m2890b();
            if (c4044aaM2890b == null || (interfaceC4131q = c4044aaM2890b.f3395N) == null) {
                return null;
            }
            return interfaceC4131q.getLogFromNative();
        } catch (Throwable th) {
            if (C4055al.m3022a(th)) {
                return null;
            }
            th.printStackTrace();
            return null;
        }
    }

    /* renamed from: c */
    private static byte[] m3044c() {
        File file;
        if (!f3525b) {
            return null;
        }
        if (f3537n) {
            C4055al.m3021a("[LogUtil] Get user log from native.", new Object[0]);
            String strM3041b = m3041b();
            if (strM3041b != null) {
                C4055al.m3021a("[LogUtil] Got user log from native: %d bytes", Integer.valueOf(strM3041b.length()));
                return C4059ap.m3074a(strM3041b, "BuglyNativeLog.txt");
            }
        }
        StringBuilder sb = new StringBuilder();
        synchronized (f3540q) {
            try {
                a aVar = f3531h;
                if (aVar != null && aVar.f3541a && (file = aVar.f3542b) != null && file.length() > 0) {
                    sb.append(C4059ap.m3059a(f3531h.f3542b, 30720, true));
                }
                StringBuilder sb2 = f3529f;
                if (sb2 != null && sb2.length() > 0) {
                    sb.append(f3529f.toString());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return C4059ap.m3074a(sb.toString(), "BuglyLog.txt");
    }

    /* renamed from: com.tencent.bugly.proguard.ao$a */
    public static class a {

        /* renamed from: a */
        boolean f3541a;

        /* renamed from: b */
        File f3542b;

        /* renamed from: c */
        long f3543c = 30720;

        /* renamed from: d */
        private String f3544d;

        /* renamed from: e */
        private long f3545e;

        public a(String str) {
            if (str == null || str.equals("")) {
                return;
            }
            this.f3544d = str;
            this.f3541a = m3049a();
        }

        /* renamed from: a */
        public final boolean m3049a() {
            try {
                File file = new File(this.f3544d);
                this.f3542b = file;
                if (file.exists() && !this.f3542b.delete()) {
                    this.f3541a = false;
                    return false;
                }
                if (this.f3542b.createNewFile()) {
                    return true;
                }
                this.f3541a = false;
                return false;
            } catch (Throwable th) {
                C4055al.m3022a(th);
                this.f3541a = false;
                return false;
            }
        }

        /* renamed from: a */
        public final boolean m3050a(String str) throws IOException {
            if (!this.f3541a) {
                return false;
            }
            FileOutputStream fileOutputStream = null;
            try {
                FileOutputStream fileOutputStream2 = new FileOutputStream(this.f3542b, true);
                try {
                    fileOutputStream2.write(str.getBytes("UTF-8"));
                    fileOutputStream2.flush();
                    fileOutputStream2.close();
                    this.f3545e += r10.length;
                    this.f3541a = true;
                    try {
                        fileOutputStream2.close();
                    } catch (IOException unused) {
                    }
                    return true;
                } catch (Throwable th) {
                    th = th;
                    fileOutputStream = fileOutputStream2;
                    try {
                        C4055al.m3022a(th);
                        this.f3541a = false;
                        if (fileOutputStream != null) {
                            try {
                                fileOutputStream.close();
                            } catch (IOException unused2) {
                            }
                        }
                        return false;
                    } catch (Throwable th2) {
                        if (fileOutputStream != null) {
                            try {
                                fileOutputStream.close();
                            } catch (IOException unused3) {
                            }
                        }
                        throw th2;
                    }
                }
            } catch (Throwable th3) {
                th = th3;
            }
        }
    }

    /* renamed from: a */
    public static void m3036a(int i) {
        synchronized (f3540q) {
            try {
                f3527d = i;
                if (i < 0) {
                    f3527d = 0;
                } else if (i > 30720) {
                    f3527d = 30720;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: a */
    public static void m3039a(String str, String str2, Throwable th) {
        if (th == null) {
            return;
        }
        String message = th.getMessage();
        if (message == null) {
            message = "";
        }
        m3038a(str, str2, message + '\n' + C4059ap.m3078b(th));
    }

    /* renamed from: a */
    public static synchronized void m3038a(String str, String str2, String str3) {
        if (f3536m && f3525b) {
            try {
                if (f3537n) {
                    f3538o.execute(new RunnableC4128o0(str, str2, str3, 0));
                } else {
                    f3538o.execute(new RunnableC4128o0(str, str2, str3, 1));
                }
            } catch (Exception e) {
                C4055al.m3024b(e);
            }
        }
    }

    /* renamed from: a */
    private static String m3035a(String str, String str2, String str3, long j7) {
        String string;
        f3528e.setLength(0);
        if (str3.length() > 30720) {
            str3 = str3.substring(str3.length() - 30720, str3.length() - 1);
        }
        Date date = new Date();
        SimpleDateFormat simpleDateFormat = f3526c;
        if (simpleDateFormat != null) {
            string = simpleDateFormat.format(date);
        } else {
            string = date.toString();
        }
        StringBuilder sb = f3528e;
        sb.append(string);
        sb.append(" ");
        sb.append(f3539p);
        sb.append(" ");
        sb.append(j7);
        AbstractC1923c.m1060x(sb, " ", str, " ", str2);
        sb.append(": ");
        sb.append(str3);
        sb.append("\u0001\r\n");
        return f3528e.toString();
    }

    /* renamed from: a */
    public static byte[] m3040a() {
        if (f3524a) {
            if (f3525b) {
                return C4059ap.m3074a(f3529f.toString(), "BuglyLog.txt");
            }
            return null;
        }
        return m3044c();
    }
}
