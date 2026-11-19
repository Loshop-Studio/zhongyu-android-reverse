package androidx.datastore.preferences.core;

import androidx.datastore.core.DataMigration;
import androidx.datastore.core.DataStore;
import androidx.datastore.core.DataStoreFactory;
import androidx.datastore.core.FileStorage;
import androidx.datastore.core.Storage;
import androidx.datastore.core.handlers.ReplaceFileCorruptionHandler;
import java.io.File;
import java.util.List;
import kotlin.jvm.internal.AbstractC9133u;
import kotlinx.coroutines.AbstractC9165e;
import okio.Path;
import p134i7.AbstractC8809v;
import p135i8.AbstractC8874s1;
import p135i8.C8843i0;
import p135i8.InterfaceC8822b0;
import p256t7.AbstractC10123h;
import p300x7.InterfaceC10559a;

/* loaded from: classes.dex */
public final class PreferenceDataStoreFactory {
    public static final PreferenceDataStoreFactory INSTANCE = new PreferenceDataStoreFactory();

    private PreferenceDataStoreFactory() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DataStore create$default(PreferenceDataStoreFactory preferenceDataStoreFactory, Storage storage, ReplaceFileCorruptionHandler replaceFileCorruptionHandler, List list, InterfaceC8822b0 interfaceC8822b0, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            replaceFileCorruptionHandler = null;
        }
        if ((i10 & 4) != 0) {
            list = AbstractC8809v.m14771n();
        }
        if ((i10 & 8) != 0) {
            interfaceC8822b0 = AbstractC9165e.m16552a(Actual_jvmAndroidKt.ioDispatcher().plus(AbstractC8874s1.m14910b(null, 1, null)));
        }
        return preferenceDataStoreFactory.create((Storage<Preferences>) storage, (ReplaceFileCorruptionHandler<Preferences>) replaceFileCorruptionHandler, (List<? extends DataMigration<Preferences>>) list, interfaceC8822b0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DataStore createWithPath$default(PreferenceDataStoreFactory preferenceDataStoreFactory, ReplaceFileCorruptionHandler replaceFileCorruptionHandler, List list, InterfaceC8822b0 interfaceC8822b0, InterfaceC10559a interfaceC10559a, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            replaceFileCorruptionHandler = null;
        }
        if ((i10 & 2) != 0) {
            list = AbstractC8809v.m14771n();
        }
        if ((i10 & 4) != 0) {
            interfaceC8822b0 = AbstractC9165e.m16552a(Actual_jvmAndroidKt.ioDispatcher().plus(AbstractC8874s1.m14910b(null, 1, null)));
        }
        return preferenceDataStoreFactory.createWithPath(replaceFileCorruptionHandler, list, interfaceC8822b0, interfaceC10559a);
    }

    public final DataStore<Preferences> create(Storage<Preferences> storage) {
        AbstractC9133u.m16133g(storage, "storage");
        return create$default(this, storage, (ReplaceFileCorruptionHandler) null, (List) null, (InterfaceC8822b0) null, 14, (Object) null);
    }

    public final DataStore<Preferences> createWithPath(ReplaceFileCorruptionHandler<Preferences> replaceFileCorruptionHandler, List<? extends DataMigration<Preferences>> migrations, InterfaceC10559a produceFile) {
        AbstractC9133u.m16133g(migrations, "migrations");
        AbstractC9133u.m16133g(produceFile, "produceFile");
        return createWithPath$default(this, replaceFileCorruptionHandler, migrations, null, produceFile, 4, null);
    }

    public final DataStore<Preferences> create(Storage<Preferences> storage, ReplaceFileCorruptionHandler<Preferences> replaceFileCorruptionHandler) {
        AbstractC9133u.m16133g(storage, "storage");
        return create$default(this, storage, replaceFileCorruptionHandler, (List) null, (InterfaceC8822b0) null, 12, (Object) null);
    }

    public final DataStore<Preferences> createWithPath(ReplaceFileCorruptionHandler<Preferences> replaceFileCorruptionHandler, InterfaceC10559a produceFile) {
        AbstractC9133u.m16133g(produceFile, "produceFile");
        return createWithPath$default(this, replaceFileCorruptionHandler, null, null, produceFile, 6, null);
    }

    public final DataStore<Preferences> create(Storage<Preferences> storage, ReplaceFileCorruptionHandler<Preferences> replaceFileCorruptionHandler, List<? extends DataMigration<Preferences>> migrations) {
        AbstractC9133u.m16133g(storage, "storage");
        AbstractC9133u.m16133g(migrations, "migrations");
        return create$default(this, storage, replaceFileCorruptionHandler, migrations, (InterfaceC8822b0) null, 8, (Object) null);
    }

    public final DataStore<Preferences> createWithPath(InterfaceC10559a produceFile) {
        AbstractC9133u.m16133g(produceFile, "produceFile");
        return createWithPath$default(this, null, null, null, produceFile, 7, null);
    }

    public final DataStore<Preferences> create(ReplaceFileCorruptionHandler<Preferences> replaceFileCorruptionHandler, List<? extends DataMigration<Preferences>> migrations, InterfaceC10559a produceFile) {
        AbstractC9133u.m16133g(migrations, "migrations");
        AbstractC9133u.m16133g(produceFile, "produceFile");
        return create$default(this, replaceFileCorruptionHandler, migrations, (InterfaceC8822b0) null, produceFile, 4, (Object) null);
    }

    public final DataStore<Preferences> createWithPath(ReplaceFileCorruptionHandler<Preferences> replaceFileCorruptionHandler, List<? extends DataMigration<Preferences>> migrations, InterfaceC8822b0 scope, final InterfaceC10559a produceFile) {
        AbstractC9133u.m16133g(migrations, "migrations");
        AbstractC9133u.m16133g(scope, "scope");
        AbstractC9133u.m16133g(produceFile, "produceFile");
        return create(replaceFileCorruptionHandler, migrations, scope, new InterfaceC10559a() { // from class: androidx.datastore.preferences.core.PreferenceDataStoreFactory.createWithPath.1
            {
                super(0);
            }

            @Override // p300x7.InterfaceC10559a
            public final File invoke() {
                return ((Path) produceFile.invoke()).toFile();
            }
        });
    }

    public final DataStore<Preferences> create(ReplaceFileCorruptionHandler<Preferences> replaceFileCorruptionHandler, InterfaceC10559a produceFile) {
        AbstractC9133u.m16133g(produceFile, "produceFile");
        return create$default(this, replaceFileCorruptionHandler, (List) null, (InterfaceC8822b0) null, produceFile, 6, (Object) null);
    }

    public final DataStore<Preferences> create(InterfaceC10559a produceFile) {
        AbstractC9133u.m16133g(produceFile, "produceFile");
        return create$default(this, (ReplaceFileCorruptionHandler) null, (List) null, (InterfaceC8822b0) null, produceFile, 7, (Object) null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DataStore create$default(PreferenceDataStoreFactory preferenceDataStoreFactory, ReplaceFileCorruptionHandler replaceFileCorruptionHandler, List list, InterfaceC8822b0 interfaceC8822b0, InterfaceC10559a interfaceC10559a, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            replaceFileCorruptionHandler = null;
        }
        if ((i10 & 2) != 0) {
            list = AbstractC8809v.m14771n();
        }
        if ((i10 & 4) != 0) {
            interfaceC8822b0 = AbstractC9165e.m16552a(C8843i0.m14867b().plus(AbstractC8874s1.m14910b(null, 1, null)));
        }
        return preferenceDataStoreFactory.create((ReplaceFileCorruptionHandler<Preferences>) replaceFileCorruptionHandler, (List<? extends DataMigration<Preferences>>) list, interfaceC8822b0, interfaceC10559a);
    }

    public final DataStore<Preferences> create(ReplaceFileCorruptionHandler<Preferences> replaceFileCorruptionHandler, List<? extends DataMigration<Preferences>> migrations, InterfaceC8822b0 scope, final InterfaceC10559a produceFile) {
        AbstractC9133u.m16133g(migrations, "migrations");
        AbstractC9133u.m16133g(scope, "scope");
        AbstractC9133u.m16133g(produceFile, "produceFile");
        return new PreferenceDataStore(create(new FileStorage(PreferencesFileSerializer.INSTANCE, null, new InterfaceC10559a() { // from class: androidx.datastore.preferences.core.PreferenceDataStoreFactory$create$delegate$1
            {
                super(0);
            }

            @Override // p300x7.InterfaceC10559a
            public final File invoke() {
                File file = (File) produceFile.invoke();
                if (AbstractC9133u.m16128b(AbstractC10123h.m18878e(file), "preferences_pb")) {
                    File absoluteFile = file.getAbsoluteFile();
                    AbstractC9133u.m16132f(absoluteFile, "file.absoluteFile");
                    return absoluteFile;
                }
                throw new IllegalStateException(("File extension for file: " + file + " does not match required extension for Preferences file: preferences_pb").toString());
            }
        }, 2, null), replaceFileCorruptionHandler, migrations, scope));
    }

    public final DataStore<Preferences> create(Storage<Preferences> storage, ReplaceFileCorruptionHandler<Preferences> replaceFileCorruptionHandler, List<? extends DataMigration<Preferences>> migrations, InterfaceC8822b0 scope) {
        AbstractC9133u.m16133g(storage, "storage");
        AbstractC9133u.m16133g(migrations, "migrations");
        AbstractC9133u.m16133g(scope, "scope");
        return new PreferenceDataStore(DataStoreFactory.INSTANCE.create(storage, replaceFileCorruptionHandler, migrations, scope));
    }
}
