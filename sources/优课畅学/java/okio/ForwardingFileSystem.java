package okio;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.alibaba.sdk.android.oss.common.RequestParameters;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC9133u;
import kotlin.jvm.internal.AbstractC9137y;
import p101f8.AbstractC8479q;
import p101f8.InterfaceC8469g;
import p134i7.AbstractC8816z;
import p300x7.InterfaceC10570l;

/* loaded from: classes5.dex */
public abstract class ForwardingFileSystem extends FileSystem {
    private final FileSystem delegate;

    public ForwardingFileSystem(FileSystem delegate) {
        AbstractC9133u.m16133g(delegate, "delegate");
        this.delegate = delegate;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Path listRecursively$lambda$2(ForwardingFileSystem forwardingFileSystem, Path it) {
        AbstractC9133u.m16133g(it, "it");
        return forwardingFileSystem.onPathResult(it, "listRecursively");
    }

    @Override // okio.FileSystem
    public Sink appendingSink(Path file, boolean z10) {
        AbstractC9133u.m16133g(file, "file");
        return this.delegate.appendingSink(onPathParameter(file, "appendingSink", "file"), z10);
    }

    @Override // okio.FileSystem
    public void atomicMove(Path source, Path target) {
        AbstractC9133u.m16133g(source, "source");
        AbstractC9133u.m16133g(target, "target");
        this.delegate.atomicMove(onPathParameter(source, "atomicMove", "source"), onPathParameter(target, "atomicMove", TypedValues.AttributesType.S_TARGET));
    }

    @Override // okio.FileSystem
    public Path canonicalize(Path path) {
        AbstractC9133u.m16133g(path, "path");
        return onPathResult(this.delegate.canonicalize(onPathParameter(path, "canonicalize", "path")), "canonicalize");
    }

    @Override // okio.FileSystem, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.delegate.close();
    }

    @Override // okio.FileSystem
    public void createDirectory(Path dir, boolean z10) {
        AbstractC9133u.m16133g(dir, "dir");
        this.delegate.createDirectory(onPathParameter(dir, "createDirectory", "dir"), z10);
    }

    @Override // okio.FileSystem
    public void createSymlink(Path source, Path target) {
        AbstractC9133u.m16133g(source, "source");
        AbstractC9133u.m16133g(target, "target");
        this.delegate.createSymlink(onPathParameter(source, "createSymlink", "source"), onPathParameter(target, "createSymlink", TypedValues.AttributesType.S_TARGET));
    }

    public final FileSystem delegate() {
        return this.delegate;
    }

    @Override // okio.FileSystem
    public void delete(Path path, boolean z10) {
        AbstractC9133u.m16133g(path, "path");
        this.delegate.delete(onPathParameter(path, RequestParameters.SUBRESOURCE_DELETE, "path"), z10);
    }

    @Override // okio.FileSystem
    public List<Path> list(Path dir) {
        AbstractC9133u.m16133g(dir, "dir");
        List<Path> list = this.delegate.list(onPathParameter(dir, "list", "dir"));
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(onPathResult((Path) it.next(), "list"));
        }
        AbstractC8816z.m14796z(arrayList);
        return arrayList;
    }

    @Override // okio.FileSystem
    public List<Path> listOrNull(Path dir) {
        AbstractC9133u.m16133g(dir, "dir");
        List<Path> listListOrNull = this.delegate.listOrNull(onPathParameter(dir, "listOrNull", "dir"));
        if (listListOrNull == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = listListOrNull.iterator();
        while (it.hasNext()) {
            arrayList.add(onPathResult((Path) it.next(), "listOrNull"));
        }
        AbstractC8816z.m14796z(arrayList);
        return arrayList;
    }

    @Override // okio.FileSystem
    public InterfaceC8469g listRecursively(Path dir, boolean z10) {
        AbstractC9133u.m16133g(dir, "dir");
        return AbstractC8479q.m13839B(this.delegate.listRecursively(onPathParameter(dir, "listRecursively", "dir"), z10), new InterfaceC10570l() { // from class: okio.a
            @Override // p300x7.InterfaceC10570l
            public final Object invoke(Object obj) {
                return ForwardingFileSystem.listRecursively$lambda$2(this.f19220a, (Path) obj);
            }
        });
    }

    @Override // okio.FileSystem
    public FileMetadata metadataOrNull(Path path) {
        AbstractC9133u.m16133g(path, "path");
        FileMetadata fileMetadataMetadataOrNull = this.delegate.metadataOrNull(onPathParameter(path, "metadataOrNull", "path"));
        if (fileMetadataMetadataOrNull == null) {
            return null;
        }
        return fileMetadataMetadataOrNull.getSymlinkTarget() == null ? fileMetadataMetadataOrNull : FileMetadata.copy$default(fileMetadataMetadataOrNull, false, false, onPathResult(fileMetadataMetadataOrNull.getSymlinkTarget(), "metadataOrNull"), null, null, null, null, null, 251, null);
    }

    public Path onPathParameter(Path path, String functionName, String parameterName) {
        AbstractC9133u.m16133g(path, "path");
        AbstractC9133u.m16133g(functionName, "functionName");
        AbstractC9133u.m16133g(parameterName, "parameterName");
        return path;
    }

    public Path onPathResult(Path path, String functionName) {
        AbstractC9133u.m16133g(path, "path");
        AbstractC9133u.m16133g(functionName, "functionName");
        return path;
    }

    @Override // okio.FileSystem
    public FileHandle openReadOnly(Path file) {
        AbstractC9133u.m16133g(file, "file");
        return this.delegate.openReadOnly(onPathParameter(file, "openReadOnly", "file"));
    }

    @Override // okio.FileSystem
    public FileHandle openReadWrite(Path file, boolean z10, boolean z11) {
        AbstractC9133u.m16133g(file, "file");
        return this.delegate.openReadWrite(onPathParameter(file, "openReadWrite", "file"), z10, z11);
    }

    @Override // okio.FileSystem
    public Sink sink(Path file, boolean z10) {
        AbstractC9133u.m16133g(file, "file");
        return this.delegate.sink(onPathParameter(file, "sink", "file"), z10);
    }

    @Override // okio.FileSystem
    public Source source(Path file) {
        AbstractC9133u.m16133g(file, "file");
        return this.delegate.source(onPathParameter(file, "source", "file"));
    }

    public String toString() {
        return AbstractC9137y.m16154b(getClass()).mo13672g() + '(' + this.delegate + ')';
    }
}
