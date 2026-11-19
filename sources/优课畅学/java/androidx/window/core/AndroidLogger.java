package androidx.window.core;

import kotlin.jvm.internal.AbstractC9133u;

/* loaded from: classes3.dex */
public final class AndroidLogger implements Logger {
    public static final AndroidLogger INSTANCE = new AndroidLogger();

    private AndroidLogger() {
    }

    @Override // androidx.window.core.Logger
    public void debug(String tag, String message) {
        AbstractC9133u.m16133g(tag, "tag");
        AbstractC9133u.m16133g(message, "message");
    }
}
