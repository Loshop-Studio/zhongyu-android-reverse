package okio;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.exifinterface.media.ExifInterface;
import com.alibaba.sdk.android.oss.common.RequestParameters;
import java.io.Closeable;
import java.io.IOException;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.AbstractC5806u;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmName;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.AbstractC5824e;
import kotlin.jvm.internal.AbstractC5830k;
import kotlin.jvm.internal.SourceDebugExtension;
import okio.Path;
import okio.internal.ResourceFileSystem;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p152r6.InterfaceC6471c;
import p214z6.InterfaceC6830h;

@Metadata(m5109d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000f\b&\u0018\u0000 E2\u00060\u0001j\u0002`\u0002:\u0001EB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H&¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\f\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0006\u001a\u00020\u0005H&¢\u0006\u0004\b\f\u0010\u000bJ\u0015\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00050\u00112\u0006\u0010\u0010\u001a\u00020\u0005H&¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00112\u0006\u0010\u0010\u001a\u00020\u0005H&¢\u0006\u0004\b\u0014\u0010\u0013J'\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00050\u00162\u0006\u0010\u0010\u001a\u00020\u00052\b\b\u0002\u0010\u0015\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u001b\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00050\u00162\u0006\u0010\u0010\u001a\u00020\u0005¢\u0006\u0004\b\u0017\u0010\u0019J\u0017\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001a\u001a\u00020\u0005H&¢\u0006\u0004\b\u001c\u0010\u001dJ+\u0010 \u001a\u00020\u001b2\u0006\u0010\u001a\u001a\u00020\u00052\b\b\u0002\u0010\u001e\u001a\u00020\r2\b\b\u0002\u0010\u001f\u001a\u00020\rH&¢\u0006\u0004\b \u0010!J\u0015\u0010 \u001a\u00020\u001b2\u0006\u0010\u001a\u001a\u00020\u0005¢\u0006\u0004\b \u0010\u001dJ\u0017\u0010#\u001a\u00020\"2\u0006\u0010\u001a\u001a\u00020\u0005H&¢\u0006\u0004\b#\u0010$JG\u0010,\u001a\u00028\u0000\"\u0004\b\u0000\u0010%2\u0006\u0010\u001a\u001a\u00020\u00052\u0017\u0010)\u001a\u0013\u0012\u0004\u0012\u00020'\u0012\u0004\u0012\u00028\u00000&¢\u0006\u0002\b(H\u0087\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0002 \u0001¢\u0006\u0004\b*\u0010+J!\u0010.\u001a\u00020-2\u0006\u0010\u001a\u001a\u00020\u00052\b\b\u0002\u0010\u001e\u001a\u00020\rH&¢\u0006\u0004\b.\u0010/J\u0015\u0010.\u001a\u00020-2\u0006\u0010\u001a\u001a\u00020\u0005¢\u0006\u0004\b.\u00100JQ\u00105\u001a\u00028\u0000\"\u0004\b\u0000\u0010%2\u0006\u0010\u001a\u001a\u00020\u00052\b\b\u0002\u0010\u001e\u001a\u00020\r2\u0017\u00102\u001a\u0013\u0012\u0004\u0012\u000201\u0012\u0004\u0012\u00028\u00000&¢\u0006\u0002\b(H\u0087\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0003 \u0001¢\u0006\u0004\b3\u00104J!\u00106\u001a\u00020-2\u0006\u0010\u001a\u001a\u00020\u00052\b\b\u0002\u0010\u001f\u001a\u00020\rH&¢\u0006\u0004\b6\u0010/J\u0015\u00106\u001a\u00020-2\u0006\u0010\u001a\u001a\u00020\u0005¢\u0006\u0004\b6\u00100J!\u00108\u001a\u0002072\u0006\u0010\u0010\u001a\u00020\u00052\b\b\u0002\u0010\u001e\u001a\u00020\rH&¢\u0006\u0004\b8\u00109J\u0015\u00108\u001a\u0002072\u0006\u0010\u0010\u001a\u00020\u0005¢\u0006\u0004\b8\u0010:J\u001f\u0010;\u001a\u0002072\u0006\u0010\u0010\u001a\u00020\u00052\b\b\u0002\u0010\u001e\u001a\u00020\r¢\u0006\u0004\b;\u00109J\u0015\u0010;\u001a\u0002072\u0006\u0010\u0010\u001a\u00020\u0005¢\u0006\u0004\b;\u0010:J\u001f\u0010=\u001a\u0002072\u0006\u0010#\u001a\u00020\u00052\u0006\u0010<\u001a\u00020\u0005H&¢\u0006\u0004\b=\u0010>J\u001f\u0010?\u001a\u0002072\u0006\u0010#\u001a\u00020\u00052\u0006\u0010<\u001a\u00020\u0005H\u0016¢\u0006\u0004\b?\u0010>J!\u0010@\u001a\u0002072\u0006\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u001f\u001a\u00020\rH&¢\u0006\u0004\b@\u00109J\u0015\u0010@\u001a\u0002072\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b@\u0010:J!\u0010B\u001a\u0002072\u0006\u0010A\u001a\u00020\u00052\b\b\u0002\u0010\u001f\u001a\u00020\rH\u0016¢\u0006\u0004\bB\u00109J\u0015\u0010B\u001a\u0002072\u0006\u0010A\u001a\u00020\u0005¢\u0006\u0004\bB\u0010:J\u001f\u0010C\u001a\u0002072\u0006\u0010#\u001a\u00020\u00052\u0006\u0010<\u001a\u00020\u0005H&¢\u0006\u0004\bC\u0010>J\u000f\u0010D\u001a\u000207H\u0016¢\u0006\u0004\bD\u0010\u0004\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006F"}, m5110d2 = {"Lokio/FileSystem;", "Ljava/io/Closeable;", "Lokio/Closeable;", "<init>", "()V", "Lokio/Path;", "path", "canonicalize", "(Lokio/Path;)Lokio/Path;", "Lokio/FileMetadata;", "metadata", "(Lokio/Path;)Lokio/FileMetadata;", "metadataOrNull", "", "exists", "(Lokio/Path;)Z", "dir", "", "list", "(Lokio/Path;)Ljava/util/List;", "listOrNull", "followSymlinks", "Lz6/h;", "listRecursively", "(Lokio/Path;Z)Lz6/h;", "(Lokio/Path;)Lz6/h;", "file", "Lokio/FileHandle;", "openReadOnly", "(Lokio/Path;)Lokio/FileHandle;", "mustCreate", "mustExist", "openReadWrite", "(Lokio/Path;ZZ)Lokio/FileHandle;", "Lokio/Source;", "source", "(Lokio/Path;)Lokio/Source;", ExifInterface.GPS_DIRECTION_TRUE, "Lkotlin/Function1;", "Lokio/BufferedSource;", "Lkotlin/ExtensionFunctionType;", "readerAction", "-read", "(Lokio/Path;Lr6/c;)Ljava/lang/Object;", "read", "Lokio/Sink;", "sink", "(Lokio/Path;Z)Lokio/Sink;", "(Lokio/Path;)Lokio/Sink;", "Lokio/BufferedSink;", "writerAction", "-write", "(Lokio/Path;ZLr6/c;)Ljava/lang/Object;", "write", "appendingSink", "Ld6/s;", "createDirectory", "(Lokio/Path;Z)V", "(Lokio/Path;)V", "createDirectories", TypedValues.AttributesType.S_TARGET, "atomicMove", "(Lokio/Path;Lokio/Path;)V", "copy", RequestParameters.SUBRESOURCE_DELETE, "fileOrDirectory", "deleteRecursively", "createSymlink", "close", "Companion", "okio"}, m5111k = 1, m5112mv = {2, 1, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nFileSystem.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FileSystem.kt\nokio/FileSystem\n+ 2 Okio.kt\nokio/Okio__OkioKt\n*L\n1#1,191:1\n58#2,22:192\n58#2,22:214\n*S KotlinDebug\n*F\n+ 1 FileSystem.kt\nokio/FileSystem\n*L\n73#1:192,22\n95#1:214,22\n*E\n"})
/* loaded from: classes4.dex */
public abstract class FileSystem implements Closeable {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @JvmField
    @NotNull
    public static final FileSystem RESOURCES;

    @JvmField
    @NotNull
    public static final FileSystem SYSTEM;

    @JvmField
    @NotNull
    public static final Path SYSTEM_TEMPORARY_DIRECTORY;

    @Metadata(m5109d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0011\u0010\t\u001a\u00020\u0005*\u00020\nH\u0007¢\u0006\u0002\b\u000bR\u0010\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, m5110d2 = {"Lokio/FileSystem$Companion;", "", "<init>", "()V", "SYSTEM", "Lokio/FileSystem;", "SYSTEM_TEMPORARY_DIRECTORY", "Lokio/Path;", "RESOURCES", "asOkioFileSystem", "Ljava/nio/file/FileSystem;", "get", "okio"}, m5111k = 1, m5112mv = {2, 1, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class Companion {
        public /* synthetic */ Companion(AbstractC5824e abstractC5824e) {
            this();
        }

        @JvmStatic
        @JvmName(name = "get")
        @NotNull
        public final FileSystem get(@NotNull java.nio.file.FileSystem fileSystem) {
            AbstractC5830k.m5330g(fileSystem, "<this>");
            return new NioFileSystemWrappingFileSystem(fileSystem);
        }

        private Companion() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, r6.c] */
    /* renamed from: -write$default, reason: not valid java name */
    public static /* synthetic */ Object m13982write$default(FileSystem fileSystem, Path file, boolean z8, InterfaceC6471c writerAction, int i, Object obj) throws IOException {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: write");
        }
        if ((i & 2) != 0) {
            z8 = false;
        }
        AbstractC5830k.m5330g(file, "file");
        AbstractC5830k.m5330g(writerAction, "writerAction");
        BufferedSink bufferedSinkBuffer = Okio.buffer(fileSystem.sink(file, z8));
        Object th = null;
        try {
            Object objInvoke = writerAction.invoke(bufferedSinkBuffer);
            if (bufferedSinkBuffer != null) {
                try {
                    bufferedSinkBuffer.close();
                } catch (Throwable th2) {
                    th = th2;
                }
            }
            th = th;
            th = objInvoke;
        } catch (Throwable th3) {
            th = th3;
            if (bufferedSinkBuffer != null) {
                try {
                    bufferedSinkBuffer.close();
                } catch (Throwable th4) {
                    AbstractC5806u.m5266e(th, th4);
                }
            }
        }
        if (th == 0) {
            return th;
        }
        throw th;
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
        Path.Companion companion = Path.INSTANCE;
        String property = System.getProperty("java.io.tmpdir");
        AbstractC5830k.m5329f(property, "getProperty(...)");
        SYSTEM_TEMPORARY_DIRECTORY = Path.Companion.get$default(companion, property, false, 1, (Object) null);
        ClassLoader classLoader = ResourceFileSystem.class.getClassLoader();
        AbstractC5830k.m5329f(classLoader, "getClassLoader(...)");
        RESOURCES = new ResourceFileSystem(classLoader, false, null, 4, null);
    }

    public static /* synthetic */ Sink appendingSink$default(FileSystem fileSystem, Path path, boolean z8, int i, Object obj) throws IOException {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: appendingSink");
        }
        if ((i & 2) != 0) {
            z8 = false;
        }
        return fileSystem.appendingSink(path, z8);
    }

    public static /* synthetic */ void createDirectories$default(FileSystem fileSystem, Path path, boolean z8, int i, Object obj) throws IOException {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: createDirectories");
        }
        if ((i & 2) != 0) {
            z8 = false;
        }
        fileSystem.createDirectories(path, z8);
    }

    public static /* synthetic */ void createDirectory$default(FileSystem fileSystem, Path path, boolean z8, int i, Object obj) throws IOException {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: createDirectory");
        }
        if ((i & 2) != 0) {
            z8 = false;
        }
        fileSystem.createDirectory(path, z8);
    }

    public static /* synthetic */ void delete$default(FileSystem fileSystem, Path path, boolean z8, int i, Object obj) throws IOException {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: delete");
        }
        if ((i & 2) != 0) {
            z8 = false;
        }
        fileSystem.delete(path, z8);
    }

    public static /* synthetic */ void deleteRecursively$default(FileSystem fileSystem, Path path, boolean z8, int i, Object obj) throws IOException {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: deleteRecursively");
        }
        if ((i & 2) != 0) {
            z8 = false;
        }
        fileSystem.deleteRecursively(path, z8);
    }

    @JvmStatic
    @JvmName(name = "get")
    @NotNull
    public static final FileSystem get(@NotNull java.nio.file.FileSystem fileSystem) {
        return INSTANCE.get(fileSystem);
    }

    public static /* synthetic */ InterfaceC6830h listRecursively$default(FileSystem fileSystem, Path path, boolean z8, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: listRecursively");
        }
        if ((i & 2) != 0) {
            z8 = false;
        }
        return fileSystem.listRecursively(path, z8);
    }

    public static /* synthetic */ FileHandle openReadWrite$default(FileSystem fileSystem, Path path, boolean z8, boolean z9, int i, Object obj) throws IOException {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: openReadWrite");
        }
        if ((i & 2) != 0) {
            z8 = false;
        }
        if ((i & 4) != 0) {
            z9 = false;
        }
        return fileSystem.openReadWrite(path, z8, z9);
    }

    public static /* synthetic */ Sink sink$default(FileSystem fileSystem, Path path, boolean z8, int i, Object obj) throws IOException {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: sink");
        }
        if ((i & 2) != 0) {
            z8 = false;
        }
        return fileSystem.sink(path, z8);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, r6.c] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v4 */
    @JvmName(name = "-read")
    /* renamed from: -read, reason: not valid java name */
    public final <T> T m13983read(@NotNull Path file, @NotNull InterfaceC6471c readerAction) throws IOException {
        AbstractC5830k.m5330g(file, "file");
        AbstractC5830k.m5330g(readerAction, "readerAction");
        BufferedSource bufferedSourceBuffer = Okio.buffer(source(file));
        T th = null;
        try {
            ?? Invoke = readerAction.invoke(bufferedSourceBuffer);
            if (bufferedSourceBuffer != null) {
                try {
                    bufferedSourceBuffer.close();
                } catch (Throwable th2) {
                    th = th2;
                }
            }
            T t8 = th;
            th = Invoke;
            th = t8;
        } catch (Throwable th3) {
            th = th3;
            if (bufferedSourceBuffer != null) {
                try {
                    bufferedSourceBuffer.close();
                } catch (Throwable th4) {
                    AbstractC5806u.m5266e(th, th4);
                }
            }
        }
        if (th == 0) {
            return th;
        }
        throw th;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, r6.c] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v4 */
    @JvmName(name = "-write")
    /* renamed from: -write, reason: not valid java name */
    public final <T> T m13984write(@NotNull Path file, boolean mustCreate, @NotNull InterfaceC6471c writerAction) throws IOException {
        AbstractC5830k.m5330g(file, "file");
        AbstractC5830k.m5330g(writerAction, "writerAction");
        BufferedSink bufferedSinkBuffer = Okio.buffer(sink(file, mustCreate));
        T th = null;
        try {
            ?? Invoke = writerAction.invoke(bufferedSinkBuffer);
            if (bufferedSinkBuffer != null) {
                try {
                    bufferedSinkBuffer.close();
                } catch (Throwable th2) {
                    th = th2;
                }
            }
            th = th;
            th = Invoke;
        } catch (Throwable th3) {
            th = th3;
            if (bufferedSinkBuffer != null) {
                try {
                    bufferedSinkBuffer.close();
                } catch (Throwable th4) {
                    AbstractC5806u.m5266e(th, th4);
                }
            }
        }
        if (th == 0) {
            return th;
        }
        throw th;
    }

    @NotNull
    public final Sink appendingSink(@NotNull Path file) throws IOException {
        AbstractC5830k.m5330g(file, "file");
        return appendingSink(file, false);
    }

    @NotNull
    public abstract Sink appendingSink(@NotNull Path file, boolean mustExist) throws IOException;

    public abstract void atomicMove(@NotNull Path source, @NotNull Path target) throws IOException;

    @NotNull
    public abstract Path canonicalize(@NotNull Path path) throws IOException;

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
    }

    public void copy(@NotNull Path source, @NotNull Path target) throws IOException {
        AbstractC5830k.m5330g(source, "source");
        AbstractC5830k.m5330g(target, "target");
        okio.internal.FileSystem.commonCopy(this, source, target);
    }

    public final void createDirectories(@NotNull Path dir, boolean mustCreate) throws IOException {
        AbstractC5830k.m5330g(dir, "dir");
        okio.internal.FileSystem.commonCreateDirectories(this, dir, mustCreate);
    }

    public final void createDirectory(@NotNull Path dir) throws IOException {
        AbstractC5830k.m5330g(dir, "dir");
        createDirectory(dir, false);
    }

    public abstract void createDirectory(@NotNull Path dir, boolean mustCreate) throws IOException;

    public abstract void createSymlink(@NotNull Path source, @NotNull Path target) throws IOException;

    public final void delete(@NotNull Path path) throws IOException {
        AbstractC5830k.m5330g(path, "path");
        delete(path, false);
    }

    public abstract void delete(@NotNull Path path, boolean mustExist) throws IOException;

    public void deleteRecursively(@NotNull Path fileOrDirectory, boolean mustExist) throws IOException {
        AbstractC5830k.m5330g(fileOrDirectory, "fileOrDirectory");
        okio.internal.FileSystem.commonDeleteRecursively(this, fileOrDirectory, mustExist);
    }

    public final boolean exists(@NotNull Path path) throws IOException {
        AbstractC5830k.m5330g(path, "path");
        return okio.internal.FileSystem.commonExists(this, path);
    }

    @NotNull
    public abstract List<Path> list(@NotNull Path dir) throws IOException;

    @Nullable
    public abstract List<Path> listOrNull(@NotNull Path dir);

    @NotNull
    public InterfaceC6830h listRecursively(@NotNull Path dir, boolean followSymlinks) {
        AbstractC5830k.m5330g(dir, "dir");
        return okio.internal.FileSystem.commonListRecursively(this, dir, followSymlinks);
    }

    @NotNull
    public final FileMetadata metadata(@NotNull Path path) throws IOException {
        AbstractC5830k.m5330g(path, "path");
        return okio.internal.FileSystem.commonMetadata(this, path);
    }

    @Nullable
    public abstract FileMetadata metadataOrNull(@NotNull Path path) throws IOException;

    @NotNull
    public abstract FileHandle openReadOnly(@NotNull Path file) throws IOException;

    @NotNull
    public final FileHandle openReadWrite(@NotNull Path file) throws IOException {
        AbstractC5830k.m5330g(file, "file");
        return openReadWrite(file, false, false);
    }

    @NotNull
    public abstract FileHandle openReadWrite(@NotNull Path file, boolean mustCreate, boolean mustExist) throws IOException;

    @NotNull
    public final Sink sink(@NotNull Path file) throws IOException {
        AbstractC5830k.m5330g(file, "file");
        return sink(file, false);
    }

    @NotNull
    public abstract Sink sink(@NotNull Path file, boolean mustCreate) throws IOException;

    @NotNull
    public abstract Source source(@NotNull Path file) throws IOException;

    public final void createDirectories(@NotNull Path dir) throws IOException {
        AbstractC5830k.m5330g(dir, "dir");
        createDirectories(dir, false);
    }

    public final void deleteRecursively(@NotNull Path fileOrDirectory) throws IOException {
        AbstractC5830k.m5330g(fileOrDirectory, "fileOrDirectory");
        deleteRecursively(fileOrDirectory, false);
    }

    @NotNull
    public final InterfaceC6830h listRecursively(@NotNull Path dir) {
        AbstractC5830k.m5330g(dir, "dir");
        return listRecursively(dir, false);
    }
}
