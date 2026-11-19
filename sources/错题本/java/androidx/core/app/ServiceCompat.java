package androidx.core.app;

import android.app.Notification;
import android.app.Service;
import android.os.Build;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.constraintlayout.widget.ConstraintLayout;
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

        public static void stopForeground(Service service, int i) {
            service.stopForeground(i);
        }
    }

    @RequiresApi(ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_HORIZONTAL_BIAS)
    public static class Api29Impl {
        private Api29Impl() {
        }

        public static void startForeground(Service service, int i, Notification notification, int i8) {
            if (i8 == 0 || i8 == -1) {
                service.startForeground(i, notification, i8);
            } else {
                service.startForeground(i, notification, i8 & 255);
            }
        }
    }

    @RequiresApi(34)
    public static class Api34Impl {
        private Api34Impl() {
        }

        public static void startForeground(Service service, int i, Notification notification, int i8) {
            if (i8 == 0 || i8 == -1) {
                service.startForeground(i, notification, i8);
            } else {
                service.startForeground(i, notification, i8 & ServiceCompat.FOREGROUND_SERVICE_TYPE_ALLOWED_SINCE_U);
            }
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public @interface StopForegroundFlags {
    }

    private ServiceCompat() {
    }

    public static void startForeground(Service service, int i, Notification notification, int i8) {
        int i9 = Build.VERSION.SDK_INT;
        if (i9 >= 34) {
            Api34Impl.startForeground(service, i, notification, i8);
        } else if (i9 >= 29) {
            Api29Impl.startForeground(service, i, notification, i8);
        } else {
            service.startForeground(i, notification);
        }
    }

    public static void stopForeground(Service service, int i) {
        Api24Impl.stopForeground(service, i);
    }
}
