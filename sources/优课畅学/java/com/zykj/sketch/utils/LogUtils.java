package com.zykj.sketch.utils;

import android.util.Log;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;

/* loaded from: classes3.dex */
public final class LogUtils {
    private static final String TAG = "LogUtils";
    public static final Companion Companion = new Companion(null);
    private static boolean isDebug = true;

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC9126n abstractC9126n) {
            this();
        }

        /* renamed from: d */
        public final void m9789d(String msg) {
            AbstractC9133u.m16133g(msg, "msg");
            isDebug();
        }

        /* renamed from: e */
        public final void m9791e(String msg) {
            AbstractC9133u.m16133g(msg, "msg");
            if (isDebug()) {
                Log.e(LogUtils.TAG, msg);
            }
        }

        /* renamed from: i */
        public final void m9793i(String msg) {
            AbstractC9133u.m16133g(msg, "msg");
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
        public final void m9795v(String msg) {
            AbstractC9133u.m16133g(msg, "msg");
            isDebug();
        }

        private Companion() {
        }

        /* renamed from: d */
        public final void m9790d(String tag, String msg) {
            AbstractC9133u.m16133g(tag, "tag");
            AbstractC9133u.m16133g(msg, "msg");
            isDebug();
        }

        /* renamed from: v */
        public final void m9796v(String tag, String msg) {
            AbstractC9133u.m16133g(tag, "tag");
            AbstractC9133u.m16133g(msg, "msg");
            isDebug();
        }

        /* renamed from: e */
        public final void m9792e(String tag, String msg) {
            AbstractC9133u.m16133g(tag, "tag");
            AbstractC9133u.m16133g(msg, "msg");
            if (isDebug()) {
                Log.e(tag, msg);
            }
        }

        /* renamed from: i */
        public final void m9794i(String tag, String msg) {
            AbstractC9133u.m16133g(tag, "tag");
            AbstractC9133u.m16133g(msg, "msg");
            if (isDebug()) {
                Log.i(tag, msg);
            }
        }
    }

    private LogUtils() {
        throw new UnsupportedOperationException("cannot be instantiated");
    }
}
