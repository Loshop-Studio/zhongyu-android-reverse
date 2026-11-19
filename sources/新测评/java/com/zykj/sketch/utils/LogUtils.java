package com.zykj.sketch.utils;

import android.util.Log;
import androidx.core.app.NotificationCompat;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(m13557d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, m13558d2 = {"Lcom/zykj/sketch/utils/LogUtils;", "", "()V", "Companion", "sketch_release"}, m13559k = 1, m13560mv = {1, 7, 1}, m13562xi = 48)
/* loaded from: classes5.dex */
public final class LogUtils {
    private static final String TAG = "LogUtils";

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static boolean isDebug = true;

    @Metadata(m13557d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0004J\u0016\u0010\n\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u0004J\u000e\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0004J\u0016\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u0004J\u000e\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0004J\u0016\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u0004J\u000e\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0004J\u0016\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0007\"\u0004\b\b\u0010\t¨\u0006\u0011"}, m13558d2 = {"Lcom/zykj/sketch/utils/LogUtils$Companion;", "", "()V", "TAG", "", "isDebug", "", "()Z", "setDebug", "(Z)V", "d", "", NotificationCompat.CATEGORY_MESSAGE, "tag", "e", "i", "v", "sketch_release"}, m13559k = 1, m13560mv = {1, 7, 1}, m13562xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: d */
        public final void m10645d(String msg) {
            Intrinsics.checkNotNullParameter(msg, "msg");
            isDebug();
        }

        /* renamed from: e */
        public final void m10647e(String msg) {
            Intrinsics.checkNotNullParameter(msg, "msg");
            if (isDebug()) {
                Log.e(LogUtils.TAG, msg);
            }
        }

        /* renamed from: i */
        public final void m10649i(String msg) {
            Intrinsics.checkNotNullParameter(msg, "msg");
            if (isDebug()) {
                Log.i(LogUtils.TAG, msg);
            }
        }

        public final boolean isDebug() {
            return LogUtils.isDebug;
        }

        public final void setDebug(boolean z9) {
            LogUtils.isDebug = z9;
        }

        /* renamed from: v */
        public final void m10651v(String msg) {
            Intrinsics.checkNotNullParameter(msg, "msg");
            isDebug();
        }

        private Companion() {
        }

        /* renamed from: d */
        public final void m10646d(String tag, String msg) {
            Intrinsics.checkNotNullParameter(tag, "tag");
            Intrinsics.checkNotNullParameter(msg, "msg");
            isDebug();
        }

        /* renamed from: v */
        public final void m10652v(String tag, String msg) {
            Intrinsics.checkNotNullParameter(tag, "tag");
            Intrinsics.checkNotNullParameter(msg, "msg");
            isDebug();
        }

        /* renamed from: e */
        public final void m10648e(String tag, String msg) {
            Intrinsics.checkNotNullParameter(tag, "tag");
            Intrinsics.checkNotNullParameter(msg, "msg");
            if (isDebug()) {
                Log.e(tag, msg);
            }
        }

        /* renamed from: i */
        public final void m10650i(String tag, String msg) {
            Intrinsics.checkNotNullParameter(tag, "tag");
            Intrinsics.checkNotNullParameter(msg, "msg");
            if (isDebug()) {
                Log.i(tag, msg);
            }
        }
    }

    private LogUtils() {
        throw new UnsupportedOperationException("cannot be instantiated");
    }
}
