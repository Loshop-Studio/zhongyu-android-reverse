package androidx.sqlite.p019db;

import android.app.ActivityManager;
import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.os.CancellationSignal;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import java.io.File;
import java.util.List;
import kotlin.jvm.internal.AbstractC9979u;
import p309qc.InterfaceC10770a;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* loaded from: classes3.dex */
public final class SupportSQLiteCompat {

    @InterfaceC10770a
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static final class Api16Impl {
        public static final Api16Impl INSTANCE = new Api16Impl();

        private Api16Impl() {
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public static final void cancel(CancellationSignal cancellationSignal) {
            AbstractC9979u.m20294g(cancellationSignal, "cancellationSignal");
            cancellationSignal.cancel();
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public static final CancellationSignal createCancellationSignal() {
            return new CancellationSignal();
        }
    }

    @InterfaceC10770a
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static final class Api19Impl {
        public static final Api19Impl INSTANCE = new Api19Impl();

        private Api19Impl() {
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public static final Uri getNotificationUri(Cursor cursor) {
            AbstractC9979u.m20294g(cursor, "cursor");
            Uri notificationUri = cursor.getNotificationUri();
            AbstractC9979u.m20293f(notificationUri, "getNotificationUri(...)");
            return notificationUri;
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public static final boolean isLowRamDevice(ActivityManager activityManager) {
            AbstractC9979u.m20294g(activityManager, "activityManager");
            return activityManager.isLowRamDevice();
        }
    }

    @RequiresApi(21)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static final class Api21Impl {
        public static final Api21Impl INSTANCE = new Api21Impl();

        private Api21Impl() {
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public static final File getNoBackupFilesDir(Context context) {
            AbstractC9979u.m20294g(context, "context");
            File noBackupFilesDir = context.getNoBackupFilesDir();
            AbstractC9979u.m20293f(noBackupFilesDir, "getNoBackupFilesDir(...)");
            return noBackupFilesDir;
        }
    }

    @RequiresApi(23)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static final class Api23Impl {
        public static final Api23Impl INSTANCE = new Api23Impl();

        private Api23Impl() {
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public static final void setExtras(Cursor cursor, Bundle extras) {
            AbstractC9979u.m20294g(cursor, "cursor");
            AbstractC9979u.m20294g(extras, "extras");
            cursor.setExtras(extras);
        }
    }

    @RequiresApi(29)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static final class Api29Impl {
        public static final Api29Impl INSTANCE = new Api29Impl();

        private Api29Impl() {
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public static final List<Uri> getNotificationUris(Cursor cursor) {
            AbstractC9979u.m20294g(cursor, "cursor");
            List<Uri> notificationUris = cursor.getNotificationUris();
            AbstractC9979u.m20291d(notificationUris);
            return notificationUris;
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public static final void setNotificationUris(Cursor cursor, ContentResolver cr, List<? extends Uri> uris) {
            AbstractC9979u.m20294g(cursor, "cursor");
            AbstractC9979u.m20294g(cr, "cr");
            AbstractC9979u.m20294g(uris, "uris");
            cursor.setNotificationUris(cr, uris);
        }
    }

    private SupportSQLiteCompat() {
    }
}
