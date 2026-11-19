package io.reactivex.internal.util;

import p010a9.InterfaceC0050c;

/* loaded from: classes5.dex */
public interface QueueDrain<T, U> {
    boolean accept(InterfaceC0050c interfaceC0050c, T t9);

    boolean cancelled();

    boolean done();

    boolean enter();

    Throwable error();

    int leave(int i9);

    long produced(long j9);

    long requested();
}
