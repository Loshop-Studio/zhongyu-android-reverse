package androidx.work.impl.foreground;

import android.app.ForegroundServiceStartNotAllowedException;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.Service;
import android.content.Intent;
import android.os.Build;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RequiresPermission;
import androidx.annotation.RestrictTo;
import androidx.lifecycle.LifecycleService;
import androidx.work.Logger;
import androidx.work.impl.foreground.SystemForegroundDispatcher;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes3.dex */
public class SystemForegroundService extends LifecycleService implements SystemForegroundDispatcher.Callback {
    private static final String TAG = Logger.tagWithPrefix("SystemFgService");

    @Nullable
    private static SystemForegroundService sForegroundService = null;
    SystemForegroundDispatcher mDispatcher;
    private boolean mIsShutdown;
    NotificationManager mNotificationManager;

    @RequiresApi(29)
    public static class Api29Impl {
        private Api29Impl() {
        }

        public static void startForeground(Service service, int i10, Notification notification, int i11) {
            service.startForeground(i10, notification, i11);
        }
    }

    @RequiresApi(31)
    public static class Api31Impl {
        private Api31Impl() {
        }

        public static void startForeground(Service service, int i10, Notification notification, int i11) {
            try {
                service.startForeground(i10, notification, i11);
            } catch (ForegroundServiceStartNotAllowedException e10) {
                Logger.get().warning(SystemForegroundService.TAG, "Unable to start foreground service", e10);
            } catch (SecurityException e11) {
                Logger.get().warning(SystemForegroundService.TAG, "Unable to start foreground service", e11);
            }
        }
    }

    @Nullable
    public static SystemForegroundService getInstance() {
        return sForegroundService;
    }

    @MainThread
    private void initializeDispatcher() {
        this.mNotificationManager = (NotificationManager) getApplicationContext().getSystemService("notification");
        SystemForegroundDispatcher systemForegroundDispatcher = new SystemForegroundDispatcher(getApplicationContext());
        this.mDispatcher = systemForegroundDispatcher;
        systemForegroundDispatcher.setCallback(this);
    }

    @Override // androidx.work.impl.foreground.SystemForegroundDispatcher.Callback
    @MainThread
    public void cancelNotification(int i10) {
        this.mNotificationManager.cancel(i10);
    }

    @Override // androidx.work.impl.foreground.SystemForegroundDispatcher.Callback
    @RequiresPermission("android.permission.POST_NOTIFICATIONS")
    @MainThread
    public void notify(int i10, @NonNull Notification notification) {
        this.mNotificationManager.notify(i10, notification);
    }

    @Override // androidx.lifecycle.LifecycleService, android.app.Service
    public void onCreate() {
        super.onCreate();
        sForegroundService = this;
        initializeDispatcher();
    }

    @Override // androidx.lifecycle.LifecycleService, android.app.Service
    public void onDestroy() {
        super.onDestroy();
        this.mDispatcher.onDestroy();
    }

    @Override // androidx.lifecycle.LifecycleService, android.app.Service
    public int onStartCommand(@Nullable Intent intent, int i10, int i11) {
        super.onStartCommand(intent, i10, i11);
        if (this.mIsShutdown) {
            Logger.get().info(TAG, "Re-initializing SystemForegroundService after a request to shut-down.");
            this.mDispatcher.onDestroy();
            initializeDispatcher();
            this.mIsShutdown = false;
        }
        if (intent == null) {
            return 3;
        }
        this.mDispatcher.onStartCommand(intent);
        return 3;
    }

    @Override // android.app.Service
    public void onTimeout(int i10) {
        if (Build.VERSION.SDK_INT >= 35) {
            return;
        }
        this.mDispatcher.onTimeout(i10, 2048);
    }

    @Override // androidx.work.impl.foreground.SystemForegroundDispatcher.Callback
    @MainThread
    public void startForeground(int i10, int i11, @NonNull Notification notification) {
        int i12 = Build.VERSION.SDK_INT;
        if (i12 >= 31) {
            Api31Impl.startForeground(this, i10, notification, i11);
        } else if (i12 >= 29) {
            Api29Impl.startForeground(this, i10, notification, i11);
        } else {
            startForeground(i10, notification);
        }
    }

    @Override // androidx.work.impl.foreground.SystemForegroundDispatcher.Callback
    @MainThread
    public void stop() {
        this.mIsShutdown = true;
        Logger.get().debug(TAG, "Shutting down.");
        if (Build.VERSION.SDK_INT >= 26) {
            stopForeground(true);
        }
        sForegroundService = null;
        stopSelf();
    }

    public void onTimeout(int i10, int i11) {
        this.mDispatcher.onTimeout(i10, i11);
    }
}
