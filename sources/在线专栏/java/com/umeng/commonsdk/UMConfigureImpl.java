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

/* loaded from: classes.dex */
public class UMConfigureImpl {

    /* renamed from: a */
    private static String f9001a = "delayed_transmission_flag_new";

    /* renamed from: e */
    private static final int f9005e = 1000;

    /* renamed from: f */
    private static ScheduledExecutorService f9006f;

    /* renamed from: g */
    private static Context f9007g;

    /* renamed from: b */
    private static CopyOnWriteArrayList<onMessageSendListener> f9002b = new CopyOnWriteArrayList<>();

    /* renamed from: c */
    private static int f9003c = 0;

    /* renamed from: d */
    private static boolean f9004d = false;

    /* renamed from: h */
    private static int f9008h = 0;

    /* renamed from: i */
    private static Runnable f9009i = new Runnable() { // from class: com.umeng.commonsdk.UMConfigureImpl.1
        @Override // java.lang.Runnable
        public void run() {
            try {
                if (UMConfigureImpl.f9003c == 0 || UMConfigureImpl.f9008h >= 10) {
                    if (!UMConfigureImpl.f9004d) {
                        boolean unused = UMConfigureImpl.f9004d = true;
                        UMConfigureImpl.m7320b(UMConfigureImpl.f9007g);
                    }
                    if (UMConfigureImpl.f9006f != null) {
                        UMConfigureImpl.f9006f.shutdown();
                        ScheduledExecutorService unused2 = UMConfigureImpl.f9006f = null;
                    }
                }
                UMConfigureImpl.m7326f();
            } catch (Exception unused3) {
            }
        }
    };

    /* renamed from: f */
    static /* synthetic */ int m7326f() {
        int i4 = f9008h;
        f9008h = i4 + 1;
        return i4;
    }

    public static void init(Context context) {
        if (context == null) {
            return;
        }
        f9007g = context;
        try {
            if (f9003c < 1 || m7324d(context)) {
                UMEnvelopeBuild.setTransmissionSendFlag(true);
            } else {
                UMEnvelopeBuild.setTransmissionSendFlag(false);
                m7321c(context);
                if (f9006f == null) {
                    ScheduledExecutorService scheduledExecutorServiceNewScheduledThreadPool = Executors.newScheduledThreadPool(1);
                    f9006f = scheduledExecutorServiceNewScheduledThreadPool;
                    scheduledExecutorServiceNewScheduledThreadPool.scheduleAtFixedRate(f9009i, 0L, 100L, TimeUnit.MILLISECONDS);
                }
            }
        } catch (Exception unused) {
        }
    }

    public static synchronized void registerInterruptFlag() {
        try {
            f9003c++;
        } catch (Exception unused) {
        }
    }

    public static synchronized void registerMessageSendListener(onMessageSendListener onmessagesendlistener) {
        CopyOnWriteArrayList<onMessageSendListener> copyOnWriteArrayList;
        try {
            CopyOnWriteArrayList<onMessageSendListener> copyOnWriteArrayList2 = f9002b;
            if (copyOnWriteArrayList2 != null) {
                copyOnWriteArrayList2.add(onmessagesendlistener);
            }
            if (UMEnvelopeBuild.getTransmissionSendFlag() && (copyOnWriteArrayList = f9002b) != null && copyOnWriteArrayList.size() > 0) {
                Iterator<onMessageSendListener> it = f9002b.iterator();
                while (it.hasNext()) {
                    it.next().onMessageSend();
                }
            }
        } catch (Exception unused) {
        }
    }

    public static synchronized void removeInterruptFlag() {
        try {
            f9003c--;
        } catch (Exception unused) {
        }
    }

    public static synchronized void removeMessageSendListener(onMessageSendListener onmessagesendlistener) {
        try {
            CopyOnWriteArrayList<onMessageSendListener> copyOnWriteArrayList = f9002b;
            if (copyOnWriteArrayList != null) {
                copyOnWriteArrayList.remove(onmessagesendlistener);
            }
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public static synchronized void m7320b(Context context) {
        try {
            UMEnvelopeBuild.setTransmissionSendFlag(true);
            CopyOnWriteArrayList<onMessageSendListener> copyOnWriteArrayList = f9002b;
            if (copyOnWriteArrayList != null && copyOnWriteArrayList.size() > 0) {
                Iterator<onMessageSendListener> it = f9002b.iterator();
                while (it.hasNext()) {
                    it.next().onMessageSend();
                }
            }
        } catch (Exception unused) {
        }
    }

    /* renamed from: c */
    private static void m7321c(Context context) {
        try {
            SharedPreferences sharedPreferences = context.getSharedPreferences(f9001a, 0);
            if (sharedPreferences != null) {
                SharedPreferences.Editor editorEdit = sharedPreferences.edit();
                editorEdit.putBoolean(f9001a, true);
                editorEdit.commit();
            }
        } catch (Throwable unused) {
        }
    }

    /* renamed from: d */
    private static boolean m7324d(Context context) {
        try {
            SharedPreferences sharedPreferences = context.getSharedPreferences(f9001a, 0);
            if (sharedPreferences != null) {
                return sharedPreferences.getBoolean(f9001a, false);
            }
            return false;
        } catch (Throwable unused) {
            return false;
        }
    }
}
