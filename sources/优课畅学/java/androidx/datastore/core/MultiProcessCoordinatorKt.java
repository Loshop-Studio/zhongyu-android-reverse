package androidx.datastore.core;

import java.io.File;
import kotlin.coroutines.InterfaceC9100d;
import kotlin.jvm.internal.AbstractC9133u;

/* loaded from: classes2.dex */
public final class MultiProcessCoordinatorKt {
    public static final InterProcessCoordinator createMultiProcessCoordinator(InterfaceC9100d context, File file) {
        AbstractC9133u.m16133g(context, "context");
        AbstractC9133u.m16133g(file, "file");
        return new MultiProcessCoordinator(context, file);
    }
}
