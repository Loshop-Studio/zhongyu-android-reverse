package io.reactivex.internal.util;

import p215q9.InterfaceC8989c;

/* loaded from: classes5.dex */
public interface QueueDrain<T, U> {
    boolean accept(InterfaceC8989c interfaceC8989c, T t10);

    boolean cancelled();

    boolean done();

    boolean enter();

    Throwable error();

    int leave(int i10);

    long produced(long j10);

    long requested();
}
