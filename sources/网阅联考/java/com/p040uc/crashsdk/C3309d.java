package com.p040uc.crashsdk;

import android.os.Bundle;
import android.webkit.ValueCallback;
import com.p040uc.crashsdk.export.ICrashClient;
import com.p040uc.crashsdk.p041a.C3299a;
import com.p040uc.crashsdk.p041a.C3305g;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.uc.crashsdk.d */
/* loaded from: classes2.dex */
public final class C3309d {

    /* renamed from: a */
    private static ICrashClient f1453a = null;

    /* renamed from: b */
    private static int f1454b = 3;

    /* renamed from: c */
    private static volatile List<ValueCallback<Bundle>> f1455c;

    /* renamed from: d */
    private static volatile List<ValueCallback<Bundle>> f1456d;

    /* renamed from: e */
    private static volatile List<ValueCallback<Bundle>> f1457e;

    /* renamed from: f */
    private static volatile List<ValueCallback<Bundle>> f1458f;

    /* renamed from: g */
    private static final Object f1459g = new Object();

    /* renamed from: a */
    public static void m2517a(ICrashClient iCrashClient) {
        f1453a = iCrashClient;
    }

    /* renamed from: b */
    public static boolean m2522b(ValueCallback<Bundle> valueCallback) {
        if (f1456d == null) {
            synchronized (f1459g) {
                if (f1456d == null) {
                    f1456d = new ArrayList();
                }
            }
        }
        synchronized (f1456d) {
            if (f1456d.size() >= f1454b) {
                return false;
            }
            f1456d.add(valueCallback);
            return true;
        }
    }

    /* renamed from: c */
    public static boolean m2523c(ValueCallback<Bundle> valueCallback) {
        if (f1457e == null) {
            synchronized (f1459g) {
                if (f1457e == null) {
                    f1457e = new ArrayList();
                }
            }
        }
        synchronized (f1457e) {
            if (f1457e.size() >= f1454b) {
                return false;
            }
            f1457e.add(valueCallback);
            return true;
        }
    }

    /* renamed from: d */
    public static boolean m2524d(ValueCallback<Bundle> valueCallback) {
        if (f1458f == null) {
            synchronized (f1459g) {
                if (f1458f == null) {
                    f1458f = new ArrayList();
                }
            }
        }
        synchronized (f1458f) {
            if (f1458f.size() >= f1454b) {
                return false;
            }
            f1458f.add(valueCallback);
            return true;
        }
    }

    /* renamed from: a */
    public static void m2519a(String str, String str2, String str3) {
        if (C3305g.m2375a(str)) {
            C3299a.m2320a("crashsdk", "onLogGenerated file name is null!", null);
            return;
        }
        boolean zEquals = C3310e.m2624h().equals(str2);
        if (f1453a != null) {
            File file = new File(str);
            try {
                if (zEquals) {
                    f1453a.onLogGenerated(file, str3);
                } else {
                    f1453a.onClientProcessLogGenerated(str2, file, str3);
                }
            } catch (Throwable th) {
                C3305g.m2370a(th);
            }
        }
        List<ValueCallback<Bundle>> list = f1455c;
        if (!zEquals) {
            list = f1456d;
        }
        if (list != null) {
            synchronized (list) {
                for (ValueCallback<Bundle> valueCallback : list) {
                    try {
                        Bundle bundle = new Bundle();
                        bundle.putString("filePathName", str);
                        if (!zEquals) {
                            bundle.putString("processName", str2);
                        }
                        bundle.putString("logType", str3);
                        valueCallback.onReceiveValue(bundle);
                    } catch (Throwable th2) {
                        C3305g.m2370a(th2);
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public static File m2515a(File file) {
        ICrashClient iCrashClient = f1453a;
        if (iCrashClient != null) {
            try {
                return iCrashClient.onBeforeUploadLog(file);
            } catch (Throwable th) {
                C3305g.m2370a(th);
            }
        }
        return file;
    }

    /* renamed from: a */
    public static void m2520a(boolean z3) {
        ICrashClient iCrashClient = f1453a;
        if (iCrashClient != null) {
            try {
                iCrashClient.onCrashRestarting(z3);
            } catch (Throwable th) {
                C3305g.m2370a(th);
            }
        }
        if (f1457e != null) {
            synchronized (f1457e) {
                for (ValueCallback<Bundle> valueCallback : f1457e) {
                    try {
                        Bundle bundle = new Bundle();
                        bundle.putBoolean("isJava", z3);
                        valueCallback.onReceiveValue(bundle);
                    } catch (Throwable th2) {
                        C3305g.m2370a(th2);
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public static void m2518a(String str, int i4, int i5) {
        ICrashClient iCrashClient = f1453a;
        if (iCrashClient != null) {
            iCrashClient.onAddCrashStats(str, i4, i5);
        }
        if (f1458f != null) {
            synchronized (f1458f) {
                for (ValueCallback<Bundle> valueCallback : f1458f) {
                    try {
                        Bundle bundle = new Bundle();
                        bundle.putString("processName", str);
                        bundle.putInt("key", i4);
                        bundle.putInt("count", i5);
                        valueCallback.onReceiveValue(bundle);
                    } catch (Throwable th) {
                        C3305g.m2370a(th);
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public static String m2516a(String str, boolean z3) {
        ICrashClient iCrashClient = f1453a;
        return iCrashClient != null ? iCrashClient.onGetCallbackInfo(str, z3) : "";
    }

    /* renamed from: a */
    public static boolean m2521a(ValueCallback<Bundle> valueCallback) {
        if (f1455c == null) {
            synchronized (f1459g) {
                if (f1455c == null) {
                    f1455c = new ArrayList();
                }
            }
        }
        synchronized (f1455c) {
            if (f1455c.size() >= f1454b) {
                return false;
            }
            f1455c.add(valueCallback);
            return true;
        }
    }
}
