package com.p068uc.crashsdk;

import android.os.Bundle;
import android.webkit.ValueCallback;
import com.p068uc.crashsdk.export.ICrashClient;
import com.p068uc.crashsdk.p069a.C1815a;
import com.p068uc.crashsdk.p069a.C1821g;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.uc.crashsdk.d */
/* loaded from: classes.dex */
public final class C1825d {

    /* renamed from: a */
    private static ICrashClient f8045a = null;

    /* renamed from: b */
    private static int f8046b = 3;

    /* renamed from: c */
    private static volatile List<ValueCallback<Bundle>> f8047c;

    /* renamed from: d */
    private static volatile List<ValueCallback<Bundle>> f8048d;

    /* renamed from: e */
    private static volatile List<ValueCallback<Bundle>> f8049e;

    /* renamed from: f */
    private static volatile List<ValueCallback<Bundle>> f8050f;

    /* renamed from: g */
    private static final Object f8051g = new Object();

    /* renamed from: a */
    public static void m6440a(ICrashClient iCrashClient) {
        f8045a = iCrashClient;
    }

    /* renamed from: b */
    public static boolean m6445b(ValueCallback<Bundle> valueCallback) {
        if (f8048d == null) {
            synchronized (f8051g) {
                if (f8048d == null) {
                    f8048d = new ArrayList();
                }
            }
        }
        synchronized (f8048d) {
            if (f8048d.size() >= f8046b) {
                return false;
            }
            f8048d.add(valueCallback);
            return true;
        }
    }

    /* renamed from: c */
    public static boolean m6446c(ValueCallback<Bundle> valueCallback) {
        if (f8049e == null) {
            synchronized (f8051g) {
                if (f8049e == null) {
                    f8049e = new ArrayList();
                }
            }
        }
        synchronized (f8049e) {
            if (f8049e.size() >= f8046b) {
                return false;
            }
            f8049e.add(valueCallback);
            return true;
        }
    }

    /* renamed from: d */
    public static boolean m6447d(ValueCallback<Bundle> valueCallback) {
        if (f8050f == null) {
            synchronized (f8051g) {
                if (f8050f == null) {
                    f8050f = new ArrayList();
                }
            }
        }
        synchronized (f8050f) {
            if (f8050f.size() >= f8046b) {
                return false;
            }
            f8050f.add(valueCallback);
            return true;
        }
    }

    /* renamed from: a */
    public static void m6442a(String str, String str2, String str3) {
        if (C1821g.m6298a(str)) {
            C1815a.m6243a("crashsdk", "onLogGenerated file name is null!", null);
            return;
        }
        boolean zEquals = C1826e.m6547h().equals(str2);
        if (f8045a != null) {
            File file = new File(str);
            try {
                if (zEquals) {
                    f8045a.onLogGenerated(file, str3);
                } else {
                    f8045a.onClientProcessLogGenerated(str2, file, str3);
                }
            } catch (Throwable th) {
                C1821g.m6293a(th);
            }
        }
        List<ValueCallback<Bundle>> list = f8047c;
        if (!zEquals) {
            list = f8048d;
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
                        C1821g.m6293a(th2);
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public static File m6438a(File file) {
        ICrashClient iCrashClient = f8045a;
        if (iCrashClient != null) {
            try {
                return iCrashClient.onBeforeUploadLog(file);
            } catch (Throwable th) {
                C1821g.m6293a(th);
            }
        }
        return file;
    }

    /* renamed from: a */
    public static void m6443a(boolean z3) {
        ICrashClient iCrashClient = f8045a;
        if (iCrashClient != null) {
            try {
                iCrashClient.onCrashRestarting(z3);
            } catch (Throwable th) {
                C1821g.m6293a(th);
            }
        }
        if (f8049e != null) {
            synchronized (f8049e) {
                for (ValueCallback<Bundle> valueCallback : f8049e) {
                    try {
                        Bundle bundle = new Bundle();
                        bundle.putBoolean("isJava", z3);
                        valueCallback.onReceiveValue(bundle);
                    } catch (Throwable th2) {
                        C1821g.m6293a(th2);
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public static void m6441a(String str, int i4, int i5) {
        ICrashClient iCrashClient = f8045a;
        if (iCrashClient != null) {
            iCrashClient.onAddCrashStats(str, i4, i5);
        }
        if (f8050f != null) {
            synchronized (f8050f) {
                for (ValueCallback<Bundle> valueCallback : f8050f) {
                    try {
                        Bundle bundle = new Bundle();
                        bundle.putString("processName", str);
                        bundle.putInt("key", i4);
                        bundle.putInt("count", i5);
                        valueCallback.onReceiveValue(bundle);
                    } catch (Throwable th) {
                        C1821g.m6293a(th);
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public static String m6439a(String str, boolean z3) {
        ICrashClient iCrashClient = f8045a;
        return iCrashClient != null ? iCrashClient.onGetCallbackInfo(str, z3) : "";
    }

    /* renamed from: a */
    public static boolean m6444a(ValueCallback<Bundle> valueCallback) {
        if (f8047c == null) {
            synchronized (f8051g) {
                if (f8047c == null) {
                    f8047c = new ArrayList();
                }
            }
        }
        synchronized (f8047c) {
            if (f8047c.size() >= f8046b) {
                return false;
            }
            f8047c.add(valueCallback);
            return true;
        }
    }
}
