package com.zykj.base.utils;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.annotation.Keep;
import androidx.annotation.MainThread;
import androidx.annotation.StringRes;
import kotlin.jvm.internal.AbstractC9133u;
import p150k1.AbstractC9051b;
import p295x2.AbstractC10492b;

@Keep
@SuppressLint({"CheckResult"})
/* loaded from: classes4.dex */
public final class XToastUtils {
    public static final XToastUtils INSTANCE = new XToastUtils();

    static {
        AbstractC10492b.b.m19736k().m19739m(17).m19738l(200).m19737j(false);
    }

    private XToastUtils() {
    }

    @MainThread
    public final void error(CharSequence message) {
        AbstractC9133u.m16133g(message, "message");
        AbstractC10492b.m19706f(AbstractC9051b.m15847b(), message).show();
    }

    @MainThread
    public final void info(CharSequence message) {
        AbstractC9133u.m16133g(message, "message");
        AbstractC10492b.m19711k(AbstractC9051b.m15847b(), message).show();
    }

    @MainThread
    public final void success(CharSequence message) {
        AbstractC9133u.m16133g(message, "message");
        AbstractC10492b.m19721u(AbstractC9051b.m15847b(), message).show();
    }

    @MainThread
    public final void toast(CharSequence message) {
        AbstractC9133u.m16133g(message, "message");
        AbstractC10492b.m19716p(AbstractC9051b.m15847b(), message).show();
    }

    @MainThread
    public final void warning(CharSequence message) {
        AbstractC9133u.m16133g(message, "message");
        AbstractC10492b.m19726z(AbstractC9051b.m15847b(), message).show();
    }

    @MainThread
    public final void error(Exception error) {
        AbstractC9133u.m16133g(error, "error");
        Context contextM15847b = AbstractC9051b.m15847b();
        String message = error.getMessage();
        AbstractC9133u.m16130d(message);
        AbstractC10492b.m19706f(contextM15847b, message).show();
    }

    @MainThread
    public final void info(@StringRes int i10) {
        AbstractC10492b.m19709i(AbstractC9051b.m15847b(), i10).show();
    }

    @MainThread
    public final void success(@StringRes int i10) {
        AbstractC10492b.m19719s(AbstractC9051b.m15847b(), i10).show();
    }

    @MainThread
    public final void toast(@StringRes int i10) {
        AbstractC10492b.m19714n(AbstractC9051b.m15847b(), i10).show();
    }

    @MainThread
    public final void warning(@StringRes int i10) {
        AbstractC10492b.m19724x(AbstractC9051b.m15847b(), i10).show();
    }

    @MainThread
    public final void error(@StringRes int i10) {
        AbstractC10492b.m19704d(AbstractC9051b.m15847b(), i10).show();
    }

    @MainThread
    public final void info(CharSequence message, int i10) {
        AbstractC9133u.m16133g(message, "message");
        AbstractC10492b.m19712l(AbstractC9051b.m15847b(), message, i10).show();
    }

    @MainThread
    public final void success(CharSequence message, int i10) {
        AbstractC9133u.m16133g(message, "message");
        AbstractC10492b.m19722v(AbstractC9051b.m15847b(), message, i10).show();
    }

    @MainThread
    public final void toast(CharSequence message, int i10) {
        AbstractC9133u.m16133g(message, "message");
        AbstractC10492b.m19717q(AbstractC9051b.m15847b(), message, i10).show();
    }

    @MainThread
    public final void warning(CharSequence message, int i10) {
        AbstractC9133u.m16133g(message, "message");
        AbstractC10492b.m19699A(AbstractC9051b.m15847b(), message, i10).show();
    }

    @MainThread
    public final void error(CharSequence message, int i10) {
        AbstractC9133u.m16133g(message, "message");
        AbstractC10492b.m19707g(AbstractC9051b.m15847b(), message, i10).show();
    }

    @MainThread
    public final void info(@StringRes int i10, int i11) {
        AbstractC10492b.m19710j(AbstractC9051b.m15847b(), i10, i11).show();
    }

    @MainThread
    public final void success(@StringRes int i10, int i11) {
        AbstractC10492b.m19720t(AbstractC9051b.m15847b(), i10, i11).show();
    }

    @MainThread
    public final void toast(@StringRes int i10, int i11) {
        AbstractC10492b.m19715o(AbstractC9051b.m15847b(), i10, i11).show();
    }

    @MainThread
    public final void warning(@StringRes int i10, int i11) {
        AbstractC10492b.m19725y(AbstractC9051b.m15847b(), i10, i11).show();
    }

    @MainThread
    public final void error(@StringRes int i10, int i11) {
        AbstractC10492b.m19705e(AbstractC9051b.m15847b(), i10, i11).show();
    }
}
