package androidx.datastore.core;

import android.os.Build;
import java.io.File;
import kotlin.jvm.internal.AbstractC9133u;

/* loaded from: classes2.dex */
public final class FileMoves_androidKt {
    public static final boolean atomicMoveTo(File file, File toFile) {
        AbstractC9133u.m16133g(file, "<this>");
        AbstractC9133u.m16133g(toFile, "toFile");
        return Build.VERSION.SDK_INT >= 26 ? Api26Impl.INSTANCE.move(file, toFile) : file.renameTo(toFile);
    }
}
