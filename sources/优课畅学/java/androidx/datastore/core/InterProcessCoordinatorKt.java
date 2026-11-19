package androidx.datastore.core;

import androidx.annotation.RestrictTo;
import kotlin.jvm.internal.AbstractC9133u;

/* loaded from: classes2.dex */
public final class InterProcessCoordinatorKt {
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static final InterProcessCoordinator createSingleProcessCoordinator(String filePath) {
        AbstractC9133u.m16133g(filePath, "filePath");
        return new SingleProcessCoordinator(filePath);
    }
}
