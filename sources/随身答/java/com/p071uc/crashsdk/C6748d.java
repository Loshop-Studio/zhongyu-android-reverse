package com.p071uc.crashsdk;

import android.os.Bundle;
import android.webkit.ValueCallback;
import com.p071uc.crashsdk.export.ICrashClient;
import com.p071uc.crashsdk.p072a.C6738a;
import com.p071uc.crashsdk.p072a.C6744g;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.uc.crashsdk.d */
/* loaded from: classes4.dex */
public final class C6748d {

    /* renamed from: a */
    private static ICrashClient f6451a = null;

    /* renamed from: b */
    private static int f6452b = 3;

    /* renamed from: c */
    private static volatile List<ValueCallback<Bundle>> f6453c;

    /* renamed from: d */
    private static volatile List<ValueCallback<Bundle>> f6454d;

    /* renamed from: e */
    private static volatile List<ValueCallback<Bundle>> f6455e;

    /* renamed from: f */
    private static volatile List<ValueCallback<Bundle>> f6456f;

    /* renamed from: g */
    private static final Object f6457g = new Object();

    /* renamed from: a */
    public static void m5761a(ICrashClient iCrashClient) {
        f6451a = iCrashClient;
    }

    /* renamed from: b */
    public static boolean m5766b(ValueCallback<Bundle> valueCallback) {
        if (f6454d == null) {
            synchronized (f6457g) {
                try {
                    if (f6454d == null) {
                        f6454d = new ArrayList();
                    }
                } finally {
                }
            }
        }
        synchronized (f6454d) {
            try {
                if (f6454d.size() >= f6452b) {
                    return false;
                }
                f6454d.add(valueCallback);
                return true;
            } finally {
            }
        }
    }

    /* renamed from: c */
    public static boolean m5767c(ValueCallback<Bundle> valueCallback) {
        if (f6455e == null) {
            synchronized (f6457g) {
                try {
                    if (f6455e == null) {
                        f6455e = new ArrayList();
                    }
                } finally {
                }
            }
        }
        synchronized (f6455e) {
            try {
                if (f6455e.size() >= f6452b) {
                    return false;
                }
                f6455e.add(valueCallback);
                return true;
            } finally {
            }
        }
    }

    /* renamed from: d */
    public static boolean m5768d(ValueCallback<Bundle> valueCallback) {
        if (f6456f == null) {
            synchronized (f6457g) {
                try {
                    if (f6456f == null) {
                        f6456f = new ArrayList();
                    }
                } finally {
                }
            }
        }
        synchronized (f6456f) {
            try {
                if (f6456f.size() >= f6452b) {
                    return false;
                }
                f6456f.add(valueCallback);
                return true;
            } finally {
            }
        }
    }

    /* renamed from: a */
    public static void m5763a(String str, String str2, String str3) {
        if (C6744g.m5619a(str)) {
            C6738a.m5564a("crashsdk", "onLogGenerated file name is null!", null);
            return;
        }
        boolean zEquals = C6749e.m5868h().equals(str2);
        if (f6451a != null) {
            File file = new File(str);
            try {
                if (zEquals) {
                    f6451a.onLogGenerated(file, str3);
                } else {
                    f6451a.onClientProcessLogGenerated(str2, file, str3);
                }
            } catch (Throwable th) {
                C6744g.m5614a(th);
            }
        }
        List<ValueCallback<Bundle>> list = f6453c;
        if (!zEquals) {
            list = f6454d;
        }
        if (list != null) {
            synchronized (list) {
                try {
                } catch (Throwable th2) {
                    C6744g.m5614a(th2);
                } finally {
                }
                for (ValueCallback<Bundle> valueCallback : list) {
                    Bundle bundle = new Bundle();
                    bundle.putString("filePathName", str);
                    if (!zEquals) {
                        bundle.putString("processName", str2);
                    }
                    bundle.putString("logType", str3);
                    valueCallback.onReceiveValue(bundle);
                }
            }
        }
    }

    /* renamed from: a */
    public static File m5759a(File file) {
        ICrashClient iCrashClient = f6451a;
        if (iCrashClient != null) {
            try {
                return iCrashClient.onBeforeUploadLog(file);
            } catch (Throwable th) {
                C6744g.m5614a(th);
            }
        }
        return file;
    }

    /* renamed from: a */
    public static void m5764a(boolean z9) {
        ICrashClient iCrashClient = f6451a;
        if (iCrashClient != null) {
            try {
                iCrashClient.onCrashRestarting(z9);
            } catch (Throwable th) {
                C6744g.m5614a(th);
            }
        }
        if (f6455e != null) {
            synchronized (f6455e) {
                try {
                } catch (Throwable th2) {
                    C6744g.m5614a(th2);
                } finally {
                }
                for (ValueCallback<Bundle> valueCallback : f6455e) {
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("isJava", z9);
                    valueCallback.onReceiveValue(bundle);
                }
            }
        }
    }

    /* renamed from: a */
    public static void m5762a(String str, int i9, int i10) {
        ICrashClient iCrashClient = f6451a;
        if (iCrashClient != null) {
            iCrashClient.onAddCrashStats(str, i9, i10);
        }
        if (f6456f != null) {
            synchronized (f6456f) {
                try {
                } catch (Throwable th) {
                    C6744g.m5614a(th);
                } finally {
                }
                for (ValueCallback<Bundle> valueCallback : f6456f) {
                    Bundle bundle = new Bundle();
                    bundle.putString("processName", str);
                    bundle.putInt("key", i9);
                    bundle.putInt("count", i10);
                    valueCallback.onReceiveValue(bundle);
                }
            }
        }
    }

    /* renamed from: a */
    public static String m5760a(String str, boolean z9) {
        ICrashClient iCrashClient = f6451a;
        if (iCrashClient != null) {
            return iCrashClient.onGetCallbackInfo(str, z9);
        }
        return "";
    }

    /* renamed from: a */
    public static boolean m5765a(ValueCallback<Bundle> valueCallback) {
        if (f6453c == null) {
            synchronized (f6457g) {
                try {
                    if (f6453c == null) {
                        f6453c = new ArrayList();
                    }
                } finally {
                }
            }
        }
        synchronized (f6453c) {
            try {
                if (f6453c.size() >= f6452b) {
                    return false;
                }
                f6453c.add(valueCallback);
                return true;
            } finally {
            }
        }
    }
}
