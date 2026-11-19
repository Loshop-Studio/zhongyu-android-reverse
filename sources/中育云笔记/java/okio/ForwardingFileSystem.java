package okio;

import com.alibaba.sdk.android.oss.common.RequestParameters;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC9979u;
import kotlin.jvm.internal.AbstractC9983y;
import p181hd.InterfaceC9540l;
import p296pd.AbstractC10669q;
import p296pd.InterfaceC10659g;
import p325rc.AbstractC10935a0;

/* loaded from: classes6.dex */
public abstract class ForwardingFileSystem extends FileSystem {
    private final FileSystem delegate;

    public ForwardingFileSystem(FileSystem delegate) {
        AbstractC9979u.m20294g(delegate, "delegate");
        this.delegate = delegate;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Path listRecursively$lambda$2(ForwardingFileSystem forwardingFileSystem, Path it) {
        AbstractC9979u.m20294g(it, "it");
        return forwardingFileSystem.onPathResult(it, "listRecursively");
    }

    @Override // okio.FileSystem
    public Sink appendingSink(Path file, boolean z10) {
        AbstractC9979u.m20294g(file, "file");
        return this.delegate.appendingSink(onPathParameter(file, "appendingSink", "file"), z10);
    }

    @Override // okio.FileSystem
    public void atomicMove(Path source, Path target) {
        AbstractC9979u.m20294g(source, "source");
        AbstractC9979u.m20294g(target, "target");
        this.delegate.atomicMove(onPathParameter(source, "atomicMove", "source"), onPathParameter(target, "atomicMove", "target"));
    }

    @Override // okio.FileSystem
    public Path canonicalize(Path path) {
        AbstractC9979u.m20294g(path, "path");
        return onPathResult(this.delegate.canonicalize(onPathParameter(path, "canonicalize", "path")), "canonicalize");
    }

    @Override // okio.FileSystem, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.delegate.close();
    }

    @Override // okio.FileSystem
    public void createDirectory(Path dir, boolean z10) {
        AbstractC9979u.m20294g(dir, "dir");
        this.delegate.createDirectory(onPathParameter(dir, "createDirectory", "dir"), z10);
    }

    @Override // okio.FileSystem
    public void createSymlink(Path source, Path target) {
        AbstractC9979u.m20294g(source, "source");
        AbstractC9979u.m20294g(target, "target");
        this.delegate.createSymlink(onPathParameter(source, "createSymlink", "source"), onPathParameter(target, "createSymlink", "target"));
    }

    public final FileSystem delegate() {
        return this.delegate;
    }

    @Override // okio.FileSystem
    public void delete(Path path, boolean z10) {
        AbstractC9979u.m20294g(path, "path");
        this.delegate.delete(onPathParameter(path, RequestParameters.SUBRESOURCE_DELETE, "path"), z10);
    }

    @Override // okio.FileSystem
    public List<Path> list(Path dir) {
        AbstractC9979u.m20294g(dir, "dir");
        List<Path> list = this.delegate.list(onPathParameter(dir, "list", "dir"));
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(onPathResult((Path) it.next(), "list"));
        }
        AbstractC10935a0.m23854z(arrayList);
        return arrayList;
    }

    @Override // okio.FileSystem
    public List<Path> listOrNull(Path dir) {
        AbstractC9979u.m20294g(dir, "dir");
        List<Path> listListOrNull = this.delegate.listOrNull(onPathParameter(dir, "listOrNull", "dir"));
        if (listListOrNull == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = listListOrNull.iterator();
        while (it.hasNext()) {
            arrayList.add(onPathResult((Path) it.next(), "listOrNull"));
        }
        AbstractC10935a0.m23854z(arrayList);
        return arrayList;
    }

    @Override // okio.FileSystem
    public InterfaceC10659g listRecursively(Path dir, boolean z10) {
        AbstractC9979u.m20294g(dir, "dir");
        return AbstractC10669q.m22570B(this.delegate.listRecursively(onPathParameter(dir, "listRecursively", "dir"), z10), new InterfaceC9540l() { // from class: okio.a
            @Override // p181hd.InterfaceC9540l
            public final Object invoke(Object obj) {
                return ForwardingFileSystem.listRecursively$lambda$2(this.f25281c, (Path) obj);
            }
        });
    }

    @Override // okio.FileSystem
    public FileMetadata metadataOrNull(Path path) {
        AbstractC9979u.m20294g(path, "path");
        FileMetadata fileMetadataMetadataOrNull = this.delegate.metadataOrNull(onPathParameter(path, "metadataOrNull", "path"));
        if (fileMetadataMetadataOrNull == null) {
            return null;
        }
        return fileMetadataMetadataOrNull.getSymlinkTarget() == null ? fileMetadataMetadataOrNull : FileMetadata.copy$default(fileMetadataMetadataOrNull, false, false, onPathResult(fileMetadataMetadataOrNull.getSymlinkTarget(), "metadataOrNull"), null, null, null, null, null, 251, null);
    }

    public Path onPathParameter(Path path, String functionName, String parameterName) {
        AbstractC9979u.m20294g(path, "path");
        AbstractC9979u.m20294g(functionName, "functionName");
        AbstractC9979u.m20294g(parameterName, "parameterName");
        return path;
    }

    public Path onPathResult(Path path, String functionName) {
        AbstractC9979u.m20294g(path, "path");
        AbstractC9979u.m20294g(functionName, "functionName");
        return path;
    }

    @Override // okio.FileSystem
    public FileHandle openReadOnly(Path file) {
        AbstractC9979u.m20294g(file, "file");
        return this.delegate.openReadOnly(onPathParameter(file, "openReadOnly", "file"));
    }

    @Override // okio.FileSystem
    public FileHandle openReadWrite(Path file, boolean z10, boolean z11) {
        AbstractC9979u.m20294g(file, "file");
        return this.delegate.openReadWrite(onPathParameter(file, "openReadWrite", "file"), z10, z11);
    }

    @Override // okio.FileSystem
    public Sink sink(Path file, boolean z10) {
        AbstractC9979u.m20294g(file, "file");
        return this.delegate.sink(onPathParameter(file, "sink", "file"), z10);
    }

    @Override // okio.FileSystem
    public Source source(Path file) {
        AbstractC9979u.m20294g(file, "file");
        return this.delegate.source(onPathParameter(file, "source", "file"));
    }

    public String toString() {
        return AbstractC9983y.m20315b(getClass()).mo20277f() + '(' + this.delegate + ')';
    }
}
