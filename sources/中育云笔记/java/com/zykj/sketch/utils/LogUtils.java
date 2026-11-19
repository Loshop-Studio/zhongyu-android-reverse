package com.zykj.sketch.utils;

import android.util.Log;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;

/* loaded from: classes6.dex */
public final class LogUtils {
    private static final String TAG = "LogUtils";
    public static final Companion Companion = new Companion(null);
    private static boolean isDebug = true;

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC9972n abstractC9972n) {
            this();
        }

        /* renamed from: d */
        public final void m16654d(String msg) {
            AbstractC9979u.m20294g(msg, "msg");
            isDebug();
        }

        /* renamed from: e */
        public final void m16656e(String msg) {
            AbstractC9979u.m20294g(msg, "msg");
            if (isDebug()) {
                Log.e(LogUtils.TAG, msg);
            }
        }

        /* renamed from: i */
        public final void m16658i(String msg) {
            AbstractC9979u.m20294g(msg, "msg");
            if (isDebug()) {
                Log.i(LogUtils.TAG, msg);
            }
        }

        public final boolean isDebug() {
            return LogUtils.isDebug;
        }

        public final void setDebug(boolean z10) {
            LogUtils.isDebug = z10;
        }

        /* renamed from: v */
        public final void m16660v(String msg) {
            AbstractC9979u.m20294g(msg, "msg");
            isDebug();
        }

        private Companion() {
        }

        /* renamed from: d */
        public final void m16655d(String tag, String msg) {
            AbstractC9979u.m20294g(tag, "tag");
            AbstractC9979u.m20294g(msg, "msg");
            isDebug();
        }

        /* renamed from: v */
        public final void m16661v(String tag, String msg) {
            AbstractC9979u.m20294g(tag, "tag");
            AbstractC9979u.m20294g(msg, "msg");
            isDebug();
        }

        /* renamed from: e */
        public final void m16657e(String tag, String msg) {
            AbstractC9979u.m20294g(tag, "tag");
            AbstractC9979u.m20294g(msg, "msg");
            if (isDebug()) {
                Log.e(tag, msg);
            }
        }

        /* renamed from: i */
        public final void m16659i(String tag, String msg) {
            AbstractC9979u.m20294g(tag, "tag");
            AbstractC9979u.m20294g(msg, "msg");
            if (isDebug()) {
                Log.i(tag, msg);
            }
        }
    }

    private LogUtils() {
        throw new UnsupportedOperationException("cannot be instantiated");
    }
}
