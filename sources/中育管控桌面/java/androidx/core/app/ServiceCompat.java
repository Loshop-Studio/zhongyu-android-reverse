package androidx.core.app;

import android.app.Notification;
import android.app.Service;
import android.os.Build;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* loaded from: classes2.dex */
public final class ServiceCompat {
    private static final int FOREGROUND_SERVICE_TYPE_ALLOWED_SINCE_Q = 255;
    private static final int FOREGROUND_SERVICE_TYPE_ALLOWED_SINCE_U = 1073745919;
    public static final int START_STICKY = 1;
    public static final int STOP_FOREGROUND_DETACH = 2;
    public static final int STOP_FOREGROUND_REMOVE = 1;

    @RequiresApi(24)
    public static class Api24Impl {
        private Api24Impl() {
        }

        public static void stopForeground(Service service, int i6) {
            service.stopForeground(i6);
        }
    }

    @RequiresApi(29)
    public static class Api29Impl {
        private Api29Impl() {
        }

        public static void startForeground(Service service, int i6, Notification notification, int i7) {
            if (i7 == 0 || i7 == -1) {
                service.startForeground(i6, notification, i7);
            } else {
                service.startForeground(i6, notification, i7 & 255);
            }
        }
    }

    @RequiresApi(34)
    public static class Api34Impl {
        private Api34Impl() {
        }

        public static void startForeground(Service service, int i6, Notification notification, int i7) {
            if (i7 == 0 || i7 == -1) {
                service.startForeground(i6, notification, i7);
            } else {
                service.startForeground(i6, notification, i7 & ServiceCompat.FOREGROUND_SERVICE_TYPE_ALLOWED_SINCE_U);
            }
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public @interface StopForegroundFlags {
    }

    private ServiceCompat() {
    }

    public static void startForeground(Service service, int i6, Notification notification, int i7) {
        int i8 = Build.VERSION.SDK_INT;
        if (i8 >= 34) {
            Api34Impl.startForeground(service, i6, notification, i7);
        } else if (i8 >= 29) {
            Api29Impl.startForeground(service, i6, notification, i7);
        } else {
            service.startForeground(i6, notification);
        }
    }

    public static void stopForeground(Service service, int i6) {
        Api24Impl.stopForeground(service, i6);
    }
}
