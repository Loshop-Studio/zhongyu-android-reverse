package androidx.datastore.core;

import androidx.annotation.GuardedBy;
import java.io.File;
import java.io.IOException;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;
import p123h7.C8736p;
import p300x7.InterfaceC10559a;
import p300x7.InterfaceC10570l;

/* loaded from: classes2.dex */
public final class FileStorage<T> implements Storage<T> {
    public static final Companion Companion = new Companion(null);

    @GuardedBy("activeFilesLock")
    private static final Set<String> activeFiles = new LinkedHashSet();
    private static final Object activeFilesLock = new Object();
    private final InterfaceC10570l coordinatorProducer;
    private final InterfaceC10559a produceFile;
    private final Serializer<T> serializer;

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC9126n abstractC9126n) {
            this();
        }

        public final Set<String> getActiveFiles$datastore_core_release() {
            return FileStorage.activeFiles;
        }

        public final Object getActiveFilesLock$datastore_core_release() {
            return FileStorage.activeFilesLock;
        }

        private Companion() {
        }
    }

    public FileStorage(Serializer<T> serializer, InterfaceC10570l coordinatorProducer, InterfaceC10559a produceFile) {
        AbstractC9133u.m16133g(serializer, "serializer");
        AbstractC9133u.m16133g(coordinatorProducer, "coordinatorProducer");
        AbstractC9133u.m16133g(produceFile, "produceFile");
        this.serializer = serializer;
        this.coordinatorProducer = coordinatorProducer;
        this.produceFile = produceFile;
    }

    @Override // androidx.datastore.core.Storage
    public StorageConnection<T> createConnection() throws IOException {
        final File file = ((File) this.produceFile.invoke()).getCanonicalFile();
        synchronized (activeFilesLock) {
            String path = file.getAbsolutePath();
            Set<String> set = activeFiles;
            if (set.contains(path)) {
                throw new IllegalStateException(("There are multiple DataStores active for the same file: " + path + ". You should either maintain your DataStore as a singleton or confirm that there is no two DataStore's active on the same file (by confirming that the scope is cancelled).").toString());
            }
            AbstractC9133u.m16132f(path, "path");
            set.add(path);
        }
        AbstractC9133u.m16132f(file, "file");
        return new FileStorageConnection(file, this.serializer, (InterProcessCoordinator) this.coordinatorProducer.invoke(file), new InterfaceC10559a() { // from class: androidx.datastore.core.FileStorage.createConnection.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // p300x7.InterfaceC10559a
            public /* bridge */ /* synthetic */ Object invoke() {
                m27177invoke();
                return C8736p.f16368a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m27177invoke() {
                Companion companion = FileStorage.Companion;
                Object activeFilesLock$datastore_core_release = companion.getActiveFilesLock$datastore_core_release();
                File file2 = file;
                synchronized (activeFilesLock$datastore_core_release) {
                    companion.getActiveFiles$datastore_core_release().remove(file2.getAbsolutePath());
                    C8736p c8736p = C8736p.f16368a;
                }
            }
        });
    }

    public /* synthetic */ FileStorage(Serializer serializer, InterfaceC10570l interfaceC10570l, InterfaceC10559a interfaceC10559a, int i10, AbstractC9126n abstractC9126n) {
        this(serializer, (i10 & 2) != 0 ? new InterfaceC10570l() { // from class: androidx.datastore.core.FileStorage.1
            @Override // p300x7.InterfaceC10570l
            public final InterProcessCoordinator invoke(File it) {
                AbstractC9133u.m16133g(it, "it");
                return InterProcessCoordinator_jvmKt.createSingleProcessCoordinator(it);
            }
        } : interfaceC10570l, interfaceC10559a);
    }
}
