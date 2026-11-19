package androidx.datastore;

import android.content.Context;
import androidx.annotation.GuardedBy;
import androidx.datastore.core.DataStore;
import androidx.datastore.core.DataStoreFactory;
import androidx.datastore.core.handlers.ReplaceFileCorruptionHandler;
import androidx.datastore.core.okio.OkioSerializer;
import androidx.datastore.core.okio.OkioStorage;
import java.util.List;
import kotlin.jvm.internal.AbstractC9133u;
import okio.FileSystem;
import okio.Path;
import p009a8.InterfaceC0048d;
import p089e8.InterfaceC8383k;
import p135i8.InterfaceC8822b0;
import p300x7.InterfaceC10559a;
import p300x7.InterfaceC10570l;

/* loaded from: classes2.dex */
public final class DataStoreSingletonDelegate<T> implements InterfaceC0048d {

    @GuardedBy("lock")
    private volatile DataStore<T> INSTANCE;
    private final ReplaceFileCorruptionHandler<T> corruptionHandler;
    private final String fileName;
    private final Object lock;
    private final InterfaceC10570l produceMigrations;
    private final InterfaceC8822b0 scope;
    private final OkioSerializer<T> serializer;

    public DataStoreSingletonDelegate(String fileName, OkioSerializer<T> serializer, ReplaceFileCorruptionHandler<T> replaceFileCorruptionHandler, InterfaceC10570l produceMigrations, InterfaceC8822b0 scope) {
        AbstractC9133u.m16133g(fileName, "fileName");
        AbstractC9133u.m16133g(serializer, "serializer");
        AbstractC9133u.m16133g(produceMigrations, "produceMigrations");
        AbstractC9133u.m16133g(scope, "scope");
        this.fileName = fileName;
        this.serializer = serializer;
        this.corruptionHandler = replaceFileCorruptionHandler;
        this.produceMigrations = produceMigrations;
        this.scope = scope;
        this.lock = new Object();
    }

    @Override // p009a8.InterfaceC0048d
    public DataStore<T> getValue(Context thisRef, InterfaceC8383k property) {
        DataStore<T> dataStore;
        AbstractC9133u.m16133g(thisRef, "thisRef");
        AbstractC9133u.m16133g(property, "property");
        DataStore<T> dataStore2 = this.INSTANCE;
        if (dataStore2 != null) {
            return dataStore2;
        }
        synchronized (this.lock) {
            try {
                if (this.INSTANCE == null) {
                    final Context applicationContext = thisRef.getApplicationContext();
                    DataStoreFactory dataStoreFactory = DataStoreFactory.INSTANCE;
                    OkioStorage okioStorage = new OkioStorage(FileSystem.SYSTEM, this.serializer, null, new InterfaceC10559a() { // from class: androidx.datastore.DataStoreSingletonDelegate$getValue$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        @Override // p300x7.InterfaceC10559a
                        public final Path invoke() {
                            Path.Companion companion = Path.Companion;
                            Context applicationContext2 = applicationContext;
                            AbstractC9133u.m16132f(applicationContext2, "applicationContext");
                            String absolutePath = DataStoreFile.dataStoreFile(applicationContext2, ((DataStoreSingletonDelegate) this).fileName).getAbsolutePath();
                            AbstractC9133u.m16132f(absolutePath, "applicationContext.dataS…le(fileName).absolutePath");
                            return Path.Companion.get$default(companion, absolutePath, false, 1, (Object) null);
                        }
                    }, 4, null);
                    ReplaceFileCorruptionHandler<T> replaceFileCorruptionHandler = this.corruptionHandler;
                    InterfaceC10570l interfaceC10570l = this.produceMigrations;
                    AbstractC9133u.m16132f(applicationContext, "applicationContext");
                    this.INSTANCE = dataStoreFactory.create(okioStorage, replaceFileCorruptionHandler, (List) interfaceC10570l.invoke(applicationContext), this.scope);
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
