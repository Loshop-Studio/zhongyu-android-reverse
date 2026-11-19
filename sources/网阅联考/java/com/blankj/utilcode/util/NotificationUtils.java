package com.blankj.utilcode.util;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.Build;
import androidx.annotation.RequiresPermission;
import androidx.core.app.AbstractC1789b0;
import androidx.core.app.NotificationCompat;
import androidx.core.app.NotificationManagerCompat;
import com.blankj.utilcode.util.Utils;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes2.dex */
public class NotificationUtils {
    public static final int IMPORTANCE_DEFAULT = 3;
    public static final int IMPORTANCE_HIGH = 4;
    public static final int IMPORTANCE_LOW = 2;
    public static final int IMPORTANCE_MIN = 1;
    public static final int IMPORTANCE_NONE = 0;
    public static final int IMPORTANCE_UNSPECIFIED = -1000;

    public static class ChannelConfig {
        public static final ChannelConfig DEFAULT_CHANNEL_CONFIG = new ChannelConfig(Utils.getApp().getPackageName(), Utils.getApp().getPackageName(), 3);
        private NotificationChannel mNotificationChannel;

        public ChannelConfig(String str, CharSequence charSequence, int i4) {
            if (Build.VERSION.SDK_INT >= 26) {
                this.mNotificationChannel = AbstractC1789b0.m942a(str, charSequence, i4);
            }
        }

        public NotificationChannel getNotificationChannel() {
            return this.mNotificationChannel;
        }

        public ChannelConfig setBypassDnd(boolean z3) {
            if (Build.VERSION.SDK_INT >= 26) {
                this.mNotificationChannel.setBypassDnd(z3);
            }
            return this;
        }

        public ChannelConfig setDescription(String str) {
            if (Build.VERSION.SDK_INT >= 26) {
                this.mNotificationChannel.setDescription(str);
            }
            return this;
        }

        public ChannelConfig setGroup(String str) {
            if (Build.VERSION.SDK_INT >= 26) {
                this.mNotificationChannel.setGroup(str);
            }
            return this;
        }

        public ChannelConfig setImportance(int i4) {
            if (Build.VERSION.SDK_INT >= 26) {
                this.mNotificationChannel.setImportance(i4);
            }
            return this;
        }

        public ChannelConfig setLightColor(int i4) {
            if (Build.VERSION.SDK_INT >= 26) {
                this.mNotificationChannel.setLightColor(i4);
            }
            return this;
        }

        public ChannelConfig setLockscreenVisibility(int i4) {
            if (Build.VERSION.SDK_INT >= 26) {
                this.mNotificationChannel.setLockscreenVisibility(i4);
            }
            return this;
        }

        public ChannelConfig setName(CharSequence charSequence) {
            if (Build.VERSION.SDK_INT >= 26) {
                this.mNotificationChannel.setName(charSequence);
            }
            return this;
        }

        public ChannelConfig setShowBadge(boolean z3) {
            if (Build.VERSION.SDK_INT >= 26) {
                this.mNotificationChannel.setShowBadge(z3);
            }
            return this;
        }

        public ChannelConfig setSound(Uri uri, AudioAttributes audioAttributes) {
            if (Build.VERSION.SDK_INT >= 26) {
                this.mNotificationChannel.setSound(uri, audioAttributes);
            }
            return this;
        }

        public ChannelConfig setVibrationPattern(long[] jArr) {
            if (Build.VERSION.SDK_INT >= 26) {
                this.mNotificationChannel.setVibrationPattern(jArr);
            }
            return this;
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface Importance {
    }

    public static boolean areNotificationsEnabled() {
        return NotificationManagerCompat.from(Utils.getApp()).areNotificationsEnabled();
    }

    public static void cancel(String str, int i4) {
        NotificationManagerCompat.from(Utils.getApp()).cancel(str, i4);
    }

    public static void cancelAll() {
        NotificationManagerCompat.from(Utils.getApp()).cancelAll();
    }

    public static Notification getNotification(ChannelConfig channelConfig, Utils.Consumer<NotificationCompat.Builder> consumer) {
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 26) {
            ((NotificationManager) Utils.getApp().getSystemService("notification")).createNotificationChannel(channelConfig.getNotificationChannel());
        }
        NotificationCompat.Builder builder = new NotificationCompat.Builder(Utils.getApp());
        if (i4 >= 26) {
            builder.setChannelId(channelConfig.mNotificationChannel.getId());
        }
        if (consumer != null) {
            consumer.accept(builder);
        }
        return builder.build();
    }

    private static void invokePanels(String str) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        try {
            Class.forName("android.app.StatusBarManager").getMethod(str, new Class[0]).invoke(Utils.getApp().getSystemService("statusbar"), new Object[0]);
        } catch (Exception e4) {
            e4.printStackTrace();
        }
    }

    public static void notify(int i4, Utils.Consumer<NotificationCompat.Builder> consumer) {
        notify(null, i4, ChannelConfig.DEFAULT_CHANNEL_CONFIG, consumer);
    }

    @RequiresPermission("android.permission.EXPAND_STATUS_BAR")
    public static void setNotificationBarVisibility(boolean z3) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        invokePanels(z3 ? "expandNotificationsPanel" : "collapsePanels");
    }

    public static void cancel(int i4) {
        NotificationManagerCompat.from(Utils.getApp()).cancel(i4);
    }

    public static void notify(String str, int i4, Utils.Consumer<NotificationCompat.Builder> consumer) {
        notify(str, i4, ChannelConfig.DEFAULT_CHANNEL_CONFIG, consumer);
    }

    public static void notify(int i4, ChannelConfig channelConfig, Utils.Consumer<NotificationCompat.Builder> consumer) {
        notify(null, i4, channelConfig, consumer);
    }

    public static void notify(String str, int i4, ChannelConfig channelConfig, Utils.Consumer<NotificationCompat.Builder> consumer) {
        NotificationManagerCompat.from(Utils.getApp()).notify(str, i4, getNotification(channelConfig, consumer));
    }
}
