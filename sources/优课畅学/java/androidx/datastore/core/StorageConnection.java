package androidx.datastore.core;

import p123h7.C8736p;
import p179m7.InterfaceC9324c;
import p300x7.InterfaceC10574p;
import p300x7.InterfaceC10575q;

/* loaded from: classes2.dex */
public interface StorageConnection<T> extends Closeable {
    InterProcessCoordinator getCoordinator();

    <R> Object readScope(InterfaceC10575q interfaceC10575q, InterfaceC9324c<? super R> interfaceC9324c);

    Object writeScope(InterfaceC10574p interfaceC10574p, InterfaceC9324c<? super C8736p> interfaceC9324c);
}
