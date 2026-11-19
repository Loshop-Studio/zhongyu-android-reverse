package p147rx.android.schedulers;

import android.os.Handler;
import android.os.Looper;
import p147rx.Scheduler;
import p147rx.android.plugins.RxAndroidPlugins;

/* loaded from: classes.dex */
public final class AndroidSchedulers {

    private static class MainThreadSchedulerHolder {
        static final Scheduler MAIN_THREAD_SCHEDULER = new HandlerScheduler(new Handler(Looper.getMainLooper()));

        private MainThreadSchedulerHolder() {
        }
    }

    private AndroidSchedulers() {
        throw new AssertionError("No instances");
    }

    public static Scheduler mainThread() {
        Scheduler mainThreadScheduler = RxAndroidPlugins.getInstance().getSchedulersHook().getMainThreadScheduler();
        return mainThreadScheduler != null ? mainThreadScheduler : MainThreadSchedulerHolder.MAIN_THREAD_SCHEDULER;
    }
}
