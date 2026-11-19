package io.reactivex.internal.util;

import p193y5.InterfaceC7917c;

/* loaded from: classes4.dex */
public interface QueueDrain<T, U> {
    boolean accept(InterfaceC7917c interfaceC7917c, T t6);

    boolean cancelled();

    boolean done();

    boolean enter();

    Throwable error();

    int leave(int i6);

    long produced(long j6);

    long requested();
}
