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
public final class C6677ao {

    /* renamed from: a */
    public static boolean f5872a = true;

    /* renamed from: b */
    public static boolean f5873b = true;

    /* renamed from: c */
    private static SimpleDateFormat f5874c = null;

    /* renamed from: d */
    private static int f5875d = 30720;

    /* renamed from: e */
    private static StringBuilder f5876e = null;

    /* renamed from: f */
    private static StringBuilder f5877f = null;

    /* renamed from: g */
    private static boolean f5878g = false;

    /* renamed from: h */
    private static a f5879h = null;

    /* renamed from: i */
    private static String f5880i = null;

    /* renamed from: j */
    private static String f5881j = null;

    /* renamed from: k */
    private static Context f5882k = null;

    /* renamed from: l */
    private static String f5883l = null;

    /* renamed from: m */
    private static boolean f5884m = false;

    /* renamed from: n */
    private static boolean f5885n = false;

    /* renamed from: o */
    private static ExecutorService f5886o;

    /* renamed from: p */
    private static int f5887p;

    /* renamed from: q */
    private static final Object f5888q = new Object();

    static {
        try {
            f5874c = new SimpleDateFormat("MM-dd HH:mm:ss");
        } catch (Throwable th) {
            C6674al.m5105b(th.getCause());
        }
    }

    /* renamed from: a */
    public static synchronized void m5118a(Context context) {
        if (f5884m || context == null || !f5873b) {
            return;
        }
        try {
            f5886o = Executors.newSingleThreadExecutor();
            f5877f = new StringBuilder(0);
            f5876e = new StringBuilder(0);
            f5882k = context;
            f5880i = C6663aa.m4967a(context).f5772d;
            f5881j = "";
            f5883l = f5882k.getFilesDir().getPath() + "/buglylog_" + f5880i + "_" + f5881j + ".txt";
            f5887p = Process.myPid();
        } catch (Throwable unused) {
        }
        f5884m = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public static boolean m5126d(String str, String str2, String str3) {
        InterfaceC6726q interfaceC6726q;
        try {
            C6663aa c6663aaM4969b = C6663aa.m4969b();
            if (c6663aaM4969b == null || (interfaceC6726q = c6663aaM4969b.f5733N) == null) {
                return false;
            }
            return interfaceC6726q.appendLogToNative(str, str2, str3);
        } catch (Throwable th) {
            if (C6674al.m5103a(th)) {
                return false;
            }
            th.printStackTrace();
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e */
    public static synchronized void m5127e(String str, String str2, String str3) {
        if (f5872a) {
            m5128f(str, str2, str3);
        } else {
            m5129g(str, str2, str3);
        }
    }

    /* renamed from: f */
    private static synchronized void m5128f(String str, String str2, String str3) {
        String strM5116a = m5116a(str, str2, str3, Process.myTid());
        synchronized (f5888q) {
            try {
                f5877f.append(strM5116a);
            } finally {
                try {
                } catch (Throwable th) {
                }
            }
            if (f5877f.length() >= f5875d) {
                StringBuilder sb = f5877f;
                f5877f = sb.delete(0, sb.indexOf("\u0001\r\n") + 1);
            }
        }
    }

    /* renamed from: g */
    private static synchronized void m5129g(String str, String str2, String str3) {
        String strM5116a = m5116a(str, str2, str3, Process.myTid());
        synchronized (f5888q) {
            try {
                f5877f.append(strM5116a);
            } catch (Throwable unused) {
            }
            if (f5877f.length() <= f5875d) {
                return;
            }
            if (f5878g) {
                return;
            }
            f5878g = true;
            a aVar = f5879h;
            if (aVar == null) {
                f5879h = new a(f5883l);
            } else {
                File file = aVar.f5896b;
                if (file == null || file.length() + f5877f.length() > f5879h.f5897c) {
                    f5879h.m5130a();
                }
            }
            if (f5879h.m5131a(f5877f.toString())) {
                f5877f.setLength(0);
                f5878g = false;
            }
        }
    }

    /* renamed from: b */
    private static String m5122b() {
        InterfaceC6726q interfaceC6726q;
        try {
            C6663aa c6663aaM4969b = C6663aa.m4969b();
            if (c6663aaM4969b == null || (interfaceC6726q = c6663aaM4969b.f5733N) == null) {
                return null;
            }
            return interfaceC6726q.getLogFromNative();
        } catch (Throwable th) {
            if (C6674al.m5103a(th)) {
                return null;
            }
            th.printStackTrace();
            return null;
        }
    }

    /* renamed from: c */
    private static byte[] m5125c() {
        File file;
        if (!f5873b) {
            return null;
        }
        if (f5885n) {
            C6674al.m5102a("[LogUtil] Get user log from native.", new Object[0]);
            String strM5122b = m5122b();
            if (strM5122b != null) {
                C6674al.m5102a("[LogUtil] Got user log from native: %d bytes", Integer.valueOf(strM5122b.length()));
                return C6678ap.m5155a(strM5122b, "BuglyNativeLog.txt");
            }
        }
        StringBuilder sb = new StringBuilder();
        synchronized (f5888q) {
            try {
                a aVar = f5879h;
                if (aVar != null && aVar.f5895a && (file = aVar.f5896b) != null && file.length() > 0) {
                    sb.append(C6678ap.m5140a(f5879h.f5896b, 30720, true));
                }
                StringBuilder sb2 = f5877f;
                if (sb2 != null && sb2.length() > 0) {
                    sb.append(f5877f.toString());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return C6678ap.m5155a(sb.toString(), "BuglyLog.txt");
    }

    /* renamed from: com.tencent.bugly.proguard.ao$a */
    public static class a {

        /* renamed from: a */
        boolean f5895a;

        /* renamed from: b */
        File f5896b;

        /* renamed from: c */
        long f5897c = 30720;

        /* renamed from: d */
        private String f5898d;

        /* renamed from: e */
        private long f5899e;

        public a(String str) {
            if (str == null || str.equals("")) {
                return;
            }
            this.f5898d = str;
            this.f5895a = m5130a();
        }

        /* renamed from: a */
        public final boolean m5130a() {
            try {
                File file = new File(this.f5898d);
                this.f5896b = file;
                if (file.exists() && !this.f5896b.delete()) {
                    this.f5895a = false;
                    return false;
                }
                if (this.f5896b.createNewFile()) {
                    return true;
                }
                this.f5895a = false;
                return false;
            } catch (Throwable th) {
                C6674al.m5103a(th);
                this.f5895a = false;
                return false;
            }
        }

        /* renamed from: a */
        public final boolean m5131a(String str) throws IOException {
            if (!this.f5895a) {
                return false;
            }
            FileOutputStream fileOutputStream = null;
            try {
                FileOutputStream fileOutputStream2 = new FileOutputStream(this.f5896b, true);
                try {
                    fileOutputStream2.write(str.getBytes("UTF-8"));
                    fileOutputStream2.flush();
                    fileOutputStream2.close();
                    this.f5899e += r10.length;
                    this.f5895a = true;
                    try {
                        fileOutputStream2.close();
                    } catch (IOException unused) {
                    }
                    return true;
                } catch (Throwable th) {
                    th = th;
                    fileOutputStream = fileOutputStream2;
                    try {
                        C6674al.m5103a(th);
                        this.f5895a = false;
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
    public static void m5117a(int i9) {
        synchronized (f5888q) {
            try {
                f5875d = i9;
                if (i9 < 0) {
                    f5875d = 0;
                } else if (i9 > 30720) {
                    f5875d = 30720;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: a */
    public static void m5120a(String str, String str2, Throwable th) {
        if (th == null) {
            return;
        }
        String message = th.getMessage();
        if (message == null) {
            message = "";
        }
        m5119a(str, str2, message + '\n' + C6678ap.m5159b(th));
    }

    /* renamed from: a */
    public static synchronized void m5119a(final String str, final String str2, final String str3) {
        if (f5884m && f5873b) {
            try {
                if (f5885n) {
                    f5886o.execute(new Runnable() { // from class: com.tencent.bugly.proguard.ao.1
                        @Override // java.lang.Runnable
                        public final void run() {
                            C6677ao.m5126d(str, str2, str3);
                        }
                    });
                } else {
                    f5886o.execute(new Runnable() { // from class: com.tencent.bugly.proguard.ao.2
                        @Override // java.lang.Runnable
                        public final void run() {
                            C6677ao.m5127e(str, str2, str3);
                        }
                    });
                }
            } catch (Exception e10) {
                C6674al.m5105b(e10);
            }
        }
    }

    /* renamed from: a */
    private static String m5116a(String str, String str2, String str3, long j9) {
        String string;
        f5876e.setLength(0);
        if (str3.length() > 30720) {
            str3 = str3.substring(str3.length() - 30720, str3.length() - 1);
        }
        Date date = new Date();
        SimpleDateFormat simpleDateFormat = f5874c;
        if (simpleDateFormat != null) {
            string = simpleDateFormat.format(date);
        } else {
            string = date.toString();
        }
        StringBuilder sb = f5876e;
        sb.append(string);
        sb.append(" ");
        sb.append(f5887p);
        sb.append(" ");
        sb.append(j9);
        sb.append(" ");
        sb.append(str);
        sb.append(" ");
        sb.append(str2);
        sb.append(": ");
        sb.append(str3);
        sb.append("\u0001\r\n");
        return f5876e.toString();
    }

    /* renamed from: a */
    public static byte[] m5121a() {
        if (f5872a) {
            if (f5873b) {
                return C6678ap.m5155a(f5877f.toString(), "BuglyLog.txt");
            }
            return null;
        }
        return m5125c();
    }
}
