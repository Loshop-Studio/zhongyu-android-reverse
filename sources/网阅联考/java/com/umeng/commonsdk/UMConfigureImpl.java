package com.umeng.commonsdk;

import android.content.Context;
import android.content.SharedPreferences;
import com.umeng.commonsdk.framework.UMEnvelopeBuild;
import com.umeng.commonsdk.utils.onMessageSendListener;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public class UMConfigureImpl {

    /* renamed from: a */
    private static String f2409a = "delayed_transmission_flag_new";

    /* renamed from: e */
    private static final int f2413e = 1000;

    /* renamed from: f */
    private static ScheduledExecutorService f2414f;

    /* renamed from: g */
    private static Context f2415g;

    /* renamed from: b */
    private static CopyOnWriteArrayList<onMessageSendListener> f2410b = new CopyOnWriteArrayList<>();

    /* renamed from: c */
    private static int f2411c = 0;

    /* renamed from: d */
    private static boolean f2412d = false;

    /* renamed from: h */
    private static int f2416h = 0;

    /* renamed from: i */
    private static Runnable f2417i = new Runnable() { // from class: com.umeng.commonsdk.UMConfigureImpl.1
        @Override // java.lang.Runnable
        public void run() {
            try {
                if (UMConfigureImpl.f2411c == 0 || UMConfigureImpl.f2416h >= 10) {
                    if (!UMConfigureImpl.f2412d) {
                        boolean unused = UMConfigureImpl.f2412d = true;
                        UMConfigureImpl.m3397b(UMConfigureImpl.f2415g);
                    }
                    if (UMConfigureImpl.f2414f != null) {
                        UMConfigureImpl.f2414f.shutdown();
                        ScheduledExecutorService unused2 = UMConfigureImpl.f2414f = null;
                    }
                }
                UMConfigureImpl.m3403f();
            } catch (Exception unused3) {
            }
        }
    };

    /* renamed from: f */
    public static /* synthetic */ int m3403f() {
        int i4 = f2416h;
        f2416h = i4 + 1;
        return i4;
    }

    public static void init(Context context) {
        if (context == null) {
            return;
        }
        f2415g = context;
        try {
            if (f2411c < 1 || m3401d(context)) {
                UMEnvelopeBuild.setTransmissionSendFlag(true);
            } else {
                UMEnvelopeBuild.setTransmissionSendFlag(false);
                m3398c(context);
                if (f2414f == null) {
                    ScheduledExecutorService scheduledExecutorServiceNewScheduledThreadPool = Executors.newScheduledThreadPool(1);
                    f2414f = scheduledExecutorServiceNewScheduledThreadPool;
                    scheduledExecutorServiceNewScheduledThreadPool.scheduleAtFixedRate(f2417i, 0L, 100L, TimeUnit.MILLISECONDS);
                }
            }
        } catch (Exception unused) {
        }
    }

    public static synchronized void registerInterruptFlag() {
        try {
            f2411c++;
        } catch (Exception unused) {
        }
    }

    public static synchronized void registerMessageSendListener(onMessageSendListener onmessagesendlistener) {
        CopyOnWriteArrayList<onMessageSendListener> copyOnWriteArrayList;
        try {
            CopyOnWriteArrayList<onMessageSendListener> copyOnWriteArrayList2 = f2410b;
            if (copyOnWriteArrayList2 != null) {
                copyOnWriteArrayList2.add(onmessagesendlistener);
            }
            if (UMEnvelopeBuild.getTransmissionSendFlag() && (copyOnWriteArrayList = f2410b) != null && copyOnWriteArrayList.size() > 0) {
                Iterator<onMessageSendListener> it = f2410b.iterator();
                while (it.hasNext()) {
                    it.next().onMessageSend();
                }
            }
        } catch (Exception unused) {
        }
    }

    public static synchronized void removeInterruptFlag() {
        try {
            f2411c--;
        } catch (Exception unused) {
        }
    }

    public static synchronized void removeMessageSendListener(onMessageSendListener onmessagesendlistener) {
        try {
            CopyOnWriteArrayList<onMessageSendListener> copyOnWriteArrayList = f2410b;
            if (copyOnWriteArrayList != null) {
                copyOnWriteArrayList.remove(onmessagesendlistener);
            }
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public static synchronized void m3397b(Context context) {
        try {
            UMEnvelopeBuild.setTransmissionSendFlag(true);
            CopyOnWriteArrayList<onMessageSendListener> copyOnWriteArrayList = f2410b;
            if (copyOnWriteArrayList != null && copyOnWriteArrayList.size() > 0) {
                Iterator<onMessageSendListener> it = f2410b.iterator();
                while (it.hasNext()) {
                    it.next().onMessageSend();
                }
            }
        } catch (Exception unused) {
        }
    }

    /* renamed from: c */
    private static void m3398c(Context context) {
        try {
            SharedPreferences sharedPreferences = context.getSharedPreferences(f2409a, 0);
            if (sharedPreferences != null) {
                SharedPreferences.Editor editorEdit = sharedPreferences.edit();
                editorEdit.putBoolean(f2409a, true);
                editorEdit.commit();
            }
        } catch (Throwable unused) {
        }
    }

    /* renamed from: d */
    private static boolean m3401d(Context context) {
        try {
            SharedPreferences sharedPreferences = context.getSharedPreferences(f2409a, 0);
            if (sharedPreferences != null) {
                return sharedPreferences.getBoolean(f2409a, false);
            }
            return false;
        } catch (Throwable unused) {
            return false;
        }
    }
}
