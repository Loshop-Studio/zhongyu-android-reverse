package com.blankj.utilcode.util;

import android.content.res.Resources;
import android.util.DisplayMetrics;
import com.tencent.bugly.crashreport.crash.jni.NativeCrashHandler;
import io.reactivex.internal.schedulers.AbstractC5725k;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import p073h4.AbstractC5625a;

/* renamed from: com.blankj.utilcode.util.a */
/* loaded from: classes2.dex */
public final class RunnableC3378a implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f2116a;

    public /* synthetic */ RunnableC3378a(int i) {
        this.f2116a = i;
    }

    @Override // java.lang.Runnable
    public final void run() throws SecurityException {
        DisplayMetrics displayMetrics;
        switch (this.f2116a) {
            case 0:
                Resources system = Resources.getSystem();
                float f = Resources.getSystem().getDisplayMetrics().xdpi;
                system.getDisplayMetrics().xdpi = f;
                AbstractC3382c.m2303d().getResources().getDisplayMetrics().xdpi = f;
                ArrayList arrayList = AbstractC3382c.f2152w;
                int i = 0;
                if (arrayList != null) {
                    int size = arrayList.size();
                    while (i < size) {
                        Object obj = arrayList.get(i);
                        i++;
                        try {
                            DisplayMetrics displayMetrics2 = (DisplayMetrics) ((Field) obj).get(system);
                            if (displayMetrics2 != null) {
                                displayMetrics2.xdpi = f;
                            }
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                    return;
                }
                AbstractC3382c.f2152w = new ArrayList();
                Class<?> superclass = system.getClass();
                Field[] declaredFields = superclass.getDeclaredFields();
                while (declaredFields != null && declaredFields.length > 0) {
                    for (Field field : declaredFields) {
                        if (field.getType().isAssignableFrom(DisplayMetrics.class)) {
                            field.setAccessible(true);
                            try {
                                displayMetrics = (DisplayMetrics) field.get(system);
                            } catch (Exception unused) {
                                displayMetrics = null;
                            }
                            if (displayMetrics != null) {
                                AbstractC3382c.f2152w.add(field);
                                displayMetrics.xdpi = f;
                            }
                        }
                    }
                    superclass = superclass.getSuperclass();
                    if (superclass == null) {
                        return;
                    } else {
                        declaredFields = superclass.getDeclaredFields();
                    }
                }
                return;
            case 1:
                return;
            case 2:
                WeakReference weakReference = C3404x.f2188c;
                if (weakReference != null) {
                    AbstractC3400t abstractC3400t = (AbstractC3400t) weakReference.get();
                    if (abstractC3400t != null) {
                        abstractC3400t.mo2351a();
                    }
                    C3404x.f2188c = null;
                    return;
                }
                return;
            case 3:
                NativeCrashHandler.getInstance().unBlockSigquit(true);
                return;
            case 4:
                NativeCrashHandler.getInstance().unBlockSigquit(false);
                return;
            case 5:
                AbstractC5625a.f8756a = AbstractC5625a.m4950j();
                synchronized (AbstractC5625a.class) {
                    AbstractC5625a.class.notify();
                }
                return;
            case 6:
                ArrayList arrayList2 = new ArrayList(AbstractC5725k.f9055d.keySet());
                int size2 = arrayList2.size();
                int i8 = 0;
                while (i8 < size2) {
                    Object obj2 = arrayList2.get(i8);
                    i8++;
                    ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = (ScheduledThreadPoolExecutor) obj2;
                    if (scheduledThreadPoolExecutor.isShutdown()) {
                        AbstractC5725k.f9055d.remove(scheduledThreadPoolExecutor);
                    } else {
                        scheduledThreadPoolExecutor.purge();
                    }
                }
                return;
            default:
                return;
        }
    }

    public String toString() {
        switch (this.f2116a) {
            case 7:
                return "EmptyRunnable";
            default:
                return super.toString();
        }
    }

    /* renamed from: a */
    private final void m2293a() {
    }
}
