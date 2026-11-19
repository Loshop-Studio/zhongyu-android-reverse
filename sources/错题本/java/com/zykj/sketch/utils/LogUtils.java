package com.zykj.sketch.utils;

import android.util.Log;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.app.NotificationCompat;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5824e;
import kotlin.jvm.internal.AbstractC5830k;
import org.jetbrains.annotations.NotNull;

@Metadata(m5109d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, m5110d2 = {"Lcom/zykj/sketch/utils/LogUtils;", "", "()V", "Companion", "sketch_release"}, m5111k = 1, m5112mv = {1, 7, 1}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes3.dex */
public final class LogUtils {

    @NotNull
    private static final String TAG = "LogUtils";

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private static boolean isDebug = true;

    @Metadata(m5109d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\bJ\u0015\u0010\n\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\bJ\u0015\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\bJ\u001d\u0010\u0007\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\rJ\u001d\u0010\t\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\rJ\u001d\u0010\n\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\rJ\u001d\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\rR\"\u0010\u000f\u001a\u00020\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000f\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, m5110d2 = {"Lcom/zykj/sketch/utils/LogUtils$Companion;", "", "<init>", "()V", "", NotificationCompat.CATEGORY_MESSAGE, "Ld6/s;", "i", "(Ljava/lang/String;)V", "d", "e", "v", "tag", "(Ljava/lang/String;Ljava/lang/String;)V", "", "isDebug", "Z", "()Z", "setDebug", "(Z)V", "TAG", "Ljava/lang/String;", "sketch_release"}, m5111k = 1, m5112mv = {1, 7, 1}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class Companion {
        public /* synthetic */ Companion(AbstractC5824e abstractC5824e) {
            this();
        }

        /* renamed from: d */
        public final void m4519d(@NotNull String msg) {
            AbstractC5830k.m5330g(msg, "msg");
            if (isDebug()) {
                Log.d(LogUtils.TAG, msg);
            }
        }

        /* renamed from: e */
        public final void m4521e(@NotNull String msg) {
            AbstractC5830k.m5330g(msg, "msg");
            if (isDebug()) {
                Log.e(LogUtils.TAG, msg);
            }
        }

        /* renamed from: i */
        public final void m4523i(@NotNull String msg) {
            AbstractC5830k.m5330g(msg, "msg");
            if (isDebug()) {
                Log.i(LogUtils.TAG, msg);
            }
        }

        public final boolean isDebug() {
            return LogUtils.isDebug;
        }

        public final void setDebug(boolean z8) {
            LogUtils.isDebug = z8;
        }

        /* renamed from: v */
        public final void m4525v(@NotNull String msg) {
            AbstractC5830k.m5330g(msg, "msg");
            if (isDebug()) {
                Log.v(LogUtils.TAG, msg);
            }
        }

        private Companion() {
        }

        /* renamed from: d */
        public final void m4520d(@NotNull String tag, @NotNull String msg) {
            AbstractC5830k.m5330g(tag, "tag");
            AbstractC5830k.m5330g(msg, "msg");
            if (isDebug()) {
                Log.d(tag, msg);
            }
        }

        /* renamed from: e */
        public final void m4522e(@NotNull String tag, @NotNull String msg) {
            AbstractC5830k.m5330g(tag, "tag");
            AbstractC5830k.m5330g(msg, "msg");
            if (isDebug()) {
                Log.e(tag, msg);
            }
        }

        /* renamed from: i */
        public final void m4524i(@NotNull String tag, @NotNull String msg) {
            AbstractC5830k.m5330g(tag, "tag");
            AbstractC5830k.m5330g(msg, "msg");
            if (isDebug()) {
                Log.i(tag, msg);
            }
        }

        /* renamed from: v */
        public final void m4526v(@NotNull String tag, @NotNull String msg) {
            AbstractC5830k.m5330g(tag, "tag");
            AbstractC5830k.m5330g(msg, "msg");
            if (isDebug()) {
                Log.v(tag, msg);
            }
        }
    }

    private LogUtils() {
        throw new UnsupportedOperationException("cannot be instantiated");
    }
}
