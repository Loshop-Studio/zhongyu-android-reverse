package com.zykj.base.utils;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.annotation.Keep;
import androidx.annotation.MainThread;
import androidx.annotation.StringRes;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p126p1.AbstractC7591b;
import p183x2.AbstractC7832b;

@Keep
@Metadata(m7879d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\r\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u0012\u0010\u0004\u001a\u00020\u00052\b\b\u0001\u0010\u0006\u001a\u00020\bH\u0007J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\bH\u0007J\u001a\u0010\u0004\u001a\u00020\u00052\b\b\u0001\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH\u0007J\u0010\u0010\n\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u0014\u0010\n\u001a\u00020\u00052\n\u0010\n\u001a\u00060\u000bj\u0002`\fH\u0007J\u0012\u0010\n\u001a\u00020\u00052\b\b\u0001\u0010\u0006\u001a\u00020\bH\u0007J\u0018\u0010\n\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\bH\u0007J\u001a\u0010\n\u001a\u00020\u00052\b\b\u0001\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH\u0007J\u0010\u0010\r\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u0012\u0010\r\u001a\u00020\u00052\b\b\u0001\u0010\u0006\u001a\u00020\bH\u0007J\u0018\u0010\r\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\bH\u0007J\u001a\u0010\r\u001a\u00020\u00052\b\b\u0001\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH\u0007J\u0010\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u0012\u0010\u000e\u001a\u00020\u00052\b\b\u0001\u0010\u0006\u001a\u00020\bH\u0007J\u0018\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\bH\u0007J\u001a\u0010\u000e\u001a\u00020\u00052\b\b\u0001\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH\u0007J\u0010\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u0012\u0010\u000f\u001a\u00020\u00052\b\b\u0001\u0010\u0006\u001a\u00020\bH\u0007J\u0018\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\bH\u0007J\u001a\u0010\u000f\u001a\u00020\u00052\b\b\u0001\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH\u0007¨\u0006\u0010"}, m7880d2 = {"Lcom/zykj/base/utils/XToastUtils;", "", "<init>", "()V", "toast", "", "message", "", "", TypedValues.TransitionType.S_DURATION, "error", "Ljava/lang/Exception;", "Lkotlin/Exception;", "success", "info", "warning", "base_release"}, m7881k = 1, m7882mv = {2, 2, 0}, m7884xi = 48)
@SuppressLint({"CheckResult"})
/* loaded from: classes3.dex */
public final class XToastUtils {
    public static final XToastUtils INSTANCE = new XToastUtils();

    static {
        AbstractC7832b.b.m9504k().m9507m(17).m9506l(200).m9505j(false);
    }

    private XToastUtils() {
    }

    @MainThread
    public final void error(CharSequence message) {
        Intrinsics.checkNotNullParameter(message, "message");
        AbstractC7832b.m9474f(AbstractC7591b.m8998a(), message).show();
    }

    @MainThread
    public final void info(CharSequence message) {
        Intrinsics.checkNotNullParameter(message, "message");
        AbstractC7832b.m9479k(AbstractC7591b.m8998a(), message).show();
    }

    @MainThread
    public final void success(CharSequence message) {
        Intrinsics.checkNotNullParameter(message, "message");
        AbstractC7832b.m9489u(AbstractC7591b.m8998a(), message).show();
    }

    @MainThread
    public final void toast(CharSequence message) {
        Intrinsics.checkNotNullParameter(message, "message");
        AbstractC7832b.m9484p(AbstractC7591b.m8998a(), message).show();
    }

    @MainThread
    public final void warning(CharSequence message) {
        Intrinsics.checkNotNullParameter(message, "message");
        AbstractC7832b.m9494z(AbstractC7591b.m8998a(), message).show();
    }

    @MainThread
    public final void error(Exception error) {
        Intrinsics.checkNotNullParameter(error, "error");
        Context contextM8998a = AbstractC7591b.m8998a();
        String message = error.getMessage();
        Intrinsics.checkNotNull(message);
        AbstractC7832b.m9474f(contextM8998a, message).show();
    }

    @MainThread
    public final void info(@StringRes int message) {
        AbstractC7832b.m9477i(AbstractC7591b.m8998a(), message).show();
    }

    @MainThread
    public final void success(@StringRes int message) {
        AbstractC7832b.m9487s(AbstractC7591b.m8998a(), message).show();
    }

    @MainThread
    public final void toast(@StringRes int message) {
        AbstractC7832b.m9482n(AbstractC7591b.m8998a(), message).show();
    }

    @MainThread
    public final void warning(@StringRes int message) {
        AbstractC7832b.m9492x(AbstractC7591b.m8998a(), message).show();
    }

    @MainThread
    public final void error(@StringRes int message) {
        AbstractC7832b.m9472d(AbstractC7591b.m8998a(), message).show();
    }

    @MainThread
    public final void info(CharSequence message, int duration) {
        Intrinsics.checkNotNullParameter(message, "message");
        AbstractC7832b.m9480l(AbstractC7591b.m8998a(), message, duration).show();
    }

    @MainThread
    public final void success(CharSequence message, int duration) {
        Intrinsics.checkNotNullParameter(message, "message");
        AbstractC7832b.m9490v(AbstractC7591b.m8998a(), message, duration).show();
    }

    @MainThread
    public final void toast(CharSequence message, int duration) {
        Intrinsics.checkNotNullParameter(message, "message");
        AbstractC7832b.m9485q(AbstractC7591b.m8998a(), message, duration).show();
    }

    @MainThread
    public final void warning(CharSequence message, int duration) {
        Intrinsics.checkNotNullParameter(message, "message");
        AbstractC7832b.m9467A(AbstractC7591b.m8998a(), message, duration).show();
    }

    @MainThread
    public final void error(CharSequence message, int duration) {
        Intrinsics.checkNotNullParameter(message, "message");
        AbstractC7832b.m9475g(AbstractC7591b.m8998a(), message, duration).show();
    }

    @MainThread
    public final void info(@StringRes int message, int duration) {
        AbstractC7832b.m9478j(AbstractC7591b.m8998a(), message, duration).show();
    }

    @MainThread
    public final void success(@StringRes int message, int duration) {
        AbstractC7832b.m9488t(AbstractC7591b.m8998a(), message, duration).show();
    }

    @MainThread
    public final void toast(@StringRes int message, int duration) {
        AbstractC7832b.m9483o(AbstractC7591b.m8998a(), message, duration).show();
    }

    @MainThread
    public final void warning(@StringRes int message, int duration) {
        AbstractC7832b.m9493y(AbstractC7591b.m8998a(), message, duration).show();
    }

    @MainThread
    public final void error(@StringRes int message, int duration) {
        AbstractC7832b.m9473e(AbstractC7591b.m8998a(), message, duration).show();
    }
}
