package com.zykj.base.utils;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.annotation.Keep;
import androidx.annotation.MainThread;
import androidx.annotation.StringRes;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.umeng.analytics.pro.C3380c;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p077j0.AbstractC3799b;
import p100n1.AbstractC4407b;

@Keep
@Metadata(m5174d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007J\u0014\u0010\u0003\u001a\u00020\u00042\n\u0010\u0003\u001a\u00060\tj\u0002`\nH\u0007J\u0012\u0010\u0003\u001a\u00020\u00042\b\b\u0001\u0010\u0005\u001a\u00020\bH\u0007J\u001a\u0010\u0003\u001a\u00020\u00042\b\b\u0001\u0010\u0005\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\bH\u0007J\u0010\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0018\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007J\u0012\u0010\u000b\u001a\u00020\u00042\b\b\u0001\u0010\u0005\u001a\u00020\bH\u0007J\u001a\u0010\u000b\u001a\u00020\u00042\b\b\u0001\u0010\u0005\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\bH\u0007J\u0010\u0010\f\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0018\u0010\f\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007J\u0012\u0010\f\u001a\u00020\u00042\b\b\u0001\u0010\u0005\u001a\u00020\bH\u0007J\u001a\u0010\f\u001a\u00020\u00042\b\b\u0001\u0010\u0005\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\bH\u0007J\u0010\u0010\r\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0018\u0010\r\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007J\u0012\u0010\r\u001a\u00020\u00042\b\b\u0001\u0010\u0005\u001a\u00020\bH\u0007J\u001a\u0010\r\u001a\u00020\u00042\b\b\u0001\u0010\u0005\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\bH\u0007J\u0010\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0018\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007J\u0012\u0010\u000e\u001a\u00020\u00042\b\b\u0001\u0010\u0005\u001a\u00020\bH\u0007J\u001a\u0010\u000e\u001a\u00020\u00042\b\b\u0001\u0010\u0005\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\bH\u0007¨\u0006\u000f"}, m5175d2 = {"Lcom/zykj/base/utils/XToastUtils;", "", "()V", C3380c.f1962O, "", "message", "", "duration", "", "Ljava/lang/Exception;", "Lkotlin/Exception;", "info", "success", "toast", "warning", "base_release"}, m5176k = 1, m5177mv = {1, 5, 1}, m5179xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SuppressLint({"CheckResult"})
/* loaded from: classes2.dex */
public final class XToastUtils {
    public static final XToastUtils INSTANCE = new XToastUtils();

    static {
        AbstractC4407b.a.m5491j().m5494l(17).m5493k(200).m5492i(false);
    }

    private XToastUtils() {
    }

    @MainThread
    public final void error(CharSequence message) {
        Intrinsics.checkNotNullParameter(message, "message");
        AbstractC4407b.m5460d(AbstractC3799b.m4958a(), message).show();
    }

    @MainThread
    public final void info(CharSequence message) {
        Intrinsics.checkNotNullParameter(message, "message");
        AbstractC4407b.m5465i(AbstractC3799b.m4958a(), message).show();
    }

    @MainThread
    public final void success(CharSequence message) {
        Intrinsics.checkNotNullParameter(message, "message");
        AbstractC4407b.m5475s(AbstractC3799b.m4958a(), message).show();
    }

    @MainThread
    public final void toast(CharSequence message) {
        Intrinsics.checkNotNullParameter(message, "message");
        AbstractC4407b.m5470n(AbstractC3799b.m4958a(), message).show();
    }

    @MainThread
    public final void warning(CharSequence message) {
        Intrinsics.checkNotNullParameter(message, "message");
        AbstractC4407b.m5480x(AbstractC3799b.m4958a(), message).show();
    }

    @MainThread
    public final void error(Exception error) {
        Intrinsics.checkNotNullParameter(error, "error");
        Context contextM4958a = AbstractC3799b.m4958a();
        String message = error.getMessage();
        Intrinsics.checkNotNull(message);
        AbstractC4407b.m5460d(contextM4958a, message).show();
    }

    @MainThread
    public final void info(@StringRes int message) {
        AbstractC4407b.m5463g(AbstractC3799b.m4958a(), message).show();
    }

    @MainThread
    public final void success(@StringRes int message) {
        AbstractC4407b.m5473q(AbstractC3799b.m4958a(), message).show();
    }

    @MainThread
    public final void toast(@StringRes int message) {
        AbstractC4407b.m5468l(AbstractC3799b.m4958a(), message).show();
    }

    @MainThread
    public final void warning(@StringRes int message) {
        AbstractC4407b.m5478v(AbstractC3799b.m4958a(), message).show();
    }

    @MainThread
    public final void error(@StringRes int message) {
        AbstractC4407b.m5458b(AbstractC3799b.m4958a(), message).show();
    }

    @MainThread
    public final void info(CharSequence message, int duration) {
        Intrinsics.checkNotNullParameter(message, "message");
        AbstractC4407b.m5466j(AbstractC3799b.m4958a(), message, duration).show();
    }

    @MainThread
    public final void success(CharSequence message, int duration) {
        Intrinsics.checkNotNullParameter(message, "message");
        AbstractC4407b.m5476t(AbstractC3799b.m4958a(), message, duration).show();
    }

    @MainThread
    public final void toast(CharSequence message, int duration) {
        Intrinsics.checkNotNullParameter(message, "message");
        AbstractC4407b.m5471o(AbstractC3799b.m4958a(), message, duration).show();
    }

    @MainThread
    public final void warning(CharSequence message, int duration) {
        Intrinsics.checkNotNullParameter(message, "message");
        AbstractC4407b.m5481y(AbstractC3799b.m4958a(), message, duration).show();
    }

    @MainThread
    public final void error(CharSequence message, int duration) {
        Intrinsics.checkNotNullParameter(message, "message");
        AbstractC4407b.m5461e(AbstractC3799b.m4958a(), message, duration).show();
    }

    @MainThread
    public final void info(@StringRes int message, int duration) {
        AbstractC4407b.m5464h(AbstractC3799b.m4958a(), message, duration).show();
    }

    @MainThread
    public final void success(@StringRes int message, int duration) {
        AbstractC4407b.m5474r(AbstractC3799b.m4958a(), message, duration).show();
    }

    @MainThread
    public final void toast(@StringRes int message, int duration) {
        AbstractC4407b.m5469m(AbstractC3799b.m4958a(), message, duration).show();
    }

    @MainThread
    public final void warning(@StringRes int message, int duration) {
        AbstractC4407b.m5479w(AbstractC3799b.m4958a(), message, duration).show();
    }

    @MainThread
    public final void error(@StringRes int message, int duration) {
        AbstractC4407b.m5459c(AbstractC3799b.m4958a(), message, duration).show();
    }
}
