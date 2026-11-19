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
public final class C6417ao {

    /* renamed from: a */
    public static boolean f5295a = true;

    /* renamed from: b */
    public static boolean f5296b = true;

    /* renamed from: c */
    private static SimpleDateFormat f5297c = null;

    /* renamed from: d */
    private static int f5298d = 30720;

    /* renamed from: e */
    private static StringBuilder f5299e = null;

    /* renamed from: f */
    private static StringBuilder f5300f = null;

    /* renamed from: g */
    private static boolean f5301g = false;

    /* renamed from: h */
    private static a f5302h = null;

    /* renamed from: i */
    private static String f5303i = null;

    /* renamed from: j */
    private static String f5304j = null;

    /* renamed from: k */
    private static Context f5305k = null;

    /* renamed from: l */
    private static String f5306l = null;

    /* renamed from: m */
    private static boolean f5307m = false;

    /* renamed from: n */
    private static boolean f5308n = false;

    /* renamed from: o */
    private static ExecutorService f5309o;

    /* renamed from: p */
    private static int f5310p;

    /* renamed from: q */
    private static final Object f5311q = new Object();

    static {
        try {
            f5297c = new SimpleDateFormat("MM-dd HH:mm:ss");
        } catch (Throwable th) {
            C6414al.m4926b(th.getCause());
        }
    }

    /* renamed from: a */
    public static synchronized void m4939a(Context context) {
        if (f5307m || context == null || !f5296b) {
            return;
        }
        try {
            f5309o = Executors.newSingleThreadExecutor();
            f5300f = new StringBuilder(0);
            f5299e = new StringBuilder(0);
            f5305k = context;
            f5303i = C6403aa.m4788a(context).f5195d;
            f5304j = "";
            f5306l = f5305k.getFilesDir().getPath() + "/buglylog_" + f5303i + "_" + f5304j + ".txt";
            f5310p = Process.myPid();
        } catch (Throwable unused) {
        }
        f5307m = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public static boolean m4947d(String str, String str2, String str3) {
        InterfaceC6466q interfaceC6466q;
        try {
            C6403aa c6403aaM4790b = C6403aa.m4790b();
            if (c6403aaM4790b == null || (interfaceC6466q = c6403aaM4790b.f5156N) == null) {
                return false;
            }
            return interfaceC6466q.appendLogToNative(str, str2, str3);
        } catch (Throwable th) {
            if (C6414al.m4924a(th)) {
                return false;
            }
            th.printStackTrace();
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e */
    public static synchronized void m4948e(String str, String str2, String str3) {
        if (f5295a) {
            m4949f(str, str2, str3);
        } else {
            m4950g(str, str2, str3);
        }
    }

    /* renamed from: f */
    private static synchronized void m4949f(String str, String str2, String str3) {
        String strM4937a = m4937a(str, str2, str3, Process.myTid());
        synchronized (f5311q) {
            try {
                f5300f.append(strM4937a);
            } finally {
                try {
                } catch (Throwable th) {
                }
            }
            if (f5300f.length() >= f5298d) {
                StringBuilder sb = f5300f;
                f5300f = sb.delete(0, sb.indexOf("\u0001\r\n") + 1);
            }
        }
    }

    /* renamed from: g */
    private static synchronized void m4950g(String str, String str2, String str3) {
        String strM4937a = m4937a(str, str2, str3, Process.myTid());
        synchronized (f5311q) {
            try {
                f5300f.append(strM4937a);
            } catch (Throwable unused) {
            }
            if (f5300f.length() <= f5298d) {
                return;
            }
            if (f5301g) {
                return;
            }
            f5301g = true;
            a aVar = f5302h;
            if (aVar == null) {
                f5302h = new a(f5306l);
            } else {
                File file = aVar.f5319b;
                if (file == null || file.length() + f5300f.length() > f5302h.f5320c) {
                    f5302h.m4951a();
                }
            }
            if (f5302h.m4952a(f5300f.toString())) {
                f5300f.setLength(0);
                f5301g = false;
            }
        }
    }

    /* renamed from: b */
    private static String m4943b() {
        InterfaceC6466q interfaceC6466q;
        try {
            C6403aa c6403aaM4790b = C6403aa.m4790b();
            if (c6403aaM4790b == null || (interfaceC6466q = c6403aaM4790b.f5156N) == null) {
                return null;
            }
            return interfaceC6466q.getLogFromNative();
        } catch (Throwable th) {
            if (C6414al.m4924a(th)) {
                return null;
            }
            th.printStackTrace();
            return null;
        }
    }

    /* renamed from: c */
    private static byte[] m4946c() {
        File file;
        if (!f5296b) {
            return null;
        }
        if (f5308n) {
            C6414al.m4923a("[LogUtil] Get user log from native.", new Object[0]);
            String strM4943b = m4943b();
            if (strM4943b != null) {
                C6414al.m4923a("[LogUtil] Got user log from native: %d bytes", Integer.valueOf(strM4943b.length()));
                return C6418ap.m4976a(strM4943b, "BuglyNativeLog.txt");
            }
        }
        StringBuilder sb = new StringBuilder();
        synchronized (f5311q) {
            try {
                a aVar = f5302h;
                if (aVar != null && aVar.f5318a && (file = aVar.f5319b) != null && file.length() > 0) {
                    sb.append(C6418ap.m4961a(f5302h.f5319b, 30720, true));
                }
                StringBuilder sb2 = f5300f;
                if (sb2 != null && sb2.length() > 0) {
                    sb.append(f5300f.toString());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return C6418ap.m4976a(sb.toString(), "BuglyLog.txt");
    }

    /* renamed from: com.tencent.bugly.proguard.ao$a */
    public static class a {

        /* renamed from: a */
        boolean f5318a;

        /* renamed from: b */
        File f5319b;

        /* renamed from: c */
        long f5320c = 30720;

        /* renamed from: d */
        private String f5321d;

        /* renamed from: e */
        private long f5322e;

        public a(String str) {
            if (str == null || str.equals("")) {
                return;
            }
            this.f5321d = str;
            this.f5318a = m4951a();
        }

        /* renamed from: a */
        public final boolean m4951a() {
            try {
                File file = new File(this.f5321d);
                this.f5319b = file;
                if (file.exists() && !this.f5319b.delete()) {
                    this.f5318a = false;
                    return false;
                }
                if (this.f5319b.createNewFile()) {
                    return true;
                }
                this.f5318a = false;
                return false;
            } catch (Throwable th) {
                C6414al.m4924a(th);
                this.f5318a = false;
                return false;
            }
        }

        /* renamed from: a */
        public final boolean m4952a(String str) throws IOException {
            if (!this.f5318a) {
                return false;
            }
            FileOutputStream fileOutputStream = null;
            try {
                FileOutputStream fileOutputStream2 = new FileOutputStream(this.f5319b, true);
                try {
                    fileOutputStream2.write(str.getBytes("UTF-8"));
                    fileOutputStream2.flush();
                    fileOutputStream2.close();
                    this.f5322e += r10.length;
                    this.f5318a = true;
                    try {
                        fileOutputStream2.close();
                    } catch (IOException unused) {
                    }
                    return true;
                } catch (Throwable th) {
                    th = th;
                    fileOutputStream = fileOutputStream2;
                    try {
                        C6414al.m4924a(th);
                        this.f5318a = false;
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
    public static void m4938a(int i10) {
        synchronized (f5311q) {
            try {
                f5298d = i10;
                if (i10 < 0) {
                    f5298d = 0;
                } else if (i10 > 30720) {
                    f5298d = 30720;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: a */
    public static void m4941a(String str, String str2, Throwable th) {
        if (th == null) {
            return;
        }
        String message = th.getMessage();
        if (message == null) {
            message = "";
        }
        m4940a(str, str2, message + '\n' + C6418ap.m4980b(th));
    }

    /* renamed from: a */
    public static synchronized void m4940a(final String str, final String str2, final String str3) {
        if (f5307m && f5296b) {
            try {
                if (f5308n) {
                    f5309o.execute(new Runnable() { // from class: com.tencent.bugly.proguard.ao.1
                        @Override // java.lang.Runnable
                        public final void run() {
                            C6417ao.m4947d(str, str2, str3);
                        }
                    });
                } else {
                    f5309o.execute(new Runnable() { // from class: com.tencent.bugly.proguard.ao.2
                        @Override // java.lang.Runnable
                        public final void run() {
                            C6417ao.m4948e(str, str2, str3);
                        }
                    });
                }
            } catch (Exception e10) {
                C6414al.m4926b(e10);
            }
        }
    }

    /* renamed from: a */
    private static String m4937a(String str, String str2, String str3, long j10) {
        String string;
        f5299e.setLength(0);
        if (str3.length() > 30720) {
            str3 = str3.substring(str3.length() - 30720, str3.length() - 1);
        }
        Date date = new Date();
        SimpleDateFormat simpleDateFormat = f5297c;
        if (simpleDateFormat != null) {
            string = simpleDateFormat.format(date);
        } else {
            string = date.toString();
        }
        StringBuilder sb = f5299e;
        sb.append(string);
        sb.append(" ");
        sb.append(f5310p);
        sb.append(" ");
        sb.append(j10);
        sb.append(" ");
        sb.append(str);
        sb.append(" ");
        sb.append(str2);
        sb.append(": ");
        sb.append(str3);
        sb.append("\u0001\r\n");
        return f5299e.toString();
    }

    /* renamed from: a */
    public static byte[] m4942a() {
        if (f5295a) {
            if (f5296b) {
                return C6418ap.m4976a(f5300f.toString(), "BuglyLog.txt");
            }
            return null;
        }
        return m4946c();
    }
}
