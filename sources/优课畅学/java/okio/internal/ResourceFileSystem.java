package okio.internal;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.JarURLConnection;
import java.net.URI;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.AbstractC9078a;
import kotlin.Pair;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;
import okio.FileHandle;
import okio.FileMetadata;
import okio.FileSystem;
import okio.Okio;
import okio.Path;
import okio.Sink;
import okio.Source;
import p113g8.AbstractC8661c0;
import p113g8.AbstractC8687z;
import p123h7.AbstractC8726f;
import p123h7.InterfaceC8724d;
import p134i7.AbstractC8768a0;
import p134i7.AbstractC8778f0;
import p134i7.AbstractC8811w;
import p300x7.InterfaceC10559a;
import p300x7.InterfaceC10570l;

/* loaded from: classes5.dex */
public final class ResourceFileSystem extends FileSystem {
    private static final Companion Companion = new Companion(null);
    private static final Path ROOT = Path.Companion.get$default(Path.Companion, "/", false, 1, (Object) null);
    private final ClassLoader classLoader;
    private final InterfaceC8724d roots$delegate;
    private final FileSystem systemFileSystem;

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC9126n abstractC9126n) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean keepPath(Path path) {
            return !AbstractC8687z.m14110y(path.name(), ".class", true);
        }

        public final Path getROOT() {
            return ResourceFileSystem.ROOT;
        }

        public final Path removeBase(Path path, Path base) {
            AbstractC9133u.m16133g(path, "<this>");
            AbstractC9133u.m16133g(base, "base");
            return getROOT().resolve(AbstractC8687z.m14100H(AbstractC8661c0.m14010y0(path.toString(), base.toString()), '\\', '/', false, 4, null));
        }

        private Companion() {
        }
    }

    public /* synthetic */ ResourceFileSystem(ClassLoader classLoader, boolean z10, FileSystem fileSystem, int i10, AbstractC9126n abstractC9126n) {
        this(classLoader, z10, (i10 & 4) != 0 ? FileSystem.SYSTEM : fileSystem);
    }

    private final Path canonicalizeInternal(Path path) {
        return ROOT.resolve(path, true);
    }

    private final List<Pair<FileSystem, Path>> getRoots() {
        return (List) this.roots$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List roots_delegate$lambda$0(ResourceFileSystem resourceFileSystem) {
        return resourceFileSystem.toClasspathRoots(resourceFileSystem.classLoader);
    }

    private final List<Pair<FileSystem, Path>> toClasspathRoots(ClassLoader classLoader) throws IOException {
        Enumeration<URL> resources = classLoader.getResources("");
        AbstractC9133u.m16132f(resources, "getResources(...)");
        ArrayList<URL> list = Collections.list(resources);
        AbstractC9133u.m16132f(list, "list(...)");
        ArrayList arrayList = new ArrayList();
        for (URL url : list) {
            AbstractC9133u.m16130d(url);
            Pair<FileSystem, Path> fileRoot = toFileRoot(url);
            if (fileRoot != null) {
                arrayList.add(fileRoot);
            }
        }
        Enumeration<URL> resources2 = classLoader.getResources("META-INF/MANIFEST.MF");
        AbstractC9133u.m16132f(resources2, "getResources(...)");
        ArrayList<URL> list2 = Collections.list(resources2);
        AbstractC9133u.m16132f(list2, "list(...)");
        ArrayList arrayList2 = new ArrayList();
        for (URL url2 : list2) {
            AbstractC9133u.m16130d(url2);
            Pair<FileSystem, Path> jarRoot = toJarRoot(url2);
            if (jarRoot != null) {
                arrayList2.add(jarRoot);
            }
        }
        return AbstractC8778f0.m14529F0(arrayList, arrayList2);
    }

    private final Pair<FileSystem, Path> toFileRoot(URL url) {
        if (AbstractC9133u.m16128b(url.getProtocol(), "file")) {
            return AbstractC8726f.m14230a(this.systemFileSystem, Path.Companion.get$default(Path.Companion, new File(url.toURI()), false, 1, (Object) null));
        }
        return null;
    }

    private final Pair<FileSystem, Path> toJarRoot(URL url) {
        int iM13997l0;
        String string = url.toString();
        AbstractC9133u.m16132f(string, "toString(...)");
        if (!AbstractC8687z.m14105M(string, "jar:file:", false, 2, null) || (iM13997l0 = AbstractC8661c0.m13997l0(string, "!", 0, false, 6, null)) == -1) {
            return null;
        }
        Path.Companion companion = Path.Companion;
        String strSubstring = string.substring(4, iM13997l0);
        AbstractC9133u.m16132f(strSubstring, "substring(...)");
        return AbstractC8726f.m14230a(ZipFilesKt.openZip(Path.Companion.get$default(companion, new File(URI.create(strSubstring)), false, 1, (Object) null), this.systemFileSystem, new InterfaceC10570l() { // from class: okio.internal.a
            @Override // p300x7.InterfaceC10570l
            public final Object invoke(Object obj) {
                return Boolean.valueOf(ResourceFileSystem.toJarRoot$lambda$7((ZipEntry) obj));
            }
        }), ROOT);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean toJarRoot$lambda$7(ZipEntry entry) {
        AbstractC9133u.m16133g(entry, "entry");
        return Companion.keepPath(entry.getCanonicalPath());
    }

    private final String toRelativePath(Path path) {
        return canonicalizeInternal(path).relativeTo(ROOT).toString();
    }

    @Override // okio.FileSystem
    public Sink appendingSink(Path file, boolean z10) throws IOException {
        AbstractC9133u.m16133g(file, "file");
        throw new IOException(this + " is read-only");
    }

    @Override // okio.FileSystem
    public void atomicMove(Path source, Path target) throws IOException {
        AbstractC9133u.m16133g(source, "source");
        AbstractC9133u.m16133g(target, "target");
        throw new IOException(this + " is read-only");
    }

    @Override // okio.FileSystem
    public Path canonicalize(Path path) {
        AbstractC9133u.m16133g(path, "path");
        return canonicalizeInternal(path);
    }

    @Override // okio.FileSystem
    public void createDirectory(Path dir, boolean z10) throws IOException {
        AbstractC9133u.m16133g(dir, "dir");
        throw new IOException(this + " is read-only");
    }

    @Override // okio.FileSystem
    public void createSymlink(Path source, Path target) throws IOException {
        AbstractC9133u.m16133g(source, "source");
        AbstractC9133u.m16133g(target, "target");
        throw new IOException(this + " is read-only");
    }

    @Override // okio.FileSystem
    public void delete(Path path, boolean z10) throws IOException {
        AbstractC9133u.m16133g(path, "path");
        throw new IOException(this + " is read-only");
    }

    @Override // okio.FileSystem
    public List<Path> list(Path dir) throws FileNotFoundException {
        AbstractC9133u.m16133g(dir, "dir");
        String relativePath = toRelativePath(dir);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        boolean z10 = false;
        for (Pair<FileSystem, Path> pair : getRoots()) {
            FileSystem fileSystem = (FileSystem) pair.m15903a();
            Path path = (Path) pair.m15904b();
            try {
                List<Path> list = fileSystem.list(path.resolve(relativePath));
                ArrayList arrayList = new ArrayList();
                for (Object obj : list) {
                    if (Companion.keepPath((Path) obj)) {
                        arrayList.add(obj);
                    }
                }
                ArrayList arrayList2 = new ArrayList(AbstractC8811w.m14786x(arrayList, 10));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add(Companion.removeBase((Path) it.next(), path));
                }
                AbstractC8768a0.m14481C(linkedHashSet, arrayList2);
                z10 = true;
            } catch (IOException unused) {
            }
        }
        if (z10) {
            return AbstractC8778f0.m14544U0(linkedHashSet);
        }
        throw new FileNotFoundException("file not found: " + dir);
    }

    @Override // okio.FileSystem
    public List<Path> listOrNull(Path dir) {
        AbstractC9133u.m16133g(dir, "dir");
        String relativePath = toRelativePath(dir);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator<Pair<FileSystem, Path>> it = getRoots().iterator();
        boolean z10 = false;
        while (true) {
            ArrayList arrayList = null;
            if (!it.hasNext()) {
                break;
            }
            Pair<FileSystem, Path> next = it.next();
            FileSystem fileSystem = (FileSystem) next.m15903a();
            Path path = (Path) next.m15904b();
            List<Path> listListOrNull = fileSystem.listOrNull(path.resolve(relativePath));
            if (listListOrNull != null) {
                ArrayList arrayList2 = new ArrayList();
                for (Object obj : listListOrNull) {
                    if (Companion.keepPath((Path) obj)) {
                        arrayList2.add(obj);
                    }
                }
                ArrayList arrayList3 = new ArrayList(AbstractC8811w.m14786x(arrayList2, 10));
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    arrayList3.add(Companion.removeBase((Path) it2.next(), path));
                }
                arrayList = arrayList3;
            }
            if (arrayList != null) {
                AbstractC8768a0.m14481C(linkedHashSet, arrayList);
                z10 = true;
            }
        }
        if (z10) {
            return AbstractC8778f0.m14544U0(linkedHashSet);
        }
        return null;
    }

    @Override // okio.FileSystem
    public FileMetadata metadataOrNull(Path path) {
        AbstractC9133u.m16133g(path, "path");
        if (!Companion.keepPath(path)) {
            return null;
        }
        String relativePath = toRelativePath(path);
        for (Pair<FileSystem, Path> pair : getRoots()) {
            FileMetadata fileMetadataMetadataOrNull = ((FileSystem) pair.m15903a()).metadataOrNull(((Path) pair.m15904b()).resolve(relativePath));
            if (fileMetadataMetadataOrNull != null) {
                return fileMetadataMetadataOrNull;
            }
        }
        return null;
    }

    @Override // okio.FileSystem
    public FileHandle openReadOnly(Path file) throws FileNotFoundException {
        AbstractC9133u.m16133g(file, "file");
        if (!Companion.keepPath(file)) {
            throw new FileNotFoundException("file not found: " + file);
        }
        String relativePath = toRelativePath(file);
        for (Pair<FileSystem, Path> pair : getRoots()) {
            try {
                return ((FileSystem) pair.m15903a()).openReadOnly(((Path) pair.m15904b()).resolve(relativePath));
            } catch (FileNotFoundException unused) {
            }
        }
        throw new FileNotFoundException("file not found: " + file);
    }

    @Override // okio.FileSystem
    public FileHandle openReadWrite(Path file, boolean z10, boolean z11) throws IOException {
        AbstractC9133u.m16133g(file, "file");
        throw new IOException("resources are not writable");
    }

    @Override // okio.FileSystem
    public Sink sink(Path file, boolean z10) throws IOException {
        AbstractC9133u.m16133g(file, "file");
        throw new IOException(this + " is read-only");
    }

    @Override // okio.FileSystem
    public Source source(Path file) throws IOException {
        AbstractC9133u.m16133g(file, "file");
        if (!Companion.keepPath(file)) {
            throw new FileNotFoundException("file not found: " + file);
        }
        Path path = ROOT;
        URL resource = this.classLoader.getResource(Path.resolve$default(path, file, false, 2, (Object) null).relativeTo(path).toString());
        if (resource == null) {
            throw new FileNotFoundException("file not found: " + file);
        }
        URLConnection uRLConnectionOpenConnection = resource.openConnection();
        if (uRLConnectionOpenConnection instanceof JarURLConnection) {
            ((JarURLConnection) uRLConnectionOpenConnection).setUseCaches(false);
        }
        InputStream inputStream = uRLConnectionOpenConnection.getInputStream();
        AbstractC9133u.m16132f(inputStream, "getInputStream(...)");
        return Okio.source(inputStream);
    }

    public ResourceFileSystem(ClassLoader classLoader, boolean z10, FileSystem systemFileSystem) {
        AbstractC9133u.m16133g(classLoader, "classLoader");
        AbstractC9133u.m16133g(systemFileSystem, "systemFileSystem");
        this.classLoader = classLoader;
        this.systemFileSystem = systemFileSystem;
        this.roots$delegate = AbstractC9078a.m15924b(new InterfaceC10559a() { // from class: okio.internal.b
            @Override // p300x7.InterfaceC10559a
            public final Object invoke() {
                return ResourceFileSystem.roots_delegate$lambda$0(this.f19221a);
            }
        });
        if (z10) {
            getRoots().size();
        }
    }
}
