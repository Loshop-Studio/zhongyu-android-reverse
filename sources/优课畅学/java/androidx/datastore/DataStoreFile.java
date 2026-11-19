package androidx.datastore;

import android.content.Context;
import java.io.File;
import kotlin.jvm.internal.AbstractC9133u;

/* loaded from: classes2.dex */
public final class DataStoreFile {
    public static final File dataStoreFile(Context context, String fileName) {
        AbstractC9133u.m16133g(context, "<this>");
        AbstractC9133u.m16133g(fileName, "fileName");
        return new File(context.getApplicationContext().getFilesDir(), "datastore/" + fileName);
    }
}
