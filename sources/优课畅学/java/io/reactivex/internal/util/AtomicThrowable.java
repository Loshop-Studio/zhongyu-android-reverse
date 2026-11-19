package io.reactivex.internal.util;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes5.dex */
public final class AtomicThrowable extends AtomicReference<Throwable> {
    /* renamed from: a */
    public boolean m15576a(Throwable th) {
        return ExceptionHelper.m15578a(this, th);
    }

    /* renamed from: b */
    public Throwable m15577b() {
        return ExceptionHelper.m15579b(this);
    }
}
