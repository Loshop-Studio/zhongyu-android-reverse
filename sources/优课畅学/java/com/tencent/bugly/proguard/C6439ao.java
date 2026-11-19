package com.tencent.bugly.proguard;

import android.content.Context;
import android.os.Process;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* renamed from: com.tencent.bugly.proguard.ao */
/* loaded from: classes4.dex */
public final class C6439ao {

    /* renamed from: a */
    public static boolean f4638a = true;

    /* renamed from: b */
    public static boolean f4639b = true;

    /* renamed from: c */
    private static SimpleDateFormat f4640c = null;

    /* renamed from: d */
    private static int f4641d = 30720;

    /* renamed from: e */
    private static StringBuilder f4642e = null;

    /* renamed from: f */
    private static StringBuilder f4643f = null;

    /* renamed from: g */
    private static boolean f4644g = false;

    /* renamed from: h */
    private static a f4645h = null;

    /* renamed from: i */
    private static String f4646i = null;

    /* renamed from: j */
    private static String f4647j = null;

    /* renamed from: k */
    private static Context f4648k = null;

    /* renamed from: l */
    private static String f4649l = null;

    /* renamed from: m */
    private static boolean f4650m = false;

    /* renamed from: n */
    private static boolean f4651n = false;

    /* renamed from: o */
    private static ExecutorService f4652o;

    /* renamed from: p */
    private static int f4653p;

    /* renamed from: q */
    private static final Object f4654q = new Object();

    static {
        try {
            f4640c = new SimpleDateFormat("MM-dd HH:mm:ss");
        } catch (Throwable th) {
            C6436al.m4286b(th.getCause());
        }
    }

    /* renamed from: a */
    public static synchronized void m4299a(Context context) {
        if (f4650m || context == null || !f4639b) {
            return;
        }
        try {
            f4652o = Executors.newSingleThreadExecutor();
            f4643f = new StringBuilder(0);
            f4642e = new StringBuilder(0);
            f4648k = context;
            f4646i = C6425aa.m4148a(context).f4538d;
            f4647j = "";
            f4649l = f4648k.getFilesDir().getPath() + "/buglylog_" + f4646i + "_" + f4647j + ".txt";
            f4653p = Process.myPid();
        } catch (Throwable unused) {
        }
        f4650m = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public static boolean m4307d(String str, String str2, String str3) {
        InterfaceC6488q interfaceC6488q;
        try {
            C6425aa c6425aaM4150b = C6425aa.m4150b();
            if (c6425aaM4150b == null || (interfaceC6488q = c6425aaM4150b.f4499N) == null) {
                return false;
            }
            return interfaceC6488q.appendLogToNative(str, str2, str3);
        } catch (Throwable th) {
            if (C6436al.m4284a(th)) {
                return false;
            }
            th.printStackTrace();
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e */
    public static synchronized void m4308e(String str, String str2, String str3) {
        if (f4638a) {
            m4309f(str, str2, str3);
        } else {
            m4310g(str, str2, str3);
        }
    }

    /* renamed from: f */
    private static synchronized void m4309f(String str, String str2, String str3) {
        String strM4297a = m4297a(str, str2, str3, Process.myTid());
        synchronized (f4654q) {
            try {
                f4643f.append(strM4297a);
            } finally {
                try {
                } catch (Throwable th) {
                }
            }
            if (f4643f.length() >= f4641d) {
                StringBuilder sb = f4643f;
                f4643f = sb.delete(0, sb.indexOf("\u0001\r\n") + 1);
            }
        }
    }

    /* renamed from: g */
    private static synchronized void m4310g(String str, String str2, String str3) {
        String strM4297a = m4297a(str, str2, str3, Process.myTid());
        synchronized (f4654q) {
            try {
                f4643f.append(strM4297a);
            } catch (Throwable unused) {
            }
            if (f4643f.length() <= f4641d) {
                return;
            }
            if (f4644g) {
                return;
            }
            f4644g = true;
            a aVar = f4645h;
            if (aVar == null) {
                f4645h = new a(f4649l);
            } else {
                File file = aVar.f4662b;
                if (file == null || file.length() + f4643f.length() > f4645h.f4663c) {
                    f4645h.m4311a();
                }
            }
            if (f4645h.m4312a(f4643f.toString())) {
                f4643f.setLength(0);
                f4644g = false;
            }
        }
    }

    /* renamed from: b */
    private static String m4303b() {
        InterfaceC6488q interfaceC6488q;
        try {
            C6425aa c6425aaM4150b = C6425aa.m4150b();
            if (c6425aaM4150b == null || (interfaceC6488q = c6425aaM4150b.f4499N) == null) {
                return null;
            }
            return interfaceC6488q.getLogFromNative();
        } catch (Throwable th) {
            if (C6436al.m4284a(th)) {
                return null;
            }
            th.printStackTrace();
            return null;
        }
    }

    /* renamed from: c */
    private static byte[] m4306c() {
        File file;
        if (!f4639b) {
            return null;
        }
        if (f4651n) {
            C6436al.m4283a("[LogUtil] Get user log from native.", new Object[0]);
            String strM4303b = m4303b();
            if (strM4303b != null) {
                C6436al.m4283a("[LogUtil] Got user log from native: %d bytes", Integer.valueOf(strM4303b.length()));
                return C6440ap.m4336a(strM4303b, "BuglyNativeLog.txt");
            }
        }
        StringBuilder sb = new StringBuilder();
        synchronized (f4654q) {
            try {
                a aVar = f4645h;
                if (aVar != null && aVar.f4661a && (file = aVar.f4662b) != null && file.length() > 0) {
                    sb.append(C6440ap.m4321a(f4645h.f4662b, 30720, true));
                }
                StringBuilder sb2 = f4643f;
                if (sb2 != null && sb2.length() > 0) {
                    sb.append(f4643f.toString());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return C6440ap.m4336a(sb.toString(), "BuglyLog.txt");
    }

    /* renamed from: com.tencent.bugly.proguard.ao$a */
    public static class a {

        /* renamed from: a */
        boolean f4661a;

        /* renamed from: b */
        File f4662b;

        /* renamed from: c */
        long f4663c = 30720;

        /* renamed from: d */
        private String f4664d;

        /* renamed from: e */
        private long f4665e;

        public a(String str) {
            if (str == null || str.equals("")) {
                return;
            }
            this.f4664d = str;
            this.f4661a = m4311a();
        }

        /* renamed from: a */
        public final boolean m4311a() {
            try {
                File file = new File(this.f4664d);
                this.f4662b = file;
                if (file.exists() && !this.f4662b.delete()) {
                    this.f4661a = false;
                    return false;
                }
                if (this.f4662b.createNewFile()) {
                    return true;
                }
                this.f4661a = false;
                return false;
            } catch (Throwable th) {
                C6436al.m4284a(th);
                this.f4661a = false;
                return false;
            }
        }

        /* renamed from: a */
        public final boolean m4312a(String str) throws IOException {
            if (!this.f4661a) {
                return false;
            }
            FileOutputStream fileOutputStream = null;
            try {
                FileOutputStream fileOutputStream2 = new FileOutputStream(this.f4662b, true);
                try {
                    fileOutputStream2.write(str.getBytes("UTF-8"));
                    fileOutputStream2.flush();
                    fileOutputStream2.close();
                    this.f4665e += r10.length;
                    this.f4661a = true;
                    try {
                        fileOutputStream2.close();
                    } catch (IOException unused) {
                    }
                    return true;
                } catch (Throwable th) {
                    th = th;
                    fileOutputStream = fileOutputStream2;
                    try {
                        C6436al.m4284a(th);
                        this.f4661a = false;
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
    public static void m4298a(int i10) {
        synchronized (f4654q) {
            try {
                f4641d = i10;
                if (i10 < 0) {
                    f4641d = 0;
                } else if (i10 > 30720) {
                    f4641d = 30720;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: a */
    public static void m4301a(String str, String str2, Throwable th) {
        if (th == null) {
            return;
        }
        String message = th.getMessage();
        if (message == null) {
            message = "";
        }
        m4300a(str, str2, message + '\n' + C6440ap.m4340b(th));
    }

    /* renamed from: a */
    public static synchronized void m4300a(final String str, final String str2, final String str3) {
        if (f4650m && f4639b) {
            try {
                if (f4651n) {
                    f4652o.execute(new Runnable() { // from class: com.tencent.bugly.proguard.ao.1
                        @Override // java.lang.Runnable
                        public final void run() {
                            C6439ao.m4307d(str, str2, str3);
                        }
                    });
                } else {
                    f4652o.execute(new Runnable() { // from class: com.tencent.bugly.proguard.ao.2
                        @Override // java.lang.Runnable
                        public final void run() {
                            C6439ao.m4308e(str, str2, str3);
                        }
                    });
                }
            } catch (Exception e10) {
                C6436al.m4286b(e10);
            }
        }
    }

    /* renamed from: a */
    private static String m4297a(String str, String str2, String str3, long j10) {
        String string;
        f4642e.setLength(0);
        if (str3.length() > 30720) {
            str3 = str3.substring(str3.length() - 30720, str3.length() - 1);
        }
        Date date = new Date();
        SimpleDateFormat simpleDateFormat = f4640c;
        if (simpleDateFormat != null) {
            string = simpleDateFormat.format(date);
        } else {
            string = date.toString();
        }
        StringBuilder sb = f4642e;
        sb.append(string);
        sb.append(" ");
        sb.append(f4653p);
        sb.append(" ");
        sb.append(j10);
        sb.append(" ");
        sb.append(str);
        sb.append(" ");
        sb.append(str2);
        sb.append(": ");
        sb.append(str3);
        sb.append("\u0001\r\n");
        return f4642e.toString();
    }

    /* renamed from: a */
    public static byte[] m4302a() {
        if (f4638a) {
            if (f4639b) {
                return C6440ap.m4336a(f4643f.toString(), "BuglyLog.txt");
            }
            return null;
        }
        return m4306c();
    }
}
