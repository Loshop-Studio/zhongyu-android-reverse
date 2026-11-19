package io.reactivex.disposables;

import io.reactivex.internal.disposables.EmptyDisposable;
import p277v6.InterfaceC10250b;
import p321z6.AbstractC10726b;

/* renamed from: io.reactivex.disposables.a */
/* loaded from: classes5.dex */
public abstract class AbstractC8965a {
    /* renamed from: a */
    public static InterfaceC10250b m15521a() {
        return EmptyDisposable.INSTANCE;
    }

    /* renamed from: b */
    public static InterfaceC10250b m15522b(Runnable runnable) {
        AbstractC10726b.m20030c(runnable, "run is null");
        return new RunnableDisposable(runnable);
    }
}
