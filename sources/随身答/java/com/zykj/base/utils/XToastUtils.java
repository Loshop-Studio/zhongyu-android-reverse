package com.zykj.base.utils;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.annotation.Keep;
import androidx.annotation.MainThread;
import androidx.annotation.StringRes;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p093e3.AbstractC7843b;
import p242s4.AbstractC9472b;

@Keep
@Metadata(m13412d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007J\u0014\u0010\u0003\u001a\u00020\u00042\n\u0010\u0003\u001a\u00060\tj\u0002`\nH\u0007J\u0012\u0010\u0003\u001a\u00020\u00042\b\b\u0001\u0010\u0005\u001a\u00020\bH\u0007J\u001a\u0010\u0003\u001a\u00020\u00042\b\b\u0001\u0010\u0005\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\bH\u0007J\u0010\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0018\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007J\u0012\u0010\u000b\u001a\u00020\u00042\b\b\u0001\u0010\u0005\u001a\u00020\bH\u0007J\u001a\u0010\u000b\u001a\u00020\u00042\b\b\u0001\u0010\u0005\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\bH\u0007J\u0010\u0010\f\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0018\u0010\f\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007J\u0012\u0010\f\u001a\u00020\u00042\b\b\u0001\u0010\u0005\u001a\u00020\bH\u0007J\u001a\u0010\f\u001a\u00020\u00042\b\b\u0001\u0010\u0005\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\bH\u0007J\u0010\u0010\r\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0018\u0010\r\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007J\u0012\u0010\r\u001a\u00020\u00042\b\b\u0001\u0010\u0005\u001a\u00020\bH\u0007J\u001a\u0010\r\u001a\u00020\u00042\b\b\u0001\u0010\u0005\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\bH\u0007J\u0010\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0018\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007J\u0012\u0010\u000e\u001a\u00020\u00042\b\b\u0001\u0010\u0005\u001a\u00020\bH\u0007J\u001a\u0010\u000e\u001a\u00020\u00042\b\b\u0001\u0010\u0005\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\bH\u0007¨\u0006\u000f"}, m13413d2 = {"Lcom/zykj/base/utils/XToastUtils;", "", "()V", "error", "", "message", "", TypedValues.TransitionType.S_DURATION, "", "Ljava/lang/Exception;", "Lkotlin/Exception;", "info", "success", "toast", "warning", "base_release"}, m13414k = 1, m13415mv = {1, 5, 1}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SuppressLint({"CheckResult"})
/* loaded from: classes4.dex */
public final class XToastUtils {
    public static final XToastUtils INSTANCE = new XToastUtils();

    static {
        AbstractC9472b.a.m15692j().m15695l(17).m15694k(200).m15693i(false);
    }

    private XToastUtils() {
    }

    @MainThread
    public final void error(CharSequence message) {
        Intrinsics.checkNotNullParameter(message, "message");
        AbstractC9472b.m15661d(AbstractC7843b.m12290a(), message).show();
    }

    @MainThread
    public final void info(CharSequence message) {
        Intrinsics.checkNotNullParameter(message, "message");
        AbstractC9472b.m15666i(AbstractC7843b.m12290a(), message).show();
    }

    @MainThread
    public final void success(CharSequence message) {
        Intrinsics.checkNotNullParameter(message, "message");
        AbstractC9472b.m15676s(AbstractC7843b.m12290a(), message).show();
    }

    @MainThread
    public final void toast(CharSequence message) {
        Intrinsics.checkNotNullParameter(message, "message");
        AbstractC9472b.m15671n(AbstractC7843b.m12290a(), message).show();
    }

    @MainThread
    public final void warning(CharSequence message) {
        Intrinsics.checkNotNullParameter(message, "message");
        AbstractC9472b.m15681x(AbstractC7843b.m12290a(), message).show();
    }

    @MainThread
    public final void error(Exception error) {
        Intrinsics.checkNotNullParameter(error, "error");
        Context contextM12290a = AbstractC7843b.m12290a();
        String message = error.getMessage();
        Intrinsics.checkNotNull(message);
        AbstractC9472b.m15661d(contextM12290a, message).show();
    }

    @MainThread
    public final void info(@StringRes int message) {
        AbstractC9472b.m15664g(AbstractC7843b.m12290a(), message).show();
    }

    @MainThread
    public final void success(@StringRes int message) {
        AbstractC9472b.m15674q(AbstractC7843b.m12290a(), message).show();
    }

    @MainThread
    public final void toast(@StringRes int message) {
        AbstractC9472b.m15669l(AbstractC7843b.m12290a(), message).show();
    }

    @MainThread
    public final void warning(@StringRes int message) {
        AbstractC9472b.m15679v(AbstractC7843b.m12290a(), message).show();
    }

    @MainThread
    public final void error(@StringRes int message) {
        AbstractC9472b.m15659b(AbstractC7843b.m12290a(), message).show();
    }

    @MainThread
    public final void info(CharSequence message, int duration) {
        Intrinsics.checkNotNullParameter(message, "message");
        AbstractC9472b.m15667j(AbstractC7843b.m12290a(), message, duration).show();
    }

    @MainThread
    public final void success(CharSequence message, int duration) {
        Intrinsics.checkNotNullParameter(message, "message");
        AbstractC9472b.m15677t(AbstractC7843b.m12290a(), message, duration).show();
    }

    @MainThread
    public final void toast(CharSequence message, int duration) {
        Intrinsics.checkNotNullParameter(message, "message");
        AbstractC9472b.m15672o(AbstractC7843b.m12290a(), message, duration).show();
    }

    @MainThread
    public final void warning(CharSequence message, int duration) {
        Intrinsics.checkNotNullParameter(message, "message");
        AbstractC9472b.m15682y(AbstractC7843b.m12290a(), message, duration).show();
    }

    @MainThread
    public final void error(CharSequence message, int duration) {
        Intrinsics.checkNotNullParameter(message, "message");
        AbstractC9472b.m15662e(AbstractC7843b.m12290a(), message, duration).show();
    }

    @MainThread
    public final void info(@StringRes int message, int duration) {
        AbstractC9472b.m15665h(AbstractC7843b.m12290a(), message, duration).show();
    }

    @MainThread
    public final void success(@StringRes int message, int duration) {
        AbstractC9472b.m15675r(AbstractC7843b.m12290a(), message, duration).show();
    }

    @MainThread
    public final void toast(@StringRes int message, int duration) {
        AbstractC9472b.m15670m(AbstractC7843b.m12290a(), message, duration).show();
    }

    @MainThread
    public final void warning(@StringRes int message, int duration) {
        AbstractC9472b.m15680w(AbstractC7843b.m12290a(), message, duration).show();
    }

    @MainThread
    public final void error(@StringRes int message, int duration) {
        AbstractC9472b.m15660c(AbstractC7843b.m12290a(), message, duration).show();
    }
}
