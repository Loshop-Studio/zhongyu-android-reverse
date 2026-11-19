package androidx.datastore.core;

import java.io.File;
import kotlin.jvm.internal.AbstractC9133u;

/* loaded from: classes2.dex */
public final class InterProcessCoordinator_jvmKt {
    public static final InterProcessCoordinator createSingleProcessCoordinator(File file) {
        AbstractC9133u.m16133g(file, "file");
        String absolutePath = file.getCanonicalFile().getAbsolutePath();
        AbstractC9133u.m16132f(absolutePath, "file.canonicalFile.absolutePath");
        return InterProcessCoordinatorKt.createSingleProcessCoordinator(absolutePath);
    }
}
