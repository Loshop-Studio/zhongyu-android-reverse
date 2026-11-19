package androidx.datastore.core;

import p123h7.C8736p;
import p179m7.InterfaceC9324c;

/* loaded from: classes2.dex */
public interface DataMigration<T> {
    Object cleanUp(InterfaceC9324c<? super C8736p> interfaceC9324c);

    Object migrate(T t10, InterfaceC9324c<? super T> interfaceC9324c);

    Object shouldMigrate(T t10, InterfaceC9324c<? super Boolean> interfaceC9324c);
}
