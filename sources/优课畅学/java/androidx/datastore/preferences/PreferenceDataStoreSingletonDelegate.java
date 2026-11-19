package androidx.datastore.preferences;

import android.content.Context;
import androidx.annotation.GuardedBy;
import androidx.datastore.core.DataMigration;
import androidx.datastore.core.DataStore;
import androidx.datastore.core.handlers.ReplaceFileCorruptionHandler;
import androidx.datastore.preferences.core.PreferenceDataStoreFactory;
import androidx.datastore.preferences.core.Preferences;
import java.io.File;
import java.util.List;
import kotlin.jvm.internal.AbstractC9133u;
import p009a8.InterfaceC0048d;
import p089e8.InterfaceC8383k;
import p135i8.InterfaceC8822b0;
import p300x7.InterfaceC10559a;
import p300x7.InterfaceC10570l;

/* loaded from: classes.dex */
public final class PreferenceDataStoreSingletonDelegate implements InterfaceC0048d {

    @GuardedBy("lock")
    private volatile DataStore<Preferences> INSTANCE;
    private final ReplaceFileCorruptionHandler<Preferences> corruptionHandler;
    private final Object lock;
    private final String name;
    private final InterfaceC10570l produceMigrations;
    private final InterfaceC8822b0 scope;

    public PreferenceDataStoreSingletonDelegate(String name, ReplaceFileCorruptionHandler<Preferences> replaceFileCorruptionHandler, InterfaceC10570l produceMigrations, InterfaceC8822b0 scope) {
        AbstractC9133u.m16133g(name, "name");
        AbstractC9133u.m16133g(produceMigrations, "produceMigrations");
        AbstractC9133u.m16133g(scope, "scope");
        this.name = name;
        this.corruptionHandler = replaceFileCorruptionHandler;
        this.produceMigrations = produceMigrations;
        this.scope = scope;
        this.lock = new Object();
    }

    @Override // p009a8.InterfaceC0048d
    public DataStore<Preferences> getValue(Context thisRef, InterfaceC8383k property) {
        DataStore<Preferences> dataStore;
        AbstractC9133u.m16133g(thisRef, "thisRef");
        AbstractC9133u.m16133g(property, "property");
        DataStore<Preferences> dataStore2 = this.INSTANCE;
        if (dataStore2 != null) {
            return dataStore2;
        }
        synchronized (this.lock) {
            try {
                if (this.INSTANCE == null) {
                    final Context applicationContext = thisRef.getApplicationContext();
                    PreferenceDataStoreFactory preferenceDataStoreFactory = PreferenceDataStoreFactory.INSTANCE;
                    ReplaceFileCorruptionHandler<Preferences> replaceFileCorruptionHandler = this.corruptionHandler;
                    InterfaceC10570l interfaceC10570l = this.produceMigrations;
                    AbstractC9133u.m16132f(applicationContext, "applicationContext");
                    this.INSTANCE = preferenceDataStoreFactory.create(replaceFileCorruptionHandler, (List<? extends DataMigration<Preferences>>) interfaceC10570l.invoke(applicationContext), this.scope, new InterfaceC10559a() { // from class: androidx.datastore.preferences.PreferenceDataStoreSingletonDelegate$getValue$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        @Override // p300x7.InterfaceC10559a
                        public final File invoke() {
                            Context applicationContext2 = applicationContext;
                            AbstractC9133u.m16132f(applicationContext2, "applicationContext");
                            return PreferenceDataStoreFile.preferencesDataStoreFile(applicationContext2, this.name);
                        }
                    });
                }
                dataStore = this.INSTANCE;
                AbstractC9133u.m16130d(dataStore);
            } catch (Throwable th) {
                throw th;
            }
        }
        return dataStore;
    }
}
