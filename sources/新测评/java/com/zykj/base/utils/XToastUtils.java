package com.zykj.base.utils;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.annotation.Keep;
import androidx.annotation.MainThread;
import androidx.annotation.StringRes;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p034c4.AbstractC5117b;
import p186o2.AbstractC8697b;

@Keep
@Metadata(m13557d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\r\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u0012\u0010\u0004\u001a\u00020\u00052\b\b\u0001\u0010\u0006\u001a\u00020\bH\u0007J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\bH\u0007J\u001a\u0010\u0004\u001a\u00020\u00052\b\b\u0001\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH\u0007J\u0010\u0010\n\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u0014\u0010\n\u001a\u00020\u00052\n\u0010\n\u001a\u00060\u000bj\u0002`\fH\u0007J\u0012\u0010\n\u001a\u00020\u00052\b\b\u0001\u0010\u0006\u001a\u00020\bH\u0007J\u0018\u0010\n\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\bH\u0007J\u001a\u0010\n\u001a\u00020\u00052\b\b\u0001\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH\u0007J\u0010\u0010\r\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u0012\u0010\r\u001a\u00020\u00052\b\b\u0001\u0010\u0006\u001a\u00020\bH\u0007J\u0018\u0010\r\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\bH\u0007J\u001a\u0010\r\u001a\u00020\u00052\b\b\u0001\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH\u0007J\u0010\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u0012\u0010\u000e\u001a\u00020\u00052\b\b\u0001\u0010\u0006\u001a\u00020\bH\u0007J\u0018\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\bH\u0007J\u001a\u0010\u000e\u001a\u00020\u00052\b\b\u0001\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH\u0007J\u0010\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u0012\u0010\u000f\u001a\u00020\u00052\b\b\u0001\u0010\u0006\u001a\u00020\bH\u0007J\u0018\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\bH\u0007J\u001a\u0010\u000f\u001a\u00020\u00052\b\b\u0001\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH\u0007¨\u0006\u0010"}, m13558d2 = {"Lcom/zykj/base/utils/XToastUtils;", "", "<init>", "()V", "toast", "", "message", "", "", TypedValues.TransitionType.S_DURATION, "error", "Ljava/lang/Exception;", "Lkotlin/Exception;", "success", "info", "warning", "base_release"}, m13559k = 1, m13560mv = {2, 2, 0}, m13562xi = 48)
@SuppressLint({"CheckResult"})
/* loaded from: classes4.dex */
public final class XToastUtils {
    public static final XToastUtils INSTANCE = new XToastUtils();

    static {
        AbstractC5117b.b.m2770k().m2773m(17).m2772l(200).m2771j(false);
    }

    private XToastUtils() {
    }

    @MainThread
    public final void error(CharSequence message) {
        Intrinsics.checkNotNullParameter(message, "message");
        AbstractC5117b.m2740f(AbstractC8697b.m14299a(), message).show();
    }

    @MainThread
    public final void info(CharSequence message) {
        Intrinsics.checkNotNullParameter(message, "message");
        AbstractC5117b.m2745k(AbstractC8697b.m14299a(), message).show();
    }

    @MainThread
    public final void success(CharSequence message) {
        Intrinsics.checkNotNullParameter(message, "message");
        AbstractC5117b.m2755u(AbstractC8697b.m14299a(), message).show();
    }

    @MainThread
    public final void toast(CharSequence message) {
        Intrinsics.checkNotNullParameter(message, "message");
        AbstractC5117b.m2750p(AbstractC8697b.m14299a(), message).show();
    }

    @MainThread
    public final void warning(CharSequence message) {
        Intrinsics.checkNotNullParameter(message, "message");
        AbstractC5117b.m2760z(AbstractC8697b.m14299a(), message).show();
    }

    @MainThread
    public final void error(Exception error) {
        Intrinsics.checkNotNullParameter(error, "error");
        Context contextM14299a = AbstractC8697b.m14299a();
        String message = error.getMessage();
        Intrinsics.checkNotNull(message);
        AbstractC5117b.m2740f(contextM14299a, message).show();
    }

    @MainThread
    public final void info(@StringRes int message) {
        AbstractC5117b.m2743i(AbstractC8697b.m14299a(), message).show();
    }

    @MainThread
    public final void success(@StringRes int message) {
        AbstractC5117b.m2753s(AbstractC8697b.m14299a(), message).show();
    }

    @MainThread
    public final void toast(@StringRes int message) {
        AbstractC5117b.m2748n(AbstractC8697b.m14299a(), message).show();
    }

    @MainThread
    public final void warning(@StringRes int message) {
        AbstractC5117b.m2758x(AbstractC8697b.m14299a(), message).show();
    }

    @MainThread
    public final void error(@StringRes int message) {
        AbstractC5117b.m2738d(AbstractC8697b.m14299a(), message).show();
    }

    @MainThread
    public final void info(CharSequence message, int duration) {
        Intrinsics.checkNotNullParameter(message, "message");
        AbstractC5117b.m2746l(AbstractC8697b.m14299a(), message, duration).show();
    }

    @MainThread
    public final void success(CharSequence message, int duration) {
        Intrinsics.checkNotNullParameter(message, "message");
        AbstractC5117b.m2756v(AbstractC8697b.m14299a(), message, duration).show();
    }

    @MainThread
    public final void toast(CharSequence message, int duration) {
        Intrinsics.checkNotNullParameter(message, "message");
        AbstractC5117b.m2751q(AbstractC8697b.m14299a(), message, duration).show();
    }

    @MainThread
    public final void warning(CharSequence message, int duration) {
        Intrinsics.checkNotNullParameter(message, "message");
        AbstractC5117b.m2733A(AbstractC8697b.m14299a(), message, duration).show();
    }

    @MainThread
    public final void error(CharSequence message, int duration) {
        Intrinsics.checkNotNullParameter(message, "message");
        AbstractC5117b.m2741g(AbstractC8697b.m14299a(), message, duration).show();
    }

    @MainThread
    public final void info(@StringRes int message, int duration) {
        AbstractC5117b.m2744j(AbstractC8697b.m14299a(), message, duration).show();
    }

    @MainThread
    public final void success(@StringRes int message, int duration) {
        AbstractC5117b.m2754t(AbstractC8697b.m14299a(), message, duration).show();
    }

    @MainThread
    public final void toast(@StringRes int message, int duration) {
        AbstractC5117b.m2749o(AbstractC8697b.m14299a(), message, duration).show();
    }

    @MainThread
    public final void warning(@StringRes int message, int duration) {
        AbstractC5117b.m2759y(AbstractC8697b.m14299a(), message, duration).show();
    }

    @MainThread
    public final void error(@StringRes int message, int duration) {
        AbstractC5117b.m2739e(AbstractC8697b.m14299a(), message, duration).show();
    }
}
