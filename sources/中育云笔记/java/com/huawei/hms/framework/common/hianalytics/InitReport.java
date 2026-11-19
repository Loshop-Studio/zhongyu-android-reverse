package com.huawei.hms.framework.common.hianalytics;

import com.huawei.hms.framework.common.Logger;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.RejectedExecutionException;

/* loaded from: classes5.dex */
public class InitReport {

    /* renamed from: a */
    public static volatile boolean f11670a = false;

    /* renamed from: b */
    public static List f11671b = new CopyOnWriteArrayList();

    /* renamed from: a */
    public static void m8619a() {
        try {
            Iterator it = f11671b.iterator();
            while (it.hasNext()) {
                HianalyticsHelper.getInstance().getReportExecutor().submit((Runnable) it.next());
            }
            f11671b.clear();
        } catch (NullPointerException unused) {
            Logger.m8573e("HaReport", "event is null occured");
        } catch (RejectedExecutionException unused2) {
            Logger.m8573e("HaReport", "submit failed of rejected execution exception");
        } catch (Exception unused3) {
            Logger.m8573e("HaReport", "submit failed because of some exception");
        }
    }

    public static void disableConnectNet() {
        f11670a = false;
    }

    public static void enableConnectNet() {
        if (f11670a) {
            Logger.m8586v("HaReport", "has connect, not need to deal delay task");
            return;
        }
        Logger.m8586v("HaReport", "deal delay task");
        f11670a = true;
        try {
            HianalyticsHelper.getInstance().getReportExecutor().submit(new Runnable() { // from class: com.huawei.hms.framework.common.hianalytics.InitReport.1
                @Override // java.lang.Runnable
                public void run() {
                    InitReport.m8619a();
                }
            });
        } catch (RejectedExecutionException unused) {
            Logger.m8573e("HaReport", "the thread submit has rejectedExecutionException!");
        } catch (Throwable unused2) {
            Logger.m8573e("HaReport", "the thread submit has fatal error!");
        }
    }

    public static void executeDelay(Runnable runnable) {
        if (!f11670a) {
            f11671b.add(runnable);
            return;
        }
        try {
            HianalyticsHelper.getInstance().getReportExecutor().execute(runnable);
        } catch (RejectedExecutionException unused) {
            Logger.m8573e("HaReport", "the thread submit has rejectedExecutionException!");
        } catch (Throwable unused2) {
            Logger.m8573e("HaReport", "the thread submit has fatal error!");
        }
    }

    public static boolean isHasConnectNet() {
        return f11670a;
    }

    public static void reportWhenInit(Runnable runnable) {
        if (!f11670a) {
            if (f11671b.size() > 10) {
                Logger.m8573e("TAG", "the event to be report when init exceed the limit!");
                return;
            } else {
                f11671b.add(runnable);
                return;
            }
        }
        try {
            HianalyticsHelper.getInstance().getReportExecutor().execute(runnable);
        } catch (RejectedExecutionException unused) {
            Logger.m8573e("HaReport", "the thread submit has rejectedExecutionException!");
        } catch (Throwable unused2) {
            Logger.m8573e("HaReport", "the thread submit has fatal error!");
        }
    }
}
