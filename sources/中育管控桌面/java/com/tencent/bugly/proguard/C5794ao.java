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
/* loaded from: classes3.dex */
public final class C5794ao {

    /* renamed from: a */
    public static boolean f4016a = true;

    /* renamed from: b */
    public static boolean f4017b = true;

    /* renamed from: c */
    private static SimpleDateFormat f4018c = null;

    /* renamed from: d */
    private static int f4019d = 30720;

    /* renamed from: e */
    private static StringBuilder f4020e = null;

    /* renamed from: f */
    private static StringBuilder f4021f = null;

    /* renamed from: g */
    private static boolean f4022g = false;

    /* renamed from: h */
    private static a f4023h = null;

    /* renamed from: i */
    private static String f4024i = null;

    /* renamed from: j */
    private static String f4025j = null;

    /* renamed from: k */
    private static Context f4026k = null;

    /* renamed from: l */
    private static String f4027l = null;

    /* renamed from: m */
    private static boolean f4028m = false;

    /* renamed from: n */
    private static boolean f4029n = false;

    /* renamed from: o */
    private static ExecutorService f4030o;

    /* renamed from: p */
    private static int f4031p;

    /* renamed from: q */
    private static final Object f4032q = new Object();

    static {
        try {
            f4018c = new SimpleDateFormat("MM-dd HH:mm:ss");
        } catch (Throwable th) {
            C5791al.m3931b(th.getCause());
        }
    }

    /* renamed from: a */
    public static synchronized void m3944a(Context context) {
        if (f4028m || context == null || !f4017b) {
            return;
        }
        try {
            f4030o = Executors.newSingleThreadExecutor();
            f4021f = new StringBuilder(0);
            f4020e = new StringBuilder(0);
            f4026k = context;
            f4024i = C5780aa.m3793a(context).f3916d;
            f4025j = "";
            f4027l = f4026k.getFilesDir().getPath() + "/buglylog_" + f4024i + "_" + f4025j + ".txt";
            f4031p = Process.myPid();
        } catch (Throwable unused) {
        }
        f4028m = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public static boolean m3952d(String str, String str2, String str3) {
        InterfaceC5843q interfaceC5843q;
        try {
            C5780aa c5780aaM3795b = C5780aa.m3795b();
            if (c5780aaM3795b == null || (interfaceC5843q = c5780aaM3795b.f3877N) == null) {
                return false;
            }
            return interfaceC5843q.appendLogToNative(str, str2, str3);
        } catch (Throwable th) {
            if (C5791al.m3929a(th)) {
                return false;
            }
            th.printStackTrace();
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e */
    public static synchronized void m3953e(String str, String str2, String str3) {
        if (f4016a) {
            m3954f(str, str2, str3);
        } else {
            m3955g(str, str2, str3);
        }
    }

    /* renamed from: f */
    private static synchronized void m3954f(String str, String str2, String str3) {
        String strM3942a = m3942a(str, str2, str3, Process.myTid());
        synchronized (f4032q) {
            try {
                f4021f.append(strM3942a);
            } finally {
                try {
                } catch (Throwable th) {
                }
            }
            if (f4021f.length() >= f4019d) {
                StringBuilder sb = f4021f;
                f4021f = sb.delete(0, sb.indexOf("\u0001\r\n") + 1);
            }
        }
    }

    /* renamed from: g */
    private static synchronized void m3955g(String str, String str2, String str3) {
        String strM3942a = m3942a(str, str2, str3, Process.myTid());
        synchronized (f4032q) {
            try {
                f4021f.append(strM3942a);
            } catch (Throwable unused) {
            }
            if (f4021f.length() <= f4019d) {
                return;
            }
            if (f4022g) {
                return;
            }
            f4022g = true;
            a aVar = f4023h;
            if (aVar == null) {
                f4023h = new a(f4027l);
            } else {
                File file = aVar.f4040b;
                if (file == null || file.length() + f4021f.length() > f4023h.f4041c) {
                    f4023h.m3956a();
                }
            }
            if (f4023h.m3957a(f4021f.toString())) {
                f4021f.setLength(0);
                f4022g = false;
            }
        }
    }

    /* renamed from: b */
    private static String m3948b() {
        InterfaceC5843q interfaceC5843q;
        try {
            C5780aa c5780aaM3795b = C5780aa.m3795b();
            if (c5780aaM3795b == null || (interfaceC5843q = c5780aaM3795b.f3877N) == null) {
                return null;
            }
            return interfaceC5843q.getLogFromNative();
        } catch (Throwable th) {
            if (C5791al.m3929a(th)) {
                return null;
            }
            th.printStackTrace();
            return null;
        }
    }

    /* renamed from: c */
    private static byte[] m3951c() {
        File file;
        if (!f4017b) {
            return null;
        }
        if (f4029n) {
            C5791al.m3928a("[LogUtil] Get user log from native.", new Object[0]);
            String strM3948b = m3948b();
            if (strM3948b != null) {
                C5791al.m3928a("[LogUtil] Got user log from native: %d bytes", Integer.valueOf(strM3948b.length()));
                return C5795ap.m3981a(strM3948b, "BuglyNativeLog.txt");
            }
        }
        StringBuilder sb = new StringBuilder();
        synchronized (f4032q) {
            try {
                a aVar = f4023h;
                if (aVar != null && aVar.f4039a && (file = aVar.f4040b) != null && file.length() > 0) {
                    sb.append(C5795ap.m3966a(f4023h.f4040b, 30720, true));
                }
                StringBuilder sb2 = f4021f;
                if (sb2 != null && sb2.length() > 0) {
                    sb.append(f4021f.toString());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return C5795ap.m3981a(sb.toString(), "BuglyLog.txt");
    }

    /* renamed from: com.tencent.bugly.proguard.ao$a */
    public static class a {

        /* renamed from: a */
        boolean f4039a;

        /* renamed from: b */
        File f4040b;

        /* renamed from: c */
        long f4041c = 30720;

        /* renamed from: d */
        private String f4042d;

        /* renamed from: e */
        private long f4043e;

        public a(String str) {
            if (str == null || str.equals("")) {
                return;
            }
            this.f4042d = str;
            this.f4039a = m3956a();
        }

        /* renamed from: a */
        public final boolean m3956a() {
            try {
                File file = new File(this.f4042d);
                this.f4040b = file;
                if (file.exists() && !this.f4040b.delete()) {
                    this.f4039a = false;
                    return false;
                }
                if (this.f4040b.createNewFile()) {
                    return true;
                }
                this.f4039a = false;
                return false;
            } catch (Throwable th) {
                C5791al.m3929a(th);
                this.f4039a = false;
                return false;
            }
        }

        /* renamed from: a */
        public final boolean m3957a(String str) throws IOException {
            if (!this.f4039a) {
                return false;
            }
            FileOutputStream fileOutputStream = null;
            try {
                FileOutputStream fileOutputStream2 = new FileOutputStream(this.f4040b, true);
                try {
                    fileOutputStream2.write(str.getBytes("UTF-8"));
                    fileOutputStream2.flush();
                    fileOutputStream2.close();
                    this.f4043e += r10.length;
                    this.f4039a = true;
                    try {
                        fileOutputStream2.close();
                    } catch (IOException unused) {
                    }
                    return true;
                } catch (Throwable th) {
                    th = th;
                    fileOutputStream = fileOutputStream2;
                    try {
                        C5791al.m3929a(th);
                        this.f4039a = false;
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
    public static void m3943a(int i6) {
        synchronized (f4032q) {
            try {
                f4019d = i6;
                if (i6 < 0) {
                    f4019d = 0;
                } else if (i6 > 30720) {
                    f4019d = 30720;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: a */
    public static void m3946a(String str, String str2, Throwable th) {
        if (th == null) {
            return;
        }
        String message = th.getMessage();
        if (message == null) {
            message = "";
        }
        m3945a(str, str2, message + '\n' + C5795ap.m3985b(th));
    }

    /* renamed from: a */
    public static synchronized void m3945a(final String str, final String str2, final String str3) {
        if (f4028m && f4017b) {
            try {
                if (f4029n) {
                    f4030o.execute(new Runnable() { // from class: com.tencent.bugly.proguard.ao.1
                        @Override // java.lang.Runnable
                        public final void run() {
                            C5794ao.m3952d(str, str2, str3);
                        }
                    });
                } else {
                    f4030o.execute(new Runnable() { // from class: com.tencent.bugly.proguard.ao.2
                        @Override // java.lang.Runnable
                        public final void run() {
                            C5794ao.m3953e(str, str2, str3);
                        }
                    });
                }
            } catch (Exception e6) {
                C5791al.m3931b(e6);
            }
        }
    }

    /* renamed from: a */
    private static String m3942a(String str, String str2, String str3, long j6) {
        String string;
        f4020e.setLength(0);
        if (str3.length() > 30720) {
            str3 = str3.substring(str3.length() - 30720, str3.length() - 1);
        }
        Date date = new Date();
        SimpleDateFormat simpleDateFormat = f4018c;
        if (simpleDateFormat != null) {
            string = simpleDateFormat.format(date);
        } else {
            string = date.toString();
        }
        StringBuilder sb = f4020e;
        sb.append(string);
        sb.append(" ");
        sb.append(f4031p);
        sb.append(" ");
        sb.append(j6);
        sb.append(" ");
        sb.append(str);
        sb.append(" ");
        sb.append(str2);
        sb.append(": ");
        sb.append(str3);
        sb.append("\u0001\r\n");
        return f4020e.toString();
    }

    /* renamed from: a */
    public static byte[] m3947a() {
        if (f4016a) {
            if (f4017b) {
                return C5795ap.m3981a(f4021f.toString(), "BuglyLog.txt");
            }
            return null;
        }
        return m3951c();
    }
}
