package androidx.datastore.core;

import androidx.datastore.core.handlers.NoOpCorruptionHandler;
import androidx.datastore.core.handlers.ReplaceFileCorruptionHandler;
import java.io.File;
import java.util.List;
import kotlin.jvm.internal.AbstractC9133u;
import kotlinx.coroutines.AbstractC9165e;
import p134i7.AbstractC8807u;
import p134i7.AbstractC8809v;
import p135i8.AbstractC8874s1;
import p135i8.C8843i0;
import p135i8.InterfaceC8822b0;
import p300x7.InterfaceC10559a;
import p300x7.InterfaceC10570l;

/* loaded from: classes2.dex */
public final class MultiProcessDataStoreFactory {
    public static final MultiProcessDataStoreFactory INSTANCE = new MultiProcessDataStoreFactory();

    private MultiProcessDataStoreFactory() {
    }

    public static /* synthetic */ DataStore create$default(MultiProcessDataStoreFactory multiProcessDataStoreFactory, Storage storage, ReplaceFileCorruptionHandler replaceFileCorruptionHandler, List list, InterfaceC8822b0 interfaceC8822b0, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            replaceFileCorruptionHandler = null;
        }
        if ((i10 & 4) != 0) {
            list = AbstractC8809v.m14771n();
        }
        if ((i10 & 8) != 0) {
            interfaceC8822b0 = AbstractC9165e.m16552a(C8843i0.m14867b().plus(AbstractC8874s1.m14910b(null, 1, null)));
        }
        return multiProcessDataStoreFactory.create(storage, replaceFileCorruptionHandler, list, interfaceC8822b0);
    }

    public final <T> DataStore<T> create(Serializer<T> serializer, ReplaceFileCorruptionHandler<T> replaceFileCorruptionHandler, List<? extends DataMigration<T>> migrations, InterfaceC10559a produceFile) {
        AbstractC9133u.m16133g(serializer, "serializer");
        AbstractC9133u.m16133g(migrations, "migrations");
        AbstractC9133u.m16133g(produceFile, "produceFile");
        return create$default(this, serializer, replaceFileCorruptionHandler, migrations, null, produceFile, 8, null);
    }

    public final <T> DataStore<T> create(Serializer<T> serializer, ReplaceFileCorruptionHandler<T> replaceFileCorruptionHandler, InterfaceC10559a produceFile) {
        AbstractC9133u.m16133g(serializer, "serializer");
        AbstractC9133u.m16133g(produceFile, "produceFile");
        return create$default(this, serializer, replaceFileCorruptionHandler, null, null, produceFile, 12, null);
    }

    public final <T> DataStore<T> create(Serializer<T> serializer, InterfaceC10559a produceFile) {
        AbstractC9133u.m16133g(serializer, "serializer");
        AbstractC9133u.m16133g(produceFile, "produceFile");
        return create$default(this, serializer, null, null, null, produceFile, 14, null);
    }

    public static /* synthetic */ DataStore create$default(MultiProcessDataStoreFactory multiProcessDataStoreFactory, Serializer serializer, ReplaceFileCorruptionHandler replaceFileCorruptionHandler, List list, InterfaceC8822b0 interfaceC8822b0, InterfaceC10559a interfaceC10559a, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            replaceFileCorruptionHandler = null;
        }
        if ((i10 & 4) != 0) {
            list = AbstractC8809v.m14771n();
        }
        if ((i10 & 8) != 0) {
            interfaceC8822b0 = AbstractC9165e.m16552a(C8843i0.m14867b().plus(AbstractC8874s1.m14910b(null, 1, null)));
        }
        return multiProcessDataStoreFactory.create(serializer, replaceFileCorruptionHandler, list, interfaceC8822b0, interfaceC10559a);
    }

    public final <T> DataStore<T> create(Storage<T> storage) {
        AbstractC9133u.m16133g(storage, "storage");
        return create$default(this, storage, null, null, null, 14, null);
    }

    public final <T> DataStore<T> create(Storage<T> storage, ReplaceFileCorruptionHandler<T> replaceFileCorruptionHandler) {
        AbstractC9133u.m16133g(storage, "storage");
        return create$default(this, storage, replaceFileCorruptionHandler, null, null, 12, null);
    }

    public final <T> DataStore<T> create(Storage<T> storage, ReplaceFileCorruptionHandler<T> replaceFileCorruptionHandler, List<? extends DataMigration<T>> migrations) {
        AbstractC9133u.m16133g(storage, "storage");
        AbstractC9133u.m16133g(migrations, "migrations");
        return create$default(this, storage, replaceFileCorruptionHandler, migrations, null, 8, null);
    }

    public final <T> DataStore<T> create(Storage<T> storage, ReplaceFileCorruptionHandler<T> replaceFileCorruptionHandler, List<? extends DataMigration<T>> migrations, InterfaceC8822b0 scope) {
        AbstractC9133u.m16133g(storage, "storage");
        AbstractC9133u.m16133g(migrations, "migrations");
        AbstractC9133u.m16133g(scope, "scope");
        List listM14755e = AbstractC8807u.m14755e(DataMigrationInitializer.Companion.getInitializer(migrations));
        if (replaceFileCorruptionHandler == null) {
            replaceFileCorruptionHandler = (ReplaceFileCorruptionHandler<T>) new NoOpCorruptionHandler();
        }
        return new DataStoreImpl(storage, listM14755e, replaceFileCorruptionHandler, scope);
    }

    public final <T> DataStore<T> create(Serializer<T> serializer, ReplaceFileCorruptionHandler<T> replaceFileCorruptionHandler, List<? extends DataMigration<T>> migrations, final InterfaceC8822b0 scope, InterfaceC10559a produceFile) {
        AbstractC9133u.m16133g(serializer, "serializer");
        AbstractC9133u.m16133g(migrations, "migrations");
        AbstractC9133u.m16133g(scope, "scope");
        AbstractC9133u.m16133g(produceFile, "produceFile");
        FileStorage fileStorage = new FileStorage(serializer, new InterfaceC10570l() { // from class: androidx.datastore.core.MultiProcessDataStoreFactory.create.1
            {
                super(1);
            }

            @Override // p300x7.InterfaceC10570l
            public final InterProcessCoordinator invoke(File it) {
                AbstractC9133u.m16133g(it, "it");
                return new MultiProcessCoordinator(scope.getCoroutineContext(), it);
            }
        }, produceFile);
        List listM14755e = AbstractC8807u.m14755e(DataMigrationInitializer.Companion.getInitializer(migrations));
        if (replaceFileCorruptionHandler == null) {
            replaceFileCorruptionHandler = (ReplaceFileCorruptionHandler<T>) new NoOpCorruptionHandler();
        }
        return new DataStoreImpl(fileStorage, listM14755e, replaceFileCorruptionHandler, scope);
    }
}
