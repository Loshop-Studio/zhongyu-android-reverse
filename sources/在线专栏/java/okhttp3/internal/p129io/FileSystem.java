package okhttp3.internal.p129io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import kotlin.jvm.internal.C2764g;
import kotlin.jvm.internal.C2769l;
import okio.Okio;
import okio.Okio__JvmOkioKt;
import okio.Sink;
import okio.Source;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public interface FileSystem {
    public static final Companion Companion = new Companion(null);

    @NotNull
    public static final FileSystem SYSTEM = new Companion.SystemFileSystem();

    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = null;

        private static final class SystemFileSystem implements FileSystem {
            @Override // okhttp3.internal.p129io.FileSystem
            @NotNull
            public Sink appendingSink(@NotNull File file) throws FileNotFoundException {
                C2769l.m9241e(file, "file");
                try {
                    return Okio.appendingSink(file);
                } catch (FileNotFoundException unused) {
                    file.getParentFile().mkdirs();
                    return Okio.appendingSink(file);
                }
            }

            @Override // okhttp3.internal.p129io.FileSystem
            public void delete(@NotNull File file) throws IOException {
                C2769l.m9241e(file, "file");
                if (file.delete() || !file.exists()) {
                    return;
                }
                throw new IOException("failed to delete " + file);
            }

            @Override // okhttp3.internal.p129io.FileSystem
            public void deleteContents(@NotNull File directory) throws IOException {
                C2769l.m9241e(directory, "directory");
                File[] fileArrListFiles = directory.listFiles();
                if (fileArrListFiles == null) {
                    throw new IOException("not a readable directory: " + directory);
                }
                for (File file : fileArrListFiles) {
                    C2769l.m9240d(file, "file");
                    if (file.isDirectory()) {
                        deleteContents(file);
                    }
                    if (!file.delete()) {
                        throw new IOException("failed to delete " + file);
                    }
                }
            }

            @Override // okhttp3.internal.p129io.FileSystem
            public boolean exists(@NotNull File file) {
                C2769l.m9241e(file, "file");
                return file.exists();
            }

            @Override // okhttp3.internal.p129io.FileSystem
            public void rename(@NotNull File from, @NotNull File to) throws IOException {
                C2769l.m9241e(from, "from");
                C2769l.m9241e(to, "to");
                delete(to);
                if (from.renameTo(to)) {
                    return;
                }
                throw new IOException("failed to rename " + from + " to " + to);
            }

            @Override // okhttp3.internal.p129io.FileSystem
            @NotNull
            public Sink sink(@NotNull File file) throws FileNotFoundException {
                C2769l.m9241e(file, "file");
                try {
                    return Okio__JvmOkioKt.sink$default(file, false, 1, null);
                } catch (FileNotFoundException unused) {
                    file.getParentFile().mkdirs();
                    return Okio__JvmOkioKt.sink$default(file, false, 1, null);
                }
            }

            @Override // okhttp3.internal.p129io.FileSystem
            public long size(@NotNull File file) {
                C2769l.m9241e(file, "file");
                return file.length();
            }

            @Override // okhttp3.internal.p129io.FileSystem
            @NotNull
            public Source source(@NotNull File file) throws FileNotFoundException {
                C2769l.m9241e(file, "file");
                return Okio.source(file);
            }

            @NotNull
            public String toString() {
                return "FileSystem.SYSTEM";
            }
        }

        private Companion() {
        }

        public /* synthetic */ Companion(C2764g c2764g) {
            this();
        }
    }

    @NotNull
    Sink appendingSink(@NotNull File file) throws FileNotFoundException;

    void delete(@NotNull File file) throws IOException;

    void deleteContents(@NotNull File file) throws IOException;

    boolean exists(@NotNull File file);

    void rename(@NotNull File file, @NotNull File file2) throws IOException;

    @NotNull
    Sink sink(@NotNull File file) throws FileNotFoundException;

    long size(@NotNull File file);

    @NotNull
    Source source(@NotNull File file) throws FileNotFoundException;
}
