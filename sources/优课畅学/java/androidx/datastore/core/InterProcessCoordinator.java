package androidx.datastore.core;

import p169l8.InterfaceC9266c;
import p179m7.InterfaceC9324c;
import p300x7.InterfaceC10570l;
import p300x7.InterfaceC10574p;

/* loaded from: classes2.dex */
public interface InterProcessCoordinator {
    InterfaceC9266c getUpdateNotifications();

    Object getVersion(InterfaceC9324c<? super Integer> interfaceC9324c);

    Object incrementAndGetVersion(InterfaceC9324c<? super Integer> interfaceC9324c);

    <T> Object lock(InterfaceC10570l interfaceC10570l, InterfaceC9324c<? super T> interfaceC9324c);

    <T> Object tryLock(InterfaceC10574p interfaceC10574p, InterfaceC9324c<? super T> interfaceC9324c);
}
