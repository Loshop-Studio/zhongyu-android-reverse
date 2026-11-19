package androidx.work.impl;

import android.content.Context;
import androidx.annotation.RequiresApi;
import java.io.File;
import kotlin.jvm.internal.AbstractC9133u;

@RequiresApi(21)
/* loaded from: classes3.dex */
public final class Api21Impl {
    public static final Api21Impl INSTANCE = new Api21Impl();

    private Api21Impl() {
    }

    public final File getNoBackupFilesDir(Context context) {
        AbstractC9133u.m16133g(context, "context");
        File noBackupFilesDir = context.getNoBackupFilesDir();
        AbstractC9133u.m16132f(noBackupFilesDir, "context.noBackupFilesDir");
        return noBackupFilesDir;
    }
}
