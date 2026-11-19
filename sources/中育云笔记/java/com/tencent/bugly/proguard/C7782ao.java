package com.tencent.bugly.proguard;

import android.content.Context;
import android.os.Process;
import anet.channel.request.Request;
import com.huawei.hms.framework.common.BundleUtil;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* renamed from: com.tencent.bugly.proguard.ao */
/* loaded from: classes5.dex */
public final class C7782ao {

    /* renamed from: a */
    public static boolean f13737a = true;

    /* renamed from: b */
    public static boolean f13738b = true;

    /* renamed from: c */
    private static SimpleDateFormat f13739c = null;

    /* renamed from: d */
    private static int f13740d = 30720;

    /* renamed from: e */
    private static StringBuilder f13741e = null;

    /* renamed from: f */
    private static StringBuilder f13742f = null;

    /* renamed from: g */
    private static boolean f13743g = false;

    /* renamed from: h */
    private static a f13744h = null;

    /* renamed from: i */
    private static String f13745i = null;

    /* renamed from: j */
    private static String f13746j = null;

    /* renamed from: k */
    private static Context f13747k = null;

    /* renamed from: l */
    private static String f13748l = null;

    /* renamed from: m */
    private static boolean f13749m = false;

    /* renamed from: n */
    private static boolean f13750n = false;

    /* renamed from: o */
    private static ExecutorService f13751o;

    /* renamed from: p */
    private static int f13752p;

    /* renamed from: q */
    private static final Object f13753q = new Object();

    /* renamed from: com.tencent.bugly.proguard.ao$b */
    public static class b implements Runnable {

        /* renamed from: c */
        public final /* synthetic */ String f13759c;

        /* renamed from: d */
        public final /* synthetic */ String f13760d;

        /* renamed from: e */
        public final /* synthetic */ String f13761e;

        public b(String str, String str2, String str3) {
            this.f13759c = str;
            this.f13760d = str2;
            this.f13761e = str3;
        }

        @Override // java.lang.Runnable
        public final void run() {
            C7782ao.m10637d(this.f13759c, this.f13760d, this.f13761e);
        }
    }

    /* renamed from: com.tencent.bugly.proguard.ao$c */
    public static class c implements Runnable {

        /* renamed from: c */
        public final /* synthetic */ String f13762c;

        /* renamed from: d */
        public final /* synthetic */ String f13763d;

        /* renamed from: e */
        public final /* synthetic */ String f13764e;

        public c(String str, String str2, String str3) {
            this.f13762c = str;
            this.f13763d = str2;
            this.f13764e = str3;
        }

        @Override // java.lang.Runnable
        public final void run() {
            C7782ao.m10638e(this.f13762c, this.f13763d, this.f13764e);
        }
    }

    static {
        try {
            f13739c = new SimpleDateFormat("MM-dd HH:mm:ss");
        } catch (Throwable th) {
            C7779al.m10616b(th.getCause());
        }
    }

    /* renamed from: a */
    public static synchronized void m10629a(Context context) {
        if (f13749m || context == null || !f13738b) {
            return;
        }
        try {
            f13751o = Executors.newSingleThreadExecutor();
            f13742f = new StringBuilder(0);
            f13741e = new StringBuilder(0);
            f13747k = context;
            f13745i = C7768aa.m10478a(context).f13637d;
            f13746j = "";
            f13748l = f13747k.getFilesDir().getPath() + "/buglylog_" + f13745i + BundleUtil.UNDERLINE_TAG + f13746j + ".txt";
            f13752p = Process.myPid();
        } catch (Throwable unused) {
        }
        f13749m = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public static boolean m10637d(String str, String str2, String str3) {
        InterfaceC7831q interfaceC7831q;
        try {
            C7768aa c7768aaM10480b = C7768aa.m10480b();
            if (c7768aaM10480b == null || (interfaceC7831q = c7768aaM10480b.f13598N) == null) {
                return false;
            }
            return interfaceC7831q.appendLogToNative(str, str2, str3);
        } catch (Throwable th) {
            if (C7779al.m10614a(th)) {
                return false;
            }
            th.printStackTrace();
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e */
    public static synchronized void m10638e(String str, String str2, String str3) {
        if (f13737a) {
            m10639f(str, str2, str3);
        } else {
            m10640g(str, str2, str3);
        }
    }

    /* renamed from: f */
    private static synchronized void m10639f(String str, String str2, String str3) {
        String strM10627a = m10627a(str, str2, str3, Process.myTid());
        synchronized (f13753q) {
            try {
                f13742f.append(strM10627a);
            } finally {
                try {
                } catch (Throwable th) {
                }
            }
            if (f13742f.length() >= f13740d) {
                StringBuilder sb2 = f13742f;
                f13742f = sb2.delete(0, sb2.indexOf("\u0001\r\n") + 1);
            }
        }
    }

    /* renamed from: g */
    private static synchronized void m10640g(String str, String str2, String str3) {
        String strM10627a = m10627a(str, str2, str3, Process.myTid());
        synchronized (f13753q) {
            try {
                f13742f.append(strM10627a);
            } catch (Throwable unused) {
            }
            if (f13742f.length() <= f13740d) {
                return;
            }
            if (f13743g) {
                return;
            }
            f13743g = true;
            a aVar = f13744h;
            if (aVar == null) {
                f13744h = new a(f13748l);
            } else {
                File file = aVar.f13755b;
                if (file == null || file.length() + f13742f.length() > f13744h.f13756c) {
                    f13744h.m10641a();
                }
            }
            if (f13744h.m10642a(f13742f.toString())) {
                f13742f.setLength(0);
                f13743g = false;
            }
        }
    }

    /* renamed from: b */
    private static String m10633b() {
        InterfaceC7831q interfaceC7831q;
        try {
            C7768aa c7768aaM10480b = C7768aa.m10480b();
            if (c7768aaM10480b == null || (interfaceC7831q = c7768aaM10480b.f13598N) == null) {
                return null;
            }
            return interfaceC7831q.getLogFromNative();
        } catch (Throwable th) {
            if (C7779al.m10614a(th)) {
                return null;
            }
            th.printStackTrace();
            return null;
        }
    }

    /* renamed from: c */
    private static byte[] m10636c() {
        File file;
        if (!f13738b) {
            return null;
        }
        if (f13750n) {
            C7779al.m10613a("[LogUtil] Get user log from native.", new Object[0]);
            String strM10633b = m10633b();
            if (strM10633b != null) {
                C7779al.m10613a("[LogUtil] Got user log from native: %d bytes", Integer.valueOf(strM10633b.length()));
                return C7783ap.m10666a(strM10633b, "BuglyNativeLog.txt");
            }
        }
        StringBuilder sb2 = new StringBuilder();
        synchronized (f13753q) {
            try {
                a aVar = f13744h;
                if (aVar != null && aVar.f13754a && (file = aVar.f13755b) != null && file.length() > 0) {
                    sb2.append(C7783ap.m10651a(f13744h.f13755b, 30720, true));
                }
                StringBuilder sb3 = f13742f;
                if (sb3 != null && sb3.length() > 0) {
                    sb2.append(f13742f.toString());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return C7783ap.m10666a(sb2.toString(), "BuglyLog.txt");
    }

    /* renamed from: com.tencent.bugly.proguard.ao$a */
    public static class a {

        /* renamed from: a */
        boolean f13754a;

        /* renamed from: b */
        File f13755b;

        /* renamed from: c */
        long f13756c = 30720;

        /* renamed from: d */
        private String f13757d;

        /* renamed from: e */
        private long f13758e;

        public a(String str) {
            if (str == null || str.equals("")) {
                return;
            }
            this.f13757d = str;
            this.f13754a = m10641a();
        }

        /* renamed from: a */
        public final boolean m10641a() {
            try {
                File file = new File(this.f13757d);
                this.f13755b = file;
                if (file.exists() && !this.f13755b.delete()) {
                    this.f13754a = false;
                    return false;
                }
                if (this.f13755b.createNewFile()) {
                    return true;
                }
                this.f13754a = false;
                return false;
            } catch (Throwable th) {
                C7779al.m10614a(th);
                this.f13754a = false;
                return false;
            }
        }

        /* renamed from: a */
        public final boolean m10642a(String str) throws IOException {
            if (!this.f13754a) {
                return false;
            }
            FileOutputStream fileOutputStream = null;
            try {
                FileOutputStream fileOutputStream2 = new FileOutputStream(this.f13755b, true);
                try {
                    fileOutputStream2.write(str.getBytes(Request.DEFAULT_CHARSET));
                    fileOutputStream2.flush();
                    fileOutputStream2.close();
                    this.f13758e += r10.length;
                    this.f13754a = true;
                    try {
                        fileOutputStream2.close();
                    } catch (IOException unused) {
                    }
                    return true;
                } catch (Throwable th) {
                    th = th;
                    fileOutputStream = fileOutputStream2;
                    try {
                        C7779al.m10614a(th);
                        this.f13754a = false;
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
    public static void m10628a(int i10) {
        synchronized (f13753q) {
            try {
                f13740d = i10;
                if (i10 < 0) {
                    f13740d = 0;
                } else if (i10 > 30720) {
                    f13740d = 30720;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: a */
    public static void m10631a(String str, String str2, Throwable th) {
        if (th == null) {
            return;
        }
        String message = th.getMessage();
        if (message == null) {
            message = "";
        }
        m10630a(str, str2, message + '\n' + C7783ap.m10670b(th));
    }

    /* renamed from: a */
    public static synchronized void m10630a(String str, String str2, String str3) {
        if (f13749m && f13738b) {
            try {
                if (f13750n) {
                    f13751o.execute(new b(str, str2, str3));
                } else {
                    f13751o.execute(new c(str, str2, str3));
                }
            } catch (Exception e10) {
                C7779al.m10616b(e10);
            }
        }
    }

    /* renamed from: a */
    private static String m10627a(String str, String str2, String str3, long j10) {
        String string;
        f13741e.setLength(0);
        if (str3.length() > 30720) {
            str3 = str3.substring(str3.length() - 30720, str3.length() - 1);
        }
        Date date = new Date();
        SimpleDateFormat simpleDateFormat = f13739c;
        if (simpleDateFormat != null) {
            string = simpleDateFormat.format(date);
        } else {
            string = date.toString();
        }
        StringBuilder sb2 = f13741e;
        sb2.append(string);
        sb2.append(" ");
        sb2.append(f13752p);
        sb2.append(" ");
        sb2.append(j10);
        sb2.append(" ");
        sb2.append(str);
        sb2.append(" ");
        sb2.append(str2);
        sb2.append(": ");
        sb2.append(str3);
        sb2.append("\u0001\r\n");
        return f13741e.toString();
    }

    /* renamed from: a */
    public static byte[] m10632a() {
        if (f13737a) {
            if (f13738b) {
                return C7783ap.m10666a(f13742f.toString(), "BuglyLog.txt");
            }
            return null;
        }
        return m10636c();
    }
}
