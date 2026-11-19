package okio;

import java.io.Closeable;
import java.lang.reflect.InvocationTargetException;
import java.util.List;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9977s;
import kotlin.jvm.internal.AbstractC9979u;
import okio.Path;
import okio.internal.ResourceFileSystem;
import p181hd.InterfaceC9540l;
import p296pd.InterfaceC10659g;
import p309qc.AbstractC10771b;

/* loaded from: classes6.dex */
public abstract class FileSystem implements Closeable {
    public static final Companion Companion = new Companion(null);
    public static final FileSystem RESOURCES;
    public static final FileSystem SYSTEM;
    public static final Path SYSTEM_TEMPORARY_DIRECTORY;

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC9972n abstractC9972n) {
            this();
        }

        public final FileSystem get(java.nio.file.FileSystem fileSystem) {
            AbstractC9979u.m20294g(fileSystem, "<this>");
            return new NioFileSystemWrappingFileSystem(fileSystem);
        }

        private Companion() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [hd.l, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* renamed from: -write$default, reason: not valid java name */
    public static /* synthetic */ Object m34176write$default(FileSystem fileSystem, Path file, boolean z10, InterfaceC9540l writerAction, int i10, Object obj) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        ?? r42;
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: write");
        }
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        AbstractC9979u.m20294g(file, "file");
        AbstractC9979u.m20294g(writerAction, "writerAction");
        BufferedSink bufferedSinkBuffer = Okio.buffer(fileSystem.sink(file, z10));
        Object th = null;
        try {
            Object objInvoke = writerAction.invoke(bufferedSinkBuffer);
            AbstractC9977s.m20286b(1);
            if (bufferedSinkBuffer != null) {
                try {
                    bufferedSinkBuffer.close();
                } catch (Throwable th2) {
                    th = th2;
                }
            }
            AbstractC9977s.m20285a(1);
            r42 = th;
            th = objInvoke;
        } catch (Throwable th3) {
            AbstractC9977s.m20286b(1);
            if (bufferedSinkBuffer != null) {
                try {
                    bufferedSinkBuffer.close();
                } catch (Throwable th4) {
                    AbstractC10771b.m22973a(th3, th4);
                }
            }
            AbstractC9977s.m20285a(1);
            r42 = th3;
        }
        if (r42 == 0) {
            return th;
        }
        throw r42;
    }

    static {
        FileSystem jvmSystemFileSystem;
        try {
            Class.forName("java.nio.file.Files");
            jvmSystemFileSystem = new NioSystemFileSystem();
        } catch (ClassNotFoundException unused) {
            jvmSystemFileSystem = new JvmSystemFileSystem();
        }
        SYSTEM = jvmSystemFileSystem;
        Path.Companion companion = Path.Companion;
        String property = System.getProperty("java.io.tmpdir");
        AbstractC9979u.m20293f(property, "getProperty(...)");
        SYSTEM_TEMPORARY_DIRECTORY = Path.Companion.get$default(companion, property, false, 1, (Object) null);
        ClassLoader classLoader = ResourceFileSystem.class.getClassLoader();
        AbstractC9979u.m20293f(classLoader, "getClassLoader(...)");
        RESOURCES = new ResourceFileSystem(classLoader, false, null, 4, null);
    }

    public static /* synthetic */ Sink appendingSink$default(FileSystem fileSystem, Path path, boolean z10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: appendingSink");
        }
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return fileSystem.appendingSink(path, z10);
    }

    public static /* synthetic */ void createDirectories$default(FileSystem fileSystem, Path path, boolean z10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: createDirectories");
        }
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        fileSystem.createDirectories(path, z10);
    }

    public static /* synthetic */ void createDirectory$default(FileSystem fileSystem, Path path, boolean z10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: createDirectory");
        }
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        fileSystem.createDirectory(path, z10);
    }

    public static /* synthetic */ void delete$default(FileSystem fileSystem, Path path, boolean z10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: delete");
        }
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        fileSystem.delete(path, z10);
    }

    public static /* synthetic */ void deleteRecursively$default(FileSystem fileSystem, Path path, boolean z10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: deleteRecursively");
        }
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        fileSystem.deleteRecursively(path, z10);
    }

    public static final FileSystem get(java.nio.file.FileSystem fileSystem) {
        return Companion.get(fileSystem);
    }

    public static /* synthetic */ InterfaceC10659g listRecursively$default(FileSystem fileSystem, Path path, boolean z10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: listRecursively");
        }
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return fileSystem.listRecursively(path, z10);
    }

    public static /* synthetic */ FileHandle openReadWrite$default(FileSystem fileSystem, Path path, boolean z10, boolean z11, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: openReadWrite");
        }
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        if ((i10 & 4) != 0) {
            z11 = false;
        }
        return fileSystem.openReadWrite(path, z10, z11);
    }

    public static /* synthetic */ Sink sink$default(FileSystem fileSystem, Path path, boolean z10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: sink");
        }
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return fileSystem.sink(path, z10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [hd.l, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* renamed from: -read, reason: not valid java name */
    public final <T> T m34177read(Path file, InterfaceC9540l readerAction) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        ?? r52;
        AbstractC9979u.m20294g(file, "file");
        AbstractC9979u.m20294g(readerAction, "readerAction");
        BufferedSource bufferedSourceBuffer = Okio.buffer(source(file));
        T th = null;
        try {
            ?? Invoke = readerAction.invoke(bufferedSourceBuffer);
            AbstractC9977s.m20286b(1);
            if (bufferedSourceBuffer != null) {
                try {
                    bufferedSourceBuffer.close();
                } catch (Throwable th2) {
                    th = th2;
                }
            }
            AbstractC9977s.m20285a(1);
            T t10 = th;
            th = Invoke;
            r52 = t10;
        } catch (Throwable th3) {
            AbstractC9977s.m20286b(1);
            if (bufferedSourceBuffer != null) {
                try {
                    bufferedSourceBuffer.close();
                } catch (Throwable th4) {
                    AbstractC10771b.m22973a(th3, th4);
                }
            }
            AbstractC9977s.m20285a(1);
            r52 = th3;
        }
        if (r52 == 0) {
            return th;
        }
        throw r52;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [hd.l, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* renamed from: -write, reason: not valid java name */
    public final <T> T m34178write(Path file, boolean z10, InterfaceC9540l writerAction) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        ?? r52;
        AbstractC9979u.m20294g(file, "file");
        AbstractC9979u.m20294g(writerAction, "writerAction");
        BufferedSink bufferedSinkBuffer = Okio.buffer(sink(file, z10));
        T th = null;
        try {
            ?? Invoke = writerAction.invoke(bufferedSinkBuffer);
            AbstractC9977s.m20286b(1);
            if (bufferedSinkBuffer != null) {
                try {
                    bufferedSinkBuffer.close();
                } catch (Throwable th2) {
                    th = th2;
                }
            }
            AbstractC9977s.m20285a(1);
            T t10 = th;
            th = Invoke;
            r52 = t10;
        } catch (Throwable th3) {
            AbstractC9977s.m20286b(1);
            if (bufferedSinkBuffer != null) {
                try {
                    bufferedSinkBuffer.close();
                } catch (Throwable th4) {
                    AbstractC10771b.m22973a(th3, th4);
                }
            }
            AbstractC9977s.m20285a(1);
            r52 = th3;
        }
        if (r52 == 0) {
            return th;
        }
        throw r52;
    }

    public final Sink appendingSink(Path file) {
        AbstractC9979u.m20294g(file, "file");
        return appendingSink(file, false);
    }

    public abstract Sink appendingSink(Path path, boolean z10);

    public abstract void atomicMove(Path path, Path path2);

    public abstract Path canonicalize(Path path);

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    public void copy(Path source, Path target) {
        AbstractC9979u.m20294g(source, "source");
        AbstractC9979u.m20294g(target, "target");
        okio.internal.FileSystem.commonCopy(this, source, target);
    }

    public final void createDirectories(Path dir, boolean z10) {
        AbstractC9979u.m20294g(dir, "dir");
        okio.internal.FileSystem.commonCreateDirectories(this, dir, z10);
    }

    public final void createDirectory(Path dir) {
        AbstractC9979u.m20294g(dir, "dir");
        createDirectory(dir, false);
    }

    public abstract void createDirectory(Path path, boolean z10);

    public abstract void createSymlink(Path path, Path path2);

    public final void delete(Path path) {
        AbstractC9979u.m20294g(path, "path");
        delete(path, false);
    }

    public abstract void delete(Path path, boolean z10);

    public void deleteRecursively(Path fileOrDirectory, boolean z10) {
        AbstractC9979u.m20294g(fileOrDirectory, "fileOrDirectory");
        okio.internal.FileSystem.commonDeleteRecursively(this, fileOrDirectory, z10);
    }

    public final boolean exists(Path path) {
        AbstractC9979u.m20294g(path, "path");
        return okio.internal.FileSystem.commonExists(this, path);
    }

    public abstract List<Path> list(Path path);

    public abstract List<Path> listOrNull(Path path);

    public InterfaceC10659g listRecursively(Path dir, boolean z10) {
        AbstractC9979u.m20294g(dir, "dir");
        return okio.internal.FileSystem.commonListRecursively(this, dir, z10);
    }

    public final FileMetadata metadata(Path path) {
        AbstractC9979u.m20294g(path, "path");
        return okio.internal.FileSystem.commonMetadata(this, path);
    }

    public abstract FileMetadata metadataOrNull(Path path);

    public abstract FileHandle openReadOnly(Path path);

    public final FileHandle openReadWrite(Path file) {
        AbstractC9979u.m20294g(file, "file");
        return openReadWrite(file, false, false);
    }

    public abstract FileHandle openReadWrite(Path path, boolean z10, boolean z11);

    public final Sink sink(Path file) {
        AbstractC9979u.m20294g(file, "file");
        return sink(file, false);
    }

    public abstract Sink sink(Path path, boolean z10);

    public abstract Source source(Path path);

    public final void createDirectories(Path dir) {
        AbstractC9979u.m20294g(dir, "dir");
        createDirectories(dir, false);
    }

    public final void deleteRecursively(Path fileOrDirectory) {
        AbstractC9979u.m20294g(fileOrDirectory, "fileOrDirectory");
        deleteRecursively(fileOrDirectory, false);
    }

    public final InterfaceC10659g listRecursively(Path dir) {
        AbstractC9979u.m20294g(dir, "dir");
        return listRecursively(dir, false);
    }
}
