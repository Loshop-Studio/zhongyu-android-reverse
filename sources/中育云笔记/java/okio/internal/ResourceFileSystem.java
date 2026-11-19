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
import kotlin.AbstractC9923a;
import kotlin.Pair;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;
import okio.FileHandle;
import okio.FileMetadata;
import okio.FileSystem;
import okio.Okio;
import okio.Path;
import okio.Sink;
import okio.Source;
import org.eclipse.paho.client.mqttv3.MqttTopic;
import p181hd.InterfaceC9529a;
import p181hd.InterfaceC9540l;
import p309qc.AbstractC10776g;
import p309qc.InterfaceC10773d;
import p310qd.AbstractC10793c0;
import p310qd.AbstractC10819z;
import p325rc.AbstractC10937b0;
import p325rc.AbstractC10947g0;
import p325rc.AbstractC10980x;

/* loaded from: classes6.dex */
public final class ResourceFileSystem extends FileSystem {
    private static final Companion Companion = new Companion(null);
    private static final Path ROOT = Path.Companion.get$default(Path.Companion, MqttTopic.TOPIC_LEVEL_SEPARATOR, false, 1, (Object) null);
    private final ClassLoader classLoader;
    private final InterfaceC10773d roots$delegate;
    private final FileSystem systemFileSystem;

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC9972n abstractC9972n) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean keepPath(Path path) {
            return !AbstractC10819z.m23228A(path.name(), ".class", true);
        }

        public final Path getROOT() {
            return ResourceFileSystem.ROOT;
        }

        public final Path removeBase(Path path, Path base) {
            AbstractC9979u.m20294g(path, "<this>");
            AbstractC9979u.m20294g(base, "base");
            return getROOT().resolve(AbstractC10819z.m23237J(AbstractC10793c0.m23149y0(path.toString(), base.toString()), '\\', '/', false, 4, null));
        }

        private Companion() {
        }
    }

    public /* synthetic */ ResourceFileSystem(ClassLoader classLoader, boolean z10, FileSystem fileSystem, int i10, AbstractC9972n abstractC9972n) {
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
        AbstractC9979u.m20293f(resources, "getResources(...)");
        ArrayList list = Collections.list(resources);
        AbstractC9979u.m20293f(list, "list(...)");
        ArrayList arrayList = new ArrayList();
        int size = list.size();
        int i10 = 0;
        int i11 = 0;
        while (i11 < size) {
            Object obj = list.get(i11);
            i11++;
            URL url = (URL) obj;
            AbstractC9979u.m20291d(url);
            Pair<FileSystem, Path> fileRoot = toFileRoot(url);
            if (fileRoot != null) {
                arrayList.add(fileRoot);
            }
        }
        Enumeration<URL> resources2 = classLoader.getResources("META-INF/MANIFEST.MF");
        AbstractC9979u.m20293f(resources2, "getResources(...)");
        ArrayList list2 = Collections.list(resources2);
        AbstractC9979u.m20293f(list2, "list(...)");
        ArrayList arrayList2 = new ArrayList();
        int size2 = list2.size();
        while (i10 < size2) {
            Object obj2 = list2.get(i10);
            i10++;
            URL url2 = (URL) obj2;
            AbstractC9979u.m20291d(url2);
            Pair<FileSystem, Path> jarRoot = toJarRoot(url2);
            if (jarRoot != null) {
                arrayList2.add(jarRoot);
            }
        }
        return AbstractC10947g0.m23906H0(arrayList, arrayList2);
    }

    private final Pair<FileSystem, Path> toFileRoot(URL url) {
        if (AbstractC9979u.m20289b(url.getProtocol(), "file")) {
            return AbstractC10776g.m22975a(this.systemFileSystem, Path.Companion.get$default(Path.Companion, new File(url.toURI()), false, 1, (Object) null));
        }
        return null;
    }

    private final Pair<FileSystem, Path> toJarRoot(URL url) {
        int iM23136l0;
        String string = url.toString();
        AbstractC9979u.m20293f(string, "toString(...)");
        if (!AbstractC10819z.m23242O(string, "jar:file:", false, 2, null) || (iM23136l0 = AbstractC10793c0.m23136l0(string, "!", 0, false, 6, null)) == -1) {
            return null;
        }
        Path.Companion companion = Path.Companion;
        String strSubstring = string.substring(4, iM23136l0);
        AbstractC9979u.m20293f(strSubstring, "substring(...)");
        return AbstractC10776g.m22975a(ZipFilesKt.openZip(Path.Companion.get$default(companion, new File(URI.create(strSubstring)), false, 1, (Object) null), this.systemFileSystem, new InterfaceC9540l() { // from class: okio.internal.a
            @Override // p181hd.InterfaceC9540l
            public final Object invoke(Object obj) {
                return Boolean.valueOf(ResourceFileSystem.toJarRoot$lambda$7((ZipEntry) obj));
            }
        }), ROOT);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean toJarRoot$lambda$7(ZipEntry entry) {
        AbstractC9979u.m20294g(entry, "entry");
        return Companion.keepPath(entry.getCanonicalPath());
    }

    private final String toRelativePath(Path path) {
        return canonicalizeInternal(path).relativeTo(ROOT).toString();
    }

    @Override // okio.FileSystem
    public Sink appendingSink(Path file, boolean z10) throws IOException {
        AbstractC9979u.m20294g(file, "file");
        throw new IOException(this + " is read-only");
    }

    @Override // okio.FileSystem
    public void atomicMove(Path source, Path target) throws IOException {
        AbstractC9979u.m20294g(source, "source");
        AbstractC9979u.m20294g(target, "target");
        throw new IOException(this + " is read-only");
    }

    @Override // okio.FileSystem
    public Path canonicalize(Path path) {
        AbstractC9979u.m20294g(path, "path");
        return canonicalizeInternal(path);
    }

    @Override // okio.FileSystem
    public void createDirectory(Path dir, boolean z10) throws IOException {
        AbstractC9979u.m20294g(dir, "dir");
        throw new IOException(this + " is read-only");
    }

    @Override // okio.FileSystem
    public void createSymlink(Path source, Path target) throws IOException {
        AbstractC9979u.m20294g(source, "source");
        AbstractC9979u.m20294g(target, "target");
        throw new IOException(this + " is read-only");
    }

    @Override // okio.FileSystem
    public void delete(Path path, boolean z10) throws IOException {
        AbstractC9979u.m20294g(path, "path");
        throw new IOException(this + " is read-only");
    }

    @Override // okio.FileSystem
    public List<Path> list(Path dir) throws FileNotFoundException {
        AbstractC9979u.m20294g(dir, "dir");
        String relativePath = toRelativePath(dir);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        boolean z10 = false;
        for (Pair<FileSystem, Path> pair : getRoots()) {
            FileSystem fileSystem = (FileSystem) pair.m20048a();
            Path path = (Path) pair.m20049c();
            try {
                List<Path> list = fileSystem.list(path.resolve(relativePath));
                ArrayList arrayList = new ArrayList();
                for (Object obj : list) {
                    if (Companion.keepPath((Path) obj)) {
                        arrayList.add(obj);
                    }
                }
                ArrayList arrayList2 = new ArrayList(AbstractC10980x.m24153x(arrayList, 10));
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj2 = arrayList.get(i10);
                    i10++;
                    arrayList2.add(Companion.removeBase((Path) obj2, path));
                }
                AbstractC10937b0.m23857B(linkedHashSet, arrayList2);
                z10 = true;
            } catch (IOException unused) {
            }
        }
        if (z10) {
            return AbstractC10947g0.m23922X0(linkedHashSet);
        }
        throw new FileNotFoundException("file not found: " + dir);
    }

    @Override // okio.FileSystem
    public List<Path> listOrNull(Path dir) {
        AbstractC9979u.m20294g(dir, "dir");
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
            FileSystem fileSystem = (FileSystem) next.m20048a();
            Path path = (Path) next.m20049c();
            List<Path> listListOrNull = fileSystem.listOrNull(path.resolve(relativePath));
            if (listListOrNull != null) {
                ArrayList arrayList2 = new ArrayList();
                for (Object obj : listListOrNull) {
                    if (Companion.keepPath((Path) obj)) {
                        arrayList2.add(obj);
                    }
                }
                ArrayList arrayList3 = new ArrayList(AbstractC10980x.m24153x(arrayList2, 10));
                int size = arrayList2.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj2 = arrayList2.get(i10);
                    i10++;
                    arrayList3.add(Companion.removeBase((Path) obj2, path));
                }
                arrayList = arrayList3;
            }
            if (arrayList != null) {
                AbstractC10937b0.m23857B(linkedHashSet, arrayList);
                z10 = true;
            }
        }
        if (z10) {
            return AbstractC10947g0.m23922X0(linkedHashSet);
        }
        return null;
    }

    @Override // okio.FileSystem
    public FileMetadata metadataOrNull(Path path) {
        AbstractC9979u.m20294g(path, "path");
        if (!Companion.keepPath(path)) {
            return null;
        }
        String relativePath = toRelativePath(path);
        for (Pair<FileSystem, Path> pair : getRoots()) {
            FileMetadata fileMetadataMetadataOrNull = ((FileSystem) pair.m20048a()).metadataOrNull(((Path) pair.m20049c()).resolve(relativePath));
            if (fileMetadataMetadataOrNull != null) {
                return fileMetadataMetadataOrNull;
            }
        }
        return null;
    }

    @Override // okio.FileSystem
    public FileHandle openReadOnly(Path file) throws FileNotFoundException {
        AbstractC9979u.m20294g(file, "file");
        if (!Companion.keepPath(file)) {
            throw new FileNotFoundException("file not found: " + file);
        }
        String relativePath = toRelativePath(file);
        for (Pair<FileSystem, Path> pair : getRoots()) {
            try {
                return ((FileSystem) pair.m20048a()).openReadOnly(((Path) pair.m20049c()).resolve(relativePath));
            } catch (FileNotFoundException unused) {
            }
        }
        throw new FileNotFoundException("file not found: " + file);
    }

    @Override // okio.FileSystem
    public FileHandle openReadWrite(Path file, boolean z10, boolean z11) throws IOException {
        AbstractC9979u.m20294g(file, "file");
        throw new IOException("resources are not writable");
    }

    @Override // okio.FileSystem
    public Sink sink(Path file, boolean z10) throws IOException {
        AbstractC9979u.m20294g(file, "file");
        throw new IOException(this + " is read-only");
    }

    @Override // okio.FileSystem
    public Source source(Path file) throws IOException {
        AbstractC9979u.m20294g(file, "file");
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
        AbstractC9979u.m20293f(inputStream, "getInputStream(...)");
        return Okio.source(inputStream);
    }

    public ResourceFileSystem(ClassLoader classLoader, boolean z10, FileSystem systemFileSystem) {
        AbstractC9979u.m20294g(classLoader, "classLoader");
        AbstractC9979u.m20294g(systemFileSystem, "systemFileSystem");
        this.classLoader = classLoader;
        this.systemFileSystem = systemFileSystem;
        this.roots$delegate = AbstractC9923a.m20068a(new InterfaceC9529a() { // from class: okio.internal.b
            @Override // p181hd.InterfaceC9529a
            public final Object invoke() {
                return ResourceFileSystem.roots_delegate$lambda$0(this.f25282c);
            }
        });
        if (z10) {
            getRoots().size();
        }
    }
}
