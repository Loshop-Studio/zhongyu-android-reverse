package androidx.datastore.core.okio;

import androidx.datastore.core.InterProcessCoordinator;
import androidx.datastore.core.Storage;
import androidx.datastore.core.StorageConnection;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.AbstractC9078a;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;
import okio.FileSystem;
import okio.Path;
import p123h7.C8736p;
import p123h7.InterfaceC8724d;
import p300x7.InterfaceC10559a;
import p300x7.InterfaceC10574p;

/* loaded from: classes2.dex */
public final class OkioStorage<T> implements Storage<T> {
    public static final Companion Companion = new Companion(null);
    private static final Set<String> activeFiles = new LinkedHashSet();
    private static final Synchronizer activeFilesLock = new Synchronizer();
    private final InterfaceC8724d canonicalPath$delegate;
    private final InterfaceC10574p coordinatorProducer;
    private final FileSystem fileSystem;
    private final InterfaceC10559a producePath;
    private final OkioSerializer<T> serializer;

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC9126n abstractC9126n) {
            this();
        }

        public final Set<String> getActiveFiles$datastore_core_okio() {
            return OkioStorage.activeFiles;
        }

        public final Synchronizer getActiveFilesLock() {
            return OkioStorage.activeFilesLock;
        }

        private Companion() {
        }
    }

    public OkioStorage(FileSystem fileSystem, OkioSerializer<T> serializer, InterfaceC10574p coordinatorProducer, InterfaceC10559a producePath) {
        AbstractC9133u.m16133g(fileSystem, "fileSystem");
        AbstractC9133u.m16133g(serializer, "serializer");
        AbstractC9133u.m16133g(coordinatorProducer, "coordinatorProducer");
        AbstractC9133u.m16133g(producePath, "producePath");
        this.fileSystem = fileSystem;
        this.serializer = serializer;
        this.coordinatorProducer = coordinatorProducer;
        this.producePath = producePath;
        this.canonicalPath$delegate = AbstractC9078a.m15924b(new InterfaceC10559a(this) { // from class: androidx.datastore.core.okio.OkioStorage$canonicalPath$2
            final /* synthetic */ OkioStorage<T> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.this$0 = this;
            }

            @Override // p300x7.InterfaceC10559a
            public final Path invoke() {
                Path path = (Path) ((OkioStorage) this.this$0).producePath.invoke();
                boolean zIsAbsolute = path.isAbsolute();
                OkioStorage<T> okioStorage = this.this$0;
                if (zIsAbsolute) {
                    return path.normalized();
                }
                throw new IllegalStateException(("OkioStorage requires absolute paths, but did not get an absolute path from producePath = " + ((OkioStorage) okioStorage).producePath + ", instead got " + path).toString());
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Path getCanonicalPath() {
        return (Path) this.canonicalPath$delegate.getValue();
    }

    @Override // androidx.datastore.core.Storage
    public StorageConnection<T> createConnection() {
        String string = getCanonicalPath().toString();
        synchronized (activeFilesLock) {
            Set<String> set = activeFiles;
            if (set.contains(string)) {
                throw new IllegalStateException(("There are multiple DataStores active for the same file: " + string + ". You should either maintain your DataStore as a singleton or confirm that there is no two DataStore's active on the same file (by confirming that the scope is cancelled).").toString());
            }
            set.add(string);
        }
        return new OkioStorageConnection(this.fileSystem, getCanonicalPath(), this.serializer, (InterProcessCoordinator) this.coordinatorProducer.invoke(getCanonicalPath(), this.fileSystem), new InterfaceC10559a(this) { // from class: androidx.datastore.core.okio.OkioStorage.createConnection.2
            final /* synthetic */ OkioStorage<T> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.this$0 = this;
            }

            @Override // p300x7.InterfaceC10559a
            public /* bridge */ /* synthetic */ Object invoke() {
                m27179invoke();
                return C8736p.f16368a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m27179invoke() {
                Companion companion = OkioStorage.Companion;
                Synchronizer activeFilesLock2 = companion.getActiveFilesLock();
                OkioStorage<T> okioStorage = this.this$0;
                synchronized (activeFilesLock2) {
                    companion.getActiveFiles$datastore_core_okio().remove(okioStorage.getCanonicalPath().toString());
                    C8736p c8736p = C8736p.f16368a;
                }
            }
        });
    }

    public /* synthetic */ OkioStorage(FileSystem fileSystem, OkioSerializer okioSerializer, InterfaceC10574p interfaceC10574p, InterfaceC10559a interfaceC10559a, int i10, AbstractC9126n abstractC9126n) {
        this(fileSystem, okioSerializer, (i10 & 4) != 0 ? new InterfaceC10574p() { // from class: androidx.datastore.core.okio.OkioStorage.1
            @Override // p300x7.InterfaceC10574p
            public final InterProcessCoordinator invoke(Path path, FileSystem fileSystem2) {
                AbstractC9133u.m16133g(path, "path");
                AbstractC9133u.m16133g(fileSystem2, "<anonymous parameter 1>");
                return OkioStorageKt.createSingleProcessCoordinator(path);
            }
        } : interfaceC10574p, interfaceC10559a);
    }
}
